package aka.jmetadata.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;

import com.sun.jna.Platform;

import aka.jmetadata.main.constants.kind.StreamKind;
import aka.jmetadata.main.helper.MediaInfoHelper;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * Main class to use to extract metadata informations. This class contains all useful methods to get all kind of streams that can be present in the file.
 *
 * @author Charlotte
 */
public final class JMetaData {

    @NonNull
    private final MediaInfo mediaInfo;
    private static final int BUF_SIZE = 1024;

    static {
        String libraryName = null;

        try {
            if (Platform.isWindows()) {
                if (MediaInfoHelper.getOSArch() == MediaInfoHelper.OS_ARCH.BITS_64) {
                    libraryName = "mediainfo64.dll";
                } else {
                    libraryName = "mediainfo.dll";
                }
                loadDLL(libraryName);
            } else if (Platform.isMac()) {
                libraryName = "libmediainfo.dylib";
                loadDLL(libraryName);
            } else {
                // libmediainfo for Linux depends on libzen
//            NativeLibrary.getInstance("zen");
//            libraryName = "libmediainfo.dylib";
            }

        } catch (final IOException e) {
            final Logger logger = Logger.getLogger(JMetaData.class.getPackage().getName());
            logger.logp(Level.SEVERE, "JMetaData", "Static block", e.getMessage(), e);
            throw new RuntimeException();
        }
    }

    /**
     * Constructor.
     */
    public JMetaData() {
        this.mediaInfo = new MediaInfo();
    }

    /**
     * Constructor.
     *
     * @param jnaLibraryPath path for JNA to find library to be loaded
     */
    public JMetaData(@NonNull final String jnaLibraryPath) {
        System.setProperty("jna.library.path", jnaLibraryPath);
        this.mediaInfo = new MediaInfo();
    }

    /**
     * Open a file and collect information about it (technical information and tags).
     *
     * @param file file to open
     * @return <code>true</code> if file was opened
     * @throws IOException
     * @throws IllegalArgumentException
     */
    public boolean open(@NonNull final File file) throws IllegalArgumentException, IOException {
        return this.mediaInfo.open(file) != null;
    }

    /**
     * Called by the garbage collector on an object when garbage collection determines that there are no more references to the object. <br>
     * A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.
     */
    public void close() {
        this.mediaInfo.finalize();
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

    private int getNumMenuStreams() {
        return this.mediaInfo.getStreamCount(StreamKind.Menu);
    }

    /**
     * Get informations from main file.
     *
     * @return general information
     * @see JMetaDataGeneral
     */
    @NonNull
    public JMetaDataGeneral getGeneral() {
        return new JMetaDataGeneral(this.mediaInfo);
    }

    /**
     * Get informations from video streams.
     *
     * @return list of video streams
     * @see JMetaDataVideo
     */
    @NonNull
    public List<@NonNull JMetaDataVideo> getVideoStreams() {
        final var result = new ArrayList<@NonNull JMetaDataVideo>();

        final var numberVideoStream = getNumVideoStreams();
        for (var i = 0; i < numberVideoStream; i++) {
            final var jMetadataVideo = new JMetaDataVideo(this.mediaInfo, i);
            result.add(jMetadataVideo);
        }

        return result;
    }

    /**
     * Get informations from audio streams.
     *
     * @return list of audio stream
     * @see JMetaDataAudio
     */
    @NonNull
    public List<@NonNull JMetaDataAudio> getAudioStreams() {
        final var result = new ArrayList<@NonNull JMetaDataAudio>();

        final var numberAudioStream = getNumAudioStreams();
        for (var i = 0; i < numberAudioStream; i++) {
            final var jMetadataAudio = new JMetaDataAudio(this.mediaInfo, i);
            result.add(jMetadataAudio);
        }

        return result;
    }

    /**
     * Get informations from subtitle streams.
     *
     * @return list of subtitle stream
     * @see JMetaDataText
     */
    @NonNull
    public List<@NonNull JMetaDataText> getSubtitleStreams() {
        final var result = new ArrayList<@NonNull JMetaDataText>();

        final var numberSubtitleStream = getNumSubtitleStreams();
        for (var i = 0; i < numberSubtitleStream; i++) {
            final var jMetadataSubtitle = new JMetaDataText(this.mediaInfo, i);
            result.add(jMetadataSubtitle);
        }

        return result;
    }

    /**
     * Get informations from menu streams.
     *
     * @return list of menu stream
     * @see JMetaDataMenu
     */
    @NonNull
    public List<@NonNull JMetaDataMenu> getMenuStreams() {
        final var result = new ArrayList<@NonNull JMetaDataMenu>();

        final var numberMenuStream = getNumMenuStreams();
        for (var i = 0; i < numberMenuStream; i++) {
            final var jMetadataMenu = new JMetaDataMenu(this.mediaInfo, i);
            result.add(jMetadataMenu);
        }

        return result;
    }

    private static void loadDLL(@NonNull final String name) throws IOException {
        try {
            // have to use a stream
            final var in = ClassLoader.getSystemClassLoader().getResourceAsStream(name);
            // always write to different location
            final var tempDir = System.getProperty("java.io.tmpdir") + "/" + ("" + new Date().getTime()) + "/lib/";
            final var dir = new File(tempDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            final var fileOut = new File(tempDir + name);
            final var out = new FileOutputStream(fileOut);
            final byte[] buffer = in.readAllBytes();
            out.write(buffer);
            in.close();
            out.close();
            System.setProperty("jna.library.path", tempDir);
            System.load(fileOut.toString());
        } catch (final UnsatisfiedLinkError e) {
            Logger.getAnonymousLogger().logp(Level.SEVERE, "JMetaData", "loadDLL", e.getMessage(), e);
        }
    }
}
