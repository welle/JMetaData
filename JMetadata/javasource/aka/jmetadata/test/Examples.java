package aka.jmetadata.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.JMetadata;
import aka.jmetadata.main.JMetadataAudio;
import aka.jmetadata.main.JMetadataGeneral;
import aka.jmetadata.main.JMetadataSubtitle;
import aka.jmetadata.main.JMetadataVideo;
import aka.jmetadata.main.exception.LibNotfoundException;
import aka.jmetadata.main.mediainfo.MediaInfo;

public class Examples {

    private static final Logger LOGGER;
    static {
        LOGGER = Logger.getLogger(MediaInfo.class.getPackage().getName());
    }

    /**
     * Main.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        testWithInternalDLL();
//        testWithExternalDLL();
    }

    private static void testWithInternalDLL() {
        try {
            // use internal dll
            final JMetadata jMetadata = new JMetadata();

            final File directory = new File("./Test/videos/");
//            final File directory = new File("g:/");
            final File[] children = getFiles(directory);
            if (children == null) {
                System.err.println("[test] testWithInternalDLL - no movie found in " + directory.getAbsolutePath());
            } else {
                for (final File file : children) {
                    System.err.println("[test] testWithInternalDLL - " + file.getAbsolutePath());
                    if (jMetadata.open(file)) {
                        printJMetadata(jMetadata);
                    }
                }
            }
            jMetadata.close();
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        } catch (final LibNotfoundException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    private static void testWithExternalDLL() {
        // use external dll
        final JMetadata jMetadata = new JMetadata("./lib/");
        final File directory = new File("./Test/videos/");
        final File[] children = getFiles(directory);
        if (children == null) {
            System.err.println("[test] testWithExternalDLL - no movie found in " + directory.getAbsolutePath());
        } else {
            for (final File file : children) {
                System.err.println("[test] testWithExternalDLL - " + file.getAbsolutePath());
                if (jMetadata.open(file)) {
                    printJMetadata(jMetadata);
                }
            }
        }
        try {
            jMetadata.close();
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    private static void printJMetadata(@Nonnull final JMetadata jMetadata) {
        printJMetaDataInfos(jMetadata.getGeneral());
        final List<JMetadataVideo> videoStreamList = jMetadata.getVideoStreams();
        System.err.println("VIDEOS");
        System.err.println("--------------------");
        for (final JMetadataVideo jMetadataVideo : videoStreamList) {
            assert jMetadataVideo != null;
            printJMetadataVideos(jMetadataVideo);
        }
        System.err.println("_________________________________________________________________________________________");

        System.err.println("AUDIOS");
        System.err.println("--------------------");
        final List<JMetadataAudio> audioStreamList = jMetadata.getAudioStreams();
        for (final JMetadataAudio jMetadataVideo : audioStreamList) {
            System.err.println("AUDIO - Codec: " + jMetadataVideo.getCodecID() + " Codec Hint: " + jMetadataVideo.getCodecIDHint() + " Sampling rate: " + jMetadataVideo.getSamplingRate() + " Format: " + jMetadataVideo.getFormat() + " Format Info: " + jMetadataVideo.getFormatInfo() + " Format Profile: " + jMetadataVideo.getFormatProfile() + " Language: " + jMetadataVideo.getLanguage() + " Bit Rate: " + jMetadataVideo.getBitRate() + " Duration " + jMetadataVideo.getDuration() + " Channels: "
                    + jMetadataVideo.getChannels() + " DEFAULT: " + jMetadataVideo.isDefault() + " forced: " + jMetadataVideo.isForced());
        }
        System.err.println("_________________________________________________________________________________________");

        System.err.println("SUBTITLES");
        System.err.println("--------------------");
        final List<JMetadataSubtitle> textStreamList = jMetadata.getSubtitleStreams();
        for (final JMetadataSubtitle jMetadataVideo : textStreamList) {
            System.err.println("SUBTITLE - Codec: " + jMetadataVideo.getCodecID() + " Codec Hint: " + jMetadataVideo.getCodecID() + " Format: " + jMetadataVideo.getFormat() + " CODEC Info: " + jMetadataVideo.getCodecIDInfo() + " Language: " + jMetadataVideo.getLanguage() + " DEFAULT: " + jMetadataVideo.isDefault() + " forced: " + jMetadataVideo.isForced());
        }
        System.err.println("_________________________________________________________________________________________");
    }

    private static void printJMetadataVideos(@Nonnull final JMetadataVideo jMetadataVideo) {
        System.err.println("VIDEO - Codec: " + jMetadataVideo.getCodecID() + " Aspect Ratio: " + jMetadataVideo.getDisplayAspectRatio() + " Format: " + jMetadataVideo.getFormat() + " Format Info: " + jMetadataVideo.getFormatInfo() + " Format Profile: " + jMetadataVideo.getFormatProfile() + " Language: " + jMetadataVideo.getLanguage() + " Bit Rate: " + jMetadataVideo.getBitRate() + " Duration " + jMetadataVideo.getDuration() + " Frame Rate: " + jMetadataVideo.getFrameRate() + " Width: "
                + jMetadataVideo.getWidth() + " Height: " + jMetadataVideo.getHeight());
    }

    private static void printJMetaDataInfos(@Nonnull final JMetadataGeneral jMetadataGeneral) {
        System.err.println("GENERAL");
        System.err.println("--------------------");
        System.err.println(" # Video = " + jMetadataGeneral.getNumVideoStreams());
        System.err.println(" # Audio = " + jMetadataGeneral.getNumAudioStreams());
        System.err.println(" # Subtitle = " + jMetadataGeneral.getNumSubtitleStreams());
        System.err.println(" Duration = " + jMetadataGeneral.getDuration());
        System.err.println(" Format = " + jMetadataGeneral.getFormat());
        System.err.println(" Format Version = " + jMetadataGeneral.getFormatVersion());
        System.err.println(" File Size = " + jMetadataGeneral.getFileSize());
        System.err.println(" OverallBitRate = " + jMetadataGeneral.getOverallBitRate());
        System.err.println(" StreamCount = " + jMetadataGeneral.getStreamCount());
        System.err.println(" StreamKind = " + jMetadataGeneral.getStreamKind());
        System.err.println(" StreamKindString = " + jMetadataGeneral.getStreamKindString());
        System.err.println(" StreamKindID = " + jMetadataGeneral.getStreamKindID());
        System.err.println(" StreamKindPos = " + jMetadataGeneral.getStreamKindPosition());
        System.err.println(" StreamKindOrder = " + jMetadataGeneral.getStreamKindOrder());
        System.err.println(" ID = " + jMetadataGeneral.getID());
        System.err.println(" ID String = " + jMetadataGeneral.getIDString());
        System.err.println(" Unique ID = " + jMetadataGeneral.getUniqueID());
        System.err.println(" Unique ID String = " + jMetadataGeneral.getUniqueIDString());
        System.err.println(" Menu ID  = " + jMetadataGeneral.getMenuID());
        System.err.println(" Menu ID String = " + jMetadataGeneral.getMenuIDString());
        System.err.println(" General count = " + jMetadataGeneral.getGeneralCount());
        System.err.println(" Video count = " + jMetadataGeneral.getVideoCount());
        System.err.println(" Audio count = " + jMetadataGeneral.getAudioCount());
        System.err.println(" Text count = " + jMetadataGeneral.getTextCount());
        System.err.println(" Chapters count = " + jMetadataGeneral.getChaptersCount());
        System.err.println(" Image count = " + jMetadataGeneral.getImageCount());
        System.err.println(" Menu count = " + jMetadataGeneral.getMenuCount());
        System.err.println(" Video format list = ");
        final List<String> videoFormatList = jMetadataGeneral.getVideoFormatList();
        for (final String item : videoFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Video format with hint list = ");
        final List<String> videoFormatWithHintList = jMetadataGeneral.getVideoFormatWithHintList();
        for (final String item : videoFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Video language list = ");
        final List<String> videoLanguageList = jMetadataGeneral.getVideoLanguageList();
        for (final String item : videoLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Audio format list = ");
        final List<String> audioFormatList = jMetadataGeneral.getAudioFormatList();
        for (final String item : audioFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Audio format with hint list = ");
        final List<String> audioFormatWithHintList = jMetadataGeneral.getAudioFormatWithHintList();
        for (final String item : audioFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Audio language list = ");
        final List<String> audioLanguageList = jMetadataGeneral.getAudioLanguageList();
        for (final String item : audioLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Text format list = ");
        final List<String> textFormatList = jMetadataGeneral.getTextFormatList();
        for (final String item : textFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Text format with hint list = ");
        final List<String> textFormatWithHintList = jMetadataGeneral.getTextFormatWithHintList();
        for (final String item : textFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Text language list = ");
        final List<String> textLanguageList = jMetadataGeneral.getTextLanguageList();
        for (final String item : textLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Chapters format list = ");
        final List<String> chaptersFormatList = jMetadataGeneral.getChaptersFormatList();
        for (final String item : chaptersFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Chapters format with hint list = ");
        final List<String> chaptersFormatWithHintList = jMetadataGeneral.getChaptersFormatWithHintList();
        for (final String item : chaptersFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Chapters language list = ");
        final List<String> chaptersLanguageList = jMetadataGeneral.getChaptersLanguageList();
        for (final String item : chaptersLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Image format list = ");
        final List<String> imageFormatList = jMetadataGeneral.getImageFormatList();
        for (final String item : imageFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Image format with hint list = ");
        final List<String> imageFormatWithHintList = jMetadataGeneral.getImageFormatWithHintList();
        for (final String item : imageFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Image language list = ");
        final List<String> imageLanguageList = jMetadataGeneral.getImageLanguageList();
        for (final String item : imageLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Menu format list = ");
        final List<String> menuFormatList = jMetadataGeneral.getMenuFormatList();
        for (final String item : menuFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Menu format with hint list = ");
        final List<String> menuFormatWithHintList = jMetadataGeneral.getMenuFormatWithHintList();
        for (final String item : menuFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Menu language list = ");
        final List<String> menuLanguageList = jMetadataGeneral.getMenuLanguageList();
        for (final String item : menuLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Complete Name = " + jMetadataGeneral.getCompleteName());
        System.err.println(" Folder Name = " + jMetadataGeneral.getFolderName());
        System.err.println(" File Name = " + jMetadataGeneral.getFileName());
        System.err.println(" File Extension = " + jMetadataGeneral.getFileExtension());
        System.err.println(" Format info = " + jMetadataGeneral.getFormatInfo());
        try {
            System.err.println(" Format URL = " + jMetadataGeneral.getFormatURL());
        } catch (final MalformedURLException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        System.err.println(" Format extensions = ");
        final List<String> formatExtensionList = jMetadataGeneral.getFormatExtensionsList();
        for (final String item : formatExtensionList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Format Commercial = " + jMetadataGeneral.getFormatCommercial());
        System.err.println(" Format Commercial If Any = " + jMetadataGeneral.getFormatCommercialIfAny());
        System.err.println(" Format Profile = " + jMetadataGeneral.getFormatProfile());
        System.err.println(" Format Compression = " + jMetadataGeneral.getFormatCompression());
        System.err.println(" Format Settings = " + jMetadataGeneral.getFormatSettings());
        System.err.println(" Internet Media Type = " + jMetadataGeneral.getInternetMediaType());
        System.err.println(" Codec ID = " + jMetadataGeneral.getCodecID());
        System.err.println(" Codec ID String = " + jMetadataGeneral.getCodecIDString());
        System.err.println(" Codec ID Info = " + jMetadataGeneral.getCodecIDInfo());
        System.err.println(" Codec ID Hint = " + jMetadataGeneral.getCodecIDHint());
        System.err.println(" Codec ID Description = " + jMetadataGeneral.getCodecIDDescription());
        System.err.println(" Is Interleaved = " + jMetadataGeneral.isInterleaved());
        System.err.println(" File size string = " + jMetadataGeneral.getFilesizeString());
        System.err.println(" File size string 1 = " + jMetadataGeneral.getFilesizeString1Digits());
        System.err.println(" File size string 2 = " + jMetadataGeneral.getFilesizeString2Digits());
        System.err.println(" File size string 3 = " + jMetadataGeneral.getFilesizeString3Digits());
        System.err.println(" File size string 4 = " + jMetadataGeneral.getFilesizeString4Digits());
        System.err.println(" Duration String = " + jMetadataGeneral.getDurationString());
        System.err.println(" Duration String Type 1 = " + jMetadataGeneral.getDurationStringType1());
        System.err.println(" Duration String Type 2 = " + jMetadataGeneral.getDurationStringType2());
        System.err.println(" Duration String Type 3 = " + jMetadataGeneral.getDurationStringType3());
        System.err.println(" Duration Start = " + jMetadataGeneral.getDurationStart());
        System.err.println(" Duration End = " + jMetadataGeneral.getDurationEnd());
        System.err.println(" Overall bit rate mode = " + jMetadataGeneral.getOverallBitRateMode());
        System.err.println(" Overall bit rate mode string = " + jMetadataGeneral.getOverallBitRateModeString());
        System.err.println(" Overall bit rate minimum = " + jMetadataGeneral.getOverallBitRateMinimum());
        System.err.println(" Overall bit rate minimum string = " + jMetadataGeneral.getOverallBitRateMinimumString());
        System.err.println(" Overall bit rate maximum = " + jMetadataGeneral.getOverallBitRateMaximum());
        System.err.println(" Overall bit rate maximum string = " + jMetadataGeneral.getOverallBitRateMaximumString());
        System.err.println(" Overall bit rate nominal = " + jMetadataGeneral.getOverallBitRateNominal());
        System.err.println(" Overall bit rate nominal string = " + jMetadataGeneral.getOverallBitRateNominalString());
        System.err.println(" Stream size = " + jMetadataGeneral.getStreamsize());
        System.err.println(" Stream size string = " + jMetadataGeneral.getStreamsizeString());
        System.err.println(" Stream size string type 1 = " + jMetadataGeneral.getStreamsizeStringType1());
        System.err.println(" Stream size string type 2 = " + jMetadataGeneral.getStreamsizeStringType2());
        System.err.println(" Stream size string type 3 = " + jMetadataGeneral.getStreamsizeStringType3());
        System.err.println(" Stream size string type 4 = " + jMetadataGeneral.getStreamsizeStringType4());
        System.err.println(" Stream size string type 5 = " + jMetadataGeneral.getStreamsizeStringType5());
        System.err.println(" Stream size proportion = " + jMetadataGeneral.getStreamsizeProportion());
        System.err.println(" Is streamable ? = " + jMetadataGeneral.isStreamable());
        try {
            System.err.println(" Recorded date = " + jMetadataGeneral.getRecordedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" Encoded date = " + jMetadataGeneral.getEncodedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" Tagged date = " + jMetadataGeneral.getTaggedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" Written date = " + jMetadataGeneral.getWrittenDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" File created date = " + jMetadataGeneral.getFileCreatedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" File modified date = " + jMetadataGeneral.getFileModifiedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        System.err.println(" Encoded Application = " + jMetadataGeneral.getEncodedApplication());
        try {
            System.err.println(" Encoded Application URL = " + jMetadataGeneral.getEncodedApplicationURL());
        } catch (final MalformedURLException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        System.err.println(" Encoded Library = " + jMetadataGeneral.getEncodedLibrary());
        System.err.println(" Encoded Library String = " + jMetadataGeneral.getEncodedLibraryString());
        System.err.println(" Encoded Library name = " + jMetadataGeneral.getEncodedLibraryName());
        System.err.println(" Encoded Library version = " + jMetadataGeneral.getEncodedLibraryVersion());
        System.err.println(" Encoded Library release date = " + jMetadataGeneral.getEncodedLibraryDate());
        System.err.println(" Encoded Library settings = " + jMetadataGeneral.getEncodedLibrarySettings());
        System.err.println("_________________________________________________________________________________________");
    }

    @Nullable
    private static File[] getFiles(@Nonnull final File directory) {
        // It is also possible to filter the list of returned files.
        // This example does not return any files that start with `.'.
        final FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(final File dir, final String name) {
                return !name.startsWith(".");
            }
        };
        final File[] children = directory.listFiles(filter);

        return children;
    }
}
