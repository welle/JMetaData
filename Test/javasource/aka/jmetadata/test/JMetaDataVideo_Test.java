package aka.jmetadata.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataVideo;

/**
 * This class contains tests methods for Video informations of a specific Video stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataVideo_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataVideo_Test.class.getName());

    private static JMetaDataVideo jMetaDataVideo;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataVideo_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("somefile").getFile());
            jMetaData.open(file);
            jMetaDataVideo = null;
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * Deinitialize test.
     */
    @AfterClass
    public static void afterUnit() {
        try {
            jMetaData.close();
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

   /**
    * Test getActiveFormatDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsInteger());
    }

   /**
    * Test getActiveFormatDescriptionAsLong() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsLong());
    }

   /**
    * Test getActiveFormatDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsLocalDateTime());
    }

   /**
    * Test getActiveFormatDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsLocalTime());
    }

   /**
    * Test getActiveFormatDescriptionAsString() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsString() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsString());
    }

   /**
    * Test getActiveFormatDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsBoolean());
    }

   /**
    * Test getActiveFormatDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsBigInteger());
    }

   /**
    * Test getActiveFormatDescriptionAsURL() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionAsURL());
    }

   /**
    * Test getActiveFormatDescriptionStringAsInteger() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsInteger());
    }

   /**
    * Test getActiveFormatDescriptionStringAsLong() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsLong());
    }

   /**
    * Test getActiveFormatDescriptionStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsLocalDateTime());
    }

   /**
    * Test getActiveFormatDescriptionStringAsLocalTime() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsLocalTime());
    }

   /**
    * Test getActiveFormatDescriptionStringAsString() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsString());
    }

   /**
    * Test getActiveFormatDescriptionStringAsBoolean() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsBoolean());
    }

   /**
    * Test getActiveFormatDescriptionStringAsBigInteger() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsBigInteger());
    }

   /**
    * Test getActiveFormatDescriptionStringAsURL() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionStringAsURL());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsInteger() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsInteger());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsLong() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsLong());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsLocalDateTime());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsLocalTime() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsLocalTime());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsString() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsString() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsString());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsBoolean() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsBoolean());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsBigInteger() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsBigInteger());
    }

   /**
    * Test getActiveFormatDescriptionMuxingModeAsURL() method.
    */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsURL());
    }

   /**
    * Test getAlignmentAsInteger() method.
    */
    @Test
    public void subTestGetAlignmentAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsInteger());
    }

   /**
    * Test getAlignmentAsLong() method.
    */
    @Test
    public void subTestGetAlignmentAsLong() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsLong());
    }

   /**
    * Test getAlignmentAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlignmentAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsLocalDateTime());
    }

   /**
    * Test getAlignmentAsLocalTime() method.
    */
    @Test
    public void subTestGetAlignmentAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsLocalTime());
    }

   /**
    * Test getAlignmentAsString() method.
    */
    @Test
    public void subTestGetAlignmentAsString() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsString());
    }

   /**
    * Test getAlignmentAsBoolean() method.
    */
    @Test
    public void subTestGetAlignmentAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsBoolean());
    }

   /**
    * Test getAlignmentAsBigInteger() method.
    */
    @Test
    public void subTestGetAlignmentAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsBigInteger());
    }

   /**
    * Test getAlignmentAsURL() method.
    */
    @Test
    public void subTestGetAlignmentAsURL() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentAsURL());
    }

   /**
    * Test getAlignmentStringAsInteger() method.
    */
    @Test
    public void subTestGetAlignmentStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsInteger());
    }

   /**
    * Test getAlignmentStringAsLong() method.
    */
    @Test
    public void subTestGetAlignmentStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsLong());
    }

   /**
    * Test getAlignmentStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlignmentStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsLocalDateTime());
    }

   /**
    * Test getAlignmentStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlignmentStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsLocalTime());
    }

   /**
    * Test getAlignmentStringAsString() method.
    */
    @Test
    public void subTestGetAlignmentStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsString());
    }

   /**
    * Test getAlignmentStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlignmentStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsBoolean());
    }

   /**
    * Test getAlignmentStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlignmentStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsBigInteger());
    }

   /**
    * Test getAlignmentStringAsURL() method.
    */
    @Test
    public void subTestGetAlignmentStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getAlignmentStringAsURL());
    }

   /**
    * Test getAlternateGroupAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsInteger());
    }

   /**
    * Test getAlternateGroupAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsLong());
    }

   /**
    * Test getAlternateGroupAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsLocalTime());
    }

   /**
    * Test getAlternateGroupAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsString());
    }

   /**
    * Test getAlternateGroupAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsBoolean());
    }

   /**
    * Test getAlternateGroupAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsBigInteger());
    }

   /**
    * Test getAlternateGroupAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupAsURL());
    }

   /**
    * Test getAlternateGroupStringAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsInteger());
    }

   /**
    * Test getAlternateGroupStringAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsLong());
    }

   /**
    * Test getAlternateGroupStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsLocalTime());
    }

   /**
    * Test getAlternateGroupStringAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsString());
    }

   /**
    * Test getAlternateGroupStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsBoolean());
    }

   /**
    * Test getAlternateGroupStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsBigInteger());
    }

   /**
    * Test getAlternateGroupStringAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getAlternateGroupStringAsURL());
    }

   /**
    * Test getBitDepthAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsInteger());
    }

   /**
    * Test getBitDepthAsLong() method.
    */
    @Test
    public void subTestGetBitDepthAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsLong());
    }

   /**
    * Test getBitDepthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsLocalDateTime());
    }

   /**
    * Test getBitDepthAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsLocalTime());
    }

   /**
    * Test getBitDepthAsString() method.
    */
    @Test
    public void subTestGetBitDepthAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsString());
    }

   /**
    * Test getBitDepthAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsBoolean());
    }

   /**
    * Test getBitDepthAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsBigInteger());
    }

   /**
    * Test getBitDepthAsURL() method.
    */
    @Test
    public void subTestGetBitDepthAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthAsURL());
    }

   /**
    * Test getBitDepthStringAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsInteger());
    }

   /**
    * Test getBitDepthStringAsLong() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsLong());
    }

   /**
    * Test getBitDepthStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsLocalDateTime());
    }

   /**
    * Test getBitDepthStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsLocalTime());
    }

   /**
    * Test getBitDepthStringAsString() method.
    */
    @Test
    public void subTestGetBitDepthStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsString());
    }

   /**
    * Test getBitDepthStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsBoolean());
    }

   /**
    * Test getBitDepthStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsBigInteger());
    }

   /**
    * Test getBitDepthStringAsURL() method.
    */
    @Test
    public void subTestGetBitDepthStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitDepthStringAsURL());
    }

   /**
    * Test getBitRateAsInteger() method.
    */
    @Test
    public void subTestGetBitRateAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsInteger());
    }

   /**
    * Test getBitRateAsLong() method.
    */
    @Test
    public void subTestGetBitRateAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsLong());
    }

   /**
    * Test getBitRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsLocalDateTime());
    }

   /**
    * Test getBitRateAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsLocalTime());
    }

   /**
    * Test getBitRateAsString() method.
    */
    @Test
    public void subTestGetBitRateAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsString());
    }

   /**
    * Test getBitRateAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsBoolean());
    }

   /**
    * Test getBitRateAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsBigInteger());
    }

   /**
    * Test getBitRateAsURL() method.
    */
    @Test
    public void subTestGetBitRateAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateAsURL());
    }

   /**
    * Test getBitRateStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsInteger());
    }

   /**
    * Test getBitRateStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsLong());
    }

   /**
    * Test getBitRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsLocalDateTime());
    }

   /**
    * Test getBitRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsLocalTime());
    }

   /**
    * Test getBitRateStringAsString() method.
    */
    @Test
    public void subTestGetBitRateStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsString());
    }

   /**
    * Test getBitRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsBoolean());
    }

   /**
    * Test getBitRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsBigInteger());
    }

   /**
    * Test getBitRateStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateStringAsURL());
    }

   /**
    * Test getBitRateEncodedAsInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsInteger());
    }

   /**
    * Test getBitRateEncodedAsLong() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsLong());
    }

   /**
    * Test getBitRateEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsLocalDateTime());
    }

   /**
    * Test getBitRateEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsLocalTime());
    }

   /**
    * Test getBitRateEncodedAsString() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsString());
    }

   /**
    * Test getBitRateEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsBoolean());
    }

   /**
    * Test getBitRateEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsBigInteger());
    }

   /**
    * Test getBitRateEncodedAsURL() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedAsURL());
    }

   /**
    * Test getBitRateEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsInteger());
    }

   /**
    * Test getBitRateEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsLong());
    }

   /**
    * Test getBitRateEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsLocalDateTime());
    }

   /**
    * Test getBitRateEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsLocalTime());
    }

   /**
    * Test getBitRateEncodedStringAsString() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsString());
    }

   /**
    * Test getBitRateEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsBoolean());
    }

   /**
    * Test getBitRateEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsBigInteger());
    }

   /**
    * Test getBitRateEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateEncodedStringAsURL());
    }

   /**
    * Test getBitRateMaximumAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsInteger());
    }

   /**
    * Test getBitRateMaximumAsLong() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsLong());
    }

   /**
    * Test getBitRateMaximumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsLocalDateTime());
    }

   /**
    * Test getBitRateMaximumAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsLocalTime());
    }

   /**
    * Test getBitRateMaximumAsString() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsString());
    }

   /**
    * Test getBitRateMaximumAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsBoolean());
    }

   /**
    * Test getBitRateMaximumAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsBigInteger());
    }

   /**
    * Test getBitRateMaximumAsURL() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumAsURL());
    }

   /**
    * Test getBitRateMaximumStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsInteger());
    }

   /**
    * Test getBitRateMaximumStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsLong());
    }

   /**
    * Test getBitRateMaximumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsLocalDateTime());
    }

   /**
    * Test getBitRateMaximumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsLocalTime());
    }

   /**
    * Test getBitRateMaximumStringAsString() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsString());
    }

   /**
    * Test getBitRateMaximumStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsBoolean());
    }

   /**
    * Test getBitRateMaximumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsBigInteger());
    }

   /**
    * Test getBitRateMaximumStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMaximumStringAsURL());
    }

   /**
    * Test getBitRateMinimumAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsInteger());
    }

   /**
    * Test getBitRateMinimumAsLong() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsLong());
    }

   /**
    * Test getBitRateMinimumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsLocalDateTime());
    }

   /**
    * Test getBitRateMinimumAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsLocalTime());
    }

   /**
    * Test getBitRateMinimumAsString() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsString());
    }

   /**
    * Test getBitRateMinimumAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsBoolean());
    }

   /**
    * Test getBitRateMinimumAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsBigInteger());
    }

   /**
    * Test getBitRateMinimumAsURL() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumAsURL());
    }

   /**
    * Test getBitRateMinimumStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsInteger());
    }

   /**
    * Test getBitRateMinimumStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsLong());
    }

   /**
    * Test getBitRateMinimumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsLocalDateTime());
    }

   /**
    * Test getBitRateMinimumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsLocalTime());
    }

   /**
    * Test getBitRateMinimumStringAsString() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsString());
    }

   /**
    * Test getBitRateMinimumStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsBoolean());
    }

   /**
    * Test getBitRateMinimumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsBigInteger());
    }

   /**
    * Test getBitRateMinimumStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateMinimumStringAsURL());
    }

   /**
    * Test getBitRateModeAsInteger() method.
    */
    @Test
    public void subTestGetBitRateModeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsInteger());
    }

   /**
    * Test getBitRateModeAsLong() method.
    */
    @Test
    public void subTestGetBitRateModeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsLong());
    }

   /**
    * Test getBitRateModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsLocalDateTime());
    }

   /**
    * Test getBitRateModeAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateModeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsLocalTime());
    }

   /**
    * Test getBitRateModeAsString() method.
    */
    @Test
    public void subTestGetBitRateModeAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsString());
    }

   /**
    * Test getBitRateModeAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateModeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsBoolean());
    }

   /**
    * Test getBitRateModeAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateModeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsBigInteger());
    }

   /**
    * Test getBitRateModeAsURL() method.
    */
    @Test
    public void subTestGetBitRateModeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeAsURL());
    }

   /**
    * Test getBitRateModeStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsInteger());
    }

   /**
    * Test getBitRateModeStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsLong());
    }

   /**
    * Test getBitRateModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsLocalDateTime());
    }

   /**
    * Test getBitRateModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsLocalTime());
    }

   /**
    * Test getBitRateModeStringAsString() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsString());
    }

   /**
    * Test getBitRateModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsBoolean());
    }

   /**
    * Test getBitRateModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsBigInteger());
    }

   /**
    * Test getBitRateModeStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateModeStringAsURL());
    }

   /**
    * Test getBitRateNominalAsInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsInteger());
    }

   /**
    * Test getBitRateNominalAsLong() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsLong());
    }

   /**
    * Test getBitRateNominalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsLocalDateTime());
    }

   /**
    * Test getBitRateNominalAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsLocalTime());
    }

   /**
    * Test getBitRateNominalAsString() method.
    */
    @Test
    public void subTestGetBitRateNominalAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsString());
    }

   /**
    * Test getBitRateNominalAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateNominalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsBoolean());
    }

   /**
    * Test getBitRateNominalAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsBigInteger());
    }

   /**
    * Test getBitRateNominalAsURL() method.
    */
    @Test
    public void subTestGetBitRateNominalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalAsURL());
    }

   /**
    * Test getBitRateNominalStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsInteger());
    }

   /**
    * Test getBitRateNominalStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsLong());
    }

   /**
    * Test getBitRateNominalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsLocalDateTime());
    }

   /**
    * Test getBitRateNominalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsLocalTime());
    }

   /**
    * Test getBitRateNominalStringAsString() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsString());
    }

   /**
    * Test getBitRateNominalStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsBoolean());
    }

   /**
    * Test getBitRateNominalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsBigInteger());
    }

   /**
    * Test getBitRateNominalStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitRateNominalStringAsURL());
    }

   /**
    * Test getBitsPixelFrameAsInteger() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsInteger());
    }

   /**
    * Test getBitsPixelFrameAsLong() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsLong());
    }

   /**
    * Test getBitsPixelFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsLocalDateTime());
    }

   /**
    * Test getBitsPixelFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsLocalTime());
    }

   /**
    * Test getBitsPixelFrameAsString() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsString());
    }

   /**
    * Test getBitsPixelFrameAsBoolean() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsBoolean());
    }

   /**
    * Test getBitsPixelFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsBigInteger());
    }

   /**
    * Test getBitsPixelFrameAsURL() method.
    */
    @Test
    public void subTestGetBitsPixelFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBitsPixelFrameAsURL());
    }

   /**
    * Test getBufferSizeAsInteger() method.
    */
    @Test
    public void subTestGetBufferSizeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsInteger());
    }

   /**
    * Test getBufferSizeAsLong() method.
    */
    @Test
    public void subTestGetBufferSizeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsLong());
    }

   /**
    * Test getBufferSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBufferSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsLocalDateTime());
    }

   /**
    * Test getBufferSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetBufferSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsLocalTime());
    }

   /**
    * Test getBufferSizeAsString() method.
    */
    @Test
    public void subTestGetBufferSizeAsString() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsString());
    }

   /**
    * Test getBufferSizeAsBoolean() method.
    */
    @Test
    public void subTestGetBufferSizeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsBoolean());
    }

   /**
    * Test getBufferSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetBufferSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsBigInteger());
    }

   /**
    * Test getBufferSizeAsURL() method.
    */
    @Test
    public void subTestGetBufferSizeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getBufferSizeAsURL());
    }

   /**
    * Test getChromaSubsamplingAsInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsInteger());
    }

   /**
    * Test getChromaSubsamplingAsLong() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsLong() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsLong());
    }

   /**
    * Test getChromaSubsamplingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsLocalDateTime());
    }

   /**
    * Test getChromaSubsamplingAsLocalTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsLocalTime());
    }

   /**
    * Test getChromaSubsamplingAsString() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsString() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsString());
    }

   /**
    * Test getChromaSubsamplingAsBoolean() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsBoolean());
    }

   /**
    * Test getChromaSubsamplingAsBigInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsBigInteger());
    }

   /**
    * Test getChromaSubsamplingAsURL() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsURL() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingAsURL());
    }

   /**
    * Test getChromaSubsamplingStringAsInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsInteger());
    }

   /**
    * Test getChromaSubsamplingStringAsLong() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsLong());
    }

   /**
    * Test getChromaSubsamplingStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsLocalDateTime());
    }

   /**
    * Test getChromaSubsamplingStringAsLocalTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsLocalTime());
    }

   /**
    * Test getChromaSubsamplingStringAsString() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsString());
    }

   /**
    * Test getChromaSubsamplingStringAsBoolean() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsBoolean());
    }

   /**
    * Test getChromaSubsamplingStringAsBigInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsBigInteger());
    }

   /**
    * Test getChromaSubsamplingStringAsURL() method.
    */
    @Test
    public void subTestGetChromaSubsamplingStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingStringAsURL());
    }

   /**
    * Test getChromaSubsamplingPositionAsInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsInteger());
    }

   /**
    * Test getChromaSubsamplingPositionAsLong() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsLong());
    }

   /**
    * Test getChromaSubsamplingPositionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsLocalDateTime());
    }

   /**
    * Test getChromaSubsamplingPositionAsLocalTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsLocalTime());
    }

   /**
    * Test getChromaSubsamplingPositionAsString() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsString() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsString());
    }

   /**
    * Test getChromaSubsamplingPositionAsBoolean() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsBoolean());
    }

   /**
    * Test getChromaSubsamplingPositionAsBigInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsBigInteger());
    }

   /**
    * Test getChromaSubsamplingPositionAsURL() method.
    */
    @Test
    public void subTestGetChromaSubsamplingPositionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getChromaSubsamplingPositionAsURL());
    }

   /**
    * Test getCodecIDAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsInteger());
    }

   /**
    * Test getCodecIDAsLong() method.
    */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsLong());
    }

   /**
    * Test getCodecIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsLocalDateTime());
    }

   /**
    * Test getCodecIDAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsLocalTime());
    }

   /**
    * Test getCodecIDAsString() method.
    */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsString());
    }

   /**
    * Test getCodecIDAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsBoolean());
    }

   /**
    * Test getCodecIDAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsBigInteger());
    }

   /**
    * Test getCodecIDAsURL() method.
    */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDAsURL());
    }

   /**
    * Test getCodecIDHintAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsInteger());
    }

   /**
    * Test getCodecIDHintAsLong() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsLong());
    }

   /**
    * Test getCodecIDHintAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsLocalDateTime());
    }

   /**
    * Test getCodecIDHintAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsLocalTime());
    }

   /**
    * Test getCodecIDHintAsString() method.
    */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsString());
    }

   /**
    * Test getCodecIDHintAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsBoolean());
    }

   /**
    * Test getCodecIDHintAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsBigInteger());
    }

   /**
    * Test getCodecIDHintAsURL() method.
    */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDHintAsURL());
    }

   /**
    * Test getCodecIDInfoAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsInteger());
    }

   /**
    * Test getCodecIDInfoAsLong() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsLong());
    }

   /**
    * Test getCodecIDInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsLocalDateTime());
    }

   /**
    * Test getCodecIDInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsLocalTime());
    }

   /**
    * Test getCodecIDInfoAsString() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsString());
    }

   /**
    * Test getCodecIDInfoAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsBoolean());
    }

   /**
    * Test getCodecIDInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsBigInteger());
    }

   /**
    * Test getCodecIDInfoAsURL() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDInfoAsURL());
    }

   /**
    * Test getCodecIDStringAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsInteger());
    }

   /**
    * Test getCodecIDStringAsLong() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsLong());
    }

   /**
    * Test getCodecIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsLocalDateTime());
    }

   /**
    * Test getCodecIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsLocalTime());
    }

   /**
    * Test getCodecIDStringAsString() method.
    */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsString());
    }

   /**
    * Test getCodecIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsBoolean());
    }

   /**
    * Test getCodecIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsBigInteger());
    }

   /**
    * Test getCodecIDStringAsURL() method.
    */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDStringAsURL());
    }

   /**
    * Test getCodecIDUrlAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsInteger());
    }

   /**
    * Test getCodecIDUrlAsLong() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsLong());
    }

   /**
    * Test getCodecIDUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsLocalDateTime());
    }

   /**
    * Test getCodecIDUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsLocalTime());
    }

   /**
    * Test getCodecIDUrlAsString() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsString());
    }

   /**
    * Test getCodecIDUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsBoolean());
    }

   /**
    * Test getCodecIDUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsBigInteger());
    }

   /**
    * Test getCodecIDUrlAsURL() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDUrlAsURL());
    }

   /**
    * Test getCodecIDDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsInteger());
    }

   /**
    * Test getCodecIDDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsLong());
    }

   /**
    * Test getCodecIDDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsLocalDateTime());
    }

   /**
    * Test getCodecIDDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsLocalTime());
    }

   /**
    * Test getCodecIDDescriptionAsString() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsString());
    }

   /**
    * Test getCodecIDDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsBoolean());
    }

   /**
    * Test getCodecIDDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsBigInteger());
    }

   /**
    * Test getCodecIDDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCodecIDDescriptionAsURL());
    }

   /**
    * Test getColorSpaceAsInteger() method.
    */
    @Test
    public void subTestGetColorSpaceAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsInteger());
    }

   /**
    * Test getColorSpaceAsLong() method.
    */
    @Test
    public void subTestGetColorSpaceAsLong() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsLong());
    }

   /**
    * Test getColorSpaceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetColorSpaceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsLocalDateTime());
    }

   /**
    * Test getColorSpaceAsLocalTime() method.
    */
    @Test
    public void subTestGetColorSpaceAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsLocalTime());
    }

   /**
    * Test getColorSpaceAsString() method.
    */
    @Test
    public void subTestGetColorSpaceAsString() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsString());
    }

   /**
    * Test getColorSpaceAsBoolean() method.
    */
    @Test
    public void subTestGetColorSpaceAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsBoolean());
    }

   /**
    * Test getColorSpaceAsBigInteger() method.
    */
    @Test
    public void subTestGetColorSpaceAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsBigInteger());
    }

   /**
    * Test getColorSpaceAsURL() method.
    */
    @Test
    public void subTestGetColorSpaceAsURL() {
        assertEquals(null, this.jMetaDataVideo.getColorSpaceAsURL());
    }

   /**
    * Test getcolourdescriptionpresentAsInteger() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsInteger());
    }

   /**
    * Test getcolourdescriptionpresentAsLong() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsLong() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsLong());
    }

   /**
    * Test getcolourdescriptionpresentAsLocalDateTime() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsLocalDateTime());
    }

   /**
    * Test getcolourdescriptionpresentAsLocalTime() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsLocalTime());
    }

   /**
    * Test getcolourdescriptionpresentAsString() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsString() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsString());
    }

   /**
    * Test getcolourdescriptionpresentAsBoolean() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsBoolean());
    }

   /**
    * Test getcolourdescriptionpresentAsBigInteger() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsBigInteger());
    }

   /**
    * Test getcolourdescriptionpresentAsURL() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentAsURL() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentAsURL());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsInteger() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsInteger());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsLong() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsLong());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsLocalDateTime());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsLocalTime());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsString() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsString());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsBoolean());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsBigInteger());
    }

   /**
    * Test getcolourdescriptionpresentOriginalAsURL() method.
    */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getcolourdescriptionpresentOriginalAsURL());
    }

   /**
    * Test getcolourprimariesAsInteger() method.
    */
    @Test
    public void subTestGetcolourprimariesAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsInteger());
    }

   /**
    * Test getcolourprimariesAsLong() method.
    */
    @Test
    public void subTestGetcolourprimariesAsLong() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsLong());
    }

   /**
    * Test getcolourprimariesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetcolourprimariesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsLocalDateTime());
    }

   /**
    * Test getcolourprimariesAsLocalTime() method.
    */
    @Test
    public void subTestGetcolourprimariesAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsLocalTime());
    }

   /**
    * Test getcolourprimariesAsString() method.
    */
    @Test
    public void subTestGetcolourprimariesAsString() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsString());
    }

   /**
    * Test getcolourprimariesAsBoolean() method.
    */
    @Test
    public void subTestGetcolourprimariesAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsBoolean());
    }

   /**
    * Test getcolourprimariesAsBigInteger() method.
    */
    @Test
    public void subTestGetcolourprimariesAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsBigInteger());
    }

   /**
    * Test getcolourprimariesAsURL() method.
    */
    @Test
    public void subTestGetcolourprimariesAsURL() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesAsURL());
    }

   /**
    * Test getcolourprimariesOriginalAsInteger() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsInteger());
    }

   /**
    * Test getcolourprimariesOriginalAsLong() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsLong());
    }

   /**
    * Test getcolourprimariesOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsLocalDateTime());
    }

   /**
    * Test getcolourprimariesOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsLocalTime());
    }

   /**
    * Test getcolourprimariesOriginalAsString() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsString());
    }

   /**
    * Test getcolourprimariesOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsBoolean());
    }

   /**
    * Test getcolourprimariesOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsBigInteger());
    }

   /**
    * Test getcolourprimariesOriginalAsURL() method.
    */
    @Test
    public void subTestGetcolourprimariesOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getcolourprimariesOriginalAsURL());
    }

   /**
    * Test getcolourrangeAsInteger() method.
    */
    @Test
    public void subTestGetcolourrangeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsInteger());
    }

   /**
    * Test getcolourrangeAsLong() method.
    */
    @Test
    public void subTestGetcolourrangeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsLong());
    }

   /**
    * Test getcolourrangeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetcolourrangeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsLocalDateTime());
    }

   /**
    * Test getcolourrangeAsLocalTime() method.
    */
    @Test
    public void subTestGetcolourrangeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsLocalTime());
    }

   /**
    * Test getcolourrangeAsString() method.
    */
    @Test
    public void subTestGetcolourrangeAsString() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsString());
    }

   /**
    * Test getcolourrangeAsBoolean() method.
    */
    @Test
    public void subTestGetcolourrangeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsBoolean());
    }

   /**
    * Test getcolourrangeAsBigInteger() method.
    */
    @Test
    public void subTestGetcolourrangeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsBigInteger());
    }

   /**
    * Test getcolourrangeAsURL() method.
    */
    @Test
    public void subTestGetcolourrangeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getcolourrangeAsURL());
    }

   /**
    * Test getCompressionModeAsInteger() method.
    */
    @Test
    public void subTestGetCompressionModeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsInteger());
    }

   /**
    * Test getCompressionModeAsLong() method.
    */
    @Test
    public void subTestGetCompressionModeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsLong());
    }

   /**
    * Test getCompressionModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsLocalDateTime());
    }

   /**
    * Test getCompressionModeAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionModeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsLocalTime());
    }

   /**
    * Test getCompressionModeAsString() method.
    */
    @Test
    public void subTestGetCompressionModeAsString() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsString());
    }

   /**
    * Test getCompressionModeAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionModeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsBoolean());
    }

   /**
    * Test getCompressionModeAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionModeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsBigInteger());
    }

   /**
    * Test getCompressionModeAsURL() method.
    */
    @Test
    public void subTestGetCompressionModeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeAsURL());
    }

   /**
    * Test getCompressionModeStringAsInteger() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsInteger());
    }

   /**
    * Test getCompressionModeStringAsLong() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsLong());
    }

   /**
    * Test getCompressionModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsLocalDateTime());
    }

   /**
    * Test getCompressionModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsLocalTime());
    }

   /**
    * Test getCompressionModeStringAsString() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsString());
    }

   /**
    * Test getCompressionModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsBoolean());
    }

   /**
    * Test getCompressionModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsBigInteger());
    }

   /**
    * Test getCompressionModeStringAsURL() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCompressionModeStringAsURL());
    }

   /**
    * Test getCompressionRatioAsInteger() method.
    */
    @Test
    public void subTestGetCompressionRatioAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsInteger());
    }

   /**
    * Test getCompressionRatioAsLong() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsLong());
    }

   /**
    * Test getCompressionRatioAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsLocalDateTime());
    }

   /**
    * Test getCompressionRatioAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsLocalTime());
    }

   /**
    * Test getCompressionRatioAsString() method.
    */
    @Test
    public void subTestGetCompressionRatioAsString() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsString());
    }

   /**
    * Test getCompressionRatioAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionRatioAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsBoolean());
    }

   /**
    * Test getCompressionRatioAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionRatioAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsBigInteger());
    }

   /**
    * Test getCompressionRatioAsURL() method.
    */
    @Test
    public void subTestGetCompressionRatioAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCompressionRatioAsURL());
    }

   /**
    * Test getCountAsInteger() method.
    */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getCountAsInteger());
    }

   /**
    * Test getCountAsLong() method.
    */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, this.jMetaDataVideo.getCountAsLong());
    }

   /**
    * Test getCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getCountAsLocalDateTime());
    }

   /**
    * Test getCountAsLocalTime() method.
    */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getCountAsLocalTime());
    }

   /**
    * Test getCountAsString() method.
    */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, this.jMetaDataVideo.getCountAsString());
    }

   /**
    * Test getCountAsBoolean() method.
    */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getCountAsBoolean());
    }

   /**
    * Test getCountAsBigInteger() method.
    */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getCountAsBigInteger());
    }

   /**
    * Test getCountAsURL() method.
    */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, this.jMetaDataVideo.getCountAsURL());
    }

   /**
    * Test getDefaultAsInteger() method.
    */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsInteger());
    }

   /**
    * Test getDefaultAsLong() method.
    */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsLong());
    }

   /**
    * Test getDefaultAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsLocalDateTime());
    }

   /**
    * Test getDefaultAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsLocalTime());
    }

   /**
    * Test getDefaultAsString() method.
    */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsString());
    }

   /**
    * Test getDefaultAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsBoolean());
    }

   /**
    * Test getDefaultAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsBigInteger());
    }

   /**
    * Test getDefaultAsURL() method.
    */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDefaultAsURL());
    }

   /**
    * Test getDefaultStringAsInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsInteger());
    }

   /**
    * Test getDefaultStringAsLong() method.
    */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsLong());
    }

   /**
    * Test getDefaultStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsLocalDateTime());
    }

   /**
    * Test getDefaultStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsLocalTime());
    }

   /**
    * Test getDefaultStringAsString() method.
    */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsString());
    }

   /**
    * Test getDefaultStringAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsBoolean());
    }

   /**
    * Test getDefaultStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsBigInteger());
    }

   /**
    * Test getDefaultStringAsURL() method.
    */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDefaultStringAsURL());
    }

   /**
    * Test getDelayAsInteger() method.
    */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsInteger());
    }

   /**
    * Test getDelayAsLong() method.
    */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsLong());
    }

   /**
    * Test getDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsLocalDateTime());
    }

   /**
    * Test getDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsLocalTime());
    }

   /**
    * Test getDelayAsString() method.
    */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsString());
    }

   /**
    * Test getDelayAsBoolean() method.
    */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsBoolean());
    }

   /**
    * Test getDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsBigInteger());
    }

   /**
    * Test getDelayAsURL() method.
    */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayAsURL());
    }

   /**
    * Test getDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsInteger());
    }

   /**
    * Test getDelayStringAsLong() method.
    */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsLong());
    }

   /**
    * Test getDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsLocalDateTime());
    }

   /**
    * Test getDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsLocalTime());
    }

   /**
    * Test getDelayStringAsString() method.
    */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsString());
    }

   /**
    * Test getDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsBoolean());
    }

   /**
    * Test getDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsBigInteger());
    }

   /**
    * Test getDelayStringAsURL() method.
    */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayStringAsURL());
    }

   /**
    * Test getDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsInteger());
    }

   /**
    * Test getDelayString1AsLong() method.
    */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsLong());
    }

   /**
    * Test getDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsLocalDateTime());
    }

   /**
    * Test getDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsLocalTime());
    }

   /**
    * Test getDelayString1AsString() method.
    */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsString());
    }

   /**
    * Test getDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsBoolean());
    }

   /**
    * Test getDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsBigInteger());
    }

   /**
    * Test getDelayString1AsURL() method.
    */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayString1AsURL());
    }

   /**
    * Test getDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsInteger());
    }

   /**
    * Test getDelayString2AsLong() method.
    */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsLong());
    }

   /**
    * Test getDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsLocalDateTime());
    }

   /**
    * Test getDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsLocalTime());
    }

   /**
    * Test getDelayString2AsString() method.
    */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsString());
    }

   /**
    * Test getDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsBoolean());
    }

   /**
    * Test getDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsBigInteger());
    }

   /**
    * Test getDelayString2AsURL() method.
    */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayString2AsURL());
    }

   /**
    * Test getDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsInteger());
    }

   /**
    * Test getDelayString3AsLong() method.
    */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsLong());
    }

   /**
    * Test getDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsLocalDateTime());
    }

   /**
    * Test getDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsLocalTime());
    }

   /**
    * Test getDelayString3AsString() method.
    */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsString());
    }

   /**
    * Test getDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsBoolean());
    }

   /**
    * Test getDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsBigInteger());
    }

   /**
    * Test getDelayString3AsURL() method.
    */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayString3AsURL());
    }

   /**
    * Test getDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsInteger());
    }

   /**
    * Test getDelayString4AsLong() method.
    */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsLong());
    }

   /**
    * Test getDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsLocalDateTime());
    }

   /**
    * Test getDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsLocalTime());
    }

   /**
    * Test getDelayString4AsString() method.
    */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsString());
    }

   /**
    * Test getDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsBoolean());
    }

   /**
    * Test getDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsBigInteger());
    }

   /**
    * Test getDelayString4AsURL() method.
    */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayString4AsURL());
    }

   /**
    * Test getDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsInteger());
    }

   /**
    * Test getDelayString5AsLong() method.
    */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsLong());
    }

   /**
    * Test getDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsLocalDateTime());
    }

   /**
    * Test getDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsLocalTime());
    }

   /**
    * Test getDelayString5AsString() method.
    */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsString());
    }

   /**
    * Test getDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsBoolean());
    }

   /**
    * Test getDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsBigInteger());
    }

   /**
    * Test getDelayString5AsURL() method.
    */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayString5AsURL());
    }

   /**
    * Test getDelayDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsInteger());
    }

   /**
    * Test getDelayDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsLong());
    }

   /**
    * Test getDelayDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsLocalTime());
    }

   /**
    * Test getDelayDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsString());
    }

   /**
    * Test getDelayDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsBoolean());
    }

   /**
    * Test getDelayDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsBigInteger());
    }

   /**
    * Test getDelayDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayDropFrameAsURL());
    }

   /**
    * Test getDelayOriginalAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsInteger());
    }

   /**
    * Test getDelayOriginalAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsLong());
    }

   /**
    * Test getDelayOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsLocalTime());
    }

   /**
    * Test getDelayOriginalAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsString());
    }

   /**
    * Test getDelayOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsBoolean());
    }

   /**
    * Test getDelayOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsBigInteger());
    }

   /**
    * Test getDelayOriginalAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalAsURL());
    }

   /**
    * Test getDelayOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsInteger());
    }

   /**
    * Test getDelayOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsLong());
    }

   /**
    * Test getDelayOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsLocalTime());
    }

   /**
    * Test getDelayOriginalStringAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsString());
    }

   /**
    * Test getDelayOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsBoolean());
    }

   /**
    * Test getDelayOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsBigInteger());
    }

   /**
    * Test getDelayOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalStringAsURL());
    }

   /**
    * Test getDelayOriginalString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsInteger());
    }

   /**
    * Test getDelayOriginalString1AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsLong());
    }

   /**
    * Test getDelayOriginalString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsLocalTime());
    }

   /**
    * Test getDelayOriginalString1AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsString());
    }

   /**
    * Test getDelayOriginalString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsBoolean());
    }

   /**
    * Test getDelayOriginalString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsBigInteger());
    }

   /**
    * Test getDelayOriginalString1AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString1AsURL());
    }

   /**
    * Test getDelayOriginalString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsInteger());
    }

   /**
    * Test getDelayOriginalString2AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsLong());
    }

   /**
    * Test getDelayOriginalString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsLocalTime());
    }

   /**
    * Test getDelayOriginalString2AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsString());
    }

   /**
    * Test getDelayOriginalString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsBoolean());
    }

   /**
    * Test getDelayOriginalString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsBigInteger());
    }

   /**
    * Test getDelayOriginalString2AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString2AsURL());
    }

   /**
    * Test getDelayOriginalString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsInteger());
    }

   /**
    * Test getDelayOriginalString3AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsLong());
    }

   /**
    * Test getDelayOriginalString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsLocalTime());
    }

   /**
    * Test getDelayOriginalString3AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsString());
    }

   /**
    * Test getDelayOriginalString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsBoolean());
    }

   /**
    * Test getDelayOriginalString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsBigInteger());
    }

   /**
    * Test getDelayOriginalString3AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString3AsURL());
    }

   /**
    * Test getDelayOriginalString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsInteger());
    }

   /**
    * Test getDelayOriginalString4AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsLong());
    }

   /**
    * Test getDelayOriginalString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsLocalTime());
    }

   /**
    * Test getDelayOriginalString4AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsString());
    }

   /**
    * Test getDelayOriginalString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsBoolean());
    }

   /**
    * Test getDelayOriginalString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsBigInteger());
    }

   /**
    * Test getDelayOriginalString4AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString4AsURL());
    }

   /**
    * Test getDelayOriginalString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsInteger());
    }

   /**
    * Test getDelayOriginalString5AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsLong());
    }

   /**
    * Test getDelayOriginalString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsLocalTime());
    }

   /**
    * Test getDelayOriginalString5AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsString());
    }

   /**
    * Test getDelayOriginalString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsBoolean());
    }

   /**
    * Test getDelayOriginalString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsBigInteger());
    }

   /**
    * Test getDelayOriginalString5AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalString5AsURL());
    }

   /**
    * Test getDelayOriginalDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsInteger());
    }

   /**
    * Test getDelayOriginalDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsLong());
    }

   /**
    * Test getDelayOriginalDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsLocalTime());
    }

   /**
    * Test getDelayOriginalDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsString());
    }

   /**
    * Test getDelayOriginalDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsBoolean());
    }

   /**
    * Test getDelayOriginalDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsBigInteger());
    }

   /**
    * Test getDelayOriginalDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalDropFrameAsURL());
    }

   /**
    * Test getDelayOriginalSettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsInteger());
    }

   /**
    * Test getDelayOriginalSettingsAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsLong());
    }

   /**
    * Test getDelayOriginalSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsLocalTime());
    }

   /**
    * Test getDelayOriginalSettingsAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsString());
    }

   /**
    * Test getDelayOriginalSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsBoolean());
    }

   /**
    * Test getDelayOriginalSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsBigInteger());
    }

   /**
    * Test getDelayOriginalSettingsAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSettingsAsURL());
    }

   /**
    * Test getDelayOriginalSourceAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsInteger());
    }

   /**
    * Test getDelayOriginalSourceAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsLong());
    }

   /**
    * Test getDelayOriginalSourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalSourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsLocalTime());
    }

   /**
    * Test getDelayOriginalSourceAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsString());
    }

   /**
    * Test getDelayOriginalSourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsBoolean());
    }

   /**
    * Test getDelayOriginalSourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsBigInteger());
    }

   /**
    * Test getDelayOriginalSourceAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelayOriginalSourceAsURL());
    }

   /**
    * Test getDelaySettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsInteger());
    }

   /**
    * Test getDelaySettingsAsLong() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsLong());
    }

   /**
    * Test getDelaySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsLocalDateTime());
    }

   /**
    * Test getDelaySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsLocalTime());
    }

   /**
    * Test getDelaySettingsAsString() method.
    */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsString());
    }

   /**
    * Test getDelaySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsBoolean());
    }

   /**
    * Test getDelaySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsBigInteger());
    }

   /**
    * Test getDelaySettingsAsURL() method.
    */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelaySettingsAsURL());
    }

   /**
    * Test getDelaySourceAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsInteger());
    }

   /**
    * Test getDelaySourceAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsLong());
    }

   /**
    * Test getDelaySourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsLocalDateTime());
    }

   /**
    * Test getDelaySourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsLocalTime());
    }

   /**
    * Test getDelaySourceAsString() method.
    */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsString());
    }

   /**
    * Test getDelaySourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsBoolean());
    }

   /**
    * Test getDelaySourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsBigInteger());
    }

   /**
    * Test getDelaySourceAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceAsURL());
    }

   /**
    * Test getDelaySourceStringAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsInteger());
    }

   /**
    * Test getDelaySourceStringAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsLong());
    }

   /**
    * Test getDelaySourceStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsLocalDateTime());
    }

   /**
    * Test getDelaySourceStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsLocalTime());
    }

   /**
    * Test getDelaySourceStringAsString() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsString());
    }

   /**
    * Test getDelaySourceStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsBoolean());
    }

   /**
    * Test getDelaySourceStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsBigInteger());
    }

   /**
    * Test getDelaySourceStringAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDelaySourceStringAsURL());
    }

   /**
    * Test getDisabledAsInteger() method.
    */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsInteger());
    }

   /**
    * Test getDisabledAsLong() method.
    */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsLong());
    }

   /**
    * Test getDisabledAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsLocalDateTime());
    }

   /**
    * Test getDisabledAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsLocalTime());
    }

   /**
    * Test getDisabledAsString() method.
    */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsString());
    }

   /**
    * Test getDisabledAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsBoolean());
    }

   /**
    * Test getDisabledAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsBigInteger());
    }

   /**
    * Test getDisabledAsURL() method.
    */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisabledAsURL());
    }

   /**
    * Test getDisabledStringAsInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsInteger());
    }

   /**
    * Test getDisabledStringAsLong() method.
    */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsLong());
    }

   /**
    * Test getDisabledStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsLocalDateTime());
    }

   /**
    * Test getDisabledStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsLocalTime());
    }

   /**
    * Test getDisabledStringAsString() method.
    */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsString());
    }

   /**
    * Test getDisabledStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsBoolean());
    }

   /**
    * Test getDisabledStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsBigInteger());
    }

   /**
    * Test getDisabledStringAsURL() method.
    */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisabledStringAsURL());
    }

   /**
    * Test getDisplayAspectRatioAsInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsInteger());
    }

   /**
    * Test getDisplayAspectRatioAsLong() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsLong());
    }

   /**
    * Test getDisplayAspectRatioAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsLocalDateTime());
    }

   /**
    * Test getDisplayAspectRatioAsLocalTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsLocalTime());
    }

   /**
    * Test getDisplayAspectRatioAsString() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsString());
    }

   /**
    * Test getDisplayAspectRatioAsBoolean() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsBoolean());
    }

   /**
    * Test getDisplayAspectRatioAsBigInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsBigInteger());
    }

   /**
    * Test getDisplayAspectRatioAsURL() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioAsURL());
    }

   /**
    * Test getDisplayAspectRatioStringAsInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsInteger());
    }

   /**
    * Test getDisplayAspectRatioStringAsLong() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsLong());
    }

   /**
    * Test getDisplayAspectRatioStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsLocalDateTime());
    }

   /**
    * Test getDisplayAspectRatioStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsLocalTime());
    }

   /**
    * Test getDisplayAspectRatioStringAsString() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsString());
    }

   /**
    * Test getDisplayAspectRatioStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsBoolean());
    }

   /**
    * Test getDisplayAspectRatioStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsBigInteger());
    }

   /**
    * Test getDisplayAspectRatioStringAsURL() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioStringAsURL());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsInteger());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsLong() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsLong());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsLocalDateTime());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsLocalTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsLocalTime());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsString() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsString());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsBoolean() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsBoolean());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsBigInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsBigInteger());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureAsURL() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsURL());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsInteger());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsLong() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsLong());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsLocalDateTime());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsLocalTime());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsString() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsString());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsBoolean());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsBigInteger());
    }

   /**
    * Test getDisplayAspectRatioCleanApertureStringAsURL() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsURL());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsInteger());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsLong() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsLong());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsLocalDateTime());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsLocalTime());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsString() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsString());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsBoolean());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsBigInteger());
    }

   /**
    * Test getDisplayAspectRatioOriginalAsURL() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalAsURL());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsInteger());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsLong());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsLocalDateTime());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsLocalTime());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsString() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsString());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsBoolean());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsBigInteger());
    }

   /**
    * Test getDisplayAspectRatioOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsURL());
    }

   /**
    * Test getDurationAsInteger() method.
    */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsInteger());
    }

   /**
    * Test getDurationAsLong() method.
    */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsLong());
    }

   /**
    * Test getDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsLocalDateTime());
    }

   /**
    * Test getDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsLocalTime());
    }

   /**
    * Test getDurationAsString() method.
    */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsString());
    }

   /**
    * Test getDurationAsBoolean() method.
    */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsBoolean());
    }

   /**
    * Test getDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsBigInteger());
    }

   /**
    * Test getDurationAsURL() method.
    */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationAsURL());
    }

   /**
    * Test getDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsInteger());
    }

   /**
    * Test getDurationStringAsLong() method.
    */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsLong());
    }

   /**
    * Test getDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsLocalDateTime());
    }

   /**
    * Test getDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsLocalTime());
    }

   /**
    * Test getDurationStringAsString() method.
    */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsString());
    }

   /**
    * Test getDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsBoolean());
    }

   /**
    * Test getDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsBigInteger());
    }

   /**
    * Test getDurationStringAsURL() method.
    */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationStringAsURL());
    }

   /**
    * Test getDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsInteger());
    }

   /**
    * Test getDurationString1AsLong() method.
    */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsLong());
    }

   /**
    * Test getDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsLocalDateTime());
    }

   /**
    * Test getDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsLocalTime());
    }

   /**
    * Test getDurationString1AsString() method.
    */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsString());
    }

   /**
    * Test getDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsBoolean());
    }

   /**
    * Test getDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsBigInteger());
    }

   /**
    * Test getDurationString1AsURL() method.
    */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationString1AsURL());
    }

   /**
    * Test getDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsInteger());
    }

   /**
    * Test getDurationString2AsLong() method.
    */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsLong());
    }

   /**
    * Test getDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsLocalDateTime());
    }

   /**
    * Test getDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsLocalTime());
    }

   /**
    * Test getDurationString2AsString() method.
    */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsString());
    }

   /**
    * Test getDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsBoolean());
    }

   /**
    * Test getDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsBigInteger());
    }

   /**
    * Test getDurationString2AsURL() method.
    */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationString2AsURL());
    }

   /**
    * Test getDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsInteger());
    }

   /**
    * Test getDurationString3AsLong() method.
    */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsLong());
    }

   /**
    * Test getDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsLocalDateTime());
    }

   /**
    * Test getDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsLocalTime());
    }

   /**
    * Test getDurationString3AsString() method.
    */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsString());
    }

   /**
    * Test getDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsBoolean());
    }

   /**
    * Test getDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsBigInteger());
    }

   /**
    * Test getDurationString3AsURL() method.
    */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationString3AsURL());
    }

   /**
    * Test getDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsInteger());
    }

   /**
    * Test getDurationString4AsLong() method.
    */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsLong());
    }

   /**
    * Test getDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsLocalDateTime());
    }

   /**
    * Test getDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsLocalTime());
    }

   /**
    * Test getDurationString4AsString() method.
    */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsString());
    }

   /**
    * Test getDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsBoolean());
    }

   /**
    * Test getDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsBigInteger());
    }

   /**
    * Test getDurationString4AsURL() method.
    */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationString4AsURL());
    }

   /**
    * Test getDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsInteger());
    }

   /**
    * Test getDurationString5AsLong() method.
    */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsLong());
    }

   /**
    * Test getDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsLocalDateTime());
    }

   /**
    * Test getDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsLocalTime());
    }

   /**
    * Test getDurationString5AsString() method.
    */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsString());
    }

   /**
    * Test getDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsBoolean());
    }

   /**
    * Test getDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsBigInteger());
    }

   /**
    * Test getDurationString5AsURL() method.
    */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationString5AsURL());
    }

   /**
    * Test getDurationFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsInteger());
    }

   /**
    * Test getDurationFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsLong());
    }

   /**
    * Test getDurationFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsLocalTime());
    }

   /**
    * Test getDurationFirstFrameAsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsString());
    }

   /**
    * Test getDurationFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsBoolean());
    }

   /**
    * Test getDurationFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsBigInteger());
    }

   /**
    * Test getDurationFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameAsURL());
    }

   /**
    * Test getDurationFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsInteger());
    }

   /**
    * Test getDurationFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsLong());
    }

   /**
    * Test getDurationFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsLocalTime());
    }

   /**
    * Test getDurationFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsString());
    }

   /**
    * Test getDurationFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsBoolean());
    }

   /**
    * Test getDurationFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsBigInteger());
    }

   /**
    * Test getDurationFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameStringAsURL());
    }

   /**
    * Test getDurationFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsInteger());
    }

   /**
    * Test getDurationFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsLong());
    }

   /**
    * Test getDurationFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsString());
    }

   /**
    * Test getDurationFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString1AsURL());
    }

   /**
    * Test getDurationFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsInteger());
    }

   /**
    * Test getDurationFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsLong());
    }

   /**
    * Test getDurationFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsString());
    }

   /**
    * Test getDurationFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString2AsURL());
    }

   /**
    * Test getDurationFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsInteger());
    }

   /**
    * Test getDurationFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsLong());
    }

   /**
    * Test getDurationFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsString());
    }

   /**
    * Test getDurationFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString3AsURL());
    }

   /**
    * Test getDurationFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsInteger());
    }

   /**
    * Test getDurationFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsLong());
    }

   /**
    * Test getDurationFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsString());
    }

   /**
    * Test getDurationFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString4AsURL());
    }

   /**
    * Test getDurationFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsInteger());
    }

   /**
    * Test getDurationFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsLong());
    }

   /**
    * Test getDurationFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsString());
    }

   /**
    * Test getDurationFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationFirstFrameString5AsURL());
    }

   /**
    * Test getDurationLastFrameAsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsInteger());
    }

   /**
    * Test getDurationLastFrameAsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsLong());
    }

   /**
    * Test getDurationLastFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsLocalTime());
    }

   /**
    * Test getDurationLastFrameAsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsString());
    }

   /**
    * Test getDurationLastFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsBoolean());
    }

   /**
    * Test getDurationLastFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsBigInteger());
    }

   /**
    * Test getDurationLastFrameAsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameAsURL());
    }

   /**
    * Test getDurationLastFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsInteger());
    }

   /**
    * Test getDurationLastFrameStringAsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsLong());
    }

   /**
    * Test getDurationLastFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsLocalTime());
    }

   /**
    * Test getDurationLastFrameStringAsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsString());
    }

   /**
    * Test getDurationLastFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsBoolean());
    }

   /**
    * Test getDurationLastFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsBigInteger());
    }

   /**
    * Test getDurationLastFrameStringAsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameStringAsURL());
    }

   /**
    * Test getDurationLastFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsInteger());
    }

   /**
    * Test getDurationLastFrameString1AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsLong());
    }

   /**
    * Test getDurationLastFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString1AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsString());
    }

   /**
    * Test getDurationLastFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsBoolean());
    }

   /**
    * Test getDurationLastFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString1AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString1AsURL());
    }

   /**
    * Test getDurationLastFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsInteger());
    }

   /**
    * Test getDurationLastFrameString2AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsLong());
    }

   /**
    * Test getDurationLastFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString2AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsString());
    }

   /**
    * Test getDurationLastFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsBoolean());
    }

   /**
    * Test getDurationLastFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString2AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString2AsURL());
    }

   /**
    * Test getDurationLastFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsInteger());
    }

   /**
    * Test getDurationLastFrameString3AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsLong());
    }

   /**
    * Test getDurationLastFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString3AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsString());
    }

   /**
    * Test getDurationLastFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsBoolean());
    }

   /**
    * Test getDurationLastFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString3AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString3AsURL());
    }

   /**
    * Test getDurationLastFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsInteger());
    }

   /**
    * Test getDurationLastFrameString4AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsLong());
    }

   /**
    * Test getDurationLastFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString4AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsString());
    }

   /**
    * Test getDurationLastFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsBoolean());
    }

   /**
    * Test getDurationLastFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString4AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString4AsURL());
    }

   /**
    * Test getDurationLastFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsInteger());
    }

   /**
    * Test getDurationLastFrameString5AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsLong());
    }

   /**
    * Test getDurationLastFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString5AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsString());
    }

   /**
    * Test getDurationLastFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsBoolean());
    }

   /**
    * Test getDurationLastFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString5AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getDurationLastFrameString5AsURL());
    }

   /**
    * Test getEncodedApplicationAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsInteger());
    }

   /**
    * Test getEncodedApplicationAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsLong());
    }

   /**
    * Test getEncodedApplicationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsLocalTime());
    }

   /**
    * Test getEncodedApplicationAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsString());
    }

   /**
    * Test getEncodedApplicationAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsBoolean());
    }

   /**
    * Test getEncodedApplicationAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsBigInteger());
    }

   /**
    * Test getEncodedApplicationAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationAsURL());
    }

   /**
    * Test getEncodedApplicationStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsInteger());
    }

   /**
    * Test getEncodedApplicationStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsLong());
    }

   /**
    * Test getEncodedApplicationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsLocalTime());
    }

   /**
    * Test getEncodedApplicationStringAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsString());
    }

   /**
    * Test getEncodedApplicationStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsBoolean());
    }

   /**
    * Test getEncodedApplicationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsBigInteger());
    }

   /**
    * Test getEncodedApplicationStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationStringAsURL());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsLong());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsString());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationCompanyNameAsURL());
    }

   /**
    * Test getEncodedApplicationNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsInteger());
    }

   /**
    * Test getEncodedApplicationNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsLong());
    }

   /**
    * Test getEncodedApplicationNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsString());
    }

   /**
    * Test getEncodedApplicationNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationNameAsURL());
    }

   /**
    * Test getEncodedApplicationUrlAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsLong());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsLocalTime());
    }

   /**
    * Test getEncodedApplicationUrlAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsString());
    }

   /**
    * Test getEncodedApplicationUrlAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsBoolean());
    }

   /**
    * Test getEncodedApplicationUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsBigInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationUrlAsURL());
    }

   /**
    * Test getEncodedApplicationVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsLong());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsLocalTime());
    }

   /**
    * Test getEncodedApplicationVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsString());
    }

   /**
    * Test getEncodedApplicationVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsBoolean());
    }

   /**
    * Test getEncodedApplicationVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsBigInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedApplicationVersionAsURL());
    }

   /**
    * Test getEncodedDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsInteger());
    }

   /**
    * Test getEncodedDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsLong());
    }

   /**
    * Test getEncodedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsLocalDateTime());
    }

   /**
    * Test getEncodedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsLocalTime());
    }

   /**
    * Test getEncodedDateAsString() method.
    */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsString());
    }

   /**
    * Test getEncodedDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsBoolean());
    }

   /**
    * Test getEncodedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsBigInteger());
    }

   /**
    * Test getEncodedDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedDateAsURL());
    }

   /**
    * Test getEncodedLibraryAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsInteger());
    }

   /**
    * Test getEncodedLibraryAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsLong());
    }

   /**
    * Test getEncodedLibraryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsLocalTime());
    }

   /**
    * Test getEncodedLibraryAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsString());
    }

   /**
    * Test getEncodedLibraryAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsBoolean());
    }

   /**
    * Test getEncodedLibraryAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsBigInteger());
    }

   /**
    * Test getEncodedLibraryAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryAsURL());
    }

   /**
    * Test getEncodedLibraryStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsInteger());
    }

   /**
    * Test getEncodedLibraryStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsLong());
    }

   /**
    * Test getEncodedLibraryStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsLocalTime());
    }

   /**
    * Test getEncodedLibraryStringAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsString());
    }

   /**
    * Test getEncodedLibraryStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsBoolean());
    }

   /**
    * Test getEncodedLibraryStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsBigInteger());
    }

   /**
    * Test getEncodedLibraryStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryStringAsURL());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsLong());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsString());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryCompanyNameAsURL());
    }

   /**
    * Test getEncodedLibraryDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsInteger());
    }

   /**
    * Test getEncodedLibraryDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsLong());
    }

   /**
    * Test getEncodedLibraryDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsLocalTime());
    }

   /**
    * Test getEncodedLibraryDateAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsString());
    }

   /**
    * Test getEncodedLibraryDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsBoolean());
    }

   /**
    * Test getEncodedLibraryDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsBigInteger());
    }

   /**
    * Test getEncodedLibraryDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryDateAsURL());
    }

   /**
    * Test getEncodedLibraryNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsInteger());
    }

   /**
    * Test getEncodedLibraryNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsLong());
    }

   /**
    * Test getEncodedLibraryNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsString());
    }

   /**
    * Test getEncodedLibraryNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryNameAsURL());
    }

   /**
    * Test getEncodedLibrarySettingsAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsLong());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsLocalDateTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsLocalTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsString() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsString());
    }

   /**
    * Test getEncodedLibrarySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsBoolean());
    }

   /**
    * Test getEncodedLibrarySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsBigInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibrarySettingsAsURL());
    }

   /**
    * Test getEncodedLibraryVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsLong());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsLocalTime());
    }

   /**
    * Test getEncodedLibraryVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsString());
    }

   /**
    * Test getEncodedLibraryVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsBoolean());
    }

   /**
    * Test getEncodedLibraryVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsBigInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedLibraryVersionAsURL());
    }

   /**
    * Test getEncodedOperatingSystemAsInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsLong() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsLong());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsLocalDateTime());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsLocalTime());
    }

   /**
    * Test getEncodedOperatingSystemAsString() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsString());
    }

   /**
    * Test getEncodedOperatingSystemAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsBoolean());
    }

   /**
    * Test getEncodedOperatingSystemAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsBigInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsURL() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncodedOperatingSystemAsURL());
    }

   /**
    * Test getEncryptionAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsInteger());
    }

   /**
    * Test getEncryptionAsLong() method.
    */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsLong());
    }

   /**
    * Test getEncryptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsLocalDateTime());
    }

   /**
    * Test getEncryptionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsLocalTime());
    }

   /**
    * Test getEncryptionAsString() method.
    */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsString());
    }

   /**
    * Test getEncryptionAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsBoolean());
    }

   /**
    * Test getEncryptionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsBigInteger());
    }

   /**
    * Test getEncryptionAsURL() method.
    */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getEncryptionAsURL());
    }

   /**
    * Test getFirstPacketOrderAsInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsInteger());
    }

   /**
    * Test getFirstPacketOrderAsLong() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsLong());
    }

   /**
    * Test getFirstPacketOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsLocalDateTime());
    }

   /**
    * Test getFirstPacketOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsLocalTime());
    }

   /**
    * Test getFirstPacketOrderAsString() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsString());
    }

   /**
    * Test getFirstPacketOrderAsBoolean() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsBoolean());
    }

   /**
    * Test getFirstPacketOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsBigInteger());
    }

   /**
    * Test getFirstPacketOrderAsURL() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFirstPacketOrderAsURL());
    }

   /**
    * Test getForcedAsInteger() method.
    */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsInteger());
    }

   /**
    * Test getForcedAsLong() method.
    */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsLong());
    }

   /**
    * Test getForcedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsLocalDateTime());
    }

   /**
    * Test getForcedAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsLocalTime());
    }

   /**
    * Test getForcedAsString() method.
    */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsString());
    }

   /**
    * Test getForcedAsBoolean() method.
    */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsBoolean());
    }

   /**
    * Test getForcedAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsBigInteger());
    }

   /**
    * Test getForcedAsURL() method.
    */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getForcedAsURL());
    }

   /**
    * Test getForcedStringAsInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsInteger());
    }

   /**
    * Test getForcedStringAsLong() method.
    */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsLong());
    }

   /**
    * Test getForcedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsLocalDateTime());
    }

   /**
    * Test getForcedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsLocalTime());
    }

   /**
    * Test getForcedStringAsString() method.
    */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsString());
    }

   /**
    * Test getForcedStringAsBoolean() method.
    */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsBoolean());
    }

   /**
    * Test getForcedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsBigInteger());
    }

   /**
    * Test getForcedStringAsURL() method.
    */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getForcedStringAsURL());
    }

   /**
    * Test getFormatAsInteger() method.
    */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsInteger());
    }

   /**
    * Test getFormatAsLong() method.
    */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsLong());
    }

   /**
    * Test getFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsLocalDateTime());
    }

   /**
    * Test getFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsLocalTime());
    }

   /**
    * Test getFormatAsString() method.
    */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsString());
    }

   /**
    * Test getFormatAsBoolean() method.
    */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsBoolean());
    }

   /**
    * Test getFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsBigInteger());
    }

   /**
    * Test getFormatAsURL() method.
    */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatAsURL());
    }

   /**
    * Test getFormatInfoAsInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsInteger());
    }

   /**
    * Test getFormatInfoAsLong() method.
    */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsLong());
    }

   /**
    * Test getFormatInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsLocalDateTime());
    }

   /**
    * Test getFormatInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsLocalTime());
    }

   /**
    * Test getFormatInfoAsString() method.
    */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsString());
    }

   /**
    * Test getFormatInfoAsBoolean() method.
    */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsBoolean());
    }

   /**
    * Test getFormatInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsBigInteger());
    }

   /**
    * Test getFormatInfoAsURL() method.
    */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatInfoAsURL());
    }

   /**
    * Test getFormatUrlAsInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsInteger());
    }

   /**
    * Test getFormatUrlAsLong() method.
    */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsLong());
    }

   /**
    * Test getFormatUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsLocalDateTime());
    }

   /**
    * Test getFormatUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsLocalTime());
    }

   /**
    * Test getFormatUrlAsString() method.
    */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsString());
    }

   /**
    * Test getFormatUrlAsBoolean() method.
    */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsBoolean());
    }

   /**
    * Test getFormatUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsBigInteger());
    }

   /**
    * Test getFormatUrlAsURL() method.
    */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatUrlAsURL());
    }

   /**
    * Test getFormatCommercialAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsInteger());
    }

   /**
    * Test getFormatCommercialAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsLong());
    }

   /**
    * Test getFormatCommercialAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsLocalTime());
    }

   /**
    * Test getFormatCommercialAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsString());
    }

   /**
    * Test getFormatCommercialAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsBoolean());
    }

   /**
    * Test getFormatCommercialAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsBigInteger());
    }

   /**
    * Test getFormatCommercialAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialAsURL());
    }

   /**
    * Test getFormatCommercialIfAnyAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsLong());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsLocalTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsString());
    }

   /**
    * Test getFormatCommercialIfAnyAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsBoolean());
    }

   /**
    * Test getFormatCommercialIfAnyAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsBigInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatCommercialIfAnyAsURL());
    }

   /**
    * Test getFormatCompressionAsInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsInteger());
    }

   /**
    * Test getFormatCompressionAsLong() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsLong());
    }

   /**
    * Test getFormatCompressionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsLocalDateTime());
    }

   /**
    * Test getFormatCompressionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsLocalTime());
    }

   /**
    * Test getFormatCompressionAsString() method.
    */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsString());
    }

   /**
    * Test getFormatCompressionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsBoolean());
    }

   /**
    * Test getFormatCompressionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsBigInteger());
    }

   /**
    * Test getFormatCompressionAsURL() method.
    */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatCompressionAsURL());
    }

   /**
    * Test getFormatLevelAsInteger() method.
    */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsInteger());
    }

   /**
    * Test getFormatLevelAsLong() method.
    */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsLong());
    }

   /**
    * Test getFormatLevelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsLocalDateTime());
    }

   /**
    * Test getFormatLevelAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsLocalTime());
    }

   /**
    * Test getFormatLevelAsString() method.
    */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsString());
    }

   /**
    * Test getFormatLevelAsBoolean() method.
    */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsBoolean());
    }

   /**
    * Test getFormatLevelAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsBigInteger());
    }

   /**
    * Test getFormatLevelAsURL() method.
    */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatLevelAsURL());
    }

   /**
    * Test getFormatProfileAsInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsInteger());
    }

   /**
    * Test getFormatProfileAsLong() method.
    */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsLong());
    }

   /**
    * Test getFormatProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsLocalDateTime());
    }

   /**
    * Test getFormatProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsLocalTime());
    }

   /**
    * Test getFormatProfileAsString() method.
    */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsString());
    }

   /**
    * Test getFormatProfileAsBoolean() method.
    */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsBoolean());
    }

   /**
    * Test getFormatProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsBigInteger());
    }

   /**
    * Test getFormatProfileAsURL() method.
    */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatProfileAsURL());
    }

   /**
    * Test getFormatSettingsAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsInteger());
    }

   /**
    * Test getFormatSettingsAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsLong());
    }

   /**
    * Test getFormatSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsLocalTime());
    }

   /**
    * Test getFormatSettingsAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsString());
    }

   /**
    * Test getFormatSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsBoolean());
    }

   /**
    * Test getFormatSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsBigInteger());
    }

   /**
    * Test getFormatSettingsAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsAsURL());
    }

   /**
    * Test getFormatSettingsBVOPAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsInteger());
    }

   /**
    * Test getFormatSettingsBVOPAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsLong());
    }

   /**
    * Test getFormatSettingsBVOPAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsBVOPAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsLocalTime());
    }

   /**
    * Test getFormatSettingsBVOPAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsString());
    }

   /**
    * Test getFormatSettingsBVOPAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsBoolean());
    }

   /**
    * Test getFormatSettingsBVOPAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsBigInteger());
    }

   /**
    * Test getFormatSettingsBVOPAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPAsURL());
    }

   /**
    * Test getFormatSettingsBVOPStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsInteger());
    }

   /**
    * Test getFormatSettingsBVOPStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsLong());
    }

   /**
    * Test getFormatSettingsBVOPStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsBVOPStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsBVOPStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsString());
    }

   /**
    * Test getFormatSettingsBVOPStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsBoolean());
    }

   /**
    * Test getFormatSettingsBVOPStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsBVOPStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsBVOPStringAsURL());
    }

   /**
    * Test getFormatSettingsCABACAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsInteger());
    }

   /**
    * Test getFormatSettingsCABACAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsLong());
    }

   /**
    * Test getFormatSettingsCABACAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsCABACAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsLocalTime());
    }

   /**
    * Test getFormatSettingsCABACAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsString());
    }

   /**
    * Test getFormatSettingsCABACAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsBoolean());
    }

   /**
    * Test getFormatSettingsCABACAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsBigInteger());
    }

   /**
    * Test getFormatSettingsCABACAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACAsURL());
    }

   /**
    * Test getFormatSettingsCABACStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsInteger());
    }

   /**
    * Test getFormatSettingsCABACStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsLong());
    }

   /**
    * Test getFormatSettingsCABACStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsCABACStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsCABACStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsString());
    }

   /**
    * Test getFormatSettingsCABACStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsBoolean());
    }

   /**
    * Test getFormatSettingsCABACStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsCABACStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsCABACStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsCABACStringAsURL());
    }

   /**
    * Test getFormatSettingsFrameModeAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsInteger());
    }

   /**
    * Test getFormatSettingsFrameModeAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsLong());
    }

   /**
    * Test getFormatSettingsFrameModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsFrameModeAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsLocalTime());
    }

   /**
    * Test getFormatSettingsFrameModeAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsString());
    }

   /**
    * Test getFormatSettingsFrameModeAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsBoolean());
    }

   /**
    * Test getFormatSettingsFrameModeAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsBigInteger());
    }

   /**
    * Test getFormatSettingsFrameModeAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsFrameModeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsFrameModeAsURL());
    }

   /**
    * Test getFormatSettingsGMCAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsInteger());
    }

   /**
    * Test getFormatSettingsGMCAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsLong());
    }

   /**
    * Test getFormatSettingsGMCAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsGMCAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsLocalTime());
    }

   /**
    * Test getFormatSettingsGMCAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsString());
    }

   /**
    * Test getFormatSettingsGMCAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsBoolean());
    }

   /**
    * Test getFormatSettingsGMCAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsBigInteger());
    }

   /**
    * Test getFormatSettingsGMCAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCAsURL());
    }

   /**
    * Test getFormatSettingsGMCStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsInteger());
    }

   /**
    * Test getFormatSettingsGMCStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsLong());
    }

   /**
    * Test getFormatSettingsGMCStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsGMCStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsGMCStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsString());
    }

   /**
    * Test getFormatSettingsGMCStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsBoolean());
    }

   /**
    * Test getFormatSettingsGMCStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsGMCStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsGMCStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGMCStringAsURL());
    }

   /**
    * Test getFormatSettingsGOPAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsInteger());
    }

   /**
    * Test getFormatSettingsGOPAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsLong());
    }

   /**
    * Test getFormatSettingsGOPAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsGOPAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsLocalTime());
    }

   /**
    * Test getFormatSettingsGOPAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsString());
    }

   /**
    * Test getFormatSettingsGOPAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsBoolean());
    }

   /**
    * Test getFormatSettingsGOPAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsBigInteger());
    }

   /**
    * Test getFormatSettingsGOPAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsGOPAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsGOPAsURL());
    }

   /**
    * Test getFormatSettingsMatrixAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsInteger());
    }

   /**
    * Test getFormatSettingsMatrixAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsLong());
    }

   /**
    * Test getFormatSettingsMatrixAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsMatrixAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsLocalTime());
    }

   /**
    * Test getFormatSettingsMatrixAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsString());
    }

   /**
    * Test getFormatSettingsMatrixAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsBoolean());
    }

   /**
    * Test getFormatSettingsMatrixAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsBigInteger());
    }

   /**
    * Test getFormatSettingsMatrixAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixAsURL());
    }

   /**
    * Test getFormatSettingsMatrixStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsInteger());
    }

   /**
    * Test getFormatSettingsMatrixStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsLong());
    }

   /**
    * Test getFormatSettingsMatrixStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsMatrixStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsMatrixStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsString());
    }

   /**
    * Test getFormatSettingsMatrixStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsBoolean());
    }

   /**
    * Test getFormatSettingsMatrixStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsMatrixStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixStringAsURL());
    }

   /**
    * Test getFormatSettingsMatrixDataAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsInteger());
    }

   /**
    * Test getFormatSettingsMatrixDataAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsLong());
    }

   /**
    * Test getFormatSettingsMatrixDataAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsMatrixDataAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsLocalTime());
    }

   /**
    * Test getFormatSettingsMatrixDataAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsString());
    }

   /**
    * Test getFormatSettingsMatrixDataAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsBoolean());
    }

   /**
    * Test getFormatSettingsMatrixDataAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsBigInteger());
    }

   /**
    * Test getFormatSettingsMatrixDataAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsMatrixDataAsURL());
    }

   /**
    * Test getFormatSettingsPictureStructureAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsInteger());
    }

   /**
    * Test getFormatSettingsPictureStructureAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsLong());
    }

   /**
    * Test getFormatSettingsPictureStructureAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsPictureStructureAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsLocalTime());
    }

   /**
    * Test getFormatSettingsPictureStructureAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsString());
    }

   /**
    * Test getFormatSettingsPictureStructureAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsBoolean());
    }

   /**
    * Test getFormatSettingsPictureStructureAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsBigInteger());
    }

   /**
    * Test getFormatSettingsPictureStructureAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPictureStructureAsURL());
    }

   /**
    * Test getFormatSettingsPulldownAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsInteger());
    }

   /**
    * Test getFormatSettingsPulldownAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsLong());
    }

   /**
    * Test getFormatSettingsPulldownAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsPulldownAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsLocalTime());
    }

   /**
    * Test getFormatSettingsPulldownAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsString());
    }

   /**
    * Test getFormatSettingsPulldownAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsBoolean());
    }

   /**
    * Test getFormatSettingsPulldownAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsBigInteger());
    }

   /**
    * Test getFormatSettingsPulldownAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsPulldownAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsPulldownAsURL());
    }

   /**
    * Test getFormatSettingsQPelAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsInteger());
    }

   /**
    * Test getFormatSettingsQPelAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsLong());
    }

   /**
    * Test getFormatSettingsQPelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsQPelAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsLocalTime());
    }

   /**
    * Test getFormatSettingsQPelAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsString());
    }

   /**
    * Test getFormatSettingsQPelAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsBoolean());
    }

   /**
    * Test getFormatSettingsQPelAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsBigInteger());
    }

   /**
    * Test getFormatSettingsQPelAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelAsURL());
    }

   /**
    * Test getFormatSettingsQPelStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsInteger());
    }

   /**
    * Test getFormatSettingsQPelStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsLong());
    }

   /**
    * Test getFormatSettingsQPelStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsQPelStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsQPelStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsString());
    }

   /**
    * Test getFormatSettingsQPelStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsBoolean());
    }

   /**
    * Test getFormatSettingsQPelStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsQPelStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsQPelStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsQPelStringAsURL());
    }

   /**
    * Test getFormatSettingsRefFramesAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsInteger());
    }

   /**
    * Test getFormatSettingsRefFramesAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsLong());
    }

   /**
    * Test getFormatSettingsRefFramesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsRefFramesAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsLocalTime());
    }

   /**
    * Test getFormatSettingsRefFramesAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsString());
    }

   /**
    * Test getFormatSettingsRefFramesAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsBoolean());
    }

   /**
    * Test getFormatSettingsRefFramesAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsBigInteger());
    }

   /**
    * Test getFormatSettingsRefFramesAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesAsURL());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsInteger());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsLong());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsString());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsBoolean());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsRefFramesStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsRefFramesStringAsURL());
    }

   /**
    * Test getFormatSettingsWrappingAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsInteger());
    }

   /**
    * Test getFormatSettingsWrappingAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsLong());
    }

   /**
    * Test getFormatSettingsWrappingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsWrappingAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsLocalTime());
    }

   /**
    * Test getFormatSettingsWrappingAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsString());
    }

   /**
    * Test getFormatSettingsWrappingAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsBoolean());
    }

   /**
    * Test getFormatSettingsWrappingAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsBigInteger());
    }

   /**
    * Test getFormatSettingsWrappingAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatSettingsWrappingAsURL());
    }

   /**
    * Test getFormatTierAsInteger() method.
    */
    @Test
    public void subTestGetFormatTierAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsInteger());
    }

   /**
    * Test getFormatTierAsLong() method.
    */
    @Test
    public void subTestGetFormatTierAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsLong());
    }

   /**
    * Test getFormatTierAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatTierAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsLocalDateTime());
    }

   /**
    * Test getFormatTierAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatTierAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsLocalTime());
    }

   /**
    * Test getFormatTierAsString() method.
    */
    @Test
    public void subTestGetFormatTierAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsString());
    }

   /**
    * Test getFormatTierAsBoolean() method.
    */
    @Test
    public void subTestGetFormatTierAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsBoolean());
    }

   /**
    * Test getFormatTierAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatTierAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsBigInteger());
    }

   /**
    * Test getFormatTierAsURL() method.
    */
    @Test
    public void subTestGetFormatTierAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatTierAsURL());
    }

   /**
    * Test getFormatVersionAsInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsInteger());
    }

   /**
    * Test getFormatVersionAsLong() method.
    */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsLong());
    }

   /**
    * Test getFormatVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsLocalDateTime());
    }

   /**
    * Test getFormatVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsLocalTime());
    }

   /**
    * Test getFormatVersionAsString() method.
    */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsString());
    }

   /**
    * Test getFormatVersionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsBoolean());
    }

   /**
    * Test getFormatVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsBigInteger());
    }

   /**
    * Test getFormatVersionAsURL() method.
    */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFormatVersionAsURL());
    }

   /**
    * Test getFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsInteger());
    }

   /**
    * Test getFrameCountAsLong() method.
    */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsLong());
    }

   /**
    * Test getFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsLocalDateTime());
    }

   /**
    * Test getFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsLocalTime());
    }

   /**
    * Test getFrameCountAsString() method.
    */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsString());
    }

   /**
    * Test getFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsBoolean());
    }

   /**
    * Test getFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsBigInteger());
    }

   /**
    * Test getFrameCountAsURL() method.
    */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameCountAsURL());
    }

   /**
    * Test getFrameRateAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsInteger());
    }

   /**
    * Test getFrameRateAsLong() method.
    */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsLong());
    }

   /**
    * Test getFrameRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsLocalDateTime());
    }

   /**
    * Test getFrameRateAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsLocalTime());
    }

   /**
    * Test getFrameRateAsString() method.
    */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsString());
    }

   /**
    * Test getFrameRateAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsBoolean());
    }

   /**
    * Test getFrameRateAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsBigInteger());
    }

   /**
    * Test getFrameRateAsURL() method.
    */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateAsURL());
    }

   /**
    * Test getFrameRateStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsInteger());
    }

   /**
    * Test getFrameRateStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsLong());
    }

   /**
    * Test getFrameRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsLocalTime());
    }

   /**
    * Test getFrameRateStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsString());
    }

   /**
    * Test getFrameRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsBoolean());
    }

   /**
    * Test getFrameRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsBigInteger());
    }

   /**
    * Test getFrameRateStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateStringAsURL());
    }

   /**
    * Test getFrameRateDenAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsInteger());
    }

   /**
    * Test getFrameRateDenAsLong() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsLong());
    }

   /**
    * Test getFrameRateDenAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsLocalDateTime());
    }

   /**
    * Test getFrameRateDenAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsLocalTime());
    }

   /**
    * Test getFrameRateDenAsString() method.
    */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsString());
    }

   /**
    * Test getFrameRateDenAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsBoolean());
    }

   /**
    * Test getFrameRateDenAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsBigInteger());
    }

   /**
    * Test getFrameRateDenAsURL() method.
    */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateDenAsURL());
    }

   /**
    * Test getFrameRateMaximumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsInteger());
    }

   /**
    * Test getFrameRateMaximumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsLong());
    }

   /**
    * Test getFrameRateMaximumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsLocalDateTime());
    }

   /**
    * Test getFrameRateMaximumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsLocalTime());
    }

   /**
    * Test getFrameRateMaximumAsString() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsString());
    }

   /**
    * Test getFrameRateMaximumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsBoolean());
    }

   /**
    * Test getFrameRateMaximumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsBigInteger());
    }

   /**
    * Test getFrameRateMaximumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumAsURL());
    }

   /**
    * Test getFrameRateMaximumStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsInteger());
    }

   /**
    * Test getFrameRateMaximumStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsLong());
    }

   /**
    * Test getFrameRateMaximumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateMaximumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsLocalTime());
    }

   /**
    * Test getFrameRateMaximumStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsString());
    }

   /**
    * Test getFrameRateMaximumStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsBoolean());
    }

   /**
    * Test getFrameRateMaximumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsBigInteger());
    }

   /**
    * Test getFrameRateMaximumStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMaximumStringAsURL());
    }

   /**
    * Test getFrameRateMinimumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsInteger());
    }

   /**
    * Test getFrameRateMinimumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsLong());
    }

   /**
    * Test getFrameRateMinimumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsLocalDateTime());
    }

   /**
    * Test getFrameRateMinimumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsLocalTime());
    }

   /**
    * Test getFrameRateMinimumAsString() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsString());
    }

   /**
    * Test getFrameRateMinimumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsBoolean());
    }

   /**
    * Test getFrameRateMinimumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsBigInteger());
    }

   /**
    * Test getFrameRateMinimumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumAsURL());
    }

   /**
    * Test getFrameRateMinimumStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsInteger());
    }

   /**
    * Test getFrameRateMinimumStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsLong());
    }

   /**
    * Test getFrameRateMinimumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateMinimumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsLocalTime());
    }

   /**
    * Test getFrameRateMinimumStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsString());
    }

   /**
    * Test getFrameRateMinimumStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsBoolean());
    }

   /**
    * Test getFrameRateMinimumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsBigInteger());
    }

   /**
    * Test getFrameRateMinimumStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateMinimumStringAsURL());
    }

   /**
    * Test getFrameRateModeAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsInteger());
    }

   /**
    * Test getFrameRateModeAsLong() method.
    */
    @Test
    public void subTestGetFrameRateModeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsLong());
    }

   /**
    * Test getFrameRateModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsLocalDateTime());
    }

   /**
    * Test getFrameRateModeAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateModeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsLocalTime());
    }

   /**
    * Test getFrameRateModeAsString() method.
    */
    @Test
    public void subTestGetFrameRateModeAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsString());
    }

   /**
    * Test getFrameRateModeAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateModeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsBoolean());
    }

   /**
    * Test getFrameRateModeAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsBigInteger());
    }

   /**
    * Test getFrameRateModeAsURL() method.
    */
    @Test
    public void subTestGetFrameRateModeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeAsURL());
    }

   /**
    * Test getFrameRateModeStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsInteger());
    }

   /**
    * Test getFrameRateModeStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsLong());
    }

   /**
    * Test getFrameRateModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsLocalTime());
    }

   /**
    * Test getFrameRateModeStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsString());
    }

   /**
    * Test getFrameRateModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsBoolean());
    }

   /**
    * Test getFrameRateModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsBigInteger());
    }

   /**
    * Test getFrameRateModeStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeStringAsURL());
    }

   /**
    * Test getFrameRateModeOriginalAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsInteger());
    }

   /**
    * Test getFrameRateModeOriginalAsLong() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsLong());
    }

   /**
    * Test getFrameRateModeOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsLocalDateTime());
    }

   /**
    * Test getFrameRateModeOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsLocalTime());
    }

   /**
    * Test getFrameRateModeOriginalAsString() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsString());
    }

   /**
    * Test getFrameRateModeOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsBoolean());
    }

   /**
    * Test getFrameRateModeOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsBigInteger());
    }

   /**
    * Test getFrameRateModeOriginalAsURL() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalAsURL());
    }

   /**
    * Test getFrameRateModeOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsInteger());
    }

   /**
    * Test getFrameRateModeOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsLong());
    }

   /**
    * Test getFrameRateModeOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateModeOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsLocalTime());
    }

   /**
    * Test getFrameRateModeOriginalStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsString());
    }

   /**
    * Test getFrameRateModeOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsBoolean());
    }

   /**
    * Test getFrameRateModeOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsBigInteger());
    }

   /**
    * Test getFrameRateModeOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateModeOriginalStringAsURL());
    }

   /**
    * Test getFrameRateNominalAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsInteger());
    }

   /**
    * Test getFrameRateNominalAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsLong());
    }

   /**
    * Test getFrameRateNominalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsLocalDateTime());
    }

   /**
    * Test getFrameRateNominalAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsLocalTime());
    }

   /**
    * Test getFrameRateNominalAsString() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsString());
    }

   /**
    * Test getFrameRateNominalAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsBoolean());
    }

   /**
    * Test getFrameRateNominalAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsBigInteger());
    }

   /**
    * Test getFrameRateNominalAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalAsURL());
    }

   /**
    * Test getFrameRateNominalStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsInteger());
    }

   /**
    * Test getFrameRateNominalStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsLong());
    }

   /**
    * Test getFrameRateNominalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateNominalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsLocalTime());
    }

   /**
    * Test getFrameRateNominalStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsString());
    }

   /**
    * Test getFrameRateNominalStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsBoolean());
    }

   /**
    * Test getFrameRateNominalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsBigInteger());
    }

   /**
    * Test getFrameRateNominalStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNominalStringAsURL());
    }

   /**
    * Test getFrameRateNumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsInteger());
    }

   /**
    * Test getFrameRateNumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsLong());
    }

   /**
    * Test getFrameRateNumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsLocalDateTime());
    }

   /**
    * Test getFrameRateNumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsLocalTime());
    }

   /**
    * Test getFrameRateNumAsString() method.
    */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsString());
    }

   /**
    * Test getFrameRateNumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsBoolean());
    }

   /**
    * Test getFrameRateNumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsBigInteger());
    }

   /**
    * Test getFrameRateNumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateNumAsURL());
    }

   /**
    * Test getFrameRateOriginalAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsInteger());
    }

   /**
    * Test getFrameRateOriginalAsLong() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsLong());
    }

   /**
    * Test getFrameRateOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsLocalDateTime());
    }

   /**
    * Test getFrameRateOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsLocalTime());
    }

   /**
    * Test getFrameRateOriginalAsString() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsString());
    }

   /**
    * Test getFrameRateOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsBoolean());
    }

   /**
    * Test getFrameRateOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsBigInteger());
    }

   /**
    * Test getFrameRateOriginalAsURL() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalAsURL());
    }

   /**
    * Test getFrameRateOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsInteger());
    }

   /**
    * Test getFrameRateOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsLong());
    }

   /**
    * Test getFrameRateOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsLocalTime());
    }

   /**
    * Test getFrameRateOriginalStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsString());
    }

   /**
    * Test getFrameRateOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsBoolean());
    }

   /**
    * Test getFrameRateOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsBigInteger());
    }

   /**
    * Test getFrameRateOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalStringAsURL());
    }

   /**
    * Test getFrameRateOriginalDenAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsInteger());
    }

   /**
    * Test getFrameRateOriginalDenAsLong() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsLong());
    }

   /**
    * Test getFrameRateOriginalDenAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsLocalDateTime());
    }

   /**
    * Test getFrameRateOriginalDenAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsLocalTime());
    }

   /**
    * Test getFrameRateOriginalDenAsString() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsString());
    }

   /**
    * Test getFrameRateOriginalDenAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsBoolean());
    }

   /**
    * Test getFrameRateOriginalDenAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsBigInteger());
    }

   /**
    * Test getFrameRateOriginalDenAsURL() method.
    */
    @Test
    public void subTestGetFrameRateOriginalDenAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalDenAsURL());
    }

   /**
    * Test getFrameRateOriginalNumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsInteger());
    }

   /**
    * Test getFrameRateOriginalNumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsLong() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsLong());
    }

   /**
    * Test getFrameRateOriginalNumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsLocalDateTime());
    }

   /**
    * Test getFrameRateOriginalNumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsLocalTime());
    }

   /**
    * Test getFrameRateOriginalNumAsString() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsString() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsString());
    }

   /**
    * Test getFrameRateOriginalNumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsBoolean());
    }

   /**
    * Test getFrameRateOriginalNumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsBigInteger());
    }

   /**
    * Test getFrameRateOriginalNumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateOriginalNumAsURL() {
        assertEquals(null, this.jMetaDataVideo.getFrameRateOriginalNumAsURL());
    }

   /**
    * Test getGopOpenClosedAsInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsInteger());
    }

   /**
    * Test getGopOpenClosedAsLong() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsLong());
    }

   /**
    * Test getGopOpenClosedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsLocalDateTime());
    }

   /**
    * Test getGopOpenClosedAsLocalTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsLocalTime());
    }

   /**
    * Test getGopOpenClosedAsString() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsString() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsString());
    }

   /**
    * Test getGopOpenClosedAsBoolean() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsBoolean());
    }

   /**
    * Test getGopOpenClosedAsBigInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsBigInteger());
    }

   /**
    * Test getGopOpenClosedAsURL() method.
    */
    @Test
    public void subTestGetGopOpenClosedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedAsURL());
    }

   /**
    * Test getGopOpenClosedStringAsInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsInteger());
    }

   /**
    * Test getGopOpenClosedStringAsLong() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsLong());
    }

   /**
    * Test getGopOpenClosedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsLocalDateTime());
    }

   /**
    * Test getGopOpenClosedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsLocalTime());
    }

   /**
    * Test getGopOpenClosedStringAsString() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsString());
    }

   /**
    * Test getGopOpenClosedStringAsBoolean() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsBoolean());
    }

   /**
    * Test getGopOpenClosedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsBigInteger());
    }

   /**
    * Test getGopOpenClosedStringAsURL() method.
    */
    @Test
    public void subTestGetGopOpenClosedStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedStringAsURL());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsInteger());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsLong());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsLocalDateTime());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsLocalTime());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsString() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsString());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsBoolean());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsBigInteger());
    }

   /**
    * Test getGopOpenClosedFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameAsURL());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsInteger());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsLong());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsLocalTime());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsString());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsBoolean());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsBigInteger());
    }

   /**
    * Test getGopOpenClosedFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsURL());
    }

   /**
    * Test getHeightAsInteger() method.
    */
    @Test
    public void subTestGetHeightAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsInteger());
    }

   /**
    * Test getHeightAsLong() method.
    */
    @Test
    public void subTestGetHeightAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsLong());
    }

   /**
    * Test getHeightAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsLocalDateTime());
    }

   /**
    * Test getHeightAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsLocalTime());
    }

   /**
    * Test getHeightAsString() method.
    */
    @Test
    public void subTestGetHeightAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsString());
    }

   /**
    * Test getHeightAsBoolean() method.
    */
    @Test
    public void subTestGetHeightAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsBoolean());
    }

   /**
    * Test getHeightAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsBigInteger());
    }

   /**
    * Test getHeightAsURL() method.
    */
    @Test
    public void subTestGetHeightAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightAsURL());
    }

   /**
    * Test getHeightStringAsInteger() method.
    */
    @Test
    public void subTestGetHeightStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsInteger());
    }

   /**
    * Test getHeightStringAsLong() method.
    */
    @Test
    public void subTestGetHeightStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsLong());
    }

   /**
    * Test getHeightStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsLocalDateTime());
    }

   /**
    * Test getHeightStringAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsLocalTime());
    }

   /**
    * Test getHeightStringAsString() method.
    */
    @Test
    public void subTestGetHeightStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsString());
    }

   /**
    * Test getHeightStringAsBoolean() method.
    */
    @Test
    public void subTestGetHeightStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsBoolean());
    }

   /**
    * Test getHeightStringAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsBigInteger());
    }

   /**
    * Test getHeightStringAsURL() method.
    */
    @Test
    public void subTestGetHeightStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightStringAsURL());
    }

   /**
    * Test getHeightCleanApertureAsInteger() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsInteger());
    }

   /**
    * Test getHeightCleanApertureAsLong() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsLong());
    }

   /**
    * Test getHeightCleanApertureAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsLocalDateTime());
    }

   /**
    * Test getHeightCleanApertureAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsLocalTime());
    }

   /**
    * Test getHeightCleanApertureAsString() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsString());
    }

   /**
    * Test getHeightCleanApertureAsBoolean() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsBoolean());
    }

   /**
    * Test getHeightCleanApertureAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsBigInteger());
    }

   /**
    * Test getHeightCleanApertureAsURL() method.
    */
    @Test
    public void subTestGetHeightCleanApertureAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureAsURL());
    }

   /**
    * Test getHeightCleanApertureStringAsInteger() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsInteger());
    }

   /**
    * Test getHeightCleanApertureStringAsLong() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsLong());
    }

   /**
    * Test getHeightCleanApertureStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsLocalDateTime());
    }

   /**
    * Test getHeightCleanApertureStringAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsLocalTime());
    }

   /**
    * Test getHeightCleanApertureStringAsString() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsString());
    }

   /**
    * Test getHeightCleanApertureStringAsBoolean() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsBoolean());
    }

   /**
    * Test getHeightCleanApertureStringAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsBigInteger());
    }

   /**
    * Test getHeightCleanApertureStringAsURL() method.
    */
    @Test
    public void subTestGetHeightCleanApertureStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightCleanApertureStringAsURL());
    }

   /**
    * Test getHeightOffsetAsInteger() method.
    */
    @Test
    public void subTestGetHeightOffsetAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsInteger());
    }

   /**
    * Test getHeightOffsetAsLong() method.
    */
    @Test
    public void subTestGetHeightOffsetAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsLong());
    }

   /**
    * Test getHeightOffsetAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightOffsetAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsLocalDateTime());
    }

   /**
    * Test getHeightOffsetAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightOffsetAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsLocalTime());
    }

   /**
    * Test getHeightOffsetAsString() method.
    */
    @Test
    public void subTestGetHeightOffsetAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsString());
    }

   /**
    * Test getHeightOffsetAsBoolean() method.
    */
    @Test
    public void subTestGetHeightOffsetAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsBoolean());
    }

   /**
    * Test getHeightOffsetAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightOffsetAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsBigInteger());
    }

   /**
    * Test getHeightOffsetAsURL() method.
    */
    @Test
    public void subTestGetHeightOffsetAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetAsURL());
    }

   /**
    * Test getHeightOffsetStringAsInteger() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsInteger());
    }

   /**
    * Test getHeightOffsetStringAsLong() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsLong());
    }

   /**
    * Test getHeightOffsetStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsLocalDateTime());
    }

   /**
    * Test getHeightOffsetStringAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsLocalTime());
    }

   /**
    * Test getHeightOffsetStringAsString() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsString());
    }

   /**
    * Test getHeightOffsetStringAsBoolean() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsBoolean());
    }

   /**
    * Test getHeightOffsetStringAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsBigInteger());
    }

   /**
    * Test getHeightOffsetStringAsURL() method.
    */
    @Test
    public void subTestGetHeightOffsetStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightOffsetStringAsURL());
    }

   /**
    * Test getHeightOriginalAsInteger() method.
    */
    @Test
    public void subTestGetHeightOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsInteger());
    }

   /**
    * Test getHeightOriginalAsLong() method.
    */
    @Test
    public void subTestGetHeightOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsLong());
    }

   /**
    * Test getHeightOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsLocalDateTime());
    }

   /**
    * Test getHeightOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsLocalTime());
    }

   /**
    * Test getHeightOriginalAsString() method.
    */
    @Test
    public void subTestGetHeightOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsString());
    }

   /**
    * Test getHeightOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetHeightOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsBoolean());
    }

   /**
    * Test getHeightOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsBigInteger());
    }

   /**
    * Test getHeightOriginalAsURL() method.
    */
    @Test
    public void subTestGetHeightOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalAsURL());
    }

   /**
    * Test getHeightOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsInteger());
    }

   /**
    * Test getHeightOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsLong());
    }

   /**
    * Test getHeightOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsLocalDateTime());
    }

   /**
    * Test getHeightOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsLocalTime());
    }

   /**
    * Test getHeightOriginalStringAsString() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsString());
    }

   /**
    * Test getHeightOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsBoolean());
    }

   /**
    * Test getHeightOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsBigInteger());
    }

   /**
    * Test getHeightOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetHeightOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getHeightOriginalStringAsURL());
    }

   /**
    * Test getIDAsInteger() method.
    */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getIDAsInteger());
    }

   /**
    * Test getIDAsLong() method.
    */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, this.jMetaDataVideo.getIDAsLong());
    }

   /**
    * Test getIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getIDAsLocalDateTime());
    }

   /**
    * Test getIDAsLocalTime() method.
    */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getIDAsLocalTime());
    }

   /**
    * Test getIDAsString() method.
    */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, this.jMetaDataVideo.getIDAsString());
    }

   /**
    * Test getIDAsBoolean() method.
    */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getIDAsBoolean());
    }

   /**
    * Test getIDAsBigInteger() method.
    */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getIDAsBigInteger());
    }

   /**
    * Test getIDAsURL() method.
    */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, this.jMetaDataVideo.getIDAsURL());
    }

   /**
    * Test getIDStringAsInteger() method.
    */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsInteger());
    }

   /**
    * Test getIDStringAsLong() method.
    */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsLong());
    }

   /**
    * Test getIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsLocalDateTime());
    }

   /**
    * Test getIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsLocalTime());
    }

   /**
    * Test getIDStringAsString() method.
    */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsString());
    }

   /**
    * Test getIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsBoolean());
    }

   /**
    * Test getIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsBigInteger());
    }

   /**
    * Test getIDStringAsURL() method.
    */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getIDStringAsURL());
    }

   /**
    * Test getInformAsInteger() method.
    */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getInformAsInteger());
    }

   /**
    * Test getInformAsLong() method.
    */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, this.jMetaDataVideo.getInformAsLong());
    }

   /**
    * Test getInformAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getInformAsLocalDateTime());
    }

   /**
    * Test getInformAsLocalTime() method.
    */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getInformAsLocalTime());
    }

   /**
    * Test getInformAsString() method.
    */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, this.jMetaDataVideo.getInformAsString());
    }

   /**
    * Test getInformAsBoolean() method.
    */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getInformAsBoolean());
    }

   /**
    * Test getInformAsBigInteger() method.
    */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getInformAsBigInteger());
    }

   /**
    * Test getInformAsURL() method.
    */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, this.jMetaDataVideo.getInformAsURL());
    }

   /**
    * Test getInternetMediaTypeAsInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsInteger());
    }

   /**
    * Test getInternetMediaTypeAsLong() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsLong());
    }

   /**
    * Test getInternetMediaTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsLocalDateTime());
    }

   /**
    * Test getInternetMediaTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsLocalTime());
    }

   /**
    * Test getInternetMediaTypeAsString() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsString());
    }

   /**
    * Test getInternetMediaTypeAsBoolean() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsBoolean());
    }

   /**
    * Test getInternetMediaTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsBigInteger());
    }

   /**
    * Test getInternetMediaTypeAsURL() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getInternetMediaTypeAsURL());
    }

   /**
    * Test getLanguageAsInteger() method.
    */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsInteger());
    }

   /**
    * Test getLanguageAsLong() method.
    */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsLong());
    }

   /**
    * Test getLanguageAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsLocalDateTime());
    }

   /**
    * Test getLanguageAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsLocalTime());
    }

   /**
    * Test getLanguageAsString() method.
    */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsString());
    }

   /**
    * Test getLanguageAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsBoolean());
    }

   /**
    * Test getLanguageAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsBigInteger());
    }

   /**
    * Test getLanguageAsURL() method.
    */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageAsURL());
    }

   /**
    * Test getLanguageStringAsInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsInteger());
    }

   /**
    * Test getLanguageStringAsLong() method.
    */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsLong());
    }

   /**
    * Test getLanguageStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsLocalDateTime());
    }

   /**
    * Test getLanguageStringAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsLocalTime());
    }

   /**
    * Test getLanguageStringAsString() method.
    */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsString());
    }

   /**
    * Test getLanguageStringAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsBoolean());
    }

   /**
    * Test getLanguageStringAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsBigInteger());
    }

   /**
    * Test getLanguageStringAsURL() method.
    */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageStringAsURL());
    }

   /**
    * Test getLanguageString1AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsInteger());
    }

   /**
    * Test getLanguageString1AsLong() method.
    */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsLong());
    }

   /**
    * Test getLanguageString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsLocalDateTime());
    }

   /**
    * Test getLanguageString1AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsLocalTime());
    }

   /**
    * Test getLanguageString1AsString() method.
    */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsString());
    }

   /**
    * Test getLanguageString1AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsBoolean());
    }

   /**
    * Test getLanguageString1AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsBigInteger());
    }

   /**
    * Test getLanguageString1AsURL() method.
    */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString1AsURL());
    }

   /**
    * Test getLanguageString2AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsInteger());
    }

   /**
    * Test getLanguageString2AsLong() method.
    */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsLong());
    }

   /**
    * Test getLanguageString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsLocalDateTime());
    }

   /**
    * Test getLanguageString2AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsLocalTime());
    }

   /**
    * Test getLanguageString2AsString() method.
    */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsString());
    }

   /**
    * Test getLanguageString2AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsBoolean());
    }

   /**
    * Test getLanguageString2AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsBigInteger());
    }

   /**
    * Test getLanguageString2AsURL() method.
    */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString2AsURL());
    }

   /**
    * Test getLanguageString3AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsInteger());
    }

   /**
    * Test getLanguageString3AsLong() method.
    */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsLong());
    }

   /**
    * Test getLanguageString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsLocalDateTime());
    }

   /**
    * Test getLanguageString3AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsLocalTime());
    }

   /**
    * Test getLanguageString3AsString() method.
    */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsString());
    }

   /**
    * Test getLanguageString3AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsBoolean());
    }

   /**
    * Test getLanguageString3AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsBigInteger());
    }

   /**
    * Test getLanguageString3AsURL() method.
    */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString3AsURL());
    }

   /**
    * Test getLanguageString4AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsInteger());
    }

   /**
    * Test getLanguageString4AsLong() method.
    */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsLong());
    }

   /**
    * Test getLanguageString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsLocalDateTime());
    }

   /**
    * Test getLanguageString4AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsLocalTime());
    }

   /**
    * Test getLanguageString4AsString() method.
    */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsString());
    }

   /**
    * Test getLanguageString4AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsBoolean());
    }

   /**
    * Test getLanguageString4AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsBigInteger());
    }

   /**
    * Test getLanguageString4AsURL() method.
    */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageString4AsURL());
    }

   /**
    * Test getLanguageMoreAsInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsInteger());
    }

   /**
    * Test getLanguageMoreAsLong() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsLong());
    }

   /**
    * Test getLanguageMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsLocalDateTime());
    }

   /**
    * Test getLanguageMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsLocalTime());
    }

   /**
    * Test getLanguageMoreAsString() method.
    */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsString());
    }

   /**
    * Test getLanguageMoreAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsBoolean());
    }

   /**
    * Test getLanguageMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsBigInteger());
    }

   /**
    * Test getLanguageMoreAsURL() method.
    */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, this.jMetaDataVideo.getLanguageMoreAsURL());
    }

   /**
    * Test getmatrixcoefficientsAsInteger() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsInteger());
    }

   /**
    * Test getmatrixcoefficientsAsLong() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsLong() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsLong());
    }

   /**
    * Test getmatrixcoefficientsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsLocalDateTime());
    }

   /**
    * Test getmatrixcoefficientsAsLocalTime() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsLocalTime());
    }

   /**
    * Test getmatrixcoefficientsAsString() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsString() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsString());
    }

   /**
    * Test getmatrixcoefficientsAsBoolean() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsBoolean());
    }

   /**
    * Test getmatrixcoefficientsAsBigInteger() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsBigInteger());
    }

   /**
    * Test getmatrixcoefficientsAsURL() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsAsURL() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsAsURL());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsInteger() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsInteger());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsLong() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsLong());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsLocalDateTime());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsLocalTime());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsString() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsString());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsBoolean());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsBigInteger());
    }

   /**
    * Test getmatrixcoefficientsOriginalAsURL() method.
    */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getmatrixcoefficientsOriginalAsURL());
    }

   /**
    * Test getMenuIDAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsInteger());
    }

   /**
    * Test getMenuIDAsLong() method.
    */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsLong());
    }

   /**
    * Test getMenuIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsLocalDateTime());
    }

   /**
    * Test getMenuIDAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsLocalTime());
    }

   /**
    * Test getMenuIDAsString() method.
    */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsString());
    }

   /**
    * Test getMenuIDAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsBoolean());
    }

   /**
    * Test getMenuIDAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsBigInteger());
    }

   /**
    * Test getMenuIDAsURL() method.
    */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDAsURL());
    }

   /**
    * Test getMenuIDStringAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsInteger());
    }

   /**
    * Test getMenuIDStringAsLong() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsLong());
    }

   /**
    * Test getMenuIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsLocalDateTime());
    }

   /**
    * Test getMenuIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsLocalTime());
    }

   /**
    * Test getMenuIDStringAsString() method.
    */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsString());
    }

   /**
    * Test getMenuIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsBoolean());
    }

   /**
    * Test getMenuIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsBigInteger());
    }

   /**
    * Test getMenuIDStringAsURL() method.
    */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getMenuIDStringAsURL());
    }

   /**
    * Test getMultiViewBaseProfileAsInteger() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsInteger());
    }

   /**
    * Test getMultiViewBaseProfileAsLong() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsLong() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsLong());
    }

   /**
    * Test getMultiViewBaseProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsLocalDateTime());
    }

   /**
    * Test getMultiViewBaseProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsLocalTime());
    }

   /**
    * Test getMultiViewBaseProfileAsString() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsString() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsString());
    }

   /**
    * Test getMultiViewBaseProfileAsBoolean() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsBoolean());
    }

   /**
    * Test getMultiViewBaseProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsBigInteger());
    }

   /**
    * Test getMultiViewBaseProfileAsURL() method.
    */
    @Test
    public void subTestGetMultiViewBaseProfileAsURL() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewBaseProfileAsURL());
    }

   /**
    * Test getMultiViewCountAsInteger() method.
    */
    @Test
    public void subTestGetMultiViewCountAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsInteger());
    }

   /**
    * Test getMultiViewCountAsLong() method.
    */
    @Test
    public void subTestGetMultiViewCountAsLong() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsLong());
    }

   /**
    * Test getMultiViewCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMultiViewCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsLocalDateTime());
    }

   /**
    * Test getMultiViewCountAsLocalTime() method.
    */
    @Test
    public void subTestGetMultiViewCountAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsLocalTime());
    }

   /**
    * Test getMultiViewCountAsString() method.
    */
    @Test
    public void subTestGetMultiViewCountAsString() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsString());
    }

   /**
    * Test getMultiViewCountAsBoolean() method.
    */
    @Test
    public void subTestGetMultiViewCountAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsBoolean());
    }

   /**
    * Test getMultiViewCountAsBigInteger() method.
    */
    @Test
    public void subTestGetMultiViewCountAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsBigInteger());
    }

   /**
    * Test getMultiViewCountAsURL() method.
    */
    @Test
    public void subTestGetMultiViewCountAsURL() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewCountAsURL());
    }

   /**
    * Test getMultiViewLayoutAsInteger() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsInteger());
    }

   /**
    * Test getMultiViewLayoutAsLong() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsLong() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsLong());
    }

   /**
    * Test getMultiViewLayoutAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsLocalDateTime());
    }

   /**
    * Test getMultiViewLayoutAsLocalTime() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsLocalTime());
    }

   /**
    * Test getMultiViewLayoutAsString() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsString() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsString());
    }

   /**
    * Test getMultiViewLayoutAsBoolean() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsBoolean());
    }

   /**
    * Test getMultiViewLayoutAsBigInteger() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsBigInteger());
    }

   /**
    * Test getMultiViewLayoutAsURL() method.
    */
    @Test
    public void subTestGetMultiViewLayoutAsURL() {
        assertEquals(null, this.jMetaDataVideo.getMultiViewLayoutAsURL());
    }

   /**
    * Test getMuxingModeAsInteger() method.
    */
    @Test
    public void subTestGetMuxingModeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsInteger());
    }

   /**
    * Test getMuxingModeAsLong() method.
    */
    @Test
    public void subTestGetMuxingModeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsLong());
    }

   /**
    * Test getMuxingModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMuxingModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsLocalDateTime());
    }

   /**
    * Test getMuxingModeAsLocalTime() method.
    */
    @Test
    public void subTestGetMuxingModeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsLocalTime());
    }

   /**
    * Test getMuxingModeAsString() method.
    */
    @Test
    public void subTestGetMuxingModeAsString() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsString());
    }

   /**
    * Test getMuxingModeAsBoolean() method.
    */
    @Test
    public void subTestGetMuxingModeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsBoolean());
    }

   /**
    * Test getMuxingModeAsBigInteger() method.
    */
    @Test
    public void subTestGetMuxingModeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsBigInteger());
    }

   /**
    * Test getMuxingModeAsURL() method.
    */
    @Test
    public void subTestGetMuxingModeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getMuxingModeAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsString());
    }

   /**
    * Test getOriginalSourceMediumIDAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsString());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getOriginalSourceMediumIDStringAsURL());
    }

   /**
    * Test getPixelAspectRatioAsInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsInteger());
    }

   /**
    * Test getPixelAspectRatioAsLong() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsLong() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsLong());
    }

   /**
    * Test getPixelAspectRatioAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsLocalDateTime());
    }

   /**
    * Test getPixelAspectRatioAsLocalTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsLocalTime());
    }

   /**
    * Test getPixelAspectRatioAsString() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsString() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsString());
    }

   /**
    * Test getPixelAspectRatioAsBoolean() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsBoolean());
    }

   /**
    * Test getPixelAspectRatioAsBigInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsBigInteger());
    }

   /**
    * Test getPixelAspectRatioAsURL() method.
    */
    @Test
    public void subTestGetPixelAspectRatioAsURL() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioAsURL());
    }

   /**
    * Test getPixelAspectRatioStringAsInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsInteger());
    }

   /**
    * Test getPixelAspectRatioStringAsLong() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsLong());
    }

   /**
    * Test getPixelAspectRatioStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsLocalDateTime());
    }

   /**
    * Test getPixelAspectRatioStringAsLocalTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsLocalTime());
    }

   /**
    * Test getPixelAspectRatioStringAsString() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsString());
    }

   /**
    * Test getPixelAspectRatioStringAsBoolean() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsBoolean());
    }

   /**
    * Test getPixelAspectRatioStringAsBigInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsBigInteger());
    }

   /**
    * Test getPixelAspectRatioStringAsURL() method.
    */
    @Test
    public void subTestGetPixelAspectRatioStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioStringAsURL());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsInteger());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsLong() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsLong() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsLong());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsLocalDateTime());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsLocalTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsLocalTime());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsString() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsString() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsString());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsBoolean() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsBoolean());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsBigInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsBigInteger());
    }

   /**
    * Test getPixelAspectRatioCleanApertureAsURL() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsURL() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureAsURL());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsInteger());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsLong() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsLong());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsLocalDateTime());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsLocalTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsLocalTime());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsString() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsString());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsBoolean() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsBoolean());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsBigInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsBigInteger());
    }

   /**
    * Test getPixelAspectRatioCleanApertureStringAsURL() method.
    */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsURL());
    }

   /**
    * Test getPixelAspectRatioOriginalAsInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsInteger());
    }

   /**
    * Test getPixelAspectRatioOriginalAsLong() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsLong());
    }

   /**
    * Test getPixelAspectRatioOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsLocalDateTime());
    }

   /**
    * Test getPixelAspectRatioOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsLocalTime());
    }

   /**
    * Test getPixelAspectRatioOriginalAsString() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsString());
    }

   /**
    * Test getPixelAspectRatioOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsBoolean());
    }

   /**
    * Test getPixelAspectRatioOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsBigInteger());
    }

   /**
    * Test getPixelAspectRatioOriginalAsURL() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalAsURL());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsInteger());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsLong());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsLocalDateTime());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsLocalTime());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsString() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsString());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsBoolean());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsBigInteger());
    }

   /**
    * Test getPixelAspectRatioOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getPixelAspectRatioOriginalStringAsURL());
    }

   /**
    * Test getRotationAsInteger() method.
    */
    @Test
    public void subTestGetRotationAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsInteger());
    }

   /**
    * Test getRotationAsLong() method.
    */
    @Test
    public void subTestGetRotationAsLong() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsLong());
    }

   /**
    * Test getRotationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetRotationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsLocalDateTime());
    }

   /**
    * Test getRotationAsLocalTime() method.
    */
    @Test
    public void subTestGetRotationAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsLocalTime());
    }

   /**
    * Test getRotationAsString() method.
    */
    @Test
    public void subTestGetRotationAsString() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsString());
    }

   /**
    * Test getRotationAsBoolean() method.
    */
    @Test
    public void subTestGetRotationAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsBoolean());
    }

   /**
    * Test getRotationAsBigInteger() method.
    */
    @Test
    public void subTestGetRotationAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsBigInteger());
    }

   /**
    * Test getRotationAsURL() method.
    */
    @Test
    public void subTestGetRotationAsURL() {
        assertEquals(null, this.jMetaDataVideo.getRotationAsURL());
    }

   /**
    * Test getRotationStringAsInteger() method.
    */
    @Test
    public void subTestGetRotationStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsInteger());
    }

   /**
    * Test getRotationStringAsLong() method.
    */
    @Test
    public void subTestGetRotationStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsLong());
    }

   /**
    * Test getRotationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetRotationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsLocalDateTime());
    }

   /**
    * Test getRotationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetRotationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsLocalTime());
    }

   /**
    * Test getRotationStringAsString() method.
    */
    @Test
    public void subTestGetRotationStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsString());
    }

   /**
    * Test getRotationStringAsBoolean() method.
    */
    @Test
    public void subTestGetRotationStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsBoolean());
    }

   /**
    * Test getRotationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetRotationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsBigInteger());
    }

   /**
    * Test getRotationStringAsURL() method.
    */
    @Test
    public void subTestGetRotationStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getRotationStringAsURL());
    }

   /**
    * Test getSampledHeightAsInteger() method.
    */
    @Test
    public void subTestGetSampledHeightAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsInteger());
    }

   /**
    * Test getSampledHeightAsLong() method.
    */
    @Test
    public void subTestGetSampledHeightAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsLong());
    }

   /**
    * Test getSampledHeightAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSampledHeightAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsLocalDateTime());
    }

   /**
    * Test getSampledHeightAsLocalTime() method.
    */
    @Test
    public void subTestGetSampledHeightAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsLocalTime());
    }

   /**
    * Test getSampledHeightAsString() method.
    */
    @Test
    public void subTestGetSampledHeightAsString() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsString());
    }

   /**
    * Test getSampledHeightAsBoolean() method.
    */
    @Test
    public void subTestGetSampledHeightAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsBoolean());
    }

   /**
    * Test getSampledHeightAsBigInteger() method.
    */
    @Test
    public void subTestGetSampledHeightAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsBigInteger());
    }

   /**
    * Test getSampledHeightAsURL() method.
    */
    @Test
    public void subTestGetSampledHeightAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSampledHeightAsURL());
    }

   /**
    * Test getSampledWidthAsInteger() method.
    */
    @Test
    public void subTestGetSampledWidthAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsInteger());
    }

   /**
    * Test getSampledWidthAsLong() method.
    */
    @Test
    public void subTestGetSampledWidthAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsLong());
    }

   /**
    * Test getSampledWidthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSampledWidthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsLocalDateTime());
    }

   /**
    * Test getSampledWidthAsLocalTime() method.
    */
    @Test
    public void subTestGetSampledWidthAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsLocalTime());
    }

   /**
    * Test getSampledWidthAsString() method.
    */
    @Test
    public void subTestGetSampledWidthAsString() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsString());
    }

   /**
    * Test getSampledWidthAsBoolean() method.
    */
    @Test
    public void subTestGetSampledWidthAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsBoolean());
    }

   /**
    * Test getSampledWidthAsBigInteger() method.
    */
    @Test
    public void subTestGetSampledWidthAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsBigInteger());
    }

   /**
    * Test getSampledWidthAsURL() method.
    */
    @Test
    public void subTestGetSampledWidthAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSampledWidthAsURL());
    }

   /**
    * Test getScanOrderAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsInteger());
    }

   /**
    * Test getScanOrderAsLong() method.
    */
    @Test
    public void subTestGetScanOrderAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsLong());
    }

   /**
    * Test getScanOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsLocalDateTime());
    }

   /**
    * Test getScanOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsLocalTime());
    }

   /**
    * Test getScanOrderAsString() method.
    */
    @Test
    public void subTestGetScanOrderAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsString());
    }

   /**
    * Test getScanOrderAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsBoolean());
    }

   /**
    * Test getScanOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsBigInteger());
    }

   /**
    * Test getScanOrderAsURL() method.
    */
    @Test
    public void subTestGetScanOrderAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderAsURL());
    }

   /**
    * Test getScanOrderStringAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsInteger());
    }

   /**
    * Test getScanOrderStringAsLong() method.
    */
    @Test
    public void subTestGetScanOrderStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsLong());
    }

   /**
    * Test getScanOrderStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsLocalDateTime());
    }

   /**
    * Test getScanOrderStringAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsLocalTime());
    }

   /**
    * Test getScanOrderStringAsString() method.
    */
    @Test
    public void subTestGetScanOrderStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsString());
    }

   /**
    * Test getScanOrderStringAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsBoolean());
    }

   /**
    * Test getScanOrderStringAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsBigInteger());
    }

   /**
    * Test getScanOrderStringAsURL() method.
    */
    @Test
    public void subTestGetScanOrderStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStringAsURL());
    }

   /**
    * Test getScanOrderOriginalAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsInteger());
    }

   /**
    * Test getScanOrderOriginalAsLong() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsLong());
    }

   /**
    * Test getScanOrderOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsLocalDateTime());
    }

   /**
    * Test getScanOrderOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsLocalTime());
    }

   /**
    * Test getScanOrderOriginalAsString() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsString());
    }

   /**
    * Test getScanOrderOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsBoolean());
    }

   /**
    * Test getScanOrderOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsBigInteger());
    }

   /**
    * Test getScanOrderOriginalAsURL() method.
    */
    @Test
    public void subTestGetScanOrderOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalAsURL());
    }

   /**
    * Test getScanOrderOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsInteger());
    }

   /**
    * Test getScanOrderOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsLong());
    }

   /**
    * Test getScanOrderOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsLocalDateTime());
    }

   /**
    * Test getScanOrderOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsLocalTime());
    }

   /**
    * Test getScanOrderOriginalStringAsString() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsString());
    }

   /**
    * Test getScanOrderOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsBoolean());
    }

   /**
    * Test getScanOrderOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsBigInteger());
    }

   /**
    * Test getScanOrderOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetScanOrderOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderOriginalStringAsURL());
    }

   /**
    * Test getScanOrderStoredAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsInteger());
    }

   /**
    * Test getScanOrderStoredAsLong() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsLong());
    }

   /**
    * Test getScanOrderStoredAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsLocalDateTime());
    }

   /**
    * Test getScanOrderStoredAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsLocalTime());
    }

   /**
    * Test getScanOrderStoredAsString() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsString());
    }

   /**
    * Test getScanOrderStoredAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsBoolean());
    }

   /**
    * Test getScanOrderStoredAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsBigInteger());
    }

   /**
    * Test getScanOrderStoredAsURL() method.
    */
    @Test
    public void subTestGetScanOrderStoredAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredAsURL());
    }

   /**
    * Test getScanOrderStoredStringAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsInteger());
    }

   /**
    * Test getScanOrderStoredStringAsLong() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsLong());
    }

   /**
    * Test getScanOrderStoredStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsLocalDateTime());
    }

   /**
    * Test getScanOrderStoredStringAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsLocalTime());
    }

   /**
    * Test getScanOrderStoredStringAsString() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsString());
    }

   /**
    * Test getScanOrderStoredStringAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsBoolean());
    }

   /**
    * Test getScanOrderStoredStringAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsBigInteger());
    }

   /**
    * Test getScanOrderStoredStringAsURL() method.
    */
    @Test
    public void subTestGetScanOrderStoredStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredStringAsURL());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsInteger() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsInteger());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsLong() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsLong());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsLocalDateTime());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsLocalTime() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsLocalTime());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsString() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsString());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsBoolean() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsBoolean());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsBigInteger() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsBigInteger());
    }

   /**
    * Test getScanOrderStoredDisplayedInvertedAsURL() method.
    */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsURL());
    }

   /**
    * Test getScanTypeAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsInteger());
    }

   /**
    * Test getScanTypeAsLong() method.
    */
    @Test
    public void subTestGetScanTypeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsLong());
    }

   /**
    * Test getScanTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsLocalDateTime());
    }

   /**
    * Test getScanTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsLocalTime());
    }

   /**
    * Test getScanTypeAsString() method.
    */
    @Test
    public void subTestGetScanTypeAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsString());
    }

   /**
    * Test getScanTypeAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsBoolean());
    }

   /**
    * Test getScanTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsBigInteger());
    }

   /**
    * Test getScanTypeAsURL() method.
    */
    @Test
    public void subTestGetScanTypeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeAsURL());
    }

   /**
    * Test getScanTypeStringAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsInteger());
    }

   /**
    * Test getScanTypeStringAsLong() method.
    */
    @Test
    public void subTestGetScanTypeStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsLong());
    }

   /**
    * Test getScanTypeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsLocalDateTime());
    }

   /**
    * Test getScanTypeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsLocalTime());
    }

   /**
    * Test getScanTypeStringAsString() method.
    */
    @Test
    public void subTestGetScanTypeStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsString());
    }

   /**
    * Test getScanTypeStringAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsBoolean());
    }

   /**
    * Test getScanTypeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsBigInteger());
    }

   /**
    * Test getScanTypeStringAsURL() method.
    */
    @Test
    public void subTestGetScanTypeStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStringAsURL());
    }

   /**
    * Test getScanTypeOriginalAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsInteger());
    }

   /**
    * Test getScanTypeOriginalAsLong() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsLong());
    }

   /**
    * Test getScanTypeOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsLocalDateTime());
    }

   /**
    * Test getScanTypeOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsLocalTime());
    }

   /**
    * Test getScanTypeOriginalAsString() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsString());
    }

   /**
    * Test getScanTypeOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsBoolean());
    }

   /**
    * Test getScanTypeOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsBigInteger());
    }

   /**
    * Test getScanTypeOriginalAsURL() method.
    */
    @Test
    public void subTestGetScanTypeOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalAsURL());
    }

   /**
    * Test getScanTypeOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsInteger());
    }

   /**
    * Test getScanTypeOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsLong());
    }

   /**
    * Test getScanTypeOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsLocalDateTime());
    }

   /**
    * Test getScanTypeOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsLocalTime());
    }

   /**
    * Test getScanTypeOriginalStringAsString() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsString());
    }

   /**
    * Test getScanTypeOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsBoolean());
    }

   /**
    * Test getScanTypeOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsBigInteger());
    }

   /**
    * Test getScanTypeOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetScanTypeOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeOriginalStringAsURL());
    }

   /**
    * Test getScanTypeStoreMethodAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsInteger());
    }

   /**
    * Test getScanTypeStoreMethodAsLong() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsLong());
    }

   /**
    * Test getScanTypeStoreMethodAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsLocalDateTime());
    }

   /**
    * Test getScanTypeStoreMethodAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsLocalTime());
    }

   /**
    * Test getScanTypeStoreMethodAsString() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsString());
    }

   /**
    * Test getScanTypeStoreMethodAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsBoolean());
    }

   /**
    * Test getScanTypeStoreMethodAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsBigInteger());
    }

   /**
    * Test getScanTypeStoreMethodAsURL() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodAsURL());
    }

   /**
    * Test getScanTypeStoreMethodStringAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsInteger());
    }

   /**
    * Test getScanTypeStoreMethodStringAsLong() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsLong());
    }

   /**
    * Test getScanTypeStoreMethodStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsLocalDateTime());
    }

   /**
    * Test getScanTypeStoreMethodStringAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsLocalTime());
    }

   /**
    * Test getScanTypeStoreMethodStringAsString() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsString());
    }

   /**
    * Test getScanTypeStoreMethodStringAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsBoolean());
    }

   /**
    * Test getScanTypeStoreMethodStringAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsBigInteger());
    }

   /**
    * Test getScanTypeStoreMethodStringAsURL() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodStringAsURL());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsInteger() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsInteger());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsLong() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsLong() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsLong());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsLocalDateTime());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsLocalTime() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsLocalTime());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsString() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsString() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsString());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsBoolean() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsBoolean());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsBigInteger() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsBigInteger());
    }

   /**
    * Test getScanTypeStoreMethodFieldsPerBlockAsURL() method.
    */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsURL() {
        assertEquals(null, this.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsURL());
    }

   /**
    * Test getServiceKindAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsInteger());
    }

   /**
    * Test getServiceKindAsLong() method.
    */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsLong());
    }

   /**
    * Test getServiceKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsLocalDateTime());
    }

   /**
    * Test getServiceKindAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsLocalTime());
    }

   /**
    * Test getServiceKindAsString() method.
    */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsString());
    }

   /**
    * Test getServiceKindAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsBoolean());
    }

   /**
    * Test getServiceKindAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsBigInteger());
    }

   /**
    * Test getServiceKindAsURL() method.
    */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindAsURL());
    }

   /**
    * Test getServiceKindStringAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsInteger());
    }

   /**
    * Test getServiceKindStringAsLong() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsLong());
    }

   /**
    * Test getServiceKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsLocalDateTime());
    }

   /**
    * Test getServiceKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsLocalTime());
    }

   /**
    * Test getServiceKindStringAsString() method.
    */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsString());
    }

   /**
    * Test getServiceKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsBoolean());
    }

   /**
    * Test getServiceKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsBigInteger());
    }

   /**
    * Test getServiceKindStringAsURL() method.
    */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getServiceKindStringAsURL());
    }

   /**
    * Test getSourceDurationAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsInteger());
    }

   /**
    * Test getSourceDurationAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsLong());
    }

   /**
    * Test getSourceDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsLocalDateTime());
    }

   /**
    * Test getSourceDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsLocalTime());
    }

   /**
    * Test getSourceDurationAsString() method.
    */
    @Test
    public void subTestGetSourceDurationAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsString());
    }

   /**
    * Test getSourceDurationAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsBoolean());
    }

   /**
    * Test getSourceDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsBigInteger());
    }

   /**
    * Test getSourceDurationAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationAsURL());
    }

   /**
    * Test getSourceDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsInteger());
    }

   /**
    * Test getSourceDurationStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsLong());
    }

   /**
    * Test getSourceDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsLocalTime());
    }

   /**
    * Test getSourceDurationStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsString());
    }

   /**
    * Test getSourceDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsBoolean());
    }

   /**
    * Test getSourceDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsBigInteger());
    }

   /**
    * Test getSourceDurationStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationStringAsURL());
    }

   /**
    * Test getSourceDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsInteger());
    }

   /**
    * Test getSourceDurationString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsLong());
    }

   /**
    * Test getSourceDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsLocalTime());
    }

   /**
    * Test getSourceDurationString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsString());
    }

   /**
    * Test getSourceDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsBoolean());
    }

   /**
    * Test getSourceDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsBigInteger());
    }

   /**
    * Test getSourceDurationString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString1AsURL());
    }

   /**
    * Test getSourceDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsInteger());
    }

   /**
    * Test getSourceDurationString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsLong());
    }

   /**
    * Test getSourceDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsLocalTime());
    }

   /**
    * Test getSourceDurationString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsString());
    }

   /**
    * Test getSourceDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsBoolean());
    }

   /**
    * Test getSourceDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsBigInteger());
    }

   /**
    * Test getSourceDurationString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString2AsURL());
    }

   /**
    * Test getSourceDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsInteger());
    }

   /**
    * Test getSourceDurationString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsLong());
    }

   /**
    * Test getSourceDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsLocalTime());
    }

   /**
    * Test getSourceDurationString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsString());
    }

   /**
    * Test getSourceDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsBoolean());
    }

   /**
    * Test getSourceDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsBigInteger());
    }

   /**
    * Test getSourceDurationString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString3AsURL());
    }

   /**
    * Test getSourceDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsInteger());
    }

   /**
    * Test getSourceDurationString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsLong());
    }

   /**
    * Test getSourceDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsLocalTime());
    }

   /**
    * Test getSourceDurationString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsString());
    }

   /**
    * Test getSourceDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsBoolean());
    }

   /**
    * Test getSourceDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsBigInteger());
    }

   /**
    * Test getSourceDurationString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString4AsURL());
    }

   /**
    * Test getSourceDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsInteger());
    }

   /**
    * Test getSourceDurationString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsLong());
    }

   /**
    * Test getSourceDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsLocalTime());
    }

   /**
    * Test getSourceDurationString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsString());
    }

   /**
    * Test getSourceDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsBoolean());
    }

   /**
    * Test getSourceDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsBigInteger());
    }

   /**
    * Test getSourceDurationString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationString5AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsLong());
    }

   /**
    * Test getSourceDurationFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameAsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsString());
    }

   /**
    * Test getSourceDurationFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameAsURL());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsLong());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsString());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameStringAsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString1AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString2AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString3AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString4AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationFirstFrameString5AsURL());
    }

   /**
    * Test getSourceDurationLastFrameAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsInteger());
    }

   /**
    * Test getSourceDurationLastFrameAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsLong());
    }

   /**
    * Test getSourceDurationLastFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameAsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsString());
    }

   /**
    * Test getSourceDurationLastFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameAsURL());
    }

   /**
    * Test getSourceDurationLastFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsInteger());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsLong());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsString());
    }

   /**
    * Test getSourceDurationLastFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameStringAsURL());
    }

   /**
    * Test getSourceDurationLastFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsString());
    }

   /**
    * Test getSourceDurationLastFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString1AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsString());
    }

   /**
    * Test getSourceDurationLastFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString2AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsString());
    }

   /**
    * Test getSourceDurationLastFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString3AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsString());
    }

   /**
    * Test getSourceDurationLastFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString4AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsString());
    }

   /**
    * Test getSourceDurationLastFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceDurationLastFrameString5AsURL());
    }

   /**
    * Test getSourceFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsInteger());
    }

   /**
    * Test getSourceFrameCountAsLong() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsLong());
    }

   /**
    * Test getSourceFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsLocalDateTime());
    }

   /**
    * Test getSourceFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsLocalTime());
    }

   /**
    * Test getSourceFrameCountAsString() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsString());
    }

   /**
    * Test getSourceFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsBoolean());
    }

   /**
    * Test getSourceFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsBigInteger());
    }

   /**
    * Test getSourceFrameCountAsURL() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceFrameCountAsURL());
    }

   /**
    * Test getSourceStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsInteger());
    }

   /**
    * Test getSourceStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsLong());
    }

   /**
    * Test getSourceStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsString());
    }

   /**
    * Test getSourceStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsBoolean());
    }

   /**
    * Test getSourceStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeAsURL());
    }

   /**
    * Test getSourceStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsInteger());
    }

   /**
    * Test getSourceStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsLong());
    }

   /**
    * Test getSourceStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsString());
    }

   /**
    * Test getSourceStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsBoolean());
    }

   /**
    * Test getSourceStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeStringAsURL());
    }

   /**
    * Test getSourceStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsInteger());
    }

   /**
    * Test getSourceStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsLong());
    }

   /**
    * Test getSourceStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsString());
    }

   /**
    * Test getSourceStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString1AsURL());
    }

   /**
    * Test getSourceStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsInteger());
    }

   /**
    * Test getSourceStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsLong());
    }

   /**
    * Test getSourceStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsString());
    }

   /**
    * Test getSourceStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString2AsURL());
    }

   /**
    * Test getSourceStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsInteger());
    }

   /**
    * Test getSourceStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsLong());
    }

   /**
    * Test getSourceStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsString());
    }

   /**
    * Test getSourceStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString3AsURL());
    }

   /**
    * Test getSourceStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsInteger());
    }

   /**
    * Test getSourceStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsLong());
    }

   /**
    * Test getSourceStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsString());
    }

   /**
    * Test getSourceStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString4AsURL());
    }

   /**
    * Test getSourceStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsInteger());
    }

   /**
    * Test getSourceStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsLong());
    }

   /**
    * Test getSourceStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsString());
    }

   /**
    * Test getSourceStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeString5AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedStringAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString1AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString2AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString3AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString4AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedString5AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsURL());
    }

   /**
    * Test getSourceStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsInteger());
    }

   /**
    * Test getSourceStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsLong());
    }

   /**
    * Test getSourceStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsString());
    }

   /**
    * Test getSourceStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsBoolean());
    }

   /**
    * Test getSourceStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getSourceStreamSizeProportionAsURL());
    }

   /**
    * Test getStandardAsInteger() method.
    */
    @Test
    public void subTestGetStandardAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsInteger());
    }

   /**
    * Test getStandardAsLong() method.
    */
    @Test
    public void subTestGetStandardAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsLong());
    }

   /**
    * Test getStandardAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStandardAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsLocalDateTime());
    }

   /**
    * Test getStandardAsLocalTime() method.
    */
    @Test
    public void subTestGetStandardAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsLocalTime());
    }

   /**
    * Test getStandardAsString() method.
    */
    @Test
    public void subTestGetStandardAsString() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsString());
    }

   /**
    * Test getStandardAsBoolean() method.
    */
    @Test
    public void subTestGetStandardAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsBoolean());
    }

   /**
    * Test getStandardAsBigInteger() method.
    */
    @Test
    public void subTestGetStandardAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsBigInteger());
    }

   /**
    * Test getStandardAsURL() method.
    */
    @Test
    public void subTestGetStandardAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStandardAsURL());
    }

   /**
    * Test getStatusAsInteger() method.
    */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsInteger());
    }

   /**
    * Test getStatusAsLong() method.
    */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsLong());
    }

   /**
    * Test getStatusAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsLocalDateTime());
    }

   /**
    * Test getStatusAsLocalTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsLocalTime());
    }

   /**
    * Test getStatusAsString() method.
    */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsString());
    }

   /**
    * Test getStatusAsBoolean() method.
    */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsBoolean());
    }

   /**
    * Test getStatusAsBigInteger() method.
    */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsBigInteger());
    }

   /**
    * Test getStatusAsURL() method.
    */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStatusAsURL());
    }

   /**
    * Test getStoredHeightAsInteger() method.
    */
    @Test
    public void subTestGetStoredHeightAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsInteger());
    }

   /**
    * Test getStoredHeightAsLong() method.
    */
    @Test
    public void subTestGetStoredHeightAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsLong());
    }

   /**
    * Test getStoredHeightAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStoredHeightAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsLocalDateTime());
    }

   /**
    * Test getStoredHeightAsLocalTime() method.
    */
    @Test
    public void subTestGetStoredHeightAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsLocalTime());
    }

   /**
    * Test getStoredHeightAsString() method.
    */
    @Test
    public void subTestGetStoredHeightAsString() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsString());
    }

   /**
    * Test getStoredHeightAsBoolean() method.
    */
    @Test
    public void subTestGetStoredHeightAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsBoolean());
    }

   /**
    * Test getStoredHeightAsBigInteger() method.
    */
    @Test
    public void subTestGetStoredHeightAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsBigInteger());
    }

   /**
    * Test getStoredHeightAsURL() method.
    */
    @Test
    public void subTestGetStoredHeightAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStoredHeightAsURL());
    }

   /**
    * Test getStoredWidthAsInteger() method.
    */
    @Test
    public void subTestGetStoredWidthAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsInteger());
    }

   /**
    * Test getStoredWidthAsLong() method.
    */
    @Test
    public void subTestGetStoredWidthAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsLong());
    }

   /**
    * Test getStoredWidthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStoredWidthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsLocalDateTime());
    }

   /**
    * Test getStoredWidthAsLocalTime() method.
    */
    @Test
    public void subTestGetStoredWidthAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsLocalTime());
    }

   /**
    * Test getStoredWidthAsString() method.
    */
    @Test
    public void subTestGetStoredWidthAsString() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsString());
    }

   /**
    * Test getStoredWidthAsBoolean() method.
    */
    @Test
    public void subTestGetStoredWidthAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsBoolean());
    }

   /**
    * Test getStoredWidthAsBigInteger() method.
    */
    @Test
    public void subTestGetStoredWidthAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsBigInteger());
    }

   /**
    * Test getStoredWidthAsURL() method.
    */
    @Test
    public void subTestGetStoredWidthAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStoredWidthAsURL());
    }

   /**
    * Test getStreamCountAsInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsInteger());
    }

   /**
    * Test getStreamCountAsLong() method.
    */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsLong());
    }

   /**
    * Test getStreamCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsLocalDateTime());
    }

   /**
    * Test getStreamCountAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsLocalTime());
    }

   /**
    * Test getStreamCountAsString() method.
    */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsString());
    }

   /**
    * Test getStreamCountAsBoolean() method.
    */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsBoolean());
    }

   /**
    * Test getStreamCountAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsBigInteger());
    }

   /**
    * Test getStreamCountAsURL() method.
    */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamCountAsURL());
    }

   /**
    * Test getStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsInteger());
    }

   /**
    * Test getStreamKindAsLong() method.
    */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsLong());
    }

   /**
    * Test getStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsLocalDateTime());
    }

   /**
    * Test getStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsLocalTime());
    }

   /**
    * Test getStreamKindAsString() method.
    */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsString());
    }

   /**
    * Test getStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsBoolean());
    }

   /**
    * Test getStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsBigInteger());
    }

   /**
    * Test getStreamKindAsURL() method.
    */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindAsURL());
    }

   /**
    * Test getStreamKindStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsInteger());
    }

   /**
    * Test getStreamKindStringAsLong() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsLong());
    }

   /**
    * Test getStreamKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsLocalDateTime());
    }

   /**
    * Test getStreamKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsLocalTime());
    }

   /**
    * Test getStreamKindStringAsString() method.
    */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsString());
    }

   /**
    * Test getStreamKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsBoolean());
    }

   /**
    * Test getStreamKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsBigInteger());
    }

   /**
    * Test getStreamKindStringAsURL() method.
    */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindStringAsURL());
    }

   /**
    * Test getStreamKindIDAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsInteger());
    }

   /**
    * Test getStreamKindIDAsLong() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsLong());
    }

   /**
    * Test getStreamKindIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsLocalDateTime());
    }

   /**
    * Test getStreamKindIDAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsLocalTime());
    }

   /**
    * Test getStreamKindIDAsString() method.
    */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsString());
    }

   /**
    * Test getStreamKindIDAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsBoolean());
    }

   /**
    * Test getStreamKindIDAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsBigInteger());
    }

   /**
    * Test getStreamKindIDAsURL() method.
    */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindIDAsURL());
    }

   /**
    * Test getStreamKindPosAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsInteger());
    }

   /**
    * Test getStreamKindPosAsLong() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsLong());
    }

   /**
    * Test getStreamKindPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsLocalDateTime());
    }

   /**
    * Test getStreamKindPosAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsLocalTime());
    }

   /**
    * Test getStreamKindPosAsString() method.
    */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsString());
    }

   /**
    * Test getStreamKindPosAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsBoolean());
    }

   /**
    * Test getStreamKindPosAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsBigInteger());
    }

   /**
    * Test getStreamKindPosAsURL() method.
    */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamKindPosAsURL());
    }

   /**
    * Test getStreamOrderAsInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsInteger());
    }

   /**
    * Test getStreamOrderAsLong() method.
    */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsLong());
    }

   /**
    * Test getStreamOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsLocalDateTime());
    }

   /**
    * Test getStreamOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsLocalTime());
    }

   /**
    * Test getStreamOrderAsString() method.
    */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsString());
    }

   /**
    * Test getStreamOrderAsBoolean() method.
    */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsBoolean());
    }

   /**
    * Test getStreamOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsBigInteger());
    }

   /**
    * Test getStreamOrderAsURL() method.
    */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamOrderAsURL());
    }

   /**
    * Test getStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsInteger());
    }

   /**
    * Test getStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsLong());
    }

   /**
    * Test getStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsLocalDateTime());
    }

   /**
    * Test getStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsLocalTime());
    }

   /**
    * Test getStreamSizeAsString() method.
    */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsString());
    }

   /**
    * Test getStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsBoolean());
    }

   /**
    * Test getStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsBigInteger());
    }

   /**
    * Test getStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeAsURL());
    }

   /**
    * Test getStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsInteger());
    }

   /**
    * Test getStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsLong());
    }

   /**
    * Test getStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsLocalTime());
    }

   /**
    * Test getStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsString());
    }

   /**
    * Test getStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsBoolean());
    }

   /**
    * Test getStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsBigInteger());
    }

   /**
    * Test getStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeStringAsURL());
    }

   /**
    * Test getStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsInteger());
    }

   /**
    * Test getStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsLong());
    }

   /**
    * Test getStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsLocalTime());
    }

   /**
    * Test getStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsString());
    }

   /**
    * Test getStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsBoolean());
    }

   /**
    * Test getStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsBigInteger());
    }

   /**
    * Test getStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString1AsURL());
    }

   /**
    * Test getStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsInteger());
    }

   /**
    * Test getStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsLong());
    }

   /**
    * Test getStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsLocalTime());
    }

   /**
    * Test getStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsString());
    }

   /**
    * Test getStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsBoolean());
    }

   /**
    * Test getStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsBigInteger());
    }

   /**
    * Test getStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString2AsURL());
    }

   /**
    * Test getStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsInteger());
    }

   /**
    * Test getStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsLong());
    }

   /**
    * Test getStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsLocalTime());
    }

   /**
    * Test getStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsString());
    }

   /**
    * Test getStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsBoolean());
    }

   /**
    * Test getStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsBigInteger());
    }

   /**
    * Test getStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString3AsURL());
    }

   /**
    * Test getStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsInteger());
    }

   /**
    * Test getStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsLong());
    }

   /**
    * Test getStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsLocalTime());
    }

   /**
    * Test getStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsString());
    }

   /**
    * Test getStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsBoolean());
    }

   /**
    * Test getStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsBigInteger());
    }

   /**
    * Test getStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString4AsURL());
    }

   /**
    * Test getStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsInteger());
    }

   /**
    * Test getStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsLong());
    }

   /**
    * Test getStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsLocalTime());
    }

   /**
    * Test getStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsString());
    }

   /**
    * Test getStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsBoolean());
    }

   /**
    * Test getStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsBigInteger());
    }

   /**
    * Test getStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeString5AsURL());
    }

   /**
    * Test getStreamSizeDemuxedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsLong());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsString());
    }

   /**
    * Test getStreamSizeDemuxedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedAsURL());
    }

   /**
    * Test getStreamSizeDemuxedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsLong());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsString());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedStringAsURL());
    }

   /**
    * Test getStreamSizeDemuxedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsString());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString1AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsString());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsString());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString3AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsString());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString4AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsString());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeDemuxedString5AsURL());
    }

   /**
    * Test getStreamSizeEncodedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsInteger());
    }

   /**
    * Test getStreamSizeEncodedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsLong());
    }

   /**
    * Test getStreamSizeEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsString());
    }

   /**
    * Test getStreamSizeEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedAsURL());
    }

   /**
    * Test getStreamSizeEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsInteger());
    }

   /**
    * Test getStreamSizeEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsLong());
    }

   /**
    * Test getStreamSizeEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsString());
    }

   /**
    * Test getStreamSizeEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedStringAsURL());
    }

   /**
    * Test getStreamSizeEncodedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsLong());
    }

   /**
    * Test getStreamSizeEncodedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsString());
    }

   /**
    * Test getStreamSizeEncodedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString1AsURL());
    }

   /**
    * Test getStreamSizeEncodedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsLong());
    }

   /**
    * Test getStreamSizeEncodedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsString());
    }

   /**
    * Test getStreamSizeEncodedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString2AsURL());
    }

   /**
    * Test getStreamSizeEncodedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsLong());
    }

   /**
    * Test getStreamSizeEncodedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsString());
    }

   /**
    * Test getStreamSizeEncodedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString3AsURL());
    }

   /**
    * Test getStreamSizeEncodedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsLong());
    }

   /**
    * Test getStreamSizeEncodedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsString());
    }

   /**
    * Test getStreamSizeEncodedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString4AsURL());
    }

   /**
    * Test getStreamSizeEncodedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsLong());
    }

   /**
    * Test getStreamSizeEncodedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsString());
    }

   /**
    * Test getStreamSizeEncodedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedString5AsURL());
    }

   /**
    * Test getStreamSizeEncodedProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsInteger());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsLong());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsString());
    }

   /**
    * Test getStreamSizeEncodedProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeEncodedProportionAsURL());
    }

   /**
    * Test getStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsInteger());
    }

   /**
    * Test getStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsLong());
    }

   /**
    * Test getStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsString());
    }

   /**
    * Test getStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsBoolean());
    }

   /**
    * Test getStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataVideo.getStreamSizeProportionAsURL());
    }

   /**
    * Test getTaggedDateAsInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsInteger());
    }

   /**
    * Test getTaggedDateAsLong() method.
    */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsLong());
    }

   /**
    * Test getTaggedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsLocalDateTime());
    }

   /**
    * Test getTaggedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsLocalTime());
    }

   /**
    * Test getTaggedDateAsString() method.
    */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsString());
    }

   /**
    * Test getTaggedDateAsBoolean() method.
    */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsBoolean());
    }

   /**
    * Test getTaggedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsBigInteger());
    }

   /**
    * Test getTaggedDateAsURL() method.
    */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTaggedDateAsURL());
    }

   /**
    * Test getTimeCodeFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsInteger());
    }

   /**
    * Test getTimeCodeFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsLong());
    }

   /**
    * Test getTimeCodeFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsLocalDateTime());
    }

   /**
    * Test getTimeCodeFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsLocalTime());
    }

   /**
    * Test getTimeCodeFirstFrameAsString() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsString());
    }

   /**
    * Test getTimeCodeFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsBoolean());
    }

   /**
    * Test getTimeCodeFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsBigInteger());
    }

   /**
    * Test getTimeCodeFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetTimeCodeFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeFirstFrameAsURL());
    }

   /**
    * Test getTimeCodeSettingsAsInteger() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsInteger());
    }

   /**
    * Test getTimeCodeSettingsAsLong() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsLong());
    }

   /**
    * Test getTimeCodeSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsLocalDateTime());
    }

   /**
    * Test getTimeCodeSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsLocalTime());
    }

   /**
    * Test getTimeCodeSettingsAsString() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsString());
    }

   /**
    * Test getTimeCodeSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsBoolean());
    }

   /**
    * Test getTimeCodeSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsBigInteger());
    }

   /**
    * Test getTimeCodeSettingsAsURL() method.
    */
    @Test
    public void subTestGetTimeCodeSettingsAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSettingsAsURL());
    }

   /**
    * Test getTimeCodeSourceAsInteger() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsInteger());
    }

   /**
    * Test getTimeCodeSourceAsLong() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsLong());
    }

   /**
    * Test getTimeCodeSourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsLocalDateTime());
    }

   /**
    * Test getTimeCodeSourceAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsLocalTime());
    }

   /**
    * Test getTimeCodeSourceAsString() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsString());
    }

   /**
    * Test getTimeCodeSourceAsBoolean() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsBoolean());
    }

   /**
    * Test getTimeCodeSourceAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsBigInteger());
    }

   /**
    * Test getTimeCodeSourceAsURL() method.
    */
    @Test
    public void subTestGetTimeCodeSourceAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeCodeSourceAsURL());
    }

   /**
    * Test getTimeStampFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsInteger());
    }

   /**
    * Test getTimeStampFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsLong());
    }

   /**
    * Test getTimeStampFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameAsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsString());
    }

   /**
    * Test getTimeStampFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameAsURL());
    }

   /**
    * Test getTimeStampFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsInteger());
    }

   /**
    * Test getTimeStampFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsLong());
    }

   /**
    * Test getTimeStampFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsString());
    }

   /**
    * Test getTimeStampFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameStringAsURL());
    }

   /**
    * Test getTimeStampFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsInteger());
    }

   /**
    * Test getTimeStampFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsLong());
    }

   /**
    * Test getTimeStampFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsString());
    }

   /**
    * Test getTimeStampFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString1AsURL());
    }

   /**
    * Test getTimeStampFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsInteger());
    }

   /**
    * Test getTimeStampFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsLong());
    }

   /**
    * Test getTimeStampFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsString());
    }

   /**
    * Test getTimeStampFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString2AsURL());
    }

   /**
    * Test getTimeStampFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsInteger());
    }

   /**
    * Test getTimeStampFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsLong());
    }

   /**
    * Test getTimeStampFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsString());
    }

   /**
    * Test getTimeStampFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString3AsURL());
    }

   /**
    * Test getTimeStampFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsInteger());
    }

   /**
    * Test getTimeStampFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsLong());
    }

   /**
    * Test getTimeStampFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsString());
    }

   /**
    * Test getTimeStampFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString4AsURL());
    }

   /**
    * Test getTimeStampFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsInteger());
    }

   /**
    * Test getTimeStampFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsLong());
    }

   /**
    * Test getTimeStampFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getTimeStampFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsLocalTime());
    }

   /**
    * Test getTimeStampFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsString());
    }

   /**
    * Test getTimeStampFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsBoolean());
    }

   /**
    * Test getTimeStampFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsBigInteger());
    }

   /**
    * Test getTimeStampFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataVideo.getTimeStampFirstFrameString5AsURL());
    }

   /**
    * Test getTitleAsInteger() method.
    */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsInteger());
    }

   /**
    * Test getTitleAsLong() method.
    */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsLong());
    }

   /**
    * Test getTitleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsLocalDateTime());
    }

   /**
    * Test getTitleAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsLocalTime());
    }

   /**
    * Test getTitleAsString() method.
    */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsString());
    }

   /**
    * Test getTitleAsBoolean() method.
    */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsBoolean());
    }

   /**
    * Test getTitleAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsBigInteger());
    }

   /**
    * Test getTitleAsURL() method.
    */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, this.jMetaDataVideo.getTitleAsURL());
    }

   /**
    * Test gettransfercharacteristicsAsInteger() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsInteger() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsInteger());
    }

   /**
    * Test gettransfercharacteristicsAsLong() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsLong() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsLong());
    }

   /**
    * Test gettransfercharacteristicsAsLocalDateTime() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsLocalDateTime());
    }

   /**
    * Test gettransfercharacteristicsAsLocalTime() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsLocalTime());
    }

   /**
    * Test gettransfercharacteristicsAsString() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsString() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsString());
    }

   /**
    * Test gettransfercharacteristicsAsBoolean() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsBoolean());
    }

   /**
    * Test gettransfercharacteristicsAsBigInteger() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsBigInteger());
    }

   /**
    * Test gettransfercharacteristicsAsURL() method.
    */
    @Test
    public void subTestGettransfercharacteristicsAsURL() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsAsURL());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsInteger() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsInteger());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsLong() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsLong());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsLocalDateTime());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsLocalTime());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsString() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsString());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsBoolean() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsBoolean());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsBigInteger());
    }

   /**
    * Test gettransfercharacteristicsOriginalAsURL() method.
    */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.gettransfercharacteristicsOriginalAsURL());
    }

   /**
    * Test getUniqueIDAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsInteger());
    }

   /**
    * Test getUniqueIDAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsLong());
    }

   /**
    * Test getUniqueIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsLocalDateTime());
    }

   /**
    * Test getUniqueIDAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsLocalTime());
    }

   /**
    * Test getUniqueIDAsString() method.
    */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsString());
    }

   /**
    * Test getUniqueIDAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsBoolean());
    }

   /**
    * Test getUniqueIDAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsBigInteger());
    }

   /**
    * Test getUniqueIDAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDAsURL());
    }

   /**
    * Test getUniqueIDStringAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsInteger());
    }

   /**
    * Test getUniqueIDStringAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsLong());
    }

   /**
    * Test getUniqueIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsLocalDateTime());
    }

   /**
    * Test getUniqueIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsLocalTime());
    }

   /**
    * Test getUniqueIDStringAsString() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsString());
    }

   /**
    * Test getUniqueIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsBoolean());
    }

   /**
    * Test getUniqueIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsBigInteger());
    }

   /**
    * Test getUniqueIDStringAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getUniqueIDStringAsURL());
    }

   /**
    * Test getWidthAsInteger() method.
    */
    @Test
    public void subTestGetWidthAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsInteger());
    }

   /**
    * Test getWidthAsLong() method.
    */
    @Test
    public void subTestGetWidthAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsLong());
    }

   /**
    * Test getWidthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsLocalDateTime());
    }

   /**
    * Test getWidthAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsLocalTime());
    }

   /**
    * Test getWidthAsString() method.
    */
    @Test
    public void subTestGetWidthAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsString());
    }

   /**
    * Test getWidthAsBoolean() method.
    */
    @Test
    public void subTestGetWidthAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsBoolean());
    }

   /**
    * Test getWidthAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsBigInteger());
    }

   /**
    * Test getWidthAsURL() method.
    */
    @Test
    public void subTestGetWidthAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthAsURL());
    }

   /**
    * Test getWidthStringAsInteger() method.
    */
    @Test
    public void subTestGetWidthStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsInteger());
    }

   /**
    * Test getWidthStringAsLong() method.
    */
    @Test
    public void subTestGetWidthStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsLong());
    }

   /**
    * Test getWidthStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsLocalDateTime());
    }

   /**
    * Test getWidthStringAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsLocalTime());
    }

   /**
    * Test getWidthStringAsString() method.
    */
    @Test
    public void subTestGetWidthStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsString());
    }

   /**
    * Test getWidthStringAsBoolean() method.
    */
    @Test
    public void subTestGetWidthStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsBoolean());
    }

   /**
    * Test getWidthStringAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsBigInteger());
    }

   /**
    * Test getWidthStringAsURL() method.
    */
    @Test
    public void subTestGetWidthStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthStringAsURL());
    }

   /**
    * Test getWidthCleanApertureAsInteger() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsInteger());
    }

   /**
    * Test getWidthCleanApertureAsLong() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsLong());
    }

   /**
    * Test getWidthCleanApertureAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsLocalDateTime());
    }

   /**
    * Test getWidthCleanApertureAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsLocalTime());
    }

   /**
    * Test getWidthCleanApertureAsString() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsString());
    }

   /**
    * Test getWidthCleanApertureAsBoolean() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsBoolean());
    }

   /**
    * Test getWidthCleanApertureAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsBigInteger());
    }

   /**
    * Test getWidthCleanApertureAsURL() method.
    */
    @Test
    public void subTestGetWidthCleanApertureAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureAsURL());
    }

   /**
    * Test getWidthCleanApertureStringAsInteger() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsInteger());
    }

   /**
    * Test getWidthCleanApertureStringAsLong() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsLong());
    }

   /**
    * Test getWidthCleanApertureStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsLocalDateTime());
    }

   /**
    * Test getWidthCleanApertureStringAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsLocalTime());
    }

   /**
    * Test getWidthCleanApertureStringAsString() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsString());
    }

   /**
    * Test getWidthCleanApertureStringAsBoolean() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsBoolean());
    }

   /**
    * Test getWidthCleanApertureStringAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsBigInteger());
    }

   /**
    * Test getWidthCleanApertureStringAsURL() method.
    */
    @Test
    public void subTestGetWidthCleanApertureStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthCleanApertureStringAsURL());
    }

   /**
    * Test getWidthOffsetAsInteger() method.
    */
    @Test
    public void subTestGetWidthOffsetAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsInteger());
    }

   /**
    * Test getWidthOffsetAsLong() method.
    */
    @Test
    public void subTestGetWidthOffsetAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsLong());
    }

   /**
    * Test getWidthOffsetAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthOffsetAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsLocalDateTime());
    }

   /**
    * Test getWidthOffsetAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthOffsetAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsLocalTime());
    }

   /**
    * Test getWidthOffsetAsString() method.
    */
    @Test
    public void subTestGetWidthOffsetAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsString());
    }

   /**
    * Test getWidthOffsetAsBoolean() method.
    */
    @Test
    public void subTestGetWidthOffsetAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsBoolean());
    }

   /**
    * Test getWidthOffsetAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthOffsetAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsBigInteger());
    }

   /**
    * Test getWidthOffsetAsURL() method.
    */
    @Test
    public void subTestGetWidthOffsetAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetAsURL());
    }

   /**
    * Test getWidthOffsetStringAsInteger() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsInteger());
    }

   /**
    * Test getWidthOffsetStringAsLong() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsLong());
    }

   /**
    * Test getWidthOffsetStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsLocalDateTime());
    }

   /**
    * Test getWidthOffsetStringAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsLocalTime());
    }

   /**
    * Test getWidthOffsetStringAsString() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsString());
    }

   /**
    * Test getWidthOffsetStringAsBoolean() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsBoolean());
    }

   /**
    * Test getWidthOffsetStringAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsBigInteger());
    }

   /**
    * Test getWidthOffsetStringAsURL() method.
    */
    @Test
    public void subTestGetWidthOffsetStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthOffsetStringAsURL());
    }

   /**
    * Test getWidthOriginalAsInteger() method.
    */
    @Test
    public void subTestGetWidthOriginalAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsInteger());
    }

   /**
    * Test getWidthOriginalAsLong() method.
    */
    @Test
    public void subTestGetWidthOriginalAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsLong());
    }

   /**
    * Test getWidthOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsLocalDateTime());
    }

   /**
    * Test getWidthOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsLocalTime());
    }

   /**
    * Test getWidthOriginalAsString() method.
    */
    @Test
    public void subTestGetWidthOriginalAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsString());
    }

   /**
    * Test getWidthOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetWidthOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsBoolean());
    }

   /**
    * Test getWidthOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsBigInteger());
    }

   /**
    * Test getWidthOriginalAsURL() method.
    */
    @Test
    public void subTestGetWidthOriginalAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalAsURL());
    }

   /**
    * Test getWidthOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsInteger());
    }

   /**
    * Test getWidthOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsLong());
    }

   /**
    * Test getWidthOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsLocalDateTime());
    }

   /**
    * Test getWidthOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsLocalTime());
    }

   /**
    * Test getWidthOriginalStringAsString() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsString() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsString());
    }

   /**
    * Test getWidthOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsBoolean());
    }

   /**
    * Test getWidthOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsBigInteger());
    }

   /**
    * Test getWidthOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetWidthOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataVideo.getWidthOriginalStringAsURL());
    }

}
