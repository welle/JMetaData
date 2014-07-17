package aka.jmetadata.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Nonnull;

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
        testWithExternalDLL();
    }

    private static void testWithInternalDLL() {
        try {
            // use internal dll
            final JMetadata jMetadata = new JMetadata();

            final File directory = new File("./Test/videos/");
            final File[] children = getFiles(directory);
            if (children == null) {
                System.err.println("[test] testWithInternalDLL - no movie found in " + directory.getAbsolutePath());
            } else {
                for (final File file : children) {
                    System.err.println("[test] testWithInternalDLL - " + file.getAbsolutePath());
                    if (jMetadata.open(file)) {
                        System.err.print("# Video " + jMetadata.getNumVideoStreams());
                        System.err.print(" # Audio " + jMetadata.getNumAudioStreams());
                        System.err.print(" # Subtitle " + jMetadata.getNumSubtitleStreams());
                        System.err.print(" Duration " + jMetadata.getDuration());
                        System.err.print(" Format " + jMetadata.getFormat());
                        System.err.print(" Format Version " + jMetadata.getFormatVersion());
                        System.err.print(" File Size  " + jMetadata.getFileSize());
                        System.err.println(" OverallBitRate " + jMetadata.getOverallBitRate());

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
                    System.err.print("# Video " + jMetadata.getNumVideoStreams());
                    System.err.print(" # Audio " + jMetadata.getNumAudioStreams());
                    System.err.print(" # Subtitle " + jMetadata.getNumSubtitleStreams());
                    System.err.print(" Duration " + jMetadata.getDuration());
                    System.err.print(" Format " + jMetadata.getFormat());
                    System.err.print(" Format Version " + jMetadata.getFormatVersion());
                    System.err.print(" File Size  " + jMetadata.getFileSize());
                    System.err.println(" OverallBitRate " + jMetadata.getOverallBitRate());

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
