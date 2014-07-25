package aka.jmetadata.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Nonnull;

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
     * @return number of video streams
     */
    public int getNumVideoStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Video);
    }

    /**
     * Get the number of audio stream of the file.
     *
     * @return number of audio streams
     */
    public int getNumAudioStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Audio);
    }

    /**
     * Get the number of subtitle stream of the file.
     *
     * @return number of subtitle streams
     */
    public int getNumSubtitleStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Text);
    }

    /**
     * Get the number of chapters stream of the file.
     *
     * @return number of chapters streams
     */
    public int getNumChapterStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Chapters);
    }

    /**
     * Get the number of menu stream of the file.
     *
     * @return number of menu streams
     */
    public int getNumMenuStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Menu);
    }

    /**
     * Get informations from main file.
     *
     * @return general information
     */
    @Nonnull
    public JMetadataGeneral getGeneral() {
        return new JMetadataGeneral(this.mediaInfo);
    }

    /**
     * Get informations from video streams.
     *
     * @return list of video streams
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

    /**
     * Get informations from chapters streams.
     *
     * @return list of chapters stream
     */
    @Nonnull
    public List<JMetadataChapter> getChapterStreams() {
        final List<JMetadataChapter> result = new ArrayList<JMetadataChapter>();

        final int numberChaptersStream = getNumChapterStreams();
        for (int i = 0; i < numberChaptersStream; i++) {
            final JMetadataChapter jMetadataChapter = new JMetadataChapter(this.mediaInfo, i);
            result.add(jMetadataChapter);
        }

        return result;
    }

    /**
     * Get informations from menu streams.
     *
     * @return list of menu stream
     */
    @Nonnull
    public List<JMetadataMenu> getMenuStreams() {
        final List<JMetadataMenu> result = new ArrayList<JMetadataMenu>();

        final int numberMenuStream = getNumMenuStreams();
        for (int i = 0; i < numberMenuStream; i++) {
            final JMetadataMenu jMetadataMenu = new JMetadataMenu(this.mediaInfo, i);
            result.add(jMetadataMenu);
        }

        return result;
    }

    private void loadDLL(@Nonnull final String name) throws IOException {
        try {
            System.loadLibrary(name);
        } catch (final UnsatisfiedLinkError e) {
            // have to use a stream
            final InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(name);
            // always write to different location
            final String tempDir = System.getProperty("java.io.tmpdir") + "/" + ("" + new Date().getTime()) + "/lib/";
            final File dir = new File(tempDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            final File fileOut = new File(tempDir + name);
            final OutputStream out = new FileOutputStream(fileOut);
            int read = -1;
            final byte[] buffer = new byte[BUF_SIZE];
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            in.close();
            out.close();
            System.setProperty("jna.library.path", tempDir);
            System.load(fileOut.toString());
        }
    }
}
