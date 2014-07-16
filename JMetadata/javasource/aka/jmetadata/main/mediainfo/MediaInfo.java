package aka.jmetadata.main.mediainfo;

import static java.util.Collections.singletonMap;

import java.io.File;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.InfoKind;
import aka.jmetadata.main.constants.StreamKind;
import aka.swissknife.os.OSHelper;
import aka.swissknife.os.OSHelperConstants.OS_ARCH;

import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.WString;

/**
 * MediaInfo JNA library.
 *
 * @author Charlotte
 */
public final class MediaInfo {
    private static final Logger LOGGER;
    static {
        LOGGER = Logger.getLogger(MediaInfo.class.getPackage().getName());
    }

    private static String libraryName;

    // Internal stuff
    interface MediaInfoDLLInternal extends Library {
        MediaInfoDLLInternal INSTANCE = (MediaInfoDLLInternal) Native.loadLibrary(libraryName, MediaInfoDLLInternal.class, singletonMap(OPTION_FUNCTION_MAPPER, new FunctionMapper() {
            @Override
            public String getFunctionName(final NativeLibrary lib, final Method method) {
                // e.g. MediaInfo_New(), MediaInfo_Open() ...
                return "MediaInfo_" + method.getName();
            }
        }));

        // Constructor/Destructor
        Pointer New();

        void Delete(Pointer Handle);

        // File
        int Open(Pointer Handle, WString file);

        void Close(Pointer Handle);

        // Info
        WString Inform(Pointer Handle);

        WString Get(Pointer Handle, int StreamKind, int StreamNumber, WString parameter, int infoKind, int searchKind);

        WString GetI(Pointer Handle, int StreamKind, int StreamNumber, int parameterIndex, int infoKind);

        int Count_Get(Pointer Handle, int StreamKind, int StreamNumber);

        // Options
        WString Option(Pointer Handle, WString option, WString value);
    }

    private Pointer handlePointer;

    /**
     * Constructor
     */
    public MediaInfo() {
        if (Platform.isWindows() && OSHelper.getOSArch() == OS_ARCH.BITS_64) {
            MediaInfo.libraryName = "mediainfo64";
        } else {
            MediaInfo.libraryName = "mediainfo";
        }

        // libmediainfo for Linux depends on libzen
        if (!Platform.isWindows() && !Platform.isMac()) {
            try {
                // We need to load dependencies first, because we know where our native libs are (e.g. Java Web Start Cache).
                // If we do not, the system will look for dependencies, but only in the library path.
                NativeLibrary.getInstance("zen");
            } catch (final LinkageError e) {
                LOGGER.warning("Error loading libzen: " + e.getMessage());
            }
        }

        try {
            LOGGER.info("Loading MediaInfo library");
            this.handlePointer = MediaInfoDLLInternal.INSTANCE.New();
            LOGGER.info("Loaded " + optionStatic("Info_Version"));
        } catch (final Throwable e) {
            e.printStackTrace();
            LOGGER.info("Error loading MediaInfo library: " + e.getMessage());
            if (!Platform.isWindows() && !Platform.isMac()) {
                LOGGER.info("Make sure you have libmediainfo and libzen installed");
            }
        }
    }

    @SuppressWarnings("javadoc")
    public boolean isValid() {
        return this.handlePointer != null;
    }

    @SuppressWarnings("javadoc")
    public void dispose() {
        if (this.handlePointer == null) {
            throw new IllegalStateException();
        }

        MediaInfoDLLInternal.INSTANCE.Delete(this.handlePointer);
        this.handlePointer = null;
    }

    @Override
    public void finalize() throws Throwable {
        if (this.handlePointer != null) {
            dispose();
        }
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param fileName full name of the file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(@Nonnull final String fileName) {
        return MediaInfoDLLInternal.INSTANCE.Open(this.handlePointer, new WString(fileName)) > 0;
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param file file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(@Nonnull final File file) {
        return file.isFile() && MediaInfoDLLInternal.INSTANCE.Open(this.handlePointer, new WString(file.getAbsolutePath())) > 0;
    }

    /**
     * Close a file opened before with Open().
     */
    public void close() {
        MediaInfoDLLInternal.INSTANCE.Close(this.handlePointer);
    }

    /**
     * Get all details about a file.
     *
     * @return All details about a file in one string
     */
    @Nullable
    public String inform() {
        return MediaInfoDLLInternal.INSTANCE.Inform(this.handlePointer).toString();
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(@Nonnull final StreamKind streamKind, final int streamNumber, final String parameter) {
        return get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @param infoKind Kind of information you want about the parameter (the text, the measure,
     *            the help...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(@Nonnull final StreamKind streamKind, final int streamNumber, final String parameter, final InfoKind infoKind) {
        return get(streamKind, streamNumber, parameter, infoKind, InfoKind.Name);
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @param infoKind Kind of information you want about the parameter (the text, the measure,
     *            the help...)
     * @param searchKind Where to look for the parameter
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(@Nonnull final StreamKind streamKind, final int streamNumber, final String parameter, final InfoKind infoKind, final InfoKind searchKind) {
        return MediaInfoDLLInternal.INSTANCE.Get(this.handlePointer, streamKind.ordinal(), streamNumber, new WString(parameter), infoKind.ordinal(), searchKind.ordinal()).toString();
    }

    /**
     * Get a piece of information about a file (parameter is an integer).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameterIndex Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in integer format (first parameter, second parameter...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind streamKind, final int streamNumber, final int parameterIndex) {
        return get(streamKind, streamNumber, parameterIndex, InfoKind.Text);
    }

    /**
     * Get a piece of information about a file (parameter is an integer).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameterIndex Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in integer format (first parameter, second parameter...)
     * @param infoKind Kind of information you want about the parameter (the text, the measure,
     *            the help...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind streamKind, final int streamNumber, final int parameterIndex, final InfoKind infoKind) {
        return MediaInfoDLLInternal.INSTANCE.GetI(this.handlePointer, streamKind.ordinal(), streamNumber, parameterIndex, infoKind.ordinal()).toString();
    }

    /**
     * Count of Streams of a Stream kind (StreamNumber not filled), or count of piece of
     * information in this Stream.
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @return number of Streams of the given Stream kind
     */
    public int getStreamCount(final StreamKind streamKind) {
        return MediaInfoDLLInternal.INSTANCE.Count_Get(this.handlePointer, streamKind.ordinal(), -1);
    }

    /**
     * Count of Streams of a Stream kind (StreamNumber not filled), or count of piece of
     * information in this Stream.
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in this kind of Stream (first, second...)
     * @return number of Streams of the given Stream kind
     */
    public int getStreamCount(final StreamKind streamKind, final int streamNumber) {
        return MediaInfoDLLInternal.INSTANCE.Count_Get(this.handlePointer, streamKind.ordinal(), streamNumber);
    }

    /**
     * Configure or get information about MediaInfo.
     *
     * @param option The name of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public String option(final String option) {
        return MediaInfoDLLInternal.INSTANCE.Option(this.handlePointer, new WString(option), new WString("")).toString();
    }

    /**
     * Configure or get information about MediaInfo.
     *
     * @param option The name of option
     * @param value The value of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public String option(final String option, final String value) {
        return MediaInfoDLLInternal.INSTANCE.Option(this.handlePointer, new WString(option), new WString(value)).toString();
    }

    /**
     * Configure or get information about MediaInfo (Static version).
     *
     * @param option The name of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public static String optionStatic(final String option) {
        return MediaInfoDLLInternal.INSTANCE.Option(MediaInfoDLLInternal.INSTANCE.New(), new WString(option), new WString("")).toString();
    }

    /**
     * Configure or get information about MediaInfo (Static version).
     *
     * @param option The name of option
     * @param value The value of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public static String optionStatic(final String option, final String value) {
        return MediaInfoDLLInternal.INSTANCE.Option(MediaInfoDLLInternal.INSTANCE.New(), new WString(option), new WString(value)).toString();
    }

//    public static String version() {
//        return optionStatic("Info_Version");
//    }
//
//    public static String parameters() {
//        return optionStatic("Info_Parameters");
//    }
//
//    public static String codecs() {
//        return optionStatic("Info_Codecs");
//    }
//
//    public static String capacities() {
//        return optionStatic("Info_Capacities");
//    }
//
//    public static String staticOption(final String option) {
//        return optionStatic(option, "");
//    }

}
