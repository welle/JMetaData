package aka.jmetadata.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataMenu;

/**
 * This class contains tests methods for Menu informations of a specific Menu stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataMenu_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataMenu_Test.class.getName());

    private static JMetaDataMenu jMetaDataMenu;
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
                final List<@NonNull JMetaDataMenu> menuStreams = jMetaData.getMenuStreams();
                if (menuStreams.get(0) != null) {
                    jMetaDataMenu = menuStreams.get(0);
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
     * Test getAlternateGroupAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsInteger());
    }

    /**
     * Test getAlternateGroupAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsLong());
    }

    /**
     * Test getAlternateGroupAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsLocalTime());
    }

    /**
     * Test getAlternateGroupAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsString());
    }

    /**
     * Test getAlternateGroupAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsBoolean());
    }

    /**
     * Test getAlternateGroupAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsBigInteger());
    }

    /**
     * Test getAlternateGroupAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupAsURL());
    }

    /**
     * Test getAlternateGroupStringAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsInteger());
    }

    /**
     * Test getAlternateGroupStringAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsLong());
    }

    /**
     * Test getAlternateGroupStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsLocalTime());
    }

    /**
     * Test getAlternateGroupStringAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsString());
    }

    /**
     * Test getAlternateGroupStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsBoolean());
    }

    /**
     * Test getAlternateGroupStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsBigInteger());
    }

    /**
     * Test getAlternateGroupStringAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getAlternateGroupStringAsURL());
    }

    /**
     * Test getChaptersPosBeginAsInteger() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsInteger() {
        assertEquals(Integer.valueOf(92), JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsInteger());
    }

    /**
     * Test getChaptersPosBeginAsLong() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsLong() {
        assertEquals(Long.valueOf(92), JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsLong());
    }

    /**
     * Test getChaptersPosBeginAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsLocalDateTime());
    }

    /**
     * Test getChaptersPosBeginAsLocalTime() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsLocalTime());
    }

    /**
     * Test getChaptersPosBeginAsString() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsString() {
        assertEquals("92", JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsString());
    }

    /**
     * Test getChaptersPosBeginAsBoolean() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsBoolean());
    }

    /**
     * Test getChaptersPosBeginAsBigInteger() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsBigInteger() {
        assertEquals(BigInteger.valueOf(92), JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsBigInteger());
    }

    /**
     * Test getChaptersPosBeginAsURL() method.
     */
    @Test
    public void subTestGetChaptersPosBeginAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosBeginAsURL());
    }

    /**
     * Test getChaptersPosEndAsInteger() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsInteger() {
        assertEquals(Integer.valueOf(103), JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsInteger());
    }

    /**
     * Test getChaptersPosEndAsLong() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsLong() {
        assertEquals(Long.valueOf(103), JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsLong());
    }

    /**
     * Test getChaptersPosEndAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsLocalDateTime());
    }

    /**
     * Test getChaptersPosEndAsLocalTime() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsLocalTime());
    }

    /**
     * Test getChaptersPosEndAsString() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsString() {
        assertEquals("103", JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsString());
    }

    /**
     * Test getChaptersPosEndAsBoolean() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsBoolean());
    }

    /**
     * Test getChaptersPosEndAsBigInteger() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsBigInteger() {
        assertEquals(BigInteger.valueOf(103), JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsBigInteger());
    }

    /**
     * Test getChaptersPosEndAsURL() method.
     */
    @Test
    public void subTestGetChaptersPosEndAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getChaptersPosEndAsURL());
    }

    /**
     * Test getCodecIDAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsInteger());
    }

    /**
     * Test getCodecIDAsLong() method.
     */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsLong());
    }

    /**
     * Test getCodecIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsLocalDateTime());
    }

    /**
     * Test getCodecIDAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsLocalTime());
    }

    /**
     * Test getCodecIDAsString() method.
     */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsString());
    }

    /**
     * Test getCodecIDAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsBoolean());
    }

    /**
     * Test getCodecIDAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsBigInteger());
    }

    /**
     * Test getCodecIDAsURL() method.
     */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDAsURL());
    }

    /**
     * Test getCodecIDHintAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsInteger());
    }

    /**
     * Test getCodecIDHintAsLong() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsLong());
    }

    /**
     * Test getCodecIDHintAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsLocalDateTime());
    }

    /**
     * Test getCodecIDHintAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsLocalTime());
    }

    /**
     * Test getCodecIDHintAsString() method.
     */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsString());
    }

    /**
     * Test getCodecIDHintAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsBoolean());
    }

    /**
     * Test getCodecIDHintAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsBigInteger());
    }

    /**
     * Test getCodecIDHintAsURL() method.
     */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDHintAsURL());
    }

    /**
     * Test getCodecIDInfoAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsInteger());
    }

    /**
     * Test getCodecIDInfoAsLong() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsLong());
    }

    /**
     * Test getCodecIDInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsLocalDateTime());
    }

    /**
     * Test getCodecIDInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsLocalTime());
    }

    /**
     * Test getCodecIDInfoAsString() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsString());
    }

    /**
     * Test getCodecIDInfoAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsBoolean());
    }

    /**
     * Test getCodecIDInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsBigInteger());
    }

    /**
     * Test getCodecIDInfoAsURL() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDInfoAsURL());
    }

    /**
     * Test getCodecIDStringAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsInteger());
    }

    /**
     * Test getCodecIDStringAsLong() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsLong());
    }

    /**
     * Test getCodecIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsLocalDateTime());
    }

    /**
     * Test getCodecIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsLocalTime());
    }

    /**
     * Test getCodecIDStringAsString() method.
     */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsString());
    }

    /**
     * Test getCodecIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsBoolean());
    }

    /**
     * Test getCodecIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsBigInteger());
    }

    /**
     * Test getCodecIDStringAsURL() method.
     */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDStringAsURL());
    }

    /**
     * Test getCodecIDUrlAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsInteger());
    }

    /**
     * Test getCodecIDUrlAsLong() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsLong());
    }

    /**
     * Test getCodecIDUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsLocalDateTime());
    }

    /**
     * Test getCodecIDUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsLocalTime());
    }

    /**
     * Test getCodecIDUrlAsString() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsString());
    }

    /**
     * Test getCodecIDUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsBoolean());
    }

    /**
     * Test getCodecIDUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsBigInteger());
    }

    /**
     * Test getCodecIDUrlAsURL() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDUrlAsURL());
    }

    /**
     * Test getCodecIDDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsInteger());
    }

    /**
     * Test getCodecIDDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsLong());
    }

    /**
     * Test getCodecIDDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsLocalDateTime());
    }

    /**
     * Test getCodecIDDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsLocalTime());
    }

    /**
     * Test getCodecIDDescriptionAsString() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsString());
    }

    /**
     * Test getCodecIDDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsBoolean());
    }

    /**
     * Test getCodecIDDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsBigInteger());
    }

    /**
     * Test getCodecIDDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCodecIDDescriptionAsURL());
    }

    /**
     * Test getCountAsInteger() method.
     */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(Integer.valueOf(103), JMetaDataMenu_Test.jMetaDataMenu.getCountAsInteger());
    }

    /**
     * Test getCountAsLong() method.
     */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(Long.valueOf(103), JMetaDataMenu_Test.jMetaDataMenu.getCountAsLong());
    }

    /**
     * Test getCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountAsLocalDateTime());
    }

    /**
     * Test getCountAsLocalTime() method.
     */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountAsLocalTime());
    }

    /**
     * Test getCountAsString() method.
     */
    @Test
    public void subTestGetCountAsString() {
        assertEquals("103", JMetaDataMenu_Test.jMetaDataMenu.getCountAsString());
    }

    /**
     * Test getCountAsBoolean() method.
     */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountAsBoolean());
    }

    /**
     * Test getCountAsBigInteger() method.
     */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(103), JMetaDataMenu_Test.jMetaDataMenu.getCountAsBigInteger());
    }

    /**
     * Test getCountAsURL() method.
     */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountAsURL());
    }

    /**
     * Test getCountriesAsInteger() method.
     */
    @Test
    public void subTestGetCountriesAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsInteger());
    }

    /**
     * Test getCountriesAsLong() method.
     */
    @Test
    public void subTestGetCountriesAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsLong());
    }

    /**
     * Test getCountriesAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountriesAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsLocalDateTime());
    }

    /**
     * Test getCountriesAsLocalTime() method.
     */
    @Test
    public void subTestGetCountriesAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsLocalTime());
    }

    /**
     * Test getCountriesAsString() method.
     */
    @Test
    public void subTestGetCountriesAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsString());
    }

    /**
     * Test getCountriesAsBoolean() method.
     */
    @Test
    public void subTestGetCountriesAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsBoolean());
    }

    /**
     * Test getCountriesAsBigInteger() method.
     */
    @Test
    public void subTestGetCountriesAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsBigInteger());
    }

    /**
     * Test getCountriesAsURL() method.
     */
    @Test
    public void subTestGetCountriesAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getCountriesAsURL());
    }

    /**
     * Test getDefaultAsInteger() method.
     */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsInteger());
    }

    /**
     * Test getDefaultAsLong() method.
     */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsLong());
    }

    /**
     * Test getDefaultAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsLocalDateTime());
    }

    /**
     * Test getDefaultAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsLocalTime());
    }

    /**
     * Test getDefaultAsString() method.
     */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsString());
    }

    /**
     * Test getDefaultAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsBoolean());
    }

    /**
     * Test getDefaultAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsBigInteger());
    }

    /**
     * Test getDefaultAsURL() method.
     */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultAsURL());
    }

    /**
     * Test getDefaultStringAsInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsInteger());
    }

    /**
     * Test getDefaultStringAsLong() method.
     */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsLong());
    }

    /**
     * Test getDefaultStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsLocalDateTime());
    }

    /**
     * Test getDefaultStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsLocalTime());
    }

    /**
     * Test getDefaultStringAsString() method.
     */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsString());
    }

    /**
     * Test getDefaultStringAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsBoolean());
    }

    /**
     * Test getDefaultStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsBigInteger());
    }

    /**
     * Test getDefaultStringAsURL() method.
     */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDefaultStringAsURL());
    }

    /**
     * Test getDelayAsInteger() method.
     */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsInteger());
    }

    /**
     * Test getDelayAsLong() method.
     */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsLong());
    }

    /**
     * Test getDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsLocalDateTime());
    }

    /**
     * Test getDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsLocalTime());
    }

    /**
     * Test getDelayAsString() method.
     */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayAsString());
    }

    /**
     * Test getDelayAsBoolean() method.
     */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsBoolean());
    }

    /**
     * Test getDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsBigInteger());
    }

    /**
     * Test getDelayAsURL() method.
     */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayAsURL());
    }

    /**
     * Test getDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsInteger());
    }

    /**
     * Test getDelayStringAsLong() method.
     */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsLong());
    }

    /**
     * Test getDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsLocalDateTime());
    }

    /**
     * Test getDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsLocalTime());
    }

    /**
     * Test getDelayStringAsString() method.
     */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsString());
    }

    /**
     * Test getDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsBoolean());
    }

    /**
     * Test getDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsBigInteger());
    }

    /**
     * Test getDelayStringAsURL() method.
     */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayStringAsURL());
    }

    /**
     * Test getDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsInteger());
    }

    /**
     * Test getDelayString1AsLong() method.
     */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsLong());
    }

    /**
     * Test getDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsLocalDateTime());
    }

    /**
     * Test getDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsLocalTime());
    }

    /**
     * Test getDelayString1AsString() method.
     */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsString());
    }

    /**
     * Test getDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsBoolean());
    }

    /**
     * Test getDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsBigInteger());
    }

    /**
     * Test getDelayString1AsURL() method.
     */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString1AsURL());
    }

    /**
     * Test getDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsInteger());
    }

    /**
     * Test getDelayString2AsLong() method.
     */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsLong());
    }

    /**
     * Test getDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsLocalDateTime());
    }

    /**
     * Test getDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsLocalTime());
    }

    /**
     * Test getDelayString2AsString() method.
     */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsString());
    }

    /**
     * Test getDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsBoolean());
    }

    /**
     * Test getDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsBigInteger());
    }

    /**
     * Test getDelayString2AsURL() method.
     */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString2AsURL());
    }

    /**
     * Test getDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsInteger());
    }

    /**
     * Test getDelayString3AsLong() method.
     */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsLong());
    }

    /**
     * Test getDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsLocalDateTime());
    }

    /**
     * Test getDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsLocalTime());
    }

    /**
     * Test getDelayString3AsString() method.
     */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsString());
    }

    /**
     * Test getDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsBoolean());
    }

    /**
     * Test getDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsBigInteger());
    }

    /**
     * Test getDelayString3AsURL() method.
     */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString3AsURL());
    }

    /**
     * Test getDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsInteger());
    }

    /**
     * Test getDelayString4AsLong() method.
     */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsLong());
    }

    /**
     * Test getDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsLocalDateTime());
    }

    /**
     * Test getDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsLocalTime());
    }

    /**
     * Test getDelayString4AsString() method.
     */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsString());
    }

    /**
     * Test getDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsBoolean());
    }

    /**
     * Test getDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsBigInteger());
    }

    /**
     * Test getDelayString4AsURL() method.
     */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString4AsURL());
    }

    /**
     * Test getDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsInteger());
    }

    /**
     * Test getDelayString5AsLong() method.
     */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsLong());
    }

    /**
     * Test getDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsLocalDateTime());
    }

    /**
     * Test getDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsLocalTime());
    }

    /**
     * Test getDelayString5AsString() method.
     */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsString());
    }

    /**
     * Test getDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsBoolean());
    }

    /**
     * Test getDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsBigInteger());
    }

    /**
     * Test getDelayString5AsURL() method.
     */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayString5AsURL());
    }

    /**
     * Test getDelayDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsInteger());
    }

    /**
     * Test getDelayDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsLong());
    }

    /**
     * Test getDelayDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsLocalTime());
    }

    /**
     * Test getDelayDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsString());
    }

    /**
     * Test getDelayDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsBoolean());
    }

    /**
     * Test getDelayDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsBigInteger());
    }

    /**
     * Test getDelayDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelayDropFrameAsURL());
    }

    /**
     * Test getDelaySettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsInteger());
    }

    /**
     * Test getDelaySettingsAsLong() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsLong());
    }

    /**
     * Test getDelaySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsLocalDateTime());
    }

    /**
     * Test getDelaySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsLocalTime());
    }

    /**
     * Test getDelaySettingsAsString() method.
     */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsString());
    }

    /**
     * Test getDelaySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsBoolean());
    }

    /**
     * Test getDelaySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsBigInteger());
    }

    /**
     * Test getDelaySettingsAsURL() method.
     */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySettingsAsURL());
    }

    /**
     * Test getDelaySourceAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsInteger());
    }

    /**
     * Test getDelaySourceAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsLong());
    }

    /**
     * Test getDelaySourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsLocalDateTime());
    }

    /**
     * Test getDelaySourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsLocalTime());
    }

    /**
     * Test getDelaySourceAsString() method.
     */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsString());
    }

    /**
     * Test getDelaySourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsBoolean());
    }

    /**
     * Test getDelaySourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsBigInteger());
    }

    /**
     * Test getDelaySourceAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDelaySourceAsURL());
    }

    /**
     * Test getDisabledAsInteger() method.
     */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsInteger());
    }

    /**
     * Test getDisabledAsLong() method.
     */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsLong());
    }

    /**
     * Test getDisabledAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsLocalDateTime());
    }

    /**
     * Test getDisabledAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsLocalTime());
    }

    /**
     * Test getDisabledAsString() method.
     */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsString());
    }

    /**
     * Test getDisabledAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsBoolean());
    }

    /**
     * Test getDisabledAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsBigInteger());
    }

    /**
     * Test getDisabledAsURL() method.
     */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledAsURL());
    }

    /**
     * Test getDisabledStringAsInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsInteger());
    }

    /**
     * Test getDisabledStringAsLong() method.
     */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsLong());
    }

    /**
     * Test getDisabledStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsLocalDateTime());
    }

    /**
     * Test getDisabledStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsLocalTime());
    }

    /**
     * Test getDisabledStringAsString() method.
     */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsString());
    }

    /**
     * Test getDisabledStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsBoolean());
    }

    /**
     * Test getDisabledStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsBigInteger());
    }

    /**
     * Test getDisabledStringAsURL() method.
     */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDisabledStringAsURL());
    }

    /**
     * Test getDurationAsInteger() method.
     */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsInteger());
    }

    /**
     * Test getDurationAsLong() method.
     */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsLong());
    }

    /**
     * Test getDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsLocalDateTime());
    }

    /**
     * Test getDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsLocalTime());
    }

    /**
     * Test getDurationAsString() method.
     */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationAsString());
    }

    /**
     * Test getDurationAsBoolean() method.
     */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsBoolean());
    }

    /**
     * Test getDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsBigInteger());
    }

    /**
     * Test getDurationAsURL() method.
     */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationAsURL());
    }

    /**
     * Test getDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsInteger());
    }

    /**
     * Test getDurationStringAsLong() method.
     */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsLong());
    }

    /**
     * Test getDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsLocalDateTime());
    }

    /**
     * Test getDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsLocalTime());
    }

    /**
     * Test getDurationStringAsString() method.
     */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsString());
    }

    /**
     * Test getDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsBoolean());
    }

    /**
     * Test getDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsBigInteger());
    }

    /**
     * Test getDurationStringAsURL() method.
     */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStringAsURL());
    }

    /**
     * Test getDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsInteger());
    }

    /**
     * Test getDurationString1AsLong() method.
     */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsLong());
    }

    /**
     * Test getDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsLocalDateTime());
    }

    /**
     * Test getDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsLocalTime());
    }

    /**
     * Test getDurationString1AsString() method.
     */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsString());
    }

    /**
     * Test getDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsBoolean());
    }

    /**
     * Test getDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsBigInteger());
    }

    /**
     * Test getDurationString1AsURL() method.
     */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString1AsURL());
    }

    /**
     * Test getDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsInteger());
    }

    /**
     * Test getDurationString2AsLong() method.
     */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsLong());
    }

    /**
     * Test getDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsLocalDateTime());
    }

    /**
     * Test getDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsLocalTime());
    }

    /**
     * Test getDurationString2AsString() method.
     */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsString());
    }

    /**
     * Test getDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsBoolean());
    }

    /**
     * Test getDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsBigInteger());
    }

    /**
     * Test getDurationString2AsURL() method.
     */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString2AsURL());
    }

    /**
     * Test getDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsInteger());
    }

    /**
     * Test getDurationString3AsLong() method.
     */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsLong());
    }

    /**
     * Test getDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsLocalDateTime());
    }

    /**
     * Test getDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsLocalTime());
    }

    /**
     * Test getDurationString3AsString() method.
     */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsString());
    }

    /**
     * Test getDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsBoolean());
    }

    /**
     * Test getDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsBigInteger());
    }

    /**
     * Test getDurationString3AsURL() method.
     */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString3AsURL());
    }

    /**
     * Test getDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsInteger());
    }

    /**
     * Test getDurationString4AsLong() method.
     */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsLong());
    }

    /**
     * Test getDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsLocalDateTime());
    }

    /**
     * Test getDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsLocalTime());
    }

    /**
     * Test getDurationString4AsString() method.
     */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsString());
    }

    /**
     * Test getDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsBoolean());
    }

    /**
     * Test getDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsBigInteger());
    }

    /**
     * Test getDurationString4AsURL() method.
     */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString4AsURL());
    }

    /**
     * Test getDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsInteger());
    }

    /**
     * Test getDurationString5AsLong() method.
     */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsLong());
    }

    /**
     * Test getDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsLocalDateTime());
    }

    /**
     * Test getDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsLocalTime());
    }

    /**
     * Test getDurationString5AsString() method.
     */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsString());
    }

    /**
     * Test getDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsBoolean());
    }

    /**
     * Test getDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsBigInteger());
    }

    /**
     * Test getDurationString5AsURL() method.
     */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationString5AsURL());
    }

    /**
     * Test getDurationEndAsInteger() method.
     */
    @Test
    public void subTestGetDurationEndAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsInteger());
    }

    /**
     * Test getDurationEndAsLong() method.
     */
    @Test
    public void subTestGetDurationEndAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsLong());
    }

    /**
     * Test getDurationEndAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationEndAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsLocalDateTime());
    }

    /**
     * Test getDurationEndAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationEndAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsLocalTime());
    }

    /**
     * Test getDurationEndAsString() method.
     */
    @Test
    public void subTestGetDurationEndAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsString());
    }

    /**
     * Test getDurationEndAsBoolean() method.
     */
    @Test
    public void subTestGetDurationEndAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsBoolean());
    }

    /**
     * Test getDurationEndAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationEndAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsBigInteger());
    }

    /**
     * Test getDurationEndAsURL() method.
     */
    @Test
    public void subTestGetDurationEndAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationEndAsURL());
    }

    /**
     * Test getDurationStartAsInteger() method.
     */
    @Test
    public void subTestGetDurationStartAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsInteger());
    }

    /**
     * Test getDurationStartAsLong() method.
     */
    @Test
    public void subTestGetDurationStartAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsLong());
    }

    /**
     * Test getDurationStartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStartAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsLocalDateTime());
    }

    /**
     * Test getDurationStartAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStartAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsLocalTime());
    }

    /**
     * Test getDurationStartAsString() method.
     */
    @Test
    public void subTestGetDurationStartAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsString());
    }

    /**
     * Test getDurationStartAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStartAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsBoolean());
    }

    /**
     * Test getDurationStartAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStartAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsBigInteger());
    }

    /**
     * Test getDurationStartAsURL() method.
     */
    @Test
    public void subTestGetDurationStartAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getDurationStartAsURL());
    }

    /**
     * Test getFirstPacketOrderAsInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsInteger());
    }

    /**
     * Test getFirstPacketOrderAsLong() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsLong());
    }

    /**
     * Test getFirstPacketOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsLocalDateTime());
    }

    /**
     * Test getFirstPacketOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsLocalTime());
    }

    /**
     * Test getFirstPacketOrderAsString() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsString());
    }

    /**
     * Test getFirstPacketOrderAsBoolean() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsBoolean());
    }

    /**
     * Test getFirstPacketOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsBigInteger());
    }

    /**
     * Test getFirstPacketOrderAsURL() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFirstPacketOrderAsURL());
    }

    /**
     * Test getForcedAsInteger() method.
     */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsInteger());
    }

    /**
     * Test getForcedAsLong() method.
     */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsLong());
    }

    /**
     * Test getForcedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsLocalDateTime());
    }

    /**
     * Test getForcedAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsLocalTime());
    }

    /**
     * Test getForcedAsString() method.
     */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getForcedAsString());
    }

    /**
     * Test getForcedAsBoolean() method.
     */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsBoolean());
    }

    /**
     * Test getForcedAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsBigInteger());
    }

    /**
     * Test getForcedAsURL() method.
     */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedAsURL());
    }

    /**
     * Test getForcedStringAsInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsInteger());
    }

    /**
     * Test getForcedStringAsLong() method.
     */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsLong());
    }

    /**
     * Test getForcedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsLocalDateTime());
    }

    /**
     * Test getForcedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsLocalTime());
    }

    /**
     * Test getForcedStringAsString() method.
     */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsString());
    }

    /**
     * Test getForcedStringAsBoolean() method.
     */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsBoolean());
    }

    /**
     * Test getForcedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsBigInteger());
    }

    /**
     * Test getForcedStringAsURL() method.
     */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getForcedStringAsURL());
    }

    /**
     * Test getFormatAsInteger() method.
     */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsInteger());
    }

    /**
     * Test getFormatAsLong() method.
     */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsLong());
    }

    /**
     * Test getFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsLocalDateTime());
    }

    /**
     * Test getFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsLocalTime());
    }

    /**
     * Test getFormatAsString() method.
     */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatAsString());
    }

    /**
     * Test getFormatAsBoolean() method.
     */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsBoolean());
    }

    /**
     * Test getFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsBigInteger());
    }

    /**
     * Test getFormatAsURL() method.
     */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatAsURL());
    }

    /**
     * Test getFormatInfoAsInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsInteger());
    }

    /**
     * Test getFormatInfoAsLong() method.
     */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsLong());
    }

    /**
     * Test getFormatInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsLocalDateTime());
    }

    /**
     * Test getFormatInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsLocalTime());
    }

    /**
     * Test getFormatInfoAsString() method.
     */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsString());
    }

    /**
     * Test getFormatInfoAsBoolean() method.
     */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsBoolean());
    }

    /**
     * Test getFormatInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsBigInteger());
    }

    /**
     * Test getFormatInfoAsURL() method.
     */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatInfoAsURL());
    }

    /**
     * Test getFormatUrlAsInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsInteger());
    }

    /**
     * Test getFormatUrlAsLong() method.
     */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsLong());
    }

    /**
     * Test getFormatUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsLocalDateTime());
    }

    /**
     * Test getFormatUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsLocalTime());
    }

    /**
     * Test getFormatUrlAsString() method.
     */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsString());
    }

    /**
     * Test getFormatUrlAsBoolean() method.
     */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsBoolean());
    }

    /**
     * Test getFormatUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsBigInteger());
    }

    /**
     * Test getFormatUrlAsURL() method.
     */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatUrlAsURL());
    }

    /**
     * Test getFormatCommercialAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsInteger());
    }

    /**
     * Test getFormatCommercialAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsLong());
    }

    /**
     * Test getFormatCommercialAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsLocalTime());
    }

    /**
     * Test getFormatCommercialAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsString());
    }

    /**
     * Test getFormatCommercialAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsBoolean());
    }

    /**
     * Test getFormatCommercialAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsBigInteger());
    }

    /**
     * Test getFormatCommercialAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialAsURL());
    }

    /**
     * Test getFormatCommercialIfAnyAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsLong());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsLocalTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsString());
    }

    /**
     * Test getFormatCommercialIfAnyAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsBoolean());
    }

    /**
     * Test getFormatCommercialIfAnyAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsBigInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCommercialIfAnyAsURL());
    }

    /**
     * Test getFormatCompressionAsInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsInteger());
    }

    /**
     * Test getFormatCompressionAsLong() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsLong());
    }

    /**
     * Test getFormatCompressionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsLocalDateTime());
    }

    /**
     * Test getFormatCompressionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsLocalTime());
    }

    /**
     * Test getFormatCompressionAsString() method.
     */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsString());
    }

    /**
     * Test getFormatCompressionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsBoolean());
    }

    /**
     * Test getFormatCompressionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsBigInteger());
    }

    /**
     * Test getFormatCompressionAsURL() method.
     */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatCompressionAsURL());
    }

    /**
     * Test getFormatProfileAsInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsInteger());
    }

    /**
     * Test getFormatProfileAsLong() method.
     */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsLong());
    }

    /**
     * Test getFormatProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsLocalDateTime());
    }

    /**
     * Test getFormatProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsLocalTime());
    }

    /**
     * Test getFormatProfileAsString() method.
     */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsString());
    }

    /**
     * Test getFormatProfileAsBoolean() method.
     */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsBoolean());
    }

    /**
     * Test getFormatProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsBigInteger());
    }

    /**
     * Test getFormatProfileAsURL() method.
     */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatProfileAsURL());
    }

    /**
     * Test getFormatSettingsAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsInteger());
    }

    /**
     * Test getFormatSettingsAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsLong());
    }

    /**
     * Test getFormatSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsLocalTime());
    }

    /**
     * Test getFormatSettingsAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsString());
    }

    /**
     * Test getFormatSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsBoolean());
    }

    /**
     * Test getFormatSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsBigInteger());
    }

    /**
     * Test getFormatSettingsAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatSettingsAsURL());
    }

    /**
     * Test getFormatVersionAsInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsInteger());
    }

    /**
     * Test getFormatVersionAsLong() method.
     */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsLong());
    }

    /**
     * Test getFormatVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsLocalDateTime());
    }

    /**
     * Test getFormatVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsLocalTime());
    }

    /**
     * Test getFormatVersionAsString() method.
     */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsString());
    }

    /**
     * Test getFormatVersionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsBoolean());
    }

    /**
     * Test getFormatVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsBigInteger());
    }

    /**
     * Test getFormatVersionAsURL() method.
     */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getFormatVersionAsURL());
    }

    /**
     * Test getIDAsInteger() method.
     */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsInteger());
    }

    /**
     * Test getIDAsLong() method.
     */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsLong());
    }

    /**
     * Test getIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsLocalDateTime());
    }

    /**
     * Test getIDAsLocalTime() method.
     */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsLocalTime());
    }

    /**
     * Test getIDAsString() method.
     */
    @Test
    public void subTestGetIDAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getIDAsString());
    }

    /**
     * Test getIDAsBoolean() method.
     */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsBoolean());
    }

    /**
     * Test getIDAsBigInteger() method.
     */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsBigInteger());
    }

    /**
     * Test getIDAsURL() method.
     */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDAsURL());
    }

    /**
     * Test getIDStringAsInteger() method.
     */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsInteger());
    }

    /**
     * Test getIDStringAsLong() method.
     */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsLong());
    }

    /**
     * Test getIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsLocalDateTime());
    }

    /**
     * Test getIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsLocalTime());
    }

    /**
     * Test getIDStringAsString() method.
     */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsString());
    }

    /**
     * Test getIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsBoolean());
    }

    /**
     * Test getIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsBigInteger());
    }

    /**
     * Test getIDStringAsURL() method.
     */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getIDStringAsURL());
    }

    /**
     * Test getInformAsInteger() method.
     */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getInformAsInteger());
    }

    /**
     * Test getInformAsLong() method.
     */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getInformAsLong());
    }

    /**
     * Test getInformAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getInformAsLocalDateTime());
    }

    /**
     * Test getInformAsLocalTime() method.
     */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getInformAsLocalTime());
    }

    /**
     * Test getInformAsBoolean() method.
     */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getInformAsBoolean());
    }

    /**
     * Test getInformAsBigInteger() method.
     */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(new BigInteger("11167000040417000051875000152167000242625000334459000600000000727667000803000001110000001235000"), JMetaDataMenu_Test.jMetaDataMenu.getInformAsBigInteger());
    }

    /**
     * Test getInformAsURL() method.
     */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getInformAsURL());
    }

    /**
     * Test getLanguageAsInteger() method.
     */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsInteger());
    }

    /**
     * Test getLanguageAsLong() method.
     */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsLong());
    }

    /**
     * Test getLanguageAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsLocalDateTime());
    }

    /**
     * Test getLanguageAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsLocalTime());
    }

    /**
     * Test getLanguageAsString() method.
     */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsString());
    }

    /**
     * Test getLanguageAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsBoolean());
    }

    /**
     * Test getLanguageAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsBigInteger());
    }

    /**
     * Test getLanguageAsURL() method.
     */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageAsURL());
    }

    /**
     * Test getLanguageStringAsInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsInteger());
    }

    /**
     * Test getLanguageStringAsLong() method.
     */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsLong());
    }

    /**
     * Test getLanguageStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsLocalDateTime());
    }

    /**
     * Test getLanguageStringAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsLocalTime());
    }

    /**
     * Test getLanguageStringAsString() method.
     */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsString());
    }

    /**
     * Test getLanguageStringAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsBoolean());
    }

    /**
     * Test getLanguageStringAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsBigInteger());
    }

    /**
     * Test getLanguageStringAsURL() method.
     */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageStringAsURL());
    }

    /**
     * Test getLanguageString1AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsInteger());
    }

    /**
     * Test getLanguageString1AsLong() method.
     */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsLong());
    }

    /**
     * Test getLanguageString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsLocalDateTime());
    }

    /**
     * Test getLanguageString1AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsLocalTime());
    }

    /**
     * Test getLanguageString1AsString() method.
     */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsString());
    }

    /**
     * Test getLanguageString1AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsBoolean());
    }

    /**
     * Test getLanguageString1AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsBigInteger());
    }

    /**
     * Test getLanguageString1AsURL() method.
     */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString1AsURL());
    }

    /**
     * Test getLanguageString2AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsInteger());
    }

    /**
     * Test getLanguageString2AsLong() method.
     */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsLong());
    }

    /**
     * Test getLanguageString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsLocalDateTime());
    }

    /**
     * Test getLanguageString2AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsLocalTime());
    }

    /**
     * Test getLanguageString2AsString() method.
     */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsString());
    }

    /**
     * Test getLanguageString2AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsBoolean());
    }

    /**
     * Test getLanguageString2AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsBigInteger());
    }

    /**
     * Test getLanguageString2AsURL() method.
     */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString2AsURL());
    }

    /**
     * Test getLanguageString3AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsInteger());
    }

    /**
     * Test getLanguageString3AsLong() method.
     */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsLong());
    }

    /**
     * Test getLanguageString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsLocalDateTime());
    }

    /**
     * Test getLanguageString3AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsLocalTime());
    }

    /**
     * Test getLanguageString3AsString() method.
     */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsString());
    }

    /**
     * Test getLanguageString3AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsBoolean());
    }

    /**
     * Test getLanguageString3AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsBigInteger());
    }

    /**
     * Test getLanguageString3AsURL() method.
     */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString3AsURL());
    }

    /**
     * Test getLanguageString4AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsInteger());
    }

    /**
     * Test getLanguageString4AsLong() method.
     */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsLong());
    }

    /**
     * Test getLanguageString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsLocalDateTime());
    }

    /**
     * Test getLanguageString4AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsLocalTime());
    }

    /**
     * Test getLanguageString4AsString() method.
     */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsString());
    }

    /**
     * Test getLanguageString4AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsBoolean());
    }

    /**
     * Test getLanguageString4AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsBigInteger());
    }

    /**
     * Test getLanguageString4AsURL() method.
     */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageString4AsURL());
    }

    /**
     * Test getLanguageMoreAsInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsInteger());
    }

    /**
     * Test getLanguageMoreAsLong() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsLong());
    }

    /**
     * Test getLanguageMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsLocalDateTime());
    }

    /**
     * Test getLanguageMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsLocalTime());
    }

    /**
     * Test getLanguageMoreAsString() method.
     */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsString());
    }

    /**
     * Test getLanguageMoreAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsBoolean());
    }

    /**
     * Test getLanguageMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsBigInteger());
    }

    /**
     * Test getLanguageMoreAsURL() method.
     */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLanguageMoreAsURL());
    }

    /**
     * Test getLawRatingAsInteger() method.
     */
    @Test
    public void subTestGetLawRatingAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsInteger());
    }

    /**
     * Test getLawRatingAsLong() method.
     */
    @Test
    public void subTestGetLawRatingAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsLong());
    }

    /**
     * Test getLawRatingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLawRatingAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsLocalDateTime());
    }

    /**
     * Test getLawRatingAsLocalTime() method.
     */
    @Test
    public void subTestGetLawRatingAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsLocalTime());
    }

    /**
     * Test getLawRatingAsString() method.
     */
    @Test
    public void subTestGetLawRatingAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsString());
    }

    /**
     * Test getLawRatingAsBoolean() method.
     */
    @Test
    public void subTestGetLawRatingAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsBoolean());
    }

    /**
     * Test getLawRatingAsBigInteger() method.
     */
    @Test
    public void subTestGetLawRatingAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsBigInteger());
    }

    /**
     * Test getLawRatingAsURL() method.
     */
    @Test
    public void subTestGetLawRatingAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingAsURL());
    }

    /**
     * Test getLawRatingReasonAsInteger() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsInteger());
    }

    /**
     * Test getLawRatingReasonAsLong() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsLong());
    }

    /**
     * Test getLawRatingReasonAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsLocalDateTime());
    }

    /**
     * Test getLawRatingReasonAsLocalTime() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsLocalTime());
    }

    /**
     * Test getLawRatingReasonAsString() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsString());
    }

    /**
     * Test getLawRatingReasonAsBoolean() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsBoolean());
    }

    /**
     * Test getLawRatingReasonAsBigInteger() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsBigInteger());
    }

    /**
     * Test getLawRatingReasonAsURL() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getLawRatingReasonAsURL());
    }

    /**
     * Test getListAsInteger() method.
     */
    @Test
    public void subTestGetListAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsInteger());
    }

    /**
     * Test getListAsLong() method.
     */
    @Test
    public void subTestGetListAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsLong());
    }

    /**
     * Test getListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetListAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsLocalDateTime());
    }

    /**
     * Test getListAsLocalTime() method.
     */
    @Test
    public void subTestGetListAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsLocalTime());
    }

    /**
     * Test getListAsString() method.
     */
    @Test
    public void subTestGetListAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getListAsString());
    }

    /**
     * Test getListAsBoolean() method.
     */
    @Test
    public void subTestGetListAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsBoolean());
    }

    /**
     * Test getListAsBigInteger() method.
     */
    @Test
    public void subTestGetListAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsBigInteger());
    }

    /**
     * Test getListAsURL() method.
     */
    @Test
    public void subTestGetListAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListAsURL());
    }

    /**
     * Test getListStringAsInteger() method.
     */
    @Test
    public void subTestGetListStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsInteger());
    }

    /**
     * Test getListStringAsLong() method.
     */
    @Test
    public void subTestGetListStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsLong());
    }

    /**
     * Test getListStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetListStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsLocalDateTime());
    }

    /**
     * Test getListStringAsLocalTime() method.
     */
    @Test
    public void subTestGetListStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsLocalTime());
    }

    /**
     * Test getListStringAsString() method.
     */
    @Test
    public void subTestGetListStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getListStringAsString());
    }

    /**
     * Test getListStringAsBoolean() method.
     */
    @Test
    public void subTestGetListStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsBoolean());
    }

    /**
     * Test getListStringAsBigInteger() method.
     */
    @Test
    public void subTestGetListStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsBigInteger());
    }

    /**
     * Test getListStringAsURL() method.
     */
    @Test
    public void subTestGetListStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStringAsURL());
    }

    /**
     * Test getListStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetListStreamKindAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsInteger());
    }

    /**
     * Test getListStreamKindAsLong() method.
     */
    @Test
    public void subTestGetListStreamKindAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsLong());
    }

    /**
     * Test getListStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetListStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsLocalDateTime());
    }

    /**
     * Test getListStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetListStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsLocalTime());
    }

    /**
     * Test getListStreamKindAsString() method.
     */
    @Test
    public void subTestGetListStreamKindAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsString());
    }

    /**
     * Test getListStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetListStreamKindAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsBoolean());
    }

    /**
     * Test getListStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetListStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsBigInteger());
    }

    /**
     * Test getListStreamKindAsURL() method.
     */
    @Test
    public void subTestGetListStreamKindAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamKindAsURL());
    }

    /**
     * Test getListStreamPosAsInteger() method.
     */
    @Test
    public void subTestGetListStreamPosAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsInteger());
    }

    /**
     * Test getListStreamPosAsLong() method.
     */
    @Test
    public void subTestGetListStreamPosAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsLong());
    }

    /**
     * Test getListStreamPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetListStreamPosAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsLocalDateTime());
    }

    /**
     * Test getListStreamPosAsLocalTime() method.
     */
    @Test
    public void subTestGetListStreamPosAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsLocalTime());
    }

    /**
     * Test getListStreamPosAsString() method.
     */
    @Test
    public void subTestGetListStreamPosAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsString());
    }

    /**
     * Test getListStreamPosAsBoolean() method.
     */
    @Test
    public void subTestGetListStreamPosAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsBoolean());
    }

    /**
     * Test getListStreamPosAsBigInteger() method.
     */
    @Test
    public void subTestGetListStreamPosAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsBigInteger());
    }

    /**
     * Test getListStreamPosAsURL() method.
     */
    @Test
    public void subTestGetListStreamPosAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getListStreamPosAsURL());
    }

    /**
     * Test getMenuIDAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsInteger());
    }

    /**
     * Test getMenuIDAsLong() method.
     */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsLong());
    }

    /**
     * Test getMenuIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsLocalDateTime());
    }

    /**
     * Test getMenuIDAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsLocalTime());
    }

    /**
     * Test getMenuIDAsString() method.
     */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsString());
    }

    /**
     * Test getMenuIDAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsBoolean());
    }

    /**
     * Test getMenuIDAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsBigInteger());
    }

    /**
     * Test getMenuIDAsURL() method.
     */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDAsURL());
    }

    /**
     * Test getMenuIDStringAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsInteger());
    }

    /**
     * Test getMenuIDStringAsLong() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsLong());
    }

    /**
     * Test getMenuIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsLocalDateTime());
    }

    /**
     * Test getMenuIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsLocalTime());
    }

    /**
     * Test getMenuIDStringAsString() method.
     */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsString());
    }

    /**
     * Test getMenuIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsBoolean());
    }

    /**
     * Test getMenuIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsBigInteger());
    }

    /**
     * Test getMenuIDStringAsURL() method.
     */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getMenuIDStringAsURL());
    }

    /**
     * Test getNetworkNameAsInteger() method.
     */
    @Test
    public void subTestGetNetworkNameAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsInteger());
    }

    /**
     * Test getNetworkNameAsLong() method.
     */
    @Test
    public void subTestGetNetworkNameAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsLong());
    }

    /**
     * Test getNetworkNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetNetworkNameAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsLocalDateTime());
    }

    /**
     * Test getNetworkNameAsLocalTime() method.
     */
    @Test
    public void subTestGetNetworkNameAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsLocalTime());
    }

    /**
     * Test getNetworkNameAsString() method.
     */
    @Test
    public void subTestGetNetworkNameAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsString());
    }

    /**
     * Test getNetworkNameAsBoolean() method.
     */
    @Test
    public void subTestGetNetworkNameAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsBoolean());
    }

    /**
     * Test getNetworkNameAsBigInteger() method.
     */
    @Test
    public void subTestGetNetworkNameAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsBigInteger());
    }

    /**
     * Test getNetworkNameAsURL() method.
     */
    @Test
    public void subTestGetNetworkNameAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getNetworkNameAsURL());
    }

    /**
     * Test getOriginalNetworkNameAsInteger() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsInteger());
    }

    /**
     * Test getOriginalNetworkNameAsLong() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsLong());
    }

    /**
     * Test getOriginalNetworkNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsLocalDateTime());
    }

    /**
     * Test getOriginalNetworkNameAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsLocalTime());
    }

    /**
     * Test getOriginalNetworkNameAsString() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsString());
    }

    /**
     * Test getOriginalNetworkNameAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsBoolean());
    }

    /**
     * Test getOriginalNetworkNameAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsBigInteger());
    }

    /**
     * Test getOriginalNetworkNameAsURL() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalNetworkNameAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsString());
    }

    /**
     * Test getOriginalSourceMediumIDAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsString());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getOriginalSourceMediumIDStringAsURL());
    }

    /**
     * Test getServiceUrlAsInteger() method.
     */
    @Test
    public void subTestGetServiceUrlAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsInteger());
    }

    /**
     * Test getServiceUrlAsLong() method.
     */
    @Test
    public void subTestGetServiceUrlAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsLong());
    }

    /**
     * Test getServiceUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsLocalDateTime());
    }

    /**
     * Test getServiceUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceUrlAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsLocalTime());
    }

    /**
     * Test getServiceUrlAsString() method.
     */
    @Test
    public void subTestGetServiceUrlAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsString());
    }

    /**
     * Test getServiceUrlAsBoolean() method.
     */
    @Test
    public void subTestGetServiceUrlAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsBoolean());
    }

    /**
     * Test getServiceUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceUrlAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsBigInteger());
    }

    /**
     * Test getServiceUrlAsURL() method.
     */
    @Test
    public void subTestGetServiceUrlAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceUrlAsURL());
    }

    /**
     * Test getServiceChannelAsInteger() method.
     */
    @Test
    public void subTestGetServiceChannelAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsInteger());
    }

    /**
     * Test getServiceChannelAsLong() method.
     */
    @Test
    public void subTestGetServiceChannelAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsLong());
    }

    /**
     * Test getServiceChannelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceChannelAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsLocalDateTime());
    }

    /**
     * Test getServiceChannelAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceChannelAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsLocalTime());
    }

    /**
     * Test getServiceChannelAsString() method.
     */
    @Test
    public void subTestGetServiceChannelAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsString());
    }

    /**
     * Test getServiceChannelAsBoolean() method.
     */
    @Test
    public void subTestGetServiceChannelAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsBoolean());
    }

    /**
     * Test getServiceChannelAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceChannelAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsBigInteger());
    }

    /**
     * Test getServiceChannelAsURL() method.
     */
    @Test
    public void subTestGetServiceChannelAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceChannelAsURL());
    }

    /**
     * Test getServiceKindAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsInteger());
    }

    /**
     * Test getServiceKindAsLong() method.
     */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsLong());
    }

    /**
     * Test getServiceKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsLocalDateTime());
    }

    /**
     * Test getServiceKindAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsLocalTime());
    }

    /**
     * Test getServiceKindAsString() method.
     */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsString());
    }

    /**
     * Test getServiceKindAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsBoolean());
    }

    /**
     * Test getServiceKindAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsBigInteger());
    }

    /**
     * Test getServiceKindAsURL() method.
     */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindAsURL());
    }

    /**
     * Test getServiceKindStringAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsInteger());
    }

    /**
     * Test getServiceKindStringAsLong() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsLong());
    }

    /**
     * Test getServiceKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsLocalDateTime());
    }

    /**
     * Test getServiceKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsLocalTime());
    }

    /**
     * Test getServiceKindStringAsString() method.
     */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsString());
    }

    /**
     * Test getServiceKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsBoolean());
    }

    /**
     * Test getServiceKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsBigInteger());
    }

    /**
     * Test getServiceKindStringAsURL() method.
     */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceKindStringAsURL());
    }

    /**
     * Test getServiceNameAsInteger() method.
     */
    @Test
    public void subTestGetServiceNameAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsInteger());
    }

    /**
     * Test getServiceNameAsLong() method.
     */
    @Test
    public void subTestGetServiceNameAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsLong());
    }

    /**
     * Test getServiceNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceNameAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsLocalDateTime());
    }

    /**
     * Test getServiceNameAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceNameAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsLocalTime());
    }

    /**
     * Test getServiceNameAsString() method.
     */
    @Test
    public void subTestGetServiceNameAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsString());
    }

    /**
     * Test getServiceNameAsBoolean() method.
     */
    @Test
    public void subTestGetServiceNameAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsBoolean());
    }

    /**
     * Test getServiceNameAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceNameAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsBigInteger());
    }

    /**
     * Test getServiceNameAsURL() method.
     */
    @Test
    public void subTestGetServiceNameAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceNameAsURL());
    }

    /**
     * Test getServiceProviderAsInteger() method.
     */
    @Test
    public void subTestGetServiceProviderAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsInteger());
    }

    /**
     * Test getServiceProviderAsLong() method.
     */
    @Test
    public void subTestGetServiceProviderAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsLong());
    }

    /**
     * Test getServiceProviderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceProviderAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsLocalDateTime());
    }

    /**
     * Test getServiceProviderAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceProviderAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsLocalTime());
    }

    /**
     * Test getServiceProviderAsString() method.
     */
    @Test
    public void subTestGetServiceProviderAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsString());
    }

    /**
     * Test getServiceProviderAsBoolean() method.
     */
    @Test
    public void subTestGetServiceProviderAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsBoolean());
    }

    /**
     * Test getServiceProviderAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceProviderAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsBigInteger());
    }

    /**
     * Test getServiceProviderAsURL() method.
     */
    @Test
    public void subTestGetServiceProviderAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderAsURL());
    }

    /**
     * Test getServiceProviderrUrlAsInteger() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsInteger());
    }

    /**
     * Test getServiceProviderrUrlAsLong() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsLong());
    }

    /**
     * Test getServiceProviderrUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsLocalDateTime());
    }

    /**
     * Test getServiceProviderrUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsLocalTime());
    }

    /**
     * Test getServiceProviderrUrlAsString() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsString());
    }

    /**
     * Test getServiceProviderrUrlAsBoolean() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsBoolean());
    }

    /**
     * Test getServiceProviderrUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsBigInteger());
    }

    /**
     * Test getServiceProviderrUrlAsURL() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceProviderrUrlAsURL());
    }

    /**
     * Test getServiceTypeAsInteger() method.
     */
    @Test
    public void subTestGetServiceTypeAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsInteger());
    }

    /**
     * Test getServiceTypeAsLong() method.
     */
    @Test
    public void subTestGetServiceTypeAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsLong());
    }

    /**
     * Test getServiceTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsLocalDateTime());
    }

    /**
     * Test getServiceTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceTypeAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsLocalTime());
    }

    /**
     * Test getServiceTypeAsString() method.
     */
    @Test
    public void subTestGetServiceTypeAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsString());
    }

    /**
     * Test getServiceTypeAsBoolean() method.
     */
    @Test
    public void subTestGetServiceTypeAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsBoolean());
    }

    /**
     * Test getServiceTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceTypeAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsBigInteger());
    }

    /**
     * Test getServiceTypeAsURL() method.
     */
    @Test
    public void subTestGetServiceTypeAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getServiceTypeAsURL());
    }

    /**
     * Test getStatusAsInteger() method.
     */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsInteger());
    }

    /**
     * Test getStatusAsLong() method.
     */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsLong());
    }

    /**
     * Test getStatusAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsLocalDateTime());
    }

    /**
     * Test getStatusAsLocalTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsLocalTime());
    }

    /**
     * Test getStatusAsString() method.
     */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getStatusAsString());
    }

    /**
     * Test getStatusAsBoolean() method.
     */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsBoolean());
    }

    /**
     * Test getStatusAsBigInteger() method.
     */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsBigInteger());
    }

    /**
     * Test getStatusAsURL() method.
     */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStatusAsURL());
    }

    /**
     * Test getStreamCountAsInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsInteger());
    }

    /**
     * Test getStreamCountAsLong() method.
     */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsLong());
    }

    /**
     * Test getStreamCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsLocalDateTime());
    }

    /**
     * Test getStreamCountAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsLocalTime());
    }

    /**
     * Test getStreamCountAsString() method.
     */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals("1", JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsString());
    }

    /**
     * Test getStreamCountAsBoolean() method.
     */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsBoolean());
    }

    /**
     * Test getStreamCountAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsBigInteger());
    }

    /**
     * Test getStreamCountAsURL() method.
     */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamCountAsURL());
    }

    /**
     * Test getStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsInteger());
    }

    /**
     * Test getStreamKindAsLong() method.
     */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsLong());
    }

    /**
     * Test getStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsLocalDateTime());
    }

    /**
     * Test getStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsLocalTime());
    }

    /**
     * Test getStreamKindAsString() method.
     */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals("Menu", JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsString());
    }

    /**
     * Test getStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsBoolean());
    }

    /**
     * Test getStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsBigInteger());
    }

    /**
     * Test getStreamKindAsURL() method.
     */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindAsURL());
    }

    /**
     * Test getStreamKindStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsInteger());
    }

    /**
     * Test getStreamKindStringAsLong() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsLong());
    }

    /**
     * Test getStreamKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsLocalDateTime());
    }

    /**
     * Test getStreamKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsLocalTime());
    }

    /**
     * Test getStreamKindStringAsString() method.
     */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals("Menu", JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsString());
    }

    /**
     * Test getStreamKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsBoolean());
    }

    /**
     * Test getStreamKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsBigInteger());
    }

    /**
     * Test getStreamKindStringAsURL() method.
     */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindStringAsURL());
    }

    /**
     * Test getStreamKindIDAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(Integer.valueOf(0), JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsInteger());
    }

    /**
     * Test getStreamKindIDAsLong() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(Long.valueOf(0), JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsLong());
    }

    /**
     * Test getStreamKindIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsLocalDateTime());
    }

    /**
     * Test getStreamKindIDAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsLocalTime());
    }

    /**
     * Test getStreamKindIDAsString() method.
     */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals("0", JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsString());
    }

    /**
     * Test getStreamKindIDAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsBoolean());
    }

    /**
     * Test getStreamKindIDAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(0), JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsBigInteger());
    }

    /**
     * Test getStreamKindIDAsURL() method.
     */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindIDAsURL());
    }

    /**
     * Test getStreamKindPosAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsInteger());
    }

    /**
     * Test getStreamKindPosAsLong() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsLong());
    }

    /**
     * Test getStreamKindPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsLocalDateTime());
    }

    /**
     * Test getStreamKindPosAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsLocalTime());
    }

    /**
     * Test getStreamKindPosAsString() method.
     */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsString());
    }

    /**
     * Test getStreamKindPosAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsBoolean());
    }

    /**
     * Test getStreamKindPosAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsBigInteger());
    }

    /**
     * Test getStreamKindPosAsURL() method.
     */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamKindPosAsURL());
    }

    /**
     * Test getStreamOrderAsInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsInteger());
    }

    /**
     * Test getStreamOrderAsLong() method.
     */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsLong());
    }

    /**
     * Test getStreamOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsLocalDateTime());
    }

    /**
     * Test getStreamOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsLocalTime());
    }

    /**
     * Test getStreamOrderAsString() method.
     */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsString());
    }

    /**
     * Test getStreamOrderAsBoolean() method.
     */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsBoolean());
    }

    /**
     * Test getStreamOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsBigInteger());
    }

    /**
     * Test getStreamOrderAsURL() method.
     */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getStreamOrderAsURL());
    }

    /**
     * Test getTimeZonesAsInteger() method.
     */
    @Test
    public void subTestGetTimeZonesAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsInteger());
    }

    /**
     * Test getTimeZonesAsLong() method.
     */
    @Test
    public void subTestGetTimeZonesAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsLong());
    }

    /**
     * Test getTimeZonesAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeZonesAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsLocalDateTime());
    }

    /**
     * Test getTimeZonesAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeZonesAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsLocalTime());
    }

    /**
     * Test getTimeZonesAsString() method.
     */
    @Test
    public void subTestGetTimeZonesAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsString());
    }

    /**
     * Test getTimeZonesAsBoolean() method.
     */
    @Test
    public void subTestGetTimeZonesAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsBoolean());
    }

    /**
     * Test getTimeZonesAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeZonesAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsBigInteger());
    }

    /**
     * Test getTimeZonesAsURL() method.
     */
    @Test
    public void subTestGetTimeZonesAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTimeZonesAsURL());
    }

    /**
     * Test getTitleAsInteger() method.
     */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsInteger());
    }

    /**
     * Test getTitleAsLong() method.
     */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsLong());
    }

    /**
     * Test getTitleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsLocalDateTime());
    }

    /**
     * Test getTitleAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsLocalTime());
    }

    /**
     * Test getTitleAsString() method.
     */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getTitleAsString());
    }

    /**
     * Test getTitleAsBoolean() method.
     */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsBoolean());
    }

    /**
     * Test getTitleAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsBigInteger());
    }

    /**
     * Test getTitleAsURL() method.
     */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getTitleAsURL());
    }

    /**
     * Test getUniqueIDAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsInteger());
    }

    /**
     * Test getUniqueIDAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsLong());
    }

    /**
     * Test getUniqueIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsLocalDateTime());
    }

    /**
     * Test getUniqueIDAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsLocalTime());
    }

    /**
     * Test getUniqueIDAsString() method.
     */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsString());
    }

    /**
     * Test getUniqueIDAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsBoolean());
    }

    /**
     * Test getUniqueIDAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsBigInteger());
    }

    /**
     * Test getUniqueIDAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDAsURL());
    }

    /**
     * Test getUniqueIDStringAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsInteger());
    }

    /**
     * Test getUniqueIDStringAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsLong());
    }

    /**
     * Test getUniqueIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsLocalDateTime());
    }

    /**
     * Test getUniqueIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsLocalTime());
    }

    /**
     * Test getUniqueIDStringAsString() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals("", JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsString());
    }

    /**
     * Test getUniqueIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsBoolean());
    }

    /**
     * Test getUniqueIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsBigInteger());
    }

    /**
     * Test getUniqueIDStringAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, JMetaDataMenu_Test.jMetaDataMenu.getUniqueIDStringAsURL());
    }

}
