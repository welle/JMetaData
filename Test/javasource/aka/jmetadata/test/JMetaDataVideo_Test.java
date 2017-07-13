package aka.jmetadata.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

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
            final File file = new File(ClassLoader.getSystemClassLoader().getResource("Sintel_DivXPlus_6500kbps.mkv").toURI());
            if (jMetaData.open(file)) {
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

    /**
     * Test getActiveFormatDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsInteger());
    }

    /**
     * Test getActiveFormatDescriptionAsLong() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsLong());
    }

    /**
     * Test getActiveFormatDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsLocalDateTime());
    }

    /**
     * Test getActiveFormatDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsLocalTime());
    }

    /**
     * Test getActiveFormatDescriptionAsString() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsString());
    }

    /**
     * Test getActiveFormatDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsBoolean());
    }

    /**
     * Test getActiveFormatDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsBigInteger());
    }

    /**
     * Test getActiveFormatDescriptionAsURL() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionAsURL());
    }

    /**
     * Test getActiveFormatDescriptionStringAsInteger() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsInteger());
    }

    /**
     * Test getActiveFormatDescriptionStringAsLong() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsLong());
    }

    /**
     * Test getActiveFormatDescriptionStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsLocalDateTime());
    }

    /**
     * Test getActiveFormatDescriptionStringAsLocalTime() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsLocalTime());
    }

    /**
     * Test getActiveFormatDescriptionStringAsString() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsString());
    }

    /**
     * Test getActiveFormatDescriptionStringAsBoolean() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsBoolean());
    }

    /**
     * Test getActiveFormatDescriptionStringAsBigInteger() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsBigInteger());
    }

    /**
     * Test getActiveFormatDescriptionStringAsURL() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionStringAsURL());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsInteger() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsInteger());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsLong() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsLong());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsLocalDateTime());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsLocalTime() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsLocalTime());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsString() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsString());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsBoolean() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsBoolean());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsBigInteger() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsBigInteger());
    }

    /**
     * Test getActiveFormatDescriptionMuxingModeAsURL() method.
     */
    @Test
    public void subTestGetActiveFormatDescriptionMuxingModeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getActiveFormatDescriptionMuxingModeAsURL());
    }

    /**
     * Test getAlignmentAsInteger() method.
     */
    @Test
    public void subTestGetAlignmentAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsInteger());
    }

    /**
     * Test getAlignmentAsLong() method.
     */
    @Test
    public void subTestGetAlignmentAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsLong());
    }

    /**
     * Test getAlignmentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlignmentAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsLocalDateTime());
    }

    /**
     * Test getAlignmentAsLocalTime() method.
     */
    @Test
    public void subTestGetAlignmentAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsLocalTime());
    }

    /**
     * Test getAlignmentAsString() method.
     */
    @Test
    public void subTestGetAlignmentAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsString());
    }

    /**
     * Test getAlignmentAsBoolean() method.
     */
    @Test
    public void subTestGetAlignmentAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsBoolean());
    }

    /**
     * Test getAlignmentAsBigInteger() method.
     */
    @Test
    public void subTestGetAlignmentAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsBigInteger());
    }

    /**
     * Test getAlignmentAsURL() method.
     */
    @Test
    public void subTestGetAlignmentAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentAsURL());
    }

    /**
     * Test getAlignmentStringAsInteger() method.
     */
    @Test
    public void subTestGetAlignmentStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsInteger());
    }

    /**
     * Test getAlignmentStringAsLong() method.
     */
    @Test
    public void subTestGetAlignmentStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsLong());
    }

    /**
     * Test getAlignmentStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlignmentStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsLocalDateTime());
    }

    /**
     * Test getAlignmentStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlignmentStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsLocalTime());
    }

    /**
     * Test getAlignmentStringAsString() method.
     */
    @Test
    public void subTestGetAlignmentStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsString());
    }

    /**
     * Test getAlignmentStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlignmentStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsBoolean());
    }

    /**
     * Test getAlignmentStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlignmentStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsBigInteger());
    }

    /**
     * Test getAlignmentStringAsURL() method.
     */
    @Test
    public void subTestGetAlignmentStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlignmentStringAsURL());
    }

    /**
     * Test getAlternateGroupAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsInteger());
    }

    /**
     * Test getAlternateGroupAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsLong());
    }

    /**
     * Test getAlternateGroupAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsLocalTime());
    }

    /**
     * Test getAlternateGroupAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsString());
    }

    /**
     * Test getAlternateGroupAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsBoolean());
    }

    /**
     * Test getAlternateGroupAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsBigInteger());
    }

    /**
     * Test getAlternateGroupAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupAsURL());
    }

    /**
     * Test getAlternateGroupStringAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsInteger());
    }

    /**
     * Test getAlternateGroupStringAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsLong());
    }

    /**
     * Test getAlternateGroupStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsLocalTime());
    }

    /**
     * Test getAlternateGroupStringAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsString());
    }

    /**
     * Test getAlternateGroupStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsBoolean());
    }

    /**
     * Test getAlternateGroupStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsBigInteger());
    }

    /**
     * Test getAlternateGroupStringAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getAlternateGroupStringAsURL());
    }

    /**
     * Test getBitDepthAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsInteger());
    }

    /**
     * Test getBitDepthAsLong() method.
     */
    @Test
    public void subTestGetBitDepthAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsLong());
    }

    /**
     * Test getBitDepthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsLocalDateTime());
    }

    /**
     * Test getBitDepthAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsLocalTime());
    }

    /**
     * Test getBitDepthAsString() method.
     */
    @Test
    public void subTestGetBitDepthAsString() {
        assertEquals("8", JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsString());
    }

    /**
     * Test getBitDepthAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsBoolean());
    }

    /**
     * Test getBitDepthAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsBigInteger());
    }

    /**
     * Test getBitDepthAsURL() method.
     */
    @Test
    public void subTestGetBitDepthAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthAsURL());
    }

    /**
     * Test getBitDepthStringAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthStringAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsInteger());
    }

    /**
     * Test getBitDepthStringAsLong() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsLong());
    }

    /**
     * Test getBitDepthStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsLocalDateTime());
    }

    /**
     * Test getBitDepthStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsLocalTime());
    }

    /**
     * Test getBitDepthStringAsString() method.
     */
    @Test
    public void subTestGetBitDepthStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsString());
    }

    /**
     * Test getBitDepthStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsBoolean());
    }

    /**
     * Test getBitDepthStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsBigInteger());
    }

    /**
     * Test getBitDepthStringAsURL() method.
     */
    @Test
    public void subTestGetBitDepthStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitDepthStringAsURL());
    }

    /**
     * Test getBitRateAsInteger() method.
     */
    @Test
    public void subTestGetBitRateAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsInteger());
    }

    /**
     * Test getBitRateAsLong() method.
     */
    @Test
    public void subTestGetBitRateAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsLong());
    }

    /**
     * Test getBitRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsLocalDateTime());
    }

    /**
     * Test getBitRateAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsLocalTime());
    }

    /**
     * Test getBitRateAsString() method.
     */
    @Test
    public void subTestGetBitRateAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsString());
    }

    /**
     * Test getBitRateAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsBoolean());
    }

    /**
     * Test getBitRateAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsBigInteger());
    }

    /**
     * Test getBitRateAsURL() method.
     */
    @Test
    public void subTestGetBitRateAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateAsURL());
    }

    /**
     * Test getBitRateStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsInteger());
    }

    /**
     * Test getBitRateStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsLong());
    }

    /**
     * Test getBitRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsLocalDateTime());
    }

    /**
     * Test getBitRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsLocalTime());
    }

    /**
     * Test getBitRateStringAsString() method.
     */
    @Test
    public void subTestGetBitRateStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsString());
    }

    /**
     * Test getBitRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsBoolean());
    }

    /**
     * Test getBitRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsBigInteger());
    }

    /**
     * Test getBitRateStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateStringAsURL());
    }

    /**
     * Test getBitRateEncodedAsInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsInteger());
    }

    /**
     * Test getBitRateEncodedAsLong() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsLong());
    }

    /**
     * Test getBitRateEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsLocalDateTime());
    }

    /**
     * Test getBitRateEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsLocalTime());
    }

    /**
     * Test getBitRateEncodedAsString() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsString());
    }

    /**
     * Test getBitRateEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsBoolean());
    }

    /**
     * Test getBitRateEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsBigInteger());
    }

    /**
     * Test getBitRateEncodedAsURL() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedAsURL());
    }

    /**
     * Test getBitRateEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsInteger());
    }

    /**
     * Test getBitRateEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsLong());
    }

    /**
     * Test getBitRateEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsLocalDateTime());
    }

    /**
     * Test getBitRateEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsLocalTime());
    }

    /**
     * Test getBitRateEncodedStringAsString() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsString());
    }

    /**
     * Test getBitRateEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsBoolean());
    }

    /**
     * Test getBitRateEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsBigInteger());
    }

    /**
     * Test getBitRateEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateEncodedStringAsURL());
    }

    /**
     * Test getBitRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsInteger() {
        assertEquals(Integer.valueOf(19999744), JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsInteger());
    }

    /**
     * Test getBitRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLong() {
        assertEquals(Long.valueOf(19999744), JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsLong());
    }

    /**
     * Test getBitRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsLocalDateTime());
    }

    /**
     * Test getBitRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsLocalTime());
    }

    /**
     * Test getBitRateMaximumAsString() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsString());
    }

    /**
     * Test getBitRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsBoolean());
    }

    /**
     * Test getBitRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsBigInteger() {
        assertEquals(BigInteger.valueOf(19999744), JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsBigInteger());
    }

    /**
     * Test getBitRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumAsURL());
    }

    /**
     * Test getBitRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsInteger() {
        assertEquals(Integer.valueOf(200), JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsInteger());
    }

    /**
     * Test getBitRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLong() {
        assertEquals(Long.valueOf(220), JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsLong());
    }

    /**
     * Test getBitRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getBitRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsLocalTime());
    }

    /**
     * Test getBitRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsString() {
        assertEquals("20.0 Mb/s", JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsString());
    }

    /**
     * Test getBitRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsBoolean());
    }

    /**
     * Test getBitRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(200), JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsBigInteger());
    }

    /**
     * Test getBitRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMaximumStringAsURL());
    }

    /**
     * Test getBitRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsInteger());
    }

    /**
     * Test getBitRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsLong());
    }

    /**
     * Test getBitRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsLocalDateTime());
    }

    /**
     * Test getBitRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsLocalTime());
    }

    /**
     * Test getBitRateMinimumAsString() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsString());
    }

    /**
     * Test getBitRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsBoolean());
    }

    /**
     * Test getBitRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsBigInteger());
    }

    /**
     * Test getBitRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumAsURL());
    }

    /**
     * Test getBitRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsInteger());
    }

    /**
     * Test getBitRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsLong());
    }

    /**
     * Test getBitRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getBitRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsLocalTime());
    }

    /**
     * Test getBitRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsString());
    }

    /**
     * Test getBitRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsBoolean());
    }

    /**
     * Test getBitRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsBigInteger());
    }

    /**
     * Test getBitRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateMinimumStringAsURL());
    }

    /**
     * Test getBitRateModeAsInteger() method.
     */
    @Test
    public void subTestGetBitRateModeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsInteger());
    }

    /**
     * Test getBitRateModeAsLong() method.
     */
    @Test
    public void subTestGetBitRateModeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsLong());
    }

    /**
     * Test getBitRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsLocalDateTime());
    }

    /**
     * Test getBitRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateModeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsLocalTime());
    }

    /**
     * Test getBitRateModeAsString() method.
     */
    @Test
    public void subTestGetBitRateModeAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsString());
    }

    /**
     * Test getBitRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateModeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsBoolean());
    }

    /**
     * Test getBitRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateModeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsBigInteger());
    }

    /**
     * Test getBitRateModeAsURL() method.
     */
    @Test
    public void subTestGetBitRateModeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeAsURL());
    }

    /**
     * Test getBitRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsInteger());
    }

    /**
     * Test getBitRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsLong());
    }

    /**
     * Test getBitRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsLocalDateTime());
    }

    /**
     * Test getBitRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsLocalTime());
    }

    /**
     * Test getBitRateModeStringAsString() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsString() {
        assertEquals("Variable", JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsString());
    }

    /**
     * Test getBitRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsBoolean());
    }

    /**
     * Test getBitRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsBigInteger());
    }

    /**
     * Test getBitRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateModeStringAsURL());
    }

    /**
     * Test getBitRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsInteger());
    }

    /**
     * Test getBitRateNominalAsLong() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsLong());
    }

    /**
     * Test getBitRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsLocalDateTime());
    }

    /**
     * Test getBitRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsLocalTime());
    }

    /**
     * Test getBitRateNominalAsString() method.
     */
    @Test
    public void subTestGetBitRateNominalAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsString());
    }

    /**
     * Test getBitRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateNominalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsBoolean());
    }

    /**
     * Test getBitRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsBigInteger());
    }

    /**
     * Test getBitRateNominalAsURL() method.
     */
    @Test
    public void subTestGetBitRateNominalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalAsURL());
    }

    /**
     * Test getBitRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsInteger());
    }

    /**
     * Test getBitRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsLong());
    }

    /**
     * Test getBitRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getBitRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsLocalTime());
    }

    /**
     * Test getBitRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsString());
    }

    /**
     * Test getBitRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsBoolean());
    }

    /**
     * Test getBitRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsBigInteger());
    }

    /**
     * Test getBitRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitRateNominalStringAsURL());
    }

    /**
     * Test getBitsPixelFrameAsInteger() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsInteger());
    }

    /**
     * Test getBitsPixelFrameAsLong() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsLong());
    }

    /**
     * Test getBitsPixelFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsLocalDateTime());
    }

    /**
     * Test getBitsPixelFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsLocalTime());
    }

    /**
     * Test getBitsPixelFrameAsString() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsString());
    }

    /**
     * Test getBitsPixelFrameAsBoolean() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsBoolean());
    }

    /**
     * Test getBitsPixelFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsBigInteger());
    }

    /**
     * Test getBitsPixelFrameAsURL() method.
     */
    @Test
    public void subTestGetBitsPixelFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBitsPixelFrameAsURL());
    }

    /**
     * Test getBufferSizeAsInteger() method.
     */
    @Test
    public void subTestGetBufferSizeAsInteger() {
        assertEquals(Integer.valueOf(24999936), JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsInteger());
    }

    /**
     * Test getBufferSizeAsLong() method.
     */
    @Test
    public void subTestGetBufferSizeAsLong() {
        assertEquals(Long.valueOf(24999936), JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsLong());
    }

    /**
     * Test getBufferSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBufferSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsLocalDateTime());
    }

    /**
     * Test getBufferSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetBufferSizeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsLocalTime());
    }

    /**
     * Test getBufferSizeAsString() method.
     */
    @Test
    public void subTestGetBufferSizeAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsString());
    }

    /**
     * Test getBufferSizeAsBoolean() method.
     */
    @Test
    public void subTestGetBufferSizeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsBoolean());
    }

    /**
     * Test getBufferSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetBufferSizeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsBigInteger());
    }

    /**
     * Test getBufferSizeAsURL() method.
     */
    @Test
    public void subTestGetBufferSizeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getBufferSizeAsURL());
    }

    /**
     * Test getChromaSubsamplingAsInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsInteger());
    }

    /**
     * Test getChromaSubsamplingAsLong() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsLong());
    }

    /**
     * Test getChromaSubsamplingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsLocalDateTime());
    }

    /**
     * Test getChromaSubsamplingAsLocalTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsLocalTime());
    }

    /**
     * Test getChromaSubsamplingAsString() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsString());
    }

    /**
     * Test getChromaSubsamplingAsBoolean() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsBoolean());
    }

    /**
     * Test getChromaSubsamplingAsBigInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsBigInteger() {
        assertEquals(BigInteger.valueOf(420), JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsBigInteger());
    }

    /**
     * Test getChromaSubsamplingAsURL() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingAsURL());
    }

    /**
     * Test getChromaSubsamplingStringAsInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsInteger());
    }

    /**
     * Test getChromaSubsamplingStringAsLong() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsLong());
    }

    /**
     * Test getChromaSubsamplingStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsLocalDateTime());
    }

    /**
     * Test getChromaSubsamplingStringAsLocalTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsLocalTime());
    }

    /**
     * Test getChromaSubsamplingStringAsString() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsString());
    }

    /**
     * Test getChromaSubsamplingStringAsBoolean() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsBoolean());
    }

    /**
     * Test getChromaSubsamplingStringAsBigInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsBigInteger());
    }

    /**
     * Test getChromaSubsamplingStringAsURL() method.
     */
    @Test
    public void subTestGetChromaSubsamplingStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingStringAsURL());
    }

    /**
     * Test getChromaSubsamplingPositionAsInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsInteger());
    }

    /**
     * Test getChromaSubsamplingPositionAsLong() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsLong());
    }

    /**
     * Test getChromaSubsamplingPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsLocalDateTime());
    }

    /**
     * Test getChromaSubsamplingPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsLocalTime());
    }

    /**
     * Test getChromaSubsamplingPositionAsString() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsString());
    }

    /**
     * Test getChromaSubsamplingPositionAsBoolean() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsBoolean());
    }

    /**
     * Test getChromaSubsamplingPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsBigInteger());
    }

    /**
     * Test getChromaSubsamplingPositionAsURL() method.
     */
    @Test
    public void subTestGetChromaSubsamplingPositionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getChromaSubsamplingPositionAsURL());
    }

    /**
     * Test getCodecIDAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsInteger());
    }

    /**
     * Test getCodecIDAsLong() method.
     */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsLong());
    }

    /**
     * Test getCodecIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsLocalDateTime());
    }

    /**
     * Test getCodecIDAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsLocalTime());
    }

    /**
     * Test getCodecIDAsString() method.
     */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsString());
    }

    /**
     * Test getCodecIDAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsBoolean());
    }

    /**
     * Test getCodecIDAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsBigInteger());
    }

    /**
     * Test getCodecIDAsURL() method.
     */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDAsURL());
    }

    /**
     * Test getCodecIDHintAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsInteger());
    }

    /**
     * Test getCodecIDHintAsLong() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsLong());
    }

    /**
     * Test getCodecIDHintAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsLocalDateTime());
    }

    /**
     * Test getCodecIDHintAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsLocalTime());
    }

    /**
     * Test getCodecIDHintAsString() method.
     */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsString());
    }

    /**
     * Test getCodecIDHintAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsBoolean());
    }

    /**
     * Test getCodecIDHintAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsBigInteger());
    }

    /**
     * Test getCodecIDHintAsURL() method.
     */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDHintAsURL());
    }

    /**
     * Test getCodecIDInfoAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsInteger());
    }

    /**
     * Test getCodecIDInfoAsLong() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsLong());
    }

    /**
     * Test getCodecIDInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsLocalDateTime());
    }

    /**
     * Test getCodecIDInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsLocalTime());
    }

    /**
     * Test getCodecIDInfoAsString() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsString());
    }

    /**
     * Test getCodecIDInfoAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsBoolean());
    }

    /**
     * Test getCodecIDInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsBigInteger());
    }

    /**
     * Test getCodecIDInfoAsURL() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDInfoAsURL());
    }

    /**
     * Test getCodecIDStringAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsInteger());
    }

    /**
     * Test getCodecIDStringAsLong() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsLong());
    }

    /**
     * Test getCodecIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsLocalDateTime());
    }

    /**
     * Test getCodecIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsLocalTime());
    }

    /**
     * Test getCodecIDStringAsString() method.
     */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsString());
    }

    /**
     * Test getCodecIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsBoolean());
    }

    /**
     * Test getCodecIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsBigInteger());
    }

    /**
     * Test getCodecIDStringAsURL() method.
     */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDStringAsURL());
    }

    /**
     * Test getCodecIDUrlAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsInteger());
    }

    /**
     * Test getCodecIDUrlAsLong() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsLong());
    }

    /**
     * Test getCodecIDUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsLocalDateTime());
    }

    /**
     * Test getCodecIDUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsLocalTime());
    }

    /**
     * Test getCodecIDUrlAsString() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsString());
    }

    /**
     * Test getCodecIDUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsBoolean());
    }

    /**
     * Test getCodecIDUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsBigInteger());
    }

    /**
     * Test getCodecIDUrlAsURL() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDUrlAsURL());
    }

    /**
     * Test getCodecIDDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsInteger());
    }

    /**
     * Test getCodecIDDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsLong());
    }

    /**
     * Test getCodecIDDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsLocalDateTime());
    }

    /**
     * Test getCodecIDDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsLocalTime());
    }

    /**
     * Test getCodecIDDescriptionAsString() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsString());
    }

    /**
     * Test getCodecIDDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsBoolean());
    }

    /**
     * Test getCodecIDDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsBigInteger());
    }

    /**
     * Test getCodecIDDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCodecIDDescriptionAsURL());
    }

    /**
     * Test getColorSpaceAsInteger() method.
     */
    @Test
    public void subTestGetColorSpaceAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsInteger());
    }

    /**
     * Test getColorSpaceAsLong() method.
     */
    @Test
    public void subTestGetColorSpaceAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsLong());
    }

    /**
     * Test getColorSpaceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetColorSpaceAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsLocalDateTime());
    }

    /**
     * Test getColorSpaceAsLocalTime() method.
     */
    @Test
    public void subTestGetColorSpaceAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsLocalTime());
    }

    /**
     * Test getColorSpaceAsString() method.
     */
    @Test
    public void subTestGetColorSpaceAsString() {
        assertEquals("YUV", JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsString());
    }

    /**
     * Test getColorSpaceAsBoolean() method.
     */
    @Test
    public void subTestGetColorSpaceAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsBoolean());
    }

    /**
     * Test getColorSpaceAsBigInteger() method.
     */
    @Test
    public void subTestGetColorSpaceAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsBigInteger());
    }

    /**
     * Test getColorSpaceAsURL() method.
     */
    @Test
    public void subTestGetColorSpaceAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getColorSpaceAsURL());
    }

    /**
     * Test getcolourdescriptionpresentAsInteger() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsInteger());
    }

    /**
     * Test getcolourdescriptionpresentAsLong() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsLong());
    }

    /**
     * Test getcolourdescriptionpresentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsLocalDateTime());
    }

    /**
     * Test getcolourdescriptionpresentAsLocalTime() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsLocalTime());
    }

    /**
     * Test getcolourdescriptionpresentAsString() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsString());
    }

    /**
     * Test getcolourdescriptionpresentAsBoolean() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsBoolean());
    }

    /**
     * Test getcolourdescriptionpresentAsBigInteger() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsBigInteger());
    }

    /**
     * Test getcolourdescriptionpresentAsURL() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentAsURL());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsInteger() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsInteger());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsLong() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsLong());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsLocalDateTime());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsLocalTime());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsString() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsString());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsBoolean());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsBigInteger());
    }

    /**
     * Test getcolourdescriptionpresentOriginalAsURL() method.
     */
    @Test
    public void subTestGetcolourdescriptionpresentOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourdescriptionpresentOriginalAsURL());
    }

    /**
     * Test getcolourprimariesAsInteger() method.
     */
    @Test
    public void subTestGetcolourprimariesAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsInteger());
    }

    /**
     * Test getcolourprimariesAsLong() method.
     */
    @Test
    public void subTestGetcolourprimariesAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsLong());
    }

    /**
     * Test getcolourprimariesAsLocalDateTime() method.
     */
    @Test
    public void subTestGetcolourprimariesAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsLocalDateTime());
    }

    /**
     * Test getcolourprimariesAsLocalTime() method.
     */
    @Test
    public void subTestGetcolourprimariesAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsLocalTime());
    }

    /**
     * Test getcolourprimariesAsString() method.
     */
    @Test
    public void subTestGetcolourprimariesAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsString());
    }

    /**
     * Test getcolourprimariesAsBoolean() method.
     */
    @Test
    public void subTestGetcolourprimariesAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsBoolean());
    }

    /**
     * Test getcolourprimariesAsBigInteger() method.
     */
    @Test
    public void subTestGetcolourprimariesAsBigInteger() {
        assertEquals(BigInteger.valueOf(709), JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsBigInteger());
    }

    /**
     * Test getcolourprimariesAsURL() method.
     */
    @Test
    public void subTestGetcolourprimariesAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesAsURL());
    }

    /**
     * Test getcolourprimariesOriginalAsInteger() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsInteger());
    }

    /**
     * Test getcolourprimariesOriginalAsLong() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsLong());
    }

    /**
     * Test getcolourprimariesOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsLocalDateTime());
    }

    /**
     * Test getcolourprimariesOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsLocalTime());
    }

    /**
     * Test getcolourprimariesOriginalAsString() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsString());
    }

    /**
     * Test getcolourprimariesOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsBoolean());
    }

    /**
     * Test getcolourprimariesOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsBigInteger());
    }

    /**
     * Test getcolourprimariesOriginalAsURL() method.
     */
    @Test
    public void subTestGetcolourprimariesOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourprimariesOriginalAsURL());
    }

    /**
     * Test getcolourrangeAsInteger() method.
     */
    @Test
    public void subTestGetcolourrangeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsInteger());
    }

    /**
     * Test getcolourrangeAsLong() method.
     */
    @Test
    public void subTestGetcolourrangeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsLong());
    }

    /**
     * Test getcolourrangeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetcolourrangeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsLocalDateTime());
    }

    /**
     * Test getcolourrangeAsLocalTime() method.
     */
    @Test
    public void subTestGetcolourrangeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsLocalTime());
    }

    /**
     * Test getcolourrangeAsString() method.
     */
    @Test
    public void subTestGetcolourrangeAsString() {
        assertEquals("Limited", JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsString());
    }

    /**
     * Test getcolourrangeAsBoolean() method.
     */
    @Test
    public void subTestGetcolourrangeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsBoolean());
    }

    /**
     * Test getcolourrangeAsBigInteger() method.
     */
    @Test
    public void subTestGetcolourrangeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsBigInteger());
    }

    /**
     * Test getcolourrangeAsURL() method.
     */
    @Test
    public void subTestGetcolourrangeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getcolourrangeAsURL());
    }

    /**
     * Test getCompressionModeAsInteger() method.
     */
    @Test
    public void subTestGetCompressionModeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsInteger());
    }

    /**
     * Test getCompressionModeAsLong() method.
     */
    @Test
    public void subTestGetCompressionModeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsLong());
    }

    /**
     * Test getCompressionModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionModeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsLocalDateTime());
    }

    /**
     * Test getCompressionModeAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionModeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsLocalTime());
    }

    /**
     * Test getCompressionModeAsString() method.
     */
    @Test
    public void subTestGetCompressionModeAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsString());
    }

    /**
     * Test getCompressionModeAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionModeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsBoolean());
    }

    /**
     * Test getCompressionModeAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionModeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsBigInteger());
    }

    /**
     * Test getCompressionModeAsURL() method.
     */
    @Test
    public void subTestGetCompressionModeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeAsURL());
    }

    /**
     * Test getCompressionModeStringAsInteger() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsInteger());
    }

    /**
     * Test getCompressionModeStringAsLong() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsLong());
    }

    /**
     * Test getCompressionModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsLocalDateTime());
    }

    /**
     * Test getCompressionModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsLocalTime());
    }

    /**
     * Test getCompressionModeStringAsString() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsString());
    }

    /**
     * Test getCompressionModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsBoolean());
    }

    /**
     * Test getCompressionModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsBigInteger());
    }

    /**
     * Test getCompressionModeStringAsURL() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionModeStringAsURL());
    }

    /**
     * Test getCompressionRatioAsInteger() method.
     */
    @Test
    public void subTestGetCompressionRatioAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsInteger());
    }

    /**
     * Test getCompressionRatioAsLong() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsLong());
    }

    /**
     * Test getCompressionRatioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsLocalDateTime());
    }

    /**
     * Test getCompressionRatioAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsLocalTime());
    }

    /**
     * Test getCompressionRatioAsString() method.
     */
    @Test
    public void subTestGetCompressionRatioAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsString());
    }

    /**
     * Test getCompressionRatioAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionRatioAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsBoolean());
    }

    /**
     * Test getCompressionRatioAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionRatioAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsBigInteger());
    }

    /**
     * Test getCompressionRatioAsURL() method.
     */
    @Test
    public void subTestGetCompressionRatioAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCompressionRatioAsURL());
    }

    /**
     * Test getCountAsInteger() method.
     */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsInteger());
    }

    /**
     * Test getCountAsLong() method.
     */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsLong());
    }

    /**
     * Test getCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsLocalDateTime());
    }

    /**
     * Test getCountAsLocalTime() method.
     */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsLocalTime());
    }

    /**
     * Test getCountAsString() method.
     */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsString());
    }

    /**
     * Test getCountAsBoolean() method.
     */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsBoolean());
    }

    /**
     * Test getCountAsBigInteger() method.
     */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsBigInteger());
    }

    /**
     * Test getCountAsURL() method.
     */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getCountAsURL());
    }

    /**
     * Test getDefaultAsInteger() method.
     */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsInteger());
    }

    /**
     * Test getDefaultAsLong() method.
     */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsLong());
    }

    /**
     * Test getDefaultAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsLocalDateTime());
    }

    /**
     * Test getDefaultAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsLocalTime());
    }

    /**
     * Test getDefaultAsString() method.
     */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsString());
    }

    /**
     * Test getDefaultAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsBoolean());
    }

    /**
     * Test getDefaultAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsBigInteger());
    }

    /**
     * Test getDefaultAsURL() method.
     */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultAsURL());
    }

    /**
     * Test getDefaultStringAsInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsInteger());
    }

    /**
     * Test getDefaultStringAsLong() method.
     */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsLong());
    }

    /**
     * Test getDefaultStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsLocalDateTime());
    }

    /**
     * Test getDefaultStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsLocalTime());
    }

    /**
     * Test getDefaultStringAsString() method.
     */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsString());
    }

    /**
     * Test getDefaultStringAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsBoolean());
    }

    /**
     * Test getDefaultStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsBigInteger());
    }

    /**
     * Test getDefaultStringAsURL() method.
     */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDefaultStringAsURL());
    }

    /**
     * Test getDelayAsInteger() method.
     */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsInteger());
    }

    /**
     * Test getDelayAsLong() method.
     */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(Long.valueOf(0), JMetaDataVideo_Test.jMetaDataVideo.getDelayAsLong());
    }

    /**
     * Test getDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsLocalDateTime());
    }

    /**
     * Test getDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsLocalTime());
    }

    /**
     * Test getDelayAsString() method.
     */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsString());
    }

    /**
     * Test getDelayAsBoolean() method.
     */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsBoolean());
    }

    /**
     * Test getDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsBigInteger());
    }

    /**
     * Test getDelayAsURL() method.
     */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayAsURL());
    }

    /**
     * Test getDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsInteger());
    }

    /**
     * Test getDelayStringAsLong() method.
     */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsLong());
    }

    /**
     * Test getDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsLocalDateTime());
    }

    /**
     * Test getDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsLocalTime());
    }

    /**
     * Test getDelayStringAsString() method.
     */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsString());
    }

    /**
     * Test getDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsBoolean());
    }

    /**
     * Test getDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsBigInteger());
    }

    /**
     * Test getDelayStringAsURL() method.
     */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayStringAsURL());
    }

    /**
     * Test getDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsInteger());
    }

    /**
     * Test getDelayString1AsLong() method.
     */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsLong());
    }

    /**
     * Test getDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsLocalDateTime());
    }

    /**
     * Test getDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsLocalTime());
    }

    /**
     * Test getDelayString1AsString() method.
     */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsString());
    }

    /**
     * Test getDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsBoolean());
    }

    /**
     * Test getDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsBigInteger());
    }

    /**
     * Test getDelayString1AsURL() method.
     */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString1AsURL());
    }

    /**
     * Test getDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsInteger());
    }

    /**
     * Test getDelayString2AsLong() method.
     */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsLong());
    }

    /**
     * Test getDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsLocalDateTime());
    }

    /**
     * Test getDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsLocalTime());
    }

    /**
     * Test getDelayString2AsString() method.
     */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsString());
    }

    /**
     * Test getDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsBoolean());
    }

    /**
     * Test getDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsBigInteger());
    }

    /**
     * Test getDelayString2AsURL() method.
     */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString2AsURL());
    }

    /**
     * Test getDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(Integer.valueOf(0), JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsInteger());
    }

    /**
     * Test getDelayString3AsLong() method.
     */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsLong());
    }

    /**
     * Test getDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsLocalDateTime());
    }

    /**
     * Test getDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(LocalTime.of(0, 0), JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsLocalTime());
    }

    /**
     * Test getDelayString3AsString() method.
     */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsString());
    }

    /**
     * Test getDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsBoolean());
    }

    /**
     * Test getDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsBigInteger());
    }

    /**
     * Test getDelayString3AsURL() method.
     */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString3AsURL());
    }

    /**
     * Test getDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsInteger());
    }

    /**
     * Test getDelayString4AsLong() method.
     */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsLong());
    }

    /**
     * Test getDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsLocalDateTime());
    }

    /**
     * Test getDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsLocalTime());
    }

    /**
     * Test getDelayString4AsString() method.
     */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsString());
    }

    /**
     * Test getDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsBoolean());
    }

    /**
     * Test getDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsBigInteger());
    }

    /**
     * Test getDelayString4AsURL() method.
     */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString4AsURL());
    }

    /**
     * Test getDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsInteger());
    }

    /**
     * Test getDelayString5AsLong() method.
     */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsLong());
    }

    /**
     * Test getDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsLocalDateTime());
    }

    /**
     * Test getDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsLocalTime());
    }

    /**
     * Test getDelayString5AsString() method.
     */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsString());
    }

    /**
     * Test getDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsBoolean());
    }

    /**
     * Test getDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsBigInteger());
    }

    /**
     * Test getDelayString5AsURL() method.
     */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayString5AsURL());
    }

    /**
     * Test getDelayDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsInteger());
    }

    /**
     * Test getDelayDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsLong());
    }

    /**
     * Test getDelayDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsLocalTime());
    }

    /**
     * Test getDelayDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsString());
    }

    /**
     * Test getDelayDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsBoolean());
    }

    /**
     * Test getDelayDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsBigInteger());
    }

    /**
     * Test getDelayDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayDropFrameAsURL());
    }

    /**
     * Test getDelayOriginalAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsInteger());
    }

    /**
     * Test getDelayOriginalAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsLong());
    }

    /**
     * Test getDelayOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsLocalTime());
    }

    /**
     * Test getDelayOriginalAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsString());
    }

    /**
     * Test getDelayOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsBoolean());
    }

    /**
     * Test getDelayOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsBigInteger());
    }

    /**
     * Test getDelayOriginalAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalAsURL());
    }

    /**
     * Test getDelayOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsInteger());
    }

    /**
     * Test getDelayOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsLong());
    }

    /**
     * Test getDelayOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsLocalTime());
    }

    /**
     * Test getDelayOriginalStringAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsString());
    }

    /**
     * Test getDelayOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsBoolean());
    }

    /**
     * Test getDelayOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsBigInteger());
    }

    /**
     * Test getDelayOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalStringAsURL());
    }

    /**
     * Test getDelayOriginalString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsInteger());
    }

    /**
     * Test getDelayOriginalString1AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsLong());
    }

    /**
     * Test getDelayOriginalString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsLocalTime());
    }

    /**
     * Test getDelayOriginalString1AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsString());
    }

    /**
     * Test getDelayOriginalString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsBoolean());
    }

    /**
     * Test getDelayOriginalString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsBigInteger());
    }

    /**
     * Test getDelayOriginalString1AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString1AsURL());
    }

    /**
     * Test getDelayOriginalString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsInteger());
    }

    /**
     * Test getDelayOriginalString2AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsLong());
    }

    /**
     * Test getDelayOriginalString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsLocalTime());
    }

    /**
     * Test getDelayOriginalString2AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsString());
    }

    /**
     * Test getDelayOriginalString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsBoolean());
    }

    /**
     * Test getDelayOriginalString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsBigInteger());
    }

    /**
     * Test getDelayOriginalString2AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString2AsURL());
    }

    /**
     * Test getDelayOriginalString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsInteger());
    }

    /**
     * Test getDelayOriginalString3AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsLong());
    }

    /**
     * Test getDelayOriginalString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsLocalTime());
    }

    /**
     * Test getDelayOriginalString3AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsString());
    }

    /**
     * Test getDelayOriginalString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsBoolean());
    }

    /**
     * Test getDelayOriginalString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsBigInteger());
    }

    /**
     * Test getDelayOriginalString3AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString3AsURL());
    }

    /**
     * Test getDelayOriginalString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsInteger());
    }

    /**
     * Test getDelayOriginalString4AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsLong());
    }

    /**
     * Test getDelayOriginalString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsLocalTime());
    }

    /**
     * Test getDelayOriginalString4AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsString());
    }

    /**
     * Test getDelayOriginalString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsBoolean());
    }

    /**
     * Test getDelayOriginalString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsBigInteger());
    }

    /**
     * Test getDelayOriginalString4AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString4AsURL());
    }

    /**
     * Test getDelayOriginalString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsInteger());
    }

    /**
     * Test getDelayOriginalString5AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsLong());
    }

    /**
     * Test getDelayOriginalString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsLocalTime());
    }

    /**
     * Test getDelayOriginalString5AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsString());
    }

    /**
     * Test getDelayOriginalString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsBoolean());
    }

    /**
     * Test getDelayOriginalString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsBigInteger());
    }

    /**
     * Test getDelayOriginalString5AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalString5AsURL());
    }

    /**
     * Test getDelayOriginalDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsInteger());
    }

    /**
     * Test getDelayOriginalDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsLong());
    }

    /**
     * Test getDelayOriginalDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsLocalTime());
    }

    /**
     * Test getDelayOriginalDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsString());
    }

    /**
     * Test getDelayOriginalDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsBoolean());
    }

    /**
     * Test getDelayOriginalDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsBigInteger());
    }

    /**
     * Test getDelayOriginalDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalDropFrameAsURL());
    }

    /**
     * Test getDelayOriginalSettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsInteger());
    }

    /**
     * Test getDelayOriginalSettingsAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsLong());
    }

    /**
     * Test getDelayOriginalSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsLocalTime());
    }

    /**
     * Test getDelayOriginalSettingsAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsString());
    }

    /**
     * Test getDelayOriginalSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsBoolean());
    }

    /**
     * Test getDelayOriginalSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsBigInteger());
    }

    /**
     * Test getDelayOriginalSettingsAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSettingsAsURL());
    }

    /**
     * Test getDelayOriginalSourceAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsInteger());
    }

    /**
     * Test getDelayOriginalSourceAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsLong());
    }

    /**
     * Test getDelayOriginalSourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalSourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsLocalTime());
    }

    /**
     * Test getDelayOriginalSourceAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsString());
    }

    /**
     * Test getDelayOriginalSourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsBoolean());
    }

    /**
     * Test getDelayOriginalSourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsBigInteger());
    }

    /**
     * Test getDelayOriginalSourceAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelayOriginalSourceAsURL());
    }

    /**
     * Test getDelaySettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsInteger());
    }

    /**
     * Test getDelaySettingsAsLong() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsLong());
    }

    /**
     * Test getDelaySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsLocalDateTime());
    }

    /**
     * Test getDelaySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsLocalTime());
    }

    /**
     * Test getDelaySettingsAsString() method.
     */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsString());
    }

    /**
     * Test getDelaySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsBoolean());
    }

    /**
     * Test getDelaySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsBigInteger());
    }

    /**
     * Test getDelaySettingsAsURL() method.
     */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySettingsAsURL());
    }

    /**
     * Test getDelaySourceAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsInteger());
    }

    /**
     * Test getDelaySourceAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsLong());
    }

    /**
     * Test getDelaySourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsLocalDateTime());
    }

    /**
     * Test getDelaySourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsLocalTime());
    }

    /**
     * Test getDelaySourceAsString() method.
     */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsString());
    }

    /**
     * Test getDelaySourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsBoolean());
    }

    /**
     * Test getDelaySourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsBigInteger());
    }

    /**
     * Test getDelaySourceAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceAsURL());
    }

    /**
     * Test getDelaySourceStringAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsInteger());
    }

    /**
     * Test getDelaySourceStringAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsLong());
    }

    /**
     * Test getDelaySourceStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsLocalDateTime());
    }

    /**
     * Test getDelaySourceStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsLocalTime());
    }

    /**
     * Test getDelaySourceStringAsString() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsString());
    }

    /**
     * Test getDelaySourceStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsBoolean());
    }

    /**
     * Test getDelaySourceStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsBigInteger());
    }

    /**
     * Test getDelaySourceStringAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDelaySourceStringAsURL());
    }

    /**
     * Test getDisabledAsInteger() method.
     */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsInteger());
    }

    /**
     * Test getDisabledAsLong() method.
     */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsLong());
    }

    /**
     * Test getDisabledAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsLocalDateTime());
    }

    /**
     * Test getDisabledAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsLocalTime());
    }

    /**
     * Test getDisabledAsString() method.
     */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsString());
    }

    /**
     * Test getDisabledAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsBoolean());
    }

    /**
     * Test getDisabledAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsBigInteger());
    }

    /**
     * Test getDisabledAsURL() method.
     */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledAsURL());
    }

    /**
     * Test getDisabledStringAsInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsInteger());
    }

    /**
     * Test getDisabledStringAsLong() method.
     */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsLong());
    }

    /**
     * Test getDisabledStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsLocalDateTime());
    }

    /**
     * Test getDisabledStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsLocalTime());
    }

    /**
     * Test getDisabledStringAsString() method.
     */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsString());
    }

    /**
     * Test getDisabledStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsBoolean());
    }

    /**
     * Test getDisabledStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsBigInteger());
    }

    /**
     * Test getDisabledStringAsURL() method.
     */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisabledStringAsURL());
    }

    /**
     * Test getDisplayAspectRatioAsInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsInteger() {
        assertEquals(Integer.valueOf(2202), JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsInteger());
    }

    /**
     * Test getDisplayAspectRatioAsLong() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsLong());
    }

    /**
     * Test getDisplayAspectRatioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsLocalDateTime());
    }

    /**
     * Test getDisplayAspectRatioAsLocalTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsLocalTime());
    }

    /**
     * Test getDisplayAspectRatioAsString() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsString());
    }

    /**
     * Test getDisplayAspectRatioAsBoolean() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsBoolean());
    }

    /**
     * Test getDisplayAspectRatioAsBigInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsBigInteger());
    }

    /**
     * Test getDisplayAspectRatioAsURL() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioAsURL());
    }

    /**
     * Test getDisplayAspectRatioStringAsInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsInteger() {
        assertEquals(Integer.valueOf(221), JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsInteger());
    }

    /**
     * Test getDisplayAspectRatioStringAsLong() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsLong());
    }

    /**
     * Test getDisplayAspectRatioStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsLocalDateTime());
    }

    /**
     * Test getDisplayAspectRatioStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsLocalTime());
    }

    /**
     * Test getDisplayAspectRatioStringAsString() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsString() {
        assertEquals("2.2:1", JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsString());
    }

    /**
     * Test getDisplayAspectRatioStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsBoolean());
    }

    /**
     * Test getDisplayAspectRatioStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsBigInteger());
    }

    /**
     * Test getDisplayAspectRatioStringAsURL() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioStringAsURL());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsInteger());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsLong() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsLong());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsLocalDateTime());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsLocalTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsLocalTime());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsString() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsString());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsBoolean() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsBoolean());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsBigInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsBigInteger());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureAsURL() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureAsURL());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsInteger());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsLong() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsLong());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsLocalDateTime());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsLocalTime());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsString() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsString());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsBoolean());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsBigInteger());
    }

    /**
     * Test getDisplayAspectRatioCleanApertureStringAsURL() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioCleanApertureStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioCleanApertureStringAsURL());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsInteger());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsLong() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsLong());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsLocalDateTime());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsLocalTime());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsString() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsString());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsBoolean());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsBigInteger());
    }

    /**
     * Test getDisplayAspectRatioOriginalAsURL() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalAsURL());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsInteger());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsLong());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsLocalDateTime());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsLocalTime());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsString() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsString());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsBoolean());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsBigInteger());
    }

    /**
     * Test getDisplayAspectRatioOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetDisplayAspectRatioOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDisplayAspectRatioOriginalStringAsURL());
    }

    /**
     * Test getDurationAsInteger() method.
     */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationAsInteger());
    }

    /**
     * Test getDurationAsLong() method.
     */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(Long.valueOf(898167), JMetaDataVideo_Test.jMetaDataVideo.getDurationAsLong());
    }

    /**
     * Test getDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationAsLocalDateTime());
    }

    /**
     * Test getDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationAsLocalTime());
    }

    /**
     * Test getDurationAsString() method.
     */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationAsString());
    }

    /**
     * Test getDurationAsBoolean() method.
     */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationAsBoolean());
    }

    /**
     * Test getDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(BigInteger.valueOf(898167), JMetaDataVideo_Test.jMetaDataVideo.getDurationAsBigInteger());
    }

    /**
     * Test getDurationAsURL() method.
     */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationAsURL());
    }

    /**
     * Test getDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsInteger());
    }

    /**
     * Test getDurationStringAsLong() method.
     */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsLong());
    }

    /**
     * Test getDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsLocalDateTime());
    }

    /**
     * Test getDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsLocalTime());
    }

    /**
     * Test getDurationStringAsString() method.
     */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsString());
    }

    /**
     * Test getDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsBoolean());
    }

    /**
     * Test getDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsBigInteger());
    }

    /**
     * Test getDurationStringAsURL() method.
     */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationStringAsURL());
    }

    /**
     * Test getDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsInteger());
    }

    /**
     * Test getDurationString1AsLong() method.
     */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsLong());
    }

    /**
     * Test getDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsLocalDateTime());
    }

    /**
     * Test getDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsLocalTime());
    }

    /**
     * Test getDurationString1AsString() method.
     */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsString());
    }

    /**
     * Test getDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsBoolean());
    }

    /**
     * Test getDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsBigInteger());
    }

    /**
     * Test getDurationString1AsURL() method.
     */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString1AsURL());
    }

    /**
     * Test getDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(Integer.valueOf(1458), JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsInteger());
    }

    /**
     * Test getDurationString2AsLong() method.
     */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsLong());
    }

    /**
     * Test getDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsLocalDateTime());
    }

    /**
     * Test getDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsLocalTime());
    }

    /**
     * Test getDurationString2AsString() method.
     */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals("14 min 58 s", JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsString());
    }

    /**
     * Test getDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsBoolean());
    }

    /**
     * Test getDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsBigInteger());
    }

    /**
     * Test getDurationString2AsURL() method.
     */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString2AsURL());
    }

    /**
     * Test getDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(Integer.valueOf(1458167), JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsInteger());
    }

    /**
     * Test getDurationString3AsLong() method.
     */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(Long.valueOf(1458167), JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsLong());
    }

    /**
     * Test getDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsLocalDateTime());
    }

    /**
     * Test getDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsLocalTime());
    }

    /**
     * Test getDurationString3AsString() method.
     */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsString());
    }

    /**
     * Test getDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsBoolean());
    }

    /**
     * Test getDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsBigInteger());
    }

    /**
     * Test getDurationString3AsURL() method.
     */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString3AsURL());
    }

    /**
     * Test getDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(Integer.valueOf(145804), JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsInteger());
    }

    /**
     * Test getDurationString4AsLong() method.
     */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(Long.valueOf(145804), JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsLong());
    }

    /**
     * Test getDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsLocalDateTime());
    }

    /**
     * Test getDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsLocalTime());
    }

    /**
     * Test getDurationString4AsString() method.
     */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals("00:14:58.04", JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsString());
    }

    /**
     * Test getDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsBoolean());
    }

    /**
     * Test getDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsBigInteger());
    }

    /**
     * Test getDurationString4AsURL() method.
     */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString4AsURL());
    }

    /**
     * Test getDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsInteger());
    }

    /**
     * Test getDurationString5AsLong() method.
     */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsLong());
    }

    /**
     * Test getDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsLocalDateTime());
    }

    /**
     * Test getDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsLocalTime());
    }

    /**
     * Test getDurationString5AsString() method.
     */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsString());
    }

    /**
     * Test getDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsBoolean());
    }

    /**
     * Test getDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsBigInteger());
    }

    /**
     * Test getDurationString5AsURL() method.
     */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationString5AsURL());
    }

    /**
     * Test getDurationFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsInteger());
    }

    /**
     * Test getDurationFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsLong());
    }

    /**
     * Test getDurationFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsLocalTime());
    }

    /**
     * Test getDurationFirstFrameAsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsString());
    }

    /**
     * Test getDurationFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsBoolean());
    }

    /**
     * Test getDurationFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsBigInteger());
    }

    /**
     * Test getDurationFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameAsURL());
    }

    /**
     * Test getDurationFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsInteger());
    }

    /**
     * Test getDurationFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsLong());
    }

    /**
     * Test getDurationFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsLocalTime());
    }

    /**
     * Test getDurationFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsString());
    }

    /**
     * Test getDurationFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsBoolean());
    }

    /**
     * Test getDurationFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsBigInteger());
    }

    /**
     * Test getDurationFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameStringAsURL());
    }

    /**
     * Test getDurationFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsInteger());
    }

    /**
     * Test getDurationFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsLong());
    }

    /**
     * Test getDurationFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsString());
    }

    /**
     * Test getDurationFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString1AsURL());
    }

    /**
     * Test getDurationFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsInteger());
    }

    /**
     * Test getDurationFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsLong());
    }

    /**
     * Test getDurationFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsString());
    }

    /**
     * Test getDurationFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString2AsURL());
    }

    /**
     * Test getDurationFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsInteger());
    }

    /**
     * Test getDurationFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsLong());
    }

    /**
     * Test getDurationFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsString());
    }

    /**
     * Test getDurationFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString3AsURL());
    }

    /**
     * Test getDurationFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsInteger());
    }

    /**
     * Test getDurationFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsLong());
    }

    /**
     * Test getDurationFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsString());
    }

    /**
     * Test getDurationFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString4AsURL());
    }

    /**
     * Test getDurationFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsInteger());
    }

    /**
     * Test getDurationFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsLong());
    }

    /**
     * Test getDurationFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsString());
    }

    /**
     * Test getDurationFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationFirstFrameString5AsURL());
    }

    /**
     * Test getDurationLastFrameAsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsInteger());
    }

    /**
     * Test getDurationLastFrameAsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsLong());
    }

    /**
     * Test getDurationLastFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsLocalTime());
    }

    /**
     * Test getDurationLastFrameAsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsString());
    }

    /**
     * Test getDurationLastFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsBoolean());
    }

    /**
     * Test getDurationLastFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsBigInteger());
    }

    /**
     * Test getDurationLastFrameAsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameAsURL());
    }

    /**
     * Test getDurationLastFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsInteger());
    }

    /**
     * Test getDurationLastFrameStringAsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsLong());
    }

    /**
     * Test getDurationLastFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsLocalTime());
    }

    /**
     * Test getDurationLastFrameStringAsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsString());
    }

    /**
     * Test getDurationLastFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsBoolean());
    }

    /**
     * Test getDurationLastFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsBigInteger());
    }

    /**
     * Test getDurationLastFrameStringAsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameStringAsURL());
    }

    /**
     * Test getDurationLastFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsInteger());
    }

    /**
     * Test getDurationLastFrameString1AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsLong());
    }

    /**
     * Test getDurationLastFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString1AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsString());
    }

    /**
     * Test getDurationLastFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsBoolean());
    }

    /**
     * Test getDurationLastFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString1AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString1AsURL());
    }

    /**
     * Test getDurationLastFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsInteger());
    }

    /**
     * Test getDurationLastFrameString2AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsLong());
    }

    /**
     * Test getDurationLastFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString2AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsString());
    }

    /**
     * Test getDurationLastFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsBoolean());
    }

    /**
     * Test getDurationLastFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString2AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString2AsURL());
    }

    /**
     * Test getDurationLastFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsInteger());
    }

    /**
     * Test getDurationLastFrameString3AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsLong());
    }

    /**
     * Test getDurationLastFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString3AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsString());
    }

    /**
     * Test getDurationLastFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsBoolean());
    }

    /**
     * Test getDurationLastFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString3AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString3AsURL());
    }

    /**
     * Test getDurationLastFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsInteger());
    }

    /**
     * Test getDurationLastFrameString4AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsLong());
    }

    /**
     * Test getDurationLastFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString4AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsString());
    }

    /**
     * Test getDurationLastFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsBoolean());
    }

    /**
     * Test getDurationLastFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString4AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString4AsURL());
    }

    /**
     * Test getDurationLastFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsInteger());
    }

    /**
     * Test getDurationLastFrameString5AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsLong());
    }

    /**
     * Test getDurationLastFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString5AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsString());
    }

    /**
     * Test getDurationLastFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsBoolean());
    }

    /**
     * Test getDurationLastFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString5AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getDurationLastFrameString5AsURL());
    }

    /**
     * Test getEncodedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsInteger());
    }

    /**
     * Test getEncodedApplicationAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsLong());
    }

    /**
     * Test getEncodedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsLocalTime());
    }

    /**
     * Test getEncodedApplicationAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsString());
    }

    /**
     * Test getEncodedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsBoolean());
    }

    /**
     * Test getEncodedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsBigInteger());
    }

    /**
     * Test getEncodedApplicationAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationAsURL());
    }

    /**
     * Test getEncodedApplicationStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsInteger());
    }

    /**
     * Test getEncodedApplicationStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsLong());
    }

    /**
     * Test getEncodedApplicationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsLocalTime());
    }

    /**
     * Test getEncodedApplicationStringAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsString());
    }

    /**
     * Test getEncodedApplicationStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsBoolean());
    }

    /**
     * Test getEncodedApplicationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsBigInteger());
    }

    /**
     * Test getEncodedApplicationStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationStringAsURL());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsLong());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsString());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationCompanyNameAsURL());
    }

    /**
     * Test getEncodedApplicationNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsInteger());
    }

    /**
     * Test getEncodedApplicationNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsLong());
    }

    /**
     * Test getEncodedApplicationNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsString());
    }

    /**
     * Test getEncodedApplicationNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationNameAsURL());
    }

    /**
     * Test getEncodedApplicationUrlAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsLong());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsLocalTime());
    }

    /**
     * Test getEncodedApplicationUrlAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsString());
    }

    /**
     * Test getEncodedApplicationUrlAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsBoolean());
    }

    /**
     * Test getEncodedApplicationUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsBigInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationUrlAsURL());
    }

    /**
     * Test getEncodedApplicationVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsLong());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsLocalTime());
    }

    /**
     * Test getEncodedApplicationVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsString());
    }

    /**
     * Test getEncodedApplicationVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsBoolean());
    }

    /**
     * Test getEncodedApplicationVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsBigInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedApplicationVersionAsURL());
    }

    /**
     * Test getEncodedDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsInteger());
    }

    /**
     * Test getEncodedDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsLong());
    }

    /**
     * Test getEncodedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsLocalDateTime());
    }

    /**
     * Test getEncodedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsLocalTime());
    }

    /**
     * Test getEncodedDateAsString() method.
     */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsString());
    }

    /**
     * Test getEncodedDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsBoolean());
    }

    /**
     * Test getEncodedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsBigInteger());
    }

    /**
     * Test getEncodedDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedDateAsURL());
    }

    /**
     * Test getEncodedLibraryAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsInteger());
    }

    /**
     * Test getEncodedLibraryAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsLong());
    }

    /**
     * Test getEncodedLibraryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsLocalTime());
    }

    /**
     * Test getEncodedLibraryAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsString());
    }

    /**
     * Test getEncodedLibraryAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsBoolean());
    }

    /**
     * Test getEncodedLibraryAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsBigInteger());
    }

    /**
     * Test getEncodedLibraryAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryAsURL());
    }

    /**
     * Test getEncodedLibraryStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsInteger());
    }

    /**
     * Test getEncodedLibraryStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsLong());
    }

    /**
     * Test getEncodedLibraryStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsLocalTime());
    }

    /**
     * Test getEncodedLibraryStringAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsString());
    }

    /**
     * Test getEncodedLibraryStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsBoolean());
    }

    /**
     * Test getEncodedLibraryStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsBigInteger());
    }

    /**
     * Test getEncodedLibraryStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryStringAsURL());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsLong());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsString());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryCompanyNameAsURL());
    }

    /**
     * Test getEncodedLibraryDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsInteger());
    }

    /**
     * Test getEncodedLibraryDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsLong());
    }

    /**
     * Test getEncodedLibraryDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsLocalTime());
    }

    /**
     * Test getEncodedLibraryDateAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsString());
    }

    /**
     * Test getEncodedLibraryDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsBoolean());
    }

    /**
     * Test getEncodedLibraryDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsBigInteger());
    }

    /**
     * Test getEncodedLibraryDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryDateAsURL());
    }

    /**
     * Test getEncodedLibraryNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsInteger());
    }

    /**
     * Test getEncodedLibraryNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsLong());
    }

    /**
     * Test getEncodedLibraryNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsString());
    }

    /**
     * Test getEncodedLibraryNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryNameAsURL());
    }

    /**
     * Test getEncodedLibrarySettingsAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsLong());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsLocalDateTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsLocalTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsString() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsString());
    }

    /**
     * Test getEncodedLibrarySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsBoolean());
    }

    /**
     * Test getEncodedLibrarySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsBigInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibrarySettingsAsURL());
    }

    /**
     * Test getEncodedLibraryVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsLong());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsLocalTime());
    }

    /**
     * Test getEncodedLibraryVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsString());
    }

    /**
     * Test getEncodedLibraryVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsBoolean());
    }

    /**
     * Test getEncodedLibraryVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsBigInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedLibraryVersionAsURL());
    }

    /**
     * Test getEncodedOperatingSystemAsInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsLong() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsLong());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsLocalDateTime());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsLocalTime());
    }

    /**
     * Test getEncodedOperatingSystemAsString() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsString());
    }

    /**
     * Test getEncodedOperatingSystemAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsBoolean());
    }

    /**
     * Test getEncodedOperatingSystemAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsBigInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsURL() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncodedOperatingSystemAsURL());
    }

    /**
     * Test getEncryptionAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsInteger());
    }

    /**
     * Test getEncryptionAsLong() method.
     */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsLong());
    }

    /**
     * Test getEncryptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsLocalDateTime());
    }

    /**
     * Test getEncryptionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsLocalTime());
    }

    /**
     * Test getEncryptionAsString() method.
     */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsString());
    }

    /**
     * Test getEncryptionAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsBoolean());
    }

    /**
     * Test getEncryptionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsBigInteger());
    }

    /**
     * Test getEncryptionAsURL() method.
     */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getEncryptionAsURL());
    }

    /**
     * Test getFirstPacketOrderAsInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsInteger());
    }

    /**
     * Test getFirstPacketOrderAsLong() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsLong());
    }

    /**
     * Test getFirstPacketOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsLocalDateTime());
    }

    /**
     * Test getFirstPacketOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsLocalTime());
    }

    /**
     * Test getFirstPacketOrderAsString() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsString());
    }

    /**
     * Test getFirstPacketOrderAsBoolean() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsBoolean());
    }

    /**
     * Test getFirstPacketOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsBigInteger());
    }

    /**
     * Test getFirstPacketOrderAsURL() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFirstPacketOrderAsURL());
    }

    /**
     * Test getForcedAsInteger() method.
     */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsInteger());
    }

    /**
     * Test getForcedAsLong() method.
     */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsLong());
    }

    /**
     * Test getForcedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsLocalDateTime());
    }

    /**
     * Test getForcedAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsLocalTime());
    }

    /**
     * Test getForcedAsString() method.
     */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsString());
    }

    /**
     * Test getForcedAsBoolean() method.
     */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsBoolean());
    }

    /**
     * Test getForcedAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsBigInteger());
    }

    /**
     * Test getForcedAsURL() method.
     */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedAsURL());
    }

    /**
     * Test getForcedStringAsInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsInteger());
    }

    /**
     * Test getForcedStringAsLong() method.
     */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsLong());
    }

    /**
     * Test getForcedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsLocalDateTime());
    }

    /**
     * Test getForcedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsLocalTime());
    }

    /**
     * Test getForcedStringAsString() method.
     */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals("No", JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsString());
    }

    /**
     * Test getForcedStringAsBoolean() method.
     */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsBoolean());
    }

    /**
     * Test getForcedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsBigInteger());
    }

    /**
     * Test getForcedStringAsURL() method.
     */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getForcedStringAsURL());
    }

    /**
     * Test getFormatAsInteger() method.
     */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsInteger());
    }

    /**
     * Test getFormatAsLong() method.
     */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsLong());
    }

    /**
     * Test getFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsLocalDateTime());
    }

    /**
     * Test getFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsLocalTime());
    }

    /**
     * Test getFormatAsString() method.
     */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals("AVC", JMetaDataVideo_Test.jMetaDataVideo.getFormatAsString());
    }

    /**
     * Test getFormatAsBoolean() method.
     */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsBoolean());
    }

    /**
     * Test getFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsBigInteger());
    }

    /**
     * Test getFormatAsURL() method.
     */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatAsURL());
    }

    /**
     * Test getFormatInfoAsInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsInteger());
    }

    /**
     * Test getFormatInfoAsLong() method.
     */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsLong());
    }

    /**
     * Test getFormatInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsLocalDateTime());
    }

    /**
     * Test getFormatInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsLocalTime());
    }

    /**
     * Test getFormatInfoAsString() method.
     */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsString());
    }

    /**
     * Test getFormatInfoAsBoolean() method.
     */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsBoolean());
    }

    /**
     * Test getFormatInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsBigInteger());
    }

    /**
     * Test getFormatInfoAsURL() method.
     */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatInfoAsURL());
    }

    /**
     * Test getFormatUrlAsInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(Integer.valueOf(264), JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsInteger());
    }

    /**
     * Test getFormatUrlAsLong() method.
     */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(Long.valueOf(264), JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsLong());
    }

    /**
     * Test getFormatUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsLocalDateTime());
    }

    /**
     * Test getFormatUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsLocalTime());
    }

    /**
     * Test getFormatUrlAsString() method.
     */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals("http://developers.videolan.org/x264.html", JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsString());
    }

    /**
     * Test getFormatUrlAsBoolean() method.
     */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsBoolean());
    }

    /**
     * Test getFormatUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(BigInteger.valueOf(264), JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsBigInteger());
    }

    /**
     * Test getFormatUrlAsURL() method.
     */
    @Test
    public void subTestGetFormatUrlAsURL() {
        try {
            assertEquals(new URL("http://developers.videolan.org/x264.html"), JMetaDataVideo_Test.jMetaDataVideo.getFormatUrlAsURL());
        } catch (final MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Test getFormatCommercialAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsInteger());
    }

    /**
     * Test getFormatCommercialAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsLong());
    }

    /**
     * Test getFormatCommercialAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsLocalTime());
    }

    /**
     * Test getFormatCommercialAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsString());
    }

    /**
     * Test getFormatCommercialAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsBoolean());
    }

    /**
     * Test getFormatCommercialAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsBigInteger());
    }

    /**
     * Test getFormatCommercialAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialAsURL());
    }

    /**
     * Test getFormatCommercialIfAnyAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsLong());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsLocalTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsString());
    }

    /**
     * Test getFormatCommercialIfAnyAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsBoolean());
    }

    /**
     * Test getFormatCommercialIfAnyAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsBigInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCommercialIfAnyAsURL());
    }

    /**
     * Test getFormatCompressionAsInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsInteger());
    }

    /**
     * Test getFormatCompressionAsLong() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsLong());
    }

    /**
     * Test getFormatCompressionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsLocalDateTime());
    }

    /**
     * Test getFormatCompressionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsLocalTime());
    }

    /**
     * Test getFormatCompressionAsString() method.
     */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsString());
    }

    /**
     * Test getFormatCompressionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsBoolean());
    }

    /**
     * Test getFormatCompressionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsBigInteger());
    }

    /**
     * Test getFormatCompressionAsURL() method.
     */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatCompressionAsURL());
    }

    /**
     * Test getFormatLevelAsInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsInteger());
    }

    /**
     * Test getFormatLevelAsLong() method.
     */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsLong());
    }

    /**
     * Test getFormatLevelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsLocalDateTime());
    }

    /**
     * Test getFormatLevelAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsLocalTime());
    }

    /**
     * Test getFormatLevelAsString() method.
     */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsString());
    }

    /**
     * Test getFormatLevelAsBoolean() method.
     */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsBoolean());
    }

    /**
     * Test getFormatLevelAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsBigInteger());
    }

    /**
     * Test getFormatLevelAsURL() method.
     */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatLevelAsURL());
    }

    /**
     * Test getFormatProfileAsInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsInteger());
    }

    /**
     * Test getFormatProfileAsLong() method.
     */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsLong());
    }

    /**
     * Test getFormatProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsLocalDateTime());
    }

    /**
     * Test getFormatProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsLocalTime());
    }

    /**
     * Test getFormatProfileAsString() method.
     */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals("High@L4", JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsString());
    }

    /**
     * Test getFormatProfileAsBoolean() method.
     */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsBoolean());
    }

    /**
     * Test getFormatProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(BigInteger.valueOf(4), JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsBigInteger());
    }

    /**
     * Test getFormatProfileAsURL() method.
     */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatProfileAsURL());
    }

    /**
     * Test getFormatSettingsAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(Integer.valueOf(4), JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsInteger());
    }

    /**
     * Test getFormatSettingsAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsLong());
    }

    /**
     * Test getFormatSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsLocalTime());
    }

    /**
     * Test getFormatSettingsAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsString());
    }

    /**
     * Test getFormatSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsBoolean());
    }

    /**
     * Test getFormatSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(BigInteger.valueOf(4), JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsBigInteger());
    }

    /**
     * Test getFormatSettingsAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsAsURL());
    }

    /**
     * Test getFormatSettingsBVOPAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsInteger());
    }

    /**
     * Test getFormatSettingsBVOPAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsLong());
    }

    /**
     * Test getFormatSettingsBVOPAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsBVOPAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsLocalTime());
    }

    /**
     * Test getFormatSettingsBVOPAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsString());
    }

    /**
     * Test getFormatSettingsBVOPAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsBoolean());
    }

    /**
     * Test getFormatSettingsBVOPAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsBigInteger());
    }

    /**
     * Test getFormatSettingsBVOPAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPAsURL());
    }

    /**
     * Test getFormatSettingsBVOPStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsInteger());
    }

    /**
     * Test getFormatSettingsBVOPStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsLong());
    }

    /**
     * Test getFormatSettingsBVOPStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsBVOPStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsBVOPStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsString());
    }

    /**
     * Test getFormatSettingsBVOPStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsBoolean());
    }

    /**
     * Test getFormatSettingsBVOPStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsBVOPStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsBVOPStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsBVOPStringAsURL());
    }

    /**
     * Test getFormatSettingsCABACAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsInteger());
    }

    /**
     * Test getFormatSettingsCABACAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsLong());
    }

    /**
     * Test getFormatSettingsCABACAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsCABACAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsLocalTime());
    }

    /**
     * Test getFormatSettingsCABACAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsString());
    }

    /**
     * Test getFormatSettingsCABACAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsBoolean());
    }

    /**
     * Test getFormatSettingsCABACAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsBigInteger());
    }

    /**
     * Test getFormatSettingsCABACAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACAsURL());
    }

    /**
     * Test getFormatSettingsCABACStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsInteger());
    }

    /**
     * Test getFormatSettingsCABACStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsLong());
    }

    /**
     * Test getFormatSettingsCABACStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsCABACStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsCABACStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsString() {
        assertEquals("Yes", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsString());
    }

    /**
     * Test getFormatSettingsCABACStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsBoolean());
    }

    /**
     * Test getFormatSettingsCABACStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsCABACStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsCABACStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsCABACStringAsURL());
    }

    /**
     * Test getFormatSettingsFrameModeAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsInteger());
    }

    /**
     * Test getFormatSettingsFrameModeAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsLong());
    }

    /**
     * Test getFormatSettingsFrameModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsFrameModeAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsLocalTime());
    }

    /**
     * Test getFormatSettingsFrameModeAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsString());
    }

    /**
     * Test getFormatSettingsFrameModeAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsBoolean());
    }

    /**
     * Test getFormatSettingsFrameModeAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsBigInteger());
    }

    /**
     * Test getFormatSettingsFrameModeAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsFrameModeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsFrameModeAsURL());
    }

    /**
     * Test getFormatSettingsGMCAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsInteger());
    }

    /**
     * Test getFormatSettingsGMCAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsLong());
    }

    /**
     * Test getFormatSettingsGMCAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsGMCAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsLocalTime());
    }

    /**
     * Test getFormatSettingsGMCAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsString());
    }

    /**
     * Test getFormatSettingsGMCAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsBoolean());
    }

    /**
     * Test getFormatSettingsGMCAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsBigInteger());
    }

    /**
     * Test getFormatSettingsGMCAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCAsURL());
    }

    /**
     * Test getFormatSettingsGMCStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsInteger());
    }

    /**
     * Test getFormatSettingsGMCStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsLong());
    }

    /**
     * Test getFormatSettingsGMCStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsGMCStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsGMCStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsString());
    }

    /**
     * Test getFormatSettingsGMCStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsBoolean());
    }

    /**
     * Test getFormatSettingsGMCStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsGMCStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsGMCStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGMCStringAsURL());
    }

    /**
     * Test getFormatSettingsGOPAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsInteger());
    }

    /**
     * Test getFormatSettingsGOPAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsLong());
    }

    /**
     * Test getFormatSettingsGOPAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsGOPAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsLocalTime());
    }

    /**
     * Test getFormatSettingsGOPAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsString());
    }

    /**
     * Test getFormatSettingsGOPAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsBoolean());
    }

    /**
     * Test getFormatSettingsGOPAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsBigInteger());
    }

    /**
     * Test getFormatSettingsGOPAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsGOPAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsGOPAsURL());
    }

    /**
     * Test getFormatSettingsMatrixAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsInteger());
    }

    /**
     * Test getFormatSettingsMatrixAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsLong());
    }

    /**
     * Test getFormatSettingsMatrixAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsMatrixAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsLocalTime());
    }

    /**
     * Test getFormatSettingsMatrixAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsString());
    }

    /**
     * Test getFormatSettingsMatrixAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsBoolean());
    }

    /**
     * Test getFormatSettingsMatrixAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsBigInteger());
    }

    /**
     * Test getFormatSettingsMatrixAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixAsURL());
    }

    /**
     * Test getFormatSettingsMatrixStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsInteger());
    }

    /**
     * Test getFormatSettingsMatrixStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsLong());
    }

    /**
     * Test getFormatSettingsMatrixStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsMatrixStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsMatrixStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsString());
    }

    /**
     * Test getFormatSettingsMatrixStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsBoolean());
    }

    /**
     * Test getFormatSettingsMatrixStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsMatrixStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixStringAsURL());
    }

    /**
     * Test getFormatSettingsMatrixDataAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsInteger());
    }

    /**
     * Test getFormatSettingsMatrixDataAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsLong());
    }

    /**
     * Test getFormatSettingsMatrixDataAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsMatrixDataAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsLocalTime());
    }

    /**
     * Test getFormatSettingsMatrixDataAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsString());
    }

    /**
     * Test getFormatSettingsMatrixDataAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsBoolean());
    }

    /**
     * Test getFormatSettingsMatrixDataAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsBigInteger());
    }

    /**
     * Test getFormatSettingsMatrixDataAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsMatrixDataAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsMatrixDataAsURL());
    }

    /**
     * Test getFormatSettingsPictureStructureAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsInteger());
    }

    /**
     * Test getFormatSettingsPictureStructureAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsLong());
    }

    /**
     * Test getFormatSettingsPictureStructureAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsPictureStructureAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsLocalTime());
    }

    /**
     * Test getFormatSettingsPictureStructureAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsString());
    }

    /**
     * Test getFormatSettingsPictureStructureAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsBoolean());
    }

    /**
     * Test getFormatSettingsPictureStructureAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsBigInteger());
    }

    /**
     * Test getFormatSettingsPictureStructureAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsPictureStructureAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPictureStructureAsURL());
    }

    /**
     * Test getFormatSettingsPulldownAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsInteger());
    }

    /**
     * Test getFormatSettingsPulldownAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsLong());
    }

    /**
     * Test getFormatSettingsPulldownAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsPulldownAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsLocalTime());
    }

    /**
     * Test getFormatSettingsPulldownAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsString());
    }

    /**
     * Test getFormatSettingsPulldownAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsBoolean());
    }

    /**
     * Test getFormatSettingsPulldownAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsBigInteger());
    }

    /**
     * Test getFormatSettingsPulldownAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsPulldownAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsPulldownAsURL());
    }

    /**
     * Test getFormatSettingsQPelAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsInteger());
    }

    /**
     * Test getFormatSettingsQPelAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsLong());
    }

    /**
     * Test getFormatSettingsQPelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsQPelAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsLocalTime());
    }

    /**
     * Test getFormatSettingsQPelAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsString());
    }

    /**
     * Test getFormatSettingsQPelAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsBoolean());
    }

    /**
     * Test getFormatSettingsQPelAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsBigInteger());
    }

    /**
     * Test getFormatSettingsQPelAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelAsURL());
    }

    /**
     * Test getFormatSettingsQPelStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsInteger());
    }

    /**
     * Test getFormatSettingsQPelStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsLong());
    }

    /**
     * Test getFormatSettingsQPelStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsQPelStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsQPelStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsString());
    }

    /**
     * Test getFormatSettingsQPelStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsBoolean());
    }

    /**
     * Test getFormatSettingsQPelStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsQPelStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsQPelStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsQPelStringAsURL());
    }

    /**
     * Test getFormatSettingsRefFramesAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsInteger());
    }

    /**
     * Test getFormatSettingsRefFramesAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsLong());
    }

    /**
     * Test getFormatSettingsRefFramesAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsRefFramesAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsLocalTime());
    }

    /**
     * Test getFormatSettingsRefFramesAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsString() {
        assertEquals("4", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsString());
    }

    /**
     * Test getFormatSettingsRefFramesAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsBoolean());
    }

    /**
     * Test getFormatSettingsRefFramesAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsBigInteger());
    }

    /**
     * Test getFormatSettingsRefFramesAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesAsURL());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsInteger() {
        assertEquals(Integer.valueOf(4), JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsInteger());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsLong());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsString() {
        assertEquals("4 frames", JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsString());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsBoolean());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsRefFramesStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsRefFramesStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsRefFramesStringAsURL());
    }

    /**
     * Test getFormatSettingsWrappingAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsInteger());
    }

    /**
     * Test getFormatSettingsWrappingAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsLong());
    }

    /**
     * Test getFormatSettingsWrappingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsWrappingAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsLocalTime());
    }

    /**
     * Test getFormatSettingsWrappingAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsString());
    }

    /**
     * Test getFormatSettingsWrappingAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsBoolean());
    }

    /**
     * Test getFormatSettingsWrappingAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsBigInteger());
    }

    /**
     * Test getFormatSettingsWrappingAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatSettingsWrappingAsURL());
    }

    /**
     * Test getFormatTierAsInteger() method.
     */
    @Test
    public void subTestGetFormatTierAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsInteger());
    }

    /**
     * Test getFormatTierAsLong() method.
     */
    @Test
    public void subTestGetFormatTierAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsLong());
    }

    /**
     * Test getFormatTierAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatTierAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsLocalDateTime());
    }

    /**
     * Test getFormatTierAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatTierAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsLocalTime());
    }

    /**
     * Test getFormatTierAsString() method.
     */
    @Test
    public void subTestGetFormatTierAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsString());
    }

    /**
     * Test getFormatTierAsBoolean() method.
     */
    @Test
    public void subTestGetFormatTierAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsBoolean());
    }

    /**
     * Test getFormatTierAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatTierAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsBigInteger());
    }

    /**
     * Test getFormatTierAsURL() method.
     */
    @Test
    public void subTestGetFormatTierAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatTierAsURL());
    }

    /**
     * Test getFormatVersionAsInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsInteger());
    }

    /**
     * Test getFormatVersionAsLong() method.
     */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsLong());
    }

    /**
     * Test getFormatVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsLocalDateTime());
    }

    /**
     * Test getFormatVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsLocalTime());
    }

    /**
     * Test getFormatVersionAsString() method.
     */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsString());
    }

    /**
     * Test getFormatVersionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsBoolean());
    }

    /**
     * Test getFormatVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsBigInteger());
    }

    /**
     * Test getFormatVersionAsURL() method.
     */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFormatVersionAsURL());
    }

    /**
     * Test getFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsInteger());
    }

    /**
     * Test getFrameCountAsLong() method.
     */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(Long.valueOf(21556), JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsLong());
    }

    /**
     * Test getFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsLocalDateTime());
    }

    /**
     * Test getFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsLocalTime());
    }

    /**
     * Test getFrameCountAsString() method.
     */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals("21556", JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsString());
    }

    /**
     * Test getFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsBoolean());
    }

    /**
     * Test getFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(21556), JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsBigInteger());
    }

    /**
     * Test getFrameCountAsURL() method.
     */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameCountAsURL());
    }

    /**
     * Test getFrameRateAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsInteger());
    }

    /**
     * Test getFrameRateAsLong() method.
     */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(Long.valueOf(24000), JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsLong());
    }

    /**
     * Test getFrameRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsLocalDateTime());
    }

    /**
     * Test getFrameRateAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsLocalTime());
    }

    /**
     * Test getFrameRateAsString() method.
     */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals("24.000", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsString());
    }

    /**
     * Test getFrameRateAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsBoolean());
    }

    /**
     * Test getFrameRateAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsBigInteger());
    }

    /**
     * Test getFrameRateAsURL() method.
     */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateAsURL());
    }

    /**
     * Test getFrameRateStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(Integer.valueOf(24000), JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsInteger());
    }

    /**
     * Test getFrameRateStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsLong());
    }

    /**
     * Test getFrameRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsLocalTime());
    }

    /**
     * Test getFrameRateStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals("24.000 FPS", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsString());
    }

    /**
     * Test getFrameRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsBoolean());
    }

    /**
     * Test getFrameRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(24000), JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsBigInteger());
    }

    /**
     * Test getFrameRateStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateStringAsURL());
    }

    /**
     * Test getFrameRateDenAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsInteger());
    }

    /**
     * Test getFrameRateDenAsLong() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsLong());
    }

    /**
     * Test getFrameRateDenAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsLocalDateTime());
    }

    /**
     * Test getFrameRateDenAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsLocalTime());
    }

    /**
     * Test getFrameRateDenAsString() method.
     */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsString());
    }

    /**
     * Test getFrameRateDenAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsBoolean());
    }

    /**
     * Test getFrameRateDenAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsBigInteger());
    }

    /**
     * Test getFrameRateDenAsURL() method.
     */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateDenAsURL());
    }

    /**
     * Test getFrameRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsInteger());
    }

    /**
     * Test getFrameRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsLong());
    }

    /**
     * Test getFrameRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsLocalDateTime());
    }

    /**
     * Test getFrameRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsLocalTime());
    }

    /**
     * Test getFrameRateMaximumAsString() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsString());
    }

    /**
     * Test getFrameRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsBoolean());
    }

    /**
     * Test getFrameRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsBigInteger());
    }

    /**
     * Test getFrameRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumAsURL());
    }

    /**
     * Test getFrameRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsInteger());
    }

    /**
     * Test getFrameRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsLong());
    }

    /**
     * Test getFrameRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsLocalTime());
    }

    /**
     * Test getFrameRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsString());
    }

    /**
     * Test getFrameRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsBoolean());
    }

    /**
     * Test getFrameRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsBigInteger());
    }

    /**
     * Test getFrameRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMaximumStringAsURL());
    }

    /**
     * Test getFrameRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsInteger());
    }

    /**
     * Test getFrameRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsLong());
    }

    /**
     * Test getFrameRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsLocalDateTime());
    }

    /**
     * Test getFrameRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsLocalTime());
    }

    /**
     * Test getFrameRateMinimumAsString() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsString());
    }

    /**
     * Test getFrameRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsBoolean());
    }

    /**
     * Test getFrameRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsBigInteger());
    }

    /**
     * Test getFrameRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumAsURL());
    }

    /**
     * Test getFrameRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsInteger());
    }

    /**
     * Test getFrameRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsLong());
    }

    /**
     * Test getFrameRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsLocalTime());
    }

    /**
     * Test getFrameRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsString());
    }

    /**
     * Test getFrameRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsBoolean());
    }

    /**
     * Test getFrameRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsBigInteger());
    }

    /**
     * Test getFrameRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateMinimumStringAsURL());
    }

    /**
     * Test getFrameRateModeAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsInteger());
    }

    /**
     * Test getFrameRateModeAsLong() method.
     */
    @Test
    public void subTestGetFrameRateModeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsLong());
    }

    /**
     * Test getFrameRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsLocalDateTime());
    }

    /**
     * Test getFrameRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateModeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsLocalTime());
    }

    /**
     * Test getFrameRateModeAsString() method.
     */
    @Test
    public void subTestGetFrameRateModeAsString() {
        assertEquals("CFR", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsString());
    }

    /**
     * Test getFrameRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateModeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsBoolean());
    }

    /**
     * Test getFrameRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsBigInteger());
    }

    /**
     * Test getFrameRateModeAsURL() method.
     */
    @Test
    public void subTestGetFrameRateModeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeAsURL());
    }

    /**
     * Test getFrameRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsInteger());
    }

    /**
     * Test getFrameRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsLong());
    }

    /**
     * Test getFrameRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsLocalTime());
    }

    /**
     * Test getFrameRateModeStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsString() {
        assertEquals("Constant", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsString());
    }

    /**
     * Test getFrameRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsBoolean());
    }

    /**
     * Test getFrameRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsBigInteger());
    }

    /**
     * Test getFrameRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeStringAsURL());
    }

    /**
     * Test getFrameRateModeOriginalAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsInteger());
    }

    /**
     * Test getFrameRateModeOriginalAsLong() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsLong());
    }

    /**
     * Test getFrameRateModeOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsLocalDateTime());
    }

    /**
     * Test getFrameRateModeOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsLocalTime());
    }

    /**
     * Test getFrameRateModeOriginalAsString() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsString());
    }

    /**
     * Test getFrameRateModeOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsBoolean());
    }

    /**
     * Test getFrameRateModeOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsBigInteger());
    }

    /**
     * Test getFrameRateModeOriginalAsURL() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalAsURL());
    }

    /**
     * Test getFrameRateModeOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsInteger());
    }

    /**
     * Test getFrameRateModeOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsLong());
    }

    /**
     * Test getFrameRateModeOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateModeOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsLocalTime());
    }

    /**
     * Test getFrameRateModeOriginalStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsString());
    }

    /**
     * Test getFrameRateModeOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsBoolean());
    }

    /**
     * Test getFrameRateModeOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsBigInteger());
    }

    /**
     * Test getFrameRateModeOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateModeOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateModeOriginalStringAsURL());
    }

    /**
     * Test getFrameRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsInteger());
    }

    /**
     * Test getFrameRateNominalAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsLong());
    }

    /**
     * Test getFrameRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsLocalDateTime());
    }

    /**
     * Test getFrameRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsLocalTime());
    }

    /**
     * Test getFrameRateNominalAsString() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsString());
    }

    /**
     * Test getFrameRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsBoolean());
    }

    /**
     * Test getFrameRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsBigInteger());
    }

    /**
     * Test getFrameRateNominalAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalAsURL());
    }

    /**
     * Test getFrameRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsInteger());
    }

    /**
     * Test getFrameRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsLong());
    }

    /**
     * Test getFrameRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsLocalTime());
    }

    /**
     * Test getFrameRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsString());
    }

    /**
     * Test getFrameRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsBoolean());
    }

    /**
     * Test getFrameRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsBigInteger());
    }

    /**
     * Test getFrameRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNominalStringAsURL());
    }

    /**
     * Test getFrameRateNumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsInteger());
    }

    /**
     * Test getFrameRateNumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsLong());
    }

    /**
     * Test getFrameRateNumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsLocalDateTime());
    }

    /**
     * Test getFrameRateNumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsLocalTime());
    }

    /**
     * Test getFrameRateNumAsString() method.
     */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsString());
    }

    /**
     * Test getFrameRateNumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsBoolean());
    }

    /**
     * Test getFrameRateNumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsBigInteger());
    }

    /**
     * Test getFrameRateNumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateNumAsURL());
    }

    /**
     * Test getFrameRateOriginalAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsInteger());
    }

    /**
     * Test getFrameRateOriginalAsLong() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsLong());
    }

    /**
     * Test getFrameRateOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsLocalDateTime());
    }

    /**
     * Test getFrameRateOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsLocalTime());
    }

    /**
     * Test getFrameRateOriginalAsString() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsString());
    }

    /**
     * Test getFrameRateOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsBoolean());
    }

    /**
     * Test getFrameRateOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsBigInteger());
    }

    /**
     * Test getFrameRateOriginalAsURL() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalAsURL());
    }

    /**
     * Test getFrameRateOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsInteger());
    }

    /**
     * Test getFrameRateOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsLong());
    }

    /**
     * Test getFrameRateOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsLocalTime());
    }

    /**
     * Test getFrameRateOriginalStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsString());
    }

    /**
     * Test getFrameRateOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsBoolean());
    }

    /**
     * Test getFrameRateOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsBigInteger());
    }

    /**
     * Test getFrameRateOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalStringAsURL());
    }

    /**
     * Test getFrameRateOriginalDenAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsInteger());
    }

    /**
     * Test getFrameRateOriginalDenAsLong() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsLong());
    }

    /**
     * Test getFrameRateOriginalDenAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsLocalDateTime());
    }

    /**
     * Test getFrameRateOriginalDenAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsLocalTime());
    }

    /**
     * Test getFrameRateOriginalDenAsString() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsString());
    }

    /**
     * Test getFrameRateOriginalDenAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsBoolean());
    }

    /**
     * Test getFrameRateOriginalDenAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsBigInteger());
    }

    /**
     * Test getFrameRateOriginalDenAsURL() method.
     */
    @Test
    public void subTestGetFrameRateOriginalDenAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalDenAsURL());
    }

    /**
     * Test getFrameRateOriginalNumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsInteger());
    }

    /**
     * Test getFrameRateOriginalNumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsLong());
    }

    /**
     * Test getFrameRateOriginalNumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsLocalDateTime());
    }

    /**
     * Test getFrameRateOriginalNumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsLocalTime());
    }

    /**
     * Test getFrameRateOriginalNumAsString() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsString());
    }

    /**
     * Test getFrameRateOriginalNumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsBoolean());
    }

    /**
     * Test getFrameRateOriginalNumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsBigInteger());
    }

    /**
     * Test getFrameRateOriginalNumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateOriginalNumAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getFrameRateOriginalNumAsURL());
    }

    /**
     * Test getGopOpenClosedAsInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsInteger());
    }

    /**
     * Test getGopOpenClosedAsLong() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsLong());
    }

    /**
     * Test getGopOpenClosedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsLocalDateTime());
    }

    /**
     * Test getGopOpenClosedAsLocalTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsLocalTime());
    }

    /**
     * Test getGopOpenClosedAsString() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsString());
    }

    /**
     * Test getGopOpenClosedAsBoolean() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsBoolean());
    }

    /**
     * Test getGopOpenClosedAsBigInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsBigInteger());
    }

    /**
     * Test getGopOpenClosedAsURL() method.
     */
    @Test
    public void subTestGetGopOpenClosedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedAsURL());
    }

    /**
     * Test getGopOpenClosedStringAsInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsInteger());
    }

    /**
     * Test getGopOpenClosedStringAsLong() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsLong());
    }

    /**
     * Test getGopOpenClosedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsLocalDateTime());
    }

    /**
     * Test getGopOpenClosedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsLocalTime());
    }

    /**
     * Test getGopOpenClosedStringAsString() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsString());
    }

    /**
     * Test getGopOpenClosedStringAsBoolean() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsBoolean());
    }

    /**
     * Test getGopOpenClosedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsBigInteger());
    }

    /**
     * Test getGopOpenClosedStringAsURL() method.
     */
    @Test
    public void subTestGetGopOpenClosedStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedStringAsURL());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsInteger());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsLong());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsLocalDateTime());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsLocalTime());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsString() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsString());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsBoolean());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsBigInteger());
    }

    /**
     * Test getGopOpenClosedFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameAsURL());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsInteger());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsLong());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsLocalTime());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsString());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsBoolean());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsBigInteger());
    }

    /**
     * Test getGopOpenClosedFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetGopOpenClosedFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getGopOpenClosedFirstFrameStringAsURL());
    }

    /**
     * Test getHeightAsInteger() method.
     */
    @Test
    public void subTestGetHeightAsInteger() {
        assertEquals(Integer.valueOf(872), JMetaDataVideo_Test.jMetaDataVideo.getHeightAsInteger());
    }

    /**
     * Test getHeightAsLong() method.
     */
    @Test
    public void subTestGetHeightAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightAsLong());
    }

    /**
     * Test getHeightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightAsLocalDateTime());
    }

    /**
     * Test getHeightAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightAsLocalTime());
    }

    /**
     * Test getHeightAsString() method.
     */
    @Test
    public void subTestGetHeightAsString() {
        assertEquals("872", JMetaDataVideo_Test.jMetaDataVideo.getHeightAsString());
    }

    /**
     * Test getHeightAsBoolean() method.
     */
    @Test
    public void subTestGetHeightAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightAsBoolean());
    }

    /**
     * Test getHeightAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightAsBigInteger());
    }

    /**
     * Test getHeightAsURL() method.
     */
    @Test
    public void subTestGetHeightAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightAsURL());
    }

    /**
     * Test getHeightStringAsInteger() method.
     */
    @Test
    public void subTestGetHeightStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsInteger());
    }

    /**
     * Test getHeightStringAsLong() method.
     */
    @Test
    public void subTestGetHeightStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsLong());
    }

    /**
     * Test getHeightStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsLocalDateTime());
    }

    /**
     * Test getHeightStringAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsLocalTime());
    }

    /**
     * Test getHeightStringAsString() method.
     */
    @Test
    public void subTestGetHeightStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsString());
    }

    /**
     * Test getHeightStringAsBoolean() method.
     */
    @Test
    public void subTestGetHeightStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsBoolean());
    }

    /**
     * Test getHeightStringAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsBigInteger());
    }

    /**
     * Test getHeightStringAsURL() method.
     */
    @Test
    public void subTestGetHeightStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightStringAsURL());
    }

    /**
     * Test getHeightCleanApertureAsInteger() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsInteger());
    }

    /**
     * Test getHeightCleanApertureAsLong() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsLong());
    }

    /**
     * Test getHeightCleanApertureAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsLocalDateTime());
    }

    /**
     * Test getHeightCleanApertureAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsLocalTime());
    }

    /**
     * Test getHeightCleanApertureAsString() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsString());
    }

    /**
     * Test getHeightCleanApertureAsBoolean() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsBoolean());
    }

    /**
     * Test getHeightCleanApertureAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsBigInteger());
    }

    /**
     * Test getHeightCleanApertureAsURL() method.
     */
    @Test
    public void subTestGetHeightCleanApertureAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureAsURL());
    }

    /**
     * Test getHeightCleanApertureStringAsInteger() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsInteger());
    }

    /**
     * Test getHeightCleanApertureStringAsLong() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsLong());
    }

    /**
     * Test getHeightCleanApertureStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsLocalDateTime());
    }

    /**
     * Test getHeightCleanApertureStringAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsLocalTime());
    }

    /**
     * Test getHeightCleanApertureStringAsString() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsString());
    }

    /**
     * Test getHeightCleanApertureStringAsBoolean() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsBoolean());
    }

    /**
     * Test getHeightCleanApertureStringAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsBigInteger());
    }

    /**
     * Test getHeightCleanApertureStringAsURL() method.
     */
    @Test
    public void subTestGetHeightCleanApertureStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightCleanApertureStringAsURL());
    }

    /**
     * Test getHeightOffsetAsInteger() method.
     */
    @Test
    public void subTestGetHeightOffsetAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsInteger());
    }

    /**
     * Test getHeightOffsetAsLong() method.
     */
    @Test
    public void subTestGetHeightOffsetAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsLong());
    }

    /**
     * Test getHeightOffsetAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightOffsetAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsLocalDateTime());
    }

    /**
     * Test getHeightOffsetAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightOffsetAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsLocalTime());
    }

    /**
     * Test getHeightOffsetAsString() method.
     */
    @Test
    public void subTestGetHeightOffsetAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsString());
    }

    /**
     * Test getHeightOffsetAsBoolean() method.
     */
    @Test
    public void subTestGetHeightOffsetAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsBoolean());
    }

    /**
     * Test getHeightOffsetAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightOffsetAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsBigInteger());
    }

    /**
     * Test getHeightOffsetAsURL() method.
     */
    @Test
    public void subTestGetHeightOffsetAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetAsURL());
    }

    /**
     * Test getHeightOffsetStringAsInteger() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsInteger());
    }

    /**
     * Test getHeightOffsetStringAsLong() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsLong());
    }

    /**
     * Test getHeightOffsetStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsLocalDateTime());
    }

    /**
     * Test getHeightOffsetStringAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsLocalTime());
    }

    /**
     * Test getHeightOffsetStringAsString() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsString());
    }

    /**
     * Test getHeightOffsetStringAsBoolean() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsBoolean());
    }

    /**
     * Test getHeightOffsetStringAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsBigInteger());
    }

    /**
     * Test getHeightOffsetStringAsURL() method.
     */
    @Test
    public void subTestGetHeightOffsetStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOffsetStringAsURL());
    }

    /**
     * Test getHeightOriginalAsInteger() method.
     */
    @Test
    public void subTestGetHeightOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsInteger());
    }

    /**
     * Test getHeightOriginalAsLong() method.
     */
    @Test
    public void subTestGetHeightOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsLong());
    }

    /**
     * Test getHeightOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsLocalDateTime());
    }

    /**
     * Test getHeightOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsLocalTime());
    }

    /**
     * Test getHeightOriginalAsString() method.
     */
    @Test
    public void subTestGetHeightOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsString());
    }

    /**
     * Test getHeightOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetHeightOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsBoolean());
    }

    /**
     * Test getHeightOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsBigInteger());
    }

    /**
     * Test getHeightOriginalAsURL() method.
     */
    @Test
    public void subTestGetHeightOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalAsURL());
    }

    /**
     * Test getHeightOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsInteger());
    }

    /**
     * Test getHeightOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsLong());
    }

    /**
     * Test getHeightOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsLocalDateTime());
    }

    /**
     * Test getHeightOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsLocalTime());
    }

    /**
     * Test getHeightOriginalStringAsString() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsString());
    }

    /**
     * Test getHeightOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsBoolean());
    }

    /**
     * Test getHeightOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsBigInteger());
    }

    /**
     * Test getHeightOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetHeightOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getHeightOriginalStringAsURL());
    }

    /**
     * Test getIDAsInteger() method.
     */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataVideo_Test.jMetaDataVideo.getIDAsInteger());
    }

    /**
     * Test getIDAsLong() method.
     */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsLong());
    }

    /**
     * Test getIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsLocalDateTime());
    }

    /**
     * Test getIDAsLocalTime() method.
     */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsLocalTime());
    }

    /**
     * Test getIDAsString() method.
     */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsString());
    }

    /**
     * Test getIDAsBoolean() method.
     */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsBoolean());
    }

    /**
     * Test getIDAsBigInteger() method.
     */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsBigInteger());
    }

    /**
     * Test getIDAsURL() method.
     */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDAsURL());
    }

    /**
     * Test getIDStringAsInteger() method.
     */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsInteger());
    }

    /**
     * Test getIDStringAsLong() method.
     */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsLong());
    }

    /**
     * Test getIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsLocalDateTime());
    }

    /**
     * Test getIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsLocalTime());
    }

    /**
     * Test getIDStringAsString() method.
     */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals("1", JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsString());
    }

    /**
     * Test getIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsBoolean());
    }

    /**
     * Test getIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsBigInteger());
    }

    /**
     * Test getIDStringAsURL() method.
     */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getIDStringAsURL());
    }

    /**
     * Test getInformAsInteger() method.
     */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsInteger());
    }

    /**
     * Test getInformAsLong() method.
     */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsLong());
    }

    /**
     * Test getInformAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsLocalDateTime());
    }

    /**
     * Test getInformAsLocalTime() method.
     */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsLocalTime());
    }

    /**
     * Test getInformAsString() method.
     */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsString());
    }

    /**
     * Test getInformAsBoolean() method.
     */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsBoolean());
    }

    /**
     * Test getInformAsBigInteger() method.
     */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(new BigInteger("144414582001920872221240004208709709709"), JMetaDataVideo_Test.jMetaDataVideo.getInformAsBigInteger());
    }

    /**
     * Test getInformAsURL() method.
     */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInformAsURL());
    }

    /**
     * Test getInternetMediaTypeAsInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsInteger());
    }

    /**
     * Test getInternetMediaTypeAsLong() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(Long.valueOf(264), JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsLong());
    }

    /**
     * Test getInternetMediaTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsLocalDateTime());
    }

    /**
     * Test getInternetMediaTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsLocalTime());
    }

    /**
     * Test getInternetMediaTypeAsString() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsString());
    }

    /**
     * Test getInternetMediaTypeAsBoolean() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsBoolean());
    }

    /**
     * Test getInternetMediaTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(BigInteger.valueOf(264), JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsBigInteger());
    }

    /**
     * Test getInternetMediaTypeAsURL() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getInternetMediaTypeAsURL());
    }

    /**
     * Test getLanguageAsInteger() method.
     */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsInteger());
    }

    /**
     * Test getLanguageAsLong() method.
     */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsLong());
    }

    /**
     * Test getLanguageAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsLocalDateTime());
    }

    /**
     * Test getLanguageAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsLocalTime());
    }

    /**
     * Test getLanguageAsString() method.
     */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals("en", JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsString());
    }

    /**
     * Test getLanguageAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsBoolean());
    }

    /**
     * Test getLanguageAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsBigInteger());
    }

    /**
     * Test getLanguageAsURL() method.
     */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageAsURL());
    }

    /**
     * Test getLanguageStringAsInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsInteger());
    }

    /**
     * Test getLanguageStringAsLong() method.
     */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsLong());
    }

    /**
     * Test getLanguageStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsLocalDateTime());
    }

    /**
     * Test getLanguageStringAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsLocalTime());
    }

    /**
     * Test getLanguageStringAsString() method.
     */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsString());
    }

    /**
     * Test getLanguageStringAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsBoolean());
    }

    /**
     * Test getLanguageStringAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsBigInteger());
    }

    /**
     * Test getLanguageStringAsURL() method.
     */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageStringAsURL());
    }

    /**
     * Test getLanguageString1AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsInteger());
    }

    /**
     * Test getLanguageString1AsLong() method.
     */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsLong());
    }

    /**
     * Test getLanguageString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsLocalDateTime());
    }

    /**
     * Test getLanguageString1AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsLocalTime());
    }

    /**
     * Test getLanguageString1AsString() method.
     */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsString());
    }

    /**
     * Test getLanguageString1AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsBoolean());
    }

    /**
     * Test getLanguageString1AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsBigInteger());
    }

    /**
     * Test getLanguageString1AsURL() method.
     */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString1AsURL());
    }

    /**
     * Test getLanguageString2AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsInteger());
    }

    /**
     * Test getLanguageString2AsLong() method.
     */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsLong());
    }

    /**
     * Test getLanguageString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsLocalDateTime());
    }

    /**
     * Test getLanguageString2AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsLocalTime());
    }

    /**
     * Test getLanguageString2AsString() method.
     */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsString());
    }

    /**
     * Test getLanguageString2AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsBoolean());
    }

    /**
     * Test getLanguageString2AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsBigInteger());
    }

    /**
     * Test getLanguageString2AsURL() method.
     */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString2AsURL());
    }

    /**
     * Test getLanguageString3AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsInteger());
    }

    /**
     * Test getLanguageString3AsLong() method.
     */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsLong());
    }

    /**
     * Test getLanguageString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsLocalDateTime());
    }

    /**
     * Test getLanguageString3AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsLocalTime());
    }

    /**
     * Test getLanguageString3AsString() method.
     */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals("eng", JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsString());
    }

    /**
     * Test getLanguageString3AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsBoolean());
    }

    /**
     * Test getLanguageString3AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsBigInteger());
    }

    /**
     * Test getLanguageString3AsURL() method.
     */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString3AsURL());
    }

    /**
     * Test getLanguageString4AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsInteger());
    }

    /**
     * Test getLanguageString4AsLong() method.
     */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsLong());
    }

    /**
     * Test getLanguageString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsLocalDateTime());
    }

    /**
     * Test getLanguageString4AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsLocalTime());
    }

    /**
     * Test getLanguageString4AsString() method.
     */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsString());
    }

    /**
     * Test getLanguageString4AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsBoolean());
    }

    /**
     * Test getLanguageString4AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsBigInteger());
    }

    /**
     * Test getLanguageString4AsURL() method.
     */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageString4AsURL());
    }

    /**
     * Test getLanguageMoreAsInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsInteger());
    }

    /**
     * Test getLanguageMoreAsLong() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsLong());
    }

    /**
     * Test getLanguageMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsLocalDateTime());
    }

    /**
     * Test getLanguageMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsLocalTime());
    }

    /**
     * Test getLanguageMoreAsString() method.
     */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsString());
    }

    /**
     * Test getLanguageMoreAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsBoolean());
    }

    /**
     * Test getLanguageMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsBigInteger());
    }

    /**
     * Test getLanguageMoreAsURL() method.
     */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getLanguageMoreAsURL());
    }

    /**
     * Test getmatrixcoefficientsAsInteger() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsInteger());
    }

    /**
     * Test getmatrixcoefficientsAsLong() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsLong());
    }

    /**
     * Test getmatrixcoefficientsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsLocalDateTime());
    }

    /**
     * Test getmatrixcoefficientsAsLocalTime() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsLocalTime());
    }

    /**
     * Test getmatrixcoefficientsAsString() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsString() {
        assertEquals("BT.709", JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsString());
    }

    /**
     * Test getmatrixcoefficientsAsBoolean() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsBoolean());
    }

    /**
     * Test getmatrixcoefficientsAsBigInteger() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsBigInteger());
    }

    /**
     * Test getmatrixcoefficientsAsURL() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsAsURL());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsInteger() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsInteger());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsLong() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsLong());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsLocalDateTime());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsLocalTime());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsString() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsString());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsBoolean());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsBigInteger());
    }

    /**
     * Test getmatrixcoefficientsOriginalAsURL() method.
     */
    @Test
    public void subTestGetmatrixcoefficientsOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getmatrixcoefficientsOriginalAsURL());
    }

    /**
     * Test getMenuIDAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsInteger());
    }

    /**
     * Test getMenuIDAsLong() method.
     */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsLong());
    }

    /**
     * Test getMenuIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsLocalDateTime());
    }

    /**
     * Test getMenuIDAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsLocalTime());
    }

    /**
     * Test getMenuIDAsString() method.
     */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsString());
    }

    /**
     * Test getMenuIDAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsBoolean());
    }

    /**
     * Test getMenuIDAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsBigInteger());
    }

    /**
     * Test getMenuIDAsURL() method.
     */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDAsURL());
    }

    /**
     * Test getMenuIDStringAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsInteger());
    }

    /**
     * Test getMenuIDStringAsLong() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsLong());
    }

    /**
     * Test getMenuIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsLocalDateTime());
    }

    /**
     * Test getMenuIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsLocalTime());
    }

    /**
     * Test getMenuIDStringAsString() method.
     */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsString());
    }

    /**
     * Test getMenuIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsBoolean());
    }

    /**
     * Test getMenuIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsBigInteger());
    }

    /**
     * Test getMenuIDStringAsURL() method.
     */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMenuIDStringAsURL());
    }

    /**
     * Test getMultiViewBaseProfileAsInteger() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsInteger());
    }

    /**
     * Test getMultiViewBaseProfileAsLong() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsLong());
    }

    /**
     * Test getMultiViewBaseProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsLocalDateTime());
    }

    /**
     * Test getMultiViewBaseProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsLocalTime());
    }

    /**
     * Test getMultiViewBaseProfileAsString() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsString());
    }

    /**
     * Test getMultiViewBaseProfileAsBoolean() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsBoolean());
    }

    /**
     * Test getMultiViewBaseProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsBigInteger());
    }

    /**
     * Test getMultiViewBaseProfileAsURL() method.
     */
    @Test
    public void subTestGetMultiViewBaseProfileAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewBaseProfileAsURL());
    }

    /**
     * Test getMultiViewCountAsInteger() method.
     */
    @Test
    public void subTestGetMultiViewCountAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsInteger());
    }

    /**
     * Test getMultiViewCountAsLong() method.
     */
    @Test
    public void subTestGetMultiViewCountAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsLong());
    }

    /**
     * Test getMultiViewCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMultiViewCountAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsLocalDateTime());
    }

    /**
     * Test getMultiViewCountAsLocalTime() method.
     */
    @Test
    public void subTestGetMultiViewCountAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsLocalTime());
    }

    /**
     * Test getMultiViewCountAsString() method.
     */
    @Test
    public void subTestGetMultiViewCountAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsString());
    }

    /**
     * Test getMultiViewCountAsBoolean() method.
     */
    @Test
    public void subTestGetMultiViewCountAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsBoolean());
    }

    /**
     * Test getMultiViewCountAsBigInteger() method.
     */
    @Test
    public void subTestGetMultiViewCountAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsBigInteger());
    }

    /**
     * Test getMultiViewCountAsURL() method.
     */
    @Test
    public void subTestGetMultiViewCountAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewCountAsURL());
    }

    /**
     * Test getMultiViewLayoutAsInteger() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsInteger());
    }

    /**
     * Test getMultiViewLayoutAsLong() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsLong());
    }

    /**
     * Test getMultiViewLayoutAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsLocalDateTime());
    }

    /**
     * Test getMultiViewLayoutAsLocalTime() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsLocalTime());
    }

    /**
     * Test getMultiViewLayoutAsString() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsString());
    }

    /**
     * Test getMultiViewLayoutAsBoolean() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsBoolean());
    }

    /**
     * Test getMultiViewLayoutAsBigInteger() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsBigInteger());
    }

    /**
     * Test getMultiViewLayoutAsURL() method.
     */
    @Test
    public void subTestGetMultiViewLayoutAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMultiViewLayoutAsURL());
    }

    /**
     * Test getMuxingModeAsInteger() method.
     */
    @Test
    public void subTestGetMuxingModeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsInteger());
    }

    /**
     * Test getMuxingModeAsLong() method.
     */
    @Test
    public void subTestGetMuxingModeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsLong());
    }

    /**
     * Test getMuxingModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMuxingModeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsLocalDateTime());
    }

    /**
     * Test getMuxingModeAsLocalTime() method.
     */
    @Test
    public void subTestGetMuxingModeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsLocalTime());
    }

    /**
     * Test getMuxingModeAsString() method.
     */
    @Test
    public void subTestGetMuxingModeAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsString());
    }

    /**
     * Test getMuxingModeAsBoolean() method.
     */
    @Test
    public void subTestGetMuxingModeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsBoolean());
    }

    /**
     * Test getMuxingModeAsBigInteger() method.
     */
    @Test
    public void subTestGetMuxingModeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsBigInteger());
    }

    /**
     * Test getMuxingModeAsURL() method.
     */
    @Test
    public void subTestGetMuxingModeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getMuxingModeAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsString());
    }

    /**
     * Test getOriginalSourceMediumIDAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsString());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getOriginalSourceMediumIDStringAsURL());
    }

    /**
     * Test getPixelAspectRatioAsInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsInteger());
    }

    /**
     * Test getPixelAspectRatioAsLong() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsLong());
    }

    /**
     * Test getPixelAspectRatioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsLocalDateTime());
    }

    /**
     * Test getPixelAspectRatioAsLocalTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsLocalTime());
    }

    /**
     * Test getPixelAspectRatioAsString() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsString() {
        assertEquals("1.000", JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsString());
    }

    /**
     * Test getPixelAspectRatioAsBoolean() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsBoolean());
    }

    /**
     * Test getPixelAspectRatioAsBigInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsBigInteger() {
        assertEquals(BigInteger.valueOf(1000), JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsBigInteger());
    }

    /**
     * Test getPixelAspectRatioAsURL() method.
     */
    @Test
    public void subTestGetPixelAspectRatioAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioAsURL());
    }

    /**
     * Test getPixelAspectRatioStringAsInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsInteger());
    }

    /**
     * Test getPixelAspectRatioStringAsLong() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsLong());
    }

    /**
     * Test getPixelAspectRatioStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsLocalDateTime());
    }

    /**
     * Test getPixelAspectRatioStringAsLocalTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsLocalTime());
    }

    /**
     * Test getPixelAspectRatioStringAsString() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsString());
    }

    /**
     * Test getPixelAspectRatioStringAsBoolean() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsBoolean());
    }

    /**
     * Test getPixelAspectRatioStringAsBigInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsBigInteger());
    }

    /**
     * Test getPixelAspectRatioStringAsURL() method.
     */
    @Test
    public void subTestGetPixelAspectRatioStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioStringAsURL());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsInteger());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsLong() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsLong());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsLocalDateTime());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsLocalTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsLocalTime());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsString() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsString());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsBoolean() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsBoolean());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsBigInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsBigInteger());
    }

    /**
     * Test getPixelAspectRatioCleanApertureAsURL() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureAsURL());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsInteger());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsLong() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsLong());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsLocalDateTime());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsLocalTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsLocalTime());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsString() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsString());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsBoolean() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsBoolean());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsBigInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsBigInteger());
    }

    /**
     * Test getPixelAspectRatioCleanApertureStringAsURL() method.
     */
    @Test
    public void subTestGetPixelAspectRatioCleanApertureStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioCleanApertureStringAsURL());
    }

    /**
     * Test getPixelAspectRatioOriginalAsInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsInteger());
    }

    /**
     * Test getPixelAspectRatioOriginalAsLong() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsLong());
    }

    /**
     * Test getPixelAspectRatioOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsLocalDateTime());
    }

    /**
     * Test getPixelAspectRatioOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsLocalTime());
    }

    /**
     * Test getPixelAspectRatioOriginalAsString() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsString());
    }

    /**
     * Test getPixelAspectRatioOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsBoolean());
    }

    /**
     * Test getPixelAspectRatioOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsBigInteger());
    }

    /**
     * Test getPixelAspectRatioOriginalAsURL() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalAsURL());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsInteger());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsLong());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsLocalDateTime());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsLocalTime());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsString() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsString());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsBoolean());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsBigInteger());
    }

    /**
     * Test getPixelAspectRatioOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetPixelAspectRatioOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getPixelAspectRatioOriginalStringAsURL());
    }

    /**
     * Test getRotationAsInteger() method.
     */
    @Test
    public void subTestGetRotationAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsInteger());
    }

    /**
     * Test getRotationAsLong() method.
     */
    @Test
    public void subTestGetRotationAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsLong());
    }

    /**
     * Test getRotationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRotationAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsLocalDateTime());
    }

    /**
     * Test getRotationAsLocalTime() method.
     */
    @Test
    public void subTestGetRotationAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsLocalTime());
    }

    /**
     * Test getRotationAsString() method.
     */
    @Test
    public void subTestGetRotationAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsString());
    }

    /**
     * Test getRotationAsBoolean() method.
     */
    @Test
    public void subTestGetRotationAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsBoolean());
    }

    /**
     * Test getRotationAsBigInteger() method.
     */
    @Test
    public void subTestGetRotationAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsBigInteger());
    }

    /**
     * Test getRotationAsURL() method.
     */
    @Test
    public void subTestGetRotationAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationAsURL());
    }

    /**
     * Test getRotationStringAsInteger() method.
     */
    @Test
    public void subTestGetRotationStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsInteger());
    }

    /**
     * Test getRotationStringAsLong() method.
     */
    @Test
    public void subTestGetRotationStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsLong());
    }

    /**
     * Test getRotationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRotationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsLocalDateTime());
    }

    /**
     * Test getRotationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetRotationStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsLocalTime());
    }

    /**
     * Test getRotationStringAsString() method.
     */
    @Test
    public void subTestGetRotationStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsString());
    }

    /**
     * Test getRotationStringAsBoolean() method.
     */
    @Test
    public void subTestGetRotationStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsBoolean());
    }

    /**
     * Test getRotationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetRotationStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsBigInteger());
    }

    /**
     * Test getRotationStringAsURL() method.
     */
    @Test
    public void subTestGetRotationStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getRotationStringAsURL());
    }

    /**
     * Test getSampledHeightAsInteger() method.
     */
    @Test
    public void subTestGetSampledHeightAsInteger() {
        assertEquals(Integer.valueOf(872), JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsInteger());
    }

    /**
     * Test getSampledHeightAsLong() method.
     */
    @Test
    public void subTestGetSampledHeightAsLong() {
        assertEquals(Long.valueOf(872), JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsLong());
    }

    /**
     * Test getSampledHeightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSampledHeightAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsLocalDateTime());
    }

    /**
     * Test getSampledHeightAsLocalTime() method.
     */
    @Test
    public void subTestGetSampledHeightAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsLocalTime());
    }

    /**
     * Test getSampledHeightAsString() method.
     */
    @Test
    public void subTestGetSampledHeightAsString() {
        assertEquals("872", JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsString());
    }

    /**
     * Test getSampledHeightAsBoolean() method.
     */
    @Test
    public void subTestGetSampledHeightAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsBoolean());
    }

    /**
     * Test getSampledHeightAsBigInteger() method.
     */
    @Test
    public void subTestGetSampledHeightAsBigInteger() {
        assertEquals(BigInteger.valueOf(872), JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsBigInteger());
    }

    /**
     * Test getSampledHeightAsURL() method.
     */
    @Test
    public void subTestGetSampledHeightAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledHeightAsURL());
    }

    /**
     * Test getSampledWidthAsInteger() method.
     */
    @Test
    public void subTestGetSampledWidthAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsInteger());
    }

    /**
     * Test getSampledWidthAsLong() method.
     */
    @Test
    public void subTestGetSampledWidthAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsLong());
    }

    /**
     * Test getSampledWidthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSampledWidthAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsLocalDateTime());
    }

    /**
     * Test getSampledWidthAsLocalTime() method.
     */
    @Test
    public void subTestGetSampledWidthAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsLocalTime());
    }

    /**
     * Test getSampledWidthAsString() method.
     */
    @Test
    public void subTestGetSampledWidthAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsString());
    }

    /**
     * Test getSampledWidthAsBoolean() method.
     */
    @Test
    public void subTestGetSampledWidthAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsBoolean());
    }

    /**
     * Test getSampledWidthAsBigInteger() method.
     */
    @Test
    public void subTestGetSampledWidthAsBigInteger() {
        assertEquals(BigInteger.valueOf(1920), JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsBigInteger());
    }

    /**
     * Test getSampledWidthAsURL() method.
     */
    @Test
    public void subTestGetSampledWidthAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSampledWidthAsURL());
    }

    /**
     * Test getScanOrderAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsInteger());
    }

    /**
     * Test getScanOrderAsLong() method.
     */
    @Test
    public void subTestGetScanOrderAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsLong());
    }

    /**
     * Test getScanOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsLocalDateTime());
    }

    /**
     * Test getScanOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsLocalTime());
    }

    /**
     * Test getScanOrderAsString() method.
     */
    @Test
    public void subTestGetScanOrderAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsString());
    }

    /**
     * Test getScanOrderAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsBoolean());
    }

    /**
     * Test getScanOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsBigInteger());
    }

    /**
     * Test getScanOrderAsURL() method.
     */
    @Test
    public void subTestGetScanOrderAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderAsURL());
    }

    /**
     * Test getScanOrderStringAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsInteger());
    }

    /**
     * Test getScanOrderStringAsLong() method.
     */
    @Test
    public void subTestGetScanOrderStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsLong());
    }

    /**
     * Test getScanOrderStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsLocalDateTime());
    }

    /**
     * Test getScanOrderStringAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsLocalTime());
    }

    /**
     * Test getScanOrderStringAsString() method.
     */
    @Test
    public void subTestGetScanOrderStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsString());
    }

    /**
     * Test getScanOrderStringAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsBoolean());
    }

    /**
     * Test getScanOrderStringAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsBigInteger());
    }

    /**
     * Test getScanOrderStringAsURL() method.
     */
    @Test
    public void subTestGetScanOrderStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStringAsURL());
    }

    /**
     * Test getScanOrderOriginalAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsInteger());
    }

    /**
     * Test getScanOrderOriginalAsLong() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsLong());
    }

    /**
     * Test getScanOrderOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsLocalDateTime());
    }

    /**
     * Test getScanOrderOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsLocalTime());
    }

    /**
     * Test getScanOrderOriginalAsString() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsString());
    }

    /**
     * Test getScanOrderOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsBoolean());
    }

    /**
     * Test getScanOrderOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsBigInteger());
    }

    /**
     * Test getScanOrderOriginalAsURL() method.
     */
    @Test
    public void subTestGetScanOrderOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalAsURL());
    }

    /**
     * Test getScanOrderOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsInteger());
    }

    /**
     * Test getScanOrderOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsLong());
    }

    /**
     * Test getScanOrderOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsLocalDateTime());
    }

    /**
     * Test getScanOrderOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsLocalTime());
    }

    /**
     * Test getScanOrderOriginalStringAsString() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsString());
    }

    /**
     * Test getScanOrderOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsBoolean());
    }

    /**
     * Test getScanOrderOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsBigInteger());
    }

    /**
     * Test getScanOrderOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetScanOrderOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderOriginalStringAsURL());
    }

    /**
     * Test getScanOrderStoredAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsInteger());
    }

    /**
     * Test getScanOrderStoredAsLong() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsLong());
    }

    /**
     * Test getScanOrderStoredAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsLocalDateTime());
    }

    /**
     * Test getScanOrderStoredAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsLocalTime());
    }

    /**
     * Test getScanOrderStoredAsString() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsString());
    }

    /**
     * Test getScanOrderStoredAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsBoolean());
    }

    /**
     * Test getScanOrderStoredAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsBigInteger());
    }

    /**
     * Test getScanOrderStoredAsURL() method.
     */
    @Test
    public void subTestGetScanOrderStoredAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredAsURL());
    }

    /**
     * Test getScanOrderStoredStringAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsInteger());
    }

    /**
     * Test getScanOrderStoredStringAsLong() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsLong());
    }

    /**
     * Test getScanOrderStoredStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsLocalDateTime());
    }

    /**
     * Test getScanOrderStoredStringAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsLocalTime());
    }

    /**
     * Test getScanOrderStoredStringAsString() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsString());
    }

    /**
     * Test getScanOrderStoredStringAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsBoolean());
    }

    /**
     * Test getScanOrderStoredStringAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsBigInteger());
    }

    /**
     * Test getScanOrderStoredStringAsURL() method.
     */
    @Test
    public void subTestGetScanOrderStoredStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredStringAsURL());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsInteger() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsInteger());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsLong() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsLong());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsLocalDateTime());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsLocalTime() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsLocalTime());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsString() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsString());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsBoolean() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsBoolean());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsBigInteger() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsBigInteger());
    }

    /**
     * Test getScanOrderStoredDisplayedInvertedAsURL() method.
     */
    @Test
    public void subTestGetScanOrderStoredDisplayedInvertedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanOrderStoredDisplayedInvertedAsURL());
    }

    /**
     * Test getScanTypeAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsInteger());
    }

    /**
     * Test getScanTypeAsLong() method.
     */
    @Test
    public void subTestGetScanTypeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsLong());
    }

    /**
     * Test getScanTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsLocalDateTime());
    }

    /**
     * Test getScanTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsLocalTime());
    }

    /**
     * Test getScanTypeAsString() method.
     */
    @Test
    public void subTestGetScanTypeAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsString());
    }

    /**
     * Test getScanTypeAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsBoolean());
    }

    /**
     * Test getScanTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsBigInteger());
    }

    /**
     * Test getScanTypeAsURL() method.
     */
    @Test
    public void subTestGetScanTypeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeAsURL());
    }

    /**
     * Test getScanTypeStringAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsInteger());
    }

    /**
     * Test getScanTypeStringAsLong() method.
     */
    @Test
    public void subTestGetScanTypeStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsLong());
    }

    /**
     * Test getScanTypeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsLocalDateTime());
    }

    /**
     * Test getScanTypeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsLocalTime());
    }

    /**
     * Test getScanTypeStringAsString() method.
     */
    @Test
    public void subTestGetScanTypeStringAsString() {
        assertEquals("Progressive", JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsString());
    }

    /**
     * Test getScanTypeStringAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsBoolean());
    }

    /**
     * Test getScanTypeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsBigInteger());
    }

    /**
     * Test getScanTypeStringAsURL() method.
     */
    @Test
    public void subTestGetScanTypeStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStringAsURL());
    }

    /**
     * Test getScanTypeOriginalAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsInteger());
    }

    /**
     * Test getScanTypeOriginalAsLong() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsLong());
    }

    /**
     * Test getScanTypeOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsLocalDateTime());
    }

    /**
     * Test getScanTypeOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsLocalTime());
    }

    /**
     * Test getScanTypeOriginalAsString() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsString());
    }

    /**
     * Test getScanTypeOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsBoolean());
    }

    /**
     * Test getScanTypeOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsBigInteger());
    }

    /**
     * Test getScanTypeOriginalAsURL() method.
     */
    @Test
    public void subTestGetScanTypeOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalAsURL());
    }

    /**
     * Test getScanTypeOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsInteger());
    }

    /**
     * Test getScanTypeOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsLong());
    }

    /**
     * Test getScanTypeOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsLocalDateTime());
    }

    /**
     * Test getScanTypeOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsLocalTime());
    }

    /**
     * Test getScanTypeOriginalStringAsString() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsString());
    }

    /**
     * Test getScanTypeOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsBoolean());
    }

    /**
     * Test getScanTypeOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsBigInteger());
    }

    /**
     * Test getScanTypeOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetScanTypeOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeOriginalStringAsURL());
    }

    /**
     * Test getScanTypeStoreMethodAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsInteger());
    }

    /**
     * Test getScanTypeStoreMethodAsLong() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsLong());
    }

    /**
     * Test getScanTypeStoreMethodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsLocalDateTime());
    }

    /**
     * Test getScanTypeStoreMethodAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsLocalTime());
    }

    /**
     * Test getScanTypeStoreMethodAsString() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsString());
    }

    /**
     * Test getScanTypeStoreMethodAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsBoolean());
    }

    /**
     * Test getScanTypeStoreMethodAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsBigInteger());
    }

    /**
     * Test getScanTypeStoreMethodAsURL() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodAsURL());
    }

    /**
     * Test getScanTypeStoreMethodStringAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsInteger());
    }

    /**
     * Test getScanTypeStoreMethodStringAsLong() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsLong());
    }

    /**
     * Test getScanTypeStoreMethodStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsLocalDateTime());
    }

    /**
     * Test getScanTypeStoreMethodStringAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsLocalTime());
    }

    /**
     * Test getScanTypeStoreMethodStringAsString() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsString());
    }

    /**
     * Test getScanTypeStoreMethodStringAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsBoolean());
    }

    /**
     * Test getScanTypeStoreMethodStringAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsBigInteger());
    }

    /**
     * Test getScanTypeStoreMethodStringAsURL() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodStringAsURL());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsInteger() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsInteger());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsLong() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsLong());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsLocalDateTime());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsLocalTime() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsLocalTime());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsString() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsString());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsBoolean() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsBoolean());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsBigInteger() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsBigInteger());
    }

    /**
     * Test getScanTypeStoreMethodFieldsPerBlockAsURL() method.
     */
    @Test
    public void subTestGetScanTypeStoreMethodFieldsPerBlockAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getScanTypeStoreMethodFieldsPerBlockAsURL());
    }

    /**
     * Test getServiceKindAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsInteger());
    }

    /**
     * Test getServiceKindAsLong() method.
     */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsLong());
    }

    /**
     * Test getServiceKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsLocalDateTime());
    }

    /**
     * Test getServiceKindAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsLocalTime());
    }

    /**
     * Test getServiceKindAsString() method.
     */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsString());
    }

    /**
     * Test getServiceKindAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsBoolean());
    }

    /**
     * Test getServiceKindAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsBigInteger());
    }

    /**
     * Test getServiceKindAsURL() method.
     */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindAsURL());
    }

    /**
     * Test getServiceKindStringAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsInteger());
    }

    /**
     * Test getServiceKindStringAsLong() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsLong());
    }

    /**
     * Test getServiceKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsLocalDateTime());
    }

    /**
     * Test getServiceKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsLocalTime());
    }

    /**
     * Test getServiceKindStringAsString() method.
     */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsString());
    }

    /**
     * Test getServiceKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsBoolean());
    }

    /**
     * Test getServiceKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsBigInteger());
    }

    /**
     * Test getServiceKindStringAsURL() method.
     */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getServiceKindStringAsURL());
    }

    /**
     * Test getSourceDurationAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsInteger());
    }

    /**
     * Test getSourceDurationAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsLong());
    }

    /**
     * Test getSourceDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsLocalDateTime());
    }

    /**
     * Test getSourceDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsLocalTime());
    }

    /**
     * Test getSourceDurationAsString() method.
     */
    @Test
    public void subTestGetSourceDurationAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsString());
    }

    /**
     * Test getSourceDurationAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsBoolean());
    }

    /**
     * Test getSourceDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsBigInteger());
    }

    /**
     * Test getSourceDurationAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationAsURL());
    }

    /**
     * Test getSourceDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsInteger());
    }

    /**
     * Test getSourceDurationStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsLong());
    }

    /**
     * Test getSourceDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsLocalTime());
    }

    /**
     * Test getSourceDurationStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsString());
    }

    /**
     * Test getSourceDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsBoolean());
    }

    /**
     * Test getSourceDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsBigInteger());
    }

    /**
     * Test getSourceDurationStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationStringAsURL());
    }

    /**
     * Test getSourceDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsInteger());
    }

    /**
     * Test getSourceDurationString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsLong());
    }

    /**
     * Test getSourceDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsLocalTime());
    }

    /**
     * Test getSourceDurationString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsString());
    }

    /**
     * Test getSourceDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsBoolean());
    }

    /**
     * Test getSourceDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsBigInteger());
    }

    /**
     * Test getSourceDurationString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString1AsURL());
    }

    /**
     * Test getSourceDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsInteger());
    }

    /**
     * Test getSourceDurationString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsLong());
    }

    /**
     * Test getSourceDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsLocalTime());
    }

    /**
     * Test getSourceDurationString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsString());
    }

    /**
     * Test getSourceDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsBoolean());
    }

    /**
     * Test getSourceDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsBigInteger());
    }

    /**
     * Test getSourceDurationString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString2AsURL());
    }

    /**
     * Test getSourceDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsInteger());
    }

    /**
     * Test getSourceDurationString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsLong());
    }

    /**
     * Test getSourceDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsLocalTime());
    }

    /**
     * Test getSourceDurationString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsString());
    }

    /**
     * Test getSourceDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsBoolean());
    }

    /**
     * Test getSourceDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsBigInteger());
    }

    /**
     * Test getSourceDurationString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString3AsURL());
    }

    /**
     * Test getSourceDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsInteger());
    }

    /**
     * Test getSourceDurationString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsLong());
    }

    /**
     * Test getSourceDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsLocalTime());
    }

    /**
     * Test getSourceDurationString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsString());
    }

    /**
     * Test getSourceDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsBoolean());
    }

    /**
     * Test getSourceDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsBigInteger());
    }

    /**
     * Test getSourceDurationString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString4AsURL());
    }

    /**
     * Test getSourceDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsInteger());
    }

    /**
     * Test getSourceDurationString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsLong());
    }

    /**
     * Test getSourceDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsLocalTime());
    }

    /**
     * Test getSourceDurationString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsString());
    }

    /**
     * Test getSourceDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsBoolean());
    }

    /**
     * Test getSourceDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsBigInteger());
    }

    /**
     * Test getSourceDurationString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationString5AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsLong());
    }

    /**
     * Test getSourceDurationFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameAsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsString());
    }

    /**
     * Test getSourceDurationFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameAsURL());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsLong());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsString());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameStringAsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString1AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString2AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString3AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString4AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationFirstFrameString5AsURL());
    }

    /**
     * Test getSourceDurationLastFrameAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsInteger());
    }

    /**
     * Test getSourceDurationLastFrameAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsLong());
    }

    /**
     * Test getSourceDurationLastFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameAsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsString());
    }

    /**
     * Test getSourceDurationLastFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameAsURL());
    }

    /**
     * Test getSourceDurationLastFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsInteger());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsLong());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsString());
    }

    /**
     * Test getSourceDurationLastFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameStringAsURL());
    }

    /**
     * Test getSourceDurationLastFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsString());
    }

    /**
     * Test getSourceDurationLastFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString1AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsString());
    }

    /**
     * Test getSourceDurationLastFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString2AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsString());
    }

    /**
     * Test getSourceDurationLastFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString3AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsString());
    }

    /**
     * Test getSourceDurationLastFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString4AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsString());
    }

    /**
     * Test getSourceDurationLastFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceDurationLastFrameString5AsURL());
    }

    /**
     * Test getSourceFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsInteger());
    }

    /**
     * Test getSourceFrameCountAsLong() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsLong());
    }

    /**
     * Test getSourceFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsLocalDateTime());
    }

    /**
     * Test getSourceFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsLocalTime());
    }

    /**
     * Test getSourceFrameCountAsString() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsString());
    }

    /**
     * Test getSourceFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsBoolean());
    }

    /**
     * Test getSourceFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsBigInteger());
    }

    /**
     * Test getSourceFrameCountAsURL() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceFrameCountAsURL());
    }

    /**
     * Test getSourceStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsInteger());
    }

    /**
     * Test getSourceStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsLong());
    }

    /**
     * Test getSourceStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsString());
    }

    /**
     * Test getSourceStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsBoolean());
    }

    /**
     * Test getSourceStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeAsURL());
    }

    /**
     * Test getSourceStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsInteger());
    }

    /**
     * Test getSourceStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsLong());
    }

    /**
     * Test getSourceStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsString());
    }

    /**
     * Test getSourceStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsBoolean());
    }

    /**
     * Test getSourceStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeStringAsURL());
    }

    /**
     * Test getSourceStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsInteger());
    }

    /**
     * Test getSourceStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsLong());
    }

    /**
     * Test getSourceStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsString());
    }

    /**
     * Test getSourceStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString1AsURL());
    }

    /**
     * Test getSourceStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsInteger());
    }

    /**
     * Test getSourceStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsLong());
    }

    /**
     * Test getSourceStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsString());
    }

    /**
     * Test getSourceStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString2AsURL());
    }

    /**
     * Test getSourceStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsInteger());
    }

    /**
     * Test getSourceStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsLong());
    }

    /**
     * Test getSourceStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsString());
    }

    /**
     * Test getSourceStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString3AsURL());
    }

    /**
     * Test getSourceStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsInteger());
    }

    /**
     * Test getSourceStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsLong());
    }

    /**
     * Test getSourceStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsString());
    }

    /**
     * Test getSourceStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString4AsURL());
    }

    /**
     * Test getSourceStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsInteger());
    }

    /**
     * Test getSourceStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsLong());
    }

    /**
     * Test getSourceStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsString());
    }

    /**
     * Test getSourceStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeString5AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedStringAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString1AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString2AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString3AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString4AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedString5AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeEncodedProportionAsURL());
    }

    /**
     * Test getSourceStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsInteger());
    }

    /**
     * Test getSourceStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsLong());
    }

    /**
     * Test getSourceStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsString());
    }

    /**
     * Test getSourceStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsBoolean());
    }

    /**
     * Test getSourceStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getSourceStreamSizeProportionAsURL());
    }

    /**
     * Test getStandardAsInteger() method.
     */
    @Test
    public void subTestGetStandardAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsInteger());
    }

    /**
     * Test getStandardAsLong() method.
     */
    @Test
    public void subTestGetStandardAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsLong());
    }

    /**
     * Test getStandardAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStandardAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsLocalDateTime());
    }

    /**
     * Test getStandardAsLocalTime() method.
     */
    @Test
    public void subTestGetStandardAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsLocalTime());
    }

    /**
     * Test getStandardAsString() method.
     */
    @Test
    public void subTestGetStandardAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsString());
    }

    /**
     * Test getStandardAsBoolean() method.
     */
    @Test
    public void subTestGetStandardAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsBoolean());
    }

    /**
     * Test getStandardAsBigInteger() method.
     */
    @Test
    public void subTestGetStandardAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsBigInteger());
    }

    /**
     * Test getStandardAsURL() method.
     */
    @Test
    public void subTestGetStandardAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStandardAsURL());
    }

    /**
     * Test getStatusAsInteger() method.
     */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsInteger());
    }

    /**
     * Test getStatusAsLong() method.
     */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsLong());
    }

    /**
     * Test getStatusAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsLocalDateTime());
    }

    /**
     * Test getStatusAsLocalTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsLocalTime());
    }

    /**
     * Test getStatusAsString() method.
     */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStatusAsString());
    }

    /**
     * Test getStatusAsBoolean() method.
     */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsBoolean());
    }

    /**
     * Test getStatusAsBigInteger() method.
     */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsBigInteger());
    }

    /**
     * Test getStatusAsURL() method.
     */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStatusAsURL());
    }

    /**
     * Test getStoredHeightAsInteger() method.
     */
    @Test
    public void subTestGetStoredHeightAsInteger() {
        assertEquals(Integer.valueOf(880), JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsInteger());
    }

    /**
     * Test getStoredHeightAsLong() method.
     */
    @Test
    public void subTestGetStoredHeightAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsLong());
    }

    /**
     * Test getStoredHeightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStoredHeightAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsLocalDateTime());
    }

    /**
     * Test getStoredHeightAsLocalTime() method.
     */
    @Test
    public void subTestGetStoredHeightAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsLocalTime());
    }

    /**
     * Test getStoredHeightAsString() method.
     */
    @Test
    public void subTestGetStoredHeightAsString() {
        assertEquals("880", JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsString());
    }

    /**
     * Test getStoredHeightAsBoolean() method.
     */
    @Test
    public void subTestGetStoredHeightAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsBoolean());
    }

    /**
     * Test getStoredHeightAsBigInteger() method.
     */
    @Test
    public void subTestGetStoredHeightAsBigInteger() {
        assertEquals(BigInteger.valueOf(880), JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsBigInteger());
    }

    /**
     * Test getStoredHeightAsURL() method.
     */
    @Test
    public void subTestGetStoredHeightAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredHeightAsURL());
    }

    /**
     * Test getStoredWidthAsInteger() method.
     */
    @Test
    public void subTestGetStoredWidthAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsInteger());
    }

    /**
     * Test getStoredWidthAsLong() method.
     */
    @Test
    public void subTestGetStoredWidthAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsLong());
    }

    /**
     * Test getStoredWidthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStoredWidthAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsLocalDateTime());
    }

    /**
     * Test getStoredWidthAsLocalTime() method.
     */
    @Test
    public void subTestGetStoredWidthAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsLocalTime());
    }

    /**
     * Test getStoredWidthAsString() method.
     */
    @Test
    public void subTestGetStoredWidthAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsString());
    }

    /**
     * Test getStoredWidthAsBoolean() method.
     */
    @Test
    public void subTestGetStoredWidthAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsBoolean());
    }

    /**
     * Test getStoredWidthAsBigInteger() method.
     */
    @Test
    public void subTestGetStoredWidthAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsBigInteger());
    }

    /**
     * Test getStoredWidthAsURL() method.
     */
    @Test
    public void subTestGetStoredWidthAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStoredWidthAsURL());
    }

    /**
     * Test getStreamCountAsInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsInteger());
    }

    /**
     * Test getStreamCountAsLong() method.
     */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsLong());
    }

    /**
     * Test getStreamCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsLocalDateTime());
    }

    /**
     * Test getStreamCountAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsLocalTime());
    }

    /**
     * Test getStreamCountAsString() method.
     */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsString());
    }

    /**
     * Test getStreamCountAsBoolean() method.
     */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsBoolean());
    }

    /**
     * Test getStreamCountAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsBigInteger());
    }

    /**
     * Test getStreamCountAsURL() method.
     */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamCountAsURL());
    }

    /**
     * Test getStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsInteger());
    }

    /**
     * Test getStreamKindAsLong() method.
     */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsLong());
    }

    /**
     * Test getStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsLocalDateTime());
    }

    /**
     * Test getStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsLocalTime());
    }

    /**
     * Test getStreamKindAsString() method.
     */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals("Video", JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsString());
    }

    /**
     * Test getStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsBoolean());
    }

    /**
     * Test getStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsBigInteger());
    }

    /**
     * Test getStreamKindAsURL() method.
     */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindAsURL());
    }

    /**
     * Test getStreamKindStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsInteger());
    }

    /**
     * Test getStreamKindStringAsLong() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsLong());
    }

    /**
     * Test getStreamKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsLocalDateTime());
    }

    /**
     * Test getStreamKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsLocalTime());
    }

    /**
     * Test getStreamKindStringAsString() method.
     */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsString());
    }

    /**
     * Test getStreamKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsBoolean());
    }

    /**
     * Test getStreamKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsBigInteger());
    }

    /**
     * Test getStreamKindStringAsURL() method.
     */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindStringAsURL());
    }

    /**
     * Test getStreamKindIDAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsInteger());
    }

    /**
     * Test getStreamKindIDAsLong() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsLong());
    }

    /**
     * Test getStreamKindIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsLocalDateTime());
    }

    /**
     * Test getStreamKindIDAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsLocalTime());
    }

    /**
     * Test getStreamKindIDAsString() method.
     */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals("0", JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsString());
    }

    /**
     * Test getStreamKindIDAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsBoolean());
    }

    /**
     * Test getStreamKindIDAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsBigInteger());
    }

    /**
     * Test getStreamKindIDAsURL() method.
     */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindIDAsURL());
    }

    /**
     * Test getStreamKindPosAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsInteger());
    }

    /**
     * Test getStreamKindPosAsLong() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsLong());
    }

    /**
     * Test getStreamKindPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsLocalDateTime());
    }

    /**
     * Test getStreamKindPosAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsLocalTime());
    }

    /**
     * Test getStreamKindPosAsString() method.
     */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsString());
    }

    /**
     * Test getStreamKindPosAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsBoolean());
    }

    /**
     * Test getStreamKindPosAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsBigInteger());
    }

    /**
     * Test getStreamKindPosAsURL() method.
     */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamKindPosAsURL());
    }

    /**
     * Test getStreamOrderAsInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsInteger());
    }

    /**
     * Test getStreamOrderAsLong() method.
     */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(Long.valueOf(0), JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsLong());
    }

    /**
     * Test getStreamOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsLocalDateTime());
    }

    /**
     * Test getStreamOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsLocalTime());
    }

    /**
     * Test getStreamOrderAsString() method.
     */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsString());
    }

    /**
     * Test getStreamOrderAsBoolean() method.
     */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsBoolean());
    }

    /**
     * Test getStreamOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsBigInteger());
    }

    /**
     * Test getStreamOrderAsURL() method.
     */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamOrderAsURL());
    }

    /**
     * Test getStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsInteger());
    }

    /**
     * Test getStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsLong());
    }

    /**
     * Test getStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsLocalDateTime());
    }

    /**
     * Test getStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsLocalTime());
    }

    /**
     * Test getStreamSizeAsString() method.
     */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsString());
    }

    /**
     * Test getStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsBoolean());
    }

    /**
     * Test getStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsBigInteger());
    }

    /**
     * Test getStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeAsURL());
    }

    /**
     * Test getStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsInteger());
    }

    /**
     * Test getStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsLong());
    }

    /**
     * Test getStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsLocalTime());
    }

    /**
     * Test getStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsString());
    }

    /**
     * Test getStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsBoolean());
    }

    /**
     * Test getStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsBigInteger());
    }

    /**
     * Test getStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeStringAsURL());
    }

    /**
     * Test getStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsInteger());
    }

    /**
     * Test getStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsLong());
    }

    /**
     * Test getStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsLocalTime());
    }

    /**
     * Test getStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsString());
    }

    /**
     * Test getStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsBoolean());
    }

    /**
     * Test getStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsBigInteger());
    }

    /**
     * Test getStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString1AsURL());
    }

    /**
     * Test getStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsInteger());
    }

    /**
     * Test getStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsLong());
    }

    /**
     * Test getStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsLocalTime());
    }

    /**
     * Test getStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsString());
    }

    /**
     * Test getStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsBoolean());
    }

    /**
     * Test getStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsBigInteger());
    }

    /**
     * Test getStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString2AsURL());
    }

    /**
     * Test getStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsInteger());
    }

    /**
     * Test getStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsLong());
    }

    /**
     * Test getStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsLocalTime());
    }

    /**
     * Test getStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsString());
    }

    /**
     * Test getStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsBoolean());
    }

    /**
     * Test getStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsBigInteger());
    }

    /**
     * Test getStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString3AsURL());
    }

    /**
     * Test getStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsInteger());
    }

    /**
     * Test getStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsLong());
    }

    /**
     * Test getStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsLocalTime());
    }

    /**
     * Test getStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsString());
    }

    /**
     * Test getStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsBoolean());
    }

    /**
     * Test getStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsBigInteger());
    }

    /**
     * Test getStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString4AsURL());
    }

    /**
     * Test getStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsInteger());
    }

    /**
     * Test getStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsLong());
    }

    /**
     * Test getStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsLocalTime());
    }

    /**
     * Test getStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsString());
    }

    /**
     * Test getStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsBoolean());
    }

    /**
     * Test getStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsBigInteger());
    }

    /**
     * Test getStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeString5AsURL());
    }

    /**
     * Test getStreamSizeDemuxedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsLong());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsString());
    }

    /**
     * Test getStreamSizeDemuxedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedAsURL());
    }

    /**
     * Test getStreamSizeDemuxedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsLong());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsString());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedStringAsURL());
    }

    /**
     * Test getStreamSizeDemuxedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsString());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString1AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsString());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsString());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString3AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsString());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString4AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsString());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeDemuxedString5AsURL());
    }

    /**
     * Test getStreamSizeEncodedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsInteger());
    }

    /**
     * Test getStreamSizeEncodedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsLong());
    }

    /**
     * Test getStreamSizeEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsString());
    }

    /**
     * Test getStreamSizeEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedAsURL());
    }

    /**
     * Test getStreamSizeEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsInteger());
    }

    /**
     * Test getStreamSizeEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsLong());
    }

    /**
     * Test getStreamSizeEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsString());
    }

    /**
     * Test getStreamSizeEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedStringAsURL());
    }

    /**
     * Test getStreamSizeEncodedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsLong());
    }

    /**
     * Test getStreamSizeEncodedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsString());
    }

    /**
     * Test getStreamSizeEncodedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString1AsURL());
    }

    /**
     * Test getStreamSizeEncodedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsLong());
    }

    /**
     * Test getStreamSizeEncodedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsString());
    }

    /**
     * Test getStreamSizeEncodedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString2AsURL());
    }

    /**
     * Test getStreamSizeEncodedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsLong());
    }

    /**
     * Test getStreamSizeEncodedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsString());
    }

    /**
     * Test getStreamSizeEncodedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString3AsURL());
    }

    /**
     * Test getStreamSizeEncodedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsLong());
    }

    /**
     * Test getStreamSizeEncodedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsString());
    }

    /**
     * Test getStreamSizeEncodedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString4AsURL());
    }

    /**
     * Test getStreamSizeEncodedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsLong());
    }

    /**
     * Test getStreamSizeEncodedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsString());
    }

    /**
     * Test getStreamSizeEncodedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedString5AsURL());
    }

    /**
     * Test getStreamSizeEncodedProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsInteger());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsLong());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsString());
    }

    /**
     * Test getStreamSizeEncodedProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeEncodedProportionAsURL());
    }

    /**
     * Test getStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsInteger());
    }

    /**
     * Test getStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsLong());
    }

    /**
     * Test getStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsString());
    }

    /**
     * Test getStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsBoolean());
    }

    /**
     * Test getStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getStreamSizeProportionAsURL());
    }

    /**
     * Test getTaggedDateAsInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsInteger());
    }

    /**
     * Test getTaggedDateAsLong() method.
     */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsLong());
    }

    /**
     * Test getTaggedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsLocalDateTime());
    }

    /**
     * Test getTaggedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsLocalTime());
    }

    /**
     * Test getTaggedDateAsString() method.
     */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsString());
    }

    /**
     * Test getTaggedDateAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsBoolean());
    }

    /**
     * Test getTaggedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsBigInteger());
    }

    /**
     * Test getTaggedDateAsURL() method.
     */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTaggedDateAsURL());
    }

    /**
     * Test getTimeCodeFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsInteger());
    }

    /**
     * Test getTimeCodeFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsLong());
    }

    /**
     * Test getTimeCodeFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsLocalDateTime());
    }

    /**
     * Test getTimeCodeFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsLocalTime());
    }

    /**
     * Test getTimeCodeFirstFrameAsString() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsString());
    }

    /**
     * Test getTimeCodeFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsBoolean());
    }

    /**
     * Test getTimeCodeFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsBigInteger());
    }

    /**
     * Test getTimeCodeFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetTimeCodeFirstFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeFirstFrameAsURL());
    }

    /**
     * Test getTimeCodeSettingsAsInteger() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsInteger());
    }

    /**
     * Test getTimeCodeSettingsAsLong() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsLong());
    }

    /**
     * Test getTimeCodeSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsLocalDateTime());
    }

    /**
     * Test getTimeCodeSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsLocalTime());
    }

    /**
     * Test getTimeCodeSettingsAsString() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsString());
    }

    /**
     * Test getTimeCodeSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsBoolean());
    }

    /**
     * Test getTimeCodeSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsBigInteger());
    }

    /**
     * Test getTimeCodeSettingsAsURL() method.
     */
    @Test
    public void subTestGetTimeCodeSettingsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSettingsAsURL());
    }

    /**
     * Test getTimeCodeSourceAsInteger() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsInteger());
    }

    /**
     * Test getTimeCodeSourceAsLong() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsLong());
    }

    /**
     * Test getTimeCodeSourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsLocalDateTime());
    }

    /**
     * Test getTimeCodeSourceAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsLocalTime());
    }

    /**
     * Test getTimeCodeSourceAsString() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsString());
    }

    /**
     * Test getTimeCodeSourceAsBoolean() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsBoolean());
    }

    /**
     * Test getTimeCodeSourceAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsBigInteger());
    }

    /**
     * Test getTimeCodeSourceAsURL() method.
     */
    @Test
    public void subTestGetTimeCodeSourceAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeCodeSourceAsURL());
    }

    /**
     * Test getTimeStampFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsInteger());
    }

    /**
     * Test getTimeStampFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsLong());
    }

    /**
     * Test getTimeStampFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameAsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsString());
    }

    /**
     * Test getTimeStampFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameAsURL());
    }

    /**
     * Test getTimeStampFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsInteger());
    }

    /**
     * Test getTimeStampFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsLong());
    }

    /**
     * Test getTimeStampFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsString());
    }

    /**
     * Test getTimeStampFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameStringAsURL());
    }

    /**
     * Test getTimeStampFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsInteger());
    }

    /**
     * Test getTimeStampFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsLong());
    }

    /**
     * Test getTimeStampFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsString());
    }

    /**
     * Test getTimeStampFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString1AsURL());
    }

    /**
     * Test getTimeStampFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsInteger());
    }

    /**
     * Test getTimeStampFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsLong());
    }

    /**
     * Test getTimeStampFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsString());
    }

    /**
     * Test getTimeStampFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString2AsURL());
    }

    /**
     * Test getTimeStampFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsInteger());
    }

    /**
     * Test getTimeStampFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsLong());
    }

    /**
     * Test getTimeStampFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsString());
    }

    /**
     * Test getTimeStampFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString3AsURL());
    }

    /**
     * Test getTimeStampFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsInteger());
    }

    /**
     * Test getTimeStampFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsLong());
    }

    /**
     * Test getTimeStampFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsString());
    }

    /**
     * Test getTimeStampFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString4AsURL());
    }

    /**
     * Test getTimeStampFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsInteger());
    }

    /**
     * Test getTimeStampFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsLong());
    }

    /**
     * Test getTimeStampFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getTimeStampFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsLocalTime());
    }

    /**
     * Test getTimeStampFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsString());
    }

    /**
     * Test getTimeStampFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsBoolean());
    }

    /**
     * Test getTimeStampFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsBigInteger());
    }

    /**
     * Test getTimeStampFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetTimeStampFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTimeStampFirstFrameString5AsURL());
    }

    /**
     * Test getTitleAsInteger() method.
     */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsInteger());
    }

    /**
     * Test getTitleAsLong() method.
     */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsLong());
    }

    /**
     * Test getTitleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsLocalDateTime());
    }

    /**
     * Test getTitleAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsLocalTime());
    }

    /**
     * Test getTitleAsString() method.
     */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals("Sintel", JMetaDataVideo_Test.jMetaDataVideo.getTitleAsString());
    }

    /**
     * Test getTitleAsBoolean() method.
     */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsBoolean());
    }

    /**
     * Test getTitleAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsBigInteger());
    }

    /**
     * Test getTitleAsURL() method.
     */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getTitleAsURL());
    }

    /**
     * Test gettransfercharacteristicsAsInteger() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsInteger());
    }

    /**
     * Test gettransfercharacteristicsAsLong() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsLong() {
        assertEquals(Long.valueOf(709), JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsLong());
    }

    /**
     * Test gettransfercharacteristicsAsLocalDateTime() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsLocalDateTime());
    }

    /**
     * Test gettransfercharacteristicsAsLocalTime() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsLocalTime());
    }

    /**
     * Test gettransfercharacteristicsAsString() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsString() {
        assertEquals("BT.709", JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsString());
    }

    /**
     * Test gettransfercharacteristicsAsBoolean() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsBoolean());
    }

    /**
     * Test gettransfercharacteristicsAsBigInteger() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsBigInteger());
    }

    /**
     * Test gettransfercharacteristicsAsURL() method.
     */
    @Test
    public void subTestGettransfercharacteristicsAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsAsURL());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsInteger() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsInteger());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsLong() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsLong());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsLocalDateTime());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsLocalTime());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsString() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsString());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsBoolean() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsBoolean());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsBigInteger());
    }

    /**
     * Test gettransfercharacteristicsOriginalAsURL() method.
     */
    @Test
    public void subTestGettransfercharacteristicsOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.gettransfercharacteristicsOriginalAsURL());
    }

    /**
     * Test getUniqueIDAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsInteger());
    }

    /**
     * Test getUniqueIDAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(new Long("1940764431286751011"), JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsLong());
    }

    /**
     * Test getUniqueIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsLocalDateTime());
    }

    /**
     * Test getUniqueIDAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsLocalTime());
    }

    /**
     * Test getUniqueIDAsString() method.
     */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals("1940764431286751011", JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsString());
    }

    /**
     * Test getUniqueIDAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsBoolean());
    }

    /**
     * Test getUniqueIDAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsBigInteger());
    }

    /**
     * Test getUniqueIDAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDAsURL());
    }

    /**
     * Test getUniqueIDStringAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsInteger());
    }

    /**
     * Test getUniqueIDStringAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsLong());
    }

    /**
     * Test getUniqueIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsLocalDateTime());
    }

    /**
     * Test getUniqueIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsLocalTime());
    }

    /**
     * Test getUniqueIDStringAsString() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsString());
    }

    /**
     * Test getUniqueIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsBoolean());
    }

    /**
     * Test getUniqueIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsBigInteger());
    }

    /**
     * Test getUniqueIDStringAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getUniqueIDStringAsURL());
    }

    /**
     * Test getWidthAsInteger() method.
     */
    @Test
    public void subTestGetWidthAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsInteger());
    }

    /**
     * Test getWidthAsLong() method.
     */
    @Test
    public void subTestGetWidthAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsLong());
    }

    /**
     * Test getWidthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsLocalDateTime());
    }

    /**
     * Test getWidthAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsLocalTime());
    }

    /**
     * Test getWidthAsString() method.
     */
    @Test
    public void subTestGetWidthAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsString());
    }

    /**
     * Test getWidthAsBoolean() method.
     */
    @Test
    public void subTestGetWidthAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsBoolean());
    }

    /**
     * Test getWidthAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthAsBigInteger() {
        assertEquals(BigInteger.valueOf(1920), JMetaDataVideo_Test.jMetaDataVideo.getWidthAsBigInteger());
    }

    /**
     * Test getWidthAsURL() method.
     */
    @Test
    public void subTestGetWidthAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthAsURL());
    }

    /**
     * Test getWidthStringAsInteger() method.
     */
    @Test
    public void subTestGetWidthStringAsInteger() {
        assertEquals(Integer.valueOf(1920), JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsInteger());
    }

    /**
     * Test getWidthStringAsLong() method.
     */
    @Test
    public void subTestGetWidthStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsLong());
    }

    /**
     * Test getWidthStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsLocalDateTime());
    }

    /**
     * Test getWidthStringAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsLocalTime());
    }

    /**
     * Test getWidthStringAsString() method.
     */
    @Test
    public void subTestGetWidthStringAsString() {
        assertEquals("1 920 pixels", JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsString());
    }

    /**
     * Test getWidthStringAsBoolean() method.
     */
    @Test
    public void subTestGetWidthStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsBoolean());
    }

    /**
     * Test getWidthStringAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsBigInteger());
    }

    /**
     * Test getWidthStringAsURL() method.
     */
    @Test
    public void subTestGetWidthStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthStringAsURL());
    }

    /**
     * Test getWidthCleanApertureAsInteger() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsInteger());
    }

    /**
     * Test getWidthCleanApertureAsLong() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsLong());
    }

    /**
     * Test getWidthCleanApertureAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsLocalDateTime());
    }

    /**
     * Test getWidthCleanApertureAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsLocalTime());
    }

    /**
     * Test getWidthCleanApertureAsString() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsString());
    }

    /**
     * Test getWidthCleanApertureAsBoolean() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsBoolean());
    }

    /**
     * Test getWidthCleanApertureAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsBigInteger());
    }

    /**
     * Test getWidthCleanApertureAsURL() method.
     */
    @Test
    public void subTestGetWidthCleanApertureAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureAsURL());
    }

    /**
     * Test getWidthCleanApertureStringAsInteger() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsInteger());
    }

    /**
     * Test getWidthCleanApertureStringAsLong() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsLong());
    }

    /**
     * Test getWidthCleanApertureStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsLocalDateTime());
    }

    /**
     * Test getWidthCleanApertureStringAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsLocalTime());
    }

    /**
     * Test getWidthCleanApertureStringAsString() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsString());
    }

    /**
     * Test getWidthCleanApertureStringAsBoolean() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsBoolean());
    }

    /**
     * Test getWidthCleanApertureStringAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsBigInteger());
    }

    /**
     * Test getWidthCleanApertureStringAsURL() method.
     */
    @Test
    public void subTestGetWidthCleanApertureStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthCleanApertureStringAsURL());
    }

    /**
     * Test getWidthOffsetAsInteger() method.
     */
    @Test
    public void subTestGetWidthOffsetAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsInteger());
    }

    /**
     * Test getWidthOffsetAsLong() method.
     */
    @Test
    public void subTestGetWidthOffsetAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsLong());
    }

    /**
     * Test getWidthOffsetAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthOffsetAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsLocalDateTime());
    }

    /**
     * Test getWidthOffsetAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthOffsetAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsLocalTime());
    }

    /**
     * Test getWidthOffsetAsString() method.
     */
    @Test
    public void subTestGetWidthOffsetAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsString());
    }

    /**
     * Test getWidthOffsetAsBoolean() method.
     */
    @Test
    public void subTestGetWidthOffsetAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsBoolean());
    }

    /**
     * Test getWidthOffsetAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthOffsetAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsBigInteger());
    }

    /**
     * Test getWidthOffsetAsURL() method.
     */
    @Test
    public void subTestGetWidthOffsetAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetAsURL());
    }

    /**
     * Test getWidthOffsetStringAsInteger() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsInteger());
    }

    /**
     * Test getWidthOffsetStringAsLong() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsLong());
    }

    /**
     * Test getWidthOffsetStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsLocalDateTime());
    }

    /**
     * Test getWidthOffsetStringAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsLocalTime());
    }

    /**
     * Test getWidthOffsetStringAsString() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsString());
    }

    /**
     * Test getWidthOffsetStringAsBoolean() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsBoolean());
    }

    /**
     * Test getWidthOffsetStringAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsBigInteger());
    }

    /**
     * Test getWidthOffsetStringAsURL() method.
     */
    @Test
    public void subTestGetWidthOffsetStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOffsetStringAsURL());
    }

    /**
     * Test getWidthOriginalAsInteger() method.
     */
    @Test
    public void subTestGetWidthOriginalAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsInteger());
    }

    /**
     * Test getWidthOriginalAsLong() method.
     */
    @Test
    public void subTestGetWidthOriginalAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsLong());
    }

    /**
     * Test getWidthOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsLocalDateTime());
    }

    /**
     * Test getWidthOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthOriginalAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsLocalTime());
    }

    /**
     * Test getWidthOriginalAsString() method.
     */
    @Test
    public void subTestGetWidthOriginalAsString() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsString());
    }

    /**
     * Test getWidthOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetWidthOriginalAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsBoolean());
    }

    /**
     * Test getWidthOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthOriginalAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsBigInteger());
    }

    /**
     * Test getWidthOriginalAsURL() method.
     */
    @Test
    public void subTestGetWidthOriginalAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalAsURL());
    }

    /**
     * Test getWidthOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsInteger());
    }

    /**
     * Test getWidthOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsLong() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsLong());
    }

    /**
     * Test getWidthOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsLocalDateTime());
    }

    /**
     * Test getWidthOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsLocalTime());
    }

    /**
     * Test getWidthOriginalStringAsString() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsString() {
        assertEquals("", JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsString());
    }

    /**
     * Test getWidthOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsBoolean());
    }

    /**
     * Test getWidthOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsBigInteger());
    }

    /**
     * Test getWidthOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetWidthOriginalStringAsURL() {
        assertEquals(null, JMetaDataVideo_Test.jMetaDataVideo.getWidthOriginalStringAsURL());
    }

}
