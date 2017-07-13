package aka.jmetadata.test;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataAudio;
import aka.jmetadata.main.JMetaDataGeneral;
import aka.jmetadata.main.JMetaDataMenu;
import aka.jmetadata.main.JMetaDataText;
import aka.jmetadata.main.JMetaDataVideo;

/**
 * @author charlottew
 */
public abstract class AbstractTest {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataAudio_Test.class.getName());

    protected static JMetaDataAudio jMetaDataAudio;
    protected static JMetaData jMetaData;
    protected static JMetaDataGeneral jMetaDataGeneral;
    protected static JMetaDataMenu jMetaDataMenu;
    protected static JMetaDataText jMetaDataText;
    protected static JMetaDataVideo jMetaDataVideo;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final String filePath = new File("").getAbsolutePath();
            final File file = new File(filePath.concat("/Test/videosamples/Sintel_DivXPlus_6500kbps.mkv"));
            if (jMetaData.open(file)) {
                jMetaDataGeneral = jMetaData.getGeneral();
                @NonNull
                final List<@NonNull JMetaDataAudio> audioStreams = jMetaData.getAudioStreams();
                if (audioStreams.get(0) != null) {
                    jMetaDataAudio = audioStreams.get(0);
                }
                @NonNull
                final List<@NonNull JMetaDataMenu> menuStreams = jMetaData.getMenuStreams();
                if (menuStreams.get(0) != null) {
                    jMetaDataMenu = menuStreams.get(0);
                }
                @NonNull
                final List<@NonNull JMetaDataText> textStreams = jMetaData.getSubtitleStreams();
                if (textStreams.get(0) != null) {
                    jMetaDataText = textStreams.get(0);
                }
                @NonNull
                final List<@NonNull JMetaDataVideo> videoStreams = jMetaData.getVideoStreams();
                if (videoStreams.get(0) != null) {
                    jMetaDataVideo = videoStreams.get(0);
                }
            } else {
                throw new RuntimeErrorException(null, "Can not open file.");
            }
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            throw new RuntimeErrorException(null, "Can not find file.");
        }
    }

    /**
     * Deinitialize test.
     */
    @AfterClass
    public static void afterUnit() {
        if (jMetaData != null) {
            try {
                jMetaData.close();
            } catch (final Throwable e) {
                LOGGER.log(Level.SEVERE, e.getMessage());
            }
        }
    }

}
