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
import aka.jmetadata.main.JMetaDataAudio;

/**
 * This class contains tests methods for Audio informations of a specific Audio stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataAudio_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataAudio_Test.class.getName());

    private static JMetaDataAudio jMetaDataAudio;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final String filePath = new File("").getAbsolutePath();
            final ClassLoader classLoader = JMetaDataAudio_Test.class.getClassLoader();
            final File file = new File(ClassLoader.getSystemClassLoader().getResource("Sintel_DivXPlus_6500kbps.mkv").toURI());
            System.err.println("[JMetaDataAudio_Test] beforeUnit - " + file.getAbsolutePath());
//            final File file = new File(filePath.concat("/Test/videosamples/Sintel_DivXPlus_6500kbps.mkv"));
            if (jMetaData.open(file)) {
                @NonNull
                final List<@NonNull JMetaDataAudio> audioStreams = jMetaData.getAudioStreams();
                System.err.println("[JMetaDataAudio_Test] beforeUnit - 1");
                for (final JMetaDataAudio jMetaDataAudio : audioStreams) {
                    System.err.println("[JMetaDataAudio_Test] beforeUnit - audio streams = " + jMetaDataAudio.getStreamNumber());
                }
                if (audioStreams.get(0) != null) {
                    jMetaDataAudio = audioStreams.get(0);
                }
            } else {
                throw new RuntimeErrorException(null, "Can not open file.");
            }
        } catch (final Throwable e) {
            e.printStackTrace();
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
     * Test getDelayOriginalSourceAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsInteger());
    }

    /**
     * Test getDelayOriginalSourceAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsLong());
    }

    /**
     * Test getDelayOriginalSourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalSourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsLocalTime());
    }

    /**
     * Test getDelayOriginalSourceAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsString());
    }

    /**
     * Test getDelayOriginalSourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsBoolean());
    }

    /**
     * Test getDelayOriginalSourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsBigInteger());
    }

    /**
     * Test getDelayOriginalSourceAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalSourceAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSourceAsURL());
    }

    /**
     * Test getInterleaveDurationAsInteger() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsInteger());
    }

    /**
     * Test getInterleaveDurationAsLong() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsLong());
    }

    /**
     * Test getInterleaveDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsLocalDateTime());
    }

    /**
     * Test getInterleaveDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsLocalTime());
    }

    /**
     * Test getInterleaveDurationAsString() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsString());
    }

    /**
     * Test getInterleaveDurationAsBoolean() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsBoolean());
    }

    /**
     * Test getInterleaveDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsBigInteger());
    }

    /**
     * Test getInterleaveDurationAsURL() method.
     */
    @Test
    public void subTestGetInterleaveDurationAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationAsURL());
    }

    /**
     * Test getStreamOrderAsInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsInteger());
    }

    /**
     * Test getStreamOrderAsLong() method.
     */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsLong());
    }

    /**
     * Test getStreamOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsLocalDateTime());
    }

    /**
     * Test getStreamOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsLocalTime());
    }

    /**
     * Test getStreamOrderAsString() method.
     */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals("1", JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsString());
    }

    /**
     * Test getStreamOrderAsBoolean() method.
     */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsBoolean());
    }

    /**
     * Test getStreamOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsBigInteger());
    }

    /**
     * Test getStreamOrderAsURL() method.
     */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamOrderAsURL());
    }

    /**
     * Test getEncodedLibraryNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsInteger());
    }

    /**
     * Test getEncodedLibraryNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsLong());
    }

    /**
     * Test getEncodedLibraryNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsString());
    }

    /**
     * Test getEncodedLibraryNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryNameAsURL());
    }

    /**
     * Test getDurationFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsInteger());
    }

    /**
     * Test getDurationFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsLong());
    }

    /**
     * Test getDurationFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsString());
    }

    /**
     * Test getDurationFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString4AsURL());
    }

    /**
     * Test getDurationFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsInteger());
    }

    /**
     * Test getDurationFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsLong());
    }

    /**
     * Test getDurationFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsString());
    }

    /**
     * Test getDurationFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString5AsURL());
    }

    /**
     * Test getDurationFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsInteger());
    }

    /**
     * Test getDurationFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsLong());
    }

    /**
     * Test getDurationFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsString());
    }

    /**
     * Test getDurationFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString2AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsLong());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsString());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameStringAsURL());
    }

    /**
     * Test getDurationFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsInteger());
    }

    /**
     * Test getDurationFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsLong());
    }

    /**
     * Test getDurationFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsString());
    }

    /**
     * Test getDurationFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString3AsURL());
    }

    /**
     * Test getSourceDurationLastFrameAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsInteger());
    }

    /**
     * Test getSourceDurationLastFrameAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsLong());
    }

    /**
     * Test getSourceDurationLastFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameAsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsString());
    }

    /**
     * Test getSourceDurationLastFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameAsURL());
    }

    /**
     * Test getDurationFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsInteger());
    }

    /**
     * Test getDurationFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsLong());
    }

    /**
     * Test getDurationFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsLocalTime());
    }

    /**
     * Test getDurationFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsString());
    }

    /**
     * Test getDurationFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsBoolean());
    }

    /**
     * Test getDurationFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsBigInteger());
    }

    /**
     * Test getDurationFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameString1AsURL());
    }

    /**
     * Test getInterleavePreloadStringAsInteger() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsInteger());
    }

    /**
     * Test getInterleavePreloadStringAsLong() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsLong());
    }

    /**
     * Test getInterleavePreloadStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsLocalDateTime());
    }

    /**
     * Test getInterleavePreloadStringAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsLocalTime());
    }

    /**
     * Test getInterleavePreloadStringAsString() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsString());
    }

    /**
     * Test getInterleavePreloadStringAsBoolean() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsBoolean());
    }

    /**
     * Test getInterleavePreloadStringAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsBigInteger());
    }

    /**
     * Test getInterleavePreloadStringAsURL() method.
     */
    @Test
    public void subTestGetInterleavePreloadStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadStringAsURL());
    }

    /**
     * Test getFormatCompressionAsInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsInteger());
    }

    /**
     * Test getFormatCompressionAsLong() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsLong());
    }

    /**
     * Test getFormatCompressionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsLocalDateTime());
    }

    /**
     * Test getFormatCompressionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsLocalTime());
    }

    /**
     * Test getFormatCompressionAsString() method.
     */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsString());
    }

    /**
     * Test getFormatCompressionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsBoolean());
    }

    /**
     * Test getFormatCompressionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsBigInteger());
    }

    /**
     * Test getFormatCompressionAsURL() method.
     */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCompressionAsURL());
    }

    /**
     * Test getAlignmentStringAsInteger() method.
     */
    @Test
    public void subTestGetAlignmentStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsInteger());
    }

    /**
     * Test getAlignmentStringAsLong() method.
     */
    @Test
    public void subTestGetAlignmentStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsLong());
    }

    /**
     * Test getAlignmentStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlignmentStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsLocalDateTime());
    }

    /**
     * Test getAlignmentStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlignmentStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsLocalTime());
    }

    /**
     * Test getAlignmentStringAsString() method.
     */
    @Test
    public void subTestGetAlignmentStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsString());
    }

    /**
     * Test getAlignmentStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlignmentStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsBoolean());
    }

    /**
     * Test getAlignmentStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlignmentStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsBigInteger());
    }

    /**
     * Test getAlignmentStringAsURL() method.
     */
    @Test
    public void subTestGetAlignmentStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentStringAsURL());
    }

    /**
     * Test getDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsInteger());
    }

    /**
     * Test getDelayStringAsLong() method.
     */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsLong());
    }

    /**
     * Test getDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsLocalDateTime());
    }

    /**
     * Test getDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsLocalTime());
    }

    /**
     * Test getDelayStringAsString() method.
     */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals("170 ms", JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsString());
    }

    /**
     * Test getDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsBoolean());
    }

    /**
     * Test getDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsBigInteger());
    }

    /**
     * Test getDelayStringAsURL() method.
     */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayStringAsURL());
    }

    /**
     * Test getMuxingModeMoreInfoAsInteger() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsInteger());
    }

    /**
     * Test getMuxingModeMoreInfoAsLong() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsLong());
    }

    /**
     * Test getMuxingModeMoreInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsLocalDateTime());
    }

    /**
     * Test getMuxingModeMoreInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsLocalTime());
    }

    /**
     * Test getMuxingModeMoreInfoAsString() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsString());
    }

    /**
     * Test getMuxingModeMoreInfoAsBoolean() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsBoolean());
    }

    /**
     * Test getMuxingModeMoreInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsBigInteger());
    }

    /**
     * Test getMuxingModeMoreInfoAsURL() method.
     */
    @Test
    public void subTestGetMuxingModeMoreInfoAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeMoreInfoAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedStringAsURL());
    }

    /**
     * Test getCodecIDDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsInteger());
    }

    /**
     * Test getCodecIDDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsLong());
    }

    /**
     * Test getCodecIDDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsLocalDateTime());
    }

    /**
     * Test getCodecIDDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsLocalTime());
    }

    /**
     * Test getCodecIDDescriptionAsString() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsString());
    }

    /**
     * Test getCodecIDDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsBoolean());
    }

    /**
     * Test getCodecIDDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsBigInteger());
    }

    /**
     * Test getCodecIDDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDDescriptionAsURL());
    }

    /**
     * Test getStatusAsInteger() method.
     */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsInteger());
    }

    /**
     * Test getStatusAsLong() method.
     */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsLong());
    }

    /**
     * Test getStatusAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsLocalDateTime());
    }

    /**
     * Test getStatusAsLocalTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsLocalTime());
    }

    /**
     * Test getStatusAsString() method.
     */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStatusAsString());
    }

    /**
     * Test getStatusAsBoolean() method.
     */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsBoolean());
    }

    /**
     * Test getStatusAsBigInteger() method.
     */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsBigInteger());
    }

    /**
     * Test getStatusAsURL() method.
     */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStatusAsURL());
    }

    /**
     * Test getDurationFirstFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsInteger());
    }

    /**
     * Test getDurationFirstFrameStringAsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsLong());
    }

    /**
     * Test getDurationFirstFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsLocalTime());
    }

    /**
     * Test getDurationFirstFrameStringAsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsString());
    }

    /**
     * Test getDurationFirstFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsBoolean());
    }

    /**
     * Test getDurationFirstFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsBigInteger());
    }

    /**
     * Test getDurationFirstFrameStringAsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameStringAsURL());
    }

    /**
     * Test getFrameRateAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsInteger());
    }

    /**
     * Test getFrameRateAsLong() method.
     */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsLong());
    }

    /**
     * Test getFrameRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsLocalDateTime());
    }

    /**
     * Test getFrameRateAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsLocalTime());
    }

    /**
     * Test getFrameRateAsString() method.
     */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsString());
    }

    /**
     * Test getFrameRateAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsBoolean());
    }

    /**
     * Test getFrameRateAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsBigInteger());
    }

    /**
     * Test getFrameRateAsURL() method.
     */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateAsURL());
    }

    /**
     * Test getServiceKindStringAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsInteger());
    }

    /**
     * Test getServiceKindStringAsLong() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsLong());
    }

    /**
     * Test getServiceKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsLocalDateTime());
    }

    /**
     * Test getServiceKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsLocalTime());
    }

    /**
     * Test getServiceKindStringAsString() method.
     */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsString());
    }

    /**
     * Test getServiceKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsBoolean());
    }

    /**
     * Test getServiceKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsBigInteger());
    }

    /**
     * Test getServiceKindStringAsURL() method.
     */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindStringAsURL());
    }

    /**
     * Test getMuxingModeAsInteger() method.
     */
    @Test
    public void subTestGetMuxingModeAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsInteger());
    }

    /**
     * Test getMuxingModeAsLong() method.
     */
    @Test
    public void subTestGetMuxingModeAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsLong());
    }

    /**
     * Test getMuxingModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMuxingModeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsLocalDateTime());
    }

    /**
     * Test getMuxingModeAsLocalTime() method.
     */
    @Test
    public void subTestGetMuxingModeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsLocalTime());
    }

    /**
     * Test getMuxingModeAsString() method.
     */
    @Test
    public void subTestGetMuxingModeAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsString());
    }

    /**
     * Test getMuxingModeAsBoolean() method.
     */
    @Test
    public void subTestGetMuxingModeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsBoolean());
    }

    /**
     * Test getMuxingModeAsBigInteger() method.
     */
    @Test
    public void subTestGetMuxingModeAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsBigInteger());
    }

    /**
     * Test getMuxingModeAsURL() method.
     */
    @Test
    public void subTestGetMuxingModeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMuxingModeAsURL());
    }

    /**
     * Test getDelaySettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsInteger());
    }

    /**
     * Test getDelaySettingsAsLong() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsLong());
    }

    /**
     * Test getDelaySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsLocalDateTime());
    }

    /**
     * Test getDelaySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsLocalTime());
    }

    /**
     * Test getDelaySettingsAsString() method.
     */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsString());
    }

    /**
     * Test getDelaySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsBoolean());
    }

    /**
     * Test getDelaySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsBigInteger());
    }

    /**
     * Test getDelaySettingsAsURL() method.
     */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySettingsAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedAsURL());
    }

    /**
     * Test getFormatSettingsITUAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsInteger());
    }

    /**
     * Test getFormatSettingsITUAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsLong());
    }

    /**
     * Test getFormatSettingsITUAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsITUAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsLocalTime());
    }

    /**
     * Test getFormatSettingsITUAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsString());
    }

    /**
     * Test getFormatSettingsITUAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsBoolean());
    }

    /**
     * Test getFormatSettingsITUAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsBigInteger());
    }

    /**
     * Test getFormatSettingsITUAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsITUAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsITUAsURL());
    }

    /**
     * Test getChannelsOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsInteger());
    }

    /**
     * Test getChannelsOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsLong());
    }

    /**
     * Test getChannelsOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsLocalDateTime());
    }

    /**
     * Test getChannelsOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsLocalTime());
    }

    /**
     * Test getChannelsOriginalStringAsString() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsString());
    }

    /**
     * Test getChannelsOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsBoolean());
    }

    /**
     * Test getChannelsOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsBigInteger());
    }

    /**
     * Test getChannelsOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetChannelsOriginalStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalStringAsURL());
    }

    /**
     * Test getFormatSettingsModeExtensionAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsInteger());
    }

    /**
     * Test getFormatSettingsModeExtensionAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsLong());
    }

    /**
     * Test getFormatSettingsModeExtensionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsModeExtensionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsLocalTime());
    }

    /**
     * Test getFormatSettingsModeExtensionAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsString());
    }

    /**
     * Test getFormatSettingsModeExtensionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsBoolean());
    }

    /**
     * Test getFormatSettingsModeExtensionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsBigInteger());
    }

    /**
     * Test getFormatSettingsModeExtensionAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeExtensionAsURL());
    }

    /**
     * Test getFormatSettingsFirmAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsInteger());
    }

    /**
     * Test getFormatSettingsFirmAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsLong());
    }

    /**
     * Test getFormatSettingsFirmAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsFirmAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsLocalTime());
    }

    /**
     * Test getFormatSettingsFirmAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsString());
    }

    /**
     * Test getFormatSettingsFirmAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsBoolean());
    }

    /**
     * Test getFormatSettingsFirmAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsBigInteger());
    }

    /**
     * Test getFormatSettingsFirmAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsFirmAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFirmAsURL());
    }

    /**
     * Test getBitRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsInteger());
    }

    /**
     * Test getBitRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsLong());
    }

    /**
     * Test getBitRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsLocalDateTime());
    }

    /**
     * Test getBitRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsLocalTime());
    }

    /**
     * Test getBitRateModeStringAsString() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsString() {
        assertEquals("Constant", JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsString());
    }

    /**
     * Test getBitRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsBoolean());
    }

    /**
     * Test getBitRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsBigInteger());
    }

    /**
     * Test getBitRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateModeStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeStringAsURL());
    }

    /**
     * Test getReplayGainPeakAsInteger() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsInteger());
    }

    /**
     * Test getReplayGainPeakAsLong() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsLong());
    }

    /**
     * Test getReplayGainPeakAsLocalDateTime() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsLocalDateTime());
    }

    /**
     * Test getReplayGainPeakAsLocalTime() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsLocalTime());
    }

    /**
     * Test getReplayGainPeakAsString() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsString());
    }

    /**
     * Test getReplayGainPeakAsBoolean() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsBoolean());
    }

    /**
     * Test getReplayGainPeakAsBigInteger() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsBigInteger());
    }

    /**
     * Test getReplayGainPeakAsURL() method.
     */
    @Test
    public void subTestGetReplayGainPeakAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainPeakAsURL());
    }

    /**
     * Test getChannelLayoutIDAsInteger() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsInteger());
    }

    /**
     * Test getChannelLayoutIDAsLong() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsLong());
    }

    /**
     * Test getChannelLayoutIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsLocalDateTime());
    }

    /**
     * Test getChannelLayoutIDAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsLocalTime());
    }

    /**
     * Test getChannelLayoutIDAsString() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsString());
    }

    /**
     * Test getChannelLayoutIDAsBoolean() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsBoolean());
    }

    /**
     * Test getChannelLayoutIDAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsBigInteger());
    }

    /**
     * Test getChannelLayoutIDAsURL() method.
     */
    @Test
    public void subTestGetChannelLayoutIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutIDAsURL());
    }

    /**
     * Test getSourceSamplingCountAsInteger() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsInteger());
    }

    /**
     * Test getSourceSamplingCountAsLong() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsLong());
    }

    /**
     * Test getSourceSamplingCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsLocalDateTime());
    }

    /**
     * Test getSourceSamplingCountAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsLocalTime());
    }

    /**
     * Test getSourceSamplingCountAsString() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsString());
    }

    /**
     * Test getSourceSamplingCountAsBoolean() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsBoolean());
    }

    /**
     * Test getSourceSamplingCountAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsBigInteger());
    }

    /**
     * Test getSourceSamplingCountAsURL() method.
     */
    @Test
    public void subTestGetSourceSamplingCountAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceSamplingCountAsURL());
    }

    /**
     * Test getEncodedLibraryVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsLong());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsLocalTime());
    }

    /**
     * Test getEncodedLibraryVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsString());
    }

    /**
     * Test getEncodedLibraryVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsBoolean());
    }

    /**
     * Test getEncodedLibraryVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsBigInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryVersionAsURL());
    }

    /**
     * Test getSamplingCountAsInteger() method.
     */
    @Test
    public void subTestGetSamplingCountAsInteger() {
        assertEquals(Integer.valueOf(43112016), JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsInteger());
    }

    /**
     * Test getSamplingCountAsLong() method.
     */
    @Test
    public void subTestGetSamplingCountAsLong() {
        assertEquals(Long.valueOf(43112016), JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsLong());
    }

    /**
     * Test getSamplingCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSamplingCountAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsLocalDateTime());
    }

    /**
     * Test getSamplingCountAsLocalTime() method.
     */
    @Test
    public void subTestGetSamplingCountAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsLocalTime());
    }

    /**
     * Test getSamplingCountAsString() method.
     */
    @Test
    public void subTestGetSamplingCountAsString() {
        assertEquals("43112016", JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsString());
    }

    /**
     * Test getSamplingCountAsBoolean() method.
     */
    @Test
    public void subTestGetSamplingCountAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsBoolean());
    }

    /**
     * Test getSamplingCountAsBigInteger() method.
     */
    @Test
    public void subTestGetSamplingCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(43112016), JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsBigInteger());
    }

    /**
     * Test getSamplingCountAsURL() method.
     */
    @Test
    public void subTestGetSamplingCountAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingCountAsURL());
    }

    /**
     * Test getSourceDurationLastFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsInteger());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsLong());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsString());
    }

    /**
     * Test getSourceDurationLastFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameStringAsURL());
    }

    /**
     * Test getCodecIDInfoAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsInteger());
    }

    /**
     * Test getCodecIDInfoAsLong() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsLong());
    }

    /**
     * Test getCodecIDInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsLocalDateTime());
    }

    /**
     * Test getCodecIDInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsLocalTime());
    }

    /**
     * Test getCodecIDInfoAsString() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsString());
    }

    /**
     * Test getCodecIDInfoAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsBoolean());
    }

    /**
     * Test getCodecIDInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsBigInteger());
    }

    /**
     * Test getCodecIDInfoAsURL() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDInfoAsURL());
    }

    /**
     * Test getStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(Integer.valueOf(21556008), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsInteger());
    }

    /**
     * Test getStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(Long.valueOf(21556008), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsLong());
    }

    /**
     * Test getStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsLocalDateTime());
    }

    /**
     * Test getStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsLocalTime());
    }

    /**
     * Test getStreamSizeAsString() method.
     */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals("21556008", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsString());
    }

    /**
     * Test getStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsBoolean());
    }

    /**
     * Test getStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(BigInteger.valueOf(21556008), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsBigInteger());
    }

    /**
     * Test getStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeAsURL());
    }

    /**
     * Test getFormatInfoAsInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsInteger());
    }

    /**
     * Test getFormatInfoAsLong() method.
     */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsLong());
    }

    /**
     * Test getFormatInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsLocalDateTime());
    }

    /**
     * Test getFormatInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsLocalTime());
    }

    /**
     * Test getFormatInfoAsString() method.
     */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsString());
    }

    /**
     * Test getFormatInfoAsBoolean() method.
     */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsBoolean());
    }

    /**
     * Test getFormatInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsBigInteger());
    }

    /**
     * Test getFormatInfoAsURL() method.
     */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatInfoAsURL());
    }

    /**
     * Test getSourceStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsInteger());
    }

    /**
     * Test getSourceStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsLong());
    }

    /**
     * Test getSourceStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsString());
    }

    /**
     * Test getSourceStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString1AsURL());
    }

    /**
     * Test getSourceStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsInteger());
    }

    /**
     * Test getSourceStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsLong());
    }

    /**
     * Test getSourceStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsString());
    }

    /**
     * Test getSourceStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsBoolean());
    }

    /**
     * Test getSourceStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeProportionAsURL());
    }

    /**
     * Test getCodecIDUrlAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsInteger());
    }

    /**
     * Test getCodecIDUrlAsLong() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsLong());
    }

    /**
     * Test getCodecIDUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsLocalDateTime());
    }

    /**
     * Test getCodecIDUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsLocalTime());
    }

    /**
     * Test getCodecIDUrlAsString() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals("http://www.iis.fraunhofer.de/amm/index.html", JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsString());
    }

    /**
     * Test getCodecIDUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsBoolean());
    }

    /**
     * Test getCodecIDUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsBigInteger());
    }

    /**
     * Test getCodecIDUrlAsURL() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        try {
            assertEquals(new URL("http://www.iis.fraunhofer.de/amm/index.html"), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDUrlAsURL());
        } catch (final MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Test getSourceStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsInteger());
    }

    /**
     * Test getSourceStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsLong());
    }

    /**
     * Test getSourceStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsString());
    }

    /**
     * Test getSourceStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString2AsURL());
    }

    /**
     * Test getSourceStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsInteger());
    }

    /**
     * Test getSourceStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsLong());
    }

    /**
     * Test getSourceStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsString());
    }

    /**
     * Test getSourceStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString5AsURL());
    }

    /**
     * Test getSourceStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsInteger());
    }

    /**
     * Test getSourceStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsLong());
    }

    /**
     * Test getSourceStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsString());
    }

    /**
     * Test getSourceStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString3AsURL());
    }

    /**
     * Test getSourceStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsInteger());
    }

    /**
     * Test getSourceStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsLong());
    }

    /**
     * Test getSourceStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsString());
    }

    /**
     * Test getSourceStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsBoolean());
    }

    /**
     * Test getSourceStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeString4AsURL());
    }

    /**
     * Test getDisabledStringAsInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsInteger());
    }

    /**
     * Test getDisabledStringAsLong() method.
     */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsLong());
    }

    /**
     * Test getDisabledStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsLocalDateTime());
    }

    /**
     * Test getDisabledStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsLocalTime());
    }

    /**
     * Test getDisabledStringAsString() method.
     */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsString());
    }

    /**
     * Test getDisabledStringAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsBoolean());
    }

    /**
     * Test getDisabledStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsBigInteger());
    }

    /**
     * Test getDisabledStringAsURL() method.
     */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledStringAsURL());
    }

    /**
     * Test getEncodedOperatingSystemAsInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsLong() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsLong());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsLocalDateTime());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsLocalTime());
    }

    /**
     * Test getEncodedOperatingSystemAsString() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsString());
    }

    /**
     * Test getEncodedOperatingSystemAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsBoolean());
    }

    /**
     * Test getEncodedOperatingSystemAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsBigInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsURL() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedOperatingSystemAsURL());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsLong());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsString());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationCompanyNameAsURL());
    }

    /**
     * Test getCompressionRatioAsInteger() method.
     */
    @Test
    public void subTestGetCompressionRatioAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsInteger());
    }

    /**
     * Test getCompressionRatioAsLong() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsLong());
    }

    /**
     * Test getCompressionRatioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsLocalDateTime());
    }

    /**
     * Test getCompressionRatioAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionRatioAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsLocalTime());
    }

    /**
     * Test getCompressionRatioAsString() method.
     */
    @Test
    public void subTestGetCompressionRatioAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsString());
    }

    /**
     * Test getCompressionRatioAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionRatioAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsBoolean());
    }

    /**
     * Test getCompressionRatioAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionRatioAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsBigInteger());
    }

    /**
     * Test getCompressionRatioAsURL() method.
     */
    @Test
    public void subTestGetCompressionRatioAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionRatioAsURL());
    }

    /**
     * Test getFormatCommercialIfAnyAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsLong());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsLocalTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsString());
    }

    /**
     * Test getFormatCommercialIfAnyAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsBoolean());
    }

    /**
     * Test getFormatCommercialIfAnyAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsBigInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialIfAnyAsURL());
    }

    /**
     * Test getTaggedDateAsInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsInteger());
    }

    /**
     * Test getTaggedDateAsLong() method.
     */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsLong());
    }

    /**
     * Test getTaggedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsLocalDateTime());
    }

    /**
     * Test getTaggedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsLocalTime());
    }

    /**
     * Test getTaggedDateAsString() method.
     */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsString());
    }

    /**
     * Test getTaggedDateAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsBoolean());
    }

    /**
     * Test getTaggedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsBigInteger());
    }

    /**
     * Test getTaggedDateAsURL() method.
     */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTaggedDateAsURL());
    }

    /**
     * Test getIDStringAsInteger() method.
     */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(Integer.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsInteger());
    }

    /**
     * Test getIDStringAsLong() method.
     */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(Long.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsLong());
    }

    /**
     * Test getIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsLocalDateTime());
    }

    /**
     * Test getIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsLocalTime());
    }

    /**
     * Test getIDStringAsString() method.
     */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals("2", JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsString());
    }

    /**
     * Test getIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsBoolean());
    }

    /**
     * Test getIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsBigInteger());
    }

    /**
     * Test getIDStringAsURL() method.
     */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDStringAsURL());
    }

    /**
     * Test getCompressionModeAsInteger() method.
     */
    @Test
    public void subTestGetCompressionModeAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsInteger());
    }

    /**
     * Test getCompressionModeAsLong() method.
     */
    @Test
    public void subTestGetCompressionModeAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsLong());
    }

    /**
     * Test getCompressionModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionModeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsLocalDateTime());
    }

    /**
     * Test getCompressionModeAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionModeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsLocalTime());
    }

    /**
     * Test getCompressionModeAsString() method.
     */
    @Test
    public void subTestGetCompressionModeAsString() {
        assertEquals("Lossy", JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsString());
    }

    /**
     * Test getCompressionModeAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionModeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsBoolean());
    }

    /**
     * Test getCompressionModeAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionModeAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsBigInteger());
    }

    /**
     * Test getCompressionModeAsURL() method.
     */
    @Test
    public void subTestGetCompressionModeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeAsURL());
    }

    /**
     * Test getBitRateAsInteger() method.
     */
    @Test
    public void subTestGetBitRateAsInteger() {
        assertEquals(Integer.valueOf(192000), JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsInteger());
    }

    /**
     * Test getBitRateAsLong() method.
     */
    @Test
    public void subTestGetBitRateAsLong() {
        assertEquals(Long.valueOf(192000), JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsLong());
    }

    /**
     * Test getBitRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsLocalDateTime());
    }

    /**
     * Test getBitRateAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsLocalTime());
    }

    /**
     * Test getBitRateAsString() method.
     */
    @Test
    public void subTestGetBitRateAsString() {
        assertEquals("192000", JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsString());
    }

    /**
     * Test getBitRateAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsBoolean());
    }

    /**
     * Test getBitRateAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateAsBigInteger() {
        assertEquals(BigInteger.valueOf(192000), JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsBigInteger());
    }

    /**
     * Test getBitRateAsURL() method.
     */
    @Test
    public void subTestGetBitRateAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateAsURL());
    }

    /**
     * Test getEncodedDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsInteger());
    }

    /**
     * Test getEncodedDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsLong());
    }

    /**
     * Test getEncodedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsLocalDateTime());
    }

    /**
     * Test getEncodedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsLocalTime());
    }

    /**
     * Test getEncodedDateAsString() method.
     */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsString());
    }

    /**
     * Test getEncodedDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsBoolean());
    }

    /**
     * Test getEncodedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsBigInteger());
    }

    /**
     * Test getEncodedDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedDateAsURL());
    }

    /**
     * Test getBitRateModeAsInteger() method.
     */
    @Test
    public void subTestGetBitRateModeAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsInteger());
    }

    /**
     * Test getBitRateModeAsLong() method.
     */
    @Test
    public void subTestGetBitRateModeAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsLong());
    }

    /**
     * Test getBitRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsLocalDateTime());
    }

    /**
     * Test getBitRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateModeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsLocalTime());
    }

    /**
     * Test getBitRateModeAsString() method.
     */
    @Test
    public void subTestGetBitRateModeAsString() {
        assertEquals("CBR", JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsString());
    }

    /**
     * Test getBitRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateModeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsBoolean());
    }

    /**
     * Test getBitRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateModeAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsBigInteger());
    }

    /**
     * Test getBitRateModeAsURL() method.
     */
    @Test
    public void subTestGetBitRateModeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateModeAsURL());
    }

    /**
     * Test getUniqueIDAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsInteger());
    }

    /**
     * Test getUniqueIDAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(Long.valueOf("2771729987860187580"), JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsLong());
    }

    /**
     * Test getUniqueIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsLocalDateTime());
    }

    /**
     * Test getUniqueIDAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsLocalTime());
    }

    /**
     * Test getUniqueIDAsString() method.
     */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals("2771729987860187580", JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsString());
    }

    /**
     * Test getUniqueIDAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsBoolean());
    }

    /**
     * Test getUniqueIDAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(new BigInteger("2771729987860187580"), JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsBigInteger());
    }

    /**
     * Test getUniqueIDAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDAsURL());
    }

    /**
     * Test getBitRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsInteger());
    }

    /**
     * Test getBitRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsLong());
    }

    /**
     * Test getBitRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getBitRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsLocalTime());
    }

    /**
     * Test getBitRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsString());
    }

    /**
     * Test getBitRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsBoolean());
    }

    /**
     * Test getBitRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsBigInteger());
    }

    /**
     * Test getBitRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumStringAsURL());
    }

    /**
     * Test getDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsInteger());
    }

    /**
     * Test getDelayString3AsLong() method.
     */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsLong());
    }

    /**
     * Test getDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsLocalDateTime());
    }

    /**
     * Test getDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(LocalTime.of(0, 0, 0, 170000000), JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsLocalTime());
    }

    /**
     * Test getDelayString3AsString() method.
     */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals("00:00:00.170", JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsString());
    }

    /**
     * Test getDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsBoolean());
    }

    /**
     * Test getDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsBigInteger());
    }

    /**
     * Test getDelayString3AsURL() method.
     */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString3AsURL());
    }

    /**
     * Test getVideoDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsInteger());
    }

    /**
     * Test getVideoDelayStringAsLong() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsLong());
    }

    /**
     * Test getVideoDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsLocalDateTime());
    }

    /**
     * Test getVideoDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsLocalTime());
    }

    /**
     * Test getVideoDelayStringAsString() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsString() {
        assertEquals("170 ms", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsString());
    }

    /**
     * Test getVideoDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsBoolean());
    }

    /**
     * Test getVideoDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsBigInteger());
    }

    /**
     * Test getVideoDelayStringAsURL() method.
     */
    @Test
    public void subTestGetVideoDelayStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayStringAsURL());
    }

    /**
     * Test getDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsInteger());
    }

    /**
     * Test getDelayString4AsLong() method.
     */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsLong());
    }

    /**
     * Test getDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsLocalDateTime());
    }

    /**
     * Test getDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsLocalTime());
    }

    /**
     * Test getDelayString4AsString() method.
     */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsString());
    }

    /**
     * Test getDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsBoolean());
    }

    /**
     * Test getDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsBigInteger());
    }

    /**
     * Test getDelayString4AsURL() method.
     */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString4AsURL());
    }

    /**
     * Test getDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsInteger());
    }

    /**
     * Test getDelayString1AsLong() method.
     */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsLong());
    }

    /**
     * Test getDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsLocalDateTime());
    }

    /**
     * Test getDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsLocalTime());
    }

    /**
     * Test getDelayString1AsString() method.
     */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals("170 ms", JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsString());
    }

    /**
     * Test getDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsBoolean());
    }

    /**
     * Test getDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsBigInteger());
    }

    /**
     * Test getDelayString1AsURL() method.
     */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString1AsURL());
    }

    /**
     * Test getDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsInteger());
    }

    /**
     * Test getDelayString2AsLong() method.
     */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsLong());
    }

    /**
     * Test getDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsLocalDateTime());
    }

    /**
     * Test getDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsLocalTime());
    }

    /**
     * Test getDelayString2AsString() method.
     */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals("170 ms", JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsString());
    }

    /**
     * Test getDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsBoolean());
    }

    /**
     * Test getDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsBigInteger());
    }

    /**
     * Test getDelayString2AsURL() method.
     */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString2AsURL());
    }

    /**
     * Test getChannelsStringAsInteger() method.
     */
    @Test
    public void subTestGetChannelsStringAsInteger() {
        assertEquals(Integer.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsInteger());
    }

    /**
     * Test getChannelsStringAsLong() method.
     */
    @Test
    public void subTestGetChannelsStringAsLong() {
        assertEquals(Long.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsLong());
    }

    /**
     * Test getChannelsStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelsStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsLocalDateTime());
    }

    /**
     * Test getChannelsStringAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelsStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsLocalTime());
    }

    /**
     * Test getChannelsStringAsString() method.
     */
    @Test
    public void subTestGetChannelsStringAsString() {
        assertEquals("2 channels", JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsString());
    }

    /**
     * Test getChannelsStringAsBoolean() method.
     */
    @Test
    public void subTestGetChannelsStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsBoolean());
    }

    /**
     * Test getChannelsStringAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelsStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsBigInteger());
    }

    /**
     * Test getChannelsStringAsURL() method.
     */
    @Test
    public void subTestGetChannelsStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsStringAsURL());
    }

    /**
     * Test getDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsInteger());
    }

    /**
     * Test getDelayString5AsLong() method.
     */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsLong());
    }

    /**
     * Test getDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsLocalDateTime());
    }

    /**
     * Test getDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsLocalTime());
    }

    /**
     * Test getDelayString5AsString() method.
     */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsString());
    }

    /**
     * Test getDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsBoolean());
    }

    /**
     * Test getDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsBigInteger());
    }

    /**
     * Test getDelayString5AsURL() method.
     */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayString5AsURL());
    }

    /**
     * Test getInterleavePreloadAsInteger() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsInteger());
    }

    /**
     * Test getInterleavePreloadAsLong() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsLong());
    }

    /**
     * Test getInterleavePreloadAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsLocalDateTime());
    }

    /**
     * Test getInterleavePreloadAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsLocalTime());
    }

    /**
     * Test getInterleavePreloadAsString() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsString());
    }

    /**
     * Test getInterleavePreloadAsBoolean() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsBoolean());
    }

    /**
     * Test getInterleavePreloadAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsBigInteger());
    }

    /**
     * Test getInterleavePreloadAsURL() method.
     */
    @Test
    public void subTestGetInterleavePreloadAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleavePreloadAsURL());
    }

    /**
     * Test getMatrixChannelPositionsString2AsInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsInteger());
    }

    /**
     * Test getMatrixChannelPositionsString2AsLong() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsLong());
    }

    /**
     * Test getMatrixChannelPositionsString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsLocalDateTime());
    }

    /**
     * Test getMatrixChannelPositionsString2AsLocalTime() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsLocalTime());
    }

    /**
     * Test getMatrixChannelPositionsString2AsString() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsString());
    }

    /**
     * Test getMatrixChannelPositionsString2AsBoolean() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsBoolean());
    }

    /**
     * Test getMatrixChannelPositionsString2AsBigInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsBigInteger());
    }

    /**
     * Test getMatrixChannelPositionsString2AsURL() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsString2AsURL());
    }

    /**
     * Test getFormatSettingsSBRAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsInteger());
    }

    /**
     * Test getFormatSettingsSBRAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsLong());
    }

    /**
     * Test getFormatSettingsSBRAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsSBRAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsLocalTime());
    }

    /**
     * Test getFormatSettingsSBRAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsString());
    }

    /**
     * Test getFormatSettingsSBRAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsBoolean());
    }

    /**
     * Test getFormatSettingsSBRAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsBigInteger());
    }

    /**
     * Test getFormatSettingsSBRAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRAsURL());
    }

    /**
     * Test getDelayAsInteger() method.
     */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayAsInteger());
    }

    /**
     * Test getDelayAsLong() method.
     */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayAsLong());
    }

    /**
     * Test getDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayAsLocalDateTime());
    }

    /**
     * Test getDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayAsLocalTime());
    }

    /**
     * Test getDelayAsString() method.
     */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals("170", JMetaDataAudio_Test.jMetaDataAudio.getDelayAsString());
    }

    /**
     * Test getDelayAsBoolean() method.
     */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayAsBoolean());
    }

    /**
     * Test getDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getDelayAsBigInteger());
    }

    /**
     * Test getDelayAsURL() method.
     */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayAsURL());
    }

    /**
     * Test getEncodedApplicationUrlAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsLong());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsLocalTime());
    }

    /**
     * Test getEncodedApplicationUrlAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsString());
    }

    /**
     * Test getEncodedApplicationUrlAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsBoolean());
    }

    /**
     * Test getEncodedApplicationUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsBigInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationUrlAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString4AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString4AsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString5AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString5AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString1AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString2AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString3AsURL());
    }

    /**
     * Test getEncodedLibraryAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(Integer.valueOf(3903), JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsInteger());
    }

    /**
     * Test getEncodedLibraryAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(Long.valueOf(3903), JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsLong());
    }

    /**
     * Test getEncodedLibraryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsLocalTime());
    }

    /**
     * Test getEncodedLibraryAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals("LAME3.90.3", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsString());
    }

    /**
     * Test getEncodedLibraryAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsBoolean());
    }

    /**
     * Test getEncodedLibraryAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(BigInteger.valueOf(3903), JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsBigInteger());
    }

    /**
     * Test getEncodedLibraryAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryAsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString4AsURL());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsLong());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsString());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameString5AsURL());
    }

    /**
     * Test getInternetMediaTypeAsInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsInteger());
    }

    /**
     * Test getInternetMediaTypeAsLong() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsLong());
    }

    /**
     * Test getInternetMediaTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsLocalDateTime());
    }

    /**
     * Test getInternetMediaTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsLocalTime());
    }

    /**
     * Test getInternetMediaTypeAsString() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals("audio/mpeg", JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsString());
    }

    /**
     * Test getInternetMediaTypeAsBoolean() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsBoolean());
    }

    /**
     * Test getInternetMediaTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsBigInteger());
    }

    /**
     * Test getInternetMediaTypeAsURL() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInternetMediaTypeAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString2AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString2AsURL());
    }

    /**
     * Test getDisabledAsInteger() method.
     */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsInteger());
    }

    /**
     * Test getDisabledAsLong() method.
     */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsLong());
    }

    /**
     * Test getDisabledAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsLocalDateTime());
    }

    /**
     * Test getDisabledAsLocalTime() method.
     */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsLocalTime());
    }

    /**
     * Test getDisabledAsString() method.
     */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsString());
    }

    /**
     * Test getDisabledAsBoolean() method.
     */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsBoolean());
    }

    /**
     * Test getDisabledAsBigInteger() method.
     */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsBigInteger());
    }

    /**
     * Test getDisabledAsURL() method.
     */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDisabledAsURL());
    }

    /**
     * Test getChannelsOriginalAsInteger() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsInteger());
    }

    /**
     * Test getChannelsOriginalAsLong() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsLong());
    }

    /**
     * Test getChannelsOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsLocalDateTime());
    }

    /**
     * Test getChannelsOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsLocalTime());
    }

    /**
     * Test getChannelsOriginalAsString() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsString());
    }

    /**
     * Test getChannelsOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsBoolean());
    }

    /**
     * Test getChannelsOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsBigInteger());
    }

    /**
     * Test getChannelsOriginalAsURL() method.
     */
    @Test
    public void subTestGetChannelsOriginalAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsOriginalAsURL());
    }

    /**
     * Test getFrameRateDenAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsInteger());
    }

    /**
     * Test getFrameRateDenAsLong() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsLong());
    }

    /**
     * Test getFrameRateDenAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsLocalDateTime());
    }

    /**
     * Test getFrameRateDenAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsLocalTime());
    }

    /**
     * Test getFrameRateDenAsString() method.
     */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsString());
    }

    /**
     * Test getFrameRateDenAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsBoolean());
    }

    /**
     * Test getFrameRateDenAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsBigInteger());
    }

    /**
     * Test getFrameRateDenAsURL() method.
     */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateDenAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString3AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString3AsURL());
    }

    /**
     * Test getStreamSizeEncodedProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsInteger());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsLong());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsString());
    }

    /**
     * Test getStreamSizeEncodedProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedProportionAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsString());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedString1AsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedString1AsURL());
    }

    /**
     * Test getChannelPositionsAsInteger() method.
     */
    @Test
    public void subTestGetChannelPositionsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsInteger());
    }

    /**
     * Test getChannelPositionsAsLong() method.
     */
    @Test
    public void subTestGetChannelPositionsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsLong());
    }

    /**
     * Test getChannelPositionsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelPositionsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsLocalDateTime());
    }

    /**
     * Test getChannelPositionsAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelPositionsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsLocalTime());
    }

    /**
     * Test getChannelPositionsAsString() method.
     */
    @Test
    public void subTestGetChannelPositionsAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsString());
    }

    /**
     * Test getChannelPositionsAsBoolean() method.
     */
    @Test
    public void subTestGetChannelPositionsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsBoolean());
    }

    /**
     * Test getChannelPositionsAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelPositionsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsBigInteger());
    }

    /**
     * Test getChannelPositionsAsURL() method.
     */
    @Test
    public void subTestGetChannelPositionsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsAsURL());
    }

    /**
     * Test getDurationAsInteger() method.
     */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(Integer.valueOf(898167), JMetaDataAudio_Test.jMetaDataAudio.getDurationAsInteger());
    }

    /**
     * Test getDurationAsLong() method.
     */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(Long.valueOf(898167), JMetaDataAudio_Test.jMetaDataAudio.getDurationAsLong());
    }

    /**
     * Test getDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationAsLocalDateTime());
    }

    /**
     * Test getDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationAsLocalTime());
    }

    /**
     * Test getDurationAsString() method.
     */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals("898167", JMetaDataAudio_Test.jMetaDataAudio.getDurationAsString());
    }

    /**
     * Test getDurationAsBoolean() method.
     */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationAsBoolean());
    }

    /**
     * Test getDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(BigInteger.valueOf(898167), JMetaDataAudio_Test.jMetaDataAudio.getDurationAsBigInteger());
    }

    /**
     * Test getDurationAsURL() method.
     */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationAsURL());
    }

    /**
     * Test getSourceDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsInteger());
    }

    /**
     * Test getSourceDurationString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsLong());
    }

    /**
     * Test getSourceDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsLocalTime());
    }

    /**
     * Test getSourceDurationString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsString());
    }

    /**
     * Test getSourceDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsBoolean());
    }

    /**
     * Test getSourceDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsBigInteger());
    }

    /**
     * Test getSourceDurationString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString5AsURL());
    }

    /**
     * Test getDurationLastFrameStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsInteger());
    }

    /**
     * Test getDurationLastFrameStringAsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsLong());
    }

    /**
     * Test getDurationLastFrameStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsLocalTime());
    }

    /**
     * Test getDurationLastFrameStringAsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsString());
    }

    /**
     * Test getDurationLastFrameStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsBoolean());
    }

    /**
     * Test getDurationLastFrameStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsBigInteger());
    }

    /**
     * Test getDurationLastFrameStringAsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameStringAsURL());
    }

    /**
     * Test getSourceDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsInteger());
    }

    /**
     * Test getSourceDurationString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsLong());
    }

    /**
     * Test getSourceDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsLocalTime());
    }

    /**
     * Test getSourceDurationString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsString());
    }

    /**
     * Test getSourceDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsBoolean());
    }

    /**
     * Test getSourceDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsBigInteger());
    }

    /**
     * Test getSourceDurationString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString4AsURL());
    }

    /**
     * Test getSourceDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsInteger());
    }

    /**
     * Test getSourceDurationString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsLong());
    }

    /**
     * Test getSourceDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsLocalTime());
    }

    /**
     * Test getSourceDurationString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsString());
    }

    /**
     * Test getSourceDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsBoolean());
    }

    /**
     * Test getSourceDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsBigInteger());
    }

    /**
     * Test getSourceDurationString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString3AsURL());
    }

    /**
     * Test getSourceDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsInteger());
    }

    /**
     * Test getSourceDurationString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsLong());
    }

    /**
     * Test getSourceDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsLocalTime());
    }

    /**
     * Test getSourceDurationString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsString());
    }

    /**
     * Test getSourceDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsBoolean());
    }

    /**
     * Test getSourceDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsBigInteger());
    }

    /**
     * Test getSourceDurationString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString2AsURL());
    }

    /**
     * Test getSourceDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsInteger());
    }

    /**
     * Test getSourceDurationString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsLong());
    }

    /**
     * Test getSourceDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsLocalTime());
    }

    /**
     * Test getSourceDurationString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsString());
    }

    /**
     * Test getSourceDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsBoolean());
    }

    /**
     * Test getSourceDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsBigInteger());
    }

    /**
     * Test getSourceDurationString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationString1AsURL());
    }

    /**
     * Test getCodecIDHintAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsInteger());
    }

    /**
     * Test getCodecIDHintAsLong() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsLong());
    }

    /**
     * Test getCodecIDHintAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsLocalDateTime());
    }

    /**
     * Test getCodecIDHintAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsLocalTime());
    }

    /**
     * Test getCodecIDHintAsString() method.
     */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals("MP3", JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsString());
    }

    /**
     * Test getCodecIDHintAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsBoolean());
    }

    /**
     * Test getCodecIDHintAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsBigInteger());
    }

    /**
     * Test getCodecIDHintAsURL() method.
     */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDHintAsURL());
    }

    /**
     * Test getMatrixChannelsAsInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsInteger());
    }

    /**
     * Test getMatrixChannelsAsLong() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsLong());
    }

    /**
     * Test getMatrixChannelsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsLocalDateTime());
    }

    /**
     * Test getMatrixChannelsAsLocalTime() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsLocalTime());
    }

    /**
     * Test getMatrixChannelsAsString() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsString());
    }

    /**
     * Test getMatrixChannelsAsBoolean() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsBoolean());
    }

    /**
     * Test getMatrixChannelsAsBigInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsBigInteger());
    }

    /**
     * Test getMatrixChannelsAsURL() method.
     */
    @Test
    public void subTestGetMatrixChannelsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsAsURL());
    }

    /**
     * Test getEncodedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsInteger());
    }

    /**
     * Test getEncodedApplicationAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsLong());
    }

    /**
     * Test getEncodedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsLocalTime());
    }

    /**
     * Test getEncodedApplicationAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsString());
    }

    /**
     * Test getEncodedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsBoolean());
    }

    /**
     * Test getEncodedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsBigInteger());
    }

    /**
     * Test getEncodedApplicationAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationAsURL());
    }

    /**
     * Test getCompressionModeStringAsInteger() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsInteger());
    }

    /**
     * Test getCompressionModeStringAsLong() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsLong());
    }

    /**
     * Test getCompressionModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsLocalDateTime());
    }

    /**
     * Test getCompressionModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsLocalTime());
    }

    /**
     * Test getCompressionModeStringAsString() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsString() {
        assertEquals("Lossy", JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsString());
    }

    /**
     * Test getCompressionModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsBoolean());
    }

    /**
     * Test getCompressionModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsBigInteger());
    }

    /**
     * Test getCompressionModeStringAsURL() method.
     */
    @Test
    public void subTestGetCompressionModeStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCompressionModeStringAsURL());
    }

    /**
     * Test getStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(Integer.valueOf(21), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsInteger());
    }

    /**
     * Test getStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(Long.valueOf(21), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsLong());
    }

    /**
     * Test getStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsLocalTime());
    }

    /**
     * Test getStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals("21 MiB", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsString());
    }

    /**
     * Test getStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsBoolean());
    }

    /**
     * Test getStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(BigInteger.valueOf(21), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsBigInteger());
    }

    /**
     * Test getStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString2AsURL());
    }

    /**
     * Test getStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(Integer.valueOf(21), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsInteger());
    }

    /**
     * Test getStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(Long.valueOf(21), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsLong());
    }

    /**
     * Test getStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsLocalTime());
    }

    /**
     * Test getStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals("21 MiB", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsString());
    }

    /**
     * Test getStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsBoolean());
    }

    /**
     * Test getStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(BigInteger.valueOf(21), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsBigInteger());
    }

    /**
     * Test getStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString1AsURL());
    }

    /**
     * Test getStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(Integer.valueOf(2056), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsInteger());
    }

    /**
     * Test getStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(Long.valueOf(2056), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsLong());
    }

    /**
     * Test getStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsLocalTime());
    }

    /**
     * Test getStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals("20.56 MiB", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsString());
    }

    /**
     * Test getStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsBoolean());
    }

    /**
     * Test getStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(BigInteger.valueOf(2056), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsBigInteger());
    }

    /**
     * Test getStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString4AsURL());
    }

    /**
     * Test getStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(Integer.valueOf(206), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsInteger());
    }

    /**
     * Test getStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(Long.valueOf(206), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsLong());
    }

    /**
     * Test getStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsLocalTime());
    }

    /**
     * Test getStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals("20.6 MiB", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsString());
    }

    /**
     * Test getStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsBoolean());
    }

    /**
     * Test getStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(BigInteger.valueOf(206), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsBigInteger());
    }

    /**
     * Test getStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString3AsURL());
    }

    /**
     * Test getStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsInteger());
    }

    /**
     * Test getStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsLong());
    }

    /**
     * Test getStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsLocalTime());
    }

    /**
     * Test getStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsString());
    }

    /**
     * Test getStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsBoolean());
    }

    /**
     * Test getStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsBigInteger());
    }

    /**
     * Test getStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeString5AsURL());
    }

    /**
     * Test getReplayGainGainStringAsInteger() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsInteger());
    }

    /**
     * Test getReplayGainGainStringAsLong() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsLong());
    }

    /**
     * Test getReplayGainGainStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsLocalDateTime());
    }

    /**
     * Test getReplayGainGainStringAsLocalTime() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsLocalTime());
    }

    /**
     * Test getReplayGainGainStringAsString() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsString());
    }

    /**
     * Test getReplayGainGainStringAsBoolean() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsBoolean());
    }

    /**
     * Test getReplayGainGainStringAsBigInteger() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsBigInteger());
    }

    /**
     * Test getReplayGainGainStringAsURL() method.
     */
    @Test
    public void subTestGetReplayGainGainStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainStringAsURL());
    }

    /**
     * Test getStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsInteger());
    }

    /**
     * Test getStreamKindAsLong() method.
     */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsLong());
    }

    /**
     * Test getStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsLocalDateTime());
    }

    /**
     * Test getStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsLocalTime());
    }

    /**
     * Test getStreamKindAsString() method.
     */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals("Audio", JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsString());
    }

    /**
     * Test getStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsBoolean());
    }

    /**
     * Test getStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsBigInteger());
    }

    /**
     * Test getStreamKindAsURL() method.
     */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindAsURL());
    }

    /**
     * Test getBitRateStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateStringAsInteger() {
        assertEquals(Integer.valueOf(192), JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsInteger());
    }

    /**
     * Test getBitRateStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateStringAsLong() {
        assertEquals(Long.valueOf(192), JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsLong());
    }

    /**
     * Test getBitRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsLocalDateTime());
    }

    /**
     * Test getBitRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsLocalTime());
    }

    /**
     * Test getBitRateStringAsString() method.
     */
    @Test
    public void subTestGetBitRateStringAsString() {
        assertEquals("192 kb/s", JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsString());
    }

    /**
     * Test getBitRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsBoolean());
    }

    /**
     * Test getBitRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(192), JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsBigInteger());
    }

    /**
     * Test getBitRateStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateStringAsURL());
    }

    /**
     * Test getFormatSettingsSignAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsInteger());
    }

    /**
     * Test getFormatSettingsSignAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsLong());
    }

    /**
     * Test getFormatSettingsSignAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsSignAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsLocalTime());
    }

    /**
     * Test getFormatSettingsSignAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsString());
    }

    /**
     * Test getFormatSettingsSignAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsBoolean());
    }

    /**
     * Test getFormatSettingsSignAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsBigInteger());
    }

    /**
     * Test getFormatSettingsSignAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsSignAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSignAsURL());
    }

    /**
     * Test getLanguageString1AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsInteger());
    }

    /**
     * Test getLanguageString1AsLong() method.
     */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsLong());
    }

    /**
     * Test getLanguageString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsLocalDateTime());
    }

    /**
     * Test getLanguageString1AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsLocalTime());
    }

    /**
     * Test getLanguageString1AsString() method.
     */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals("English", JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsString());
    }

    /**
     * Test getLanguageString1AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsBoolean());
    }

    /**
     * Test getLanguageString1AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsBigInteger());
    }

    /**
     * Test getLanguageString1AsURL() method.
     */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString1AsURL());
    }

    /**
     * Test getLanguageString2AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsInteger());
    }

    /**
     * Test getLanguageString2AsLong() method.
     */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsLong());
    }

    /**
     * Test getLanguageString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsLocalDateTime());
    }

    /**
     * Test getLanguageString2AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsLocalTime());
    }

    /**
     * Test getLanguageString2AsString() method.
     */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals("en", JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsString());
    }

    /**
     * Test getLanguageString2AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsBoolean());
    }

    /**
     * Test getLanguageString2AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsBigInteger());
    }

    /**
     * Test getLanguageString2AsURL() method.
     */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString2AsURL());
    }

    /**
     * Test getLanguageString3AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsInteger());
    }

    /**
     * Test getLanguageString3AsLong() method.
     */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsLong());
    }

    /**
     * Test getLanguageString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsLocalDateTime());
    }

    /**
     * Test getLanguageString3AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsLocalTime());
    }

    /**
     * Test getLanguageString3AsString() method.
     */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals("eng", JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsString());
    }

    /**
     * Test getLanguageString3AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsBoolean());
    }

    /**
     * Test getLanguageString3AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsBigInteger());
    }

    /**
     * Test getLanguageString3AsURL() method.
     */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString3AsURL());
    }

    /**
     * Test getMatrixChannelPositionsAsInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsInteger());
    }

    /**
     * Test getMatrixChannelPositionsAsLong() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsLong());
    }

    /**
     * Test getMatrixChannelPositionsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsLocalDateTime());
    }

    /**
     * Test getMatrixChannelPositionsAsLocalTime() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsLocalTime());
    }

    /**
     * Test getMatrixChannelPositionsAsString() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsString());
    }

    /**
     * Test getMatrixChannelPositionsAsBoolean() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsBoolean());
    }

    /**
     * Test getMatrixChannelPositionsAsBigInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsBigInteger());
    }

    /**
     * Test getMatrixChannelPositionsAsURL() method.
     */
    @Test
    public void subTestGetMatrixChannelPositionsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelPositionsAsURL());
    }

    /**
     * Test getLanguageString4AsInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsInteger());
    }

    /**
     * Test getLanguageString4AsLong() method.
     */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsLong());
    }

    /**
     * Test getLanguageString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsLocalDateTime());
    }

    /**
     * Test getLanguageString4AsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsLocalTime());
    }

    /**
     * Test getLanguageString4AsString() method.
     */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals("en", JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsString());
    }

    /**
     * Test getLanguageString4AsBoolean() method.
     */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsBoolean());
    }

    /**
     * Test getLanguageString4AsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsBigInteger());
    }

    /**
     * Test getLanguageString4AsURL() method.
     */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageString4AsURL());
    }

    /**
     * Test getCodecIDAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsInteger());
    }

    /**
     * Test getCodecIDAsLong() method.
     */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsLong());
    }

    /**
     * Test getCodecIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsLocalDateTime());
    }

    /**
     * Test getCodecIDAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsLocalTime());
    }

    /**
     * Test getCodecIDAsString() method.
     */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals("A_MPEG/L3", JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsString());
    }

    /**
     * Test getCodecIDAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsBoolean());
    }

    /**
     * Test getCodecIDAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsBigInteger());
    }

    /**
     * Test getCodecIDAsURL() method.
     */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDAsURL());
    }

    /**
     * Test getAlternateGroupAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsInteger());
    }

    /**
     * Test getAlternateGroupAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsLong());
    }

    /**
     * Test getAlternateGroupAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsLocalTime());
    }

    /**
     * Test getAlternateGroupAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsString());
    }

    /**
     * Test getAlternateGroupAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsBoolean());
    }

    /**
     * Test getAlternateGroupAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsBigInteger());
    }

    /**
     * Test getAlternateGroupAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupAsURL());
    }

    /**
     * Test getInterleaveVideoFramesAsInteger() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsInteger());
    }

    /**
     * Test getInterleaveVideoFramesAsLong() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsLong());
    }

    /**
     * Test getInterleaveVideoFramesAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsLocalDateTime());
    }

    /**
     * Test getInterleaveVideoFramesAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsLocalTime());
    }

    /**
     * Test getInterleaveVideoFramesAsString() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsString());
    }

    /**
     * Test getInterleaveVideoFramesAsBoolean() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsBoolean());
    }

    /**
     * Test getInterleaveVideoFramesAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsBigInteger());
    }

    /**
     * Test getInterleaveVideoFramesAsURL() method.
     */
    @Test
    public void subTestGetInterleaveVideoFramesAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveVideoFramesAsURL());
    }

    /**
     * Test getMatrixFormatAsInteger() method.
     */
    @Test
    public void subTestGetMatrixFormatAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsInteger());
    }

    /**
     * Test getMatrixFormatAsLong() method.
     */
    @Test
    public void subTestGetMatrixFormatAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsLong());
    }

    /**
     * Test getMatrixFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMatrixFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsLocalDateTime());
    }

    /**
     * Test getMatrixFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetMatrixFormatAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsLocalTime());
    }

    /**
     * Test getMatrixFormatAsString() method.
     */
    @Test
    public void subTestGetMatrixFormatAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsString());
    }

    /**
     * Test getMatrixFormatAsBoolean() method.
     */
    @Test
    public void subTestGetMatrixFormatAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsBoolean());
    }

    /**
     * Test getMatrixFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetMatrixFormatAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsBigInteger());
    }

    /**
     * Test getMatrixFormatAsURL() method.
     */
    @Test
    public void subTestGetMatrixFormatAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixFormatAsURL());
    }

    /**
     * Test getLanguageAsInteger() method.
     */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsInteger());
    }

    /**
     * Test getLanguageAsLong() method.
     */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsLong());
    }

    /**
     * Test getLanguageAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsLocalDateTime());
    }

    /**
     * Test getLanguageAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsLocalTime());
    }

    /**
     * Test getLanguageAsString() method.
     */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals("en", JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsString());
    }

    /**
     * Test getLanguageAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsBoolean());
    }

    /**
     * Test getLanguageAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsBigInteger());
    }

    /**
     * Test getLanguageAsURL() method.
     */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageAsURL());
    }

    /**
     * Test getDurationLastFrameAsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsInteger());
    }

    /**
     * Test getDurationLastFrameAsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsLong());
    }

    /**
     * Test getDurationLastFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsLocalTime());
    }

    /**
     * Test getDurationLastFrameAsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsString());
    }

    /**
     * Test getDurationLastFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsBoolean());
    }

    /**
     * Test getDurationLastFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsBigInteger());
    }

    /**
     * Test getDurationLastFrameAsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameAsURL());
    }

    /**
     * Test getEncodedLibraryStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(Integer.valueOf(3903), JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsInteger());
    }

    /**
     * Test getEncodedLibraryStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(Long.valueOf(3903), JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsLong());
    }

    /**
     * Test getEncodedLibraryStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsLocalTime());
    }

    /**
     * Test getEncodedLibraryStringAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals("LAME3.90.3", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsString());
    }

    /**
     * Test getEncodedLibraryStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsBoolean());
    }

    /**
     * Test getEncodedLibraryStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(3903), JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsBigInteger());
    }

    /**
     * Test getEncodedLibraryStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryStringAsURL());
    }

    /**
     * Test getSamplingRateStringAsInteger() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsInteger() {
        assertEquals(Integer.valueOf(480), JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsInteger());
    }

    /**
     * Test getSamplingRateStringAsLong() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsLong() {
        assertEquals(Long.valueOf(480), JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsLong());
    }

    /**
     * Test getSamplingRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsLocalDateTime());
    }

    /**
     * Test getSamplingRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsLocalTime());
    }

    /**
     * Test getSamplingRateStringAsString() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsString() {
        assertEquals("48.0 kHz", JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsString());
    }

    /**
     * Test getSamplingRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsBoolean());
    }

    /**
     * Test getSamplingRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(480), JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsBigInteger());
    }

    /**
     * Test getSamplingRateStringAsURL() method.
     */
    @Test
    public void subTestGetSamplingRateStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateStringAsURL());
    }

    /**
     * Test getStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(Integer.valueOf(206), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsInteger());
    }

    /**
     * Test getStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(Long.valueOf(206), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsLong());
    }

    /**
     * Test getStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsLocalTime());
    }

    /**
     * Test getStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals("20.6 MiB", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsString());
    }

    /**
     * Test getStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsBoolean());
    }

    /**
     * Test getStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(206), JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsBigInteger());
    }

    /**
     * Test getStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeStringAsURL());
    }

    /**
     * Test getDefaultStringAsInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsInteger());
    }

    /**
     * Test getDefaultStringAsLong() method.
     */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsLong());
    }

    /**
     * Test getDefaultStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsLocalDateTime());
    }

    /**
     * Test getDefaultStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsLocalTime());
    }

    /**
     * Test getDefaultStringAsString() method.
     */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals("Yes", JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsString());
    }

    /**
     * Test getDefaultStringAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsBoolean());
    }

    /**
     * Test getDefaultStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsBigInteger());
    }

    /**
     * Test getDefaultStringAsURL() method.
     */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultStringAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsString());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDStringAsURL());
    }

    /**
     * Test getSourceDurationLastFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString1AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsString());
    }

    /**
     * Test getSourceDurationLastFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString1AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString1AsURL());
    }

    /**
     * Test getFormatSettingsModeAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsInteger());
    }

    /**
     * Test getFormatSettingsModeAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsLong());
    }

    /**
     * Test getFormatSettingsModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsModeAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsLocalTime());
    }

    /**
     * Test getFormatSettingsModeAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsString() {
        assertEquals("Joint stereo", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsString());
    }

    /**
     * Test getFormatSettingsModeAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsBoolean());
    }

    /**
     * Test getFormatSettingsModeAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsBigInteger());
    }

    /**
     * Test getFormatSettingsModeAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsModeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsModeAsURL());
    }

    /**
     * Test getSourceDurationLastFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString3AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsString());
    }

    /**
     * Test getSourceDurationLastFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString3AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString3AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString2AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsString());
    }

    /**
     * Test getSourceDurationLastFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString2AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString2AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString5AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsString());
    }

    /**
     * Test getSourceDurationLastFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString5AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString5AsURL());
    }

    /**
     * Test getSourceDurationLastFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsInteger());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLong() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsLong());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsLocalDateTime());
    }

    /**
     * Test getSourceDurationLastFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsLocalTime());
    }

    /**
     * Test getSourceDurationLastFrameString4AsString() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsString());
    }

    /**
     * Test getSourceDurationLastFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsBoolean());
    }

    /**
     * Test getSourceDurationLastFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsBigInteger());
    }

    /**
     * Test getSourceDurationLastFrameString4AsURL() method.
     */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationLastFrameString4AsURL());
    }

    /**
     * Test getBitDepthStringAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsInteger());
    }

    /**
     * Test getBitDepthStringAsLong() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsLong());
    }

    /**
     * Test getBitDepthStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsLocalDateTime());
    }

    /**
     * Test getBitDepthStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsLocalTime());
    }

    /**
     * Test getBitDepthStringAsString() method.
     */
    @Test
    public void subTestGetBitDepthStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsString());
    }

    /**
     * Test getBitDepthStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsBoolean());
    }

    /**
     * Test getBitDepthStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsBigInteger());
    }

    /**
     * Test getBitDepthStringAsURL() method.
     */
    @Test
    public void subTestGetBitDepthStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStringAsURL());
    }

    /**
     * Test getFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsInteger());
    }

    /**
     * Test getFrameCountAsLong() method.
     */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsLong());
    }

    /**
     * Test getFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsLocalDateTime());
    }

    /**
     * Test getFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsLocalTime());
    }

    /**
     * Test getFrameCountAsString() method.
     */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsString());
    }

    /**
     * Test getFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsBoolean());
    }

    /**
     * Test getFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsBigInteger());
    }

    /**
     * Test getFrameCountAsURL() method.
     */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameCountAsURL());
    }

    /**
     * Test getTitleAsInteger() method.
     */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getTitleAsInteger());
    }

    /**
     * Test getTitleAsLong() method.
     */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getTitleAsLong());
    }

    /**
     * Test getTitleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTitleAsLocalDateTime());
    }

    /**
     * Test getTitleAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTitleAsLocalTime());
    }

    /**
     * Test getTitleAsString() method.
     */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals("MP3 Stereo", JMetaDataAudio_Test.jMetaDataAudio.getTitleAsString());
    }

    /**
     * Test getTitleAsBoolean() method.
     */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTitleAsBoolean());
    }

    /**
     * Test getTitleAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getTitleAsBigInteger());
    }

    /**
     * Test getTitleAsURL() method.
     */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getTitleAsURL());
    }

    /**
     * Test getDelayDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsInteger());
    }

    /**
     * Test getDelayDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsLong());
    }

    /**
     * Test getDelayDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsLocalTime());
    }

    /**
     * Test getDelayDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsString());
    }

    /**
     * Test getDelayDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsBoolean());
    }

    /**
     * Test getDelayDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsBigInteger());
    }

    /**
     * Test getDelayDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayDropFrameAsURL());
    }

    /**
     * Test getSamplingRateAsInteger() method.
     */
    @Test
    public void subTestGetSamplingRateAsInteger() {
        assertEquals(Integer.valueOf(48000), JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsInteger());
    }

    /**
     * Test getSamplingRateAsLong() method.
     */
    @Test
    public void subTestGetSamplingRateAsLong() {
        assertEquals(Long.valueOf(48000), JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsLong());
    }

    /**
     * Test getSamplingRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSamplingRateAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsLocalDateTime());
    }

    /**
     * Test getSamplingRateAsLocalTime() method.
     */
    @Test
    public void subTestGetSamplingRateAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsLocalTime());
    }

    /**
     * Test getSamplingRateAsString() method.
     */
    @Test
    public void subTestGetSamplingRateAsString() {
        assertEquals("48000", JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsString());
    }

    /**
     * Test getSamplingRateAsBoolean() method.
     */
    @Test
    public void subTestGetSamplingRateAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsBoolean());
    }

    /**
     * Test getSamplingRateAsBigInteger() method.
     */
    @Test
    public void subTestGetSamplingRateAsBigInteger() {
        assertEquals(BigInteger.valueOf(48000), JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsBigInteger());
    }

    /**
     * Test getSamplingRateAsURL() method.
     */
    @Test
    public void subTestGetSamplingRateAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplingRateAsURL());
    }

    /**
     * Test getBitRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsInteger());
    }

    /**
     * Test getBitRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsLong());
    }

    /**
     * Test getBitRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsLocalDateTime());
    }

    /**
     * Test getBitRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsLocalTime());
    }

    /**
     * Test getBitRateMaximumAsString() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsString());
    }

    /**
     * Test getBitRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsBoolean());
    }

    /**
     * Test getBitRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsBigInteger());
    }

    /**
     * Test getBitRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetBitRateMaximumAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMaximumAsURL());
    }

    /**
     * Test getFormatSettingsEmphasisAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsInteger());
    }

    /**
     * Test getFormatSettingsEmphasisAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsLong());
    }

    /**
     * Test getFormatSettingsEmphasisAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsEmphasisAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsLocalTime());
    }

    /**
     * Test getFormatSettingsEmphasisAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsString());
    }

    /**
     * Test getFormatSettingsEmphasisAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsBoolean());
    }

    /**
     * Test getFormatSettingsEmphasisAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsBigInteger());
    }

    /**
     * Test getFormatSettingsEmphasisAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsEmphasisAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEmphasisAsURL());
    }

    /**
     * Test getStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsInteger());
    }

    /**
     * Test getStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsLong());
    }

    /**
     * Test getStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsString());
    }

    /**
     * Test getStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsBoolean());
    }

    /**
     * Test getStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeProportionAsURL());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLong());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsString());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsBoolean());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeEncodedProportionAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsURL());
    }

    /**
     * Test getEncodedLibrarySettingsAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsLong());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsLocalDateTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsLocalTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsString() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsString());
    }

    /**
     * Test getEncodedLibrarySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsBoolean());
    }

    /**
     * Test getEncodedLibrarySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsBigInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibrarySettingsAsURL());
    }

    /**
     * Test getSourceDurationAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsInteger());
    }

    /**
     * Test getSourceDurationAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsLong());
    }

    /**
     * Test getSourceDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsLocalDateTime());
    }

    /**
     * Test getSourceDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsLocalTime());
    }

    /**
     * Test getSourceDurationAsString() method.
     */
    @Test
    public void subTestGetSourceDurationAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsString());
    }

    /**
     * Test getSourceDurationAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsBoolean());
    }

    /**
     * Test getSourceDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsBigInteger());
    }

    /**
     * Test getSourceDurationAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationAsURL());
    }

    /**
     * Test getFormatSettingsPSStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsInteger());
    }

    /**
     * Test getFormatSettingsPSStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsLong());
    }

    /**
     * Test getFormatSettingsPSStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsPSStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsPSStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsString());
    }

    /**
     * Test getFormatSettingsPSStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsBoolean());
    }

    /**
     * Test getFormatSettingsPSStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsPSStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsPSStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSStringAsURL());
    }

    /**
     * Test getDelayOriginalString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsInteger());
    }

    /**
     * Test getDelayOriginalString1AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsLong());
    }

    /**
     * Test getDelayOriginalString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsLocalTime());
    }

    /**
     * Test getDelayOriginalString1AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsString());
    }

    /**
     * Test getDelayOriginalString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsBoolean());
    }

    /**
     * Test getDelayOriginalString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsBigInteger());
    }

    /**
     * Test getDelayOriginalString1AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString1AsURL());
    }

    /**
     * Test getCountAsInteger() method.
     */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(Integer.valueOf(275), JMetaDataAudio_Test.jMetaDataAudio.getCountAsInteger());
    }

    /**
     * Test getCountAsLong() method.
     */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(Long.valueOf(275), JMetaDataAudio_Test.jMetaDataAudio.getCountAsLong());
    }

    /**
     * Test getCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCountAsLocalDateTime());
    }

    /**
     * Test getCountAsLocalTime() method.
     */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCountAsLocalTime());
    }

    /**
     * Test getCountAsString() method.
     */
    @Test
    public void subTestGetCountAsString() {
        assertEquals("275", JMetaDataAudio_Test.jMetaDataAudio.getCountAsString());
    }

    /**
     * Test getCountAsBoolean() method.
     */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCountAsBoolean());
    }

    /**
     * Test getCountAsBigInteger() method.
     */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(275), JMetaDataAudio_Test.jMetaDataAudio.getCountAsBigInteger());
    }

    /**
     * Test getCountAsURL() method.
     */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCountAsURL());
    }

    /**
     * Test getFormatSettingsWrappingAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsInteger());
    }

    /**
     * Test getFormatSettingsWrappingAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsLong());
    }

    /**
     * Test getFormatSettingsWrappingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsWrappingAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsLocalTime());
    }

    /**
     * Test getFormatSettingsWrappingAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsString());
    }

    /**
     * Test getFormatSettingsWrappingAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsBoolean());
    }

    /**
     * Test getFormatSettingsWrappingAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsBigInteger());
    }

    /**
     * Test getFormatSettingsWrappingAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsWrappingAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsWrappingAsURL());
    }

    /**
     * Test getDelayOriginalString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsInteger());
    }

    /**
     * Test getDelayOriginalString2AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsLong());
    }

    /**
     * Test getDelayOriginalString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsLocalTime());
    }

    /**
     * Test getDelayOriginalString2AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsString());
    }

    /**
     * Test getDelayOriginalString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsBoolean());
    }

    /**
     * Test getDelayOriginalString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsBigInteger());
    }

    /**
     * Test getDelayOriginalString2AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString2AsURL());
    }

    /**
     * Test getEncryptionAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsInteger());
    }

    /**
     * Test getEncryptionAsLong() method.
     */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsLong());
    }

    /**
     * Test getEncryptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsLocalDateTime());
    }

    /**
     * Test getEncryptionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsLocalTime());
    }

    /**
     * Test getEncryptionAsString() method.
     */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsString());
    }

    /**
     * Test getEncryptionAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsBoolean());
    }

    /**
     * Test getEncryptionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsBigInteger());
    }

    /**
     * Test getEncryptionAsURL() method.
     */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncryptionAsURL());
    }

    /**
     * Test getDelayOriginalAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsInteger());
    }

    /**
     * Test getDelayOriginalAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsLong());
    }

    /**
     * Test getDelayOriginalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsLocalTime());
    }

    /**
     * Test getDelayOriginalAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsString());
    }

    /**
     * Test getDelayOriginalAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsBoolean());
    }

    /**
     * Test getDelayOriginalAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsBigInteger());
    }

    /**
     * Test getDelayOriginalAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalAsURL());
    }

    /**
     * Test getFrameRateNumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsInteger());
    }

    /**
     * Test getFrameRateNumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsLong());
    }

    /**
     * Test getFrameRateNumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsLocalDateTime());
    }

    /**
     * Test getFrameRateNumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsLocalTime());
    }

    /**
     * Test getFrameRateNumAsString() method.
     */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsString());
    }

    /**
     * Test getFrameRateNumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsBoolean());
    }

    /**
     * Test getFrameRateNumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsBigInteger());
    }

    /**
     * Test getFrameRateNumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateNumAsURL());
    }

    /**
     * Test getAlignmentAsInteger() method.
     */
    @Test
    public void subTestGetAlignmentAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsInteger());
    }

    /**
     * Test getAlignmentAsLong() method.
     */
    @Test
    public void subTestGetAlignmentAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsLong());
    }

    /**
     * Test getAlignmentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlignmentAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsLocalDateTime());
    }

    /**
     * Test getAlignmentAsLocalTime() method.
     */
    @Test
    public void subTestGetAlignmentAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsLocalTime());
    }

    /**
     * Test getAlignmentAsString() method.
     */
    @Test
    public void subTestGetAlignmentAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsString());
    }

    /**
     * Test getAlignmentAsBoolean() method.
     */
    @Test
    public void subTestGetAlignmentAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsBoolean());
    }

    /**
     * Test getAlignmentAsBigInteger() method.
     */
    @Test
    public void subTestGetAlignmentAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsBigInteger());
    }

    /**
     * Test getAlignmentAsURL() method.
     */
    @Test
    public void subTestGetAlignmentAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlignmentAsURL());
    }

    /**
     * Test getFormatVersionAsInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsInteger());
    }

    /**
     * Test getFormatVersionAsLong() method.
     */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsLong());
    }

    /**
     * Test getFormatVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsLocalDateTime());
    }

    /**
     * Test getFormatVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsLocalTime());
    }

    /**
     * Test getFormatVersionAsString() method.
     */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals("Version 1", JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsString());
    }

    /**
     * Test getFormatVersionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsBoolean());
    }

    /**
     * Test getFormatVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsBigInteger());
    }

    /**
     * Test getFormatVersionAsURL() method.
     */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatVersionAsURL());
    }

    /**
     * Test getStreamKindPosAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsInteger());
    }

    /**
     * Test getStreamKindPosAsLong() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(Long.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsLong());
    }

    /**
     * Test getStreamKindPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsLocalDateTime());
    }

    /**
     * Test getStreamKindPosAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsLocalTime());
    }

    /**
     * Test getStreamKindPosAsString() method.
     */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals("1", JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsString());
    }

    /**
     * Test getStreamKindPosAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsBoolean());
    }

    /**
     * Test getStreamKindPosAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsBigInteger());
    }

    /**
     * Test getStreamKindPosAsURL() method.
     */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindPosAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsString());
    }

    /**
     * Test getOriginalSourceMediumIDAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getOriginalSourceMediumIDAsURL());
    }

    /**
     * Test getDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(Integer.valueOf(1458), JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsInteger());
    }

    /**
     * Test getDurationStringAsLong() method.
     */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(Long.valueOf(1458), JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsLong());
    }

    /**
     * Test getDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsLocalDateTime());
    }

    /**
     * Test getDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsLocalTime());
    }

    /**
     * Test getDurationStringAsString() method.
     */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals("14 min 58 s", JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsString());
    }

    /**
     * Test getDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsBoolean());
    }

    /**
     * Test getDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(BigInteger.valueOf(1458), JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsBigInteger());
    }

    /**
     * Test getDurationStringAsURL() method.
     */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationStringAsURL());
    }

    /**
     * Test getIDAsInteger() method.
     */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(Integer.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getIDAsInteger());
    }

    /**
     * Test getIDAsLong() method.
     */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(Long.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getIDAsLong());
    }

    /**
     * Test getIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDAsLocalDateTime());
    }

    /**
     * Test getIDAsLocalTime() method.
     */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDAsLocalTime());
    }

    /**
     * Test getIDAsString() method.
     */
    @Test
    public void subTestGetIDAsString() {
        assertEquals("2", JMetaDataAudio_Test.jMetaDataAudio.getIDAsString());
    }

    /**
     * Test getIDAsBoolean() method.
     */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDAsBoolean());
    }

    /**
     * Test getIDAsBigInteger() method.
     */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getIDAsBigInteger());
    }

    /**
     * Test getIDAsURL() method.
     */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getIDAsURL());
    }

    /**
     * Test getVideoDelayAsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayAsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsInteger());
    }

    /**
     * Test getVideoDelayAsLong() method.
     */
    @Test
    public void subTestGetVideoDelayAsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsLong());
    }

    /**
     * Test getVideoDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsLocalDateTime());
    }

    /**
     * Test getVideoDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsLocalTime());
    }

    /**
     * Test getVideoDelayAsString() method.
     */
    @Test
    public void subTestGetVideoDelayAsString() {
        assertEquals("170", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsString());
    }

    /**
     * Test getVideoDelayAsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsBoolean());
    }

    /**
     * Test getVideoDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayAsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsBigInteger());
    }

    /**
     * Test getVideoDelayAsURL() method.
     */
    @Test
    public void subTestGetVideoDelayAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayAsURL());
    }

    /**
     * Test getReplayGainGainAsInteger() method.
     */
    @Test
    public void subTestGetReplayGainGainAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsInteger());
    }

    /**
     * Test getReplayGainGainAsLong() method.
     */
    @Test
    public void subTestGetReplayGainGainAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsLong());
    }

    /**
     * Test getReplayGainGainAsLocalDateTime() method.
     */
    @Test
    public void subTestGetReplayGainGainAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsLocalDateTime());
    }

    /**
     * Test getReplayGainGainAsLocalTime() method.
     */
    @Test
    public void subTestGetReplayGainGainAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsLocalTime());
    }

    /**
     * Test getReplayGainGainAsString() method.
     */
    @Test
    public void subTestGetReplayGainGainAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsString());
    }

    /**
     * Test getReplayGainGainAsBoolean() method.
     */
    @Test
    public void subTestGetReplayGainGainAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsBoolean());
    }

    /**
     * Test getReplayGainGainAsBigInteger() method.
     */
    @Test
    public void subTestGetReplayGainGainAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsBigInteger());
    }

    /**
     * Test getReplayGainGainAsURL() method.
     */
    @Test
    public void subTestGetReplayGainGainAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getReplayGainGainAsURL());
    }

    /**
     * Test getEncodedLibraryDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsInteger());
    }

    /**
     * Test getEncodedLibraryDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsLong());
    }

    /**
     * Test getEncodedLibraryDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsLocalTime());
    }

    /**
     * Test getEncodedLibraryDateAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsString());
    }

    /**
     * Test getEncodedLibraryDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsBoolean());
    }

    /**
     * Test getEncodedLibraryDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsBigInteger());
    }

    /**
     * Test getEncodedLibraryDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryDateAsURL());
    }

    /**
     * Test getMenuIDStringAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsInteger());
    }

    /**
     * Test getMenuIDStringAsLong() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsLong());
    }

    /**
     * Test getMenuIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsLocalDateTime());
    }

    /**
     * Test getMenuIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsLocalTime());
    }

    /**
     * Test getMenuIDStringAsString() method.
     */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsString());
    }

    /**
     * Test getMenuIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsBoolean());
    }

    /**
     * Test getMenuIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsBigInteger());
    }

    /**
     * Test getMenuIDStringAsURL() method.
     */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDStringAsURL());
    }

    /**
     * Test getLanguageMoreAsInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsInteger());
    }

    /**
     * Test getLanguageMoreAsLong() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsLong());
    }

    /**
     * Test getLanguageMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsLocalDateTime());
    }

    /**
     * Test getLanguageMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsLocalTime());
    }

    /**
     * Test getLanguageMoreAsString() method.
     */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsString());
    }

    /**
     * Test getLanguageMoreAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsBoolean());
    }

    /**
     * Test getLanguageMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsBigInteger());
    }

    /**
     * Test getLanguageMoreAsURL() method.
     */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageMoreAsURL());
    }

    /**
     * Test getSourceStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsInteger());
    }

    /**
     * Test getSourceStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsLong());
    }

    /**
     * Test getSourceStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsString());
    }

    /**
     * Test getSourceStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsBoolean());
    }

    /**
     * Test getSourceStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeStringAsURL());
    }

    /**
     * Test getFormatSettingsLawAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsInteger());
    }

    /**
     * Test getFormatSettingsLawAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsLong());
    }

    /**
     * Test getFormatSettingsLawAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsLawAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsLocalTime());
    }

    /**
     * Test getFormatSettingsLawAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsString());
    }

    /**
     * Test getFormatSettingsLawAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsBoolean());
    }

    /**
     * Test getFormatSettingsLawAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsBigInteger());
    }

    /**
     * Test getFormatSettingsLawAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsLawAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsLawAsURL());
    }

    /**
     * Test getDurationFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsInteger());
    }

    /**
     * Test getDurationFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsLong());
    }

    /**
     * Test getDurationFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsLocalDateTime());
    }

    /**
     * Test getDurationFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsLocalTime());
    }

    /**
     * Test getDurationFirstFrameAsString() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsString());
    }

    /**
     * Test getDurationFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsBoolean());
    }

    /**
     * Test getDurationFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsBigInteger());
    }

    /**
     * Test getDurationFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetDurationFirstFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationFirstFrameAsURL());
    }

    /**
     * Test getDelayOriginalString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsInteger());
    }

    /**
     * Test getDelayOriginalString3AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsLong());
    }

    /**
     * Test getDelayOriginalString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsLocalTime());
    }

    /**
     * Test getDelayOriginalString3AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsString());
    }

    /**
     * Test getDelayOriginalString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsBoolean());
    }

    /**
     * Test getDelayOriginalString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsBigInteger());
    }

    /**
     * Test getDelayOriginalString3AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString3AsURL());
    }

    /**
     * Test getEncodedApplicationStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsInteger());
    }

    /**
     * Test getEncodedApplicationStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsLong());
    }

    /**
     * Test getEncodedApplicationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsLocalTime());
    }

    /**
     * Test getEncodedApplicationStringAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsString());
    }

    /**
     * Test getEncodedApplicationStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsBoolean());
    }

    /**
     * Test getEncodedApplicationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsBigInteger());
    }

    /**
     * Test getEncodedApplicationStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationStringAsURL());
    }

    /**
     * Test getDelayOriginalString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsInteger());
    }

    /**
     * Test getDelayOriginalString4AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsLong());
    }

    /**
     * Test getDelayOriginalString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsLocalTime());
    }

    /**
     * Test getDelayOriginalString4AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsString());
    }

    /**
     * Test getDelayOriginalString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsBoolean());
    }

    /**
     * Test getDelayOriginalString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsBigInteger());
    }

    /**
     * Test getDelayOriginalString4AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString4AsURL());
    }

    /**
     * Test getDelayOriginalString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsInteger());
    }

    /**
     * Test getDelayOriginalString5AsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsLong());
    }

    /**
     * Test getDelayOriginalString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsLocalDateTime());
    }

    /**
     * Test getDelayOriginalString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsLocalTime());
    }

    /**
     * Test getDelayOriginalString5AsString() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsString());
    }

    /**
     * Test getDelayOriginalString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsBoolean());
    }

    /**
     * Test getDelayOriginalString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsBigInteger());
    }

    /**
     * Test getDelayOriginalString5AsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalString5AsURL());
    }

    /**
     * Test getFormatSettingsPSAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsInteger());
    }

    /**
     * Test getFormatSettingsPSAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsLong());
    }

    /**
     * Test getFormatSettingsPSAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsPSAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsLocalTime());
    }

    /**
     * Test getFormatSettingsPSAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsString());
    }

    /**
     * Test getFormatSettingsPSAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsBoolean());
    }

    /**
     * Test getFormatSettingsPSAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsBigInteger());
    }

    /**
     * Test getFormatSettingsPSAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsPSAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsPSAsURL());
    }

    /**
     * Test getForcedAsInteger() method.
     */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsInteger());
    }

    /**
     * Test getForcedAsLong() method.
     */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsLong());
    }

    /**
     * Test getForcedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsLocalDateTime());
    }

    /**
     * Test getForcedAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsLocalTime());
    }

    /**
     * Test getForcedAsString() method.
     */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals("No", JMetaDataAudio_Test.jMetaDataAudio.getForcedAsString());
    }

    /**
     * Test getForcedAsBoolean() method.
     */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsBoolean());
    }

    /**
     * Test getForcedAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsBigInteger());
    }

    /**
     * Test getForcedAsURL() method.
     */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedAsURL());
    }

    /**
     * Test getMatrixChannelsStringAsInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsInteger());
    }

    /**
     * Test getMatrixChannelsStringAsLong() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsLong());
    }

    /**
     * Test getMatrixChannelsStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsLocalDateTime());
    }

    /**
     * Test getMatrixChannelsStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsLocalTime());
    }

    /**
     * Test getMatrixChannelsStringAsString() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsString());
    }

    /**
     * Test getMatrixChannelsStringAsBoolean() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsBoolean());
    }

    /**
     * Test getMatrixChannelsStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsBigInteger());
    }

    /**
     * Test getMatrixChannelsStringAsURL() method.
     */
    @Test
    public void subTestGetMatrixChannelsStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMatrixChannelsStringAsURL());
    }

    /**
     * Test getInformAsInteger() method.
     */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInformAsInteger());
    }

    /**
     * Test getInformAsLong() method.
     */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInformAsLong());
    }

    /**
     * Test getInformAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInformAsLocalDateTime());
    }

    /**
     * Test getInformAsLocalTime() method.
     */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInformAsLocalTime());
    }

    /**
     * Test getInformAsBoolean() method.
     */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInformAsBoolean());
    }

    /**
     * Test getInformAsBigInteger() method.
     */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(new BigInteger("213331458192248017020633903"), JMetaDataAudio_Test.jMetaDataAudio.getInformAsBigInteger());
    }

    /**
     * Test getInformAsURL() method.
     */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInformAsURL());
    }

    /**
     * Test getSourceDurationFirstFrameAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsInteger());
    }

    /**
     * Test getSourceDurationFirstFrameAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsLong());
    }

    /**
     * Test getSourceDurationFirstFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsLocalDateTime());
    }

    /**
     * Test getSourceDurationFirstFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsLocalTime());
    }

    /**
     * Test getSourceDurationFirstFrameAsString() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsString());
    }

    /**
     * Test getSourceDurationFirstFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsBoolean());
    }

    /**
     * Test getSourceDurationFirstFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsBigInteger());
    }

    /**
     * Test getSourceDurationFirstFrameAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationFirstFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationFirstFrameAsURL());
    }

    /**
     * Test getStreamKindIDAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(Integer.valueOf(0), JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsInteger());
    }

    /**
     * Test getStreamKindIDAsLong() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(Long.valueOf(0), JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsLong());
    }

    /**
     * Test getStreamKindIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsLocalDateTime());
    }

    /**
     * Test getStreamKindIDAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsLocalTime());
    }

    /**
     * Test getStreamKindIDAsString() method.
     */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals("0", JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsString());
    }

    /**
     * Test getStreamKindIDAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsBoolean());
    }

    /**
     * Test getStreamKindIDAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(BigInteger.valueOf(0), JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsBigInteger());
    }

    /**
     * Test getStreamKindIDAsURL() method.
     */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindIDAsURL());
    }

    /**
     * Test getFormatSettingsFloorAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsInteger());
    }

    /**
     * Test getFormatSettingsFloorAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsLong());
    }

    /**
     * Test getFormatSettingsFloorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsFloorAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsLocalTime());
    }

    /**
     * Test getFormatSettingsFloorAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsString());
    }

    /**
     * Test getFormatSettingsFloorAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsBoolean());
    }

    /**
     * Test getFormatSettingsFloorAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsBigInteger());
    }

    /**
     * Test getFormatSettingsFloorAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsFloorAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsFloorAsURL());
    }

    /**
     * Test getFormatUrlAsInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsInteger());
    }

    /**
     * Test getFormatUrlAsLong() method.
     */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsLong());
    }

    /**
     * Test getFormatUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsLocalDateTime());
    }

    /**
     * Test getFormatUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsLocalTime());
    }

    /**
     * Test getFormatUrlAsString() method.
     */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsString());
    }

    /**
     * Test getFormatUrlAsBoolean() method.
     */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsBoolean());
    }

    /**
     * Test getFormatUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsBigInteger());
    }

    /**
     * Test getFormatUrlAsURL() method.
     */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatUrlAsURL());
    }

    /**
     * Test getBitRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsInteger());
    }

    /**
     * Test getBitRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsLong());
    }

    /**
     * Test getBitRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getBitRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsLocalTime());
    }

    /**
     * Test getBitRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsString());
    }

    /**
     * Test getBitRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsBoolean());
    }

    /**
     * Test getBitRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsBigInteger());
    }

    /**
     * Test getBitRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumStringAsURL());
    }

    /**
     * Test getFrameRateStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsInteger());
    }

    /**
     * Test getFrameRateStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsLong());
    }

    /**
     * Test getFrameRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsLocalTime());
    }

    /**
     * Test getFrameRateStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsString());
    }

    /**
     * Test getFrameRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsBoolean());
    }

    /**
     * Test getFrameRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsBigInteger());
    }

    /**
     * Test getFrameRateStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFrameRateStringAsURL());
    }

    /**
     * Test getSourceFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsInteger());
    }

    /**
     * Test getSourceFrameCountAsLong() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsLong());
    }

    /**
     * Test getSourceFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsLocalDateTime());
    }

    /**
     * Test getSourceFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsLocalTime());
    }

    /**
     * Test getSourceFrameCountAsString() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsString());
    }

    /**
     * Test getSourceFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsBoolean());
    }

    /**
     * Test getSourceFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsBigInteger());
    }

    /**
     * Test getSourceFrameCountAsURL() method.
     */
    @Test
    public void subTestGetSourceFrameCountAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceFrameCountAsURL());
    }

    /**
     * Test getDefaultAsInteger() method.
     */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsInteger());
    }

    /**
     * Test getDefaultAsLong() method.
     */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsLong());
    }

    /**
     * Test getDefaultAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsLocalDateTime());
    }

    /**
     * Test getDefaultAsLocalTime() method.
     */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsLocalTime());
    }

    /**
     * Test getDefaultAsString() method.
     */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals("Yes", JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsString());
    }

    /**
     * Test getDefaultAsBoolean() method.
     */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsBoolean());
    }

    /**
     * Test getDefaultAsBigInteger() method.
     */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsBigInteger());
    }

    /**
     * Test getDefaultAsURL() method.
     */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDefaultAsURL());
    }

    /**
     * Test getDelayOriginalSettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsInteger());
    }

    /**
     * Test getDelayOriginalSettingsAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsLong());
    }

    /**
     * Test getDelayOriginalSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsLocalTime());
    }

    /**
     * Test getDelayOriginalSettingsAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsString());
    }

    /**
     * Test getDelayOriginalSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsBoolean());
    }

    /**
     * Test getDelayOriginalSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsBigInteger());
    }

    /**
     * Test getDelayOriginalSettingsAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalSettingsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalSettingsAsURL());
    }

    /**
     * Test getEncodedApplicationNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsInteger());
    }

    /**
     * Test getEncodedApplicationNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsLong());
    }

    /**
     * Test getEncodedApplicationNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsString());
    }

    /**
     * Test getEncodedApplicationNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationNameAsURL());
    }

    /**
     * Test getUniqueIDStringAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsInteger());
    }

    /**
     * Test getUniqueIDStringAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsLong());
    }

    /**
     * Test getUniqueIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsLocalDateTime());
    }

    /**
     * Test getUniqueIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsLocalTime());
    }

    /**
     * Test getUniqueIDStringAsString() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsString());
    }

    /**
     * Test getUniqueIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsBoolean());
    }

    /**
     * Test getUniqueIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsBigInteger());
    }

    /**
     * Test getUniqueIDStringAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getUniqueIDStringAsURL());
    }

    /**
     * Test getBitDepthDetectedAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsInteger());
    }

    /**
     * Test getBitDepthDetectedAsLong() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsLong());
    }

    /**
     * Test getBitDepthDetectedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsLocalDateTime());
    }

    /**
     * Test getBitDepthDetectedAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsLocalTime());
    }

    /**
     * Test getBitDepthDetectedAsString() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsString());
    }

    /**
     * Test getBitDepthDetectedAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsBoolean());
    }

    /**
     * Test getBitDepthDetectedAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsBigInteger());
    }

    /**
     * Test getBitDepthDetectedAsURL() method.
     */
    @Test
    public void subTestGetBitDepthDetectedAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedAsURL());
    }

    /**
     * Test getFormatProfileAsInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(Integer.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsInteger());
    }

    /**
     * Test getFormatProfileAsLong() method.
     */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(Long.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsLong());
    }

    /**
     * Test getFormatProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsLocalDateTime());
    }

    /**
     * Test getFormatProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsLocalTime());
    }

    /**
     * Test getFormatProfileAsString() method.
     */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals("Layer 3", JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsString());
    }

    /**
     * Test getFormatProfileAsBoolean() method.
     */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsBoolean());
    }

    /**
     * Test getFormatProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(BigInteger.valueOf(3), JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsBigInteger());
    }

    /**
     * Test getFormatProfileAsURL() method.
     */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatProfileAsURL());
    }

    /**
     * Test getStreamSizeEncodedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsLong());
    }

    /**
     * Test getStreamSizeEncodedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsString());
    }

    /**
     * Test getStreamSizeEncodedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsString());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString1AsURL());
    }

    /**
     * Test getStreamSizeEncodedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsLong());
    }

    /**
     * Test getStreamSizeEncodedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsString());
    }

    /**
     * Test getStreamSizeEncodedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString3AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsString());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsString());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString3AsURL());
    }

    /**
     * Test getStreamSizeEncodedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsLong());
    }

    /**
     * Test getStreamSizeEncodedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsString());
    }

    /**
     * Test getStreamSizeEncodedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString1AsURL());
    }

    /**
     * Test getLanguageStringAsInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsInteger());
    }

    /**
     * Test getLanguageStringAsLong() method.
     */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsLong());
    }

    /**
     * Test getLanguageStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsLocalDateTime());
    }

    /**
     * Test getLanguageStringAsLocalTime() method.
     */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsLocalTime());
    }

    /**
     * Test getLanguageStringAsString() method.
     */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals("English", JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsString());
    }

    /**
     * Test getLanguageStringAsBoolean() method.
     */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsBoolean());
    }

    /**
     * Test getLanguageStringAsBigInteger() method.
     */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsBigInteger());
    }

    /**
     * Test getLanguageStringAsURL() method.
     */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getLanguageStringAsURL());
    }

    /**
     * Test getStreamSizeDemuxedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsString());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString4AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsString());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedString5AsURL());
    }

    /**
     * Test getStreamSizeEncodedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsLong());
    }

    /**
     * Test getStreamSizeEncodedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsString());
    }

    /**
     * Test getStreamSizeEncodedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString4AsURL());
    }

    /**
     * Test getStreamSizeEncodedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsInteger());
    }

    /**
     * Test getStreamSizeEncodedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsLong());
    }

    /**
     * Test getStreamSizeEncodedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsString());
    }

    /**
     * Test getStreamSizeEncodedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsBoolean());
    }

    /**
     * Test getStreamSizeEncodedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedString5AsURL());
    }

    /**
     * Test getFormatLevelAsInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsInteger());
    }

    /**
     * Test getFormatLevelAsLong() method.
     */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsLong());
    }

    /**
     * Test getFormatLevelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsLocalDateTime());
    }

    /**
     * Test getFormatLevelAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsLocalTime());
    }

    /**
     * Test getFormatLevelAsString() method.
     */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsString());
    }

    /**
     * Test getFormatLevelAsBoolean() method.
     */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsBoolean());
    }

    /**
     * Test getFormatLevelAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsBigInteger());
    }

    /**
     * Test getFormatLevelAsURL() method.
     */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatLevelAsURL());
    }

    /**
     * Test getDurationLastFrameString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsInteger());
    }

    /**
     * Test getDurationLastFrameString5AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsLong());
    }

    /**
     * Test getDurationLastFrameString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString5AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsString());
    }

    /**
     * Test getDurationLastFrameString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsBoolean());
    }

    /**
     * Test getDurationLastFrameString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString5AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString5AsURL());
    }

    /**
     * Test getDurationLastFrameString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsInteger());
    }

    /**
     * Test getDurationLastFrameString4AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsLong());
    }

    /**
     * Test getDurationLastFrameString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString4AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsString());
    }

    /**
     * Test getDurationLastFrameString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsBoolean());
    }

    /**
     * Test getDurationLastFrameString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString4AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString4AsURL());
    }

    /**
     * Test getStreamSizeDemuxedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsLong());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsString());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedStringAsURL());
    }

    /**
     * Test getForcedStringAsInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsInteger());
    }

    /**
     * Test getForcedStringAsLong() method.
     */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsLong());
    }

    /**
     * Test getForcedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsLocalDateTime());
    }

    /**
     * Test getForcedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsLocalTime());
    }

    /**
     * Test getForcedStringAsString() method.
     */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals("No", JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsString());
    }

    /**
     * Test getForcedStringAsBoolean() method.
     */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsBoolean());
    }

    /**
     * Test getForcedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsBigInteger());
    }

    /**
     * Test getForcedStringAsURL() method.
     */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getForcedStringAsURL());
    }

    /**
     * Test getBitDepthAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsInteger());
    }

    /**
     * Test getBitDepthAsLong() method.
     */
    @Test
    public void subTestGetBitDepthAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsLong());
    }

    /**
     * Test getBitDepthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsLocalDateTime());
    }

    /**
     * Test getBitDepthAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsLocalTime());
    }

    /**
     * Test getBitDepthAsString() method.
     */
    @Test
    public void subTestGetBitDepthAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsString());
    }

    /**
     * Test getBitDepthAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsBoolean());
    }

    /**
     * Test getBitDepthAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsBigInteger());
    }

    /**
     * Test getBitDepthAsURL() method.
     */
    @Test
    public void subTestGetBitDepthAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthAsURL());
    }

    /**
     * Test getStreamSizeEncodedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsInteger());
    }

    /**
     * Test getStreamSizeEncodedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsLong());
    }

    /**
     * Test getStreamSizeEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsString());
    }

    /**
     * Test getStreamSizeEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedAsURL());
    }

    /**
     * Test getStreamCountAsInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(Integer.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsInteger());
    }

    /**
     * Test getStreamCountAsLong() method.
     */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(Long.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsLong());
    }

    /**
     * Test getStreamCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsLocalDateTime());
    }

    /**
     * Test getStreamCountAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsLocalTime());
    }

    /**
     * Test getStreamCountAsString() method.
     */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals("2", JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsString());
    }

    /**
     * Test getStreamCountAsBoolean() method.
     */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsBoolean());
    }

    /**
     * Test getStreamCountAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsBigInteger());
    }

    /**
     * Test getStreamCountAsURL() method.
     */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamCountAsURL());
    }

    /**
     * Test getStreamSizeEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsInteger());
    }

    /**
     * Test getStreamSizeEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsLong());
    }

    /**
     * Test getStreamSizeEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeEncodedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsString());
    }

    /**
     * Test getStreamSizeEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsBoolean());
    }

    /**
     * Test getStreamSizeEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeEncodedStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeEncodedStringAsURL());
    }

    /**
     * Test getDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(Integer.valueOf(1458), JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsInteger());
    }

    /**
     * Test getDurationString2AsLong() method.
     */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(Long.valueOf(1458), JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsLong());
    }

    /**
     * Test getDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsLocalDateTime());
    }

    /**
     * Test getDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsLocalTime());
    }

    /**
     * Test getDurationString2AsString() method.
     */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals("14 min 58 s", JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsString());
    }

    /**
     * Test getDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsBoolean());
    }

    /**
     * Test getDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458), JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsBigInteger());
    }

    /**
     * Test getDurationString2AsURL() method.
     */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString2AsURL());
    }

    /**
     * Test getDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(Integer.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsInteger());
    }

    /**
     * Test getDurationString3AsLong() method.
     */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(Long.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsLong());
    }

    /**
     * Test getDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsLocalDateTime());
    }

    /**
     * Test getDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(LocalTime.of(0, 14, 58, 167000000), JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsLocalTime());
    }

    /**
     * Test getDurationString3AsString() method.
     */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals("00:14:58.167", JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsString());
    }

    /**
     * Test getDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsBoolean());
    }

    /**
     * Test getDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsBigInteger());
    }

    /**
     * Test getDurationString3AsURL() method.
     */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString3AsURL());
    }

    /**
     * Test getChannelLayoutAsInteger() method.
     */
    @Test
    public void subTestGetChannelLayoutAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsInteger());
    }

    /**
     * Test getChannelLayoutAsLong() method.
     */
    @Test
    public void subTestGetChannelLayoutAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsLong());
    }

    /**
     * Test getChannelLayoutAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelLayoutAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsLocalDateTime());
    }

    /**
     * Test getChannelLayoutAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelLayoutAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsLocalTime());
    }

    /**
     * Test getChannelLayoutAsString() method.
     */
    @Test
    public void subTestGetChannelLayoutAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsString());
    }

    /**
     * Test getChannelLayoutAsBoolean() method.
     */
    @Test
    public void subTestGetChannelLayoutAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsBoolean());
    }

    /**
     * Test getChannelLayoutAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelLayoutAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsBigInteger());
    }

    /**
     * Test getChannelLayoutAsURL() method.
     */
    @Test
    public void subTestGetChannelLayoutAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelLayoutAsURL());
    }

    /**
     * Test getDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(Integer.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsInteger());
    }

    /**
     * Test getDurationString1AsLong() method.
     */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(Long.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsLong());
    }

    /**
     * Test getDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsLocalDateTime());
    }

    /**
     * Test getDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsLocalTime());
    }

    /**
     * Test getDurationString1AsString() method.
     */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals("14 min 58 s 167 ms", JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsString());
    }

    /**
     * Test getDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsBoolean());
    }

    /**
     * Test getDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsBigInteger());
    }

    /**
     * Test getDurationString1AsURL() method.
     */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString1AsURL());
    }

    /**
     * Test getDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsInteger());
    }

    /**
     * Test getDurationString4AsLong() method.
     */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsLong());
    }

    /**
     * Test getDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsLocalDateTime());
    }

    /**
     * Test getDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsLocalTime());
    }

    /**
     * Test getDurationString4AsString() method.
     */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsString());
    }

    /**
     * Test getDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsBoolean());
    }

    /**
     * Test getDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsBigInteger());
    }

    /**
     * Test getDurationString4AsURL() method.
     */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString4AsURL());
    }

    /**
     * Test getDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(Integer.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsInteger());
    }

    /**
     * Test getDurationString5AsLong() method.
     */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(Long.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsLong());
    }

    /**
     * Test getDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsLocalDateTime());
    }

    /**
     * Test getDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(LocalTime.of(0, 14, 58, 167000000), JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsLocalTime());
    }

    /**
     * Test getDurationString5AsString() method.
     */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals("00:14:58.167", JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsString());
    }

    /**
     * Test getDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsBoolean());
    }

    /**
     * Test getDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(BigInteger.valueOf(1458167), JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsBigInteger());
    }

    /**
     * Test getDurationString5AsURL() method.
     */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationString5AsURL());
    }

    /**
     * Test getBitRateEncodedAsInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsInteger());
    }

    /**
     * Test getBitRateEncodedAsLong() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsLong());
    }

    /**
     * Test getBitRateEncodedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsLocalDateTime());
    }

    /**
     * Test getBitRateEncodedAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsLocalTime());
    }

    /**
     * Test getBitRateEncodedAsString() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsString());
    }

    /**
     * Test getBitRateEncodedAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsBoolean());
    }

    /**
     * Test getBitRateEncodedAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsBigInteger());
    }

    /**
     * Test getBitRateEncodedAsURL() method.
     */
    @Test
    public void subTestGetBitRateEncodedAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedAsURL());
    }

    /**
     * Test getDelaySourceAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsInteger());
    }

    /**
     * Test getDelaySourceAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsLong());
    }

    /**
     * Test getDelaySourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsLocalDateTime());
    }

    /**
     * Test getDelaySourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsLocalTime());
    }

    /**
     * Test getDelaySourceAsString() method.
     */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals("Container", JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsString());
    }

    /**
     * Test getDelaySourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsBoolean());
    }

    /**
     * Test getDelaySourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsBigInteger());
    }

    /**
     * Test getDelaySourceAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceAsURL());
    }

    /**
     * Test getDelayOriginalDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsInteger());
    }

    /**
     * Test getDelayOriginalDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsLong());
    }

    /**
     * Test getDelayOriginalDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsLocalTime());
    }

    /**
     * Test getDelayOriginalDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsString());
    }

    /**
     * Test getDelayOriginalDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsBoolean());
    }

    /**
     * Test getDelayOriginalDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsBigInteger());
    }

    /**
     * Test getDelayOriginalDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalDropFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalDropFrameAsURL());
    }

    /**
     * Test getDurationLastFrameString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsInteger());
    }

    /**
     * Test getDurationLastFrameString1AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsLong());
    }

    /**
     * Test getDurationLastFrameString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString1AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsString());
    }

    /**
     * Test getDurationLastFrameString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsBoolean());
    }

    /**
     * Test getDurationLastFrameString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString1AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString1AsURL());
    }

    /**
     * Test getDelayOriginalStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsInteger());
    }

    /**
     * Test getDelayOriginalStringAsLong() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsLong());
    }

    /**
     * Test getDelayOriginalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsLocalDateTime());
    }

    /**
     * Test getDelayOriginalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsLocalTime());
    }

    /**
     * Test getDelayOriginalStringAsString() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsString());
    }

    /**
     * Test getDelayOriginalStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsBoolean());
    }

    /**
     * Test getDelayOriginalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsBigInteger());
    }

    /**
     * Test getDelayOriginalStringAsURL() method.
     */
    @Test
    public void subTestGetDelayOriginalStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelayOriginalStringAsURL());
    }

    /**
     * Test getDurationLastFrameString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsInteger());
    }

    /**
     * Test getDurationLastFrameString3AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsLong());
    }

    /**
     * Test getDurationLastFrameString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString3AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsString());
    }

    /**
     * Test getDurationLastFrameString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsBoolean());
    }

    /**
     * Test getDurationLastFrameString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString3AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString3AsURL());
    }

    /**
     * Test getDurationLastFrameString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsInteger());
    }

    /**
     * Test getDurationLastFrameString2AsLong() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsLong());
    }

    /**
     * Test getDurationLastFrameString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsLocalDateTime());
    }

    /**
     * Test getDurationLastFrameString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsLocalTime());
    }

    /**
     * Test getDurationLastFrameString2AsString() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsString());
    }

    /**
     * Test getDurationLastFrameString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsBoolean());
    }

    /**
     * Test getDurationLastFrameString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsBigInteger());
    }

    /**
     * Test getDurationLastFrameString2AsURL() method.
     */
    @Test
    public void subTestGetDurationLastFrameString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDurationLastFrameString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsLong());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsString());
    }

    /**
     * Test getStreamSizeDemuxedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamSizeDemuxedAsURL());
    }

    /**
     * Test getFormatSettingsAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsInteger());
    }

    /**
     * Test getFormatSettingsAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsLong());
    }

    /**
     * Test getFormatSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsLocalTime());
    }

    /**
     * Test getFormatSettingsAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals("Joint stereo", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsString());
    }

    /**
     * Test getFormatSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsBoolean());
    }

    /**
     * Test getFormatSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsBigInteger());
    }

    /**
     * Test getFormatSettingsAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsAsURL());
    }

    /**
     * Test getServiceKindAsInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsInteger());
    }

    /**
     * Test getServiceKindAsLong() method.
     */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsLong());
    }

    /**
     * Test getServiceKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsLocalDateTime());
    }

    /**
     * Test getServiceKindAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsLocalTime());
    }

    /**
     * Test getServiceKindAsString() method.
     */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsString());
    }

    /**
     * Test getServiceKindAsBoolean() method.
     */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsBoolean());
    }

    /**
     * Test getServiceKindAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsBigInteger());
    }

    /**
     * Test getServiceKindAsURL() method.
     */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getServiceKindAsURL());
    }

    /**
     * Test getFirstPacketOrderAsInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsInteger());
    }

    /**
     * Test getFirstPacketOrderAsLong() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsLong());
    }

    /**
     * Test getFirstPacketOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsLocalDateTime());
    }

    /**
     * Test getFirstPacketOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsLocalTime());
    }

    /**
     * Test getFirstPacketOrderAsString() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsString());
    }

    /**
     * Test getFirstPacketOrderAsBoolean() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsBoolean());
    }

    /**
     * Test getFirstPacketOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsBigInteger());
    }

    /**
     * Test getFirstPacketOrderAsURL() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFirstPacketOrderAsURL());
    }

    /**
     * Test getChannelsAsInteger() method.
     */
    @Test
    public void subTestGetChannelsAsInteger() {
        assertEquals(Integer.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsInteger());
    }

    /**
     * Test getChannelsAsLong() method.
     */
    @Test
    public void subTestGetChannelsAsLong() {
        assertEquals(Long.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsLong());
    }

    /**
     * Test getChannelsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelsAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsLocalDateTime());
    }

    /**
     * Test getChannelsAsLocalTime() method.
     */
    @Test
    public void subTestGetChannelsAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsLocalTime());
    }

    /**
     * Test getChannelsAsString() method.
     */
    @Test
    public void subTestGetChannelsAsString() {
        assertEquals("2", JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsString());
    }

    /**
     * Test getChannelsAsBoolean() method.
     */
    @Test
    public void subTestGetChannelsAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsBoolean());
    }

    /**
     * Test getChannelsAsBigInteger() method.
     */
    @Test
    public void subTestGetChannelsAsBigInteger() {
        assertEquals(BigInteger.valueOf(2), JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsBigInteger());
    }

    /**
     * Test getChannelsAsURL() method.
     */
    @Test
    public void subTestGetChannelsAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelsAsURL());
    }

    /**
     * Test getFormatSettingsEndiannessAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsInteger());
    }

    /**
     * Test getFormatSettingsEndiannessAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsLong());
    }

    /**
     * Test getFormatSettingsEndiannessAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsEndiannessAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsLocalTime());
    }

    /**
     * Test getFormatSettingsEndiannessAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsString());
    }

    /**
     * Test getFormatSettingsEndiannessAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsBoolean());
    }

    /**
     * Test getFormatSettingsEndiannessAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsBigInteger());
    }

    /**
     * Test getFormatSettingsEndiannessAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsEndiannessAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsEndiannessAsURL());
    }

    /**
     * Test getVideoDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsInteger());
    }

    /**
     * Test getVideoDelayString5AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsLong());
    }

    /**
     * Test getVideoDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsLocalTime());
    }

    /**
     * Test getVideoDelayString5AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsString());
    }

    /**
     * Test getVideoDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsBoolean());
    }

    /**
     * Test getVideoDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsBigInteger());
    }

    /**
     * Test getVideoDelayString5AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString5AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString5AsURL());
    }

    /**
     * Test getVideoDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsInteger());
    }

    /**
     * Test getVideoDelayString1AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsLong());
    }

    /**
     * Test getVideoDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsLocalTime());
    }

    /**
     * Test getVideoDelayString1AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsString() {
        assertEquals("170 ms", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsString());
    }

    /**
     * Test getVideoDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsBoolean());
    }

    /**
     * Test getVideoDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsBigInteger());
    }

    /**
     * Test getVideoDelayString1AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString1AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString1AsURL());
    }

    /**
     * Test getVideoDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsInteger());
    }

    /**
     * Test getVideoDelayString2AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsLong());
    }

    /**
     * Test getVideoDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsLocalTime());
    }

    /**
     * Test getVideoDelayString2AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsString() {
        assertEquals("170 ms", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsString());
    }

    /**
     * Test getVideoDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsBoolean());
    }

    /**
     * Test getVideoDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsBigInteger());
    }

    /**
     * Test getVideoDelayString2AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString2AsURL());
    }

    /**
     * Test getVideoDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsInteger() {
        assertEquals(Integer.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsInteger());
    }

    /**
     * Test getVideoDelayString3AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsLong() {
        assertEquals(Long.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsLong());
    }

    /**
     * Test getVideoDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsLocalTime() {
        assertEquals(LocalTime.of(0, 0, 0, 170000000), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsLocalTime());
    }

    /**
     * Test getVideoDelayString3AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsString() {
        assertEquals("00:00:00.170", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsString());
    }

    /**
     * Test getVideoDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsBoolean());
    }

    /**
     * Test getVideoDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsBigInteger() {
        assertEquals(BigInteger.valueOf(170), JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsBigInteger());
    }

    /**
     * Test getVideoDelayString3AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString3AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString3AsURL());
    }

    /**
     * Test getVideoDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsInteger());
    }

    /**
     * Test getVideoDelayString4AsLong() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsLong());
    }

    /**
     * Test getVideoDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsLocalDateTime());
    }

    /**
     * Test getVideoDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsLocalTime());
    }

    /**
     * Test getVideoDelayString4AsString() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsString());
    }

    /**
     * Test getVideoDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsBoolean());
    }

    /**
     * Test getVideoDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsBigInteger());
    }

    /**
     * Test getVideoDelayString4AsURL() method.
     */
    @Test
    public void subTestGetVideoDelayString4AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getVideoDelayString4AsURL());
    }

    /**
     * Test getBitRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsInteger());
    }

    /**
     * Test getBitRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsLong());
    }

    /**
     * Test getBitRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getBitRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsLocalTime());
    }

    /**
     * Test getBitRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsString());
    }

    /**
     * Test getBitRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsBoolean());
    }

    /**
     * Test getBitRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsBigInteger());
    }

    /**
     * Test getBitRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateNominalStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalStringAsURL());
    }

    /**
     * Test getBitDepthDetectedStringAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsInteger());
    }

    /**
     * Test getBitDepthDetectedStringAsLong() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsLong());
    }

    /**
     * Test getBitDepthDetectedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsLocalDateTime());
    }

    /**
     * Test getBitDepthDetectedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsLocalTime());
    }

    /**
     * Test getBitDepthDetectedStringAsString() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsString());
    }

    /**
     * Test getBitDepthDetectedStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsBoolean());
    }

    /**
     * Test getBitDepthDetectedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsBigInteger());
    }

    /**
     * Test getBitDepthDetectedStringAsURL() method.
     */
    @Test
    public void subTestGetBitDepthDetectedStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthDetectedStringAsURL());
    }

    /**
     * Test getFormatAsInteger() method.
     */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsInteger());
    }

    /**
     * Test getFormatAsLong() method.
     */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsLong());
    }

    /**
     * Test getFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsLocalDateTime());
    }

    /**
     * Test getFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsLocalTime());
    }

    /**
     * Test getFormatAsString() method.
     */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals("MPEG Audio", JMetaDataAudio_Test.jMetaDataAudio.getFormatAsString());
    }

    /**
     * Test getFormatAsBoolean() method.
     */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsBoolean());
    }

    /**
     * Test getFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsBigInteger());
    }

    /**
     * Test getFormatAsURL() method.
     */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatAsURL());
    }

    /**
     * Test getBitDepthStoredAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsInteger());
    }

    /**
     * Test getBitDepthStoredAsLong() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsLong());
    }

    /**
     * Test getBitDepthStoredAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsLocalDateTime());
    }

    /**
     * Test getBitDepthStoredAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsLocalTime());
    }

    /**
     * Test getBitDepthStoredAsString() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsString());
    }

    /**
     * Test getBitDepthStoredAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsBoolean());
    }

    /**
     * Test getBitDepthStoredAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsBigInteger());
    }

    /**
     * Test getBitDepthStoredAsURL() method.
     */
    @Test
    public void subTestGetBitDepthStoredAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredAsURL());
    }

    /**
     * Test getBitDepthStoredStringAsInteger() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsInteger());
    }

    /**
     * Test getBitDepthStoredStringAsLong() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsLong());
    }

    /**
     * Test getBitDepthStoredStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsLocalDateTime());
    }

    /**
     * Test getBitDepthStoredStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsLocalTime());
    }

    /**
     * Test getBitDepthStoredStringAsString() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsString());
    }

    /**
     * Test getBitDepthStoredStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsBoolean());
    }

    /**
     * Test getBitDepthStoredStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsBigInteger());
    }

    /**
     * Test getBitDepthStoredStringAsURL() method.
     */
    @Test
    public void subTestGetBitDepthStoredStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitDepthStoredStringAsURL());
    }

    /**
     * Test getCodecIDStringAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsInteger());
    }

    /**
     * Test getCodecIDStringAsLong() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsLong());
    }

    /**
     * Test getCodecIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsLocalDateTime());
    }

    /**
     * Test getCodecIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsLocalTime());
    }

    /**
     * Test getCodecIDStringAsString() method.
     */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsString());
    }

    /**
     * Test getCodecIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsBoolean());
    }

    /**
     * Test getCodecIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsBigInteger());
    }

    /**
     * Test getCodecIDStringAsURL() method.
     */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getCodecIDStringAsURL());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsLong());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsString());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedLibraryCompanyNameAsURL());
    }

    /**
     * Test getSourceStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsInteger());
    }

    /**
     * Test getSourceStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsLong());
    }

    /**
     * Test getSourceStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsLocalDateTime());
    }

    /**
     * Test getSourceStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsLocalTime());
    }

    /**
     * Test getSourceStreamSizeAsString() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsString());
    }

    /**
     * Test getSourceStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsBoolean());
    }

    /**
     * Test getSourceStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsBigInteger());
    }

    /**
     * Test getSourceStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetSourceStreamSizeAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceStreamSizeAsURL());
    }

    /**
     * Test getFormatCommercialAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsInteger());
    }

    /**
     * Test getFormatCommercialAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsLong());
    }

    /**
     * Test getFormatCommercialAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsLocalTime());
    }

    /**
     * Test getFormatCommercialAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals("MPEG Audio", JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsString());
    }

    /**
     * Test getFormatCommercialAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsBoolean());
    }

    /**
     * Test getFormatCommercialAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsBigInteger());
    }

    /**
     * Test getFormatCommercialAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatCommercialAsURL());
    }

    /**
     * Test getDelaySourceStringAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsInteger());
    }

    /**
     * Test getDelaySourceStringAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsLong());
    }

    /**
     * Test getDelaySourceStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsLocalDateTime());
    }

    /**
     * Test getDelaySourceStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsLocalTime());
    }

    /**
     * Test getDelaySourceStringAsString() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals("Container", JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsString());
    }

    /**
     * Test getDelaySourceStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsBoolean());
    }

    /**
     * Test getDelaySourceStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsBigInteger());
    }

    /**
     * Test getDelaySourceStringAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getDelaySourceStringAsURL());
    }

    /**
     * Test getBitRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsInteger());
    }

    /**
     * Test getBitRateNominalAsLong() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsLong());
    }

    /**
     * Test getBitRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsLocalDateTime());
    }

    /**
     * Test getBitRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsLocalTime());
    }

    /**
     * Test getBitRateNominalAsString() method.
     */
    @Test
    public void subTestGetBitRateNominalAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsString());
    }

    /**
     * Test getBitRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateNominalAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsBoolean());
    }

    /**
     * Test getBitRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsBigInteger());
    }

    /**
     * Test getBitRateNominalAsURL() method.
     */
    @Test
    public void subTestGetBitRateNominalAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateNominalAsURL());
    }

    /**
     * Test getBitRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsInteger());
    }

    /**
     * Test getBitRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsLong());
    }

    /**
     * Test getBitRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsLocalDateTime());
    }

    /**
     * Test getBitRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsLocalTime());
    }

    /**
     * Test getBitRateMinimumAsString() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsString());
    }

    /**
     * Test getBitRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsBoolean());
    }

    /**
     * Test getBitRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsBigInteger());
    }

    /**
     * Test getBitRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetBitRateMinimumAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateMinimumAsURL());
    }

    /**
     * Test getFormatSettingsSBRStringAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsInteger());
    }

    /**
     * Test getFormatSettingsSBRStringAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsLong());
    }

    /**
     * Test getFormatSettingsSBRStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsSBRStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsLocalTime());
    }

    /**
     * Test getFormatSettingsSBRStringAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsString());
    }

    /**
     * Test getFormatSettingsSBRStringAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsBoolean());
    }

    /**
     * Test getFormatSettingsSBRStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsBigInteger());
    }

    /**
     * Test getFormatSettingsSBRStringAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsSBRStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getFormatSettingsSBRStringAsURL());
    }

    /**
     * Test getSourceDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsInteger());
    }

    /**
     * Test getSourceDurationStringAsLong() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsLong());
    }

    /**
     * Test getSourceDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsLocalDateTime());
    }

    /**
     * Test getSourceDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsLocalTime());
    }

    /**
     * Test getSourceDurationStringAsString() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsString());
    }

    /**
     * Test getSourceDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsBoolean());
    }

    /**
     * Test getSourceDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsBigInteger());
    }

    /**
     * Test getSourceDurationStringAsURL() method.
     */
    @Test
    public void subTestGetSourceDurationStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSourceDurationStringAsURL());
    }

    /**
     * Test getBitRateEncodedStringAsInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsInteger());
    }

    /**
     * Test getBitRateEncodedStringAsLong() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsLong());
    }

    /**
     * Test getBitRateEncodedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsLocalDateTime());
    }

    /**
     * Test getBitRateEncodedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsLocalTime());
    }

    /**
     * Test getBitRateEncodedStringAsString() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsString());
    }

    /**
     * Test getBitRateEncodedStringAsBoolean() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsBoolean());
    }

    /**
     * Test getBitRateEncodedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsBigInteger());
    }

    /**
     * Test getBitRateEncodedStringAsURL() method.
     */
    @Test
    public void subTestGetBitRateEncodedStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getBitRateEncodedStringAsURL());
    }

    /**
     * Test getStreamKindStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsInteger());
    }

    /**
     * Test getStreamKindStringAsLong() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsLong());
    }

    /**
     * Test getStreamKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsLocalDateTime());
    }

    /**
     * Test getStreamKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsLocalTime());
    }

    /**
     * Test getStreamKindStringAsString() method.
     */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals("Audio", JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsString());
    }

    /**
     * Test getStreamKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsBoolean());
    }

    /**
     * Test getStreamKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsBigInteger());
    }

    /**
     * Test getStreamKindStringAsURL() method.
     */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getStreamKindStringAsURL());
    }

    /**
     * Test getChannelPositionsString2AsInteger() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsInteger());
    }

    /**
     * Test getChannelPositionsString2AsLong() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsLong());
    }

    /**
     * Test getChannelPositionsString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsLocalDateTime());
    }

    /**
     * Test getChannelPositionsString2AsLocalTime() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsLocalTime());
    }

    /**
     * Test getChannelPositionsString2AsString() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsString());
    }

    /**
     * Test getChannelPositionsString2AsBoolean() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsBoolean());
    }

    /**
     * Test getChannelPositionsString2AsBigInteger() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsBigInteger());
    }

    /**
     * Test getChannelPositionsString2AsURL() method.
     */
    @Test
    public void subTestGetChannelPositionsString2AsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getChannelPositionsString2AsURL());
    }

    /**
     * Test getEncodedApplicationVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsLong());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsLocalTime());
    }

    /**
     * Test getEncodedApplicationVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsString());
    }

    /**
     * Test getEncodedApplicationVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsBoolean());
    }

    /**
     * Test getEncodedApplicationVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsBigInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getEncodedApplicationVersionAsURL());
    }

    /**
     * Test getMenuIDAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsInteger());
    }

    /**
     * Test getMenuIDAsLong() method.
     */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsLong());
    }

    /**
     * Test getMenuIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsLocalDateTime());
    }

    /**
     * Test getMenuIDAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsLocalTime());
    }

    /**
     * Test getMenuIDAsString() method.
     */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsString());
    }

    /**
     * Test getMenuIDAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsBoolean());
    }

    /**
     * Test getMenuIDAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsBigInteger());
    }

    /**
     * Test getMenuIDAsURL() method.
     */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getMenuIDAsURL());
    }

    /**
     * Test getSamplesPerFrameAsInteger() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsInteger());
    }

    /**
     * Test getSamplesPerFrameAsLong() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsLong());
    }

    /**
     * Test getSamplesPerFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsLocalDateTime());
    }

    /**
     * Test getSamplesPerFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsLocalTime());
    }

    /**
     * Test getSamplesPerFrameAsString() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsString());
    }

    /**
     * Test getSamplesPerFrameAsBoolean() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsBoolean());
    }

    /**
     * Test getSamplesPerFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsBigInteger());
    }

    /**
     * Test getSamplesPerFrameAsURL() method.
     */
    @Test
    public void subTestGetSamplesPerFrameAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getSamplesPerFrameAsURL());
    }

    /**
     * Test getInterleaveDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsInteger());
    }

    /**
     * Test getInterleaveDurationStringAsLong() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsLong());
    }

    /**
     * Test getInterleaveDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsLocalDateTime());
    }

    /**
     * Test getInterleaveDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsLocalTime());
    }

    /**
     * Test getInterleaveDurationStringAsString() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsString());
    }

    /**
     * Test getInterleaveDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsBoolean());
    }

    /**
     * Test getInterleaveDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsBigInteger());
    }

    /**
     * Test getInterleaveDurationStringAsURL() method.
     */
    @Test
    public void subTestGetInterleaveDurationStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getInterleaveDurationStringAsURL());
    }

    /**
     * Test getAlternateGroupStringAsInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsInteger());
    }

    /**
     * Test getAlternateGroupStringAsLong() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsLong());
    }

    /**
     * Test getAlternateGroupStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsLocalDateTime());
    }

    /**
     * Test getAlternateGroupStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsLocalTime());
    }

    /**
     * Test getAlternateGroupStringAsString() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals("", JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsString());
    }

    /**
     * Test getAlternateGroupStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsBoolean());
    }

    /**
     * Test getAlternateGroupStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsBigInteger());
    }

    /**
     * Test getAlternateGroupStringAsURL() method.
     */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, JMetaDataAudio_Test.jMetaDataAudio.getAlternateGroupStringAsURL());
    }

}
