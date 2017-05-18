package aka.jmetadata.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataGeneral;
import aka.jmetadata.main.helper.DateTimeHelper;

/**
 * This class contains tests methods for General informations of a specific General stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataGeneral_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataGeneral_Test.class.getName());

    private static JMetaDataGeneral jMetaDataGeneral;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataGeneral_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("AmosTV_10min_HT.divx").getFile());
            jMetaData.open(file);
            jMetaDataGeneral = jMetaData.getGeneral();
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
     * Test getLCCNAsInteger() method.
     */
    @Test
    public void subTestGetLCCNAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsInteger());
        System.out.println("Library of Congress Control Number. AS Integer === " + jMetaDataGeneral.getLCCNAsInteger());
    }

    /**
     * Test getLCCNAsLong() method.
     */
    @Test
    public void subTestGetLCCNAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsLong());
        System.out.println("Library of Congress Control Number. AS Long === " + jMetaDataGeneral.getLCCNAsLong());
    }

    /**
     * Test getLCCNAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLCCNAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsLocalDateTime());
        System.out.println("Library of Congress Control Number. AS LocalDateTime === " + jMetaDataGeneral.getLCCNAsLocalDateTime());
    }

    /**
     * Test getLCCNAsLocalTime() method.
     */
    @Test
    public void subTestGetLCCNAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsLocalTime());
        System.out.println("Library of Congress Control Number. AS LocalTime === " + jMetaDataGeneral.getLCCNAsLocalTime());
    }

    /**
     * Test getLCCNAsString() method.
     */
    @Test
    public void subTestGetLCCNAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsString());
        System.out.println("Library of Congress Control Number. AS String === " + jMetaDataGeneral.getLCCNAsString());
    }

    /**
     * Test getLCCNAsBoolean() method.
     */
    @Test
    public void subTestGetLCCNAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsBoolean());
        System.out.println("Library of Congress Control Number. AS Boolean === " + jMetaDataGeneral.getLCCNAsBoolean());
    }

    /**
     * Test getLCCNAsBigInteger() method.
     */
    @Test
    public void subTestGetLCCNAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsBigInteger());
        System.out.println("Library of Congress Control Number. AS BigInteger === " + jMetaDataGeneral.getLCCNAsBigInteger());
    }

    /**
     * Test getLCCNAsURL() method.
     */
    @Test
    public void subTestGetLCCNAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLCCNAsURL());
        System.out.println("Library of Congress Control Number. AS URL === " + jMetaDataGeneral.getLCCNAsURL());
    }

    /**
     * Test getOwnerAsInteger() method.
     */
    @Test
    public void subTestGetOwnerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsInteger());
        System.out.println("Owner of the file AS Integer === " + jMetaDataGeneral.getOwnerAsInteger());
    }

    /**
     * Test getOwnerAsLong() method.
     */
    @Test
    public void subTestGetOwnerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsLong());
        System.out.println("Owner of the file AS Long === " + jMetaDataGeneral.getOwnerAsLong());
    }

    /**
     * Test getOwnerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOwnerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsLocalDateTime());
        System.out.println("Owner of the file AS LocalDateTime === " + jMetaDataGeneral.getOwnerAsLocalDateTime());
    }

    /**
     * Test getOwnerAsLocalTime() method.
     */
    @Test
    public void subTestGetOwnerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsLocalTime());
        System.out.println("Owner of the file AS LocalTime === " + jMetaDataGeneral.getOwnerAsLocalTime());
    }

    /**
     * Test getOwnerAsString() method.
     */
    @Test
    public void subTestGetOwnerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsString());
        System.out.println("Owner of the file AS String === " + jMetaDataGeneral.getOwnerAsString());
    }

    /**
     * Test getOwnerAsBoolean() method.
     */
    @Test
    public void subTestGetOwnerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsBoolean());
        System.out.println("Owner of the file AS Boolean === " + jMetaDataGeneral.getOwnerAsBoolean());
    }

    /**
     * Test getOwnerAsBigInteger() method.
     */
    @Test
    public void subTestGetOwnerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsBigInteger());
        System.out.println("Owner of the file AS BigInteger === " + jMetaDataGeneral.getOwnerAsBigInteger());
    }

    /**
     * Test getOwnerAsURL() method.
     */
    @Test
    public void subTestGetOwnerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOwnerAsURL());
        System.out.println("Owner of the file AS URL === " + jMetaDataGeneral.getOwnerAsURL());
    }

    /**
     * Test getNetworkNameAsInteger() method.
     */
    @Test
    public void subTestGetNetworkNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsInteger());
        System.out.println("NetworkName AS Integer === " + jMetaDataGeneral.getNetworkNameAsInteger());
    }

    /**
     * Test getNetworkNameAsLong() method.
     */
    @Test
    public void subTestGetNetworkNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsLong());
        System.out.println("NetworkName AS Long === " + jMetaDataGeneral.getNetworkNameAsLong());
    }

    /**
     * Test getNetworkNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetNetworkNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsLocalDateTime());
        System.out.println("NetworkName AS LocalDateTime === " + jMetaDataGeneral.getNetworkNameAsLocalDateTime());
    }

    /**
     * Test getNetworkNameAsLocalTime() method.
     */
    @Test
    public void subTestGetNetworkNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsLocalTime());
        System.out.println("NetworkName AS LocalTime === " + jMetaDataGeneral.getNetworkNameAsLocalTime());
    }

    /**
     * Test getNetworkNameAsString() method.
     */
    @Test
    public void subTestGetNetworkNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsString());
        System.out.println("NetworkName AS String === " + jMetaDataGeneral.getNetworkNameAsString());
    }

    /**
     * Test getNetworkNameAsBoolean() method.
     */
    @Test
    public void subTestGetNetworkNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsBoolean());
        System.out.println("NetworkName AS Boolean === " + jMetaDataGeneral.getNetworkNameAsBoolean());
    }

    /**
     * Test getNetworkNameAsBigInteger() method.
     */
    @Test
    public void subTestGetNetworkNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsBigInteger());
        System.out.println("NetworkName AS BigInteger === " + jMetaDataGeneral.getNetworkNameAsBigInteger());
    }

    /**
     * Test getNetworkNameAsURL() method.
     */
    @Test
    public void subTestGetNetworkNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getNetworkNameAsURL());
        System.out.println("NetworkName AS URL === " + jMetaDataGeneral.getNetworkNameAsURL());
    }

    /**
     * Test getTextFormatListAsInteger() method.
     */
    @Test
    public void subTestGetTextFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsInteger());
        System.out.println("Text Codecs in this file, separated by / AS Integer === " + jMetaDataGeneral.getTextFormatListAsInteger());
    }

    /**
     * Test getTextFormatListAsLong() method.
     */
    @Test
    public void subTestGetTextFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsLong());
        System.out.println("Text Codecs in this file, separated by / AS Long === " + jMetaDataGeneral.getTextFormatListAsLong());
    }

    /**
     * Test getTextFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsLocalDateTime());
        System.out.println("Text Codecs in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getTextFormatListAsLocalDateTime());
    }

    /**
     * Test getTextFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetTextFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsLocalTime());
        System.out.println("Text Codecs in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getTextFormatListAsLocalTime());
    }

    /**
     * Test getTextFormatListAsString() method.
     */
    @Test
    public void subTestGetTextFormatListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsString());
        System.out.println("Text Codecs in this file, separated by / AS String === " + jMetaDataGeneral.getTextFormatListAsString());
    }

    /**
     * Test getTextFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetTextFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsBoolean());
        System.out.println("Text Codecs in this file, separated by / AS Boolean === " + jMetaDataGeneral.getTextFormatListAsBoolean());
    }

    /**
     * Test getTextFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetTextFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsBigInteger());
        System.out.println("Text Codecs in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getTextFormatListAsBigInteger());
    }

    /**
     * Test getTextFormatListAsURL() method.
     */
    @Test
    public void subTestGetTextFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatListAsURL());
        System.out.println("Text Codecs in this file, separated by / AS URL === " + jMetaDataGeneral.getTextFormatListAsURL());
    }

    /**
     * Test getCompilationAsInteger() method.
     */
    @Test
    public void subTestGetCompilationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsInteger());
        System.out.println("iTunes compilation AS Integer === " + jMetaDataGeneral.getCompilationAsInteger());
    }

    /**
     * Test getCompilationAsLong() method.
     */
    @Test
    public void subTestGetCompilationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsLong());
        System.out.println("iTunes compilation AS Long === " + jMetaDataGeneral.getCompilationAsLong());
    }

    /**
     * Test getCompilationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompilationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsLocalDateTime());
        System.out.println("iTunes compilation AS LocalDateTime === " + jMetaDataGeneral.getCompilationAsLocalDateTime());
    }

    /**
     * Test getCompilationAsLocalTime() method.
     */
    @Test
    public void subTestGetCompilationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsLocalTime());
        System.out.println("iTunes compilation AS LocalTime === " + jMetaDataGeneral.getCompilationAsLocalTime());
    }

    /**
     * Test getCompilationAsString() method.
     */
    @Test
    public void subTestGetCompilationAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsString());
        System.out.println("iTunes compilation AS String === " + jMetaDataGeneral.getCompilationAsString());
    }

    /**
     * Test getCompilationAsBoolean() method.
     */
    @Test
    public void subTestGetCompilationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsBoolean());
        System.out.println("iTunes compilation AS Boolean === " + jMetaDataGeneral.getCompilationAsBoolean());
    }

    /**
     * Test getCompilationAsBigInteger() method.
     */
    @Test
    public void subTestGetCompilationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsBigInteger());
        System.out.println("iTunes compilation AS BigInteger === " + jMetaDataGeneral.getCompilationAsBigInteger());
    }

    /**
     * Test getCompilationAsURL() method.
     */
    @Test
    public void subTestGetCompilationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationAsURL());
        System.out.println("iTunes compilation AS URL === " + jMetaDataGeneral.getCompilationAsURL());
    }

    /**
     * Test getStreamOrderAsInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataGeneral.getStreamOrderAsInteger());
    }

    /**
     * Test getStreamOrderAsLong() method.
     */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsLong());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataGeneral.getStreamOrderAsLong());
    }

    /**
     * Test getStreamOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsLocalDateTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataGeneral.getStreamOrderAsLocalDateTime());
    }

    /**
     * Test getStreamOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsLocalTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataGeneral.getStreamOrderAsLocalTime());
    }

    /**
     * Test getStreamOrderAsString() method.
     */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsString());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataGeneral.getStreamOrderAsString());
    }

    /**
     * Test getStreamOrderAsBoolean() method.
     */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsBoolean());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataGeneral.getStreamOrderAsBoolean());
    }

    /**
     * Test getStreamOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsBigInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataGeneral.getStreamOrderAsBigInteger());
    }

    /**
     * Test getStreamOrderAsURL() method.
     */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamOrderAsURL());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataGeneral.getStreamOrderAsURL());
    }

    /**
     * Test getEncodedLibraryNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsInteger());
        System.out.println("Name of the the encoding-software AS Integer === " + jMetaDataGeneral.getEncodedLibraryNameAsInteger());
    }

    /**
     * Test getEncodedLibraryNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsLong());
        System.out.println("Name of the the encoding-software AS Long === " + jMetaDataGeneral.getEncodedLibraryNameAsLong());
    }

    /**
     * Test getEncodedLibraryNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsLocalDateTime());
        System.out.println("Name of the the encoding-software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsLocalTime());
        System.out.println("Name of the the encoding-software AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsString());
        System.out.println("Name of the the encoding-software AS String === " + jMetaDataGeneral.getEncodedLibraryNameAsString());
    }

    /**
     * Test getEncodedLibraryNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsBoolean());
        System.out.println("Name of the the encoding-software AS Boolean === " + jMetaDataGeneral.getEncodedLibraryNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsBigInteger());
        System.out.println("Name of the the encoding-software AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryNameAsURL());
        System.out.println("Name of the the encoding-software AS URL === " + jMetaDataGeneral.getEncodedLibraryNameAsURL());
    }

    /**
     * Test getTitleMoreAsInteger() method.
     */
    @Test
    public void subTestGetTitleMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsInteger());
        System.out.println("(Generic)More info about the title of file AS Integer === " + jMetaDataGeneral.getTitleMoreAsInteger());
    }

    /**
     * Test getTitleMoreAsLong() method.
     */
    @Test
    public void subTestGetTitleMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsLong());
        System.out.println("(Generic)More info about the title of file AS Long === " + jMetaDataGeneral.getTitleMoreAsLong());
    }

    /**
     * Test getTitleMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsLocalDateTime());
        System.out.println("(Generic)More info about the title of file AS LocalDateTime === " + jMetaDataGeneral.getTitleMoreAsLocalDateTime());
    }

    /**
     * Test getTitleMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsLocalTime());
        System.out.println("(Generic)More info about the title of file AS LocalTime === " + jMetaDataGeneral.getTitleMoreAsLocalTime());
    }

    /**
     * Test getTitleMoreAsString() method.
     */
    @Test
    public void subTestGetTitleMoreAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsString());
        System.out.println("(Generic)More info about the title of file AS String === " + jMetaDataGeneral.getTitleMoreAsString());
    }

    /**
     * Test getTitleMoreAsBoolean() method.
     */
    @Test
    public void subTestGetTitleMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsBoolean());
        System.out.println("(Generic)More info about the title of file AS Boolean === " + jMetaDataGeneral.getTitleMoreAsBoolean());
    }

    /**
     * Test getTitleMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsBigInteger());
        System.out.println("(Generic)More info about the title of file AS BigInteger === " + jMetaDataGeneral.getTitleMoreAsBigInteger());
    }

    /**
     * Test getTitleMoreAsURL() method.
     */
    @Test
    public void subTestGetTitleMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleMoreAsURL());
        System.out.println("(Generic)More info about the title of file AS URL === " + jMetaDataGeneral.getTitleMoreAsURL());
    }

    /**
     * Test getLightnessAsInteger() method.
     */
    @Test
    public void subTestGetLightnessAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsInteger());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS Integer === " + jMetaDataGeneral.getLightnessAsInteger());
    }

    /**
     * Test getLightnessAsLong() method.
     */
    @Test
    public void subTestGetLightnessAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsLong());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS Long === " + jMetaDataGeneral.getLightnessAsLong());
    }

    /**
     * Test getLightnessAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLightnessAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsLocalDateTime());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS LocalDateTime === " + jMetaDataGeneral.getLightnessAsLocalDateTime());
    }

    /**
     * Test getLightnessAsLocalTime() method.
     */
    @Test
    public void subTestGetLightnessAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsLocalTime());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS LocalTime === " + jMetaDataGeneral.getLightnessAsLocalTime());
    }

    /**
     * Test getLightnessAsString() method.
     */
    @Test
    public void subTestGetLightnessAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsString());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS String === " + jMetaDataGeneral.getLightnessAsString());
    }

    /**
     * Test getLightnessAsBoolean() method.
     */
    @Test
    public void subTestGetLightnessAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsBoolean());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS Boolean === " + jMetaDataGeneral.getLightnessAsBoolean());
    }

    /**
     * Test getLightnessAsBigInteger() method.
     */
    @Test
    public void subTestGetLightnessAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsBigInteger());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS BigInteger === " + jMetaDataGeneral.getLightnessAsBigInteger());
    }

    /**
     * Test getLightnessAsURL() method.
     */
    @Test
    public void subTestGetLightnessAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLightnessAsURL());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS URL === " + jMetaDataGeneral.getLightnessAsURL());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsInteger());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS Integer === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsInteger());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLong());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS Long === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsLong());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalDateTime());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalTime());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsString());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS String === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsString());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsBoolean());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsBoolean());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsBigInteger());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormSharpnessAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormSharpnessAsURL());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS URL === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsURL());
    }

    /**
     * Test getFileExtensionAsInteger() method.
     */
    @Test
    public void subTestGetFileExtensionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsInteger());
        System.out.println("File extension only AS Integer === " + jMetaDataGeneral.getFileExtensionAsInteger());
    }

    /**
     * Test getFileExtensionAsLong() method.
     */
    @Test
    public void subTestGetFileExtensionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsLong());
        System.out.println("File extension only AS Long === " + jMetaDataGeneral.getFileExtensionAsLong());
    }

    /**
     * Test getFileExtensionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileExtensionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsLocalDateTime());
        System.out.println("File extension only AS LocalDateTime === " + jMetaDataGeneral.getFileExtensionAsLocalDateTime());
    }

    /**
     * Test getFileExtensionAsLocalTime() method.
     */
    @Test
    public void subTestGetFileExtensionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsLocalTime());
        System.out.println("File extension only AS LocalTime === " + jMetaDataGeneral.getFileExtensionAsLocalTime());
    }

    /**
     * Test getFileExtensionAsString() method.
     */
    @Test
    public void subTestGetFileExtensionAsString() {
        assertEquals("divx", JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsString());
        System.out.println("File extension only AS String === " + jMetaDataGeneral.getFileExtensionAsString());
    }

    /**
     * Test getFileExtensionAsBoolean() method.
     */
    @Test
    public void subTestGetFileExtensionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsBoolean());
        System.out.println("File extension only AS Boolean === " + jMetaDataGeneral.getFileExtensionAsBoolean());
    }

    /**
     * Test getFileExtensionAsBigInteger() method.
     */
    @Test
    public void subTestGetFileExtensionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsBigInteger());
        System.out.println("File extension only AS BigInteger === " + jMetaDataGeneral.getFileExtensionAsBigInteger());
    }

    /**
     * Test getFileExtensionAsURL() method.
     */
    @Test
    public void subTestGetFileExtensionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionAsURL());
        System.out.println("File extension only AS URL === " + jMetaDataGeneral.getFileExtensionAsURL());
    }

    /**
     * Test getActorAsInteger() method.
     */
    @Test
    public void subTestGetActorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsInteger());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS Integer === " + jMetaDataGeneral.getActorAsInteger());
    }

    /**
     * Test getActorAsLong() method.
     */
    @Test
    public void subTestGetActorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsLong());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS Long === " + jMetaDataGeneral.getActorAsLong());
    }

    /**
     * Test getActorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsLocalDateTime());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS LocalDateTime === " + jMetaDataGeneral.getActorAsLocalDateTime());
    }

    /**
     * Test getActorAsLocalTime() method.
     */
    @Test
    public void subTestGetActorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsLocalTime());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS LocalTime === " + jMetaDataGeneral.getActorAsLocalTime());
    }

    /**
     * Test getActorAsString() method.
     */
    @Test
    public void subTestGetActorAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsString());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS String === " + jMetaDataGeneral.getActorAsString());
    }

    /**
     * Test getActorAsBoolean() method.
     */
    @Test
    public void subTestGetActorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsBoolean());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS Boolean === " + jMetaDataGeneral.getActorAsBoolean());
    }

    /**
     * Test getActorAsBigInteger() method.
     */
    @Test
    public void subTestGetActorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsBigInteger());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS BigInteger === " + jMetaDataGeneral.getActorAsBigInteger());
    }

    /**
     * Test getActorAsURL() method.
     */
    @Test
    public void subTestGetActorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorAsURL());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS URL === " + jMetaDataGeneral.getActorAsURL());
    }

    /**
     * Test getCommissionedByAsInteger() method.
     */
    @Test
    public void subTestGetCommissionedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsInteger());
        System.out.println("name of the person or organization that commissioned the subject of the file AS Integer === " + jMetaDataGeneral.getCommissionedByAsInteger());
    }

    /**
     * Test getCommissionedByAsLong() method.
     */
    @Test
    public void subTestGetCommissionedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsLong());
        System.out.println("name of the person or organization that commissioned the subject of the file AS Long === " + jMetaDataGeneral.getCommissionedByAsLong());
    }

    /**
     * Test getCommissionedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCommissionedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsLocalDateTime());
        System.out.println("name of the person or organization that commissioned the subject of the file AS LocalDateTime === " + jMetaDataGeneral.getCommissionedByAsLocalDateTime());
    }

    /**
     * Test getCommissionedByAsLocalTime() method.
     */
    @Test
    public void subTestGetCommissionedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsLocalTime());
        System.out.println("name of the person or organization that commissioned the subject of the file AS LocalTime === " + jMetaDataGeneral.getCommissionedByAsLocalTime());
    }

    /**
     * Test getCommissionedByAsString() method.
     */
    @Test
    public void subTestGetCommissionedByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsString());
        System.out.println("name of the person or organization that commissioned the subject of the file AS String === " + jMetaDataGeneral.getCommissionedByAsString());
    }

    /**
     * Test getCommissionedByAsBoolean() method.
     */
    @Test
    public void subTestGetCommissionedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsBoolean());
        System.out.println("name of the person or organization that commissioned the subject of the file AS Boolean === " + jMetaDataGeneral.getCommissionedByAsBoolean());
    }

    /**
     * Test getCommissionedByAsBigInteger() method.
     */
    @Test
    public void subTestGetCommissionedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsBigInteger());
        System.out.println("name of the person or organization that commissioned the subject of the file AS BigInteger === " + jMetaDataGeneral.getCommissionedByAsBigInteger());
    }

    /**
     * Test getCommissionedByAsURL() method.
     */
    @Test
    public void subTestGetCommissionedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommissionedByAsURL());
        System.out.println("name of the person or organization that commissioned the subject of the file AS URL === " + jMetaDataGeneral.getCommissionedByAsURL());
    }

    /**
     * Test getFormatCompressionAsInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsInteger());
        System.out.println("Compression method used AS Integer === " + jMetaDataGeneral.getFormatCompressionAsInteger());
    }

    /**
     * Test getFormatCompressionAsLong() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsLong());
        System.out.println("Compression method used AS Long === " + jMetaDataGeneral.getFormatCompressionAsLong());
    }

    /**
     * Test getFormatCompressionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsLocalDateTime());
        System.out.println("Compression method used AS LocalDateTime === " + jMetaDataGeneral.getFormatCompressionAsLocalDateTime());
    }

    /**
     * Test getFormatCompressionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsLocalTime());
        System.out.println("Compression method used AS LocalTime === " + jMetaDataGeneral.getFormatCompressionAsLocalTime());
    }

    /**
     * Test getFormatCompressionAsString() method.
     */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsString());
        System.out.println("Compression method used AS String === " + jMetaDataGeneral.getFormatCompressionAsString());
    }

    /**
     * Test getFormatCompressionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsBoolean());
        System.out.println("Compression method used AS Boolean === " + jMetaDataGeneral.getFormatCompressionAsBoolean());
    }

    /**
     * Test getFormatCompressionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsBigInteger());
        System.out.println("Compression method used AS BigInteger === " + jMetaDataGeneral.getFormatCompressionAsBigInteger());
    }

    /**
     * Test getFormatCompressionAsURL() method.
     */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCompressionAsURL());
        System.out.println("Compression method used AS URL === " + jMetaDataGeneral.getFormatCompressionAsURL());
    }

    /**
     * Test getAccompanimentAsInteger() method.
     */
    @Test
    public void subTestGetAccompanimentAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsInteger());
        System.out.println("Band/orchestra/accompaniment/musician. AS Integer === " + jMetaDataGeneral.getAccompanimentAsInteger());
    }

    /**
     * Test getAccompanimentAsLong() method.
     */
    @Test
    public void subTestGetAccompanimentAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsLong());
        System.out.println("Band/orchestra/accompaniment/musician. AS Long === " + jMetaDataGeneral.getAccompanimentAsLong());
    }

    /**
     * Test getAccompanimentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAccompanimentAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsLocalDateTime());
        System.out.println("Band/orchestra/accompaniment/musician. AS LocalDateTime === " + jMetaDataGeneral.getAccompanimentAsLocalDateTime());
    }

    /**
     * Test getAccompanimentAsLocalTime() method.
     */
    @Test
    public void subTestGetAccompanimentAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsLocalTime());
        System.out.println("Band/orchestra/accompaniment/musician. AS LocalTime === " + jMetaDataGeneral.getAccompanimentAsLocalTime());
    }

    /**
     * Test getAccompanimentAsString() method.
     */
    @Test
    public void subTestGetAccompanimentAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsString());
        System.out.println("Band/orchestra/accompaniment/musician. AS String === " + jMetaDataGeneral.getAccompanimentAsString());
    }

    /**
     * Test getAccompanimentAsBoolean() method.
     */
    @Test
    public void subTestGetAccompanimentAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsBoolean());
        System.out.println("Band/orchestra/accompaniment/musician. AS Boolean === " + jMetaDataGeneral.getAccompanimentAsBoolean());
    }

    /**
     * Test getAccompanimentAsBigInteger() method.
     */
    @Test
    public void subTestGetAccompanimentAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsBigInteger());
        System.out.println("Band/orchestra/accompaniment/musician. AS BigInteger === " + jMetaDataGeneral.getAccompanimentAsBigInteger());
    }

    /**
     * Test getAccompanimentAsURL() method.
     */
    @Test
    public void subTestGetAccompanimentAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAccompanimentAsURL());
        System.out.println("Band/orchestra/accompaniment/musician. AS URL === " + jMetaDataGeneral.getAccompanimentAsURL());
    }

    /**
     * Test getCoverDataAsInteger() method.
     */
    @Test
    public void subTestGetCoverDataAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsInteger());
        System.out.println("Cover, in binary format encoded BASE64 AS Integer === " + jMetaDataGeneral.getCoverDataAsInteger());
    }

    /**
     * Test getCoverDataAsLong() method.
     */
    @Test
    public void subTestGetCoverDataAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsLong());
        System.out.println("Cover, in binary format encoded BASE64 AS Long === " + jMetaDataGeneral.getCoverDataAsLong());
    }

    /**
     * Test getCoverDataAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverDataAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsLocalDateTime());
        System.out.println("Cover, in binary format encoded BASE64 AS LocalDateTime === " + jMetaDataGeneral.getCoverDataAsLocalDateTime());
    }

    /**
     * Test getCoverDataAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverDataAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsLocalTime());
        System.out.println("Cover, in binary format encoded BASE64 AS LocalTime === " + jMetaDataGeneral.getCoverDataAsLocalTime());
    }

    /**
     * Test getCoverDataAsString() method.
     */
    @Test
    public void subTestGetCoverDataAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsString());
        System.out.println("Cover, in binary format encoded BASE64 AS String === " + jMetaDataGeneral.getCoverDataAsString());
    }

    /**
     * Test getCoverDataAsBoolean() method.
     */
    @Test
    public void subTestGetCoverDataAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsBoolean());
        System.out.println("Cover, in binary format encoded BASE64 AS Boolean === " + jMetaDataGeneral.getCoverDataAsBoolean());
    }

    /**
     * Test getCoverDataAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverDataAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsBigInteger());
        System.out.println("Cover, in binary format encoded BASE64 AS BigInteger === " + jMetaDataGeneral.getCoverDataAsBigInteger());
    }

    /**
     * Test getCoverDataAsURL() method.
     */
    @Test
    public void subTestGetCoverDataAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDataAsURL());
        System.out.println("Cover, in binary format encoded BASE64 AS URL === " + jMetaDataGeneral.getCoverDataAsURL());
    }

    /**
     * Test getVideoFormatListAsInteger() method.
     */
    @Test
    public void subTestGetVideoFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsInteger());
        System.out.println("Video Codecs in this file, separated by / AS Integer === " + jMetaDataGeneral.getVideoFormatListAsInteger());
    }

    /**
     * Test getVideoFormatListAsLong() method.
     */
    @Test
    public void subTestGetVideoFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsLong());
        System.out.println("Video Codecs in this file, separated by / AS Long === " + jMetaDataGeneral.getVideoFormatListAsLong());
    }

    /**
     * Test getVideoFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsLocalDateTime());
        System.out.println("Video Codecs in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getVideoFormatListAsLocalDateTime());
    }

    /**
     * Test getVideoFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsLocalTime());
        System.out.println("Video Codecs in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getVideoFormatListAsLocalTime());
    }

    /**
     * Test getVideoFormatListAsString() method.
     */
    @Test
    public void subTestGetVideoFormatListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsString());
        System.out.println("Video Codecs in this file, separated by / AS String === " + jMetaDataGeneral.getVideoFormatListAsString());
    }

    /**
     * Test getVideoFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetVideoFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsBoolean());
        System.out.println("Video Codecs in this file, separated by / AS Boolean === " + jMetaDataGeneral.getVideoFormatListAsBoolean());
    }

    /**
     * Test getVideoFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsBigInteger());
        System.out.println("Video Codecs in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getVideoFormatListAsBigInteger());
    }

    /**
     * Test getVideoFormatListAsURL() method.
     */
    @Test
    public void subTestGetVideoFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatListAsURL());
        System.out.println("Video Codecs in this file, separated by / AS URL === " + jMetaDataGeneral.getVideoFormatListAsURL());
    }

    /**
     * Test getDelayStringAsInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataGeneral.getDelayStringAsInteger());
    }

    /**
     * Test getDelayStringAsLong() method.
     */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataGeneral.getDelayStringAsLong());
    }

    /**
     * Test getDelayStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataGeneral.getDelayStringAsLocalDateTime());
    }

    /**
     * Test getDelayStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataGeneral.getDelayStringAsLocalTime());
    }

    /**
     * Test getDelayStringAsString() method.
     */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataGeneral.getDelayStringAsString());
    }

    /**
     * Test getDelayStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataGeneral.getDelayStringAsBoolean());
    }

    /**
     * Test getDelayStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataGeneral.getDelayStringAsBigInteger());
    }

    /**
     * Test getDelayStringAsURL() method.
     */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataGeneral.getDelayStringAsURL());
    }

    /**
     * Test getReleasedDateAsInteger() method.
     */
    @Test
    public void subTestGetReleasedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsInteger());
        System.out.println("The date/year that the item was released. AS Integer === " + jMetaDataGeneral.getReleasedDateAsInteger());
    }

    /**
     * Test getReleasedDateAsLong() method.
     */
    @Test
    public void subTestGetReleasedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsLong());
        System.out.println("The date/year that the item was released. AS Long === " + jMetaDataGeneral.getReleasedDateAsLong());
    }

    /**
     * Test getReleasedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetReleasedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsLocalDateTime());
        System.out.println("The date/year that the item was released. AS LocalDateTime === " + jMetaDataGeneral.getReleasedDateAsLocalDateTime());
    }

    /**
     * Test getReleasedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetReleasedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsLocalTime());
        System.out.println("The date/year that the item was released. AS LocalTime === " + jMetaDataGeneral.getReleasedDateAsLocalTime());
    }

    /**
     * Test getReleasedDateAsString() method.
     */
    @Test
    public void subTestGetReleasedDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsString());
        System.out.println("The date/year that the item was released. AS String === " + jMetaDataGeneral.getReleasedDateAsString());
    }

    /**
     * Test getReleasedDateAsBoolean() method.
     */
    @Test
    public void subTestGetReleasedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsBoolean());
        System.out.println("The date/year that the item was released. AS Boolean === " + jMetaDataGeneral.getReleasedDateAsBoolean());
    }

    /**
     * Test getReleasedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetReleasedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsBigInteger());
        System.out.println("The date/year that the item was released. AS BigInteger === " + jMetaDataGeneral.getReleasedDateAsBigInteger());
    }

    /**
     * Test getReleasedDateAsURL() method.
     */
    @Test
    public void subTestGetReleasedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getReleasedDateAsURL());
        System.out.println("The date/year that the item was released. AS URL === " + jMetaDataGeneral.getReleasedDateAsURL());
    }

    /**
     * Test getCodecIDDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsInteger());
        System.out.println("Manual description given by the container AS Integer === " + jMetaDataGeneral.getCodecIDDescriptionAsInteger());
    }

    /**
     * Test getCodecIDDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsLong());
        System.out.println("Manual description given by the container AS Long === " + jMetaDataGeneral.getCodecIDDescriptionAsLong());
    }

    /**
     * Test getCodecIDDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsLocalDateTime());
        System.out.println("Manual description given by the container AS LocalDateTime === " + jMetaDataGeneral.getCodecIDDescriptionAsLocalDateTime());
    }

    /**
     * Test getCodecIDDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsLocalTime());
        System.out.println("Manual description given by the container AS LocalTime === " + jMetaDataGeneral.getCodecIDDescriptionAsLocalTime());
    }

    /**
     * Test getCodecIDDescriptionAsString() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsString());
        System.out.println("Manual description given by the container AS String === " + jMetaDataGeneral.getCodecIDDescriptionAsString());
    }

    /**
     * Test getCodecIDDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsBoolean());
        System.out.println("Manual description given by the container AS Boolean === " + jMetaDataGeneral.getCodecIDDescriptionAsBoolean());
    }

    /**
     * Test getCodecIDDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsBigInteger());
        System.out.println("Manual description given by the container AS BigInteger === " + jMetaDataGeneral.getCodecIDDescriptionAsBigInteger());
    }

    /**
     * Test getCodecIDDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDDescriptionAsURL());
        System.out.println("Manual description given by the container AS URL === " + jMetaDataGeneral.getCodecIDDescriptionAsURL());
    }

    /**
     * Test getStatusAsInteger() method.
     */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Integer === " + jMetaDataGeneral.getStatusAsInteger());
    }

    /**
     * Test getStatusAsLong() method.
     */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsLong());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Long === " + jMetaDataGeneral.getStatusAsLong());
    }

    /**
     * Test getStatusAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsLocalDateTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalDateTime === " + jMetaDataGeneral.getStatusAsLocalDateTime());
    }

    /**
     * Test getStatusAsLocalTime() method.
     */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsLocalTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalTime === " + jMetaDataGeneral.getStatusAsLocalTime());
    }

    /**
     * Test getStatusAsString() method.
     */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsString());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS String === " + jMetaDataGeneral.getStatusAsString());
    }

    /**
     * Test getStatusAsBoolean() method.
     */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsBoolean());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Boolean === " + jMetaDataGeneral.getStatusAsBoolean());
    }

    /**
     * Test getStatusAsBigInteger() method.
     */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsBigInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS BigInteger === " + jMetaDataGeneral.getStatusAsBigInteger());
    }

    /**
     * Test getStatusAsURL() method.
     */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStatusAsURL());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS URL === " + jMetaDataGeneral.getStatusAsURL());
    }

    /**
     * Test getFileSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString2AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsInteger());
        System.out.println("File size (with measure, 2 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString2AsInteger());
    }

    /**
     * Test getFileSizeString2AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsLong());
        System.out.println("File size (with measure, 2 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString2AsLong());
    }

    /**
     * Test getFileSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsLocalDateTime());
        System.out.println("File size (with measure, 2 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString2AsLocalDateTime());
    }

    /**
     * Test getFileSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsLocalTime());
        System.out.println("File size (with measure, 2 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString2AsLocalTime());
    }

    /**
     * Test getFileSizeString2AsString() method.
     */
    @Test
    public void subTestGetFileSizeString2AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsString());
        System.out.println("File size (with measure, 2 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString2AsString());
    }

    /**
     * Test getFileSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsBoolean());
        System.out.println("File size (with measure, 2 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString2AsBoolean());
    }

    /**
     * Test getFileSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsBigInteger());
        System.out.println("File size (with measure, 2 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString2AsBigInteger());
    }

    /**
     * Test getFileSizeString2AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString2AsURL());
        System.out.println("File size (with measure, 2 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString2AsURL());
    }

    /**
     * Test getOriginalTrackAsInteger() method.
     */
    @Test
    public void subTestGetOriginalTrackAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsInteger());
        System.out.println("Original name of the track in the original support AS Integer === " + jMetaDataGeneral.getOriginalTrackAsInteger());
    }

    /**
     * Test getOriginalTrackAsLong() method.
     */
    @Test
    public void subTestGetOriginalTrackAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsLong());
        System.out.println("Original name of the track in the original support AS Long === " + jMetaDataGeneral.getOriginalTrackAsLong());
    }

    /**
     * Test getOriginalTrackAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalTrackAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsLocalDateTime());
        System.out.println("Original name of the track in the original support AS LocalDateTime === " + jMetaDataGeneral.getOriginalTrackAsLocalDateTime());
    }

    /**
     * Test getOriginalTrackAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalTrackAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsLocalTime());
        System.out.println("Original name of the track in the original support AS LocalTime === " + jMetaDataGeneral.getOriginalTrackAsLocalTime());
    }

    /**
     * Test getOriginalTrackAsString() method.
     */
    @Test
    public void subTestGetOriginalTrackAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsString());
        System.out.println("Original name of the track in the original support AS String === " + jMetaDataGeneral.getOriginalTrackAsString());
    }

    /**
     * Test getOriginalTrackAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalTrackAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsBoolean());
        System.out.println("Original name of the track in the original support AS Boolean === " + jMetaDataGeneral.getOriginalTrackAsBoolean());
    }

    /**
     * Test getOriginalTrackAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalTrackAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsBigInteger());
        System.out.println("Original name of the track in the original support AS BigInteger === " + jMetaDataGeneral.getOriginalTrackAsBigInteger());
    }

    /**
     * Test getOriginalTrackAsURL() method.
     */
    @Test
    public void subTestGetOriginalTrackAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalTrackAsURL());
        System.out.println("Original name of the track in the original support AS URL === " + jMetaDataGeneral.getOriginalTrackAsURL());
    }

    /**
     * Test getPodcastCategoryAsInteger() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsInteger());
        System.out.println("Podcast category AS Integer === " + jMetaDataGeneral.getPodcastCategoryAsInteger());
    }

    /**
     * Test getPodcastCategoryAsLong() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsLong());
        System.out.println("Podcast category AS Long === " + jMetaDataGeneral.getPodcastCategoryAsLong());
    }

    /**
     * Test getPodcastCategoryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsLocalDateTime());
        System.out.println("Podcast category AS LocalDateTime === " + jMetaDataGeneral.getPodcastCategoryAsLocalDateTime());
    }

    /**
     * Test getPodcastCategoryAsLocalTime() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsLocalTime());
        System.out.println("Podcast category AS LocalTime === " + jMetaDataGeneral.getPodcastCategoryAsLocalTime());
    }

    /**
     * Test getPodcastCategoryAsString() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsString());
        System.out.println("Podcast category AS String === " + jMetaDataGeneral.getPodcastCategoryAsString());
    }

    /**
     * Test getPodcastCategoryAsBoolean() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsBoolean());
        System.out.println("Podcast category AS Boolean === " + jMetaDataGeneral.getPodcastCategoryAsBoolean());
    }

    /**
     * Test getPodcastCategoryAsBigInteger() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsBigInteger());
        System.out.println("Podcast category AS BigInteger === " + jMetaDataGeneral.getPodcastCategoryAsBigInteger());
    }

    /**
     * Test getPodcastCategoryAsURL() method.
     */
    @Test
    public void subTestGetPodcastCategoryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPodcastCategoryAsURL());
        System.out.println("Podcast category AS URL === " + jMetaDataGeneral.getPodcastCategoryAsURL());
    }

    /**
     * Test getFileSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsInteger());
        System.out.println("File size (with measure, 1 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString1AsInteger());
    }

    /**
     * Test getFileSizeString1AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsLong());
        System.out.println("File size (with measure, 1 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString1AsLong());
    }

    /**
     * Test getFileSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsLocalDateTime());
        System.out.println("File size (with measure, 1 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString1AsLocalDateTime());
    }

    /**
     * Test getFileSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsLocalTime());
        System.out.println("File size (with measure, 1 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString1AsLocalTime());
    }

    /**
     * Test getFileSizeString1AsString() method.
     */
    @Test
    public void subTestGetFileSizeString1AsString() {
        assertEquals("268 MiB", JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsString());
        System.out.println("File size (with measure, 1 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString1AsString());
    }

    /**
     * Test getFileSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsBoolean());
        System.out.println("File size (with measure, 1 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString1AsBoolean());
    }

    /**
     * Test getFileSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsBigInteger());
        System.out.println("File size (with measure, 1 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString1AsBigInteger());
    }

    /**
     * Test getFileSizeString1AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString1AsURL());
        System.out.println("File size (with measure, 1 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString1AsURL());
    }

    /**
     * Test getFrameRateAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsInteger());
        System.out.println("Frames per second AS Integer === " + jMetaDataGeneral.getFrameRateAsInteger());
    }

    /**
     * Test getFrameRateAsLong() method.
     */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLong());
        System.out.println("Frames per second AS Long === " + jMetaDataGeneral.getFrameRateAsLong());
    }

    /**
     * Test getFrameRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLocalDateTime());
        System.out.println("Frames per second AS LocalDateTime === " + jMetaDataGeneral.getFrameRateAsLocalDateTime());
    }

    /**
     * Test getFrameRateAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsLocalTime());
        System.out.println("Frames per second AS LocalTime === " + jMetaDataGeneral.getFrameRateAsLocalTime());
    }

    /**
     * Test getFrameRateAsString() method.
     */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsString());
        System.out.println("Frames per second AS String === " + jMetaDataGeneral.getFrameRateAsString());
    }

    /**
     * Test getFrameRateAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsBoolean());
        System.out.println("Frames per second AS Boolean === " + jMetaDataGeneral.getFrameRateAsBoolean());
    }

    /**
     * Test getFrameRateAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsBigInteger());
        System.out.println("Frames per second AS BigInteger === " + jMetaDataGeneral.getFrameRateAsBigInteger());
    }

    /**
     * Test getFrameRateAsURL() method.
     */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateAsURL());
        System.out.println("Frames per second AS URL === " + jMetaDataGeneral.getFrameRateAsURL());
    }

    /**
     * Test getTrackPositionAsInteger() method.
     */
    @Test
    public void subTestGetTrackPositionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsInteger());
        System.out.println("Number of this track AS Integer === " + jMetaDataGeneral.getTrackPositionAsInteger());
    }

    /**
     * Test getTrackPositionAsLong() method.
     */
    @Test
    public void subTestGetTrackPositionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsLong());
        System.out.println("Number of this track AS Long === " + jMetaDataGeneral.getTrackPositionAsLong());
    }

    /**
     * Test getTrackPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsLocalDateTime());
        System.out.println("Number of this track AS LocalDateTime === " + jMetaDataGeneral.getTrackPositionAsLocalDateTime());
    }

    /**
     * Test getTrackPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackPositionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsLocalTime());
        System.out.println("Number of this track AS LocalTime === " + jMetaDataGeneral.getTrackPositionAsLocalTime());
    }

    /**
     * Test getTrackPositionAsString() method.
     */
    @Test
    public void subTestGetTrackPositionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsString());
        System.out.println("Number of this track AS String === " + jMetaDataGeneral.getTrackPositionAsString());
    }

    /**
     * Test getTrackPositionAsBoolean() method.
     */
    @Test
    public void subTestGetTrackPositionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsBoolean());
        System.out.println("Number of this track AS Boolean === " + jMetaDataGeneral.getTrackPositionAsBoolean());
    }

    /**
     * Test getTrackPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackPositionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsBigInteger());
        System.out.println("Number of this track AS BigInteger === " + jMetaDataGeneral.getTrackPositionAsBigInteger());
    }

    /**
     * Test getTrackPositionAsURL() method.
     */
    @Test
    public void subTestGetTrackPositionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionAsURL());
        System.out.println("Number of this track AS URL === " + jMetaDataGeneral.getTrackPositionAsURL());
    }

    /**
     * Test getAssistantDirectorAsInteger() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsInteger());
        System.out.println("Name of the assistant director. AS Integer === " + jMetaDataGeneral.getAssistantDirectorAsInteger());
    }

    /**
     * Test getAssistantDirectorAsLong() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsLong());
        System.out.println("Name of the assistant director. AS Long === " + jMetaDataGeneral.getAssistantDirectorAsLong());
    }

    /**
     * Test getAssistantDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsLocalDateTime());
        System.out.println("Name of the assistant director. AS LocalDateTime === " + jMetaDataGeneral.getAssistantDirectorAsLocalDateTime());
    }

    /**
     * Test getAssistantDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsLocalTime());
        System.out.println("Name of the assistant director. AS LocalTime === " + jMetaDataGeneral.getAssistantDirectorAsLocalTime());
    }

    /**
     * Test getAssistantDirectorAsString() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsString());
        System.out.println("Name of the assistant director. AS String === " + jMetaDataGeneral.getAssistantDirectorAsString());
    }

    /**
     * Test getAssistantDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsBoolean());
        System.out.println("Name of the assistant director. AS Boolean === " + jMetaDataGeneral.getAssistantDirectorAsBoolean());
    }

    /**
     * Test getAssistantDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsBigInteger());
        System.out.println("Name of the assistant director. AS BigInteger === " + jMetaDataGeneral.getAssistantDirectorAsBigInteger());
    }

    /**
     * Test getAssistantDirectorAsURL() method.
     */
    @Test
    public void subTestGetAssistantDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAssistantDirectorAsURL());
        System.out.println("Name of the assistant director. AS URL === " + jMetaDataGeneral.getAssistantDirectorAsURL());
    }

    /**
     * Test getCodecIDVersionAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsInteger());
        System.out.println("Version of the CodecID AS Integer === " + jMetaDataGeneral.getCodecIDVersionAsInteger());
    }

    /**
     * Test getCodecIDVersionAsLong() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsLong());
        System.out.println("Version of the CodecID AS Long === " + jMetaDataGeneral.getCodecIDVersionAsLong());
    }

    /**
     * Test getCodecIDVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsLocalDateTime());
        System.out.println("Version of the CodecID AS LocalDateTime === " + jMetaDataGeneral.getCodecIDVersionAsLocalDateTime());
    }

    /**
     * Test getCodecIDVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsLocalTime());
        System.out.println("Version of the CodecID AS LocalTime === " + jMetaDataGeneral.getCodecIDVersionAsLocalTime());
    }

    /**
     * Test getCodecIDVersionAsString() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsString());
        System.out.println("Version of the CodecID AS String === " + jMetaDataGeneral.getCodecIDVersionAsString());
    }

    /**
     * Test getCodecIDVersionAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsBoolean());
        System.out.println("Version of the CodecID AS Boolean === " + jMetaDataGeneral.getCodecIDVersionAsBoolean());
    }

    /**
     * Test getCodecIDVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsBigInteger());
        System.out.println("Version of the CodecID AS BigInteger === " + jMetaDataGeneral.getCodecIDVersionAsBigInteger());
    }

    /**
     * Test getCodecIDVersionAsURL() method.
     */
    @Test
    public void subTestGetCodecIDVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDVersionAsURL());
        System.out.println("Version of the CodecID AS URL === " + jMetaDataGeneral.getCodecIDVersionAsURL());
    }

    /**
     * Test getVideoLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsInteger());
        System.out.println("Video languagesin this file, full names, separated by / AS Integer === " + jMetaDataGeneral.getVideoLanguageListAsInteger());
    }

    /**
     * Test getVideoLanguageListAsLong() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsLong());
        System.out.println("Video languagesin this file, full names, separated by / AS Long === " + jMetaDataGeneral.getVideoLanguageListAsLong());
    }

    /**
     * Test getVideoLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsLocalDateTime());
        System.out.println("Video languagesin this file, full names, separated by / AS LocalDateTime === " + jMetaDataGeneral.getVideoLanguageListAsLocalDateTime());
    }

    /**
     * Test getVideoLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsLocalTime());
        System.out.println("Video languagesin this file, full names, separated by / AS LocalTime === " + jMetaDataGeneral.getVideoLanguageListAsLocalTime());
    }

    /**
     * Test getVideoLanguageListAsString() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsString());
        System.out.println("Video languagesin this file, full names, separated by / AS String === " + jMetaDataGeneral.getVideoLanguageListAsString());
    }

    /**
     * Test getVideoLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsBoolean());
        System.out.println("Video languagesin this file, full names, separated by / AS Boolean === " + jMetaDataGeneral.getVideoLanguageListAsBoolean());
    }

    /**
     * Test getVideoLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsBigInteger());
        System.out.println("Video languagesin this file, full names, separated by / AS BigInteger === " + jMetaDataGeneral.getVideoLanguageListAsBigInteger());
    }

    /**
     * Test getVideoLanguageListAsURL() method.
     */
    @Test
    public void subTestGetVideoLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoLanguageListAsURL());
        System.out.println("Video languagesin this file, full names, separated by / AS URL === " + jMetaDataGeneral.getVideoLanguageListAsURL());
    }

    /**
     * Test getEncryptionFormatAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsInteger());
        System.out.println("Encryption_Format AS Integer === " + jMetaDataGeneral.getEncryptionFormatAsInteger());
    }

    /**
     * Test getEncryptionFormatAsLong() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsLong());
        System.out.println("Encryption_Format AS Long === " + jMetaDataGeneral.getEncryptionFormatAsLong());
    }

    /**
     * Test getEncryptionFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsLocalDateTime());
        System.out.println("Encryption_Format AS LocalDateTime === " + jMetaDataGeneral.getEncryptionFormatAsLocalDateTime());
    }

    /**
     * Test getEncryptionFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsLocalTime());
        System.out.println("Encryption_Format AS LocalTime === " + jMetaDataGeneral.getEncryptionFormatAsLocalTime());
    }

    /**
     * Test getEncryptionFormatAsString() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsString());
        System.out.println("Encryption_Format AS String === " + jMetaDataGeneral.getEncryptionFormatAsString());
    }

    /**
     * Test getEncryptionFormatAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsBoolean());
        System.out.println("Encryption_Format AS Boolean === " + jMetaDataGeneral.getEncryptionFormatAsBoolean());
    }

    /**
     * Test getEncryptionFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsBigInteger());
        System.out.println("Encryption_Format AS BigInteger === " + jMetaDataGeneral.getEncryptionFormatAsBigInteger());
    }

    /**
     * Test getEncryptionFormatAsURL() method.
     */
    @Test
    public void subTestGetEncryptionFormatAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionFormatAsURL());
        System.out.println("Encryption_Format AS URL === " + jMetaDataGeneral.getEncryptionFormatAsURL());
    }

    /**
     * Test getOriginalAlbumAsInteger() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsInteger());
        System.out.println("Original name of album, serie... AS Integer === " + jMetaDataGeneral.getOriginalAlbumAsInteger());
    }

    /**
     * Test getOriginalAlbumAsLong() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsLong());
        System.out.println("Original name of album, serie... AS Long === " + jMetaDataGeneral.getOriginalAlbumAsLong());
    }

    /**
     * Test getOriginalAlbumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsLocalDateTime());
        System.out.println("Original name of album, serie... AS LocalDateTime === " + jMetaDataGeneral.getOriginalAlbumAsLocalDateTime());
    }

    /**
     * Test getOriginalAlbumAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsLocalTime());
        System.out.println("Original name of album, serie... AS LocalTime === " + jMetaDataGeneral.getOriginalAlbumAsLocalTime());
    }

    /**
     * Test getOriginalAlbumAsString() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsString());
        System.out.println("Original name of album, serie... AS String === " + jMetaDataGeneral.getOriginalAlbumAsString());
    }

    /**
     * Test getOriginalAlbumAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsBoolean());
        System.out.println("Original name of album, serie... AS Boolean === " + jMetaDataGeneral.getOriginalAlbumAsBoolean());
    }

    /**
     * Test getOriginalAlbumAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsBigInteger());
        System.out.println("Original name of album, serie... AS BigInteger === " + jMetaDataGeneral.getOriginalAlbumAsBigInteger());
    }

    /**
     * Test getOriginalAlbumAsURL() method.
     */
    @Test
    public void subTestGetOriginalAlbumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalAlbumAsURL());
        System.out.println("Original name of album, serie... AS URL === " + jMetaDataGeneral.getOriginalAlbumAsURL());
    }

    /**
     * Test getOriginalSourceFormAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsInteger());
        System.out.println("Original form of the material, e.g. slide, paper, map AS Integer === " + jMetaDataGeneral.getOriginalSourceFormAsInteger());
    }

    /**
     * Test getOriginalSourceFormAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsLong());
        System.out.println("Original form of the material, e.g. slide, paper, map AS Long === " + jMetaDataGeneral.getOriginalSourceFormAsLong());
    }

    /**
     * Test getOriginalSourceFormAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsLocalDateTime());
        System.out.println("Original form of the material, e.g. slide, paper, map AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsLocalTime());
        System.out.println("Original form of the material, e.g. slide, paper, map AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsString());
        System.out.println("Original form of the material, e.g. slide, paper, map AS String === " + jMetaDataGeneral.getOriginalSourceFormAsString());
    }

    /**
     * Test getOriginalSourceFormAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsBoolean());
        System.out.println("Original form of the material, e.g. slide, paper, map AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormAsBoolean());
    }

    /**
     * Test getOriginalSourceFormAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsBigInteger());
        System.out.println("Original form of the material, e.g. slide, paper, map AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormAsURL());
        System.out.println("Original form of the material, e.g. slide, paper, map AS URL === " + jMetaDataGeneral.getOriginalSourceFormAsURL());
    }

    /**
     * Test getDelaySettingsAsInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataGeneral.getDelaySettingsAsInteger());
    }

    /**
     * Test getDelaySettingsAsLong() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataGeneral.getDelaySettingsAsLong());
    }

    /**
     * Test getDelaySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataGeneral.getDelaySettingsAsLocalDateTime());
    }

    /**
     * Test getDelaySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataGeneral.getDelaySettingsAsLocalTime());
    }

    /**
     * Test getDelaySettingsAsString() method.
     */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataGeneral.getDelaySettingsAsString());
    }

    /**
     * Test getDelaySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataGeneral.getDelaySettingsAsBoolean());
    }

    /**
     * Test getDelaySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataGeneral.getDelaySettingsAsBigInteger());
    }

    /**
     * Test getDelaySettingsAsURL() method.
     */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataGeneral.getDelaySettingsAsURL());
    }

    /**
     * Test getTimeZoneAsInteger() method.
     */
    @Test
    public void subTestGetTimeZoneAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsInteger());
        System.out.println("TimeZone AS Integer === " + jMetaDataGeneral.getTimeZoneAsInteger());
    }

    /**
     * Test getTimeZoneAsLong() method.
     */
    @Test
    public void subTestGetTimeZoneAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsLong());
        System.out.println("TimeZone AS Long === " + jMetaDataGeneral.getTimeZoneAsLong());
    }

    /**
     * Test getTimeZoneAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTimeZoneAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsLocalDateTime());
        System.out.println("TimeZone AS LocalDateTime === " + jMetaDataGeneral.getTimeZoneAsLocalDateTime());
    }

    /**
     * Test getTimeZoneAsLocalTime() method.
     */
    @Test
    public void subTestGetTimeZoneAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsLocalTime());
        System.out.println("TimeZone AS LocalTime === " + jMetaDataGeneral.getTimeZoneAsLocalTime());
    }

    /**
     * Test getTimeZoneAsString() method.
     */
    @Test
    public void subTestGetTimeZoneAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsString());
        System.out.println("TimeZone AS String === " + jMetaDataGeneral.getTimeZoneAsString());
    }

    /**
     * Test getTimeZoneAsBoolean() method.
     */
    @Test
    public void subTestGetTimeZoneAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsBoolean());
        System.out.println("TimeZone AS Boolean === " + jMetaDataGeneral.getTimeZoneAsBoolean());
    }

    /**
     * Test getTimeZoneAsBigInteger() method.
     */
    @Test
    public void subTestGetTimeZoneAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsBigInteger());
        System.out.println("TimeZone AS BigInteger === " + jMetaDataGeneral.getTimeZoneAsBigInteger());
    }

    /**
     * Test getTimeZoneAsURL() method.
     */
    @Test
    public void subTestGetTimeZoneAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTimeZoneAsURL());
        System.out.println("TimeZone AS URL === " + jMetaDataGeneral.getTimeZoneAsURL());
    }

    /**
     * Test getImageFormatListAsInteger() method.
     */
    @Test
    public void subTestGetImageFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsInteger());
        System.out.println("Image Codecs in this file, separated by / AS Integer === " + jMetaDataGeneral.getImageFormatListAsInteger());
    }

    /**
     * Test getImageFormatListAsLong() method.
     */
    @Test
    public void subTestGetImageFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsLong());
        System.out.println("Image Codecs in this file, separated by / AS Long === " + jMetaDataGeneral.getImageFormatListAsLong());
    }

    /**
     * Test getImageFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsLocalDateTime());
        System.out.println("Image Codecs in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getImageFormatListAsLocalDateTime());
    }

    /**
     * Test getImageFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetImageFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsLocalTime());
        System.out.println("Image Codecs in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getImageFormatListAsLocalTime());
    }

    /**
     * Test getImageFormatListAsString() method.
     */
    @Test
    public void subTestGetImageFormatListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsString());
        System.out.println("Image Codecs in this file, separated by / AS String === " + jMetaDataGeneral.getImageFormatListAsString());
    }

    /**
     * Test getImageFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetImageFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsBoolean());
        System.out.println("Image Codecs in this file, separated by / AS Boolean === " + jMetaDataGeneral.getImageFormatListAsBoolean());
    }

    /**
     * Test getImageFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetImageFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsBigInteger());
        System.out.println("Image Codecs in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getImageFormatListAsBigInteger());
    }

    /**
     * Test getImageFormatListAsURL() method.
     */
    @Test
    public void subTestGetImageFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatListAsURL());
        System.out.println("Image Codecs in this file, separated by / AS URL === " + jMetaDataGeneral.getImageFormatListAsURL());
    }

    /**
     * Test getMenuCountAsInteger() method.
     */
    @Test
    public void subTestGetMenuCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsInteger());
        System.out.println("Number of menu streams AS Integer === " + jMetaDataGeneral.getMenuCountAsInteger());
    }

    /**
     * Test getMenuCountAsLong() method.
     */
    @Test
    public void subTestGetMenuCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsLong());
        System.out.println("Number of menu streams AS Long === " + jMetaDataGeneral.getMenuCountAsLong());
    }

    /**
     * Test getMenuCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsLocalDateTime());
        System.out.println("Number of menu streams AS LocalDateTime === " + jMetaDataGeneral.getMenuCountAsLocalDateTime());
    }

    /**
     * Test getMenuCountAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsLocalTime());
        System.out.println("Number of menu streams AS LocalTime === " + jMetaDataGeneral.getMenuCountAsLocalTime());
    }

    /**
     * Test getMenuCountAsString() method.
     */
    @Test
    public void subTestGetMenuCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsString());
        System.out.println("Number of menu streams AS String === " + jMetaDataGeneral.getMenuCountAsString());
    }

    /**
     * Test getMenuCountAsBoolean() method.
     */
    @Test
    public void subTestGetMenuCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsBoolean());
        System.out.println("Number of menu streams AS Boolean === " + jMetaDataGeneral.getMenuCountAsBoolean());
    }

    /**
     * Test getMenuCountAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsBigInteger());
        System.out.println("Number of menu streams AS BigInteger === " + jMetaDataGeneral.getMenuCountAsBigInteger());
    }

    /**
     * Test getMenuCountAsURL() method.
     */
    @Test
    public void subTestGetMenuCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuCountAsURL());
        System.out.println("Number of menu streams AS URL === " + jMetaDataGeneral.getMenuCountAsURL());
    }

    /**
     * Test getImageFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsInteger());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getImageFormatWithHintListAsInteger());
    }

    /**
     * Test getImageFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsLong());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getImageFormatWithHintListAsLong());
    }

    /**
     * Test getImageFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsLocalDateTime());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getImageFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getImageFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsLocalTime());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getImageFormatWithHintListAsLocalTime());
    }

    /**
     * Test getImageFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsString());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getImageFormatWithHintListAsString());
    }

    /**
     * Test getImageFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsBoolean());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getImageFormatWithHintListAsBoolean());
    }

    /**
     * Test getImageFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsBigInteger());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getImageFormatWithHintListAsBigInteger());
    }

    /**
     * Test getImageFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetImageFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageFormatWithHintListAsURL());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getImageFormatWithHintListAsURL());
    }

    /**
     * Test getPartAsInteger() method.
     */
    @Test
    public void subTestGetPartAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsInteger());
        System.out.println("Name of the part. e.g. CD1, CD2 AS Integer === " + jMetaDataGeneral.getPartAsInteger());
    }

    /**
     * Test getPartAsLong() method.
     */
    @Test
    public void subTestGetPartAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsLong());
        System.out.println("Name of the part. e.g. CD1, CD2 AS Long === " + jMetaDataGeneral.getPartAsLong());
    }

    /**
     * Test getPartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPartAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsLocalDateTime());
        System.out.println("Name of the part. e.g. CD1, CD2 AS LocalDateTime === " + jMetaDataGeneral.getPartAsLocalDateTime());
    }

    /**
     * Test getPartAsLocalTime() method.
     */
    @Test
    public void subTestGetPartAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsLocalTime());
        System.out.println("Name of the part. e.g. CD1, CD2 AS LocalTime === " + jMetaDataGeneral.getPartAsLocalTime());
    }

    /**
     * Test getPartAsString() method.
     */
    @Test
    public void subTestGetPartAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsString());
        System.out.println("Name of the part. e.g. CD1, CD2 AS String === " + jMetaDataGeneral.getPartAsString());
    }

    /**
     * Test getPartAsBoolean() method.
     */
    @Test
    public void subTestGetPartAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsBoolean());
        System.out.println("Name of the part. e.g. CD1, CD2 AS Boolean === " + jMetaDataGeneral.getPartAsBoolean());
    }

    /**
     * Test getPartAsBigInteger() method.
     */
    @Test
    public void subTestGetPartAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsBigInteger());
        System.out.println("Name of the part. e.g. CD1, CD2 AS BigInteger === " + jMetaDataGeneral.getPartAsBigInteger());
    }

    /**
     * Test getPartAsURL() method.
     */
    @Test
    public void subTestGetPartAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartAsURL());
        System.out.println("Name of the part. e.g. CD1, CD2 AS URL === " + jMetaDataGeneral.getPartAsURL());
    }

    /**
     * Test getOverallBitRateModeStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsInteger());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS Integer === " + jMetaDataGeneral.getOverallBitRateModeStringAsInteger());
    }

    /**
     * Test getOverallBitRateModeStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsLong());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS Long === " + jMetaDataGeneral.getOverallBitRateModeStringAsLong());
    }

    /**
     * Test getOverallBitRateModeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsLocalDateTime());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateModeStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateModeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsLocalTime());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateModeStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateModeStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsString());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS String === " + jMetaDataGeneral.getOverallBitRateModeStringAsString());
    }

    /**
     * Test getOverallBitRateModeStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsBoolean());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS Boolean === " + jMetaDataGeneral.getOverallBitRateModeStringAsBoolean());
    }

    /**
     * Test getOverallBitRateModeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsBigInteger());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateModeStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateModeStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateModeStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeStringAsURL());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS URL === " + jMetaDataGeneral.getOverallBitRateModeStringAsURL());
    }

    /**
     * Test getPartPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsInteger());
        System.out.println("Place of the part e.g. 2 of 3 AS Integer === " + jMetaDataGeneral.getPartPositionTotalAsInteger());
    }

    /**
     * Test getPartPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsLong());
        System.out.println("Place of the part e.g. 2 of 3 AS Long === " + jMetaDataGeneral.getPartPositionTotalAsLong());
    }

    /**
     * Test getPartPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsLocalDateTime());
        System.out.println("Place of the part e.g. 2 of 3 AS LocalDateTime === " + jMetaDataGeneral.getPartPositionTotalAsLocalDateTime());
    }

    /**
     * Test getPartPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsLocalTime());
        System.out.println("Place of the part e.g. 2 of 3 AS LocalTime === " + jMetaDataGeneral.getPartPositionTotalAsLocalTime());
    }

    /**
     * Test getPartPositionTotalAsString() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsString());
        System.out.println("Place of the part e.g. 2 of 3 AS String === " + jMetaDataGeneral.getPartPositionTotalAsString());
    }

    /**
     * Test getPartPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsBoolean());
        System.out.println("Place of the part e.g. 2 of 3 AS Boolean === " + jMetaDataGeneral.getPartPositionTotalAsBoolean());
    }

    /**
     * Test getPartPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsBigInteger());
        System.out.println("Place of the part e.g. 2 of 3 AS BigInteger === " + jMetaDataGeneral.getPartPositionTotalAsBigInteger());
    }

    /**
     * Test getPartPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetPartPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionTotalAsURL());
        System.out.println("Place of the part e.g. 2 of 3 AS URL === " + jMetaDataGeneral.getPartPositionTotalAsURL());
    }

    /**
     * Test getOriginalMovieAsInteger() method.
     */
    @Test
    public void subTestGetOriginalMovieAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsInteger());
        System.out.println("Original name of the movie AS Integer === " + jMetaDataGeneral.getOriginalMovieAsInteger());
    }

    /**
     * Test getOriginalMovieAsLong() method.
     */
    @Test
    public void subTestGetOriginalMovieAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsLong());
        System.out.println("Original name of the movie AS Long === " + jMetaDataGeneral.getOriginalMovieAsLong());
    }

    /**
     * Test getOriginalMovieAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalMovieAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsLocalDateTime());
        System.out.println("Original name of the movie AS LocalDateTime === " + jMetaDataGeneral.getOriginalMovieAsLocalDateTime());
    }

    /**
     * Test getOriginalMovieAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalMovieAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsLocalTime());
        System.out.println("Original name of the movie AS LocalTime === " + jMetaDataGeneral.getOriginalMovieAsLocalTime());
    }

    /**
     * Test getOriginalMovieAsString() method.
     */
    @Test
    public void subTestGetOriginalMovieAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsString());
        System.out.println("Original name of the movie AS String === " + jMetaDataGeneral.getOriginalMovieAsString());
    }

    /**
     * Test getOriginalMovieAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalMovieAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsBoolean());
        System.out.println("Original name of the movie AS Boolean === " + jMetaDataGeneral.getOriginalMovieAsBoolean());
    }

    /**
     * Test getOriginalMovieAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalMovieAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsBigInteger());
        System.out.println("Original name of the movie AS BigInteger === " + jMetaDataGeneral.getOriginalMovieAsBigInteger());
    }

    /**
     * Test getOriginalMovieAsURL() method.
     */
    @Test
    public void subTestGetOriginalMovieAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalMovieAsURL());
        System.out.println("Original name of the movie AS URL === " + jMetaDataGeneral.getOriginalMovieAsURL());
    }

    /**
     * Test getAlbumReplayGainPeakAsInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsInteger());
        System.out.println("The maximum absolute peak value of the item AS Integer === " + jMetaDataGeneral.getAlbumReplayGainPeakAsInteger());
    }

    /**
     * Test getAlbumReplayGainPeakAsLong() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsLong());
        System.out.println("The maximum absolute peak value of the item AS Long === " + jMetaDataGeneral.getAlbumReplayGainPeakAsLong());
    }

    /**
     * Test getAlbumReplayGainPeakAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsLocalDateTime());
        System.out.println("The maximum absolute peak value of the item AS LocalDateTime === " + jMetaDataGeneral.getAlbumReplayGainPeakAsLocalDateTime());
    }

    /**
     * Test getAlbumReplayGainPeakAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsLocalTime());
        System.out.println("The maximum absolute peak value of the item AS LocalTime === " + jMetaDataGeneral.getAlbumReplayGainPeakAsLocalTime());
    }

    /**
     * Test getAlbumReplayGainPeakAsString() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsString());
        System.out.println("The maximum absolute peak value of the item AS String === " + jMetaDataGeneral.getAlbumReplayGainPeakAsString());
    }

    /**
     * Test getAlbumReplayGainPeakAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsBoolean());
        System.out.println("The maximum absolute peak value of the item AS Boolean === " + jMetaDataGeneral.getAlbumReplayGainPeakAsBoolean());
    }

    /**
     * Test getAlbumReplayGainPeakAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsBigInteger());
        System.out.println("The maximum absolute peak value of the item AS BigInteger === " + jMetaDataGeneral.getAlbumReplayGainPeakAsBigInteger());
    }

    /**
     * Test getAlbumReplayGainPeakAsURL() method.
     */
    @Test
    public void subTestGetAlbumReplayGainPeakAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainPeakAsURL());
        System.out.println("The maximum absolute peak value of the item AS URL === " + jMetaDataGeneral.getAlbumReplayGainPeakAsURL());
    }

    /**
     * Test getFileSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsInteger());
        System.out.println("File size (with measure, 4 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString4AsInteger());
    }

    /**
     * Test getFileSizeString4AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString4AsLong() {
        assertEquals(Long.valueOf(2681), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsLong());
        System.out.println("File size (with measure, 4 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString4AsLong());
    }

    /**
     * Test getFileSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsLocalDateTime());
        System.out.println("File size (with measure, 4 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString4AsLocalDateTime());
    }

    /**
     * Test getFileSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsLocalTime());
        System.out.println("File size (with measure, 4 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString4AsLocalTime());
    }

    /**
     * Test getFileSizeString4AsString() method.
     */
    @Test
    public void subTestGetFileSizeString4AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsString());
        System.out.println("File size (with measure, 4 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString4AsString());
    }

    /**
     * Test getFileSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsBoolean());
        System.out.println("File size (with measure, 4 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString4AsBoolean());
    }

    /**
     * Test getFileSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsBigInteger());
        System.out.println("File size (with measure, 4 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString4AsBigInteger());
    }

    /**
     * Test getFileSizeString4AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString4AsURL());
        System.out.println("File size (with measure, 4 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString4AsURL());
    }

    /**
     * Test getFileSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetFileSizeString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsInteger());
        System.out.println("File size (with measure, 3 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString3AsInteger());
    }

    /**
     * Test getFileSizeString3AsLong() method.
     */
    @Test
    public void subTestGetFileSizeString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsLong());
        System.out.println("File size (with measure, 3 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString3AsLong());
    }

    /**
     * Test getFileSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsLocalDateTime());
        System.out.println("File size (with measure, 3 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString3AsLocalDateTime());
    }

    /**
     * Test getFileSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsLocalTime());
        System.out.println("File size (with measure, 3 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString3AsLocalTime());
    }

    /**
     * Test getFileSizeString3AsString() method.
     */
    @Test
    public void subTestGetFileSizeString3AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsString());
        System.out.println("File size (with measure, 3 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString3AsString());
    }

    /**
     * Test getFileSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsBoolean());
        System.out.println("File size (with measure, 3 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString3AsBoolean());
    }

    /**
     * Test getFileSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsBigInteger());
        System.out.println("File size (with measure, 3 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString3AsBigInteger());
    }

    /**
     * Test getFileSizeString3AsURL() method.
     */
    @Test
    public void subTestGetFileSizeString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeString3AsURL());
        System.out.println("File size (with measure, 3 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString3AsURL());
    }

    /**
     * Test getRemixedByAsInteger() method.
     */
    @Test
    public void subTestGetRemixedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsInteger());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS Integer === " + jMetaDataGeneral.getRemixedByAsInteger());
    }

    /**
     * Test getRemixedByAsLong() method.
     */
    @Test
    public void subTestGetRemixedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsLong());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS Long === " + jMetaDataGeneral.getRemixedByAsLong());
    }

    /**
     * Test getRemixedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRemixedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsLocalDateTime());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS LocalDateTime === " + jMetaDataGeneral.getRemixedByAsLocalDateTime());
    }

    /**
     * Test getRemixedByAsLocalTime() method.
     */
    @Test
    public void subTestGetRemixedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsLocalTime());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS LocalTime === " + jMetaDataGeneral.getRemixedByAsLocalTime());
    }

    /**
     * Test getRemixedByAsString() method.
     */
    @Test
    public void subTestGetRemixedByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsString());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS String === " + jMetaDataGeneral.getRemixedByAsString());
    }

    /**
     * Test getRemixedByAsBoolean() method.
     */
    @Test
    public void subTestGetRemixedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsBoolean());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS Boolean === " + jMetaDataGeneral.getRemixedByAsBoolean());
    }

    /**
     * Test getRemixedByAsBigInteger() method.
     */
    @Test
    public void subTestGetRemixedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsBigInteger());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS BigInteger === " + jMetaDataGeneral.getRemixedByAsBigInteger());
    }

    /**
     * Test getRemixedByAsURL() method.
     */
    @Test
    public void subTestGetRemixedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRemixedByAsURL());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS URL === " + jMetaDataGeneral.getRemixedByAsURL());
    }

    /**
     * Test getSubTrackAsInteger() method.
     */
    @Test
    public void subTestGetSubTrackAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsInteger());
        System.out.println("Name of the subtrack. AS Integer === " + jMetaDataGeneral.getSubTrackAsInteger());
    }

    /**
     * Test getSubTrackAsLong() method.
     */
    @Test
    public void subTestGetSubTrackAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsLong());
        System.out.println("Name of the subtrack. AS Long === " + jMetaDataGeneral.getSubTrackAsLong());
    }

    /**
     * Test getSubTrackAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSubTrackAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsLocalDateTime());
        System.out.println("Name of the subtrack. AS LocalDateTime === " + jMetaDataGeneral.getSubTrackAsLocalDateTime());
    }

    /**
     * Test getSubTrackAsLocalTime() method.
     */
    @Test
    public void subTestGetSubTrackAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsLocalTime());
        System.out.println("Name of the subtrack. AS LocalTime === " + jMetaDataGeneral.getSubTrackAsLocalTime());
    }

    /**
     * Test getSubTrackAsString() method.
     */
    @Test
    public void subTestGetSubTrackAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsString());
        System.out.println("Name of the subtrack. AS String === " + jMetaDataGeneral.getSubTrackAsString());
    }

    /**
     * Test getSubTrackAsBoolean() method.
     */
    @Test
    public void subTestGetSubTrackAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsBoolean());
        System.out.println("Name of the subtrack. AS Boolean === " + jMetaDataGeneral.getSubTrackAsBoolean());
    }

    /**
     * Test getSubTrackAsBigInteger() method.
     */
    @Test
    public void subTestGetSubTrackAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsBigInteger());
        System.out.println("Name of the subtrack. AS BigInteger === " + jMetaDataGeneral.getSubTrackAsBigInteger());
    }

    /**
     * Test getSubTrackAsURL() method.
     */
    @Test
    public void subTestGetSubTrackAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubTrackAsURL());
        System.out.println("Name of the subtrack. AS URL === " + jMetaDataGeneral.getSubTrackAsURL());
    }

    /**
     * Test getPackageNameAsInteger() method.
     */
    @Test
    public void subTestGetPackageNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsInteger());
        System.out.println("Package name i.e. technical flavor of the content AS Integer === " + jMetaDataGeneral.getPackageNameAsInteger());
    }

    /**
     * Test getPackageNameAsLong() method.
     */
    @Test
    public void subTestGetPackageNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsLong());
        System.out.println("Package name i.e. technical flavor of the content AS Long === " + jMetaDataGeneral.getPackageNameAsLong());
    }

    /**
     * Test getPackageNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPackageNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsLocalDateTime());
        System.out.println("Package name i.e. technical flavor of the content AS LocalDateTime === " + jMetaDataGeneral.getPackageNameAsLocalDateTime());
    }

    /**
     * Test getPackageNameAsLocalTime() method.
     */
    @Test
    public void subTestGetPackageNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsLocalTime());
        System.out.println("Package name i.e. technical flavor of the content AS LocalTime === " + jMetaDataGeneral.getPackageNameAsLocalTime());
    }

    /**
     * Test getPackageNameAsString() method.
     */
    @Test
    public void subTestGetPackageNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsString());
        System.out.println("Package name i.e. technical flavor of the content AS String === " + jMetaDataGeneral.getPackageNameAsString());
    }

    /**
     * Test getPackageNameAsBoolean() method.
     */
    @Test
    public void subTestGetPackageNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsBoolean());
        System.out.println("Package name i.e. technical flavor of the content AS Boolean === " + jMetaDataGeneral.getPackageNameAsBoolean());
    }

    /**
     * Test getPackageNameAsBigInteger() method.
     */
    @Test
    public void subTestGetPackageNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsBigInteger());
        System.out.println("Package name i.e. technical flavor of the content AS BigInteger === " + jMetaDataGeneral.getPackageNameAsBigInteger());
    }

    /**
     * Test getPackageNameAsURL() method.
     */
    @Test
    public void subTestGetPackageNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPackageNameAsURL());
        System.out.println("Package name i.e. technical flavor of the content AS URL === " + jMetaDataGeneral.getPackageNameAsURL());
    }

    /**
     * Test getOriginalSourceMediumAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsInteger());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS Integer === " + jMetaDataGeneral.getOriginalSourceMediumAsInteger());
    }

    /**
     * Test getOriginalSourceMediumAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsLong());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS Long === " + jMetaDataGeneral.getOriginalSourceMediumAsLong());
    }

    /**
     * Test getOriginalSourceMediumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsLocalDateTime());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceMediumAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsLocalTime());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS LocalTime === " + jMetaDataGeneral.getOriginalSourceMediumAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsString());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS String === " + jMetaDataGeneral.getOriginalSourceMediumAsString());
    }

    /**
     * Test getOriginalSourceMediumAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsBoolean());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS Boolean === " + jMetaDataGeneral.getOriginalSourceMediumAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsBigInteger());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS BigInteger === " + jMetaDataGeneral.getOriginalSourceMediumAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumAsURL());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS URL === " + jMetaDataGeneral.getOriginalSourceMediumAsURL());
    }

    /**
     * Test getFileNameAsInteger() method.
     */
    @Test
    public void subTestGetFileNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsInteger());
        System.out.println("File name only AS Integer === " + jMetaDataGeneral.getFileNameAsInteger());
    }

    /**
     * Test getFileNameAsLong() method.
     */
    @Test
    public void subTestGetFileNameAsLong() {
        assertEquals(Long.valueOf(10), JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsLong());
        System.out.println("File name only AS Long === " + jMetaDataGeneral.getFileNameAsLong());
    }

    /**
     * Test getFileNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsLocalDateTime());
        System.out.println("File name only AS LocalDateTime === " + jMetaDataGeneral.getFileNameAsLocalDateTime());
    }

    /**
     * Test getFileNameAsLocalTime() method.
     */
    @Test
    public void subTestGetFileNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsLocalTime());
        System.out.println("File name only AS LocalTime === " + jMetaDataGeneral.getFileNameAsLocalTime());
    }

    /**
     * Test getFileNameAsString() method.
     */
    @Test
    public void subTestGetFileNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsString());
        System.out.println("File name only AS String === " + jMetaDataGeneral.getFileNameAsString());
    }

    /**
     * Test getFileNameAsBoolean() method.
     */
    @Test
    public void subTestGetFileNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsBoolean());
        System.out.println("File name only AS Boolean === " + jMetaDataGeneral.getFileNameAsBoolean());
    }

    /**
     * Test getFileNameAsBigInteger() method.
     */
    @Test
    public void subTestGetFileNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsBigInteger());
        System.out.println("File name only AS BigInteger === " + jMetaDataGeneral.getFileNameAsBigInteger());
    }

    /**
     * Test getFileNameAsURL() method.
     */
    @Test
    public void subTestGetFileNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameAsURL());
        System.out.println("File name only AS URL === " + jMetaDataGeneral.getFileNameAsURL());
    }

    /**
     * Test getComicPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsInteger());
        System.out.println("Comic/Position_Total AS Integer === " + jMetaDataGeneral.getComicPositionTotalAsInteger());
    }

    /**
     * Test getComicPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsLong());
        System.out.println("Comic/Position_Total AS Long === " + jMetaDataGeneral.getComicPositionTotalAsLong());
    }

    /**
     * Test getComicPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsLocalDateTime());
        System.out.println("Comic/Position_Total AS LocalDateTime === " + jMetaDataGeneral.getComicPositionTotalAsLocalDateTime());
    }

    /**
     * Test getComicPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsLocalTime());
        System.out.println("Comic/Position_Total AS LocalTime === " + jMetaDataGeneral.getComicPositionTotalAsLocalTime());
    }

    /**
     * Test getComicPositionTotalAsString() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsString());
        System.out.println("Comic/Position_Total AS String === " + jMetaDataGeneral.getComicPositionTotalAsString());
    }

    /**
     * Test getComicPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsBoolean());
        System.out.println("Comic/Position_Total AS Boolean === " + jMetaDataGeneral.getComicPositionTotalAsBoolean());
    }

    /**
     * Test getComicPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsBigInteger());
        System.out.println("Comic/Position_Total AS BigInteger === " + jMetaDataGeneral.getComicPositionTotalAsBigInteger());
    }

    /**
     * Test getComicPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetComicPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicPositionTotalAsURL());
        System.out.println("Comic/Position_Total AS URL === " + jMetaDataGeneral.getComicPositionTotalAsURL());
    }

    /**
     * Test getMusicByAsInteger() method.
     */
    @Test
    public void subTestGetMusicByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsInteger());
        System.out.println("Main music-artist for a movie AS Integer === " + jMetaDataGeneral.getMusicByAsInteger());
    }

    /**
     * Test getMusicByAsLong() method.
     */
    @Test
    public void subTestGetMusicByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsLong());
        System.out.println("Main music-artist for a movie AS Long === " + jMetaDataGeneral.getMusicByAsLong());
    }

    /**
     * Test getMusicByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMusicByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsLocalDateTime());
        System.out.println("Main music-artist for a movie AS LocalDateTime === " + jMetaDataGeneral.getMusicByAsLocalDateTime());
    }

    /**
     * Test getMusicByAsLocalTime() method.
     */
    @Test
    public void subTestGetMusicByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsLocalTime());
        System.out.println("Main music-artist for a movie AS LocalTime === " + jMetaDataGeneral.getMusicByAsLocalTime());
    }

    /**
     * Test getMusicByAsString() method.
     */
    @Test
    public void subTestGetMusicByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsString());
        System.out.println("Main music-artist for a movie AS String === " + jMetaDataGeneral.getMusicByAsString());
    }

    /**
     * Test getMusicByAsBoolean() method.
     */
    @Test
    public void subTestGetMusicByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsBoolean());
        System.out.println("Main music-artist for a movie AS Boolean === " + jMetaDataGeneral.getMusicByAsBoolean());
    }

    /**
     * Test getMusicByAsBigInteger() method.
     */
    @Test
    public void subTestGetMusicByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsBigInteger());
        System.out.println("Main music-artist for a movie AS BigInteger === " + jMetaDataGeneral.getMusicByAsBigInteger());
    }

    /**
     * Test getMusicByAsURL() method.
     */
    @Test
    public void subTestGetMusicByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMusicByAsURL());
        System.out.println("Main music-artist for a movie AS URL === " + jMetaDataGeneral.getMusicByAsURL());
    }

    /**
     * Test getWrittenDateAsInteger() method.
     */
    @Test
    public void subTestGetWrittenDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsInteger());
        System.out.println("The time/date/year that the composition of the music/script began. AS Integer === " + jMetaDataGeneral.getWrittenDateAsInteger());
    }

    /**
     * Test getWrittenDateAsLong() method.
     */
    @Test
    public void subTestGetWrittenDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsLong());
        System.out.println("The time/date/year that the composition of the music/script began. AS Long === " + jMetaDataGeneral.getWrittenDateAsLong());
    }

    /**
     * Test getWrittenDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWrittenDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsLocalDateTime());
        System.out.println("The time/date/year that the composition of the music/script began. AS LocalDateTime === " + jMetaDataGeneral.getWrittenDateAsLocalDateTime());
    }

    /**
     * Test getWrittenDateAsLocalTime() method.
     */
    @Test
    public void subTestGetWrittenDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsLocalTime());
        System.out.println("The time/date/year that the composition of the music/script began. AS LocalTime === " + jMetaDataGeneral.getWrittenDateAsLocalTime());
    }

    /**
     * Test getWrittenDateAsString() method.
     */
    @Test
    public void subTestGetWrittenDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsString());
        System.out.println("The time/date/year that the composition of the music/script began. AS String === " + jMetaDataGeneral.getWrittenDateAsString());
    }

    /**
     * Test getWrittenDateAsBoolean() method.
     */
    @Test
    public void subTestGetWrittenDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsBoolean());
        System.out.println("The time/date/year that the composition of the music/script began. AS Boolean === " + jMetaDataGeneral.getWrittenDateAsBoolean());
    }

    /**
     * Test getWrittenDateAsBigInteger() method.
     */
    @Test
    public void subTestGetWrittenDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsBigInteger());
        System.out.println("The time/date/year that the composition of the music/script began. AS BigInteger === " + jMetaDataGeneral.getWrittenDateAsBigInteger());
    }

    /**
     * Test getWrittenDateAsURL() method.
     */
    @Test
    public void subTestGetWrittenDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenDateAsURL());
        System.out.println("The time/date/year that the composition of the music/script began. AS URL === " + jMetaDataGeneral.getWrittenDateAsURL());
    }

    /**
     * Test getFileModifiedDateAsInteger() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsInteger());
        System.out.println("The time that the file was modified on the file system AS Integer === " + jMetaDataGeneral.getFileModifiedDateAsInteger());
    }

    /**
     * Test getFileModifiedDateAsLong() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsLong());
        System.out.println("The time that the file was modified on the file system AS Long === " + jMetaDataGeneral.getFileModifiedDateAsLong());
    }

    /**
     * Test getFileModifiedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsLocalDateTime());
        System.out.println("The time that the file was modified on the file system AS LocalDateTime === " + jMetaDataGeneral.getFileModifiedDateAsLocalDateTime());
    }

    /**
     * Test getFileModifiedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsLocalTime());
        System.out.println("The time that the file was modified on the file system AS LocalTime === " + jMetaDataGeneral.getFileModifiedDateAsLocalTime());
    }

    /**
     * Test getFileModifiedDateAsString() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsString());
        System.out.println("The time that the file was modified on the file system AS String === " + jMetaDataGeneral.getFileModifiedDateAsString());
    }

    /**
     * Test getFileModifiedDateAsBoolean() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsBoolean());
        System.out.println("The time that the file was modified on the file system AS Boolean === " + jMetaDataGeneral.getFileModifiedDateAsBoolean());
    }

    /**
     * Test getFileModifiedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsBigInteger() {
        assertEquals(BigInteger.valueOf(20170510064739359l), JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsBigInteger());
        System.out.println("The time that the file was modified on the file system AS BigInteger === " + jMetaDataGeneral.getFileModifiedDateAsBigInteger());
    }

    /**
     * Test getFileModifiedDateAsURL() method.
     */
    @Test
    public void subTestGetFileModifiedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateAsURL());
        System.out.println("The time that the file was modified on the file system AS URL === " + jMetaDataGeneral.getFileModifiedDateAsURL());
    }

    /**
     * Test getEncodedLibraryVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsInteger());
        System.out.println("Version of encoding-software AS Integer === " + jMetaDataGeneral.getEncodedLibraryVersionAsInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsLong());
        System.out.println("Version of encoding-software AS Long === " + jMetaDataGeneral.getEncodedLibraryVersionAsLong());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsLocalDateTime());
        System.out.println("Version of encoding-software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsLocalTime());
        System.out.println("Version of encoding-software AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryVersionAsLocalTime());
    }

    /**
     * Test getEncodedLibraryVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsString());
        System.out.println("Version of encoding-software AS String === " + jMetaDataGeneral.getEncodedLibraryVersionAsString());
    }

    /**
     * Test getEncodedLibraryVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsBoolean());
        System.out.println("Version of encoding-software AS Boolean === " + jMetaDataGeneral.getEncodedLibraryVersionAsBoolean());
    }

    /**
     * Test getEncodedLibraryVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsBigInteger());
        System.out.println("Version of encoding-software AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryVersionAsBigInteger());
    }

    /**
     * Test getEncodedLibraryVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryVersionAsURL());
        System.out.println("Version of encoding-software AS URL === " + jMetaDataGeneral.getEncodedLibraryVersionAsURL());
    }

    /**
     * Test getCodecIDInfoAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsInteger());
        System.out.println("Info about this codec AS Integer === " + jMetaDataGeneral.getCodecIDInfoAsInteger());
    }

    /**
     * Test getCodecIDInfoAsLong() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsLong());
        System.out.println("Info about this codec AS Long === " + jMetaDataGeneral.getCodecIDInfoAsLong());
    }

    /**
     * Test getCodecIDInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsLocalDateTime());
        System.out.println("Info about this codec AS LocalDateTime === " + jMetaDataGeneral.getCodecIDInfoAsLocalDateTime());
    }

    /**
     * Test getCodecIDInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsLocalTime());
        System.out.println("Info about this codec AS LocalTime === " + jMetaDataGeneral.getCodecIDInfoAsLocalTime());
    }

    /**
     * Test getCodecIDInfoAsString() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsString());
        System.out.println("Info about this codec AS String === " + jMetaDataGeneral.getCodecIDInfoAsString());
    }

    /**
     * Test getCodecIDInfoAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsBoolean());
        System.out.println("Info about this codec AS Boolean === " + jMetaDataGeneral.getCodecIDInfoAsBoolean());
    }

    /**
     * Test getCodecIDInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsBigInteger());
        System.out.println("Info about this codec AS BigInteger === " + jMetaDataGeneral.getCodecIDInfoAsBigInteger());
    }

    /**
     * Test getCodecIDInfoAsURL() method.
     */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDInfoAsURL());
        System.out.println("Info about this codec AS URL === " + jMetaDataGeneral.getCodecIDInfoAsURL());
    }

    /**
     * Test getStreamSizeAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsInteger());
        System.out.println("Stream size in bytes AS Integer === " + jMetaDataGeneral.getStreamSizeAsInteger());
    }

    /**
     * Test getStreamSizeAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsLong());
        System.out.println("Stream size in bytes AS Long === " + jMetaDataGeneral.getStreamSizeAsLong());
    }

    /**
     * Test getStreamSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsLocalDateTime());
        System.out.println("Stream size in bytes AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeAsLocalDateTime());
    }

    /**
     * Test getStreamSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsLocalTime());
        System.out.println("Stream size in bytes AS LocalTime === " + jMetaDataGeneral.getStreamSizeAsLocalTime());
    }

    /**
     * Test getStreamSizeAsString() method.
     */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsString());
        System.out.println("Stream size in bytes AS String === " + jMetaDataGeneral.getStreamSizeAsString());
    }

    /**
     * Test getStreamSizeAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsBoolean());
        System.out.println("Stream size in bytes AS Boolean === " + jMetaDataGeneral.getStreamSizeAsBoolean());
    }

    /**
     * Test getStreamSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsBigInteger());
        System.out.println("Stream size in bytes AS BigInteger === " + jMetaDataGeneral.getStreamSizeAsBigInteger());
    }

    /**
     * Test getStreamSizeAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeAsURL());
        System.out.println("Stream size in bytes AS URL === " + jMetaDataGeneral.getStreamSizeAsURL());
    }

    /**
     * Test getSeasonAsInteger() method.
     */
    @Test
    public void subTestGetSeasonAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsInteger());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS Integer === " + jMetaDataGeneral.getSeasonAsInteger());
    }

    /**
     * Test getSeasonAsLong() method.
     */
    @Test
    public void subTestGetSeasonAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsLong());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS Long === " + jMetaDataGeneral.getSeasonAsLong());
    }

    /**
     * Test getSeasonAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSeasonAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsLocalDateTime());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS LocalDateTime === " + jMetaDataGeneral.getSeasonAsLocalDateTime());
    }

    /**
     * Test getSeasonAsLocalTime() method.
     */
    @Test
    public void subTestGetSeasonAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsLocalTime());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS LocalTime === " + jMetaDataGeneral.getSeasonAsLocalTime());
    }

    /**
     * Test getSeasonAsString() method.
     */
    @Test
    public void subTestGetSeasonAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsString());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS String === " + jMetaDataGeneral.getSeasonAsString());
    }

    /**
     * Test getSeasonAsBoolean() method.
     */
    @Test
    public void subTestGetSeasonAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsBoolean());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS Boolean === " + jMetaDataGeneral.getSeasonAsBoolean());
    }

    /**
     * Test getSeasonAsBigInteger() method.
     */
    @Test
    public void subTestGetSeasonAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsBigInteger());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS BigInteger === " + jMetaDataGeneral.getSeasonAsBigInteger());
    }

    /**
     * Test getSeasonAsURL() method.
     */
    @Test
    public void subTestGetSeasonAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonAsURL());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS URL === " + jMetaDataGeneral.getSeasonAsURL());
    }

    /**
     * Test getCostumeDesignerAsInteger() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsInteger());
        System.out.println("The name of the costume designer. AS Integer === " + jMetaDataGeneral.getCostumeDesignerAsInteger());
    }

    /**
     * Test getCostumeDesignerAsLong() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsLong());
        System.out.println("The name of the costume designer. AS Long === " + jMetaDataGeneral.getCostumeDesignerAsLong());
    }

    /**
     * Test getCostumeDesignerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsLocalDateTime());
        System.out.println("The name of the costume designer. AS LocalDateTime === " + jMetaDataGeneral.getCostumeDesignerAsLocalDateTime());
    }

    /**
     * Test getCostumeDesignerAsLocalTime() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsLocalTime());
        System.out.println("The name of the costume designer. AS LocalTime === " + jMetaDataGeneral.getCostumeDesignerAsLocalTime());
    }

    /**
     * Test getCostumeDesignerAsString() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsString());
        System.out.println("The name of the costume designer. AS String === " + jMetaDataGeneral.getCostumeDesignerAsString());
    }

    /**
     * Test getCostumeDesignerAsBoolean() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsBoolean());
        System.out.println("The name of the costume designer. AS Boolean === " + jMetaDataGeneral.getCostumeDesignerAsBoolean());
    }

    /**
     * Test getCostumeDesignerAsBigInteger() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsBigInteger());
        System.out.println("The name of the costume designer. AS BigInteger === " + jMetaDataGeneral.getCostumeDesignerAsBigInteger());
    }

    /**
     * Test getCostumeDesignerAsURL() method.
     */
    @Test
    public void subTestGetCostumeDesignerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCostumeDesignerAsURL());
        System.out.println("The name of the costume designer. AS URL === " + jMetaDataGeneral.getCostumeDesignerAsURL());
    }

    /**
     * Test getOriginalPerformerAsInteger() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsInteger());
        System.out.println("Original artist(s)/performer(s). AS Integer === " + jMetaDataGeneral.getOriginalPerformerAsInteger());
    }

    /**
     * Test getOriginalPerformerAsLong() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsLong());
        System.out.println("Original artist(s)/performer(s). AS Long === " + jMetaDataGeneral.getOriginalPerformerAsLong());
    }

    /**
     * Test getOriginalPerformerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsLocalDateTime());
        System.out.println("Original artist(s)/performer(s). AS LocalDateTime === " + jMetaDataGeneral.getOriginalPerformerAsLocalDateTime());
    }

    /**
     * Test getOriginalPerformerAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsLocalTime());
        System.out.println("Original artist(s)/performer(s). AS LocalTime === " + jMetaDataGeneral.getOriginalPerformerAsLocalTime());
    }

    /**
     * Test getOriginalPerformerAsString() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsString());
        System.out.println("Original artist(s)/performer(s). AS String === " + jMetaDataGeneral.getOriginalPerformerAsString());
    }

    /**
     * Test getOriginalPerformerAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsBoolean());
        System.out.println("Original artist(s)/performer(s). AS Boolean === " + jMetaDataGeneral.getOriginalPerformerAsBoolean());
    }

    /**
     * Test getOriginalPerformerAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsBigInteger());
        System.out.println("Original artist(s)/performer(s). AS BigInteger === " + jMetaDataGeneral.getOriginalPerformerAsBigInteger());
    }

    /**
     * Test getOriginalPerformerAsURL() method.
     */
    @Test
    public void subTestGetOriginalPerformerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPerformerAsURL());
        System.out.println("Original artist(s)/performer(s). AS URL === " + jMetaDataGeneral.getOriginalPerformerAsURL());
    }

    /**
     * Test getOtherFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsInteger());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getOtherFormatWithHintListAsInteger());
    }

    /**
     * Test getOtherFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsLong());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getOtherFormatWithHintListAsLong());
    }

    /**
     * Test getOtherFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsLocalDateTime());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getOtherFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getOtherFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsLocalTime());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getOtherFormatWithHintListAsLocalTime());
    }

    /**
     * Test getOtherFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsString());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getOtherFormatWithHintListAsString());
    }

    /**
     * Test getOtherFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsBoolean());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getOtherFormatWithHintListAsBoolean());
    }

    /**
     * Test getOtherFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsBigInteger());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getOtherFormatWithHintListAsBigInteger());
    }

    /**
     * Test getOtherFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetOtherFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatWithHintListAsURL());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getOtherFormatWithHintListAsURL());
    }

    /**
     * Test getFormatInfoAsInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsInteger());
        System.out.println("Info about this Format AS Integer === " + jMetaDataGeneral.getFormatInfoAsInteger());
    }

    /**
     * Test getFormatInfoAsLong() method.
     */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsLong());
        System.out.println("Info about this Format AS Long === " + jMetaDataGeneral.getFormatInfoAsLong());
    }

    /**
     * Test getFormatInfoAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsLocalDateTime());
        System.out.println("Info about this Format AS LocalDateTime === " + jMetaDataGeneral.getFormatInfoAsLocalDateTime());
    }

    /**
     * Test getFormatInfoAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsLocalTime());
        System.out.println("Info about this Format AS LocalTime === " + jMetaDataGeneral.getFormatInfoAsLocalTime());
    }

    /**
     * Test getFormatInfoAsString() method.
     */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsString());
        System.out.println("Info about this Format AS String === " + jMetaDataGeneral.getFormatInfoAsString());
    }

    /**
     * Test getFormatInfoAsBoolean() method.
     */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsBoolean());
        System.out.println("Info about this Format AS Boolean === " + jMetaDataGeneral.getFormatInfoAsBoolean());
    }

    /**
     * Test getFormatInfoAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsBigInteger());
        System.out.println("Info about this Format AS BigInteger === " + jMetaDataGeneral.getFormatInfoAsBigInteger());
    }

    /**
     * Test getFormatInfoAsURL() method.
     */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatInfoAsURL());
        System.out.println("Info about this Format AS URL === " + jMetaDataGeneral.getFormatInfoAsURL());
    }

    /**
     * Test getInterleavedAsInteger() method.
     */
    @Test
    public void subTestGetInterleavedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsInteger());
        System.out.println("If Audio and video are muxed AS Integer === " + jMetaDataGeneral.getInterleavedAsInteger());
    }

    /**
     * Test getInterleavedAsLong() method.
     */
    @Test
    public void subTestGetInterleavedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsLong());
        System.out.println("If Audio and video are muxed AS Long === " + jMetaDataGeneral.getInterleavedAsLong());
    }

    /**
     * Test getInterleavedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInterleavedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsLocalDateTime());
        System.out.println("If Audio and video are muxed AS LocalDateTime === " + jMetaDataGeneral.getInterleavedAsLocalDateTime());
    }

    /**
     * Test getInterleavedAsLocalTime() method.
     */
    @Test
    public void subTestGetInterleavedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsLocalTime());
        System.out.println("If Audio and video are muxed AS LocalTime === " + jMetaDataGeneral.getInterleavedAsLocalTime());
    }

    /**
     * Test getInterleavedAsString() method.
     */
    @Test
    public void subTestGetInterleavedAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsString());
        System.out.println("If Audio and video are muxed AS String === " + jMetaDataGeneral.getInterleavedAsString());
    }

    /**
     * Test getInterleavedAsBoolean() method.
     */
    @Test
    public void subTestGetInterleavedAsBoolean() {
        assertEquals(Boolean.TRUE, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsBoolean());
        System.out.println("If Audio and video are muxed AS Boolean === " + jMetaDataGeneral.getInterleavedAsBoolean());
    }

    /**
     * Test getInterleavedAsBigInteger() method.
     */
    @Test
    public void subTestGetInterleavedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsBigInteger());
        System.out.println("If Audio and video are muxed AS BigInteger === " + jMetaDataGeneral.getInterleavedAsBigInteger());
    }

    /**
     * Test getInterleavedAsURL() method.
     */
    @Test
    public void subTestGetInterleavedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInterleavedAsURL());
        System.out.println("If Audio and video are muxed AS URL === " + jMetaDataGeneral.getInterleavedAsURL());
    }

    /**
     * Test getCodecIDUrlAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsInteger());
        System.out.println("A link to more details about this codec ID AS Integer === " + jMetaDataGeneral.getCodecIDUrlAsInteger());
    }

    /**
     * Test getCodecIDUrlAsLong() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsLong());
        System.out.println("A link to more details about this codec ID AS Long === " + jMetaDataGeneral.getCodecIDUrlAsLong());
    }

    /**
     * Test getCodecIDUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsLocalDateTime());
        System.out.println("A link to more details about this codec ID AS LocalDateTime === " + jMetaDataGeneral.getCodecIDUrlAsLocalDateTime());
    }

    /**
     * Test getCodecIDUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsLocalTime());
        System.out.println("A link to more details about this codec ID AS LocalTime === " + jMetaDataGeneral.getCodecIDUrlAsLocalTime());
    }

    /**
     * Test getCodecIDUrlAsString() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsString());
        System.out.println("A link to more details about this codec ID AS String === " + jMetaDataGeneral.getCodecIDUrlAsString());
    }

    /**
     * Test getCodecIDUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsBoolean());
        System.out.println("A link to more details about this codec ID AS Boolean === " + jMetaDataGeneral.getCodecIDUrlAsBoolean());
    }

    /**
     * Test getCodecIDUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsBigInteger());
        System.out.println("A link to more details about this codec ID AS BigInteger === " + jMetaDataGeneral.getCodecIDUrlAsBigInteger());
    }

    /**
     * Test getCodecIDUrlAsURL() method.
     */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDUrlAsURL());
        System.out.println("A link to more details about this codec ID AS URL === " + jMetaDataGeneral.getCodecIDUrlAsURL());
    }

    /**
     * Test getEncryptionModeAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionModeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsInteger());
        System.out.println("Encryption_Mode AS Integer === " + jMetaDataGeneral.getEncryptionModeAsInteger());
    }

    /**
     * Test getEncryptionModeAsLong() method.
     */
    @Test
    public void subTestGetEncryptionModeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsLong());
        System.out.println("Encryption_Mode AS Long === " + jMetaDataGeneral.getEncryptionModeAsLong());
    }

    /**
     * Test getEncryptionModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionModeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsLocalDateTime());
        System.out.println("Encryption_Mode AS LocalDateTime === " + jMetaDataGeneral.getEncryptionModeAsLocalDateTime());
    }

    /**
     * Test getEncryptionModeAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionModeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsLocalTime());
        System.out.println("Encryption_Mode AS LocalTime === " + jMetaDataGeneral.getEncryptionModeAsLocalTime());
    }

    /**
     * Test getEncryptionModeAsString() method.
     */
    @Test
    public void subTestGetEncryptionModeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsString());
        System.out.println("Encryption_Mode AS String === " + jMetaDataGeneral.getEncryptionModeAsString());
    }

    /**
     * Test getEncryptionModeAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionModeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsBoolean());
        System.out.println("Encryption_Mode AS Boolean === " + jMetaDataGeneral.getEncryptionModeAsBoolean());
    }

    /**
     * Test getEncryptionModeAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionModeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsBigInteger());
        System.out.println("Encryption_Mode AS BigInteger === " + jMetaDataGeneral.getEncryptionModeAsBigInteger());
    }

    /**
     * Test getEncryptionModeAsURL() method.
     */
    @Test
    public void subTestGetEncryptionModeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionModeAsURL());
        System.out.println("Encryption_Mode AS URL === " + jMetaDataGeneral.getEncryptionModeAsURL());
    }

    /**
     * Test getWrittenLocationAsInteger() method.
     */
    @Test
    public void subTestGetWrittenLocationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsInteger());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS Integer === " + jMetaDataGeneral.getWrittenLocationAsInteger());
    }

    /**
     * Test getWrittenLocationAsLong() method.
     */
    @Test
    public void subTestGetWrittenLocationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsLong());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS Long === " + jMetaDataGeneral.getWrittenLocationAsLong());
    }

    /**
     * Test getWrittenLocationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWrittenLocationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsLocalDateTime());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS LocalDateTime === " + jMetaDataGeneral.getWrittenLocationAsLocalDateTime());
    }

    /**
     * Test getWrittenLocationAsLocalTime() method.
     */
    @Test
    public void subTestGetWrittenLocationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsLocalTime());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS LocalTime === " + jMetaDataGeneral.getWrittenLocationAsLocalTime());
    }

    /**
     * Test getWrittenLocationAsString() method.
     */
    @Test
    public void subTestGetWrittenLocationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsString());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS String === " + jMetaDataGeneral.getWrittenLocationAsString());
    }

    /**
     * Test getWrittenLocationAsBoolean() method.
     */
    @Test
    public void subTestGetWrittenLocationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsBoolean());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS Boolean === " + jMetaDataGeneral.getWrittenLocationAsBoolean());
    }

    /**
     * Test getWrittenLocationAsBigInteger() method.
     */
    @Test
    public void subTestGetWrittenLocationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsBigInteger());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS BigInteger === " + jMetaDataGeneral.getWrittenLocationAsBigInteger());
    }

    /**
     * Test getWrittenLocationAsURL() method.
     */
    @Test
    public void subTestGetWrittenLocationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenLocationAsURL());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS URL === " + jMetaDataGeneral.getWrittenLocationAsURL());
    }

    /**
     * Test getDimensionsAsInteger() method.
     */
    @Test
    public void subTestGetDimensionsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsInteger());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS Integer === " + jMetaDataGeneral.getDimensionsAsInteger());
    }

    /**
     * Test getDimensionsAsLong() method.
     */
    @Test
    public void subTestGetDimensionsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsLong());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS Long === " + jMetaDataGeneral.getDimensionsAsLong());
    }

    /**
     * Test getDimensionsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDimensionsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsLocalDateTime());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS LocalDateTime === " + jMetaDataGeneral.getDimensionsAsLocalDateTime());
    }

    /**
     * Test getDimensionsAsLocalTime() method.
     */
    @Test
    public void subTestGetDimensionsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsLocalTime());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS LocalTime === " + jMetaDataGeneral.getDimensionsAsLocalTime());
    }

    /**
     * Test getDimensionsAsString() method.
     */
    @Test
    public void subTestGetDimensionsAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsString());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS String === " + jMetaDataGeneral.getDimensionsAsString());
    }

    /**
     * Test getDimensionsAsBoolean() method.
     */
    @Test
    public void subTestGetDimensionsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsBoolean());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS Boolean === " + jMetaDataGeneral.getDimensionsAsBoolean());
    }

    /**
     * Test getDimensionsAsBigInteger() method.
     */
    @Test
    public void subTestGetDimensionsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsBigInteger());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS BigInteger === " + jMetaDataGeneral.getDimensionsAsBigInteger());
    }

    /**
     * Test getDimensionsAsURL() method.
     */
    @Test
    public void subTestGetDimensionsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDimensionsAsURL());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS URL === " + jMetaDataGeneral.getDimensionsAsURL());
    }

    /**
     * Test getPublisherAsInteger() method.
     */
    @Test
    public void subTestGetPublisherAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsInteger());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS Integer === " + jMetaDataGeneral.getPublisherAsInteger());
    }

    /**
     * Test getPublisherAsLong() method.
     */
    @Test
    public void subTestGetPublisherAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsLong());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS Long === " + jMetaDataGeneral.getPublisherAsLong());
    }

    /**
     * Test getPublisherAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPublisherAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsLocalDateTime());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS LocalDateTime === " + jMetaDataGeneral.getPublisherAsLocalDateTime());
    }

    /**
     * Test getPublisherAsLocalTime() method.
     */
    @Test
    public void subTestGetPublisherAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsLocalTime());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS LocalTime === " + jMetaDataGeneral.getPublisherAsLocalTime());
    }

    /**
     * Test getPublisherAsString() method.
     */
    @Test
    public void subTestGetPublisherAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsString());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS String === " + jMetaDataGeneral.getPublisherAsString());
    }

    /**
     * Test getPublisherAsBoolean() method.
     */
    @Test
    public void subTestGetPublisherAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsBoolean());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS Boolean === " + jMetaDataGeneral.getPublisherAsBoolean());
    }

    /**
     * Test getPublisherAsBigInteger() method.
     */
    @Test
    public void subTestGetPublisherAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsBigInteger());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS BigInteger === " + jMetaDataGeneral.getPublisherAsBigInteger());
    }

    /**
     * Test getPublisherAsURL() method.
     */
    @Test
    public void subTestGetPublisherAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherAsURL());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS URL === " + jMetaDataGeneral.getPublisherAsURL());
    }

    /**
     * Test getCoverTypeAsInteger() method.
     */
    @Test
    public void subTestGetCoverTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsInteger());
        System.out.println("Cover_Type AS Integer === " + jMetaDataGeneral.getCoverTypeAsInteger());
    }

    /**
     * Test getCoverTypeAsLong() method.
     */
    @Test
    public void subTestGetCoverTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsLong());
        System.out.println("Cover_Type AS Long === " + jMetaDataGeneral.getCoverTypeAsLong());
    }

    /**
     * Test getCoverTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsLocalDateTime());
        System.out.println("Cover_Type AS LocalDateTime === " + jMetaDataGeneral.getCoverTypeAsLocalDateTime());
    }

    /**
     * Test getCoverTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsLocalTime());
        System.out.println("Cover_Type AS LocalTime === " + jMetaDataGeneral.getCoverTypeAsLocalTime());
    }

    /**
     * Test getCoverTypeAsString() method.
     */
    @Test
    public void subTestGetCoverTypeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsString());
        System.out.println("Cover_Type AS String === " + jMetaDataGeneral.getCoverTypeAsString());
    }

    /**
     * Test getCoverTypeAsBoolean() method.
     */
    @Test
    public void subTestGetCoverTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsBoolean());
        System.out.println("Cover_Type AS Boolean === " + jMetaDataGeneral.getCoverTypeAsBoolean());
    }

    /**
     * Test getCoverTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsBigInteger());
        System.out.println("Cover_Type AS BigInteger === " + jMetaDataGeneral.getCoverTypeAsBigInteger());
    }

    /**
     * Test getCoverTypeAsURL() method.
     */
    @Test
    public void subTestGetCoverTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverTypeAsURL());
        System.out.println("Cover_Type AS URL === " + jMetaDataGeneral.getCoverTypeAsURL());
    }

    /**
     * Test getEncodedOperatingSystemAsInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsInteger());
        System.out.println("Operating System of encoding-software AS Integer === " + jMetaDataGeneral.getEncodedOperatingSystemAsInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsLong() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsLong());
        System.out.println("Operating System of encoding-software AS Long === " + jMetaDataGeneral.getEncodedOperatingSystemAsLong());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsLocalDateTime());
        System.out.println("Operating System of encoding-software AS LocalDateTime === " + jMetaDataGeneral.getEncodedOperatingSystemAsLocalDateTime());
    }

    /**
     * Test getEncodedOperatingSystemAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsLocalTime());
        System.out.println("Operating System of encoding-software AS LocalTime === " + jMetaDataGeneral.getEncodedOperatingSystemAsLocalTime());
    }

    /**
     * Test getEncodedOperatingSystemAsString() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsString());
        System.out.println("Operating System of encoding-software AS String === " + jMetaDataGeneral.getEncodedOperatingSystemAsString());
    }

    /**
     * Test getEncodedOperatingSystemAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsBoolean());
        System.out.println("Operating System of encoding-software AS Boolean === " + jMetaDataGeneral.getEncodedOperatingSystemAsBoolean());
    }

    /**
     * Test getEncodedOperatingSystemAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsBigInteger());
        System.out.println("Operating System of encoding-software AS BigInteger === " + jMetaDataGeneral.getEncodedOperatingSystemAsBigInteger());
    }

    /**
     * Test getEncodedOperatingSystemAsURL() method.
     */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedOperatingSystemAsURL());
        System.out.println("Operating System of encoding-software AS URL === " + jMetaDataGeneral.getEncodedOperatingSystemAsURL());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsLong());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsString());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsURL());
    }

    /**
     * Test getCoverAsInteger() method.
     */
    @Test
    public void subTestGetCoverAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsInteger());
        System.out.println("Is there a cover AS Integer === " + jMetaDataGeneral.getCoverAsInteger());
    }

    /**
     * Test getCoverAsLong() method.
     */
    @Test
    public void subTestGetCoverAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsLong());
        System.out.println("Is there a cover AS Long === " + jMetaDataGeneral.getCoverAsLong());
    }

    /**
     * Test getCoverAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsLocalDateTime());
        System.out.println("Is there a cover AS LocalDateTime === " + jMetaDataGeneral.getCoverAsLocalDateTime());
    }

    /**
     * Test getCoverAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsLocalTime());
        System.out.println("Is there a cover AS LocalTime === " + jMetaDataGeneral.getCoverAsLocalTime());
    }

    /**
     * Test getCoverAsString() method.
     */
    @Test
    public void subTestGetCoverAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsString());
        System.out.println("Is there a cover AS String === " + jMetaDataGeneral.getCoverAsString());
    }

    /**
     * Test getCoverAsBoolean() method.
     */
    @Test
    public void subTestGetCoverAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsBoolean());
        System.out.println("Is there a cover AS Boolean === " + jMetaDataGeneral.getCoverAsBoolean());
    }

    /**
     * Test getCoverAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsBigInteger());
        System.out.println("Is there a cover AS BigInteger === " + jMetaDataGeneral.getCoverAsBigInteger());
    }

    /**
     * Test getCoverAsURL() method.
     */
    @Test
    public void subTestGetCoverAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverAsURL());
        System.out.println("Is there a cover AS URL === " + jMetaDataGeneral.getCoverAsURL());
    }

    /**
     * Test getFormatCommercialIfAnyAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Integer === " + jMetaDataGeneral.getFormatCommercialIfAnyAsInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsLong());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Long === " + jMetaDataGeneral.getFormatCommercialIfAnyAsLong());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalDateTime === " + jMetaDataGeneral.getFormatCommercialIfAnyAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalTime === " + jMetaDataGeneral.getFormatCommercialIfAnyAsLocalTime());
    }

    /**
     * Test getFormatCommercialIfAnyAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsString());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS String === " + jMetaDataGeneral.getFormatCommercialIfAnyAsString());
    }

    /**
     * Test getFormatCommercialIfAnyAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Boolean === " + jMetaDataGeneral.getFormatCommercialIfAnyAsBoolean());
    }

    /**
     * Test getFormatCommercialIfAnyAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS BigInteger === " + jMetaDataGeneral.getFormatCommercialIfAnyAsBigInteger());
    }

    /**
     * Test getFormatCommercialIfAnyAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialIfAnyAsURL());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS URL === " + jMetaDataGeneral.getFormatCommercialIfAnyAsURL());
    }

    /**
     * Test getTaggedDateAsInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsInteger());
        System.out.println("The time/date/year that the tags were done for this item. AS Integer === " + jMetaDataGeneral.getTaggedDateAsInteger());
    }

    /**
     * Test getTaggedDateAsLong() method.
     */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsLong());
        System.out.println("The time/date/year that the tags were done for this item. AS Long === " + jMetaDataGeneral.getTaggedDateAsLong());
    }

    /**
     * Test getTaggedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsLocalDateTime());
        System.out.println("The time/date/year that the tags were done for this item. AS LocalDateTime === " + jMetaDataGeneral.getTaggedDateAsLocalDateTime());
    }

    /**
     * Test getTaggedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsLocalTime());
        System.out.println("The time/date/year that the tags were done for this item. AS LocalTime === " + jMetaDataGeneral.getTaggedDateAsLocalTime());
    }

    /**
     * Test getTaggedDateAsString() method.
     */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsString());
        System.out.println("The time/date/year that the tags were done for this item. AS String === " + jMetaDataGeneral.getTaggedDateAsString());
    }

    /**
     * Test getTaggedDateAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsBoolean());
        System.out.println("The time/date/year that the tags were done for this item. AS Boolean === " + jMetaDataGeneral.getTaggedDateAsBoolean());
    }

    /**
     * Test getTaggedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsBigInteger());
        System.out.println("The time/date/year that the tags were done for this item. AS BigInteger === " + jMetaDataGeneral.getTaggedDateAsBigInteger());
    }

    /**
     * Test getTaggedDateAsURL() method.
     */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedDateAsURL());
        System.out.println("The time/date/year that the tags were done for this item. AS URL === " + jMetaDataGeneral.getTaggedDateAsURL());
    }

    /**
     * Test getOriginalSourceFormNameAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsInteger());
        System.out.println("Name of the product the file was originally intended for AS Integer === " + jMetaDataGeneral.getOriginalSourceFormNameAsInteger());
    }

    /**
     * Test getOriginalSourceFormNameAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsLong());
        System.out.println("Name of the product the file was originally intended for AS Long === " + jMetaDataGeneral.getOriginalSourceFormNameAsLong());
    }

    /**
     * Test getOriginalSourceFormNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsLocalDateTime());
        System.out.println("Name of the product the file was originally intended for AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormNameAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormNameAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsLocalTime());
        System.out.println("Name of the product the file was originally intended for AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormNameAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormNameAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsString());
        System.out.println("Name of the product the file was originally intended for AS String === " + jMetaDataGeneral.getOriginalSourceFormNameAsString());
    }

    /**
     * Test getOriginalSourceFormNameAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsBoolean());
        System.out.println("Name of the product the file was originally intended for AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormNameAsBoolean());
    }

    /**
     * Test getOriginalSourceFormNameAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsBigInteger());
        System.out.println("Name of the product the file was originally intended for AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormNameAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormNameAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNameAsURL());
        System.out.println("Name of the product the file was originally intended for AS URL === " + jMetaDataGeneral.getOriginalSourceFormNameAsURL());
    }

    /**
     * Test getAlbumPerformerAsInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsInteger());
        System.out.println("Album performer/artist of this file AS Integer === " + jMetaDataGeneral.getAlbumPerformerAsInteger());
    }

    /**
     * Test getAlbumPerformerAsLong() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsLong());
        System.out.println("Album performer/artist of this file AS Long === " + jMetaDataGeneral.getAlbumPerformerAsLong());
    }

    /**
     * Test getAlbumPerformerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsLocalDateTime());
        System.out.println("Album performer/artist of this file AS LocalDateTime === " + jMetaDataGeneral.getAlbumPerformerAsLocalDateTime());
    }

    /**
     * Test getAlbumPerformerAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsLocalTime());
        System.out.println("Album performer/artist of this file AS LocalTime === " + jMetaDataGeneral.getAlbumPerformerAsLocalTime());
    }

    /**
     * Test getAlbumPerformerAsString() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsString());
        System.out.println("Album performer/artist of this file AS String === " + jMetaDataGeneral.getAlbumPerformerAsString());
    }

    /**
     * Test getAlbumPerformerAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsBoolean());
        System.out.println("Album performer/artist of this file AS Boolean === " + jMetaDataGeneral.getAlbumPerformerAsBoolean());
    }

    /**
     * Test getAlbumPerformerAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsBigInteger());
        System.out.println("Album performer/artist of this file AS BigInteger === " + jMetaDataGeneral.getAlbumPerformerAsBigInteger());
    }

    /**
     * Test getAlbumPerformerAsURL() method.
     */
    @Test
    public void subTestGetAlbumPerformerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerAsURL());
        System.out.println("Album performer/artist of this file AS URL === " + jMetaDataGeneral.getAlbumPerformerAsURL());
    }

    /**
     * Test getThanksToAsInteger() method.
     */
    @Test
    public void subTestGetThanksToAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsInteger());
        System.out.println("A very general tag for everyone else that wants to be listed. AS Integer === " + jMetaDataGeneral.getThanksToAsInteger());
    }

    /**
     * Test getThanksToAsLong() method.
     */
    @Test
    public void subTestGetThanksToAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsLong());
        System.out.println("A very general tag for everyone else that wants to be listed. AS Long === " + jMetaDataGeneral.getThanksToAsLong());
    }

    /**
     * Test getThanksToAsLocalDateTime() method.
     */
    @Test
    public void subTestGetThanksToAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsLocalDateTime());
        System.out.println("A very general tag for everyone else that wants to be listed. AS LocalDateTime === " + jMetaDataGeneral.getThanksToAsLocalDateTime());
    }

    /**
     * Test getThanksToAsLocalTime() method.
     */
    @Test
    public void subTestGetThanksToAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsLocalTime());
        System.out.println("A very general tag for everyone else that wants to be listed. AS LocalTime === " + jMetaDataGeneral.getThanksToAsLocalTime());
    }

    /**
     * Test getThanksToAsString() method.
     */
    @Test
    public void subTestGetThanksToAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsString());
        System.out.println("A very general tag for everyone else that wants to be listed. AS String === " + jMetaDataGeneral.getThanksToAsString());
    }

    /**
     * Test getThanksToAsBoolean() method.
     */
    @Test
    public void subTestGetThanksToAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsBoolean());
        System.out.println("A very general tag for everyone else that wants to be listed. AS Boolean === " + jMetaDataGeneral.getThanksToAsBoolean());
    }

    /**
     * Test getThanksToAsBigInteger() method.
     */
    @Test
    public void subTestGetThanksToAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsBigInteger());
        System.out.println("A very general tag for everyone else that wants to be listed. AS BigInteger === " + jMetaDataGeneral.getThanksToAsBigInteger());
    }

    /**
     * Test getThanksToAsURL() method.
     */
    @Test
    public void subTestGetThanksToAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getThanksToAsURL());
        System.out.println("A very general tag for everyone else that wants to be listed. AS URL === " + jMetaDataGeneral.getThanksToAsURL());
    }

    /**
     * Test getIDStringAsInteger() method.
     */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataGeneral.getIDStringAsInteger());
    }

    /**
     * Test getIDStringAsLong() method.
     */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataGeneral.getIDStringAsLong());
    }

    /**
     * Test getIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getIDStringAsLocalDateTime());
    }

    /**
     * Test getIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getIDStringAsLocalTime());
    }

    /**
     * Test getIDStringAsString() method.
     */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataGeneral.getIDStringAsString());
    }

    /**
     * Test getIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getIDStringAsBoolean());
    }

    /**
     * Test getIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getIDStringAsBigInteger());
    }

    /**
     * Test getIDStringAsURL() method.
     */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDStringAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataGeneral.getIDStringAsURL());
    }

    /**
     * Test getComicMoreAsInteger() method.
     */
    @Test
    public void subTestGetComicMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsInteger());
        System.out.println("Comic_More AS Integer === " + jMetaDataGeneral.getComicMoreAsInteger());
    }

    /**
     * Test getComicMoreAsLong() method.
     */
    @Test
    public void subTestGetComicMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsLong());
        System.out.println("Comic_More AS Long === " + jMetaDataGeneral.getComicMoreAsLong());
    }

    /**
     * Test getComicMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComicMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsLocalDateTime());
        System.out.println("Comic_More AS LocalDateTime === " + jMetaDataGeneral.getComicMoreAsLocalDateTime());
    }

    /**
     * Test getComicMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetComicMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsLocalTime());
        System.out.println("Comic_More AS LocalTime === " + jMetaDataGeneral.getComicMoreAsLocalTime());
    }

    /**
     * Test getComicMoreAsString() method.
     */
    @Test
    public void subTestGetComicMoreAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsString());
        System.out.println("Comic_More AS String === " + jMetaDataGeneral.getComicMoreAsString());
    }

    /**
     * Test getComicMoreAsBoolean() method.
     */
    @Test
    public void subTestGetComicMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsBoolean());
        System.out.println("Comic_More AS Boolean === " + jMetaDataGeneral.getComicMoreAsBoolean());
    }

    /**
     * Test getComicMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetComicMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsBigInteger());
        System.out.println("Comic_More AS BigInteger === " + jMetaDataGeneral.getComicMoreAsBigInteger());
    }

    /**
     * Test getComicMoreAsURL() method.
     */
    @Test
    public void subTestGetComicMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicMoreAsURL());
        System.out.println("Comic_More AS URL === " + jMetaDataGeneral.getComicMoreAsURL());
    }

    /**
     * Test getProductionDesignerAsInteger() method.
     */
    @Test
    public void subTestGetProductionDesignerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsInteger());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS Integer === " + jMetaDataGeneral.getProductionDesignerAsInteger());
    }

    /**
     * Test getProductionDesignerAsLong() method.
     */
    @Test
    public void subTestGetProductionDesignerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsLong());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS Long === " + jMetaDataGeneral.getProductionDesignerAsLong());
    }

    /**
     * Test getProductionDesignerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProductionDesignerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsLocalDateTime());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS LocalDateTime === " + jMetaDataGeneral.getProductionDesignerAsLocalDateTime());
    }

    /**
     * Test getProductionDesignerAsLocalTime() method.
     */
    @Test
    public void subTestGetProductionDesignerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsLocalTime());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS LocalTime === " + jMetaDataGeneral.getProductionDesignerAsLocalTime());
    }

    /**
     * Test getProductionDesignerAsString() method.
     */
    @Test
    public void subTestGetProductionDesignerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsString());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS String === " + jMetaDataGeneral.getProductionDesignerAsString());
    }

    /**
     * Test getProductionDesignerAsBoolean() method.
     */
    @Test
    public void subTestGetProductionDesignerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsBoolean());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS Boolean === " + jMetaDataGeneral.getProductionDesignerAsBoolean());
    }

    /**
     * Test getProductionDesignerAsBigInteger() method.
     */
    @Test
    public void subTestGetProductionDesignerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsBigInteger());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS BigInteger === " + jMetaDataGeneral.getProductionDesignerAsBigInteger());
    }

    /**
     * Test getProductionDesignerAsURL() method.
     */
    @Test
    public void subTestGetProductionDesignerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionDesignerAsURL());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS URL === " + jMetaDataGeneral.getProductionDesignerAsURL());
    }

    /**
     * Test getEncodedDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsInteger());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS Integer === " + jMetaDataGeneral.getEncodedDateAsInteger());
    }

    /**
     * Test getEncodedDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsLong());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS Long === " + jMetaDataGeneral.getEncodedDateAsLong());
    }

    /**
     * Test getEncodedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsLocalDateTime());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS LocalDateTime === " + jMetaDataGeneral.getEncodedDateAsLocalDateTime());
    }

    /**
     * Test getEncodedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsLocalTime());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS LocalTime === " + jMetaDataGeneral.getEncodedDateAsLocalTime());
    }

    /**
     * Test getEncodedDateAsString() method.
     */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsString());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS String === " + jMetaDataGeneral.getEncodedDateAsString());
    }

    /**
     * Test getEncodedDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsBoolean());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS Boolean === " + jMetaDataGeneral.getEncodedDateAsBoolean());
    }

    /**
     * Test getEncodedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsBigInteger());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS BigInteger === " + jMetaDataGeneral.getEncodedDateAsBigInteger());
    }

    /**
     * Test getEncodedDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedDateAsURL());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS URL === " + jMetaDataGeneral.getEncodedDateAsURL());
    }

    /**
     * Test getServiceChannelAsInteger() method.
     */
    @Test
    public void subTestGetServiceChannelAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsInteger());
        System.out.println("ServiceChannel AS Integer === " + jMetaDataGeneral.getServiceChannelAsInteger());
    }

    /**
     * Test getServiceChannelAsLong() method.
     */
    @Test
    public void subTestGetServiceChannelAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsLong());
        System.out.println("ServiceChannel AS Long === " + jMetaDataGeneral.getServiceChannelAsLong());
    }

    /**
     * Test getServiceChannelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceChannelAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsLocalDateTime());
        System.out.println("ServiceChannel AS LocalDateTime === " + jMetaDataGeneral.getServiceChannelAsLocalDateTime());
    }

    /**
     * Test getServiceChannelAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceChannelAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsLocalTime());
        System.out.println("ServiceChannel AS LocalTime === " + jMetaDataGeneral.getServiceChannelAsLocalTime());
    }

    /**
     * Test getServiceChannelAsString() method.
     */
    @Test
    public void subTestGetServiceChannelAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsString());
        System.out.println("ServiceChannel AS String === " + jMetaDataGeneral.getServiceChannelAsString());
    }

    /**
     * Test getServiceChannelAsBoolean() method.
     */
    @Test
    public void subTestGetServiceChannelAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsBoolean());
        System.out.println("ServiceChannel AS Boolean === " + jMetaDataGeneral.getServiceChannelAsBoolean());
    }

    /**
     * Test getServiceChannelAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceChannelAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsBigInteger());
        System.out.println("ServiceChannel AS BigInteger === " + jMetaDataGeneral.getServiceChannelAsBigInteger());
    }

    /**
     * Test getServiceChannelAsURL() method.
     */
    @Test
    public void subTestGetServiceChannelAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceChannelAsURL());
        System.out.println("ServiceChannel AS URL === " + jMetaDataGeneral.getServiceChannelAsURL());
    }

    /**
     * Test getUniqueIDAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataGeneral.getUniqueIDAsInteger());
    }

    /**
     * Test getUniqueIDAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataGeneral.getUniqueIDAsLong());
    }

    /**
     * Test getUniqueIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataGeneral.getUniqueIDAsLocalDateTime());
    }

    /**
     * Test getUniqueIDAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataGeneral.getUniqueIDAsLocalTime());
    }

    /**
     * Test getUniqueIDAsString() method.
     */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataGeneral.getUniqueIDAsString());
    }

    /**
     * Test getUniqueIDAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataGeneral.getUniqueIDAsBoolean());
    }

    /**
     * Test getUniqueIDAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataGeneral.getUniqueIDAsBigInteger());
    }

    /**
     * Test getUniqueIDAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataGeneral.getUniqueIDAsURL());
    }

    /**
     * Test getDelayString3AsInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsInteger());
        System.out.println("format : HH:MM:SS.MMM AS Integer === " + jMetaDataGeneral.getDelayString3AsInteger());
    }

    /**
     * Test getDelayString3AsLong() method.
     */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsLong());
        System.out.println("format : HH:MM:SS.MMM AS Long === " + jMetaDataGeneral.getDelayString3AsLong());
    }

    /**
     * Test getDelayString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsLocalDateTime());
        System.out.println("format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataGeneral.getDelayString3AsLocalDateTime());
    }

    /**
     * Test getDelayString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsLocalTime());
        System.out.println("format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataGeneral.getDelayString3AsLocalTime());
    }

    /**
     * Test getDelayString3AsString() method.
     */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsString());
        System.out.println("format : HH:MM:SS.MMM AS String === " + jMetaDataGeneral.getDelayString3AsString());
    }

    /**
     * Test getDelayString3AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsBoolean());
        System.out.println("format : HH:MM:SS.MMM AS Boolean === " + jMetaDataGeneral.getDelayString3AsBoolean());
    }

    /**
     * Test getDelayString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsBigInteger());
        System.out.println("format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataGeneral.getDelayString3AsBigInteger());
    }

    /**
     * Test getDelayString3AsURL() method.
     */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString3AsURL());
        System.out.println("format : HH:MM:SS.MMM AS URL === " + jMetaDataGeneral.getDelayString3AsURL());
    }

    /**
     * Test getDelayString4AsInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataGeneral.getDelayString4AsInteger());
    }

    /**
     * Test getDelayString4AsLong() method.
     */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsLong());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataGeneral.getDelayString4AsLong());
    }

    /**
     * Test getDelayString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataGeneral.getDelayString4AsLocalDateTime());
    }

    /**
     * Test getDelayString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataGeneral.getDelayString4AsLocalTime());
    }

    /**
     * Test getDelayString4AsString() method.
     */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsString());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataGeneral.getDelayString4AsString());
    }

    /**
     * Test getDelayString4AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsBoolean());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataGeneral.getDelayString4AsBoolean());
    }

    /**
     * Test getDelayString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataGeneral.getDelayString4AsBigInteger());
    }

    /**
     * Test getDelayString4AsURL() method.
     */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString4AsURL());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataGeneral.getDelayString4AsURL());
    }

    /**
     * Test getDelayString1AsInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataGeneral.getDelayString1AsInteger());
    }

    /**
     * Test getDelayString1AsLong() method.
     */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataGeneral.getDelayString1AsLong());
    }

    /**
     * Test getDelayString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataGeneral.getDelayString1AsLocalDateTime());
    }

    /**
     * Test getDelayString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataGeneral.getDelayString1AsLocalTime());
    }

    /**
     * Test getDelayString1AsString() method.
     */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataGeneral.getDelayString1AsString());
    }

    /**
     * Test getDelayString1AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataGeneral.getDelayString1AsBoolean());
    }

    /**
     * Test getDelayString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataGeneral.getDelayString1AsBigInteger());
    }

    /**
     * Test getDelayString1AsURL() method.
     */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataGeneral.getDelayString1AsURL());
    }

    /**
     * Test getDelayString2AsInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataGeneral.getDelayString2AsInteger());
    }

    /**
     * Test getDelayString2AsLong() method.
     */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataGeneral.getDelayString2AsLong());
    }

    /**
     * Test getDelayString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataGeneral.getDelayString2AsLocalDateTime());
    }

    /**
     * Test getDelayString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataGeneral.getDelayString2AsLocalTime());
    }

    /**
     * Test getDelayString2AsString() method.
     */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataGeneral.getDelayString2AsString());
    }

    /**
     * Test getDelayString2AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataGeneral.getDelayString2AsBoolean());
    }

    /**
     * Test getDelayString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataGeneral.getDelayString2AsBigInteger());
    }

    /**
     * Test getDelayString2AsURL() method.
     */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataGeneral.getDelayString2AsURL());
    }

    /**
     * Test getLabelAsInteger() method.
     */
    @Test
    public void subTestGetLabelAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsInteger());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS Integer === " + jMetaDataGeneral.getLabelAsInteger());
    }

    /**
     * Test getLabelAsLong() method.
     */
    @Test
    public void subTestGetLabelAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsLong());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS Long === " + jMetaDataGeneral.getLabelAsLong());
    }

    /**
     * Test getLabelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLabelAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsLocalDateTime());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS LocalDateTime === " + jMetaDataGeneral.getLabelAsLocalDateTime());
    }

    /**
     * Test getLabelAsLocalTime() method.
     */
    @Test
    public void subTestGetLabelAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsLocalTime());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS LocalTime === " + jMetaDataGeneral.getLabelAsLocalTime());
    }

    /**
     * Test getLabelAsString() method.
     */
    @Test
    public void subTestGetLabelAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsString());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS String === " + jMetaDataGeneral.getLabelAsString());
    }

    /**
     * Test getLabelAsBoolean() method.
     */
    @Test
    public void subTestGetLabelAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsBoolean());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS Boolean === " + jMetaDataGeneral.getLabelAsBoolean());
    }

    /**
     * Test getLabelAsBigInteger() method.
     */
    @Test
    public void subTestGetLabelAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsBigInteger());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS BigInteger === " + jMetaDataGeneral.getLabelAsBigInteger());
    }

    /**
     * Test getLabelAsURL() method.
     */
    @Test
    public void subTestGetLabelAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelAsURL());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS URL === " + jMetaDataGeneral.getLabelAsURL());
    }

    /**
     * Test getDelayString5AsInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataGeneral.getDelayString5AsInteger());
    }

    /**
     * Test getDelayString5AsLong() method.
     */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataGeneral.getDelayString5AsLong());
    }

    /**
     * Test getDelayString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataGeneral.getDelayString5AsLocalDateTime());
    }

    /**
     * Test getDelayString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataGeneral.getDelayString5AsLocalTime());
    }

    /**
     * Test getDelayString5AsString() method.
     */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataGeneral.getDelayString5AsString());
    }

    /**
     * Test getDelayString5AsBoolean() method.
     */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataGeneral.getDelayString5AsBoolean());
    }

    /**
     * Test getDelayString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataGeneral.getDelayString5AsBigInteger());
    }

    /**
     * Test getDelayString5AsURL() method.
     */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataGeneral.getDelayString5AsURL());
    }

    /**
     * Test getTrackUrlAsInteger() method.
     */
    @Test
    public void subTestGetTrackUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsInteger());
        System.out.println("Link to a site about this track AS Integer === " + jMetaDataGeneral.getTrackUrlAsInteger());
    }

    /**
     * Test getTrackUrlAsLong() method.
     */
    @Test
    public void subTestGetTrackUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsLong());
        System.out.println("Link to a site about this track AS Long === " + jMetaDataGeneral.getTrackUrlAsLong());
    }

    /**
     * Test getTrackUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsLocalDateTime());
        System.out.println("Link to a site about this track AS LocalDateTime === " + jMetaDataGeneral.getTrackUrlAsLocalDateTime());
    }

    /**
     * Test getTrackUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsLocalTime());
        System.out.println("Link to a site about this track AS LocalTime === " + jMetaDataGeneral.getTrackUrlAsLocalTime());
    }

    /**
     * Test getTrackUrlAsString() method.
     */
    @Test
    public void subTestGetTrackUrlAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsString());
        System.out.println("Link to a site about this track AS String === " + jMetaDataGeneral.getTrackUrlAsString());
    }

    /**
     * Test getTrackUrlAsBoolean() method.
     */
    @Test
    public void subTestGetTrackUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsBoolean());
        System.out.println("Link to a site about this track AS Boolean === " + jMetaDataGeneral.getTrackUrlAsBoolean());
    }

    /**
     * Test getTrackUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsBigInteger());
        System.out.println("Link to a site about this track AS BigInteger === " + jMetaDataGeneral.getTrackUrlAsBigInteger());
    }

    /**
     * Test getTrackUrlAsURL() method.
     */
    @Test
    public void subTestGetTrackUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackUrlAsURL());
        System.out.println("Link to a site about this track AS URL === " + jMetaDataGeneral.getTrackUrlAsURL());
    }

    /**
     * Test getOriginalPartAsInteger() method.
     */
    @Test
    public void subTestGetOriginalPartAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsInteger());
        System.out.println("Original name of the part in the original support AS Integer === " + jMetaDataGeneral.getOriginalPartAsInteger());
    }

    /**
     * Test getOriginalPartAsLong() method.
     */
    @Test
    public void subTestGetOriginalPartAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsLong());
        System.out.println("Original name of the part in the original support AS Long === " + jMetaDataGeneral.getOriginalPartAsLong());
    }

    /**
     * Test getOriginalPartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalPartAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsLocalDateTime());
        System.out.println("Original name of the part in the original support AS LocalDateTime === " + jMetaDataGeneral.getOriginalPartAsLocalDateTime());
    }

    /**
     * Test getOriginalPartAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalPartAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsLocalTime());
        System.out.println("Original name of the part in the original support AS LocalTime === " + jMetaDataGeneral.getOriginalPartAsLocalTime());
    }

    /**
     * Test getOriginalPartAsString() method.
     */
    @Test
    public void subTestGetOriginalPartAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsString());
        System.out.println("Original name of the part in the original support AS String === " + jMetaDataGeneral.getOriginalPartAsString());
    }

    /**
     * Test getOriginalPartAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalPartAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsBoolean());
        System.out.println("Original name of the part in the original support AS Boolean === " + jMetaDataGeneral.getOriginalPartAsBoolean());
    }

    /**
     * Test getOriginalPartAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalPartAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsBigInteger());
        System.out.println("Original name of the part in the original support AS BigInteger === " + jMetaDataGeneral.getOriginalPartAsBigInteger());
    }

    /**
     * Test getOriginalPartAsURL() method.
     */
    @Test
    public void subTestGetOriginalPartAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalPartAsURL());
        System.out.println("Original name of the part in the original support AS URL === " + jMetaDataGeneral.getOriginalPartAsURL());
    }

    /**
     * Test getEncryptionPaddingAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsInteger());
        System.out.println("Encryption_Padding AS Integer === " + jMetaDataGeneral.getEncryptionPaddingAsInteger());
    }

    /**
     * Test getEncryptionPaddingAsLong() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsLong());
        System.out.println("Encryption_Padding AS Long === " + jMetaDataGeneral.getEncryptionPaddingAsLong());
    }

    /**
     * Test getEncryptionPaddingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsLocalDateTime());
        System.out.println("Encryption_Padding AS LocalDateTime === " + jMetaDataGeneral.getEncryptionPaddingAsLocalDateTime());
    }

    /**
     * Test getEncryptionPaddingAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsLocalTime());
        System.out.println("Encryption_Padding AS LocalTime === " + jMetaDataGeneral.getEncryptionPaddingAsLocalTime());
    }

    /**
     * Test getEncryptionPaddingAsString() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsString());
        System.out.println("Encryption_Padding AS String === " + jMetaDataGeneral.getEncryptionPaddingAsString());
    }

    /**
     * Test getEncryptionPaddingAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsBoolean());
        System.out.println("Encryption_Padding AS Boolean === " + jMetaDataGeneral.getEncryptionPaddingAsBoolean());
    }

    /**
     * Test getEncryptionPaddingAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsBigInteger());
        System.out.println("Encryption_Padding AS BigInteger === " + jMetaDataGeneral.getEncryptionPaddingAsBigInteger());
    }

    /**
     * Test getEncryptionPaddingAsURL() method.
     */
    @Test
    public void subTestGetEncryptionPaddingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionPaddingAsURL());
        System.out.println("Encryption_Padding AS URL === " + jMetaDataGeneral.getEncryptionPaddingAsURL());
    }

    /**
     * Test getDelayAsInteger() method.
     */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Integer === " + jMetaDataGeneral.getDelayAsInteger());
    }

    /**
     * Test getDelayAsLong() method.
     */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsLong());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Long === " + jMetaDataGeneral.getDelayAsLong());
    }

    /**
     * Test getDelayAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalDateTime === " + jMetaDataGeneral.getDelayAsLocalDateTime());
    }

    /**
     * Test getDelayAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalTime === " + jMetaDataGeneral.getDelayAsLocalTime());
    }

    /**
     * Test getDelayAsString() method.
     */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsString());
        System.out.println("Delay fixed in the stream (relative) IN MS AS String === " + jMetaDataGeneral.getDelayAsString());
    }

    /**
     * Test getDelayAsBoolean() method.
     */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsBoolean());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Boolean === " + jMetaDataGeneral.getDelayAsBoolean());
    }

    /**
     * Test getDelayAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS BigInteger === " + jMetaDataGeneral.getDelayAsBigInteger());
    }

    /**
     * Test getDelayAsURL() method.
     */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayAsURL());
        System.out.println("Delay fixed in the stream (relative) IN MS AS URL === " + jMetaDataGeneral.getDelayAsURL());
    }

    /**
     * Test getEncodedApplicationUrlAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Integer === " + jMetaDataGeneral.getEncodedApplicationUrlAsInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Long === " + jMetaDataGeneral.getEncodedApplicationUrlAsLong());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationUrlAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationUrlAsLocalTime());
    }

    /**
     * Test getEncodedApplicationUrlAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS String === " + jMetaDataGeneral.getEncodedApplicationUrlAsString());
    }

    /**
     * Test getEncodedApplicationUrlAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Boolean === " + jMetaDataGeneral.getEncodedApplicationUrlAsBoolean());
    }

    /**
     * Test getEncodedApplicationUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationUrlAsBigInteger());
    }

    /**
     * Test getEncodedApplicationUrlAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationUrlAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS URL === " + jMetaDataGeneral.getEncodedApplicationUrlAsURL());
    }

    /**
     * Test getCoverMimeAsInteger() method.
     */
    @Test
    public void subTestGetCoverMimeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsInteger());
        System.out.println("Cover_Mime AS Integer === " + jMetaDataGeneral.getCoverMimeAsInteger());
    }

    /**
     * Test getCoverMimeAsLong() method.
     */
    @Test
    public void subTestGetCoverMimeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsLong());
        System.out.println("Cover_Mime AS Long === " + jMetaDataGeneral.getCoverMimeAsLong());
    }

    /**
     * Test getCoverMimeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverMimeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsLocalDateTime());
        System.out.println("Cover_Mime AS LocalDateTime === " + jMetaDataGeneral.getCoverMimeAsLocalDateTime());
    }

    /**
     * Test getCoverMimeAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverMimeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsLocalTime());
        System.out.println("Cover_Mime AS LocalTime === " + jMetaDataGeneral.getCoverMimeAsLocalTime());
    }

    /**
     * Test getCoverMimeAsString() method.
     */
    @Test
    public void subTestGetCoverMimeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsString());
        System.out.println("Cover_Mime AS String === " + jMetaDataGeneral.getCoverMimeAsString());
    }

    /**
     * Test getCoverMimeAsBoolean() method.
     */
    @Test
    public void subTestGetCoverMimeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsBoolean());
        System.out.println("Cover_Mime AS Boolean === " + jMetaDataGeneral.getCoverMimeAsBoolean());
    }

    /**
     * Test getCoverMimeAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverMimeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsBigInteger());
        System.out.println("Cover_Mime AS BigInteger === " + jMetaDataGeneral.getCoverMimeAsBigInteger());
    }

    /**
     * Test getCoverMimeAsURL() method.
     */
    @Test
    public void subTestGetCoverMimeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverMimeAsURL());
        System.out.println("Cover_Mime AS URL === " + jMetaDataGeneral.getCoverMimeAsURL());
    }

    /**
     * Test getDataSizeAsInteger() method.
     */
    @Test
    public void subTestGetDataSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsInteger());
        System.out.println("DataSize AS Integer === " + jMetaDataGeneral.getDataSizeAsInteger());
    }

    /**
     * Test getDataSizeAsLong() method.
     */
    @Test
    public void subTestGetDataSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsLong());
        System.out.println("DataSize AS Long === " + jMetaDataGeneral.getDataSizeAsLong());
    }

    /**
     * Test getDataSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDataSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsLocalDateTime());
        System.out.println("DataSize AS LocalDateTime === " + jMetaDataGeneral.getDataSizeAsLocalDateTime());
    }

    /**
     * Test getDataSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetDataSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsLocalTime());
        System.out.println("DataSize AS LocalTime === " + jMetaDataGeneral.getDataSizeAsLocalTime());
    }

    /**
     * Test getDataSizeAsString() method.
     */
    @Test
    public void subTestGetDataSizeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsString());
        System.out.println("DataSize AS String === " + jMetaDataGeneral.getDataSizeAsString());
    }

    /**
     * Test getDataSizeAsBoolean() method.
     */
    @Test
    public void subTestGetDataSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsBoolean());
        System.out.println("DataSize AS Boolean === " + jMetaDataGeneral.getDataSizeAsBoolean());
    }

    /**
     * Test getDataSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetDataSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsBigInteger());
        System.out.println("DataSize AS BigInteger === " + jMetaDataGeneral.getDataSizeAsBigInteger());
    }

    /**
     * Test getDataSizeAsURL() method.
     */
    @Test
    public void subTestGetDataSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDataSizeAsURL());
        System.out.println("DataSize AS URL === " + jMetaDataGeneral.getDataSizeAsURL());
    }

    /**
     * Test getEncodedLibraryAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsInteger());
        System.out.println("Software used to create the file AS Integer === " + jMetaDataGeneral.getEncodedLibraryAsInteger());
    }

    /**
     * Test getEncodedLibraryAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsLong());
        System.out.println("Software used to create the file AS Long === " + jMetaDataGeneral.getEncodedLibraryAsLong());
    }

    /**
     * Test getEncodedLibraryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsLocalDateTime());
        System.out.println("Software used to create the file AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsLocalTime());
        System.out.println("Software used to create the file AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryAsLocalTime());
    }

    /**
     * Test getEncodedLibraryAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsString());
        System.out.println("Software used to create the file AS String === " + jMetaDataGeneral.getEncodedLibraryAsString());
    }

    /**
     * Test getEncodedLibraryAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsBoolean());
        System.out.println("Software used to create the file AS Boolean === " + jMetaDataGeneral.getEncodedLibraryAsBoolean());
    }

    /**
     * Test getEncodedLibraryAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsBigInteger());
        System.out.println("Software used to create the file AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryAsBigInteger());
    }

    /**
     * Test getEncodedLibraryAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryAsURL());
        System.out.println("Software used to create the file AS URL === " + jMetaDataGeneral.getEncodedLibraryAsURL());
    }

    /**
     * Test getPartPositionAsInteger() method.
     */
    @Test
    public void subTestGetPartPositionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsInteger());
        System.out.println("Number of the part AS Integer === " + jMetaDataGeneral.getPartPositionAsInteger());
    }

    /**
     * Test getPartPositionAsLong() method.
     */
    @Test
    public void subTestGetPartPositionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsLong());
        System.out.println("Number of the part AS Long === " + jMetaDataGeneral.getPartPositionAsLong());
    }

    /**
     * Test getPartPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPartPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsLocalDateTime());
        System.out.println("Number of the part AS LocalDateTime === " + jMetaDataGeneral.getPartPositionAsLocalDateTime());
    }

    /**
     * Test getPartPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetPartPositionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsLocalTime());
        System.out.println("Number of the part AS LocalTime === " + jMetaDataGeneral.getPartPositionAsLocalTime());
    }

    /**
     * Test getPartPositionAsString() method.
     */
    @Test
    public void subTestGetPartPositionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsString());
        System.out.println("Number of the part AS String === " + jMetaDataGeneral.getPartPositionAsString());
    }

    /**
     * Test getPartPositionAsBoolean() method.
     */
    @Test
    public void subTestGetPartPositionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsBoolean());
        System.out.println("Number of the part AS Boolean === " + jMetaDataGeneral.getPartPositionAsBoolean());
    }

    /**
     * Test getPartPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetPartPositionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsBigInteger());
        System.out.println("Number of the part AS BigInteger === " + jMetaDataGeneral.getPartPositionAsBigInteger());
    }

    /**
     * Test getPartPositionAsURL() method.
     */
    @Test
    public void subTestGetPartPositionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPartPositionAsURL());
        System.out.println("Number of the part AS URL === " + jMetaDataGeneral.getPartPositionAsURL());
    }

    /**
     * Test getCompleteNameLastAsInteger() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsInteger());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getCompleteNameLastAsInteger());
    }

    /**
     * Test getCompleteNameLastAsLong() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsLong());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getCompleteNameLastAsLong());
    }

    /**
     * Test getCompleteNameLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsLocalDateTime());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getCompleteNameLastAsLocalDateTime());
    }

    /**
     * Test getCompleteNameLastAsLocalTime() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsLocalTime());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getCompleteNameLastAsLocalTime());
    }

    /**
     * Test getCompleteNameLastAsString() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsString());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getCompleteNameLastAsString());
    }

    /**
     * Test getCompleteNameLastAsBoolean() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsBoolean());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getCompleteNameLastAsBoolean());
    }

    /**
     * Test getCompleteNameLastAsBigInteger() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsBigInteger());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getCompleteNameLastAsBigInteger());
    }

    /**
     * Test getCompleteNameLastAsURL() method.
     */
    @Test
    public void subTestGetCompleteNameLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameLastAsURL());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getCompleteNameLastAsURL());
    }

    /**
     * Test getLyricsAsInteger() method.
     */
    @Test
    public void subTestGetLyricsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsInteger());
        System.out.println("Text of a song AS Integer === " + jMetaDataGeneral.getLyricsAsInteger());
    }

    /**
     * Test getLyricsAsLong() method.
     */
    @Test
    public void subTestGetLyricsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsLong());
        System.out.println("Text of a song AS Long === " + jMetaDataGeneral.getLyricsAsLong());
    }

    /**
     * Test getLyricsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLyricsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsLocalDateTime());
        System.out.println("Text of a song AS LocalDateTime === " + jMetaDataGeneral.getLyricsAsLocalDateTime());
    }

    /**
     * Test getLyricsAsLocalTime() method.
     */
    @Test
    public void subTestGetLyricsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsLocalTime());
        System.out.println("Text of a song AS LocalTime === " + jMetaDataGeneral.getLyricsAsLocalTime());
    }

    /**
     * Test getLyricsAsString() method.
     */
    @Test
    public void subTestGetLyricsAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsString());
        System.out.println("Text of a song AS String === " + jMetaDataGeneral.getLyricsAsString());
    }

    /**
     * Test getLyricsAsBoolean() method.
     */
    @Test
    public void subTestGetLyricsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsBoolean());
        System.out.println("Text of a song AS Boolean === " + jMetaDataGeneral.getLyricsAsBoolean());
    }

    /**
     * Test getLyricsAsBigInteger() method.
     */
    @Test
    public void subTestGetLyricsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsBigInteger());
        System.out.println("Text of a song AS BigInteger === " + jMetaDataGeneral.getLyricsAsBigInteger());
    }

    /**
     * Test getLyricsAsURL() method.
     */
    @Test
    public void subTestGetLyricsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricsAsURL());
        System.out.println("Text of a song AS URL === " + jMetaDataGeneral.getLyricsAsURL());
    }

    /**
     * Test getInternetMediaTypeAsInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Integer === " + jMetaDataGeneral.getInternetMediaTypeAsInteger());
    }

    /**
     * Test getInternetMediaTypeAsLong() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsLong());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Long === " + jMetaDataGeneral.getInternetMediaTypeAsLong());
    }

    /**
     * Test getInternetMediaTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsLocalDateTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalDateTime === " + jMetaDataGeneral.getInternetMediaTypeAsLocalDateTime());
    }

    /**
     * Test getInternetMediaTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsLocalTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalTime === " + jMetaDataGeneral.getInternetMediaTypeAsLocalTime());
    }

    /**
     * Test getInternetMediaTypeAsString() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsString());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS String === " + jMetaDataGeneral.getInternetMediaTypeAsString());
    }

    /**
     * Test getInternetMediaTypeAsBoolean() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsBoolean());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Boolean === " + jMetaDataGeneral.getInternetMediaTypeAsBoolean());
    }

    /**
     * Test getInternetMediaTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsBigInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS BigInteger === " + jMetaDataGeneral.getInternetMediaTypeAsBigInteger());
    }

    /**
     * Test getInternetMediaTypeAsURL() method.
     */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInternetMediaTypeAsURL());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS URL === " + jMetaDataGeneral.getInternetMediaTypeAsURL());
    }

    /**
     * Test getLawRatingAsInteger() method.
     */
    @Test
    public void subTestGetLawRatingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsInteger());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Integer === " + jMetaDataGeneral.getLawRatingAsInteger());
    }

    /**
     * Test getLawRatingAsLong() method.
     */
    @Test
    public void subTestGetLawRatingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsLong());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Long === " + jMetaDataGeneral.getLawRatingAsLong());
    }

    /**
     * Test getLawRatingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLawRatingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsLocalDateTime());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS LocalDateTime === " + jMetaDataGeneral.getLawRatingAsLocalDateTime());
    }

    /**
     * Test getLawRatingAsLocalTime() method.
     */
    @Test
    public void subTestGetLawRatingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsLocalTime());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS LocalTime === " + jMetaDataGeneral.getLawRatingAsLocalTime());
    }

    /**
     * Test getLawRatingAsString() method.
     */
    @Test
    public void subTestGetLawRatingAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsString());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS String === " + jMetaDataGeneral.getLawRatingAsString());
    }

    /**
     * Test getLawRatingAsBoolean() method.
     */
    @Test
    public void subTestGetLawRatingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsBoolean());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Boolean === " + jMetaDataGeneral.getLawRatingAsBoolean());
    }

    /**
     * Test getLawRatingAsBigInteger() method.
     */
    @Test
    public void subTestGetLawRatingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsBigInteger());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS BigInteger === " + jMetaDataGeneral.getLawRatingAsBigInteger());
    }

    /**
     * Test getLawRatingAsURL() method.
     */
    @Test
    public void subTestGetLawRatingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingAsURL());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS URL === " + jMetaDataGeneral.getLawRatingAsURL());
    }

    /**
     * Test getFrameRateDenAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsInteger());
        System.out.println("Frames per second, denominator AS Integer === " + jMetaDataGeneral.getFrameRateDenAsInteger());
    }

    /**
     * Test getFrameRateDenAsLong() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsLong());
        System.out.println("Frames per second, denominator AS Long === " + jMetaDataGeneral.getFrameRateDenAsLong());
    }

    /**
     * Test getFrameRateDenAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsLocalDateTime());
        System.out.println("Frames per second, denominator AS LocalDateTime === " + jMetaDataGeneral.getFrameRateDenAsLocalDateTime());
    }

    /**
     * Test getFrameRateDenAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsLocalTime());
        System.out.println("Frames per second, denominator AS LocalTime === " + jMetaDataGeneral.getFrameRateDenAsLocalTime());
    }

    /**
     * Test getFrameRateDenAsString() method.
     */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsString());
        System.out.println("Frames per second, denominator AS String === " + jMetaDataGeneral.getFrameRateDenAsString());
    }

    /**
     * Test getFrameRateDenAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsBoolean());
        System.out.println("Frames per second, denominator AS Boolean === " + jMetaDataGeneral.getFrameRateDenAsBoolean());
    }

    /**
     * Test getFrameRateDenAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsBigInteger());
        System.out.println("Frames per second, denominator AS BigInteger === " + jMetaDataGeneral.getFrameRateDenAsBigInteger());
    }

    /**
     * Test getFrameRateDenAsURL() method.
     */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateDenAsURL());
        System.out.println("Frames per second, denominator AS URL === " + jMetaDataGeneral.getFrameRateDenAsURL());
    }

    /**
     * Test getEncryptionMethodAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsInteger());
        System.out.println("Encryption_Method AS Integer === " + jMetaDataGeneral.getEncryptionMethodAsInteger());
    }

    /**
     * Test getEncryptionMethodAsLong() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsLong());
        System.out.println("Encryption_Method AS Long === " + jMetaDataGeneral.getEncryptionMethodAsLong());
    }

    /**
     * Test getEncryptionMethodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsLocalDateTime());
        System.out.println("Encryption_Method AS LocalDateTime === " + jMetaDataGeneral.getEncryptionMethodAsLocalDateTime());
    }

    /**
     * Test getEncryptionMethodAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsLocalTime());
        System.out.println("Encryption_Method AS LocalTime === " + jMetaDataGeneral.getEncryptionMethodAsLocalTime());
    }

    /**
     * Test getEncryptionMethodAsString() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsString());
        System.out.println("Encryption_Method AS String === " + jMetaDataGeneral.getEncryptionMethodAsString());
    }

    /**
     * Test getEncryptionMethodAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsBoolean());
        System.out.println("Encryption_Method AS Boolean === " + jMetaDataGeneral.getEncryptionMethodAsBoolean());
    }

    /**
     * Test getEncryptionMethodAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsBigInteger());
        System.out.println("Encryption_Method AS BigInteger === " + jMetaDataGeneral.getEncryptionMethodAsBigInteger());
    }

    /**
     * Test getEncryptionMethodAsURL() method.
     */
    @Test
    public void subTestGetEncryptionMethodAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionMethodAsURL());
        System.out.println("Encryption_Method AS URL === " + jMetaDataGeneral.getEncryptionMethodAsURL());
    }

    /**
     * Test getDirectorOfPhotographyAsInteger() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsInteger());
        System.out.println("The name of the director of photography, also known as cinematographer. AS Integer === " + jMetaDataGeneral.getDirectorOfPhotographyAsInteger());
    }

    /**
     * Test getDirectorOfPhotographyAsLong() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsLong());
        System.out.println("The name of the director of photography, also known as cinematographer. AS Long === " + jMetaDataGeneral.getDirectorOfPhotographyAsLong());
    }

    /**
     * Test getDirectorOfPhotographyAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsLocalDateTime());
        System.out.println("The name of the director of photography, also known as cinematographer. AS LocalDateTime === " + jMetaDataGeneral.getDirectorOfPhotographyAsLocalDateTime());
    }

    /**
     * Test getDirectorOfPhotographyAsLocalTime() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsLocalTime());
        System.out.println("The name of the director of photography, also known as cinematographer. AS LocalTime === " + jMetaDataGeneral.getDirectorOfPhotographyAsLocalTime());
    }

    /**
     * Test getDirectorOfPhotographyAsString() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsString());
        System.out.println("The name of the director of photography, also known as cinematographer. AS String === " + jMetaDataGeneral.getDirectorOfPhotographyAsString());
    }

    /**
     * Test getDirectorOfPhotographyAsBoolean() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsBoolean());
        System.out.println("The name of the director of photography, also known as cinematographer. AS Boolean === " + jMetaDataGeneral.getDirectorOfPhotographyAsBoolean());
    }

    /**
     * Test getDirectorOfPhotographyAsBigInteger() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsBigInteger());
        System.out.println("The name of the director of photography, also known as cinematographer. AS BigInteger === " + jMetaDataGeneral.getDirectorOfPhotographyAsBigInteger());
    }

    /**
     * Test getDirectorOfPhotographyAsURL() method.
     */
    @Test
    public void subTestGetDirectorOfPhotographyAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorOfPhotographyAsURL());
        System.out.println("The name of the director of photography, also known as cinematographer. AS URL === " + jMetaDataGeneral.getDirectorOfPhotographyAsURL());
    }

    /**
     * Test getAudioFormatListAsInteger() method.
     */
    @Test
    public void subTestGetAudioFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsInteger());
        System.out.println("Audio Codecs in this file,separated by / AS Integer === " + jMetaDataGeneral.getAudioFormatListAsInteger());
    }

    /**
     * Test getAudioFormatListAsLong() method.
     */
    @Test
    public void subTestGetAudioFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsLong());
        System.out.println("Audio Codecs in this file,separated by / AS Long === " + jMetaDataGeneral.getAudioFormatListAsLong());
    }

    /**
     * Test getAudioFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsLocalDateTime());
        System.out.println("Audio Codecs in this file,separated by / AS LocalDateTime === " + jMetaDataGeneral.getAudioFormatListAsLocalDateTime());
    }

    /**
     * Test getAudioFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsLocalTime());
        System.out.println("Audio Codecs in this file,separated by / AS LocalTime === " + jMetaDataGeneral.getAudioFormatListAsLocalTime());
    }

    /**
     * Test getAudioFormatListAsString() method.
     */
    @Test
    public void subTestGetAudioFormatListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsString());
        System.out.println("Audio Codecs in this file,separated by / AS String === " + jMetaDataGeneral.getAudioFormatListAsString());
    }

    /**
     * Test getAudioFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetAudioFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsBoolean());
        System.out.println("Audio Codecs in this file,separated by / AS Boolean === " + jMetaDataGeneral.getAudioFormatListAsBoolean());
    }

    /**
     * Test getAudioFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsBigInteger());
        System.out.println("Audio Codecs in this file,separated by / AS BigInteger === " + jMetaDataGeneral.getAudioFormatListAsBigInteger());
    }

    /**
     * Test getAudioFormatListAsURL() method.
     */
    @Test
    public void subTestGetAudioFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatListAsURL());
        System.out.println("Audio Codecs in this file,separated by / AS URL === " + jMetaDataGeneral.getAudioFormatListAsURL());
    }

    /**
     * Test getOtherFormatListAsInteger() method.
     */
    @Test
    public void subTestGetOtherFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsInteger());
        System.out.println("Other formats in this file, separated by / AS Integer === " + jMetaDataGeneral.getOtherFormatListAsInteger());
    }

    /**
     * Test getOtherFormatListAsLong() method.
     */
    @Test
    public void subTestGetOtherFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsLong());
        System.out.println("Other formats in this file, separated by / AS Long === " + jMetaDataGeneral.getOtherFormatListAsLong());
    }

    /**
     * Test getOtherFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsLocalDateTime());
        System.out.println("Other formats in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getOtherFormatListAsLocalDateTime());
    }

    /**
     * Test getOtherFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsLocalTime());
        System.out.println("Other formats in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getOtherFormatListAsLocalTime());
    }

    /**
     * Test getOtherFormatListAsString() method.
     */
    @Test
    public void subTestGetOtherFormatListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsString());
        System.out.println("Other formats in this file, separated by / AS String === " + jMetaDataGeneral.getOtherFormatListAsString());
    }

    /**
     * Test getOtherFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetOtherFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsBoolean());
        System.out.println("Other formats in this file, separated by / AS Boolean === " + jMetaDataGeneral.getOtherFormatListAsBoolean());
    }

    /**
     * Test getOtherFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsBigInteger());
        System.out.println("Other formats in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getOtherFormatListAsBigInteger());
    }

    /**
     * Test getOtherFormatListAsURL() method.
     */
    @Test
    public void subTestGetOtherFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherFormatListAsURL());
        System.out.println("Other formats in this file, separated by / AS URL === " + jMetaDataGeneral.getOtherFormatListAsURL());
    }

    /**
     * Test getArrangerAsInteger() method.
     */
    @Test
    public void subTestGetArrangerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsInteger());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS Integer === " + jMetaDataGeneral.getArrangerAsInteger());
    }

    /**
     * Test getArrangerAsLong() method.
     */
    @Test
    public void subTestGetArrangerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsLong());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS Long === " + jMetaDataGeneral.getArrangerAsLong());
    }

    /**
     * Test getArrangerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetArrangerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsLocalDateTime());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS LocalDateTime === " + jMetaDataGeneral.getArrangerAsLocalDateTime());
    }

    /**
     * Test getArrangerAsLocalTime() method.
     */
    @Test
    public void subTestGetArrangerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsLocalTime());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS LocalTime === " + jMetaDataGeneral.getArrangerAsLocalTime());
    }

    /**
     * Test getArrangerAsString() method.
     */
    @Test
    public void subTestGetArrangerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsString());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS String === " + jMetaDataGeneral.getArrangerAsString());
    }

    /**
     * Test getArrangerAsBoolean() method.
     */
    @Test
    public void subTestGetArrangerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsBoolean());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS Boolean === " + jMetaDataGeneral.getArrangerAsBoolean());
    }

    /**
     * Test getArrangerAsBigInteger() method.
     */
    @Test
    public void subTestGetArrangerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsBigInteger());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS BigInteger === " + jMetaDataGeneral.getArrangerAsBigInteger());
    }

    /**
     * Test getArrangerAsURL() method.
     */
    @Test
    public void subTestGetArrangerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArrangerAsURL());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS URL === " + jMetaDataGeneral.getArrangerAsURL());
    }

    /**
     * Test getArtDirectorAsInteger() method.
     */
    @Test
    public void subTestGetArtDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsInteger());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS Integer === " + jMetaDataGeneral.getArtDirectorAsInteger());
    }

    /**
     * Test getArtDirectorAsLong() method.
     */
    @Test
    public void subTestGetArtDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsLong());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS Long === " + jMetaDataGeneral.getArtDirectorAsLong());
    }

    /**
     * Test getArtDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetArtDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsLocalDateTime());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS LocalDateTime === " + jMetaDataGeneral.getArtDirectorAsLocalDateTime());
    }

    /**
     * Test getArtDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetArtDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsLocalTime());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS LocalTime === " + jMetaDataGeneral.getArtDirectorAsLocalTime());
    }

    /**
     * Test getArtDirectorAsString() method.
     */
    @Test
    public void subTestGetArtDirectorAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsString());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS String === " + jMetaDataGeneral.getArtDirectorAsString());
    }

    /**
     * Test getArtDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetArtDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsBoolean());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS Boolean === " + jMetaDataGeneral.getArtDirectorAsBoolean());
    }

    /**
     * Test getArtDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetArtDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsBigInteger());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS BigInteger === " + jMetaDataGeneral.getArtDirectorAsBigInteger());
    }

    /**
     * Test getArtDirectorAsURL() method.
     */
    @Test
    public void subTestGetArtDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArtDirectorAsURL());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS URL === " + jMetaDataGeneral.getArtDirectorAsURL());
    }

    /**
     * Test getSeasonPositionAsInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsInteger());
        System.out.println("Number of the Season AS Integer === " + jMetaDataGeneral.getSeasonPositionAsInteger());
    }

    /**
     * Test getSeasonPositionAsLong() method.
     */
    @Test
    public void subTestGetSeasonPositionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsLong());
        System.out.println("Number of the Season AS Long === " + jMetaDataGeneral.getSeasonPositionAsLong());
    }

    /**
     * Test getSeasonPositionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSeasonPositionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsLocalDateTime());
        System.out.println("Number of the Season AS LocalDateTime === " + jMetaDataGeneral.getSeasonPositionAsLocalDateTime());
    }

    /**
     * Test getSeasonPositionAsLocalTime() method.
     */
    @Test
    public void subTestGetSeasonPositionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsLocalTime());
        System.out.println("Number of the Season AS LocalTime === " + jMetaDataGeneral.getSeasonPositionAsLocalTime());
    }

    /**
     * Test getSeasonPositionAsString() method.
     */
    @Test
    public void subTestGetSeasonPositionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsString());
        System.out.println("Number of the Season AS String === " + jMetaDataGeneral.getSeasonPositionAsString());
    }

    /**
     * Test getSeasonPositionAsBoolean() method.
     */
    @Test
    public void subTestGetSeasonPositionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsBoolean());
        System.out.println("Number of the Season AS Boolean === " + jMetaDataGeneral.getSeasonPositionAsBoolean());
    }

    /**
     * Test getSeasonPositionAsBigInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsBigInteger());
        System.out.println("Number of the Season AS BigInteger === " + jMetaDataGeneral.getSeasonPositionAsBigInteger());
    }

    /**
     * Test getSeasonPositionAsURL() method.
     */
    @Test
    public void subTestGetSeasonPositionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionAsURL());
        System.out.println("Number of the Season AS URL === " + jMetaDataGeneral.getSeasonPositionAsURL());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsInteger());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS Integer === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsInteger());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLong());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS Long === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsLong());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalDateTime());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalTime());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsString());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS String === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsString());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsBoolean());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsBoolean());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsBigInteger());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormNumColorsAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormNumColorsAsURL());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS URL === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsURL());
    }

    /**
     * Test getDurationAsInteger() method.
     */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsInteger());
        System.out.println("Play time of the stream in ms AS Integer === " + jMetaDataGeneral.getDurationAsInteger());
    }

    /**
     * Test getDurationAsLong() method.
     */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsLong());
        System.out.println("Play time of the stream in ms AS Long === " + jMetaDataGeneral.getDurationAsLong());
    }

    /**
     * Test getDurationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsLocalDateTime());
        System.out.println("Play time of the stream in ms AS LocalDateTime === " + jMetaDataGeneral.getDurationAsLocalDateTime());
    }

    /**
     * Test getDurationAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsLocalTime());
        System.out.println("Play time of the stream in ms AS LocalTime === " + jMetaDataGeneral.getDurationAsLocalTime());
    }

    /**
     * Test getDurationAsString() method.
     */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsString());
        System.out.println("Play time of the stream in ms AS String === " + jMetaDataGeneral.getDurationAsString());
    }

    /**
     * Test getDurationAsBoolean() method.
     */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsBoolean());
        System.out.println("Play time of the stream in ms AS Boolean === " + jMetaDataGeneral.getDurationAsBoolean());
    }

    /**
     * Test getDurationAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsBigInteger());
        System.out.println("Play time of the stream in ms AS BigInteger === " + jMetaDataGeneral.getDurationAsBigInteger());
    }

    /**
     * Test getDurationAsURL() method.
     */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationAsURL());
        System.out.println("Play time of the stream in ms AS URL === " + jMetaDataGeneral.getDurationAsURL());
    }

    /**
     * Test getComposerNationalityAsInteger() method.
     */
    @Test
    public void subTestGetComposerNationalityAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsInteger());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS Integer === " + jMetaDataGeneral.getComposerNationalityAsInteger());
    }

    /**
     * Test getComposerNationalityAsLong() method.
     */
    @Test
    public void subTestGetComposerNationalityAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsLong());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS Long === " + jMetaDataGeneral.getComposerNationalityAsLong());
    }

    /**
     * Test getComposerNationalityAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComposerNationalityAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsLocalDateTime());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS LocalDateTime === " + jMetaDataGeneral.getComposerNationalityAsLocalDateTime());
    }

    /**
     * Test getComposerNationalityAsLocalTime() method.
     */
    @Test
    public void subTestGetComposerNationalityAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsLocalTime());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS LocalTime === " + jMetaDataGeneral.getComposerNationalityAsLocalTime());
    }

    /**
     * Test getComposerNationalityAsString() method.
     */
    @Test
    public void subTestGetComposerNationalityAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsString());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS String === " + jMetaDataGeneral.getComposerNationalityAsString());
    }

    /**
     * Test getComposerNationalityAsBoolean() method.
     */
    @Test
    public void subTestGetComposerNationalityAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsBoolean());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS Boolean === " + jMetaDataGeneral.getComposerNationalityAsBoolean());
    }

    /**
     * Test getComposerNationalityAsBigInteger() method.
     */
    @Test
    public void subTestGetComposerNationalityAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsBigInteger());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS BigInteger === " + jMetaDataGeneral.getComposerNationalityAsBigInteger());
    }

    /**
     * Test getComposerNationalityAsURL() method.
     */
    @Test
    public void subTestGetComposerNationalityAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerNationalityAsURL());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS URL === " + jMetaDataGeneral.getComposerNationalityAsURL());
    }

    /**
     * Test getCodecIDHintAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsInteger());
        System.out.println("A hint/popular name for this codec AS Integer === " + jMetaDataGeneral.getCodecIDHintAsInteger());
    }

    /**
     * Test getCodecIDHintAsLong() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsLong());
        System.out.println("A hint/popular name for this codec AS Long === " + jMetaDataGeneral.getCodecIDHintAsLong());
    }

    /**
     * Test getCodecIDHintAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsLocalDateTime());
        System.out.println("A hint/popular name for this codec AS LocalDateTime === " + jMetaDataGeneral.getCodecIDHintAsLocalDateTime());
    }

    /**
     * Test getCodecIDHintAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsLocalTime());
        System.out.println("A hint/popular name for this codec AS LocalTime === " + jMetaDataGeneral.getCodecIDHintAsLocalTime());
    }

    /**
     * Test getCodecIDHintAsString() method.
     */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsString());
        System.out.println("A hint/popular name for this codec AS String === " + jMetaDataGeneral.getCodecIDHintAsString());
    }

    /**
     * Test getCodecIDHintAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsBoolean());
        System.out.println("A hint/popular name for this codec AS Boolean === " + jMetaDataGeneral.getCodecIDHintAsBoolean());
    }

    /**
     * Test getCodecIDHintAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsBigInteger());
        System.out.println("A hint/popular name for this codec AS BigInteger === " + jMetaDataGeneral.getCodecIDHintAsBigInteger());
    }

    /**
     * Test getCodecIDHintAsURL() method.
     */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDHintAsURL());
        System.out.println("A hint/popular name for this codec AS URL === " + jMetaDataGeneral.getCodecIDHintAsURL());
    }

    /**
     * Test getServiceUrlAsInteger() method.
     */
    @Test
    public void subTestGetServiceUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsInteger());
        System.out.println("Service/Url AS Integer === " + jMetaDataGeneral.getServiceUrlAsInteger());
    }

    /**
     * Test getServiceUrlAsLong() method.
     */
    @Test
    public void subTestGetServiceUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsLong());
        System.out.println("Service/Url AS Long === " + jMetaDataGeneral.getServiceUrlAsLong());
    }

    /**
     * Test getServiceUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsLocalDateTime());
        System.out.println("Service/Url AS LocalDateTime === " + jMetaDataGeneral.getServiceUrlAsLocalDateTime());
    }

    /**
     * Test getServiceUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsLocalTime());
        System.out.println("Service/Url AS LocalTime === " + jMetaDataGeneral.getServiceUrlAsLocalTime());
    }

    /**
     * Test getServiceUrlAsString() method.
     */
    @Test
    public void subTestGetServiceUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsString());
        System.out.println("Service/Url AS String === " + jMetaDataGeneral.getServiceUrlAsString());
    }

    /**
     * Test getServiceUrlAsBoolean() method.
     */
    @Test
    public void subTestGetServiceUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsBoolean());
        System.out.println("Service/Url AS Boolean === " + jMetaDataGeneral.getServiceUrlAsBoolean());
    }

    /**
     * Test getServiceUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsBigInteger());
        System.out.println("Service/Url AS BigInteger === " + jMetaDataGeneral.getServiceUrlAsBigInteger());
    }

    /**
     * Test getServiceUrlAsURL() method.
     */
    @Test
    public void subTestGetServiceUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceUrlAsURL());
        System.out.println("Service/Url AS URL === " + jMetaDataGeneral.getServiceUrlAsURL());
    }

    /**
     * Test getEncodedByAsInteger() method.
     */
    @Test
    public void subTestGetEncodedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsInteger());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS Integer === " + jMetaDataGeneral.getEncodedByAsInteger());
    }

    /**
     * Test getEncodedByAsLong() method.
     */
    @Test
    public void subTestGetEncodedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsLong());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS Long === " + jMetaDataGeneral.getEncodedByAsLong());
    }

    /**
     * Test getEncodedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsLocalDateTime());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS LocalDateTime === " + jMetaDataGeneral.getEncodedByAsLocalDateTime());
    }

    /**
     * Test getEncodedByAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsLocalTime());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS LocalTime === " + jMetaDataGeneral.getEncodedByAsLocalTime());
    }

    /**
     * Test getEncodedByAsString() method.
     */
    @Test
    public void subTestGetEncodedByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsString());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS String === " + jMetaDataGeneral.getEncodedByAsString());
    }

    /**
     * Test getEncodedByAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsBoolean());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS Boolean === " + jMetaDataGeneral.getEncodedByAsBoolean());
    }

    /**
     * Test getEncodedByAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsBigInteger());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS BigInteger === " + jMetaDataGeneral.getEncodedByAsBigInteger());
    }

    /**
     * Test getEncodedByAsURL() method.
     */
    @Test
    public void subTestGetEncodedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedByAsURL());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS URL === " + jMetaDataGeneral.getEncodedByAsURL());
    }

    /**
     * Test getEncodedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Integer === " + jMetaDataGeneral.getEncodedApplicationAsInteger());
    }

    /**
     * Test getEncodedApplicationAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Long === " + jMetaDataGeneral.getEncodedApplicationAsLong());
    }

    /**
     * Test getEncodedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationAsLocalTime());
    }

    /**
     * Test getEncodedApplicationAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS String === " + jMetaDataGeneral.getEncodedApplicationAsString());
    }

    /**
     * Test getEncodedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Boolean === " + jMetaDataGeneral.getEncodedApplicationAsBoolean());
    }

    /**
     * Test getEncodedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationAsBigInteger());
    }

    /**
     * Test getEncodedApplicationAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS URL === " + jMetaDataGeneral.getEncodedApplicationAsURL());
    }

    /**
     * Test getServiceNameAsInteger() method.
     */
    @Test
    public void subTestGetServiceNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsInteger());
        System.out.println("ServiceName AS Integer === " + jMetaDataGeneral.getServiceNameAsInteger());
    }

    /**
     * Test getServiceNameAsLong() method.
     */
    @Test
    public void subTestGetServiceNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsLong());
        System.out.println("ServiceName AS Long === " + jMetaDataGeneral.getServiceNameAsLong());
    }

    /**
     * Test getServiceNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsLocalDateTime());
        System.out.println("ServiceName AS LocalDateTime === " + jMetaDataGeneral.getServiceNameAsLocalDateTime());
    }

    /**
     * Test getServiceNameAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsLocalTime());
        System.out.println("ServiceName AS LocalTime === " + jMetaDataGeneral.getServiceNameAsLocalTime());
    }

    /**
     * Test getServiceNameAsString() method.
     */
    @Test
    public void subTestGetServiceNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsString());
        System.out.println("ServiceName AS String === " + jMetaDataGeneral.getServiceNameAsString());
    }

    /**
     * Test getServiceNameAsBoolean() method.
     */
    @Test
    public void subTestGetServiceNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsBoolean());
        System.out.println("ServiceName AS Boolean === " + jMetaDataGeneral.getServiceNameAsBoolean());
    }

    /**
     * Test getServiceNameAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsBigInteger());
        System.out.println("ServiceName AS BigInteger === " + jMetaDataGeneral.getServiceNameAsBigInteger());
    }

    /**
     * Test getServiceNameAsURL() method.
     */
    @Test
    public void subTestGetServiceNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceNameAsURL());
        System.out.println("ServiceName AS URL === " + jMetaDataGeneral.getServiceNameAsURL());
    }

    /**
     * Test getServiceProviderAsInteger() method.
     */
    @Test
    public void subTestGetServiceProviderAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsInteger());
        System.out.println("ServiceProvider AS Integer === " + jMetaDataGeneral.getServiceProviderAsInteger());
    }

    /**
     * Test getServiceProviderAsLong() method.
     */
    @Test
    public void subTestGetServiceProviderAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsLong());
        System.out.println("ServiceProvider AS Long === " + jMetaDataGeneral.getServiceProviderAsLong());
    }

    /**
     * Test getServiceProviderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceProviderAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsLocalDateTime());
        System.out.println("ServiceProvider AS LocalDateTime === " + jMetaDataGeneral.getServiceProviderAsLocalDateTime());
    }

    /**
     * Test getServiceProviderAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceProviderAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsLocalTime());
        System.out.println("ServiceProvider AS LocalTime === " + jMetaDataGeneral.getServiceProviderAsLocalTime());
    }

    /**
     * Test getServiceProviderAsString() method.
     */
    @Test
    public void subTestGetServiceProviderAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsString());
        System.out.println("ServiceProvider AS String === " + jMetaDataGeneral.getServiceProviderAsString());
    }

    /**
     * Test getServiceProviderAsBoolean() method.
     */
    @Test
    public void subTestGetServiceProviderAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsBoolean());
        System.out.println("ServiceProvider AS Boolean === " + jMetaDataGeneral.getServiceProviderAsBoolean());
    }

    /**
     * Test getServiceProviderAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceProviderAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsBigInteger());
        System.out.println("ServiceProvider AS BigInteger === " + jMetaDataGeneral.getServiceProviderAsBigInteger());
    }

    /**
     * Test getServiceProviderAsURL() method.
     */
    @Test
    public void subTestGetServiceProviderAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderAsURL());
        System.out.println("ServiceProvider AS URL === " + jMetaDataGeneral.getServiceProviderAsURL());
    }

    /**
     * Test getImageLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetImageLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsInteger());
        System.out.println("Image languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getImageLanguageListAsInteger());
    }

    /**
     * Test getImageLanguageListAsLong() method.
     */
    @Test
    public void subTestGetImageLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsLong());
        System.out.println("Image languages in this file, separated by / AS Long === " + jMetaDataGeneral.getImageLanguageListAsLong());
    }

    /**
     * Test getImageLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsLocalDateTime());
        System.out.println("Image languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getImageLanguageListAsLocalDateTime());
    }

    /**
     * Test getImageLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetImageLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsLocalTime());
        System.out.println("Image languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getImageLanguageListAsLocalTime());
    }

    /**
     * Test getImageLanguageListAsString() method.
     */
    @Test
    public void subTestGetImageLanguageListAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsString());
        System.out.println("Image languages in this file, separated by / AS String === " + jMetaDataGeneral.getImageLanguageListAsString());
    }

    /**
     * Test getImageLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetImageLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsBoolean());
        System.out.println("Image languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getImageLanguageListAsBoolean());
    }

    /**
     * Test getImageLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetImageLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsBigInteger());
        System.out.println("Image languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getImageLanguageListAsBigInteger());
    }

    /**
     * Test getImageLanguageListAsURL() method.
     */
    @Test
    public void subTestGetImageLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageLanguageListAsURL());
        System.out.println("Image languages in this file, separated by / AS URL === " + jMetaDataGeneral.getImageLanguageListAsURL());
    }

    /**
     * Test getStreamSizeString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(Integer.valueOf(858), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsInteger());
        System.out.println("StreamSize/String2 AS Integer === " + jMetaDataGeneral.getStreamSizeString2AsInteger());
    }

    /**
     * Test getStreamSizeString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsLong());
        System.out.println("StreamSize/String2 AS Long === " + jMetaDataGeneral.getStreamSizeString2AsLong());
    }

    /**
     * Test getStreamSizeString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsLocalDateTime());
        System.out.println("StreamSize/String2 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsLocalTime());
        System.out.println("StreamSize/String2 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString2AsLocalTime());
    }

    /**
     * Test getStreamSizeString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsString());
        System.out.println("StreamSize/String2 AS String === " + jMetaDataGeneral.getStreamSizeString2AsString());
    }

    /**
     * Test getStreamSizeString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsBoolean());
        System.out.println("StreamSize/String2 AS Boolean === " + jMetaDataGeneral.getStreamSizeString2AsBoolean());
    }

    /**
     * Test getStreamSizeString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsBigInteger());
        System.out.println("StreamSize/String2 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString2AsBigInteger());
    }

    /**
     * Test getStreamSizeString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString2AsURL());
        System.out.println("StreamSize/String2 AS URL === " + jMetaDataGeneral.getStreamSizeString2AsURL());
    }

    /**
     * Test getConductorAsInteger() method.
     */
    @Test
    public void subTestGetConductorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsInteger());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS Integer === " + jMetaDataGeneral.getConductorAsInteger());
    }

    /**
     * Test getConductorAsLong() method.
     */
    @Test
    public void subTestGetConductorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsLong());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS Long === " + jMetaDataGeneral.getConductorAsLong());
    }

    /**
     * Test getConductorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetConductorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsLocalDateTime());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS LocalDateTime === " + jMetaDataGeneral.getConductorAsLocalDateTime());
    }

    /**
     * Test getConductorAsLocalTime() method.
     */
    @Test
    public void subTestGetConductorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsLocalTime());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS LocalTime === " + jMetaDataGeneral.getConductorAsLocalTime());
    }

    /**
     * Test getConductorAsString() method.
     */
    @Test
    public void subTestGetConductorAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsString());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS String === " + jMetaDataGeneral.getConductorAsString());
    }

    /**
     * Test getConductorAsBoolean() method.
     */
    @Test
    public void subTestGetConductorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsBoolean());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS Boolean === " + jMetaDataGeneral.getConductorAsBoolean());
    }

    /**
     * Test getConductorAsBigInteger() method.
     */
    @Test
    public void subTestGetConductorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsBigInteger());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS BigInteger === " + jMetaDataGeneral.getConductorAsBigInteger());
    }

    /**
     * Test getConductorAsURL() method.
     */
    @Test
    public void subTestGetConductorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getConductorAsURL());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS URL === " + jMetaDataGeneral.getConductorAsURL());
    }

    /**
     * Test getFileCreatedDateAsInteger() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsInteger());
        System.out.println("The time that the file was created on the file system AS Integer === " + jMetaDataGeneral.getFileCreatedDateAsInteger());
    }

    /**
     * Test getFileCreatedDateAsLong() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsLong());
        System.out.println("The time that the file was created on the file system AS Long === " + jMetaDataGeneral.getFileCreatedDateAsLong());
    }

    /**
     * Test getFileCreatedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsLocalDateTime() {
        assertEquals(DateTimeHelper.parseLocalDateTime("2017-05-10T10:36:38.816"), JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsLocalDateTime());
        System.out.println("The time that the file was created on the file system AS LocalDateTime === " + jMetaDataGeneral.getFileCreatedDateAsLocalDateTime());
    }

    /**
     * Test getFileCreatedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsLocalTime());
        System.out.println("The time that the file was created on the file system AS LocalTime === " + jMetaDataGeneral.getFileCreatedDateAsLocalTime());
    }

    /**
     * Test getFileCreatedDateAsString() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsString() {
        assertEquals("UTC 2017-05-10 10:36:38.816", JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsString());
        System.out.println("The time that the file was created on the file system AS String === " + jMetaDataGeneral.getFileCreatedDateAsString());
    }

    /**
     * Test getFileCreatedDateAsBoolean() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsBoolean());
        System.out.println("The time that the file was created on the file system AS Boolean === " + jMetaDataGeneral.getFileCreatedDateAsBoolean());
    }

    /**
     * Test getFileCreatedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsBigInteger());
        System.out.println("The time that the file was created on the file system AS BigInteger === " + jMetaDataGeneral.getFileCreatedDateAsBigInteger());
    }

    /**
     * Test getFileCreatedDateAsURL() method.
     */
    @Test
    public void subTestGetFileCreatedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateAsURL());
        System.out.println("The time that the file was created on the file system AS URL === " + jMetaDataGeneral.getFileCreatedDateAsURL());
    }

    /**
     * Test getArchivalLocationAsInteger() method.
     */
    @Test
    public void subTestGetArchivalLocationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsInteger());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS Integer === " + jMetaDataGeneral.getArchivalLocationAsInteger());
    }

    /**
     * Test getArchivalLocationAsLong() method.
     */
    @Test
    public void subTestGetArchivalLocationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsLong());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS Long === " + jMetaDataGeneral.getArchivalLocationAsLong());
    }

    /**
     * Test getArchivalLocationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetArchivalLocationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsLocalDateTime());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS LocalDateTime === " + jMetaDataGeneral.getArchivalLocationAsLocalDateTime());
    }

    /**
     * Test getArchivalLocationAsLocalTime() method.
     */
    @Test
    public void subTestGetArchivalLocationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsLocalTime());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS LocalTime === " + jMetaDataGeneral.getArchivalLocationAsLocalTime());
    }

    /**
     * Test getArchivalLocationAsString() method.
     */
    @Test
    public void subTestGetArchivalLocationAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsString());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS String === " + jMetaDataGeneral.getArchivalLocationAsString());
    }

    /**
     * Test getArchivalLocationAsBoolean() method.
     */
    @Test
    public void subTestGetArchivalLocationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsBoolean());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS Boolean === " + jMetaDataGeneral.getArchivalLocationAsBoolean());
    }

    /**
     * Test getArchivalLocationAsBigInteger() method.
     */
    @Test
    public void subTestGetArchivalLocationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsBigInteger());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS BigInteger === " + jMetaDataGeneral.getArchivalLocationAsBigInteger());
    }

    /**
     * Test getArchivalLocationAsURL() method.
     */
    @Test
    public void subTestGetArchivalLocationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getArchivalLocationAsURL());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS URL === " + jMetaDataGeneral.getArchivalLocationAsURL());
    }

    /**
     * Test getServiceProviderrUrlAsInteger() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsInteger());
        System.out.println("ServiceProviderr/Url AS Integer === " + jMetaDataGeneral.getServiceProviderrUrlAsInteger());
    }

    /**
     * Test getServiceProviderrUrlAsLong() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsLong());
        System.out.println("ServiceProviderr/Url AS Long === " + jMetaDataGeneral.getServiceProviderrUrlAsLong());
    }

    /**
     * Test getServiceProviderrUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsLocalDateTime());
        System.out.println("ServiceProviderr/Url AS LocalDateTime === " + jMetaDataGeneral.getServiceProviderrUrlAsLocalDateTime());
    }

    /**
     * Test getServiceProviderrUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsLocalTime());
        System.out.println("ServiceProviderr/Url AS LocalTime === " + jMetaDataGeneral.getServiceProviderrUrlAsLocalTime());
    }

    /**
     * Test getServiceProviderrUrlAsString() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsString());
        System.out.println("ServiceProviderr/Url AS String === " + jMetaDataGeneral.getServiceProviderrUrlAsString());
    }

    /**
     * Test getServiceProviderrUrlAsBoolean() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsBoolean());
        System.out.println("ServiceProviderr/Url AS Boolean === " + jMetaDataGeneral.getServiceProviderrUrlAsBoolean());
    }

    /**
     * Test getServiceProviderrUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsBigInteger());
        System.out.println("ServiceProviderr/Url AS BigInteger === " + jMetaDataGeneral.getServiceProviderrUrlAsBigInteger());
    }

    /**
     * Test getServiceProviderrUrlAsURL() method.
     */
    @Test
    public void subTestGetServiceProviderrUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceProviderrUrlAsURL());
        System.out.println("ServiceProviderr/Url AS URL === " + jMetaDataGeneral.getServiceProviderrUrlAsURL());
    }

    /**
     * Test getStreamSizeString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(Integer.valueOf(858), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsInteger());
        System.out.println("StreamSize/String1 AS Integer === " + jMetaDataGeneral.getStreamSizeString1AsInteger());
    }

    /**
     * Test getStreamSizeString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsLong());
        System.out.println("StreamSize/String1 AS Long === " + jMetaDataGeneral.getStreamSizeString1AsLong());
    }

    /**
     * Test getStreamSizeString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsLocalDateTime());
        System.out.println("StreamSize/String1 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsLocalTime());
        System.out.println("StreamSize/String1 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString1AsLocalTime());
    }

    /**
     * Test getStreamSizeString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsString());
        System.out.println("StreamSize/String1 AS String === " + jMetaDataGeneral.getStreamSizeString1AsString());
    }

    /**
     * Test getStreamSizeString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsBoolean());
        System.out.println("StreamSize/String1 AS Boolean === " + jMetaDataGeneral.getStreamSizeString1AsBoolean());
    }

    /**
     * Test getStreamSizeString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsBigInteger());
        System.out.println("StreamSize/String1 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString1AsBigInteger());
    }

    /**
     * Test getStreamSizeString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString1AsURL());
        System.out.println("StreamSize/String1 AS URL === " + jMetaDataGeneral.getStreamSizeString1AsURL());
    }

    /**
     * Test getStreamSizeString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsInteger());
        System.out.println("StreamSize/String4 AS Integer === " + jMetaDataGeneral.getStreamSizeString4AsInteger());
    }

    /**
     * Test getStreamSizeString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsLong());
        System.out.println("StreamSize/String4 AS Long === " + jMetaDataGeneral.getStreamSizeString4AsLong());
    }

    /**
     * Test getStreamSizeString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsLocalDateTime());
        System.out.println("StreamSize/String4 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsLocalTime());
        System.out.println("StreamSize/String4 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString4AsLocalTime());
    }

    /**
     * Test getStreamSizeString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsString());
        System.out.println("StreamSize/String4 AS String === " + jMetaDataGeneral.getStreamSizeString4AsString());
    }

    /**
     * Test getStreamSizeString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsBoolean());
        System.out.println("StreamSize/String4 AS Boolean === " + jMetaDataGeneral.getStreamSizeString4AsBoolean());
    }

    /**
     * Test getStreamSizeString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsBigInteger());
        System.out.println("StreamSize/String4 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString4AsBigInteger());
    }

    /**
     * Test getStreamSizeString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString4AsURL());
        System.out.println("StreamSize/String4 AS URL === " + jMetaDataGeneral.getStreamSizeString4AsURL());
    }

    /**
     * Test getDomainAsInteger() method.
     */
    @Test
    public void subTestGetDomainAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsInteger());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS Integer === " + jMetaDataGeneral.getDomainAsInteger());
    }

    /**
     * Test getDomainAsLong() method.
     */
    @Test
    public void subTestGetDomainAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsLong());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS Long === " + jMetaDataGeneral.getDomainAsLong());
    }

    /**
     * Test getDomainAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDomainAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsLocalDateTime());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS LocalDateTime === " + jMetaDataGeneral.getDomainAsLocalDateTime());
    }

    /**
     * Test getDomainAsLocalTime() method.
     */
    @Test
    public void subTestGetDomainAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsLocalTime());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS LocalTime === " + jMetaDataGeneral.getDomainAsLocalTime());
    }

    /**
     * Test getDomainAsString() method.
     */
    @Test
    public void subTestGetDomainAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsString());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS String === " + jMetaDataGeneral.getDomainAsString());
    }

    /**
     * Test getDomainAsBoolean() method.
     */
    @Test
    public void subTestGetDomainAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsBoolean());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS Boolean === " + jMetaDataGeneral.getDomainAsBoolean());
    }

    /**
     * Test getDomainAsBigInteger() method.
     */
    @Test
    public void subTestGetDomainAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsBigInteger());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS BigInteger === " + jMetaDataGeneral.getDomainAsBigInteger());
    }

    /**
     * Test getDomainAsURL() method.
     */
    @Test
    public void subTestGetDomainAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDomainAsURL());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS URL === " + jMetaDataGeneral.getDomainAsURL());
    }

    /**
     * Test getPerformerUrlAsInteger() method.
     */
    @Test
    public void subTestGetPerformerUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsInteger());
        System.out.println("Homepage of the performer/artist AS Integer === " + jMetaDataGeneral.getPerformerUrlAsInteger());
    }

    /**
     * Test getPerformerUrlAsLong() method.
     */
    @Test
    public void subTestGetPerformerUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsLong());
        System.out.println("Homepage of the performer/artist AS Long === " + jMetaDataGeneral.getPerformerUrlAsLong());
    }

    /**
     * Test getPerformerUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPerformerUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsLocalDateTime());
        System.out.println("Homepage of the performer/artist AS LocalDateTime === " + jMetaDataGeneral.getPerformerUrlAsLocalDateTime());
    }

    /**
     * Test getPerformerUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetPerformerUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsLocalTime());
        System.out.println("Homepage of the performer/artist AS LocalTime === " + jMetaDataGeneral.getPerformerUrlAsLocalTime());
    }

    /**
     * Test getPerformerUrlAsString() method.
     */
    @Test
    public void subTestGetPerformerUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsString());
        System.out.println("Homepage of the performer/artist AS String === " + jMetaDataGeneral.getPerformerUrlAsString());
    }

    /**
     * Test getPerformerUrlAsBoolean() method.
     */
    @Test
    public void subTestGetPerformerUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsBoolean());
        System.out.println("Homepage of the performer/artist AS Boolean === " + jMetaDataGeneral.getPerformerUrlAsBoolean());
    }

    /**
     * Test getPerformerUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetPerformerUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsBigInteger());
        System.out.println("Homepage of the performer/artist AS BigInteger === " + jMetaDataGeneral.getPerformerUrlAsBigInteger());
    }

    /**
     * Test getPerformerUrlAsURL() method.
     */
    @Test
    public void subTestGetPerformerUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerUrlAsURL());
        System.out.println("Homepage of the performer/artist AS URL === " + jMetaDataGeneral.getPerformerUrlAsURL());
    }

    /**
     * Test getOverallBitRateMinimumAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsInteger());
        System.out.println("Minimum Bit rate in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateMinimumAsInteger());
    }

    /**
     * Test getOverallBitRateMinimumAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsLong());
        System.out.println("Minimum Bit rate in bps AS Long === " + jMetaDataGeneral.getOverallBitRateMinimumAsLong());
    }

    /**
     * Test getOverallBitRateMinimumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsLocalDateTime());
        System.out.println("Minimum Bit rate in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMinimumAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMinimumAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsLocalTime());
        System.out.println("Minimum Bit rate in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMinimumAsLocalTime());
    }

    /**
     * Test getOverallBitRateMinimumAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsString());
        System.out.println("Minimum Bit rate in bps AS String === " + jMetaDataGeneral.getOverallBitRateMinimumAsString());
    }

    /**
     * Test getOverallBitRateMinimumAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsBoolean());
        System.out.println("Minimum Bit rate in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateMinimumAsBoolean());
    }

    /**
     * Test getOverallBitRateMinimumAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsBigInteger());
        System.out.println("Minimum Bit rate in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMinimumAsBigInteger());
    }

    /**
     * Test getOverallBitRateMinimumAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumAsURL());
        System.out.println("Minimum Bit rate in bps AS URL === " + jMetaDataGeneral.getOverallBitRateMinimumAsURL());
    }

    /**
     * Test getStreamSizeString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsInteger());
        System.out.println("StreamSize/String3 AS Integer === " + jMetaDataGeneral.getStreamSizeString3AsInteger());
    }

    /**
     * Test getStreamSizeString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsLong());
        System.out.println("StreamSize/String3 AS Long === " + jMetaDataGeneral.getStreamSizeString3AsLong());
    }

    /**
     * Test getStreamSizeString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsLocalDateTime());
        System.out.println("StreamSize/String3 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsLocalTime());
        System.out.println("StreamSize/String3 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString3AsLocalTime());
    }

    /**
     * Test getStreamSizeString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsString());
        System.out.println("StreamSize/String3 AS String === " + jMetaDataGeneral.getStreamSizeString3AsString());
    }

    /**
     * Test getStreamSizeString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsBoolean());
        System.out.println("StreamSize/String3 AS Boolean === " + jMetaDataGeneral.getStreamSizeString3AsBoolean());
    }

    /**
     * Test getStreamSizeString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsBigInteger());
        System.out.println("StreamSize/String3 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString3AsBigInteger());
    }

    /**
     * Test getStreamSizeString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString3AsURL());
        System.out.println("StreamSize/String3 AS URL === " + jMetaDataGeneral.getStreamSizeString3AsURL());
    }

    /**
     * Test getPublisherURLAsInteger() method.
     */
    @Test
    public void subTestGetPublisherURLAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsInteger());
        System.out.println("Publishers official webpage. AS Integer === " + jMetaDataGeneral.getPublisherURLAsInteger());
    }

    /**
     * Test getPublisherURLAsLong() method.
     */
    @Test
    public void subTestGetPublisherURLAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsLong());
        System.out.println("Publishers official webpage. AS Long === " + jMetaDataGeneral.getPublisherURLAsLong());
    }

    /**
     * Test getPublisherURLAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPublisherURLAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsLocalDateTime());
        System.out.println("Publishers official webpage. AS LocalDateTime === " + jMetaDataGeneral.getPublisherURLAsLocalDateTime());
    }

    /**
     * Test getPublisherURLAsLocalTime() method.
     */
    @Test
    public void subTestGetPublisherURLAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsLocalTime());
        System.out.println("Publishers official webpage. AS LocalTime === " + jMetaDataGeneral.getPublisherURLAsLocalTime());
    }

    /**
     * Test getPublisherURLAsString() method.
     */
    @Test
    public void subTestGetPublisherURLAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsString());
        System.out.println("Publishers official webpage. AS String === " + jMetaDataGeneral.getPublisherURLAsString());
    }

    /**
     * Test getPublisherURLAsBoolean() method.
     */
    @Test
    public void subTestGetPublisherURLAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsBoolean());
        System.out.println("Publishers official webpage. AS Boolean === " + jMetaDataGeneral.getPublisherURLAsBoolean());
    }

    /**
     * Test getPublisherURLAsBigInteger() method.
     */
    @Test
    public void subTestGetPublisherURLAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsBigInteger());
        System.out.println("Publishers official webpage. AS BigInteger === " + jMetaDataGeneral.getPublisherURLAsBigInteger());
    }

    /**
     * Test getPublisherURLAsURL() method.
     */
    @Test
    public void subTestGetPublisherURLAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPublisherURLAsURL());
        System.out.println("Publishers official webpage. AS URL === " + jMetaDataGeneral.getPublisherURLAsURL());
    }

    /**
     * Test getStreamSizeString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsInteger());
        System.out.println("With proportion AS Integer === " + jMetaDataGeneral.getStreamSizeString5AsInteger());
    }

    /**
     * Test getStreamSizeString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsLong());
        System.out.println("With proportion AS Long === " + jMetaDataGeneral.getStreamSizeString5AsLong());
    }

    /**
     * Test getStreamSizeString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsLocalDateTime());
        System.out.println("With proportion AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsLocalTime());
        System.out.println("With proportion AS LocalTime === " + jMetaDataGeneral.getStreamSizeString5AsLocalTime());
    }

    /**
     * Test getStreamSizeString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsString());
        System.out.println("With proportion AS String === " + jMetaDataGeneral.getStreamSizeString5AsString());
    }

    /**
     * Test getStreamSizeString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsBoolean());
        System.out.println("With proportion AS Boolean === " + jMetaDataGeneral.getStreamSizeString5AsBoolean());
    }

    /**
     * Test getStreamSizeString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsBigInteger());
        System.out.println("With proportion AS BigInteger === " + jMetaDataGeneral.getStreamSizeString5AsBigInteger());
    }

    /**
     * Test getStreamSizeString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeString5AsURL());
        System.out.println("With proportion AS URL === " + jMetaDataGeneral.getStreamSizeString5AsURL());
    }

    /**
     * Test getStreamKindAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataGeneral.getStreamKindAsInteger());
    }

    /**
     * Test getStreamKindAsLong() method.
     */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataGeneral.getStreamKindAsLong());
    }

    /**
     * Test getStreamKindAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataGeneral.getStreamKindAsLocalDateTime());
    }

    /**
     * Test getStreamKindAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataGeneral.getStreamKindAsLocalTime());
    }

    /**
     * Test getStreamKindAsString() method.
     */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals("General", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsString());
        System.out.println("Stream type name AS String === " + jMetaDataGeneral.getStreamKindAsString());
    }

    /**
     * Test getStreamKindAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataGeneral.getStreamKindAsBoolean());
    }

    /**
     * Test getStreamKindAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataGeneral.getStreamKindAsBigInteger());
    }

    /**
     * Test getStreamKindAsURL() method.
     */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataGeneral.getStreamKindAsURL());
    }

    /**
     * Test getKeywordsAsInteger() method.
     */
    @Test
    public void subTestGetKeywordsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsInteger());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS Integer === " + jMetaDataGeneral.getKeywordsAsInteger());
    }

    /**
     * Test getKeywordsAsLong() method.
     */
    @Test
    public void subTestGetKeywordsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsLong());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS Long === " + jMetaDataGeneral.getKeywordsAsLong());
    }

    /**
     * Test getKeywordsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetKeywordsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsLocalDateTime());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS LocalDateTime === " + jMetaDataGeneral.getKeywordsAsLocalDateTime());
    }

    /**
     * Test getKeywordsAsLocalTime() method.
     */
    @Test
    public void subTestGetKeywordsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsLocalTime());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS LocalTime === " + jMetaDataGeneral.getKeywordsAsLocalTime());
    }

    /**
     * Test getKeywordsAsString() method.
     */
    @Test
    public void subTestGetKeywordsAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsString());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS String === " + jMetaDataGeneral.getKeywordsAsString());
    }

    /**
     * Test getKeywordsAsBoolean() method.
     */
    @Test
    public void subTestGetKeywordsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsBoolean());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS Boolean === " + jMetaDataGeneral.getKeywordsAsBoolean());
    }

    /**
     * Test getKeywordsAsBigInteger() method.
     */
    @Test
    public void subTestGetKeywordsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsBigInteger());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS BigInteger === " + jMetaDataGeneral.getKeywordsAsBigInteger());
    }

    /**
     * Test getKeywordsAsURL() method.
     */
    @Test
    public void subTestGetKeywordsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getKeywordsAsURL());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS URL === " + jMetaDataGeneral.getKeywordsAsURL());
    }

    /**
     * Test getRatingAsInteger() method.
     */
    @Test
    public void subTestGetRatingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsInteger());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS Integer === " + jMetaDataGeneral.getRatingAsInteger());
    }

    /**
     * Test getRatingAsLong() method.
     */
    @Test
    public void subTestGetRatingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsLong());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS Long === " + jMetaDataGeneral.getRatingAsLong());
    }

    /**
     * Test getRatingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRatingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsLocalDateTime());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS LocalDateTime === " + jMetaDataGeneral.getRatingAsLocalDateTime());
    }

    /**
     * Test getRatingAsLocalTime() method.
     */
    @Test
    public void subTestGetRatingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsLocalTime());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS LocalTime === " + jMetaDataGeneral.getRatingAsLocalTime());
    }

    /**
     * Test getRatingAsString() method.
     */
    @Test
    public void subTestGetRatingAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsString());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS String === " + jMetaDataGeneral.getRatingAsString());
    }

    /**
     * Test getRatingAsBoolean() method.
     */
    @Test
    public void subTestGetRatingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsBoolean());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS Boolean === " + jMetaDataGeneral.getRatingAsBoolean());
    }

    /**
     * Test getRatingAsBigInteger() method.
     */
    @Test
    public void subTestGetRatingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsBigInteger());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS BigInteger === " + jMetaDataGeneral.getRatingAsBigInteger());
    }

    /**
     * Test getRatingAsURL() method.
     */
    @Test
    public void subTestGetRatingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRatingAsURL());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS URL === " + jMetaDataGeneral.getRatingAsURL());
    }

    /**
     * Test getOverallBitRateMaximumStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsInteger());
        System.out.println("Maximum Bit rate (with measurement) AS Integer === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsInteger());
    }

    /**
     * Test getOverallBitRateMaximumStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsLong());
        System.out.println("Maximum Bit rate (with measurement) AS Long === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsLong());
    }

    /**
     * Test getOverallBitRateMaximumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalDateTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMaximumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateMaximumStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsString());
        System.out.println("Maximum Bit rate (with measurement) AS String === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsString());
    }

    /**
     * Test getOverallBitRateMaximumStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsBoolean());
        System.out.println("Maximum Bit rate (with measurement) AS Boolean === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsBoolean());
    }

    /**
     * Test getOverallBitRateMaximumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsBigInteger());
        System.out.println("Maximum Bit rate (with measurement) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateMaximumStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumStringAsURL());
        System.out.println("Maximum Bit rate (with measurement) AS URL === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsURL());
    }

    /**
     * Test getOriginalReleasedDateAsInteger() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsInteger());
        System.out.println("The date/year that the item was originaly released. AS Integer === " + jMetaDataGeneral.getOriginalReleasedDateAsInteger());
    }

    /**
     * Test getOriginalReleasedDateAsLong() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsLong());
        System.out.println("The date/year that the item was originaly released. AS Long === " + jMetaDataGeneral.getOriginalReleasedDateAsLong());
    }

    /**
     * Test getOriginalReleasedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsLocalDateTime());
        System.out.println("The date/year that the item was originaly released. AS LocalDateTime === " + jMetaDataGeneral.getOriginalReleasedDateAsLocalDateTime());
    }

    /**
     * Test getOriginalReleasedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsLocalTime());
        System.out.println("The date/year that the item was originaly released. AS LocalTime === " + jMetaDataGeneral.getOriginalReleasedDateAsLocalTime());
    }

    /**
     * Test getOriginalReleasedDateAsString() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsString());
        System.out.println("The date/year that the item was originaly released. AS String === " + jMetaDataGeneral.getOriginalReleasedDateAsString());
    }

    /**
     * Test getOriginalReleasedDateAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsBoolean());
        System.out.println("The date/year that the item was originaly released. AS Boolean === " + jMetaDataGeneral.getOriginalReleasedDateAsBoolean());
    }

    /**
     * Test getOriginalReleasedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsBigInteger());
        System.out.println("The date/year that the item was originaly released. AS BigInteger === " + jMetaDataGeneral.getOriginalReleasedDateAsBigInteger());
    }

    /**
     * Test getOriginalReleasedDateAsURL() method.
     */
    @Test
    public void subTestGetOriginalReleasedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalReleasedDateAsURL());
        System.out.println("The date/year that the item was originaly released. AS URL === " + jMetaDataGeneral.getOriginalReleasedDateAsURL());
    }

    /**
     * Test getCodecIDAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataGeneral.getCodecIDAsInteger());
    }

    /**
     * Test getCodecIDAsLong() method.
     */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataGeneral.getCodecIDAsLong());
    }

    /**
     * Test getCodecIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataGeneral.getCodecIDAsLocalDateTime());
    }

    /**
     * Test getCodecIDAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataGeneral.getCodecIDAsLocalTime());
    }

    /**
     * Test getCodecIDAsString() method.
     */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataGeneral.getCodecIDAsString());
    }

    /**
     * Test getCodecIDAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataGeneral.getCodecIDAsBoolean());
    }

    /**
     * Test getCodecIDAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataGeneral.getCodecIDAsBigInteger());
    }

    /**
     * Test getCodecIDAsURL() method.
     */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataGeneral.getCodecIDAsURL());
    }

    /**
     * Test getAlbumSortAsInteger() method.
     */
    @Test
    public void subTestGetAlbumSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsInteger());
        System.out.println("Album/Sort AS Integer === " + jMetaDataGeneral.getAlbumSortAsInteger());
    }

    /**
     * Test getAlbumSortAsLong() method.
     */
    @Test
    public void subTestGetAlbumSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsLong());
        System.out.println("Album/Sort AS Long === " + jMetaDataGeneral.getAlbumSortAsLong());
    }

    /**
     * Test getAlbumSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsLocalDateTime());
        System.out.println("Album/Sort AS LocalDateTime === " + jMetaDataGeneral.getAlbumSortAsLocalDateTime());
    }

    /**
     * Test getAlbumSortAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsLocalTime());
        System.out.println("Album/Sort AS LocalTime === " + jMetaDataGeneral.getAlbumSortAsLocalTime());
    }

    /**
     * Test getAlbumSortAsString() method.
     */
    @Test
    public void subTestGetAlbumSortAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsString());
        System.out.println("Album/Sort AS String === " + jMetaDataGeneral.getAlbumSortAsString());
    }

    /**
     * Test getAlbumSortAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsBoolean());
        System.out.println("Album/Sort AS Boolean === " + jMetaDataGeneral.getAlbumSortAsBoolean());
    }

    /**
     * Test getAlbumSortAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsBigInteger());
        System.out.println("Album/Sort AS BigInteger === " + jMetaDataGeneral.getAlbumSortAsBigInteger());
    }

    /**
     * Test getAlbumSortAsURL() method.
     */
    @Test
    public void subTestGetAlbumSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumSortAsURL());
        System.out.println("Album/Sort AS URL === " + jMetaDataGeneral.getAlbumSortAsURL());
    }

    /**
     * Test getAudioLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsInteger());
        System.out.println("Audio languages in this file separated by / AS Integer === " + jMetaDataGeneral.getAudioLanguageListAsInteger());
    }

    /**
     * Test getAudioLanguageListAsLong() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsLong());
        System.out.println("Audio languages in this file separated by / AS Long === " + jMetaDataGeneral.getAudioLanguageListAsLong());
    }

    /**
     * Test getAudioLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsLocalDateTime());
        System.out.println("Audio languages in this file separated by / AS LocalDateTime === " + jMetaDataGeneral.getAudioLanguageListAsLocalDateTime());
    }

    /**
     * Test getAudioLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsLocalTime());
        System.out.println("Audio languages in this file separated by / AS LocalTime === " + jMetaDataGeneral.getAudioLanguageListAsLocalTime());
    }

    /**
     * Test getAudioLanguageListAsString() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsString());
        System.out.println("Audio languages in this file separated by / AS String === " + jMetaDataGeneral.getAudioLanguageListAsString());
    }

    /**
     * Test getAudioLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsBoolean());
        System.out.println("Audio languages in this file separated by / AS Boolean === " + jMetaDataGeneral.getAudioLanguageListAsBoolean());
    }

    /**
     * Test getAudioLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsBigInteger());
        System.out.println("Audio languages in this file separated by / AS BigInteger === " + jMetaDataGeneral.getAudioLanguageListAsBigInteger());
    }

    /**
     * Test getAudioLanguageListAsURL() method.
     */
    @Test
    public void subTestGetAudioLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioLanguageListAsURL());
        System.out.println("Audio languages in this file separated by / AS URL === " + jMetaDataGeneral.getAudioLanguageListAsURL());
    }

    /**
     * Test getCoProducerAsInteger() method.
     */
    @Test
    public void subTestGetCoProducerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsInteger());
        System.out.println("The name of a co-producer. AS Integer === " + jMetaDataGeneral.getCoProducerAsInteger());
    }

    /**
     * Test getCoProducerAsLong() method.
     */
    @Test
    public void subTestGetCoProducerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsLong());
        System.out.println("The name of a co-producer. AS Long === " + jMetaDataGeneral.getCoProducerAsLong());
    }

    /**
     * Test getCoProducerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoProducerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsLocalDateTime());
        System.out.println("The name of a co-producer. AS LocalDateTime === " + jMetaDataGeneral.getCoProducerAsLocalDateTime());
    }

    /**
     * Test getCoProducerAsLocalTime() method.
     */
    @Test
    public void subTestGetCoProducerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsLocalTime());
        System.out.println("The name of a co-producer. AS LocalTime === " + jMetaDataGeneral.getCoProducerAsLocalTime());
    }

    /**
     * Test getCoProducerAsString() method.
     */
    @Test
    public void subTestGetCoProducerAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsString());
        System.out.println("The name of a co-producer. AS String === " + jMetaDataGeneral.getCoProducerAsString());
    }

    /**
     * Test getCoProducerAsBoolean() method.
     */
    @Test
    public void subTestGetCoProducerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsBoolean());
        System.out.println("The name of a co-producer. AS Boolean === " + jMetaDataGeneral.getCoProducerAsBoolean());
    }

    /**
     * Test getCoProducerAsBigInteger() method.
     */
    @Test
    public void subTestGetCoProducerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsBigInteger());
        System.out.println("The name of a co-producer. AS BigInteger === " + jMetaDataGeneral.getCoProducerAsBigInteger());
    }

    /**
     * Test getCoProducerAsURL() method.
     */
    @Test
    public void subTestGetCoProducerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoProducerAsURL());
        System.out.println("The name of a co-producer. AS URL === " + jMetaDataGeneral.getCoProducerAsURL());
    }

    /**
     * Test getISBNAsInteger() method.
     */
    @Test
    public void subTestGetISBNAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsInteger());
        System.out.println("International Standard Book Number. AS Integer === " + jMetaDataGeneral.getISBNAsInteger());
    }

    /**
     * Test getISBNAsLong() method.
     */
    @Test
    public void subTestGetISBNAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsLong());
        System.out.println("International Standard Book Number. AS Long === " + jMetaDataGeneral.getISBNAsLong());
    }

    /**
     * Test getISBNAsLocalDateTime() method.
     */
    @Test
    public void subTestGetISBNAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsLocalDateTime());
        System.out.println("International Standard Book Number. AS LocalDateTime === " + jMetaDataGeneral.getISBNAsLocalDateTime());
    }

    /**
     * Test getISBNAsLocalTime() method.
     */
    @Test
    public void subTestGetISBNAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsLocalTime());
        System.out.println("International Standard Book Number. AS LocalTime === " + jMetaDataGeneral.getISBNAsLocalTime());
    }

    /**
     * Test getISBNAsString() method.
     */
    @Test
    public void subTestGetISBNAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsString());
        System.out.println("International Standard Book Number. AS String === " + jMetaDataGeneral.getISBNAsString());
    }

    /**
     * Test getISBNAsBoolean() method.
     */
    @Test
    public void subTestGetISBNAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsBoolean());
        System.out.println("International Standard Book Number. AS Boolean === " + jMetaDataGeneral.getISBNAsBoolean());
    }

    /**
     * Test getISBNAsBigInteger() method.
     */
    @Test
    public void subTestGetISBNAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsBigInteger());
        System.out.println("International Standard Book Number. AS BigInteger === " + jMetaDataGeneral.getISBNAsBigInteger());
    }

    /**
     * Test getISBNAsURL() method.
     */
    @Test
    public void subTestGetISBNAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISBNAsURL());
        System.out.println("International Standard Book Number. AS URL === " + jMetaDataGeneral.getISBNAsURL());
    }

    /**
     * Test getChoregrapherAsInteger() method.
     */
    @Test
    public void subTestGetChoregrapherAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsInteger());
        System.out.println("The name of the choregrapher. AS Integer === " + jMetaDataGeneral.getChoregrapherAsInteger());
    }

    /**
     * Test getChoregrapherAsLong() method.
     */
    @Test
    public void subTestGetChoregrapherAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsLong());
        System.out.println("The name of the choregrapher. AS Long === " + jMetaDataGeneral.getChoregrapherAsLong());
    }

    /**
     * Test getChoregrapherAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChoregrapherAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsLocalDateTime());
        System.out.println("The name of the choregrapher. AS LocalDateTime === " + jMetaDataGeneral.getChoregrapherAsLocalDateTime());
    }

    /**
     * Test getChoregrapherAsLocalTime() method.
     */
    @Test
    public void subTestGetChoregrapherAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsLocalTime());
        System.out.println("The name of the choregrapher. AS LocalTime === " + jMetaDataGeneral.getChoregrapherAsLocalTime());
    }

    /**
     * Test getChoregrapherAsString() method.
     */
    @Test
    public void subTestGetChoregrapherAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsString());
        System.out.println("The name of the choregrapher. AS String === " + jMetaDataGeneral.getChoregrapherAsString());
    }

    /**
     * Test getChoregrapherAsBoolean() method.
     */
    @Test
    public void subTestGetChoregrapherAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsBoolean());
        System.out.println("The name of the choregrapher. AS Boolean === " + jMetaDataGeneral.getChoregrapherAsBoolean());
    }

    /**
     * Test getChoregrapherAsBigInteger() method.
     */
    @Test
    public void subTestGetChoregrapherAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsBigInteger());
        System.out.println("The name of the choregrapher. AS BigInteger === " + jMetaDataGeneral.getChoregrapherAsBigInteger());
    }

    /**
     * Test getChoregrapherAsURL() method.
     */
    @Test
    public void subTestGetChoregrapherAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChoregrapherAsURL());
        System.out.println("The name of the choregrapher. AS URL === " + jMetaDataGeneral.getChoregrapherAsURL());
    }

    /**
     * Test getEncodedLibraryStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataGeneral.getEncodedLibraryStringAsInteger());
    }

    /**
     * Test getEncodedLibraryStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsLong());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataGeneral.getEncodedLibraryStringAsLong());
    }

    /**
     * Test getEncodedLibraryStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsLocalDateTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryStringAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsLocalTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryStringAsLocalTime());
    }

    /**
     * Test getEncodedLibraryStringAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsString());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataGeneral.getEncodedLibraryStringAsString());
    }

    /**
     * Test getEncodedLibraryStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsBoolean());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataGeneral.getEncodedLibraryStringAsBoolean());
    }

    /**
     * Test getEncodedLibraryStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsBigInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryStringAsBigInteger());
    }

    /**
     * Test getEncodedLibraryStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryStringAsURL());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataGeneral.getEncodedLibraryStringAsURL());
    }

    /**
     * Test getCompleteNameAsInteger() method.
     */
    @Test
    public void subTestGetCompleteNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsInteger());
        System.out.println("Complete name (Folder+Name+Extension) AS Integer === " + jMetaDataGeneral.getCompleteNameAsInteger());
    }

    /**
     * Test getCompleteNameAsLong() method.
     */
    @Test
    public void subTestGetCompleteNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsLong());
        System.out.println("Complete name (Folder+Name+Extension) AS Long === " + jMetaDataGeneral.getCompleteNameAsLong());
    }

    /**
     * Test getCompleteNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompleteNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsLocalDateTime());
        System.out.println("Complete name (Folder+Name+Extension) AS LocalDateTime === " + jMetaDataGeneral.getCompleteNameAsLocalDateTime());
    }

    /**
     * Test getCompleteNameAsLocalTime() method.
     */
    @Test
    public void subTestGetCompleteNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsLocalTime());
        System.out.println("Complete name (Folder+Name+Extension) AS LocalTime === " + jMetaDataGeneral.getCompleteNameAsLocalTime());
    }

    /**
     * Test getCompleteNameAsString() method.
     */
    @Test
    public void subTestGetCompleteNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsString());
        System.out.println("Complete name (Folder+Name+Extension) AS String === " + jMetaDataGeneral.getCompleteNameAsString());
    }

    /**
     * Test getCompleteNameAsBoolean() method.
     */
    @Test
    public void subTestGetCompleteNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsBoolean());
        System.out.println("Complete name (Folder+Name+Extension) AS Boolean === " + jMetaDataGeneral.getCompleteNameAsBoolean());
    }

    /**
     * Test getCompleteNameAsBigInteger() method.
     */
    @Test
    public void subTestGetCompleteNameAsBigInteger() {
        assertEquals(BigInteger.valueOf(10), JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsBigInteger());
        System.out.println("Complete name (Folder+Name+Extension) AS BigInteger === " + jMetaDataGeneral.getCompleteNameAsBigInteger());
    }

    /**
     * Test getCompleteNameAsURL() method.
     */
    @Test
    public void subTestGetCompleteNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompleteNameAsURL());
        System.out.println("Complete name (Folder+Name+Extension) AS URL === " + jMetaDataGeneral.getCompleteNameAsURL());
    }

    /**
     * Test getStreamSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsInteger());
        System.out.println("StreamSize/String AS Integer === " + jMetaDataGeneral.getStreamSizeStringAsInteger());
    }

    /**
     * Test getStreamSizeStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsLong());
        System.out.println("StreamSize/String AS Long === " + jMetaDataGeneral.getStreamSizeStringAsLong());
    }

    /**
     * Test getStreamSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsLocalDateTime());
        System.out.println("StreamSize/String AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsLocalTime());
        System.out.println("StreamSize/String AS LocalTime === " + jMetaDataGeneral.getStreamSizeStringAsLocalTime());
    }

    /**
     * Test getStreamSizeStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsString());
        System.out.println("StreamSize/String AS String === " + jMetaDataGeneral.getStreamSizeStringAsString());
    }

    /**
     * Test getStreamSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsBoolean());
        System.out.println("StreamSize/String AS Boolean === " + jMetaDataGeneral.getStreamSizeStringAsBoolean());
    }

    /**
     * Test getStreamSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsBigInteger());
        System.out.println("StreamSize/String AS BigInteger === " + jMetaDataGeneral.getStreamSizeStringAsBigInteger());
    }

    /**
     * Test getStreamSizeStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeStringAsURL());
        System.out.println("StreamSize/String AS URL === " + jMetaDataGeneral.getStreamSizeStringAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsString());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDStringAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDStringAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsURL());
    }

    /**
     * Test getDistributedByAsInteger() method.
     */
    @Test
    public void subTestGetDistributedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsInteger());
        System.out.println("Company the item is mainly distributed by  AS Integer === " + jMetaDataGeneral.getDistributedByAsInteger());
    }

    /**
     * Test getDistributedByAsLong() method.
     */
    @Test
    public void subTestGetDistributedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsLong());
        System.out.println("Company the item is mainly distributed by  AS Long === " + jMetaDataGeneral.getDistributedByAsLong());
    }

    /**
     * Test getDistributedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDistributedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsLocalDateTime());
        System.out.println("Company the item is mainly distributed by  AS LocalDateTime === " + jMetaDataGeneral.getDistributedByAsLocalDateTime());
    }

    /**
     * Test getDistributedByAsLocalTime() method.
     */
    @Test
    public void subTestGetDistributedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsLocalTime());
        System.out.println("Company the item is mainly distributed by  AS LocalTime === " + jMetaDataGeneral.getDistributedByAsLocalTime());
    }

    /**
     * Test getDistributedByAsString() method.
     */
    @Test
    public void subTestGetDistributedByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsString());
        System.out.println("Company the item is mainly distributed by  AS String === " + jMetaDataGeneral.getDistributedByAsString());
    }

    /**
     * Test getDistributedByAsBoolean() method.
     */
    @Test
    public void subTestGetDistributedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsBoolean());
        System.out.println("Company the item is mainly distributed by  AS Boolean === " + jMetaDataGeneral.getDistributedByAsBoolean());
    }

    /**
     * Test getDistributedByAsBigInteger() method.
     */
    @Test
    public void subTestGetDistributedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsBigInteger());
        System.out.println("Company the item is mainly distributed by  AS BigInteger === " + jMetaDataGeneral.getDistributedByAsBigInteger());
    }

    /**
     * Test getDistributedByAsURL() method.
     */
    @Test
    public void subTestGetDistributedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDistributedByAsURL());
        System.out.println("Company the item is mainly distributed by  AS URL === " + jMetaDataGeneral.getDistributedByAsURL());
    }

    /**
     * Test getFileModifiedDateLocalAsInteger() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsInteger());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Integer === " + jMetaDataGeneral.getFileModifiedDateLocalAsInteger());
    }

    /**
     * Test getFileModifiedDateLocalAsLong() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsLong());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Long === " + jMetaDataGeneral.getFileModifiedDateLocalAsLong());
    }

    /**
     * Test getFileModifiedDateLocalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsLocalDateTime());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalDateTime === " + jMetaDataGeneral.getFileModifiedDateLocalAsLocalDateTime());
    }

    /**
     * Test getFileModifiedDateLocalAsLocalTime() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsLocalTime());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalTime === " + jMetaDataGeneral.getFileModifiedDateLocalAsLocalTime());
    }

    /**
     * Test getFileModifiedDateLocalAsString() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsString());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS String === " + jMetaDataGeneral.getFileModifiedDateLocalAsString());
    }

    /**
     * Test getFileModifiedDateLocalAsBoolean() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsBoolean());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Boolean === " + jMetaDataGeneral.getFileModifiedDateLocalAsBoolean());
    }

    /**
     * Test getFileModifiedDateLocalAsBigInteger() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsBigInteger());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS BigInteger === " + jMetaDataGeneral.getFileModifiedDateLocalAsBigInteger());
    }

    /**
     * Test getFileModifiedDateLocalAsURL() method.
     */
    @Test
    public void subTestGetFileModifiedDateLocalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileModifiedDateLocalAsURL());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS URL === " + jMetaDataGeneral.getFileModifiedDateLocalAsURL());
    }

    /**
     * Test getFrameCountAsInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsInteger());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Integer === " + jMetaDataGeneral.getFrameCountAsInteger());
    }

    /**
     * Test getFrameCountAsLong() method.
     */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(Long.valueOf(18043), JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsLong());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Long === " + jMetaDataGeneral.getFrameCountAsLong());
    }

    /**
     * Test getFrameCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsLocalDateTime());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS LocalDateTime === " + jMetaDataGeneral.getFrameCountAsLocalDateTime());
    }

    /**
     * Test getFrameCountAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsLocalTime());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS LocalTime === " + jMetaDataGeneral.getFrameCountAsLocalTime());
    }

    /**
     * Test getFrameCountAsString() method.
     */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals("18043", JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsString());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS String === " + jMetaDataGeneral.getFrameCountAsString());
    }

    /**
     * Test getFrameCountAsBoolean() method.
     */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsBoolean());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Boolean === " + jMetaDataGeneral.getFrameCountAsBoolean());
    }

    /**
     * Test getFrameCountAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsBigInteger());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS BigInteger === " + jMetaDataGeneral.getFrameCountAsBigInteger());
    }

    /**
     * Test getFrameCountAsURL() method.
     */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameCountAsURL());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS URL === " + jMetaDataGeneral.getFrameCountAsURL());
    }

    /**
     * Test getEncryptionLengthAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsInteger());
        System.out.println("Encryption_Length AS Integer === " + jMetaDataGeneral.getEncryptionLengthAsInteger());
    }

    /**
     * Test getEncryptionLengthAsLong() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsLong());
        System.out.println("Encryption_Length AS Long === " + jMetaDataGeneral.getEncryptionLengthAsLong());
    }

    /**
     * Test getEncryptionLengthAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsLocalDateTime());
        System.out.println("Encryption_Length AS LocalDateTime === " + jMetaDataGeneral.getEncryptionLengthAsLocalDateTime());
    }

    /**
     * Test getEncryptionLengthAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsLocalTime());
        System.out.println("Encryption_Length AS LocalTime === " + jMetaDataGeneral.getEncryptionLengthAsLocalTime());
    }

    /**
     * Test getEncryptionLengthAsString() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsString());
        System.out.println("Encryption_Length AS String === " + jMetaDataGeneral.getEncryptionLengthAsString());
    }

    /**
     * Test getEncryptionLengthAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsBoolean());
        System.out.println("Encryption_Length AS Boolean === " + jMetaDataGeneral.getEncryptionLengthAsBoolean());
    }

    /**
     * Test getEncryptionLengthAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsBigInteger());
        System.out.println("Encryption_Length AS BigInteger === " + jMetaDataGeneral.getEncryptionLengthAsBigInteger());
    }

    /**
     * Test getEncryptionLengthAsURL() method.
     */
    @Test
    public void subTestGetEncryptionLengthAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionLengthAsURL());
        System.out.println("Encryption_Length AS URL === " + jMetaDataGeneral.getEncryptionLengthAsURL());
    }

    /**
     * Test getTitleAsInteger() method.
     */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsInteger());
        System.out.println("(Generic)Title of file AS Integer === " + jMetaDataGeneral.getTitleAsInteger());
    }

    /**
     * Test getTitleAsLong() method.
     */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsLong());
        System.out.println("(Generic)Title of file AS Long === " + jMetaDataGeneral.getTitleAsLong());
    }

    /**
     * Test getTitleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsLocalDateTime());
        System.out.println("(Generic)Title of file AS LocalDateTime === " + jMetaDataGeneral.getTitleAsLocalDateTime());
    }

    /**
     * Test getTitleAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsLocalTime());
        System.out.println("(Generic)Title of file AS LocalTime === " + jMetaDataGeneral.getTitleAsLocalTime());
    }

    /**
     * Test getTitleAsString() method.
     */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsString());
        System.out.println("(Generic)Title of file AS String === " + jMetaDataGeneral.getTitleAsString());
    }

    /**
     * Test getTitleAsBoolean() method.
     */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsBoolean());
        System.out.println("(Generic)Title of file AS Boolean === " + jMetaDataGeneral.getTitleAsBoolean());
    }

    /**
     * Test getTitleAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsBigInteger());
        System.out.println("(Generic)Title of file AS BigInteger === " + jMetaDataGeneral.getTitleAsBigInteger());
    }

    /**
     * Test getTitleAsURL() method.
     */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleAsURL());
        System.out.println("(Generic)Title of file AS URL === " + jMetaDataGeneral.getTitleAsURL());
    }

    /**
     * Test getICRAAsInteger() method.
     */
    @Test
    public void subTestGetICRAAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsInteger());
        System.out.println("The ICRA rating. (Previously RSACi) AS Integer === " + jMetaDataGeneral.getICRAAsInteger());
    }

    /**
     * Test getICRAAsLong() method.
     */
    @Test
    public void subTestGetICRAAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsLong());
        System.out.println("The ICRA rating. (Previously RSACi) AS Long === " + jMetaDataGeneral.getICRAAsLong());
    }

    /**
     * Test getICRAAsLocalDateTime() method.
     */
    @Test
    public void subTestGetICRAAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsLocalDateTime());
        System.out.println("The ICRA rating. (Previously RSACi) AS LocalDateTime === " + jMetaDataGeneral.getICRAAsLocalDateTime());
    }

    /**
     * Test getICRAAsLocalTime() method.
     */
    @Test
    public void subTestGetICRAAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsLocalTime());
        System.out.println("The ICRA rating. (Previously RSACi) AS LocalTime === " + jMetaDataGeneral.getICRAAsLocalTime());
    }

    /**
     * Test getICRAAsString() method.
     */
    @Test
    public void subTestGetICRAAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsString());
        System.out.println("The ICRA rating. (Previously RSACi) AS String === " + jMetaDataGeneral.getICRAAsString());
    }

    /**
     * Test getICRAAsBoolean() method.
     */
    @Test
    public void subTestGetICRAAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsBoolean());
        System.out.println("The ICRA rating. (Previously RSACi) AS Boolean === " + jMetaDataGeneral.getICRAAsBoolean());
    }

    /**
     * Test getICRAAsBigInteger() method.
     */
    @Test
    public void subTestGetICRAAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsBigInteger());
        System.out.println("The ICRA rating. (Previously RSACi) AS BigInteger === " + jMetaDataGeneral.getICRAAsBigInteger());
    }

    /**
     * Test getICRAAsURL() method.
     */
    @Test
    public void subTestGetICRAAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getICRAAsURL());
        System.out.println("The ICRA rating. (Previously RSACi) AS URL === " + jMetaDataGeneral.getICRAAsURL());
    }

    /**
     * Test getDelayDropFrameAsInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsInteger());
        System.out.println("Delay drop frame AS Integer === " + jMetaDataGeneral.getDelayDropFrameAsInteger());
    }

    /**
     * Test getDelayDropFrameAsLong() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsLong());
        System.out.println("Delay drop frame AS Long === " + jMetaDataGeneral.getDelayDropFrameAsLong());
    }

    /**
     * Test getDelayDropFrameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame AS LocalDateTime === " + jMetaDataGeneral.getDelayDropFrameAsLocalDateTime());
    }

    /**
     * Test getDelayDropFrameAsLocalTime() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsLocalTime());
        System.out.println("Delay drop frame AS LocalTime === " + jMetaDataGeneral.getDelayDropFrameAsLocalTime());
    }

    /**
     * Test getDelayDropFrameAsString() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsString());
        System.out.println("Delay drop frame AS String === " + jMetaDataGeneral.getDelayDropFrameAsString());
    }

    /**
     * Test getDelayDropFrameAsBoolean() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsBoolean());
        System.out.println("Delay drop frame AS Boolean === " + jMetaDataGeneral.getDelayDropFrameAsBoolean());
    }

    /**
     * Test getDelayDropFrameAsBigInteger() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsBigInteger());
        System.out.println("Delay drop frame AS BigInteger === " + jMetaDataGeneral.getDelayDropFrameAsBigInteger());
    }

    /**
     * Test getDelayDropFrameAsURL() method.
     */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelayDropFrameAsURL());
        System.out.println("Delay drop frame AS URL === " + jMetaDataGeneral.getDelayDropFrameAsURL());
    }

    /**
     * Test getTitleUrlAsInteger() method.
     */
    @Test
    public void subTestGetTitleUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsInteger());
        System.out.println("(Generic)Url AS Integer === " + jMetaDataGeneral.getTitleUrlAsInteger());
    }

    /**
     * Test getTitleUrlAsLong() method.
     */
    @Test
    public void subTestGetTitleUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsLong());
        System.out.println("(Generic)Url AS Long === " + jMetaDataGeneral.getTitleUrlAsLong());
    }

    /**
     * Test getTitleUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTitleUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsLocalDateTime());
        System.out.println("(Generic)Url AS LocalDateTime === " + jMetaDataGeneral.getTitleUrlAsLocalDateTime());
    }

    /**
     * Test getTitleUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetTitleUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsLocalTime());
        System.out.println("(Generic)Url AS LocalTime === " + jMetaDataGeneral.getTitleUrlAsLocalTime());
    }

    /**
     * Test getTitleUrlAsString() method.
     */
    @Test
    public void subTestGetTitleUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsString());
        System.out.println("(Generic)Url AS String === " + jMetaDataGeneral.getTitleUrlAsString());
    }

    /**
     * Test getTitleUrlAsBoolean() method.
     */
    @Test
    public void subTestGetTitleUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsBoolean());
        System.out.println("(Generic)Url AS Boolean === " + jMetaDataGeneral.getTitleUrlAsBoolean());
    }

    /**
     * Test getTitleUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetTitleUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsBigInteger());
        System.out.println("(Generic)Url AS BigInteger === " + jMetaDataGeneral.getTitleUrlAsBigInteger());
    }

    /**
     * Test getTitleUrlAsURL() method.
     */
    @Test
    public void subTestGetTitleUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTitleUrlAsURL());
        System.out.println("(Generic)Url AS URL === " + jMetaDataGeneral.getTitleUrlAsURL());
    }

    /**
     * Test getComposerSortAsInteger() method.
     */
    @Test
    public void subTestGetComposerSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsInteger());
        System.out.println("Composer/Sort AS Integer === " + jMetaDataGeneral.getComposerSortAsInteger());
    }

    /**
     * Test getComposerSortAsLong() method.
     */
    @Test
    public void subTestGetComposerSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsLong());
        System.out.println("Composer/Sort AS Long === " + jMetaDataGeneral.getComposerSortAsLong());
    }

    /**
     * Test getComposerSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComposerSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsLocalDateTime());
        System.out.println("Composer/Sort AS LocalDateTime === " + jMetaDataGeneral.getComposerSortAsLocalDateTime());
    }

    /**
     * Test getComposerSortAsLocalTime() method.
     */
    @Test
    public void subTestGetComposerSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsLocalTime());
        System.out.println("Composer/Sort AS LocalTime === " + jMetaDataGeneral.getComposerSortAsLocalTime());
    }

    /**
     * Test getComposerSortAsString() method.
     */
    @Test
    public void subTestGetComposerSortAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsString());
        System.out.println("Composer/Sort AS String === " + jMetaDataGeneral.getComposerSortAsString());
    }

    /**
     * Test getComposerSortAsBoolean() method.
     */
    @Test
    public void subTestGetComposerSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsBoolean());
        System.out.println("Composer/Sort AS Boolean === " + jMetaDataGeneral.getComposerSortAsBoolean());
    }

    /**
     * Test getComposerSortAsBigInteger() method.
     */
    @Test
    public void subTestGetComposerSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsBigInteger());
        System.out.println("Composer/Sort AS BigInteger === " + jMetaDataGeneral.getComposerSortAsBigInteger());
    }

    /**
     * Test getComposerSortAsURL() method.
     */
    @Test
    public void subTestGetComposerSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerSortAsURL());
        System.out.println("Composer/Sort AS URL === " + jMetaDataGeneral.getComposerSortAsURL());
    }

    /**
     * Test getSubjectAsInteger() method.
     */
    @Test
    public void subTestGetSubjectAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsInteger());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS Integer === " + jMetaDataGeneral.getSubjectAsInteger());
    }

    /**
     * Test getSubjectAsLong() method.
     */
    @Test
    public void subTestGetSubjectAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsLong());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS Long === " + jMetaDataGeneral.getSubjectAsLong());
    }

    /**
     * Test getSubjectAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSubjectAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsLocalDateTime());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS LocalDateTime === " + jMetaDataGeneral.getSubjectAsLocalDateTime());
    }

    /**
     * Test getSubjectAsLocalTime() method.
     */
    @Test
    public void subTestGetSubjectAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsLocalTime());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS LocalTime === " + jMetaDataGeneral.getSubjectAsLocalTime());
    }

    /**
     * Test getSubjectAsString() method.
     */
    @Test
    public void subTestGetSubjectAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsString());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS String === " + jMetaDataGeneral.getSubjectAsString());
    }

    /**
     * Test getSubjectAsBoolean() method.
     */
    @Test
    public void subTestGetSubjectAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsBoolean());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS Boolean === " + jMetaDataGeneral.getSubjectAsBoolean());
    }

    /**
     * Test getSubjectAsBigInteger() method.
     */
    @Test
    public void subTestGetSubjectAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsBigInteger());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS BigInteger === " + jMetaDataGeneral.getSubjectAsBigInteger());
    }

    /**
     * Test getSubjectAsURL() method.
     */
    @Test
    public void subTestGetSubjectAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSubjectAsURL());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS URL === " + jMetaDataGeneral.getSubjectAsURL());
    }

    /**
     * Test getMovieMoreAsInteger() method.
     */
    @Test
    public void subTestGetMovieMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsInteger());
        System.out.println("More infos about the movie AS Integer === " + jMetaDataGeneral.getMovieMoreAsInteger());
    }

    /**
     * Test getMovieMoreAsLong() method.
     */
    @Test
    public void subTestGetMovieMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsLong());
        System.out.println("More infos about the movie AS Long === " + jMetaDataGeneral.getMovieMoreAsLong());
    }

    /**
     * Test getMovieMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsLocalDateTime());
        System.out.println("More infos about the movie AS LocalDateTime === " + jMetaDataGeneral.getMovieMoreAsLocalDateTime());
    }

    /**
     * Test getMovieMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsLocalTime());
        System.out.println("More infos about the movie AS LocalTime === " + jMetaDataGeneral.getMovieMoreAsLocalTime());
    }

    /**
     * Test getMovieMoreAsString() method.
     */
    @Test
    public void subTestGetMovieMoreAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsString());
        System.out.println("More infos about the movie AS String === " + jMetaDataGeneral.getMovieMoreAsString());
    }

    /**
     * Test getMovieMoreAsBoolean() method.
     */
    @Test
    public void subTestGetMovieMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsBoolean());
        System.out.println("More infos about the movie AS Boolean === " + jMetaDataGeneral.getMovieMoreAsBoolean());
    }

    /**
     * Test getMovieMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsBigInteger());
        System.out.println("More infos about the movie AS BigInteger === " + jMetaDataGeneral.getMovieMoreAsBigInteger());
    }

    /**
     * Test getMovieMoreAsURL() method.
     */
    @Test
    public void subTestGetMovieMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieMoreAsURL());
        System.out.println("More infos about the movie AS URL === " + jMetaDataGeneral.getMovieMoreAsURL());
    }

    /**
     * Test getOverallBitRateModeAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsInteger());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS Integer === " + jMetaDataGeneral.getOverallBitRateModeAsInteger());
    }

    /**
     * Test getOverallBitRateModeAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsLong());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS Long === " + jMetaDataGeneral.getOverallBitRateModeAsLong());
    }

    /**
     * Test getOverallBitRateModeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsLocalDateTime());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateModeAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateModeAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsLocalTime());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateModeAsLocalTime());
    }

    /**
     * Test getOverallBitRateModeAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsString());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS String === " + jMetaDataGeneral.getOverallBitRateModeAsString());
    }

    /**
     * Test getOverallBitRateModeAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsBoolean());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS Boolean === " + jMetaDataGeneral.getOverallBitRateModeAsBoolean());
    }

    /**
     * Test getOverallBitRateModeAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsBigInteger());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateModeAsBigInteger());
    }

    /**
     * Test getOverallBitRateModeAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateModeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateModeAsURL());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS URL === " + jMetaDataGeneral.getOverallBitRateModeAsURL());
    }

    /**
     * Test getScreenplayByAsInteger() method.
     */
    @Test
    public void subTestGetScreenplayByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsInteger());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS Integer === " + jMetaDataGeneral.getScreenplayByAsInteger());
    }

    /**
     * Test getScreenplayByAsLong() method.
     */
    @Test
    public void subTestGetScreenplayByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsLong());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS Long === " + jMetaDataGeneral.getScreenplayByAsLong());
    }

    /**
     * Test getScreenplayByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetScreenplayByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsLocalDateTime());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS LocalDateTime === " + jMetaDataGeneral.getScreenplayByAsLocalDateTime());
    }

    /**
     * Test getScreenplayByAsLocalTime() method.
     */
    @Test
    public void subTestGetScreenplayByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsLocalTime());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS LocalTime === " + jMetaDataGeneral.getScreenplayByAsLocalTime());
    }

    /**
     * Test getScreenplayByAsString() method.
     */
    @Test
    public void subTestGetScreenplayByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsString());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS String === " + jMetaDataGeneral.getScreenplayByAsString());
    }

    /**
     * Test getScreenplayByAsBoolean() method.
     */
    @Test
    public void subTestGetScreenplayByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsBoolean());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS Boolean === " + jMetaDataGeneral.getScreenplayByAsBoolean());
    }

    /**
     * Test getScreenplayByAsBigInteger() method.
     */
    @Test
    public void subTestGetScreenplayByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsBigInteger());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS BigInteger === " + jMetaDataGeneral.getScreenplayByAsBigInteger());
    }

    /**
     * Test getScreenplayByAsURL() method.
     */
    @Test
    public void subTestGetScreenplayByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getScreenplayByAsURL());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS URL === " + jMetaDataGeneral.getScreenplayByAsURL());
    }

    /**
     * Test getExecutiveProducerAsInteger() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsInteger());
        System.out.println("The name of an executive producer. AS Integer === " + jMetaDataGeneral.getExecutiveProducerAsInteger());
    }

    /**
     * Test getExecutiveProducerAsLong() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsLong());
        System.out.println("The name of an executive producer. AS Long === " + jMetaDataGeneral.getExecutiveProducerAsLong());
    }

    /**
     * Test getExecutiveProducerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsLocalDateTime());
        System.out.println("The name of an executive producer. AS LocalDateTime === " + jMetaDataGeneral.getExecutiveProducerAsLocalDateTime());
    }

    /**
     * Test getExecutiveProducerAsLocalTime() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsLocalTime());
        System.out.println("The name of an executive producer. AS LocalTime === " + jMetaDataGeneral.getExecutiveProducerAsLocalTime());
    }

    /**
     * Test getExecutiveProducerAsString() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsString());
        System.out.println("The name of an executive producer. AS String === " + jMetaDataGeneral.getExecutiveProducerAsString());
    }

    /**
     * Test getExecutiveProducerAsBoolean() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsBoolean());
        System.out.println("The name of an executive producer. AS Boolean === " + jMetaDataGeneral.getExecutiveProducerAsBoolean());
    }

    /**
     * Test getExecutiveProducerAsBigInteger() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsBigInteger());
        System.out.println("The name of an executive producer. AS BigInteger === " + jMetaDataGeneral.getExecutiveProducerAsBigInteger());
    }

    /**
     * Test getExecutiveProducerAsURL() method.
     */
    @Test
    public void subTestGetExecutiveProducerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getExecutiveProducerAsURL());
        System.out.println("The name of an executive producer. AS URL === " + jMetaDataGeneral.getExecutiveProducerAsURL());
    }

    /**
     * Test getISRCAsInteger() method.
     */
    @Test
    public void subTestGetISRCAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsInteger());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS Integer === " + jMetaDataGeneral.getISRCAsInteger());
    }

    /**
     * Test getISRCAsLong() method.
     */
    @Test
    public void subTestGetISRCAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsLong());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS Long === " + jMetaDataGeneral.getISRCAsLong());
    }

    /**
     * Test getISRCAsLocalDateTime() method.
     */
    @Test
    public void subTestGetISRCAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsLocalDateTime());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS LocalDateTime === " + jMetaDataGeneral.getISRCAsLocalDateTime());
    }

    /**
     * Test getISRCAsLocalTime() method.
     */
    @Test
    public void subTestGetISRCAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsLocalTime());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS LocalTime === " + jMetaDataGeneral.getISRCAsLocalTime());
    }

    /**
     * Test getISRCAsString() method.
     */
    @Test
    public void subTestGetISRCAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsString());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS String === " + jMetaDataGeneral.getISRCAsString());
    }

    /**
     * Test getISRCAsBoolean() method.
     */
    @Test
    public void subTestGetISRCAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsBoolean());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS Boolean === " + jMetaDataGeneral.getISRCAsBoolean());
    }

    /**
     * Test getISRCAsBigInteger() method.
     */
    @Test
    public void subTestGetISRCAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsBigInteger());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS BigInteger === " + jMetaDataGeneral.getISRCAsBigInteger());
    }

    /**
     * Test getISRCAsURL() method.
     */
    @Test
    public void subTestGetISRCAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getISRCAsURL());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS URL === " + jMetaDataGeneral.getISRCAsURL());
    }

    /**
     * Test getStreamSizeProportionAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsInteger());
        System.out.println("Stream size divided by file size AS Integer === " + jMetaDataGeneral.getStreamSizeProportionAsInteger());
    }

    /**
     * Test getStreamSizeProportionAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsLong());
        System.out.println("Stream size divided by file size AS Long === " + jMetaDataGeneral.getStreamSizeProportionAsLong());
    }

    /**
     * Test getStreamSizeProportionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsLocalDateTime());
        System.out.println("Stream size divided by file size AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeProportionAsLocalDateTime());
    }

    /**
     * Test getStreamSizeProportionAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsLocalTime());
        System.out.println("Stream size divided by file size AS LocalTime === " + jMetaDataGeneral.getStreamSizeProportionAsLocalTime());
    }

    /**
     * Test getStreamSizeProportionAsString() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsString());
        System.out.println("Stream size divided by file size AS String === " + jMetaDataGeneral.getStreamSizeProportionAsString());
    }

    /**
     * Test getStreamSizeProportionAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsBoolean());
        System.out.println("Stream size divided by file size AS Boolean === " + jMetaDataGeneral.getStreamSizeProportionAsBoolean());
    }

    /**
     * Test getStreamSizeProportionAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(BigInteger.valueOf(312), JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsBigInteger());
        System.out.println("Stream size divided by file size AS BigInteger === " + jMetaDataGeneral.getStreamSizeProportionAsBigInteger());
    }

    /**
     * Test getStreamSizeProportionAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeProportionAsURL());
        System.out.println("Stream size divided by file size AS URL === " + jMetaDataGeneral.getStreamSizeProportionAsURL());
    }

    /**
     * Test getHeaderSizeAsInteger() method.
     */
    @Test
    public void subTestGetHeaderSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsInteger());
        System.out.println("HeaderSize AS Integer === " + jMetaDataGeneral.getHeaderSizeAsInteger());
    }

    /**
     * Test getHeaderSizeAsLong() method.
     */
    @Test
    public void subTestGetHeaderSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsLong());
        System.out.println("HeaderSize AS Long === " + jMetaDataGeneral.getHeaderSizeAsLong());
    }

    /**
     * Test getHeaderSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetHeaderSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsLocalDateTime());
        System.out.println("HeaderSize AS LocalDateTime === " + jMetaDataGeneral.getHeaderSizeAsLocalDateTime());
    }

    /**
     * Test getHeaderSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetHeaderSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsLocalTime());
        System.out.println("HeaderSize AS LocalTime === " + jMetaDataGeneral.getHeaderSizeAsLocalTime());
    }

    /**
     * Test getHeaderSizeAsString() method.
     */
    @Test
    public void subTestGetHeaderSizeAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsString());
        System.out.println("HeaderSize AS String === " + jMetaDataGeneral.getHeaderSizeAsString());
    }

    /**
     * Test getHeaderSizeAsBoolean() method.
     */
    @Test
    public void subTestGetHeaderSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsBoolean());
        System.out.println("HeaderSize AS Boolean === " + jMetaDataGeneral.getHeaderSizeAsBoolean());
    }

    /**
     * Test getHeaderSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetHeaderSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsBigInteger());
        System.out.println("HeaderSize AS BigInteger === " + jMetaDataGeneral.getHeaderSizeAsBigInteger());
    }

    /**
     * Test getHeaderSizeAsURL() method.
     */
    @Test
    public void subTestGetHeaderSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getHeaderSizeAsURL());
        System.out.println("HeaderSize AS URL === " + jMetaDataGeneral.getHeaderSizeAsURL());
    }

    /**
     * Test getEncodedLibrarySettingsAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsInteger());
        System.out.println("Parameters used by the software AS Integer === " + jMetaDataGeneral.getEncodedLibrarySettingsAsInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsLong());
        System.out.println("Parameters used by the software AS Long === " + jMetaDataGeneral.getEncodedLibrarySettingsAsLong());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsLocalDateTime());
        System.out.println("Parameters used by the software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibrarySettingsAsLocalDateTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsLocalTime());
        System.out.println("Parameters used by the software AS LocalTime === " + jMetaDataGeneral.getEncodedLibrarySettingsAsLocalTime());
    }

    /**
     * Test getEncodedLibrarySettingsAsString() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsString());
        System.out.println("Parameters used by the software AS String === " + jMetaDataGeneral.getEncodedLibrarySettingsAsString());
    }

    /**
     * Test getEncodedLibrarySettingsAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsBoolean());
        System.out.println("Parameters used by the software AS Boolean === " + jMetaDataGeneral.getEncodedLibrarySettingsAsBoolean());
    }

    /**
     * Test getEncodedLibrarySettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsBigInteger());
        System.out.println("Parameters used by the software AS BigInteger === " + jMetaDataGeneral.getEncodedLibrarySettingsAsBigInteger());
    }

    /**
     * Test getEncodedLibrarySettingsAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibrarySettingsAsURL());
        System.out.println("Parameters used by the software AS URL === " + jMetaDataGeneral.getEncodedLibrarySettingsAsURL());
    }

    /**
     * Test getContentTypeAsInteger() method.
     */
    @Test
    public void subTestGetContentTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsInteger());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS Integer === " + jMetaDataGeneral.getContentTypeAsInteger());
    }

    /**
     * Test getContentTypeAsLong() method.
     */
    @Test
    public void subTestGetContentTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsLong());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS Long === " + jMetaDataGeneral.getContentTypeAsLong());
    }

    /**
     * Test getContentTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetContentTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsLocalDateTime());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS LocalDateTime === " + jMetaDataGeneral.getContentTypeAsLocalDateTime());
    }

    /**
     * Test getContentTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetContentTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsLocalTime());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS LocalTime === " + jMetaDataGeneral.getContentTypeAsLocalTime());
    }

    /**
     * Test getContentTypeAsString() method.
     */
    @Test
    public void subTestGetContentTypeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsString());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS String === " + jMetaDataGeneral.getContentTypeAsString());
    }

    /**
     * Test getContentTypeAsBoolean() method.
     */
    @Test
    public void subTestGetContentTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsBoolean());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS Boolean === " + jMetaDataGeneral.getContentTypeAsBoolean());
    }

    /**
     * Test getContentTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetContentTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsBigInteger());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS BigInteger === " + jMetaDataGeneral.getContentTypeAsBigInteger());
    }

    /**
     * Test getContentTypeAsURL() method.
     */
    @Test
    public void subTestGetContentTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getContentTypeAsURL());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS URL === " + jMetaDataGeneral.getContentTypeAsURL());
    }

    /**
     * Test getCoverDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsInteger());
        System.out.println("short descriptio, e.g. Earth in space AS Integer === " + jMetaDataGeneral.getCoverDescriptionAsInteger());
    }

    /**
     * Test getCoverDescriptionAsLong() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsLong());
        System.out.println("short descriptio, e.g. Earth in space AS Long === " + jMetaDataGeneral.getCoverDescriptionAsLong());
    }

    /**
     * Test getCoverDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsLocalDateTime());
        System.out.println("short descriptio, e.g. Earth in space AS LocalDateTime === " + jMetaDataGeneral.getCoverDescriptionAsLocalDateTime());
    }

    /**
     * Test getCoverDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsLocalTime());
        System.out.println("short descriptio, e.g. Earth in space AS LocalTime === " + jMetaDataGeneral.getCoverDescriptionAsLocalTime());
    }

    /**
     * Test getCoverDescriptionAsString() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsString());
        System.out.println("short descriptio, e.g. Earth in space AS String === " + jMetaDataGeneral.getCoverDescriptionAsString());
    }

    /**
     * Test getCoverDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsBoolean());
        System.out.println("short descriptio, e.g. Earth in space AS Boolean === " + jMetaDataGeneral.getCoverDescriptionAsBoolean());
    }

    /**
     * Test getCoverDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsBigInteger());
        System.out.println("short descriptio, e.g. Earth in space AS BigInteger === " + jMetaDataGeneral.getCoverDescriptionAsBigInteger());
    }

    /**
     * Test getCoverDescriptionAsURL() method.
     */
    @Test
    public void subTestGetCoverDescriptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoverDescriptionAsURL());
        System.out.println("short descriptio, e.g. Earth in space AS URL === " + jMetaDataGeneral.getCoverDescriptionAsURL());
    }

    /**
     * Test getCountAsInteger() method.
     */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsInteger());
        System.out.println("Count of objects available in this stream AS Integer === " + jMetaDataGeneral.getCountAsInteger());
    }

    /**
     * Test getCountAsLong() method.
     */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLong());
        System.out.println("Count of objects available in this stream AS Long === " + jMetaDataGeneral.getCountAsLong());
    }

    /**
     * Test getCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLocalDateTime());
        System.out.println("Count of objects available in this stream AS LocalDateTime === " + jMetaDataGeneral.getCountAsLocalDateTime());
    }

    /**
     * Test getCountAsLocalTime() method.
     */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsLocalTime());
        System.out.println("Count of objects available in this stream AS LocalTime === " + jMetaDataGeneral.getCountAsLocalTime());
    }

    /**
     * Test getCountAsString() method.
     */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsString());
        System.out.println("Count of objects available in this stream AS String === " + jMetaDataGeneral.getCountAsString());
    }

    /**
     * Test getCountAsBoolean() method.
     */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsBoolean());
        System.out.println("Count of objects available in this stream AS Boolean === " + jMetaDataGeneral.getCountAsBoolean());
    }

    /**
     * Test getCountAsBigInteger() method.
     */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsBigInteger());
        System.out.println("Count of objects available in this stream AS BigInteger === " + jMetaDataGeneral.getCountAsBigInteger());
    }

    /**
     * Test getCountAsURL() method.
     */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountAsURL());
        System.out.println("Count of objects available in this stream AS URL === " + jMetaDataGeneral.getCountAsURL());
    }

    /**
     * Test getEncryptionAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsInteger());
        System.out.println("Encryption AS Integer === " + jMetaDataGeneral.getEncryptionAsInteger());
    }

    /**
     * Test getEncryptionAsLong() method.
     */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsLong());
        System.out.println("Encryption AS Long === " + jMetaDataGeneral.getEncryptionAsLong());
    }

    /**
     * Test getEncryptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsLocalDateTime());
        System.out.println("Encryption AS LocalDateTime === " + jMetaDataGeneral.getEncryptionAsLocalDateTime());
    }

    /**
     * Test getEncryptionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsLocalTime());
        System.out.println("Encryption AS LocalTime === " + jMetaDataGeneral.getEncryptionAsLocalTime());
    }

    /**
     * Test getEncryptionAsString() method.
     */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsString());
        System.out.println("Encryption AS String === " + jMetaDataGeneral.getEncryptionAsString());
    }

    /**
     * Test getEncryptionAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsBoolean());
        System.out.println("Encryption AS Boolean === " + jMetaDataGeneral.getEncryptionAsBoolean());
    }

    /**
     * Test getEncryptionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsBigInteger());
        System.out.println("Encryption AS BigInteger === " + jMetaDataGeneral.getEncryptionAsBigInteger());
    }

    /**
     * Test getEncryptionAsURL() method.
     */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionAsURL());
        System.out.println("Encryption AS URL === " + jMetaDataGeneral.getEncryptionAsURL());
    }

    /**
     * Test getFrameRateNumAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsInteger());
        System.out.println("Frames per second, numerator AS Integer === " + jMetaDataGeneral.getFrameRateNumAsInteger());
    }

    /**
     * Test getFrameRateNumAsLong() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsLong());
        System.out.println("Frames per second, numerator AS Long === " + jMetaDataGeneral.getFrameRateNumAsLong());
    }

    /**
     * Test getFrameRateNumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsLocalDateTime());
        System.out.println("Frames per second, numerator AS LocalDateTime === " + jMetaDataGeneral.getFrameRateNumAsLocalDateTime());
    }

    /**
     * Test getFrameRateNumAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsLocalTime());
        System.out.println("Frames per second, numerator AS LocalTime === " + jMetaDataGeneral.getFrameRateNumAsLocalTime());
    }

    /**
     * Test getFrameRateNumAsString() method.
     */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsString());
        System.out.println("Frames per second, numerator AS String === " + jMetaDataGeneral.getFrameRateNumAsString());
    }

    /**
     * Test getFrameRateNumAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsBoolean());
        System.out.println("Frames per second, numerator AS Boolean === " + jMetaDataGeneral.getFrameRateNumAsBoolean());
    }

    /**
     * Test getFrameRateNumAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsBigInteger());
        System.out.println("Frames per second, numerator AS BigInteger === " + jMetaDataGeneral.getFrameRateNumAsBigInteger());
    }

    /**
     * Test getFrameRateNumAsURL() method.
     */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateNumAsURL());
        System.out.println("Frames per second, numerator AS URL === " + jMetaDataGeneral.getFrameRateNumAsURL());
    }

    /**
     * Test getFormatVersionAsInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsInteger());
        System.out.println("Version of this format AS Integer === " + jMetaDataGeneral.getFormatVersionAsInteger());
    }

    /**
     * Test getFormatVersionAsLong() method.
     */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsLong());
        System.out.println("Version of this format AS Long === " + jMetaDataGeneral.getFormatVersionAsLong());
    }

    /**
     * Test getFormatVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsLocalDateTime());
        System.out.println("Version of this format AS LocalDateTime === " + jMetaDataGeneral.getFormatVersionAsLocalDateTime());
    }

    /**
     * Test getFormatVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsLocalTime());
        System.out.println("Version of this format AS LocalTime === " + jMetaDataGeneral.getFormatVersionAsLocalTime());
    }

    /**
     * Test getFormatVersionAsString() method.
     */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsString());
        System.out.println("Version of this format AS String === " + jMetaDataGeneral.getFormatVersionAsString());
    }

    /**
     * Test getFormatVersionAsBoolean() method.
     */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsBoolean());
        System.out.println("Version of this format AS Boolean === " + jMetaDataGeneral.getFormatVersionAsBoolean());
    }

    /**
     * Test getFormatVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsBigInteger());
        System.out.println("Version of this format AS BigInteger === " + jMetaDataGeneral.getFormatVersionAsBigInteger());
    }

    /**
     * Test getFormatVersionAsURL() method.
     */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatVersionAsURL());
        System.out.println("Version of this format AS URL === " + jMetaDataGeneral.getFormatVersionAsURL());
    }

    /**
     * Test getStreamKindPosAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS Integer === " + jMetaDataGeneral.getStreamKindPosAsInteger());
    }

    /**
     * Test getStreamKindPosAsLong() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsLong());
        System.out.println("When multiple streams, number of the stream (base=1) AS Long === " + jMetaDataGeneral.getStreamKindPosAsLong());
    }

    /**
     * Test getStreamKindPosAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsLocalDateTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalDateTime === " + jMetaDataGeneral.getStreamKindPosAsLocalDateTime());
    }

    /**
     * Test getStreamKindPosAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsLocalTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalTime === " + jMetaDataGeneral.getStreamKindPosAsLocalTime());
    }

    /**
     * Test getStreamKindPosAsString() method.
     */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsString());
        System.out.println("When multiple streams, number of the stream (base=1) AS String === " + jMetaDataGeneral.getStreamKindPosAsString());
    }

    /**
     * Test getStreamKindPosAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsBoolean());
        System.out.println("When multiple streams, number of the stream (base=1) AS Boolean === " + jMetaDataGeneral.getStreamKindPosAsBoolean());
    }

    /**
     * Test getStreamKindPosAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsBigInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS BigInteger === " + jMetaDataGeneral.getStreamKindPosAsBigInteger());
    }

    /**
     * Test getStreamKindPosAsURL() method.
     */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindPosAsURL());
        System.out.println("When multiple streams, number of the stream (base=1) AS URL === " + jMetaDataGeneral.getStreamKindPosAsURL());
    }

    /**
     * Test getOriginalSourceMediumIDAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataGeneral.getOriginalSourceMediumIDAsInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataGeneral.getOriginalSourceMediumIDAsLong());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceMediumIDAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataGeneral.getOriginalSourceMediumIDAsLocalTime());
    }

    /**
     * Test getOriginalSourceMediumIDAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataGeneral.getOriginalSourceMediumIDAsString());
    }

    /**
     * Test getOriginalSourceMediumIDAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataGeneral.getOriginalSourceMediumIDAsBoolean());
    }

    /**
     * Test getOriginalSourceMediumIDAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataGeneral.getOriginalSourceMediumIDAsBigInteger());
    }

    /**
     * Test getOriginalSourceMediumIDAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceMediumIDAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataGeneral.getOriginalSourceMediumIDAsURL());
    }

    /**
     * Test getDurationStringAsInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataGeneral.getDurationStringAsInteger());
    }

    /**
     * Test getDurationStringAsLong() method.
     */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataGeneral.getDurationStringAsLong());
    }

    /**
     * Test getDurationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataGeneral.getDurationStringAsLocalDateTime());
    }

    /**
     * Test getDurationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataGeneral.getDurationStringAsLocalTime());
    }

    /**
     * Test getDurationStringAsString() method.
     */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataGeneral.getDurationStringAsString());
    }

    /**
     * Test getDurationStringAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataGeneral.getDurationStringAsBoolean());
    }

    /**
     * Test getDurationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataGeneral.getDurationStringAsBigInteger());
    }

    /**
     * Test getDurationStringAsURL() method.
     */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStringAsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataGeneral.getDurationStringAsURL());
    }

    /**
     * Test getServiceTypeAsInteger() method.
     */
    @Test
    public void subTestGetServiceTypeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsInteger());
        System.out.println("ServiceType AS Integer === " + jMetaDataGeneral.getServiceTypeAsInteger());
    }

    /**
     * Test getServiceTypeAsLong() method.
     */
    @Test
    public void subTestGetServiceTypeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsLong());
        System.out.println("ServiceType AS Long === " + jMetaDataGeneral.getServiceTypeAsLong());
    }

    /**
     * Test getServiceTypeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetServiceTypeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsLocalDateTime());
        System.out.println("ServiceType AS LocalDateTime === " + jMetaDataGeneral.getServiceTypeAsLocalDateTime());
    }

    /**
     * Test getServiceTypeAsLocalTime() method.
     */
    @Test
    public void subTestGetServiceTypeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsLocalTime());
        System.out.println("ServiceType AS LocalTime === " + jMetaDataGeneral.getServiceTypeAsLocalTime());
    }

    /**
     * Test getServiceTypeAsString() method.
     */
    @Test
    public void subTestGetServiceTypeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsString());
        System.out.println("ServiceType AS String === " + jMetaDataGeneral.getServiceTypeAsString());
    }

    /**
     * Test getServiceTypeAsBoolean() method.
     */
    @Test
    public void subTestGetServiceTypeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsBoolean());
        System.out.println("ServiceType AS Boolean === " + jMetaDataGeneral.getServiceTypeAsBoolean());
    }

    /**
     * Test getServiceTypeAsBigInteger() method.
     */
    @Test
    public void subTestGetServiceTypeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsBigInteger());
        System.out.println("ServiceType AS BigInteger === " + jMetaDataGeneral.getServiceTypeAsBigInteger());
    }

    /**
     * Test getServiceTypeAsURL() method.
     */
    @Test
    public void subTestGetServiceTypeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getServiceTypeAsURL());
        System.out.println("ServiceType AS URL === " + jMetaDataGeneral.getServiceTypeAsURL());
    }

    /**
     * Test getOverallBitRateNominalAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsInteger());
        System.out.println("Nominal Bit rate in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateNominalAsInteger());
    }

    /**
     * Test getOverallBitRateNominalAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsLong());
        System.out.println("Nominal Bit rate in bps AS Long === " + jMetaDataGeneral.getOverallBitRateNominalAsLong());
    }

    /**
     * Test getOverallBitRateNominalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsLocalDateTime());
        System.out.println("Nominal Bit rate in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateNominalAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateNominalAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsLocalTime());
        System.out.println("Nominal Bit rate in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateNominalAsLocalTime());
    }

    /**
     * Test getOverallBitRateNominalAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsString());
        System.out.println("Nominal Bit rate in bps AS String === " + jMetaDataGeneral.getOverallBitRateNominalAsString());
    }

    /**
     * Test getOverallBitRateNominalAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsBoolean());
        System.out.println("Nominal Bit rate in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateNominalAsBoolean());
    }

    /**
     * Test getOverallBitRateNominalAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsBigInteger());
        System.out.println("Nominal Bit rate in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateNominalAsBigInteger());
    }

    /**
     * Test getOverallBitRateNominalAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalAsURL());
        System.out.println("Nominal Bit rate in bps AS URL === " + jMetaDataGeneral.getOverallBitRateNominalAsURL());
    }

    /**
     * Test getIDAsInteger() method.
     */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataGeneral.getIDAsInteger());
    }

    /**
     * Test getIDAsLong() method.
     */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataGeneral.getIDAsLong());
    }

    /**
     * Test getIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getIDAsLocalDateTime());
    }

    /**
     * Test getIDAsLocalTime() method.
     */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getIDAsLocalTime());
    }

    /**
     * Test getIDAsString() method.
     */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataGeneral.getIDAsString());
    }

    /**
     * Test getIDAsBoolean() method.
     */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getIDAsBoolean());
    }

    /**
     * Test getIDAsBigInteger() method.
     */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getIDAsBigInteger());
    }

    /**
     * Test getIDAsURL() method.
     */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIDAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataGeneral.getIDAsURL());
    }

    /**
     * Test getEncodedLibraryDateAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsInteger());
        System.out.println("Release date of software AS Integer === " + jMetaDataGeneral.getEncodedLibraryDateAsInteger());
    }

    /**
     * Test getEncodedLibraryDateAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsLong());
        System.out.println("Release date of software AS Long === " + jMetaDataGeneral.getEncodedLibraryDateAsLong());
    }

    /**
     * Test getEncodedLibraryDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsLocalDateTime());
        System.out.println("Release date of software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryDateAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryDateAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsLocalTime());
        System.out.println("Release date of software AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryDateAsLocalTime());
    }

    /**
     * Test getEncodedLibraryDateAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsString());
        System.out.println("Release date of software AS String === " + jMetaDataGeneral.getEncodedLibraryDateAsString());
    }

    /**
     * Test getEncodedLibraryDateAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsBoolean());
        System.out.println("Release date of software AS Boolean === " + jMetaDataGeneral.getEncodedLibraryDateAsBoolean());
    }

    /**
     * Test getEncodedLibraryDateAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsBigInteger());
        System.out.println("Release date of software AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryDateAsBigInteger());
    }

    /**
     * Test getEncodedLibraryDateAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryDateAsURL());
        System.out.println("Release date of software AS URL === " + jMetaDataGeneral.getEncodedLibraryDateAsURL());
    }

    /**
     * Test getMenuIDStringAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataGeneral.getMenuIDStringAsInteger());
    }

    /**
     * Test getMenuIDStringAsLong() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataGeneral.getMenuIDStringAsLong());
    }

    /**
     * Test getMenuIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getMenuIDStringAsLocalDateTime());
    }

    /**
     * Test getMenuIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getMenuIDStringAsLocalTime());
    }

    /**
     * Test getMenuIDStringAsString() method.
     */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataGeneral.getMenuIDStringAsString());
    }

    /**
     * Test getMenuIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getMenuIDStringAsBoolean());
    }

    /**
     * Test getMenuIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getMenuIDStringAsBigInteger());
    }

    /**
     * Test getMenuIDStringAsURL() method.
     */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDStringAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataGeneral.getMenuIDStringAsURL());
    }

    /**
     * Test getFooterSizeAsInteger() method.
     */
    @Test
    public void subTestGetFooterSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsInteger());
        System.out.println("FooterSize AS Integer === " + jMetaDataGeneral.getFooterSizeAsInteger());
    }

    /**
     * Test getFooterSizeAsLong() method.
     */
    @Test
    public void subTestGetFooterSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsLong());
        System.out.println("FooterSize AS Long === " + jMetaDataGeneral.getFooterSizeAsLong());
    }

    /**
     * Test getFooterSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFooterSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsLocalDateTime());
        System.out.println("FooterSize AS LocalDateTime === " + jMetaDataGeneral.getFooterSizeAsLocalDateTime());
    }

    /**
     * Test getFooterSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetFooterSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsLocalTime());
        System.out.println("FooterSize AS LocalTime === " + jMetaDataGeneral.getFooterSizeAsLocalTime());
    }

    /**
     * Test getFooterSizeAsString() method.
     */
    @Test
    public void subTestGetFooterSizeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsString());
        System.out.println("FooterSize AS String === " + jMetaDataGeneral.getFooterSizeAsString());
    }

    /**
     * Test getFooterSizeAsBoolean() method.
     */
    @Test
    public void subTestGetFooterSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsBoolean());
        System.out.println("FooterSize AS Boolean === " + jMetaDataGeneral.getFooterSizeAsBoolean());
    }

    /**
     * Test getFooterSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetFooterSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsBigInteger());
        System.out.println("FooterSize AS BigInteger === " + jMetaDataGeneral.getFooterSizeAsBigInteger());
    }

    /**
     * Test getFooterSizeAsURL() method.
     */
    @Test
    public void subTestGetFooterSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFooterSizeAsURL());
        System.out.println("FooterSize AS URL === " + jMetaDataGeneral.getFooterSizeAsURL());
    }

    /**
     * Test getTaggedApplicationAsInteger() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsInteger());
        System.out.println("Software used to tag this file AS Integer === " + jMetaDataGeneral.getTaggedApplicationAsInteger());
    }

    /**
     * Test getTaggedApplicationAsLong() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsLong());
        System.out.println("Software used to tag this file AS Long === " + jMetaDataGeneral.getTaggedApplicationAsLong());
    }

    /**
     * Test getTaggedApplicationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsLocalDateTime());
        System.out.println("Software used to tag this file AS LocalDateTime === " + jMetaDataGeneral.getTaggedApplicationAsLocalDateTime());
    }

    /**
     * Test getTaggedApplicationAsLocalTime() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsLocalTime());
        System.out.println("Software used to tag this file AS LocalTime === " + jMetaDataGeneral.getTaggedApplicationAsLocalTime());
    }

    /**
     * Test getTaggedApplicationAsString() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsString());
        System.out.println("Software used to tag this file AS String === " + jMetaDataGeneral.getTaggedApplicationAsString());
    }

    /**
     * Test getTaggedApplicationAsBoolean() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsBoolean());
        System.out.println("Software used to tag this file AS Boolean === " + jMetaDataGeneral.getTaggedApplicationAsBoolean());
    }

    /**
     * Test getTaggedApplicationAsBigInteger() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsBigInteger());
        System.out.println("Software used to tag this file AS BigInteger === " + jMetaDataGeneral.getTaggedApplicationAsBigInteger());
    }

    /**
     * Test getTaggedApplicationAsURL() method.
     */
    @Test
    public void subTestGetTaggedApplicationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTaggedApplicationAsURL());
        System.out.println("Software used to tag this file AS URL === " + jMetaDataGeneral.getTaggedApplicationAsURL());
    }

    /**
     * Test getTermsOfUseAsInteger() method.
     */
    @Test
    public void subTestGetTermsOfUseAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsInteger());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS Integer === " + jMetaDataGeneral.getTermsOfUseAsInteger());
    }

    /**
     * Test getTermsOfUseAsLong() method.
     */
    @Test
    public void subTestGetTermsOfUseAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsLong());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS Long === " + jMetaDataGeneral.getTermsOfUseAsLong());
    }

    /**
     * Test getTermsOfUseAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTermsOfUseAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsLocalDateTime());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS LocalDateTime === " + jMetaDataGeneral.getTermsOfUseAsLocalDateTime());
    }

    /**
     * Test getTermsOfUseAsLocalTime() method.
     */
    @Test
    public void subTestGetTermsOfUseAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsLocalTime());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS LocalTime === " + jMetaDataGeneral.getTermsOfUseAsLocalTime());
    }

    /**
     * Test getTermsOfUseAsString() method.
     */
    @Test
    public void subTestGetTermsOfUseAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsString());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS String === " + jMetaDataGeneral.getTermsOfUseAsString());
    }

    /**
     * Test getTermsOfUseAsBoolean() method.
     */
    @Test
    public void subTestGetTermsOfUseAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsBoolean());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS Boolean === " + jMetaDataGeneral.getTermsOfUseAsBoolean());
    }

    /**
     * Test getTermsOfUseAsBigInteger() method.
     */
    @Test
    public void subTestGetTermsOfUseAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsBigInteger());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS BigInteger === " + jMetaDataGeneral.getTermsOfUseAsBigInteger());
    }

    /**
     * Test getTermsOfUseAsURL() method.
     */
    @Test
    public void subTestGetTermsOfUseAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTermsOfUseAsURL());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS URL === " + jMetaDataGeneral.getTermsOfUseAsURL());
    }

    /**
     * Test getOverallBitRateAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsInteger());
        System.out.println("Bit rate of all streams in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateAsInteger());
    }

    /**
     * Test getOverallBitRateAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsLong());
        System.out.println("Bit rate of all streams in bps AS Long === " + jMetaDataGeneral.getOverallBitRateAsLong());
    }

    /**
     * Test getOverallBitRateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsLocalDateTime());
        System.out.println("Bit rate of all streams in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsLocalTime());
        System.out.println("Bit rate of all streams in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateAsLocalTime());
    }

    /**
     * Test getOverallBitRateAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateAsString() {
        assertEquals("3735331", JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsString());
        System.out.println("Bit rate of all streams in bps AS String === " + jMetaDataGeneral.getOverallBitRateAsString());
    }

    /**
     * Test getOverallBitRateAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsBoolean());
        System.out.println("Bit rate of all streams in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateAsBoolean());
    }

    /**
     * Test getOverallBitRateAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsBigInteger());
        System.out.println("Bit rate of all streams in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateAsBigInteger());
    }

    /**
     * Test getOverallBitRateAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateAsURL());
        System.out.println("Bit rate of all streams in bps AS URL === " + jMetaDataGeneral.getOverallBitRateAsURL());
    }

    /**
     * Test getDirectorAsInteger() method.
     */
    @Test
    public void subTestGetDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsInteger());
        System.out.println("Name of the director. AS Integer === " + jMetaDataGeneral.getDirectorAsInteger());
    }

    /**
     * Test getDirectorAsLong() method.
     */
    @Test
    public void subTestGetDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsLong());
        System.out.println("Name of the director. AS Long === " + jMetaDataGeneral.getDirectorAsLong());
    }

    /**
     * Test getDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsLocalDateTime());
        System.out.println("Name of the director. AS LocalDateTime === " + jMetaDataGeneral.getDirectorAsLocalDateTime());
    }

    /**
     * Test getDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsLocalTime());
        System.out.println("Name of the director. AS LocalTime === " + jMetaDataGeneral.getDirectorAsLocalTime());
    }

    /**
     * Test getDirectorAsString() method.
     */
    @Test
    public void subTestGetDirectorAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsString());
        System.out.println("Name of the director. AS String === " + jMetaDataGeneral.getDirectorAsString());
    }

    /**
     * Test getDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsBoolean());
        System.out.println("Name of the director. AS Boolean === " + jMetaDataGeneral.getDirectorAsBoolean());
    }

    /**
     * Test getDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsBigInteger());
        System.out.println("Name of the director. AS BigInteger === " + jMetaDataGeneral.getDirectorAsBigInteger());
    }

    /**
     * Test getDirectorAsURL() method.
     */
    @Test
    public void subTestGetDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDirectorAsURL());
        System.out.println("Name of the director. AS URL === " + jMetaDataGeneral.getDirectorAsURL());
    }

    /**
     * Test getGroupingAsInteger() method.
     */
    @Test
    public void subTestGetGroupingAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsInteger());
        System.out.println("iTunes grouping AS Integer === " + jMetaDataGeneral.getGroupingAsInteger());
    }

    /**
     * Test getGroupingAsLong() method.
     */
    @Test
    public void subTestGetGroupingAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsLong());
        System.out.println("iTunes grouping AS Long === " + jMetaDataGeneral.getGroupingAsLong());
    }

    /**
     * Test getGroupingAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGroupingAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsLocalDateTime());
        System.out.println("iTunes grouping AS LocalDateTime === " + jMetaDataGeneral.getGroupingAsLocalDateTime());
    }

    /**
     * Test getGroupingAsLocalTime() method.
     */
    @Test
    public void subTestGetGroupingAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsLocalTime());
        System.out.println("iTunes grouping AS LocalTime === " + jMetaDataGeneral.getGroupingAsLocalTime());
    }

    /**
     * Test getGroupingAsString() method.
     */
    @Test
    public void subTestGetGroupingAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsString());
        System.out.println("iTunes grouping AS String === " + jMetaDataGeneral.getGroupingAsString());
    }

    /**
     * Test getGroupingAsBoolean() method.
     */
    @Test
    public void subTestGetGroupingAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsBoolean());
        System.out.println("iTunes grouping AS Boolean === " + jMetaDataGeneral.getGroupingAsBoolean());
    }

    /**
     * Test getGroupingAsBigInteger() method.
     */
    @Test
    public void subTestGetGroupingAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsBigInteger());
        System.out.println("iTunes grouping AS BigInteger === " + jMetaDataGeneral.getGroupingAsBigInteger());
    }

    /**
     * Test getGroupingAsURL() method.
     */
    @Test
    public void subTestGetGroupingAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGroupingAsURL());
        System.out.println("iTunes grouping AS URL === " + jMetaDataGeneral.getGroupingAsURL());
    }

    /**
     * Test getOtherLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsInteger());
        System.out.println("Chapters languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getOtherLanguageListAsInteger());
    }

    /**
     * Test getOtherLanguageListAsLong() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsLong());
        System.out.println("Chapters languages in this file, separated by / AS Long === " + jMetaDataGeneral.getOtherLanguageListAsLong());
    }

    /**
     * Test getOtherLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsLocalDateTime());
        System.out.println("Chapters languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getOtherLanguageListAsLocalDateTime());
    }

    /**
     * Test getOtherLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsLocalTime());
        System.out.println("Chapters languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getOtherLanguageListAsLocalTime());
    }

    /**
     * Test getOtherLanguageListAsString() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsString());
        System.out.println("Chapters languages in this file, separated by / AS String === " + jMetaDataGeneral.getOtherLanguageListAsString());
    }

    /**
     * Test getOtherLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsBoolean());
        System.out.println("Chapters languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getOtherLanguageListAsBoolean());
    }

    /**
     * Test getOtherLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsBigInteger());
        System.out.println("Chapters languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getOtherLanguageListAsBigInteger());
    }

    /**
     * Test getOtherLanguageListAsURL() method.
     */
    @Test
    public void subTestGetOtherLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherLanguageListAsURL());
        System.out.println("Chapters languages in this file, separated by / AS URL === " + jMetaDataGeneral.getOtherLanguageListAsURL());
    }

    /**
     * Test getMoodAsInteger() method.
     */
    @Test
    public void subTestGetMoodAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsInteger());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS Integer === " + jMetaDataGeneral.getMoodAsInteger());
    }

    /**
     * Test getMoodAsLong() method.
     */
    @Test
    public void subTestGetMoodAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsLong());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS Long === " + jMetaDataGeneral.getMoodAsLong());
    }

    /**
     * Test getMoodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMoodAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsLocalDateTime());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS LocalDateTime === " + jMetaDataGeneral.getMoodAsLocalDateTime());
    }

    /**
     * Test getMoodAsLocalTime() method.
     */
    @Test
    public void subTestGetMoodAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsLocalTime());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS LocalTime === " + jMetaDataGeneral.getMoodAsLocalTime());
    }

    /**
     * Test getMoodAsString() method.
     */
    @Test
    public void subTestGetMoodAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsString());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS String === " + jMetaDataGeneral.getMoodAsString());
    }

    /**
     * Test getMoodAsBoolean() method.
     */
    @Test
    public void subTestGetMoodAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsBoolean());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS Boolean === " + jMetaDataGeneral.getMoodAsBoolean());
    }

    /**
     * Test getMoodAsBigInteger() method.
     */
    @Test
    public void subTestGetMoodAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsBigInteger());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS BigInteger === " + jMetaDataGeneral.getMoodAsBigInteger());
    }

    /**
     * Test getMoodAsURL() method.
     */
    @Test
    public void subTestGetMoodAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMoodAsURL());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS URL === " + jMetaDataGeneral.getMoodAsURL());
    }

    /**
     * Test getEncodedApplicationStringAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataGeneral.getEncodedApplicationStringAsInteger());
    }

    /**
     * Test getEncodedApplicationStringAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataGeneral.getEncodedApplicationStringAsLong());
    }

    /**
     * Test getEncodedApplicationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationStringAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationStringAsLocalTime());
    }

    /**
     * Test getEncodedApplicationStringAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataGeneral.getEncodedApplicationStringAsString());
    }

    /**
     * Test getEncodedApplicationStringAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataGeneral.getEncodedApplicationStringAsBoolean());
    }

    /**
     * Test getEncodedApplicationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationStringAsBigInteger());
    }

    /**
     * Test getEncodedApplicationStringAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationStringAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataGeneral.getEncodedApplicationStringAsURL());
    }

    /**
     * Test getAlbumMoreAsInteger() method.
     */
    @Test
    public void subTestGetAlbumMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsInteger());
        System.out.println("More infos about the album AS Integer === " + jMetaDataGeneral.getAlbumMoreAsInteger());
    }

    /**
     * Test getAlbumMoreAsLong() method.
     */
    @Test
    public void subTestGetAlbumMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsLong());
        System.out.println("More infos about the album AS Long === " + jMetaDataGeneral.getAlbumMoreAsLong());
    }

    /**
     * Test getAlbumMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsLocalDateTime());
        System.out.println("More infos about the album AS LocalDateTime === " + jMetaDataGeneral.getAlbumMoreAsLocalDateTime());
    }

    /**
     * Test getAlbumMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsLocalTime());
        System.out.println("More infos about the album AS LocalTime === " + jMetaDataGeneral.getAlbumMoreAsLocalTime());
    }

    /**
     * Test getAlbumMoreAsString() method.
     */
    @Test
    public void subTestGetAlbumMoreAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsString());
        System.out.println("More infos about the album AS String === " + jMetaDataGeneral.getAlbumMoreAsString());
    }

    /**
     * Test getAlbumMoreAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsBoolean());
        System.out.println("More infos about the album AS Boolean === " + jMetaDataGeneral.getAlbumMoreAsBoolean());
    }

    /**
     * Test getAlbumMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsBigInteger());
        System.out.println("More infos about the album AS BigInteger === " + jMetaDataGeneral.getAlbumMoreAsBigInteger());
    }

    /**
     * Test getAlbumMoreAsURL() method.
     */
    @Test
    public void subTestGetAlbumMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumMoreAsURL());
        System.out.println("More infos about the album AS URL === " + jMetaDataGeneral.getAlbumMoreAsURL());
    }

    /**
     * Test getCompilationStringAsInteger() method.
     */
    @Test
    public void subTestGetCompilationStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsInteger());
        System.out.println("iTunes compilation AS Integer === " + jMetaDataGeneral.getCompilationStringAsInteger());
    }

    /**
     * Test getCompilationStringAsLong() method.
     */
    @Test
    public void subTestGetCompilationStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsLong());
        System.out.println("iTunes compilation AS Long === " + jMetaDataGeneral.getCompilationStringAsLong());
    }

    /**
     * Test getCompilationStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCompilationStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsLocalDateTime());
        System.out.println("iTunes compilation AS LocalDateTime === " + jMetaDataGeneral.getCompilationStringAsLocalDateTime());
    }

    /**
     * Test getCompilationStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCompilationStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsLocalTime());
        System.out.println("iTunes compilation AS LocalTime === " + jMetaDataGeneral.getCompilationStringAsLocalTime());
    }

    /**
     * Test getCompilationStringAsString() method.
     */
    @Test
    public void subTestGetCompilationStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsString());
        System.out.println("iTunes compilation AS String === " + jMetaDataGeneral.getCompilationStringAsString());
    }

    /**
     * Test getCompilationStringAsBoolean() method.
     */
    @Test
    public void subTestGetCompilationStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsBoolean());
        System.out.println("iTunes compilation AS Boolean === " + jMetaDataGeneral.getCompilationStringAsBoolean());
    }

    /**
     * Test getCompilationStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCompilationStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsBigInteger());
        System.out.println("iTunes compilation AS BigInteger === " + jMetaDataGeneral.getCompilationStringAsBigInteger());
    }

    /**
     * Test getCompilationStringAsURL() method.
     */
    @Test
    public void subTestGetCompilationStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCompilationStringAsURL());
        System.out.println("iTunes compilation AS URL === " + jMetaDataGeneral.getCompilationStringAsURL());
    }

    /**
     * Test getCountryAsInteger() method.
     */
    @Test
    public void subTestGetCountryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsInteger());
        System.out.println("Country AS Integer === " + jMetaDataGeneral.getCountryAsInteger());
    }

    /**
     * Test getCountryAsLong() method.
     */
    @Test
    public void subTestGetCountryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsLong());
        System.out.println("Country AS Long === " + jMetaDataGeneral.getCountryAsLong());
    }

    /**
     * Test getCountryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCountryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsLocalDateTime());
        System.out.println("Country AS LocalDateTime === " + jMetaDataGeneral.getCountryAsLocalDateTime());
    }

    /**
     * Test getCountryAsLocalTime() method.
     */
    @Test
    public void subTestGetCountryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsLocalTime());
        System.out.println("Country AS LocalTime === " + jMetaDataGeneral.getCountryAsLocalTime());
    }

    /**
     * Test getCountryAsString() method.
     */
    @Test
    public void subTestGetCountryAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsString());
        System.out.println("Country AS String === " + jMetaDataGeneral.getCountryAsString());
    }

    /**
     * Test getCountryAsBoolean() method.
     */
    @Test
    public void subTestGetCountryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsBoolean());
        System.out.println("Country AS Boolean === " + jMetaDataGeneral.getCountryAsBoolean());
    }

    /**
     * Test getCountryAsBigInteger() method.
     */
    @Test
    public void subTestGetCountryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsBigInteger());
        System.out.println("Country AS BigInteger === " + jMetaDataGeneral.getCountryAsBigInteger());
    }

    /**
     * Test getCountryAsURL() method.
     */
    @Test
    public void subTestGetCountryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCountryAsURL());
        System.out.println("Country AS URL === " + jMetaDataGeneral.getCountryAsURL());
    }

    /**
     * Test getFileCreatedDateLocalAsInteger() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsInteger());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Integer === " + jMetaDataGeneral.getFileCreatedDateLocalAsInteger());
    }

    /**
     * Test getFileCreatedDateLocalAsLong() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsLong() {
        assertEquals(Long.valueOf(20170510123638816l), JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsLong());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Long === " + jMetaDataGeneral.getFileCreatedDateLocalAsLong());
    }

    /**
     * Test getFileCreatedDateLocalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsLocalDateTime());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalDateTime === " + jMetaDataGeneral.getFileCreatedDateLocalAsLocalDateTime());
    }

    /**
     * Test getFileCreatedDateLocalAsLocalTime() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsLocalTime());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalTime === " + jMetaDataGeneral.getFileCreatedDateLocalAsLocalTime());
    }

    /**
     * Test getFileCreatedDateLocalAsString() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsString());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS String === " + jMetaDataGeneral.getFileCreatedDateLocalAsString());
    }

    /**
     * Test getFileCreatedDateLocalAsBoolean() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsBoolean());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Boolean === " + jMetaDataGeneral.getFileCreatedDateLocalAsBoolean());
    }

    /**
     * Test getFileCreatedDateLocalAsBigInteger() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsBigInteger());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS BigInteger === " + jMetaDataGeneral.getFileCreatedDateLocalAsBigInteger());
    }

    /**
     * Test getFileCreatedDateLocalAsURL() method.
     */
    @Test
    public void subTestGetFileCreatedDateLocalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileCreatedDateLocalAsURL());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS URL === " + jMetaDataGeneral.getFileCreatedDateLocalAsURL());
    }

    /**
     * Test getOriginalLyricistAsInteger() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsInteger());
        System.out.println("Original lyricist(s)/text writer(s). AS Integer === " + jMetaDataGeneral.getOriginalLyricistAsInteger());
    }

    /**
     * Test getOriginalLyricistAsLong() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsLong());
        System.out.println("Original lyricist(s)/text writer(s). AS Long === " + jMetaDataGeneral.getOriginalLyricistAsLong());
    }

    /**
     * Test getOriginalLyricistAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsLocalDateTime());
        System.out.println("Original lyricist(s)/text writer(s). AS LocalDateTime === " + jMetaDataGeneral.getOriginalLyricistAsLocalDateTime());
    }

    /**
     * Test getOriginalLyricistAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsLocalTime());
        System.out.println("Original lyricist(s)/text writer(s). AS LocalTime === " + jMetaDataGeneral.getOriginalLyricistAsLocalTime());
    }

    /**
     * Test getOriginalLyricistAsString() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsString());
        System.out.println("Original lyricist(s)/text writer(s). AS String === " + jMetaDataGeneral.getOriginalLyricistAsString());
    }

    /**
     * Test getOriginalLyricistAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsBoolean());
        System.out.println("Original lyricist(s)/text writer(s). AS Boolean === " + jMetaDataGeneral.getOriginalLyricistAsBoolean());
    }

    /**
     * Test getOriginalLyricistAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsBigInteger());
        System.out.println("Original lyricist(s)/text writer(s). AS BigInteger === " + jMetaDataGeneral.getOriginalLyricistAsBigInteger());
    }

    /**
     * Test getOriginalLyricistAsURL() method.
     */
    @Test
    public void subTestGetOriginalLyricistAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalLyricistAsURL());
        System.out.println("Original lyricist(s)/text writer(s). AS URL === " + jMetaDataGeneral.getOriginalLyricistAsURL());
    }

    /**
     * Test getDescriptionAsInteger() method.
     */
    @Test
    public void subTestGetDescriptionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsInteger());
        System.out.println("A short description of the contents, such as Two birds flying. AS Integer === " + jMetaDataGeneral.getDescriptionAsInteger());
    }

    /**
     * Test getDescriptionAsLong() method.
     */
    @Test
    public void subTestGetDescriptionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsLong());
        System.out.println("A short description of the contents, such as Two birds flying. AS Long === " + jMetaDataGeneral.getDescriptionAsLong());
    }

    /**
     * Test getDescriptionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDescriptionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsLocalDateTime());
        System.out.println("A short description of the contents, such as Two birds flying. AS LocalDateTime === " + jMetaDataGeneral.getDescriptionAsLocalDateTime());
    }

    /**
     * Test getDescriptionAsLocalTime() method.
     */
    @Test
    public void subTestGetDescriptionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsLocalTime());
        System.out.println("A short description of the contents, such as Two birds flying. AS LocalTime === " + jMetaDataGeneral.getDescriptionAsLocalTime());
    }

    /**
     * Test getDescriptionAsString() method.
     */
    @Test
    public void subTestGetDescriptionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsString());
        System.out.println("A short description of the contents, such as Two birds flying. AS String === " + jMetaDataGeneral.getDescriptionAsString());
    }

    /**
     * Test getDescriptionAsBoolean() method.
     */
    @Test
    public void subTestGetDescriptionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsBoolean());
        System.out.println("A short description of the contents, such as Two birds flying. AS Boolean === " + jMetaDataGeneral.getDescriptionAsBoolean());
    }

    /**
     * Test getDescriptionAsBigInteger() method.
     */
    @Test
    public void subTestGetDescriptionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsBigInteger());
        System.out.println("A short description of the contents, such as Two birds flying. AS BigInteger === " + jMetaDataGeneral.getDescriptionAsBigInteger());
    }

    /**
     * Test getDescriptionAsURL() method.
     */
    @Test
    public void subTestGetDescriptionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDescriptionAsURL());
        System.out.println("A short description of the contents, such as Two birds flying. AS URL === " + jMetaDataGeneral.getDescriptionAsURL());
    }

    /**
     * Test getTextLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetTextLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsInteger());
        System.out.println("Text languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getTextLanguageListAsInteger());
    }

    /**
     * Test getTextLanguageListAsLong() method.
     */
    @Test
    public void subTestGetTextLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsLong());
        System.out.println("Text languages in this file, separated by / AS Long === " + jMetaDataGeneral.getTextLanguageListAsLong());
    }

    /**
     * Test getTextLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsLocalDateTime());
        System.out.println("Text languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getTextLanguageListAsLocalDateTime());
    }

    /**
     * Test getTextLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetTextLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsLocalTime());
        System.out.println("Text languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getTextLanguageListAsLocalTime());
    }

    /**
     * Test getTextLanguageListAsString() method.
     */
    @Test
    public void subTestGetTextLanguageListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsString());
        System.out.println("Text languages in this file, separated by / AS String === " + jMetaDataGeneral.getTextLanguageListAsString());
    }

    /**
     * Test getTextLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetTextLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsBoolean());
        System.out.println("Text languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getTextLanguageListAsBoolean());
    }

    /**
     * Test getTextLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetTextLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsBigInteger());
        System.out.println("Text languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getTextLanguageListAsBigInteger());
    }

    /**
     * Test getTextLanguageListAsURL() method.
     */
    @Test
    public void subTestGetTextLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextLanguageListAsURL());
        System.out.println("Text languages in this file, separated by / AS URL === " + jMetaDataGeneral.getTextLanguageListAsURL());
    }

    /**
     * Test getCroppedAsInteger() method.
     */
    @Test
    public void subTestGetCroppedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS Integer === " + jMetaDataGeneral.getCroppedAsInteger());
    }

    /**
     * Test getCroppedAsLong() method.
     */
    @Test
    public void subTestGetCroppedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsLong());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS Long === " + jMetaDataGeneral.getCroppedAsLong());
    }

    /**
     * Test getCroppedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCroppedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsLocalDateTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS LocalDateTime === " + jMetaDataGeneral.getCroppedAsLocalDateTime());
    }

    /**
     * Test getCroppedAsLocalTime() method.
     */
    @Test
    public void subTestGetCroppedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsLocalTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS LocalTime === " + jMetaDataGeneral.getCroppedAsLocalTime());
    }

    /**
     * Test getCroppedAsString() method.
     */
    @Test
    public void subTestGetCroppedAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsString());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS String === " + jMetaDataGeneral.getCroppedAsString());
    }

    /**
     * Test getCroppedAsBoolean() method.
     */
    @Test
    public void subTestGetCroppedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsBoolean());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS Boolean === " + jMetaDataGeneral.getCroppedAsBoolean());
    }

    /**
     * Test getCroppedAsBigInteger() method.
     */
    @Test
    public void subTestGetCroppedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsBigInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS BigInteger === " + jMetaDataGeneral.getCroppedAsBigInteger());
    }

    /**
     * Test getCroppedAsURL() method.
     */
    @Test
    public void subTestGetCroppedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCroppedAsURL());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS URL === " + jMetaDataGeneral.getCroppedAsURL());
    }

    /**
     * Test getInformAsInteger() method.
     */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsInteger());
        System.out.println("Last **Inform** call AS Integer === " + jMetaDataGeneral.getInformAsInteger());
    }

    /**
     * Test getInformAsLong() method.
     */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(Long.valueOf(102681023735l), JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsLong());
        System.out.println("Last **Inform** call AS Long === " + jMetaDataGeneral.getInformAsLong());
    }

    /**
     * Test getInformAsLocalDateTime() method.
     */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsLocalDateTime());
        System.out.println("Last **Inform** call AS LocalDateTime === " + jMetaDataGeneral.getInformAsLocalDateTime());
    }

    /**
     * Test getInformAsLocalTime() method.
     */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsLocalTime());
        System.out.println("Last **Inform** call AS LocalTime === " + jMetaDataGeneral.getInformAsLocalTime());
    }

    /**
     * Test getInformAsString() method.
     */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsString());
        System.out.println("Last **Inform** call AS String === " + jMetaDataGeneral.getInformAsString());
    }

    /**
     * Test getInformAsBoolean() method.
     */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsBoolean());
        System.out.println("Last **Inform** call AS Boolean === " + jMetaDataGeneral.getInformAsBoolean());
    }

    /**
     * Test getInformAsBigInteger() method.
     */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsBigInteger());
        System.out.println("Last **Inform** call AS BigInteger === " + jMetaDataGeneral.getInformAsBigInteger());
    }

    /**
     * Test getInformAsURL() method.
     */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getInformAsURL());
        System.out.println("Last **Inform** call AS URL === " + jMetaDataGeneral.getInformAsURL());
    }

    /**
     * Test getRecordedDateAsInteger() method.
     */
    @Test
    public void subTestGetRecordedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsInteger());
        System.out.println("The time/date/year that the recording began. AS Integer === " + jMetaDataGeneral.getRecordedDateAsInteger());
    }

    /**
     * Test getRecordedDateAsLong() method.
     */
    @Test
    public void subTestGetRecordedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsLong());
        System.out.println("The time/date/year that the recording began. AS Long === " + jMetaDataGeneral.getRecordedDateAsLong());
    }

    /**
     * Test getRecordedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRecordedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsLocalDateTime());
        System.out.println("The time/date/year that the recording began. AS LocalDateTime === " + jMetaDataGeneral.getRecordedDateAsLocalDateTime());
    }

    /**
     * Test getRecordedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetRecordedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsLocalTime());
        System.out.println("The time/date/year that the recording began. AS LocalTime === " + jMetaDataGeneral.getRecordedDateAsLocalTime());
    }

    /**
     * Test getRecordedDateAsString() method.
     */
    @Test
    public void subTestGetRecordedDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsString());
        System.out.println("The time/date/year that the recording began. AS String === " + jMetaDataGeneral.getRecordedDateAsString());
    }

    /**
     * Test getRecordedDateAsBoolean() method.
     */
    @Test
    public void subTestGetRecordedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsBoolean());
        System.out.println("The time/date/year that the recording began. AS Boolean === " + jMetaDataGeneral.getRecordedDateAsBoolean());
    }

    /**
     * Test getRecordedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetRecordedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsBigInteger());
        System.out.println("The time/date/year that the recording began. AS BigInteger === " + jMetaDataGeneral.getRecordedDateAsBigInteger());
    }

    /**
     * Test getRecordedDateAsURL() method.
     */
    @Test
    public void subTestGetRecordedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedDateAsURL());
        System.out.println("The time/date/year that the recording began. AS URL === " + jMetaDataGeneral.getRecordedDateAsURL());
    }

    /**
     * Test getMenuLanguageListAsInteger() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsInteger());
        System.out.println("Menu languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getMenuLanguageListAsInteger());
    }

    /**
     * Test getMenuLanguageListAsLong() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsLong());
        System.out.println("Menu languages in this file, separated by / AS Long === " + jMetaDataGeneral.getMenuLanguageListAsLong());
    }

    /**
     * Test getMenuLanguageListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsLocalDateTime());
        System.out.println("Menu languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getMenuLanguageListAsLocalDateTime());
    }

    /**
     * Test getMenuLanguageListAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsLocalTime());
        System.out.println("Menu languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getMenuLanguageListAsLocalTime());
    }

    /**
     * Test getMenuLanguageListAsString() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsString());
        System.out.println("Menu languages in this file, separated by / AS String === " + jMetaDataGeneral.getMenuLanguageListAsString());
    }

    /**
     * Test getMenuLanguageListAsBoolean() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsBoolean());
        System.out.println("Menu languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getMenuLanguageListAsBoolean());
    }

    /**
     * Test getMenuLanguageListAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsBigInteger());
        System.out.println("Menu languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getMenuLanguageListAsBigInteger());
    }

    /**
     * Test getMenuLanguageListAsURL() method.
     */
    @Test
    public void subTestGetMenuLanguageListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuLanguageListAsURL());
        System.out.println("Menu languages in this file, separated by / AS URL === " + jMetaDataGeneral.getMenuLanguageListAsURL());
    }

    /**
     * Test getFileSizeStringAsInteger() method.
     */
    @Test
    public void subTestGetFileSizeStringAsInteger() {
        assertEquals(Integer.valueOf(268), JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsInteger());
        System.out.println("File size (with measure) AS Integer === " + jMetaDataGeneral.getFileSizeStringAsInteger());
    }

    /**
     * Test getFileSizeStringAsLong() method.
     */
    @Test
    public void subTestGetFileSizeStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsLong());
        System.out.println("File size (with measure) AS Long === " + jMetaDataGeneral.getFileSizeStringAsLong());
    }

    /**
     * Test getFileSizeStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsLocalDateTime());
        System.out.println("File size (with measure) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeStringAsLocalDateTime());
    }

    /**
     * Test getFileSizeStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsLocalTime());
        System.out.println("File size (with measure) AS LocalTime === " + jMetaDataGeneral.getFileSizeStringAsLocalTime());
    }

    /**
     * Test getFileSizeStringAsString() method.
     */
    @Test
    public void subTestGetFileSizeStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsString());
        System.out.println("File size (with measure) AS String === " + jMetaDataGeneral.getFileSizeStringAsString());
    }

    /**
     * Test getFileSizeStringAsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsBoolean());
        System.out.println("File size (with measure) AS Boolean === " + jMetaDataGeneral.getFileSizeStringAsBoolean());
    }

    /**
     * Test getFileSizeStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsBigInteger());
        System.out.println("File size (with measure) AS BigInteger === " + jMetaDataGeneral.getFileSizeStringAsBigInteger());
    }

    /**
     * Test getFileSizeStringAsURL() method.
     */
    @Test
    public void subTestGetFileSizeStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeStringAsURL());
        System.out.println("File size (with measure) AS URL === " + jMetaDataGeneral.getFileSizeStringAsURL());
    }

    /**
     * Test getLawRatingReasonAsInteger() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsInteger());
        System.out.println("Reason for the law rating AS Integer === " + jMetaDataGeneral.getLawRatingReasonAsInteger());
    }

    /**
     * Test getLawRatingReasonAsLong() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsLong());
        System.out.println("Reason for the law rating AS Long === " + jMetaDataGeneral.getLawRatingReasonAsLong());
    }

    /**
     * Test getLawRatingReasonAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsLocalDateTime());
        System.out.println("Reason for the law rating AS LocalDateTime === " + jMetaDataGeneral.getLawRatingReasonAsLocalDateTime());
    }

    /**
     * Test getLawRatingReasonAsLocalTime() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsLocalTime());
        System.out.println("Reason for the law rating AS LocalTime === " + jMetaDataGeneral.getLawRatingReasonAsLocalTime());
    }

    /**
     * Test getLawRatingReasonAsString() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsString());
        System.out.println("Reason for the law rating AS String === " + jMetaDataGeneral.getLawRatingReasonAsString());
    }

    /**
     * Test getLawRatingReasonAsBoolean() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsBoolean());
        System.out.println("Reason for the law rating AS Boolean === " + jMetaDataGeneral.getLawRatingReasonAsBoolean());
    }

    /**
     * Test getLawRatingReasonAsBigInteger() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsBigInteger());
        System.out.println("Reason for the law rating AS BigInteger === " + jMetaDataGeneral.getLawRatingReasonAsBigInteger());
    }

    /**
     * Test getLawRatingReasonAsURL() method.
     */
    @Test
    public void subTestGetLawRatingReasonAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLawRatingReasonAsURL());
        System.out.println("Reason for the law rating AS URL === " + jMetaDataGeneral.getLawRatingReasonAsURL());
    }

    /**
     * Test getCodecIDCompatibleAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsInteger());
        System.out.println("Compatible CodecIDs AS Integer === " + jMetaDataGeneral.getCodecIDCompatibleAsInteger());
    }

    /**
     * Test getCodecIDCompatibleAsLong() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsLong());
        System.out.println("Compatible CodecIDs AS Long === " + jMetaDataGeneral.getCodecIDCompatibleAsLong());
    }

    /**
     * Test getCodecIDCompatibleAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsLocalDateTime());
        System.out.println("Compatible CodecIDs AS LocalDateTime === " + jMetaDataGeneral.getCodecIDCompatibleAsLocalDateTime());
    }

    /**
     * Test getCodecIDCompatibleAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsLocalTime());
        System.out.println("Compatible CodecIDs AS LocalTime === " + jMetaDataGeneral.getCodecIDCompatibleAsLocalTime());
    }

    /**
     * Test getCodecIDCompatibleAsString() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsString());
        System.out.println("Compatible CodecIDs AS String === " + jMetaDataGeneral.getCodecIDCompatibleAsString());
    }

    /**
     * Test getCodecIDCompatibleAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsBoolean());
        System.out.println("Compatible CodecIDs AS Boolean === " + jMetaDataGeneral.getCodecIDCompatibleAsBoolean());
    }

    /**
     * Test getCodecIDCompatibleAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsBigInteger());
        System.out.println("Compatible CodecIDs AS BigInteger === " + jMetaDataGeneral.getCodecIDCompatibleAsBigInteger());
    }

    /**
     * Test getCodecIDCompatibleAsURL() method.
     */
    @Test
    public void subTestGetCodecIDCompatibleAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDCompatibleAsURL());
        System.out.println("Compatible CodecIDs AS URL === " + jMetaDataGeneral.getCodecIDCompatibleAsURL());
    }

    /**
     * Test getDotsPerInchAsInteger() method.
     */
    @Test
    public void subTestGetDotsPerInchAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsInteger());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS Integer === " + jMetaDataGeneral.getDotsPerInchAsInteger());
    }

    /**
     * Test getDotsPerInchAsLong() method.
     */
    @Test
    public void subTestGetDotsPerInchAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsLong());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS Long === " + jMetaDataGeneral.getDotsPerInchAsLong());
    }

    /**
     * Test getDotsPerInchAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDotsPerInchAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsLocalDateTime());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS LocalDateTime === " + jMetaDataGeneral.getDotsPerInchAsLocalDateTime());
    }

    /**
     * Test getDotsPerInchAsLocalTime() method.
     */
    @Test
    public void subTestGetDotsPerInchAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsLocalTime());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS LocalTime === " + jMetaDataGeneral.getDotsPerInchAsLocalTime());
    }

    /**
     * Test getDotsPerInchAsString() method.
     */
    @Test
    public void subTestGetDotsPerInchAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsString());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS String === " + jMetaDataGeneral.getDotsPerInchAsString());
    }

    /**
     * Test getDotsPerInchAsBoolean() method.
     */
    @Test
    public void subTestGetDotsPerInchAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsBoolean());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS Boolean === " + jMetaDataGeneral.getDotsPerInchAsBoolean());
    }

    /**
     * Test getDotsPerInchAsBigInteger() method.
     */
    @Test
    public void subTestGetDotsPerInchAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsBigInteger());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS BigInteger === " + jMetaDataGeneral.getDotsPerInchAsBigInteger());
    }

    /**
     * Test getDotsPerInchAsURL() method.
     */
    @Test
    public void subTestGetDotsPerInchAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDotsPerInchAsURL());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS URL === " + jMetaDataGeneral.getDotsPerInchAsURL());
    }

    /**
     * Test getPlayedLastDateAsInteger() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsInteger());
        System.out.println("The date, the owner last played an item AS Integer === " + jMetaDataGeneral.getPlayedLastDateAsInteger());
    }

    /**
     * Test getPlayedLastDateAsLong() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsLong());
        System.out.println("The date, the owner last played an item AS Long === " + jMetaDataGeneral.getPlayedLastDateAsLong());
    }

    /**
     * Test getPlayedLastDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsLocalDateTime());
        System.out.println("The date, the owner last played an item AS LocalDateTime === " + jMetaDataGeneral.getPlayedLastDateAsLocalDateTime());
    }

    /**
     * Test getPlayedLastDateAsLocalTime() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsLocalTime());
        System.out.println("The date, the owner last played an item AS LocalTime === " + jMetaDataGeneral.getPlayedLastDateAsLocalTime());
    }

    /**
     * Test getPlayedLastDateAsString() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsString());
        System.out.println("The date, the owner last played an item AS String === " + jMetaDataGeneral.getPlayedLastDateAsString());
    }

    /**
     * Test getPlayedLastDateAsBoolean() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsBoolean());
        System.out.println("The date, the owner last played an item AS Boolean === " + jMetaDataGeneral.getPlayedLastDateAsBoolean());
    }

    /**
     * Test getPlayedLastDateAsBigInteger() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsBigInteger());
        System.out.println("The date, the owner last played an item AS BigInteger === " + jMetaDataGeneral.getPlayedLastDateAsBigInteger());
    }

    /**
     * Test getPlayedLastDateAsURL() method.
     */
    @Test
    public void subTestGetPlayedLastDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedLastDateAsURL());
        System.out.println("The date, the owner last played an item AS URL === " + jMetaDataGeneral.getPlayedLastDateAsURL());
    }

    /**
     * Test getFolderNameAsInteger() method.
     */
    @Test
    public void subTestGetFolderNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsInteger());
        System.out.println("Folder name only AS Integer === " + jMetaDataGeneral.getFolderNameAsInteger());
    }

    /**
     * Test getFolderNameAsLong() method.
     */
    @Test
    public void subTestGetFolderNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsLong());
        System.out.println("Folder name only AS Long === " + jMetaDataGeneral.getFolderNameAsLong());
    }

    /**
     * Test getFolderNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFolderNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsLocalDateTime());
        System.out.println("Folder name only AS LocalDateTime === " + jMetaDataGeneral.getFolderNameAsLocalDateTime());
    }

    /**
     * Test getFolderNameAsLocalTime() method.
     */
    @Test
    public void subTestGetFolderNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsLocalTime());
        System.out.println("Folder name only AS LocalTime === " + jMetaDataGeneral.getFolderNameAsLocalTime());
    }

    /**
     * Test getFolderNameAsString() method.
     */
    @Test
    public void subTestGetFolderNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsString());
        System.out.println("Folder name only AS String === " + jMetaDataGeneral.getFolderNameAsString());
    }

    /**
     * Test getFolderNameAsBoolean() method.
     */
    @Test
    public void subTestGetFolderNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsBoolean());
        System.out.println("Folder name only AS Boolean === " + jMetaDataGeneral.getFolderNameAsBoolean());
    }

    /**
     * Test getFolderNameAsBigInteger() method.
     */
    @Test
    public void subTestGetFolderNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsBigInteger());
        System.out.println("Folder name only AS BigInteger === " + jMetaDataGeneral.getFolderNameAsBigInteger());
    }

    /**
     * Test getFolderNameAsURL() method.
     */
    @Test
    public void subTestGetFolderNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameAsURL());
        System.out.println("Folder name only AS URL === " + jMetaDataGeneral.getFolderNameAsURL());
    }

    /**
     * Test getCoDirectorAsInteger() method.
     */
    @Test
    public void subTestGetCoDirectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsInteger());
        System.out.println("Name of the codirector. AS Integer === " + jMetaDataGeneral.getCoDirectorAsInteger());
    }

    /**
     * Test getCoDirectorAsLong() method.
     */
    @Test
    public void subTestGetCoDirectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsLong());
        System.out.println("Name of the codirector. AS Long === " + jMetaDataGeneral.getCoDirectorAsLong());
    }

    /**
     * Test getCoDirectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCoDirectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsLocalDateTime());
        System.out.println("Name of the codirector. AS LocalDateTime === " + jMetaDataGeneral.getCoDirectorAsLocalDateTime());
    }

    /**
     * Test getCoDirectorAsLocalTime() method.
     */
    @Test
    public void subTestGetCoDirectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsLocalTime());
        System.out.println("Name of the codirector. AS LocalTime === " + jMetaDataGeneral.getCoDirectorAsLocalTime());
    }

    /**
     * Test getCoDirectorAsString() method.
     */
    @Test
    public void subTestGetCoDirectorAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsString());
        System.out.println("Name of the codirector. AS String === " + jMetaDataGeneral.getCoDirectorAsString());
    }

    /**
     * Test getCoDirectorAsBoolean() method.
     */
    @Test
    public void subTestGetCoDirectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsBoolean());
        System.out.println("Name of the codirector. AS Boolean === " + jMetaDataGeneral.getCoDirectorAsBoolean());
    }

    /**
     * Test getCoDirectorAsBigInteger() method.
     */
    @Test
    public void subTestGetCoDirectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsBigInteger());
        System.out.println("Name of the codirector. AS BigInteger === " + jMetaDataGeneral.getCoDirectorAsBigInteger());
    }

    /**
     * Test getCoDirectorAsURL() method.
     */
    @Test
    public void subTestGetCoDirectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCoDirectorAsURL());
        System.out.println("Name of the codirector. AS URL === " + jMetaDataGeneral.getCoDirectorAsURL());
    }

    /**
     * Test getPlayedCountAsInteger() method.
     */
    @Test
    public void subTestGetPlayedCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsInteger());
        System.out.println("Number of times an item was played AS Integer === " + jMetaDataGeneral.getPlayedCountAsInteger());
    }

    /**
     * Test getPlayedCountAsLong() method.
     */
    @Test
    public void subTestGetPlayedCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsLong());
        System.out.println("Number of times an item was played AS Long === " + jMetaDataGeneral.getPlayedCountAsLong());
    }

    /**
     * Test getPlayedCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPlayedCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsLocalDateTime());
        System.out.println("Number of times an item was played AS LocalDateTime === " + jMetaDataGeneral.getPlayedCountAsLocalDateTime());
    }

    /**
     * Test getPlayedCountAsLocalTime() method.
     */
    @Test
    public void subTestGetPlayedCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsLocalTime());
        System.out.println("Number of times an item was played AS LocalTime === " + jMetaDataGeneral.getPlayedCountAsLocalTime());
    }

    /**
     * Test getPlayedCountAsString() method.
     */
    @Test
    public void subTestGetPlayedCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsString());
        System.out.println("Number of times an item was played AS String === " + jMetaDataGeneral.getPlayedCountAsString());
    }

    /**
     * Test getPlayedCountAsBoolean() method.
     */
    @Test
    public void subTestGetPlayedCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsBoolean());
        System.out.println("Number of times an item was played AS Boolean === " + jMetaDataGeneral.getPlayedCountAsBoolean());
    }

    /**
     * Test getPlayedCountAsBigInteger() method.
     */
    @Test
    public void subTestGetPlayedCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsBigInteger());
        System.out.println("Number of times an item was played AS BigInteger === " + jMetaDataGeneral.getPlayedCountAsBigInteger());
    }

    /**
     * Test getPlayedCountAsURL() method.
     */
    @Test
    public void subTestGetPlayedCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedCountAsURL());
        System.out.println("Number of times an item was played AS URL === " + jMetaDataGeneral.getPlayedCountAsURL());
    }

    /**
     * Test getStreamKindIDAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsInteger());
        System.out.println("Number of the stream (base=0) AS Integer === " + jMetaDataGeneral.getStreamKindIDAsInteger());
    }

    /**
     * Test getStreamKindIDAsLong() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsLong());
        System.out.println("Number of the stream (base=0) AS Long === " + jMetaDataGeneral.getStreamKindIDAsLong());
    }

    /**
     * Test getStreamKindIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsLocalDateTime());
        System.out.println("Number of the stream (base=0) AS LocalDateTime === " + jMetaDataGeneral.getStreamKindIDAsLocalDateTime());
    }

    /**
     * Test getStreamKindIDAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsLocalTime());
        System.out.println("Number of the stream (base=0) AS LocalTime === " + jMetaDataGeneral.getStreamKindIDAsLocalTime());
    }

    /**
     * Test getStreamKindIDAsString() method.
     */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals("0", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsString());
        System.out.println("Number of the stream (base=0) AS String === " + jMetaDataGeneral.getStreamKindIDAsString());
    }

    /**
     * Test getStreamKindIDAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsBoolean());
        System.out.println("Number of the stream (base=0) AS Boolean === " + jMetaDataGeneral.getStreamKindIDAsBoolean());
    }

    /**
     * Test getStreamKindIDAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsBigInteger());
        System.out.println("Number of the stream (base=0) AS BigInteger === " + jMetaDataGeneral.getStreamKindIDAsBigInteger());
    }

    /**
     * Test getStreamKindIDAsURL() method.
     */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindIDAsURL());
        System.out.println("Number of the stream (base=0) AS URL === " + jMetaDataGeneral.getStreamKindIDAsURL());
    }

    /**
     * Test getFolderNameLastAsInteger() method.
     */
    @Test
    public void subTestGetFolderNameLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsInteger());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getFolderNameLastAsInteger());
    }

    /**
     * Test getFolderNameLastAsLong() method.
     */
    @Test
    public void subTestGetFolderNameLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsLong());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getFolderNameLastAsLong());
    }

    /**
     * Test getFolderNameLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFolderNameLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsLocalDateTime());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getFolderNameLastAsLocalDateTime());
    }

    /**
     * Test getFolderNameLastAsLocalTime() method.
     */
    @Test
    public void subTestGetFolderNameLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsLocalTime());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getFolderNameLastAsLocalTime());
    }

    /**
     * Test getFolderNameLastAsString() method.
     */
    @Test
    public void subTestGetFolderNameLastAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsString());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getFolderNameLastAsString());
    }

    /**
     * Test getFolderNameLastAsBoolean() method.
     */
    @Test
    public void subTestGetFolderNameLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsBoolean());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getFolderNameLastAsBoolean());
    }

    /**
     * Test getFolderNameLastAsBigInteger() method.
     */
    @Test
    public void subTestGetFolderNameLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsBigInteger());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getFolderNameLastAsBigInteger());
    }

    /**
     * Test getFolderNameLastAsURL() method.
     */
    @Test
    public void subTestGetFolderNameLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFolderNameLastAsURL());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getFolderNameLastAsURL());
    }

    /**
     * Test getCatalogNumberAsInteger() method.
     */
    @Test
    public void subTestGetCatalogNumberAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsInteger());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS Integer === " + jMetaDataGeneral.getCatalogNumberAsInteger());
    }

    /**
     * Test getCatalogNumberAsLong() method.
     */
    @Test
    public void subTestGetCatalogNumberAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsLong());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS Long === " + jMetaDataGeneral.getCatalogNumberAsLong());
    }

    /**
     * Test getCatalogNumberAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCatalogNumberAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsLocalDateTime());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS LocalDateTime === " + jMetaDataGeneral.getCatalogNumberAsLocalDateTime());
    }

    /**
     * Test getCatalogNumberAsLocalTime() method.
     */
    @Test
    public void subTestGetCatalogNumberAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsLocalTime());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS LocalTime === " + jMetaDataGeneral.getCatalogNumberAsLocalTime());
    }

    /**
     * Test getCatalogNumberAsString() method.
     */
    @Test
    public void subTestGetCatalogNumberAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsString());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS String === " + jMetaDataGeneral.getCatalogNumberAsString());
    }

    /**
     * Test getCatalogNumberAsBoolean() method.
     */
    @Test
    public void subTestGetCatalogNumberAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsBoolean());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS Boolean === " + jMetaDataGeneral.getCatalogNumberAsBoolean());
    }

    /**
     * Test getCatalogNumberAsBigInteger() method.
     */
    @Test
    public void subTestGetCatalogNumberAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsBigInteger());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS BigInteger === " + jMetaDataGeneral.getCatalogNumberAsBigInteger());
    }

    /**
     * Test getCatalogNumberAsURL() method.
     */
    @Test
    public void subTestGetCatalogNumberAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCatalogNumberAsURL());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS URL === " + jMetaDataGeneral.getCatalogNumberAsURL());
    }

    /**
     * Test getRecordedLocationAsInteger() method.
     */
    @Test
    public void subTestGetRecordedLocationAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsInteger());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS Integer === " + jMetaDataGeneral.getRecordedLocationAsInteger());
    }

    /**
     * Test getRecordedLocationAsLong() method.
     */
    @Test
    public void subTestGetRecordedLocationAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsLong());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS Long === " + jMetaDataGeneral.getRecordedLocationAsLong());
    }

    /**
     * Test getRecordedLocationAsLocalDateTime() method.
     */
    @Test
    public void subTestGetRecordedLocationAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsLocalDateTime());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS LocalDateTime === " + jMetaDataGeneral.getRecordedLocationAsLocalDateTime());
    }

    /**
     * Test getRecordedLocationAsLocalTime() method.
     */
    @Test
    public void subTestGetRecordedLocationAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsLocalTime());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS LocalTime === " + jMetaDataGeneral.getRecordedLocationAsLocalTime());
    }

    /**
     * Test getRecordedLocationAsString() method.
     */
    @Test
    public void subTestGetRecordedLocationAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsString());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS String === " + jMetaDataGeneral.getRecordedLocationAsString());
    }

    /**
     * Test getRecordedLocationAsBoolean() method.
     */
    @Test
    public void subTestGetRecordedLocationAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsBoolean());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS Boolean === " + jMetaDataGeneral.getRecordedLocationAsBoolean());
    }

    /**
     * Test getRecordedLocationAsBigInteger() method.
     */
    @Test
    public void subTestGetRecordedLocationAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsBigInteger());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS BigInteger === " + jMetaDataGeneral.getRecordedLocationAsBigInteger());
    }

    /**
     * Test getRecordedLocationAsURL() method.
     */
    @Test
    public void subTestGetRecordedLocationAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getRecordedLocationAsURL());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS URL === " + jMetaDataGeneral.getRecordedLocationAsURL());
    }

    /**
     * Test getFileExtensionLastAsInteger() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsInteger());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getFileExtensionLastAsInteger());
    }

    /**
     * Test getFileExtensionLastAsLong() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsLong());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getFileExtensionLastAsLong());
    }

    /**
     * Test getFileExtensionLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsLocalDateTime());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getFileExtensionLastAsLocalDateTime());
    }

    /**
     * Test getFileExtensionLastAsLocalTime() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsLocalTime());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getFileExtensionLastAsLocalTime());
    }

    /**
     * Test getFileExtensionLastAsString() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsString());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getFileExtensionLastAsString());
    }

    /**
     * Test getFileExtensionLastAsBoolean() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsBoolean());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getFileExtensionLastAsBoolean());
    }

    /**
     * Test getFileExtensionLastAsBigInteger() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsBigInteger());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getFileExtensionLastAsBigInteger());
    }

    /**
     * Test getFileExtensionLastAsURL() method.
     */
    @Test
    public void subTestGetFileExtensionLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileExtensionLastAsURL());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getFileExtensionLastAsURL());
    }

    /**
     * Test getPlayedFirstDateAsInteger() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsInteger());
        System.out.println("The date, the owner first played an item AS Integer === " + jMetaDataGeneral.getPlayedFirstDateAsInteger());
    }

    /**
     * Test getPlayedFirstDateAsLong() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsLong());
        System.out.println("The date, the owner first played an item AS Long === " + jMetaDataGeneral.getPlayedFirstDateAsLong());
    }

    /**
     * Test getPlayedFirstDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsLocalDateTime());
        System.out.println("The date, the owner first played an item AS LocalDateTime === " + jMetaDataGeneral.getPlayedFirstDateAsLocalDateTime());
    }

    /**
     * Test getPlayedFirstDateAsLocalTime() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsLocalTime());
        System.out.println("The date, the owner first played an item AS LocalTime === " + jMetaDataGeneral.getPlayedFirstDateAsLocalTime());
    }

    /**
     * Test getPlayedFirstDateAsString() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsString());
        System.out.println("The date, the owner first played an item AS String === " + jMetaDataGeneral.getPlayedFirstDateAsString());
    }

    /**
     * Test getPlayedFirstDateAsBoolean() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsBoolean());
        System.out.println("The date, the owner first played an item AS Boolean === " + jMetaDataGeneral.getPlayedFirstDateAsBoolean());
    }

    /**
     * Test getPlayedFirstDateAsBigInteger() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsBigInteger());
        System.out.println("The date, the owner first played an item AS BigInteger === " + jMetaDataGeneral.getPlayedFirstDateAsBigInteger());
    }

    /**
     * Test getPlayedFirstDateAsURL() method.
     */
    @Test
    public void subTestGetPlayedFirstDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPlayedFirstDateAsURL());
        System.out.println("The date, the owner first played an item AS URL === " + jMetaDataGeneral.getPlayedFirstDateAsURL());
    }

    /**
     * Test getFormatUrlAsInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsInteger());
        System.out.println("Link to a description of this format AS Integer === " + jMetaDataGeneral.getFormatUrlAsInteger());
    }

    /**
     * Test getFormatUrlAsLong() method.
     */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsLong());
        System.out.println("Link to a description of this format AS Long === " + jMetaDataGeneral.getFormatUrlAsLong());
    }

    /**
     * Test getFormatUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsLocalDateTime());
        System.out.println("Link to a description of this format AS LocalDateTime === " + jMetaDataGeneral.getFormatUrlAsLocalDateTime());
    }

    /**
     * Test getFormatUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsLocalTime());
        System.out.println("Link to a description of this format AS LocalTime === " + jMetaDataGeneral.getFormatUrlAsLocalTime());
    }

    /**
     * Test getFormatUrlAsString() method.
     */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsString());
        System.out.println("Link to a description of this format AS String === " + jMetaDataGeneral.getFormatUrlAsString());
    }

    /**
     * Test getFormatUrlAsBoolean() method.
     */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsBoolean());
        System.out.println("Link to a description of this format AS Boolean === " + jMetaDataGeneral.getFormatUrlAsBoolean());
    }

    /**
     * Test getFormatUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsBigInteger());
        System.out.println("Link to a description of this format AS BigInteger === " + jMetaDataGeneral.getFormatUrlAsBigInteger());
    }

    /**
     * Test getFormatUrlAsURL() method.
     */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatUrlAsURL());
        System.out.println("Link to a description of this format AS URL === " + jMetaDataGeneral.getFormatUrlAsURL());
    }

    /**
     * Test getFrameRateStringAsInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsInteger());
        System.out.println("Frames per second (with measurement) AS Integer === " + jMetaDataGeneral.getFrameRateStringAsInteger());
    }

    /**
     * Test getFrameRateStringAsLong() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLong());
        System.out.println("Frames per second (with measurement) AS Long === " + jMetaDataGeneral.getFrameRateStringAsLong());
    }

    /**
     * Test getFrameRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLocalDateTime());
        System.out.println("Frames per second (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getFrameRateStringAsLocalDateTime());
    }

    /**
     * Test getFrameRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsLocalTime());
        System.out.println("Frames per second (with measurement) AS LocalTime === " + jMetaDataGeneral.getFrameRateStringAsLocalTime());
    }

    /**
     * Test getFrameRateStringAsString() method.
     */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsString());
        System.out.println("Frames per second (with measurement) AS String === " + jMetaDataGeneral.getFrameRateStringAsString());
    }

    /**
     * Test getFrameRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsBoolean());
        System.out.println("Frames per second (with measurement) AS Boolean === " + jMetaDataGeneral.getFrameRateStringAsBoolean());
    }

    /**
     * Test getFrameRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsBigInteger());
        System.out.println("Frames per second (with measurement) AS BigInteger === " + jMetaDataGeneral.getFrameRateStringAsBigInteger());
    }

    /**
     * Test getFrameRateStringAsURL() method.
     */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFrameRateStringAsURL());
        System.out.println("Frames per second (with measurement) AS URL === " + jMetaDataGeneral.getFrameRateStringAsURL());
    }

    /**
     * Test getAlbumPerformerSortAsInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsInteger());
        System.out.println("Album/Performer/Sort AS Integer === " + jMetaDataGeneral.getAlbumPerformerSortAsInteger());
    }

    /**
     * Test getAlbumPerformerSortAsLong() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsLong());
        System.out.println("Album/Performer/Sort AS Long === " + jMetaDataGeneral.getAlbumPerformerSortAsLong());
    }

    /**
     * Test getAlbumPerformerSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsLocalDateTime());
        System.out.println("Album/Performer/Sort AS LocalDateTime === " + jMetaDataGeneral.getAlbumPerformerSortAsLocalDateTime());
    }

    /**
     * Test getAlbumPerformerSortAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsLocalTime());
        System.out.println("Album/Performer/Sort AS LocalTime === " + jMetaDataGeneral.getAlbumPerformerSortAsLocalTime());
    }

    /**
     * Test getAlbumPerformerSortAsString() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsString());
        System.out.println("Album/Performer/Sort AS String === " + jMetaDataGeneral.getAlbumPerformerSortAsString());
    }

    /**
     * Test getAlbumPerformerSortAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsBoolean());
        System.out.println("Album/Performer/Sort AS Boolean === " + jMetaDataGeneral.getAlbumPerformerSortAsBoolean());
    }

    /**
     * Test getAlbumPerformerSortAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsBigInteger());
        System.out.println("Album/Performer/Sort AS BigInteger === " + jMetaDataGeneral.getAlbumPerformerSortAsBigInteger());
    }

    /**
     * Test getAlbumPerformerSortAsURL() method.
     */
    @Test
    public void subTestGetAlbumPerformerSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerSortAsURL());
        System.out.println("Album/Performer/Sort AS URL === " + jMetaDataGeneral.getAlbumPerformerSortAsURL());
    }

    /**
     * Test getMovieAsInteger() method.
     */
    @Test
    public void subTestGetMovieAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsInteger());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS Integer === " + jMetaDataGeneral.getMovieAsInteger());
    }

    /**
     * Test getMovieAsLong() method.
     */
    @Test
    public void subTestGetMovieAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsLong());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS Long === " + jMetaDataGeneral.getMovieAsLong());
    }

    /**
     * Test getMovieAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsLocalDateTime());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS LocalDateTime === " + jMetaDataGeneral.getMovieAsLocalDateTime());
    }

    /**
     * Test getMovieAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsLocalTime());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS LocalTime === " + jMetaDataGeneral.getMovieAsLocalTime());
    }

    /**
     * Test getMovieAsString() method.
     */
    @Test
    public void subTestGetMovieAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsString());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS String === " + jMetaDataGeneral.getMovieAsString());
    }

    /**
     * Test getMovieAsBoolean() method.
     */
    @Test
    public void subTestGetMovieAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsBoolean());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS Boolean === " + jMetaDataGeneral.getMovieAsBoolean());
    }

    /**
     * Test getMovieAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsBigInteger());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS BigInteger === " + jMetaDataGeneral.getMovieAsBigInteger());
    }

    /**
     * Test getMovieAsURL() method.
     */
    @Test
    public void subTestGetMovieAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieAsURL());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS URL === " + jMetaDataGeneral.getMovieAsURL());
    }

    /**
     * Test getComposerAsInteger() method.
     */
    @Test
    public void subTestGetComposerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsInteger());
        System.out.println("Name of the original composer. AS Integer === " + jMetaDataGeneral.getComposerAsInteger());
    }

    /**
     * Test getComposerAsLong() method.
     */
    @Test
    public void subTestGetComposerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsLong());
        System.out.println("Name of the original composer. AS Long === " + jMetaDataGeneral.getComposerAsLong());
    }

    /**
     * Test getComposerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComposerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsLocalDateTime());
        System.out.println("Name of the original composer. AS LocalDateTime === " + jMetaDataGeneral.getComposerAsLocalDateTime());
    }

    /**
     * Test getComposerAsLocalTime() method.
     */
    @Test
    public void subTestGetComposerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsLocalTime());
        System.out.println("Name of the original composer. AS LocalTime === " + jMetaDataGeneral.getComposerAsLocalTime());
    }

    /**
     * Test getComposerAsString() method.
     */
    @Test
    public void subTestGetComposerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsString());
        System.out.println("Name of the original composer. AS String === " + jMetaDataGeneral.getComposerAsString());
    }

    /**
     * Test getComposerAsBoolean() method.
     */
    @Test
    public void subTestGetComposerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsBoolean());
        System.out.println("Name of the original composer. AS Boolean === " + jMetaDataGeneral.getComposerAsBoolean());
    }

    /**
     * Test getComposerAsBigInteger() method.
     */
    @Test
    public void subTestGetComposerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsBigInteger());
        System.out.println("Name of the original composer. AS BigInteger === " + jMetaDataGeneral.getComposerAsBigInteger());
    }

    /**
     * Test getComposerAsURL() method.
     */
    @Test
    public void subTestGetComposerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComposerAsURL());
        System.out.println("Name of the original composer. AS URL === " + jMetaDataGeneral.getComposerAsURL());
    }

    /**
     * Test getOriginalSourceFormCroppedAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS Integer === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsInteger());
    }

    /**
     * Test getOriginalSourceFormCroppedAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsLong());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS Long === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsLong());
    }

    /**
     * Test getOriginalSourceFormCroppedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalDateTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormCroppedAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormCroppedAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsString());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS String === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsString());
    }

    /**
     * Test getOriginalSourceFormCroppedAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsBoolean());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsBoolean());
    }

    /**
     * Test getOriginalSourceFormCroppedAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsBigInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormCroppedAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormCroppedAsURL());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS URL === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsURL());
    }

    /**
     * Test getTrackSortAsInteger() method.
     */
    @Test
    public void subTestGetTrackSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsInteger());
        System.out.println("Track/Sort AS Integer === " + jMetaDataGeneral.getTrackSortAsInteger());
    }

    /**
     * Test getTrackSortAsLong() method.
     */
    @Test
    public void subTestGetTrackSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsLong());
        System.out.println("Track/Sort AS Long === " + jMetaDataGeneral.getTrackSortAsLong());
    }

    /**
     * Test getTrackSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsLocalDateTime());
        System.out.println("Track/Sort AS LocalDateTime === " + jMetaDataGeneral.getTrackSortAsLocalDateTime());
    }

    /**
     * Test getTrackSortAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsLocalTime());
        System.out.println("Track/Sort AS LocalTime === " + jMetaDataGeneral.getTrackSortAsLocalTime());
    }

    /**
     * Test getTrackSortAsString() method.
     */
    @Test
    public void subTestGetTrackSortAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsString());
        System.out.println("Track/Sort AS String === " + jMetaDataGeneral.getTrackSortAsString());
    }

    /**
     * Test getTrackSortAsBoolean() method.
     */
    @Test
    public void subTestGetTrackSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsBoolean());
        System.out.println("Track/Sort AS Boolean === " + jMetaDataGeneral.getTrackSortAsBoolean());
    }

    /**
     * Test getTrackSortAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsBigInteger());
        System.out.println("Track/Sort AS BigInteger === " + jMetaDataGeneral.getTrackSortAsBigInteger());
    }

    /**
     * Test getTrackSortAsURL() method.
     */
    @Test
    public void subTestGetTrackSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackSortAsURL());
        System.out.println("Track/Sort AS URL === " + jMetaDataGeneral.getTrackSortAsURL());
    }

    /**
     * Test getProductionStudioAsInteger() method.
     */
    @Test
    public void subTestGetProductionStudioAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsInteger());
        System.out.println("Main production studio  AS Integer === " + jMetaDataGeneral.getProductionStudioAsInteger());
    }

    /**
     * Test getProductionStudioAsLong() method.
     */
    @Test
    public void subTestGetProductionStudioAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsLong());
        System.out.println("Main production studio  AS Long === " + jMetaDataGeneral.getProductionStudioAsLong());
    }

    /**
     * Test getProductionStudioAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProductionStudioAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsLocalDateTime());
        System.out.println("Main production studio  AS LocalDateTime === " + jMetaDataGeneral.getProductionStudioAsLocalDateTime());
    }

    /**
     * Test getProductionStudioAsLocalTime() method.
     */
    @Test
    public void subTestGetProductionStudioAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsLocalTime());
        System.out.println("Main production studio  AS LocalTime === " + jMetaDataGeneral.getProductionStudioAsLocalTime());
    }

    /**
     * Test getProductionStudioAsString() method.
     */
    @Test
    public void subTestGetProductionStudioAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsString());
        System.out.println("Main production studio  AS String === " + jMetaDataGeneral.getProductionStudioAsString());
    }

    /**
     * Test getProductionStudioAsBoolean() method.
     */
    @Test
    public void subTestGetProductionStudioAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsBoolean());
        System.out.println("Main production studio  AS Boolean === " + jMetaDataGeneral.getProductionStudioAsBoolean());
    }

    /**
     * Test getProductionStudioAsBigInteger() method.
     */
    @Test
    public void subTestGetProductionStudioAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsBigInteger());
        System.out.println("Main production studio  AS BigInteger === " + jMetaDataGeneral.getProductionStudioAsBigInteger());
    }

    /**
     * Test getProductionStudioAsURL() method.
     */
    @Test
    public void subTestGetProductionStudioAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProductionStudioAsURL());
        System.out.println("Main production studio  AS URL === " + jMetaDataGeneral.getProductionStudioAsURL());
    }

    /**
     * Test getAudioCountAsInteger() method.
     */
    @Test
    public void subTestGetAudioCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsInteger());
        System.out.println("Number of audio streams AS Integer === " + jMetaDataGeneral.getAudioCountAsInteger());
    }

    /**
     * Test getAudioCountAsLong() method.
     */
    @Test
    public void subTestGetAudioCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsLong());
        System.out.println("Number of audio streams AS Long === " + jMetaDataGeneral.getAudioCountAsLong());
    }

    /**
     * Test getAudioCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsLocalDateTime());
        System.out.println("Number of audio streams AS LocalDateTime === " + jMetaDataGeneral.getAudioCountAsLocalDateTime());
    }

    /**
     * Test getAudioCountAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsLocalTime());
        System.out.println("Number of audio streams AS LocalTime === " + jMetaDataGeneral.getAudioCountAsLocalTime());
    }

    /**
     * Test getAudioCountAsString() method.
     */
    @Test
    public void subTestGetAudioCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsString());
        System.out.println("Number of audio streams AS String === " + jMetaDataGeneral.getAudioCountAsString());
    }

    /**
     * Test getAudioCountAsBoolean() method.
     */
    @Test
    public void subTestGetAudioCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsBoolean());
        System.out.println("Number of audio streams AS Boolean === " + jMetaDataGeneral.getAudioCountAsBoolean());
    }

    /**
     * Test getAudioCountAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsBigInteger());
        System.out.println("Number of audio streams AS BigInteger === " + jMetaDataGeneral.getAudioCountAsBigInteger());
    }

    /**
     * Test getAudioCountAsURL() method.
     */
    @Test
    public void subTestGetAudioCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioCountAsURL());
        System.out.println("Number of audio streams AS URL === " + jMetaDataGeneral.getAudioCountAsURL());
    }

    /**
     * Test getChapterAsInteger() method.
     */
    @Test
    public void subTestGetChapterAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsInteger());
        System.out.println("Name of the chapter. AS Integer === " + jMetaDataGeneral.getChapterAsInteger());
    }

    /**
     * Test getChapterAsLong() method.
     */
    @Test
    public void subTestGetChapterAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsLong());
        System.out.println("Name of the chapter. AS Long === " + jMetaDataGeneral.getChapterAsLong());
    }

    /**
     * Test getChapterAsLocalDateTime() method.
     */
    @Test
    public void subTestGetChapterAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsLocalDateTime());
        System.out.println("Name of the chapter. AS LocalDateTime === " + jMetaDataGeneral.getChapterAsLocalDateTime());
    }

    /**
     * Test getChapterAsLocalTime() method.
     */
    @Test
    public void subTestGetChapterAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsLocalTime());
        System.out.println("Name of the chapter. AS LocalTime === " + jMetaDataGeneral.getChapterAsLocalTime());
    }

    /**
     * Test getChapterAsString() method.
     */
    @Test
    public void subTestGetChapterAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsString());
        System.out.println("Name of the chapter. AS String === " + jMetaDataGeneral.getChapterAsString());
    }

    /**
     * Test getChapterAsBoolean() method.
     */
    @Test
    public void subTestGetChapterAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsBoolean());
        System.out.println("Name of the chapter. AS Boolean === " + jMetaDataGeneral.getChapterAsBoolean());
    }

    /**
     * Test getChapterAsBigInteger() method.
     */
    @Test
    public void subTestGetChapterAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsBigInteger());
        System.out.println("Name of the chapter. AS BigInteger === " + jMetaDataGeneral.getChapterAsBigInteger());
    }

    /**
     * Test getChapterAsURL() method.
     */
    @Test
    public void subTestGetChapterAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getChapterAsURL());
        System.out.println("Name of the chapter. AS URL === " + jMetaDataGeneral.getChapterAsURL());
    }

    /**
     * Test getSynopsisAsInteger() method.
     */
    @Test
    public void subTestGetSynopsisAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsInteger());
        System.out.println("A description of the story line of the item. AS Integer === " + jMetaDataGeneral.getSynopsisAsInteger());
    }

    /**
     * Test getSynopsisAsLong() method.
     */
    @Test
    public void subTestGetSynopsisAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsLong());
        System.out.println("A description of the story line of the item. AS Long === " + jMetaDataGeneral.getSynopsisAsLong());
    }

    /**
     * Test getSynopsisAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSynopsisAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsLocalDateTime());
        System.out.println("A description of the story line of the item. AS LocalDateTime === " + jMetaDataGeneral.getSynopsisAsLocalDateTime());
    }

    /**
     * Test getSynopsisAsLocalTime() method.
     */
    @Test
    public void subTestGetSynopsisAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsLocalTime());
        System.out.println("A description of the story line of the item. AS LocalTime === " + jMetaDataGeneral.getSynopsisAsLocalTime());
    }

    /**
     * Test getSynopsisAsString() method.
     */
    @Test
    public void subTestGetSynopsisAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsString());
        System.out.println("A description of the story line of the item. AS String === " + jMetaDataGeneral.getSynopsisAsString());
    }

    /**
     * Test getSynopsisAsBoolean() method.
     */
    @Test
    public void subTestGetSynopsisAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsBoolean());
        System.out.println("A description of the story line of the item. AS Boolean === " + jMetaDataGeneral.getSynopsisAsBoolean());
    }

    /**
     * Test getSynopsisAsBigInteger() method.
     */
    @Test
    public void subTestGetSynopsisAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsBigInteger());
        System.out.println("A description of the story line of the item. AS BigInteger === " + jMetaDataGeneral.getSynopsisAsBigInteger());
    }

    /**
     * Test getSynopsisAsURL() method.
     */
    @Test
    public void subTestGetSynopsisAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSynopsisAsURL());
        System.out.println("A description of the story line of the item. AS URL === " + jMetaDataGeneral.getSynopsisAsURL());
    }

    /**
     * Test getEncodedApplicationNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsInteger());
        System.out.println("Name of the product AS Integer === " + jMetaDataGeneral.getEncodedApplicationNameAsInteger());
    }

    /**
     * Test getEncodedApplicationNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsLong());
        System.out.println("Name of the product AS Long === " + jMetaDataGeneral.getEncodedApplicationNameAsLong());
    }

    /**
     * Test getEncodedApplicationNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsLocalDateTime());
        System.out.println("Name of the product AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationNameAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsLocalTime());
        System.out.println("Name of the product AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationNameAsLocalTime());
    }

    /**
     * Test getEncodedApplicationNameAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsString());
        System.out.println("Name of the product AS String === " + jMetaDataGeneral.getEncodedApplicationNameAsString());
    }

    /**
     * Test getEncodedApplicationNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsBoolean());
        System.out.println("Name of the product AS Boolean === " + jMetaDataGeneral.getEncodedApplicationNameAsBoolean());
    }

    /**
     * Test getEncodedApplicationNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsBigInteger());
        System.out.println("Name of the product AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationNameAsBigInteger());
    }

    /**
     * Test getEncodedApplicationNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationNameAsURL());
        System.out.println("Name of the product AS URL === " + jMetaDataGeneral.getEncodedApplicationNameAsURL());
    }

    /**
     * Test getUniqueIDStringAsInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataGeneral.getUniqueIDStringAsInteger());
    }

    /**
     * Test getUniqueIDStringAsLong() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataGeneral.getUniqueIDStringAsLong());
    }

    /**
     * Test getUniqueIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataGeneral.getUniqueIDStringAsLocalDateTime());
    }

    /**
     * Test getUniqueIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataGeneral.getUniqueIDStringAsLocalTime());
    }

    /**
     * Test getUniqueIDStringAsString() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataGeneral.getUniqueIDStringAsString());
    }

    /**
     * Test getUniqueIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataGeneral.getUniqueIDStringAsBoolean());
    }

    /**
     * Test getUniqueIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataGeneral.getUniqueIDStringAsBigInteger());
    }

    /**
     * Test getUniqueIDStringAsURL() method.
     */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getUniqueIDStringAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataGeneral.getUniqueIDStringAsURL());
    }

    /**
     * Test getGenreAsInteger() method.
     */
    @Test
    public void subTestGetGenreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsInteger());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS Integer === " + jMetaDataGeneral.getGenreAsInteger());
    }

    /**
     * Test getGenreAsLong() method.
     */
    @Test
    public void subTestGetGenreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsLong());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS Long === " + jMetaDataGeneral.getGenreAsLong());
    }

    /**
     * Test getGenreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGenreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsLocalDateTime());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS LocalDateTime === " + jMetaDataGeneral.getGenreAsLocalDateTime());
    }

    /**
     * Test getGenreAsLocalTime() method.
     */
    @Test
    public void subTestGetGenreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsLocalTime());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS LocalTime === " + jMetaDataGeneral.getGenreAsLocalTime());
    }

    /**
     * Test getGenreAsString() method.
     */
    @Test
    public void subTestGetGenreAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsString());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS String === " + jMetaDataGeneral.getGenreAsString());
    }

    /**
     * Test getGenreAsBoolean() method.
     */
    @Test
    public void subTestGetGenreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsBoolean());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS Boolean === " + jMetaDataGeneral.getGenreAsBoolean());
    }

    /**
     * Test getGenreAsBigInteger() method.
     */
    @Test
    public void subTestGetGenreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsBigInteger());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS BigInteger === " + jMetaDataGeneral.getGenreAsBigInteger());
    }

    /**
     * Test getGenreAsURL() method.
     */
    @Test
    public void subTestGetGenreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGenreAsURL());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS URL === " + jMetaDataGeneral.getGenreAsURL());
    }

    /**
     * Test getMasteredDateAsInteger() method.
     */
    @Test
    public void subTestGetMasteredDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsInteger());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS Integer === " + jMetaDataGeneral.getMasteredDateAsInteger());
    }

    /**
     * Test getMasteredDateAsLong() method.
     */
    @Test
    public void subTestGetMasteredDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsLong());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS Long === " + jMetaDataGeneral.getMasteredDateAsLong());
    }

    /**
     * Test getMasteredDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMasteredDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsLocalDateTime());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS LocalDateTime === " + jMetaDataGeneral.getMasteredDateAsLocalDateTime());
    }

    /**
     * Test getMasteredDateAsLocalTime() method.
     */
    @Test
    public void subTestGetMasteredDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsLocalTime());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS LocalTime === " + jMetaDataGeneral.getMasteredDateAsLocalTime());
    }

    /**
     * Test getMasteredDateAsString() method.
     */
    @Test
    public void subTestGetMasteredDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsString());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS String === " + jMetaDataGeneral.getMasteredDateAsString());
    }

    /**
     * Test getMasteredDateAsBoolean() method.
     */
    @Test
    public void subTestGetMasteredDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsBoolean());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS Boolean === " + jMetaDataGeneral.getMasteredDateAsBoolean());
    }

    /**
     * Test getMasteredDateAsBigInteger() method.
     */
    @Test
    public void subTestGetMasteredDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsBigInteger());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS BigInteger === " + jMetaDataGeneral.getMasteredDateAsBigInteger());
    }

    /**
     * Test getMasteredDateAsURL() method.
     */
    @Test
    public void subTestGetMasteredDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredDateAsURL());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS URL === " + jMetaDataGeneral.getMasteredDateAsURL());
    }

    /**
     * Test getFormatProfileAsInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsInteger());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Integer === " + jMetaDataGeneral.getFormatProfileAsInteger());
    }

    /**
     * Test getFormatProfileAsLong() method.
     */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsLong());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Long === " + jMetaDataGeneral.getFormatProfileAsLong());
    }

    /**
     * Test getFormatProfileAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsLocalDateTime());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS LocalDateTime === " + jMetaDataGeneral.getFormatProfileAsLocalDateTime());
    }

    /**
     * Test getFormatProfileAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsLocalTime());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS LocalTime === " + jMetaDataGeneral.getFormatProfileAsLocalTime());
    }

    /**
     * Test getFormatProfileAsString() method.
     */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsString());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS String === " + jMetaDataGeneral.getFormatProfileAsString());
    }

    /**
     * Test getFormatProfileAsBoolean() method.
     */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsBoolean());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Boolean === " + jMetaDataGeneral.getFormatProfileAsBoolean());
    }

    /**
     * Test getFormatProfileAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsBigInteger());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS BigInteger === " + jMetaDataGeneral.getFormatProfileAsBigInteger());
    }

    /**
     * Test getFormatProfileAsURL() method.
     */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatProfileAsURL());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS URL === " + jMetaDataGeneral.getFormatProfileAsURL());
    }

    /**
     * Test getStreamSizeDemuxedString1AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsInteger());
        System.out.println("StreamSize_Demuxed/String1 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsLong());
        System.out.println("StreamSize_Demuxed/String1 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString1AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsString());
        System.out.println("StreamSize_Demuxed/String1 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsString());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsBoolean());
        System.out.println("StreamSize_Demuxed/String1 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString1AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsBigInteger());
        System.out.println("StreamSize_Demuxed/String1 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString1AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString1AsURL());
        System.out.println("StreamSize_Demuxed/String1 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsURL());
    }

    /**
     * Test getEPGPositionsEndAsInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsInteger());
        System.out.println("EPG_Positions_End AS Integer === " + jMetaDataGeneral.getEPGPositionsEndAsInteger());
    }

    /**
     * Test getEPGPositionsEndAsLong() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsLong());
        System.out.println("EPG_Positions_End AS Long === " + jMetaDataGeneral.getEPGPositionsEndAsLong());
    }

    /**
     * Test getEPGPositionsEndAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsLocalDateTime());
        System.out.println("EPG_Positions_End AS LocalDateTime === " + jMetaDataGeneral.getEPGPositionsEndAsLocalDateTime());
    }

    /**
     * Test getEPGPositionsEndAsLocalTime() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsLocalTime());
        System.out.println("EPG_Positions_End AS LocalTime === " + jMetaDataGeneral.getEPGPositionsEndAsLocalTime());
    }

    /**
     * Test getEPGPositionsEndAsString() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsString());
        System.out.println("EPG_Positions_End AS String === " + jMetaDataGeneral.getEPGPositionsEndAsString());
    }

    /**
     * Test getEPGPositionsEndAsBoolean() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsBoolean());
        System.out.println("EPG_Positions_End AS Boolean === " + jMetaDataGeneral.getEPGPositionsEndAsBoolean());
    }

    /**
     * Test getEPGPositionsEndAsBigInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsBigInteger());
        System.out.println("EPG_Positions_End AS BigInteger === " + jMetaDataGeneral.getEPGPositionsEndAsBigInteger());
    }

    /**
     * Test getEPGPositionsEndAsURL() method.
     */
    @Test
    public void subTestGetEPGPositionsEndAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsEndAsURL());
        System.out.println("EPG_Positions_End AS URL === " + jMetaDataGeneral.getEPGPositionsEndAsURL());
    }

    /**
     * Test getStreamSizeDemuxedString2AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsInteger());
        System.out.println("StreamSize_Demuxed/String2 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsLong());
        System.out.println("StreamSize_Demuxed/String2 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString2AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsString());
        System.out.println("StreamSize_Demuxed/String2 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsString());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsBoolean());
        System.out.println("StreamSize_Demuxed/String2 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString2AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsBigInteger());
        System.out.println("StreamSize_Demuxed/String2 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString2AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString2AsURL());
        System.out.println("StreamSize_Demuxed/String2 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString3AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsInteger());
        System.out.println("StreamSize_Demuxed/String3 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsLong());
        System.out.println("StreamSize_Demuxed/String3 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString3AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsString());
        System.out.println("StreamSize_Demuxed/String3 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsString());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsBoolean());
        System.out.println("StreamSize_Demuxed/String3 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString3AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsBigInteger());
        System.out.println("StreamSize_Demuxed/String3 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString3AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString3AsURL());
        System.out.println("StreamSize_Demuxed/String3 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString4AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsInteger());
        System.out.println("StreamSize_Demuxed/String4 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsLong());
        System.out.println("StreamSize_Demuxed/String4 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString4AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsString());
        System.out.println("StreamSize_Demuxed/String4 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsString());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsBoolean());
        System.out.println("StreamSize_Demuxed/String4 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString4AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsBigInteger());
        System.out.println("StreamSize_Demuxed/String4 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString4AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString4AsURL());
        System.out.println("StreamSize_Demuxed/String4 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsURL());
    }

    /**
     * Test getStreamSizeDemuxedString5AsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsLong());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsLong());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedString5AsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsString());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsString());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedString5AsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedString5AsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedString5AsURL());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsURL());
    }

    /**
     * Test getEncryptionInitializationVectorAsInteger() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsInteger());
        System.out.println("Encryption_InitializationVector AS Integer === " + jMetaDataGeneral.getEncryptionInitializationVectorAsInteger());
    }

    /**
     * Test getEncryptionInitializationVectorAsLong() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsLong());
        System.out.println("Encryption_InitializationVector AS Long === " + jMetaDataGeneral.getEncryptionInitializationVectorAsLong());
    }

    /**
     * Test getEncryptionInitializationVectorAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsLocalDateTime());
        System.out.println("Encryption_InitializationVector AS LocalDateTime === " + jMetaDataGeneral.getEncryptionInitializationVectorAsLocalDateTime());
    }

    /**
     * Test getEncryptionInitializationVectorAsLocalTime() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsLocalTime());
        System.out.println("Encryption_InitializationVector AS LocalTime === " + jMetaDataGeneral.getEncryptionInitializationVectorAsLocalTime());
    }

    /**
     * Test getEncryptionInitializationVectorAsString() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsString());
        System.out.println("Encryption_InitializationVector AS String === " + jMetaDataGeneral.getEncryptionInitializationVectorAsString());
    }

    /**
     * Test getEncryptionInitializationVectorAsBoolean() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsBoolean());
        System.out.println("Encryption_InitializationVector AS Boolean === " + jMetaDataGeneral.getEncryptionInitializationVectorAsBoolean());
    }

    /**
     * Test getEncryptionInitializationVectorAsBigInteger() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsBigInteger());
        System.out.println("Encryption_InitializationVector AS BigInteger === " + jMetaDataGeneral.getEncryptionInitializationVectorAsBigInteger());
    }

    /**
     * Test getEncryptionInitializationVectorAsURL() method.
     */
    @Test
    public void subTestGetEncryptionInitializationVectorAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncryptionInitializationVectorAsURL());
        System.out.println("Encryption_InitializationVector AS URL === " + jMetaDataGeneral.getEncryptionInitializationVectorAsURL());
    }

    /**
     * Test getAlbumReplayGainGainAsInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsInteger());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Integer === " + jMetaDataGeneral.getAlbumReplayGainGainAsInteger());
    }

    /**
     * Test getAlbumReplayGainGainAsLong() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsLong());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Long === " + jMetaDataGeneral.getAlbumReplayGainGainAsLong());
    }

    /**
     * Test getAlbumReplayGainGainAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsLocalDateTime());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS LocalDateTime === " + jMetaDataGeneral.getAlbumReplayGainGainAsLocalDateTime());
    }

    /**
     * Test getAlbumReplayGainGainAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsLocalTime());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS LocalTime === " + jMetaDataGeneral.getAlbumReplayGainGainAsLocalTime());
    }

    /**
     * Test getAlbumReplayGainGainAsString() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsString());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS String === " + jMetaDataGeneral.getAlbumReplayGainGainAsString());
    }

    /**
     * Test getAlbumReplayGainGainAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsBoolean());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Boolean === " + jMetaDataGeneral.getAlbumReplayGainGainAsBoolean());
    }

    /**
     * Test getAlbumReplayGainGainAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsBigInteger());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS BigInteger === " + jMetaDataGeneral.getAlbumReplayGainGainAsBigInteger());
    }

    /**
     * Test getAlbumReplayGainGainAsURL() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainAsURL());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS URL === " + jMetaDataGeneral.getAlbumReplayGainGainAsURL());
    }

    /**
     * Test getFormatLevelAsInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsInteger());
        System.out.println("Level of the Format (only MIXML) AS Integer === " + jMetaDataGeneral.getFormatLevelAsInteger());
    }

    /**
     * Test getFormatLevelAsLong() method.
     */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsLong());
        System.out.println("Level of the Format (only MIXML) AS Long === " + jMetaDataGeneral.getFormatLevelAsLong());
    }

    /**
     * Test getFormatLevelAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsLocalDateTime());
        System.out.println("Level of the Format (only MIXML) AS LocalDateTime === " + jMetaDataGeneral.getFormatLevelAsLocalDateTime());
    }

    /**
     * Test getFormatLevelAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsLocalTime());
        System.out.println("Level of the Format (only MIXML) AS LocalTime === " + jMetaDataGeneral.getFormatLevelAsLocalTime());
    }

    /**
     * Test getFormatLevelAsString() method.
     */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsString());
        System.out.println("Level of the Format (only MIXML) AS String === " + jMetaDataGeneral.getFormatLevelAsString());
    }

    /**
     * Test getFormatLevelAsBoolean() method.
     */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsBoolean());
        System.out.println("Level of the Format (only MIXML) AS Boolean === " + jMetaDataGeneral.getFormatLevelAsBoolean());
    }

    /**
     * Test getFormatLevelAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsBigInteger());
        System.out.println("Level of the Format (only MIXML) AS BigInteger === " + jMetaDataGeneral.getFormatLevelAsBigInteger());
    }

    /**
     * Test getFormatLevelAsURL() method.
     */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatLevelAsURL());
        System.out.println("Level of the Format (only MIXML) AS URL === " + jMetaDataGeneral.getFormatLevelAsURL());
    }

    /**
     * Test getStreamSizeDemuxedStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsLong());
        System.out.println("StreamSize_Demuxed in with percentage value AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsLong());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedStringAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsString());
        System.out.println("StreamSize_Demuxed in with percentage value AS String === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsString());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedStringAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedStringAsURL());
        System.out.println("StreamSize_Demuxed in with percentage value AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsURL());
    }

    /**
     * Test getAlbumAsInteger() method.
     */
    @Test
    public void subTestGetAlbumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsInteger());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS Integer === " + jMetaDataGeneral.getAlbumAsInteger());
    }

    /**
     * Test getAlbumAsLong() method.
     */
    @Test
    public void subTestGetAlbumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsLong());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS Long === " + jMetaDataGeneral.getAlbumAsLong());
    }

    /**
     * Test getAlbumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsLocalDateTime());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS LocalDateTime === " + jMetaDataGeneral.getAlbumAsLocalDateTime());
    }

    /**
     * Test getAlbumAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsLocalTime());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS LocalTime === " + jMetaDataGeneral.getAlbumAsLocalTime());
    }

    /**
     * Test getAlbumAsString() method.
     */
    @Test
    public void subTestGetAlbumAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsString());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS String === " + jMetaDataGeneral.getAlbumAsString());
    }

    /**
     * Test getAlbumAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsBoolean());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS Boolean === " + jMetaDataGeneral.getAlbumAsBoolean());
    }

    /**
     * Test getAlbumAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsBigInteger());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS BigInteger === " + jMetaDataGeneral.getAlbumAsBigInteger());
    }

    /**
     * Test getAlbumAsURL() method.
     */
    @Test
    public void subTestGetAlbumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumAsURL());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS URL === " + jMetaDataGeneral.getAlbumAsURL());
    }

    /**
     * Test getTextFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsInteger());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS Integer === " + jMetaDataGeneral.getTextFormatWithHintListAsInteger());
    }

    /**
     * Test getTextFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsLong());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS Long === " + jMetaDataGeneral.getTextFormatWithHintListAsLong());
    }

    /**
     * Test getTextFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsLocalDateTime());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS LocalDateTime === " + jMetaDataGeneral.getTextFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getTextFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsLocalTime());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS LocalTime === " + jMetaDataGeneral.getTextFormatWithHintListAsLocalTime());
    }

    /**
     * Test getTextFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsString());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS String === " + jMetaDataGeneral.getTextFormatWithHintListAsString());
    }

    /**
     * Test getTextFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsBoolean());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS Boolean === " + jMetaDataGeneral.getTextFormatWithHintListAsBoolean());
    }

    /**
     * Test getTextFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsBigInteger());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS BigInteger === " + jMetaDataGeneral.getTextFormatWithHintListAsBigInteger());
    }

    /**
     * Test getTextFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetTextFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextFormatWithHintListAsURL());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS URL === " + jMetaDataGeneral.getTextFormatWithHintListAsURL());
    }

    /**
     * Test getOverallBitRateMinimumStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsInteger());
        System.out.println("Minimum Bit rate (with measurement) AS Integer === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsInteger());
    }

    /**
     * Test getOverallBitRateMinimumStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsLong());
        System.out.println("Minimum Bit rate (with measurement) AS Long === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsLong());
    }

    /**
     * Test getOverallBitRateMinimumStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalDateTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMinimumStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateMinimumStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsString());
        System.out.println("Minimum Bit rate (with measurement) AS String === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsString());
    }

    /**
     * Test getOverallBitRateMinimumStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsBoolean());
        System.out.println("Minimum Bit rate (with measurement) AS Boolean === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsBoolean());
    }

    /**
     * Test getOverallBitRateMinimumStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsBigInteger());
        System.out.println("Minimum Bit rate (with measurement) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateMinimumStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMinimumStringAsURL());
        System.out.println("Minimum Bit rate (with measurement) AS URL === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsURL());
    }

    /**
     * Test getCopyrightAsInteger() method.
     */
    @Test
    public void subTestGetCopyrightAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsInteger());
        System.out.println("Copyright attribution. AS Integer === " + jMetaDataGeneral.getCopyrightAsInteger());
    }

    /**
     * Test getCopyrightAsLong() method.
     */
    @Test
    public void subTestGetCopyrightAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsLong());
        System.out.println("Copyright attribution. AS Long === " + jMetaDataGeneral.getCopyrightAsLong());
    }

    /**
     * Test getCopyrightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCopyrightAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsLocalDateTime());
        System.out.println("Copyright attribution. AS LocalDateTime === " + jMetaDataGeneral.getCopyrightAsLocalDateTime());
    }

    /**
     * Test getCopyrightAsLocalTime() method.
     */
    @Test
    public void subTestGetCopyrightAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsLocalTime());
        System.out.println("Copyright attribution. AS LocalTime === " + jMetaDataGeneral.getCopyrightAsLocalTime());
    }

    /**
     * Test getCopyrightAsString() method.
     */
    @Test
    public void subTestGetCopyrightAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsString());
        System.out.println("Copyright attribution. AS String === " + jMetaDataGeneral.getCopyrightAsString());
    }

    /**
     * Test getCopyrightAsBoolean() method.
     */
    @Test
    public void subTestGetCopyrightAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsBoolean());
        System.out.println("Copyright attribution. AS Boolean === " + jMetaDataGeneral.getCopyrightAsBoolean());
    }

    /**
     * Test getCopyrightAsBigInteger() method.
     */
    @Test
    public void subTestGetCopyrightAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsBigInteger());
        System.out.println("Copyright attribution. AS BigInteger === " + jMetaDataGeneral.getCopyrightAsBigInteger());
    }

    /**
     * Test getCopyrightAsURL() method.
     */
    @Test
    public void subTestGetCopyrightAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightAsURL());
        System.out.println("Copyright attribution. AS URL === " + jMetaDataGeneral.getCopyrightAsURL());
    }

    /**
     * Test getStreamCountAsInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsInteger());
        System.out.println("Count of streams of that kind available AS Integer === " + jMetaDataGeneral.getStreamCountAsInteger());
    }

    /**
     * Test getStreamCountAsLong() method.
     */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsLong());
        System.out.println("Count of streams of that kind available AS Long === " + jMetaDataGeneral.getStreamCountAsLong());
    }

    /**
     * Test getStreamCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsLocalDateTime());
        System.out.println("Count of streams of that kind available AS LocalDateTime === " + jMetaDataGeneral.getStreamCountAsLocalDateTime());
    }

    /**
     * Test getStreamCountAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsLocalTime());
        System.out.println("Count of streams of that kind available AS LocalTime === " + jMetaDataGeneral.getStreamCountAsLocalTime());
    }

    /**
     * Test getStreamCountAsString() method.
     */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsString());
        System.out.println("Count of streams of that kind available AS String === " + jMetaDataGeneral.getStreamCountAsString());
    }

    /**
     * Test getStreamCountAsBoolean() method.
     */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsBoolean());
        System.out.println("Count of streams of that kind available AS Boolean === " + jMetaDataGeneral.getStreamCountAsBoolean());
    }

    /**
     * Test getStreamCountAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsBigInteger());
        System.out.println("Count of streams of that kind available AS BigInteger === " + jMetaDataGeneral.getStreamCountAsBigInteger());
    }

    /**
     * Test getStreamCountAsURL() method.
     */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamCountAsURL());
        System.out.println("Count of streams of that kind available AS URL === " + jMetaDataGeneral.getStreamCountAsURL());
    }

    /**
     * Test getMasteredByAsInteger() method.
     */
    @Test
    public void subTestGetMasteredByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsInteger());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS Integer === " + jMetaDataGeneral.getMasteredByAsInteger());
    }

    /**
     * Test getMasteredByAsLong() method.
     */
    @Test
    public void subTestGetMasteredByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsLong());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS Long === " + jMetaDataGeneral.getMasteredByAsLong());
    }

    /**
     * Test getMasteredByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMasteredByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsLocalDateTime());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS LocalDateTime === " + jMetaDataGeneral.getMasteredByAsLocalDateTime());
    }

    /**
     * Test getMasteredByAsLocalTime() method.
     */
    @Test
    public void subTestGetMasteredByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsLocalTime());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS LocalTime === " + jMetaDataGeneral.getMasteredByAsLocalTime());
    }

    /**
     * Test getMasteredByAsString() method.
     */
    @Test
    public void subTestGetMasteredByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsString());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS String === " + jMetaDataGeneral.getMasteredByAsString());
    }

    /**
     * Test getMasteredByAsBoolean() method.
     */
    @Test
    public void subTestGetMasteredByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsBoolean());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS Boolean === " + jMetaDataGeneral.getMasteredByAsBoolean());
    }

    /**
     * Test getMasteredByAsBigInteger() method.
     */
    @Test
    public void subTestGetMasteredByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsBigInteger());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS BigInteger === " + jMetaDataGeneral.getMasteredByAsBigInteger());
    }

    /**
     * Test getMasteredByAsURL() method.
     */
    @Test
    public void subTestGetMasteredByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMasteredByAsURL());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS URL === " + jMetaDataGeneral.getMasteredByAsURL());
    }

    /**
     * Test getOtherCountAsInteger() method.
     */
    @Test
    public void subTestGetOtherCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsInteger());
        System.out.println("Number of other streams AS Integer === " + jMetaDataGeneral.getOtherCountAsInteger());
    }

    /**
     * Test getOtherCountAsLong() method.
     */
    @Test
    public void subTestGetOtherCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsLong());
        System.out.println("Number of other streams AS Long === " + jMetaDataGeneral.getOtherCountAsLong());
    }

    /**
     * Test getOtherCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOtherCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsLocalDateTime());
        System.out.println("Number of other streams AS LocalDateTime === " + jMetaDataGeneral.getOtherCountAsLocalDateTime());
    }

    /**
     * Test getOtherCountAsLocalTime() method.
     */
    @Test
    public void subTestGetOtherCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsLocalTime());
        System.out.println("Number of other streams AS LocalTime === " + jMetaDataGeneral.getOtherCountAsLocalTime());
    }

    /**
     * Test getOtherCountAsString() method.
     */
    @Test
    public void subTestGetOtherCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsString());
        System.out.println("Number of other streams AS String === " + jMetaDataGeneral.getOtherCountAsString());
    }

    /**
     * Test getOtherCountAsBoolean() method.
     */
    @Test
    public void subTestGetOtherCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsBoolean());
        System.out.println("Number of other streams AS Boolean === " + jMetaDataGeneral.getOtherCountAsBoolean());
    }

    /**
     * Test getOtherCountAsBigInteger() method.
     */
    @Test
    public void subTestGetOtherCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsBigInteger());
        System.out.println("Number of other streams AS BigInteger === " + jMetaDataGeneral.getOtherCountAsBigInteger());
    }

    /**
     * Test getOtherCountAsURL() method.
     */
    @Test
    public void subTestGetOtherCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOtherCountAsURL());
        System.out.println("Number of other streams AS URL === " + jMetaDataGeneral.getOtherCountAsURL());
    }

    /**
     * Test getGeneralCountAsInteger() method.
     */
    @Test
    public void subTestGetGeneralCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsInteger());
        System.out.println("Number of general streams AS Integer === " + jMetaDataGeneral.getGeneralCountAsInteger());
    }

    /**
     * Test getGeneralCountAsLong() method.
     */
    @Test
    public void subTestGetGeneralCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsLong());
        System.out.println("Number of general streams AS Long === " + jMetaDataGeneral.getGeneralCountAsLong());
    }

    /**
     * Test getGeneralCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetGeneralCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsLocalDateTime());
        System.out.println("Number of general streams AS LocalDateTime === " + jMetaDataGeneral.getGeneralCountAsLocalDateTime());
    }

    /**
     * Test getGeneralCountAsLocalTime() method.
     */
    @Test
    public void subTestGetGeneralCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsLocalTime());
        System.out.println("Number of general streams AS LocalTime === " + jMetaDataGeneral.getGeneralCountAsLocalTime());
    }

    /**
     * Test getGeneralCountAsString() method.
     */
    @Test
    public void subTestGetGeneralCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsString());
        System.out.println("Number of general streams AS String === " + jMetaDataGeneral.getGeneralCountAsString());
    }

    /**
     * Test getGeneralCountAsBoolean() method.
     */
    @Test
    public void subTestGetGeneralCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsBoolean());
        System.out.println("Number of general streams AS Boolean === " + jMetaDataGeneral.getGeneralCountAsBoolean());
    }

    /**
     * Test getGeneralCountAsBigInteger() method.
     */
    @Test
    public void subTestGetGeneralCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsBigInteger());
        System.out.println("Number of general streams AS BigInteger === " + jMetaDataGeneral.getGeneralCountAsBigInteger());
    }

    /**
     * Test getGeneralCountAsURL() method.
     */
    @Test
    public void subTestGetGeneralCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getGeneralCountAsURL());
        System.out.println("Number of general streams AS URL === " + jMetaDataGeneral.getGeneralCountAsURL());
    }

    /**
     * Test getCopyrightUrlAsInteger() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsInteger());
        System.out.println("Link to a site with copyright/legal information. AS Integer === " + jMetaDataGeneral.getCopyrightUrlAsInteger());
    }

    /**
     * Test getCopyrightUrlAsLong() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsLong());
        System.out.println("Link to a site with copyright/legal information. AS Long === " + jMetaDataGeneral.getCopyrightUrlAsLong());
    }

    /**
     * Test getCopyrightUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsLocalDateTime());
        System.out.println("Link to a site with copyright/legal information. AS LocalDateTime === " + jMetaDataGeneral.getCopyrightUrlAsLocalDateTime());
    }

    /**
     * Test getCopyrightUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsLocalTime());
        System.out.println("Link to a site with copyright/legal information. AS LocalTime === " + jMetaDataGeneral.getCopyrightUrlAsLocalTime());
    }

    /**
     * Test getCopyrightUrlAsString() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsString());
        System.out.println("Link to a site with copyright/legal information. AS String === " + jMetaDataGeneral.getCopyrightUrlAsString());
    }

    /**
     * Test getCopyrightUrlAsBoolean() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsBoolean());
        System.out.println("Link to a site with copyright/legal information. AS Boolean === " + jMetaDataGeneral.getCopyrightUrlAsBoolean());
    }

    /**
     * Test getCopyrightUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsBigInteger());
        System.out.println("Link to a site with copyright/legal information. AS BigInteger === " + jMetaDataGeneral.getCopyrightUrlAsBigInteger());
    }

    /**
     * Test getCopyrightUrlAsURL() method.
     */
    @Test
    public void subTestGetCopyrightUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCopyrightUrlAsURL());
        System.out.println("Link to a site with copyright/legal information. AS URL === " + jMetaDataGeneral.getCopyrightUrlAsURL());
    }

    /**
     * Test getAlbumReplayGainGainStringAsInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsInteger());
        System.out.println("Album_ReplayGain_Gain/String AS Integer === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsInteger());
    }

    /**
     * Test getAlbumReplayGainGainStringAsLong() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsLong());
        System.out.println("Album_ReplayGain_Gain/String AS Long === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsLong());
    }

    /**
     * Test getAlbumReplayGainGainStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalDateTime());
        System.out.println("Album_ReplayGain_Gain/String AS LocalDateTime === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalDateTime());
    }

    /**
     * Test getAlbumReplayGainGainStringAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalTime());
        System.out.println("Album_ReplayGain_Gain/String AS LocalTime === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalTime());
    }

    /**
     * Test getAlbumReplayGainGainStringAsString() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsString());
        System.out.println("Album_ReplayGain_Gain/String AS String === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsString());
    }

    /**
     * Test getAlbumReplayGainGainStringAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsBoolean());
        System.out.println("Album_ReplayGain_Gain/String AS Boolean === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsBoolean());
    }

    /**
     * Test getAlbumReplayGainGainStringAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsBigInteger());
        System.out.println("Album_ReplayGain_Gain/String AS BigInteger === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsBigInteger());
    }

    /**
     * Test getAlbumReplayGainGainStringAsURL() method.
     */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumReplayGainGainStringAsURL());
        System.out.println("Album_ReplayGain_Gain/String AS URL === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsURL());
    }

    /**
     * Test getVideoCountAsInteger() method.
     */
    @Test
    public void subTestGetVideoCountAsInteger() {
        assertEquals(Integer.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsInteger());
        System.out.println("Number of video streams AS Integer === " + jMetaDataGeneral.getVideoCountAsInteger());
    }

    /**
     * Test getVideoCountAsLong() method.
     */
    @Test
    public void subTestGetVideoCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsLong());
        System.out.println("Number of video streams AS Long === " + jMetaDataGeneral.getVideoCountAsLong());
    }

    /**
     * Test getVideoCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsLocalDateTime());
        System.out.println("Number of video streams AS LocalDateTime === " + jMetaDataGeneral.getVideoCountAsLocalDateTime());
    }

    /**
     * Test getVideoCountAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsLocalTime());
        System.out.println("Number of video streams AS LocalTime === " + jMetaDataGeneral.getVideoCountAsLocalTime());
    }

    /**
     * Test getVideoCountAsString() method.
     */
    @Test
    public void subTestGetVideoCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsString());
        System.out.println("Number of video streams AS String === " + jMetaDataGeneral.getVideoCountAsString());
    }

    /**
     * Test getVideoCountAsBoolean() method.
     */
    @Test
    public void subTestGetVideoCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsBoolean());
        System.out.println("Number of video streams AS Boolean === " + jMetaDataGeneral.getVideoCountAsBoolean());
    }

    /**
     * Test getVideoCountAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoCountAsBigInteger() {
        assertEquals(BigInteger.valueOf(1), JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsBigInteger());
        System.out.println("Number of video streams AS BigInteger === " + jMetaDataGeneral.getVideoCountAsBigInteger());
    }

    /**
     * Test getVideoCountAsURL() method.
     */
    @Test
    public void subTestGetVideoCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoCountAsURL());
        System.out.println("Number of video streams AS URL === " + jMetaDataGeneral.getVideoCountAsURL());
    }

    /**
     * Test getDurationString2AsInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(Integer.valueOf(102), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataGeneral.getDurationString2AsInteger());
    }

    /**
     * Test getDurationString2AsLong() method.
     */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataGeneral.getDurationString2AsLong());
    }

    /**
     * Test getDurationString2AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataGeneral.getDurationString2AsLocalDateTime());
    }

    /**
     * Test getDurationString2AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataGeneral.getDurationString2AsLocalTime());
    }

    /**
     * Test getDurationString2AsString() method.
     */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataGeneral.getDurationString2AsString());
    }

    /**
     * Test getDurationString2AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataGeneral.getDurationString2AsBoolean());
    }

    /**
     * Test getDurationString2AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataGeneral.getDurationString2AsBigInteger());
    }

    /**
     * Test getDurationString2AsURL() method.
     */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString2AsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataGeneral.getDurationString2AsURL());
    }

    /**
     * Test getDurationString3AsInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(Integer.valueOf(1002055), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataGeneral.getDurationString3AsInteger());
    }

    /**
     * Test getDurationString3AsLong() method.
     */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsLong());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataGeneral.getDurationString3AsLong());
    }

    /**
     * Test getDurationString3AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataGeneral.getDurationString3AsLocalDateTime());
    }

    /**
     * Test getDurationString3AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataGeneral.getDurationString3AsLocalTime());
    }

    /**
     * Test getDurationString3AsString() method.
     */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsString());
        System.out.println("Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataGeneral.getDurationString3AsString());
    }

    /**
     * Test getDurationString3AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataGeneral.getDurationString3AsBoolean());
    }

    /**
     * Test getDurationString3AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataGeneral.getDurationString3AsBigInteger());
    }

    /**
     * Test getDurationString3AsURL() method.
     */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString3AsURL());
        System.out.println("Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataGeneral.getDurationString3AsURL());
    }

    /**
     * Test getDurationString1AsInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataGeneral.getDurationString1AsInteger());
    }

    /**
     * Test getDurationString1AsLong() method.
     */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsLong());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataGeneral.getDurationString1AsLong());
    }

    /**
     * Test getDurationString1AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsLocalDateTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataGeneral.getDurationString1AsLocalDateTime());
    }

    /**
     * Test getDurationString1AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsLocalTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataGeneral.getDurationString1AsLocalTime());
    }

    /**
     * Test getDurationString1AsString() method.
     */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsString());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataGeneral.getDurationString1AsString());
    }

    /**
     * Test getDurationString1AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsBoolean());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataGeneral.getDurationString1AsBoolean());
    }

    /**
     * Test getDurationString1AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsBigInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataGeneral.getDurationString1AsBigInteger());
    }

    /**
     * Test getDurationString1AsURL() method.
     */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString1AsURL());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataGeneral.getDurationString1AsURL());
    }

    /**
     * Test getOverallBitRateNominalStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsInteger());
        System.out.println("Nominal Bit rate (with measurement) AS Integer === " + jMetaDataGeneral.getOverallBitRateNominalStringAsInteger());
    }

    /**
     * Test getOverallBitRateNominalStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsLong());
        System.out.println("Nominal Bit rate (with measurement) AS Long === " + jMetaDataGeneral.getOverallBitRateNominalStringAsLong());
    }

    /**
     * Test getOverallBitRateNominalStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsLocalDateTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateNominalStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateNominalStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsLocalTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateNominalStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateNominalStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsString());
        System.out.println("Nominal Bit rate (with measurement) AS String === " + jMetaDataGeneral.getOverallBitRateNominalStringAsString());
    }

    /**
     * Test getOverallBitRateNominalStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsBoolean());
        System.out.println("Nominal Bit rate (with measurement) AS Boolean === " + jMetaDataGeneral.getOverallBitRateNominalStringAsBoolean());
    }

    /**
     * Test getOverallBitRateNominalStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsBigInteger());
        System.out.println("Nominal Bit rate (with measurement) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateNominalStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateNominalStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateNominalStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateNominalStringAsURL());
        System.out.println("Nominal Bit rate (with measurement) AS URL === " + jMetaDataGeneral.getOverallBitRateNominalStringAsURL());
    }

    /**
     * Test getPeriodAsInteger() method.
     */
    @Test
    public void subTestGetPeriodAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsInteger());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS Integer === " + jMetaDataGeneral.getPeriodAsInteger());
    }

    /**
     * Test getPeriodAsLong() method.
     */
    @Test
    public void subTestGetPeriodAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsLong());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS Long === " + jMetaDataGeneral.getPeriodAsLong());
    }

    /**
     * Test getPeriodAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPeriodAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsLocalDateTime());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS LocalDateTime === " + jMetaDataGeneral.getPeriodAsLocalDateTime());
    }

    /**
     * Test getPeriodAsLocalTime() method.
     */
    @Test
    public void subTestGetPeriodAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsLocalTime());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS LocalTime === " + jMetaDataGeneral.getPeriodAsLocalTime());
    }

    /**
     * Test getPeriodAsString() method.
     */
    @Test
    public void subTestGetPeriodAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsString());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS String === " + jMetaDataGeneral.getPeriodAsString());
    }

    /**
     * Test getPeriodAsBoolean() method.
     */
    @Test
    public void subTestGetPeriodAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsBoolean());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS Boolean === " + jMetaDataGeneral.getPeriodAsBoolean());
    }

    /**
     * Test getPeriodAsBigInteger() method.
     */
    @Test
    public void subTestGetPeriodAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsBigInteger());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS BigInteger === " + jMetaDataGeneral.getPeriodAsBigInteger());
    }

    /**
     * Test getPeriodAsURL() method.
     */
    @Test
    public void subTestGetPeriodAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPeriodAsURL());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS URL === " + jMetaDataGeneral.getPeriodAsURL());
    }

    /**
     * Test getDurationString4AsInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(Integer.valueOf(100201), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataGeneral.getDurationString4AsInteger());
    }

    /**
     * Test getDurationString4AsLong() method.
     */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(Long.valueOf(100201), JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataGeneral.getDurationString4AsLong());
    }

    /**
     * Test getDurationString4AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataGeneral.getDurationString4AsLocalDateTime());
    }

    /**
     * Test getDurationString4AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataGeneral.getDurationString4AsLocalTime());
    }

    /**
     * Test getDurationString4AsString() method.
     */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataGeneral.getDurationString4AsString());
    }

    /**
     * Test getDurationString4AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataGeneral.getDurationString4AsBoolean());
    }

    /**
     * Test getDurationString4AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataGeneral.getDurationString4AsBigInteger());
    }

    /**
     * Test getDurationString4AsURL() method.
     */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataGeneral.getDurationString4AsURL());
    }

    /**
     * Test getDurationString5AsInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataGeneral.getDurationString5AsInteger());
    }

    /**
     * Test getDurationString5AsLong() method.
     */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataGeneral.getDurationString5AsLong());
    }

    /**
     * Test getDurationString5AsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataGeneral.getDurationString5AsLocalDateTime());
    }

    /**
     * Test getDurationString5AsLocalTime() method.
     */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataGeneral.getDurationString5AsLocalTime());
    }

    /**
     * Test getDurationString5AsString() method.
     */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataGeneral.getDurationString5AsString());
    }

    /**
     * Test getDurationString5AsBoolean() method.
     */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataGeneral.getDurationString5AsBoolean());
    }

    /**
     * Test getDurationString5AsBigInteger() method.
     */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataGeneral.getDurationString5AsBigInteger());
    }

    /**
     * Test getDurationString5AsURL() method.
     */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataGeneral.getDurationString5AsURL());
    }

    /**
     * Test getDurationStartAsInteger() method.
     */
    @Test
    public void subTestGetDurationStartAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsInteger());
        System.out.println("Duration_Start AS Integer === " + jMetaDataGeneral.getDurationStartAsInteger());
    }

    /**
     * Test getDurationStartAsLong() method.
     */
    @Test
    public void subTestGetDurationStartAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsLong());
        System.out.println("Duration_Start AS Long === " + jMetaDataGeneral.getDurationStartAsLong());
    }

    /**
     * Test getDurationStartAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationStartAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsLocalDateTime());
        System.out.println("Duration_Start AS LocalDateTime === " + jMetaDataGeneral.getDurationStartAsLocalDateTime());
    }

    /**
     * Test getDurationStartAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationStartAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsLocalTime());
        System.out.println("Duration_Start AS LocalTime === " + jMetaDataGeneral.getDurationStartAsLocalTime());
    }

    /**
     * Test getDurationStartAsString() method.
     */
    @Test
    public void subTestGetDurationStartAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsString());
        System.out.println("Duration_Start AS String === " + jMetaDataGeneral.getDurationStartAsString());
    }

    /**
     * Test getDurationStartAsBoolean() method.
     */
    @Test
    public void subTestGetDurationStartAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsBoolean());
        System.out.println("Duration_Start AS Boolean === " + jMetaDataGeneral.getDurationStartAsBoolean());
    }

    /**
     * Test getDurationStartAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationStartAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsBigInteger());
        System.out.println("Duration_Start AS BigInteger === " + jMetaDataGeneral.getDurationStartAsBigInteger());
    }

    /**
     * Test getDurationStartAsURL() method.
     */
    @Test
    public void subTestGetDurationStartAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationStartAsURL());
        System.out.println("Duration_Start AS URL === " + jMetaDataGeneral.getDurationStartAsURL());
    }

    /**
     * Test getOriginalNetworkNameAsInteger() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsInteger());
        System.out.println("OriginalNetworkName AS Integer === " + jMetaDataGeneral.getOriginalNetworkNameAsInteger());
    }

    /**
     * Test getOriginalNetworkNameAsLong() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsLong());
        System.out.println("OriginalNetworkName AS Long === " + jMetaDataGeneral.getOriginalNetworkNameAsLong());
    }

    /**
     * Test getOriginalNetworkNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsLocalDateTime());
        System.out.println("OriginalNetworkName AS LocalDateTime === " + jMetaDataGeneral.getOriginalNetworkNameAsLocalDateTime());
    }

    /**
     * Test getOriginalNetworkNameAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsLocalTime());
        System.out.println("OriginalNetworkName AS LocalTime === " + jMetaDataGeneral.getOriginalNetworkNameAsLocalTime());
    }

    /**
     * Test getOriginalNetworkNameAsString() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsString());
        System.out.println("OriginalNetworkName AS String === " + jMetaDataGeneral.getOriginalNetworkNameAsString());
    }

    /**
     * Test getOriginalNetworkNameAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsBoolean());
        System.out.println("OriginalNetworkName AS Boolean === " + jMetaDataGeneral.getOriginalNetworkNameAsBoolean());
    }

    /**
     * Test getOriginalNetworkNameAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsBigInteger());
        System.out.println("OriginalNetworkName AS BigInteger === " + jMetaDataGeneral.getOriginalNetworkNameAsBigInteger());
    }

    /**
     * Test getOriginalNetworkNameAsURL() method.
     */
    @Test
    public void subTestGetOriginalNetworkNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalNetworkNameAsURL());
        System.out.println("OriginalNetworkName AS URL === " + jMetaDataGeneral.getOriginalNetworkNameAsURL());
    }

    /**
     * Test getEPGPositionsBeginAsInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsInteger());
        System.out.println("EPG_Positions_Begin AS Integer === " + jMetaDataGeneral.getEPGPositionsBeginAsInteger());
    }

    /**
     * Test getEPGPositionsBeginAsLong() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsLong());
        System.out.println("EPG_Positions_Begin AS Long === " + jMetaDataGeneral.getEPGPositionsBeginAsLong());
    }

    /**
     * Test getEPGPositionsBeginAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsLocalDateTime());
        System.out.println("EPG_Positions_Begin AS LocalDateTime === " + jMetaDataGeneral.getEPGPositionsBeginAsLocalDateTime());
    }

    /**
     * Test getEPGPositionsBeginAsLocalTime() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsLocalTime());
        System.out.println("EPG_Positions_Begin AS LocalTime === " + jMetaDataGeneral.getEPGPositionsBeginAsLocalTime());
    }

    /**
     * Test getEPGPositionsBeginAsString() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsString());
        System.out.println("EPG_Positions_Begin AS String === " + jMetaDataGeneral.getEPGPositionsBeginAsString());
    }

    /**
     * Test getEPGPositionsBeginAsBoolean() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsBoolean());
        System.out.println("EPG_Positions_Begin AS Boolean === " + jMetaDataGeneral.getEPGPositionsBeginAsBoolean());
    }

    /**
     * Test getEPGPositionsBeginAsBigInteger() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsBigInteger());
        System.out.println("EPG_Positions_Begin AS BigInteger === " + jMetaDataGeneral.getEPGPositionsBeginAsBigInteger());
    }

    /**
     * Test getEPGPositionsBeginAsURL() method.
     */
    @Test
    public void subTestGetEPGPositionsBeginAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEPGPositionsBeginAsURL());
        System.out.println("EPG_Positions_Begin AS URL === " + jMetaDataGeneral.getEPGPositionsBeginAsURL());
    }

    /**
     * Test getVideoFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsInteger());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getVideoFormatWithHintListAsInteger());
    }

    /**
     * Test getVideoFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsLong());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getVideoFormatWithHintListAsLong());
    }

    /**
     * Test getVideoFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsLocalDateTime());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getVideoFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getVideoFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsLocalTime());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getVideoFormatWithHintListAsLocalTime());
    }

    /**
     * Test getVideoFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsString());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getVideoFormatWithHintListAsString());
    }

    /**
     * Test getVideoFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsBoolean());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getVideoFormatWithHintListAsBoolean());
    }

    /**
     * Test getVideoFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsBigInteger());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getVideoFormatWithHintListAsBigInteger());
    }

    /**
     * Test getVideoFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetVideoFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getVideoFormatWithHintListAsURL());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getVideoFormatWithHintListAsURL());
    }

    /**
     * Test getDelaySourceAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataGeneral.getDelaySourceAsInteger());
    }

    /**
     * Test getDelaySourceAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataGeneral.getDelaySourceAsLong());
    }

    /**
     * Test getDelaySourceAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataGeneral.getDelaySourceAsLocalDateTime());
    }

    /**
     * Test getDelaySourceAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataGeneral.getDelaySourceAsLocalTime());
    }

    /**
     * Test getDelaySourceAsString() method.
     */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataGeneral.getDelaySourceAsString());
    }

    /**
     * Test getDelaySourceAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataGeneral.getDelaySourceAsBoolean());
    }

    /**
     * Test getDelaySourceAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataGeneral.getDelaySourceAsBigInteger());
    }

    /**
     * Test getDelaySourceAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataGeneral.getDelaySourceAsURL());
    }

    /**
     * Test getPerformerAsInteger() method.
     */
    @Test
    public void subTestGetPerformerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsInteger());
        System.out.println("Main performer/artist of this file AS Integer === " + jMetaDataGeneral.getPerformerAsInteger());
    }

    /**
     * Test getPerformerAsLong() method.
     */
    @Test
    public void subTestGetPerformerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsLong());
        System.out.println("Main performer/artist of this file AS Long === " + jMetaDataGeneral.getPerformerAsLong());
    }

    /**
     * Test getPerformerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPerformerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsLocalDateTime());
        System.out.println("Main performer/artist of this file AS LocalDateTime === " + jMetaDataGeneral.getPerformerAsLocalDateTime());
    }

    /**
     * Test getPerformerAsLocalTime() method.
     */
    @Test
    public void subTestGetPerformerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsLocalTime());
        System.out.println("Main performer/artist of this file AS LocalTime === " + jMetaDataGeneral.getPerformerAsLocalTime());
    }

    /**
     * Test getPerformerAsString() method.
     */
    @Test
    public void subTestGetPerformerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsString());
        System.out.println("Main performer/artist of this file AS String === " + jMetaDataGeneral.getPerformerAsString());
    }

    /**
     * Test getPerformerAsBoolean() method.
     */
    @Test
    public void subTestGetPerformerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsBoolean());
        System.out.println("Main performer/artist of this file AS Boolean === " + jMetaDataGeneral.getPerformerAsBoolean());
    }

    /**
     * Test getPerformerAsBigInteger() method.
     */
    @Test
    public void subTestGetPerformerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsBigInteger());
        System.out.println("Main performer/artist of this file AS BigInteger === " + jMetaDataGeneral.getPerformerAsBigInteger());
    }

    /**
     * Test getPerformerAsURL() method.
     */
    @Test
    public void subTestGetPerformerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerAsURL());
        System.out.println("Main performer/artist of this file AS URL === " + jMetaDataGeneral.getPerformerAsURL());
    }

    /**
     * Test getProducerAsInteger() method.
     */
    @Test
    public void subTestGetProducerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsInteger());
        System.out.println("Name of the producer of the movie. AS Integer === " + jMetaDataGeneral.getProducerAsInteger());
    }

    /**
     * Test getProducerAsLong() method.
     */
    @Test
    public void subTestGetProducerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsLong());
        System.out.println("Name of the producer of the movie. AS Long === " + jMetaDataGeneral.getProducerAsLong());
    }

    /**
     * Test getProducerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProducerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsLocalDateTime());
        System.out.println("Name of the producer of the movie. AS LocalDateTime === " + jMetaDataGeneral.getProducerAsLocalDateTime());
    }

    /**
     * Test getProducerAsLocalTime() method.
     */
    @Test
    public void subTestGetProducerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsLocalTime());
        System.out.println("Name of the producer of the movie. AS LocalTime === " + jMetaDataGeneral.getProducerAsLocalTime());
    }

    /**
     * Test getProducerAsString() method.
     */
    @Test
    public void subTestGetProducerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsString());
        System.out.println("Name of the producer of the movie. AS String === " + jMetaDataGeneral.getProducerAsString());
    }

    /**
     * Test getProducerAsBoolean() method.
     */
    @Test
    public void subTestGetProducerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsBoolean());
        System.out.println("Name of the producer of the movie. AS Boolean === " + jMetaDataGeneral.getProducerAsBoolean());
    }

    /**
     * Test getProducerAsBigInteger() method.
     */
    @Test
    public void subTestGetProducerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsBigInteger());
        System.out.println("Name of the producer of the movie. AS BigInteger === " + jMetaDataGeneral.getProducerAsBigInteger());
    }

    /**
     * Test getProducerAsURL() method.
     */
    @Test
    public void subTestGetProducerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerAsURL());
        System.out.println("Name of the producer of the movie. AS URL === " + jMetaDataGeneral.getProducerAsURL());
    }

    /**
     * Test getSeasonPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsInteger());
        System.out.println("Place of the season e.g. 2 of 7 AS Integer === " + jMetaDataGeneral.getSeasonPositionTotalAsInteger());
    }

    /**
     * Test getSeasonPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsLong());
        System.out.println("Place of the season e.g. 2 of 7 AS Long === " + jMetaDataGeneral.getSeasonPositionTotalAsLong());
    }

    /**
     * Test getSeasonPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsLocalDateTime());
        System.out.println("Place of the season e.g. 2 of 7 AS LocalDateTime === " + jMetaDataGeneral.getSeasonPositionTotalAsLocalDateTime());
    }

    /**
     * Test getSeasonPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsLocalTime());
        System.out.println("Place of the season e.g. 2 of 7 AS LocalTime === " + jMetaDataGeneral.getSeasonPositionTotalAsLocalTime());
    }

    /**
     * Test getSeasonPositionTotalAsString() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsString());
        System.out.println("Place of the season e.g. 2 of 7 AS String === " + jMetaDataGeneral.getSeasonPositionTotalAsString());
    }

    /**
     * Test getSeasonPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsBoolean());
        System.out.println("Place of the season e.g. 2 of 7 AS Boolean === " + jMetaDataGeneral.getSeasonPositionTotalAsBoolean());
    }

    /**
     * Test getSeasonPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsBigInteger());
        System.out.println("Place of the season e.g. 2 of 7 AS BigInteger === " + jMetaDataGeneral.getSeasonPositionTotalAsBigInteger());
    }

    /**
     * Test getSeasonPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetSeasonPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSeasonPositionTotalAsURL());
        System.out.println("Place of the season e.g. 2 of 7 AS URL === " + jMetaDataGeneral.getSeasonPositionTotalAsURL());
    }

    /**
     * Test getActorCharacterAsInteger() method.
     */
    @Test
    public void subTestGetActorCharacterAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsInteger());
        System.out.println("Name of the character an actor or actress plays in this movie. AS Integer === " + jMetaDataGeneral.getActorCharacterAsInteger());
    }

    /**
     * Test getActorCharacterAsLong() method.
     */
    @Test
    public void subTestGetActorCharacterAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsLong());
        System.out.println("Name of the character an actor or actress plays in this movie. AS Long === " + jMetaDataGeneral.getActorCharacterAsLong());
    }

    /**
     * Test getActorCharacterAsLocalDateTime() method.
     */
    @Test
    public void subTestGetActorCharacterAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsLocalDateTime());
        System.out.println("Name of the character an actor or actress plays in this movie. AS LocalDateTime === " + jMetaDataGeneral.getActorCharacterAsLocalDateTime());
    }

    /**
     * Test getActorCharacterAsLocalTime() method.
     */
    @Test
    public void subTestGetActorCharacterAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsLocalTime());
        System.out.println("Name of the character an actor or actress plays in this movie. AS LocalTime === " + jMetaDataGeneral.getActorCharacterAsLocalTime());
    }

    /**
     * Test getActorCharacterAsString() method.
     */
    @Test
    public void subTestGetActorCharacterAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsString());
        System.out.println("Name of the character an actor or actress plays in this movie. AS String === " + jMetaDataGeneral.getActorCharacterAsString());
    }

    /**
     * Test getActorCharacterAsBoolean() method.
     */
    @Test
    public void subTestGetActorCharacterAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsBoolean());
        System.out.println("Name of the character an actor or actress plays in this movie. AS Boolean === " + jMetaDataGeneral.getActorCharacterAsBoolean());
    }

    /**
     * Test getActorCharacterAsBigInteger() method.
     */
    @Test
    public void subTestGetActorCharacterAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsBigInteger());
        System.out.println("Name of the character an actor or actress plays in this movie. AS BigInteger === " + jMetaDataGeneral.getActorCharacterAsBigInteger());
    }

    /**
     * Test getActorCharacterAsURL() method.
     */
    @Test
    public void subTestGetActorCharacterAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getActorCharacterAsURL());
        System.out.println("Name of the character an actor or actress plays in this movie. AS URL === " + jMetaDataGeneral.getActorCharacterAsURL());
    }

    /**
     * Test getOverallBitRateMaximumAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsInteger());
        System.out.println("Maximum Bit rate in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateMaximumAsInteger());
    }

    /**
     * Test getOverallBitRateMaximumAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsLong());
        System.out.println("Maximum Bit rate in bps AS Long === " + jMetaDataGeneral.getOverallBitRateMaximumAsLong());
    }

    /**
     * Test getOverallBitRateMaximumAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsLocalDateTime());
        System.out.println("Maximum Bit rate in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMaximumAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateMaximumAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsLocalTime());
        System.out.println("Maximum Bit rate in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMaximumAsLocalTime());
    }

    /**
     * Test getOverallBitRateMaximumAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsString());
        System.out.println("Maximum Bit rate in bps AS String === " + jMetaDataGeneral.getOverallBitRateMaximumAsString());
    }

    /**
     * Test getOverallBitRateMaximumAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsBoolean());
        System.out.println("Maximum Bit rate in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateMaximumAsBoolean());
    }

    /**
     * Test getOverallBitRateMaximumAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsBigInteger());
        System.out.println("Maximum Bit rate in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMaximumAsBigInteger());
    }

    /**
     * Test getOverallBitRateMaximumAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateMaximumAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateMaximumAsURL());
        System.out.println("Maximum Bit rate in bps AS URL === " + jMetaDataGeneral.getOverallBitRateMaximumAsURL());
    }

    /**
     * Test getCollectionAsInteger() method.
     */
    @Test
    public void subTestGetCollectionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsInteger());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS Integer === " + jMetaDataGeneral.getCollectionAsInteger());
    }

    /**
     * Test getCollectionAsLong() method.
     */
    @Test
    public void subTestGetCollectionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsLong());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS Long === " + jMetaDataGeneral.getCollectionAsLong());
    }

    /**
     * Test getCollectionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCollectionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsLocalDateTime());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS LocalDateTime === " + jMetaDataGeneral.getCollectionAsLocalDateTime());
    }

    /**
     * Test getCollectionAsLocalTime() method.
     */
    @Test
    public void subTestGetCollectionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsLocalTime());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS LocalTime === " + jMetaDataGeneral.getCollectionAsLocalTime());
    }

    /**
     * Test getCollectionAsString() method.
     */
    @Test
    public void subTestGetCollectionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsString());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS String === " + jMetaDataGeneral.getCollectionAsString());
    }

    /**
     * Test getCollectionAsBoolean() method.
     */
    @Test
    public void subTestGetCollectionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsBoolean());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS Boolean === " + jMetaDataGeneral.getCollectionAsBoolean());
    }

    /**
     * Test getCollectionAsBigInteger() method.
     */
    @Test
    public void subTestGetCollectionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsBigInteger());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS BigInteger === " + jMetaDataGeneral.getCollectionAsBigInteger());
    }

    /**
     * Test getCollectionAsURL() method.
     */
    @Test
    public void subTestGetCollectionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCollectionAsURL());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS URL === " + jMetaDataGeneral.getCollectionAsURL());
    }

    /**
     * Test getStreamSizeDemuxedAsInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedAsInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsLong() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsLong());
        System.out.println("StreamSize in bytes of hte stream after demux AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedAsLong());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsLocalDateTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedAsLocalDateTime());
    }

    /**
     * Test getStreamSizeDemuxedAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsLocalTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedAsLocalTime());
    }

    /**
     * Test getStreamSizeDemuxedAsString() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsString());
        System.out.println("StreamSize in bytes of hte stream after demux AS String === " + jMetaDataGeneral.getStreamSizeDemuxedAsString());
    }

    /**
     * Test getStreamSizeDemuxedAsBoolean() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsBoolean());
        System.out.println("StreamSize in bytes of hte stream after demux AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedAsBoolean());
    }

    /**
     * Test getStreamSizeDemuxedAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsBigInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedAsBigInteger());
    }

    /**
     * Test getStreamSizeDemuxedAsURL() method.
     */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamSizeDemuxedAsURL());
        System.out.println("StreamSize in bytes of hte stream after demux AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedAsURL());
    }

    /**
     * Test getMenuFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsInteger());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS Integer === " + jMetaDataGeneral.getMenuFormatWithHintListAsInteger());
    }

    /**
     * Test getMenuFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsLong());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS Long === " + jMetaDataGeneral.getMenuFormatWithHintListAsLong());
    }

    /**
     * Test getMenuFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsLocalDateTime());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS LocalDateTime === " + jMetaDataGeneral.getMenuFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getMenuFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsLocalTime());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS LocalTime === " + jMetaDataGeneral.getMenuFormatWithHintListAsLocalTime());
    }

    /**
     * Test getMenuFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsString());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS String === " + jMetaDataGeneral.getMenuFormatWithHintListAsString());
    }

    /**
     * Test getMenuFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsBoolean());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS Boolean === " + jMetaDataGeneral.getMenuFormatWithHintListAsBoolean());
    }

    /**
     * Test getMenuFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsBigInteger());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS BigInteger === " + jMetaDataGeneral.getMenuFormatWithHintListAsBigInteger());
    }

    /**
     * Test getMenuFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetMenuFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatWithHintListAsURL());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS URL === " + jMetaDataGeneral.getMenuFormatWithHintListAsURL());
    }

    /**
     * Test getFormatSettingsAsInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsInteger());
        System.out.println("Settings needed for decoder used AS Integer === " + jMetaDataGeneral.getFormatSettingsAsInteger());
    }

    /**
     * Test getFormatSettingsAsLong() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsLong());
        System.out.println("Settings needed for decoder used AS Long === " + jMetaDataGeneral.getFormatSettingsAsLong());
    }

    /**
     * Test getFormatSettingsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsLocalDateTime());
        System.out.println("Settings needed for decoder used AS LocalDateTime === " + jMetaDataGeneral.getFormatSettingsAsLocalDateTime());
    }

    /**
     * Test getFormatSettingsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsLocalTime());
        System.out.println("Settings needed for decoder used AS LocalTime === " + jMetaDataGeneral.getFormatSettingsAsLocalTime());
    }

    /**
     * Test getFormatSettingsAsString() method.
     */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsString());
        System.out.println("Settings needed for decoder used AS String === " + jMetaDataGeneral.getFormatSettingsAsString());
    }

    /**
     * Test getFormatSettingsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsBoolean());
        System.out.println("Settings needed for decoder used AS Boolean === " + jMetaDataGeneral.getFormatSettingsAsBoolean());
    }

    /**
     * Test getFormatSettingsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsBigInteger());
        System.out.println("Settings needed for decoder used AS BigInteger === " + jMetaDataGeneral.getFormatSettingsAsBigInteger());
    }

    /**
     * Test getFormatSettingsAsURL() method.
     */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatSettingsAsURL());
        System.out.println("Settings needed for decoder used AS URL === " + jMetaDataGeneral.getFormatSettingsAsURL());
    }

    /**
     * Test getFileNameLastAsInteger() method.
     */
    @Test
    public void subTestGetFileNameLastAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsInteger());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getFileNameLastAsInteger());
    }

    /**
     * Test getFileNameLastAsLong() method.
     */
    @Test
    public void subTestGetFileNameLastAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsLong());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getFileNameLastAsLong());
    }

    /**
     * Test getFileNameLastAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileNameLastAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsLocalDateTime());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getFileNameLastAsLocalDateTime());
    }

    /**
     * Test getFileNameLastAsLocalTime() method.
     */
    @Test
    public void subTestGetFileNameLastAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsLocalTime());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getFileNameLastAsLocalTime());
    }

    /**
     * Test getFileNameLastAsString() method.
     */
    @Test
    public void subTestGetFileNameLastAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsString());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getFileNameLastAsString());
    }

    /**
     * Test getFileNameLastAsBoolean() method.
     */
    @Test
    public void subTestGetFileNameLastAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsBoolean());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getFileNameLastAsBoolean());
    }

    /**
     * Test getFileNameLastAsBigInteger() method.
     */
    @Test
    public void subTestGetFileNameLastAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsBigInteger());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getFileNameLastAsBigInteger());
    }

    /**
     * Test getFileNameLastAsURL() method.
     */
    @Test
    public void subTestGetFileNameLastAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileNameLastAsURL());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getFileNameLastAsURL());
    }

    /**
     * Test getBPMAsInteger() method.
     */
    @Test
    public void subTestGetBPMAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsInteger());
        System.out.println("Average number of beats per minute AS Integer === " + jMetaDataGeneral.getBPMAsInteger());
    }

    /**
     * Test getBPMAsLong() method.
     */
    @Test
    public void subTestGetBPMAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsLong());
        System.out.println("Average number of beats per minute AS Long === " + jMetaDataGeneral.getBPMAsLong());
    }

    /**
     * Test getBPMAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBPMAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsLocalDateTime());
        System.out.println("Average number of beats per minute AS LocalDateTime === " + jMetaDataGeneral.getBPMAsLocalDateTime());
    }

    /**
     * Test getBPMAsLocalTime() method.
     */
    @Test
    public void subTestGetBPMAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsLocalTime());
        System.out.println("Average number of beats per minute AS LocalTime === " + jMetaDataGeneral.getBPMAsLocalTime());
    }

    /**
     * Test getBPMAsString() method.
     */
    @Test
    public void subTestGetBPMAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsString());
        System.out.println("Average number of beats per minute AS String === " + jMetaDataGeneral.getBPMAsString());
    }

    /**
     * Test getBPMAsBoolean() method.
     */
    @Test
    public void subTestGetBPMAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsBoolean());
        System.out.println("Average number of beats per minute AS Boolean === " + jMetaDataGeneral.getBPMAsBoolean());
    }

    /**
     * Test getBPMAsBigInteger() method.
     */
    @Test
    public void subTestGetBPMAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsBigInteger());
        System.out.println("Average number of beats per minute AS BigInteger === " + jMetaDataGeneral.getBPMAsBigInteger());
    }

    /**
     * Test getBPMAsURL() method.
     */
    @Test
    public void subTestGetBPMAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBPMAsURL());
        System.out.println("Average number of beats per minute AS URL === " + jMetaDataGeneral.getBPMAsURL());
    }

    /**
     * Test getFileSizeAsInteger() method.
     */
    @Test
    public void subTestGetFileSizeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsInteger());
        System.out.println("File size in bytes AS Integer === " + jMetaDataGeneral.getFileSizeAsInteger());
    }

    /**
     * Test getFileSizeAsLong() method.
     */
    @Test
    public void subTestGetFileSizeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsLong());
        System.out.println("File size in bytes AS Long === " + jMetaDataGeneral.getFileSizeAsLong());
    }

    /**
     * Test getFileSizeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFileSizeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsLocalDateTime());
        System.out.println("File size in bytes AS LocalDateTime === " + jMetaDataGeneral.getFileSizeAsLocalDateTime());
    }

    /**
     * Test getFileSizeAsLocalTime() method.
     */
    @Test
    public void subTestGetFileSizeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsLocalTime());
        System.out.println("File size in bytes AS LocalTime === " + jMetaDataGeneral.getFileSizeAsLocalTime());
    }

    /**
     * Test getFileSizeAsString() method.
     */
    @Test
    public void subTestGetFileSizeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsString());
        System.out.println("File size in bytes AS String === " + jMetaDataGeneral.getFileSizeAsString());
    }

    /**
     * Test getFileSizeAsBoolean() method.
     */
    @Test
    public void subTestGetFileSizeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsBoolean());
        System.out.println("File size in bytes AS Boolean === " + jMetaDataGeneral.getFileSizeAsBoolean());
    }

    /**
     * Test getFileSizeAsBigInteger() method.
     */
    @Test
    public void subTestGetFileSizeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsBigInteger());
        System.out.println("File size in bytes AS BigInteger === " + jMetaDataGeneral.getFileSizeAsBigInteger());
    }

    /**
     * Test getFileSizeAsURL() method.
     */
    @Test
    public void subTestGetFileSizeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFileSizeAsURL());
        System.out.println("File size in bytes AS URL === " + jMetaDataGeneral.getFileSizeAsURL());
    }

    /**
     * Test getFirstPacketOrderAsInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataGeneral.getFirstPacketOrderAsInteger());
    }

    /**
     * Test getFirstPacketOrderAsLong() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsLong());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataGeneral.getFirstPacketOrderAsLong());
    }

    /**
     * Test getFirstPacketOrderAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsLocalDateTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataGeneral.getFirstPacketOrderAsLocalDateTime());
    }

    /**
     * Test getFirstPacketOrderAsLocalTime() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsLocalTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataGeneral.getFirstPacketOrderAsLocalTime());
    }

    /**
     * Test getFirstPacketOrderAsString() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsString());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataGeneral.getFirstPacketOrderAsString());
    }

    /**
     * Test getFirstPacketOrderAsBoolean() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsBoolean());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataGeneral.getFirstPacketOrderAsBoolean());
    }

    /**
     * Test getFirstPacketOrderAsBigInteger() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsBigInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataGeneral.getFirstPacketOrderAsBigInteger());
    }

    /**
     * Test getFirstPacketOrderAsURL() method.
     */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFirstPacketOrderAsURL());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataGeneral.getFirstPacketOrderAsURL());
    }

    /**
     * Test getIsStreamableAsInteger() method.
     */
    @Test
    public void subTestGetIsStreamableAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsInteger());
        System.out.println("IsStreamable AS Integer === " + jMetaDataGeneral.getIsStreamableAsInteger());
    }

    /**
     * Test getIsStreamableAsLong() method.
     */
    @Test
    public void subTestGetIsStreamableAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsLong());
        System.out.println("IsStreamable AS Long === " + jMetaDataGeneral.getIsStreamableAsLong());
    }

    /**
     * Test getIsStreamableAsLocalDateTime() method.
     */
    @Test
    public void subTestGetIsStreamableAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsLocalDateTime());
        System.out.println("IsStreamable AS LocalDateTime === " + jMetaDataGeneral.getIsStreamableAsLocalDateTime());
    }

    /**
     * Test getIsStreamableAsLocalTime() method.
     */
    @Test
    public void subTestGetIsStreamableAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsLocalTime());
        System.out.println("IsStreamable AS LocalTime === " + jMetaDataGeneral.getIsStreamableAsLocalTime());
    }

    /**
     * Test getIsStreamableAsString() method.
     */
    @Test
    public void subTestGetIsStreamableAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsString());
        System.out.println("IsStreamable AS String === " + jMetaDataGeneral.getIsStreamableAsString());
    }

    /**
     * Test getIsStreamableAsBoolean() method.
     */
    @Test
    public void subTestGetIsStreamableAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsBoolean());
        System.out.println("IsStreamable AS Boolean === " + jMetaDataGeneral.getIsStreamableAsBoolean());
    }

    /**
     * Test getIsStreamableAsBigInteger() method.
     */
    @Test
    public void subTestGetIsStreamableAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsBigInteger());
        System.out.println("IsStreamable AS BigInteger === " + jMetaDataGeneral.getIsStreamableAsBigInteger());
    }

    /**
     * Test getIsStreamableAsURL() method.
     */
    @Test
    public void subTestGetIsStreamableAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getIsStreamableAsURL());
        System.out.println("IsStreamable AS URL === " + jMetaDataGeneral.getIsStreamableAsURL());
    }

    /**
     * Test getLyricistAsInteger() method.
     */
    @Test
    public void subTestGetLyricistAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsInteger());
        System.out.println("The person who wrote the lyrics for a musical item. AS Integer === " + jMetaDataGeneral.getLyricistAsInteger());
    }

    /**
     * Test getLyricistAsLong() method.
     */
    @Test
    public void subTestGetLyricistAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsLong());
        System.out.println("The person who wrote the lyrics for a musical item. AS Long === " + jMetaDataGeneral.getLyricistAsLong());
    }

    /**
     * Test getLyricistAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLyricistAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsLocalDateTime());
        System.out.println("The person who wrote the lyrics for a musical item. AS LocalDateTime === " + jMetaDataGeneral.getLyricistAsLocalDateTime());
    }

    /**
     * Test getLyricistAsLocalTime() method.
     */
    @Test
    public void subTestGetLyricistAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsLocalTime());
        System.out.println("The person who wrote the lyrics for a musical item. AS LocalTime === " + jMetaDataGeneral.getLyricistAsLocalTime());
    }

    /**
     * Test getLyricistAsString() method.
     */
    @Test
    public void subTestGetLyricistAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsString());
        System.out.println("The person who wrote the lyrics for a musical item. AS String === " + jMetaDataGeneral.getLyricistAsString());
    }

    /**
     * Test getLyricistAsBoolean() method.
     */
    @Test
    public void subTestGetLyricistAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsBoolean());
        System.out.println("The person who wrote the lyrics for a musical item. AS Boolean === " + jMetaDataGeneral.getLyricistAsBoolean());
    }

    /**
     * Test getLyricistAsBigInteger() method.
     */
    @Test
    public void subTestGetLyricistAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsBigInteger());
        System.out.println("The person who wrote the lyrics for a musical item. AS BigInteger === " + jMetaDataGeneral.getLyricistAsBigInteger());
    }

    /**
     * Test getLyricistAsURL() method.
     */
    @Test
    public void subTestGetLyricistAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLyricistAsURL());
        System.out.println("The person who wrote the lyrics for a musical item. AS URL === " + jMetaDataGeneral.getLyricistAsURL());
    }

    /**
     * Test getDurationEndAsInteger() method.
     */
    @Test
    public void subTestGetDurationEndAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsInteger());
        System.out.println("Duration_End AS Integer === " + jMetaDataGeneral.getDurationEndAsInteger());
    }

    /**
     * Test getDurationEndAsLong() method.
     */
    @Test
    public void subTestGetDurationEndAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsLong());
        System.out.println("Duration_End AS Long === " + jMetaDataGeneral.getDurationEndAsLong());
    }

    /**
     * Test getDurationEndAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDurationEndAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsLocalDateTime());
        System.out.println("Duration_End AS LocalDateTime === " + jMetaDataGeneral.getDurationEndAsLocalDateTime());
    }

    /**
     * Test getDurationEndAsLocalTime() method.
     */
    @Test
    public void subTestGetDurationEndAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsLocalTime());
        System.out.println("Duration_End AS LocalTime === " + jMetaDataGeneral.getDurationEndAsLocalTime());
    }

    /**
     * Test getDurationEndAsString() method.
     */
    @Test
    public void subTestGetDurationEndAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsString());
        System.out.println("Duration_End AS String === " + jMetaDataGeneral.getDurationEndAsString());
    }

    /**
     * Test getDurationEndAsBoolean() method.
     */
    @Test
    public void subTestGetDurationEndAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsBoolean());
        System.out.println("Duration_End AS Boolean === " + jMetaDataGeneral.getDurationEndAsBoolean());
    }

    /**
     * Test getDurationEndAsBigInteger() method.
     */
    @Test
    public void subTestGetDurationEndAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsBigInteger());
        System.out.println("Duration_End AS BigInteger === " + jMetaDataGeneral.getDurationEndAsBigInteger());
    }

    /**
     * Test getDurationEndAsURL() method.
     */
    @Test
    public void subTestGetDurationEndAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDurationEndAsURL());
        System.out.println("Duration_End AS URL === " + jMetaDataGeneral.getDurationEndAsURL());
    }

    /**
     * Test getFormatExtensionsAsInteger() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsInteger());
        System.out.println("Known extensions of this format AS Integer === " + jMetaDataGeneral.getFormatExtensionsAsInteger());
    }

    /**
     * Test getFormatExtensionsAsLong() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsLong());
        System.out.println("Known extensions of this format AS Long === " + jMetaDataGeneral.getFormatExtensionsAsLong());
    }

    /**
     * Test getFormatExtensionsAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsLocalDateTime());
        System.out.println("Known extensions of this format AS LocalDateTime === " + jMetaDataGeneral.getFormatExtensionsAsLocalDateTime());
    }

    /**
     * Test getFormatExtensionsAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsLocalTime());
        System.out.println("Known extensions of this format AS LocalTime === " + jMetaDataGeneral.getFormatExtensionsAsLocalTime());
    }

    /**
     * Test getFormatExtensionsAsString() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsString() {
        assertEquals("divx", JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsString());
        System.out.println("Known extensions of this format AS String === " + jMetaDataGeneral.getFormatExtensionsAsString());
    }

    /**
     * Test getFormatExtensionsAsBoolean() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsBoolean());
        System.out.println("Known extensions of this format AS Boolean === " + jMetaDataGeneral.getFormatExtensionsAsBoolean());
    }

    /**
     * Test getFormatExtensionsAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsBigInteger());
        System.out.println("Known extensions of this format AS BigInteger === " + jMetaDataGeneral.getFormatExtensionsAsBigInteger());
    }

    /**
     * Test getFormatExtensionsAsURL() method.
     */
    @Test
    public void subTestGetFormatExtensionsAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatExtensionsAsURL());
        System.out.println("Known extensions of this format AS URL === " + jMetaDataGeneral.getFormatExtensionsAsURL());
    }

    /**
     * Test getProducerCopyrightAsInteger() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsInteger());
        System.out.println("The copyright information as per the productioncopyright holder. AS Integer === " + jMetaDataGeneral.getProducerCopyrightAsInteger());
    }

    /**
     * Test getProducerCopyrightAsLong() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsLong());
        System.out.println("The copyright information as per the productioncopyright holder. AS Long === " + jMetaDataGeneral.getProducerCopyrightAsLong());
    }

    /**
     * Test getProducerCopyrightAsLocalDateTime() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsLocalDateTime());
        System.out.println("The copyright information as per the productioncopyright holder. AS LocalDateTime === " + jMetaDataGeneral.getProducerCopyrightAsLocalDateTime());
    }

    /**
     * Test getProducerCopyrightAsLocalTime() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsLocalTime());
        System.out.println("The copyright information as per the productioncopyright holder. AS LocalTime === " + jMetaDataGeneral.getProducerCopyrightAsLocalTime());
    }

    /**
     * Test getProducerCopyrightAsString() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsString());
        System.out.println("The copyright information as per the productioncopyright holder. AS String === " + jMetaDataGeneral.getProducerCopyrightAsString());
    }

    /**
     * Test getProducerCopyrightAsBoolean() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsBoolean());
        System.out.println("The copyright information as per the productioncopyright holder. AS Boolean === " + jMetaDataGeneral.getProducerCopyrightAsBoolean());
    }

    /**
     * Test getProducerCopyrightAsBigInteger() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsBigInteger());
        System.out.println("The copyright information as per the productioncopyright holder. AS BigInteger === " + jMetaDataGeneral.getProducerCopyrightAsBigInteger());
    }

    /**
     * Test getProducerCopyrightAsURL() method.
     */
    @Test
    public void subTestGetProducerCopyrightAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getProducerCopyrightAsURL());
        System.out.println("The copyright information as per the productioncopyright holder. AS URL === " + jMetaDataGeneral.getProducerCopyrightAsURL());
    }

    /**
     * Test getBarCodeAsInteger() method.
     */
    @Test
    public void subTestGetBarCodeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsInteger());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS Integer === " + jMetaDataGeneral.getBarCodeAsInteger());
    }

    /**
     * Test getBarCodeAsLong() method.
     */
    @Test
    public void subTestGetBarCodeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsLong());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS Long === " + jMetaDataGeneral.getBarCodeAsLong());
    }

    /**
     * Test getBarCodeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetBarCodeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsLocalDateTime());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS LocalDateTime === " + jMetaDataGeneral.getBarCodeAsLocalDateTime());
    }

    /**
     * Test getBarCodeAsLocalTime() method.
     */
    @Test
    public void subTestGetBarCodeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsLocalTime());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS LocalTime === " + jMetaDataGeneral.getBarCodeAsLocalTime());
    }

    /**
     * Test getBarCodeAsString() method.
     */
    @Test
    public void subTestGetBarCodeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsString());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS String === " + jMetaDataGeneral.getBarCodeAsString());
    }

    /**
     * Test getBarCodeAsBoolean() method.
     */
    @Test
    public void subTestGetBarCodeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsBoolean());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS Boolean === " + jMetaDataGeneral.getBarCodeAsBoolean());
    }

    /**
     * Test getBarCodeAsBigInteger() method.
     */
    @Test
    public void subTestGetBarCodeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsBigInteger());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS BigInteger === " + jMetaDataGeneral.getBarCodeAsBigInteger());
    }

    /**
     * Test getBarCodeAsURL() method.
     */
    @Test
    public void subTestGetBarCodeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getBarCodeAsURL());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS URL === " + jMetaDataGeneral.getBarCodeAsURL());
    }

    /**
     * Test getOverallBitRateStringAsInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsInteger());
        System.out.println("Bit rate of all streams (with measure) AS Integer === " + jMetaDataGeneral.getOverallBitRateStringAsInteger());
    }

    /**
     * Test getOverallBitRateStringAsLong() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsLong());
        System.out.println("Bit rate of all streams (with measure) AS Long === " + jMetaDataGeneral.getOverallBitRateStringAsLong());
    }

    /**
     * Test getOverallBitRateStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsLocalDateTime());
        System.out.println("Bit rate of all streams (with measure) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateStringAsLocalDateTime());
    }

    /**
     * Test getOverallBitRateStringAsLocalTime() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsLocalTime());
        System.out.println("Bit rate of all streams (with measure) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateStringAsLocalTime());
    }

    /**
     * Test getOverallBitRateStringAsString() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsString());
        System.out.println("Bit rate of all streams (with measure) AS String === " + jMetaDataGeneral.getOverallBitRateStringAsString());
    }

    /**
     * Test getOverallBitRateStringAsBoolean() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsBoolean());
        System.out.println("Bit rate of all streams (with measure) AS Boolean === " + jMetaDataGeneral.getOverallBitRateStringAsBoolean());
    }

    /**
     * Test getOverallBitRateStringAsBigInteger() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsBigInteger());
        System.out.println("Bit rate of all streams (with measure) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateStringAsBigInteger());
    }

    /**
     * Test getOverallBitRateStringAsURL() method.
     */
    @Test
    public void subTestGetOverallBitRateStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOverallBitRateStringAsURL());
        System.out.println("Bit rate of all streams (with measure) AS URL === " + jMetaDataGeneral.getOverallBitRateStringAsURL());
    }

    /**
     * Test getTextCountAsInteger() method.
     */
    @Test
    public void subTestGetTextCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsInteger());
        System.out.println("Number of text streams AS Integer === " + jMetaDataGeneral.getTextCountAsInteger());
    }

    /**
     * Test getTextCountAsLong() method.
     */
    @Test
    public void subTestGetTextCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsLong());
        System.out.println("Number of text streams AS Long === " + jMetaDataGeneral.getTextCountAsLong());
    }

    /**
     * Test getTextCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTextCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsLocalDateTime());
        System.out.println("Number of text streams AS LocalDateTime === " + jMetaDataGeneral.getTextCountAsLocalDateTime());
    }

    /**
     * Test getTextCountAsLocalTime() method.
     */
    @Test
    public void subTestGetTextCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsLocalTime());
        System.out.println("Number of text streams AS LocalTime === " + jMetaDataGeneral.getTextCountAsLocalTime());
    }

    /**
     * Test getTextCountAsString() method.
     */
    @Test
    public void subTestGetTextCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsString());
        System.out.println("Number of text streams AS String === " + jMetaDataGeneral.getTextCountAsString());
    }

    /**
     * Test getTextCountAsBoolean() method.
     */
    @Test
    public void subTestGetTextCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsBoolean());
        System.out.println("Number of text streams AS Boolean === " + jMetaDataGeneral.getTextCountAsBoolean());
    }

    /**
     * Test getTextCountAsBigInteger() method.
     */
    @Test
    public void subTestGetTextCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsBigInteger());
        System.out.println("Number of text streams AS BigInteger === " + jMetaDataGeneral.getTextCountAsBigInteger());
    }

    /**
     * Test getTextCountAsURL() method.
     */
    @Test
    public void subTestGetTextCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTextCountAsURL());
        System.out.println("Number of text streams AS URL === " + jMetaDataGeneral.getTextCountAsURL());
    }

    /**
     * Test getSoundEngineerAsInteger() method.
     */
    @Test
    public void subTestGetSoundEngineerAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsInteger());
        System.out.println("The name of the sound engineer or sound recordist. AS Integer === " + jMetaDataGeneral.getSoundEngineerAsInteger());
    }

    /**
     * Test getSoundEngineerAsLong() method.
     */
    @Test
    public void subTestGetSoundEngineerAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsLong());
        System.out.println("The name of the sound engineer or sound recordist. AS Long === " + jMetaDataGeneral.getSoundEngineerAsLong());
    }

    /**
     * Test getSoundEngineerAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSoundEngineerAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsLocalDateTime());
        System.out.println("The name of the sound engineer or sound recordist. AS LocalDateTime === " + jMetaDataGeneral.getSoundEngineerAsLocalDateTime());
    }

    /**
     * Test getSoundEngineerAsLocalTime() method.
     */
    @Test
    public void subTestGetSoundEngineerAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsLocalTime());
        System.out.println("The name of the sound engineer or sound recordist. AS LocalTime === " + jMetaDataGeneral.getSoundEngineerAsLocalTime());
    }

    /**
     * Test getSoundEngineerAsString() method.
     */
    @Test
    public void subTestGetSoundEngineerAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsString());
        System.out.println("The name of the sound engineer or sound recordist. AS String === " + jMetaDataGeneral.getSoundEngineerAsString());
    }

    /**
     * Test getSoundEngineerAsBoolean() method.
     */
    @Test
    public void subTestGetSoundEngineerAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsBoolean());
        System.out.println("The name of the sound engineer or sound recordist. AS Boolean === " + jMetaDataGeneral.getSoundEngineerAsBoolean());
    }

    /**
     * Test getSoundEngineerAsBigInteger() method.
     */
    @Test
    public void subTestGetSoundEngineerAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsBigInteger());
        System.out.println("The name of the sound engineer or sound recordist. AS BigInteger === " + jMetaDataGeneral.getSoundEngineerAsBigInteger());
    }

    /**
     * Test getSoundEngineerAsURL() method.
     */
    @Test
    public void subTestGetSoundEngineerAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSoundEngineerAsURL());
        System.out.println("The name of the sound engineer or sound recordist. AS URL === " + jMetaDataGeneral.getSoundEngineerAsURL());
    }

    /**
     * Test getLabelCodeAsInteger() method.
     */
    @Test
    public void subTestGetLabelCodeAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsInteger());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS Integer === " + jMetaDataGeneral.getLabelCodeAsInteger());
    }

    /**
     * Test getLabelCodeAsLong() method.
     */
    @Test
    public void subTestGetLabelCodeAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsLong());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS Long === " + jMetaDataGeneral.getLabelCodeAsLong());
    }

    /**
     * Test getLabelCodeAsLocalDateTime() method.
     */
    @Test
    public void subTestGetLabelCodeAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsLocalDateTime());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS LocalDateTime === " + jMetaDataGeneral.getLabelCodeAsLocalDateTime());
    }

    /**
     * Test getLabelCodeAsLocalTime() method.
     */
    @Test
    public void subTestGetLabelCodeAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsLocalTime());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS LocalTime === " + jMetaDataGeneral.getLabelCodeAsLocalTime());
    }

    /**
     * Test getLabelCodeAsString() method.
     */
    @Test
    public void subTestGetLabelCodeAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsString());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS String === " + jMetaDataGeneral.getLabelCodeAsString());
    }

    /**
     * Test getLabelCodeAsBoolean() method.
     */
    @Test
    public void subTestGetLabelCodeAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsBoolean());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS Boolean === " + jMetaDataGeneral.getLabelCodeAsBoolean());
    }

    /**
     * Test getLabelCodeAsBigInteger() method.
     */
    @Test
    public void subTestGetLabelCodeAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsBigInteger());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS BigInteger === " + jMetaDataGeneral.getLabelCodeAsBigInteger());
    }

    /**
     * Test getLabelCodeAsURL() method.
     */
    @Test
    public void subTestGetLabelCodeAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getLabelCodeAsURL());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS URL === " + jMetaDataGeneral.getLabelCodeAsURL());
    }

    /**
     * Test getImageCountAsInteger() method.
     */
    @Test
    public void subTestGetImageCountAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsInteger());
        System.out.println("Number of image streams AS Integer === " + jMetaDataGeneral.getImageCountAsInteger());
    }

    /**
     * Test getImageCountAsLong() method.
     */
    @Test
    public void subTestGetImageCountAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsLong());
        System.out.println("Number of image streams AS Long === " + jMetaDataGeneral.getImageCountAsLong());
    }

    /**
     * Test getImageCountAsLocalDateTime() method.
     */
    @Test
    public void subTestGetImageCountAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsLocalDateTime());
        System.out.println("Number of image streams AS LocalDateTime === " + jMetaDataGeneral.getImageCountAsLocalDateTime());
    }

    /**
     * Test getImageCountAsLocalTime() method.
     */
    @Test
    public void subTestGetImageCountAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsLocalTime());
        System.out.println("Number of image streams AS LocalTime === " + jMetaDataGeneral.getImageCountAsLocalTime());
    }

    /**
     * Test getImageCountAsString() method.
     */
    @Test
    public void subTestGetImageCountAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsString());
        System.out.println("Number of image streams AS String === " + jMetaDataGeneral.getImageCountAsString());
    }

    /**
     * Test getImageCountAsBoolean() method.
     */
    @Test
    public void subTestGetImageCountAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsBoolean());
        System.out.println("Number of image streams AS Boolean === " + jMetaDataGeneral.getImageCountAsBoolean());
    }

    /**
     * Test getImageCountAsBigInteger() method.
     */
    @Test
    public void subTestGetImageCountAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsBigInteger());
        System.out.println("Number of image streams AS BigInteger === " + jMetaDataGeneral.getImageCountAsBigInteger());
    }

    /**
     * Test getImageCountAsURL() method.
     */
    @Test
    public void subTestGetImageCountAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getImageCountAsURL());
        System.out.println("Number of image streams AS URL === " + jMetaDataGeneral.getImageCountAsURL());
    }

    /**
     * Test getFormatAsInteger() method.
     */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsInteger());
        System.out.println("Format used AS Integer === " + jMetaDataGeneral.getFormatAsInteger());
    }

    /**
     * Test getFormatAsLong() method.
     */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsLong());
        System.out.println("Format used AS Long === " + jMetaDataGeneral.getFormatAsLong());
    }

    /**
     * Test getFormatAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsLocalDateTime());
        System.out.println("Format used AS LocalDateTime === " + jMetaDataGeneral.getFormatAsLocalDateTime());
    }

    /**
     * Test getFormatAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsLocalTime());
        System.out.println("Format used AS LocalTime === " + jMetaDataGeneral.getFormatAsLocalTime());
    }

    /**
     * Test getFormatAsString() method.
     */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsString());
        System.out.println("Format used AS String === " + jMetaDataGeneral.getFormatAsString());
    }

    /**
     * Test getFormatAsBoolean() method.
     */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsBoolean());
        System.out.println("Format used AS Boolean === " + jMetaDataGeneral.getFormatAsBoolean());
    }

    /**
     * Test getFormatAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsBigInteger());
        System.out.println("Format used AS BigInteger === " + jMetaDataGeneral.getFormatAsBigInteger());
    }

    /**
     * Test getFormatAsURL() method.
     */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatAsURL());
        System.out.println("Format used AS URL === " + jMetaDataGeneral.getFormatAsURL());
    }

    /**
     * Test getWrittenByAsInteger() method.
     */
    @Test
    public void subTestGetWrittenByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsInteger());
        System.out.println("The author of the story or script. AS Integer === " + jMetaDataGeneral.getWrittenByAsInteger());
    }

    /**
     * Test getWrittenByAsLong() method.
     */
    @Test
    public void subTestGetWrittenByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsLong());
        System.out.println("The author of the story or script. AS Long === " + jMetaDataGeneral.getWrittenByAsLong());
    }

    /**
     * Test getWrittenByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetWrittenByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsLocalDateTime());
        System.out.println("The author of the story or script. AS LocalDateTime === " + jMetaDataGeneral.getWrittenByAsLocalDateTime());
    }

    /**
     * Test getWrittenByAsLocalTime() method.
     */
    @Test
    public void subTestGetWrittenByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsLocalTime());
        System.out.println("The author of the story or script. AS LocalTime === " + jMetaDataGeneral.getWrittenByAsLocalTime());
    }

    /**
     * Test getWrittenByAsString() method.
     */
    @Test
    public void subTestGetWrittenByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsString());
        System.out.println("The author of the story or script. AS String === " + jMetaDataGeneral.getWrittenByAsString());
    }

    /**
     * Test getWrittenByAsBoolean() method.
     */
    @Test
    public void subTestGetWrittenByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsBoolean());
        System.out.println("The author of the story or script. AS Boolean === " + jMetaDataGeneral.getWrittenByAsBoolean());
    }

    /**
     * Test getWrittenByAsBigInteger() method.
     */
    @Test
    public void subTestGetWrittenByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsBigInteger());
        System.out.println("The author of the story or script. AS BigInteger === " + jMetaDataGeneral.getWrittenByAsBigInteger());
    }

    /**
     * Test getWrittenByAsURL() method.
     */
    @Test
    public void subTestGetWrittenByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getWrittenByAsURL());
        System.out.println("The author of the story or script. AS URL === " + jMetaDataGeneral.getWrittenByAsURL());
    }

    /**
     * Test getTrackPositionTotalAsInteger() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsInteger());
        System.out.println("Place of this track, e.g. 3 of 15 AS Integer === " + jMetaDataGeneral.getTrackPositionTotalAsInteger());
    }

    /**
     * Test getTrackPositionTotalAsLong() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsLong());
        System.out.println("Place of this track, e.g. 3 of 15 AS Long === " + jMetaDataGeneral.getTrackPositionTotalAsLong());
    }

    /**
     * Test getTrackPositionTotalAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsLocalDateTime());
        System.out.println("Place of this track, e.g. 3 of 15 AS LocalDateTime === " + jMetaDataGeneral.getTrackPositionTotalAsLocalDateTime());
    }

    /**
     * Test getTrackPositionTotalAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsLocalTime());
        System.out.println("Place of this track, e.g. 3 of 15 AS LocalTime === " + jMetaDataGeneral.getTrackPositionTotalAsLocalTime());
    }

    /**
     * Test getTrackPositionTotalAsString() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsString());
        System.out.println("Place of this track, e.g. 3 of 15 AS String === " + jMetaDataGeneral.getTrackPositionTotalAsString());
    }

    /**
     * Test getTrackPositionTotalAsBoolean() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsBoolean());
        System.out.println("Place of this track, e.g. 3 of 15 AS Boolean === " + jMetaDataGeneral.getTrackPositionTotalAsBoolean());
    }

    /**
     * Test getTrackPositionTotalAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsBigInteger());
        System.out.println("Place of this track, e.g. 3 of 15 AS BigInteger === " + jMetaDataGeneral.getTrackPositionTotalAsBigInteger());
    }

    /**
     * Test getTrackPositionTotalAsURL() method.
     */
    @Test
    public void subTestGetTrackPositionTotalAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackPositionTotalAsURL());
        System.out.println("Place of this track, e.g. 3 of 15 AS URL === " + jMetaDataGeneral.getTrackPositionTotalAsURL());
    }

    /**
     * Test getMovieCountryAsInteger() method.
     */
    @Test
    public void subTestGetMovieCountryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsInteger());
        System.out.println("Country, where the movie was procuced AS Integer === " + jMetaDataGeneral.getMovieCountryAsInteger());
    }

    /**
     * Test getMovieCountryAsLong() method.
     */
    @Test
    public void subTestGetMovieCountryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsLong());
        System.out.println("Country, where the movie was procuced AS Long === " + jMetaDataGeneral.getMovieCountryAsLong());
    }

    /**
     * Test getMovieCountryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieCountryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsLocalDateTime());
        System.out.println("Country, where the movie was procuced AS LocalDateTime === " + jMetaDataGeneral.getMovieCountryAsLocalDateTime());
    }

    /**
     * Test getMovieCountryAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieCountryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsLocalTime());
        System.out.println("Country, where the movie was procuced AS LocalTime === " + jMetaDataGeneral.getMovieCountryAsLocalTime());
    }

    /**
     * Test getMovieCountryAsString() method.
     */
    @Test
    public void subTestGetMovieCountryAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsString());
        System.out.println("Country, where the movie was procuced AS String === " + jMetaDataGeneral.getMovieCountryAsString());
    }

    /**
     * Test getMovieCountryAsBoolean() method.
     */
    @Test
    public void subTestGetMovieCountryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsBoolean());
        System.out.println("Country, where the movie was procuced AS Boolean === " + jMetaDataGeneral.getMovieCountryAsBoolean());
    }

    /**
     * Test getMovieCountryAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieCountryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsBigInteger());
        System.out.println("Country, where the movie was procuced AS BigInteger === " + jMetaDataGeneral.getMovieCountryAsBigInteger());
    }

    /**
     * Test getMovieCountryAsURL() method.
     */
    @Test
    public void subTestGetMovieCountryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieCountryAsURL());
        System.out.println("Country, where the movie was procuced AS URL === " + jMetaDataGeneral.getMovieCountryAsURL());
    }

    /**
     * Test getAlbumPerformerUrlAsInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsInteger());
        System.out.println("Homepage of the album performer/artist AS Integer === " + jMetaDataGeneral.getAlbumPerformerUrlAsInteger());
    }

    /**
     * Test getAlbumPerformerUrlAsLong() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsLong());
        System.out.println("Homepage of the album performer/artist AS Long === " + jMetaDataGeneral.getAlbumPerformerUrlAsLong());
    }

    /**
     * Test getAlbumPerformerUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsLocalDateTime());
        System.out.println("Homepage of the album performer/artist AS LocalDateTime === " + jMetaDataGeneral.getAlbumPerformerUrlAsLocalDateTime());
    }

    /**
     * Test getAlbumPerformerUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsLocalTime());
        System.out.println("Homepage of the album performer/artist AS LocalTime === " + jMetaDataGeneral.getAlbumPerformerUrlAsLocalTime());
    }

    /**
     * Test getAlbumPerformerUrlAsString() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsString());
        System.out.println("Homepage of the album performer/artist AS String === " + jMetaDataGeneral.getAlbumPerformerUrlAsString());
    }

    /**
     * Test getAlbumPerformerUrlAsBoolean() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsBoolean());
        System.out.println("Homepage of the album performer/artist AS Boolean === " + jMetaDataGeneral.getAlbumPerformerUrlAsBoolean());
    }

    /**
     * Test getAlbumPerformerUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsBigInteger());
        System.out.println("Homepage of the album performer/artist AS BigInteger === " + jMetaDataGeneral.getAlbumPerformerUrlAsBigInteger());
    }

    /**
     * Test getAlbumPerformerUrlAsURL() method.
     */
    @Test
    public void subTestGetAlbumPerformerUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAlbumPerformerUrlAsURL());
        System.out.println("Homepage of the album performer/artist AS URL === " + jMetaDataGeneral.getAlbumPerformerUrlAsURL());
    }

    /**
     * Test getCodecIDStringAsInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataGeneral.getCodecIDStringAsInteger());
    }

    /**
     * Test getCodecIDStringAsLong() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataGeneral.getCodecIDStringAsLong());
    }

    /**
     * Test getCodecIDStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataGeneral.getCodecIDStringAsLocalDateTime());
    }

    /**
     * Test getCodecIDStringAsLocalTime() method.
     */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataGeneral.getCodecIDStringAsLocalTime());
    }

    /**
     * Test getCodecIDStringAsString() method.
     */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataGeneral.getCodecIDStringAsString());
    }

    /**
     * Test getCodecIDStringAsBoolean() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataGeneral.getCodecIDStringAsBoolean());
    }

    /**
     * Test getCodecIDStringAsBigInteger() method.
     */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataGeneral.getCodecIDStringAsBigInteger());
    }

    /**
     * Test getCodecIDStringAsURL() method.
     */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCodecIDStringAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataGeneral.getCodecIDStringAsURL());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLong() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsLong());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalTime());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsString() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsString());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsBoolean());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsBigInteger());
    }

    /**
     * Test getEncodedLibraryCompanyNameAsURL() method.
     */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedLibraryCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsURL());
    }

    /**
     * Test getComicAsInteger() method.
     */
    @Test
    public void subTestGetComicAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsInteger());
        System.out.println("Name of the comic. AS Integer === " + jMetaDataGeneral.getComicAsInteger());
    }

    /**
     * Test getComicAsLong() method.
     */
    @Test
    public void subTestGetComicAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsLong());
        System.out.println("Name of the comic. AS Long === " + jMetaDataGeneral.getComicAsLong());
    }

    /**
     * Test getComicAsLocalDateTime() method.
     */
    @Test
    public void subTestGetComicAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsLocalDateTime());
        System.out.println("Name of the comic. AS LocalDateTime === " + jMetaDataGeneral.getComicAsLocalDateTime());
    }

    /**
     * Test getComicAsLocalTime() method.
     */
    @Test
    public void subTestGetComicAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsLocalTime());
        System.out.println("Name of the comic. AS LocalTime === " + jMetaDataGeneral.getComicAsLocalTime());
    }

    /**
     * Test getComicAsString() method.
     */
    @Test
    public void subTestGetComicAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsString());
        System.out.println("Name of the comic. AS String === " + jMetaDataGeneral.getComicAsString());
    }

    /**
     * Test getComicAsBoolean() method.
     */
    @Test
    public void subTestGetComicAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsBoolean());
        System.out.println("Name of the comic. AS Boolean === " + jMetaDataGeneral.getComicAsBoolean());
    }

    /**
     * Test getComicAsBigInteger() method.
     */
    @Test
    public void subTestGetComicAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsBigInteger());
        System.out.println("Name of the comic. AS BigInteger === " + jMetaDataGeneral.getComicAsBigInteger());
    }

    /**
     * Test getComicAsURL() method.
     */
    @Test
    public void subTestGetComicAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getComicAsURL());
        System.out.println("Name of the comic. AS URL === " + jMetaDataGeneral.getComicAsURL());
    }

    /**
     * Test getEditedByAsInteger() method.
     */
    @Test
    public void subTestGetEditedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsInteger());
        System.out.println("Editors name AS Integer === " + jMetaDataGeneral.getEditedByAsInteger());
    }

    /**
     * Test getEditedByAsLong() method.
     */
    @Test
    public void subTestGetEditedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsLong());
        System.out.println("Editors name AS Long === " + jMetaDataGeneral.getEditedByAsLong());
    }

    /**
     * Test getEditedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEditedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsLocalDateTime());
        System.out.println("Editors name AS LocalDateTime === " + jMetaDataGeneral.getEditedByAsLocalDateTime());
    }

    /**
     * Test getEditedByAsLocalTime() method.
     */
    @Test
    public void subTestGetEditedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsLocalTime());
        System.out.println("Editors name AS LocalTime === " + jMetaDataGeneral.getEditedByAsLocalTime());
    }

    /**
     * Test getEditedByAsString() method.
     */
    @Test
    public void subTestGetEditedByAsString() {
        assertEquals("", JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsString());
        System.out.println("Editors name AS String === " + jMetaDataGeneral.getEditedByAsString());
    }

    /**
     * Test getEditedByAsBoolean() method.
     */
    @Test
    public void subTestGetEditedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsBoolean());
        System.out.println("Editors name AS Boolean === " + jMetaDataGeneral.getEditedByAsBoolean());
    }

    /**
     * Test getEditedByAsBigInteger() method.
     */
    @Test
    public void subTestGetEditedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsBigInteger());
        System.out.println("Editors name AS BigInteger === " + jMetaDataGeneral.getEditedByAsBigInteger());
    }

    /**
     * Test getEditedByAsURL() method.
     */
    @Test
    public void subTestGetEditedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEditedByAsURL());
        System.out.println("Editors name AS URL === " + jMetaDataGeneral.getEditedByAsURL());
    }

    /**
     * Test getFormatCommercialAsInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Integer === " + jMetaDataGeneral.getFormatCommercialAsInteger());
    }

    /**
     * Test getFormatCommercialAsLong() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsLong());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Long === " + jMetaDataGeneral.getFormatCommercialAsLong());
    }

    /**
     * Test getFormatCommercialAsLocalDateTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalDateTime === " + jMetaDataGeneral.getFormatCommercialAsLocalDateTime());
    }

    /**
     * Test getFormatCommercialAsLocalTime() method.
     */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalTime === " + jMetaDataGeneral.getFormatCommercialAsLocalTime());
    }

    /**
     * Test getFormatCommercialAsString() method.
     */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsString());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS String === " + jMetaDataGeneral.getFormatCommercialAsString());
    }

    /**
     * Test getFormatCommercialAsBoolean() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Boolean === " + jMetaDataGeneral.getFormatCommercialAsBoolean());
    }

    /**
     * Test getFormatCommercialAsBigInteger() method.
     */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS BigInteger === " + jMetaDataGeneral.getFormatCommercialAsBigInteger());
    }

    /**
     * Test getFormatCommercialAsURL() method.
     */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getFormatCommercialAsURL());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS URL === " + jMetaDataGeneral.getFormatCommercialAsURL());
    }

    /**
     * Test getCommentAsInteger() method.
     */
    @Test
    public void subTestGetCommentAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsInteger());
        System.out.println("Any comment related to the content. AS Integer === " + jMetaDataGeneral.getCommentAsInteger());
    }

    /**
     * Test getCommentAsLong() method.
     */
    @Test
    public void subTestGetCommentAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsLong());
        System.out.println("Any comment related to the content. AS Long === " + jMetaDataGeneral.getCommentAsLong());
    }

    /**
     * Test getCommentAsLocalDateTime() method.
     */
    @Test
    public void subTestGetCommentAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsLocalDateTime());
        System.out.println("Any comment related to the content. AS LocalDateTime === " + jMetaDataGeneral.getCommentAsLocalDateTime());
    }

    /**
     * Test getCommentAsLocalTime() method.
     */
    @Test
    public void subTestGetCommentAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsLocalTime());
        System.out.println("Any comment related to the content. AS LocalTime === " + jMetaDataGeneral.getCommentAsLocalTime());
    }

    /**
     * Test getCommentAsString() method.
     */
    @Test
    public void subTestGetCommentAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsString());
        System.out.println("Any comment related to the content. AS String === " + jMetaDataGeneral.getCommentAsString());
    }

    /**
     * Test getCommentAsBoolean() method.
     */
    @Test
    public void subTestGetCommentAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsBoolean());
        System.out.println("Any comment related to the content. AS Boolean === " + jMetaDataGeneral.getCommentAsBoolean());
    }

    /**
     * Test getCommentAsBigInteger() method.
     */
    @Test
    public void subTestGetCommentAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsBigInteger());
        System.out.println("Any comment related to the content. AS BigInteger === " + jMetaDataGeneral.getCommentAsBigInteger());
    }

    /**
     * Test getCommentAsURL() method.
     */
    @Test
    public void subTestGetCommentAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getCommentAsURL());
        System.out.println("Any comment related to the content. AS URL === " + jMetaDataGeneral.getCommentAsURL());
    }

    /**
     * Test getAudioFormatWithHintListAsInteger() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsInteger());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getAudioFormatWithHintListAsInteger());
    }

    /**
     * Test getAudioFormatWithHintListAsLong() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsLong());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getAudioFormatWithHintListAsLong());
    }

    /**
     * Test getAudioFormatWithHintListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsLocalDateTime());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getAudioFormatWithHintListAsLocalDateTime());
    }

    /**
     * Test getAudioFormatWithHintListAsLocalTime() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsLocalTime());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getAudioFormatWithHintListAsLocalTime());
    }

    /**
     * Test getAudioFormatWithHintListAsString() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsString());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getAudioFormatWithHintListAsString());
    }

    /**
     * Test getAudioFormatWithHintListAsBoolean() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsBoolean());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getAudioFormatWithHintListAsBoolean());
    }

    /**
     * Test getAudioFormatWithHintListAsBigInteger() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsBigInteger());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getAudioFormatWithHintListAsBigInteger());
    }

    /**
     * Test getAudioFormatWithHintListAsURL() method.
     */
    @Test
    public void subTestGetAudioFormatWithHintListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAudioFormatWithHintListAsURL());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getAudioFormatWithHintListAsURL());
    }

    /**
     * Test getDelaySourceStringAsInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataGeneral.getDelaySourceStringAsInteger());
    }

    /**
     * Test getDelaySourceStringAsLong() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataGeneral.getDelaySourceStringAsLong());
    }

    /**
     * Test getDelaySourceStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataGeneral.getDelaySourceStringAsLocalDateTime());
    }

    /**
     * Test getDelaySourceStringAsLocalTime() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataGeneral.getDelaySourceStringAsLocalTime());
    }

    /**
     * Test getDelaySourceStringAsString() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataGeneral.getDelaySourceStringAsString());
    }

    /**
     * Test getDelaySourceStringAsBoolean() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataGeneral.getDelaySourceStringAsBoolean());
    }

    /**
     * Test getDelaySourceStringAsBigInteger() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataGeneral.getDelaySourceStringAsBigInteger());
    }

    /**
     * Test getDelaySourceStringAsURL() method.
     */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getDelaySourceStringAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataGeneral.getDelaySourceStringAsURL());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsInteger());
        System.out.println("Name of the person or organization who supplied the original subject AS Integer === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsInteger());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsLong() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLong());
        System.out.println("Name of the person or organization who supplied the original subject AS Long === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsLong());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsLocalDateTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalDateTime());
        System.out.println("Name of the person or organization who supplied the original subject AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalDateTime());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsLocalTime() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalTime());
        System.out.println("Name of the person or organization who supplied the original subject AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalTime());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsString() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsString());
        System.out.println("Name of the person or organization who supplied the original subject AS String === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsString());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsBoolean() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsBoolean());
        System.out.println("Name of the person or organization who supplied the original subject AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsBoolean());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsBigInteger() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsBigInteger());
        System.out.println("Name of the person or organization who supplied the original subject AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsBigInteger());
    }

    /**
     * Test getOriginalSourceFormDistributedByAsURL() method.
     */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getOriginalSourceFormDistributedByAsURL());
        System.out.println("Name of the person or organization who supplied the original subject AS URL === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsURL());
    }

    /**
     * Test getAddedDateAsInteger() method.
     */
    @Test
    public void subTestGetAddedDateAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsInteger());
        System.out.println("Date/year the item was added to the owners collection AS Integer === " + jMetaDataGeneral.getAddedDateAsInteger());
    }

    /**
     * Test getAddedDateAsLong() method.
     */
    @Test
    public void subTestGetAddedDateAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsLong());
        System.out.println("Date/year the item was added to the owners collection AS Long === " + jMetaDataGeneral.getAddedDateAsLong());
    }

    /**
     * Test getAddedDateAsLocalDateTime() method.
     */
    @Test
    public void subTestGetAddedDateAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsLocalDateTime());
        System.out.println("Date/year the item was added to the owners collection AS LocalDateTime === " + jMetaDataGeneral.getAddedDateAsLocalDateTime());
    }

    /**
     * Test getAddedDateAsLocalTime() method.
     */
    @Test
    public void subTestGetAddedDateAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsLocalTime());
        System.out.println("Date/year the item was added to the owners collection AS LocalTime === " + jMetaDataGeneral.getAddedDateAsLocalTime());
    }

    /**
     * Test getAddedDateAsString() method.
     */
    @Test
    public void subTestGetAddedDateAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsString());
        System.out.println("Date/year the item was added to the owners collection AS String === " + jMetaDataGeneral.getAddedDateAsString());
    }

    /**
     * Test getAddedDateAsBoolean() method.
     */
    @Test
    public void subTestGetAddedDateAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsBoolean());
        System.out.println("Date/year the item was added to the owners collection AS Boolean === " + jMetaDataGeneral.getAddedDateAsBoolean());
    }

    /**
     * Test getAddedDateAsBigInteger() method.
     */
    @Test
    public void subTestGetAddedDateAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsBigInteger());
        System.out.println("Date/year the item was added to the owners collection AS BigInteger === " + jMetaDataGeneral.getAddedDateAsBigInteger());
    }

    /**
     * Test getAddedDateAsURL() method.
     */
    @Test
    public void subTestGetAddedDateAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getAddedDateAsURL());
        System.out.println("Date/year the item was added to the owners collection AS URL === " + jMetaDataGeneral.getAddedDateAsURL());
    }

    /**
     * Test getStreamKindStringAsInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataGeneral.getStreamKindStringAsInteger());
    }

    /**
     * Test getStreamKindStringAsLong() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataGeneral.getStreamKindStringAsLong());
    }

    /**
     * Test getStreamKindStringAsLocalDateTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataGeneral.getStreamKindStringAsLocalDateTime());
    }

    /**
     * Test getStreamKindStringAsLocalTime() method.
     */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataGeneral.getStreamKindStringAsLocalTime());
    }

    /**
     * Test getStreamKindStringAsString() method.
     */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsString());
        System.out.println("Stream type name AS String === " + jMetaDataGeneral.getStreamKindStringAsString());
    }

    /**
     * Test getStreamKindStringAsBoolean() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataGeneral.getStreamKindStringAsBoolean());
    }

    /**
     * Test getStreamKindStringAsBigInteger() method.
     */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataGeneral.getStreamKindStringAsBigInteger());
    }

    /**
     * Test getStreamKindStringAsURL() method.
     */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getStreamKindStringAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataGeneral.getStreamKindStringAsURL());
    }

    /**
     * Test getTrackMoreAsInteger() method.
     */
    @Test
    public void subTestGetTrackMoreAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsInteger());
        System.out.println("More infos about the track AS Integer === " + jMetaDataGeneral.getTrackMoreAsInteger());
    }

    /**
     * Test getTrackMoreAsLong() method.
     */
    @Test
    public void subTestGetTrackMoreAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsLong());
        System.out.println("More infos about the track AS Long === " + jMetaDataGeneral.getTrackMoreAsLong());
    }

    /**
     * Test getTrackMoreAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackMoreAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsLocalDateTime());
        System.out.println("More infos about the track AS LocalDateTime === " + jMetaDataGeneral.getTrackMoreAsLocalDateTime());
    }

    /**
     * Test getTrackMoreAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackMoreAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsLocalTime());
        System.out.println("More infos about the track AS LocalTime === " + jMetaDataGeneral.getTrackMoreAsLocalTime());
    }

    /**
     * Test getTrackMoreAsString() method.
     */
    @Test
    public void subTestGetTrackMoreAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsString());
        System.out.println("More infos about the track AS String === " + jMetaDataGeneral.getTrackMoreAsString());
    }

    /**
     * Test getTrackMoreAsBoolean() method.
     */
    @Test
    public void subTestGetTrackMoreAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsBoolean());
        System.out.println("More infos about the track AS Boolean === " + jMetaDataGeneral.getTrackMoreAsBoolean());
    }

    /**
     * Test getTrackMoreAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackMoreAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsBigInteger());
        System.out.println("More infos about the track AS BigInteger === " + jMetaDataGeneral.getTrackMoreAsBigInteger());
    }

    /**
     * Test getTrackMoreAsURL() method.
     */
    @Test
    public void subTestGetTrackMoreAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackMoreAsURL());
        System.out.println("More infos about the track AS URL === " + jMetaDataGeneral.getTrackMoreAsURL());
    }

    /**
     * Test getEncodedApplicationVersionAsInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsInteger());
        System.out.println("Version of the product AS Integer === " + jMetaDataGeneral.getEncodedApplicationVersionAsInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsLong() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsLong());
        System.out.println("Version of the product AS Long === " + jMetaDataGeneral.getEncodedApplicationVersionAsLong());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalDateTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsLocalDateTime());
        System.out.println("Version of the product AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationVersionAsLocalDateTime());
    }

    /**
     * Test getEncodedApplicationVersionAsLocalTime() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsLocalTime());
        System.out.println("Version of the product AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationVersionAsLocalTime());
    }

    /**
     * Test getEncodedApplicationVersionAsString() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsString());
        System.out.println("Version of the product AS String === " + jMetaDataGeneral.getEncodedApplicationVersionAsString());
    }

    /**
     * Test getEncodedApplicationVersionAsBoolean() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsBoolean());
        System.out.println("Version of the product AS Boolean === " + jMetaDataGeneral.getEncodedApplicationVersionAsBoolean());
    }

    /**
     * Test getEncodedApplicationVersionAsBigInteger() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsBigInteger());
        System.out.println("Version of the product AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationVersionAsBigInteger());
    }

    /**
     * Test getEncodedApplicationVersionAsURL() method.
     */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getEncodedApplicationVersionAsURL());
        System.out.println("Version of the product AS URL === " + jMetaDataGeneral.getEncodedApplicationVersionAsURL());
    }

    /**
     * Test getMenuIDAsInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataGeneral.getMenuIDAsInteger());
    }

    /**
     * Test getMenuIDAsLong() method.
     */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataGeneral.getMenuIDAsLong());
    }

    /**
     * Test getMenuIDAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getMenuIDAsLocalDateTime());
    }

    /**
     * Test getMenuIDAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getMenuIDAsLocalTime());
    }

    /**
     * Test getMenuIDAsString() method.
     */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataGeneral.getMenuIDAsString());
    }

    /**
     * Test getMenuIDAsBoolean() method.
     */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getMenuIDAsBoolean());
    }

    /**
     * Test getMenuIDAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getMenuIDAsBigInteger());
    }

    /**
     * Test getMenuIDAsURL() method.
     */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuIDAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataGeneral.getMenuIDAsURL());
    }

    /**
     * Test getMenuFormatListAsInteger() method.
     */
    @Test
    public void subTestGetMenuFormatListAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsInteger());
        System.out.println("Menu Codecsin this file, separated by / AS Integer === " + jMetaDataGeneral.getMenuFormatListAsInteger());
    }

    /**
     * Test getMenuFormatListAsLong() method.
     */
    @Test
    public void subTestGetMenuFormatListAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsLong());
        System.out.println("Menu Codecsin this file, separated by / AS Long === " + jMetaDataGeneral.getMenuFormatListAsLong());
    }

    /**
     * Test getMenuFormatListAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMenuFormatListAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsLocalDateTime());
        System.out.println("Menu Codecsin this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getMenuFormatListAsLocalDateTime());
    }

    /**
     * Test getMenuFormatListAsLocalTime() method.
     */
    @Test
    public void subTestGetMenuFormatListAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsLocalTime());
        System.out.println("Menu Codecsin this file, separated by / AS LocalTime === " + jMetaDataGeneral.getMenuFormatListAsLocalTime());
    }

    /**
     * Test getMenuFormatListAsString() method.
     */
    @Test
    public void subTestGetMenuFormatListAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsString());
        System.out.println("Menu Codecsin this file, separated by / AS String === " + jMetaDataGeneral.getMenuFormatListAsString());
    }

    /**
     * Test getMenuFormatListAsBoolean() method.
     */
    @Test
    public void subTestGetMenuFormatListAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsBoolean());
        System.out.println("Menu Codecsin this file, separated by / AS Boolean === " + jMetaDataGeneral.getMenuFormatListAsBoolean());
    }

    /**
     * Test getMenuFormatListAsBigInteger() method.
     */
    @Test
    public void subTestGetMenuFormatListAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsBigInteger());
        System.out.println("Menu Codecsin this file, separated by / AS BigInteger === " + jMetaDataGeneral.getMenuFormatListAsBigInteger());
    }

    /**
     * Test getMenuFormatListAsURL() method.
     */
    @Test
    public void subTestGetMenuFormatListAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMenuFormatListAsURL());
        System.out.println("Menu Codecsin this file, separated by / AS URL === " + jMetaDataGeneral.getMenuFormatListAsURL());
    }

    /**
     * Test getPerformerSortAsInteger() method.
     */
    @Test
    public void subTestGetPerformerSortAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsInteger());
        System.out.println("Performer/Sort AS Integer === " + jMetaDataGeneral.getPerformerSortAsInteger());
    }

    /**
     * Test getPerformerSortAsLong() method.
     */
    @Test
    public void subTestGetPerformerSortAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsLong());
        System.out.println("Performer/Sort AS Long === " + jMetaDataGeneral.getPerformerSortAsLong());
    }

    /**
     * Test getPerformerSortAsLocalDateTime() method.
     */
    @Test
    public void subTestGetPerformerSortAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsLocalDateTime());
        System.out.println("Performer/Sort AS LocalDateTime === " + jMetaDataGeneral.getPerformerSortAsLocalDateTime());
    }

    /**
     * Test getPerformerSortAsLocalTime() method.
     */
    @Test
    public void subTestGetPerformerSortAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsLocalTime());
        System.out.println("Performer/Sort AS LocalTime === " + jMetaDataGeneral.getPerformerSortAsLocalTime());
    }

    /**
     * Test getPerformerSortAsString() method.
     */
    @Test
    public void subTestGetPerformerSortAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsString());
        System.out.println("Performer/Sort AS String === " + jMetaDataGeneral.getPerformerSortAsString());
    }

    /**
     * Test getPerformerSortAsBoolean() method.
     */
    @Test
    public void subTestGetPerformerSortAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsBoolean());
        System.out.println("Performer/Sort AS Boolean === " + jMetaDataGeneral.getPerformerSortAsBoolean());
    }

    /**
     * Test getPerformerSortAsBigInteger() method.
     */
    @Test
    public void subTestGetPerformerSortAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsBigInteger());
        System.out.println("Performer/Sort AS BigInteger === " + jMetaDataGeneral.getPerformerSortAsBigInteger());
    }

    /**
     * Test getPerformerSortAsURL() method.
     */
    @Test
    public void subTestGetPerformerSortAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getPerformerSortAsURL());
        System.out.println("Performer/Sort AS URL === " + jMetaDataGeneral.getPerformerSortAsURL());
    }

    /**
     * Test getMovieUrlAsInteger() method.
     */
    @Test
    public void subTestGetMovieUrlAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsInteger());
        System.out.println("Homepage for the movie AS Integer === " + jMetaDataGeneral.getMovieUrlAsInteger());
    }

    /**
     * Test getMovieUrlAsLong() method.
     */
    @Test
    public void subTestGetMovieUrlAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsLong());
        System.out.println("Homepage for the movie AS Long === " + jMetaDataGeneral.getMovieUrlAsLong());
    }

    /**
     * Test getMovieUrlAsLocalDateTime() method.
     */
    @Test
    public void subTestGetMovieUrlAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsLocalDateTime());
        System.out.println("Homepage for the movie AS LocalDateTime === " + jMetaDataGeneral.getMovieUrlAsLocalDateTime());
    }

    /**
     * Test getMovieUrlAsLocalTime() method.
     */
    @Test
    public void subTestGetMovieUrlAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsLocalTime());
        System.out.println("Homepage for the movie AS LocalTime === " + jMetaDataGeneral.getMovieUrlAsLocalTime());
    }

    /**
     * Test getMovieUrlAsString() method.
     */
    @Test
    public void subTestGetMovieUrlAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsString());
        System.out.println("Homepage for the movie AS String === " + jMetaDataGeneral.getMovieUrlAsString());
    }

    /**
     * Test getMovieUrlAsBoolean() method.
     */
    @Test
    public void subTestGetMovieUrlAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsBoolean());
        System.out.println("Homepage for the movie AS Boolean === " + jMetaDataGeneral.getMovieUrlAsBoolean());
    }

    /**
     * Test getMovieUrlAsBigInteger() method.
     */
    @Test
    public void subTestGetMovieUrlAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsBigInteger());
        System.out.println("Homepage for the movie AS BigInteger === " + jMetaDataGeneral.getMovieUrlAsBigInteger());
    }

    /**
     * Test getMovieUrlAsURL() method.
     */
    @Test
    public void subTestGetMovieUrlAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getMovieUrlAsURL());
        System.out.println("Homepage for the movie AS URL === " + jMetaDataGeneral.getMovieUrlAsURL());
    }

    /**
     * Test getSummaryAsInteger() method.
     */
    @Test
    public void subTestGetSummaryAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsInteger());
        System.out.println("A plot outline or a summary of the story. AS Integer === " + jMetaDataGeneral.getSummaryAsInteger());
    }

    /**
     * Test getSummaryAsLong() method.
     */
    @Test
    public void subTestGetSummaryAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsLong());
        System.out.println("A plot outline or a summary of the story. AS Long === " + jMetaDataGeneral.getSummaryAsLong());
    }

    /**
     * Test getSummaryAsLocalDateTime() method.
     */
    @Test
    public void subTestGetSummaryAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsLocalDateTime());
        System.out.println("A plot outline or a summary of the story. AS LocalDateTime === " + jMetaDataGeneral.getSummaryAsLocalDateTime());
    }

    /**
     * Test getSummaryAsLocalTime() method.
     */
    @Test
    public void subTestGetSummaryAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsLocalTime());
        System.out.println("A plot outline or a summary of the story. AS LocalTime === " + jMetaDataGeneral.getSummaryAsLocalTime());
    }

    /**
     * Test getSummaryAsString() method.
     */
    @Test
    public void subTestGetSummaryAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsString());
        System.out.println("A plot outline or a summary of the story. AS String === " + jMetaDataGeneral.getSummaryAsString());
    }

    /**
     * Test getSummaryAsBoolean() method.
     */
    @Test
    public void subTestGetSummaryAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsBoolean());
        System.out.println("A plot outline or a summary of the story. AS Boolean === " + jMetaDataGeneral.getSummaryAsBoolean());
    }

    /**
     * Test getSummaryAsBigInteger() method.
     */
    @Test
    public void subTestGetSummaryAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsBigInteger());
        System.out.println("A plot outline or a summary of the story. AS BigInteger === " + jMetaDataGeneral.getSummaryAsBigInteger());
    }

    /**
     * Test getSummaryAsURL() method.
     */
    @Test
    public void subTestGetSummaryAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getSummaryAsURL());
        System.out.println("A plot outline or a summary of the story. AS URL === " + jMetaDataGeneral.getSummaryAsURL());
    }

    /**
     * Test getTrackAsInteger() method.
     */
    @Test
    public void subTestGetTrackAsInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsInteger());
        System.out.println("Name of the track. e.g. track1, track 2 AS Integer === " + jMetaDataGeneral.getTrackAsInteger());
    }

    /**
     * Test getTrackAsLong() method.
     */
    @Test
    public void subTestGetTrackAsLong() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsLong());
        System.out.println("Name of the track. e.g. track1, track 2 AS Long === " + jMetaDataGeneral.getTrackAsLong());
    }

    /**
     * Test getTrackAsLocalDateTime() method.
     */
    @Test
    public void subTestGetTrackAsLocalDateTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsLocalDateTime());
        System.out.println("Name of the track. e.g. track1, track 2 AS LocalDateTime === " + jMetaDataGeneral.getTrackAsLocalDateTime());
    }

    /**
     * Test getTrackAsLocalTime() method.
     */
    @Test
    public void subTestGetTrackAsLocalTime() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsLocalTime());
        System.out.println("Name of the track. e.g. track1, track 2 AS LocalTime === " + jMetaDataGeneral.getTrackAsLocalTime());
    }

    /**
     * Test getTrackAsString() method.
     */
    @Test
    public void subTestGetTrackAsString() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsString());
        System.out.println("Name of the track. e.g. track1, track 2 AS String === " + jMetaDataGeneral.getTrackAsString());
    }

    /**
     * Test getTrackAsBoolean() method.
     */
    @Test
    public void subTestGetTrackAsBoolean() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsBoolean());
        System.out.println("Name of the track. e.g. track1, track 2 AS Boolean === " + jMetaDataGeneral.getTrackAsBoolean());
    }

    /**
     * Test getTrackAsBigInteger() method.
     */
    @Test
    public void subTestGetTrackAsBigInteger() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsBigInteger());
        System.out.println("Name of the track. e.g. track1, track 2 AS BigInteger === " + jMetaDataGeneral.getTrackAsBigInteger());
    }

    /**
     * Test getTrackAsURL() method.
     */
    @Test
    public void subTestGetTrackAsURL() {
        assertEquals(null, JMetaDataGeneral_Test.jMetaDataGeneral.getTrackAsURL());
        System.out.println("Name of the track. e.g. track1, track 2 AS URL === " + jMetaDataGeneral.getTrackAsURL());
    }

}
