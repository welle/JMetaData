package aka.jmetadata.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.jmetadata.main.mediainfo.MediaInfo.StreamKind;
import aka.swissknife.data.TextUtils;
import aka.swissknife.os.OSHelper;
import aka.swissknife.os.OSHelperConstants.OS_ARCH;

import com.sun.jna.Platform;

/**
 * A test for the various media information functions.
 * <p>
 * For regular media files (like ".mpg" or ".avi") the track information is available after the media has been parsed (or played).
 * <p>
 * For DVD media files (like ".iso" files) the track information is not available after the media has been parsed, a video output must have been created, and even then the video track width/height
 * might not be available until a short time later.
 * <p>
 * In all cases, the other functions for title, video, audio and chapter descriptions require that a video output has been created before they return valid information.
 */
public final class JMetadata {

    private final MediaInfo mediaInfo;

    /**
     * Constructor
     *
     * @throws IOException
     */
    public JMetadata() throws IOException {
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
            // TODO add linux lib
        }

        // libmediainfo for Linux depends on libzen
        if (!Platform.isWindows() && !Platform.isMac()) {
//                NativeLibrary.getInstance("zen");
        }

        loadJarDll(libraryName);

        this.mediaInfo = new MediaInfo();
    }

    /**
     * Constructor
     *
     * @param jna_library_path path for JNA to find library to be loaded
     */
    public JMetadata(final String jna_library_path) {
        System.setProperty("jna.library.path", jna_library_path);
        this.mediaInfo = new MediaInfo();
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param file file to open
     * @return true if file was opened, false if file was not not opened
     */
    public boolean open(final File file) {
        return this.mediaInfo.open(file);
    }

    /**
     * Called by the garbage collector on an object when garbage collection determines that there are no more references to the object. A subclass overrides the finalize method to dispose of system
     * resources or to perform other cleanup.
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
    public boolean open(final String filename) {
        return this.mediaInfo.open(filename);
    }

    /**
     * Get the number of video stream of the file
     *
     * @return number of streams
     */
    public int getNumVideoStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Video);
    }

    /**
     * Get the number of audio stream of the file
     *
     * @return number of streams
     */
    public int getNumAudioStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Audio);
    }

    /**
     * Get the number of subtitle stream of the file
     *
     * @return number of streams
     */
    public int getNumSubtitleStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Text);
    }

    /**
     * Get the format use of the file
     *
     * @return format use
     */
    public String getFormat() {
        return this.mediaInfo.get(MediaInfo.StreamKind.General, 0, JMetadataConstants.General.FORMAT, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the duration of the media, in milliseconds
     *
     * @return duration in milliseconds, null if something goes wrong
     */
    public Double getDuration() {
        Double result = null;
        final String duration = this.mediaInfo.get(MediaInfo.StreamKind.General, 0, JMetadataConstants.General.DURATION, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Double.valueOf(duration);
        }

        return result;
    }

    /**
     * Get the size of the file in bytes
     *
     * @return size in bytes, null if something goes wrong
     */
    public Long getFileSize() {
        Long result = null;
        final String duration = this.mediaInfo.get(MediaInfo.StreamKind.General, 0, JMetadataConstants.General.FILESIZE, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Long.valueOf(duration);
        }

        return result;
    }

    /**
     * Get the format version use of the file
     *
     * @return format version use
     */
    public String getFormatVersion() {
        return this.mediaInfo.get(MediaInfo.StreamKind.General, 0, JMetadataConstants.General.FORMAT_VERSION, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the bit rate of all streams in bps
     *
     * @return bit rate in bps, null if something goes wrong
     */
    public Long getOverallBitRate() {
        Long result = null;
        final String duration = this.mediaInfo.get(MediaInfo.StreamKind.General, 0, JMetadataConstants.General.OVERALLBITRATE, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Long.valueOf(duration);
        }

        return result;
    }

    /**
     * Get informations from video streams
     *
     * @return list of video stream (empty if nothing found)
     */
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
     * Get informations from audio streams
     *
     * @return list of audio stream (empty if nothing found)
     */
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
     * Get informations from subtitle streams
     *
     * @return list of subtitle stream (empty if nothing found)
     */
    public List<JMetadataSubtitle> getSubtitleStreams() {
        final List<JMetadataSubtitle> result = new ArrayList<JMetadataSubtitle>();

        final int numberSubtitleStream = getNumSubtitleStreams();
        for (int i = 0; i < numberSubtitleStream; i++) {
            final JMetadataSubtitle jMetadataSubtitle = new JMetadataSubtitle(this.mediaInfo, i);
            result.add(jMetadataSubtitle);
        }

        return result;
    }

    private void loadJarDll(final String name) throws IOException {
        final InputStream in = getClass().getClassLoader().getResourceAsStream(name);
        final byte[] buffer = new byte[1024];
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
