package aka.jmetadata.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.exception.LibNotfoundException;
import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;
import aka.swissknife.os.OSHelper;
import aka.swissknife.os.OSHelperConstants.OS_ARCH;

import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;

/**
 * Main class to use to extract metadata informations. This class contains all useful methods to get all kind of streams that can be present in the file.
 *
 * @author Charlotte
 */
public final class JMetadata {

    @NonNull
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
    public JMetadata(@NonNull final String jnaLibraryPath) {
        System.setProperty("jna.library.path", jnaLibraryPath);
        this.mediaInfo = new MediaInfo();
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param file file to open
     * @return <code>true</code> if file was opened
     */
    public boolean open(@NonNull final File file) {
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
    public boolean open(@NonNull final String filename) {
        return this.mediaInfo.open(filename);
    }

    private int getNumVideoStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Video);
    }

    private int getNumAudioStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Audio);
    }

    private int getNumSubtitleStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Text);
    }

    private int getNumChapterStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Chapters);
    }

    private int getNumMenuStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Menu);
    }

    /**
     * Get informations from main file.
     *
     * @return general information
     * @see JMetadataGeneral
     */
    @NonNull
    public JMetadataGeneral getGeneral() {
        return new JMetadataGeneral(this.mediaInfo);
    }

    /**
     * Get informations from video streams.
     *
     * @return list of video streams
     * @see JMetadataVideo
     */
    @NonNull
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
     * @see JMetadataAudio
     */
    @NonNull
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
     * @see JMetadataSubtitle
     */
    @NonNull
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
     * @see JMetadataChapter
     */
    @NonNull
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
     * @see JMetadataMenu
     */
    @NonNull
    public List<JMetadataMenu> getMenuStreams() {
        final List<JMetadataMenu> result = new ArrayList<JMetadataMenu>();

        final int numberMenuStream = getNumMenuStreams();
        for (int i = 0; i < numberMenuStream; i++) {
            final JMetadataMenu jMetadataMenu = new JMetadataMenu(this.mediaInfo, i);
            result.add(jMetadataMenu);
        }

        return result;
    }

    private void loadDLL(@NonNull final String name) throws IOException {
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
