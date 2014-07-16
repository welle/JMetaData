package aka.jmetadata.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.General;
import aka.jmetadata.main.constants.InfoKind;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.exception.LibNotfoundException;
import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;
import aka.swissknife.os.OSHelper;
import aka.swissknife.os.OSHelperConstants.OS_ARCH;

import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;

/**
 * A test for the various media information functions.
 * <p>
 * For regular media files (like ".mpg" or ".avi") the track information is available after the media has been parsed (or played).
 * </p>
 * <p>
 * For DVD media files (like ".iso" files) the track information is not available after the media has been parsed, a video output must have been created, and even then the video track width/height
 * might not be available until a short time later.
 * </p>
 * <p>
 * In all cases, the other functions for title, video, audio and chapter descriptions require that a video output has been created before they return valid information.
 * </p>
 *
 * @author Charlotte
 */
public final class JMetadata {

    @Nonnull
    private final MediaInfo mediaInfo;
    private static final int BUF_SIZE = 1024;

    /**
     * Constructor.
     *
     * @throws IOException if mediainfo library could not be loaded.
     * @throws LibNotfoundException if no mediainfo library could be found.
     */
    public JMetadata() throws IOException, LibNotfoundException {
        String libraryName = null;

        if (Platform.isWindows()) {
            if (OSHelper.getOSArch() == OS_ARCH.BITS_64) {
                libraryName = "mediainfo64.dll";
            } else {
                libraryName = "mediainfo.dll";
            }
        } else if (Platform.isMac()) {
            libraryName = "libmediainfo.dylib";
        } else {
            // libmediainfo for Linux depends on libzen
            NativeLibrary.getInstance("zen");
//            libraryName = "libmediainfo.dylib";
        }

        if (TextUtils.isEmpty(libraryName)) {
            throw new LibNotfoundException();
        }

        assert libraryName != null : "As LibNotfoundException was not throwed, it should not be possible.";
        loadDLL(libraryName);
        this.mediaInfo = new MediaInfo();
    }

    /**
     * Constructor.
     *
     * @param jnaLibraryPath path for JNA to find library to be loaded
     */
    public JMetadata(@Nonnull final String jnaLibraryPath) {
        System.setProperty("jna.library.path", jnaLibraryPath);
        this.mediaInfo = new MediaInfo();
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param file file to open
     * @return <code>true</code> if file was opened
     */
    public boolean open(@Nonnull final File file) {
        return this.mediaInfo.open(file);
    }

    /**
     * Called by the garbage collector on an object when garbage collection determines that there are no more references to the object. <br>
     * A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.
     *
     * @throws Throwable
     */
    public void close() throws Throwable {
        this.mediaInfo.finalize();
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param filename full name of the file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(@Nonnull final String filename) {
        return this.mediaInfo.open(filename);
    }

    /**
     * Get the number of video stream of the file.
     *
     * @return number of streams
     */
    public int getNumVideoStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Video);
    }

    /**
     * Get the number of audio stream of the file.
     *
     * @return number of streams
     */
    public int getNumAudioStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Audio);
    }

    /**
     * Get the number of subtitle stream of the file.
     *
     * @return number of streams
     */
    public int getNumSubtitleStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Text);
    }

    /**
     * Get the format use of the file.
     *
     * @return format use
     */
    @Nullable
    public String getFormat() {
        return this.mediaInfo.get(StreamKind.General, 0, General.FORMAT, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the duration of the media, in milliseconds.
     *
     * @return duration in milliseconds
     */
    @Nullable
    public Double getDuration() {
        Double result = null;
        final String duration = this.mediaInfo.get(StreamKind.General, 0, General.DURATION, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Double.valueOf(duration);
        }

        return result;
    }

    /**
     * Get the size of the file in bytes.
     *
     * @return size in bytes
     */
    @Nullable
    public Long getFileSize() {
        Long result = null;
        final String duration = this.mediaInfo.get(StreamKind.General, 0, General.FILESIZE, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Long.valueOf(duration);
        }

        return result;
    }

    /**
     * Get the format version use of the file.
     *
     * @return format version use
     */
    @Nullable
    public String getFormatVersion() {
        return this.mediaInfo.get(StreamKind.General, 0, General.FORMAT_VERSION, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the bit rate of all streams in bps.
     *
     * @return bit rate in bps
     */
    @Nullable
    public Long getOverallBitRate() {
        Long result = null;
        final String duration = this.mediaInfo.get(StreamKind.General, 0, General.OVERALLBITRATE, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Long.valueOf(duration);
        }

        return result;
    }

    /**
     * Get informations from video streams.
     *
     * @return list of video stream
     */
    @Nonnull
    public List<JMetadataVideo> getVideoStreams() {
        final List<JMetadataVideo> result = new ArrayList<>();

        final int numberVideoStream = getNumVideoStreams();
        for (int i = 0; i < numberVideoStream; i++) {
            final JMetadataVideo jMetadataVideo = new JMetadataVideo(this.mediaInfo, i);
            result.add(jMetadataVideo);
        }

        return result;
    }

    /**
     * Get informations from audio streams.
     *
     * @return list of audio stream
     */
    @Nonnull
    public List<JMetadataAudio> getAudioStreams() {
        final List<JMetadataAudio> result = new ArrayList<>();

        final int numberAudioStream = getNumAudioStreams();
        for (int i = 0; i < numberAudioStream; i++) {
            final JMetadataAudio jMetadataAudio = new JMetadataAudio(this.mediaInfo, i);
            result.add(jMetadataAudio);
        }

        return result;
    }

    /**
     * Get informations from subtitle streams.
     *
     * @return list of subtitle stream
     */
    @Nonnull
    public List<JMetadataSubtitle> getSubtitleStreams() {
        final List<JMetadataSubtitle> result = new ArrayList<JMetadataSubtitle>();

        final int numberSubtitleStream = getNumSubtitleStreams();
        for (int i = 0; i < numberSubtitleStream; i++) {
            final JMetadataSubtitle jMetadataSubtitle = new JMetadataSubtitle(this.mediaInfo, i);
            result.add(jMetadataSubtitle);
        }

        return result;
    }

    private void loadDLL(@Nonnull final String name) throws IOException {
        final InputStream in = getClass().getClassLoader().getResourceAsStream(name);
        final byte[] buffer = new byte[BUF_SIZE];
        int read = -1;
        final File temp = new File(new File(System.getProperty("java.io.tmpdir")), name);
        final FileOutputStream fos = new FileOutputStream(temp);

        while ((read = in.read(buffer)) != -1) {
            fos.write(buffer, 0, read);
        }
        fos.close();
        in.close();

        System.load(temp.getAbsolutePath());
    }
}
