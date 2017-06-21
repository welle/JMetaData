package aka.jmetadata.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;

import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;

import aka.jmetadata.main.constants.kind.StreamKind;
import aka.jmetadata.main.exception.LibNotfoundException;
import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;
import aka.swissknife.os.OSHelper;
import aka.swissknife.os.OS_ARCH;

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

        try {
            if (TextUtils.isEmpty(libraryName)) {
                throw new LibNotfoundException();
            }

            assert libraryName != null : "As LibNotfoundException was not throwed, it should not be possible.";
            loadDLL(libraryName);
        } catch (final LibNotfoundException | IOException e) {
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
     */
    public boolean open(@NonNull final File file) {
        return this.mediaInfo.open(file);
    }

    /**
     * Called by the garbage collector on an object when garbage collection determines that there are no more references to the object. <br>
     * A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.
     */
    public void close() {
        // Unload lib

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
        final List<@NonNull JMetaDataVideo> result = new ArrayList<>();

        final int numberVideoStream = getNumVideoStreams();
        for (int i = 0; i < numberVideoStream; i++) {
            final JMetaDataVideo jMetadataVideo = new JMetaDataVideo(this.mediaInfo, i);
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
        final List<@NonNull JMetaDataAudio> result = new ArrayList<>();

        final int numberAudioStream = getNumAudioStreams();
        for (int i = 0; i < numberAudioStream; i++) {
            final JMetaDataAudio jMetadataAudio = new JMetaDataAudio(this.mediaInfo, i);
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
        final List<@NonNull JMetaDataText> result = new ArrayList<>();

        final int numberSubtitleStream = getNumSubtitleStreams();
        for (int i = 0; i < numberSubtitleStream; i++) {
            final JMetaDataText jMetadataSubtitle = new JMetaDataText(this.mediaInfo, i);
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
        final List<@NonNull JMetaDataMenu> result = new ArrayList<>();

        final int numberMenuStream = getNumMenuStreams();
        for (int i = 0; i < numberMenuStream; i++) {
            final JMetaDataMenu jMetadataMenu = new JMetaDataMenu(this.mediaInfo, i);
            result.add(jMetadataMenu);
        }

        return result;
    }

    private static void loadDLL(@NonNull final String name) throws IOException {
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
