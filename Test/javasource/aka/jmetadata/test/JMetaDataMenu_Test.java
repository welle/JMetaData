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
            final ClassLoader classLoader = JMetaDataMenu_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("somefile").getFile());
            jMetaData.open(file);
            jMetaDataMenu = null;
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
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsInteger());
    }

   /**
    * Test getAlternateGroupAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsLong());
    }

   /**
    * Test getAlternateGroupAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsLocalTime());
    }

   /**
    * Test getAlternateGroupAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsString());
    }

   /**
    * Test getAlternateGroupAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsBoolean());
    }

   /**
    * Test getAlternateGroupAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsBigInteger());
    }

   /**
    * Test getAlternateGroupAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsURL());
    }

   /**
    * Test getAlternateGroupStringAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsInteger());
    }

   /**
    * Test getAlternateGroupStringAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsLong());
    }

   /**
    * Test getAlternateGroupStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsLocalTime());
    }

   /**
    * Test getAlternateGroupStringAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsString());
    }

   /**
    * Test getAlternateGroupStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsBoolean());
    }

   /**
    * Test getAlternateGroupStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsBigInteger());
    }

   /**
    * Test getAlternateGroupStringAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsURL());
    }

   /**
    * Test getChaptersPosBeginAsInteger() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsInteger());
    }

   /**
    * Test getChaptersPosBeginAsLong() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsLong() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsLong());
    }

   /**
    * Test getChaptersPosBeginAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsLocalDateTime());
    }

   /**
    * Test getChaptersPosBeginAsLocalTime() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsLocalTime());
    }

   /**
    * Test getChaptersPosBeginAsString() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsString() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsString());
    }

   /**
    * Test getChaptersPosBeginAsBoolean() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsBoolean());
    }

   /**
    * Test getChaptersPosBeginAsBigInteger() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsBigInteger());
    }

   /**
    * Test getChaptersPosBeginAsURL() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsURL() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsURL());
    }

   /**
    * Test getChaptersPosEndAsInteger() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsInteger());
    }

   /**
    * Test getChaptersPosEndAsLong() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsLong() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsLong());
    }

   /**
    * Test getChaptersPosEndAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsLocalDateTime());
    }

   /**
    * Test getChaptersPosEndAsLocalTime() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsLocalTime());
    }

   /**
    * Test getChaptersPosEndAsString() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsString() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsString());
    }

   /**
    * Test getChaptersPosEndAsBoolean() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsBoolean());
    }

   /**
    * Test getChaptersPosEndAsBigInteger() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsBigInteger());
    }

   /**
    * Test getChaptersPosEndAsURL() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsURL() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsURL());
    }

   /**
    * Test getCodecIDAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsInteger());
    }

   /**
    * Test getCodecIDAsLong() method.
    */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsLong());
    }

   /**
    * Test getCodecIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsLocalDateTime());
    }

   /**
    * Test getCodecIDAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsLocalTime());
    }

   /**
    * Test getCodecIDAsString() method.
    */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsString());
    }

   /**
    * Test getCodecIDAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsBoolean());
    }

   /**
    * Test getCodecIDAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsBigInteger());
    }

   /**
    * Test getCodecIDAsURL() method.
    */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsURL());
    }

   /**
    * Test getCodecIDHintAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsInteger());
    }

   /**
    * Test getCodecIDHintAsLong() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsLong());
    }

   /**
    * Test getCodecIDHintAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsLocalDateTime());
    }

   /**
    * Test getCodecIDHintAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsLocalTime());
    }

   /**
    * Test getCodecIDHintAsString() method.
    */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsString());
    }

   /**
    * Test getCodecIDHintAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsBoolean());
    }

   /**
    * Test getCodecIDHintAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsBigInteger());
    }

   /**
    * Test getCodecIDHintAsURL() method.
    */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsURL());
    }

   /**
    * Test getCodecIDInfoAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsInteger());
    }

   /**
    * Test getCodecIDInfoAsLong() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsLong());
    }

   /**
    * Test getCodecIDInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsLocalDateTime());
    }

   /**
    * Test getCodecIDInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsLocalTime());
    }

   /**
    * Test getCodecIDInfoAsString() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsString());
    }

   /**
    * Test getCodecIDInfoAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsBoolean());
    }

   /**
    * Test getCodecIDInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsBigInteger());
    }

   /**
    * Test getCodecIDInfoAsURL() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsURL());
    }

   /**
    * Test getCodecIDStringAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsInteger());
    }

   /**
    * Test getCodecIDStringAsLong() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsLong());
    }

   /**
    * Test getCodecIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsLocalDateTime());
    }

   /**
    * Test getCodecIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsLocalTime());
    }

   /**
    * Test getCodecIDStringAsString() method.
    */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsString());
    }

   /**
    * Test getCodecIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsBoolean());
    }

   /**
    * Test getCodecIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsBigInteger());
    }

   /**
    * Test getCodecIDStringAsURL() method.
    */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsURL());
    }

   /**
    * Test getCodecIDUrlAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsInteger());
    }

   /**
    * Test getCodecIDUrlAsLong() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsLong());
    }

   /**
    * Test getCodecIDUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsLocalDateTime());
    }

   /**
    * Test getCodecIDUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsLocalTime());
    }

   /**
    * Test getCodecIDUrlAsString() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsString());
    }

   /**
    * Test getCodecIDUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsBoolean());
    }

   /**
    * Test getCodecIDUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsBigInteger());
    }

   /**
    * Test getCodecIDUrlAsURL() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsURL());
    }

   /**
    * Test getCodecIDDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsInteger());
    }

   /**
    * Test getCodecIDDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsLong());
    }

   /**
    * Test getCodecIDDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsLocalDateTime());
    }

   /**
    * Test getCodecIDDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsLocalTime());
    }

   /**
    * Test getCodecIDDescriptionAsString() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsString());
    }

   /**
    * Test getCodecIDDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsBoolean());
    }

   /**
    * Test getCodecIDDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsBigInteger());
    }

   /**
    * Test getCodecIDDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsURL());
    }

   /**
    * Test getCountAsInteger() method.
    */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountAsInteger());
    }

   /**
    * Test getCountAsLong() method.
    */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCountAsLong());
    }

   /**
    * Test getCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCountAsLocalDateTime());
    }

   /**
    * Test getCountAsLocalTime() method.
    */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCountAsLocalTime());
    }

   /**
    * Test getCountAsString() method.
    */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, this.jMetaDataMenu.getCountAsString());
    }

   /**
    * Test getCountAsBoolean() method.
    */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCountAsBoolean());
    }

   /**
    * Test getCountAsBigInteger() method.
    */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountAsBigInteger());
    }

   /**
    * Test getCountAsURL() method.
    */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCountAsURL());
    }

   /**
    * Test getCountriesAsInteger() method.
    */
    @Test
    public void subTestGetCountriesAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsInteger());
    }

   /**
    * Test getCountriesAsLong() method.
    */
    @Test
    public void subTestGetCountriesAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsLong());
    }

   /**
    * Test getCountriesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountriesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsLocalDateTime());
    }

   /**
    * Test getCountriesAsLocalTime() method.
    */
    @Test
    public void subTestGetCountriesAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsLocalTime());
    }

   /**
    * Test getCountriesAsString() method.
    */
    @Test
    public void subTestGetCountriesAsString() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsString());
    }

   /**
    * Test getCountriesAsBoolean() method.
    */
    @Test
    public void subTestGetCountriesAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsBoolean());
    }

   /**
    * Test getCountriesAsBigInteger() method.
    */
    @Test
    public void subTestGetCountriesAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsBigInteger());
    }

   /**
    * Test getCountriesAsURL() method.
    */
    @Test
    public void subTestGetCountriesAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsURL());
    }

   /**
    * Test getDefaultAsInteger() method.
    */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsInteger());
    }

   /**
    * Test getDefaultAsLong() method.
    */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsLong());
    }

   /**
    * Test getDefaultAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsLocalDateTime());
    }

   /**
    * Test getDefaultAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsLocalTime());
    }

   /**
    * Test getDefaultAsString() method.
    */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsString());
    }

   /**
    * Test getDefaultAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsBoolean());
    }

   /**
    * Test getDefaultAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsBigInteger());
    }

   /**
    * Test getDefaultAsURL() method.
    */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsURL());
    }

   /**
    * Test getDefaultStringAsInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsInteger());
    }

   /**
    * Test getDefaultStringAsLong() method.
    */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsLong());
    }

   /**
    * Test getDefaultStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsLocalDateTime());
    }

   /**
    * Test getDefaultStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsLocalTime());
    }

   /**
    * Test getDefaultStringAsString() method.
    */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsString());
    }

   /**
    * Test getDefaultStringAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsBoolean());
    }

   /**
    * Test getDefaultStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsBigInteger());
    }

   /**
    * Test getDefaultStringAsURL() method.
    */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsURL());
    }

   /**
    * Test getDelayAsInteger() method.
    */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsInteger());
    }

   /**
    * Test getDelayAsLong() method.
    */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsLong());
    }

   /**
    * Test getDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsLocalDateTime());
    }

   /**
    * Test getDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsLocalTime());
    }

   /**
    * Test getDelayAsString() method.
    */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsString());
    }

   /**
    * Test getDelayAsBoolean() method.
    */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsBoolean());
    }

   /**
    * Test getDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsBigInteger());
    }

   /**
    * Test getDelayAsURL() method.
    */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsURL());
    }

   /**
    * Test getDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsInteger());
    }

   /**
    * Test getDelayStringAsLong() method.
    */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsLong());
    }

   /**
    * Test getDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsLocalDateTime());
    }

   /**
    * Test getDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsLocalTime());
    }

   /**
    * Test getDelayStringAsString() method.
    */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsString());
    }

   /**
    * Test getDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsBoolean());
    }

   /**
    * Test getDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsBigInteger());
    }

   /**
    * Test getDelayStringAsURL() method.
    */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsURL());
    }

   /**
    * Test getDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsInteger());
    }

   /**
    * Test getDelayString1AsLong() method.
    */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsLong());
    }

   /**
    * Test getDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsLocalDateTime());
    }

   /**
    * Test getDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsLocalTime());
    }

   /**
    * Test getDelayString1AsString() method.
    */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsString());
    }

   /**
    * Test getDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsBoolean());
    }

   /**
    * Test getDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsBigInteger());
    }

   /**
    * Test getDelayString1AsURL() method.
    */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsURL());
    }

   /**
    * Test getDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsInteger());
    }

   /**
    * Test getDelayString2AsLong() method.
    */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsLong());
    }

   /**
    * Test getDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsLocalDateTime());
    }

   /**
    * Test getDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsLocalTime());
    }

   /**
    * Test getDelayString2AsString() method.
    */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsString());
    }

   /**
    * Test getDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsBoolean());
    }

   /**
    * Test getDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsBigInteger());
    }

   /**
    * Test getDelayString2AsURL() method.
    */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsURL());
    }

   /**
    * Test getDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsInteger());
    }

   /**
    * Test getDelayString3AsLong() method.
    */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsLong());
    }

   /**
    * Test getDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsLocalDateTime());
    }

   /**
    * Test getDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsLocalTime());
    }

   /**
    * Test getDelayString3AsString() method.
    */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsString());
    }

   /**
    * Test getDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsBoolean());
    }

   /**
    * Test getDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsBigInteger());
    }

   /**
    * Test getDelayString3AsURL() method.
    */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsURL());
    }

   /**
    * Test getDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsInteger());
    }

   /**
    * Test getDelayString4AsLong() method.
    */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsLong());
    }

   /**
    * Test getDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsLocalDateTime());
    }

   /**
    * Test getDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsLocalTime());
    }

   /**
    * Test getDelayString4AsString() method.
    */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsString());
    }

   /**
    * Test getDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsBoolean());
    }

   /**
    * Test getDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsBigInteger());
    }

   /**
    * Test getDelayString4AsURL() method.
    */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsURL());
    }

   /**
    * Test getDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsInteger());
    }

   /**
    * Test getDelayString5AsLong() method.
    */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsLong());
    }

   /**
    * Test getDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsLocalDateTime());
    }

   /**
    * Test getDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsLocalTime());
    }

   /**
    * Test getDelayString5AsString() method.
    */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsString());
    }

   /**
    * Test getDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsBoolean());
    }

   /**
    * Test getDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsBigInteger());
    }

   /**
    * Test getDelayString5AsURL() method.
    */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsURL());
    }

   /**
    * Test getDelayDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsInteger());
    }

   /**
    * Test getDelayDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsLong());
    }

   /**
    * Test getDelayDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsLocalTime());
    }

   /**
    * Test getDelayDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsString());
    }

   /**
    * Test getDelayDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsBoolean());
    }

   /**
    * Test getDelayDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsBigInteger());
    }

   /**
    * Test getDelayDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsURL());
    }

   /**
    * Test getDelaySettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsInteger());
    }

   /**
    * Test getDelaySettingsAsLong() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsLong());
    }

   /**
    * Test getDelaySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsLocalDateTime());
    }

   /**
    * Test getDelaySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsLocalTime());
    }

   /**
    * Test getDelaySettingsAsString() method.
    */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsString());
    }

   /**
    * Test getDelaySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsBoolean());
    }

   /**
    * Test getDelaySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsBigInteger());
    }

   /**
    * Test getDelaySettingsAsURL() method.
    */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsURL());
    }

   /**
    * Test getDelaySourceAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsInteger());
    }

   /**
    * Test getDelaySourceAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsLong());
    }

   /**
    * Test getDelaySourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsLocalDateTime());
    }

   /**
    * Test getDelaySourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsLocalTime());
    }

   /**
    * Test getDelaySourceAsString() method.
    */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsString());
    }

   /**
    * Test getDelaySourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsBoolean());
    }

   /**
    * Test getDelaySourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsBigInteger());
    }

   /**
    * Test getDelaySourceAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsURL());
    }

   /**
    * Test getDisabledAsInteger() method.
    */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsInteger());
    }

   /**
    * Test getDisabledAsLong() method.
    */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsLong());
    }

   /**
    * Test getDisabledAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsLocalDateTime());
    }

   /**
    * Test getDisabledAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsLocalTime());
    }

   /**
    * Test getDisabledAsString() method.
    */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsString());
    }

   /**
    * Test getDisabledAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsBoolean());
    }

   /**
    * Test getDisabledAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsBigInteger());
    }

   /**
    * Test getDisabledAsURL() method.
    */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsURL());
    }

   /**
    * Test getDisabledStringAsInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsInteger());
    }

   /**
    * Test getDisabledStringAsLong() method.
    */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsLong());
    }

   /**
    * Test getDisabledStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsLocalDateTime());
    }

   /**
    * Test getDisabledStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsLocalTime());
    }

   /**
    * Test getDisabledStringAsString() method.
    */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsString());
    }

   /**
    * Test getDisabledStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsBoolean());
    }

   /**
    * Test getDisabledStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsBigInteger());
    }

   /**
    * Test getDisabledStringAsURL() method.
    */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsURL());
    }

   /**
    * Test getDurationAsInteger() method.
    */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsInteger());
    }

   /**
    * Test getDurationAsLong() method.
    */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsLong());
    }

   /**
    * Test getDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsLocalDateTime());
    }

   /**
    * Test getDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsLocalTime());
    }

   /**
    * Test getDurationAsString() method.
    */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsString());
    }

   /**
    * Test getDurationAsBoolean() method.
    */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsBoolean());
    }

   /**
    * Test getDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsBigInteger());
    }

   /**
    * Test getDurationAsURL() method.
    */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsURL());
    }

   /**
    * Test getDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsInteger());
    }

   /**
    * Test getDurationStringAsLong() method.
    */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsLong());
    }

   /**
    * Test getDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsLocalDateTime());
    }

   /**
    * Test getDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsLocalTime());
    }

   /**
    * Test getDurationStringAsString() method.
    */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsString());
    }

   /**
    * Test getDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsBoolean());
    }

   /**
    * Test getDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsBigInteger());
    }

   /**
    * Test getDurationStringAsURL() method.
    */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsURL());
    }

   /**
    * Test getDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsInteger());
    }

   /**
    * Test getDurationString1AsLong() method.
    */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsLong());
    }

   /**
    * Test getDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsLocalDateTime());
    }

   /**
    * Test getDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsLocalTime());
    }

   /**
    * Test getDurationString1AsString() method.
    */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsString());
    }

   /**
    * Test getDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsBoolean());
    }

   /**
    * Test getDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsBigInteger());
    }

   /**
    * Test getDurationString1AsURL() method.
    */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsURL());
    }

   /**
    * Test getDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsInteger());
    }

   /**
    * Test getDurationString2AsLong() method.
    */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsLong());
    }

   /**
    * Test getDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsLocalDateTime());
    }

   /**
    * Test getDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsLocalTime());
    }

   /**
    * Test getDurationString2AsString() method.
    */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsString());
    }

   /**
    * Test getDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsBoolean());
    }

   /**
    * Test getDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsBigInteger());
    }

   /**
    * Test getDurationString2AsURL() method.
    */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsURL());
    }

   /**
    * Test getDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsInteger());
    }

   /**
    * Test getDurationString3AsLong() method.
    */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsLong());
    }

   /**
    * Test getDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsLocalDateTime());
    }

   /**
    * Test getDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsLocalTime());
    }

   /**
    * Test getDurationString3AsString() method.
    */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsString());
    }

   /**
    * Test getDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsBoolean());
    }

   /**
    * Test getDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsBigInteger());
    }

   /**
    * Test getDurationString3AsURL() method.
    */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsURL());
    }

   /**
    * Test getDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsInteger());
    }

   /**
    * Test getDurationString4AsLong() method.
    */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsLong());
    }

   /**
    * Test getDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsLocalDateTime());
    }

   /**
    * Test getDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsLocalTime());
    }

   /**
    * Test getDurationString4AsString() method.
    */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsString());
    }

   /**
    * Test getDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsBoolean());
    }

   /**
    * Test getDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsBigInteger());
    }

   /**
    * Test getDurationString4AsURL() method.
    */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsURL());
    }

   /**
    * Test getDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsInteger());
    }

   /**
    * Test getDurationString5AsLong() method.
    */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsLong());
    }

   /**
    * Test getDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsLocalDateTime());
    }

   /**
    * Test getDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsLocalTime());
    }

   /**
    * Test getDurationString5AsString() method.
    */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsString());
    }

   /**
    * Test getDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsBoolean());
    }

   /**
    * Test getDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsBigInteger());
    }

   /**
    * Test getDurationString5AsURL() method.
    */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsURL());
    }

   /**
    * Test getDurationEndAsInteger() method.
    */
    @Test
    public void subTestGetDurationEndAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsInteger());
    }

   /**
    * Test getDurationEndAsLong() method.
    */
    @Test
    public void subTestGetDurationEndAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsLong());
    }

   /**
    * Test getDurationEndAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationEndAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsLocalDateTime());
    }

   /**
    * Test getDurationEndAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationEndAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsLocalTime());
    }

   /**
    * Test getDurationEndAsString() method.
    */
    @Test
    public void subTestGetDurationEndAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsString());
    }

   /**
    * Test getDurationEndAsBoolean() method.
    */
    @Test
    public void subTestGetDurationEndAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsBoolean());
    }

   /**
    * Test getDurationEndAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationEndAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsBigInteger());
    }

   /**
    * Test getDurationEndAsURL() method.
    */
    @Test
    public void subTestGetDurationEndAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsURL());
    }

   /**
    * Test getDurationStartAsInteger() method.
    */
    @Test
    public void subTestGetDurationStartAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsInteger());
    }

   /**
    * Test getDurationStartAsLong() method.
    */
    @Test
    public void subTestGetDurationStartAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsLong());
    }

   /**
    * Test getDurationStartAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStartAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsLocalDateTime());
    }

   /**
    * Test getDurationStartAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStartAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsLocalTime());
    }

   /**
    * Test getDurationStartAsString() method.
    */
    @Test
    public void subTestGetDurationStartAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsString());
    }

   /**
    * Test getDurationStartAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStartAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsBoolean());
    }

   /**
    * Test getDurationStartAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStartAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsBigInteger());
    }

   /**
    * Test getDurationStartAsURL() method.
    */
    @Test
    public void subTestGetDurationStartAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsURL());
    }

   /**
    * Test getFirstPacketOrderAsInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsInteger());
    }

   /**
    * Test getFirstPacketOrderAsLong() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsLong());
    }

   /**
    * Test getFirstPacketOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsLocalDateTime());
    }

   /**
    * Test getFirstPacketOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsLocalTime());
    }

   /**
    * Test getFirstPacketOrderAsString() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsString());
    }

   /**
    * Test getFirstPacketOrderAsBoolean() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsBoolean());
    }

   /**
    * Test getFirstPacketOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsBigInteger());
    }

   /**
    * Test getFirstPacketOrderAsURL() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsURL());
    }

   /**
    * Test getForcedAsInteger() method.
    */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsInteger());
    }

   /**
    * Test getForcedAsLong() method.
    */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsLong());
    }

   /**
    * Test getForcedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsLocalDateTime());
    }

   /**
    * Test getForcedAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsLocalTime());
    }

   /**
    * Test getForcedAsString() method.
    */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsString());
    }

   /**
    * Test getForcedAsBoolean() method.
    */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsBoolean());
    }

   /**
    * Test getForcedAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsBigInteger());
    }

   /**
    * Test getForcedAsURL() method.
    */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsURL());
    }

   /**
    * Test getForcedStringAsInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsInteger());
    }

   /**
    * Test getForcedStringAsLong() method.
    */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsLong());
    }

   /**
    * Test getForcedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsLocalDateTime());
    }

   /**
    * Test getForcedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsLocalTime());
    }

   /**
    * Test getForcedStringAsString() method.
    */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsString());
    }

   /**
    * Test getForcedStringAsBoolean() method.
    */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsBoolean());
    }

   /**
    * Test getForcedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsBigInteger());
    }

   /**
    * Test getForcedStringAsURL() method.
    */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsURL());
    }

   /**
    * Test getFormatAsInteger() method.
    */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsInteger());
    }

   /**
    * Test getFormatAsLong() method.
    */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsLong());
    }

   /**
    * Test getFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsLocalDateTime());
    }

   /**
    * Test getFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsLocalTime());
    }

   /**
    * Test getFormatAsString() method.
    */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsString());
    }

   /**
    * Test getFormatAsBoolean() method.
    */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsBoolean());
    }

   /**
    * Test getFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsBigInteger());
    }

   /**
    * Test getFormatAsURL() method.
    */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsURL());
    }

   /**
    * Test getFormatInfoAsInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsInteger());
    }

   /**
    * Test getFormatInfoAsLong() method.
    */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsLong());
    }

   /**
    * Test getFormatInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsLocalDateTime());
    }

   /**
    * Test getFormatInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsLocalTime());
    }

   /**
    * Test getFormatInfoAsString() method.
    */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsString());
    }

   /**
    * Test getFormatInfoAsBoolean() method.
    */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsBoolean());
    }

   /**
    * Test getFormatInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsBigInteger());
    }

   /**
    * Test getFormatInfoAsURL() method.
    */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsURL());
    }

   /**
    * Test getFormatUrlAsInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsInteger());
    }

   /**
    * Test getFormatUrlAsLong() method.
    */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsLong());
    }

   /**
    * Test getFormatUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsLocalDateTime());
    }

   /**
    * Test getFormatUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsLocalTime());
    }

   /**
    * Test getFormatUrlAsString() method.
    */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsString());
    }

   /**
    * Test getFormatUrlAsBoolean() method.
    */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsBoolean());
    }

   /**
    * Test getFormatUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsBigInteger());
    }

   /**
    * Test getFormatUrlAsURL() method.
    */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsURL());
    }

   /**
    * Test getFormatCommercialAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsInteger());
    }

   /**
    * Test getFormatCommercialAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsLong());
    }

   /**
    * Test getFormatCommercialAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsLocalTime());
    }

   /**
    * Test getFormatCommercialAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsString());
    }

   /**
    * Test getFormatCommercialAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsBoolean());
    }

   /**
    * Test getFormatCommercialAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsBigInteger());
    }

   /**
    * Test getFormatCommercialAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsURL());
    }

   /**
    * Test getFormatCommercialIfAnyAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsLong());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsLocalTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsString());
    }

   /**
    * Test getFormatCommercialIfAnyAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsBoolean());
    }

   /**
    * Test getFormatCommercialIfAnyAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsBigInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsURL());
    }

   /**
    * Test getFormatCompressionAsInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsInteger());
    }

   /**
    * Test getFormatCompressionAsLong() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsLong());
    }

   /**
    * Test getFormatCompressionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsLocalDateTime());
    }

   /**
    * Test getFormatCompressionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsLocalTime());
    }

   /**
    * Test getFormatCompressionAsString() method.
    */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsString());
    }

   /**
    * Test getFormatCompressionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsBoolean());
    }

   /**
    * Test getFormatCompressionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsBigInteger());
    }

   /**
    * Test getFormatCompressionAsURL() method.
    */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsURL());
    }

   /**
    * Test getFormatProfileAsInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsInteger());
    }

   /**
    * Test getFormatProfileAsLong() method.
    */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsLong());
    }

   /**
    * Test getFormatProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsLocalDateTime());
    }

   /**
    * Test getFormatProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsLocalTime());
    }

   /**
    * Test getFormatProfileAsString() method.
    */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsString());
    }

   /**
    * Test getFormatProfileAsBoolean() method.
    */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsBoolean());
    }

   /**
    * Test getFormatProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsBigInteger());
    }

   /**
    * Test getFormatProfileAsURL() method.
    */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsURL());
    }

   /**
    * Test getFormatSettingsAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsInteger());
    }

   /**
    * Test getFormatSettingsAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsLong());
    }

   /**
    * Test getFormatSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsLocalTime());
    }

   /**
    * Test getFormatSettingsAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsString());
    }

   /**
    * Test getFormatSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsBoolean());
    }

   /**
    * Test getFormatSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsBigInteger());
    }

   /**
    * Test getFormatSettingsAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsURL());
    }

   /**
    * Test getFormatVersionAsInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsInteger());
    }

   /**
    * Test getFormatVersionAsLong() method.
    */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsLong());
    }

   /**
    * Test getFormatVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsLocalDateTime());
    }

   /**
    * Test getFormatVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsLocalTime());
    }

   /**
    * Test getFormatVersionAsString() method.
    */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsString());
    }

   /**
    * Test getFormatVersionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsBoolean());
    }

   /**
    * Test getFormatVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsBigInteger());
    }

   /**
    * Test getFormatVersionAsURL() method.
    */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsURL());
    }

   /**
    * Test getIDAsInteger() method.
    */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDAsInteger());
    }

   /**
    * Test getIDAsLong() method.
    */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getIDAsLong());
    }

   /**
    * Test getIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getIDAsLocalDateTime());
    }

   /**
    * Test getIDAsLocalTime() method.
    */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getIDAsLocalTime());
    }

   /**
    * Test getIDAsString() method.
    */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getIDAsString());
    }

   /**
    * Test getIDAsBoolean() method.
    */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getIDAsBoolean());
    }

   /**
    * Test getIDAsBigInteger() method.
    */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDAsBigInteger());
    }

   /**
    * Test getIDAsURL() method.
    */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getIDAsURL());
    }

   /**
    * Test getIDStringAsInteger() method.
    */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsInteger());
    }

   /**
    * Test getIDStringAsLong() method.
    */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsLong());
    }

   /**
    * Test getIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsLocalDateTime());
    }

   /**
    * Test getIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsLocalTime());
    }

   /**
    * Test getIDStringAsString() method.
    */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsString());
    }

   /**
    * Test getIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsBoolean());
    }

   /**
    * Test getIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsBigInteger());
    }

   /**
    * Test getIDStringAsURL() method.
    */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsURL());
    }

   /**
    * Test getInformAsInteger() method.
    */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getInformAsInteger());
    }

   /**
    * Test getInformAsLong() method.
    */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, this.jMetaDataMenu.getInformAsLong());
    }

   /**
    * Test getInformAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getInformAsLocalDateTime());
    }

   /**
    * Test getInformAsLocalTime() method.
    */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getInformAsLocalTime());
    }

   /**
    * Test getInformAsString() method.
    */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, this.jMetaDataMenu.getInformAsString());
    }

   /**
    * Test getInformAsBoolean() method.
    */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getInformAsBoolean());
    }

   /**
    * Test getInformAsBigInteger() method.
    */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getInformAsBigInteger());
    }

   /**
    * Test getInformAsURL() method.
    */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, this.jMetaDataMenu.getInformAsURL());
    }

   /**
    * Test getLanguageAsInteger() method.
    */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsInteger());
    }

   /**
    * Test getLanguageAsLong() method.
    */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsLong());
    }

   /**
    * Test getLanguageAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsLocalDateTime());
    }

   /**
    * Test getLanguageAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsLocalTime());
    }

   /**
    * Test getLanguageAsString() method.
    */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsString());
    }

   /**
    * Test getLanguageAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsBoolean());
    }

   /**
    * Test getLanguageAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsBigInteger());
    }

   /**
    * Test getLanguageAsURL() method.
    */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsURL());
    }

   /**
    * Test getLanguageStringAsInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsInteger());
    }

   /**
    * Test getLanguageStringAsLong() method.
    */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsLong());
    }

   /**
    * Test getLanguageStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsLocalDateTime());
    }

   /**
    * Test getLanguageStringAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsLocalTime());
    }

   /**
    * Test getLanguageStringAsString() method.
    */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsString());
    }

   /**
    * Test getLanguageStringAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsBoolean());
    }

   /**
    * Test getLanguageStringAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsBigInteger());
    }

   /**
    * Test getLanguageStringAsURL() method.
    */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsURL());
    }

   /**
    * Test getLanguageString1AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsInteger());
    }

   /**
    * Test getLanguageString1AsLong() method.
    */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsLong());
    }

   /**
    * Test getLanguageString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsLocalDateTime());
    }

   /**
    * Test getLanguageString1AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsLocalTime());
    }

   /**
    * Test getLanguageString1AsString() method.
    */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsString());
    }

   /**
    * Test getLanguageString1AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsBoolean());
    }

   /**
    * Test getLanguageString1AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsBigInteger());
    }

   /**
    * Test getLanguageString1AsURL() method.
    */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsURL());
    }

   /**
    * Test getLanguageString2AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsInteger());
    }

   /**
    * Test getLanguageString2AsLong() method.
    */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsLong());
    }

   /**
    * Test getLanguageString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsLocalDateTime());
    }

   /**
    * Test getLanguageString2AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsLocalTime());
    }

   /**
    * Test getLanguageString2AsString() method.
    */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsString());
    }

   /**
    * Test getLanguageString2AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsBoolean());
    }

   /**
    * Test getLanguageString2AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsBigInteger());
    }

   /**
    * Test getLanguageString2AsURL() method.
    */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsURL());
    }

   /**
    * Test getLanguageString3AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsInteger());
    }

   /**
    * Test getLanguageString3AsLong() method.
    */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsLong());
    }

   /**
    * Test getLanguageString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsLocalDateTime());
    }

   /**
    * Test getLanguageString3AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsLocalTime());
    }

   /**
    * Test getLanguageString3AsString() method.
    */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsString());
    }

   /**
    * Test getLanguageString3AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsBoolean());
    }

   /**
    * Test getLanguageString3AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsBigInteger());
    }

   /**
    * Test getLanguageString3AsURL() method.
    */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsURL());
    }

   /**
    * Test getLanguageString4AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsInteger());
    }

   /**
    * Test getLanguageString4AsLong() method.
    */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsLong());
    }

   /**
    * Test getLanguageString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsLocalDateTime());
    }

   /**
    * Test getLanguageString4AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsLocalTime());
    }

   /**
    * Test getLanguageString4AsString() method.
    */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsString());
    }

   /**
    * Test getLanguageString4AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsBoolean());
    }

   /**
    * Test getLanguageString4AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsBigInteger());
    }

   /**
    * Test getLanguageString4AsURL() method.
    */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsURL());
    }

   /**
    * Test getLanguageMoreAsInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsInteger());
    }

   /**
    * Test getLanguageMoreAsLong() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsLong());
    }

   /**
    * Test getLanguageMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsLocalDateTime());
    }

   /**
    * Test getLanguageMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsLocalTime());
    }

   /**
    * Test getLanguageMoreAsString() method.
    */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsString());
    }

   /**
    * Test getLanguageMoreAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsBoolean());
    }

   /**
    * Test getLanguageMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsBigInteger());
    }

   /**
    * Test getLanguageMoreAsURL() method.
    */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsURL());
    }

   /**
    * Test getLawRatingAsInteger() method.
    */
    @Test
    public void subTestGetLawRatingAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsInteger());
    }

   /**
    * Test getLawRatingAsLong() method.
    */
    @Test
    public void subTestGetLawRatingAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsLong());
    }

   /**
    * Test getLawRatingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLawRatingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsLocalDateTime());
    }

   /**
    * Test getLawRatingAsLocalTime() method.
    */
    @Test
    public void subTestGetLawRatingAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsLocalTime());
    }

   /**
    * Test getLawRatingAsString() method.
    */
    @Test
    public void subTestGetLawRatingAsString() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsString());
    }

   /**
    * Test getLawRatingAsBoolean() method.
    */
    @Test
    public void subTestGetLawRatingAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsBoolean());
    }

   /**
    * Test getLawRatingAsBigInteger() method.
    */
    @Test
    public void subTestGetLawRatingAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsBigInteger());
    }

   /**
    * Test getLawRatingAsURL() method.
    */
    @Test
    public void subTestGetLawRatingAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsURL());
    }

   /**
    * Test getLawRatingReasonAsInteger() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsInteger());
    }

   /**
    * Test getLawRatingReasonAsLong() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsLong());
    }

   /**
    * Test getLawRatingReasonAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsLocalDateTime());
    }

   /**
    * Test getLawRatingReasonAsLocalTime() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsLocalTime());
    }

   /**
    * Test getLawRatingReasonAsString() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsString() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsString());
    }

   /**
    * Test getLawRatingReasonAsBoolean() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsBoolean());
    }

   /**
    * Test getLawRatingReasonAsBigInteger() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsBigInteger());
    }

   /**
    * Test getLawRatingReasonAsURL() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsURL());
    }

   /**
    * Test getListAsInteger() method.
    */
    @Test
    public void subTestGetListAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListAsInteger());
    }

   /**
    * Test getListAsLong() method.
    */
    @Test
    public void subTestGetListAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListAsLong());
    }

   /**
    * Test getListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListAsLocalDateTime());
    }

   /**
    * Test getListAsLocalTime() method.
    */
    @Test
    public void subTestGetListAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListAsLocalTime());
    }

   /**
    * Test getListAsString() method.
    */
    @Test
    public void subTestGetListAsString() {
        assertEquals(null, this.jMetaDataMenu.getListAsString());
    }

   /**
    * Test getListAsBoolean() method.
    */
    @Test
    public void subTestGetListAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListAsBoolean());
    }

   /**
    * Test getListAsBigInteger() method.
    */
    @Test
    public void subTestGetListAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListAsBigInteger());
    }

   /**
    * Test getListAsURL() method.
    */
    @Test
    public void subTestGetListAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListAsURL());
    }

   /**
    * Test getListStringAsInteger() method.
    */
    @Test
    public void subTestGetListStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsInteger());
    }

   /**
    * Test getListStringAsLong() method.
    */
    @Test
    public void subTestGetListStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsLong());
    }

   /**
    * Test getListStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsLocalDateTime());
    }

   /**
    * Test getListStringAsLocalTime() method.
    */
    @Test
    public void subTestGetListStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsLocalTime());
    }

   /**
    * Test getListStringAsString() method.
    */
    @Test
    public void subTestGetListStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsString());
    }

   /**
    * Test getListStringAsBoolean() method.
    */
    @Test
    public void subTestGetListStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsBoolean());
    }

   /**
    * Test getListStringAsBigInteger() method.
    */
    @Test
    public void subTestGetListStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsBigInteger());
    }

   /**
    * Test getListStringAsURL() method.
    */
    @Test
    public void subTestGetListStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsURL());
    }

   /**
    * Test getListStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetListStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsInteger());
    }

   /**
    * Test getListStreamKindAsLong() method.
    */
    @Test
    public void subTestGetListStreamKindAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsLong());
    }

   /**
    * Test getListStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsLocalDateTime());
    }

   /**
    * Test getListStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetListStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsLocalTime());
    }

   /**
    * Test getListStreamKindAsString() method.
    */
    @Test
    public void subTestGetListStreamKindAsString() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsString());
    }

   /**
    * Test getListStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetListStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsBoolean());
    }

   /**
    * Test getListStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetListStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsBigInteger());
    }

   /**
    * Test getListStreamKindAsURL() method.
    */
    @Test
    public void subTestGetListStreamKindAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsURL());
    }

   /**
    * Test getListStreamPosAsInteger() method.
    */
    @Test
    public void subTestGetListStreamPosAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsInteger());
    }

   /**
    * Test getListStreamPosAsLong() method.
    */
    @Test
    public void subTestGetListStreamPosAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsLong());
    }

   /**
    * Test getListStreamPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListStreamPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsLocalDateTime());
    }

   /**
    * Test getListStreamPosAsLocalTime() method.
    */
    @Test
    public void subTestGetListStreamPosAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsLocalTime());
    }

   /**
    * Test getListStreamPosAsString() method.
    */
    @Test
    public void subTestGetListStreamPosAsString() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsString());
    }

   /**
    * Test getListStreamPosAsBoolean() method.
    */
    @Test
    public void subTestGetListStreamPosAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsBoolean());
    }

   /**
    * Test getListStreamPosAsBigInteger() method.
    */
    @Test
    public void subTestGetListStreamPosAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsBigInteger());
    }

   /**
    * Test getListStreamPosAsURL() method.
    */
    @Test
    public void subTestGetListStreamPosAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsURL());
    }

   /**
    * Test getMenuIDAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsInteger());
    }

   /**
    * Test getMenuIDAsLong() method.
    */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsLong());
    }

   /**
    * Test getMenuIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsLocalDateTime());
    }

   /**
    * Test getMenuIDAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsLocalTime());
    }

   /**
    * Test getMenuIDAsString() method.
    */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsString());
    }

   /**
    * Test getMenuIDAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsBoolean());
    }

   /**
    * Test getMenuIDAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsBigInteger());
    }

   /**
    * Test getMenuIDAsURL() method.
    */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsURL());
    }

   /**
    * Test getMenuIDStringAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsInteger());
    }

   /**
    * Test getMenuIDStringAsLong() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsLong());
    }

   /**
    * Test getMenuIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsLocalDateTime());
    }

   /**
    * Test getMenuIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsLocalTime());
    }

   /**
    * Test getMenuIDStringAsString() method.
    */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsString());
    }

   /**
    * Test getMenuIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsBoolean());
    }

   /**
    * Test getMenuIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsBigInteger());
    }

   /**
    * Test getMenuIDStringAsURL() method.
    */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsURL());
    }

   /**
    * Test getNetworkNameAsInteger() method.
    */
    @Test
    public void subTestGetNetworkNameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsInteger());
    }

   /**
    * Test getNetworkNameAsLong() method.
    */
    @Test
    public void subTestGetNetworkNameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsLong());
    }

   /**
    * Test getNetworkNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetNetworkNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsLocalDateTime());
    }

   /**
    * Test getNetworkNameAsLocalTime() method.
    */
    @Test
    public void subTestGetNetworkNameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsLocalTime());
    }

   /**
    * Test getNetworkNameAsString() method.
    */
    @Test
    public void subTestGetNetworkNameAsString() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsString());
    }

   /**
    * Test getNetworkNameAsBoolean() method.
    */
    @Test
    public void subTestGetNetworkNameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsBoolean());
    }

   /**
    * Test getNetworkNameAsBigInteger() method.
    */
    @Test
    public void subTestGetNetworkNameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsBigInteger());
    }

   /**
    * Test getNetworkNameAsURL() method.
    */
    @Test
    public void subTestGetNetworkNameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsURL());
    }

   /**
    * Test getOriginalNetworkNameAsInteger() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsInteger());
    }

   /**
    * Test getOriginalNetworkNameAsLong() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsLong());
    }

   /**
    * Test getOriginalNetworkNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsLocalDateTime());
    }

   /**
    * Test getOriginalNetworkNameAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsLocalTime());
    }

   /**
    * Test getOriginalNetworkNameAsString() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsString() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsString());
    }

   /**
    * Test getOriginalNetworkNameAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsBoolean());
    }

   /**
    * Test getOriginalNetworkNameAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsBigInteger());
    }

   /**
    * Test getOriginalNetworkNameAsURL() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsString());
    }

   /**
    * Test getOriginalSourceMediumIDAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsString());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsURL());
    }

   /**
    * Test getServiceUrlAsInteger() method.
    */
    @Test
    public void subTestGetServiceUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsInteger());
    }

   /**
    * Test getServiceUrlAsLong() method.
    */
    @Test
    public void subTestGetServiceUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsLong());
    }

   /**
    * Test getServiceUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsLocalDateTime());
    }

   /**
    * Test getServiceUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsLocalTime());
    }

   /**
    * Test getServiceUrlAsString() method.
    */
    @Test
    public void subTestGetServiceUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsString());
    }

   /**
    * Test getServiceUrlAsBoolean() method.
    */
    @Test
    public void subTestGetServiceUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsBoolean());
    }

   /**
    * Test getServiceUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsBigInteger());
    }

   /**
    * Test getServiceUrlAsURL() method.
    */
    @Test
    public void subTestGetServiceUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsURL());
    }

   /**
    * Test getServiceChannelAsInteger() method.
    */
    @Test
    public void subTestGetServiceChannelAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsInteger());
    }

   /**
    * Test getServiceChannelAsLong() method.
    */
    @Test
    public void subTestGetServiceChannelAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsLong());
    }

   /**
    * Test getServiceChannelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceChannelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsLocalDateTime());
    }

   /**
    * Test getServiceChannelAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceChannelAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsLocalTime());
    }

   /**
    * Test getServiceChannelAsString() method.
    */
    @Test
    public void subTestGetServiceChannelAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsString());
    }

   /**
    * Test getServiceChannelAsBoolean() method.
    */
    @Test
    public void subTestGetServiceChannelAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsBoolean());
    }

   /**
    * Test getServiceChannelAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceChannelAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsBigInteger());
    }

   /**
    * Test getServiceChannelAsURL() method.
    */
    @Test
    public void subTestGetServiceChannelAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsURL());
    }

   /**
    * Test getServiceKindAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsInteger());
    }

   /**
    * Test getServiceKindAsLong() method.
    */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsLong());
    }

   /**
    * Test getServiceKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsLocalDateTime());
    }

   /**
    * Test getServiceKindAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsLocalTime());
    }

   /**
    * Test getServiceKindAsString() method.
    */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsString());
    }

   /**
    * Test getServiceKindAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsBoolean());
    }

   /**
    * Test getServiceKindAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsBigInteger());
    }

   /**
    * Test getServiceKindAsURL() method.
    */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsURL());
    }

   /**
    * Test getServiceKindStringAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsInteger());
    }

   /**
    * Test getServiceKindStringAsLong() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsLong());
    }

   /**
    * Test getServiceKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsLocalDateTime());
    }

   /**
    * Test getServiceKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsLocalTime());
    }

   /**
    * Test getServiceKindStringAsString() method.
    */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsString());
    }

   /**
    * Test getServiceKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsBoolean());
    }

   /**
    * Test getServiceKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsBigInteger());
    }

   /**
    * Test getServiceKindStringAsURL() method.
    */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsURL());
    }

   /**
    * Test getServiceNameAsInteger() method.
    */
    @Test
    public void subTestGetServiceNameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsInteger());
    }

   /**
    * Test getServiceNameAsLong() method.
    */
    @Test
    public void subTestGetServiceNameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsLong());
    }

   /**
    * Test getServiceNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsLocalDateTime());
    }

   /**
    * Test getServiceNameAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceNameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsLocalTime());
    }

   /**
    * Test getServiceNameAsString() method.
    */
    @Test
    public void subTestGetServiceNameAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsString());
    }

   /**
    * Test getServiceNameAsBoolean() method.
    */
    @Test
    public void subTestGetServiceNameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsBoolean());
    }

   /**
    * Test getServiceNameAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceNameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsBigInteger());
    }

   /**
    * Test getServiceNameAsURL() method.
    */
    @Test
    public void subTestGetServiceNameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsURL());
    }

   /**
    * Test getServiceProviderAsInteger() method.
    */
    @Test
    public void subTestGetServiceProviderAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsInteger());
    }

   /**
    * Test getServiceProviderAsLong() method.
    */
    @Test
    public void subTestGetServiceProviderAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsLong());
    }

   /**
    * Test getServiceProviderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceProviderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsLocalDateTime());
    }

   /**
    * Test getServiceProviderAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceProviderAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsLocalTime());
    }

   /**
    * Test getServiceProviderAsString() method.
    */
    @Test
    public void subTestGetServiceProviderAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsString());
    }

   /**
    * Test getServiceProviderAsBoolean() method.
    */
    @Test
    public void subTestGetServiceProviderAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsBoolean());
    }

   /**
    * Test getServiceProviderAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceProviderAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsBigInteger());
    }

   /**
    * Test getServiceProviderAsURL() method.
    */
    @Test
    public void subTestGetServiceProviderAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsURL());
    }

   /**
    * Test getServiceProviderrUrlAsInteger() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsInteger());
    }

   /**
    * Test getServiceProviderrUrlAsLong() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsLong());
    }

   /**
    * Test getServiceProviderrUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsLocalDateTime());
    }

   /**
    * Test getServiceProviderrUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsLocalTime());
    }

   /**
    * Test getServiceProviderrUrlAsString() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsString());
    }

   /**
    * Test getServiceProviderrUrlAsBoolean() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsBoolean());
    }

   /**
    * Test getServiceProviderrUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsBigInteger());
    }

   /**
    * Test getServiceProviderrUrlAsURL() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsURL());
    }

   /**
    * Test getServiceTypeAsInteger() method.
    */
    @Test
    public void subTestGetServiceTypeAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsInteger());
    }

   /**
    * Test getServiceTypeAsLong() method.
    */
    @Test
    public void subTestGetServiceTypeAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsLong());
    }

   /**
    * Test getServiceTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsLocalDateTime());
    }

   /**
    * Test getServiceTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsLocalTime());
    }

   /**
    * Test getServiceTypeAsString() method.
    */
    @Test
    public void subTestGetServiceTypeAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsString());
    }

   /**
    * Test getServiceTypeAsBoolean() method.
    */
    @Test
    public void subTestGetServiceTypeAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsBoolean());
    }

   /**
    * Test getServiceTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsBigInteger());
    }

   /**
    * Test getServiceTypeAsURL() method.
    */
    @Test
    public void subTestGetServiceTypeAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsURL());
    }

   /**
    * Test getStatusAsInteger() method.
    */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsInteger());
    }

   /**
    * Test getStatusAsLong() method.
    */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsLong());
    }

   /**
    * Test getStatusAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsLocalDateTime());
    }

   /**
    * Test getStatusAsLocalTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsLocalTime());
    }

   /**
    * Test getStatusAsString() method.
    */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsString());
    }

   /**
    * Test getStatusAsBoolean() method.
    */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsBoolean());
    }

   /**
    * Test getStatusAsBigInteger() method.
    */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsBigInteger());
    }

   /**
    * Test getStatusAsURL() method.
    */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsURL());
    }

   /**
    * Test getStreamCountAsInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsInteger());
    }

   /**
    * Test getStreamCountAsLong() method.
    */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsLong());
    }

   /**
    * Test getStreamCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsLocalDateTime());
    }

   /**
    * Test getStreamCountAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsLocalTime());
    }

   /**
    * Test getStreamCountAsString() method.
    */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsString());
    }

   /**
    * Test getStreamCountAsBoolean() method.
    */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsBoolean());
    }

   /**
    * Test getStreamCountAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsBigInteger());
    }

   /**
    * Test getStreamCountAsURL() method.
    */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsURL());
    }

   /**
    * Test getStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsInteger());
    }

   /**
    * Test getStreamKindAsLong() method.
    */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsLong());
    }

   /**
    * Test getStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsLocalDateTime());
    }

   /**
    * Test getStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsLocalTime());
    }

   /**
    * Test getStreamKindAsString() method.
    */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsString());
    }

   /**
    * Test getStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsBoolean());
    }

   /**
    * Test getStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsBigInteger());
    }

   /**
    * Test getStreamKindAsURL() method.
    */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsURL());
    }

   /**
    * Test getStreamKindStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsInteger());
    }

   /**
    * Test getStreamKindStringAsLong() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsLong());
    }

   /**
    * Test getStreamKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsLocalDateTime());
    }

   /**
    * Test getStreamKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsLocalTime());
    }

   /**
    * Test getStreamKindStringAsString() method.
    */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsString());
    }

   /**
    * Test getStreamKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsBoolean());
    }

   /**
    * Test getStreamKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsBigInteger());
    }

   /**
    * Test getStreamKindStringAsURL() method.
    */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsURL());
    }

   /**
    * Test getStreamKindIDAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsInteger());
    }

   /**
    * Test getStreamKindIDAsLong() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsLong());
    }

   /**
    * Test getStreamKindIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsLocalDateTime());
    }

   /**
    * Test getStreamKindIDAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsLocalTime());
    }

   /**
    * Test getStreamKindIDAsString() method.
    */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsString());
    }

   /**
    * Test getStreamKindIDAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsBoolean());
    }

   /**
    * Test getStreamKindIDAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsBigInteger());
    }

   /**
    * Test getStreamKindIDAsURL() method.
    */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsURL());
    }

   /**
    * Test getStreamKindPosAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsInteger());
    }

   /**
    * Test getStreamKindPosAsLong() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsLong());
    }

   /**
    * Test getStreamKindPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsLocalDateTime());
    }

   /**
    * Test getStreamKindPosAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsLocalTime());
    }

   /**
    * Test getStreamKindPosAsString() method.
    */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsString());
    }

   /**
    * Test getStreamKindPosAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsBoolean());
    }

   /**
    * Test getStreamKindPosAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsBigInteger());
    }

   /**
    * Test getStreamKindPosAsURL() method.
    */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsURL());
    }

   /**
    * Test getStreamOrderAsInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsInteger());
    }

   /**
    * Test getStreamOrderAsLong() method.
    */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsLong());
    }

   /**
    * Test getStreamOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsLocalDateTime());
    }

   /**
    * Test getStreamOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsLocalTime());
    }

   /**
    * Test getStreamOrderAsString() method.
    */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsString());
    }

   /**
    * Test getStreamOrderAsBoolean() method.
    */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsBoolean());
    }

   /**
    * Test getStreamOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsBigInteger());
    }

   /**
    * Test getStreamOrderAsURL() method.
    */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsURL());
    }

   /**
    * Test getTimeZonesAsInteger() method.
    */
    @Test
    public void subTestGetTimeZonesAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsInteger());
    }

   /**
    * Test getTimeZonesAsLong() method.
    */
    @Test
    public void subTestGetTimeZonesAsLong() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsLong());
    }

   /**
    * Test getTimeZonesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeZonesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsLocalDateTime());
    }

   /**
    * Test getTimeZonesAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeZonesAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsLocalTime());
    }

   /**
    * Test getTimeZonesAsString() method.
    */
    @Test
    public void subTestGetTimeZonesAsString() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsString());
    }

   /**
    * Test getTimeZonesAsBoolean() method.
    */
    @Test
    public void subTestGetTimeZonesAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsBoolean());
    }

   /**
    * Test getTimeZonesAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeZonesAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsBigInteger());
    }

   /**
    * Test getTimeZonesAsURL() method.
    */
    @Test
    public void subTestGetTimeZonesAsURL() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsURL());
    }

   /**
    * Test getTitleAsInteger() method.
    */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsInteger());
    }

   /**
    * Test getTitleAsLong() method.
    */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsLong());
    }

   /**
    * Test getTitleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsLocalDateTime());
    }

   /**
    * Test getTitleAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsLocalTime());
    }

   /**
    * Test getTitleAsString() method.
    */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsString());
    }

   /**
    * Test getTitleAsBoolean() method.
    */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsBoolean());
    }

   /**
    * Test getTitleAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsBigInteger());
    }

   /**
    * Test getTitleAsURL() method.
    */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsURL());
    }

   /**
    * Test getUniqueIDAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsInteger());
    }

   /**
    * Test getUniqueIDAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsLong());
    }

   /**
    * Test getUniqueIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsLocalDateTime());
    }

   /**
    * Test getUniqueIDAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsLocalTime());
    }

   /**
    * Test getUniqueIDAsString() method.
    */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsString());
    }

   /**
    * Test getUniqueIDAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsBoolean());
    }

   /**
    * Test getUniqueIDAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsBigInteger());
    }

   /**
    * Test getUniqueIDAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsURL());
    }

   /**
    * Test getUniqueIDStringAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsInteger());
    }

   /**
    * Test getUniqueIDStringAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsLong());
    }

   /**
    * Test getUniqueIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsLocalDateTime());
    }

   /**
    * Test getUniqueIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsLocalTime());
    }

   /**
    * Test getUniqueIDStringAsString() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsString());
    }

   /**
    * Test getUniqueIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsBoolean());
    }

   /**
    * Test getUniqueIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsBigInteger());
    }

   /**
    * Test getUniqueIDStringAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsURL());
    }

}
