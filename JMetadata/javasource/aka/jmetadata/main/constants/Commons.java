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

    private Commons() {
        // Singleton
    }
}
