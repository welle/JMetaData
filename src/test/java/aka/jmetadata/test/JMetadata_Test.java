package aka.jmetadata.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataGeneral;

@SuppressWarnings("javadoc")
public class JMetadata_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetadata_Test.class.getName());

    private static JMetaDataGeneral jMetaDataGeneral;
    private static JMetaData jMetaData;
    private static File file;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            file = new File(ClassLoader.getSystemClassLoader().getResource("Sintel_DivXPlus_6500kbps.mkv").toURI());
            if (jMetaData.open(file)) {
                jMetaDataGeneral = jMetaData.getGeneral();
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

    /**
     * Test getNumVideoStreams() method.
     */
    @Test
    public void subTestGetNumVideoStreams() {
        final var videoStreams = JMetadata_Test.jMetaData.getVideoStreams();
        assertNotNull(videoStreams);
        assertEquals(1, videoStreams.size());
    }

}
