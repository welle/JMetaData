package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * MediaInfo parameters.
 *
 *
 * @author Charlotte
 */
public final class Commons {
    /**
     * Format used.
     */
    @Nonnull
    public static final String FORMAT = "Format";
    /**
     * Version of this format.
     */
    @Nonnull
    public static final String FORMAT_VERSION = "Format_Version";
    /**
     * File size in bytes.
     */
    @Nonnull
    public static final String FILESIZE = "FileSize";
    /**
     * Play time of the stream in ms.
     */
    @Nonnull
    public static final String DURATION = "Duration";
    /**
     * Bit rate of all streams in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE = "OverallBitRate";
    /**
     * Number of streams of this kind available.
     */
    @Nonnull
    public static final String STREAMCOUNT = "StreamCount";
    /**
     * Stream type name.
     */
    @Nonnull
    public static final String STREAMKIND = "StreamKind";
    /**
     * Stream type name.
     */
    @Nonnull
    public static final String STREAM_KIND_STRING = "StreamKind/String";
    /**
     * Number of the stream (base=0).
     */
    @Nonnull
    public static final String STREAM_KIND_ID = "StreamKindID";
    /**
     * When multiple streams, number of the stream (base=1).
     */
    @Nonnull
    public static final String STREAM_KIND_POS = "StreamKindPos";
    /**
     * Stream order in the file, whatever is the kind of stream (base=0).
     */
    @Nonnull
    public static final String STREAMORDER = "StreamOrder";
    /**
     * The ID for this stream in this file.
     */
    @Nonnull
    public static final String ID = "ID";
    /**
     * The ID for this stream in this file.
     */
    @Nonnull
    public static final String ID_STRING = "ID/String";
    /**
     * The unique ID for this stream, should be copied with stream copy.
     */
    @Nonnull
    public static final String UNIQUE_ID = "UniqueID";
    /**
     * The unique ID for this stream, should be copied with stream copy.
     */
    @Nonnull
    public static final String UNIQUE_ID_STRING = "UniqueID/String";
    /**
     * The menu ID for this stream in this file.
     */
    @Nonnull
    public static final String MENUID = "MenuID";
    /**
     * The menu ID for this stream in this file.
     */
    @Nonnull
    public static final String MENUID_STRING = "MenuID/String";
    /**
     * Number of general streams.
     */
    @Nonnull
    public static final String GENERALCOUNT = "GeneralCount";
    /**
     * Number of video streams.
     */
    @Nonnull
    public static final String VIDEOCOUNT = "VideoCount";
    /**
     * Number of audio streams.
     */
    @Nonnull
    public static final String AUDIOCOUNT = "AudioCount";
    /**
     * Number of text streams.
     */
    @Nonnull
    public static final String TEXTCOUNT = "TextCount";
    /**
     * Number of chapters streams.
     */
    @Nonnull
    public static final String CHAPTERSCOUNT = "ChaptersCount";
    /**
     * Number of image streams.
     */
    @Nonnull
    public static final String IMAGECOUNT = "ImageCount";
    /**
     * Number of menu streams.
     */
    @Nonnull
    public static final String MENUCOUNT = "MenuCount";
    /**
     * Video Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String VIDEO_FORMAT_LIST = "Video_Format_List";
    /**
     * Video Codecs in this file with popular name (hint), separated by /.
     */
    @Nonnull
    public static final String VIDEO_FORMAT_WITH_HINT_LIST = "Video_Format_WithHint_Lis";
    /**
     * Video languages in this file, full names, separated by /.
     */
    @Nonnull
    public static final String VIDEO_LANGUAGE_LIST = "Video_Language_List";
    /**
     * Audio Codecs in this file,separated by /.
     */
    @Nonnull
    public static final String AUDIO_FORMAT_LIST = "Audio_Format_List";
    /**
     * Audio Codecs in this file with popular name (hint), separated by /.
     */
    @Nonnull
    public static final String AUDIO_FORMAT_WITH_HINT_LIST = "Audio_Format_WithHint_Lis";
    /**
     * Audio languages in this file separated by /.
     */
    @Nonnull
    public static final String AUDIO_LANGUAGE_LIST = "Audio_Language_List";
    /**
     * Text Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String TEXT_FORMAT_LIST = "Text_Format_List";
    /**
     * Text Codecs in this file with popular name (hint),separated by /.
     */
    @Nonnull
    public static final String TEXT_FORMAT_WITH_HINT_LIST = "Text_Format_WithHint_List";
    /**
     * Text languages in this file, separated by /.
     */
    @Nonnull
    public static final String TEXT_LANGUAGE_LIST = "Text_Language_List";
    /**
     * Chapters Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String CHAPTERS_FORMAT_LIST = "Chapters_Format_List";
    /**
     * Chapters Codecs in this file with popular name (hint),separated by /.
     */
    @Nonnull
    public static final String CHAPTERS_FORMAT_WITH_HINT_LIST = "Chapters_Format_WithHint_";
    /**
     * Chapters languages in this file, separated by /.
     */
    @Nonnull
    public static final String CHAPTERS_LANGUAGE_LIST = "Chapters_Language_List";
    /**
     * Image Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String IMAGE_FORMAT_LIST = "Image_Format_List";
    /**
     * Image Codecs in this file with popular name (hint),separated by /.
     */
    @Nonnull
    public static final String IMAGE_FORMAT_WITH_HINT_LIST = "Image_Format_WithHint_Lis";
    /**
     * Image languages in this file, separated by /.
     */
    @Nonnull
    public static final String IMAGE_LANGUAGE_LIST = "Image_Language_List";
    /**
     * Menu Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String MENU_FORMAT_LIST = "Menu_Format_List";
    /**
     * Menu Codecs in this file with popular name (hint),separated by /.
     */
    @Nonnull
    public static final String MENU_FORMAT_WITH_HINT_LIST = "Menu_Format_WithHint_List";
    /**
     * Menu languages in this file, separated by /.
     */
    @Nonnull
    public static final String MENU_LANGUAGE_LIST = "Menu_Language_List";
    /**
     * Complete name (Folder+Name+Extension).
     */
    @Nonnull
    public static final String COMPLETE_NAME = "CompleteName";
    /**
     * Folder name only.
     */
    @Nonnull
    public static final String FOLDER_NAME = "FolderName";
    /**
     * File name only.
     */
    @Nonnull
    public static final String FILE_NAME = "FileName";
    /**
     * File extension only.
     */
    @Nonnull
    public static final String FILE_EXTENSION = "FileExtension";
    /**
     * Info about this Format.
     */
    @Nonnull
    public static final String FORMAT_INFO = "Format/Info";
    /**
     * Link to a description of this format.
     */
    @Nonnull
    public static final String FORMAT_URL = "Format/Url";
    /**
     * Known extensions of this format.
     */
    @Nonnull
    public static final String FORMAT_EXTENSIONS = "Format/Extensions";
    /**
     * Commercial name used by vendor for theses settings or Format field if there is no difference.
     */
    @Nonnull
    public static final String FORMAT_COMMERCIAL = "Format_Commercial";
    /**
     * Commercial name used by vendor for theses settings if there is one.
     */
    @Nonnull
    public static final String FORMAT_COMMERCIAL_IF_ANY = "Format_Commercial_IfAny";
    /**
     * Profile of the Format.
     */
    @Nonnull
    public static final String FORMAT_PROFILE = "Format_Profile";
    /**
     * Compression method used.
     */
    @Nonnull
    public static final String FORMAT_COMPRESSION = "Format_Compression";
    /**
     * Settings needed for decoder used.
     */
    @Nonnull
    public static final String FORMAT_SETTINGS = "Format_Settings";
    /**
     * Internet Media Type (aka MIME Type, Content-Type).
     */
    @Nonnull
    public static final String INTERNET_MEDIA_TYPE = "InternetMediaType";
    /**
     * Codec ID (final found in some containers).
     */
    @Nonnull
    public static final String CODEC_ID = "CodecID";
    /**
     * Codec ID (final found in some containers).
     */
    @Nonnull
    public static final String CODEC_ID_STRING = "CodecID/String";
    /**
     * Info about this codec.
     */
    @Nonnull
    public static final String CODEC_ID_INFO = "CodecID/Info";
    /**
     * A hint/popular name for this codec.
     */
    @Nonnull
    public static final String CODEC_ID_HINT = "CodecID/Hint";
    /**
     * A link to more details about this codec ID.
     */
    @Nonnull
    public static final String CODEC_ID_URL = "CodecID/Url";
    /**
     * Manual description given by the container.
     */
    @Nonnull
    public static final String CODEC_ID_DESCRIPTION = "CodecID_Description";
    /**
     * If Audio and video are muxed.
     */
    @Nonnull
    public static final String INTERLEAVED = "Interleaved";
    /**
     * File size (final with measure).
     */
    @Nonnull
    public static final String FILESIZE_STRING = "FileSize/String";
    /**
     * File size (final with measure, 1 digit mini).
     */
    @Nonnull
    public static final String FILESIZE_STRING1 = "FileSize/String1";
    /**
     * File size (final with measure, 2 digit mini).
     */
    @Nonnull
    public static final String FILESIZE_STRING2 = "FileSize/String2";
    /**
     * File size (final with measure, 3 digit mini).
     */
    @Nonnull
    public static final String FILESIZE_STRING3 = "FileSize/String3";
    /**
     * File size (final with measure, 4 digit mini).
     */
    @Nonnull
    public static final String FILESIZE_STRING4 = "FileSize/String4";
    /**
     * Play time in format : XXx YYy only, YYy omited if zero.
     */
    @Nonnull
    public static final String DURATION_STRING = "Duration/String";
    /**
     * Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
     */
    @Nonnull
    public static final String DURATION_STRING1 = "Duration/String1";
    /**
     * Play time in format : XXx YYy only, YYy omited if zero.
     */
    @Nonnull
    public static final String DURATION_STRING2 = "Duration/String2";
    /**
     * Play time in format : HH:MM:SS.MMM.
     */
    @Nonnull
    public static final String DURATION_STRING3 = "Duration/String3";
    /**
     * Duration Start.
     */
    @Nonnull
    public static final String DURATION_START = "Duration_Start";
    /**
     * Duration End.
     */
    @Nonnull
    public static final String DURATION_END = "Duration_End";
    /**
     * Bit rate mode of all streams (VBR, CBR).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MODE = "OverallBitRate_Mode";
    /**
     * Bit rate mode of all streams (Variable, Constant).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MODE_STRING = "OverallBitRate_Mode/Strin";
    /**
     * Bit rate of all streams (with measure).
     */
    @Nonnull
    public static final String OVERALLBITRATE_STRING = "OverallBitRate/String";
    /**
     * Minimum Bit rate in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE_MINIMUM = "OverallBitRate_Minimum";
    /**
     * Minimum Bit rate in bps (with measurement).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MINIMUM_STRING = "OverallBitRate_Minimum/St";
    /**
     * Nominal Bit rate in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE_NOMINAL = "OverallBitRate_Nominal";
    /**
     * Nominal Bit rate in bps (with measurement).
     */
    @Nonnull
    public static final String OVERALLBITRATE_NOMINAL_STRING = "OverallBitRate_Nominal/St";
    /**
     * Maximum Bit rate in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE_MAXIMUM = "OverallBitRate_Maximum";
    /**
     * Maximum Bit rate in bps (with measurement).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MAXIMUM_STRING = "OverallBitRate_Maximum/St";
    /**
     * StreamSize.
     */
    @Nonnull
    public static final String STREAMSIZE = "StreamSize";
    /**
     * StreamSize.
     */
    @Nonnull
    public static final String STREAMSIZE_STRING = "StreamSize/String";
    /**
     * StreamSize.
     */
    @Nonnull
    public static final String STREAMSIZE_STRING1 = "StreamSize/String2";
    /**
     * StreamSize.
     */
    @Nonnull
    public static final String STREAMSIZE_STRING2 = "StreamSize/String2";
    /**
     * StreamSize.
     */
    @Nonnull
    public static final String STREAMSIZE_STRING3 = "StreamSize/String3";
    /**
     * StreamSize.
     */
    @Nonnull
    public static final String STREAMSIZE_STRING4 = "StreamSize/String4";
    /**
     * StreamSize : With proportion.
     */
    @Nonnull
    public static final String STREAMSIZE_STRING5 = "StreamSize/String5";
    /**
     * Stream size divided by file size.
     */
    @Nonnull
    public static final String STREAMSIZE_PROPORTION = "StreamSize_Proportion";
    /**
     * IsStreamable.
     */
    @Nonnull
    public static final String ISSTREAMABLE = "IsStreamable";
    /**
     * The time/date/year that the recording began.
     */
    @Nonnull
    public static final String RECORDED_DATE = "Recorded_Date";
    /**
     * The time/date/year that the encoding of this item was completed began.
     */
    @Nonnull
    public static final String ENCODED_DATE = "Encoded_Date";
    /**
     * The time/date/year that the tags were done for this item.
     */
    @Nonnull
    public static final String TAGGED_DATE = "Tagged_Date";
    /**
     * The time/date/year that the composition of the music/script began.
     */
    @Nonnull
    public static final String WRITTEN_DATE = "Written_Date";
    /**
     * The time that the file was created on the file system.
     */
    @Nonnull
    public static final String FILE_CREATED_DATE = "File_Created_Date";
    /**
     * The time that the file was modified on the file system.
     */
    @Nonnull
    public static final String FILE_MODIFIED_DATE = "File_Modified_Date";
    /**
     * Name of the software package used to create the file, such as Microsoft WaveEdit.
     */
    @Nonnull
    public static final String ENCODED_APPLICATION = "Encoded_Application";
    /**
     * URL of the software package used to create the file, such as Microsoft WaveEdit.
     */
    @Nonnull
    public static final String ENCODED_APPLICATION_URL = "Encoded_Application/Url";
    /**
     * Software used to create the file.
     */
    @Nonnull
    public static final String ENCODED_LIBRARY = "Encoded_Library";
    /**
     * Software used to create the file.
     */
    @Nonnull
    public static final String ENCODED_LIBRARY_STRING = "Encoded_Library/String";
    /**
     * Name of the the encoding-software.
     */
    @Nonnull
    public static final String ENCODED_LIBRARY_NAME = "Encoded_Library/Name";
    /**
     * Version of the the encoding-software.
     */
    @Nonnull
    public static final String ENCODED_LIBRARY_VERSION = "Encoded_Library/Version";
    /**
     * Release date of the the encoding-software.
     */
    @Nonnull
    public static final String ENCODED_LIBRARY_DATE = "Encoded_Library/Date";
    /**
     * Parameters used by the software.
     */
    @Nonnull
    public static final String ENCODED_LIBRARY_SETTINGS = "Encoded_Library_Settings";
    /**
     * Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
     */
    @Nonnull
    public static final String LANGUAGE = "Language";
    /**
     * Language (full).
     */
    @Nonnull
    public static final String LANGUAGE_STRING = "Language/String";
    /**
     * Language (full).
     */
    @Nonnull
    public static final String LANGUAGE_STRING1 = "Language/String1";
    /**
     * Language (2-letter ISO 639-1 if exists, else empty).
     */
    @Nonnull
    public static final String LANGUAGE_STRING2 = "Language/String2";
    /**
     * Language (3-letter ISO 639-2 if exists, else empty).
     */
    @Nonnull
    public static final String LANGUAGE_STRING3 = "Language/String3";
    /**
     * Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
     */
    @Nonnull
    public static final String LANGUAGE_STRING4 = "Language/String4";
    /**
     * More info about Language (e.g. Director's Comment).
     */
    @Nonnull
    public static final String LANGUAGE_MORE = "Language_More";
    /**
     * Set if that track should be used if no language found matches the user preference.
     */
    @Nonnull
    public static final String DEFAULT = "Default";
    /**
     * Set if that track should be used if no language found matches the user preference.
     */
    @Nonnull
    public static final String DEFAULT_STRING = "Default/String";
    /**
     * Set if that track should be used if no language found matches the user preference.
     */
    @Nonnull
    public static final String FORCED = "Forced";
    /**
     * Set if that track should be used if no language found matches the user preference.
     */
    @Nonnull
    public static final String FORCED_STRING = "Forced/String";
    /**
     * How this stream file is aligned in the container.
     */
    @Nonnull
    public static final String ALIGNMENT = "Alignment";
    /**
     * Name of the track.
     */
    @Nonnull
    public static final String TITLE = "Title";
    /**
     * How this stream file is aligned in the container.
     */
    @Nonnull
    public static final String ALIGNMENT_STRING = "Alignment/String";
    /**
     * Compression mode (Lossy or Lossless).
     */
    @Nonnull
    public static final String COMPRESSION_MODE = "Compression_Mode";
    /**
     * Compression mode (Lossy or Lossless).
     */
    @Nonnull
    public static final String COMPRESSION_MODE_STRING = "Compression_Mode/String";
    /**
     * Current stream size divided by uncompressed stream size.
     */
    @Nonnull
    public static final String COMPRESSION_RATIO = "Compression_Ratio";
    /**
     * Delay fixed in the stream (relative) IN MS.
     */
    @Nonnull
    public static final String DELAY = "Delay";
    /**
     * Delay with measurement.
     */
    @Nonnull
    public static final String DELAY_STRING = "Delay/String";
    /**
     * Delay with measurement.
     */
    @Nonnull
    public static final String DELAY_STRING1 = "Delay/String1";
    /**
     * Delay with measurement.
     */
    @Nonnull
    public static final String DELAY_STRING2 = "Delay/String2";
    /**
     * Delay in format : HH:MM:SS.MMM.
     */
    @Nonnull
    public static final String DELAY_STRING3 = "Delay/String3";
    /**
     * Delay in format : HH:MM:SS:FF (HH:MM:SS).
     */
    @Nonnull
    public static final String DELAY_STRING4 = "Delay/String4";
    /**
     * Delay settings (in case of timecode for example).
     */
    @Nonnull
    public static final String DELAY_SETTINGS = "Delay_Settings";
    /**
     * Encryption.
     */
    @Nonnull
    public static final String ENCRYPTION = "Encryption";
    /**
     * Bit rate in bps.
     */
    @Nonnull
    public static final String BITRATE = "BitRate";
    /**
     * How this file is muxed in the container.
     */
    @Nonnull
    public static final String MUXING_MODE = "MuxingMode";
    /**
     * Duration of the first frame if it is longer than others, in ms.
     */
    @Nonnull
    public static final String DURATION_FIRSTFRAME = "Duration_FirstFrame";
    /**
     * Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     */
    @Nonnull
    public static final String DURATION_FIRSTFRAME_STRING_TYPE = "Duration_FirstFrame/String";
    /**
     * Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     */
    @Nonnull
    public static final String DURATION_FIRSTFRAME_STRING_TYPE1 = "Duration_FirstFrame/String1";
    /**
     * Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     */
    @Nonnull
    public static final String DURATION_FIRSTFRAME_STRING_TYPE2 = "Duration_FirstFrame/String2";
    /**
     * Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
     */
    @Nonnull
    public static final String DURATION_FIRSTFRAME_STRING_TYPE3 = "Duration_FirstFrame/String3";
    /**
     * Bit rate mode (VBR, CBR).
     */
    @Nonnull
    public static final String BITRATE_MODE = "BitRate_Mode";
    /**
     * Bit rate mode (Variable, Cconstant).
     */
    @Nonnull
    public static final String BITRATE_MODE_STRING = "BitRate_Mode/String";
    /**
     * Bit rate (with measurement).
     */
    @Nonnull
    public static final String BITRATE_STRING = "BitRate/String";
    /**
     * Minimum Bit rate in bps.
     */
    @Nonnull
    public static final String BITRATE_MINIMUM = "BitRate_Minimum";
    /**
     * Minimum Bit rate (with measurement).
     */
    @Nonnull
    public static final String BITRATE_MINIMUM_STRING = "BitRate_Minimum/String";
    /**
     * Nominal Bit rate in bps.
     */
    @Nonnull
    public static final String BITRATE_NOMINAL = "BitRate_Nominal";
    /**
     * Nominal Bit rate (with measurement).
     */
    @Nonnull
    public static final String BITRATE_NOMINAL_STRING = "BitRate_Nominal/String";
    /**
     * Maximum Bit rate in bps.
     */
    @Nonnull
    public static final String BITRATE_MAXIMUM = "BitRate_Maximum";
    /**
     * Maximum Bit rate (with measurement).
     */
    @Nonnull
    public static final String BITRATE_MAXIMUM_STRING = "BitRate_Maximum/String";
    /**
     * Encoded (with forced padding) bit rate in bps, if some container padding is present.
     */
    @Nonnull
    public static final String BITRATE_ENCODED = "BitRate_Encoded";
    /**
     * Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
     */
    @Nonnull
    public static final String BITRATE_ENCODED_STRING = "BitRate_Encoded/String";
    /**
     * Frames per second (with measurement).
     */
    @Nonnull
    public static final String FRAMERATE_STRING = " FrameRate/String";
    /**
     * Number of frames.
     */
    @Nonnull
    public static final String FRAMECOUNT = "FrameCount";
    /**
     * Frames per second.
     */
    @Nonnull
    public static final String FRAME_RATE = "FrameRate";
    /**
     * Source Number of frames.
     */
    @Nonnull
    public static final String SOURCE_FRAMECOUNT = "Source_FrameCount";
    /**
     * BitDepth (8/16/24/32).
     */
    @Nonnull
    public static final String BITDEPTH = "BitDepth";
    /**
     * BitDepth (8/16/24/32 bits).
     */
    @Nonnull
    public static final String BITDEPTH_STRING = "BitDepth/String";
    /**
     * Delay source (Container or Stream or empty).
     */
    @Nonnull
    public static final String DELAY_SOURCE = "Delay_Source";
    /**
     * Delay source (Container or Stream or empty).
     */
    @Nonnull
    public static final String DELAY_SOURCE_STRING = "Delay_Source/String";

    private Commons() {
        // Singleton
    }
}
