package aka.jmetadata.main.mediainfo;

import static java.util.Collections.singletonMap;

import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.WString;

import aka.jmetadata.main.constants.kind.InfoKind;
import aka.jmetadata.main.constants.kind.StreamKind;
import aka.jmetadata.main.helper.DateTimeHelper;
import aka.swissknife.data.TextUtils;
import aka.swissknife.os.OSHelper;
import aka.swissknife.os.OS_ARCH;

/**
 * MediaInfo JNA library.
 *
 * @author Charlotte
 */
public final class MediaInfo {
    private static final Logger LOGGER = Logger.getLogger(MediaInfo.class.getPackage().getName());

    private static String libraryName;
    private Pointer handlePointer;
    private NativeLibrary lib;

    public interface MediaInfoDLLInternal extends Library {

        MediaInfoDLLInternal INSTANCE = (MediaInfoDLLInternal) Native.loadLibrary(libraryName, MediaInfoDLLInternal.class, singletonMap(OPTION_FUNCTION_MAPPER, (FunctionMapper) (final NativeLibrary lib, final Method method) -> "MediaInfo_" + method.getName()));

        /* Constructor */
        Pointer New();

        /* Deconstructor */
        void Delete(Pointer Handle);

        /* Opens a file for inspection */
        int Open(Pointer Handle, WString file);

        /* Closes the file upon completion */
        void Close(Pointer Handle);

        /* Opens a buffered read for the specified length beginning at offset */
        int Open_Buffer_Init(Pointer handle, long length, long offset);

        int Open_Buffer_Continue(Pointer handle, byte[] buffer, int size);

        long Open_Buffer_Continue_GoTo_Get(Pointer handle);

        /* release buffer resources (close) */
        int Open_Buffer_Finalize(Pointer handle);

        /* return information in various ways */
        WString Inform(Pointer Handle, int Reserved);

        WString Get(Pointer Handle, int StreamKind, int StreamNumber, WString parameter, int infoKind, int searchKind);

        WString GetI(Pointer Handle, int StreamKind, int StreamNumber, int parameterIndex, int infoKind);

        int Count_Get(Pointer Handle, int StreamKind, int StreamNumber);

        /* Set options */
        WString Option(Pointer Handle, WString option, WString value);
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

//        if (!Platform.isWindows() && !Platform.isMac()) {
//            try {
//                // We need to load dependencies first, because we know where our native libs are (e.g. Java Web Start Cache).
//                // If we do not, the system will look for dependencies, but only in the library path.
//                this.lib = NativeLibrary.getInstance("mediainfo");
//            } catch (final LinkageError e) {
//                LOGGER.warning("Error loading mediainfo: " + e.getMessage());
//            }
//        }

        try {
            LOGGER.info("Loading MediaInfo library");
            this.handlePointer = MediaInfoDLLInternal.INSTANCE.New();
            LOGGER.info("Loaded " + optionStatic("Info_Version"));
        } catch (final Throwable e) {
            LOGGER.info("Error loading MediaInfo library: " + e.getMessage());
            if (!Platform.isWindows() && !Platform.isMac()) {
                LOGGER.info("Make sure you have MediaInfoDLLInternal and libzen are installed!");
            }
        }
    }

    @SuppressWarnings("javadoc")
    public boolean isValid() {
        return this.handlePointer != null;
    }

    @SuppressWarnings("javadoc")
    public void dispose() {
        close();
        if (this.handlePointer == null) {
            throw new IllegalStateException();
        }
        MediaInfoDLLInternal.INSTANCE.Delete(this.handlePointer);
        this.handlePointer = null;
        if (this.lib != null) {
            this.lib.dispose();
        }
    }

    /**
     * Closes the underlying file handle, and releases the native instance.
     */
    public void close() {
        if (this.handlePointer != null) {
            MediaInfoDLLInternal.INSTANCE.Close(this.handlePointer);
            MediaInfoDLLInternal.INSTANCE.Delete(this.handlePointer);
            this.handlePointer = null;
        }
    }

    @Override
    public void finalize() {
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
    public boolean open(@NonNull final String fileName) {
        return MediaInfoDLLInternal.INSTANCE.Open(this.handlePointer, new WString(fileName)) > 0;
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param file file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(@NonNull final File file) {
        return file.isFile() && MediaInfoDLLInternal.INSTANCE.Open(this.handlePointer, new WString(file.getAbsolutePath())) > 0;
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
    @Nullable
    public String getAsString(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        return get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
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
    @Nullable
    public Boolean getAsBoolean(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        final String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);

        if ("Yes".equals(value)) {
            return Boolean.TRUE;
        } else if ("No".equals(value)) {
            return Boolean.TRUE;
        } else {
            return null;
        }
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a Long about information you search, an empty string if there is a problem
     */
    @Nullable
    public Long getAsLong(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        Long result = null;
        String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = TextUtils.trimNonNumerical(value);
        if (!TextUtils.isEmpty(value)) {
            assert value != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (TextUtils.isDigit(value)) {
                try {
                    result = Long.valueOf(value);
                } catch (final NumberFormatException e) {
                    // Nothing to do
                }
            }
        }

        return result;
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a Integer about information you search, an empty string if there is a problem
     */
    @Nullable
    public Integer getAsInteger(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        Integer result = null;
        String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = TextUtils.trimNonNumerical(value);
        if (!TextUtils.isEmpty(value)) {
            assert value != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (TextUtils.isDigit(value)) {
                try {
                    result = Integer.valueOf(value);
                } catch (final NumberFormatException e) {
                    // Nothing to do
                }
            }
        }

        return result;
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a BigInteger about information you search, an empty string if there is a problem
     */
    @Nullable
    public BigInteger getAsBigInteger(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        BigInteger result = null;
        String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = TextUtils.trimNonNumerical(value);
        if (!TextUtils.isEmpty(value)) {
            assert value != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (TextUtils.isDigit(value)) {
                try {
                    result = new BigInteger(value);
                } catch (final NumberFormatException e) {
                    // Nothing to do
                }
            }
        }

        return result;
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a URL about information you search, an empty string if there is a problem
     */
    @Nullable
    public URL getAsURL(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        URL result = null;
        final String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        if (!TextUtils.isEmpty(value)) {
            try {
                result = new URL(value);
            } catch (final MalformedURLException e) {
                // Nothing to do
            }
        }

        return result;
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a Double about information you search, an empty string if there is a problem
     */
    @Nullable
    public Double getAsDouble(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        Double result = null;
        String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = TextUtils.trimNonNumerical(value);
        if (!TextUtils.isEmpty(value)) {
            assert value != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (TextUtils.isDigit(value)) {
                try {
                    result = Double.valueOf(value);
                } catch (final NumberFormatException e) {
                    // Nothing to do
                }
            }
        }

        return result;
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a Date about information you search, an empty string if there is a problem
     */
    @Nullable
    public LocalDateTime getAsLocalDateTime(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        LocalDateTime result = null;
        final String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        if (!TextUtils.isEmpty(value)) {
            assert value != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            try {
                result = DateTimeHelper.parseLocalDateTime(value);
            } catch (final DateTimeParseException e) {
                // Nothing to do
            }
        }
        return result;
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec, width, bitrate...),
     *            in string format ("Codec", "Width"...)
     * @return a Date about information you search, an empty string if there is a problem
     */
    @Nullable
    public LocalTime getAsLocalTime(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        LocalTime result = null;
        final String value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        if (!TextUtils.isEmpty(value)) {
            assert value != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            try {
                result = DateTimeHelper.parseLocalTime(value);
            } catch (final DateTimeParseException e) {
                // Nothing to do
            }
        }
        return result;
    }

    /**
     * Count of Streams of a Stream kind (StreamNumber not filled), or count of piece of
     * information in this Stream.
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @return number of Streams of the given Stream kind
     */
    public int getStreamCount(@NonNull final StreamKind streamKind) {
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
    public int getStreamCount(@NonNull final StreamKind streamKind, final int streamNumber) {
        return MediaInfoDLLInternal.INSTANCE.Count_Get(this.handlePointer, streamKind.ordinal(), streamNumber);
    }

    @Nullable
    public static String optionStatic(@NonNull final String option) {
        return MediaInfoDLLInternal.INSTANCE.Option(MediaInfoDLLInternal.INSTANCE.New(), new WString(option), new WString("")).toString();
    }

    /**
     * Configure or get information about MediaInfo (Static version).
     *
     * @param option The name of option
     * @param value The value of option
     * @return Depends on the option: by default "" (nothing) means No, other means Yes
     */
    @Nullable
    public static String optionStatic(@NonNull final String option, @NonNull final String value) {
        return MediaInfoDLLInternal.INSTANCE.Option(MediaInfoDLLInternal.INSTANCE.New(), new WString(option), new WString(value)).toString();
    }

    /**
     * Get all details about a file.
     *
     * @return All details about a file in one string
     */
    public String inform() {
        return MediaInfoDLLInternal.INSTANCE.Inform(this.handlePointer, 0).toString();
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec,
     *            width, bitrate...), in string format ("Codec", "Width"...)
     * @return a string about information you search, an empty string if there
     *         is a problem
     */
    public String get(final StreamKind streamKind, final int streamNumber, final String parameter) {
        return get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get a piece of information about a file (parameter is an integer).
     *
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameterIndex Parameter you are looking for in the Stream (Codec,
     *            width, bitrate...), in integer format (first parameter, second
     *            parameter...)
     * @return information requested, empty string if not found
     */
    public String get(final StreamKind streamKind, final int streamNumber, final int parameterIndex) {
        return get(streamKind, streamNumber, parameterIndex, InfoKind.Text);
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec,
     *            width, bitrate...), in string format ("Codec", "Width"...)
     * @param infoKind Kind of information you want about the parameter (the
     *            text, the measure, the help...)
     * @return information requested, empty string if not found
     */
    public String get(final StreamKind streamKind, final int streamNumber, final String parameter, final InfoKind infoKind) {
        return get(streamKind, streamNumber, parameter, infoKind, InfoKind.Name);
    }

    /**
     * Get a piece of information about a file (parameter is a string).
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameter Parameter you are looking for in the Stream (Codec,
     *            width, bitrate...), in string format ("Codec", "Width"...)
     * @param infoKind Kind of information you want about the parameter (the
     *            text, the measure, the help...)
     * @param searchKind Where to look for the parameter
     * @return a string about information you search, an empty string if there
     *         is a problem
     */
    public String get(final StreamKind streamKind, final int streamNumber, final String parameter, final InfoKind infoKind, final InfoKind searchKind) {
        return MediaInfoDLLInternal.INSTANCE.Get(this.handlePointer, streamKind.ordinal(), streamNumber, new WString(parameter), infoKind.ordinal(), searchKind.ordinal()).toString();
    }

    /**
     * Get a piece of information about a file (parameter is an integer).
     *
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in Kind of Stream (first, second...)
     * @param parameterIndex Parameter you are looking for in the Stream (Codec,
     *            width, bitrate...), in integer format (first parameter, second
     *            parameter...)
     * @param infoKind Kind of information you want about the parameter (the
     *            text, the measure, the help...)
     * @return a string about information you search, an empty string if there
     *         is a problem
     */
    public String get(final StreamKind streamKind, final int streamNumber, final int parameterIndex, final InfoKind infoKind) {
        return MediaInfoDLLInternal.INSTANCE.GetI(this.handlePointer, streamKind.ordinal(), streamNumber, parameterIndex, infoKind.ordinal()).toString();
    }

    /**
     * Count of Streams of a Stream kind (StreamNumber not filled), or count of
     * piece of information in this Stream.
     *
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @return number of Streams of the given Stream kind
     */
    public int getCount(final StreamKind streamKind) {
        // We should use NativeLong for -1, but it fails on 64-bit
        // int Count_Get(Pointer Handle, int StreamKind, NativeLong StreamNumber);
        // return MediaInfoDLL_Internal.INSTANCE.Count_Get(Handle, StreamKind.ordinal(), -1);
        // so we use slower Get() with a character string
        final String streamCount = get(streamKind, 0, "StreamCount");
        if (streamCount == null || streamCount.length() == 0) {
            return 0;
        }
        return Integer.parseInt(streamCount);
    }

    /**
     * Count of Streams of a Stream kind in the Stream Number.
     *
     * @param streamKind Kind of Stream (general, video, audio...)
     * @param streamNumber Stream number in this kind of Stream (first,
     *            second...)
     * @return number of Streams of the given Stream kind
     */
    public int getCount(final StreamKind streamKind, final int streamNumber) {
        return MediaInfoDLLInternal.INSTANCE.Count_Get(this.handlePointer, streamKind.ordinal(), streamNumber);
    }

    /**
     * Configure or get information about MediaInfo.
     *
     * @param option The name of option
     * @return Depends on the option: by default "" (nothing) means No, other
     *         means Yes
     */
    public String option(final String option) {
        return option(option, "");
    }

    /**
     * Configure or get information about MediaInfo.
     *
     * @param option The name of option
     * @param value The value of option
     * @return Depends on the option: by default "" (nothing) means No, other
     *         means Yes
     */
    public String option(final String option, final String value) {
        return MediaInfoDLLInternal.INSTANCE.Option(this.handlePointer, new WString(option), new WString(value)).toString();
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
