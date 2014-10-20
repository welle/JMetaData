package aka.jmetadata.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.JMetadata;
import aka.jmetadata.main.JMetadataAudio;
import aka.jmetadata.main.JMetadataChapter;
import aka.jmetadata.main.JMetadataGeneral;
import aka.jmetadata.main.JMetadataMenu;
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
	 * @param args
	 *            not used.
	 */
	public static void main(final String[] args) {
		testWithInternalDLL();
		// testWithExternalDLL();
	}

	private static void testWithInternalDLL() {
		try {
			// use internal dll
			final JMetadata jMetadata = new JMetadata();

			final File directory = new File("./Test/videos/");
			// final File directory = new
			// File("e:/downloads/Masters.of.Sex.S02E01.720p.HDTV.x264-IMMERSE/");
			final File[] children = getFiles(directory);
			if (children == null) {
				System.out.println("[test] testWithInternalDLL - no movie found in " + directory.getAbsolutePath());
			} else {
				for (final File file : children) {
					System.out.println("[test] testWithInternalDLL - " + file.getAbsolutePath());
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
			System.out.println("[test] testWithExternalDLL - no movie found in " + directory.getAbsolutePath());
		} else {
			for (final File file : children) {
				System.out.println("[test] testWithExternalDLL - " + file.getAbsolutePath());
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

	private static void printJMetadata(@NonNull final JMetadata jMetadata) {
		printJMetaDataInfos(jMetadata.getGeneral());
		final List<JMetadataVideo> videoStreamList = jMetadata.getVideoStreams();
		System.out.println("VIDEOS");
		System.out.println("--------------------");
		for (final JMetadataVideo jMetadataVideo : videoStreamList) {
			assert jMetadataVideo != null;
			printJMetadataVideos(jMetadataVideo);
		}
		System.out.println("_________________________________________________________________________________________");

		System.out.println("AUDIOS");
		System.out.println("--------------------");
		final List<JMetadataAudio> audioStreamList = jMetadata.getAudioStreams();
		for (final JMetadataAudio jMetadataAudio : audioStreamList) {
			assert jMetadataAudio != null;
			printJMetadataAudios(jMetadataAudio);
		}
		System.out.println("_________________________________________________________________________________________");

		System.out.println("SUBTITLES");
		System.out.println("--------------------");
		final List<JMetadataSubtitle> textStreamList = jMetadata.getSubtitleStreams();
		for (final JMetadataSubtitle jMetadataSubtitle : textStreamList) {
			assert jMetadataSubtitle != null;
			printjMetadataSubtitles(jMetadataSubtitle);
		}
		System.out.println("_________________________________________________________________________________________");

		System.out.println("CHAPTERS");
		System.out.println("--------------------");
		final List<JMetadataChapter> chapterStreamList = jMetadata.getChapterStreams();
		for (final JMetadataChapter jMetadataChapter : chapterStreamList) {
			assert jMetadataChapter != null;
			printjMetadataChapters(jMetadataChapter);
		}
		System.out.println("_________________________________________________________________________________________");

		System.out.println("MENUS");
		System.out.println("--------------------");
		final List<JMetadataMenu> menuStreamList = jMetadata.getMenuStreams();
		for (final JMetadataMenu jMetadataMenu : menuStreamList) {
			assert jMetadataMenu != null;
			printjMetadataMenus(jMetadataMenu);
		}
		System.out.println("_________________________________________________________________________________________");
	}

	private static void printjMetadataMenus(@NonNull final JMetadataMenu jMetadataMenu) {
		System.out.println("MENU #" + jMetadataMenu.getStreamKindID());
		System.out.println("-------------");
		System.out.println(" Duration = " + jMetadataMenu.getDuration());
		System.out.println(" Format = " + jMetadataMenu.getFormat());
		System.out.println(" Format Version = " + jMetadataMenu.getFormatVersion());
		System.out.println(" Format Settings = " + jMetadataMenu.getFormatSettings());
		System.out.println(" Bit Rate = " + jMetadataMenu.getBitRate());
		System.out.println(" Frame Rate = " + jMetadataMenu.getFrameRate());
		System.out.println(" StreamKind = " + jMetadataMenu.getStreamKind());
		System.out.println(" StreamKindString = " + jMetadataMenu.getStreamKindString());
		System.out.println(" StreamKindID = " + jMetadataMenu.getStreamKindID());
		System.out.println(" StreamKindPos = " + jMetadataMenu.getStreamKindPosition());
		System.out.println(" StreamKindOrder = " + jMetadataMenu.getStreamKindOrder());
		System.out.println(" ID = " + jMetadataMenu.getID());
		System.out.println(" ID String = " + jMetadataMenu.getIDString());
		System.out.println(" Unique ID = " + jMetadataMenu.getUniqueID());
		System.out.println(" Unique ID String = " + jMetadataMenu.getUniqueIDString());
		System.out.println(" Menu ID  = " + jMetadataMenu.getMenuID());
		System.out.println(" Menu ID String = " + jMetadataMenu.getMenuIDString());
		System.out.println(" Format info = " + jMetadataMenu.getFormatInfo());
		try {
			System.out.println(" Format URL = " + jMetadataMenu.getFormatURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Format Commercial = " + jMetadataMenu.getFormatCommercial());
		System.out.println(" Format Commercial If Any = " + jMetadataMenu.getFormatCommercialIfAny());
		System.out.println(" Format Profile = " + jMetadataMenu.getFormatProfile());
		System.out.println(" Format Compression = " + jMetadataMenu.getFormatCompression());
		System.out.println(" Codec ID = " + jMetadataMenu.getCodecID());
		System.out.println(" Duration String = " + jMetadataMenu.getDurationString());
		System.out.println(" Duration String Type 1 = " + jMetadataMenu.getDurationStringType1());
		System.out.println(" Duration String Type 2 = " + jMetadataMenu.getDurationStringType2());
		System.out.println(" Duration String Type 3 = " + jMetadataMenu.getDurationStringType3());
		System.out.println(" Internet Media Type = " + jMetadataMenu.getInternetMediaType());
		System.out.println(" Muxing mode = " + jMetadataMenu.getMuxingMode());
		System.out.println(" Codec ID String = " + jMetadataMenu.getCodecIDString());
		System.out.println(" Codec ID Info = " + jMetadataMenu.getCodecIDInfo());
		System.out.println(" Codec ID Hint = " + jMetadataMenu.getCodecIDHint());
		System.out.println(" Codec ID Description = " + jMetadataMenu.getCodecIDDescription());
		try {
			System.out.println(" Codec ID URL = " + jMetadataMenu.getCodecIDURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Duration first trame = " + jMetadataMenu.getDurationFirstTrame());
		System.out.println(" Duration first trame Type 1 = " + jMetadataMenu.getDurationFirstTrameType1());
		System.out.println(" Duration first trame Type 2 = " + jMetadataMenu.getDurationFirstTrameType2());
		System.out.println(" Duration first trame Type 3 = " + jMetadataMenu.getDurationFirstTrameType3());
		System.out.println(" Bit rate mode = " + jMetadataMenu.getBitRateMode());
		System.out.println(" Bit rate mode string = " + jMetadataMenu.getBitRateModeString());
		System.out.println(" Bit rate string = " + jMetadataMenu.getBitRateString());
		System.out.println(" Bit rate minimum = " + jMetadataMenu.getBitRateMinimum());
		System.out.println(" Bit rate minimum string = " + jMetadataMenu.getBitRateMinimumString());
		System.out.println(" Bit rate nominal = " + jMetadataMenu.getBitRateNominal());
		System.out.println(" Bit rate nominal string = " + jMetadataMenu.getBitRateNominalString());
		System.out.println(" Bit rate maximum = " + jMetadataMenu.getBitRateMaximum());
		System.out.println(" Bit rate maximum string = " + jMetadataMenu.getBitRateMaximumString());
		System.out.println(" Bit rate encoded = " + jMetadataMenu.getBitRateEncoded());
		System.out.println(" Frame count = " + jMetadataMenu.getFrameCount());
		System.out.println(" Source Frame count = " + jMetadataMenu.getSourceFrameCount());
		try {
			System.out.println(" Encoded date = " + jMetadataMenu.getEncodedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Tagged date = " + jMetadataMenu.getTaggedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Application = " + jMetadataMenu.getEncodedApplication());
		try {
			System.out.println(" Encoded Application URL = " + jMetadataMenu.getEncodedApplicationURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Library = " + jMetadataMenu.getEncodedLibrary());
		System.out.println(" Encoded Library String = " + jMetadataMenu.getEncodedLibraryString());
		System.out.println(" Encoded Library name = " + jMetadataMenu.getEncodedLibraryName());
		System.out.println(" Encoded Library version = " + jMetadataMenu.getEncodedLibraryVersion());
		System.out.println(" Encoded Library release date = " + jMetadataMenu.getEncodedLibraryDate());
		System.out.println(" Encoded Library settings = " + jMetadataMenu.getEncodedLibrarySettings());
		System.out.println(" Stream size = " + jMetadataMenu.getStreamsize());
		System.out.println(" Stream size string = " + jMetadataMenu.getStreamsizeString());
		System.out.println(" Stream size string type 1 = " + jMetadataMenu.getStreamsizeStringType1());
		System.out.println(" Stream size string type 2 = " + jMetadataMenu.getStreamsizeStringType2());
		System.out.println(" Stream size string type 3 = " + jMetadataMenu.getStreamsizeStringType3());
		System.out.println(" Stream size string type 4 = " + jMetadataMenu.getStreamsizeStringType4());
		System.out.println(" Stream size string type 5 = " + jMetadataMenu.getStreamsizeStringType5());
		System.out.println(" Stream size proportion = " + jMetadataMenu.getStreamsizeProportion());
		System.out.println(" Language = " + jMetadataMenu.getLanguage());
		System.out.println(" Language string = " + jMetadataMenu.getLanguageString());
		System.out.println(" Language string 1 = " + jMetadataMenu.getLanguageString1());
		System.out.println(" Language string 2 = " + jMetadataMenu.getLanguageString2());
		System.out.println(" Language string 3 = " + jMetadataMenu.getLanguageString3());
		System.out.println(" Language string 4 = " + jMetadataMenu.getLanguageString4());
		System.out.println(" Language more = " + jMetadataMenu.getLanguageMore());
		System.out.println(" Is default ? = " + jMetadataMenu.isDefault());
		System.out.println(" Default string = " + jMetadataMenu.getDefaultString());
		System.out.println(" Is forced ? = " + jMetadataMenu.isForced());
		System.out.println(" Forced string = " + jMetadataMenu.getForcedString());
		System.out.println(" Alignment = " + jMetadataMenu.getAlignment());
		System.out.println(" Alignment string = " + jMetadataMenu.getAlignmentString());
		System.out.println(" Title = " + jMetadataMenu.getTitle());
		System.out.println(" Bit depth = " + jMetadataMenu.getBitDepth());
		System.out.println(" Bit depth string = " + jMetadataMenu.getBitDepthString());
		System.out.println(" Compression mode = " + jMetadataMenu.getCompressionMode());
		System.out.println(" Compression mode string = " + jMetadataMenu.getCompressionModeString());
		System.out.println(" Compression ratio = " + jMetadataMenu.getCompressionRatio());
		System.out.println(" Delay = " + jMetadataMenu.getDelay());
		System.out.println(" Delay string = " + jMetadataMenu.getDelayString());
		System.out.println(" Delay string 1 = " + jMetadataMenu.getDelayStringType1());
		System.out.println(" Delay string 2 = " + jMetadataMenu.getDelayStringType2());
		System.out.println(" Delay string 3 = " + jMetadataMenu.getDelayStringType3());
		System.out.println(" Delay string 4 = " + jMetadataMenu.getDelayStringType4());
		System.out.println(" Delay settings = " + jMetadataMenu.getDelaySettings());
		System.out.println(" Encryption = " + jMetadataMenu.getEncryption());
		System.out.println(" Delay source = " + jMetadataMenu.getDelaySource());
		System.out.println(" Delay source string = " + jMetadataMenu.getDelaySourceString());
		System.out.println(" Frame rate string = " + jMetadataMenu.getFrameRateString());
	}

	private static void printjMetadataChapters(@NonNull final JMetadataChapter jMetadataChapter) {
		System.out.println("CHAPTER #" + jMetadataChapter.getStreamKindID());
		System.out.println("-------------");
		System.out.println(" Duration = " + jMetadataChapter.getDuration());
		System.out.println(" Format = " + jMetadataChapter.getFormat());
		System.out.println(" Format Version = " + jMetadataChapter.getFormatVersion());
		System.out.println(" Format Settings = " + jMetadataChapter.getFormatSettings());
		System.out.println(" Bit Rate = " + jMetadataChapter.getBitRate());
		System.out.println(" Frame Rate = " + jMetadataChapter.getFrameRate());
		System.out.println(" StreamKind = " + jMetadataChapter.getStreamKind());
		System.out.println(" StreamKindString = " + jMetadataChapter.getStreamKindString());
		System.out.println(" StreamKindID = " + jMetadataChapter.getStreamKindID());
		System.out.println(" StreamKindPos = " + jMetadataChapter.getStreamKindPosition());
		System.out.println(" StreamKindOrder = " + jMetadataChapter.getStreamKindOrder());
		System.out.println(" ID = " + jMetadataChapter.getID());
		System.out.println(" ID String = " + jMetadataChapter.getIDString());
		System.out.println(" Unique ID = " + jMetadataChapter.getUniqueID());
		System.out.println(" Unique ID String = " + jMetadataChapter.getUniqueIDString());
		System.out.println(" Menu ID  = " + jMetadataChapter.getMenuID());
		System.out.println(" Menu ID String = " + jMetadataChapter.getMenuIDString());
		System.out.println(" Format info = " + jMetadataChapter.getFormatInfo());
		try {
			System.out.println(" Format URL = " + jMetadataChapter.getFormatURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Format Commercial = " + jMetadataChapter.getFormatCommercial());
		System.out.println(" Format Commercial If Any = " + jMetadataChapter.getFormatCommercialIfAny());
		System.out.println(" Format Profile = " + jMetadataChapter.getFormatProfile());
		System.out.println(" Format Compression = " + jMetadataChapter.getFormatCompression());
		System.out.println(" Codec ID = " + jMetadataChapter.getCodecID());
		System.out.println(" Duration String = " + jMetadataChapter.getDurationString());
		System.out.println(" Duration String Type 1 = " + jMetadataChapter.getDurationStringType1());
		System.out.println(" Duration String Type 2 = " + jMetadataChapter.getDurationStringType2());
		System.out.println(" Duration String Type 3 = " + jMetadataChapter.getDurationStringType3());
		System.out.println(" Internet Media Type = " + jMetadataChapter.getInternetMediaType());
		System.out.println(" Muxing mode = " + jMetadataChapter.getMuxingMode());
		System.out.println(" Codec ID String = " + jMetadataChapter.getCodecIDString());
		System.out.println(" Codec ID Info = " + jMetadataChapter.getCodecIDInfo());
		System.out.println(" Codec ID Hint = " + jMetadataChapter.getCodecIDHint());
		System.out.println(" Codec ID Description = " + jMetadataChapter.getCodecIDDescription());
		try {
			System.out.println(" Codec ID URL = " + jMetadataChapter.getCodecIDURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Duration first trame = " + jMetadataChapter.getDurationFirstTrame());
		System.out.println(" Duration first trame Type 1 = " + jMetadataChapter.getDurationFirstTrameType1());
		System.out.println(" Duration first trame Type 2 = " + jMetadataChapter.getDurationFirstTrameType2());
		System.out.println(" Duration first trame Type 3 = " + jMetadataChapter.getDurationFirstTrameType3());
		System.out.println(" Bit rate mode = " + jMetadataChapter.getBitRateMode());
		System.out.println(" Bit rate mode string = " + jMetadataChapter.getBitRateModeString());
		System.out.println(" Bit rate string = " + jMetadataChapter.getBitRateString());
		System.out.println(" Bit rate minimum = " + jMetadataChapter.getBitRateMinimum());
		System.out.println(" Bit rate minimum string = " + jMetadataChapter.getBitRateMinimumString());
		System.out.println(" Bit rate nominal = " + jMetadataChapter.getBitRateNominal());
		System.out.println(" Bit rate nominal string = " + jMetadataChapter.getBitRateNominalString());
		System.out.println(" Bit rate maximum = " + jMetadataChapter.getBitRateMaximum());
		System.out.println(" Bit rate maximum string = " + jMetadataChapter.getBitRateMaximumString());
		System.out.println(" Bit rate encoded = " + jMetadataChapter.getBitRateEncoded());
		System.out.println(" Frame count = " + jMetadataChapter.getFrameCount());
		System.out.println(" Source Frame count = " + jMetadataChapter.getSourceFrameCount());
		try {
			System.out.println(" Encoded date = " + jMetadataChapter.getEncodedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Tagged date = " + jMetadataChapter.getTaggedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Application = " + jMetadataChapter.getEncodedApplication());
		try {
			System.out.println(" Encoded Application URL = " + jMetadataChapter.getEncodedApplicationURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Library = " + jMetadataChapter.getEncodedLibrary());
		System.out.println(" Encoded Library String = " + jMetadataChapter.getEncodedLibraryString());
		System.out.println(" Encoded Library name = " + jMetadataChapter.getEncodedLibraryName());
		System.out.println(" Encoded Library version = " + jMetadataChapter.getEncodedLibraryVersion());
		System.out.println(" Encoded Library release date = " + jMetadataChapter.getEncodedLibraryDate());
		System.out.println(" Encoded Library settings = " + jMetadataChapter.getEncodedLibrarySettings());
		System.out.println(" Stream size = " + jMetadataChapter.getStreamsize());
		System.out.println(" Stream size string = " + jMetadataChapter.getStreamsizeString());
		System.out.println(" Stream size string type 1 = " + jMetadataChapter.getStreamsizeStringType1());
		System.out.println(" Stream size string type 2 = " + jMetadataChapter.getStreamsizeStringType2());
		System.out.println(" Stream size string type 3 = " + jMetadataChapter.getStreamsizeStringType3());
		System.out.println(" Stream size string type 4 = " + jMetadataChapter.getStreamsizeStringType4());
		System.out.println(" Stream size string type 5 = " + jMetadataChapter.getStreamsizeStringType5());
		System.out.println(" Stream size proportion = " + jMetadataChapter.getStreamsizeProportion());
		System.out.println(" Language = " + jMetadataChapter.getLanguage());
		System.out.println(" Language string = " + jMetadataChapter.getLanguageString());
		System.out.println(" Language string 1 = " + jMetadataChapter.getLanguageString1());
		System.out.println(" Language string 2 = " + jMetadataChapter.getLanguageString2());
		System.out.println(" Language string 3 = " + jMetadataChapter.getLanguageString3());
		System.out.println(" Language string 4 = " + jMetadataChapter.getLanguageString4());
		System.out.println(" Language more = " + jMetadataChapter.getLanguageMore());
		System.out.println(" Is default ? = " + jMetadataChapter.isDefault());
		System.out.println(" Default string = " + jMetadataChapter.getDefaultString());
		System.out.println(" Is forced ? = " + jMetadataChapter.isForced());
		System.out.println(" Forced string = " + jMetadataChapter.getForcedString());
		System.out.println(" Alignment = " + jMetadataChapter.getAlignment());
		System.out.println(" Alignment string = " + jMetadataChapter.getAlignmentString());
		System.out.println(" Title = " + jMetadataChapter.getTitle());
		System.out.println(" Bit depth = " + jMetadataChapter.getBitDepth());
		System.out.println(" Bit depth string = " + jMetadataChapter.getBitDepthString());
		System.out.println(" Compression mode = " + jMetadataChapter.getCompressionMode());
		System.out.println(" Compression mode string = " + jMetadataChapter.getCompressionModeString());
		System.out.println(" Compression ratio = " + jMetadataChapter.getCompressionRatio());
		System.out.println(" Delay = " + jMetadataChapter.getDelay());
		System.out.println(" Delay string = " + jMetadataChapter.getDelayString());
		System.out.println(" Delay string 1 = " + jMetadataChapter.getDelayStringType1());
		System.out.println(" Delay string 2 = " + jMetadataChapter.getDelayStringType2());
		System.out.println(" Delay string 3 = " + jMetadataChapter.getDelayStringType3());
		System.out.println(" Delay string 4 = " + jMetadataChapter.getDelayStringType4());
		System.out.println(" Delay settings = " + jMetadataChapter.getDelaySettings());
		System.out.println(" Encryption = " + jMetadataChapter.getEncryption());
		System.out.println(" Delay source = " + jMetadataChapter.getDelaySource());
		System.out.println(" Delay source string = " + jMetadataChapter.getDelaySourceString());
		System.out.println(" Frame rate string = " + jMetadataChapter.getFrameRateString());
	}

	private static void printjMetadataSubtitles(@NonNull final JMetadataSubtitle jMetadataSubtitle) {
		System.out.println("SUBTITLES #" + jMetadataSubtitle.getStreamKindID());
		System.out.println("-------------");
		System.out.println(" Duration = " + jMetadataSubtitle.getDuration());
		System.out.println(" Format = " + jMetadataSubtitle.getFormat());
		System.out.println(" Format Version = " + jMetadataSubtitle.getFormatVersion());
		System.out.println(" Format Settings = " + jMetadataSubtitle.getFormatSettings());
		System.out.println(" Bit Rate = " + jMetadataSubtitle.getBitRate());
		System.out.println(" Frame Rate = " + jMetadataSubtitle.getFrameRate());
		System.out.println(" StreamKind = " + jMetadataSubtitle.getStreamKind());
		System.out.println(" StreamKindString = " + jMetadataSubtitle.getStreamKindString());
		System.out.println(" StreamKindID = " + jMetadataSubtitle.getStreamKindID());
		System.out.println(" StreamKindPos = " + jMetadataSubtitle.getStreamKindPosition());
		System.out.println(" StreamKindOrder = " + jMetadataSubtitle.getStreamKindOrder());
		System.out.println(" ID = " + jMetadataSubtitle.getID());
		System.out.println(" ID String = " + jMetadataSubtitle.getIDString());
		System.out.println(" Unique ID = " + jMetadataSubtitle.getUniqueID());
		System.out.println(" Unique ID String = " + jMetadataSubtitle.getUniqueIDString());
		System.out.println(" Menu ID  = " + jMetadataSubtitle.getMenuID());
		System.out.println(" Menu ID String = " + jMetadataSubtitle.getMenuIDString());
		System.out.println(" Format info = " + jMetadataSubtitle.getFormatInfo());
		try {
			System.out.println(" Format URL = " + jMetadataSubtitle.getFormatURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Format Commercial = " + jMetadataSubtitle.getFormatCommercial());
		System.out.println(" Format Commercial If Any = " + jMetadataSubtitle.getFormatCommercialIfAny());
		System.out.println(" Format Profile = " + jMetadataSubtitle.getFormatProfile());
		System.out.println(" Format Compression = " + jMetadataSubtitle.getFormatCompression());
		System.out.println(" Codec ID = " + jMetadataSubtitle.getCodecID());
		System.out.println(" Duration String = " + jMetadataSubtitle.getDurationString());
		System.out.println(" Duration String Type 1 = " + jMetadataSubtitle.getDurationStringType1());
		System.out.println(" Duration String Type 2 = " + jMetadataSubtitle.getDurationStringType2());
		System.out.println(" Duration String Type 3 = " + jMetadataSubtitle.getDurationStringType3());
		System.out.println(" Internet Media Type = " + jMetadataSubtitle.getInternetMediaType());
		System.out.println(" Muxing mode = " + jMetadataSubtitle.getMuxingMode());
		System.out.println(" Codec ID String = " + jMetadataSubtitle.getCodecIDString());
		System.out.println(" Codec ID Info = " + jMetadataSubtitle.getCodecIDInfo());
		System.out.println(" Codec ID Hint = " + jMetadataSubtitle.getCodecIDHint());
		System.out.println(" Codec ID Description = " + jMetadataSubtitle.getCodecIDDescription());
		try {
			System.out.println(" Codec ID URL = " + jMetadataSubtitle.getCodecIDURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Duration first trame = " + jMetadataSubtitle.getDurationFirstTrame());
		System.out.println(" Duration first trame Type 1 = " + jMetadataSubtitle.getDurationFirstTrameType1());
		System.out.println(" Duration first trame Type 2 = " + jMetadataSubtitle.getDurationFirstTrameType2());
		System.out.println(" Duration first trame Type 3 = " + jMetadataSubtitle.getDurationFirstTrameType3());
		System.out.println(" Bit rate mode = " + jMetadataSubtitle.getBitRateMode());
		System.out.println(" Bit rate mode string = " + jMetadataSubtitle.getBitRateModeString());
		System.out.println(" Bit rate string = " + jMetadataSubtitle.getBitRateString());
		System.out.println(" Bit rate minimum = " + jMetadataSubtitle.getBitRateMinimum());
		System.out.println(" Bit rate minimum string = " + jMetadataSubtitle.getBitRateMinimumString());
		System.out.println(" Bit rate nominal = " + jMetadataSubtitle.getBitRateNominal());
		System.out.println(" Bit rate nominal string = " + jMetadataSubtitle.getBitRateNominalString());
		System.out.println(" Bit rate maximum = " + jMetadataSubtitle.getBitRateMaximum());
		System.out.println(" Bit rate maximum string = " + jMetadataSubtitle.getBitRateMaximumString());
		System.out.println(" Bit rate encoded = " + jMetadataSubtitle.getBitRateEncoded());
		System.out.println(" Frame count = " + jMetadataSubtitle.getFrameCount());
		System.out.println(" Source Frame count = " + jMetadataSubtitle.getSourceFrameCount());
		try {
			System.out.println(" Encoded date = " + jMetadataSubtitle.getEncodedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Tagged date = " + jMetadataSubtitle.getTaggedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Application = " + jMetadataSubtitle.getEncodedApplication());
		try {
			System.out.println(" Encoded Application URL = " + jMetadataSubtitle.getEncodedApplicationURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Library = " + jMetadataSubtitle.getEncodedLibrary());
		System.out.println(" Encoded Library String = " + jMetadataSubtitle.getEncodedLibraryString());
		System.out.println(" Encoded Library name = " + jMetadataSubtitle.getEncodedLibraryName());
		System.out.println(" Encoded Library version = " + jMetadataSubtitle.getEncodedLibraryVersion());
		System.out.println(" Encoded Library release date = " + jMetadataSubtitle.getEncodedLibraryDate());
		System.out.println(" Encoded Library settings = " + jMetadataSubtitle.getEncodedLibrarySettings());
		System.out.println(" Stream size = " + jMetadataSubtitle.getStreamsize());
		System.out.println(" Stream size string = " + jMetadataSubtitle.getStreamsizeString());
		System.out.println(" Stream size string type 1 = " + jMetadataSubtitle.getStreamsizeStringType1());
		System.out.println(" Stream size string type 2 = " + jMetadataSubtitle.getStreamsizeStringType2());
		System.out.println(" Stream size string type 3 = " + jMetadataSubtitle.getStreamsizeStringType3());
		System.out.println(" Stream size string type 4 = " + jMetadataSubtitle.getStreamsizeStringType4());
		System.out.println(" Stream size string type 5 = " + jMetadataSubtitle.getStreamsizeStringType5());
		System.out.println(" Stream size proportion = " + jMetadataSubtitle.getStreamsizeProportion());
		System.out.println(" Language = " + jMetadataSubtitle.getLanguage());
		System.out.println(" Language string = " + jMetadataSubtitle.getLanguageString());
		System.out.println(" Language string 1 = " + jMetadataSubtitle.getLanguageString1());
		System.out.println(" Language string 2 = " + jMetadataSubtitle.getLanguageString2());
		System.out.println(" Language string 3 = " + jMetadataSubtitle.getLanguageString3());
		System.out.println(" Language string 4 = " + jMetadataSubtitle.getLanguageString4());
		System.out.println(" Language more = " + jMetadataSubtitle.getLanguageMore());
		System.out.println(" Is default ? = " + jMetadataSubtitle.isDefault());
		System.out.println(" Default string = " + jMetadataSubtitle.getDefaultString());
		System.out.println(" Is forced ? = " + jMetadataSubtitle.isForced());
		System.out.println(" Forced string = " + jMetadataSubtitle.getForcedString());
		System.out.println(" Alignment = " + jMetadataSubtitle.getAlignment());
		System.out.println(" Alignment string = " + jMetadataSubtitle.getAlignmentString());
		System.out.println(" Title = " + jMetadataSubtitle.getTitle());
		System.out.println(" Bit depth = " + jMetadataSubtitle.getBitDepth());
		System.out.println(" Bit depth string = " + jMetadataSubtitle.getBitDepthString());
		System.out.println(" Compression mode = " + jMetadataSubtitle.getCompressionMode());
		System.out.println(" Compression mode string = " + jMetadataSubtitle.getCompressionModeString());
		System.out.println(" Compression ratio = " + jMetadataSubtitle.getCompressionRatio());
		System.out.println(" Delay = " + jMetadataSubtitle.getDelay());
		System.out.println(" Delay string = " + jMetadataSubtitle.getDelayString());
		System.out.println(" Delay string 1 = " + jMetadataSubtitle.getDelayStringType1());
		System.out.println(" Delay string 2 = " + jMetadataSubtitle.getDelayStringType2());
		System.out.println(" Delay string 3 = " + jMetadataSubtitle.getDelayStringType3());
		System.out.println(" Delay string 4 = " + jMetadataSubtitle.getDelayStringType4());
		System.out.println(" Delay settings = " + jMetadataSubtitle.getDelaySettings());
		System.out.println(" Encryption = " + jMetadataSubtitle.getEncryption());
		System.out.println(" Delay source = " + jMetadataSubtitle.getDelaySource());
		System.out.println(" Delay source string = " + jMetadataSubtitle.getDelaySourceString());
		System.out.println(" Frame rate string = " + jMetadataSubtitle.getFrameRateString());
		System.out.println(" Color space = " + jMetadataSubtitle.getColorSpace());
		System.out.println(" Chroma subsampling = " + jMetadataSubtitle.getChromaSubsampling());
		System.out.println(" Width = " + jMetadataSubtitle.getWidth());
		System.out.println(" Height = " + jMetadataSubtitle.getHeight());
		System.out.println(" Video delay = " + jMetadataSubtitle.getVideoDelay());
		System.out.println(" Video delay string = " + jMetadataSubtitle.getVideoDelayString());
		System.out.println(" Video delay string type 1 = " + jMetadataSubtitle.getVideoDelayStringType1());
		System.out.println(" Video delay string type 2 = " + jMetadataSubtitle.getVideoDelayStringType2());
		System.out.println(" Video delay string type 3 = " + jMetadataSubtitle.getVideoDelayStringType3());
		System.out.println(" Video delay string type 4 = " + jMetadataSubtitle.getVideoDelayStringType4());
	}

	private static void printJMetadataAudios(@NonNull final JMetadataAudio jMetadataAudio) {
		System.out.println("AUDIO #" + jMetadataAudio.getStreamKindID());
		System.out.println("----------");
		System.out.println(" Duration = " + jMetadataAudio.getDuration());
		System.out.println(" Format = " + jMetadataAudio.getFormat());
		System.out.println(" Format Version = " + jMetadataAudio.getFormatVersion());
		System.out.println(" Format Settings = " + jMetadataAudio.getFormatSettings());
		System.out.println(" Bit Rate = " + jMetadataAudio.getBitRate());
		System.out.println(" Frame Rate = " + jMetadataAudio.getFrameRate());
		System.out.println(" StreamKind = " + jMetadataAudio.getStreamKind());
		System.out.println(" StreamKindString = " + jMetadataAudio.getStreamKindString());
		System.out.println(" StreamKindID = " + jMetadataAudio.getStreamKindID());
		System.out.println(" StreamKindPos = " + jMetadataAudio.getStreamKindPosition());
		System.out.println(" StreamKindOrder = " + jMetadataAudio.getStreamKindOrder());
		System.out.println(" ID = " + jMetadataAudio.getID());
		System.out.println(" ID String = " + jMetadataAudio.getIDString());
		System.out.println(" Unique ID = " + jMetadataAudio.getUniqueID());
		System.out.println(" Unique ID String = " + jMetadataAudio.getUniqueIDString());
		System.out.println(" Menu ID  = " + jMetadataAudio.getMenuID());
		System.out.println(" Menu ID String = " + jMetadataAudio.getMenuIDString());
		System.out.println(" Format info = " + jMetadataAudio.getFormatInfo());
		System.out.println(" #Channels = " + jMetadataAudio.getChannels());
		System.out.println(" Sampling rate = " + jMetadataAudio.getSamplingRate());
		try {
			System.out.println(" Format URL = " + jMetadataAudio.getFormatURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Format Commercial = " + jMetadataAudio.getFormatCommercial());
		System.out.println(" Format Commercial If Any = " + jMetadataAudio.getFormatCommercialIfAny());
		System.out.println(" Format Profile = " + jMetadataAudio.getFormatProfile());
		System.out.println(" Format Compression = " + jMetadataAudio.getFormatCompression());
		System.out.println(" Codec ID = " + jMetadataAudio.getCodecID());
		System.out.println(" Duration String = " + jMetadataAudio.getDurationString());
		System.out.println(" Duration String Type 1 = " + jMetadataAudio.getDurationStringType1());
		System.out.println(" Duration String Type 2 = " + jMetadataAudio.getDurationStringType2());
		System.out.println(" Duration String Type 3 = " + jMetadataAudio.getDurationStringType3());
		System.out.println(" Internet Media Type = " + jMetadataAudio.getInternetMediaType());
		System.out.println(" Muxing mode = " + jMetadataAudio.getMuxingMode());
		System.out.println(" Codec ID String = " + jMetadataAudio.getCodecIDString());
		System.out.println(" Codec ID Info = " + jMetadataAudio.getCodecIDInfo());
		System.out.println(" Codec ID Hint = " + jMetadataAudio.getCodecIDHint());
		System.out.println(" Codec ID Description = " + jMetadataAudio.getCodecIDDescription());
		try {
			System.out.println(" Codec ID URL = " + jMetadataAudio.getCodecIDURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Duration first trame = " + jMetadataAudio.getDurationFirstTrame());
		System.out.println(" Duration first trame Type 1 = " + jMetadataAudio.getDurationFirstTrameType1());
		System.out.println(" Duration first trame Type 2 = " + jMetadataAudio.getDurationFirstTrameType2());
		System.out.println(" Duration first trame Type 3 = " + jMetadataAudio.getDurationFirstTrameType3());
		System.out.println(" Bit rate mode = " + jMetadataAudio.getBitRateMode());
		System.out.println(" Bit rate mode string = " + jMetadataAudio.getBitRateModeString());
		System.out.println(" Bit rate string = " + jMetadataAudio.getBitRateString());
		System.out.println(" Bit rate minimum = " + jMetadataAudio.getBitRateMinimum());
		System.out.println(" Bit rate minimum string = " + jMetadataAudio.getBitRateMinimumString());
		System.out.println(" Bit rate nominal = " + jMetadataAudio.getBitRateNominal());
		System.out.println(" Bit rate nominal string = " + jMetadataAudio.getBitRateNominalString());
		System.out.println(" Bit rate maximum = " + jMetadataAudio.getBitRateMaximum());
		System.out.println(" Bit rate maximum string = " + jMetadataAudio.getBitRateMaximumString());
		System.out.println(" Bit rate encoded = " + jMetadataAudio.getBitRateEncoded());
		System.out.println(" Frame count = " + jMetadataAudio.getFrameCount());
		System.out.println(" Source Frame count = " + jMetadataAudio.getSourceFrameCount());
		try {
			System.out.println(" Encoded date = " + jMetadataAudio.getEncodedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Tagged date = " + jMetadataAudio.getTaggedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Application = " + jMetadataAudio.getEncodedApplication());
		try {
			System.out.println(" Encoded Application URL = " + jMetadataAudio.getEncodedApplicationURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Library = " + jMetadataAudio.getEncodedLibrary());
		System.out.println(" Encoded Library String = " + jMetadataAudio.getEncodedLibraryString());
		System.out.println(" Encoded Library name = " + jMetadataAudio.getEncodedLibraryName());
		System.out.println(" Encoded Library version = " + jMetadataAudio.getEncodedLibraryVersion());
		System.out.println(" Encoded Library release date = " + jMetadataAudio.getEncodedLibraryDate());
		System.out.println(" Encoded Library settings = " + jMetadataAudio.getEncodedLibrarySettings());
		System.out.println(" Stream size = " + jMetadataAudio.getStreamsize());
		System.out.println(" Stream size string = " + jMetadataAudio.getStreamsizeString());
		System.out.println(" Stream size string type 1 = " + jMetadataAudio.getStreamsizeStringType1());
		System.out.println(" Stream size string type 2 = " + jMetadataAudio.getStreamsizeStringType2());
		System.out.println(" Stream size string type 3 = " + jMetadataAudio.getStreamsizeStringType3());
		System.out.println(" Stream size string type 4 = " + jMetadataAudio.getStreamsizeStringType4());
		System.out.println(" Stream size string type 5 = " + jMetadataAudio.getStreamsizeStringType5());
		System.out.println(" Stream size proportion = " + jMetadataAudio.getStreamsizeProportion());
		System.out.println(" Language = " + jMetadataAudio.getLanguage());
		System.out.println(" Language string = " + jMetadataAudio.getLanguageString());
		System.out.println(" Language string 1 = " + jMetadataAudio.getLanguageString1());
		System.out.println(" Language string 2 = " + jMetadataAudio.getLanguageString2());
		System.out.println(" Language string 3 = " + jMetadataAudio.getLanguageString3());
		System.out.println(" Language string 4 = " + jMetadataAudio.getLanguageString4());
		System.out.println(" Language more = " + jMetadataAudio.getLanguageMore());
		System.out.println(" Is default ? = " + jMetadataAudio.isDefault());
		System.out.println(" Default string = " + jMetadataAudio.getDefaultString());
		System.out.println(" Is forced ? = " + jMetadataAudio.isForced());
		System.out.println(" Forced string = " + jMetadataAudio.getForcedString());
		System.out.println(" Alignment = " + jMetadataAudio.getAlignment());
		System.out.println(" Alignment string = " + jMetadataAudio.getAlignmentString());
		System.out.println(" Title = " + jMetadataAudio.getTitle());
		System.out.println(" Bit depth = " + jMetadataAudio.getBitDepth());
		System.out.println(" Bit depth string = " + jMetadataAudio.getBitDepthString());
		System.out.println(" Compression mode = " + jMetadataAudio.getCompressionMode());
		System.out.println(" Compression mode string = " + jMetadataAudio.getCompressionModeString());
		System.out.println(" Compression ratio = " + jMetadataAudio.getCompressionRatio());
		System.out.println(" Delay = " + jMetadataAudio.getDelay());
		System.out.println(" Delay string = " + jMetadataAudio.getDelayString());
		System.out.println(" Delay string 1 = " + jMetadataAudio.getDelayStringType1());
		System.out.println(" Delay string 2 = " + jMetadataAudio.getDelayStringType2());
		System.out.println(" Delay string 3 = " + jMetadataAudio.getDelayStringType3());
		System.out.println(" Delay string 4 = " + jMetadataAudio.getDelayStringType4());
		System.out.println(" Delay settings = " + jMetadataAudio.getDelaySettings());
		System.out.println(" Encryption = " + jMetadataAudio.getEncryption());
		System.out.println(" Delay source = " + jMetadataAudio.getDelaySource());
		System.out.println(" Delay source string = " + jMetadataAudio.getDelaySourceString());
		System.out.println(" Status = " + jMetadataAudio.getStatus());
		System.out.println(" Channel(s) string = " + jMetadataAudio.getChannelsString());
		System.out.println(" Channel position = " + jMetadataAudio.getChannelPosition());
		System.out.println(" Channel position string = " + jMetadataAudio.getChannelPositionString());
		System.out.println(" Channel layout = " + jMetadataAudio.getChannelLayout());
		System.out.println(" Sampling rate string = " + jMetadataAudio.getSamplingRateString());
		System.out.println(" Frame rate string = " + jMetadataAudio.getFrameRateString());
		System.out.println(" Video delay = " + jMetadataAudio.getVideoDelay());
		System.out.println(" Video delay string = " + jMetadataAudio.getVideoDelayString());
		System.out.println(" Video delay string type 1 = " + jMetadataAudio.getVideoDelayStringType1());
		System.out.println(" Video delay string type 2 = " + jMetadataAudio.getVideoDelayStringType2());
		System.out.println(" Video delay string type 3 = " + jMetadataAudio.getVideoDelayStringType3());
		System.out.println(" Video delay string type 4 = " + jMetadataAudio.getVideoDelayStringType4());
		System.out.println(" Replaygain gain = " + jMetadataAudio.getReplayGain());
		System.out.println(" Replaygain gain string = " + jMetadataAudio.getReplayGainString());
		System.out.println(" Replaygain peak = " + jMetadataAudio.getReplayGainPeak());
		System.out.println(" Interleave Duration = " + jMetadataAudio.getInterleaveDuration());
		System.out.println(" Interleave Duration string = " + jMetadataAudio.getInterleaveDurationString());
		System.out.println(" Interleave Preload = " + jMetadataAudio.getInterleavePreload());
		System.out.println(" Interleave Preload string = " + jMetadataAudio.getInterleavePreloadString());
		System.out.println(" Interleave Video Frames = " + jMetadataAudio.getInterleaveVideoFrames());
	}

	private static void printJMetadataVideos(@NonNull final JMetadataVideo jMetadataVideo) {
		System.out.println("VIDEO #" + jMetadataVideo.getStreamKindID());
		System.out.println("----------");
		System.out.println(" Display Aspect Ratio = " + jMetadataVideo.getDisplayAspectRatio());
		System.out.println(" Duration = " + jMetadataVideo.getDuration());
		System.out.println(" Format = " + jMetadataVideo.getFormat());
		System.out.println(" Format Version = " + jMetadataVideo.getFormatVersion());
		System.out.println(" Format Settings = " + jMetadataVideo.getFormatSettings());
		System.out.println(" Bit Rate = " + jMetadataVideo.getBitRate());
		System.out.println(" Width = " + jMetadataVideo.getWidth());
		System.out.println(" Height = " + jMetadataVideo.getHeight());
		System.out.println(" Frame Rate = " + jMetadataVideo.getFrameRate());
		System.out.println(" StreamKind = " + jMetadataVideo.getStreamKind());
		System.out.println(" StreamKindString = " + jMetadataVideo.getStreamKindString());
		System.out.println(" StreamKindID = " + jMetadataVideo.getStreamKindID());
		System.out.println(" StreamKindPos = " + jMetadataVideo.getStreamKindPosition());
		System.out.println(" StreamKindOrder = " + jMetadataVideo.getStreamKindOrder());
		System.out.println(" ID = " + jMetadataVideo.getID());
		System.out.println(" ID String = " + jMetadataVideo.getIDString());
		System.out.println(" Unique ID = " + jMetadataVideo.getUniqueID());
		System.out.println(" Unique ID String = " + jMetadataVideo.getUniqueIDString());
		System.out.println(" Menu ID  = " + jMetadataVideo.getMenuID());
		System.out.println(" Menu ID String = " + jMetadataVideo.getMenuIDString());
		System.out.println(" Format info = " + jMetadataVideo.getFormatInfo());
		try {
			System.out.println(" Format URL = " + jMetadataVideo.getFormatURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Format Commercial = " + jMetadataVideo.getFormatCommercial());
		System.out.println(" Format Commercial If Any = " + jMetadataVideo.getFormatCommercialIfAny());
		System.out.println(" Format Profile = " + jMetadataVideo.getFormatProfile());
		System.out.println(" Format Compression = " + jMetadataVideo.getFormatCompression());
		System.out.println(" Codec ID = " + jMetadataVideo.getCodecID());
		System.out.println(" Duration String = " + jMetadataVideo.getDurationString());
		System.out.println(" Duration String Type 1 = " + jMetadataVideo.getDurationStringType1());
		System.out.println(" Duration String Type 2 = " + jMetadataVideo.getDurationStringType2());
		System.out.println(" Duration String Type 3 = " + jMetadataVideo.getDurationStringType3());
		System.out.println(" Duration String Type 4 = " + jMetadataVideo.getDurationStringType4());
		System.out.println(" Multiview base profile = " + jMetadataVideo.getMultiviewBaseProfile());
		System.out.println(" Multiview count = " + jMetadataVideo.getMultiviewCount());
		System.out.println(" Multiview layout = " + jMetadataVideo.getMultiviewLayout());
		System.out.println(" Multiview layout = " + jMetadataVideo.getMultiviewLayout());
		System.out.println(" Internet Media Type = " + jMetadataVideo.getInternetMediaType());
		System.out.println(" Muxing mode = " + jMetadataVideo.getMuxingMode());
		System.out.println(" Codec ID String = " + jMetadataVideo.getCodecIDString());
		System.out.println(" Codec ID Info = " + jMetadataVideo.getCodecIDInfo());
		System.out.println(" Codec ID Hint = " + jMetadataVideo.getCodecIDHint());
		System.out.println(" Codec ID Description = " + jMetadataVideo.getCodecIDDescription());
		try {
			System.out.println(" Codec ID URL = " + jMetadataVideo.getCodecIDURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Duration first trame = " + jMetadataVideo.getDurationFirstTrame());
		System.out.println(" Duration first trame Type 1 = " + jMetadataVideo.getDurationFirstTrameType1());
		System.out.println(" Duration first trame Type 2 = " + jMetadataVideo.getDurationFirstTrameType2());
		System.out.println(" Duration first trame Type 3 = " + jMetadataVideo.getDurationFirstTrameType3());
		System.out.println(" Bit rate mode = " + jMetadataVideo.getBitRateMode());
		System.out.println(" Bit rate mode string = " + jMetadataVideo.getBitRateModeString());
		System.out.println(" Bit rate string = " + jMetadataVideo.getBitRateString());
		System.out.println(" Bit rate minimum = " + jMetadataVideo.getBitRateMinimum());
		System.out.println(" Bit rate minimum string = " + jMetadataVideo.getBitRateMinimumString());
		System.out.println(" Bit rate nominal = " + jMetadataVideo.getBitRateNominal());
		System.out.println(" Bit rate nominal string = " + jMetadataVideo.getBitRateNominalString());
		System.out.println(" Bit rate maximum = " + jMetadataVideo.getBitRateMaximum());
		System.out.println(" Bit rate maximum string = " + jMetadataVideo.getBitRateMaximumString());
		System.out.println(" Bit rate encoded = " + jMetadataVideo.getBitRateEncoded());
		System.out.println(" Width original = " + jMetadataVideo.getWidthOriginal());
		System.out.println(" Width original string = " + jMetadataVideo.getWidthOriginalString());
		System.out.println(" Height string = " + jMetadataVideo.getHeightString());
		System.out.println(" Height offset = " + jMetadataVideo.getHeightOffset());
		System.out.println(" Height offset string = " + jMetadataVideo.getHeightOffsetString());
		System.out.println(" Height original = " + jMetadataVideo.getHeightOriginal());
		System.out.println(" Height original string = " + jMetadataVideo.getHeightOriginalString());
		System.out.println(" Pixel aspect ratio = " + jMetadataVideo.getPixelAspectRatio());
		System.out.println(" Pixel aspect ratio string = " + jMetadataVideo.getPixelAspectRatioString());
		System.out.println(" Pixel aspect ratio original = " + jMetadataVideo.getPixelAspectRatioOriginal());
		System.out.println(" Pixel aspect ratio original string = "
		        + jMetadataVideo.getPixelAspectRatioOriginalString());
		System.out.println(" Display aspect ratio = " + jMetadataVideo.getDisplayAspectRatioString());
		System.out.println(" Display aspect ratio original = " + jMetadataVideo.getDisplayAspectRatioOriginal());
		System.out.println(" Display aspect ratio original string = "
		        + jMetadataVideo.getDisplayAspectRatioOriginalString());
		System.out.println(" Active format description = " + jMetadataVideo.getActiveFormatDescription());
		System.out.println(" Active format description string = " + jMetadataVideo.getActiveFormatDescriptionString());
		System.out.println(" Rotation = " + jMetadataVideo.getRotation());
		System.out.println(" Rotation string = " + jMetadataVideo.getRotationString());
		System.out.println(" Frame rate mode = " + jMetadataVideo.getFrameRateMode());
		System.out.println(" Frame rate mode string = " + jMetadataVideo.getFrameRateModeString());
		System.out.println(" Frame rate mode original = " + jMetadataVideo.getFrameRateModeOriginal());
		System.out.println(" Frame rate mode original string = " + jMetadataVideo.getFrameRateModeOriginalString());
		System.out.println(" Frame rate string = " + jMetadataVideo.getFrameRateString());
		System.out.println(" Frame rate original = " + jMetadataVideo.getFrameRateOriginal());
		System.out.println(" Frame rate original string = " + jMetadataVideo.getFrameRateOriginalString());
		System.out.println(" Frame rate minimum = " + jMetadataVideo.getFrameRateMinimum());
		System.out.println(" Frame rate minimum string = " + jMetadataVideo.getFrameRateMinimumString());
		System.out.println(" Frame rate nominal = " + jMetadataVideo.getFrameRateNominal());
		System.out.println(" Frame rate nominal string = " + jMetadataVideo.getFrameRateNominalString());
		System.out.println(" Frame rate maximum = " + jMetadataVideo.getFrameRateMaximum());
		System.out.println(" Frame rate maximum string = " + jMetadataVideo.getFrameRateMaximumString());
		System.out.println(" Frame count = " + jMetadataVideo.getFrameCount());
		System.out.println(" Source Frame count = " + jMetadataVideo.getSourceFrameCount());
		System.out.println(" Standard = " + jMetadataVideo.getStandard());
		try {
			System.out.println(" Encoded date = " + jMetadataVideo.getEncodedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Tagged date = " + jMetadataVideo.getTaggedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Application = " + jMetadataVideo.getEncodedApplication());
		try {
			System.out.println(" Encoded Application URL = " + jMetadataVideo.getEncodedApplicationURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Library = " + jMetadataVideo.getEncodedLibrary());
		System.out.println(" Encoded Library String = " + jMetadataVideo.getEncodedLibraryString());
		System.out.println(" Encoded Library name = " + jMetadataVideo.getEncodedLibraryName());
		System.out.println(" Encoded Library version = " + jMetadataVideo.getEncodedLibraryVersion());
		System.out.println(" Encoded Library release date = " + jMetadataVideo.getEncodedLibraryDate());
		System.out.println(" Encoded Library settings = " + jMetadataVideo.getEncodedLibrarySettings());
		System.out.println(" Stream size = " + jMetadataVideo.getStreamsize());
		System.out.println(" Stream size string = " + jMetadataVideo.getStreamsizeString());
		System.out.println(" Stream size string type 1 = " + jMetadataVideo.getStreamsizeStringType1());
		System.out.println(" Stream size string type 2 = " + jMetadataVideo.getStreamsizeStringType2());
		System.out.println(" Stream size string type 3 = " + jMetadataVideo.getStreamsizeStringType3());
		System.out.println(" Stream size string type 4 = " + jMetadataVideo.getStreamsizeStringType4());
		System.out.println(" Stream size string type 5 = " + jMetadataVideo.getStreamsizeStringType5());
		System.out.println(" Stream size proportion = " + jMetadataVideo.getStreamsizeProportion());
		System.out.println(" Language = " + jMetadataVideo.getLanguage());
		System.out.println(" Language string = " + jMetadataVideo.getLanguageString());
		System.out.println(" Language string 1 = " + jMetadataVideo.getLanguageString1());
		System.out.println(" Language string 2 = " + jMetadataVideo.getLanguageString2());
		System.out.println(" Language string 3 = " + jMetadataVideo.getLanguageString3());
		System.out.println(" Language string 4 = " + jMetadataVideo.getLanguageString4());
		System.out.println(" Language more = " + jMetadataVideo.getLanguageMore());
		System.out.println(" Is default ? = " + jMetadataVideo.isDefault());
		System.out.println(" Default string = " + jMetadataVideo.getDefaultString());
		System.out.println(" Is forced ? = " + jMetadataVideo.isForced());
		System.out.println(" Forced string = " + jMetadataVideo.getForcedString());
		System.out.println(" Alignment = " + jMetadataVideo.getAlignment());
		System.out.println(" Alignment string = " + jMetadataVideo.getAlignmentString());
		System.out.println(" Title = " + jMetadataVideo.getTitle());
		System.out.println(" Color space = " + jMetadataVideo.getColorSpace());
		System.out.println(" Chroma subsampling = " + jMetadataVideo.getChromaSubsampling());
		System.out.println(" Bit depth = " + jMetadataVideo.getBitDepth());
		System.out.println(" Bit depth string = " + jMetadataVideo.getBitDepthString());
		System.out.println(" Scan type = " + jMetadataVideo.getScanType());
		System.out.println(" Scan type string = " + jMetadataVideo.getScanTypeString());
		System.out.println(" Scan order = " + jMetadataVideo.getScanOrder());
		System.out.println(" Scan order string = " + jMetadataVideo.getScanOrderString());
		System.out.println(" Compression mode = " + jMetadataVideo.getCompressionMode());
		System.out.println(" Compression mode string = " + jMetadataVideo.getCompressionModeString());
		System.out.println(" Compression ratio = " + jMetadataVideo.getCompressionRatio());
		System.out.println(" bits/(Pixel*Frame) (like Gordian Knot) = " + jMetadataVideo.getBitsDividedPixelsFrame());
		System.out.println(" Delay = " + jMetadataVideo.getDelay());
		System.out.println(" Delay string = " + jMetadataVideo.getDelayString());
		System.out.println(" Delay string 1 = " + jMetadataVideo.getDelayStringType1());
		System.out.println(" Delay string 2 = " + jMetadataVideo.getDelayStringType2());
		System.out.println(" Delay string 3 = " + jMetadataVideo.getDelayStringType3());
		System.out.println(" Delay string 4 = " + jMetadataVideo.getDelayStringType4());
		System.out.println(" Delay settings = " + jMetadataVideo.getDelaySettings());
		System.out.println(" Encryption = " + jMetadataVideo.getEncryption());
		System.out.println(" Buffer size = " + jMetadataVideo.getBufferSize());
		System.out.println(" Delay source = " + jMetadataVideo.getDelaySource());
		System.out.println(" Delay source string = " + jMetadataVideo.getDelaySourceString());
	}

	private static void printJMetaDataInfos(@NonNull final JMetadataGeneral jMetadataGeneral) {
		System.out.println("GENERAL");
		System.out.println("--------------------");
		System.out.println(" # Video = " + jMetadataGeneral.getNumVideoStreams());
		System.out.println(" # Audio = " + jMetadataGeneral.getNumAudioStreams());
		System.out.println(" # Subtitle = " + jMetadataGeneral.getNumSubtitleStreams());
		System.out.println(" Duration = " + jMetadataGeneral.getDuration());
		System.out.println(" Format = " + jMetadataGeneral.getFormat());
		System.out.println(" Format Version = " + jMetadataGeneral.getFormatVersion());
		System.out.println(" File Size = " + jMetadataGeneral.getFileSize());
		System.out.println(" OverallBitRate = " + jMetadataGeneral.getOverallBitRate());
		System.out.println(" StreamCount = " + jMetadataGeneral.getStreamCount());
		System.out.println(" StreamKind = " + jMetadataGeneral.getStreamKind());
		System.out.println(" StreamKindString = " + jMetadataGeneral.getStreamKindString());
		System.out.println(" StreamKindID = " + jMetadataGeneral.getStreamKindID());
		System.out.println(" StreamKindPos = " + jMetadataGeneral.getStreamKindPosition());
		System.out.println(" StreamKindOrder = " + jMetadataGeneral.getStreamKindOrder());
		System.out.println(" ID = " + jMetadataGeneral.getID());
		System.out.println(" ID String = " + jMetadataGeneral.getIDString());
		System.out.println(" Unique ID = " + jMetadataGeneral.getUniqueID());
		System.out.println(" Unique ID String = " + jMetadataGeneral.getUniqueIDString());
		System.out.println(" Menu ID  = " + jMetadataGeneral.getMenuID());
		System.out.println(" Menu ID String = " + jMetadataGeneral.getMenuIDString());
		System.out.println(" General count = " + jMetadataGeneral.getGeneralCount());
		System.out.println(" Video count = " + jMetadataGeneral.getVideoCount());
		System.out.println(" Audio count = " + jMetadataGeneral.getAudioCount());
		System.out.println(" Text count = " + jMetadataGeneral.getTextCount());
		System.out.println(" Chapters count = " + jMetadataGeneral.getChaptersCount());
		System.out.println(" Image count = " + jMetadataGeneral.getImageCount());
		System.out.println(" Menu count = " + jMetadataGeneral.getMenuCount());
		System.out.println(" Video format list = ");
		final List<String> videoFormatList = jMetadataGeneral.getVideoFormatList();
		for (final String item : videoFormatList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Video format with hint list = ");
		final List<String> videoFormatWithHintList = jMetadataGeneral.getVideoFormatWithHintList();
		for (final String item : videoFormatWithHintList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Video language list = ");
		final List<String> videoLanguageList = jMetadataGeneral.getVideoLanguageList();
		for (final String item : videoLanguageList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Audio format list = ");
		final List<String> audioFormatList = jMetadataGeneral.getAudioFormatList();
		for (final String item : audioFormatList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Audio format with hint list = ");
		final List<String> audioFormatWithHintList = jMetadataGeneral.getAudioFormatWithHintList();
		for (final String item : audioFormatWithHintList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Audio language list = ");
		final List<String> audioLanguageList = jMetadataGeneral.getAudioLanguageList();
		for (final String item : audioLanguageList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Text format list = ");
		final List<String> textFormatList = jMetadataGeneral.getTextFormatList();
		for (final String item : textFormatList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Text format with hint list = ");
		final List<String> textFormatWithHintList = jMetadataGeneral.getTextFormatWithHintList();
		for (final String item : textFormatWithHintList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Text language list = ");
		final List<String> textLanguageList = jMetadataGeneral.getTextLanguageList();
		for (final String item : textLanguageList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Chapters format list = ");
		final List<String> chaptersFormatList = jMetadataGeneral.getChaptersFormatList();
		for (final String item : chaptersFormatList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Chapters format with hint list = ");
		final List<String> chaptersFormatWithHintList = jMetadataGeneral.getChaptersFormatWithHintList();
		for (final String item : chaptersFormatWithHintList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Chapters language list = ");
		final List<String> chaptersLanguageList = jMetadataGeneral.getChaptersLanguageList();
		for (final String item : chaptersLanguageList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Image format list = ");
		final List<String> imageFormatList = jMetadataGeneral.getImageFormatList();
		for (final String item : imageFormatList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Image format with hint list = ");
		final List<String> imageFormatWithHintList = jMetadataGeneral.getImageFormatWithHintList();
		for (final String item : imageFormatWithHintList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Image language list = ");
		final List<String> imageLanguageList = jMetadataGeneral.getImageLanguageList();
		for (final String item : imageLanguageList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Menu format list = ");
		final List<String> menuFormatList = jMetadataGeneral.getMenuFormatList();
		for (final String item : menuFormatList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Menu format with hint list = ");
		final List<String> menuFormatWithHintList = jMetadataGeneral.getMenuFormatWithHintList();
		for (final String item : menuFormatWithHintList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Menu language list = ");
		final List<String> menuLanguageList = jMetadataGeneral.getMenuLanguageList();
		for (final String item : menuLanguageList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Complete Name = " + jMetadataGeneral.getCompleteName());
		System.out.println(" Folder Name = " + jMetadataGeneral.getFolderName());
		System.out.println(" File Name = " + jMetadataGeneral.getFileName());
		System.out.println(" File Extension = " + jMetadataGeneral.getFileExtension());
		System.out.println(" Format info = " + jMetadataGeneral.getFormatInfo());
		try {
			System.out.println(" Format URL = " + jMetadataGeneral.getFormatURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Format extensions = ");
		final List<String> formatExtensionList = jMetadataGeneral.getFormatExtensionsList();
		for (final String item : formatExtensionList) {
			System.out.println("  * " + item);
		}
		System.out.println(" Format Commercial = " + jMetadataGeneral.getFormatCommercial());
		System.out.println(" Format Commercial If Any = " + jMetadataGeneral.getFormatCommercialIfAny());
		System.out.println(" Format Profile = " + jMetadataGeneral.getFormatProfile());
		System.out.println(" Format Compression = " + jMetadataGeneral.getFormatCompression());
		System.out.println(" Format Settings = " + jMetadataGeneral.getFormatSettings());
		System.out.println(" Internet Media Type = " + jMetadataGeneral.getInternetMediaType());
		System.out.println(" Codec ID = " + jMetadataGeneral.getCodecID());
		System.out.println(" Codec ID String = " + jMetadataGeneral.getCodecIDString());
		System.out.println(" Codec ID Info = " + jMetadataGeneral.getCodecIDInfo());
		System.out.println(" Codec ID Hint = " + jMetadataGeneral.getCodecIDHint());
		System.out.println(" Codec ID Description = " + jMetadataGeneral.getCodecIDDescription());
		try {
			System.out.println(" Codec ID URL = " + jMetadataGeneral.getCodecIDURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Is Interleaved = " + jMetadataGeneral.isInterleaved());
		System.out.println(" File size string = " + jMetadataGeneral.getFilesizeString());
		System.out.println(" File size string 1 = " + jMetadataGeneral.getFilesizeString1Digits());
		System.out.println(" File size string 2 = " + jMetadataGeneral.getFilesizeString2Digits());
		System.out.println(" File size string 3 = " + jMetadataGeneral.getFilesizeString3Digits());
		System.out.println(" File size string 4 = " + jMetadataGeneral.getFilesizeString4Digits());
		System.out.println(" Duration String = " + jMetadataGeneral.getDurationString());
		System.out.println(" Duration String Type 1 = " + jMetadataGeneral.getDurationStringType1());
		System.out.println(" Duration String Type 2 = " + jMetadataGeneral.getDurationStringType2());
		System.out.println(" Duration String Type 3 = " + jMetadataGeneral.getDurationStringType3());
		System.out.println(" Duration Start = " + jMetadataGeneral.getDurationStart());
		System.out.println(" Duration End = " + jMetadataGeneral.getDurationEnd());
		System.out.println(" Overall bit rate mode = " + jMetadataGeneral.getOverallBitRateMode());
		System.out.println(" Overall bit rate mode string = " + jMetadataGeneral.getOverallBitRateModeString());
		System.out.println(" Overall bit rate minimum = " + jMetadataGeneral.getOverallBitRateMinimum());
		System.out.println(" Overall bit rate minimum string = " + jMetadataGeneral.getOverallBitRateMinimumString());
		System.out.println(" Overall bit rate maximum = " + jMetadataGeneral.getOverallBitRateMaximum());
		System.out.println(" Overall bit rate maximum string = " + jMetadataGeneral.getOverallBitRateMaximumString());
		System.out.println(" Overall bit rate nominal = " + jMetadataGeneral.getOverallBitRateNominal());
		System.out.println(" Overall bit rate nominal string = " + jMetadataGeneral.getOverallBitRateNominalString());
		System.out.println(" Stream size = " + jMetadataGeneral.getStreamsize());
		System.out.println(" Stream size string = " + jMetadataGeneral.getStreamsizeString());
		System.out.println(" Stream size string type 1 = " + jMetadataGeneral.getStreamsizeStringType1());
		System.out.println(" Stream size string type 2 = " + jMetadataGeneral.getStreamsizeStringType2());
		System.out.println(" Stream size string type 3 = " + jMetadataGeneral.getStreamsizeStringType3());
		System.out.println(" Stream size string type 4 = " + jMetadataGeneral.getStreamsizeStringType4());
		System.out.println(" Stream size string type 5 = " + jMetadataGeneral.getStreamsizeStringType5());
		System.out.println(" Stream size proportion = " + jMetadataGeneral.getStreamsizeProportion());
		System.out.println(" Is streamable ? = " + jMetadataGeneral.isStreamable());
		try {
			System.out.println(" Recorded date = " + jMetadataGeneral.getRecordedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Encoded date = " + jMetadataGeneral.getEncodedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Tagged date = " + jMetadataGeneral.getTaggedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" Written date = " + jMetadataGeneral.getWrittenDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" File created date = " + jMetadataGeneral.getFileCreatedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		try {
			System.out.println(" File modified date = " + jMetadataGeneral.getFileModifiedDate());
		} catch (final ParseException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Application = " + jMetadataGeneral.getEncodedApplication());
		try {
			System.out.println(" Encoded Application URL = " + jMetadataGeneral.getEncodedApplicationURL());
		} catch (final MalformedURLException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		System.out.println(" Encoded Library = " + jMetadataGeneral.getEncodedLibrary());
		System.out.println(" Encoded Library String = " + jMetadataGeneral.getEncodedLibraryString());
		System.out.println(" Encoded Library name = " + jMetadataGeneral.getEncodedLibraryName());
		System.out.println(" Encoded Library version = " + jMetadataGeneral.getEncodedLibraryVersion());
		System.out.println(" Encoded Library release date = " + jMetadataGeneral.getEncodedLibraryDate());
		System.out.println(" Encoded Library settings = " + jMetadataGeneral.getEncodedLibrarySettings());
		System.out.println("_________________________________________________________________________________________");
	}

	private static File[] getFiles(@NonNull final File directory) {
		// It is also possible to filter the list of returned files.
		// This example does not return any files that start with `.'.
		FilenameFilter filter = (final File dir, final String name) -> !name.startsWith(".");
		final File[] children = directory.listFiles(filter);

		return children;
	}
}
