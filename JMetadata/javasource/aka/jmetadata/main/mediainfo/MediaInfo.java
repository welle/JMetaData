package aka.jmetadata.main.mediainfo;

import static java.util.Collections.singletonMap;

import java.io.File;
import java.lang.reflect.Method;
import java.util.logging.Logger;

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
 * MediaInfo JNA library
 * 
 * @author Charlotte
 */
public class MediaInfo {
    private final static Logger LOGGER;
    static {
        LOGGER = Logger.getLogger(MediaInfo.class.getPackage().getName());
    }

    static String libraryName;

    // Internal stuff
    interface MediaInfoDLL_Internal extends Library {
        MediaInfoDLL_Internal INSTANCE = (MediaInfoDLL_Internal) Native.loadLibrary(libraryName, MediaInfoDLL_Internal.class, singletonMap(OPTION_FUNCTION_MAPPER, new FunctionMapper() {

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
     * King of Stream to get
     */
    @SuppressWarnings("javadoc")
    public enum StreamKind {
        General, Video, Audio, Text, Chapters, Image, Menu;
    }

    // Enums
    @SuppressWarnings("javadoc")
    public enum InfoKind {
        /**
         * Unique name of parameter.
         */
        Name,
        /**
         * Value of parameter.
         */
        Text,
        /**
         * Unique name of measure unit of parameter.
         */
        Measure, Options,
        /**
         * Translated name of parameter.
         */
        Name_Text,
        /**
         * Translated name of measure unit.
         */
        Measure_Text,
        /**
         * More information about the parameter.
         */
        Info,
        /**
         * How this parameter is supported, could be N (No), B (Beta), R (Read only), W
         * (Read/Write).
         */
        HowTo,
        /**
         * Domain of this piece of information.
         */
        Domain;
    }

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
            this.handlePointer = MediaInfoDLL_Internal.INSTANCE.New();
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

        MediaInfoDLL_Internal.INSTANCE.Delete(this.handlePointer);
        this.handlePointer = null;
    }

    @Override
    public void finalize() throws Throwable {
        if (this.handlePointer != null) {
            dispose();
        }
    }

    // File
    /**
     * Open a file and collect information about it (technical information and tags).
     * 
     * @param File_Name full name of the file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(final String File_Name) {
        return MediaInfoDLL_Internal.INSTANCE.Open(this.handlePointer, new WString(File_Name)) > 0;
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     * 
     * @param file file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(final File file) {
        return file.isFile() && MediaInfoDLL_Internal.INSTANCE.Open(this.handlePointer, new WString(file.getAbsolutePath())) > 0;
    }

    /**
     * Close a file opened before with Open().
     */
    public void Close() {
        MediaInfoDLL_Internal.INSTANCE.Close(this.handlePointer);
    }

    // Information
    /**
     * Get all details about a file.
     * 
     * @return All details about a file in one string
     */
    public String Inform() {
        return MediaInfoDLL_Internal.INSTANCE.Inform(this.handlePointer).toString();
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @param StreamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind StreamKind, final int StreamNumber, final String parameter) {
        return get(StreamKind, StreamNumber, parameter, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @param StreamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @param infoKind Kind of information you want about the parameter (the text, the measure,
     *            the help...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind StreamKind, final int StreamNumber, final String parameter, final InfoKind infoKind) {
        return get(StreamKind, StreamNumber, parameter, infoKind, InfoKind.Name);
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @param StreamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @param infoKind Kind of information you want about the parameter (the text, the measure,
     *            the help...)
     * @param searchKind Where to look for the parameter
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind StreamKind, final int StreamNumber, final String parameter, final InfoKind infoKind, final InfoKind searchKind) {
        return MediaInfoDLL_Internal.INSTANCE.Get(this.handlePointer, StreamKind.ordinal(), StreamNumber, new WString(parameter), infoKind.ordinal(), searchKind.ordinal()).toString();
    }

    /**
     * Get a piece of information about a file (parameter is an integer).
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @param StreamNumber Stream number in Kind of Stream (first, second...)
     * @param parameterIndex Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in integer format (first parameter, second parameter...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind StreamKind, final int StreamNumber, final int parameterIndex) {
        return get(StreamKind, StreamNumber, parameterIndex, InfoKind.Text);
    }

    /**
     * Get a piece of information about a file (parameter is an integer).
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @param StreamNumber Stream number in Kind of Stream (first, second...)
     * @param parameterIndex Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in integer format (first parameter, second parameter...)
     * @param infoKind Kind of information you want about the parameter (the text, the measure,
     *            the help...)
     * @return a string about information you search, an empty string if there is a problem
     */
    public String get(final StreamKind StreamKind, final int StreamNumber, final int parameterIndex, final InfoKind infoKind) {
        return MediaInfoDLL_Internal.INSTANCE.GetI(this.handlePointer, StreamKind.ordinal(), StreamNumber, parameterIndex, infoKind.ordinal()).toString();
    }

    /**
     * Count of Streams of a Stream kind (StreamNumber not filled), or count of piece of
     * information in this Stream.
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @return number of Streams of the given Stream kind
     */
    public int getStreamCount(final StreamKind StreamKind) {
        return MediaInfoDLL_Internal.INSTANCE.Count_Get(this.handlePointer, StreamKind.ordinal(), -1);
    }

    /**
     * Count of Streams of a Stream kind (StreamNumber not filled), or count of piece of
     * information in this Stream.
     * 
     * @param StreamKind Kind of Stream (general, video, audio...)
     * @param StreamNumber Stream number in this kind of Stream (first, second...)
     * @return number of Streams of the given Stream kind
     */
    public int getStreamCount(final StreamKind StreamKind, final int StreamNumber) {
        return MediaInfoDLL_Internal.INSTANCE.Count_Get(this.handlePointer, StreamKind.ordinal(), StreamNumber);
    }

    // Options
    /**
     * Configure or get information about MediaInfo.
     * 
     * @param Option The name of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public String option(final String Option) {
        return MediaInfoDLL_Internal.INSTANCE.Option(this.handlePointer, new WString(Option), new WString("")).toString();
    }

    /**
     * Configure or get information about MediaInfo.
     * 
     * @param Option The name of option
     * @param Value The value of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public String option(final String Option, final String Value) {
        return MediaInfoDLL_Internal.INSTANCE.Option(this.handlePointer, new WString(Option), new WString(Value)).toString();
    }

    /**
     * Configure or get information about MediaInfo (Static version).
     * 
     * @param Option The name of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public static String optionStatic(final String Option) {
        return MediaInfoDLL_Internal.INSTANCE.Option(MediaInfoDLL_Internal.INSTANCE.New(), new WString(Option), new WString("")).toString();
    }

    /**
     * Configure or get information about MediaInfo (Static version).
     * 
     * @param Option The name of option
     * @param Value The value of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    public static String optionStatic(final String Option, final String Value) {
        return MediaInfoDLL_Internal.INSTANCE.Option(MediaInfoDLL_Internal.INSTANCE.New(), new WString(Option), new WString(Value)).toString();
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
