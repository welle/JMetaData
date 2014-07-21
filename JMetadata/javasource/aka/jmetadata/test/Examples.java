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
                        printJMetaDataInfos(jMetadata);

                        final List<JMetadataVideo> videoStreamList = jMetadata.getVideoStreams();
                        for (final JMetadataVideo jMetadataVideo : videoStreamList) {
                            System.err.println("VIDEO - Codec: " + jMetadataVideo.getCodecID() + " Aspect Ratio: " + jMetadataVideo.getDisplayAspectRatio() + " Format: " + jMetadataVideo.getFormat() + " Format Info: " + jMetadataVideo.getFormatInfo() + " Format Profile: " + jMetadataVideo.getFormatProfile() + " Language: " + jMetadataVideo.getLanguage() + " Bit Rate: " + jMetadataVideo.getBitRate() + " Duration " + jMetadataVideo.getDuration() + " Frame Rate: " + jMetadataVideo.getFrameRate()
                                    + " Width: " + jMetadataVideo.getWidth() + " Height: " + jMetadataVideo.getHeight());
                        }

                        final List<JMetadataAudio> audioStreamList = jMetadata.getAudioStreams();
                        for (final JMetadataAudio jMetadataVideo : audioStreamList) {
                            System.err.println("AUDIO - Codec: " + jMetadataVideo.getCodecID() + " Codec Hint: " + jMetadataVideo.getCodecIDHint() + " Sampling rate: " + jMetadataVideo.getSamplingRate() + " Format: " + jMetadataVideo.getFormat() + " Format Info: " + jMetadataVideo.getFormatInfo() + " Format Profile: " + jMetadataVideo.getFormatProfile() + " Language: " + jMetadataVideo.getLanguage() + " Bit Rate: " + jMetadataVideo.getBitRate() + " Duration " + jMetadataVideo.getDuration()
                                    + " Channels: " + jMetadataVideo.getChannels() + " DEFAULT: " + jMetadataVideo.isDefault() + " forced: " + jMetadataVideo.isForced());
                        }

                        final List<JMetadataSubtitle> textStreamList = jMetadata.getSubtitleStreams();
                        for (final JMetadataSubtitle jMetadataVideo : textStreamList) {
                            System.err.println("SUBTITLE - Codec: " + jMetadataVideo.getCodecID() + " Codec Hint: " + jMetadataVideo.getCodecID() + " Format: " + jMetadataVideo.getFormat() + " CODEC Info: " + jMetadataVideo.getCodecIDInfo() + " Language: " + jMetadataVideo.getLanguage() + " DEFAULT: " + jMetadataVideo.isDefault() + " forced: " + jMetadataVideo.isForced());
                        }
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
                    printJMetaDataInfos(jMetadata);
                    final List<JMetadataVideo> videoStreamList = jMetadata.getVideoStreams();
                    for (final JMetadataVideo jMetadataVideo : videoStreamList) {
                        System.err.println("VIDEO - Codec: " + jMetadataVideo.getCodecID() + " Aspect Ratio: " + jMetadataVideo.getDisplayAspectRatio() + " Format: " + jMetadataVideo.getFormat() + " Format Info: " + jMetadataVideo.getFormatInfo() + " Format Profile: " + jMetadataVideo.getFormatProfile() + " Language: " + jMetadataVideo.getLanguage() + " Bit Rate: " + jMetadataVideo.getBitRate() + " Duration " + jMetadataVideo.getDuration() + " Frame Rate: " + jMetadataVideo.getFrameRate()
                                + " Width: " + jMetadataVideo.getWidth() + " Height: " + jMetadataVideo.getHeight());
                    }

                    final List<JMetadataAudio> audioStreamList = jMetadata.getAudioStreams();
                    for (final JMetadataAudio jMetadataVideo : audioStreamList) {
                        System.err.println("AUDIO - Codec: " + jMetadataVideo.getCodecID() + " Codec Hint: " + jMetadataVideo.getCodecIDHint() + " Sampling rate: " + jMetadataVideo.getSamplingRate() + " Format: " + jMetadataVideo.getFormat() + " Format Info: " + jMetadataVideo.getFormatInfo() + " Format Profile: " + jMetadataVideo.getFormatProfile() + " Language: " + jMetadataVideo.getLanguage() + " Bit Rate: " + jMetadataVideo.getBitRate() + " Duration " + jMetadataVideo.getDuration()
                                + " Channels: " + jMetadataVideo.getChannels() + " DEFAULT: " + jMetadataVideo.isDefault() + " forced: " + jMetadataVideo.isForced());
                    }

                    final List<JMetadataSubtitle> textStreamList = jMetadata.getSubtitleStreams();
                    for (final JMetadataSubtitle jMetadataVideo : textStreamList) {
                        System.err.println("SUBTITLE - Codec: " + jMetadataVideo.getCodecID() + " Codec Hint: " + jMetadataVideo.getCodecID() + " Format: " + jMetadataVideo.getFormat() + " CODEC Info: " + jMetadataVideo.getCodecIDInfo() + " Language: " + jMetadataVideo.getLanguage() + " DEFAULT: " + jMetadataVideo.isDefault() + " forced: " + jMetadataVideo.isForced());
                    }
                }
            }
        }
        try {
            jMetadata.close();
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    private static void printJMetaDataInfos(final JMetadata jMetadata) {
        System.err.println(" # Video = " + jMetadata.getNumVideoStreams());
        System.err.println(" # Audio = " + jMetadata.getNumAudioStreams());
        System.err.println(" # Subtitle = " + jMetadata.getNumSubtitleStreams());
        System.err.println(" Duration = " + jMetadata.getDuration());
        System.err.println(" Format = " + jMetadata.getFormat());
        System.err.println(" Format Version = " + jMetadata.getFormatVersion());
        System.err.println(" File Size = " + jMetadata.getFileSize());
        System.err.println(" OverallBitRate = " + jMetadata.getOverallBitRate());
        System.err.println(" StreamCount = " + jMetadata.getStreamCount());
        System.err.println(" StreamKind = " + jMetadata.getStreamKind());
        System.err.println(" StreamKindString = " + jMetadata.getStreamKindString());
        System.err.println(" StreamKindID = " + jMetadata.getStreamKindID());
        System.err.println(" StreamKindPos = " + jMetadata.getStreamKindPosition());
        System.err.println(" StreamKindOrder = " + jMetadata.getStreamKindOrder());
        System.err.println(" ID = " + jMetadata.getID());
        System.err.println(" ID String = " + jMetadata.getIDString());
        System.err.println(" Unique ID = " + jMetadata.getUniqueID());
        System.err.println(" Unique ID String = " + jMetadata.getUniqueIDString());
        System.err.println(" Menu ID  = " + jMetadata.getMenuID());
        System.err.println(" Menu ID String = " + jMetadata.getMenuIDString());
        System.err.println(" General count = " + jMetadata.getGeneralCount());
        System.err.println(" Video count = " + jMetadata.getVideoCount());
        System.err.println(" Audio count = " + jMetadata.getAudioCount());
        System.err.println(" Text count = " + jMetadata.getTextCount());
        System.err.println(" Chapters count = " + jMetadata.getChaptersCount());
        System.err.println(" Image count = " + jMetadata.getImageCount());
        System.err.println(" Menu count = " + jMetadata.getMenuCount());
        System.err.println(" Video format list = ");
        final List<String> videoFormatList = jMetadata.getVideoFormatList();
        for (final String item : videoFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Video format with hint list = ");
        final List<String> videoFormatWithHintList = jMetadata.getVideoFormatWithHintList();
        for (final String item : videoFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Video language list = ");
        final List<String> videoLanguageList = jMetadata.getVideoLanguageList();
        for (final String item : videoLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Audio format list = ");
        final List<String> audioFormatList = jMetadata.getAudioFormatList();
        for (final String item : audioFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Audio format with hint list = ");
        final List<String> audioFormatWithHintList = jMetadata.getAudioFormatWithHintList();
        for (final String item : audioFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Audio language list = ");
        final List<String> audioLanguageList = jMetadata.getAudioLanguageList();
        for (final String item : audioLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Text format list = ");
        final List<String> textFormatList = jMetadata.getTextFormatList();
        for (final String item : textFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Text format with hint list = ");
        final List<String> textFormatWithHintList = jMetadata.getTextFormatWithHintList();
        for (final String item : textFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Text language list = ");
        final List<String> textLanguageList = jMetadata.getTextLanguageList();
        for (final String item : textLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Chapters format list = ");
        final List<String> chaptersFormatList = jMetadata.getChaptersFormatList();
        for (final String item : chaptersFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Chapters format with hint list = ");
        final List<String> chaptersFormatWithHintList = jMetadata.getChaptersFormatWithHintList();
        for (final String item : chaptersFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Chapters language list = ");
        final List<String> chaptersLanguageList = jMetadata.getChaptersLanguageList();
        for (final String item : chaptersLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Image format list = ");
        final List<String> imageFormatList = jMetadata.getImageFormatList();
        for (final String item : imageFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Image format with hint list = ");
        final List<String> imageFormatWithHintList = jMetadata.getImageFormatWithHintList();
        for (final String item : imageFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Image language list = ");
        final List<String> imageLanguageList = jMetadata.getImageLanguageList();
        for (final String item : imageLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Menu format list = ");
        final List<String> menuFormatList = jMetadata.getMenuFormatList();
        for (final String item : menuFormatList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Menu format with hint list = ");
        final List<String> menuFormatWithHintList = jMetadata.getMenuFormatWithHintList();
        for (final String item : menuFormatWithHintList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Menu language list = ");
        final List<String> menuLanguageList = jMetadata.getMenuLanguageList();
        for (final String item : menuLanguageList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Complete Name = " + jMetadata.getCompleteName());
        System.err.println(" Folder Name = " + jMetadata.getFolderName());
        System.err.println(" File Name = " + jMetadata.getFileName());
        System.err.println(" File Extension = " + jMetadata.getFileExtension());
        System.err.println(" Format info = " + jMetadata.getFormatInfo());
        try {
            System.err.println(" Format URL = " + jMetadata.getFormatURL());
        } catch (final MalformedURLException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        System.err.println(" Format extensions = ");
        final List<String> formatExtensionList = jMetadata.getFormatExtensionsList();
        for (final String item : formatExtensionList) {
            System.err.println("  * " + item);
        }
        System.err.println(" Format Commercial = " + jMetadata.getFormatCommercial());
        System.err.println(" Format Commercial If Any = " + jMetadata.getFormatCommercialIfAny());
        System.err.println(" Format Profile = " + jMetadata.getFormatProfile());
        System.err.println(" Format Compression = " + jMetadata.getFormatCompression());
        System.err.println(" Format Settings = " + jMetadata.getFormatSettings());
        System.err.println(" Internet Media Type = " + jMetadata.getInternetMediaType());
        System.err.println(" Codec ID = " + jMetadata.getCodecID());
        System.err.println(" Codec ID String = " + jMetadata.getCodecIDString());
        System.err.println(" Codec ID Info = " + jMetadata.getCodecIDInfo());
        System.err.println(" Codec ID Hint = " + jMetadata.getCodecIDHint());
        System.err.println(" Codec ID Description = " + jMetadata.getCodecIDDescription());
        System.err.println(" Is Interleaved = " + jMetadata.isInterleaved());
        System.err.println(" File size string = " + jMetadata.getFilesizeString());
        System.err.println(" File size string 1 = " + jMetadata.getFilesizeString1Digits());
        System.err.println(" File size string 2 = " + jMetadata.getFilesizeString2Digits());
        System.err.println(" File size string 3 = " + jMetadata.getFilesizeString3Digits());
        System.err.println(" File size string 4 = " + jMetadata.getFilesizeString4Digits());
        System.err.println(" Duration String = " + jMetadata.getDurationString());
        System.err.println(" Duration String Type 1 = " + jMetadata.getDurationStringType1());
        System.err.println(" Duration String Type 2 = " + jMetadata.getDurationStringType2());
        System.err.println(" Duration String Type 3 = " + jMetadata.getDurationStringType3());
        System.err.println(" Duration Start = " + jMetadata.getDurationStart());
        System.err.println(" Duration End = " + jMetadata.getDurationEnd());
        System.err.println(" Overall bit rate mode = " + jMetadata.getOverallBitRateMode());
        System.err.println(" Overall bit rate mode string = " + jMetadata.getOverallBitRateModeString());
        System.err.println(" Overall bit rate minimum = " + jMetadata.getOverallBitRateMinimum());
        System.err.println(" Overall bit rate minimum string = " + jMetadata.getOverallBitRateMinimumString());
        System.err.println(" Overall bit rate maximum = " + jMetadata.getOverallBitRateMaximum());
        System.err.println(" Overall bit rate maximum string = " + jMetadata.getOverallBitRateMaximumString());
        System.err.println(" Overall bit rate nominal = " + jMetadata.getOverallBitRateNominal());
        System.err.println(" Overall bit rate nominal string = " + jMetadata.getOverallBitRateNominalString());
        System.err.println(" Stream size = " + jMetadata.getStreamsize());
        System.err.println(" Stream size string = " + jMetadata.getStreamsizeString());
        System.err.println(" Stream size string type 1 = " + jMetadata.getStreamsizeStringType1());
        System.err.println(" Stream size string type 2 = " + jMetadata.getStreamsizeStringType2());
        System.err.println(" Stream size string type 3 = " + jMetadata.getStreamsizeStringType3());
        System.err.println(" Stream size string type 4 = " + jMetadata.getStreamsizeStringType4());
        System.err.println(" Stream size string type 5 = " + jMetadata.getStreamsizeStringType5());
        System.err.println(" Stream size proportion = " + jMetadata.getStreamsizeProportion());
        System.err.println(" Is streamable ? = " + jMetadata.isStreamable());
        try {
            System.err.println(" Recorded date = " + jMetadata.getRecordedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" Encoded date = " + jMetadata.getEncodedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" Tagged date = " + jMetadata.getTaggedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" Written date = " + jMetadata.getWrittenDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" File created date = " + jMetadata.getFileCreatedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        try {
            System.err.println(" File modified date = " + jMetadata.getFileModifiedDate());
        } catch (final ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        System.err.println(" Encoded Application = " + jMetadata.getEncodedApplication());
        try {
            System.err.println(" Encoded Application URL = " + jMetadata.getEncodedApplicationURL());
        } catch (final MalformedURLException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        System.err.println(" Encoded Library = " + jMetadata.getEncodedLibrary());
        System.err.println(" Encoded Library String = " + jMetadata.getEncodedLibraryString());
        System.err.println(" Encoded Library name = " + jMetadata.getEncodedLibraryName());
        System.err.println(" Encoded Library version = " + jMetadata.getEncodedLibraryVersion());
        System.err.println(" Encoded Library release date = " + jMetadata.getEncodedLibraryDate());
        System.err.println(" Encoded Library settings = " + jMetadata.getEncodedLibrarySettings());
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
