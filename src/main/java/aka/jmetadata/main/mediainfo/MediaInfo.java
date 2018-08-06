package aka.jmetadata.main.mediainfo;

import static java.util.Collections.singletonMap;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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
import aka.jmetadata.main.helper.DataUtilsHelper;
import aka.jmetadata.main.helper.DateTimeHelper;
import aka.jmetadata.main.helper.MediaInfoHelper;

/**
 * MediaInfo JNA library.
 *
 * @author Charlotte
 */
public final class MediaInfo implements Closeable {

    private static final Logger LOGGER = Logger.getLogger(MediaInfo.class.getPackage().getName());

    private static String libraryName;
    private Pointer handlePointer;

    private interface MediaInfoDLLInternal extends Library {

        MediaInfoDLLInternal INSTANCE = Native.loadLibrary(libraryName, MediaInfoDLLInternal.class, singletonMap(OPTION_FUNCTION_MAPPER, (FunctionMapper) (final NativeLibrary lib, final Method method) -> "MediaInfo_" + method.getName()));

        /* Constructor */
        Pointer New();

        /* Deconstructor */
        void Delete(Pointer Handle);

        /* Opens a file for inspection */
        int Open(Pointer Handle, WString file);

        /* Closes the file upon completion */
        void Close(Pointer Handle);

        /* Opens a buffered read for the specified length beginning at offset */
        int Open_Buffer_Init(Pointer handlePointer, long length, long offset);

        int Open_Buffer_Continue(Pointer handlePointer, byte[] buffer, int size);

        long Open_Buffer_Continue_GoTo_Get(Pointer handlePointer);

        /* release buffer resources (close) */
        int Open_Buffer_Finalize(Pointer handlePointer);

        /* return information in various ways */
        WString Inform(Pointer Handle, int Reserved);

        WString Get(Pointer Handle, int StreamKind, int StreamNumber, WString parameter, int infoKind, int searchKind);

        WString GetI(Pointer Handle, int StreamKind, int StreamNumber, int parameterIndex, int infoKind);

        int Count_Get(Pointer Handle, int StreamKind, int StreamNumber);

        /* Set options */
        WString Option(Pointer Handle, WString option, WString value);
    }

    /**
     * Constructor.
     */
    public MediaInfo() {
        if (Platform.isWindows() && MediaInfoHelper.getOSArch() == MediaInfoHelper.OS_ARCH.BITS_64) {
            MediaInfo.libraryName = "mediainfo64";
        } else {
            MediaInfo.libraryName = "mediainfo";
        }

        try {
            LOGGER.info("Loading MediaInfo library");
            this.handlePointer = MediaInfoDLLInternal.INSTANCE.New();
            LOGGER.info("Loaded " + staticOption("Info_Version"));
        } catch (final Exception e) {
            LOGGER.info("Error loading MediaInfo library: " + e.getMessage());
            if (!Platform.isWindows() && !Platform.isMac()) {
                LOGGER.info("Make sure you have MediaInfoDLLInternal and libzen are installed!");
            }
        }
    }

    /**
     * Open file.
     *
     * @param file
     * @return instance of mediainfo
     * @throws IOException
     * @throws IllegalArgumentException
     */
    public synchronized MediaInfo open(final File file) throws IOException, IllegalArgumentException {
        if (!file.isFile() || file.length() < 64 * 1024) {
            throw new IllegalArgumentException("Invalid media file: " + file);
        }

        final var path = file.getCanonicalPath();

        // on Mac files that contain accents cannot be opened via JNA WString file paths due to encoding differences so we use the buffer interface instead for these files
        if (Platform.isMac() && !StandardCharsets.US_ASCII.newEncoder().canEncode(path)) {
            try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
                if (openViaBuffer(raf)) {
                    return this;
                }
                throw new IOException("Failed to initialize media info buffer: " + path);
            }
        }

        // open via file path
        if (0 != MediaInfoDLLInternal.INSTANCE.Open(this.handlePointer, new WString(path))) {
            return this;
        }
        throw new IOException("Failed to open media file: " + path);
    }

    private synchronized boolean openViaBuffer(final RandomAccessFile f) throws IOException {
        final var buffer = new byte[4 * 1024 * 1024]; // use large buffer to reduce JNA calls
        int read = -1;

        if (0 == MediaInfoDLLInternal.INSTANCE.Open_Buffer_Init(this.handlePointer, f.length(), 0)) {
            return false;
        }

        do {
            read = f.read(buffer);
            final var result = MediaInfoDLLInternal.INSTANCE.Open_Buffer_Continue(this.handlePointer, buffer, read);
            if ((result & 8) == 8) {
                break;
            }

            final var gotoPos = MediaInfoDLLInternal.INSTANCE.Open_Buffer_Continue_GoTo_Get(this.handlePointer);
            if (gotoPos >= 0) {
                f.seek(gotoPos);
                MediaInfoDLLInternal.INSTANCE.Open_Buffer_Init(this.handlePointer, f.length(), gotoPos);
            }
        } while (read > 0);

        MediaInfoDLLInternal.INSTANCE.Open_Buffer_Finalize(this.handlePointer);
        return true;
    }

    private synchronized String get(final StreamKind streamKind, final int streamNumber, final String parameter, final InfoKind infoKind, final InfoKind searchKind) {
        return MediaInfoDLLInternal.INSTANCE.Get(this.handlePointer, streamKind.ordinal(), streamNumber, new WString(parameter), infoKind.ordinal(), searchKind.ordinal()).toString();
    }

    /**
     * Get number of streams.
     *
     * @param streamKind
     * @return number of stream
     */
    public synchronized int getStreamCount(final StreamKind streamKind) {
        final var StreamCount = get(streamKind, 0, "StreamCount", InfoKind.Text, InfoKind.Name);
        if (StreamCount == null || StreamCount.length() == 0) {
            return 0;
        }
        return Integer.parseInt(StreamCount);
    }

    @Override
    public synchronized void close() {
        MediaInfoDLLInternal.INSTANCE.Close(this.handlePointer);
    }

    private synchronized void dispose() {
        if (this.handlePointer == null) {
            return;
        }

        // delete handlePointer
        MediaInfoDLLInternal.INSTANCE.Delete(this.handlePointer);
        this.handlePointer = null;
    }

    @Override
    public void finalize() {
        dispose();
    }

    private synchronized static String staticOption(final String option) {
        return staticOption(option, "");
    }

    private synchronized static String staticOption(final String option, final String value) {
        return MediaInfoDLLInternal.INSTANCE.Option(null, new WString(option), new WString(value)).toString();
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
    public synchronized String getAsString(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
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
    public synchronized Boolean getAsBoolean(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        final var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);

        if ("Yes".equalsIgnoreCase(value)) {
            return Boolean.TRUE;
        } else if ("No".equalsIgnoreCase(value)) {
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
    public synchronized Long getAsLong(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        Long result = null;
        var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = DataUtilsHelper.trimNonNumerical(value);
        if (!DataUtilsHelper.isEmpty(value)) {
            assert value != null : "As DataUtilsHelper.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (DataUtilsHelper.isDigit(value)) {
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
    public synchronized Integer getAsInteger(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        Integer result = null;
        var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = DataUtilsHelper.trimNonNumerical(value);
        if (!DataUtilsHelper.isEmpty(value)) {
            assert value != null : "As DataUtilsHelper.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (DataUtilsHelper.isDigit(value)) {
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
    public synchronized BigInteger getAsBigInteger(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        BigInteger result = null;
        var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = DataUtilsHelper.trimNonNumerical(value);
        if (!DataUtilsHelper.isEmpty(value)) {
            assert value != null : "As DataUtilsHelper.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (DataUtilsHelper.isDigit(value)) {
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
    public synchronized URL getAsURL(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        URL result = null;
        final var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        if (!DataUtilsHelper.isEmpty(value)) {
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
    public synchronized Double getAsDouble(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        Double result = null;
        var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        value = DataUtilsHelper.trimNonNumerical(value);
        if (!DataUtilsHelper.isEmpty(value)) {
            assert value != null : "As DataUtilsHelper.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            if (DataUtilsHelper.isDigit(value)) {
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
    public synchronized LocalDateTime getAsLocalDateTime(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        LocalDateTime result = null;
        final var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        if (!DataUtilsHelper.isEmpty(value)) {
            assert value != null : "As DataUtilsHelper.isEmpty test if null or trim.lenght = 0, it should not be possible.";
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
    public synchronized LocalTime getAsLocalTime(@NonNull final StreamKind streamKind, final int streamNumber, @NonNull final String parameter) {
        LocalTime result = null;
        final var value = get(streamKind, streamNumber, parameter, InfoKind.Text, InfoKind.Name);
        if (!DataUtilsHelper.isEmpty(value)) {
            assert value != null : "As DataUtilsHelper.isEmpty test if null or trim.lenght = 0, it should not be possible.";
            try {
                result = DateTimeHelper.parseLocalTime(value);
            } catch (final DateTimeParseException e) {
                // Nothing to do
            }
        }
        return result;
    }
}
