package aka.jmetadata.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import org.apache.commons.lang3.SystemUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataGeneral;

/**
 * This class contains tests methods for General informations of a specific General stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataGeneral_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataGeneral_Test.class.getName());

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
     * Test getAccompanimentAsInteger() method.
     */
    @Test
    public void subTestGetAccompanimentAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsInteger());
    }

    /**
     * Test getAccompanimentAsLong() method.
     */
    @Test
    public void subTestGetAccompanimentAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsLong());
    }

    /**
     * Test getAccompanimentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAccompanimentAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsLocalDateTime());
    }

    /**
     * Test getAccompanimentAsLocalTime() method.
     */
    @Test
    public void subTestGetAccompanimentAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsLocalTime());
    }

    /**
     * Test getAccompanimentAsString() method.
     */
    @Test
    public void subTestGetAccompanimentAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsString());
    }

    /**
     * Test getAccompanimentAsBoolean() method.
     */
    @Test
    public void subTestGetAccompanimentAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsBoolean());
    }

    /**
     * Test getAccompanimentAsBigInteger() method.
     */
    @Test
    public void subTestGetAccompanimentAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsBigInteger());
    }

    /**
     * Test getAccompanimentAsURL() method.
     */
    @Test
    public void subTestGetAccompanimentAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsURL());
    }

    /**
     * Test getActorAsInteger() method.
     */
    @Test
    public void subTestGetActorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsInteger());
    }

    /**
     * Test getActorAsLong() method.
     */
    @Test
    public void subTestGetActorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsLong());
    }

    /**
     * Test getActorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsLocalDateTime());
    }

    /**
     * Test getActorAsLocalTime() method.
     */
    @Test
    public void subTestGetActorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsLocalTime());
    }

    /**
     * Test getActorAsString() method.
     */
    @Test
    public void subTestGetActorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsString());
    }

    /**
     * Test getActorAsBoolean() method.
     */
    @Test
    public void subTestGetActorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsBoolean());
    }

    /**
     * Test getActorAsBigInteger() method.
     */
    @Test
    public void subTestGetActorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsBigInteger());
    }

    /**
     * Test getActorAsURL() method.
     */
    @Test
    public void subTestGetActorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsURL());
    }

    /**
     * Test getActorCharacterAsInteger() method.
     */
    @Test
    public void subTestGetActorCharacterAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsInteger());
    }

    /**
     * Test getActorCharacterAsLong() method.
     */
    @Test
    public void subTestGetActorCharacterAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsLong());
    }

    /**
     * Test getActorCharacterAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActorCharacterAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsLocalDateTime());
    }

    /**
     * Test getActorCharacterAsLocalTime() method.
     */
    @Test
    public void subTestGetActorCharacterAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsLocalTime());
    }

    /**
     * Test getActorCharacterAsString() method.
     */
    @Test
    public void subTestGetActorCharacterAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsString());
    }

    /**
     * Test getActorCharacterAsBoolean() method.
     */
    @Test
    public void subTestGetActorCharacterAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsBoolean());
    }

    /**
     * Test getActorCharacterAsBigInteger() method.
     */
    @Test
    public void subTestGetActorCharacterAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsBigInteger());
    }

    /**
     * Test getActorCharacterAsURL() method.
     */
    @Test
    public void subTestGetActorCharacterAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsURL());
    }

    /**
     * Test getAddedDateAsInteger() method.
     */
    @Test
    public void subTestGetAddedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsInteger());
    }

    /**
     * Test getAddedDateAsLong() method.
     */
    @Test
    public void subTestGetAddedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsLong());
    }

    /**
     * Test getAddedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAddedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsLocalDateTime());
    }

    /**
     * Test getAddedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetAddedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsLocalTime());
    }

    /**
     * Test getAddedDateAsString() method.
     */
    @Test
    public void subTestGetAddedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsString());
    }

    /**
     * Test getAddedDateAsBoolean() method.
     */
    @Test
    public void subTestGetAddedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsBoolean());
    }

    /**
     * Test getAddedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetAddedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsBigInteger());
    }

    /**
     * Test getAddedDateAsURL() method.
     */
    @Test
    public void subTestGetAddedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsURL());
    }

    /**
     * Test getAlbumAsInteger() method.
     */
    @Test
    public void subTestGetAlbumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsInteger());
    }

    /**
     * Test getAlbumAsLong() method.
     */
    @Test
    public void subTestGetAlbumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsLong());
    }

    /**
     * Test getAlbumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsLocalDateTime());
    }

    /**
     * Test getAlbumAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsLocalTime());
    }

    /**
     * Test getAlbumAsString() method.
     */
    @Test
    public void subTestGetAlbumAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsString());
    }

    /**
     * Test getAlbumAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsBoolean());
    }

    /**
     * Test getAlbumAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsBigInteger());
    }

    /**
     * Test getAlbumAsURL() method.
     */
    @Test
    public void subTestGetAlbumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsURL());
    }

    /**
     * Test getAlbumPerformerAsInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsInteger());
    }

    /**
     * Test getAlbumPerformerAsLong() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsLong());
    }

    /**
     * Test getAlbumPerformerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsLocalDateTime());
    }

    /**
     * Test getAlbumPerformerAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsLocalTime());
    }

    /**
     * Test getAlbumPerformerAsString() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsString());
    }

    /**
     * Test getAlbumPerformerAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsBoolean());
    }

    /**
     * Test getAlbumPerformerAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsBigInteger());
    }

    /**
     * Test getAlbumPerformerAsURL() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsURL());
    }

    /**
     * Test getAlbumPerformerSortAsInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsInteger());
    }

    /**
     * Test getAlbumPerformerSortAsLong() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsLong());
    }

    /**
     * Test getAlbumPerformerSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsLocalDateTime());
    }

    /**
     * Test getAlbumPerformerSortAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsLocalTime());
    }

    /**
     * Test getAlbumPerformerSortAsString() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsString());
    }

    /**
     * Test getAlbumPerformerSortAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsBoolean());
    }

    /**
     * Test getAlbumPerformerSortAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsBigInteger());
    }

    /**
     * Test getAlbumPerformerSortAsURL() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsURL());
    }

    /**
     * Test getAlbumPerformerUrlAsInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsInteger());
    }

    /**
     * Test getAlbumPerformerUrlAsLong() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsLong());
    }

    /**
     * Test getAlbumPerformerUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsLocalDateTime());
    }

    /**
     * Test getAlbumPerformerUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsLocalTime());
    }

    /**
     * Test getAlbumPerformerUrlAsString() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsString());
    }

    /**
     * Test getAlbumPerformerUrlAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsBoolean());
    }

    /**
     * Test getAlbumPerformerUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsBigInteger());
    }

    /**
     * Test getAlbumPerformerUrlAsURL() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsURL());
    }

    /**
     * Test getAlbumSortAsInteger() method.
     */
    @Test
    public void subTestGetAlbumSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsInteger());
    }

    /**
     * Test getAlbumSortAsLong() method.
     */
    @Test
    public void subTestGetAlbumSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsLong());
    }

    /**
     * Test getAlbumSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsLocalDateTime());
    }

    /**
     * Test getAlbumSortAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsLocalTime());
    }

    /**
     * Test getAlbumSortAsString() method.
     */
    @Test
    public void subTestGetAlbumSortAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsString());
    }

    /**
     * Test getAlbumSortAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsBoolean());
    }

    /**
     * Test getAlbumSortAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsBigInteger());
    }

    /**
     * Test getAlbumSortAsURL() method.
     */
    @Test
    public void subTestGetAlbumSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsURL());
    }

    /**
     * Test getAlbumMoreAsInteger() method.
     */
    @Test
    public void subTestGetAlbumMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsInteger());
    }

    /**
     * Test getAlbumMoreAsLong() method.
     */
    @Test
    public void subTestGetAlbumMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsLong());
    }

    /**
     * Test getAlbumMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsLocalDateTime());
    }

    /**
     * Test getAlbumMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsLocalTime());
    }

    /**
     * Test getAlbumMoreAsString() method.
     */
    @Test
    public void subTestGetAlbumMoreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsString());
    }

    /**
     * Test getAlbumMoreAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsBoolean());
    }

    /**
     * Test getAlbumMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsBigInteger());
    }

    /**
     * Test getAlbumMoreAsURL() method.
     */
    @Test
    public void subTestGetAlbumMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsURL());
    }

    /**
     * Test getAlbumReplayGainGainAsInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsInteger());
    }

    /**
     * Test getAlbumReplayGainGainAsLong() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsLong());
    }

    /**
     * Test getAlbumReplayGainGainAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsLocalDateTime());
    }

    /**
     * Test getAlbumReplayGainGainAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsLocalTime());
    }

    /**
     * Test getAlbumReplayGainGainAsString() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsString());
    }

    /**
     * Test getAlbumReplayGainGainAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsBoolean());
    }

    /**
     * Test getAlbumReplayGainGainAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsBigInteger());
    }

    /**
     * Test getAlbumReplayGainGainAsURL() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsURL());
    }

    /**
     * Test getAlbumReplayGainGainStringAsInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsInteger());
    }

    /**
     * Test getAlbumReplayGainGainStringAsLong() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsLong());
    }

    /**
     * Test getAlbumReplayGainGainStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalDateTime());
    }

    /**
     * Test getAlbumReplayGainGainStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalTime());
    }

    /**
     * Test getAlbumReplayGainGainStringAsString() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsString());
    }

    /**
     * Test getAlbumReplayGainGainStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsBoolean());
    }

    /**
     * Test getAlbumReplayGainGainStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsBigInteger());
    }

    /**
     * Test getAlbumReplayGainGainStringAsURL() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsURL());
    }

    /**
     * Test getAlbumReplayGainPeakAsInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsInteger());
    }

    /**
     * Test getAlbumReplayGainPeakAsLong() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsLong());
    }

    /**
     * Test getAlbumReplayGainPeakAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsLocalDateTime());
    }

    /**
     * Test getAlbumReplayGainPeakAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsLocalTime());
    }

    /**
     * Test getAlbumReplayGainPeakAsString() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsString());
    }

    /**
     * Test getAlbumReplayGainPeakAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsBoolean());
    }

    /**
     * Test getAlbumReplayGainPeakAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsBigInteger());
    }

    /**
     * Test getAlbumReplayGainPeakAsURL() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsURL());
    }

    /**
     * Test getArchivalLocationAsInteger() method.
     */
    @Test
    public void subTestGetArchivalLocationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsInteger());
    }

    /**
     * Test getArchivalLocationAsLong() method.
     */
    @Test
    public void subTestGetArchivalLocationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsLong());
    }

    /**
     * Test getArchivalLocationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetArchivalLocationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsLocalDateTime());
    }

    /**
     * Test getArchivalLocationAsLocalTime() method.
     */
    @Test
    public void subTestGetArchivalLocationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsLocalTime());
    }

    /**
     * Test getArchivalLocationAsString() method.
     */
    @Test
    public void subTestGetArchivalLocationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsString());
    }

    /**
     * Test getArchivalLocationAsBoolean() method.
     */
    @Test
    public void subTestGetArchivalLocationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsBoolean());
    }

    /**
     * Test getArchivalLocationAsBigInteger() method.
     */
    @Test
    public void subTestGetArchivalLocationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsBigInteger());
    }

    /**
     * Test getArchivalLocationAsURL() method.
     */
    @Test
    public void subTestGetArchivalLocationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsURL());
    }

    /**
     * Test getArrangerAsInteger() method.
     */
    @Test
    public void subTestGetArrangerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsInteger());
    }

    /**
     * Test getArrangerAsLong() method.
     */
    @Test
    public void subTestGetArrangerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsLong());
    }

    /**
     * Test getArrangerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetArrangerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsLocalDateTime());
    }

    /**
     * Test getArrangerAsLocalTime() method.
     */
    @Test
    public void subTestGetArrangerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsLocalTime());
    }

    /**
     * Test getArrangerAsString() method.
     */
    @Test
    public void subTestGetArrangerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsString());
    }

    /**
     * Test getArrangerAsBoolean() method.
     */
    @Test
    public void subTestGetArrangerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsBoolean());
    }

    /**
     * Test getArrangerAsBigInteger() method.
     */
    @Test
    public void subTestGetArrangerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsBigInteger());
    }

    /**
     * Test getArrangerAsURL() method.
     */
    @Test
    public void subTestGetArrangerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsURL());
    }

    /**
     * Test getArtDirectorAsInteger() method.
     */
    @Test
    public void subTestGetArtDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsInteger());
    }

    /**
     * Test getArtDirectorAsLong() method.
     */
    @Test
    public void subTestGetArtDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsLong());
    }

    /**
     * Test getArtDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetArtDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsLocalDateTime());
    }

    /**
     * Test getArtDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetArtDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsLocalTime());
    }

    /**
     * Test getArtDirectorAsString() method.
     */
    @Test
    public void subTestGetArtDirectorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsString());
    }

    /**
     * Test getArtDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetArtDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsBoolean());
    }

    /**
     * Test getArtDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetArtDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsBigInteger());
    }

    /**
     * Test getArtDirectorAsURL() method.
     */
    @Test
    public void subTestGetArtDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsURL());
    }

    /**
     * Test getAssistantDirectorAsInteger() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsInteger());
    }

    /**
     * Test getAssistantDirectorAsLong() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsLong());
    }

    /**
     * Test getAssistantDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsLocalDateTime());
    }

    /**
     * Test getAssistantDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsLocalTime());
    }

    /**
     * Test getAssistantDirectorAsString() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsString());
    }

    /**
     * Test getAssistantDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsBoolean());
    }

    /**
     * Test getAssistantDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsBigInteger());
    }

    /**
     * Test getAssistantDirectorAsURL() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsURL());
    }

    /**
     * Test getAudioFormatListAsInteger() method.
     */
    @Test
    public void subTestGetAudioFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsInteger());
    }

    /**
     * Test getAudioFormatListAsLong() method.
     */
    @Test
    public void subTestGetAudioFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsLong());
    }

    /**
     * Test getAudioFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsLocalDateTime());
    }

    /**
     * Test getAudioFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsLocalTime());
    }

    /**
     * Test getAudioFormatListAsString() method.
     */
    @Test
    public void subTestGetAudioFormatListAsString() {
        assertEquals("MPEG Audio / AAC", JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsString());
    }

    /**
     * Test getAudioFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetAudioFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsBoolean());
    }

    /**
     * Test getAudioFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsBigInteger());
    }

    /**
     * Test getAudioFormatListAsURL() method.
     */
    @Test
    public void subTestGetAudioFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsURL());
    }

    /**
     * Test getAudioFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsInteger());
    }

    /**
     * Test getAudioFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsLong());
    }

    /**
     * Test getAudioFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getAudioFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsLocalTime());
    }

    /**
     * Test getAudioFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsString() {
        assertEquals("MPEG Audio (MP3) / AAC", JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsString());
    }

    /**
     * Test getAudioFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsBoolean());
    }

    /**
     * Test getAudioFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsBigInteger());
    }

    /**
     * Test getAudioFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsURL());
    }

    /**
     * Test getAudioLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsInteger());
    }

    /**
     * Test getAudioLanguageListAsLong() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsLong());
    }

    /**
     * Test getAudioLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsLocalDateTime());
    }

    /**
     * Test getAudioLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsLocalTime());
    }

    /**
     * Test getAudioLanguageListAsString() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsString() {
        assertEquals("English / English", JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsString());
    }

    /**
     * Test getAudioLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsBoolean());
    }

    /**
     * Test getAudioLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsBigInteger());
    }

    /**
     * Test getAudioLanguageListAsURL() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsURL());
    }

    /**
     * Test getAudioCountAsInteger() method.
     */
    @Test
    public void subTestGetAudioCountAsInteger() {
        assertEquals(Integer.valueOf(2), JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsInteger());
    }

    /**
     * Test getAudioCountAsLong() method.
     */
    @Test
    public void subTestGetAudioCountAsLong() {
        assertEquals(Long.valueOf(2), JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsLong());
    }

    /**
     * Test getAudioCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsLocalDateTime());
    }

    /**
     * Test getAudioCountAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsLocalTime());
    }

    /**
     * Test getAudioCountAsString() method.
     */
    @Test
    public void subTestGetAudioCountAsString() {
        assertEquals("2", JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsString());
    }

    /**
     * Test getAudioCountAsBoolean() method.
     */
    @Test
    public void subTestGetAudioCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsBoolean());
    }

    /**
     * Test getAudioCountAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(2), JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsBigInteger());
    }

    /**
     * Test getAudioCountAsURL() method.
     */
    @Test
    public void subTestGetAudioCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsURL());
    }

    /**
     * Test getBarCodeAsInteger() method.
     */
    @Test
    public void subTestGetBarCodeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsInteger());
    }

    /**
     * Test getBarCodeAsLong() method.
     */
    @Test
    public void subTestGetBarCodeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsLong());
    }

    /**
     * Test getBarCodeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBarCodeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsLocalDateTime());
    }

    /**
     * Test getBarCodeAsLocalTime() method.
     */
    @Test
    public void subTestGetBarCodeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsLocalTime());
    }

    /**
     * Test getBarCodeAsString() method.
     */
    @Test
    public void subTestGetBarCodeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsString());
    }

    /**
     * Test getBarCodeAsBoolean() method.
     */
    @Test
    public void subTestGetBarCodeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsBoolean());
    }

    /**
     * Test getBarCodeAsBigInteger() method.
     */
    @Test
    public void subTestGetBarCodeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsBigInteger());
    }

    /**
     * Test getBarCodeAsURL() method.
     */
    @Test
    public void subTestGetBarCodeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsURL());
    }

    /**
     * Test getBPMAsInteger() method.
     */
    @Test
    public void subTestGetBPMAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsInteger());
    }

    /**
     * Test getBPMAsLong() method.
     */
    @Test
    public void subTestGetBPMAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsLong());
    }

    /**
     * Test getBPMAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBPMAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsLocalDateTime());
    }

    /**
     * Test getBPMAsLocalTime() method.
     */
    @Test
    public void subTestGetBPMAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsLocalTime());
    }

    /**
     * Test getBPMAsString() method.
     */
    @Test
    public void subTestGetBPMAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsString());
    }

    /**
     * Test getBPMAsBoolean() method.
     */
    @Test
    public void subTestGetBPMAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsBoolean());
    }

    /**
     * Test getBPMAsBigInteger() method.
     */
    @Test
    public void subTestGetBPMAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsBigInteger());
    }

    /**
     * Test getBPMAsURL() method.
     */
    @Test
    public void subTestGetBPMAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsURL());
    }

    /**
     * Test getCatalogNumberAsInteger() method.
     */
    @Test
    public void subTestGetCatalogNumberAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsInteger());
    }

    /**
     * Test getCatalogNumberAsLong() method.
     */
    @Test
    public void subTestGetCatalogNumberAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsLong());
    }

    /**
     * Test getCatalogNumberAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCatalogNumberAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsLocalDateTime());
    }

    /**
     * Test getCatalogNumberAsLocalTime() method.
     */
    @Test
    public void subTestGetCatalogNumberAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsLocalTime());
    }

    /**
     * Test getCatalogNumberAsString() method.
     */
    @Test
    public void subTestGetCatalogNumberAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsString());
    }

    /**
     * Test getCatalogNumberAsBoolean() method.
     */
    @Test
    public void subTestGetCatalogNumberAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsBoolean());
    }

    /**
     * Test getCatalogNumberAsBigInteger() method.
     */
    @Test
    public void subTestGetCatalogNumberAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsBigInteger());
    }

    /**
     * Test getCatalogNumberAsURL() method.
     */
    @Test
    public void subTestGetCatalogNumberAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsURL());
    }

    /**
     * Test getChapterAsInteger() method.
     */
    @Test
    public void subTestGetChapterAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsInteger());
    }

    /**
     * Test getChapterAsLong() method.
     */
    @Test
    public void subTestGetChapterAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsLong());
    }

    /**
     * Test getChapterAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChapterAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsLocalDateTime());
    }

    /**
     * Test getChapterAsLocalTime() method.
     */
    @Test
    public void subTestGetChapterAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsLocalTime());
    }

    /**
     * Test getChapterAsString() method.
     */
    @Test
    public void subTestGetChapterAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsString());
    }

    /**
     * Test getChapterAsBoolean() method.
     */
    @Test
    public void subTestGetChapterAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsBoolean());
    }

    /**
     * Test getChapterAsBigInteger() method.
     */
    @Test
    public void subTestGetChapterAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsBigInteger());
    }

    /**
     * Test getChapterAsURL() method.
     */
    @Test
    public void subTestGetChapterAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsURL());
    }

    /**
     * Test getChoregrapherAsInteger() method.
     */
    @Test
    public void subTestGetChoregrapherAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsInteger());
    }

    /**
     * Test getChoregrapherAsLong() method.
     */
    @Test
    public void subTestGetChoregrapherAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsLong());
    }

    /**
     * Test getChoregrapherAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChoregrapherAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsLocalDateTime());
    }

    /**
     * Test getChoregrapherAsLocalTime() method.
     */
    @Test
    public void subTestGetChoregrapherAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsLocalTime());
    }

    /**
     * Test getChoregrapherAsString() method.
     */
    @Test
    public void subTestGetChoregrapherAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsString());
    }

    /**
     * Test getChoregrapherAsBoolean() method.
     */
    @Test
    public void subTestGetChoregrapherAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsBoolean());
    }

    /**
     * Test getChoregrapherAsBigInteger() method.
     */
    @Test
    public void subTestGetChoregrapherAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsBigInteger());
    }

    /**
     * Test getChoregrapherAsURL() method.
     */
    @Test
    public void subTestGetChoregrapherAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsURL());
    }

    /**
     * Test getCodecIDAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsInteger());
    }

    /**
     * Test getCodecIDAsLong() method.
     */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsLong());
    }

    /**
     * Test getCodecIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsLocalDateTime());
    }

    /**
     * Test getCodecIDAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsLocalTime());
    }

    /**
     * Test getCodecIDAsString() method.
     */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsString());
    }

    /**
     * Test getCodecIDAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsBoolean());
    }

    /**
     * Test getCodecIDAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsBigInteger());
    }

    /**
     * Test getCodecIDAsURL() method.
     */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsURL());
    }

    /**
     * Test getCodecIDHintAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsInteger());
    }

    /**
     * Test getCodecIDHintAsLong() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsLong());
    }

    /**
     * Test getCodecIDHintAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsLocalDateTime());
    }

    /**
     * Test getCodecIDHintAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsLocalTime());
    }

    /**
     * Test getCodecIDHintAsString() method.
     */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsString());
    }

    /**
     * Test getCodecIDHintAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsBoolean());
    }

    /**
     * Test getCodecIDHintAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsBigInteger());
    }

    /**
     * Test getCodecIDHintAsURL() method.
     */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsURL());
    }

    /**
     * Test getCodecIDInfoAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsInteger());
    }

    /**
     * Test getCodecIDInfoAsLong() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsLong());
    }

    /**
     * Test getCodecIDInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsLocalDateTime());
    }

    /**
     * Test getCodecIDInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsLocalTime());
    }

    /**
     * Test getCodecIDInfoAsString() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsString());
    }

    /**
     * Test getCodecIDInfoAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsBoolean());
    }

    /**
     * Test getCodecIDInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsBigInteger());
    }

    /**
     * Test getCodecIDInfoAsURL() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsURL());
    }

    /**
     * Test getCodecIDStringAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsInteger());
    }

    /**
     * Test getCodecIDStringAsLong() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsLong());
    }

    /**
     * Test getCodecIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsLocalDateTime());
    }

    /**
     * Test getCodecIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsLocalTime());
    }

    /**
     * Test getCodecIDStringAsString() method.
     */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsString());
    }

    /**
     * Test getCodecIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsBoolean());
    }

    /**
     * Test getCodecIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsBigInteger());
    }

    /**
     * Test getCodecIDStringAsURL() method.
     */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsURL());
    }

    /**
     * Test getCodecIDUrlAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsInteger());
    }

    /**
     * Test getCodecIDUrlAsLong() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsLong());
    }

    /**
     * Test getCodecIDUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsLocalDateTime());
    }

    /**
     * Test getCodecIDUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsLocalTime());
    }

    /**
     * Test getCodecIDUrlAsString() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsString());
    }

    /**
     * Test getCodecIDUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsBoolean());
    }

    /**
     * Test getCodecIDUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsBigInteger());
    }

    /**
     * Test getCodecIDUrlAsURL() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsURL());
    }

    /**
     * Test getCodecIDCompatibleAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsInteger());
    }

    /**
     * Test getCodecIDCompatibleAsLong() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsLong());
    }

    /**
     * Test getCodecIDCompatibleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsLocalDateTime());
    }

    /**
     * Test getCodecIDCompatibleAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsLocalTime());
    }

    /**
     * Test getCodecIDCompatibleAsString() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsString());
    }

    /**
     * Test getCodecIDCompatibleAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsBoolean());
    }

    /**
     * Test getCodecIDCompatibleAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsBigInteger());
    }

    /**
     * Test getCodecIDCompatibleAsURL() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsURL());
    }

    /**
     * Test getCodecIDDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsInteger());
    }

    /**
     * Test getCodecIDDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsLong());
    }

    /**
     * Test getCodecIDDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsLocalDateTime());
    }

    /**
     * Test getCodecIDDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsLocalTime());
    }

    /**
     * Test getCodecIDDescriptionAsString() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsString());
    }

    /**
     * Test getCodecIDDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsBoolean());
    }

    /**
     * Test getCodecIDDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsBigInteger());
    }

    /**
     * Test getCodecIDDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsURL());
    }

    /**
     * Test getCodecIDVersionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsInteger());
    }

    /**
     * Test getCodecIDVersionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsLong());
    }

    /**
     * Test getCodecIDVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsLocalDateTime());
    }

    /**
     * Test getCodecIDVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsLocalTime());
    }

    /**
     * Test getCodecIDVersionAsString() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsString());
    }

    /**
     * Test getCodecIDVersionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsBoolean());
    }

    /**
     * Test getCodecIDVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsBigInteger());
    }

    /**
     * Test getCodecIDVersionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsURL());
    }

    /**
     * Test getCoDirectorAsInteger() method.
     */
    @Test
    public void subTestGetCoDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsInteger());
    }

    /**
     * Test getCoDirectorAsLong() method.
     */
    @Test
    public void subTestGetCoDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsLong());
    }

    /**
     * Test getCoDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsLocalDateTime());
    }

    /**
     * Test getCoDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetCoDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsLocalTime());
    }

    /**
     * Test getCoDirectorAsString() method.
     */
    @Test
    public void subTestGetCoDirectorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsString());
    }

    /**
     * Test getCoDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetCoDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsBoolean());
    }

    /**
     * Test getCoDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetCoDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsBigInteger());
    }

    /**
     * Test getCoDirectorAsURL() method.
     */
    @Test
    public void subTestGetCoDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsURL());
    }

    /**
     * Test getCollectionAsInteger() method.
     */
    @Test
    public void subTestGetCollectionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsInteger());
    }

    /**
     * Test getCollectionAsLong() method.
     */
    @Test
    public void subTestGetCollectionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsLong());
    }

    /**
     * Test getCollectionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCollectionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsLocalDateTime());
    }

    /**
     * Test getCollectionAsLocalTime() method.
     */
    @Test
    public void subTestGetCollectionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsLocalTime());
    }

    /**
     * Test getCollectionAsString() method.
     */
    @Test
    public void subTestGetCollectionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsString());
    }

    /**
     * Test getCollectionAsBoolean() method.
     */
    @Test
    public void subTestGetCollectionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsBoolean());
    }

    /**
     * Test getCollectionAsBigInteger() method.
     */
    @Test
    public void subTestGetCollectionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsBigInteger());
    }

    /**
     * Test getCollectionAsURL() method.
     */
    @Test
    public void subTestGetCollectionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsURL());
    }

    /**
     * Test getComicAsInteger() method.
     */
    @Test
    public void subTestGetComicAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsInteger());
    }

    /**
     * Test getComicAsLong() method.
     */
    @Test
    public void subTestGetComicAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsLong());
    }

    /**
     * Test getComicAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComicAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsLocalDateTime());
    }

    /**
     * Test getComicAsLocalTime() method.
     */
    @Test
    public void subTestGetComicAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsLocalTime());
    }

    /**
     * Test getComicAsString() method.
     */
    @Test
    public void subTestGetComicAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsString());
    }

    /**
     * Test getComicAsBoolean() method.
     */
    @Test
    public void subTestGetComicAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsBoolean());
    }

    /**
     * Test getComicAsBigInteger() method.
     */
    @Test
    public void subTestGetComicAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsBigInteger());
    }

    /**
     * Test getComicAsURL() method.
     */
    @Test
    public void subTestGetComicAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsURL());
    }

    /**
     * Test getComicPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsInteger());
    }

    /**
     * Test getComicPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsLong());
    }

    /**
     * Test getComicPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsLocalDateTime());
    }

    /**
     * Test getComicPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsLocalTime());
    }

    /**
     * Test getComicPositionTotalAsString() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsString());
    }

    /**
     * Test getComicPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsBoolean());
    }

    /**
     * Test getComicPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsBigInteger());
    }

    /**
     * Test getComicPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsURL());
    }

    /**
     * Test getComicMoreAsInteger() method.
     */
    @Test
    public void subTestGetComicMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsInteger());
    }

    /**
     * Test getComicMoreAsLong() method.
     */
    @Test
    public void subTestGetComicMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsLong());
    }

    /**
     * Test getComicMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComicMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsLocalDateTime());
    }

    /**
     * Test getComicMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetComicMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsLocalTime());
    }

    /**
     * Test getComicMoreAsString() method.
     */
    @Test
    public void subTestGetComicMoreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsString());
    }

    /**
     * Test getComicMoreAsBoolean() method.
     */
    @Test
    public void subTestGetComicMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsBoolean());
    }

    /**
     * Test getComicMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetComicMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsBigInteger());
    }

    /**
     * Test getComicMoreAsURL() method.
     */
    @Test
    public void subTestGetComicMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsURL());
    }

    /**
     * Test getCommentAsInteger() method.
     */
    @Test
    public void subTestGetCommentAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsInteger());
    }

    /**
     * Test getCommentAsLong() method.
     */
    @Test
    public void subTestGetCommentAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsLong());
    }

    /**
     * Test getCommentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCommentAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsLocalDateTime());
    }

    /**
     * Test getCommentAsLocalTime() method.
     */
    @Test
    public void subTestGetCommentAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsLocalTime());
    }

    /**
     * Test getCommentAsString() method.
     */
    @Test
    public void subTestGetCommentAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsString());
    }

    /**
     * Test getCommentAsBoolean() method.
     */
    @Test
    public void subTestGetCommentAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsBoolean());
    }

    /**
     * Test getCommentAsBigInteger() method.
     */
    @Test
    public void subTestGetCommentAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsBigInteger());
    }

    /**
     * Test getCommentAsURL() method.
     */
    @Test
    public void subTestGetCommentAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsURL());
    }

    /**
     * Test getCommissionedByAsInteger() method.
     */
    @Test
    public void subTestGetCommissionedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsInteger());
    }

    /**
     * Test getCommissionedByAsLong() method.
     */
    @Test
    public void subTestGetCommissionedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsLong());
    }

    /**
     * Test getCommissionedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCommissionedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsLocalDateTime());
    }

    /**
     * Test getCommissionedByAsLocalTime() method.
     */
    @Test
    public void subTestGetCommissionedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsLocalTime());
    }

    /**
     * Test getCommissionedByAsString() method.
     */
    @Test
    public void subTestGetCommissionedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsString());
    }

    /**
     * Test getCommissionedByAsBoolean() method.
     */
    @Test
    public void subTestGetCommissionedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsBoolean());
    }

    /**
     * Test getCommissionedByAsBigInteger() method.
     */
    @Test
    public void subTestGetCommissionedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsBigInteger());
    }

    /**
     * Test getCommissionedByAsURL() method.
     */
    @Test
    public void subTestGetCommissionedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsURL());
    }

    /**
     * Test getCompilationAsInteger() method.
     */
    @Test
    public void subTestGetCompilationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsInteger());
    }

    /**
     * Test getCompilationAsLong() method.
     */
    @Test
    public void subTestGetCompilationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsLong());
    }

    /**
     * Test getCompilationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompilationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsLocalDateTime());
    }

    /**
     * Test getCompilationAsLocalTime() method.
     */
    @Test
    public void subTestGetCompilationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsLocalTime());
    }

    /**
     * Test getCompilationAsString() method.
     */
    @Test
    public void subTestGetCompilationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsString());
    }

    /**
     * Test getCompilationAsBoolean() method.
     */
    @Test
    public void subTestGetCompilationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsBoolean());
    }

    /**
     * Test getCompilationAsBigInteger() method.
     */
    @Test
    public void subTestGetCompilationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsBigInteger());
    }

    /**
     * Test getCompilationAsURL() method.
     */
    @Test
    public void subTestGetCompilationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsURL());
    }

    /**
     * Test getCompilationStringAsInteger() method.
     */
    @Test
    public void subTestGetCompilationStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsInteger());
    }

    /**
     * Test getCompilationStringAsLong() method.
     */
    @Test
    public void subTestGetCompilationStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsLong());
    }

    /**
     * Test getCompilationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompilationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsLocalDateTime());
    }

    /**
     * Test getCompilationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCompilationStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsLocalTime());
    }

    /**
     * Test getCompilationStringAsString() method.
     */
    @Test
    public void subTestGetCompilationStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsString());
    }

    /**
     * Test getCompilationStringAsBoolean() method.
     */
    @Test
    public void subTestGetCompilationStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsBoolean());
    }

    /**
     * Test getCompilationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCompilationStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsBigInteger());
    }

    /**
     * Test getCompilationStringAsURL() method.
     */
    @Test
    public void subTestGetCompilationStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsURL());
    }

    /**
     * Test getCompleteNameAsInteger() method.
     */
    @Test
    public void subTestGetCompleteNameAsInteger() {
        assertEquals(Integer.valueOf(6500), JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsInteger());
    }

    /**
     * Test getCompleteNameAsLong() method.
     */
    @Test
    public void subTestGetCompleteNameAsLong() {
        assertEquals(Long.valueOf(6500), JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsLong());
    }

    /**
     * Test getCompleteNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompleteNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsLocalDateTime());
    }

    /**
     * Test getCompleteNameAsLocalTime() method.
     */
    @Test
    public void subTestGetCompleteNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsLocalTime());
    }

    /**
     * Test getCompleteNameAsBoolean() method.
     */
    @Test
    public void subTestGetCompleteNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsBoolean());
    }

    /**
     * Test getCompleteNameAsBigInteger() method.
     */
    @Test
    public void subTestGetCompleteNameAsBigInteger() {
        assertEquals(BigInteger.valueOf(6500), JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsBigInteger());
    }

    /**
     * Test getCompleteNameAsURL() method.
     */
    @Test
    public void subTestGetCompleteNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsURL());
    }

    /**
     * Test getCompleteNameLastAsInteger() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsInteger());
    }

    /**
     * Test getCompleteNameLastAsLong() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsLong());
    }

    /**
     * Test getCompleteNameLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsLocalDateTime());
    }

    /**
     * Test getCompleteNameLastAsLocalTime() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsLocalTime());
    }

    /**
     * Test getCompleteNameLastAsString() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsString());
    }

    /**
     * Test getCompleteNameLastAsBoolean() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsBoolean());
    }

    /**
     * Test getCompleteNameLastAsBigInteger() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsBigInteger());
    }

    /**
     * Test getCompleteNameLastAsURL() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsURL());
    }

    /**
     * Test getComposerAsInteger() method.
     */
    @Test
    public void subTestGetComposerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsInteger());
    }

    /**
     * Test getComposerAsLong() method.
     */
    @Test
    public void subTestGetComposerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsLong());
    }

    /**
     * Test getComposerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComposerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsLocalDateTime());
    }

    /**
     * Test getComposerAsLocalTime() method.
     */
    @Test
    public void subTestGetComposerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsLocalTime());
    }

    /**
     * Test getComposerAsString() method.
     */
    @Test
    public void subTestGetComposerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsString());
    }

    /**
     * Test getComposerAsBoolean() method.
     */
    @Test
    public void subTestGetComposerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsBoolean());
    }

    /**
     * Test getComposerAsBigInteger() method.
     */
    @Test
    public void subTestGetComposerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsBigInteger());
    }

    /**
     * Test getComposerAsURL() method.
     */
    @Test
    public void subTestGetComposerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsURL());
    }

    /**
     * Test getComposerNationalityAsInteger() method.
     */
    @Test
    public void subTestGetComposerNationalityAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsInteger());
    }

    /**
     * Test getComposerNationalityAsLong() method.
     */
    @Test
    public void subTestGetComposerNationalityAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsLong());
    }

    /**
     * Test getComposerNationalityAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComposerNationalityAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsLocalDateTime());
    }

    /**
     * Test getComposerNationalityAsLocalTime() method.
     */
    @Test
    public void subTestGetComposerNationalityAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsLocalTime());
    }

    /**
     * Test getComposerNationalityAsString() method.
     */
    @Test
    public void subTestGetComposerNationalityAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsString());
    }

    /**
     * Test getComposerNationalityAsBoolean() method.
     */
    @Test
    public void subTestGetComposerNationalityAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsBoolean());
    }

    /**
     * Test getComposerNationalityAsBigInteger() method.
     */
    @Test
    public void subTestGetComposerNationalityAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsBigInteger());
    }

    /**
     * Test getComposerNationalityAsURL() method.
     */
    @Test
    public void subTestGetComposerNationalityAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsURL());
    }

    /**
     * Test getComposerSortAsInteger() method.
     */
    @Test
    public void subTestGetComposerSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsInteger());
    }

    /**
     * Test getComposerSortAsLong() method.
     */
    @Test
    public void subTestGetComposerSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsLong());
    }

    /**
     * Test getComposerSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComposerSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsLocalDateTime());
    }

    /**
     * Test getComposerSortAsLocalTime() method.
     */
    @Test
    public void subTestGetComposerSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsLocalTime());
    }

    /**
     * Test getComposerSortAsString() method.
     */
    @Test
    public void subTestGetComposerSortAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsString());
    }

    /**
     * Test getComposerSortAsBoolean() method.
     */
    @Test
    public void subTestGetComposerSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsBoolean());
    }

    /**
     * Test getComposerSortAsBigInteger() method.
     */
    @Test
    public void subTestGetComposerSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsBigInteger());
    }

    /**
     * Test getComposerSortAsURL() method.
     */
    @Test
    public void subTestGetComposerSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsURL());
    }

    /**
     * Test getConductorAsInteger() method.
     */
    @Test
    public void subTestGetConductorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsInteger());
    }

    /**
     * Test getConductorAsLong() method.
     */
    @Test
    public void subTestGetConductorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsLong());
    }

    /**
     * Test getConductorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetConductorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsLocalDateTime());
    }

    /**
     * Test getConductorAsLocalTime() method.
     */
    @Test
    public void subTestGetConductorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsLocalTime());
    }

    /**
     * Test getConductorAsString() method.
     */
    @Test
    public void subTestGetConductorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsString());
    }

    /**
     * Test getConductorAsBoolean() method.
     */
    @Test
    public void subTestGetConductorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsBoolean());
    }

    /**
     * Test getConductorAsBigInteger() method.
     */
    @Test
    public void subTestGetConductorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsBigInteger());
    }

    /**
     * Test getConductorAsURL() method.
     */
    @Test
    public void subTestGetConductorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsURL());
    }

    /**
     * Test getContentTypeAsInteger() method.
     */
    @Test
    public void subTestGetContentTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsInteger());
    }

    /**
     * Test getContentTypeAsLong() method.
     */
    @Test
    public void subTestGetContentTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsLong());
    }

    /**
     * Test getContentTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetContentTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsLocalDateTime());
    }

    /**
     * Test getContentTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetContentTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsLocalTime());
    }

    /**
     * Test getContentTypeAsString() method.
     */
    @Test
    public void subTestGetContentTypeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsString());
    }

    /**
     * Test getContentTypeAsBoolean() method.
     */
    @Test
    public void subTestGetContentTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsBoolean());
    }

    /**
     * Test getContentTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetContentTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsBigInteger());
    }

    /**
     * Test getContentTypeAsURL() method.
     */
    @Test
    public void subTestGetContentTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsURL());
    }

    /**
     * Test getCoProducerAsInteger() method.
     */
    @Test
    public void subTestGetCoProducerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsInteger());
    }

    /**
     * Test getCoProducerAsLong() method.
     */
    @Test
    public void subTestGetCoProducerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsLong());
    }

    /**
     * Test getCoProducerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoProducerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsLocalDateTime());
    }

    /**
     * Test getCoProducerAsLocalTime() method.
     */
    @Test
    public void subTestGetCoProducerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsLocalTime());
    }

    /**
     * Test getCoProducerAsString() method.
     */
    @Test
    public void subTestGetCoProducerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsString());
    }

    /**
     * Test getCoProducerAsBoolean() method.
     */
    @Test
    public void subTestGetCoProducerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsBoolean());
    }

    /**
     * Test getCoProducerAsBigInteger() method.
     */
    @Test
    public void subTestGetCoProducerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsBigInteger());
    }

    /**
     * Test getCoProducerAsURL() method.
     */
    @Test
    public void subTestGetCoProducerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsURL());
    }

    /**
     * Test getCopyrightAsInteger() method.
     */
    @Test
    public void subTestGetCopyrightAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsInteger());
    }

    /**
     * Test getCopyrightAsLong() method.
     */
    @Test
    public void subTestGetCopyrightAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsLong());
    }

    /**
     * Test getCopyrightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCopyrightAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsLocalDateTime());
    }

    /**
     * Test getCopyrightAsLocalTime() method.
     */
    @Test
    public void subTestGetCopyrightAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsLocalTime());
    }

    /**
     * Test getCopyrightAsString() method.
     */
    @Test
    public void subTestGetCopyrightAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsString());
    }

    /**
     * Test getCopyrightAsBoolean() method.
     */
    @Test
    public void subTestGetCopyrightAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsBoolean());
    }

    /**
     * Test getCopyrightAsBigInteger() method.
     */
    @Test
    public void subTestGetCopyrightAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsBigInteger());
    }

    /**
     * Test getCopyrightAsURL() method.
     */
    @Test
    public void subTestGetCopyrightAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsURL());
    }

    /**
     * Test getCopyrightUrlAsInteger() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsInteger());
    }

    /**
     * Test getCopyrightUrlAsLong() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsLong());
    }

    /**
     * Test getCopyrightUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsLocalDateTime());
    }

    /**
     * Test getCopyrightUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsLocalTime());
    }

    /**
     * Test getCopyrightUrlAsString() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsString());
    }

    /**
     * Test getCopyrightUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsBoolean());
    }

    /**
     * Test getCopyrightUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsBigInteger());
    }

    /**
     * Test getCopyrightUrlAsURL() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsURL());
    }

    /**
     * Test getCostumeDesignerAsInteger() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsInteger());
    }

    /**
     * Test getCostumeDesignerAsLong() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsLong());
    }

    /**
     * Test getCostumeDesignerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsLocalDateTime());
    }

    /**
     * Test getCostumeDesignerAsLocalTime() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsLocalTime());
    }

    /**
     * Test getCostumeDesignerAsString() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsString());
    }

    /**
     * Test getCostumeDesignerAsBoolean() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsBoolean());
    }

    /**
     * Test getCostumeDesignerAsBigInteger() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsBigInteger());
    }

    /**
     * Test getCostumeDesignerAsURL() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsURL());
    }

    /**
     * Test getCountAsInteger() method.
     */
    @Test
    public void subTestGetCountAsInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Integer.valueOf(327), JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsInteger());
        } else {
            assertEquals(Integer.valueOf(285), JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsInteger());
        }
    }

    /**
     * Test getCountAsLong() method.
     */
    @Test
    public void subTestGetCountAsLong() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Long.valueOf(327), JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLong());
        } else {
            assertEquals(Long.valueOf(285), JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLong());
        }
    }

    /**
     * Test getCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLocalDateTime());
    }

    /**
     * Test getCountAsLocalTime() method.
     */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLocalTime());
    }

    /**
     * Test getCountAsString() method.
     */
    @Test
    public void subTestGetCountAsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("327", JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsString());
        } else {
            assertEquals("285", JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsString());
        }
    }

    /**
     * Test getCountAsBoolean() method.
     */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsBoolean());
    }

    /**
     * Test getCountAsBigInteger() method.
     */
    @Test
    public void subTestGetCountAsBigInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(BigInteger.valueOf(327), JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsBigInteger());
        } else {
            assertEquals(BigInteger.valueOf(285), JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsBigInteger());
        }
    }

    /**
     * Test getCountAsURL() method.
     */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsURL());
    }

    /**
     * Test getCountryAsInteger() method.
     */
    @Test
    public void subTestGetCountryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsInteger());
    }

    /**
     * Test getCountryAsLong() method.
     */
    @Test
    public void subTestGetCountryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsLong());
    }

    /**
     * Test getCountryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsLocalDateTime());
    }

    /**
     * Test getCountryAsLocalTime() method.
     */
    @Test
    public void subTestGetCountryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsLocalTime());
    }

    /**
     * Test getCountryAsString() method.
     */
    @Test
    public void subTestGetCountryAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsString());
    }

    /**
     * Test getCountryAsBoolean() method.
     */
    @Test
    public void subTestGetCountryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsBoolean());
    }

    /**
     * Test getCountryAsBigInteger() method.
     */
    @Test
    public void subTestGetCountryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsBigInteger());
    }

    /**
     * Test getCountryAsURL() method.
     */
    @Test
    public void subTestGetCountryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsURL());
    }

    /**
     * Test getCoverAsInteger() method.
     */
    @Test
    public void subTestGetCoverAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsInteger());
    }

    /**
     * Test getCoverAsLong() method.
     */
    @Test
    public void subTestGetCoverAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsLong());
    }

    /**
     * Test getCoverAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsLocalDateTime());
    }

    /**
     * Test getCoverAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsLocalTime());
    }

    /**
     * Test getCoverAsString() method.
     */
    @Test
    public void subTestGetCoverAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsString());
    }

    /**
     * Test getCoverAsBoolean() method.
     */
    @Test
    public void subTestGetCoverAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsBoolean());
    }

    /**
     * Test getCoverAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsBigInteger());
    }

    /**
     * Test getCoverAsURL() method.
     */
    @Test
    public void subTestGetCoverAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsURL());
    }

    /**
     * Test getCoverDataAsInteger() method.
     */
    @Test
    public void subTestGetCoverDataAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsInteger());
    }

    /**
     * Test getCoverDataAsLong() method.
     */
    @Test
    public void subTestGetCoverDataAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsLong());
    }

    /**
     * Test getCoverDataAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverDataAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsLocalDateTime());
    }

    /**
     * Test getCoverDataAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverDataAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsLocalTime());
    }

    /**
     * Test getCoverDataAsString() method.
     */
    @Test
    public void subTestGetCoverDataAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsString());
    }

    /**
     * Test getCoverDataAsBoolean() method.
     */
    @Test
    public void subTestGetCoverDataAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsBoolean());
    }

    /**
     * Test getCoverDataAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverDataAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsBigInteger());
    }

    /**
     * Test getCoverDataAsURL() method.
     */
    @Test
    public void subTestGetCoverDataAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsURL());
    }

    /**
     * Test getCoverDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsInteger());
    }

    /**
     * Test getCoverDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsLong());
    }

    /**
     * Test getCoverDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsLocalDateTime());
    }

    /**
     * Test getCoverDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsLocalTime());
    }

    /**
     * Test getCoverDescriptionAsString() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsString());
    }

    /**
     * Test getCoverDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsBoolean());
    }

    /**
     * Test getCoverDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsBigInteger());
    }

    /**
     * Test getCoverDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsURL());
    }

    /**
     * Test getCoverMimeAsInteger() method.
     */
    @Test
    public void subTestGetCoverMimeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsInteger());
    }

    /**
     * Test getCoverMimeAsLong() method.
     */
    @Test
    public void subTestGetCoverMimeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsLong());
    }

    /**
     * Test getCoverMimeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverMimeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsLocalDateTime());
    }

    /**
     * Test getCoverMimeAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverMimeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsLocalTime());
    }

    /**
     * Test getCoverMimeAsString() method.
     */
    @Test
    public void subTestGetCoverMimeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsString());
    }

    /**
     * Test getCoverMimeAsBoolean() method.
     */
    @Test
    public void subTestGetCoverMimeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsBoolean());
    }

    /**
     * Test getCoverMimeAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverMimeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsBigInteger());
    }

    /**
     * Test getCoverMimeAsURL() method.
     */
    @Test
    public void subTestGetCoverMimeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsURL());
    }

    /**
     * Test getCoverTypeAsInteger() method.
     */
    @Test
    public void subTestGetCoverTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsInteger());
    }

    /**
     * Test getCoverTypeAsLong() method.
     */
    @Test
    public void subTestGetCoverTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsLong());
    }

    /**
     * Test getCoverTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsLocalDateTime());
    }

    /**
     * Test getCoverTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsLocalTime());
    }

    /**
     * Test getCoverTypeAsString() method.
     */
    @Test
    public void subTestGetCoverTypeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsString());
    }

    /**
     * Test getCoverTypeAsBoolean() method.
     */
    @Test
    public void subTestGetCoverTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsBoolean());
    }

    /**
     * Test getCoverTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsBigInteger());
    }

    /**
     * Test getCoverTypeAsURL() method.
     */
    @Test
    public void subTestGetCoverTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsURL());
    }

    /**
     * Test getCroppedAsInteger() method.
     */
    @Test
    public void subTestGetCroppedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsInteger());
    }

    /**
     * Test getCroppedAsLong() method.
     */
    @Test
    public void subTestGetCroppedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsLong());
    }

    /**
     * Test getCroppedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCroppedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsLocalDateTime());
    }

    /**
     * Test getCroppedAsLocalTime() method.
     */
    @Test
    public void subTestGetCroppedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsLocalTime());
    }

    /**
     * Test getCroppedAsString() method.
     */
    @Test
    public void subTestGetCroppedAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsString());
    }

    /**
     * Test getCroppedAsBoolean() method.
     */
    @Test
    public void subTestGetCroppedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsBoolean());
    }

    /**
     * Test getCroppedAsBigInteger() method.
     */
    @Test
    public void subTestGetCroppedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsBigInteger());
    }

    /**
     * Test getCroppedAsURL() method.
     */
    @Test
    public void subTestGetCroppedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsURL());
    }

    /**
     * Test getDataSizeAsInteger() method.
     */
    @Test
    public void subTestGetDataSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsInteger());
    }

    /**
     * Test getDataSizeAsLong() method.
     */
    @Test
    public void subTestGetDataSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsLong());
    }

    /**
     * Test getDataSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDataSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsLocalDateTime());
    }

    /**
     * Test getDataSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetDataSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsLocalTime());
    }

    /**
     * Test getDataSizeAsString() method.
     */
    @Test
    public void subTestGetDataSizeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsString());
    }

    /**
     * Test getDataSizeAsBoolean() method.
     */
    @Test
    public void subTestGetDataSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsBoolean());
    }

    /**
     * Test getDataSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetDataSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsBigInteger());
    }

    /**
     * Test getDataSizeAsURL() method.
     */
    @Test
    public void subTestGetDataSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsURL());
    }

    /**
     * Test getDelayAsInteger() method.
     */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsInteger());
    }

    /**
     * Test getDelayAsLong() method.
     */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsLong());
    }

    /**
     * Test getDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsLocalDateTime());
    }

    /**
     * Test getDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsLocalTime());
    }

    /**
     * Test getDelayAsString() method.
     */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsString());
    }

    /**
     * Test getDelayAsBoolean() method.
     */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsBoolean());
    }

    /**
     * Test getDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsBigInteger());
    }

    /**
     * Test getDelayAsURL() method.
     */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsURL());
    }

    /**
     * Test getDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsInteger());
    }

    /**
     * Test getDelayStringAsLong() method.
     */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsLong());
    }

    /**
     * Test getDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsLocalDateTime());
    }

    /**
     * Test getDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsLocalTime());
    }

    /**
     * Test getDelayStringAsString() method.
     */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsString());
    }

    /**
     * Test getDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsBoolean());
    }

    /**
     * Test getDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsBigInteger());
    }

    /**
     * Test getDelayStringAsURL() method.
     */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsURL());
    }

    /**
     * Test getDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsInteger());
    }

    /**
     * Test getDelayString1AsLong() method.
     */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsLong());
    }

    /**
     * Test getDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsLocalDateTime());
    }

    /**
     * Test getDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsLocalTime());
    }

    /**
     * Test getDelayString1AsString() method.
     */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsString());
    }

    /**
     * Test getDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsBoolean());
    }

    /**
     * Test getDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsBigInteger());
    }

    /**
     * Test getDelayString1AsURL() method.
     */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsURL());
    }

    /**
     * Test getDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsInteger());
    }

    /**
     * Test getDelayString2AsLong() method.
     */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsLong());
    }

    /**
     * Test getDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsLocalDateTime());
    }

    /**
     * Test getDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsLocalTime());
    }

    /**
     * Test getDelayString2AsString() method.
     */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsString());
    }

    /**
     * Test getDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsBoolean());
    }

    /**
     * Test getDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsBigInteger());
    }

    /**
     * Test getDelayString2AsURL() method.
     */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsURL());
    }

    /**
     * Test getDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsInteger());
    }

    /**
     * Test getDelayString3AsLong() method.
     */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsLong());
    }

    /**
     * Test getDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsLocalDateTime());
    }

    /**
     * Test getDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsLocalTime());
    }

    /**
     * Test getDelayString3AsString() method.
     */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsString());
    }

    /**
     * Test getDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsBoolean());
    }

    /**
     * Test getDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsBigInteger());
    }

    /**
     * Test getDelayString3AsURL() method.
     */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsURL());
    }

    /**
     * Test getDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsInteger());
    }

    /**
     * Test getDelayString4AsLong() method.
     */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsLong());
    }

    /**
     * Test getDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsLocalDateTime());
    }

    /**
     * Test getDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsLocalTime());
    }

    /**
     * Test getDelayString4AsString() method.
     */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsString());
    }

    /**
     * Test getDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsBoolean());
    }

    /**
     * Test getDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsBigInteger());
    }

    /**
     * Test getDelayString4AsURL() method.
     */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsURL());
    }

    /**
     * Test getDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsInteger());
    }

    /**
     * Test getDelayString5AsLong() method.
     */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsLong());
    }

    /**
     * Test getDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsLocalDateTime());
    }

    /**
     * Test getDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsLocalTime());
    }

    /**
     * Test getDelayString5AsString() method.
     */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsString());
    }

    /**
     * Test getDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsBoolean());
    }

    /**
     * Test getDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsBigInteger());
    }

    /**
     * Test getDelayString5AsURL() method.
     */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsURL());
    }

    /**
     * Test getDelayDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsInteger());
    }

    /**
     * Test getDelayDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsLong());
    }

    /**
     * Test getDelayDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsLocalTime());
    }

    /**
     * Test getDelayDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsString());
    }

    /**
     * Test getDelayDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsBoolean());
    }

    /**
     * Test getDelayDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsBigInteger());
    }

    /**
     * Test getDelayDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsURL());
    }

    /**
     * Test getDelaySettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsInteger());
    }

    /**
     * Test getDelaySettingsAsLong() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsLong());
    }

    /**
     * Test getDelaySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsLocalDateTime());
    }

    /**
     * Test getDelaySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsLocalTime());
    }

    /**
     * Test getDelaySettingsAsString() method.
     */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsString());
    }

    /**
     * Test getDelaySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsBoolean());
    }

    /**
     * Test getDelaySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsBigInteger());
    }

    /**
     * Test getDelaySettingsAsURL() method.
     */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsURL());
    }

    /**
     * Test getDelaySourceAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsInteger());
    }

    /**
     * Test getDelaySourceAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsLong());
    }

    /**
     * Test getDelaySourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsLocalDateTime());
    }

    /**
     * Test getDelaySourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsLocalTime());
    }

    /**
     * Test getDelaySourceAsString() method.
     */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsString());
    }

    /**
     * Test getDelaySourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsBoolean());
    }

    /**
     * Test getDelaySourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsBigInteger());
    }

    /**
     * Test getDelaySourceAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsURL());
    }

    /**
     * Test getDelaySourceStringAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsInteger());
    }

    /**
     * Test getDelaySourceStringAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsLong());
    }

    /**
     * Test getDelaySourceStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsLocalDateTime());
    }

    /**
     * Test getDelaySourceStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsLocalTime());
    }

    /**
     * Test getDelaySourceStringAsString() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsString());
    }

    /**
     * Test getDelaySourceStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsBoolean());
    }

    /**
     * Test getDelaySourceStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsBigInteger());
    }

    /**
     * Test getDelaySourceStringAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsURL());
    }

    /**
     * Test getDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetDescriptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsInteger());
    }

    /**
     * Test getDescriptionAsLong() method.
     */
    @Test
    public void subTestGetDescriptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsLong());
    }

    /**
     * Test getDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsLocalDateTime());
    }

    /**
     * Test getDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsLocalTime());
    }

    /**
     * Test getDescriptionAsString() method.
     */
    @Test
    public void subTestGetDescriptionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsString());
    }

    /**
     * Test getDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetDescriptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsBoolean());
    }

    /**
     * Test getDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsBigInteger());
    }

    /**
     * Test getDescriptionAsURL() method.
     */
    @Test
    public void subTestGetDescriptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsURL());
    }

    /**
     * Test getDimensionsAsInteger() method.
     */
    @Test
    public void subTestGetDimensionsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsInteger());
    }

    /**
     * Test getDimensionsAsLong() method.
     */
    @Test
    public void subTestGetDimensionsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsLong());
    }

    /**
     * Test getDimensionsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDimensionsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsLocalDateTime());
    }

    /**
     * Test getDimensionsAsLocalTime() method.
     */
    @Test
    public void subTestGetDimensionsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsLocalTime());
    }

    /**
     * Test getDimensionsAsString() method.
     */
    @Test
    public void subTestGetDimensionsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsString());
    }

    /**
     * Test getDimensionsAsBoolean() method.
     */
    @Test
    public void subTestGetDimensionsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsBoolean());
    }

    /**
     * Test getDimensionsAsBigInteger() method.
     */
    @Test
    public void subTestGetDimensionsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsBigInteger());
    }

    /**
     * Test getDimensionsAsURL() method.
     */
    @Test
    public void subTestGetDimensionsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsURL());
    }

    /**
     * Test getDirectorAsInteger() method.
     */
    @Test
    public void subTestGetDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsInteger());
    }

    /**
     * Test getDirectorAsLong() method.
     */
    @Test
    public void subTestGetDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsLong());
    }

    /**
     * Test getDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsLocalDateTime());
    }

    /**
     * Test getDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsLocalTime());
    }

    /**
     * Test getDirectorAsString() method.
     */
    @Test
    public void subTestGetDirectorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsString());
    }

    /**
     * Test getDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsBoolean());
    }

    /**
     * Test getDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsBigInteger());
    }

    /**
     * Test getDirectorAsURL() method.
     */
    @Test
    public void subTestGetDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsURL());
    }

    /**
     * Test getDirectorOfPhotographyAsInteger() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsInteger());
    }

    /**
     * Test getDirectorOfPhotographyAsLong() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsLong());
    }

    /**
     * Test getDirectorOfPhotographyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsLocalDateTime());
    }

    /**
     * Test getDirectorOfPhotographyAsLocalTime() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsLocalTime());
    }

    /**
     * Test getDirectorOfPhotographyAsString() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsString());
    }

    /**
     * Test getDirectorOfPhotographyAsBoolean() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsBoolean());
    }

    /**
     * Test getDirectorOfPhotographyAsBigInteger() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsBigInteger());
    }

    /**
     * Test getDirectorOfPhotographyAsURL() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsURL());
    }

    /**
     * Test getDistributedByAsInteger() method.
     */
    @Test
    public void subTestGetDistributedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsInteger());
    }

    /**
     * Test getDistributedByAsLong() method.
     */
    @Test
    public void subTestGetDistributedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsLong());
    }

    /**
     * Test getDistributedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDistributedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsLocalDateTime());
    }

    /**
     * Test getDistributedByAsLocalTime() method.
     */
    @Test
    public void subTestGetDistributedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsLocalTime());
    }

    /**
     * Test getDistributedByAsString() method.
     */
    @Test
    public void subTestGetDistributedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsString());
    }

    /**
     * Test getDistributedByAsBoolean() method.
     */
    @Test
    public void subTestGetDistributedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsBoolean());
    }

    /**
     * Test getDistributedByAsBigInteger() method.
     */
    @Test
    public void subTestGetDistributedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsBigInteger());
    }

    /**
     * Test getDistributedByAsURL() method.
     */
    @Test
    public void subTestGetDistributedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsURL());
    }

    /**
     * Test getDomainAsInteger() method.
     */
    @Test
    public void subTestGetDomainAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsInteger());
    }

    /**
     * Test getDomainAsLong() method.
     */
    @Test
    public void subTestGetDomainAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsLong());
    }

    /**
     * Test getDomainAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDomainAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsLocalDateTime());
    }

    /**
     * Test getDomainAsLocalTime() method.
     */
    @Test
    public void subTestGetDomainAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsLocalTime());
    }

    /**
     * Test getDomainAsString() method.
     */
    @Test
    public void subTestGetDomainAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsString());
    }

    /**
     * Test getDomainAsBoolean() method.
     */
    @Test
    public void subTestGetDomainAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsBoolean());
    }

    /**
     * Test getDomainAsBigInteger() method.
     */
    @Test
    public void subTestGetDomainAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsBigInteger());
    }

    /**
     * Test getDomainAsURL() method.
     */
    @Test
    public void subTestGetDomainAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsURL());
    }

    /**
     * Test getDotsPerInchAsInteger() method.
     */
    @Test
    public void subTestGetDotsPerInchAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsInteger());
    }

    /**
     * Test getDotsPerInchAsLong() method.
     */
    @Test
    public void subTestGetDotsPerInchAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsLong());
    }

    /**
     * Test getDotsPerInchAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDotsPerInchAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsLocalDateTime());
    }

    /**
     * Test getDotsPerInchAsLocalTime() method.
     */
    @Test
    public void subTestGetDotsPerInchAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsLocalTime());
    }

    /**
     * Test getDotsPerInchAsString() method.
     */
    @Test
    public void subTestGetDotsPerInchAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsString());
    }

    /**
     * Test getDotsPerInchAsBoolean() method.
     */
    @Test
    public void subTestGetDotsPerInchAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsBoolean());
    }

    /**
     * Test getDotsPerInchAsBigInteger() method.
     */
    @Test
    public void subTestGetDotsPerInchAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsBigInteger());
    }

    /**
     * Test getDotsPerInchAsURL() method.
     */
    @Test
    public void subTestGetDotsPerInchAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsURL());
    }

    /**
     * Test getDurationAsInteger() method.
     */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(Integer.valueOf(898167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsInteger());
    }

    /**
     * Test getDurationAsLong() method.
     */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(Long.valueOf(898167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsLong());
    }

    /**
     * Test getDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsLocalDateTime());
    }

    /**
     * Test getDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsLocalTime());
    }

    /**
     * Test getDurationAsString() method.
     */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals("898167", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsString());
    }

    /**
     * Test getDurationAsBoolean() method.
     */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsBoolean());
    }

    /**
     * Test getDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(BigInteger.valueOf(898167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsBigInteger());
    }

    /**
     * Test getDurationAsURL() method.
     */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsURL());
    }

    /**
     * Test getDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(Integer.valueOf(1458), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsInteger());
    }

    /**
     * Test getDurationStringAsLong() method.
     */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(Long.valueOf(1458), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsLong());
    }

    /**
     * Test getDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsLocalDateTime());
    }

    /**
     * Test getDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsLocalTime());
    }

    /**
     * Test getDurationStringAsString() method.
     */
    @Test
    public void subTestGetDurationStringAsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("14 min 58 s", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsString());
        } else {
            assertEquals("14mn 58s", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsString());
        }
    }

    /**
     * Test getDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsBoolean());
    }

    /**
     * Test getDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(1458), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsBigInteger());
    }

    /**
     * Test getDurationStringAsURL() method.
     */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsURL());
    }

    /**
     * Test getDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(Integer.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsInteger());
    }

    /**
     * Test getDurationString1AsLong() method.
     */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(Long.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsLong());
    }

    /**
     * Test getDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsLocalDateTime());
    }

    /**
     * Test getDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsLocalTime());
    }

    /**
     * Test getDurationString1AsString() method.
     */
    @Test
    public void subTestGetDurationString1AsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("14 min 58 s 167 ms", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsString());
        } else {
            assertEquals("14mn 58s 167ms", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsString());
        }
    }

    /**
     * Test getDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsBoolean());
    }

    /**
     * Test getDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsBigInteger());
    }

    /**
     * Test getDurationString1AsURL() method.
     */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsURL());
    }

    /**
     * Test getDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(Integer.valueOf(1458), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsInteger());
    }

    /**
     * Test getDurationString2AsLong() method.
     */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(Long.valueOf(1458), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsLong());
    }

    /**
     * Test getDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsLocalDateTime());
    }

    /**
     * Test getDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsLocalTime());
    }

    /**
     * Test getDurationString2AsString() method.
     */
    @Test
    public void subTestGetDurationString2AsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("14 min 58 s", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsString());
        } else {
            assertEquals("14mn 58s", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsString());
        }
    }

    /**
     * Test getDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsBoolean());
    }

    /**
     * Test getDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsBigInteger());
    }

    /**
     * Test getDurationString2AsURL() method.
     */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsURL());
    }

    /**
     * Test getDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(Integer.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsInteger());
    }

    /**
     * Test getDurationString3AsLong() method.
     */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(Long.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsLong());
    }

    /**
     * Test getDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsLocalDateTime());
    }

    /**
     * Test getDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(LocalTime.of(0, 14, 58, 167000000), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsLocalTime());
    }

    /**
     * Test getDurationString3AsString() method.
     */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals("00:14:58.167", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsString());
    }

    /**
     * Test getDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsBoolean());
    }

    /**
     * Test getDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsBigInteger());
    }

    /**
     * Test getDurationString3AsURL() method.
     */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsURL());
    }

    /**
     * Test getDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsInteger());
    }

    /**
     * Test getDurationString4AsLong() method.
     */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsLong());
    }

    /**
     * Test getDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsLocalDateTime());
    }

    /**
     * Test getDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsLocalTime());
    }

    /**
     * Test getDurationString4AsString() method.
     */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsString());
    }

    /**
     * Test getDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsBoolean());
    }

    /**
     * Test getDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsBigInteger());
    }

    /**
     * Test getDurationString4AsURL() method.
     */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsURL());
    }

    /**
     * Test getDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Integer.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsInteger());
        }
    }

    /**
     * Test getDurationString5AsLong() method.
     */
    @Test
    public void subTestGetDurationString5AsLong() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Long.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLong());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLong());
        }
    }

    /**
     * Test getDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLocalDateTime());
    }

    /**
     * Test getDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(LocalTime.of(0, 14, 58, 167000000), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLocalTime());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLocalTime());
        }
    }

    /**
     * Test getDurationString5AsString() method.
     */
    @Test
    public void subTestGetDurationString5AsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("00:14:58.167", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsString());
        } else {
            assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsString());
        }
    }

    /**
     * Test getDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsBoolean());
    }

    /**
     * Test getDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(BigInteger.valueOf(1458167), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsBigInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsBigInteger());
        }
    }

    /**
     * Test getDurationString5AsURL() method.
     */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsURL());
    }

    /**
     * Test getDurationEndAsInteger() method.
     */
    @Test
    public void subTestGetDurationEndAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsInteger());
    }

    /**
     * Test getDurationEndAsLong() method.
     */
    @Test
    public void subTestGetDurationEndAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsLong());
    }

    /**
     * Test getDurationEndAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationEndAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsLocalDateTime());
    }

    /**
     * Test getDurationEndAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationEndAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsLocalTime());
    }

    /**
     * Test getDurationEndAsString() method.
     */
    @Test
    public void subTestGetDurationEndAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsString());
    }

    /**
     * Test getDurationEndAsBoolean() method.
     */
    @Test
    public void subTestGetDurationEndAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsBoolean());
    }

    /**
     * Test getDurationEndAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationEndAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsBigInteger());
    }

    /**
     * Test getDurationEndAsURL() method.
     */
    @Test
    public void subTestGetDurationEndAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsURL());
    }

    /**
     * Test getDurationStartAsInteger() method.
     */
    @Test
    public void subTestGetDurationStartAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsInteger());
    }

    /**
     * Test getDurationStartAsLong() method.
     */
    @Test
    public void subTestGetDurationStartAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsLong());
    }

    /**
     * Test getDurationStartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStartAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsLocalDateTime());
    }

    /**
     * Test getDurationStartAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStartAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsLocalTime());
    }

    /**
     * Test getDurationStartAsString() method.
     */
    @Test
    public void subTestGetDurationStartAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsString());
    }

    /**
     * Test getDurationStartAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStartAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsBoolean());
    }

    /**
     * Test getDurationStartAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStartAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsBigInteger());
    }

    /**
     * Test getDurationStartAsURL() method.
     */
    @Test
    public void subTestGetDurationStartAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsURL());
    }

    /**
     * Test getEditedByAsInteger() method.
     */
    @Test
    public void subTestGetEditedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsInteger());
    }

    /**
     * Test getEditedByAsLong() method.
     */
    @Test
    public void subTestGetEditedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsLong());
    }

    /**
     * Test getEditedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEditedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsLocalDateTime());
    }

    /**
     * Test getEditedByAsLocalTime() method.
     */
    @Test
    public void subTestGetEditedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsLocalTime());
    }

    /**
     * Test getEditedByAsString() method.
     */
    @Test
    public void subTestGetEditedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsString());
    }

    /**
     * Test getEditedByAsBoolean() method.
     */
    @Test
    public void subTestGetEditedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsBoolean());
    }

    /**
     * Test getEditedByAsBigInteger() method.
     */
    @Test
    public void subTestGetEditedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsBigInteger());
    }

    /**
     * Test getEditedByAsURL() method.
     */
    @Test
    public void subTestGetEditedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsURL());
    }

    /**
     * Test getEncodedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(Integer.valueOf(1430014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsInteger());
    }

    /**
     * Test getEncodedApplicationAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(Long.valueOf(1430014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsLong());
    }

    /**
     * Test getEncodedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsLocalTime());
    }

    /**
     * Test getEncodedApplicationAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("DivXMKVMux Version 1.4.3.0014", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsString());
        } else {
            assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsString());
        }
    }

    /**
     * Test getEncodedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsBoolean());
    }

    /**
     * Test getEncodedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(BigInteger.valueOf(1430014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsBigInteger());
    }

    /**
     * Test getEncodedApplicationAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsURL());
    }

    /**
     * Test getEncodedApplicationStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Integer.valueOf(1430014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsInteger());
        }
    }

    /**
     * Test getEncodedApplicationStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Long.valueOf(1430014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLong());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLong());
        }
    }

    /**
     * Test getEncodedApplicationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLocalTime());
    }

    /**
     * Test getEncodedApplicationStringAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals("DivXMKVMux Version 1.4.3.0014", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsString());
    }

    /**
     * Test getEncodedApplicationStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsBoolean());
    }

    /**
     * Test getEncodedApplicationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(BigInteger.valueOf(1430014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsBigInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsBigInteger());
        }
    }

    /**
     * Test getEncodedApplicationStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsURL());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLong());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsString());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsURL());
    }

    /**
     * Test getEncodedApplicationNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsInteger());
    }

    /**
     * Test getEncodedApplicationNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsLong());
    }

    /**
     * Test getEncodedApplicationNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsString());
    }

    /**
     * Test getEncodedApplicationNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsURL());
    }

    /**
     * Test getEncodedApplicationUrlAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsLong());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsLocalTime());
    }

    /**
     * Test getEncodedApplicationUrlAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsString());
    }

    /**
     * Test getEncodedApplicationUrlAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsBoolean());
    }

    /**
     * Test getEncodedApplicationUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsBigInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsURL());
    }

    /**
     * Test getEncodedApplicationVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsLong());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsLocalTime());
    }

    /**
     * Test getEncodedApplicationVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsString());
    }

    /**
     * Test getEncodedApplicationVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsBoolean());
    }

    /**
     * Test getEncodedApplicationVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsBigInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsURL());
    }

    /**
     * Test getEncodedDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsInteger());
    }

    /**
     * Test getEncodedDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsLong());
    }

    /**
     * Test getEncodedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsLocalDateTime());
    }

    /**
     * Test getEncodedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsLocalTime());
    }

    /**
     * Test getEncodedDateAsString() method.
     */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsString());
    }

    /**
     * Test getEncodedDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsBoolean());
    }

    /**
     * Test getEncodedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsBigInteger());
    }

    /**
     * Test getEncodedDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsURL());
    }

    /**
     * Test getEncodedLibraryAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(Integer.valueOf(3530014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsInteger());
    }

    /**
     * Test getEncodedLibraryAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(Long.valueOf(3530014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsLong());
    }

    /**
     * Test getEncodedLibraryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsLocalTime());
    }

    /**
     * Test getEncodedLibraryAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals("libDivXMediaFormat 3.5.3.0014", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsString());
    }

    /**
     * Test getEncodedLibraryAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsBoolean());
    }

    /**
     * Test getEncodedLibraryAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(BigInteger.valueOf(3530014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsBigInteger());
    }

    /**
     * Test getEncodedLibraryAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsURL());
    }

    /**
     * Test getEncodedLibraryStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(Integer.valueOf(3530014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsInteger());
    }

    /**
     * Test getEncodedLibraryStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(Long.valueOf(3530014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsLong());
    }

    /**
     * Test getEncodedLibraryStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsLocalTime());
    }

    /**
     * Test getEncodedLibraryStringAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals("libDivXMediaFormat 3.5.3.0014", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsString());
    }

    /**
     * Test getEncodedLibraryStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsBoolean());
    }

    /**
     * Test getEncodedLibraryStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(3530014), JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsBigInteger());
    }

    /**
     * Test getEncodedLibraryStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsURL());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLong());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsString());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsURL());
    }

    /**
     * Test getEncodedLibraryDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsInteger());
    }

    /**
     * Test getEncodedLibraryDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsLong());
    }

    /**
     * Test getEncodedLibraryDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsLocalTime());
    }

    /**
     * Test getEncodedLibraryDateAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsString());
    }

    /**
     * Test getEncodedLibraryDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsBoolean());
    }

    /**
     * Test getEncodedLibraryDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsBigInteger());
    }

    /**
     * Test getEncodedLibraryDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsURL());
    }

    /**
     * Test getEncodedLibraryNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsInteger());
    }

    /**
     * Test getEncodedLibraryNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsLong());
    }

    /**
     * Test getEncodedLibraryNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsString());
    }

    /**
     * Test getEncodedLibraryNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsURL());
    }

    /**
     * Test getEncodedLibrarySettingsAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsLong());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsLocalDateTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsLocalTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsString() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsString());
    }

    /**
     * Test getEncodedLibrarySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsBoolean());
    }

    /**
     * Test getEncodedLibrarySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsBigInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsURL());
    }

    /**
     * Test getEncodedLibraryVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsLong());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsLocalTime());
    }

    /**
     * Test getEncodedLibraryVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsString());
    }

    /**
     * Test getEncodedLibraryVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsBoolean());
    }

    /**
     * Test getEncodedLibraryVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsBigInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsURL());
    }

    /**
     * Test getEncodedOperatingSystemAsInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsLong() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsLong());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsLocalDateTime());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsLocalTime());
    }

    /**
     * Test getEncodedOperatingSystemAsString() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsString());
    }

    /**
     * Test getEncodedOperatingSystemAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsBoolean());
    }

    /**
     * Test getEncodedOperatingSystemAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsBigInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsURL() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsURL());
    }

    /**
     * Test getEncodedByAsInteger() method.
     */
    @Test
    public void subTestGetEncodedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsInteger());
    }

    /**
     * Test getEncodedByAsLong() method.
     */
    @Test
    public void subTestGetEncodedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsLong());
    }

    /**
     * Test getEncodedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsLocalDateTime());
    }

    /**
     * Test getEncodedByAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsLocalTime());
    }

    /**
     * Test getEncodedByAsString() method.
     */
    @Test
    public void subTestGetEncodedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsString());
    }

    /**
     * Test getEncodedByAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsBoolean());
    }

    /**
     * Test getEncodedByAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsBigInteger());
    }

    /**
     * Test getEncodedByAsURL() method.
     */
    @Test
    public void subTestGetEncodedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsURL());
    }

    /**
     * Test getEncryptionAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsInteger());
    }

    /**
     * Test getEncryptionAsLong() method.
     */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsLong());
    }

    /**
     * Test getEncryptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsLocalDateTime());
    }

    /**
     * Test getEncryptionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsLocalTime());
    }

    /**
     * Test getEncryptionAsString() method.
     */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsString());
    }

    /**
     * Test getEncryptionAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsBoolean());
    }

    /**
     * Test getEncryptionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsBigInteger());
    }

    /**
     * Test getEncryptionAsURL() method.
     */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsURL());
    }

    /**
     * Test getEncryptionFormatAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsInteger());
    }

    /**
     * Test getEncryptionFormatAsLong() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsLong());
    }

    /**
     * Test getEncryptionFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsLocalDateTime());
    }

    /**
     * Test getEncryptionFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsLocalTime());
    }

    /**
     * Test getEncryptionFormatAsString() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsString());
    }

    /**
     * Test getEncryptionFormatAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsBoolean());
    }

    /**
     * Test getEncryptionFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsBigInteger());
    }

    /**
     * Test getEncryptionFormatAsURL() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsURL());
    }

    /**
     * Test getEncryptionInitializationVectorAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsInteger());
    }

    /**
     * Test getEncryptionInitializationVectorAsLong() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsLong());
    }

    /**
     * Test getEncryptionInitializationVectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsLocalDateTime());
    }

    /**
     * Test getEncryptionInitializationVectorAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsLocalTime());
    }

    /**
     * Test getEncryptionInitializationVectorAsString() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsString());
    }

    /**
     * Test getEncryptionInitializationVectorAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsBoolean());
    }

    /**
     * Test getEncryptionInitializationVectorAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsBigInteger());
    }

    /**
     * Test getEncryptionInitializationVectorAsURL() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsURL());
    }

    /**
     * Test getEncryptionLengthAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsInteger());
    }

    /**
     * Test getEncryptionLengthAsLong() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsLong());
    }

    /**
     * Test getEncryptionLengthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsLocalDateTime());
    }

    /**
     * Test getEncryptionLengthAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsLocalTime());
    }

    /**
     * Test getEncryptionLengthAsString() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsString());
    }

    /**
     * Test getEncryptionLengthAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsBoolean());
    }

    /**
     * Test getEncryptionLengthAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsBigInteger());
    }

    /**
     * Test getEncryptionLengthAsURL() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsURL());
    }

    /**
     * Test getEncryptionMethodAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsInteger());
    }

    /**
     * Test getEncryptionMethodAsLong() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsLong());
    }

    /**
     * Test getEncryptionMethodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsLocalDateTime());
    }

    /**
     * Test getEncryptionMethodAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsLocalTime());
    }

    /**
     * Test getEncryptionMethodAsString() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsString());
    }

    /**
     * Test getEncryptionMethodAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsBoolean());
    }

    /**
     * Test getEncryptionMethodAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsBigInteger());
    }

    /**
     * Test getEncryptionMethodAsURL() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsURL());
    }

    /**
     * Test getEncryptionModeAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionModeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsInteger());
    }

    /**
     * Test getEncryptionModeAsLong() method.
     */
    @Test
    public void subTestGetEncryptionModeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsLong());
    }

    /**
     * Test getEncryptionModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionModeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsLocalDateTime());
    }

    /**
     * Test getEncryptionModeAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionModeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsLocalTime());
    }

    /**
     * Test getEncryptionModeAsString() method.
     */
    @Test
    public void subTestGetEncryptionModeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsString());
    }

    /**
     * Test getEncryptionModeAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionModeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsBoolean());
    }

    /**
     * Test getEncryptionModeAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionModeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsBigInteger());
    }

    /**
     * Test getEncryptionModeAsURL() method.
     */
    @Test
    public void subTestGetEncryptionModeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsURL());
    }

    /**
     * Test getEncryptionPaddingAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsInteger());
    }

    /**
     * Test getEncryptionPaddingAsLong() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsLong());
    }

    /**
     * Test getEncryptionPaddingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsLocalDateTime());
    }

    /**
     * Test getEncryptionPaddingAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsLocalTime());
    }

    /**
     * Test getEncryptionPaddingAsString() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsString());
    }

    /**
     * Test getEncryptionPaddingAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsBoolean());
    }

    /**
     * Test getEncryptionPaddingAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsBigInteger());
    }

    /**
     * Test getEncryptionPaddingAsURL() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsURL());
    }

    /**
     * Test getEPGPositionsBeginAsInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsInteger());
    }

    /**
     * Test getEPGPositionsBeginAsLong() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsLong());
    }

    /**
     * Test getEPGPositionsBeginAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsLocalDateTime());
    }

    /**
     * Test getEPGPositionsBeginAsLocalTime() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsLocalTime());
    }

    /**
     * Test getEPGPositionsBeginAsString() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsString());
    }

    /**
     * Test getEPGPositionsBeginAsBoolean() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsBoolean());
    }

    /**
     * Test getEPGPositionsBeginAsBigInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsBigInteger());
    }

    /**
     * Test getEPGPositionsBeginAsURL() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsURL());
    }

    /**
     * Test getEPGPositionsEndAsInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsInteger());
    }

    /**
     * Test getEPGPositionsEndAsLong() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsLong());
    }

    /**
     * Test getEPGPositionsEndAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsLocalDateTime());
    }

    /**
     * Test getEPGPositionsEndAsLocalTime() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsLocalTime());
    }

    /**
     * Test getEPGPositionsEndAsString() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsString());
    }

    /**
     * Test getEPGPositionsEndAsBoolean() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsBoolean());
    }

    /**
     * Test getEPGPositionsEndAsBigInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsBigInteger());
    }

    /**
     * Test getEPGPositionsEndAsURL() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsURL());
    }

    /**
     * Test getExecutiveProducerAsInteger() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsInteger());
    }

    /**
     * Test getExecutiveProducerAsLong() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsLong());
    }

    /**
     * Test getExecutiveProducerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsLocalDateTime());
    }

    /**
     * Test getExecutiveProducerAsLocalTime() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsLocalTime());
    }

    /**
     * Test getExecutiveProducerAsString() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsString());
    }

    /**
     * Test getExecutiveProducerAsBoolean() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsBoolean());
    }

    /**
     * Test getExecutiveProducerAsBigInteger() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsBigInteger());
    }

    /**
     * Test getExecutiveProducerAsURL() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsURL());
    }

    /**
     * Test getFileCreatedDateAsInteger() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsInteger());
    }

    /**
     * Test getFileCreatedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsLocalTime());
    }

    /**
     * Test getFileCreatedDateAsBoolean() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsBoolean());
    }

    /**
     * Test getFileCreatedDateAsURL() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsURL());
    }

    /**
     * Test getFileCreatedDateLocalAsInteger() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsInteger());
    }

    /**
     * Test getFileCreatedDateLocalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsLocalDateTime());
    }

    /**
     * Test getFileCreatedDateLocalAsLocalTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsLocalTime());
    }

    /**
     * Test getFileCreatedDateLocalAsBoolean() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsBoolean());
    }

    /**
     * Test getFileModifiedDateAsInteger() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsInteger());
    }

    /**
     * Test getFileModifiedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsLocalDateTime() {
        try {
            final ClassLoader classLoader = JMetaDataGeneral_Test.class.getClassLoader();
            final File file2 = new File(classLoader.getResource("Sintel_DivXPlus_6500kbps.mkv").toURI());
            final Instant instant = Instant.ofEpochMilli(file2.lastModified());
            final LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of("Z"));
            final LocalDateTime fileModifiedDateAsLocalDateTime = JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsLocalDateTime();
            assertNotNull(fileModifiedDateAsLocalDateTime);
            assertEquals(result.withNano(0), fileModifiedDateAsLocalDateTime.withNano(0));
        } catch (final URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Test getFileModifiedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsLocalTime());
    }

    /**
     * Test getFileModifiedDateAsBoolean() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsBoolean());
    }

    /**
     * Test getFileModifiedDateAsURL() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsURL());
    }

    /**
     * Test getFileModifiedDateLocalAsInteger() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsInteger());
    }

    /**
     * Test getFileModifiedDateLocalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsLocalDateTime());
    }

    /**
     * Test getFileModifiedDateLocalAsLocalTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsLocalTime());
    }

    /**
     * Test getFileModifiedDateLocalAsString() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsString() {
        try {
            final ClassLoader classLoader = JMetaDataGeneral_Test.class.getClassLoader();
            final File file2 = new File(classLoader.getResource("Sintel_DivXPlus_6500kbps.mkv").toURI());
            if (SystemUtils.IS_OS_WINDOWS) {
                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                final String result = sdf.format(file2.lastModified());
                assertEquals(result, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsString());
            } else {
                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                final String result = sdf.format(file2.lastModified());
                assertEquals(result, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsString());
            }
        } catch (final URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Test getFileModifiedDateLocalAsBoolean() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsBoolean());
    }

    /**
     * Test getFileExtensionAsInteger() method.
     */
    @Test
    public void subTestGetFileExtensionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsInteger());
    }

    /**
     * Test getFileExtensionAsLong() method.
     */
    @Test
    public void subTestGetFileExtensionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsLong());
    }

    /**
     * Test getFileExtensionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileExtensionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsLocalDateTime());
    }

    /**
     * Test getFileExtensionAsLocalTime() method.
     */
    @Test
    public void subTestGetFileExtensionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsLocalTime());
    }

    /**
     * Test getFileExtensionAsString() method.
     */
    @Test
    public void subTestGetFileExtensionAsString() {
        assertEquals("mkv", JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsString());
    }

    /**
     * Test getFileExtensionAsBoolean() method.
     */
    @Test
    public void subTestGetFileExtensionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsBoolean());
    }

    /**
     * Test getFileExtensionAsBigInteger() method.
     */
    @Test
    public void subTestGetFileExtensionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsBigInteger());
    }

    /**
     * Test getFileExtensionAsURL() method.
     */
    @Test
    public void subTestGetFileExtensionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsURL());
    }

    /**
     * Test getFileExtensionLastAsInteger() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsInteger());
    }

    /**
     * Test getFileExtensionLastAsLong() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsLong());
    }

    /**
     * Test getFileExtensionLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsLocalDateTime());
    }

    /**
     * Test getFileExtensionLastAsLocalTime() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsLocalTime());
    }

    /**
     * Test getFileExtensionLastAsString() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsString());
    }

    /**
     * Test getFileExtensionLastAsBoolean() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsBoolean());
    }

    /**
     * Test getFileExtensionLastAsBigInteger() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsBigInteger());
    }

    /**
     * Test getFileExtensionLastAsURL() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsURL());
    }

    /**
     * Test getFileNameAsInteger() method.
     */
    @Test
    public void subTestGetFileNameAsInteger() {
        assertEquals(Integer.valueOf(6500), JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsInteger());
    }

    /**
     * Test getFileNameAsLong() method.
     */
    @Test
    public void subTestGetFileNameAsLong() {
        assertEquals(Long.valueOf(6500), JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsLong());
    }

    /**
     * Test getFileNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsLocalDateTime());
    }

    /**
     * Test getFileNameAsLocalTime() method.
     */
    @Test
    public void subTestGetFileNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsLocalTime());
    }

    /**
     * Test getFileNameAsString() method.
     */
    @Test
    public void subTestGetFileNameAsString() {
        assertEquals("Sintel_DivXPlus_6500kbps", JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsString());
    }

    /**
     * Test getFileNameAsBoolean() method.
     */
    @Test
    public void subTestGetFileNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsBoolean());
    }

    /**
     * Test getFileNameAsBigInteger() method.
     */
    @Test
    public void subTestGetFileNameAsBigInteger() {
        assertEquals(BigInteger.valueOf(6500), JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsBigInteger());
    }

    /**
     * Test getFileNameAsURL() method.
     */
    @Test
    public void subTestGetFileNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsURL());
    }

    /**
     * Test getFileNameLastAsInteger() method.
     */
    @Test
    public void subTestGetFileNameLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsInteger());
    }

    /**
     * Test getFileNameLastAsLong() method.
     */
    @Test
    public void subTestGetFileNameLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsLong());
    }

    /**
     * Test getFileNameLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileNameLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsLocalDateTime());
    }

    /**
     * Test getFileNameLastAsLocalTime() method.
     */
    @Test
    public void subTestGetFileNameLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsLocalTime());
    }

    /**
     * Test getFileNameLastAsString() method.
     */
    @Test
    public void subTestGetFileNameLastAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsString());
    }

    /**
     * Test getFileNameLastAsBoolean() method.
     */
    @Test
    public void subTestGetFileNameLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsBoolean());
    }

    /**
     * Test getFileNameLastAsBigInteger() method.
     */
    @Test
    public void subTestGetFileNameLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsBigInteger());
    }

    /**
     * Test getFileNameLastAsURL() method.
     */
    @Test
    public void subTestGetFileNameLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsURL());
    }

    /**
     * Test getFileSizeAsInteger() method.
     */
    @Test
    public void subTestGetFileSizeAsInteger() {
        assertEquals(Integer.valueOf(6299254), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsInteger());
    }

    /**
     * Test getFileSizeAsLong() method.
     */
    @Test
    public void subTestGetFileSizeAsLong() {
        assertEquals(Long.valueOf(6299254), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsLong());
    }

    /**
     * Test getFileSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsLocalDateTime());
    }

    /**
     * Test getFileSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsLocalTime());
    }

    /**
     * Test getFileSizeAsString() method.
     */
    @Test
    public void subTestGetFileSizeAsString() {
        assertEquals("6299254", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsString());
    }

    /**
     * Test getFileSizeAsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsBoolean());
    }

    /**
     * Test getFileSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeAsBigInteger() {
        assertEquals(BigInteger.valueOf(6299254), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsBigInteger());
    }

    /**
     * Test getFileSizeAsURL() method.
     */
    @Test
    public void subTestGetFileSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsURL());
    }

    /**
     * Test getFileSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetFileSizeStringAsInteger() {
        assertEquals(Integer.valueOf(601), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsInteger());
    }

    /**
     * Test getFileSizeStringAsLong() method.
     */
    @Test
    public void subTestGetFileSizeStringAsLong() {
        assertEquals(Long.valueOf(601), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsLong());
    }

    /**
     * Test getFileSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsLocalDateTime());
    }

    /**
     * Test getFileSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsLocalTime());
    }

    /**
     * Test getFileSizeStringAsString() method.
     */
    @Test
    public void subTestGetFileSizeStringAsString() {
        assertEquals("6.01 MiB", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsString());
    }

    /**
     * Test getFileSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsBoolean());
    }

    /**
     * Test getFileSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(601), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsBigInteger());
    }

    /**
     * Test getFileSizeStringAsURL() method.
     */
    @Test
    public void subTestGetFileSizeStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsURL());
    }

    /**
     * Test getFileSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString1AsInteger() {
        assertEquals(Integer.valueOf(6), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsInteger());
    }

    /**
     * Test getFileSizeString1AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString1AsLong() {
        assertEquals(Long.valueOf(6), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsLong());
    }

    /**
     * Test getFileSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsLocalDateTime());
    }

    /**
     * Test getFileSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsLocalTime());
    }

    /**
     * Test getFileSizeString1AsString() method.
     */
    @Test
    public void subTestGetFileSizeString1AsString() {
        assertEquals("6 MiB", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsString());
    }

    /**
     * Test getFileSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsBoolean());
    }

    /**
     * Test getFileSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString1AsBigInteger() {
        assertEquals(BigInteger.valueOf(6), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsBigInteger());
    }

    /**
     * Test getFileSizeString1AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsURL());
    }

    /**
     * Test getFileSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString2AsInteger() {
        assertEquals(Integer.valueOf(60), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsInteger());
    }

    /**
     * Test getFileSizeString2AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString2AsLong() {
        assertEquals(Long.valueOf(60), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsLong());
    }

    /**
     * Test getFileSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsLocalDateTime());
    }

    /**
     * Test getFileSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsLocalTime());
    }

    /**
     * Test getFileSizeString2AsString() method.
     */
    @Test
    public void subTestGetFileSizeString2AsString() {
        assertEquals("6.0 MiB", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsString());
    }

    /**
     * Test getFileSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsBoolean());
    }

    /**
     * Test getFileSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString2AsBigInteger() {
        assertEquals(BigInteger.valueOf(60), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsBigInteger());
    }

    /**
     * Test getFileSizeString2AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsURL());
    }

    /**
     * Test getFileSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString3AsInteger() {
        assertEquals(Integer.valueOf(601), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsInteger());
    }

    /**
     * Test getFileSizeString3AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString3AsLong() {
        assertEquals(Long.valueOf(601), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsLong());
    }

    /**
     * Test getFileSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsLocalDateTime());
    }

    /**
     * Test getFileSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsLocalTime());
    }

    /**
     * Test getFileSizeString3AsString() method.
     */
    @Test
    public void subTestGetFileSizeString3AsString() {
        assertEquals("6.01 MiB", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsString());
    }

    /**
     * Test getFileSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsBoolean());
    }

    /**
     * Test getFileSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString3AsBigInteger() {
        assertEquals(BigInteger.valueOf(601), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsBigInteger());
    }

    /**
     * Test getFileSizeString3AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsURL());
    }

    /**
     * Test getFileSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString4AsInteger() {
        assertEquals(Integer.valueOf(6007), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsInteger());
    }

    /**
     * Test getFileSizeString4AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString4AsLong() {
        assertEquals(Long.valueOf(6007), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsLong());
    }

    /**
     * Test getFileSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsLocalDateTime());
    }

    /**
     * Test getFileSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsLocalTime());
    }

    /**
     * Test getFileSizeString4AsString() method.
     */
    @Test
    public void subTestGetFileSizeString4AsString() {
        assertEquals("6.007 MiB", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsString());
    }

    /**
     * Test getFileSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsBoolean());
    }

    /**
     * Test getFileSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString4AsBigInteger() {
        assertEquals(BigInteger.valueOf(6007), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsBigInteger());
    }

    /**
     * Test getFileSizeString4AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsURL());
    }

    /**
     * Test getFirstPacketOrderAsInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsInteger());
    }

    /**
     * Test getFirstPacketOrderAsLong() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsLong());
    }

    /**
     * Test getFirstPacketOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsLocalDateTime());
    }

    /**
     * Test getFirstPacketOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsLocalTime());
    }

    /**
     * Test getFirstPacketOrderAsString() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsString());
    }

    /**
     * Test getFirstPacketOrderAsBoolean() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsBoolean());
    }

    /**
     * Test getFirstPacketOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsBigInteger());
    }

    /**
     * Test getFirstPacketOrderAsURL() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsURL());
    }

    /**
     * Test getFolderNameAsInteger() method.
     */
    @Test
    public void subTestGetFolderNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsInteger());
    }

    /**
     * Test getFolderNameAsLong() method.
     */
    @Test
    public void subTestGetFolderNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsLong());
    }

    /**
     * Test getFolderNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFolderNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsLocalDateTime());
    }

    /**
     * Test getFolderNameAsLocalTime() method.
     */
    @Test
    public void subTestGetFolderNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsLocalTime());
    }

    /**
     * Test getFolderNameAsBoolean() method.
     */
    @Test
    public void subTestGetFolderNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsBoolean());
    }

    /**
     * Test getFolderNameAsBigInteger() method.
     */
    @Test
    public void subTestGetFolderNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsBigInteger());
    }

    /**
     * Test getFolderNameAsURL() method.
     */
    @Test
    public void subTestGetFolderNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsURL());
    }

    /**
     * Test getFolderNameLastAsInteger() method.
     */
    @Test
    public void subTestGetFolderNameLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsInteger());
    }

    /**
     * Test getFolderNameLastAsLong() method.
     */
    @Test
    public void subTestGetFolderNameLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsLong());
    }

    /**
     * Test getFolderNameLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFolderNameLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsLocalDateTime());
    }

    /**
     * Test getFolderNameLastAsLocalTime() method.
     */
    @Test
    public void subTestGetFolderNameLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsLocalTime());
    }

    /**
     * Test getFolderNameLastAsString() method.
     */
    @Test
    public void subTestGetFolderNameLastAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsString());
    }

    /**
     * Test getFolderNameLastAsBoolean() method.
     */
    @Test
    public void subTestGetFolderNameLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsBoolean());
    }

    /**
     * Test getFolderNameLastAsBigInteger() method.
     */
    @Test
    public void subTestGetFolderNameLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsBigInteger());
    }

    /**
     * Test getFolderNameLastAsURL() method.
     */
    @Test
    public void subTestGetFolderNameLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsURL());
    }

    /**
     * Test getFooterSizeAsInteger() method.
     */
    @Test
    public void subTestGetFooterSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsInteger());
    }

    /**
     * Test getFooterSizeAsLong() method.
     */
    @Test
    public void subTestGetFooterSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsLong());
    }

    /**
     * Test getFooterSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFooterSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsLocalDateTime());
    }

    /**
     * Test getFooterSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetFooterSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsLocalTime());
    }

    /**
     * Test getFooterSizeAsString() method.
     */
    @Test
    public void subTestGetFooterSizeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsString());
    }

    /**
     * Test getFooterSizeAsBoolean() method.
     */
    @Test
    public void subTestGetFooterSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsBoolean());
    }

    /**
     * Test getFooterSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetFooterSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsBigInteger());
    }

    /**
     * Test getFooterSizeAsURL() method.
     */
    @Test
    public void subTestGetFooterSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsURL());
    }

    /**
     * Test getFormatAsInteger() method.
     */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsInteger());
    }

    /**
     * Test getFormatAsLong() method.
     */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsLong());
    }

    /**
     * Test getFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsLocalDateTime());
    }

    /**
     * Test getFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsLocalTime());
    }

    /**
     * Test getFormatAsString() method.
     */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals("Matroska", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsString());
    }

    /**
     * Test getFormatAsBoolean() method.
     */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsBoolean());
    }

    /**
     * Test getFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsBigInteger());
    }

    /**
     * Test getFormatAsURL() method.
     */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsURL());
    }

    /**
     * Test getFormatExtensionsAsInteger() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsInteger());
    }

    /**
     * Test getFormatExtensionsAsLong() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsLong());
    }

    /**
     * Test getFormatExtensionsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsLocalDateTime());
    }

    /**
     * Test getFormatExtensionsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsLocalTime());
    }

    /**
     * Test getFormatExtensionsAsString() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsString() {
        assertEquals("mkv mk3d mka mks", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsString());
    }

    /**
     * Test getFormatExtensionsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsBoolean());
    }

    /**
     * Test getFormatExtensionsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsBigInteger());
    }

    /**
     * Test getFormatExtensionsAsURL() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsURL());
    }

    /**
     * Test getFormatInfoAsInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsInteger());
    }

    /**
     * Test getFormatInfoAsLong() method.
     */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsLong());
    }

    /**
     * Test getFormatInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsLocalDateTime());
    }

    /**
     * Test getFormatInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsLocalTime());
    }

    /**
     * Test getFormatInfoAsString() method.
     */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsString());
    }

    /**
     * Test getFormatInfoAsBoolean() method.
     */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsBoolean());
    }

    /**
     * Test getFormatInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsBigInteger());
    }

    /**
     * Test getFormatInfoAsURL() method.
     */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsURL());
    }

    /**
     * Test getFormatUrlAsInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsInteger());
    }

    /**
     * Test getFormatUrlAsLong() method.
     */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsLong());
    }

    /**
     * Test getFormatUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsLocalDateTime());
    }

    /**
     * Test getFormatUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsLocalTime());
    }

    /**
     * Test getFormatUrlAsString() method.
     */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals("http://packs.matroska.org/", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsString());
    }

    /**
     * Test getFormatUrlAsBoolean() method.
     */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsBoolean());
    }

    /**
     * Test getFormatUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsBigInteger());
    }

    /**
     * Test getFormatUrlAsURL() method.
     */
    @Test
    public void subTestGetFormatUrlAsURL() {
        try {
            assertEquals(new URL("http://packs.matroska.org/"), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsURL());
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
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsInteger());
    }

    /**
     * Test getFormatCommercialAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsLong());
    }

    /**
     * Test getFormatCommercialAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsLocalTime());
    }

    /**
     * Test getFormatCommercialAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals("Matroska", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsString());
    }

    /**
     * Test getFormatCommercialAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsBoolean());
    }

    /**
     * Test getFormatCommercialAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsBigInteger());
    }

    /**
     * Test getFormatCommercialAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsURL());
    }

    /**
     * Test getFormatCommercialIfAnyAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsLong());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsLocalTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsString());
    }

    /**
     * Test getFormatCommercialIfAnyAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsBoolean());
    }

    /**
     * Test getFormatCommercialIfAnyAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsBigInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsURL());
    }

    /**
     * Test getFormatCompressionAsInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsInteger());
    }

    /**
     * Test getFormatCompressionAsLong() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsLong());
    }

    /**
     * Test getFormatCompressionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsLocalDateTime());
    }

    /**
     * Test getFormatCompressionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsLocalTime());
    }

    /**
     * Test getFormatCompressionAsString() method.
     */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsString());
    }

    /**
     * Test getFormatCompressionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsBoolean());
    }

    /**
     * Test getFormatCompressionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsBigInteger());
    }

    /**
     * Test getFormatCompressionAsURL() method.
     */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsURL());
    }

    /**
     * Test getFormatLevelAsInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsInteger());
    }

    /**
     * Test getFormatLevelAsLong() method.
     */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsLong());
    }

    /**
     * Test getFormatLevelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsLocalDateTime());
    }

    /**
     * Test getFormatLevelAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsLocalTime());
    }

    /**
     * Test getFormatLevelAsString() method.
     */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsString());
    }

    /**
     * Test getFormatLevelAsBoolean() method.
     */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsBoolean());
    }

    /**
     * Test getFormatLevelAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsBigInteger());
    }

    /**
     * Test getFormatLevelAsURL() method.
     */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsURL());
    }

    /**
     * Test getFormatProfileAsInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsInteger());
    }

    /**
     * Test getFormatProfileAsLong() method.
     */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsLong());
    }

    /**
     * Test getFormatProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsLocalDateTime());
    }

    /**
     * Test getFormatProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsLocalTime());
    }

    /**
     * Test getFormatProfileAsString() method.
     */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsString());
    }

    /**
     * Test getFormatProfileAsBoolean() method.
     */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsBoolean());
    }

    /**
     * Test getFormatProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsBigInteger());
    }

    /**
     * Test getFormatProfileAsURL() method.
     */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsURL());
    }

    /**
     * Test getFormatSettingsAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsInteger());
    }

    /**
     * Test getFormatSettingsAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsLong());
    }

    /**
     * Test getFormatSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsLocalTime());
    }

    /**
     * Test getFormatSettingsAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsString());
    }

    /**
     * Test getFormatSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsBoolean());
    }

    /**
     * Test getFormatSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsBigInteger());
    }

    /**
     * Test getFormatSettingsAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsURL());
    }

    /**
     * Test getFormatVersionAsInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsInteger());
    }

    /**
     * Test getFormatVersionAsLong() method.
     */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsLong());
    }

    /**
     * Test getFormatVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsLocalDateTime());
    }

    /**
     * Test getFormatVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsLocalTime());
    }

    /**
     * Test getFormatVersionAsString() method.
     */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals("Version 1", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsString());
    }

    /**
     * Test getFormatVersionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsBoolean());
    }

    /**
     * Test getFormatVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsBigInteger());
    }

    /**
     * Test getFormatVersionAsURL() method.
     */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsURL());
    }

    /**
     * Test getFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsInteger());
    }

    /**
     * Test getFrameCountAsLong() method.
     */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsLong());
    }

    /**
     * Test getFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsLocalDateTime());
    }

    /**
     * Test getFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsLocalTime());
    }

    /**
     * Test getFrameCountAsString() method.
     */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsString());
    }

    /**
     * Test getFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsBoolean());
    }

    /**
     * Test getFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsBigInteger());
    }

    /**
     * Test getFrameCountAsURL() method.
     */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsURL());
    }

    /**
     * Test getFrameRateAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Integer.valueOf(24000), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsInteger());
        }
    }

    /**
     * Test getFrameRateAsLong() method.
     */
    @Test
    public void subTestGetFrameRateAsLong() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Long.valueOf(24000), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLong());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLong());
        }
    }

    /**
     * Test getFrameRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLocalDateTime());
    }

    /**
     * Test getFrameRateAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLocalTime());
    }

    /**
     * Test getFrameRateAsString() method.
     */
    @Test
    public void subTestGetFrameRateAsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("24.000", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsString());
        } else {
            assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsString());
        }
    }

    /**
     * Test getFrameRateAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsBoolean());
    }

    /**
     * Test getFrameRateAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(BigInteger.valueOf(24000), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsBigInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsBigInteger());
        }
    }

    /**
     * Test getFrameRateAsURL() method.
     */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsURL());
    }

    /**
     * Test getFrameRateStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Integer.valueOf(24000), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsInteger());
        }
    }

    /**
     * Test getFrameRateStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(Long.valueOf(24000), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLong());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLong());
        }
    }

    /**
     * Test getFrameRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLocalTime());
    }

    /**
     * Test getFrameRateStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals("24.000 FPS", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsString());
    }

    /**
     * Test getFrameRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsBoolean());
    }

    /**
     * Test getFrameRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(BigInteger.valueOf(24000), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsBigInteger());
        } else {
            assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsBigInteger());
        }
    }

    /**
     * Test getFrameRateStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsURL());
    }

    /**
     * Test getFrameRateDenAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsInteger());
    }

    /**
     * Test getFrameRateDenAsLong() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsLong());
    }

    /**
     * Test getFrameRateDenAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsLocalDateTime());
    }

    /**
     * Test getFrameRateDenAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsLocalTime());
    }

    /**
     * Test getFrameRateDenAsString() method.
     */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsString());
    }

    /**
     * Test getFrameRateDenAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsBoolean());
    }

    /**
     * Test getFrameRateDenAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsBigInteger());
    }

    /**
     * Test getFrameRateDenAsURL() method.
     */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsURL());
    }

    /**
     * Test getFrameRateNumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsInteger());
    }

    /**
     * Test getFrameRateNumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsLong());
    }

    /**
     * Test getFrameRateNumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsLocalDateTime());
    }

    /**
     * Test getFrameRateNumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsLocalTime());
    }

    /**
     * Test getFrameRateNumAsString() method.
     */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsString());
    }

    /**
     * Test getFrameRateNumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsBoolean());
    }

    /**
     * Test getFrameRateNumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsBigInteger());
    }

    /**
     * Test getFrameRateNumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsURL());
    }

    /**
     * Test getGeneralCountAsInteger() method.
     */
    @Test
    public void subTestGetGeneralCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsInteger());
    }

    /**
     * Test getGeneralCountAsLong() method.
     */
    @Test
    public void subTestGetGeneralCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsLong());
    }

    /**
     * Test getGeneralCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGeneralCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsLocalDateTime());
    }

    /**
     * Test getGeneralCountAsLocalTime() method.
     */
    @Test
    public void subTestGetGeneralCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsLocalTime());
    }

    /**
     * Test getGeneralCountAsString() method.
     */
    @Test
    public void subTestGetGeneralCountAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsString());
    }

    /**
     * Test getGeneralCountAsBoolean() method.
     */
    @Test
    public void subTestGetGeneralCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsBoolean());
    }

    /**
     * Test getGeneralCountAsBigInteger() method.
     */
    @Test
    public void subTestGetGeneralCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsBigInteger());
    }

    /**
     * Test getGeneralCountAsURL() method.
     */
    @Test
    public void subTestGetGeneralCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsURL());
    }

    /**
     * Test getGenreAsInteger() method.
     */
    @Test
    public void subTestGetGenreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsInteger());
    }

    /**
     * Test getGenreAsLong() method.
     */
    @Test
    public void subTestGetGenreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsLong());
    }

    /**
     * Test getGenreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGenreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsLocalDateTime());
    }

    /**
     * Test getGenreAsLocalTime() method.
     */
    @Test
    public void subTestGetGenreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsLocalTime());
    }

    /**
     * Test getGenreAsString() method.
     */
    @Test
    public void subTestGetGenreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsString());
    }

    /**
     * Test getGenreAsBoolean() method.
     */
    @Test
    public void subTestGetGenreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsBoolean());
    }

    /**
     * Test getGenreAsBigInteger() method.
     */
    @Test
    public void subTestGetGenreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsBigInteger());
    }

    /**
     * Test getGenreAsURL() method.
     */
    @Test
    public void subTestGetGenreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsURL());
    }

    /**
     * Test getGroupingAsInteger() method.
     */
    @Test
    public void subTestGetGroupingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsInteger());
    }

    /**
     * Test getGroupingAsLong() method.
     */
    @Test
    public void subTestGetGroupingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsLong());
    }

    /**
     * Test getGroupingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGroupingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsLocalDateTime());
    }

    /**
     * Test getGroupingAsLocalTime() method.
     */
    @Test
    public void subTestGetGroupingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsLocalTime());
    }

    /**
     * Test getGroupingAsString() method.
     */
    @Test
    public void subTestGetGroupingAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsString());
    }

    /**
     * Test getGroupingAsBoolean() method.
     */
    @Test
    public void subTestGetGroupingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsBoolean());
    }

    /**
     * Test getGroupingAsBigInteger() method.
     */
    @Test
    public void subTestGetGroupingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsBigInteger());
    }

    /**
     * Test getGroupingAsURL() method.
     */
    @Test
    public void subTestGetGroupingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsURL());
    }

    /**
     * Test getHeaderSizeAsInteger() method.
     */
    @Test
    public void subTestGetHeaderSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsInteger());
    }

    /**
     * Test getHeaderSizeAsLong() method.
     */
    @Test
    public void subTestGetHeaderSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsLong());
    }

    /**
     * Test getHeaderSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeaderSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsLocalDateTime());
    }

    /**
     * Test getHeaderSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetHeaderSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsLocalTime());
    }

    /**
     * Test getHeaderSizeAsString() method.
     */
    @Test
    public void subTestGetHeaderSizeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsString());
    }

    /**
     * Test getHeaderSizeAsBoolean() method.
     */
    @Test
    public void subTestGetHeaderSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsBoolean());
    }

    /**
     * Test getHeaderSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetHeaderSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsBigInteger());
    }

    /**
     * Test getHeaderSizeAsURL() method.
     */
    @Test
    public void subTestGetHeaderSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsURL());
    }

    /**
     * Test getICRAAsInteger() method.
     */
    @Test
    public void subTestGetICRAAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsInteger());
    }

    /**
     * Test getICRAAsLong() method.
     */
    @Test
    public void subTestGetICRAAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsLong());
    }

    /**
     * Test getICRAAsLocalDateTime() method.
     */
    @Test
    public void subTestGetICRAAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsLocalDateTime());
    }

    /**
     * Test getICRAAsLocalTime() method.
     */
    @Test
    public void subTestGetICRAAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsLocalTime());
    }

    /**
     * Test getICRAAsString() method.
     */
    @Test
    public void subTestGetICRAAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsString());
    }

    /**
     * Test getICRAAsBoolean() method.
     */
    @Test
    public void subTestGetICRAAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsBoolean());
    }

    /**
     * Test getICRAAsBigInteger() method.
     */
    @Test
    public void subTestGetICRAAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsBigInteger());
    }

    /**
     * Test getICRAAsURL() method.
     */
    @Test
    public void subTestGetICRAAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsURL());
    }

    /**
     * Test getIDAsInteger() method.
     */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsInteger());
    }

    /**
     * Test getIDAsLong() method.
     */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsLong());
    }

    /**
     * Test getIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsLocalDateTime());
    }

    /**
     * Test getIDAsLocalTime() method.
     */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsLocalTime());
    }

    /**
     * Test getIDAsString() method.
     */
    @Test
    public void subTestGetIDAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsString());
    }

    /**
     * Test getIDAsBoolean() method.
     */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsBoolean());
    }

    /**
     * Test getIDAsBigInteger() method.
     */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsBigInteger());
    }

    /**
     * Test getIDAsURL() method.
     */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsURL());
    }

    /**
     * Test getIDStringAsInteger() method.
     */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsInteger());
    }

    /**
     * Test getIDStringAsLong() method.
     */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsLong());
    }

    /**
     * Test getIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsLocalDateTime());
    }

    /**
     * Test getIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsLocalTime());
    }

    /**
     * Test getIDStringAsString() method.
     */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsString());
    }

    /**
     * Test getIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsBoolean());
    }

    /**
     * Test getIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsBigInteger());
    }

    /**
     * Test getIDStringAsURL() method.
     */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsURL());
    }

    /**
     * Test getImageFormatListAsInteger() method.
     */
    @Test
    public void subTestGetImageFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsInteger());
    }

    /**
     * Test getImageFormatListAsLong() method.
     */
    @Test
    public void subTestGetImageFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsLong());
    }

    /**
     * Test getImageFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsLocalDateTime());
    }

    /**
     * Test getImageFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetImageFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsLocalTime());
    }

    /**
     * Test getImageFormatListAsString() method.
     */
    @Test
    public void subTestGetImageFormatListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsString());
    }

    /**
     * Test getImageFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetImageFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsBoolean());
    }

    /**
     * Test getImageFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetImageFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsBigInteger());
    }

    /**
     * Test getImageFormatListAsURL() method.
     */
    @Test
    public void subTestGetImageFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsURL());
    }

    /**
     * Test getImageFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsInteger());
    }

    /**
     * Test getImageFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsLong());
    }

    /**
     * Test getImageFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getImageFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsLocalTime());
    }

    /**
     * Test getImageFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsString());
    }

    /**
     * Test getImageFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsBoolean());
    }

    /**
     * Test getImageFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsBigInteger());
    }

    /**
     * Test getImageFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsURL());
    }

    /**
     * Test getImageLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetImageLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsInteger());
    }

    /**
     * Test getImageLanguageListAsLong() method.
     */
    @Test
    public void subTestGetImageLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsLong());
    }

    /**
     * Test getImageLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsLocalDateTime());
    }

    /**
     * Test getImageLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetImageLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsLocalTime());
    }

    /**
     * Test getImageLanguageListAsString() method.
     */
    @Test
    public void subTestGetImageLanguageListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsString());
    }

    /**
     * Test getImageLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetImageLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsBoolean());
    }

    /**
     * Test getImageLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetImageLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsBigInteger());
    }

    /**
     * Test getImageLanguageListAsURL() method.
     */
    @Test
    public void subTestGetImageLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsURL());
    }

    /**
     * Test getImageCountAsInteger() method.
     */
    @Test
    public void subTestGetImageCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsInteger());
    }

    /**
     * Test getImageCountAsLong() method.
     */
    @Test
    public void subTestGetImageCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsLong());
    }

    /**
     * Test getImageCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsLocalDateTime());
    }

    /**
     * Test getImageCountAsLocalTime() method.
     */
    @Test
    public void subTestGetImageCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsLocalTime());
    }

    /**
     * Test getImageCountAsString() method.
     */
    @Test
    public void subTestGetImageCountAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsString());
    }

    /**
     * Test getImageCountAsBoolean() method.
     */
    @Test
    public void subTestGetImageCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsBoolean());
    }

    /**
     * Test getImageCountAsBigInteger() method.
     */
    @Test
    public void subTestGetImageCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsBigInteger());
    }

    /**
     * Test getImageCountAsURL() method.
     */
    @Test
    public void subTestGetImageCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsURL());
    }

    /**
     * Test getInformAsInteger() method.
     */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsInteger());
    }

    /**
     * Test getInformAsLong() method.
     */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsLong());
    }

    /**
     * Test getInformAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsLocalDateTime());
    }

    /**
     * Test getInformAsLocalTime() method.
     */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsLocalTime());
    }

    /**
     * Test getInformAsBoolean() method.
     */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsBoolean());
    }

    /**
     * Test getInformAsBigInteger() method.
     */
    @Test
    public void subTestGetInformAsBigInteger() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(new BigInteger("13732253260588722412635437150074040825206745960386419573650016011458561143001435300140000"), JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsBigInteger());
        } else {
            assertEquals(new BigInteger("1373225326058872241263543715007404082520674596038641957365001601145856114300143530014"), JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsBigInteger());
        }
    }

    /**
     * Test getInformAsURL() method.
     */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsURL());
    }

    /**
     * Test getInterleavedAsInteger() method.
     */
    @Test
    public void subTestGetInterleavedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsInteger());
    }

    /**
     * Test getInterleavedAsLong() method.
     */
    @Test
    public void subTestGetInterleavedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsLong());
    }

    /**
     * Test getInterleavedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleavedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsLocalDateTime());
    }

    /**
     * Test getInterleavedAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleavedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsLocalTime());
    }

    /**
     * Test getInterleavedAsString() method.
     */
    @Test
    public void subTestGetInterleavedAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsString());
    }

    /**
     * Test getInterleavedAsBoolean() method.
     */
    @Test
    public void subTestGetInterleavedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsBoolean());
    }

    /**
     * Test getInterleavedAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleavedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsBigInteger());
    }

    /**
     * Test getInterleavedAsURL() method.
     */
    @Test
    public void subTestGetInterleavedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsURL());
    }

    /**
     * Test getInternetMediaTypeAsInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsInteger());
    }

    /**
     * Test getInternetMediaTypeAsLong() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsLong());
    }

    /**
     * Test getInternetMediaTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsLocalDateTime());
    }

    /**
     * Test getInternetMediaTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsLocalTime());
    }

    /**
     * Test getInternetMediaTypeAsString() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsString());
    }

    /**
     * Test getInternetMediaTypeAsBoolean() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsBoolean());
    }

    /**
     * Test getInternetMediaTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsBigInteger());
    }

    /**
     * Test getInternetMediaTypeAsURL() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsURL());
    }

    /**
     * Test getISBNAsInteger() method.
     */
    @Test
    public void subTestGetISBNAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsInteger());
    }

    /**
     * Test getISBNAsLong() method.
     */
    @Test
    public void subTestGetISBNAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsLong());
    }

    /**
     * Test getISBNAsLocalDateTime() method.
     */
    @Test
    public void subTestGetISBNAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsLocalDateTime());
    }

    /**
     * Test getISBNAsLocalTime() method.
     */
    @Test
    public void subTestGetISBNAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsLocalTime());
    }

    /**
     * Test getISBNAsString() method.
     */
    @Test
    public void subTestGetISBNAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsString());
    }

    /**
     * Test getISBNAsBoolean() method.
     */
    @Test
    public void subTestGetISBNAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsBoolean());
    }

    /**
     * Test getISBNAsBigInteger() method.
     */
    @Test
    public void subTestGetISBNAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsBigInteger());
    }

    /**
     * Test getISBNAsURL() method.
     */
    @Test
    public void subTestGetISBNAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsURL());
    }

    /**
     * Test getISRCAsInteger() method.
     */
    @Test
    public void subTestGetISRCAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsInteger());
    }

    /**
     * Test getISRCAsLong() method.
     */
    @Test
    public void subTestGetISRCAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsLong());
    }

    /**
     * Test getISRCAsLocalDateTime() method.
     */
    @Test
    public void subTestGetISRCAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsLocalDateTime());
    }

    /**
     * Test getISRCAsLocalTime() method.
     */
    @Test
    public void subTestGetISRCAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsLocalTime());
    }

    /**
     * Test getISRCAsString() method.
     */
    @Test
    public void subTestGetISRCAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsString());
    }

    /**
     * Test getISRCAsBoolean() method.
     */
    @Test
    public void subTestGetISRCAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsBoolean());
    }

    /**
     * Test getISRCAsBigInteger() method.
     */
    @Test
    public void subTestGetISRCAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsBigInteger());
    }

    /**
     * Test getISRCAsURL() method.
     */
    @Test
    public void subTestGetISRCAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsURL());
    }

    /**
     * Test getIsStreamableAsInteger() method.
     */
    @Test
    public void subTestGetIsStreamableAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsInteger());
    }

    /**
     * Test getIsStreamableAsLong() method.
     */
    @Test
    public void subTestGetIsStreamableAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsLong());
    }

    /**
     * Test getIsStreamableAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIsStreamableAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsLocalDateTime());
    }

    /**
     * Test getIsStreamableAsLocalTime() method.
     */
    @Test
    public void subTestGetIsStreamableAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsLocalTime());
    }

    /**
     * Test getIsStreamableAsString() method.
     */
    @Test
    public void subTestGetIsStreamableAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsString());
    }

    /**
     * Test getIsStreamableAsBoolean() method.
     */
    @Test
    public void subTestGetIsStreamableAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsBoolean());
    }

    /**
     * Test getIsStreamableAsBigInteger() method.
     */
    @Test
    public void subTestGetIsStreamableAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsBigInteger());
    }

    /**
     * Test getIsStreamableAsURL() method.
     */
    @Test
    public void subTestGetIsStreamableAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsURL());
    }

    /**
     * Test getKeywordsAsInteger() method.
     */
    @Test
    public void subTestGetKeywordsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsInteger());
    }

    /**
     * Test getKeywordsAsLong() method.
     */
    @Test
    public void subTestGetKeywordsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsLong());
    }

    /**
     * Test getKeywordsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetKeywordsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsLocalDateTime());
    }

    /**
     * Test getKeywordsAsLocalTime() method.
     */
    @Test
    public void subTestGetKeywordsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsLocalTime());
    }

    /**
     * Test getKeywordsAsString() method.
     */
    @Test
    public void subTestGetKeywordsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsString());
    }

    /**
     * Test getKeywordsAsBoolean() method.
     */
    @Test
    public void subTestGetKeywordsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsBoolean());
    }

    /**
     * Test getKeywordsAsBigInteger() method.
     */
    @Test
    public void subTestGetKeywordsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsBigInteger());
    }

    /**
     * Test getKeywordsAsURL() method.
     */
    @Test
    public void subTestGetKeywordsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsURL());
    }

    /**
     * Test getLabelAsInteger() method.
     */
    @Test
    public void subTestGetLabelAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsInteger());
    }

    /**
     * Test getLabelAsLong() method.
     */
    @Test
    public void subTestGetLabelAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsLong());
    }

    /**
     * Test getLabelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLabelAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsLocalDateTime());
    }

    /**
     * Test getLabelAsLocalTime() method.
     */
    @Test
    public void subTestGetLabelAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsLocalTime());
    }

    /**
     * Test getLabelAsString() method.
     */
    @Test
    public void subTestGetLabelAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsString());
    }

    /**
     * Test getLabelAsBoolean() method.
     */
    @Test
    public void subTestGetLabelAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsBoolean());
    }

    /**
     * Test getLabelAsBigInteger() method.
     */
    @Test
    public void subTestGetLabelAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsBigInteger());
    }

    /**
     * Test getLabelAsURL() method.
     */
    @Test
    public void subTestGetLabelAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsURL());
    }

    /**
     * Test getLabelCodeAsInteger() method.
     */
    @Test
    public void subTestGetLabelCodeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsInteger());
    }

    /**
     * Test getLabelCodeAsLong() method.
     */
    @Test
    public void subTestGetLabelCodeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsLong());
    }

    /**
     * Test getLabelCodeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLabelCodeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsLocalDateTime());
    }

    /**
     * Test getLabelCodeAsLocalTime() method.
     */
    @Test
    public void subTestGetLabelCodeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsLocalTime());
    }

    /**
     * Test getLabelCodeAsString() method.
     */
    @Test
    public void subTestGetLabelCodeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsString());
    }

    /**
     * Test getLabelCodeAsBoolean() method.
     */
    @Test
    public void subTestGetLabelCodeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsBoolean());
    }

    /**
     * Test getLabelCodeAsBigInteger() method.
     */
    @Test
    public void subTestGetLabelCodeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsBigInteger());
    }

    /**
     * Test getLabelCodeAsURL() method.
     */
    @Test
    public void subTestGetLabelCodeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsURL());
    }

    /**
     * Test getLawRatingAsInteger() method.
     */
    @Test
    public void subTestGetLawRatingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsInteger());
    }

    /**
     * Test getLawRatingAsLong() method.
     */
    @Test
    public void subTestGetLawRatingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsLong());
    }

    /**
     * Test getLawRatingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLawRatingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsLocalDateTime());
    }

    /**
     * Test getLawRatingAsLocalTime() method.
     */
    @Test
    public void subTestGetLawRatingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsLocalTime());
    }

    /**
     * Test getLawRatingAsString() method.
     */
    @Test
    public void subTestGetLawRatingAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsString());
    }

    /**
     * Test getLawRatingAsBoolean() method.
     */
    @Test
    public void subTestGetLawRatingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsBoolean());
    }

    /**
     * Test getLawRatingAsBigInteger() method.
     */
    @Test
    public void subTestGetLawRatingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsBigInteger());
    }

    /**
     * Test getLawRatingAsURL() method.
     */
    @Test
    public void subTestGetLawRatingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsURL());
    }

    /**
     * Test getLawRatingReasonAsInteger() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsInteger());
    }

    /**
     * Test getLawRatingReasonAsLong() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsLong());
    }

    /**
     * Test getLawRatingReasonAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsLocalDateTime());
    }

    /**
     * Test getLawRatingReasonAsLocalTime() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsLocalTime());
    }

    /**
     * Test getLawRatingReasonAsString() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsString());
    }

    /**
     * Test getLawRatingReasonAsBoolean() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsBoolean());
    }

    /**
     * Test getLawRatingReasonAsBigInteger() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsBigInteger());
    }

    /**
     * Test getLawRatingReasonAsURL() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsURL());
    }

    /**
     * Test getLCCNAsInteger() method.
     */
    @Test
    public void subTestGetLCCNAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsInteger());
    }

    /**
     * Test getLCCNAsLong() method.
     */
    @Test
    public void subTestGetLCCNAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsLong());
    }

    /**
     * Test getLCCNAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLCCNAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsLocalDateTime());
    }

    /**
     * Test getLCCNAsLocalTime() method.
     */
    @Test
    public void subTestGetLCCNAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsLocalTime());
    }

    /**
     * Test getLCCNAsString() method.
     */
    @Test
    public void subTestGetLCCNAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsString());
    }

    /**
     * Test getLCCNAsBoolean() method.
     */
    @Test
    public void subTestGetLCCNAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsBoolean());
    }

    /**
     * Test getLCCNAsBigInteger() method.
     */
    @Test
    public void subTestGetLCCNAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsBigInteger());
    }

    /**
     * Test getLCCNAsURL() method.
     */
    @Test
    public void subTestGetLCCNAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsURL());
    }

    /**
     * Test getLightnessAsInteger() method.
     */
    @Test
    public void subTestGetLightnessAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsInteger());
    }

    /**
     * Test getLightnessAsLong() method.
     */
    @Test
    public void subTestGetLightnessAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsLong());
    }

    /**
     * Test getLightnessAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLightnessAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsLocalDateTime());
    }

    /**
     * Test getLightnessAsLocalTime() method.
     */
    @Test
    public void subTestGetLightnessAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsLocalTime());
    }

    /**
     * Test getLightnessAsString() method.
     */
    @Test
    public void subTestGetLightnessAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsString());
    }

    /**
     * Test getLightnessAsBoolean() method.
     */
    @Test
    public void subTestGetLightnessAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsBoolean());
    }

    /**
     * Test getLightnessAsBigInteger() method.
     */
    @Test
    public void subTestGetLightnessAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsBigInteger());
    }

    /**
     * Test getLightnessAsURL() method.
     */
    @Test
    public void subTestGetLightnessAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsURL());
    }

    /**
     * Test getLyricistAsInteger() method.
     */
    @Test
    public void subTestGetLyricistAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsInteger());
    }

    /**
     * Test getLyricistAsLong() method.
     */
    @Test
    public void subTestGetLyricistAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsLong());
    }

    /**
     * Test getLyricistAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLyricistAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsLocalDateTime());
    }

    /**
     * Test getLyricistAsLocalTime() method.
     */
    @Test
    public void subTestGetLyricistAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsLocalTime());
    }

    /**
     * Test getLyricistAsString() method.
     */
    @Test
    public void subTestGetLyricistAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsString());
    }

    /**
     * Test getLyricistAsBoolean() method.
     */
    @Test
    public void subTestGetLyricistAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsBoolean());
    }

    /**
     * Test getLyricistAsBigInteger() method.
     */
    @Test
    public void subTestGetLyricistAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsBigInteger());
    }

    /**
     * Test getLyricistAsURL() method.
     */
    @Test
    public void subTestGetLyricistAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsURL());
    }

    /**
     * Test getLyricsAsInteger() method.
     */
    @Test
    public void subTestGetLyricsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsInteger());
    }

    /**
     * Test getLyricsAsLong() method.
     */
    @Test
    public void subTestGetLyricsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsLong());
    }

    /**
     * Test getLyricsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLyricsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsLocalDateTime());
    }

    /**
     * Test getLyricsAsLocalTime() method.
     */
    @Test
    public void subTestGetLyricsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsLocalTime());
    }

    /**
     * Test getLyricsAsString() method.
     */
    @Test
    public void subTestGetLyricsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsString());
    }

    /**
     * Test getLyricsAsBoolean() method.
     */
    @Test
    public void subTestGetLyricsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsBoolean());
    }

    /**
     * Test getLyricsAsBigInteger() method.
     */
    @Test
    public void subTestGetLyricsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsBigInteger());
    }

    /**
     * Test getLyricsAsURL() method.
     */
    @Test
    public void subTestGetLyricsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsURL());
    }

    /**
     * Test getMasteredDateAsInteger() method.
     */
    @Test
    public void subTestGetMasteredDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsInteger());
    }

    /**
     * Test getMasteredDateAsLong() method.
     */
    @Test
    public void subTestGetMasteredDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsLong());
    }

    /**
     * Test getMasteredDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMasteredDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsLocalDateTime());
    }

    /**
     * Test getMasteredDateAsLocalTime() method.
     */
    @Test
    public void subTestGetMasteredDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsLocalTime());
    }

    /**
     * Test getMasteredDateAsString() method.
     */
    @Test
    public void subTestGetMasteredDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsString());
    }

    /**
     * Test getMasteredDateAsBoolean() method.
     */
    @Test
    public void subTestGetMasteredDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsBoolean());
    }

    /**
     * Test getMasteredDateAsBigInteger() method.
     */
    @Test
    public void subTestGetMasteredDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsBigInteger());
    }

    /**
     * Test getMasteredDateAsURL() method.
     */
    @Test
    public void subTestGetMasteredDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsURL());
    }

    /**
     * Test getMasteredByAsInteger() method.
     */
    @Test
    public void subTestGetMasteredByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsInteger());
    }

    /**
     * Test getMasteredByAsLong() method.
     */
    @Test
    public void subTestGetMasteredByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsLong());
    }

    /**
     * Test getMasteredByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMasteredByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsLocalDateTime());
    }

    /**
     * Test getMasteredByAsLocalTime() method.
     */
    @Test
    public void subTestGetMasteredByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsLocalTime());
    }

    /**
     * Test getMasteredByAsString() method.
     */
    @Test
    public void subTestGetMasteredByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsString());
    }

    /**
     * Test getMasteredByAsBoolean() method.
     */
    @Test
    public void subTestGetMasteredByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsBoolean());
    }

    /**
     * Test getMasteredByAsBigInteger() method.
     */
    @Test
    public void subTestGetMasteredByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsBigInteger());
    }

    /**
     * Test getMasteredByAsURL() method.
     */
    @Test
    public void subTestGetMasteredByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsURL());
    }

    /**
     * Test getMenuFormatListAsInteger() method.
     */
    @Test
    public void subTestGetMenuFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsInteger());
    }

    /**
     * Test getMenuFormatListAsLong() method.
     */
    @Test
    public void subTestGetMenuFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsLong());
    }

    /**
     * Test getMenuFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsLocalDateTime());
    }

    /**
     * Test getMenuFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsLocalTime());
    }

    /**
     * Test getMenuFormatListAsString() method.
     */
    @Test
    public void subTestGetMenuFormatListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsString());
    }

    /**
     * Test getMenuFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetMenuFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsBoolean());
    }

    /**
     * Test getMenuFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsBigInteger());
    }

    /**
     * Test getMenuFormatListAsURL() method.
     */
    @Test
    public void subTestGetMenuFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsURL());
    }

    /**
     * Test getMenuFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsInteger());
    }

    /**
     * Test getMenuFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsLong());
    }

    /**
     * Test getMenuFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getMenuFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsLocalTime());
    }

    /**
     * Test getMenuFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsString());
    }

    /**
     * Test getMenuFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsBoolean());
    }

    /**
     * Test getMenuFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsBigInteger());
    }

    /**
     * Test getMenuFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsURL());
    }

    /**
     * Test getMenuLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsInteger());
    }

    /**
     * Test getMenuLanguageListAsLong() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsLong());
    }

    /**
     * Test getMenuLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsLocalDateTime());
    }

    /**
     * Test getMenuLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsLocalTime());
    }

    /**
     * Test getMenuLanguageListAsString() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsString());
    }

    /**
     * Test getMenuLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsBoolean());
    }

    /**
     * Test getMenuLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsBigInteger());
    }

    /**
     * Test getMenuLanguageListAsURL() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsURL());
    }

    /**
     * Test getMenuCountAsInteger() method.
     */
    @Test
    public void subTestGetMenuCountAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsInteger());
    }

    /**
     * Test getMenuCountAsLong() method.
     */
    @Test
    public void subTestGetMenuCountAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsLong());
    }

    /**
     * Test getMenuCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsLocalDateTime());
    }

    /**
     * Test getMenuCountAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsLocalTime());
    }

    /**
     * Test getMenuCountAsString() method.
     */
    @Test
    public void subTestGetMenuCountAsString() {
        assertEquals("1", JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsString());
    }

    /**
     * Test getMenuCountAsBoolean() method.
     */
    @Test
    public void subTestGetMenuCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsBoolean());
    }

    /**
     * Test getMenuCountAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsBigInteger());
    }

    /**
     * Test getMenuCountAsURL() method.
     */
    @Test
    public void subTestGetMenuCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsURL());
    }

    /**
     * Test getMenuIDAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsInteger());
    }

    /**
     * Test getMenuIDAsLong() method.
     */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsLong());
    }

    /**
     * Test getMenuIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsLocalDateTime());
    }

    /**
     * Test getMenuIDAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsLocalTime());
    }

    /**
     * Test getMenuIDAsString() method.
     */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsString());
    }

    /**
     * Test getMenuIDAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsBoolean());
    }

    /**
     * Test getMenuIDAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsBigInteger());
    }

    /**
     * Test getMenuIDAsURL() method.
     */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsURL());
    }

    /**
     * Test getMenuIDStringAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsInteger());
    }

    /**
     * Test getMenuIDStringAsLong() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsLong());
    }

    /**
     * Test getMenuIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsLocalDateTime());
    }

    /**
     * Test getMenuIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsLocalTime());
    }

    /**
     * Test getMenuIDStringAsString() method.
     */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsString());
    }

    /**
     * Test getMenuIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsBoolean());
    }

    /**
     * Test getMenuIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsBigInteger());
    }

    /**
     * Test getMenuIDStringAsURL() method.
     */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsURL());
    }

    /**
     * Test getMoodAsInteger() method.
     */
    @Test
    public void subTestGetMoodAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsInteger());
    }

    /**
     * Test getMoodAsLong() method.
     */
    @Test
    public void subTestGetMoodAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsLong());
    }

    /**
     * Test getMoodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMoodAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsLocalDateTime());
    }

    /**
     * Test getMoodAsLocalTime() method.
     */
    @Test
    public void subTestGetMoodAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsLocalTime());
    }

    /**
     * Test getMoodAsString() method.
     */
    @Test
    public void subTestGetMoodAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsString());
    }

    /**
     * Test getMoodAsBoolean() method.
     */
    @Test
    public void subTestGetMoodAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsBoolean());
    }

    /**
     * Test getMoodAsBigInteger() method.
     */
    @Test
    public void subTestGetMoodAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsBigInteger());
    }

    /**
     * Test getMoodAsURL() method.
     */
    @Test
    public void subTestGetMoodAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsURL());
    }

    /**
     * Test getMovieAsInteger() method.
     */
    @Test
    public void subTestGetMovieAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsInteger());
    }

    /**
     * Test getMovieAsLong() method.
     */
    @Test
    public void subTestGetMovieAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsLong());
    }

    /**
     * Test getMovieAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsLocalDateTime());
    }

    /**
     * Test getMovieAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsLocalTime());
    }

    /**
     * Test getMovieAsString() method.
     */
    @Test
    public void subTestGetMovieAsString() {
        assertEquals("Sintel", JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsString());
    }

    /**
     * Test getMovieAsBoolean() method.
     */
    @Test
    public void subTestGetMovieAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsBoolean());
    }

    /**
     * Test getMovieAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsBigInteger());
    }

    /**
     * Test getMovieAsURL() method.
     */
    @Test
    public void subTestGetMovieAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsURL());
    }

    /**
     * Test getMovieCountryAsInteger() method.
     */
    @Test
    public void subTestGetMovieCountryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsInteger());
    }

    /**
     * Test getMovieCountryAsLong() method.
     */
    @Test
    public void subTestGetMovieCountryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsLong());
    }

    /**
     * Test getMovieCountryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieCountryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsLocalDateTime());
    }

    /**
     * Test getMovieCountryAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieCountryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsLocalTime());
    }

    /**
     * Test getMovieCountryAsString() method.
     */
    @Test
    public void subTestGetMovieCountryAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsString());
    }

    /**
     * Test getMovieCountryAsBoolean() method.
     */
    @Test
    public void subTestGetMovieCountryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsBoolean());
    }

    /**
     * Test getMovieCountryAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieCountryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsBigInteger());
    }

    /**
     * Test getMovieCountryAsURL() method.
     */
    @Test
    public void subTestGetMovieCountryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsURL());
    }

    /**
     * Test getMovieUrlAsInteger() method.
     */
    @Test
    public void subTestGetMovieUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsInteger());
    }

    /**
     * Test getMovieUrlAsLong() method.
     */
    @Test
    public void subTestGetMovieUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsLong());
    }

    /**
     * Test getMovieUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsLocalDateTime());
    }

    /**
     * Test getMovieUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsLocalTime());
    }

    /**
     * Test getMovieUrlAsString() method.
     */
    @Test
    public void subTestGetMovieUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsString());
    }

    /**
     * Test getMovieUrlAsBoolean() method.
     */
    @Test
    public void subTestGetMovieUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsBoolean());
    }

    /**
     * Test getMovieUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsBigInteger());
    }

    /**
     * Test getMovieUrlAsURL() method.
     */
    @Test
    public void subTestGetMovieUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsURL());
    }

    /**
     * Test getMovieMoreAsInteger() method.
     */
    @Test
    public void subTestGetMovieMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsInteger());
    }

    /**
     * Test getMovieMoreAsLong() method.
     */
    @Test
    public void subTestGetMovieMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsLong());
    }

    /**
     * Test getMovieMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsLocalDateTime());
    }

    /**
     * Test getMovieMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsLocalTime());
    }

    /**
     * Test getMovieMoreAsString() method.
     */
    @Test
    public void subTestGetMovieMoreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsString());
    }

    /**
     * Test getMovieMoreAsBoolean() method.
     */
    @Test
    public void subTestGetMovieMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsBoolean());
    }

    /**
     * Test getMovieMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsBigInteger());
    }

    /**
     * Test getMovieMoreAsURL() method.
     */
    @Test
    public void subTestGetMovieMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsURL());
    }

    /**
     * Test getMusicByAsInteger() method.
     */
    @Test
    public void subTestGetMusicByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsInteger());
    }

    /**
     * Test getMusicByAsLong() method.
     */
    @Test
    public void subTestGetMusicByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsLong());
    }

    /**
     * Test getMusicByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMusicByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsLocalDateTime());
    }

    /**
     * Test getMusicByAsLocalTime() method.
     */
    @Test
    public void subTestGetMusicByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsLocalTime());
    }

    /**
     * Test getMusicByAsString() method.
     */
    @Test
    public void subTestGetMusicByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsString());
    }

    /**
     * Test getMusicByAsBoolean() method.
     */
    @Test
    public void subTestGetMusicByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsBoolean());
    }

    /**
     * Test getMusicByAsBigInteger() method.
     */
    @Test
    public void subTestGetMusicByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsBigInteger());
    }

    /**
     * Test getMusicByAsURL() method.
     */
    @Test
    public void subTestGetMusicByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsURL());
    }

    /**
     * Test getNetworkNameAsInteger() method.
     */
    @Test
    public void subTestGetNetworkNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsInteger());
    }

    /**
     * Test getNetworkNameAsLong() method.
     */
    @Test
    public void subTestGetNetworkNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsLong());
    }

    /**
     * Test getNetworkNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetNetworkNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsLocalDateTime());
    }

    /**
     * Test getNetworkNameAsLocalTime() method.
     */
    @Test
    public void subTestGetNetworkNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsLocalTime());
    }

    /**
     * Test getNetworkNameAsString() method.
     */
    @Test
    public void subTestGetNetworkNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsString());
    }

    /**
     * Test getNetworkNameAsBoolean() method.
     */
    @Test
    public void subTestGetNetworkNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsBoolean());
    }

    /**
     * Test getNetworkNameAsBigInteger() method.
     */
    @Test
    public void subTestGetNetworkNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsBigInteger());
    }

    /**
     * Test getNetworkNameAsURL() method.
     */
    @Test
    public void subTestGetNetworkNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsURL());
    }

    /**
     * Test getOriginalAlbumAsInteger() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsInteger());
    }

    /**
     * Test getOriginalAlbumAsLong() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsLong());
    }

    /**
     * Test getOriginalAlbumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsLocalDateTime());
    }

    /**
     * Test getOriginalAlbumAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsLocalTime());
    }

    /**
     * Test getOriginalAlbumAsString() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsString());
    }

    /**
     * Test getOriginalAlbumAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsBoolean());
    }

    /**
     * Test getOriginalAlbumAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsBigInteger());
    }

    /**
     * Test getOriginalAlbumAsURL() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsURL());
    }

    /**
     * Test getOriginalLyricistAsInteger() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsInteger());
    }

    /**
     * Test getOriginalLyricistAsLong() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsLong());
    }

    /**
     * Test getOriginalLyricistAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsLocalDateTime());
    }

    /**
     * Test getOriginalLyricistAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsLocalTime());
    }

    /**
     * Test getOriginalLyricistAsString() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsString());
    }

    /**
     * Test getOriginalLyricistAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsBoolean());
    }

    /**
     * Test getOriginalLyricistAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsBigInteger());
    }

    /**
     * Test getOriginalLyricistAsURL() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsURL());
    }

    /**
     * Test getOriginalMovieAsInteger() method.
     */
    @Test
    public void subTestGetOriginalMovieAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsInteger());
    }

    /**
     * Test getOriginalMovieAsLong() method.
     */
    @Test
    public void subTestGetOriginalMovieAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsLong());
    }

    /**
     * Test getOriginalMovieAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalMovieAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsLocalDateTime());
    }

    /**
     * Test getOriginalMovieAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalMovieAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsLocalTime());
    }

    /**
     * Test getOriginalMovieAsString() method.
     */
    @Test
    public void subTestGetOriginalMovieAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsString());
    }

    /**
     * Test getOriginalMovieAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalMovieAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsBoolean());
    }

    /**
     * Test getOriginalMovieAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalMovieAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsBigInteger());
    }

    /**
     * Test getOriginalMovieAsURL() method.
     */
    @Test
    public void subTestGetOriginalMovieAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsURL());
    }

    /**
     * Test getOriginalPartAsInteger() method.
     */
    @Test
    public void subTestGetOriginalPartAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsInteger());
    }

    /**
     * Test getOriginalPartAsLong() method.
     */
    @Test
    public void subTestGetOriginalPartAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsLong());
    }

    /**
     * Test getOriginalPartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalPartAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsLocalDateTime());
    }

    /**
     * Test getOriginalPartAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalPartAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsLocalTime());
    }

    /**
     * Test getOriginalPartAsString() method.
     */
    @Test
    public void subTestGetOriginalPartAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsString());
    }

    /**
     * Test getOriginalPartAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalPartAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsBoolean());
    }

    /**
     * Test getOriginalPartAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalPartAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsBigInteger());
    }

    /**
     * Test getOriginalPartAsURL() method.
     */
    @Test
    public void subTestGetOriginalPartAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsURL());
    }

    /**
     * Test getOriginalPerformerAsInteger() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsInteger());
    }

    /**
     * Test getOriginalPerformerAsLong() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsLong());
    }

    /**
     * Test getOriginalPerformerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsLocalDateTime());
    }

    /**
     * Test getOriginalPerformerAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsLocalTime());
    }

    /**
     * Test getOriginalPerformerAsString() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsString());
    }

    /**
     * Test getOriginalPerformerAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsBoolean());
    }

    /**
     * Test getOriginalPerformerAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsBigInteger());
    }

    /**
     * Test getOriginalPerformerAsURL() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsURL());
    }

    /**
     * Test getOriginalReleasedDateAsInteger() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsInteger());
    }

    /**
     * Test getOriginalReleasedDateAsLong() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsLong());
    }

    /**
     * Test getOriginalReleasedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsLocalDateTime());
    }

    /**
     * Test getOriginalReleasedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsLocalTime());
    }

    /**
     * Test getOriginalReleasedDateAsString() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsString());
    }

    /**
     * Test getOriginalReleasedDateAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsBoolean());
    }

    /**
     * Test getOriginalReleasedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsBigInteger());
    }

    /**
     * Test getOriginalReleasedDateAsURL() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsURL());
    }

    /**
     * Test getOriginalTrackAsInteger() method.
     */
    @Test
    public void subTestGetOriginalTrackAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsInteger());
    }

    /**
     * Test getOriginalTrackAsLong() method.
     */
    @Test
    public void subTestGetOriginalTrackAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsLong());
    }

    /**
     * Test getOriginalTrackAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalTrackAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsLocalDateTime());
    }

    /**
     * Test getOriginalTrackAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalTrackAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsLocalTime());
    }

    /**
     * Test getOriginalTrackAsString() method.
     */
    @Test
    public void subTestGetOriginalTrackAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsString());
    }

    /**
     * Test getOriginalTrackAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalTrackAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsBoolean());
    }

    /**
     * Test getOriginalTrackAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalTrackAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsBigInteger());
    }

    /**
     * Test getOriginalTrackAsURL() method.
     */
    @Test
    public void subTestGetOriginalTrackAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsURL());
    }

    /**
     * Test getOriginalNetworkNameAsInteger() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsInteger());
    }

    /**
     * Test getOriginalNetworkNameAsLong() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsLong());
    }

    /**
     * Test getOriginalNetworkNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsLocalDateTime());
    }

    /**
     * Test getOriginalNetworkNameAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsLocalTime());
    }

    /**
     * Test getOriginalNetworkNameAsString() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsString());
    }

    /**
     * Test getOriginalNetworkNameAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsBoolean());
    }

    /**
     * Test getOriginalNetworkNameAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsBigInteger());
    }

    /**
     * Test getOriginalNetworkNameAsURL() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsURL());
    }

    /**
     * Test getOriginalSourceFormAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsInteger());
    }

    /**
     * Test getOriginalSourceFormAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsLong());
    }

    /**
     * Test getOriginalSourceFormAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsString());
    }

    /**
     * Test getOriginalSourceFormAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsBoolean());
    }

    /**
     * Test getOriginalSourceFormAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsURL());
    }

    /**
     * Test getOriginalSourceFormCroppedAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsInteger());
    }

    /**
     * Test getOriginalSourceFormCroppedAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsLong());
    }

    /**
     * Test getOriginalSourceFormCroppedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormCroppedAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormCroppedAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsString());
    }

    /**
     * Test getOriginalSourceFormCroppedAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsBoolean());
    }

    /**
     * Test getOriginalSourceFormCroppedAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormCroppedAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsURL());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsInteger());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLong());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsString());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsBoolean());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsURL());
    }

    /**
     * Test getOriginalSourceFormNameAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsInteger());
    }

    /**
     * Test getOriginalSourceFormNameAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsLong());
    }

    /**
     * Test getOriginalSourceFormNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormNameAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormNameAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsString());
    }

    /**
     * Test getOriginalSourceFormNameAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsBoolean());
    }

    /**
     * Test getOriginalSourceFormNameAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormNameAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsURL());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsInteger());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLong());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsString());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsBoolean());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsURL());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsInteger());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLong());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsString());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsBoolean());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsURL());
    }

    /**
     * Test getOriginalSourceMediumAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsInteger());
    }

    /**
     * Test getOriginalSourceMediumAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsLong());
    }

    /**
     * Test getOriginalSourceMediumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsString());
    }

    /**
     * Test getOriginalSourceMediumAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsString());
    }

    /**
     * Test getOriginalSourceMediumIDAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsString());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsURL());
    }

    /**
     * Test getOtherFormatListAsInteger() method.
     */
    @Test
    public void subTestGetOtherFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsInteger());
    }

    /**
     * Test getOtherFormatListAsLong() method.
     */
    @Test
    public void subTestGetOtherFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsLong());
    }

    /**
     * Test getOtherFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsLocalDateTime());
    }

    /**
     * Test getOtherFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsLocalTime());
    }

    /**
     * Test getOtherFormatListAsString() method.
     */
    @Test
    public void subTestGetOtherFormatListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsString());
    }

    /**
     * Test getOtherFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetOtherFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsBoolean());
    }

    /**
     * Test getOtherFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsBigInteger());
    }

    /**
     * Test getOtherFormatListAsURL() method.
     */
    @Test
    public void subTestGetOtherFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsURL());
    }

    /**
     * Test getOtherFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsInteger());
    }

    /**
     * Test getOtherFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsLong());
    }

    /**
     * Test getOtherFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getOtherFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsLocalTime());
    }

    /**
     * Test getOtherFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsString());
    }

    /**
     * Test getOtherFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsBoolean());
    }

    /**
     * Test getOtherFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsBigInteger());
    }

    /**
     * Test getOtherFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsURL());
    }

    /**
     * Test getOtherLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsInteger());
    }

    /**
     * Test getOtherLanguageListAsLong() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsLong());
    }

    /**
     * Test getOtherLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsLocalDateTime());
    }

    /**
     * Test getOtherLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsLocalTime());
    }

    /**
     * Test getOtherLanguageListAsString() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsString());
    }

    /**
     * Test getOtherLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsBoolean());
    }

    /**
     * Test getOtherLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsBigInteger());
    }

    /**
     * Test getOtherLanguageListAsURL() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsURL());
    }

    /**
     * Test getOtherCountAsInteger() method.
     */
    @Test
    public void subTestGetOtherCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsInteger());
    }

    /**
     * Test getOtherCountAsLong() method.
     */
    @Test
    public void subTestGetOtherCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsLong());
    }

    /**
     * Test getOtherCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsLocalDateTime());
    }

    /**
     * Test getOtherCountAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsLocalTime());
    }

    /**
     * Test getOtherCountAsString() method.
     */
    @Test
    public void subTestGetOtherCountAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsString());
    }

    /**
     * Test getOtherCountAsBoolean() method.
     */
    @Test
    public void subTestGetOtherCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsBoolean());
    }

    /**
     * Test getOtherCountAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsBigInteger());
    }

    /**
     * Test getOtherCountAsURL() method.
     */
    @Test
    public void subTestGetOtherCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsURL());
    }

    /**
     * Test getOverallBitRateAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateAsInteger() {
        assertEquals(Integer.valueOf(56108), JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsInteger());
    }

    /**
     * Test getOverallBitRateAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateAsLong() {
        assertEquals(Long.valueOf(56108), JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsLong());
    }

    /**
     * Test getOverallBitRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsLocalTime());
    }

    /**
     * Test getOverallBitRateAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateAsString() {
        assertEquals("56108", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsString());
    }

    /**
     * Test getOverallBitRateAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsBoolean());
    }

    /**
     * Test getOverallBitRateAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateAsBigInteger() {
        assertEquals(BigInteger.valueOf(56108), JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsBigInteger());
    }

    /**
     * Test getOverallBitRateAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsURL());
    }

    /**
     * Test getOverallBitRateStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsInteger() {
        assertEquals(Integer.valueOf(561), JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsInteger());
    }

    /**
     * Test getOverallBitRateStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsLong() {
        assertEquals(Long.valueOf(561), JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsLong());
    }

    /**
     * Test getOverallBitRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsString() {
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals("56.1 kb/s", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsString());
        } else {
            assertEquals("56.1 Kbps", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsString());
        }
    }

    /**
     * Test getOverallBitRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsBoolean());
    }

    /**
     * Test getOverallBitRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(561), JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsURL());
    }

    /**
     * Test getOverallBitRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsInteger());
    }

    /**
     * Test getOverallBitRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsLong());
    }

    /**
     * Test getOverallBitRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsLocalTime());
    }

    /**
     * Test getOverallBitRateMaximumAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsString());
    }

    /**
     * Test getOverallBitRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsBoolean());
    }

    /**
     * Test getOverallBitRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsBigInteger());
    }

    /**
     * Test getOverallBitRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsURL());
    }

    /**
     * Test getOverallBitRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsInteger());
    }

    /**
     * Test getOverallBitRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsLong());
    }

    /**
     * Test getOverallBitRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsString());
    }

    /**
     * Test getOverallBitRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsBoolean());
    }

    /**
     * Test getOverallBitRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsURL());
    }

    /**
     * Test getOverallBitRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsInteger());
    }

    /**
     * Test getOverallBitRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsLong());
    }

    /**
     * Test getOverallBitRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsLocalTime());
    }

    /**
     * Test getOverallBitRateMinimumAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsString());
    }

    /**
     * Test getOverallBitRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsBoolean());
    }

    /**
     * Test getOverallBitRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsBigInteger());
    }

    /**
     * Test getOverallBitRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsURL());
    }

    /**
     * Test getOverallBitRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsInteger());
    }

    /**
     * Test getOverallBitRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsLong());
    }

    /**
     * Test getOverallBitRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsString());
    }

    /**
     * Test getOverallBitRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsBoolean());
    }

    /**
     * Test getOverallBitRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsURL());
    }

    /**
     * Test getOverallBitRateModeAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsInteger());
    }

    /**
     * Test getOverallBitRateModeAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsLong());
    }

    /**
     * Test getOverallBitRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsLocalTime());
    }

    /**
     * Test getOverallBitRateModeAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsString() {
        assertEquals("VBR", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsString());
    }

    /**
     * Test getOverallBitRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsBoolean());
    }

    /**
     * Test getOverallBitRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsBigInteger());
    }

    /**
     * Test getOverallBitRateModeAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsURL());
    }

    /**
     * Test getOverallBitRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsInteger());
    }

    /**
     * Test getOverallBitRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsLong());
    }

    /**
     * Test getOverallBitRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateModeStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsString() {
        assertEquals("Variable", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsString());
    }

    /**
     * Test getOverallBitRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsBoolean());
    }

    /**
     * Test getOverallBitRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsURL());
    }

    /**
     * Test getOverallBitRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsInteger());
    }

    /**
     * Test getOverallBitRateNominalAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsLong());
    }

    /**
     * Test getOverallBitRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsLocalTime());
    }

    /**
     * Test getOverallBitRateNominalAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsString());
    }

    /**
     * Test getOverallBitRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsBoolean());
    }

    /**
     * Test getOverallBitRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsBigInteger());
    }

    /**
     * Test getOverallBitRateNominalAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsURL());
    }

    /**
     * Test getOverallBitRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsInteger());
    }

    /**
     * Test getOverallBitRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsLong());
    }

    /**
     * Test getOverallBitRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsString());
    }

    /**
     * Test getOverallBitRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsBoolean());
    }

    /**
     * Test getOverallBitRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsURL());
    }

    /**
     * Test getOwnerAsInteger() method.
     */
    @Test
    public void subTestGetOwnerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsInteger());
    }

    /**
     * Test getOwnerAsLong() method.
     */
    @Test
    public void subTestGetOwnerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsLong());
    }

    /**
     * Test getOwnerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOwnerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsLocalDateTime());
    }

    /**
     * Test getOwnerAsLocalTime() method.
     */
    @Test
    public void subTestGetOwnerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsLocalTime());
    }

    /**
     * Test getOwnerAsString() method.
     */
    @Test
    public void subTestGetOwnerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsString());
    }

    /**
     * Test getOwnerAsBoolean() method.
     */
    @Test
    public void subTestGetOwnerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsBoolean());
    }

    /**
     * Test getOwnerAsBigInteger() method.
     */
    @Test
    public void subTestGetOwnerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsBigInteger());
    }

    /**
     * Test getOwnerAsURL() method.
     */
    @Test
    public void subTestGetOwnerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsURL());
    }

    /**
     * Test getPackageNameAsInteger() method.
     */
    @Test
    public void subTestGetPackageNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsInteger());
    }

    /**
     * Test getPackageNameAsLong() method.
     */
    @Test
    public void subTestGetPackageNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsLong());
    }

    /**
     * Test getPackageNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPackageNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsLocalDateTime());
    }

    /**
     * Test getPackageNameAsLocalTime() method.
     */
    @Test
    public void subTestGetPackageNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsLocalTime());
    }

    /**
     * Test getPackageNameAsString() method.
     */
    @Test
    public void subTestGetPackageNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsString());
    }

    /**
     * Test getPackageNameAsBoolean() method.
     */
    @Test
    public void subTestGetPackageNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsBoolean());
    }

    /**
     * Test getPackageNameAsBigInteger() method.
     */
    @Test
    public void subTestGetPackageNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsBigInteger());
    }

    /**
     * Test getPackageNameAsURL() method.
     */
    @Test
    public void subTestGetPackageNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsURL());
    }

    /**
     * Test getPartAsInteger() method.
     */
    @Test
    public void subTestGetPartAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsInteger());
    }

    /**
     * Test getPartAsLong() method.
     */
    @Test
    public void subTestGetPartAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsLong());
    }

    /**
     * Test getPartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPartAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsLocalDateTime());
    }

    /**
     * Test getPartAsLocalTime() method.
     */
    @Test
    public void subTestGetPartAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsLocalTime());
    }

    /**
     * Test getPartAsString() method.
     */
    @Test
    public void subTestGetPartAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsString());
    }

    /**
     * Test getPartAsBoolean() method.
     */
    @Test
    public void subTestGetPartAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsBoolean());
    }

    /**
     * Test getPartAsBigInteger() method.
     */
    @Test
    public void subTestGetPartAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsBigInteger());
    }

    /**
     * Test getPartAsURL() method.
     */
    @Test
    public void subTestGetPartAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsURL());
    }

    /**
     * Test getPartPositionAsInteger() method.
     */
    @Test
    public void subTestGetPartPositionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsInteger());
    }

    /**
     * Test getPartPositionAsLong() method.
     */
    @Test
    public void subTestGetPartPositionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsLong());
    }

    /**
     * Test getPartPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPartPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsLocalDateTime());
    }

    /**
     * Test getPartPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetPartPositionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsLocalTime());
    }

    /**
     * Test getPartPositionAsString() method.
     */
    @Test
    public void subTestGetPartPositionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsString());
    }

    /**
     * Test getPartPositionAsBoolean() method.
     */
    @Test
    public void subTestGetPartPositionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsBoolean());
    }

    /**
     * Test getPartPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetPartPositionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsBigInteger());
    }

    /**
     * Test getPartPositionAsURL() method.
     */
    @Test
    public void subTestGetPartPositionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsURL());
    }

    /**
     * Test getPartPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsInteger());
    }

    /**
     * Test getPartPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsLong());
    }

    /**
     * Test getPartPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsLocalDateTime());
    }

    /**
     * Test getPartPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsLocalTime());
    }

    /**
     * Test getPartPositionTotalAsString() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsString());
    }

    /**
     * Test getPartPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsBoolean());
    }

    /**
     * Test getPartPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsBigInteger());
    }

    /**
     * Test getPartPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsURL());
    }

    /**
     * Test getPerformerAsInteger() method.
     */
    @Test
    public void subTestGetPerformerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsInteger());
    }

    /**
     * Test getPerformerAsLong() method.
     */
    @Test
    public void subTestGetPerformerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsLong());
    }

    /**
     * Test getPerformerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPerformerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsLocalDateTime());
    }

    /**
     * Test getPerformerAsLocalTime() method.
     */
    @Test
    public void subTestGetPerformerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsLocalTime());
    }

    /**
     * Test getPerformerAsString() method.
     */
    @Test
    public void subTestGetPerformerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsString());
    }

    /**
     * Test getPerformerAsBoolean() method.
     */
    @Test
    public void subTestGetPerformerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsBoolean());
    }

    /**
     * Test getPerformerAsBigInteger() method.
     */
    @Test
    public void subTestGetPerformerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsBigInteger());
    }

    /**
     * Test getPerformerAsURL() method.
     */
    @Test
    public void subTestGetPerformerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsURL());
    }

    /**
     * Test getPerformerSortAsInteger() method.
     */
    @Test
    public void subTestGetPerformerSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsInteger());
    }

    /**
     * Test getPerformerSortAsLong() method.
     */
    @Test
    public void subTestGetPerformerSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsLong());
    }

    /**
     * Test getPerformerSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPerformerSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsLocalDateTime());
    }

    /**
     * Test getPerformerSortAsLocalTime() method.
     */
    @Test
    public void subTestGetPerformerSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsLocalTime());
    }

    /**
     * Test getPerformerSortAsString() method.
     */
    @Test
    public void subTestGetPerformerSortAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsString());
    }

    /**
     * Test getPerformerSortAsBoolean() method.
     */
    @Test
    public void subTestGetPerformerSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsBoolean());
    }

    /**
     * Test getPerformerSortAsBigInteger() method.
     */
    @Test
    public void subTestGetPerformerSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsBigInteger());
    }

    /**
     * Test getPerformerSortAsURL() method.
     */
    @Test
    public void subTestGetPerformerSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsURL());
    }

    /**
     * Test getPerformerUrlAsInteger() method.
     */
    @Test
    public void subTestGetPerformerUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsInteger());
    }

    /**
     * Test getPerformerUrlAsLong() method.
     */
    @Test
    public void subTestGetPerformerUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsLong());
    }

    /**
     * Test getPerformerUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPerformerUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsLocalDateTime());
    }

    /**
     * Test getPerformerUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetPerformerUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsLocalTime());
    }

    /**
     * Test getPerformerUrlAsString() method.
     */
    @Test
    public void subTestGetPerformerUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsString());
    }

    /**
     * Test getPerformerUrlAsBoolean() method.
     */
    @Test
    public void subTestGetPerformerUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsBoolean());
    }

    /**
     * Test getPerformerUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetPerformerUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsBigInteger());
    }

    /**
     * Test getPerformerUrlAsURL() method.
     */
    @Test
    public void subTestGetPerformerUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsURL());
    }

    /**
     * Test getPeriodAsInteger() method.
     */
    @Test
    public void subTestGetPeriodAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsInteger());
    }

    /**
     * Test getPeriodAsLong() method.
     */
    @Test
    public void subTestGetPeriodAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsLong());
    }

    /**
     * Test getPeriodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPeriodAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsLocalDateTime());
    }

    /**
     * Test getPeriodAsLocalTime() method.
     */
    @Test
    public void subTestGetPeriodAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsLocalTime());
    }

    /**
     * Test getPeriodAsString() method.
     */
    @Test
    public void subTestGetPeriodAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsString());
    }

    /**
     * Test getPeriodAsBoolean() method.
     */
    @Test
    public void subTestGetPeriodAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsBoolean());
    }

    /**
     * Test getPeriodAsBigInteger() method.
     */
    @Test
    public void subTestGetPeriodAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsBigInteger());
    }

    /**
     * Test getPeriodAsURL() method.
     */
    @Test
    public void subTestGetPeriodAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsURL());
    }

    /**
     * Test getPlayedCountAsInteger() method.
     */
    @Test
    public void subTestGetPlayedCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsInteger());
    }

    /**
     * Test getPlayedCountAsLong() method.
     */
    @Test
    public void subTestGetPlayedCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsLong());
    }

    /**
     * Test getPlayedCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPlayedCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsLocalDateTime());
    }

    /**
     * Test getPlayedCountAsLocalTime() method.
     */
    @Test
    public void subTestGetPlayedCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsLocalTime());
    }

    /**
     * Test getPlayedCountAsString() method.
     */
    @Test
    public void subTestGetPlayedCountAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsString());
    }

    /**
     * Test getPlayedCountAsBoolean() method.
     */
    @Test
    public void subTestGetPlayedCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsBoolean());
    }

    /**
     * Test getPlayedCountAsBigInteger() method.
     */
    @Test
    public void subTestGetPlayedCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsBigInteger());
    }

    /**
     * Test getPlayedCountAsURL() method.
     */
    @Test
    public void subTestGetPlayedCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsURL());
    }

    /**
     * Test getPlayedFirstDateAsInteger() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsInteger());
    }

    /**
     * Test getPlayedFirstDateAsLong() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsLong());
    }

    /**
     * Test getPlayedFirstDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsLocalDateTime());
    }

    /**
     * Test getPlayedFirstDateAsLocalTime() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsLocalTime());
    }

    /**
     * Test getPlayedFirstDateAsString() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsString());
    }

    /**
     * Test getPlayedFirstDateAsBoolean() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsBoolean());
    }

    /**
     * Test getPlayedFirstDateAsBigInteger() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsBigInteger());
    }

    /**
     * Test getPlayedFirstDateAsURL() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsURL());
    }

    /**
     * Test getPlayedLastDateAsInteger() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsInteger());
    }

    /**
     * Test getPlayedLastDateAsLong() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsLong());
    }

    /**
     * Test getPlayedLastDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsLocalDateTime());
    }

    /**
     * Test getPlayedLastDateAsLocalTime() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsLocalTime());
    }

    /**
     * Test getPlayedLastDateAsString() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsString());
    }

    /**
     * Test getPlayedLastDateAsBoolean() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsBoolean());
    }

    /**
     * Test getPlayedLastDateAsBigInteger() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsBigInteger());
    }

    /**
     * Test getPlayedLastDateAsURL() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsURL());
    }

    /**
     * Test getPodcastCategoryAsInteger() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsInteger());
    }

    /**
     * Test getPodcastCategoryAsLong() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsLong());
    }

    /**
     * Test getPodcastCategoryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsLocalDateTime());
    }

    /**
     * Test getPodcastCategoryAsLocalTime() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsLocalTime());
    }

    /**
     * Test getPodcastCategoryAsString() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsString());
    }

    /**
     * Test getPodcastCategoryAsBoolean() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsBoolean());
    }

    /**
     * Test getPodcastCategoryAsBigInteger() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsBigInteger());
    }

    /**
     * Test getPodcastCategoryAsURL() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsURL());
    }

    /**
     * Test getProducerAsInteger() method.
     */
    @Test
    public void subTestGetProducerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsInteger());
    }

    /**
     * Test getProducerAsLong() method.
     */
    @Test
    public void subTestGetProducerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsLong());
    }

    /**
     * Test getProducerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProducerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsLocalDateTime());
    }

    /**
     * Test getProducerAsLocalTime() method.
     */
    @Test
    public void subTestGetProducerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsLocalTime());
    }

    /**
     * Test getProducerAsString() method.
     */
    @Test
    public void subTestGetProducerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsString());
    }

    /**
     * Test getProducerAsBoolean() method.
     */
    @Test
    public void subTestGetProducerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsBoolean());
    }

    /**
     * Test getProducerAsBigInteger() method.
     */
    @Test
    public void subTestGetProducerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsBigInteger());
    }

    /**
     * Test getProducerAsURL() method.
     */
    @Test
    public void subTestGetProducerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsURL());
    }

    /**
     * Test getProducerCopyrightAsInteger() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsInteger());
    }

    /**
     * Test getProducerCopyrightAsLong() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsLong());
    }

    /**
     * Test getProducerCopyrightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsLocalDateTime());
    }

    /**
     * Test getProducerCopyrightAsLocalTime() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsLocalTime());
    }

    /**
     * Test getProducerCopyrightAsString() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsString());
    }

    /**
     * Test getProducerCopyrightAsBoolean() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsBoolean());
    }

    /**
     * Test getProducerCopyrightAsBigInteger() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsBigInteger());
    }

    /**
     * Test getProducerCopyrightAsURL() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsURL());
    }

    /**
     * Test getProductionDesignerAsInteger() method.
     */
    @Test
    public void subTestGetProductionDesignerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsInteger());
    }

    /**
     * Test getProductionDesignerAsLong() method.
     */
    @Test
    public void subTestGetProductionDesignerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsLong());
    }

    /**
     * Test getProductionDesignerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProductionDesignerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsLocalDateTime());
    }

    /**
     * Test getProductionDesignerAsLocalTime() method.
     */
    @Test
    public void subTestGetProductionDesignerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsLocalTime());
    }

    /**
     * Test getProductionDesignerAsString() method.
     */
    @Test
    public void subTestGetProductionDesignerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsString());
    }

    /**
     * Test getProductionDesignerAsBoolean() method.
     */
    @Test
    public void subTestGetProductionDesignerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsBoolean());
    }

    /**
     * Test getProductionDesignerAsBigInteger() method.
     */
    @Test
    public void subTestGetProductionDesignerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsBigInteger());
    }

    /**
     * Test getProductionDesignerAsURL() method.
     */
    @Test
    public void subTestGetProductionDesignerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsURL());
    }

    /**
     * Test getProductionStudioAsInteger() method.
     */
    @Test
    public void subTestGetProductionStudioAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsInteger());
    }

    /**
     * Test getProductionStudioAsLong() method.
     */
    @Test
    public void subTestGetProductionStudioAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsLong());
    }

    /**
     * Test getProductionStudioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProductionStudioAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsLocalDateTime());
    }

    /**
     * Test getProductionStudioAsLocalTime() method.
     */
    @Test
    public void subTestGetProductionStudioAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsLocalTime());
    }

    /**
     * Test getProductionStudioAsString() method.
     */
    @Test
    public void subTestGetProductionStudioAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsString());
    }

    /**
     * Test getProductionStudioAsBoolean() method.
     */
    @Test
    public void subTestGetProductionStudioAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsBoolean());
    }

    /**
     * Test getProductionStudioAsBigInteger() method.
     */
    @Test
    public void subTestGetProductionStudioAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsBigInteger());
    }

    /**
     * Test getProductionStudioAsURL() method.
     */
    @Test
    public void subTestGetProductionStudioAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsURL());
    }

    /**
     * Test getPublisherAsInteger() method.
     */
    @Test
    public void subTestGetPublisherAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsInteger());
    }

    /**
     * Test getPublisherAsLong() method.
     */
    @Test
    public void subTestGetPublisherAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsLong());
    }

    /**
     * Test getPublisherAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPublisherAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsLocalDateTime());
    }

    /**
     * Test getPublisherAsLocalTime() method.
     */
    @Test
    public void subTestGetPublisherAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsLocalTime());
    }

    /**
     * Test getPublisherAsString() method.
     */
    @Test
    public void subTestGetPublisherAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsString());
    }

    /**
     * Test getPublisherAsBoolean() method.
     */
    @Test
    public void subTestGetPublisherAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsBoolean());
    }

    /**
     * Test getPublisherAsBigInteger() method.
     */
    @Test
    public void subTestGetPublisherAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsBigInteger());
    }

    /**
     * Test getPublisherAsURL() method.
     */
    @Test
    public void subTestGetPublisherAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsURL());
    }

    /**
     * Test getPublisherURLAsInteger() method.
     */
    @Test
    public void subTestGetPublisherURLAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsInteger());
    }

    /**
     * Test getPublisherURLAsLong() method.
     */
    @Test
    public void subTestGetPublisherURLAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsLong());
    }

    /**
     * Test getPublisherURLAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPublisherURLAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsLocalDateTime());
    }

    /**
     * Test getPublisherURLAsLocalTime() method.
     */
    @Test
    public void subTestGetPublisherURLAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsLocalTime());
    }

    /**
     * Test getPublisherURLAsString() method.
     */
    @Test
    public void subTestGetPublisherURLAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsString());
    }

    /**
     * Test getPublisherURLAsBoolean() method.
     */
    @Test
    public void subTestGetPublisherURLAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsBoolean());
    }

    /**
     * Test getPublisherURLAsBigInteger() method.
     */
    @Test
    public void subTestGetPublisherURLAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsBigInteger());
    }

    /**
     * Test getPublisherURLAsURL() method.
     */
    @Test
    public void subTestGetPublisherURLAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsURL());
    }

    /**
     * Test getRatingAsInteger() method.
     */
    @Test
    public void subTestGetRatingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsInteger());
    }

    /**
     * Test getRatingAsLong() method.
     */
    @Test
    public void subTestGetRatingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsLong());
    }

    /**
     * Test getRatingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRatingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsLocalDateTime());
    }

    /**
     * Test getRatingAsLocalTime() method.
     */
    @Test
    public void subTestGetRatingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsLocalTime());
    }

    /**
     * Test getRatingAsString() method.
     */
    @Test
    public void subTestGetRatingAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsString());
    }

    /**
     * Test getRatingAsBoolean() method.
     */
    @Test
    public void subTestGetRatingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsBoolean());
    }

    /**
     * Test getRatingAsBigInteger() method.
     */
    @Test
    public void subTestGetRatingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsBigInteger());
    }

    /**
     * Test getRatingAsURL() method.
     */
    @Test
    public void subTestGetRatingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsURL());
    }

    /**
     * Test getRecordedDateAsInteger() method.
     */
    @Test
    public void subTestGetRecordedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsInteger());
    }

    /**
     * Test getRecordedDateAsLong() method.
     */
    @Test
    public void subTestGetRecordedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsLong());
    }

    /**
     * Test getRecordedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRecordedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsLocalDateTime());
    }

    /**
     * Test getRecordedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetRecordedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsLocalTime());
    }

    /**
     * Test getRecordedDateAsString() method.
     */
    @Test
    public void subTestGetRecordedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsString());
    }

    /**
     * Test getRecordedDateAsBoolean() method.
     */
    @Test
    public void subTestGetRecordedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsBoolean());
    }

    /**
     * Test getRecordedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetRecordedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsBigInteger());
    }

    /**
     * Test getRecordedDateAsURL() method.
     */
    @Test
    public void subTestGetRecordedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsURL());
    }

    /**
     * Test getRecordedLocationAsInteger() method.
     */
    @Test
    public void subTestGetRecordedLocationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsInteger());
    }

    /**
     * Test getRecordedLocationAsLong() method.
     */
    @Test
    public void subTestGetRecordedLocationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsLong());
    }

    /**
     * Test getRecordedLocationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRecordedLocationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsLocalDateTime());
    }

    /**
     * Test getRecordedLocationAsLocalTime() method.
     */
    @Test
    public void subTestGetRecordedLocationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsLocalTime());
    }

    /**
     * Test getRecordedLocationAsString() method.
     */
    @Test
    public void subTestGetRecordedLocationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsString());
    }

    /**
     * Test getRecordedLocationAsBoolean() method.
     */
    @Test
    public void subTestGetRecordedLocationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsBoolean());
    }

    /**
     * Test getRecordedLocationAsBigInteger() method.
     */
    @Test
    public void subTestGetRecordedLocationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsBigInteger());
    }

    /**
     * Test getRecordedLocationAsURL() method.
     */
    @Test
    public void subTestGetRecordedLocationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsURL());
    }

    /**
     * Test getReleasedDateAsInteger() method.
     */
    @Test
    public void subTestGetReleasedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsInteger());
    }

    /**
     * Test getReleasedDateAsLong() method.
     */
    @Test
    public void subTestGetReleasedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsLong());
    }

    /**
     * Test getReleasedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetReleasedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsLocalDateTime());
    }

    /**
     * Test getReleasedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetReleasedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsLocalTime());
    }

    /**
     * Test getReleasedDateAsString() method.
     */
    @Test
    public void subTestGetReleasedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsString());
    }

    /**
     * Test getReleasedDateAsBoolean() method.
     */
    @Test
    public void subTestGetReleasedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsBoolean());
    }

    /**
     * Test getReleasedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetReleasedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsBigInteger());
    }

    /**
     * Test getReleasedDateAsURL() method.
     */
    @Test
    public void subTestGetReleasedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsURL());
    }

    /**
     * Test getRemixedByAsInteger() method.
     */
    @Test
    public void subTestGetRemixedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsInteger());
    }

    /**
     * Test getRemixedByAsLong() method.
     */
    @Test
    public void subTestGetRemixedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsLong());
    }

    /**
     * Test getRemixedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRemixedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsLocalDateTime());
    }

    /**
     * Test getRemixedByAsLocalTime() method.
     */
    @Test
    public void subTestGetRemixedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsLocalTime());
    }

    /**
     * Test getRemixedByAsString() method.
     */
    @Test
    public void subTestGetRemixedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsString());
    }

    /**
     * Test getRemixedByAsBoolean() method.
     */
    @Test
    public void subTestGetRemixedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsBoolean());
    }

    /**
     * Test getRemixedByAsBigInteger() method.
     */
    @Test
    public void subTestGetRemixedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsBigInteger());
    }

    /**
     * Test getRemixedByAsURL() method.
     */
    @Test
    public void subTestGetRemixedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsURL());
    }

    /**
     * Test getScreenplayByAsInteger() method.
     */
    @Test
    public void subTestGetScreenplayByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsInteger());
    }

    /**
     * Test getScreenplayByAsLong() method.
     */
    @Test
    public void subTestGetScreenplayByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsLong());
    }

    /**
     * Test getScreenplayByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScreenplayByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsLocalDateTime());
    }

    /**
     * Test getScreenplayByAsLocalTime() method.
     */
    @Test
    public void subTestGetScreenplayByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsLocalTime());
    }

    /**
     * Test getScreenplayByAsString() method.
     */
    @Test
    public void subTestGetScreenplayByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsString());
    }

    /**
     * Test getScreenplayByAsBoolean() method.
     */
    @Test
    public void subTestGetScreenplayByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsBoolean());
    }

    /**
     * Test getScreenplayByAsBigInteger() method.
     */
    @Test
    public void subTestGetScreenplayByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsBigInteger());
    }

    /**
     * Test getScreenplayByAsURL() method.
     */
    @Test
    public void subTestGetScreenplayByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsURL());
    }

    /**
     * Test getSeasonAsInteger() method.
     */
    @Test
    public void subTestGetSeasonAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsInteger());
    }

    /**
     * Test getSeasonAsLong() method.
     */
    @Test
    public void subTestGetSeasonAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsLong());
    }

    /**
     * Test getSeasonAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSeasonAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsLocalDateTime());
    }

    /**
     * Test getSeasonAsLocalTime() method.
     */
    @Test
    public void subTestGetSeasonAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsLocalTime());
    }

    /**
     * Test getSeasonAsString() method.
     */
    @Test
    public void subTestGetSeasonAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsString());
    }

    /**
     * Test getSeasonAsBoolean() method.
     */
    @Test
    public void subTestGetSeasonAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsBoolean());
    }

    /**
     * Test getSeasonAsBigInteger() method.
     */
    @Test
    public void subTestGetSeasonAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsBigInteger());
    }

    /**
     * Test getSeasonAsURL() method.
     */
    @Test
    public void subTestGetSeasonAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsURL());
    }

    /**
     * Test getSeasonPositionAsInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsInteger());
    }

    /**
     * Test getSeasonPositionAsLong() method.
     */
    @Test
    public void subTestGetSeasonPositionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsLong());
    }

    /**
     * Test getSeasonPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSeasonPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsLocalDateTime());
    }

    /**
     * Test getSeasonPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetSeasonPositionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsLocalTime());
    }

    /**
     * Test getSeasonPositionAsString() method.
     */
    @Test
    public void subTestGetSeasonPositionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsString());
    }

    /**
     * Test getSeasonPositionAsBoolean() method.
     */
    @Test
    public void subTestGetSeasonPositionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsBoolean());
    }

    /**
     * Test getSeasonPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsBigInteger());
    }

    /**
     * Test getSeasonPositionAsURL() method.
     */
    @Test
    public void subTestGetSeasonPositionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsURL());
    }

    /**
     * Test getSeasonPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsInteger());
    }

    /**
     * Test getSeasonPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsLong());
    }

    /**
     * Test getSeasonPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsLocalDateTime());
    }

    /**
     * Test getSeasonPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsLocalTime());
    }

    /**
     * Test getSeasonPositionTotalAsString() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsString());
    }

    /**
     * Test getSeasonPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsBoolean());
    }

    /**
     * Test getSeasonPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsBigInteger());
    }

    /**
     * Test getSeasonPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsURL());
    }

    /**
     * Test getServiceUrlAsInteger() method.
     */
    @Test
    public void subTestGetServiceUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsInteger());
    }

    /**
     * Test getServiceUrlAsLong() method.
     */
    @Test
    public void subTestGetServiceUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsLong());
    }

    /**
     * Test getServiceUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsLocalDateTime());
    }

    /**
     * Test getServiceUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsLocalTime());
    }

    /**
     * Test getServiceUrlAsString() method.
     */
    @Test
    public void subTestGetServiceUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsString());
    }

    /**
     * Test getServiceUrlAsBoolean() method.
     */
    @Test
    public void subTestGetServiceUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsBoolean());
    }

    /**
     * Test getServiceUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsBigInteger());
    }

    /**
     * Test getServiceUrlAsURL() method.
     */
    @Test
    public void subTestGetServiceUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsURL());
    }

    /**
     * Test getServiceChannelAsInteger() method.
     */
    @Test
    public void subTestGetServiceChannelAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsInteger());
    }

    /**
     * Test getServiceChannelAsLong() method.
     */
    @Test
    public void subTestGetServiceChannelAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsLong());
    }

    /**
     * Test getServiceChannelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceChannelAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsLocalDateTime());
    }

    /**
     * Test getServiceChannelAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceChannelAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsLocalTime());
    }

    /**
     * Test getServiceChannelAsString() method.
     */
    @Test
    public void subTestGetServiceChannelAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsString());
    }

    /**
     * Test getServiceChannelAsBoolean() method.
     */
    @Test
    public void subTestGetServiceChannelAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsBoolean());
    }

    /**
     * Test getServiceChannelAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceChannelAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsBigInteger());
    }

    /**
     * Test getServiceChannelAsURL() method.
     */
    @Test
    public void subTestGetServiceChannelAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsURL());
    }

    /**
     * Test getServiceNameAsInteger() method.
     */
    @Test
    public void subTestGetServiceNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsInteger());
    }

    /**
     * Test getServiceNameAsLong() method.
     */
    @Test
    public void subTestGetServiceNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsLong());
    }

    /**
     * Test getServiceNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsLocalDateTime());
    }

    /**
     * Test getServiceNameAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsLocalTime());
    }

    /**
     * Test getServiceNameAsString() method.
     */
    @Test
    public void subTestGetServiceNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsString());
    }

    /**
     * Test getServiceNameAsBoolean() method.
     */
    @Test
    public void subTestGetServiceNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsBoolean());
    }

    /**
     * Test getServiceNameAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsBigInteger());
    }

    /**
     * Test getServiceNameAsURL() method.
     */
    @Test
    public void subTestGetServiceNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsURL());
    }

    /**
     * Test getServiceProviderAsInteger() method.
     */
    @Test
    public void subTestGetServiceProviderAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsInteger());
    }

    /**
     * Test getServiceProviderAsLong() method.
     */
    @Test
    public void subTestGetServiceProviderAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsLong());
    }

    /**
     * Test getServiceProviderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceProviderAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsLocalDateTime());
    }

    /**
     * Test getServiceProviderAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceProviderAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsLocalTime());
    }

    /**
     * Test getServiceProviderAsString() method.
     */
    @Test
    public void subTestGetServiceProviderAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsString());
    }

    /**
     * Test getServiceProviderAsBoolean() method.
     */
    @Test
    public void subTestGetServiceProviderAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsBoolean());
    }

    /**
     * Test getServiceProviderAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceProviderAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsBigInteger());
    }

    /**
     * Test getServiceProviderAsURL() method.
     */
    @Test
    public void subTestGetServiceProviderAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsURL());
    }

    /**
     * Test getServiceProviderrUrlAsInteger() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsInteger());
    }

    /**
     * Test getServiceProviderrUrlAsLong() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsLong());
    }

    /**
     * Test getServiceProviderrUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsLocalDateTime());
    }

    /**
     * Test getServiceProviderrUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsLocalTime());
    }

    /**
     * Test getServiceProviderrUrlAsString() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsString());
    }

    /**
     * Test getServiceProviderrUrlAsBoolean() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsBoolean());
    }

    /**
     * Test getServiceProviderrUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsBigInteger());
    }

    /**
     * Test getServiceProviderrUrlAsURL() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsURL());
    }

    /**
     * Test getServiceTypeAsInteger() method.
     */
    @Test
    public void subTestGetServiceTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsInteger());
    }

    /**
     * Test getServiceTypeAsLong() method.
     */
    @Test
    public void subTestGetServiceTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsLong());
    }

    /**
     * Test getServiceTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsLocalDateTime());
    }

    /**
     * Test getServiceTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsLocalTime());
    }

    /**
     * Test getServiceTypeAsString() method.
     */
    @Test
    public void subTestGetServiceTypeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsString());
    }

    /**
     * Test getServiceTypeAsBoolean() method.
     */
    @Test
    public void subTestGetServiceTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsBoolean());
    }

    /**
     * Test getServiceTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsBigInteger());
    }

    /**
     * Test getServiceTypeAsURL() method.
     */
    @Test
    public void subTestGetServiceTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsURL());
    }

    /**
     * Test getSoundEngineerAsInteger() method.
     */
    @Test
    public void subTestGetSoundEngineerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsInteger());
    }

    /**
     * Test getSoundEngineerAsLong() method.
     */
    @Test
    public void subTestGetSoundEngineerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsLong());
    }

    /**
     * Test getSoundEngineerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSoundEngineerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsLocalDateTime());
    }

    /**
     * Test getSoundEngineerAsLocalTime() method.
     */
    @Test
    public void subTestGetSoundEngineerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsLocalTime());
    }

    /**
     * Test getSoundEngineerAsString() method.
     */
    @Test
    public void subTestGetSoundEngineerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsString());
    }

    /**
     * Test getSoundEngineerAsBoolean() method.
     */
    @Test
    public void subTestGetSoundEngineerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsBoolean());
    }

    /**
     * Test getSoundEngineerAsBigInteger() method.
     */
    @Test
    public void subTestGetSoundEngineerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsBigInteger());
    }

    /**
     * Test getSoundEngineerAsURL() method.
     */
    @Test
    public void subTestGetSoundEngineerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsURL());
    }

    /**
     * Test getStatusAsInteger() method.
     */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsInteger());
    }

    /**
     * Test getStatusAsLong() method.
     */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsLong());
    }

    /**
     * Test getStatusAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsLocalDateTime());
    }

    /**
     * Test getStatusAsLocalTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsLocalTime());
    }

    /**
     * Test getStatusAsString() method.
     */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsString());
    }

    /**
     * Test getStatusAsBoolean() method.
     */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsBoolean());
    }

    /**
     * Test getStatusAsBigInteger() method.
     */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsBigInteger());
    }

    /**
     * Test getStatusAsURL() method.
     */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsURL());
    }

    /**
     * Test getStreamCountAsInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsInteger());
    }

    /**
     * Test getStreamCountAsLong() method.
     */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsLong());
    }

    /**
     * Test getStreamCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsLocalDateTime());
    }

    /**
     * Test getStreamCountAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsLocalTime());
    }

    /**
     * Test getStreamCountAsString() method.
     */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals("1", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsString());
    }

    /**
     * Test getStreamCountAsBoolean() method.
     */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsBoolean());
    }

    /**
     * Test getStreamCountAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsBigInteger());
    }

    /**
     * Test getStreamCountAsURL() method.
     */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsURL());
    }

    /**
     * Test getStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsInteger());
    }

    /**
     * Test getStreamKindAsLong() method.
     */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsLong());
    }

    /**
     * Test getStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsLocalDateTime());
    }

    /**
     * Test getStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsLocalTime());
    }

    /**
     * Test getStreamKindAsString() method.
     */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals("General", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsString());
    }

    /**
     * Test getStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsBoolean());
    }

    /**
     * Test getStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsBigInteger());
    }

    /**
     * Test getStreamKindAsURL() method.
     */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsURL());
    }

    /**
     * Test getStreamKindStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsInteger());
    }

    /**
     * Test getStreamKindStringAsLong() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsLong());
    }

    /**
     * Test getStreamKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsLocalDateTime());
    }

    /**
     * Test getStreamKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsLocalTime());
    }

    /**
     * Test getStreamKindStringAsString() method.
     */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals("General", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsString());
    }

    /**
     * Test getStreamKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsBoolean());
    }

    /**
     * Test getStreamKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsBigInteger());
    }

    /**
     * Test getStreamKindStringAsURL() method.
     */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsURL());
    }

    /**
     * Test getStreamKindIDAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(Integer.valueOf(0), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsInteger());
    }

    /**
     * Test getStreamKindIDAsLong() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(Long.valueOf(0), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsLong());
    }

    /**
     * Test getStreamKindIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsLocalDateTime());
    }

    /**
     * Test getStreamKindIDAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsLocalTime());
    }

    /**
     * Test getStreamKindIDAsString() method.
     */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals("0", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsString());
    }

    /**
     * Test getStreamKindIDAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsBoolean());
    }

    /**
     * Test getStreamKindIDAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(0), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsBigInteger());
    }

    /**
     * Test getStreamKindIDAsURL() method.
     */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsURL());
    }

    /**
     * Test getStreamKindPosAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsInteger());
    }

    /**
     * Test getStreamKindPosAsLong() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsLong());
    }

    /**
     * Test getStreamKindPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsLocalDateTime());
    }

    /**
     * Test getStreamKindPosAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsLocalTime());
    }

    /**
     * Test getStreamKindPosAsString() method.
     */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsString());
    }

    /**
     * Test getStreamKindPosAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsBoolean());
    }

    /**
     * Test getStreamKindPosAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsBigInteger());
    }

    /**
     * Test getStreamKindPosAsURL() method.
     */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsURL());
    }

    /**
     * Test getStreamOrderAsInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsInteger());
    }

    /**
     * Test getStreamOrderAsLong() method.
     */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsLong());
    }

    /**
     * Test getStreamOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsLocalDateTime());
    }

    /**
     * Test getStreamOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsLocalTime());
    }

    /**
     * Test getStreamOrderAsString() method.
     */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsString());
    }

    /**
     * Test getStreamOrderAsBoolean() method.
     */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsBoolean());
    }

    /**
     * Test getStreamOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsBigInteger());
    }

    /**
     * Test getStreamOrderAsURL() method.
     */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsURL());
    }

    /**
     * Test getStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsInteger());
    }

    /**
     * Test getStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsLong());
    }

    /**
     * Test getStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsLocalDateTime());
    }

    /**
     * Test getStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsLocalTime());
    }

    /**
     * Test getStreamSizeAsString() method.
     */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsString());
    }

    /**
     * Test getStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsBoolean());
    }

    /**
     * Test getStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsBigInteger());
    }

    /**
     * Test getStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsURL());
    }

    /**
     * Test getStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsInteger());
    }

    /**
     * Test getStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsLong());
    }

    /**
     * Test getStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsLocalTime());
    }

    /**
     * Test getStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsString());
    }

    /**
     * Test getStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsBoolean());
    }

    /**
     * Test getStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsBigInteger());
    }

    /**
     * Test getStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsURL());
    }

    /**
     * Test getStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsInteger());
    }

    /**
     * Test getStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsLong());
    }

    /**
     * Test getStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsLocalTime());
    }

    /**
     * Test getStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsString());
    }

    /**
     * Test getStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsBoolean());
    }

    /**
     * Test getStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsBigInteger());
    }

    /**
     * Test getStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsURL());
    }

    /**
     * Test getStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsInteger());
    }

    /**
     * Test getStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsLong());
    }

    /**
     * Test getStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsLocalTime());
    }

    /**
     * Test getStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsString());
    }

    /**
     * Test getStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsBoolean());
    }

    /**
     * Test getStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsBigInteger());
    }

    /**
     * Test getStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsURL());
    }

    /**
     * Test getStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsInteger());
    }

    /**
     * Test getStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsLong());
    }

    /**
     * Test getStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsLocalTime());
    }

    /**
     * Test getStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsString());
    }

    /**
     * Test getStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsBoolean());
    }

    /**
     * Test getStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsBigInteger());
    }

    /**
     * Test getStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsURL());
    }

    /**
     * Test getStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsInteger());
    }

    /**
     * Test getStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsLong());
    }

    /**
     * Test getStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsLocalTime());
    }

    /**
     * Test getStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsString());
    }

    /**
     * Test getStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsBoolean());
    }

    /**
     * Test getStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsBigInteger());
    }

    /**
     * Test getStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsURL());
    }

    /**
     * Test getStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsInteger());
    }

    /**
     * Test getStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsLong());
    }

    /**
     * Test getStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsLocalTime());
    }

    /**
     * Test getStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsString());
    }

    /**
     * Test getStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsBoolean());
    }

    /**
     * Test getStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsBigInteger());
    }

    /**
     * Test getStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsURL());
    }

    /**
     * Test getStreamSizeDemuxedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsLong());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsString());
    }

    /**
     * Test getStreamSizeDemuxedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsURL());
    }

    /**
     * Test getStreamSizeDemuxedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsLong());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsString());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsURL());
    }

    /**
     * Test getStreamSizeDemuxedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsString());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsString());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsString());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsString());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsString());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsURL());
    }

    /**
     * Test getStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsInteger());
    }

    /**
     * Test getStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsLong());
    }

    /**
     * Test getStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsString());
    }

    /**
     * Test getStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsBoolean());
    }

    /**
     * Test getStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsURL());
    }

    /**
     * Test getSubjectAsInteger() method.
     */
    @Test
    public void subTestGetSubjectAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsInteger());
    }

    /**
     * Test getSubjectAsLong() method.
     */
    @Test
    public void subTestGetSubjectAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsLong());
    }

    /**
     * Test getSubjectAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSubjectAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsLocalDateTime());
    }

    /**
     * Test getSubjectAsLocalTime() method.
     */
    @Test
    public void subTestGetSubjectAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsLocalTime());
    }

    /**
     * Test getSubjectAsString() method.
     */
    @Test
    public void subTestGetSubjectAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsString());
    }

    /**
     * Test getSubjectAsBoolean() method.
     */
    @Test
    public void subTestGetSubjectAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsBoolean());
    }

    /**
     * Test getSubjectAsBigInteger() method.
     */
    @Test
    public void subTestGetSubjectAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsBigInteger());
    }

    /**
     * Test getSubjectAsURL() method.
     */
    @Test
    public void subTestGetSubjectAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsURL());
    }

    /**
     * Test getSubTrackAsInteger() method.
     */
    @Test
    public void subTestGetSubTrackAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsInteger());
    }

    /**
     * Test getSubTrackAsLong() method.
     */
    @Test
    public void subTestGetSubTrackAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsLong());
    }

    /**
     * Test getSubTrackAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSubTrackAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsLocalDateTime());
    }

    /**
     * Test getSubTrackAsLocalTime() method.
     */
    @Test
    public void subTestGetSubTrackAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsLocalTime());
    }

    /**
     * Test getSubTrackAsString() method.
     */
    @Test
    public void subTestGetSubTrackAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsString());
    }

    /**
     * Test getSubTrackAsBoolean() method.
     */
    @Test
    public void subTestGetSubTrackAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsBoolean());
    }

    /**
     * Test getSubTrackAsBigInteger() method.
     */
    @Test
    public void subTestGetSubTrackAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsBigInteger());
    }

    /**
     * Test getSubTrackAsURL() method.
     */
    @Test
    public void subTestGetSubTrackAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsURL());
    }

    /**
     * Test getSummaryAsInteger() method.
     */
    @Test
    public void subTestGetSummaryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsInteger());
    }

    /**
     * Test getSummaryAsLong() method.
     */
    @Test
    public void subTestGetSummaryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsLong());
    }

    /**
     * Test getSummaryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSummaryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsLocalDateTime());
    }

    /**
     * Test getSummaryAsLocalTime() method.
     */
    @Test
    public void subTestGetSummaryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsLocalTime());
    }

    /**
     * Test getSummaryAsString() method.
     */
    @Test
    public void subTestGetSummaryAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsString());
    }

    /**
     * Test getSummaryAsBoolean() method.
     */
    @Test
    public void subTestGetSummaryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsBoolean());
    }

    /**
     * Test getSummaryAsBigInteger() method.
     */
    @Test
    public void subTestGetSummaryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsBigInteger());
    }

    /**
     * Test getSummaryAsURL() method.
     */
    @Test
    public void subTestGetSummaryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsURL());
    }

    /**
     * Test getSynopsisAsInteger() method.
     */
    @Test
    public void subTestGetSynopsisAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsInteger());
    }

    /**
     * Test getSynopsisAsLong() method.
     */
    @Test
    public void subTestGetSynopsisAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsLong());
    }

    /**
     * Test getSynopsisAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSynopsisAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsLocalDateTime());
    }

    /**
     * Test getSynopsisAsLocalTime() method.
     */
    @Test
    public void subTestGetSynopsisAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsLocalTime());
    }

    /**
     * Test getSynopsisAsString() method.
     */
    @Test
    public void subTestGetSynopsisAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsString());
    }

    /**
     * Test getSynopsisAsBoolean() method.
     */
    @Test
    public void subTestGetSynopsisAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsBoolean());
    }

    /**
     * Test getSynopsisAsBigInteger() method.
     */
    @Test
    public void subTestGetSynopsisAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsBigInteger());
    }

    /**
     * Test getSynopsisAsURL() method.
     */
    @Test
    public void subTestGetSynopsisAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsURL());
    }

    /**
     * Test getTaggedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsInteger());
    }

    /**
     * Test getTaggedApplicationAsLong() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsLong());
    }

    /**
     * Test getTaggedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsLocalDateTime());
    }

    /**
     * Test getTaggedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsLocalTime());
    }

    /**
     * Test getTaggedApplicationAsString() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsString());
    }

    /**
     * Test getTaggedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsBoolean());
    }

    /**
     * Test getTaggedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsBigInteger());
    }

    /**
     * Test getTaggedApplicationAsURL() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsURL());
    }

    /**
     * Test getTaggedDateAsInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsInteger());
    }

    /**
     * Test getTaggedDateAsLong() method.
     */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsLong());
    }

    /**
     * Test getTaggedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsLocalDateTime());
    }

    /**
     * Test getTaggedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsLocalTime());
    }

    /**
     * Test getTaggedDateAsString() method.
     */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsString());
    }

    /**
     * Test getTaggedDateAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsBoolean());
    }

    /**
     * Test getTaggedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsBigInteger());
    }

    /**
     * Test getTaggedDateAsURL() method.
     */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsURL());
    }

    /**
     * Test getTermsOfUseAsInteger() method.
     */
    @Test
    public void subTestGetTermsOfUseAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsInteger());
    }

    /**
     * Test getTermsOfUseAsLong() method.
     */
    @Test
    public void subTestGetTermsOfUseAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsLong());
    }

    /**
     * Test getTermsOfUseAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTermsOfUseAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsLocalDateTime());
    }

    /**
     * Test getTermsOfUseAsLocalTime() method.
     */
    @Test
    public void subTestGetTermsOfUseAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsLocalTime());
    }

    /**
     * Test getTermsOfUseAsString() method.
     */
    @Test
    public void subTestGetTermsOfUseAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsString());
    }

    /**
     * Test getTermsOfUseAsBoolean() method.
     */
    @Test
    public void subTestGetTermsOfUseAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsBoolean());
    }

    /**
     * Test getTermsOfUseAsBigInteger() method.
     */
    @Test
    public void subTestGetTermsOfUseAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsBigInteger());
    }

    /**
     * Test getTermsOfUseAsURL() method.
     */
    @Test
    public void subTestGetTermsOfUseAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsURL());
    }

    /**
     * Test getTextFormatListAsInteger() method.
     */
    @Test
    public void subTestGetTextFormatListAsInteger() {
        assertEquals(Integer.valueOf(88888888), JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsInteger());
    }

    /**
     * Test getTextFormatListAsLong() method.
     */
    @Test
    public void subTestGetTextFormatListAsLong() {
        assertEquals(Long.valueOf(88888888), JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsLong());
    }

    /**
     * Test getTextFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsLocalDateTime());
    }

    /**
     * Test getTextFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetTextFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsLocalTime());
    }

    /**
     * Test getTextFormatListAsString() method.
     */
    @Test
    public void subTestGetTextFormatListAsString() {
        assertEquals("UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8", JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsString());
    }

    /**
     * Test getTextFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetTextFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsBoolean());
    }

    /**
     * Test getTextFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetTextFormatListAsBigInteger() {
        assertEquals(BigInteger.valueOf(88888888), JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsBigInteger());
    }

    /**
     * Test getTextFormatListAsURL() method.
     */
    @Test
    public void subTestGetTextFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsURL());
    }

    /**
     * Test getTextFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsInteger() {
        assertEquals(Integer.valueOf(88888888), JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsInteger());
    }

    /**
     * Test getTextFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsLong() {
        assertEquals(Long.valueOf(88888888), JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsLong());
    }

    /**
     * Test getTextFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getTextFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsLocalTime());
    }

    /**
     * Test getTextFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsString() {
        assertEquals("UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8 / UTF-8", JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsString());
    }

    /**
     * Test getTextFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsBoolean());
    }

    /**
     * Test getTextFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsBigInteger() {
        assertEquals(BigInteger.valueOf(88888888), JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsBigInteger());
    }

    /**
     * Test getTextFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsURL());
    }

    /**
     * Test getTextLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetTextLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsInteger());
    }

    /**
     * Test getTextLanguageListAsLong() method.
     */
    @Test
    public void subTestGetTextLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsLong());
    }

    /**
     * Test getTextLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsLocalDateTime());
    }

    /**
     * Test getTextLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetTextLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsLocalTime());
    }

    /**
     * Test getTextLanguageListAsString() method.
     */
    @Test
    public void subTestGetTextLanguageListAsString() {
        assertEquals("English / German / Spanish / French / Dutch / Portuguese / Japanese / Chinese", JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsString());
    }

    /**
     * Test getTextLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetTextLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsBoolean());
    }

    /**
     * Test getTextLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetTextLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsBigInteger());
    }

    /**
     * Test getTextLanguageListAsURL() method.
     */
    @Test
    public void subTestGetTextLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsURL());
    }

    /**
     * Test getTextCountAsInteger() method.
     */
    @Test
    public void subTestGetTextCountAsInteger() {
        assertEquals(Integer.valueOf(8), JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsInteger());
    }

    /**
     * Test getTextCountAsLong() method.
     */
    @Test
    public void subTestGetTextCountAsLong() {
        assertEquals(Long.valueOf(8), JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsLong());
    }

    /**
     * Test getTextCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsLocalDateTime());
    }

    /**
     * Test getTextCountAsLocalTime() method.
     */
    @Test
    public void subTestGetTextCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsLocalTime());
    }

    /**
     * Test getTextCountAsString() method.
     */
    @Test
    public void subTestGetTextCountAsString() {
        assertEquals("8", JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsString());
    }

    /**
     * Test getTextCountAsBoolean() method.
     */
    @Test
    public void subTestGetTextCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsBoolean());
    }

    /**
     * Test getTextCountAsBigInteger() method.
     */
    @Test
    public void subTestGetTextCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(8), JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsBigInteger());
    }

    /**
     * Test getTextCountAsURL() method.
     */
    @Test
    public void subTestGetTextCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsURL());
    }

    /**
     * Test getThanksToAsInteger() method.
     */
    @Test
    public void subTestGetThanksToAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsInteger());
    }

    /**
     * Test getThanksToAsLong() method.
     */
    @Test
    public void subTestGetThanksToAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsLong());
    }

    /**
     * Test getThanksToAsLocalDateTime() method.
     */
    @Test
    public void subTestGetThanksToAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsLocalDateTime());
    }

    /**
     * Test getThanksToAsLocalTime() method.
     */
    @Test
    public void subTestGetThanksToAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsLocalTime());
    }

    /**
     * Test getThanksToAsString() method.
     */
    @Test
    public void subTestGetThanksToAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsString());
    }

    /**
     * Test getThanksToAsBoolean() method.
     */
    @Test
    public void subTestGetThanksToAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsBoolean());
    }

    /**
     * Test getThanksToAsBigInteger() method.
     */
    @Test
    public void subTestGetThanksToAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsBigInteger());
    }

    /**
     * Test getThanksToAsURL() method.
     */
    @Test
    public void subTestGetThanksToAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsURL());
    }

    /**
     * Test getTimeZoneAsInteger() method.
     */
    @Test
    public void subTestGetTimeZoneAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsInteger());
    }

    /**
     * Test getTimeZoneAsLong() method.
     */
    @Test
    public void subTestGetTimeZoneAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsLong());
    }

    /**
     * Test getTimeZoneAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeZoneAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsLocalDateTime());
    }

    /**
     * Test getTimeZoneAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeZoneAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsLocalTime());
    }

    /**
     * Test getTimeZoneAsString() method.
     */
    @Test
    public void subTestGetTimeZoneAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsString());
    }

    /**
     * Test getTimeZoneAsBoolean() method.
     */
    @Test
    public void subTestGetTimeZoneAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsBoolean());
    }

    /**
     * Test getTimeZoneAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeZoneAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsBigInteger());
    }

    /**
     * Test getTimeZoneAsURL() method.
     */
    @Test
    public void subTestGetTimeZoneAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsURL());
    }

    /**
     * Test getTitleAsInteger() method.
     */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsInteger());
    }

    /**
     * Test getTitleAsLong() method.
     */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsLong());
    }

    /**
     * Test getTitleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsLocalDateTime());
    }

    /**
     * Test getTitleAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsLocalTime());
    }

    /**
     * Test getTitleAsString() method.
     */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals("Sintel", JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsString());
    }

    /**
     * Test getTitleAsBoolean() method.
     */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsBoolean());
    }

    /**
     * Test getTitleAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsBigInteger());
    }

    /**
     * Test getTitleAsURL() method.
     */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsURL());
    }

    /**
     * Test getTitleUrlAsInteger() method.
     */
    @Test
    public void subTestGetTitleUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsInteger());
    }

    /**
     * Test getTitleUrlAsLong() method.
     */
    @Test
    public void subTestGetTitleUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsLong());
    }

    /**
     * Test getTitleUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsLocalDateTime());
    }

    /**
     * Test getTitleUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsLocalTime());
    }

    /**
     * Test getTitleUrlAsString() method.
     */
    @Test
    public void subTestGetTitleUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsString());
    }

    /**
     * Test getTitleUrlAsBoolean() method.
     */
    @Test
    public void subTestGetTitleUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsBoolean());
    }

    /**
     * Test getTitleUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsBigInteger());
    }

    /**
     * Test getTitleUrlAsURL() method.
     */
    @Test
    public void subTestGetTitleUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsURL());
    }

    /**
     * Test getTitleMoreAsInteger() method.
     */
    @Test
    public void subTestGetTitleMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsInteger());
    }

    /**
     * Test getTitleMoreAsLong() method.
     */
    @Test
    public void subTestGetTitleMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsLong());
    }

    /**
     * Test getTitleMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsLocalDateTime());
    }

    /**
     * Test getTitleMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsLocalTime());
    }

    /**
     * Test getTitleMoreAsString() method.
     */
    @Test
    public void subTestGetTitleMoreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsString());
    }

    /**
     * Test getTitleMoreAsBoolean() method.
     */
    @Test
    public void subTestGetTitleMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsBoolean());
    }

    /**
     * Test getTitleMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsBigInteger());
    }

    /**
     * Test getTitleMoreAsURL() method.
     */
    @Test
    public void subTestGetTitleMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsURL());
    }

    /**
     * Test getTrackAsInteger() method.
     */
    @Test
    public void subTestGetTrackAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsInteger());
    }

    /**
     * Test getTrackAsLong() method.
     */
    @Test
    public void subTestGetTrackAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsLong());
    }

    /**
     * Test getTrackAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsLocalDateTime());
    }

    /**
     * Test getTrackAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsLocalTime());
    }

    /**
     * Test getTrackAsString() method.
     */
    @Test
    public void subTestGetTrackAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsString());
    }

    /**
     * Test getTrackAsBoolean() method.
     */
    @Test
    public void subTestGetTrackAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsBoolean());
    }

    /**
     * Test getTrackAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsBigInteger());
    }

    /**
     * Test getTrackAsURL() method.
     */
    @Test
    public void subTestGetTrackAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsURL());
    }

    /**
     * Test getTrackPositionAsInteger() method.
     */
    @Test
    public void subTestGetTrackPositionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsInteger());
    }

    /**
     * Test getTrackPositionAsLong() method.
     */
    @Test
    public void subTestGetTrackPositionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsLong());
    }

    /**
     * Test getTrackPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsLocalDateTime());
    }

    /**
     * Test getTrackPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackPositionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsLocalTime());
    }

    /**
     * Test getTrackPositionAsString() method.
     */
    @Test
    public void subTestGetTrackPositionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsString());
    }

    /**
     * Test getTrackPositionAsBoolean() method.
     */
    @Test
    public void subTestGetTrackPositionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsBoolean());
    }

    /**
     * Test getTrackPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackPositionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsBigInteger());
    }

    /**
     * Test getTrackPositionAsURL() method.
     */
    @Test
    public void subTestGetTrackPositionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsURL());
    }

    /**
     * Test getTrackPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsInteger());
    }

    /**
     * Test getTrackPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsLong());
    }

    /**
     * Test getTrackPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsLocalDateTime());
    }

    /**
     * Test getTrackPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsLocalTime());
    }

    /**
     * Test getTrackPositionTotalAsString() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsString());
    }

    /**
     * Test getTrackPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsBoolean());
    }

    /**
     * Test getTrackPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsBigInteger());
    }

    /**
     * Test getTrackPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsURL());
    }

    /**
     * Test getTrackSortAsInteger() method.
     */
    @Test
    public void subTestGetTrackSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsInteger());
    }

    /**
     * Test getTrackSortAsLong() method.
     */
    @Test
    public void subTestGetTrackSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsLong());
    }

    /**
     * Test getTrackSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsLocalDateTime());
    }

    /**
     * Test getTrackSortAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsLocalTime());
    }

    /**
     * Test getTrackSortAsString() method.
     */
    @Test
    public void subTestGetTrackSortAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsString());
    }

    /**
     * Test getTrackSortAsBoolean() method.
     */
    @Test
    public void subTestGetTrackSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsBoolean());
    }

    /**
     * Test getTrackSortAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsBigInteger());
    }

    /**
     * Test getTrackSortAsURL() method.
     */
    @Test
    public void subTestGetTrackSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsURL());
    }

    /**
     * Test getTrackUrlAsInteger() method.
     */
    @Test
    public void subTestGetTrackUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsInteger());
    }

    /**
     * Test getTrackUrlAsLong() method.
     */
    @Test
    public void subTestGetTrackUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsLong());
    }

    /**
     * Test getTrackUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsLocalDateTime());
    }

    /**
     * Test getTrackUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsLocalTime());
    }

    /**
     * Test getTrackUrlAsString() method.
     */
    @Test
    public void subTestGetTrackUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsString());
    }

    /**
     * Test getTrackUrlAsBoolean() method.
     */
    @Test
    public void subTestGetTrackUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsBoolean());
    }

    /**
     * Test getTrackUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsBigInteger());
    }

    /**
     * Test getTrackUrlAsURL() method.
     */
    @Test
    public void subTestGetTrackUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsURL());
    }

    /**
     * Test getTrackMoreAsInteger() method.
     */
    @Test
    public void subTestGetTrackMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsInteger());
    }

    /**
     * Test getTrackMoreAsLong() method.
     */
    @Test
    public void subTestGetTrackMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsLong());
    }

    /**
     * Test getTrackMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsLocalDateTime());
    }

    /**
     * Test getTrackMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsLocalTime());
    }

    /**
     * Test getTrackMoreAsString() method.
     */
    @Test
    public void subTestGetTrackMoreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsString());
    }

    /**
     * Test getTrackMoreAsBoolean() method.
     */
    @Test
    public void subTestGetTrackMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsBoolean());
    }

    /**
     * Test getTrackMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsBigInteger());
    }

    /**
     * Test getTrackMoreAsURL() method.
     */
    @Test
    public void subTestGetTrackMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsURL());
    }

    /**
     * Test getUniqueIDAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsInteger());
    }

    /**
     * Test getUniqueIDAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsLong());
    }

    /**
     * Test getUniqueIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsLocalDateTime());
    }

    /**
     * Test getUniqueIDAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsLocalTime());
    }

    /**
     * Test getUniqueIDAsString() method.
     */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals("137322532605887224126354371500740408252", JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsString());
    }

    /**
     * Test getUniqueIDAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsBoolean());
    }

    /**
     * Test getUniqueIDAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(new BigInteger("137322532605887224126354371500740408252"), JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsBigInteger());
    }

    /**
     * Test getUniqueIDAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsURL());
    }

    /**
     * Test getUniqueIDStringAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsInteger());
    }

    /**
     * Test getUniqueIDStringAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsLong());
    }

    /**
     * Test getUniqueIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsLocalDateTime());
    }

    /**
     * Test getUniqueIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsLocalTime());
    }

    /**
     * Test getUniqueIDStringAsString() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals("137322532605887224126354371500740408252 (0x674F5B960F3EE8E6B4EF1CC9EA5F73BC)", JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsString());
    }

    /**
     * Test getUniqueIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsBoolean());
    }

    /**
     * Test getUniqueIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(new BigInteger("13732253260588722412635437150074040825206745960386419573"), JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsBigInteger());
    }

    /**
     * Test getUniqueIDStringAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsURL());
    }

    /**
     * Test getVideoFormatListAsInteger() method.
     */
    @Test
    public void subTestGetVideoFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsInteger());
    }

    /**
     * Test getVideoFormatListAsLong() method.
     */
    @Test
    public void subTestGetVideoFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsLong());
    }

    /**
     * Test getVideoFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsLocalDateTime());
    }

    /**
     * Test getVideoFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsLocalTime());
    }

    /**
     * Test getVideoFormatListAsString() method.
     */
    @Test
    public void subTestGetVideoFormatListAsString() {
        assertEquals("AVC", JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsString());
    }

    /**
     * Test getVideoFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetVideoFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsBoolean());
    }

    /**
     * Test getVideoFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsBigInteger());
    }

    /**
     * Test getVideoFormatListAsURL() method.
     */
    @Test
    public void subTestGetVideoFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsURL());
    }

    /**
     * Test getVideoFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsInteger());
    }

    /**
     * Test getVideoFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsLong());
    }

    /**
     * Test getVideoFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getVideoFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsLocalTime());
    }

    /**
     * Test getVideoFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsString() {
        assertEquals("AVC", JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsString());
    }

    /**
     * Test getVideoFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsBoolean());
    }

    /**
     * Test getVideoFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsBigInteger());
    }

    /**
     * Test getVideoFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsURL());
    }

    /**
     * Test getVideoLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsInteger());
    }

    /**
     * Test getVideoLanguageListAsLong() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsLong());
    }

    /**
     * Test getVideoLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsLocalDateTime());
    }

    /**
     * Test getVideoLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsLocalTime());
    }

    /**
     * Test getVideoLanguageListAsString() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsString() {
        assertEquals("English", JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsString());
    }

    /**
     * Test getVideoLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsBoolean());
    }

    /**
     * Test getVideoLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsBigInteger());
    }

    /**
     * Test getVideoLanguageListAsURL() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsURL());
    }

    /**
     * Test getVideoCountAsInteger() method.
     */
    @Test
    public void subTestGetVideoCountAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsInteger());
    }

    /**
     * Test getVideoCountAsLong() method.
     */
    @Test
    public void subTestGetVideoCountAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsLong());
    }

    /**
     * Test getVideoCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsLocalDateTime());
    }

    /**
     * Test getVideoCountAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsLocalTime());
    }

    /**
     * Test getVideoCountAsString() method.
     */
    @Test
    public void subTestGetVideoCountAsString() {
        assertEquals("1", JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsString());
    }

    /**
     * Test getVideoCountAsBoolean() method.
     */
    @Test
    public void subTestGetVideoCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsBoolean());
    }

    /**
     * Test getVideoCountAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsBigInteger());
    }

    /**
     * Test getVideoCountAsURL() method.
     */
    @Test
    public void subTestGetVideoCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsURL());
    }

    /**
     * Test getWrittenDateAsInteger() method.
     */
    @Test
    public void subTestGetWrittenDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsInteger());
    }

    /**
     * Test getWrittenDateAsLong() method.
     */
    @Test
    public void subTestGetWrittenDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsLong());
    }

    /**
     * Test getWrittenDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWrittenDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsLocalDateTime());
    }

    /**
     * Test getWrittenDateAsLocalTime() method.
     */
    @Test
    public void subTestGetWrittenDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsLocalTime());
    }

    /**
     * Test getWrittenDateAsString() method.
     */
    @Test
    public void subTestGetWrittenDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsString());
    }

    /**
     * Test getWrittenDateAsBoolean() method.
     */
    @Test
    public void subTestGetWrittenDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsBoolean());
    }

    /**
     * Test getWrittenDateAsBigInteger() method.
     */
    @Test
    public void subTestGetWrittenDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsBigInteger());
    }

    /**
     * Test getWrittenDateAsURL() method.
     */
    @Test
    public void subTestGetWrittenDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsURL());
    }

    /**
     * Test getWrittenLocationAsInteger() method.
     */
    @Test
    public void subTestGetWrittenLocationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsInteger());
    }

    /**
     * Test getWrittenLocationAsLong() method.
     */
    @Test
    public void subTestGetWrittenLocationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsLong());
    }

    /**
     * Test getWrittenLocationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWrittenLocationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsLocalDateTime());
    }

    /**
     * Test getWrittenLocationAsLocalTime() method.
     */
    @Test
    public void subTestGetWrittenLocationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsLocalTime());
    }

    /**
     * Test getWrittenLocationAsString() method.
     */
    @Test
    public void subTestGetWrittenLocationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsString());
    }

    /**
     * Test getWrittenLocationAsBoolean() method.
     */
    @Test
    public void subTestGetWrittenLocationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsBoolean());
    }

    /**
     * Test getWrittenLocationAsBigInteger() method.
     */
    @Test
    public void subTestGetWrittenLocationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsBigInteger());
    }

    /**
     * Test getWrittenLocationAsURL() method.
     */
    @Test
    public void subTestGetWrittenLocationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsURL());
    }

    /**
     * Test getWrittenByAsInteger() method.
     */
    @Test
    public void subTestGetWrittenByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsInteger());
    }

    /**
     * Test getWrittenByAsLong() method.
     */
    @Test
    public void subTestGetWrittenByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsLong());
    }

    /**
     * Test getWrittenByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWrittenByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsLocalDateTime());
    }

    /**
     * Test getWrittenByAsLocalTime() method.
     */
    @Test
    public void subTestGetWrittenByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsLocalTime());
    }

    /**
     * Test getWrittenByAsString() method.
     */
    @Test
    public void subTestGetWrittenByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsString());
    }

    /**
     * Test getWrittenByAsBoolean() method.
     */
    @Test
    public void subTestGetWrittenByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsBoolean());
    }

    /**
     * Test getWrittenByAsBigInteger() method.
     */
    @Test
    public void subTestGetWrittenByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsBigInteger());
    }

    /**
     * Test getWrittenByAsURL() method.
     */
    @Test
    public void subTestGetWrittenByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsURL());
    }

}
