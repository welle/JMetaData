package aka.jmetadata.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataText;

/**
 * This class contains tests methods for Text informations of a specific Text stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataText_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataText_Test.class.getName());

    private static JMetaDataText jMetaDataText;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataAudio_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("Sintel_DivXPlus_6500kbps.mkv").toURI());
            if (jMetaData.open(file)) {
                @NonNull
                final List<@NonNull JMetaDataText> textStreams = jMetaData.getSubtitleStreams();
                if (textStreams.get(0) != null) {
                    jMetaDataText = textStreams.get(0);
                }
            }
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
     * Test getAlternateGroupAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsInteger());
    }

    /**
     * Test getAlternateGroupAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsLong());
    }

    /**
     * Test getAlternateGroupAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsLocalTime());
    }

    /**
     * Test getAlternateGroupAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getAlternateGroupAsString());
    }

    /**
     * Test getAlternateGroupAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsBoolean());
    }

    /**
     * Test getAlternateGroupAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsBigInteger());
    }

    /**
     * Test getAlternateGroupAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupAsURL());
    }

    /**
     * Test getAlternateGroupStringAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsInteger());
    }

    /**
     * Test getAlternateGroupStringAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsLong());
    }

    /**
     * Test getAlternateGroupStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsLocalTime());
    }

    /**
     * Test getAlternateGroupStringAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsString());
    }

    /**
     * Test getAlternateGroupStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsBoolean());
    }

    /**
     * Test getAlternateGroupStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsBigInteger());
    }

    /**
     * Test getAlternateGroupStringAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getAlternateGroupStringAsURL());
    }

    /**
     * Test getBitDepthAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsInteger());
    }

    /**
     * Test getBitDepthAsLong() method.
     */
    @Test
    public void subTestGetBitDepthAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsLong());
    }

    /**
     * Test getBitDepthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsLocalDateTime());
    }

    /**
     * Test getBitDepthAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsLocalTime());
    }

    /**
     * Test getBitDepthAsString() method.
     */
    @Test
    public void subTestGetBitDepthAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitDepthAsString());
    }

    /**
     * Test getBitDepthAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsBoolean());
    }

    /**
     * Test getBitDepthAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsBigInteger());
    }

    /**
     * Test getBitDepthAsURL() method.
     */
    @Test
    public void subTestGetBitDepthAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthAsURL());
    }

    /**
     * Test getBitDepthStringAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsInteger());
    }

    /**
     * Test getBitDepthStringAsLong() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsLong());
    }

    /**
     * Test getBitDepthStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsLocalDateTime());
    }

    /**
     * Test getBitDepthStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsLocalTime());
    }

    /**
     * Test getBitDepthStringAsString() method.
     */
    @Test
    public void subTestGetBitDepthStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitDepthStringAsString());
    }

    /**
     * Test getBitDepthStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsBoolean());
    }

    /**
     * Test getBitDepthStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsBigInteger());
    }

    /**
     * Test getBitDepthStringAsURL() method.
     */
    @Test
    public void subTestGetBitDepthStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitDepthStringAsURL());
    }

    /**
     * Test getBitRateAsInteger() method.
     */
    @Test
    public void subTestGetBitRateAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsInteger());
    }

    /**
     * Test getBitRateAsLong() method.
     */
    @Test
    public void subTestGetBitRateAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsLong());
    }

    /**
     * Test getBitRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsLocalDateTime());
    }

    /**
     * Test getBitRateAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsLocalTime());
    }

    /**
     * Test getBitRateAsString() method.
     */
    @Test
    public void subTestGetBitRateAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateAsString());
    }

    /**
     * Test getBitRateAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsBoolean());
    }

    /**
     * Test getBitRateAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsBigInteger());
    }

    /**
     * Test getBitRateAsURL() method.
     */
    @Test
    public void subTestGetBitRateAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateAsURL());
    }

    /**
     * Test getBitRateStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsInteger());
    }

    /**
     * Test getBitRateStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsLong());
    }

    /**
     * Test getBitRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsLocalDateTime());
    }

    /**
     * Test getBitRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsLocalTime());
    }

    /**
     * Test getBitRateStringAsString() method.
     */
    @Test
    public void subTestGetBitRateStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateStringAsString());
    }

    /**
     * Test getBitRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsBoolean());
    }

    /**
     * Test getBitRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsBigInteger());
    }

    /**
     * Test getBitRateStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateStringAsURL());
    }

    /**
     * Test getBitRateEncodedAsInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsInteger());
    }

    /**
     * Test getBitRateEncodedAsLong() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsLong());
    }

    /**
     * Test getBitRateEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsLocalDateTime());
    }

    /**
     * Test getBitRateEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsLocalTime());
    }

    /**
     * Test getBitRateEncodedAsString() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsString());
    }

    /**
     * Test getBitRateEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsBoolean());
    }

    /**
     * Test getBitRateEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsBigInteger());
    }

    /**
     * Test getBitRateEncodedAsURL() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedAsURL());
    }

    /**
     * Test getBitRateEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsInteger());
    }

    /**
     * Test getBitRateEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsLong());
    }

    /**
     * Test getBitRateEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsLocalDateTime());
    }

    /**
     * Test getBitRateEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsLocalTime());
    }

    /**
     * Test getBitRateEncodedStringAsString() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsString());
    }

    /**
     * Test getBitRateEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsBoolean());
    }

    /**
     * Test getBitRateEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsBigInteger());
    }

    /**
     * Test getBitRateEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateEncodedStringAsURL());
    }

    /**
     * Test getBitRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsInteger());
    }

    /**
     * Test getBitRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsLong());
    }

    /**
     * Test getBitRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsLocalDateTime());
    }

    /**
     * Test getBitRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsLocalTime());
    }

    /**
     * Test getBitRateMaximumAsString() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsString());
    }

    /**
     * Test getBitRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsBoolean());
    }

    /**
     * Test getBitRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsBigInteger());
    }

    /**
     * Test getBitRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumAsURL());
    }

    /**
     * Test getBitRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsInteger());
    }

    /**
     * Test getBitRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsLong());
    }

    /**
     * Test getBitRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getBitRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsLocalTime());
    }

    /**
     * Test getBitRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsString());
    }

    /**
     * Test getBitRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsBoolean());
    }

    /**
     * Test getBitRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsBigInteger());
    }

    /**
     * Test getBitRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMaximumStringAsURL());
    }

    /**
     * Test getBitRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsInteger());
    }

    /**
     * Test getBitRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsLong());
    }

    /**
     * Test getBitRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsLocalDateTime());
    }

    /**
     * Test getBitRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsLocalTime());
    }

    /**
     * Test getBitRateMinimumAsString() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsString());
    }

    /**
     * Test getBitRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsBoolean());
    }

    /**
     * Test getBitRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsBigInteger());
    }

    /**
     * Test getBitRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumAsURL());
    }

    /**
     * Test getBitRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsInteger());
    }

    /**
     * Test getBitRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsLong());
    }

    /**
     * Test getBitRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getBitRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsLocalTime());
    }

    /**
     * Test getBitRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsString());
    }

    /**
     * Test getBitRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsBoolean());
    }

    /**
     * Test getBitRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsBigInteger());
    }

    /**
     * Test getBitRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateMinimumStringAsURL());
    }

    /**
     * Test getBitRateModeAsInteger() method.
     */
    @Test
    public void subTestGetBitRateModeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsInteger());
    }

    /**
     * Test getBitRateModeAsLong() method.
     */
    @Test
    public void subTestGetBitRateModeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsLong());
    }

    /**
     * Test getBitRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsLocalDateTime());
    }

    /**
     * Test getBitRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateModeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsLocalTime());
    }

    /**
     * Test getBitRateModeAsString() method.
     */
    @Test
    public void subTestGetBitRateModeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateModeAsString());
    }

    /**
     * Test getBitRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateModeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsBoolean());
    }

    /**
     * Test getBitRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateModeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsBigInteger());
    }

    /**
     * Test getBitRateModeAsURL() method.
     */
    @Test
    public void subTestGetBitRateModeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeAsURL());
    }

    /**
     * Test getBitRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsInteger());
    }

    /**
     * Test getBitRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsLong());
    }

    /**
     * Test getBitRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsLocalDateTime());
    }

    /**
     * Test getBitRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsLocalTime());
    }

    /**
     * Test getBitRateModeStringAsString() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsString());
    }

    /**
     * Test getBitRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsBoolean());
    }

    /**
     * Test getBitRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsBigInteger());
    }

    /**
     * Test getBitRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateModeStringAsURL());
    }

    /**
     * Test getBitRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsInteger());
    }

    /**
     * Test getBitRateNominalAsLong() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsLong());
    }

    /**
     * Test getBitRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsLocalDateTime());
    }

    /**
     * Test getBitRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsLocalTime());
    }

    /**
     * Test getBitRateNominalAsString() method.
     */
    @Test
    public void subTestGetBitRateNominalAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateNominalAsString());
    }

    /**
     * Test getBitRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateNominalAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsBoolean());
    }

    /**
     * Test getBitRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsBigInteger());
    }

    /**
     * Test getBitRateNominalAsURL() method.
     */
    @Test
    public void subTestGetBitRateNominalAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalAsURL());
    }

    /**
     * Test getBitRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsInteger());
    }

    /**
     * Test getBitRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsLong());
    }

    /**
     * Test getBitRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getBitRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsLocalTime());
    }

    /**
     * Test getBitRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsString());
    }

    /**
     * Test getBitRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsBoolean());
    }

    /**
     * Test getBitRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsBigInteger());
    }

    /**
     * Test getBitRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getBitRateNominalStringAsURL());
    }

    /**
     * Test getChromaSubsamplingAsInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsInteger());
    }

    /**
     * Test getChromaSubsamplingAsLong() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsLong());
    }

    /**
     * Test getChromaSubsamplingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsLocalDateTime());
    }

    /**
     * Test getChromaSubsamplingAsLocalTime() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsLocalTime());
    }

    /**
     * Test getChromaSubsamplingAsString() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsString());
    }

    /**
     * Test getChromaSubsamplingAsBoolean() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsBoolean());
    }

    /**
     * Test getChromaSubsamplingAsBigInteger() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsBigInteger());
    }

    /**
     * Test getChromaSubsamplingAsURL() method.
     */
    @Test
    public void subTestGetChromaSubsamplingAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getChromaSubsamplingAsURL());
    }

    /**
     * Test getCodecIDAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataText_Test.jMetaDataText.getCodecIDAsInteger());
    }

    /**
     * Test getCodecIDAsLong() method.
     */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(Long.valueOf(8), JMetaDataText_Test.jMetaDataText.getCodecIDAsLong());
    }

    /**
     * Test getCodecIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDAsLocalDateTime());
    }

    /**
     * Test getCodecIDAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDAsLocalTime());
    }

    /**
     * Test getCodecIDAsString() method.
     */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals("S_TEXT/UTF8", JMetaDataText_Test.jMetaDataText.getCodecIDAsString());
    }

    /**
     * Test getCodecIDAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDAsBoolean());
    }

    /**
     * Test getCodecIDAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataText_Test.jMetaDataText.getCodecIDAsBigInteger());
    }

    /**
     * Test getCodecIDAsURL() method.
     */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDAsURL());
    }

    /**
     * Test getCodecIDHintAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsInteger());
    }

    /**
     * Test getCodecIDHintAsLong() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsLong());
    }

    /**
     * Test getCodecIDHintAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsLocalDateTime());
    }

    /**
     * Test getCodecIDHintAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsLocalTime());
    }

    /**
     * Test getCodecIDHintAsString() method.
     */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCodecIDHintAsString());
    }

    /**
     * Test getCodecIDHintAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsBoolean());
    }

    /**
     * Test getCodecIDHintAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsBigInteger());
    }

    /**
     * Test getCodecIDHintAsURL() method.
     */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDHintAsURL());
    }

    /**
     * Test getCodecIDInfoAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsInteger());
    }

    /**
     * Test getCodecIDInfoAsLong() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(Long.valueOf(8), JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsLong());
    }

    /**
     * Test getCodecIDInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsLocalDateTime());
    }

    /**
     * Test getCodecIDInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsLocalTime());
    }

    /**
     * Test getCodecIDInfoAsString() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals("UTF-8 Plain Text", JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsString());
    }

    /**
     * Test getCodecIDInfoAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsBoolean());
    }

    /**
     * Test getCodecIDInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsBigInteger());
    }

    /**
     * Test getCodecIDInfoAsURL() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDInfoAsURL());
    }

    /**
     * Test getCodecIDStringAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsInteger());
    }

    /**
     * Test getCodecIDStringAsLong() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsLong());
    }

    /**
     * Test getCodecIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsLocalDateTime());
    }

    /**
     * Test getCodecIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsLocalTime());
    }

    /**
     * Test getCodecIDStringAsString() method.
     */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCodecIDStringAsString());
    }

    /**
     * Test getCodecIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsBoolean());
    }

    /**
     * Test getCodecIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsBigInteger());
    }

    /**
     * Test getCodecIDStringAsURL() method.
     */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDStringAsURL());
    }

    /**
     * Test getCodecIDUrlAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsInteger());
    }

    /**
     * Test getCodecIDUrlAsLong() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsLong());
    }

    /**
     * Test getCodecIDUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsLocalDateTime());
    }

    /**
     * Test getCodecIDUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsLocalTime());
    }

    /**
     * Test getCodecIDUrlAsString() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsString());
    }

    /**
     * Test getCodecIDUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsBoolean());
    }

    /**
     * Test getCodecIDUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsBigInteger());
    }

    /**
     * Test getCodecIDUrlAsURL() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDUrlAsURL());
    }

    /**
     * Test getCodecIDDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsInteger());
    }

    /**
     * Test getCodecIDDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsLong());
    }

    /**
     * Test getCodecIDDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsLocalDateTime());
    }

    /**
     * Test getCodecIDDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsLocalTime());
    }

    /**
     * Test getCodecIDDescriptionAsString() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsString());
    }

    /**
     * Test getCodecIDDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsBoolean());
    }

    /**
     * Test getCodecIDDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsBigInteger());
    }

    /**
     * Test getCodecIDDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCodecIDDescriptionAsURL());
    }

    /**
     * Test getColorSpaceAsInteger() method.
     */
    @Test
    public void subTestGetColorSpaceAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsInteger());
    }

    /**
     * Test getColorSpaceAsLong() method.
     */
    @Test
    public void subTestGetColorSpaceAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsLong());
    }

    /**
     * Test getColorSpaceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetColorSpaceAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsLocalDateTime());
    }

    /**
     * Test getColorSpaceAsLocalTime() method.
     */
    @Test
    public void subTestGetColorSpaceAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsLocalTime());
    }

    /**
     * Test getColorSpaceAsString() method.
     */
    @Test
    public void subTestGetColorSpaceAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getColorSpaceAsString());
    }

    /**
     * Test getColorSpaceAsBoolean() method.
     */
    @Test
    public void subTestGetColorSpaceAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsBoolean());
    }

    /**
     * Test getColorSpaceAsBigInteger() method.
     */
    @Test
    public void subTestGetColorSpaceAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsBigInteger());
    }

    /**
     * Test getColorSpaceAsURL() method.
     */
    @Test
    public void subTestGetColorSpaceAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getColorSpaceAsURL());
    }

    /**
     * Test getCompressionModeAsInteger() method.
     */
    @Test
    public void subTestGetCompressionModeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsInteger());
    }

    /**
     * Test getCompressionModeAsLong() method.
     */
    @Test
    public void subTestGetCompressionModeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsLong());
    }

    /**
     * Test getCompressionModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionModeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsLocalDateTime());
    }

    /**
     * Test getCompressionModeAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionModeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsLocalTime());
    }

    /**
     * Test getCompressionModeAsString() method.
     */
    @Test
    public void subTestGetCompressionModeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCompressionModeAsString());
    }

    /**
     * Test getCompressionModeAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionModeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsBoolean());
    }

    /**
     * Test getCompressionModeAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionModeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsBigInteger());
    }

    /**
     * Test getCompressionModeAsURL() method.
     */
    @Test
    public void subTestGetCompressionModeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeAsURL());
    }

    /**
     * Test getCompressionModeStringAsInteger() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsInteger());
    }

    /**
     * Test getCompressionModeStringAsLong() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsLong());
    }

    /**
     * Test getCompressionModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsLocalDateTime());
    }

    /**
     * Test getCompressionModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsLocalTime());
    }

    /**
     * Test getCompressionModeStringAsString() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsString());
    }

    /**
     * Test getCompressionModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsBoolean());
    }

    /**
     * Test getCompressionModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsBigInteger());
    }

    /**
     * Test getCompressionModeStringAsURL() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionModeStringAsURL());
    }

    /**
     * Test getCompressionRatioAsInteger() method.
     */
    @Test
    public void subTestGetCompressionRatioAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsInteger());
    }

    /**
     * Test getCompressionRatioAsLong() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsLong());
    }

    /**
     * Test getCompressionRatioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsLocalDateTime());
    }

    /**
     * Test getCompressionRatioAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsLocalTime());
    }

    /**
     * Test getCompressionRatioAsString() method.
     */
    @Test
    public void subTestGetCompressionRatioAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getCompressionRatioAsString());
    }

    /**
     * Test getCompressionRatioAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionRatioAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsBoolean());
    }

    /**
     * Test getCompressionRatioAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionRatioAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsBigInteger());
    }

    /**
     * Test getCompressionRatioAsURL() method.
     */
    @Test
    public void subTestGetCompressionRatioAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCompressionRatioAsURL());
    }

    /**
     * Test getCountAsInteger() method.
     */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(Integer.valueOf(236), JMetaDataText_Test.jMetaDataText.getCountAsInteger());
    }

    /**
     * Test getCountAsLong() method.
     */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(Long.valueOf(236), JMetaDataText_Test.jMetaDataText.getCountAsLong());
    }

    /**
     * Test getCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCountAsLocalDateTime());
    }

    /**
     * Test getCountAsLocalTime() method.
     */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCountAsLocalTime());
    }

    /**
     * Test getCountAsString() method.
     */
    @Test
    public void subTestGetCountAsString() {
        assertEquals("236", JMetaDataText_Test.jMetaDataText.getCountAsString());
    }

    /**
     * Test getCountAsBoolean() method.
     */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCountAsBoolean());
    }

    /**
     * Test getCountAsBigInteger() method.
     */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(236), JMetaDataText_Test.jMetaDataText.getCountAsBigInteger());
    }

    /**
     * Test getCountAsURL() method.
     */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getCountAsURL());
    }

    /**
     * Test getDefaultAsInteger() method.
     */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultAsInteger());
    }

    /**
     * Test getDefaultAsLong() method.
     */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultAsLong());
    }

    /**
     * Test getDefaultAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultAsLocalDateTime());
    }

    /**
     * Test getDefaultAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultAsLocalTime());
    }

    /**
     * Test getDefaultAsString() method.
     */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals("Yes", JMetaDataText_Test.jMetaDataText.getDefaultAsString());
    }

    /**
     * Test getDefaultAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataText_Test.jMetaDataText.getDefaultAsBoolean());
    }

    /**
     * Test getDefaultAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultAsBigInteger());
    }

    /**
     * Test getDefaultAsURL() method.
     */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultAsURL());
    }

    /**
     * Test getDefaultStringAsInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultStringAsInteger());
    }

    /**
     * Test getDefaultStringAsLong() method.
     */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultStringAsLong());
    }

    /**
     * Test getDefaultStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultStringAsLocalDateTime());
    }

    /**
     * Test getDefaultStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultStringAsLocalTime());
    }

    /**
     * Test getDefaultStringAsString() method.
     */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals("Yes", JMetaDataText_Test.jMetaDataText.getDefaultStringAsString());
    }

    /**
     * Test getDefaultStringAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataText_Test.jMetaDataText.getDefaultStringAsBoolean());
    }

    /**
     * Test getDefaultStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultStringAsBigInteger());
    }

    /**
     * Test getDefaultStringAsURL() method.
     */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDefaultStringAsURL());
    }

    /**
     * Test getDelayAsInteger() method.
     */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsInteger());
    }

    /**
     * Test getDelayAsLong() method.
     */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsLong());
    }

    /**
     * Test getDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsLocalDateTime());
    }

    /**
     * Test getDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsLocalTime());
    }

    /**
     * Test getDelayAsString() method.
     */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayAsString());
    }

    /**
     * Test getDelayAsBoolean() method.
     */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsBoolean());
    }

    /**
     * Test getDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsBigInteger());
    }

    /**
     * Test getDelayAsURL() method.
     */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayAsURL());
    }

    /**
     * Test getDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsInteger());
    }

    /**
     * Test getDelayStringAsLong() method.
     */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsLong());
    }

    /**
     * Test getDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsLocalDateTime());
    }

    /**
     * Test getDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsLocalTime());
    }

    /**
     * Test getDelayStringAsString() method.
     */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayStringAsString());
    }

    /**
     * Test getDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsBoolean());
    }

    /**
     * Test getDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsBigInteger());
    }

    /**
     * Test getDelayStringAsURL() method.
     */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayStringAsURL());
    }

    /**
     * Test getDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsInteger());
    }

    /**
     * Test getDelayString1AsLong() method.
     */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsLong());
    }

    /**
     * Test getDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsLocalDateTime());
    }

    /**
     * Test getDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsLocalTime());
    }

    /**
     * Test getDelayString1AsString() method.
     */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayString1AsString());
    }

    /**
     * Test getDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsBoolean());
    }

    /**
     * Test getDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsBigInteger());
    }

    /**
     * Test getDelayString1AsURL() method.
     */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString1AsURL());
    }

    /**
     * Test getDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsInteger());
    }

    /**
     * Test getDelayString2AsLong() method.
     */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsLong());
    }

    /**
     * Test getDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsLocalDateTime());
    }

    /**
     * Test getDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsLocalTime());
    }

    /**
     * Test getDelayString2AsString() method.
     */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayString2AsString());
    }

    /**
     * Test getDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsBoolean());
    }

    /**
     * Test getDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsBigInteger());
    }

    /**
     * Test getDelayString2AsURL() method.
     */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString2AsURL());
    }

    /**
     * Test getDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsInteger());
    }

    /**
     * Test getDelayString3AsLong() method.
     */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsLong());
    }

    /**
     * Test getDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsLocalDateTime());
    }

    /**
     * Test getDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsLocalTime());
    }

    /**
     * Test getDelayString3AsString() method.
     */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayString3AsString());
    }

    /**
     * Test getDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsBoolean());
    }

    /**
     * Test getDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsBigInteger());
    }

    /**
     * Test getDelayString3AsURL() method.
     */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString3AsURL());
    }

    /**
     * Test getDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsInteger());
    }

    /**
     * Test getDelayString4AsLong() method.
     */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsLong());
    }

    /**
     * Test getDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsLocalDateTime());
    }

    /**
     * Test getDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsLocalTime());
    }

    /**
     * Test getDelayString4AsString() method.
     */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayString4AsString());
    }

    /**
     * Test getDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsBoolean());
    }

    /**
     * Test getDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsBigInteger());
    }

    /**
     * Test getDelayString4AsURL() method.
     */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString4AsURL());
    }

    /**
     * Test getDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsInteger());
    }

    /**
     * Test getDelayString5AsLong() method.
     */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsLong());
    }

    /**
     * Test getDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsLocalDateTime());
    }

    /**
     * Test getDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsLocalTime());
    }

    /**
     * Test getDelayString5AsString() method.
     */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayString5AsString());
    }

    /**
     * Test getDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsBoolean());
    }

    /**
     * Test getDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsBigInteger());
    }

    /**
     * Test getDelayString5AsURL() method.
     */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayString5AsURL());
    }

    /**
     * Test getDelayDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsInteger());
    }

    /**
     * Test getDelayDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsLong());
    }

    /**
     * Test getDelayDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsLocalTime());
    }

    /**
     * Test getDelayDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsString());
    }

    /**
     * Test getDelayDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsBoolean());
    }

    /**
     * Test getDelayDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsBigInteger());
    }

    /**
     * Test getDelayDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayDropFrameAsURL());
    }

    /**
     * Test getDelayOriginalAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsInteger());
    }

    /**
     * Test getDelayOriginalAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsLong());
    }

    /**
     * Test getDelayOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsLocalTime());
    }

    /**
     * Test getDelayOriginalAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalAsString());
    }

    /**
     * Test getDelayOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsBoolean());
    }

    /**
     * Test getDelayOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsBigInteger());
    }

    /**
     * Test getDelayOriginalAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalAsURL());
    }

    /**
     * Test getDelayOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsInteger());
    }

    /**
     * Test getDelayOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsLong());
    }

    /**
     * Test getDelayOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsLocalTime());
    }

    /**
     * Test getDelayOriginalStringAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsString());
    }

    /**
     * Test getDelayOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsBoolean());
    }

    /**
     * Test getDelayOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsBigInteger());
    }

    /**
     * Test getDelayOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalStringAsURL());
    }

    /**
     * Test getDelayOriginalString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsInteger());
    }

    /**
     * Test getDelayOriginalString1AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsLong());
    }

    /**
     * Test getDelayOriginalString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsLocalTime());
    }

    /**
     * Test getDelayOriginalString1AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsString());
    }

    /**
     * Test getDelayOriginalString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsBoolean());
    }

    /**
     * Test getDelayOriginalString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsBigInteger());
    }

    /**
     * Test getDelayOriginalString1AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString1AsURL());
    }

    /**
     * Test getDelayOriginalString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsInteger());
    }

    /**
     * Test getDelayOriginalString2AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsLong());
    }

    /**
     * Test getDelayOriginalString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsLocalTime());
    }

    /**
     * Test getDelayOriginalString2AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsString());
    }

    /**
     * Test getDelayOriginalString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsBoolean());
    }

    /**
     * Test getDelayOriginalString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsBigInteger());
    }

    /**
     * Test getDelayOriginalString2AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString2AsURL());
    }

    /**
     * Test getDelayOriginalString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsInteger());
    }

    /**
     * Test getDelayOriginalString3AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsLong());
    }

    /**
     * Test getDelayOriginalString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsLocalTime());
    }

    /**
     * Test getDelayOriginalString3AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsString());
    }

    /**
     * Test getDelayOriginalString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsBoolean());
    }

    /**
     * Test getDelayOriginalString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsBigInteger());
    }

    /**
     * Test getDelayOriginalString3AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString3AsURL());
    }

    /**
     * Test getDelayOriginalString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsInteger());
    }

    /**
     * Test getDelayOriginalString4AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsLong());
    }

    /**
     * Test getDelayOriginalString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsLocalTime());
    }

    /**
     * Test getDelayOriginalString4AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsString());
    }

    /**
     * Test getDelayOriginalString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsBoolean());
    }

    /**
     * Test getDelayOriginalString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsBigInteger());
    }

    /**
     * Test getDelayOriginalString4AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString4AsURL());
    }

    /**
     * Test getDelayOriginalString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsInteger());
    }

    /**
     * Test getDelayOriginalString5AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsLong());
    }

    /**
     * Test getDelayOriginalString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsLocalTime());
    }

    /**
     * Test getDelayOriginalString5AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsString());
    }

    /**
     * Test getDelayOriginalString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsBoolean());
    }

    /**
     * Test getDelayOriginalString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsBigInteger());
    }

    /**
     * Test getDelayOriginalString5AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalString5AsURL());
    }

    /**
     * Test getDelayOriginalDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsInteger());
    }

    /**
     * Test getDelayOriginalDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsLong());
    }

    /**
     * Test getDelayOriginalDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsLocalTime());
    }

    /**
     * Test getDelayOriginalDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsString());
    }

    /**
     * Test getDelayOriginalDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsBoolean());
    }

    /**
     * Test getDelayOriginalDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsBigInteger());
    }

    /**
     * Test getDelayOriginalDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalDropFrameAsURL());
    }

    /**
     * Test getDelayOriginalSettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsInteger());
    }

    /**
     * Test getDelayOriginalSettingsAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsLong());
    }

    /**
     * Test getDelayOriginalSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsLocalTime());
    }

    /**
     * Test getDelayOriginalSettingsAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsString());
    }

    /**
     * Test getDelayOriginalSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsBoolean());
    }

    /**
     * Test getDelayOriginalSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsBigInteger());
    }

    /**
     * Test getDelayOriginalSettingsAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSettingsAsURL());
    }

    /**
     * Test getDelayOriginalSourceAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsInteger());
    }

    /**
     * Test getDelayOriginalSourceAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsLong());
    }

    /**
     * Test getDelayOriginalSourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalSourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsLocalTime());
    }

    /**
     * Test getDelayOriginalSourceAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsString());
    }

    /**
     * Test getDelayOriginalSourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsBoolean());
    }

    /**
     * Test getDelayOriginalSourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsBigInteger());
    }

    /**
     * Test getDelayOriginalSourceAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelayOriginalSourceAsURL());
    }

    /**
     * Test getDelaySettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsInteger());
    }

    /**
     * Test getDelaySettingsAsLong() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsLong());
    }

    /**
     * Test getDelaySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsLocalDateTime());
    }

    /**
     * Test getDelaySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsLocalTime());
    }

    /**
     * Test getDelaySettingsAsString() method.
     */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelaySettingsAsString());
    }

    /**
     * Test getDelaySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsBoolean());
    }

    /**
     * Test getDelaySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsBigInteger());
    }

    /**
     * Test getDelaySettingsAsURL() method.
     */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySettingsAsURL());
    }

    /**
     * Test getDelaySourceAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsInteger());
    }

    /**
     * Test getDelaySourceAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsLong());
    }

    /**
     * Test getDelaySourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsLocalDateTime());
    }

    /**
     * Test getDelaySourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsLocalTime());
    }

    /**
     * Test getDelaySourceAsString() method.
     */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelaySourceAsString());
    }

    /**
     * Test getDelaySourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsBoolean());
    }

    /**
     * Test getDelaySourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsBigInteger());
    }

    /**
     * Test getDelaySourceAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceAsURL());
    }

    /**
     * Test getDelaySourceStringAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsInteger());
    }

    /**
     * Test getDelaySourceStringAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsLong());
    }

    /**
     * Test getDelaySourceStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsLocalDateTime());
    }

    /**
     * Test getDelaySourceStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsLocalTime());
    }

    /**
     * Test getDelaySourceStringAsString() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsString());
    }

    /**
     * Test getDelaySourceStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsBoolean());
    }

    /**
     * Test getDelaySourceStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsBigInteger());
    }

    /**
     * Test getDelaySourceStringAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDelaySourceStringAsURL());
    }

    /**
     * Test getDisabledAsInteger() method.
     */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsInteger());
    }

    /**
     * Test getDisabledAsLong() method.
     */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsLong());
    }

    /**
     * Test getDisabledAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsLocalDateTime());
    }

    /**
     * Test getDisabledAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsLocalTime());
    }

    /**
     * Test getDisabledAsString() method.
     */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDisabledAsString());
    }

    /**
     * Test getDisabledAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsBoolean());
    }

    /**
     * Test getDisabledAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsBigInteger());
    }

    /**
     * Test getDisabledAsURL() method.
     */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledAsURL());
    }

    /**
     * Test getDisabledStringAsInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsInteger());
    }

    /**
     * Test getDisabledStringAsLong() method.
     */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsLong());
    }

    /**
     * Test getDisabledStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsLocalDateTime());
    }

    /**
     * Test getDisabledStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsLocalTime());
    }

    /**
     * Test getDisabledStringAsString() method.
     */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDisabledStringAsString());
    }

    /**
     * Test getDisabledStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsBoolean());
    }

    /**
     * Test getDisabledStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsBigInteger());
    }

    /**
     * Test getDisabledStringAsURL() method.
     */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDisabledStringAsURL());
    }

    /**
     * Test getDurationAsInteger() method.
     */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsInteger());
    }

    /**
     * Test getDurationAsLong() method.
     */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsLong());
    }

    /**
     * Test getDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsLocalDateTime());
    }

    /**
     * Test getDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsLocalTime());
    }

    /**
     * Test getDurationAsString() method.
     */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationAsString());
    }

    /**
     * Test getDurationAsBoolean() method.
     */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsBoolean());
    }

    /**
     * Test getDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsBigInteger());
    }

    /**
     * Test getDurationAsURL() method.
     */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationAsURL());
    }

    /**
     * Test getDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsInteger());
    }

    /**
     * Test getDurationStringAsLong() method.
     */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsLong());
    }

    /**
     * Test getDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsLocalDateTime());
    }

    /**
     * Test getDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsLocalTime());
    }

    /**
     * Test getDurationStringAsString() method.
     */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationStringAsString());
    }

    /**
     * Test getDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsBoolean());
    }

    /**
     * Test getDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsBigInteger());
    }

    /**
     * Test getDurationStringAsURL() method.
     */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationStringAsURL());
    }

    /**
     * Test getDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsInteger());
    }

    /**
     * Test getDurationString1AsLong() method.
     */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsLong());
    }

    /**
     * Test getDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsLocalDateTime());
    }

    /**
     * Test getDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsLocalTime());
    }

    /**
     * Test getDurationString1AsString() method.
     */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationString1AsString());
    }

    /**
     * Test getDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsBoolean());
    }

    /**
     * Test getDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsBigInteger());
    }

    /**
     * Test getDurationString1AsURL() method.
     */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString1AsURL());
    }

    /**
     * Test getDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsInteger());
    }

    /**
     * Test getDurationString2AsLong() method.
     */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsLong());
    }

    /**
     * Test getDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsLocalDateTime());
    }

    /**
     * Test getDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsLocalTime());
    }

    /**
     * Test getDurationString2AsString() method.
     */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationString2AsString());
    }

    /**
     * Test getDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsBoolean());
    }

    /**
     * Test getDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsBigInteger());
    }

    /**
     * Test getDurationString2AsURL() method.
     */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString2AsURL());
    }

    /**
     * Test getDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsInteger());
    }

    /**
     * Test getDurationString3AsLong() method.
     */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsLong());
    }

    /**
     * Test getDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsLocalDateTime());
    }

    /**
     * Test getDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsLocalTime());
    }

    /**
     * Test getDurationString3AsString() method.
     */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationString3AsString());
    }

    /**
     * Test getDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsBoolean());
    }

    /**
     * Test getDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsBigInteger());
    }

    /**
     * Test getDurationString3AsURL() method.
     */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString3AsURL());
    }

    /**
     * Test getDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsInteger());
    }

    /**
     * Test getDurationString4AsLong() method.
     */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsLong());
    }

    /**
     * Test getDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsLocalDateTime());
    }

    /**
     * Test getDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsLocalTime());
    }

    /**
     * Test getDurationString4AsString() method.
     */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationString4AsString());
    }

    /**
     * Test getDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsBoolean());
    }

    /**
     * Test getDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsBigInteger());
    }

    /**
     * Test getDurationString4AsURL() method.
     */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString4AsURL());
    }

    /**
     * Test getDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsInteger());
    }

    /**
     * Test getDurationString5AsLong() method.
     */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsLong());
    }

    /**
     * Test getDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsLocalDateTime());
    }

    /**
     * Test getDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsLocalTime());
    }

    /**
     * Test getDurationString5AsString() method.
     */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationString5AsString());
    }

    /**
     * Test getDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsBoolean());
    }

    /**
     * Test getDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsBigInteger());
    }

    /**
     * Test getDurationString5AsURL() method.
     */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationString5AsURL());
    }

    /**
     * Test getDurationFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsInteger());
    }

    /**
     * Test getDurationFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsLong());
    }

    /**
     * Test getDurationFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsLocalTime());
    }

    /**
     * Test getDurationFirstFrameAsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsString());
    }

    /**
     * Test getDurationFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsBoolean());
    }

    /**
     * Test getDurationFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsBigInteger());
    }

    /**
     * Test getDurationFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameAsURL());
    }

    /**
     * Test getDurationFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsInteger());
    }

    /**
     * Test getDurationFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsLong());
    }

    /**
     * Test getDurationFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsLocalTime());
    }

    /**
     * Test getDurationFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsString());
    }

    /**
     * Test getDurationFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsBoolean());
    }

    /**
     * Test getDurationFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsBigInteger());
    }

    /**
     * Test getDurationFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameStringAsURL());
    }

    /**
     * Test getDurationFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsInteger());
    }

    /**
     * Test getDurationFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsLong());
    }

    /**
     * Test getDurationFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsString());
    }

    /**
     * Test getDurationFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString1AsURL());
    }

    /**
     * Test getDurationFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsInteger());
    }

    /**
     * Test getDurationFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsLong());
    }

    /**
     * Test getDurationFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsString());
    }

    /**
     * Test getDurationFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString2AsURL());
    }

    /**
     * Test getDurationFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsInteger());
    }

    /**
     * Test getDurationFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsLong());
    }

    /**
     * Test getDurationFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsString());
    }

    /**
     * Test getDurationFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString3AsURL());
    }

    /**
     * Test getDurationFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsInteger());
    }

    /**
     * Test getDurationFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsLong());
    }

    /**
     * Test getDurationFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsString());
    }

    /**
     * Test getDurationFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString4AsURL());
    }

    /**
     * Test getDurationFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsInteger());
    }

    /**
     * Test getDurationFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsLong());
    }

    /**
     * Test getDurationFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsString());
    }

    /**
     * Test getDurationFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationFirstFrameString5AsURL());
    }

    /**
     * Test getDurationLastFrameAsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsInteger());
    }

    /**
     * Test getDurationLastFrameAsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsLong());
    }

    /**
     * Test getDurationLastFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsLocalTime());
    }

    /**
     * Test getDurationLastFrameAsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsString());
    }

    /**
     * Test getDurationLastFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsBoolean());
    }

    /**
     * Test getDurationLastFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsBigInteger());
    }

    /**
     * Test getDurationLastFrameAsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameAsURL());
    }

    /**
     * Test getDurationLastFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsInteger());
    }

    /**
     * Test getDurationLastFrameStringAsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsLong());
    }

    /**
     * Test getDurationLastFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsLocalTime());
    }

    /**
     * Test getDurationLastFrameStringAsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsString());
    }

    /**
     * Test getDurationLastFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsBoolean());
    }

    /**
     * Test getDurationLastFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsBigInteger());
    }

    /**
     * Test getDurationLastFrameStringAsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameStringAsURL());
    }

    /**
     * Test getDurationLastFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsInteger());
    }

    /**
     * Test getDurationLastFrameString1AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsLong());
    }

    /**
     * Test getDurationLastFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString1AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsString());
    }

    /**
     * Test getDurationLastFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsBoolean());
    }

    /**
     * Test getDurationLastFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString1AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString1AsURL());
    }

    /**
     * Test getDurationLastFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsInteger());
    }

    /**
     * Test getDurationLastFrameString2AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsLong());
    }

    /**
     * Test getDurationLastFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString2AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsString());
    }

    /**
     * Test getDurationLastFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsBoolean());
    }

    /**
     * Test getDurationLastFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString2AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString2AsURL());
    }

    /**
     * Test getDurationLastFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsInteger());
    }

    /**
     * Test getDurationLastFrameString3AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsLong());
    }

    /**
     * Test getDurationLastFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString3AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsString());
    }

    /**
     * Test getDurationLastFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsBoolean());
    }

    /**
     * Test getDurationLastFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString3AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString3AsURL());
    }

    /**
     * Test getDurationLastFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsInteger());
    }

    /**
     * Test getDurationLastFrameString4AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsLong());
    }

    /**
     * Test getDurationLastFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString4AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsString());
    }

    /**
     * Test getDurationLastFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsBoolean());
    }

    /**
     * Test getDurationLastFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString4AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString4AsURL());
    }

    /**
     * Test getDurationLastFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsInteger());
    }

    /**
     * Test getDurationLastFrameString5AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsLong());
    }

    /**
     * Test getDurationLastFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString5AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsString());
    }

    /**
     * Test getDurationLastFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsBoolean());
    }

    /**
     * Test getDurationLastFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString5AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getDurationLastFrameString5AsURL());
    }

    /**
     * Test getElementCountAsInteger() method.
     */
    @Test
    public void subTestGetElementCountAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsInteger());
    }

    /**
     * Test getElementCountAsLong() method.
     */
    @Test
    public void subTestGetElementCountAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsLong());
    }

    /**
     * Test getElementCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetElementCountAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsLocalDateTime());
    }

    /**
     * Test getElementCountAsLocalTime() method.
     */
    @Test
    public void subTestGetElementCountAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsLocalTime());
    }

    /**
     * Test getElementCountAsString() method.
     */
    @Test
    public void subTestGetElementCountAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getElementCountAsString());
    }

    /**
     * Test getElementCountAsBoolean() method.
     */
    @Test
    public void subTestGetElementCountAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsBoolean());
    }

    /**
     * Test getElementCountAsBigInteger() method.
     */
    @Test
    public void subTestGetElementCountAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsBigInteger());
    }

    /**
     * Test getElementCountAsURL() method.
     */
    @Test
    public void subTestGetElementCountAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getElementCountAsURL());
    }

    /**
     * Test getEncodedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsInteger());
    }

    /**
     * Test getEncodedApplicationAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsLong());
    }

    /**
     * Test getEncodedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsLocalTime());
    }

    /**
     * Test getEncodedApplicationAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsString());
    }

    /**
     * Test getEncodedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsBoolean());
    }

    /**
     * Test getEncodedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsBigInteger());
    }

    /**
     * Test getEncodedApplicationAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationAsURL());
    }

    /**
     * Test getEncodedApplicationStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsInteger());
    }

    /**
     * Test getEncodedApplicationStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsLong());
    }

    /**
     * Test getEncodedApplicationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsLocalTime());
    }

    /**
     * Test getEncodedApplicationStringAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsString());
    }

    /**
     * Test getEncodedApplicationStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsBoolean());
    }

    /**
     * Test getEncodedApplicationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsBigInteger());
    }

    /**
     * Test getEncodedApplicationStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationStringAsURL());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsLong());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsString());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationCompanyNameAsURL());
    }

    /**
     * Test getEncodedApplicationNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsInteger());
    }

    /**
     * Test getEncodedApplicationNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsLong());
    }

    /**
     * Test getEncodedApplicationNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsString());
    }

    /**
     * Test getEncodedApplicationNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationNameAsURL());
    }

    /**
     * Test getEncodedApplicationUrlAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsLong());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsLocalTime());
    }

    /**
     * Test getEncodedApplicationUrlAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsString());
    }

    /**
     * Test getEncodedApplicationUrlAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsBoolean());
    }

    /**
     * Test getEncodedApplicationUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsBigInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationUrlAsURL());
    }

    /**
     * Test getEncodedApplicationVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsLong());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsLocalTime());
    }

    /**
     * Test getEncodedApplicationVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsString());
    }

    /**
     * Test getEncodedApplicationVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsBoolean());
    }

    /**
     * Test getEncodedApplicationVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsBigInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedApplicationVersionAsURL());
    }

    /**
     * Test getEncodedDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsInteger());
    }

    /**
     * Test getEncodedDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsLong());
    }

    /**
     * Test getEncodedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsLocalDateTime());
    }

    /**
     * Test getEncodedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsLocalTime());
    }

    /**
     * Test getEncodedDateAsString() method.
     */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedDateAsString());
    }

    /**
     * Test getEncodedDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsBoolean());
    }

    /**
     * Test getEncodedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsBigInteger());
    }

    /**
     * Test getEncodedDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedDateAsURL());
    }

    /**
     * Test getEncodedLibraryAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsInteger());
    }

    /**
     * Test getEncodedLibraryAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsLong());
    }

    /**
     * Test getEncodedLibraryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsLocalTime());
    }

    /**
     * Test getEncodedLibraryAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsString());
    }

    /**
     * Test getEncodedLibraryAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsBoolean());
    }

    /**
     * Test getEncodedLibraryAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsBigInteger());
    }

    /**
     * Test getEncodedLibraryAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryAsURL());
    }

    /**
     * Test getEncodedLibraryStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsInteger());
    }

    /**
     * Test getEncodedLibraryStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsLong());
    }

    /**
     * Test getEncodedLibraryStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsLocalTime());
    }

    /**
     * Test getEncodedLibraryStringAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsString());
    }

    /**
     * Test getEncodedLibraryStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsBoolean());
    }

    /**
     * Test getEncodedLibraryStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsBigInteger());
    }

    /**
     * Test getEncodedLibraryStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryStringAsURL());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsLong());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsString());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryCompanyNameAsURL());
    }

    /**
     * Test getEncodedLibraryDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsInteger());
    }

    /**
     * Test getEncodedLibraryDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsLong());
    }

    /**
     * Test getEncodedLibraryDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsLocalTime());
    }

    /**
     * Test getEncodedLibraryDateAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsString());
    }

    /**
     * Test getEncodedLibraryDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsBoolean());
    }

    /**
     * Test getEncodedLibraryDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsBigInteger());
    }

    /**
     * Test getEncodedLibraryDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryDateAsURL());
    }

    /**
     * Test getEncodedLibraryNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsInteger());
    }

    /**
     * Test getEncodedLibraryNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsLong());
    }

    /**
     * Test getEncodedLibraryNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsString());
    }

    /**
     * Test getEncodedLibraryNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryNameAsURL());
    }

    /**
     * Test getEncodedLibrarySettingsAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsLong());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsLocalDateTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsLocalTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsString() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsString());
    }

    /**
     * Test getEncodedLibrarySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsBoolean());
    }

    /**
     * Test getEncodedLibrarySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsBigInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibrarySettingsAsURL());
    }

    /**
     * Test getEncodedLibraryVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsLong());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsLocalTime());
    }

    /**
     * Test getEncodedLibraryVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsString());
    }

    /**
     * Test getEncodedLibraryVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsBoolean());
    }

    /**
     * Test getEncodedLibraryVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsBigInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedLibraryVersionAsURL());
    }

    /**
     * Test getEncodedOperatingSystemAsInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsLong() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsLong());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsLocalDateTime());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsLocalTime());
    }

    /**
     * Test getEncodedOperatingSystemAsString() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsString());
    }

    /**
     * Test getEncodedOperatingSystemAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsBoolean());
    }

    /**
     * Test getEncodedOperatingSystemAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsBigInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsURL() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncodedOperatingSystemAsURL());
    }

    /**
     * Test getEncryptionAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsInteger());
    }

    /**
     * Test getEncryptionAsLong() method.
     */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsLong());
    }

    /**
     * Test getEncryptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsLocalDateTime());
    }

    /**
     * Test getEncryptionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsLocalTime());
    }

    /**
     * Test getEncryptionAsString() method.
     */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getEncryptionAsString());
    }

    /**
     * Test getEncryptionAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsBoolean());
    }

    /**
     * Test getEncryptionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsBigInteger());
    }

    /**
     * Test getEncryptionAsURL() method.
     */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getEncryptionAsURL());
    }

    /**
     * Test getFirstPacketOrderAsInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsInteger());
    }

    /**
     * Test getFirstPacketOrderAsLong() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsLong());
    }

    /**
     * Test getFirstPacketOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsLocalDateTime());
    }

    /**
     * Test getFirstPacketOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsLocalTime());
    }

    /**
     * Test getFirstPacketOrderAsString() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsString());
    }

    /**
     * Test getFirstPacketOrderAsBoolean() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsBoolean());
    }

    /**
     * Test getFirstPacketOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsBigInteger());
    }

    /**
     * Test getFirstPacketOrderAsURL() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFirstPacketOrderAsURL());
    }

    /**
     * Test getForcedAsInteger() method.
     */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedAsInteger());
    }

    /**
     * Test getForcedAsLong() method.
     */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedAsLong());
    }

    /**
     * Test getForcedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedAsLocalDateTime());
    }

    /**
     * Test getForcedAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedAsLocalTime());
    }

    /**
     * Test getForcedAsString() method.
     */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals("No", JMetaDataText_Test.jMetaDataText.getForcedAsString());
    }

    /**
     * Test getForcedAsBoolean() method.
     */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataText_Test.jMetaDataText.getForcedAsBoolean());
    }

    /**
     * Test getForcedAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedAsBigInteger());
    }

    /**
     * Test getForcedAsURL() method.
     */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedAsURL());
    }

    /**
     * Test getForcedStringAsInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedStringAsInteger());
    }

    /**
     * Test getForcedStringAsLong() method.
     */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedStringAsLong());
    }

    /**
     * Test getForcedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedStringAsLocalDateTime());
    }

    /**
     * Test getForcedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedStringAsLocalTime());
    }

    /**
     * Test getForcedStringAsString() method.
     */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals("No", JMetaDataText_Test.jMetaDataText.getForcedStringAsString());
    }

    /**
     * Test getForcedStringAsBoolean() method.
     */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataText_Test.jMetaDataText.getForcedStringAsBoolean());
    }

    /**
     * Test getForcedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedStringAsBigInteger());
    }

    /**
     * Test getForcedStringAsURL() method.
     */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getForcedStringAsURL());
    }

    /**
     * Test getFormatAsInteger() method.
     */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataText_Test.jMetaDataText.getFormatAsInteger());
    }

    /**
     * Test getFormatAsLong() method.
     */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(Long.valueOf(8), JMetaDataText_Test.jMetaDataText.getFormatAsLong());
    }

    /**
     * Test getFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatAsLocalDateTime());
    }

    /**
     * Test getFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatAsLocalTime());
    }

    /**
     * Test getFormatAsString() method.
     */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals("UTF-8", JMetaDataText_Test.jMetaDataText.getFormatAsString());
    }

    /**
     * Test getFormatAsBoolean() method.
     */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatAsBoolean());
    }

    /**
     * Test getFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataText_Test.jMetaDataText.getFormatAsBigInteger());
    }

    /**
     * Test getFormatAsURL() method.
     */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatAsURL());
    }

    /**
     * Test getFormatInfoAsInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsInteger());
    }

    /**
     * Test getFormatInfoAsLong() method.
     */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsLong());
    }

    /**
     * Test getFormatInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsLocalDateTime());
    }

    /**
     * Test getFormatInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsLocalTime());
    }

    /**
     * Test getFormatInfoAsString() method.
     */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatInfoAsString());
    }

    /**
     * Test getFormatInfoAsBoolean() method.
     */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsBoolean());
    }

    /**
     * Test getFormatInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsBigInteger());
    }

    /**
     * Test getFormatInfoAsURL() method.
     */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatInfoAsURL());
    }

    /**
     * Test getFormatUrlAsInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsInteger());
    }

    /**
     * Test getFormatUrlAsLong() method.
     */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsLong());
    }

    /**
     * Test getFormatUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsLocalDateTime());
    }

    /**
     * Test getFormatUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsLocalTime());
    }

    /**
     * Test getFormatUrlAsString() method.
     */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatUrlAsString());
    }

    /**
     * Test getFormatUrlAsBoolean() method.
     */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsBoolean());
    }

    /**
     * Test getFormatUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsBigInteger());
    }

    /**
     * Test getFormatUrlAsURL() method.
     */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatUrlAsURL());
    }

    /**
     * Test getFormatCommercialAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataText_Test.jMetaDataText.getFormatCommercialAsInteger());
    }

    /**
     * Test getFormatCommercialAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(Long.valueOf(8), JMetaDataText_Test.jMetaDataText.getFormatCommercialAsLong());
    }

    /**
     * Test getFormatCommercialAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialAsLocalTime());
    }

    /**
     * Test getFormatCommercialAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals("UTF-8", JMetaDataText_Test.jMetaDataText.getFormatCommercialAsString());
    }

    /**
     * Test getFormatCommercialAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialAsBoolean());
    }

    /**
     * Test getFormatCommercialAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataText_Test.jMetaDataText.getFormatCommercialAsBigInteger());
    }

    /**
     * Test getFormatCommercialAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialAsURL());
    }

    /**
     * Test getFormatCommercialIfAnyAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsLong());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsLocalTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsString());
    }

    /**
     * Test getFormatCommercialIfAnyAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsBoolean());
    }

    /**
     * Test getFormatCommercialIfAnyAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsBigInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCommercialIfAnyAsURL());
    }

    /**
     * Test getFormatCompressionAsInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsInteger());
    }

    /**
     * Test getFormatCompressionAsLong() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsLong());
    }

    /**
     * Test getFormatCompressionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsLocalDateTime());
    }

    /**
     * Test getFormatCompressionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsLocalTime());
    }

    /**
     * Test getFormatCompressionAsString() method.
     */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatCompressionAsString());
    }

    /**
     * Test getFormatCompressionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsBoolean());
    }

    /**
     * Test getFormatCompressionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsBigInteger());
    }

    /**
     * Test getFormatCompressionAsURL() method.
     */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatCompressionAsURL());
    }

    /**
     * Test getFormatProfileAsInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsInteger());
    }

    /**
     * Test getFormatProfileAsLong() method.
     */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsLong());
    }

    /**
     * Test getFormatProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsLocalDateTime());
    }

    /**
     * Test getFormatProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsLocalTime());
    }

    /**
     * Test getFormatProfileAsString() method.
     */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatProfileAsString());
    }

    /**
     * Test getFormatProfileAsBoolean() method.
     */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsBoolean());
    }

    /**
     * Test getFormatProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsBigInteger());
    }

    /**
     * Test getFormatProfileAsURL() method.
     */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatProfileAsURL());
    }

    /**
     * Test getFormatSettingsAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsInteger());
    }

    /**
     * Test getFormatSettingsAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsLong());
    }

    /**
     * Test getFormatSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsLocalTime());
    }

    /**
     * Test getFormatSettingsAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatSettingsAsString());
    }

    /**
     * Test getFormatSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsBoolean());
    }

    /**
     * Test getFormatSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsBigInteger());
    }

    /**
     * Test getFormatSettingsAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsAsURL());
    }

    /**
     * Test getFormatSettingsWrappingAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsInteger());
    }

    /**
     * Test getFormatSettingsWrappingAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsLong());
    }

    /**
     * Test getFormatSettingsWrappingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsWrappingAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsLocalTime());
    }

    /**
     * Test getFormatSettingsWrappingAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsString());
    }

    /**
     * Test getFormatSettingsWrappingAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsBoolean());
    }

    /**
     * Test getFormatSettingsWrappingAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsBigInteger());
    }

    /**
     * Test getFormatSettingsWrappingAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatSettingsWrappingAsURL());
    }

    /**
     * Test getFormatVersionAsInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsInteger());
    }

    /**
     * Test getFormatVersionAsLong() method.
     */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsLong());
    }

    /**
     * Test getFormatVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsLocalDateTime());
    }

    /**
     * Test getFormatVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsLocalTime());
    }

    /**
     * Test getFormatVersionAsString() method.
     */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFormatVersionAsString());
    }

    /**
     * Test getFormatVersionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsBoolean());
    }

    /**
     * Test getFormatVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsBigInteger());
    }

    /**
     * Test getFormatVersionAsURL() method.
     */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFormatVersionAsURL());
    }

    /**
     * Test getFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsInteger());
    }

    /**
     * Test getFrameCountAsLong() method.
     */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsLong());
    }

    /**
     * Test getFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsLocalDateTime());
    }

    /**
     * Test getFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsLocalTime());
    }

    /**
     * Test getFrameCountAsString() method.
     */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameCountAsString());
    }

    /**
     * Test getFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsBoolean());
    }

    /**
     * Test getFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsBigInteger());
    }

    /**
     * Test getFrameCountAsURL() method.
     */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameCountAsURL());
    }

    /**
     * Test getFrameRateAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsInteger());
    }

    /**
     * Test getFrameRateAsLong() method.
     */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsLong());
    }

    /**
     * Test getFrameRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsLocalDateTime());
    }

    /**
     * Test getFrameRateAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsLocalTime());
    }

    /**
     * Test getFrameRateAsString() method.
     */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateAsString());
    }

    /**
     * Test getFrameRateAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsBoolean());
    }

    /**
     * Test getFrameRateAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsBigInteger());
    }

    /**
     * Test getFrameRateAsURL() method.
     */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateAsURL());
    }

    /**
     * Test getFrameRateStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsInteger());
    }

    /**
     * Test getFrameRateStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsLong());
    }

    /**
     * Test getFrameRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsLocalTime());
    }

    /**
     * Test getFrameRateStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateStringAsString());
    }

    /**
     * Test getFrameRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsBoolean());
    }

    /**
     * Test getFrameRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsBigInteger());
    }

    /**
     * Test getFrameRateStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateStringAsURL());
    }

    /**
     * Test getFrameRateDenAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsInteger());
    }

    /**
     * Test getFrameRateDenAsLong() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsLong());
    }

    /**
     * Test getFrameRateDenAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsLocalDateTime());
    }

    /**
     * Test getFrameRateDenAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsLocalTime());
    }

    /**
     * Test getFrameRateDenAsString() method.
     */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateDenAsString());
    }

    /**
     * Test getFrameRateDenAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsBoolean());
    }

    /**
     * Test getFrameRateDenAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsBigInteger());
    }

    /**
     * Test getFrameRateDenAsURL() method.
     */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateDenAsURL());
    }

    /**
     * Test getFrameRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsInteger());
    }

    /**
     * Test getFrameRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsLong());
    }

    /**
     * Test getFrameRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsLocalDateTime());
    }

    /**
     * Test getFrameRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsLocalTime());
    }

    /**
     * Test getFrameRateMaximumAsString() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsString());
    }

    /**
     * Test getFrameRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsBoolean());
    }

    /**
     * Test getFrameRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsBigInteger());
    }

    /**
     * Test getFrameRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMaximumAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumAsURL());
    }

    /**
     * Test getFrameRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsInteger());
    }

    /**
     * Test getFrameRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsLong());
    }

    /**
     * Test getFrameRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsLocalTime());
    }

    /**
     * Test getFrameRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsString());
    }

    /**
     * Test getFrameRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsBoolean());
    }

    /**
     * Test getFrameRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsBigInteger());
    }

    /**
     * Test getFrameRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMaximumStringAsURL());
    }

    /**
     * Test getFrameRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsInteger());
    }

    /**
     * Test getFrameRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsLong());
    }

    /**
     * Test getFrameRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsLocalDateTime());
    }

    /**
     * Test getFrameRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsLocalTime());
    }

    /**
     * Test getFrameRateMinimumAsString() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsString());
    }

    /**
     * Test getFrameRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsBoolean());
    }

    /**
     * Test getFrameRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsBigInteger());
    }

    /**
     * Test getFrameRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMinimumAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumAsURL());
    }

    /**
     * Test getFrameRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsInteger());
    }

    /**
     * Test getFrameRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsLong());
    }

    /**
     * Test getFrameRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsLocalTime());
    }

    /**
     * Test getFrameRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsString());
    }

    /**
     * Test getFrameRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsBoolean());
    }

    /**
     * Test getFrameRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsBigInteger());
    }

    /**
     * Test getFrameRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateMinimumStringAsURL());
    }

    /**
     * Test getFrameRateModeAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsInteger());
    }

    /**
     * Test getFrameRateModeAsLong() method.
     */
    @Test
    public void subTestGetFrameRateModeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsLong());
    }

    /**
     * Test getFrameRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsLocalDateTime());
    }

    /**
     * Test getFrameRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateModeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsLocalTime());
    }

    /**
     * Test getFrameRateModeAsString() method.
     */
    @Test
    public void subTestGetFrameRateModeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateModeAsString());
    }

    /**
     * Test getFrameRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateModeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsBoolean());
    }

    /**
     * Test getFrameRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsBigInteger());
    }

    /**
     * Test getFrameRateModeAsURL() method.
     */
    @Test
    public void subTestGetFrameRateModeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeAsURL());
    }

    /**
     * Test getFrameRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsInteger());
    }

    /**
     * Test getFrameRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsLong());
    }

    /**
     * Test getFrameRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsLocalTime());
    }

    /**
     * Test getFrameRateModeStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsString());
    }

    /**
     * Test getFrameRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsBoolean());
    }

    /**
     * Test getFrameRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsBigInteger());
    }

    /**
     * Test getFrameRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateModeStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateModeStringAsURL());
    }

    /**
     * Test getFrameRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsInteger());
    }

    /**
     * Test getFrameRateNominalAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsLong());
    }

    /**
     * Test getFrameRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsLocalDateTime());
    }

    /**
     * Test getFrameRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsLocalTime());
    }

    /**
     * Test getFrameRateNominalAsString() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsString());
    }

    /**
     * Test getFrameRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsBoolean());
    }

    /**
     * Test getFrameRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsBigInteger());
    }

    /**
     * Test getFrameRateNominalAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNominalAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalAsURL());
    }

    /**
     * Test getFrameRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsInteger());
    }

    /**
     * Test getFrameRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsLong());
    }

    /**
     * Test getFrameRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsLocalTime());
    }

    /**
     * Test getFrameRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsString());
    }

    /**
     * Test getFrameRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsBoolean());
    }

    /**
     * Test getFrameRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsBigInteger());
    }

    /**
     * Test getFrameRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNominalStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNominalStringAsURL());
    }

    /**
     * Test getFrameRateNumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsInteger());
    }

    /**
     * Test getFrameRateNumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsLong());
    }

    /**
     * Test getFrameRateNumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsLocalDateTime());
    }

    /**
     * Test getFrameRateNumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsLocalTime());
    }

    /**
     * Test getFrameRateNumAsString() method.
     */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateNumAsString());
    }

    /**
     * Test getFrameRateNumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsBoolean());
    }

    /**
     * Test getFrameRateNumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsBigInteger());
    }

    /**
     * Test getFrameRateNumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateNumAsURL());
    }

    /**
     * Test getFrameRateOriginalAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsInteger());
    }

    /**
     * Test getFrameRateOriginalAsLong() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsLong());
    }

    /**
     * Test getFrameRateOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsLocalDateTime());
    }

    /**
     * Test getFrameRateOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsLocalTime());
    }

    /**
     * Test getFrameRateOriginalAsString() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsString());
    }

    /**
     * Test getFrameRateOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsBoolean());
    }

    /**
     * Test getFrameRateOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsBigInteger());
    }

    /**
     * Test getFrameRateOriginalAsURL() method.
     */
    @Test
    public void subTestGetFrameRateOriginalAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalAsURL());
    }

    /**
     * Test getFrameRateOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsInteger());
    }

    /**
     * Test getFrameRateOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsLong());
    }

    /**
     * Test getFrameRateOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsLocalTime());
    }

    /**
     * Test getFrameRateOriginalStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsString());
    }

    /**
     * Test getFrameRateOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsBoolean());
    }

    /**
     * Test getFrameRateOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsBigInteger());
    }

    /**
     * Test getFrameRateOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateOriginalStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getFrameRateOriginalStringAsURL());
    }

    /**
     * Test getHeightAsInteger() method.
     */
    @Test
    public void subTestGetHeightAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsInteger());
    }

    /**
     * Test getHeightAsLong() method.
     */
    @Test
    public void subTestGetHeightAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsLong());
    }

    /**
     * Test getHeightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsLocalDateTime());
    }

    /**
     * Test getHeightAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsLocalTime());
    }

    /**
     * Test getHeightAsString() method.
     */
    @Test
    public void subTestGetHeightAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getHeightAsString());
    }

    /**
     * Test getHeightAsBoolean() method.
     */
    @Test
    public void subTestGetHeightAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsBoolean());
    }

    /**
     * Test getHeightAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsBigInteger());
    }

    /**
     * Test getHeightAsURL() method.
     */
    @Test
    public void subTestGetHeightAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightAsURL());
    }

    /**
     * Test getHeightStringAsInteger() method.
     */
    @Test
    public void subTestGetHeightStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsInteger());
    }

    /**
     * Test getHeightStringAsLong() method.
     */
    @Test
    public void subTestGetHeightStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsLong());
    }

    /**
     * Test getHeightStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeightStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsLocalDateTime());
    }

    /**
     * Test getHeightStringAsLocalTime() method.
     */
    @Test
    public void subTestGetHeightStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsLocalTime());
    }

    /**
     * Test getHeightStringAsString() method.
     */
    @Test
    public void subTestGetHeightStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getHeightStringAsString());
    }

    /**
     * Test getHeightStringAsBoolean() method.
     */
    @Test
    public void subTestGetHeightStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsBoolean());
    }

    /**
     * Test getHeightStringAsBigInteger() method.
     */
    @Test
    public void subTestGetHeightStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsBigInteger());
    }

    /**
     * Test getHeightStringAsURL() method.
     */
    @Test
    public void subTestGetHeightStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getHeightStringAsURL());
    }

    /**
     * Test getIDAsInteger() method.
     */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(Integer.valueOf(4), JMetaDataText_Test.jMetaDataText.getIDAsInteger());
    }

    /**
     * Test getIDAsLong() method.
     */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(Long.valueOf(4), JMetaDataText_Test.jMetaDataText.getIDAsLong());
    }

    /**
     * Test getIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDAsLocalDateTime());
    }

    /**
     * Test getIDAsLocalTime() method.
     */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDAsLocalTime());
    }

    /**
     * Test getIDAsString() method.
     */
    @Test
    public void subTestGetIDAsString() {
        assertEquals("4", JMetaDataText_Test.jMetaDataText.getIDAsString());
    }

    /**
     * Test getIDAsBoolean() method.
     */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDAsBoolean());
    }

    /**
     * Test getIDAsBigInteger() method.
     */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(4), JMetaDataText_Test.jMetaDataText.getIDAsBigInteger());
    }

    /**
     * Test getIDAsURL() method.
     */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDAsURL());
    }

    /**
     * Test getIDStringAsInteger() method.
     */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(Integer.valueOf(4), JMetaDataText_Test.jMetaDataText.getIDStringAsInteger());
    }

    /**
     * Test getIDStringAsLong() method.
     */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(Long.valueOf(4), JMetaDataText_Test.jMetaDataText.getIDStringAsLong());
    }

    /**
     * Test getIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDStringAsLocalDateTime());
    }

    /**
     * Test getIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDStringAsLocalTime());
    }

    /**
     * Test getIDStringAsString() method.
     */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals("4", JMetaDataText_Test.jMetaDataText.getIDStringAsString());
    }

    /**
     * Test getIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDStringAsBoolean());
    }

    /**
     * Test getIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(4), JMetaDataText_Test.jMetaDataText.getIDStringAsBigInteger());
    }

    /**
     * Test getIDStringAsURL() method.
     */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getIDStringAsURL());
    }

    /**
     * Test getInformAsInteger() method.
     */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(Integer.valueOf(4888), JMetaDataText_Test.jMetaDataText.getInformAsInteger());
    }

    /**
     * Test getInformAsLong() method.
     */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(Long.valueOf(4888), JMetaDataText_Test.jMetaDataText.getInformAsLong());
    }

    /**
     * Test getInformAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInformAsLocalDateTime());
    }

    /**
     * Test getInformAsLocalTime() method.
     */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInformAsLocalTime());
    }

    /**
     * Test getInformAsBoolean() method.
     */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInformAsBoolean());
    }

    /**
     * Test getInformAsBigInteger() method.
     */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(BigInteger.valueOf(4888), JMetaDataText_Test.jMetaDataText.getInformAsBigInteger());
    }

    /**
     * Test getInformAsURL() method.
     */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInformAsURL());
    }

    /**
     * Test getInternetMediaTypeAsInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsInteger());
    }

    /**
     * Test getInternetMediaTypeAsLong() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsLong());
    }

    /**
     * Test getInternetMediaTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsLocalDateTime());
    }

    /**
     * Test getInternetMediaTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsLocalTime());
    }

    /**
     * Test getInternetMediaTypeAsString() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsString());
    }

    /**
     * Test getInternetMediaTypeAsBoolean() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsBoolean());
    }

    /**
     * Test getInternetMediaTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsBigInteger());
    }

    /**
     * Test getInternetMediaTypeAsURL() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getInternetMediaTypeAsURL());
    }

    /**
     * Test getLanguageAsInteger() method.
     */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsInteger());
    }

    /**
     * Test getLanguageAsLong() method.
     */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsLong());
    }

    /**
     * Test getLanguageAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsLocalDateTime());
    }

    /**
     * Test getLanguageAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsLocalTime());
    }

    /**
     * Test getLanguageAsString() method.
     */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals("en", JMetaDataText_Test.jMetaDataText.getLanguageAsString());
    }

    /**
     * Test getLanguageAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsBoolean());
    }

    /**
     * Test getLanguageAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsBigInteger());
    }

    /**
     * Test getLanguageAsURL() method.
     */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageAsURL());
    }

    /**
     * Test getLanguageStringAsInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsInteger());
    }

    /**
     * Test getLanguageStringAsLong() method.
     */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsLong());
    }

    /**
     * Test getLanguageStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsLocalDateTime());
    }

    /**
     * Test getLanguageStringAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsLocalTime());
    }

    /**
     * Test getLanguageStringAsString() method.
     */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals("English", JMetaDataText_Test.jMetaDataText.getLanguageStringAsString());
    }

    /**
     * Test getLanguageStringAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsBoolean());
    }

    /**
     * Test getLanguageStringAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsBigInteger());
    }

    /**
     * Test getLanguageStringAsURL() method.
     */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageStringAsURL());
    }

    /**
     * Test getLanguageString1AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsInteger());
    }

    /**
     * Test getLanguageString1AsLong() method.
     */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsLong());
    }

    /**
     * Test getLanguageString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsLocalDateTime());
    }

    /**
     * Test getLanguageString1AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsLocalTime());
    }

    /**
     * Test getLanguageString1AsString() method.
     */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals("English", JMetaDataText_Test.jMetaDataText.getLanguageString1AsString());
    }

    /**
     * Test getLanguageString1AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsBoolean());
    }

    /**
     * Test getLanguageString1AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsBigInteger());
    }

    /**
     * Test getLanguageString1AsURL() method.
     */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString1AsURL());
    }

    /**
     * Test getLanguageString2AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsInteger());
    }

    /**
     * Test getLanguageString2AsLong() method.
     */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsLong());
    }

    /**
     * Test getLanguageString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsLocalDateTime());
    }

    /**
     * Test getLanguageString2AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsLocalTime());
    }

    /**
     * Test getLanguageString2AsString() method.
     */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals("en", JMetaDataText_Test.jMetaDataText.getLanguageString2AsString());
    }

    /**
     * Test getLanguageString2AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsBoolean());
    }

    /**
     * Test getLanguageString2AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsBigInteger());
    }

    /**
     * Test getLanguageString2AsURL() method.
     */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString2AsURL());
    }

    /**
     * Test getLanguageString3AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsInteger());
    }

    /**
     * Test getLanguageString3AsLong() method.
     */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsLong());
    }

    /**
     * Test getLanguageString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsLocalDateTime());
    }

    /**
     * Test getLanguageString3AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsLocalTime());
    }

    /**
     * Test getLanguageString3AsString() method.
     */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals("eng", JMetaDataText_Test.jMetaDataText.getLanguageString3AsString());
    }

    /**
     * Test getLanguageString3AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsBoolean());
    }

    /**
     * Test getLanguageString3AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsBigInteger());
    }

    /**
     * Test getLanguageString3AsURL() method.
     */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString3AsURL());
    }

    /**
     * Test getLanguageString4AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsInteger());
    }

    /**
     * Test getLanguageString4AsLong() method.
     */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsLong());
    }

    /**
     * Test getLanguageString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsLocalDateTime());
    }

    /**
     * Test getLanguageString4AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsLocalTime());
    }

    /**
     * Test getLanguageString4AsString() method.
     */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals("en", JMetaDataText_Test.jMetaDataText.getLanguageString4AsString());
    }

    /**
     * Test getLanguageString4AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsBoolean());
    }

    /**
     * Test getLanguageString4AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsBigInteger());
    }

    /**
     * Test getLanguageString4AsURL() method.
     */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageString4AsURL());
    }

    /**
     * Test getLanguageMoreAsInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsInteger());
    }

    /**
     * Test getLanguageMoreAsLong() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsLong());
    }

    /**
     * Test getLanguageMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsLocalDateTime());
    }

    /**
     * Test getLanguageMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsLocalTime());
    }

    /**
     * Test getLanguageMoreAsString() method.
     */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getLanguageMoreAsString());
    }

    /**
     * Test getLanguageMoreAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsBoolean());
    }

    /**
     * Test getLanguageMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsBigInteger());
    }

    /**
     * Test getLanguageMoreAsURL() method.
     */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getLanguageMoreAsURL());
    }

    /**
     * Test getMenuIDAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsInteger());
    }

    /**
     * Test getMenuIDAsLong() method.
     */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsLong());
    }

    /**
     * Test getMenuIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsLocalDateTime());
    }

    /**
     * Test getMenuIDAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsLocalTime());
    }

    /**
     * Test getMenuIDAsString() method.
     */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getMenuIDAsString());
    }

    /**
     * Test getMenuIDAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsBoolean());
    }

    /**
     * Test getMenuIDAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsBigInteger());
    }

    /**
     * Test getMenuIDAsURL() method.
     */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDAsURL());
    }

    /**
     * Test getMenuIDStringAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsInteger());
    }

    /**
     * Test getMenuIDStringAsLong() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsLong());
    }

    /**
     * Test getMenuIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsLocalDateTime());
    }

    /**
     * Test getMenuIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsLocalTime());
    }

    /**
     * Test getMenuIDStringAsString() method.
     */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getMenuIDStringAsString());
    }

    /**
     * Test getMenuIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsBoolean());
    }

    /**
     * Test getMenuIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsBigInteger());
    }

    /**
     * Test getMenuIDStringAsURL() method.
     */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMenuIDStringAsURL());
    }

    /**
     * Test getMuxingModeAsInteger() method.
     */
    @Test
    public void subTestGetMuxingModeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsInteger());
    }

    /**
     * Test getMuxingModeAsLong() method.
     */
    @Test
    public void subTestGetMuxingModeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsLong());
    }

    /**
     * Test getMuxingModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMuxingModeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsLocalDateTime());
    }

    /**
     * Test getMuxingModeAsLocalTime() method.
     */
    @Test
    public void subTestGetMuxingModeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsLocalTime());
    }

    /**
     * Test getMuxingModeAsString() method.
     */
    @Test
    public void subTestGetMuxingModeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getMuxingModeAsString());
    }

    /**
     * Test getMuxingModeAsBoolean() method.
     */
    @Test
    public void subTestGetMuxingModeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsBoolean());
    }

    /**
     * Test getMuxingModeAsBigInteger() method.
     */
    @Test
    public void subTestGetMuxingModeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsBigInteger());
    }

    /**
     * Test getMuxingModeAsURL() method.
     */
    @Test
    public void subTestGetMuxingModeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeAsURL());
    }

    /**
     * Test getMuxingModeMoreInfoAsInteger() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsInteger());
    }

    /**
     * Test getMuxingModeMoreInfoAsLong() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsLong());
    }

    /**
     * Test getMuxingModeMoreInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsLocalDateTime());
    }

    /**
     * Test getMuxingModeMoreInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsLocalTime());
    }

    /**
     * Test getMuxingModeMoreInfoAsString() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsString());
    }

    /**
     * Test getMuxingModeMoreInfoAsBoolean() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsBoolean());
    }

    /**
     * Test getMuxingModeMoreInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsBigInteger());
    }

    /**
     * Test getMuxingModeMoreInfoAsURL() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getMuxingModeMoreInfoAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsString());
    }

    /**
     * Test getOriginalSourceMediumIDAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsString());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getOriginalSourceMediumIDStringAsURL());
    }

    /**
     * Test getServiceKindAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsInteger());
    }

    /**
     * Test getServiceKindAsLong() method.
     */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsLong());
    }

    /**
     * Test getServiceKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsLocalDateTime());
    }

    /**
     * Test getServiceKindAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsLocalTime());
    }

    /**
     * Test getServiceKindAsString() method.
     */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getServiceKindAsString());
    }

    /**
     * Test getServiceKindAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsBoolean());
    }

    /**
     * Test getServiceKindAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsBigInteger());
    }

    /**
     * Test getServiceKindAsURL() method.
     */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindAsURL());
    }

    /**
     * Test getServiceKindStringAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsInteger());
    }

    /**
     * Test getServiceKindStringAsLong() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsLong());
    }

    /**
     * Test getServiceKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsLocalDateTime());
    }

    /**
     * Test getServiceKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsLocalTime());
    }

    /**
     * Test getServiceKindStringAsString() method.
     */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getServiceKindStringAsString());
    }

    /**
     * Test getServiceKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsBoolean());
    }

    /**
     * Test getServiceKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsBigInteger());
    }

    /**
     * Test getServiceKindStringAsURL() method.
     */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getServiceKindStringAsURL());
    }

    /**
     * Test getSourceDurationAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsInteger());
    }

    /**
     * Test getSourceDurationAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsLong());
    }

    /**
     * Test getSourceDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsLocalDateTime());
    }

    /**
     * Test getSourceDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsLocalTime());
    }

    /**
     * Test getSourceDurationAsString() method.
     */
    @Test
    public void subTestGetSourceDurationAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationAsString());
    }

    /**
     * Test getSourceDurationAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsBoolean());
    }

    /**
     * Test getSourceDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsBigInteger());
    }

    /**
     * Test getSourceDurationAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationAsURL());
    }

    /**
     * Test getSourceDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsInteger());
    }

    /**
     * Test getSourceDurationStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsLong());
    }

    /**
     * Test getSourceDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsLocalTime());
    }

    /**
     * Test getSourceDurationStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsString());
    }

    /**
     * Test getSourceDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsBoolean());
    }

    /**
     * Test getSourceDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsBigInteger());
    }

    /**
     * Test getSourceDurationStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationStringAsURL());
    }

    /**
     * Test getSourceDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsInteger());
    }

    /**
     * Test getSourceDurationString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsLong());
    }

    /**
     * Test getSourceDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsLocalTime());
    }

    /**
     * Test getSourceDurationString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsString());
    }

    /**
     * Test getSourceDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsBoolean());
    }

    /**
     * Test getSourceDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsBigInteger());
    }

    /**
     * Test getSourceDurationString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString1AsURL());
    }

    /**
     * Test getSourceDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsInteger());
    }

    /**
     * Test getSourceDurationString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsLong());
    }

    /**
     * Test getSourceDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsLocalTime());
    }

    /**
     * Test getSourceDurationString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsString());
    }

    /**
     * Test getSourceDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsBoolean());
    }

    /**
     * Test getSourceDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsBigInteger());
    }

    /**
     * Test getSourceDurationString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString2AsURL());
    }

    /**
     * Test getSourceDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsInteger());
    }

    /**
     * Test getSourceDurationString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsLong());
    }

    /**
     * Test getSourceDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsLocalTime());
    }

    /**
     * Test getSourceDurationString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsString());
    }

    /**
     * Test getSourceDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsBoolean());
    }

    /**
     * Test getSourceDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsBigInteger());
    }

    /**
     * Test getSourceDurationString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString3AsURL());
    }

    /**
     * Test getSourceDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsInteger());
    }

    /**
     * Test getSourceDurationString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsLong());
    }

    /**
     * Test getSourceDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsLocalTime());
    }

    /**
     * Test getSourceDurationString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsString());
    }

    /**
     * Test getSourceDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsBoolean());
    }

    /**
     * Test getSourceDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsBigInteger());
    }

    /**
     * Test getSourceDurationString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString4AsURL());
    }

    /**
     * Test getSourceDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsInteger());
    }

    /**
     * Test getSourceDurationString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsLong());
    }

    /**
     * Test getSourceDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsLocalTime());
    }

    /**
     * Test getSourceDurationString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsString());
    }

    /**
     * Test getSourceDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsBoolean());
    }

    /**
     * Test getSourceDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsBigInteger());
    }

    /**
     * Test getSourceDurationString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationString5AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsLong());
    }

    /**
     * Test getSourceDurationFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameAsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsString());
    }

    /**
     * Test getSourceDurationFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameAsURL());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsLong());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsString());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameStringAsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString1AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString2AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString3AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString4AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationFirstFrameString5AsURL());
    }

    /**
     * Test getSourceDurationLastFrameAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsInteger());
    }

    /**
     * Test getSourceDurationLastFrameAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsLong());
    }

    /**
     * Test getSourceDurationLastFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameAsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsString());
    }

    /**
     * Test getSourceDurationLastFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameAsURL());
    }

    /**
     * Test getSourceDurationLastFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsInteger());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsLong());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsString());
    }

    /**
     * Test getSourceDurationLastFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameStringAsURL());
    }

    /**
     * Test getSourceDurationLastFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsString());
    }

    /**
     * Test getSourceDurationLastFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString1AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsString());
    }

    /**
     * Test getSourceDurationLastFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString2AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsString());
    }

    /**
     * Test getSourceDurationLastFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString3AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsString());
    }

    /**
     * Test getSourceDurationLastFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString4AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsString());
    }

    /**
     * Test getSourceDurationLastFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceDurationLastFrameString5AsURL());
    }

    /**
     * Test getSourceFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsInteger());
    }

    /**
     * Test getSourceFrameCountAsLong() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsLong());
    }

    /**
     * Test getSourceFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsLocalDateTime());
    }

    /**
     * Test getSourceFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsLocalTime());
    }

    /**
     * Test getSourceFrameCountAsString() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsString());
    }

    /**
     * Test getSourceFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsBoolean());
    }

    /**
     * Test getSourceFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsBigInteger());
    }

    /**
     * Test getSourceFrameCountAsURL() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceFrameCountAsURL());
    }

    /**
     * Test getSourceStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsInteger());
    }

    /**
     * Test getSourceStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsLong());
    }

    /**
     * Test getSourceStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsString());
    }

    /**
     * Test getSourceStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsBoolean());
    }

    /**
     * Test getSourceStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeAsURL());
    }

    /**
     * Test getSourceStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsInteger());
    }

    /**
     * Test getSourceStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsLong());
    }

    /**
     * Test getSourceStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsString());
    }

    /**
     * Test getSourceStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsBoolean());
    }

    /**
     * Test getSourceStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeStringAsURL());
    }

    /**
     * Test getSourceStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsInteger());
    }

    /**
     * Test getSourceStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsLong());
    }

    /**
     * Test getSourceStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsString());
    }

    /**
     * Test getSourceStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString1AsURL());
    }

    /**
     * Test getSourceStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsInteger());
    }

    /**
     * Test getSourceStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsLong());
    }

    /**
     * Test getSourceStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsString());
    }

    /**
     * Test getSourceStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString2AsURL());
    }

    /**
     * Test getSourceStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsInteger());
    }

    /**
     * Test getSourceStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsLong());
    }

    /**
     * Test getSourceStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsString());
    }

    /**
     * Test getSourceStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString3AsURL());
    }

    /**
     * Test getSourceStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsInteger());
    }

    /**
     * Test getSourceStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsLong());
    }

    /**
     * Test getSourceStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsString());
    }

    /**
     * Test getSourceStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString4AsURL());
    }

    /**
     * Test getSourceStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsInteger());
    }

    /**
     * Test getSourceStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsLong());
    }

    /**
     * Test getSourceStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsString());
    }

    /**
     * Test getSourceStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeString5AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedStringAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString1AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString2AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString3AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString4AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedString5AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeEncodedProportionAsURL());
    }

    /**
     * Test getSourceStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsInteger());
    }

    /**
     * Test getSourceStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsLong());
    }

    /**
     * Test getSourceStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsString());
    }

    /**
     * Test getSourceStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsBoolean());
    }

    /**
     * Test getSourceStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSourceStreamSizeProportionAsURL());
    }

    /**
     * Test getStatusAsInteger() method.
     */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsInteger());
    }

    /**
     * Test getStatusAsLong() method.
     */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsLong());
    }

    /**
     * Test getStatusAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsLocalDateTime());
    }

    /**
     * Test getStatusAsLocalTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsLocalTime());
    }

    /**
     * Test getStatusAsString() method.
     */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStatusAsString());
    }

    /**
     * Test getStatusAsBoolean() method.
     */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsBoolean());
    }

    /**
     * Test getStatusAsBigInteger() method.
     */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsBigInteger());
    }

    /**
     * Test getStatusAsURL() method.
     */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStatusAsURL());
    }

    /**
     * Test getStreamCountAsInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataText_Test.jMetaDataText.getStreamCountAsInteger());
    }

    /**
     * Test getStreamCountAsLong() method.
     */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(Long.valueOf(8), JMetaDataText_Test.jMetaDataText.getStreamCountAsLong());
    }

    /**
     * Test getStreamCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamCountAsLocalDateTime());
    }

    /**
     * Test getStreamCountAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamCountAsLocalTime());
    }

    /**
     * Test getStreamCountAsString() method.
     */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals("8", JMetaDataText_Test.jMetaDataText.getStreamCountAsString());
    }

    /**
     * Test getStreamCountAsBoolean() method.
     */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamCountAsBoolean());
    }

    /**
     * Test getStreamCountAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataText_Test.jMetaDataText.getStreamCountAsBigInteger());
    }

    /**
     * Test getStreamCountAsURL() method.
     */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamCountAsURL());
    }

    /**
     * Test getStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsInteger());
    }

    /**
     * Test getStreamKindAsLong() method.
     */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsLong());
    }

    /**
     * Test getStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsLocalDateTime());
    }

    /**
     * Test getStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsLocalTime());
    }

    /**
     * Test getStreamKindAsString() method.
     */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals("Text", JMetaDataText_Test.jMetaDataText.getStreamKindAsString());
    }

    /**
     * Test getStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsBoolean());
    }

    /**
     * Test getStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsBigInteger());
    }

    /**
     * Test getStreamKindAsURL() method.
     */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindAsURL());
    }

    /**
     * Test getStreamKindStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsInteger());
    }

    /**
     * Test getStreamKindStringAsLong() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsLong());
    }

    /**
     * Test getStreamKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsLocalDateTime());
    }

    /**
     * Test getStreamKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsLocalTime());
    }

    /**
     * Test getStreamKindStringAsString() method.
     */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals("Text", JMetaDataText_Test.jMetaDataText.getStreamKindStringAsString());
    }

    /**
     * Test getStreamKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsBoolean());
    }

    /**
     * Test getStreamKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsBigInteger());
    }

    /**
     * Test getStreamKindStringAsURL() method.
     */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindStringAsURL());
    }

    /**
     * Test getStreamKindIDAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(Integer.valueOf(0), JMetaDataText_Test.jMetaDataText.getStreamKindIDAsInteger());
    }

    /**
     * Test getStreamKindIDAsLong() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(Long.valueOf(0), JMetaDataText_Test.jMetaDataText.getStreamKindIDAsLong());
    }

    /**
     * Test getStreamKindIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindIDAsLocalDateTime());
    }

    /**
     * Test getStreamKindIDAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindIDAsLocalTime());
    }

    /**
     * Test getStreamKindIDAsString() method.
     */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals("0", JMetaDataText_Test.jMetaDataText.getStreamKindIDAsString());
    }

    /**
     * Test getStreamKindIDAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindIDAsBoolean());
    }

    /**
     * Test getStreamKindIDAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(0), JMetaDataText_Test.jMetaDataText.getStreamKindIDAsBigInteger());
    }

    /**
     * Test getStreamKindIDAsURL() method.
     */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindIDAsURL());
    }

    /**
     * Test getStreamKindPosAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataText_Test.jMetaDataText.getStreamKindPosAsInteger());
    }

    /**
     * Test getStreamKindPosAsLong() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataText_Test.jMetaDataText.getStreamKindPosAsLong());
    }

    /**
     * Test getStreamKindPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindPosAsLocalDateTime());
    }

    /**
     * Test getStreamKindPosAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindPosAsLocalTime());
    }

    /**
     * Test getStreamKindPosAsString() method.
     */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals("1", JMetaDataText_Test.jMetaDataText.getStreamKindPosAsString());
    }

    /**
     * Test getStreamKindPosAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindPosAsBoolean());
    }

    /**
     * Test getStreamKindPosAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataText_Test.jMetaDataText.getStreamKindPosAsBigInteger());
    }

    /**
     * Test getStreamKindPosAsURL() method.
     */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamKindPosAsURL());
    }

    /**
     * Test getStreamOrderAsInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataText_Test.jMetaDataText.getStreamOrderAsInteger());
    }

    /**
     * Test getStreamOrderAsLong() method.
     */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataText_Test.jMetaDataText.getStreamOrderAsLong());
    }

    /**
     * Test getStreamOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamOrderAsLocalDateTime());
    }

    /**
     * Test getStreamOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamOrderAsLocalTime());
    }

    /**
     * Test getStreamOrderAsString() method.
     */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals("3", JMetaDataText_Test.jMetaDataText.getStreamOrderAsString());
    }

    /**
     * Test getStreamOrderAsBoolean() method.
     */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamOrderAsBoolean());
    }

    /**
     * Test getStreamOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataText_Test.jMetaDataText.getStreamOrderAsBigInteger());
    }

    /**
     * Test getStreamOrderAsURL() method.
     */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamOrderAsURL());
    }

    /**
     * Test getStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsInteger());
    }

    /**
     * Test getStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsLong());
    }

    /**
     * Test getStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsLocalDateTime());
    }

    /**
     * Test getStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsLocalTime());
    }

    /**
     * Test getStreamSizeAsString() method.
     */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeAsString());
    }

    /**
     * Test getStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsBoolean());
    }

    /**
     * Test getStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsBigInteger());
    }

    /**
     * Test getStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeAsURL());
    }

    /**
     * Test getStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsInteger());
    }

    /**
     * Test getStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsLong());
    }

    /**
     * Test getStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsLocalTime());
    }

    /**
     * Test getStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsString());
    }

    /**
     * Test getStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsBoolean());
    }

    /**
     * Test getStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsBigInteger());
    }

    /**
     * Test getStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeStringAsURL());
    }

    /**
     * Test getStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsInteger());
    }

    /**
     * Test getStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsLong());
    }

    /**
     * Test getStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsLocalTime());
    }

    /**
     * Test getStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsString());
    }

    /**
     * Test getStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsBoolean());
    }

    /**
     * Test getStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsBigInteger());
    }

    /**
     * Test getStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString1AsURL());
    }

    /**
     * Test getStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsInteger());
    }

    /**
     * Test getStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsLong());
    }

    /**
     * Test getStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsLocalTime());
    }

    /**
     * Test getStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsString());
    }

    /**
     * Test getStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsBoolean());
    }

    /**
     * Test getStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsBigInteger());
    }

    /**
     * Test getStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString2AsURL());
    }

    /**
     * Test getStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsInteger());
    }

    /**
     * Test getStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsLong());
    }

    /**
     * Test getStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsLocalTime());
    }

    /**
     * Test getStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsString());
    }

    /**
     * Test getStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsBoolean());
    }

    /**
     * Test getStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsBigInteger());
    }

    /**
     * Test getStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString3AsURL());
    }

    /**
     * Test getStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsInteger());
    }

    /**
     * Test getStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsLong());
    }

    /**
     * Test getStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsLocalTime());
    }

    /**
     * Test getStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsString());
    }

    /**
     * Test getStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsBoolean());
    }

    /**
     * Test getStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsBigInteger());
    }

    /**
     * Test getStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString4AsURL());
    }

    /**
     * Test getStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsInteger());
    }

    /**
     * Test getStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsLong());
    }

    /**
     * Test getStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsLocalTime());
    }

    /**
     * Test getStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsString());
    }

    /**
     * Test getStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsBoolean());
    }

    /**
     * Test getStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsBigInteger());
    }

    /**
     * Test getStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeString5AsURL());
    }

    /**
     * Test getStreamSizeDemuxedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsLong());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsString());
    }

    /**
     * Test getStreamSizeDemuxedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedAsURL());
    }

    /**
     * Test getStreamSizeDemuxedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsLong());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsString());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedStringAsURL());
    }

    /**
     * Test getStreamSizeDemuxedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsString());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString1AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsString());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsString());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString3AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsString());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString4AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsString());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeDemuxedString5AsURL());
    }

    /**
     * Test getStreamSizeEncodedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsInteger());
    }

    /**
     * Test getStreamSizeEncodedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsLong());
    }

    /**
     * Test getStreamSizeEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsString());
    }

    /**
     * Test getStreamSizeEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedAsURL());
    }

    /**
     * Test getStreamSizeEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsInteger());
    }

    /**
     * Test getStreamSizeEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsLong());
    }

    /**
     * Test getStreamSizeEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsString());
    }

    /**
     * Test getStreamSizeEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedStringAsURL());
    }

    /**
     * Test getStreamSizeEncodedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsLong());
    }

    /**
     * Test getStreamSizeEncodedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsString());
    }

    /**
     * Test getStreamSizeEncodedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString1AsURL());
    }

    /**
     * Test getStreamSizeEncodedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsLong());
    }

    /**
     * Test getStreamSizeEncodedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsString());
    }

    /**
     * Test getStreamSizeEncodedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString2AsURL());
    }

    /**
     * Test getStreamSizeEncodedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsLong());
    }

    /**
     * Test getStreamSizeEncodedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsString());
    }

    /**
     * Test getStreamSizeEncodedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString3AsURL());
    }

    /**
     * Test getStreamSizeEncodedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsLong());
    }

    /**
     * Test getStreamSizeEncodedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsString());
    }

    /**
     * Test getStreamSizeEncodedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString4AsURL());
    }

    /**
     * Test getStreamSizeEncodedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsLong());
    }

    /**
     * Test getStreamSizeEncodedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsString());
    }

    /**
     * Test getStreamSizeEncodedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedString5AsURL());
    }

    /**
     * Test getStreamSizeEncodedProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsInteger());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsLong());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsString());
    }

    /**
     * Test getStreamSizeEncodedProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeEncodedProportionAsURL());
    }

    /**
     * Test getStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsInteger());
    }

    /**
     * Test getStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsLong());
    }

    /**
     * Test getStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsString());
    }

    /**
     * Test getStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsBoolean());
    }

    /**
     * Test getStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getStreamSizeProportionAsURL());
    }

    /**
     * Test getSummaryAsInteger() method.
     */
    @Test
    public void subTestGetSummaryAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsInteger());
    }

    /**
     * Test getSummaryAsLong() method.
     */
    @Test
    public void subTestGetSummaryAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsLong());
    }

    /**
     * Test getSummaryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSummaryAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsLocalDateTime());
    }

    /**
     * Test getSummaryAsLocalTime() method.
     */
    @Test
    public void subTestGetSummaryAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsLocalTime());
    }

    /**
     * Test getSummaryAsString() method.
     */
    @Test
    public void subTestGetSummaryAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getSummaryAsString());
    }

    /**
     * Test getSummaryAsBoolean() method.
     */
    @Test
    public void subTestGetSummaryAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsBoolean());
    }

    /**
     * Test getSummaryAsBigInteger() method.
     */
    @Test
    public void subTestGetSummaryAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsBigInteger());
    }

    /**
     * Test getSummaryAsURL() method.
     */
    @Test
    public void subTestGetSummaryAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getSummaryAsURL());
    }

    /**
     * Test getTaggedDateAsInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsInteger());
    }

    /**
     * Test getTaggedDateAsLong() method.
     */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsLong());
    }

    /**
     * Test getTaggedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsLocalDateTime());
    }

    /**
     * Test getTaggedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsLocalTime());
    }

    /**
     * Test getTaggedDateAsString() method.
     */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getTaggedDateAsString());
    }

    /**
     * Test getTaggedDateAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsBoolean());
    }

    /**
     * Test getTaggedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsBigInteger());
    }

    /**
     * Test getTaggedDateAsURL() method.
     */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTaggedDateAsURL());
    }

    /**
     * Test getTitleAsInteger() method.
     */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsInteger());
    }

    /**
     * Test getTitleAsLong() method.
     */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsLong());
    }

    /**
     * Test getTitleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsLocalDateTime());
    }

    /**
     * Test getTitleAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsLocalTime());
    }

    /**
     * Test getTitleAsString() method.
     */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals("English", JMetaDataText_Test.jMetaDataText.getTitleAsString());
    }

    /**
     * Test getTitleAsBoolean() method.
     */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsBoolean());
    }

    /**
     * Test getTitleAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsBigInteger());
    }

    /**
     * Test getTitleAsURL() method.
     */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getTitleAsURL());
    }

    /**
     * Test getUniqueIDAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDAsInteger());
    }

    /**
     * Test getUniqueIDAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(new Long("5769028810173530433"), JMetaDataText_Test.jMetaDataText.getUniqueIDAsLong());
    }

    /**
     * Test getUniqueIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDAsLocalDateTime());
    }

    /**
     * Test getUniqueIDAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDAsLocalTime());
    }

    /**
     * Test getUniqueIDAsString() method.
     */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals("5769028810173530433", JMetaDataText_Test.jMetaDataText.getUniqueIDAsString());
    }

    /**
     * Test getUniqueIDAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDAsBoolean());
    }

    /**
     * Test getUniqueIDAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(new BigInteger("5769028810173530433"), JMetaDataText_Test.jMetaDataText.getUniqueIDAsBigInteger());
    }

    /**
     * Test getUniqueIDAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDAsURL());
    }

    /**
     * Test getUniqueIDStringAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsInteger());
    }

    /**
     * Test getUniqueIDStringAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsLong());
    }

    /**
     * Test getUniqueIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsLocalDateTime());
    }

    /**
     * Test getUniqueIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsLocalTime());
    }

    /**
     * Test getUniqueIDStringAsString() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsString());
    }

    /**
     * Test getUniqueIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsBoolean());
    }

    /**
     * Test getUniqueIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsBigInteger());
    }

    /**
     * Test getUniqueIDStringAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getUniqueIDStringAsURL());
    }

    /**
     * Test getVideoDelayAsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsInteger());
    }

    /**
     * Test getVideoDelayAsLong() method.
     */
    @Test
    public void subTestGetVideoDelayAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsLong());
    }

    /**
     * Test getVideoDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsLocalDateTime());
    }

    /**
     * Test getVideoDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsLocalTime());
    }

    /**
     * Test getVideoDelayAsString() method.
     */
    @Test
    public void subTestGetVideoDelayAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayAsString());
    }

    /**
     * Test getVideoDelayAsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsBoolean());
    }

    /**
     * Test getVideoDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsBigInteger());
    }

    /**
     * Test getVideoDelayAsURL() method.
     */
    @Test
    public void subTestGetVideoDelayAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayAsURL());
    }

    /**
     * Test getVideoDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsInteger());
    }

    /**
     * Test getVideoDelayStringAsLong() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsLong());
    }

    /**
     * Test getVideoDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsLocalDateTime());
    }

    /**
     * Test getVideoDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsLocalTime());
    }

    /**
     * Test getVideoDelayStringAsString() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsString());
    }

    /**
     * Test getVideoDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsBoolean());
    }

    /**
     * Test getVideoDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsBigInteger());
    }

    /**
     * Test getVideoDelayStringAsURL() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayStringAsURL());
    }

    /**
     * Test getVideoDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsInteger());
    }

    /**
     * Test getVideoDelayString1AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsLong());
    }

    /**
     * Test getVideoDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsLocalTime());
    }

    /**
     * Test getVideoDelayString1AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsString());
    }

    /**
     * Test getVideoDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsBoolean());
    }

    /**
     * Test getVideoDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsBigInteger());
    }

    /**
     * Test getVideoDelayString1AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString1AsURL());
    }

    /**
     * Test getVideoDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsInteger());
    }

    /**
     * Test getVideoDelayString2AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsLong());
    }

    /**
     * Test getVideoDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsLocalTime());
    }

    /**
     * Test getVideoDelayString2AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsString());
    }

    /**
     * Test getVideoDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsBoolean());
    }

    /**
     * Test getVideoDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsBigInteger());
    }

    /**
     * Test getVideoDelayString2AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString2AsURL());
    }

    /**
     * Test getVideoDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsInteger());
    }

    /**
     * Test getVideoDelayString3AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsLong());
    }

    /**
     * Test getVideoDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsLocalTime());
    }

    /**
     * Test getVideoDelayString3AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsString());
    }

    /**
     * Test getVideoDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsBoolean());
    }

    /**
     * Test getVideoDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsBigInteger());
    }

    /**
     * Test getVideoDelayString3AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString3AsURL());
    }

    /**
     * Test getVideoDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsInteger());
    }

    /**
     * Test getVideoDelayString4AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsLong());
    }

    /**
     * Test getVideoDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsLocalTime());
    }

    /**
     * Test getVideoDelayString4AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsString());
    }

    /**
     * Test getVideoDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsBoolean());
    }

    /**
     * Test getVideoDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsBigInteger());
    }

    /**
     * Test getVideoDelayString4AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString4AsURL());
    }

    /**
     * Test getVideoDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsInteger());
    }

    /**
     * Test getVideoDelayString5AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsLong());
    }

    /**
     * Test getVideoDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsLocalTime());
    }

    /**
     * Test getVideoDelayString5AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsString());
    }

    /**
     * Test getVideoDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsBoolean());
    }

    /**
     * Test getVideoDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsBigInteger());
    }

    /**
     * Test getVideoDelayString5AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getVideoDelayString5AsURL());
    }

    /**
     * Test getWidthAsInteger() method.
     */
    @Test
    public void subTestGetWidthAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsInteger());
    }

    /**
     * Test getWidthAsLong() method.
     */
    @Test
    public void subTestGetWidthAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsLong());
    }

    /**
     * Test getWidthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsLocalDateTime());
    }

    /**
     * Test getWidthAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsLocalTime());
    }

    /**
     * Test getWidthAsString() method.
     */
    @Test
    public void subTestGetWidthAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getWidthAsString());
    }

    /**
     * Test getWidthAsBoolean() method.
     */
    @Test
    public void subTestGetWidthAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsBoolean());
    }

    /**
     * Test getWidthAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsBigInteger());
    }

    /**
     * Test getWidthAsURL() method.
     */
    @Test
    public void subTestGetWidthAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthAsURL());
    }

    /**
     * Test getWidthStringAsInteger() method.
     */
    @Test
    public void subTestGetWidthStringAsInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsInteger());
    }

    /**
     * Test getWidthStringAsLong() method.
     */
    @Test
    public void subTestGetWidthStringAsLong() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsLong());
    }

    /**
     * Test getWidthStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWidthStringAsLocalDateTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsLocalDateTime());
    }

    /**
     * Test getWidthStringAsLocalTime() method.
     */
    @Test
    public void subTestGetWidthStringAsLocalTime() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsLocalTime());
    }

    /**
     * Test getWidthStringAsString() method.
     */
    @Test
    public void subTestGetWidthStringAsString() {
        assertEquals("", JMetaDataText_Test.jMetaDataText.getWidthStringAsString());
    }

    /**
     * Test getWidthStringAsBoolean() method.
     */
    @Test
    public void subTestGetWidthStringAsBoolean() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsBoolean());
    }

    /**
     * Test getWidthStringAsBigInteger() method.
     */
    @Test
    public void subTestGetWidthStringAsBigInteger() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsBigInteger());
    }

    /**
     * Test getWidthStringAsURL() method.
     */
    @Test
    public void subTestGetWidthStringAsURL() {
        assertEquals(null, JMetaDataText_Test.jMetaDataText.getWidthStringAsURL());
    }

}
