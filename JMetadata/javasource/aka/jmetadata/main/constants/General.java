package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * General constants parameters.
 *
 * @author Charlotte
 */
public final class General {
    /**
     * Audio Codecs in this file,separated by /.
     */
    @Nonnull
    public static final String AUDIO_FORMAT_LIST = "Audio_Format_List";
    /**
     * Audio Codecs in this file with popular name (hint), separated by /.
     */
    @Nonnull
    public static final String AUDIO_FORMAT_WITH_HINT_LIST = "Audio_Format_WithHint_List";
    /**
     * Audio languages in this file separated by /.
     */
    @Nonnull
    public static final String AUDIO_LANGUAGE_LIST = "Audio_Language_List";
    /**
     * Number of audio streams.
     */
    @Nonnull
    public static final String AUDIOCOUNT = "AudioCount";
    /**
     * Chapters Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String CHAPTERS_FORMAT_LIST = "Chapters_Format_List";
    /**
     * Chapters Codecs in this file with popular name (hint),separated by /.
     */
    @Nonnull
    public static final String CHAPTERS_FORMAT_WITH_HINT_LIST = "Chapters_Format_WithHint_List";
    /**
     * Chapters languages in this file, separated by /.
     */
    @Nonnull
    public static final String CHAPTERS_LANGUAGE_LIST = "Chapters_Language_List";
    /**
     * Number of chapters streams.
     */
    @Nonnull
    public static final String CHAPTERSCOUNT = "ChaptersCount";
    /**
     * Complete name (Folder+Name+Extension).
     */
    @Nonnull
    public static final String COMPLETE_NAME = "CompleteName";
    /**
     * Duration End.
     */
    @Nonnull
    public static final String DURATION_END = "Duration_End";
    /**
     * Duration Start.
     */
    @Nonnull
    public static final String DURATION_START = "Duration_Start";
    /**
     * The time that the file was created on the file system.
     */
    @Nonnull
    public static final String FILE_CREATED_DATE = "File_Created_Date";
    /**
     * File extension only.
     */
    @Nonnull
    public static final String FILE_EXTENSION = "FileExtension";
    /**
     * The time that the file was modified on the file system.
     */
    @Nonnull
    public static final String FILE_MODIFIED_DATE = "File_Modified_Date";
    /**
     * File name only.
     */
    @Nonnull
    public static final String FILE_NAME = "FileName";
    /**
     * File size in bytes.
     */
    @Nonnull
    public static final String FILESIZE = "FileSize";
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
     * Folder name only.
     */
    @Nonnull
    public static final String FOLDER_NAME = "FolderName";
    /**
     * Known extensions of this format.
     */
    @Nonnull
    public static final String FORMAT_EXTENSIONS = "Format/Extensions";
    /**
     * Number of general streams.
     */
    @Nonnull
    public static final String GENERALCOUNT = "GeneralCount";
    /**
     * Image Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String IMAGE_FORMAT_LIST = "Image_Format_List";
    /**
     * Image Codecs in this file with popular name (hint),separated by /.
     */
    @Nonnull
    public static final String IMAGE_FORMAT_WITH_HINT_LIST = "Image_Format_WithHint_List";
    /**
     * Image languages in this file, separated by /.
     */
    @Nonnull
    public static final String IMAGE_LANGUAGE_LIST = "Image_Language_List";
    /**
     * Number of image streams.
     */
    @Nonnull
    public static final String IMAGECOUNT = "ImageCount";
    /**
     * If Audio and video are muxed.
     */
    @Nonnull
    public static final String INTERLEAVED = "Interleaved";
    /**
     * IsStreamable.
     */
    @Nonnull
    public static final String ISSTREAMABLE = "IsStreamable";
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
     * Number of menu streams.
     */
    @Nonnull
    public static final String MENUCOUNT = "MenuCount";
    /**
     * Bit rate of all streams in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE = "OverallBitRate";
    /**
     * Maximum Bit rate in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE_MAXIMUM = "OverallBitRate_Maximum";
    /**
     * Maximum Bit rate in bps (with measurement).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MAXIMUM_STRING = "OverallBitRate_Maximum/String";
    /**
     * Minimum Bit rate in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE_MINIMUM = "OverallBitRate_Minimum";
    /**
     * Minimum Bit rate in bps (with measurement).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MINIMUM_STRING = "OverallBitRate_Minimum/String";
    /**
     * Bit rate mode of all streams (VBR, CBR).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MODE = "OverallBitRate_Mode";
    /**
     * Bit rate mode of all streams (Variable, Constant).
     */
    @Nonnull
    public static final String OVERALLBITRATE_MODE_STRING = "OverallBitRate_Mode/String";
    /**
     * Nominal Bit rate in bps.
     */
    @Nonnull
    public static final String OVERALLBITRATE_NOMINAL = "OverallBitRate_Nominal";
    /**
     * Nominal Bit rate in bps (with measurement).
     */
    @Nonnull
    public static final String OVERALLBITRATE_NOMINAL_STRING = "OverallBitRate_Nominal/String";
    /**
     * Bit rate of all streams (with measure).
     */
    @Nonnull
    public static final String OVERALLBITRATE_STRING = "OverallBitRate/String";
    /**
     * The time/date/year that the recording began.
     */
    @Nonnull
    public static final String RECORDED_DATE = "Recorded_Date";
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
     * Number of text streams.
     */
    @Nonnull
    public static final String TEXTCOUNT = "TextCount";
    /**
     * Video Codecs in this file, separated by /.
     */
    @Nonnull
    public static final String VIDEO_FORMAT_LIST = "Video_Format_List";
    /**
     * Video Codecs in this file with popular name (hint), separated by /.
     */
    @Nonnull
    public static final String VIDEO_FORMAT_WITH_HINT_LIST = "Video_Format_WithHint_List";
    /**
     * Video languages in this file, full names, separated by /.
     */
    @Nonnull
    public static final String VIDEO_LANGUAGE_LIST = "Video_Language_List";
    /**
     * Number of video streams.
     */
    @Nonnull
    public static final String VIDEOCOUNT = "VideoCount";
    /**
     * The time/date/year that the composition of the music/script began.
     */
    @Nonnull
    public static final String WRITTEN_DATE = "Written_Date";

    private General() {
        // Singleton
    }
}
