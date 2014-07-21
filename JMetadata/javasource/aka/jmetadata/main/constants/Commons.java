package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * MediaInfo parameters.
 *
 * General
 * Count : Number of objects available in this stream
 * Status : bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished)
 * StreamCount : Number of streams of this kind available
 * StreamKind : Stream type name
 * StreamKind/String : Stream type name
 * StreamKindID : Number of the stream (base=0)
 * StreamKindPos : When multiple streams, number of the stream (base=1)
 * StreamOrder : Stream order in the file, whatever is the kind of stream (base=0)
 * Inform : Last **Inform** call
 * ID : The ID for this stream in this file
 * ID/String : The ID for this stream in this file
 * UniqueID : The unique ID for this stream, should be copied with stream copy
 * UniqueID/String : A unique ID for this stream, should be copied with stream copy
 * MenuID : The menu ID for this stream in this file
 * MenuID/String : The menu ID for this stream in this file
 * GeneralCount : Number of general streams
 * VideoCount : Number of video streams
 * AudioCount : Number of audio streams
 * TextCount : Number of text streams
 * ChaptersCount : Number of chapters streams
 * ImageCount : Number of image streams
 * MenuCount : Number of menu streams
 * Video_Format_List : Video Codecs in this file, separated by /
 * Video_Format_WithHint_Lis : Video Codecs in this file with popular name (hint), separated by /
 * Video_Codec_List : Deprecated, do not use in new projects
 * Video_Language_List : Video languagesin this file, full names, separated by /
 * Audio_Format_List : Audio Codecs in this file,separated by /
 * Audio_Format_WithHint_Lis : Audio Codecs in this file with popular name (hint), separated by /
 * Audio_Codec_List : Deprecated, do not use in new projects
 * Audio_Language_List : Audio languages in this file separated by /
 * Text_Format_List : Text Codecs in this file, separated by /
 * Text_Format_WithHint_List : Text Codecs in this file with popular name (hint),separated by /
 * Text_Codec_List : Deprecated, do not use in new projects
 * Text_Language_List : Text languages in this file, separated by /
 * Chapters_Format_List : Chapters Codecs in this file, separated by /
 * Chapters_Format_WithHint_ : Chapters Codecs in this file with popular name (hint), separated by /
 * Chapters_Codec_List : Deprecated, do not use in new projects
 * Chapters_Language_List : Chapters languages in this file, separated by /
 * Image_Format_List : Image Codecs in this file, separated by /
 * Image_Format_WithHint_Lis : Image Codecs in this file with popular name (hint), separated by /
 * Image_Codec_List : Deprecated, do not use in new projects
 * Image_Language_List : Image languages in this file, separated by /
 * Menu_Format_List : Menu Codecsin this file, separated by /
 * Menu_Format_WithHint_List : Menu Codecs in this file with popular name (hint),separated by /
 * Menu_Codec_List : Deprecated, do not use in new projects
 * Menu_Language_List : Menu languages in this file, separated by /
 * CompleteName : Complete name (Folder+Name+Extension)
 * FolderName : Folder name only
 * FileName : File name only
 * FileExtension : File extension only
 * Format : Format used
 * Format/String : Deprecated, do not use in new projects
 * Format/Info : Info about this Format
 * Format/Url : Link to a description of this format
 * Format/Extensions : Known extensions of this format
 * Format_Commercial : Commercial name used by vendor for theses setings or Format field if there is no difference
 * Format_Commercial_IfAny : Commercial name used by vendor for theses setings if there is one
 * Format_Version : Version of this format
 * Format_Profile : Profile of the Format
 * Format_Compression : Compression method used
 * Format_Settings : Settings needed for decoder used
 * InternetMediaType : Internet Media Type (aka MIME Type, Content-Type)
 * CodecID : Codec ID (found in some containers)
 * CodecID/String : Codec ID (found in some containers)
 * CodecID/Info : Info about this codec
 * CodecID/Hint : A hint/popular name for this codec
 * CodecID/Url : A link to more details about this codec ID
 * CodecID_Description : Manual description given by the container
 * Interleaved : If Audio and video are muxed
 * Codec : Deprecated, do not use in new projects
 * Codec/String : Deprecated, do not use in new projects
 * Codec/Info : Deprecated, do not use in new projects
 * Codec/Url : Deprecated, do not use in new projects
 * Codec/Extensions : Deprecated, do not use in new projects
 * Codec_Settings : Deprecated, do not use in new projects
 * Codec_Settings_Automatic : Deprecated, do not use in new projects
 * FileSize : File size in bytes
 * FileSize/String : File size (with measure)
 * FileSize/String1 : File size (with measure, 1 digit mini)
 * FileSize/String2 : File size (with measure, 2 digit mini)
 * FileSize/String3 : File size (with measure, 3 digit mini)
 * FileSize/String4 : File size (with measure, 4 digit mini)
 * Duration : Play time of the stream in ms
 * Duration/String : Play time in format : XXx YYy only, YYy omited if zero
 * Duration/String1 : Play time in format : HHh MMmn SSs MMMms, XX omited if zero
 * Duration/String2 : Play time in format : XXx YYy only, YYy omited if zero
 * Duration/String3 : Play time in format : HH:MM:SS.MMM
 * Duration_Start
 * Duration_End
 * OverallBitRate_Mode : Bit rate mode of all streams (VBR, CBR)
 * OverallBitRate_Mode/Strin : Bit rate mode of all streams (Variable, Constant)
 * OverallBitRate : Bit rate of all streams in bps
 * OverallBitRate/String : Bit rate of all streams (with measure)
 * OverallBitRate_Minimum : Minimum Bit rate in bps
 * OverallBitRate_Minimum/St : Minimum Bit rate (with measurement)
 * OverallBitRate_Nominal : Nominal Bit rate in bps
 * OverallBitRate_Nominal/St : Nominal Bit rate (with measurement)
 * OverallBitRate_Maximum : Maximum Bit rate in bps
 * OverallBitRate_Maximum/St : Maximum Bit rate (with measurement)
 * Delay : Delay fixed in the stream (relative) IN MS
 * Delay/String : Delay with measurement
 * Delay/String1 : Delay with measurement
 * Delay/String2 : Delay with measurement
 * Delay/String3 : format : HH:MM:SS.MMM
 * StreamSize : Stream size in bytes
 * StreamSize/String
 * StreamSize/String1
 * StreamSize/String2
 * StreamSize/String3
 * StreamSize/String4
 * StreamSize/String5 : With proportion
 * StreamSize_Proportion : Stream size divided by file size
 * HeaderSize
 * DataSize
 * FooterSize
 * IsStreamable
 * Album_ReplayGain_Gain : The gain to apply to reach 89dB SPL on playback
 * Album_ReplayGain_Gain/String
 * Album_ReplayGain_Peak : The maximum absolute peak value of the item
 * Encryption
 * Title : (Generic)Title of file
 * Title/More : (Generic)More info about the title of file
 * Title/Url : (Generic)Url
 * Domain : Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs
 * Collection : Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel
 * Season : Name of the season, e.g. Strawars first Trilogy, Season 1
 * Season_Position : Number of the Season
 * Season_Position_Total : Place of the season e.g. 2 of 7
 * Movie : Name of the movie. Eg : Starwars, a new hope
 * Movie/More : More infos about the movie
 * Movie/Country : Country, where the movie was procuced
 * Movie/Url : Homepage for the movie
 * Album : Name of an audio-album. Eg : The joshua tree
 * Album/More : More infos about the album
 * Album/Sort
 * Album/Performer : Album performer/artist of this file
 * Album/Performer/Sort
 * Album/Performer/Url : Homepage of the album performer/artist
 * Comic : Name of the comic.
 * Comic/More
 * Comic/Position_Total
 * Part : Name of the part. e.g. CD1, CD2
 * Part/Position : Number of the part
 * Part/Position_Total : Place of the part e.g. 2 of 3
 * Track : Name of the track. e.g. track1, track 2
 * Track/More : More infos about the track
 * Track/Url : Link to a site about this track
 * Track/Sort
 * Track/Position : Number of this track
 * Track/Position_Total : Place of this track, e.g. 3 of 15
 * Grouping : iTunes grouping
 * Chapter : Name of the chapter.
 * SubTrack : Name of the subtrack.
 * Original/Album : Original name of album, serie...
 * Original/Movie : Original name of the movie
 * Original/Part : Original name of the part in the original support
 * Original/Track : Original name of the track in the original support
 * Compilation : iTunes compilation
 * Compilation/String : iTunes compilation
 * Performer : Main performer/artist of this file
 * Performer/Sort
 * Performer/Url : Homepage of the performer/artist
 * Original/Performer : Original artist(s)/performer(s).
 * Accompaniment : Band/orchestra/accompaniment/musician.
 * Composer : Name of the original composer.
 * Composer/Nationality : Nationality of the main composer of the item, mostly for classical music.
 * Arranger : The person who arranged the piece. e.g. Ravel.
 * Lyricist : The person who wrote the lyrics for a musical item.
 * Original/Lyricist : Original lyricist(s)/text writer(s).
 * Conductor : The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists.
 * Director : Name of the director.
 * AssistantDirector : Name of the assistant director.
 * DirectorOfPhotography : The name of the director of photography, also known as cinematographer.
 * SoundEngineer : The name of the sound engineer or sound recordist.
 * ArtDirector : The person who oversees the artists and craftspeople who build the sets.
 * ProductionDesigner : The person responsible for designing the Overall visual appearance of a movie.
 * Choregrapher : The name of the choregrapher.
 * CostumeDesigner : The name of the costume designer.
 * Actor : Real name of an actor or actress playing a role in the movie.
 * Actor_Character : Name of the character an actor or actress plays in this movie.
 * WrittenBy : The author of the story or script.
 * ScreenplayBy : The author of the screenplay or scenario (used for movies and TV shows).
 * EditedBy : Editors name
 * CommissionedBy : name of the person or organization that commissioned the subject of the file
 * Producer : Name of the producer of the movie.
 * CoProducer : The name of a co-producer.
 * ExecutiveProducer : The name of an executive producer.
 * MusicBy : Main music-artist for a movie
 * DistributedBy : Company the item is mainly distributed by
 * OriginalSourceForm/Distri : Name of the person or organization who supplied the original subject
 * MasteredBy : The engineer who mastered the content for a physical medium or for digital distribution.
 * EncodedBy : Name of the person or organisation that encoded/ripped the audio file.
 * RemixedBy : Name of the artist(s), that interpreted, remixed, or otherwise modified the item.
 * ProductionStudio : Main production studio
 * ThanksTo : A very general tag for everyone else that wants to be listed.
 * Publisher : Name of the organization publishing the album (i.e. the 'record label') or movie.
 * Publisher/URL : Publishers official webpage.
 * Label : Brand or trademark associated with the marketing of music recordings and music videos.
 * Genre : The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc.
 * Mood : Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc.
 * ContentType : The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc.
 * Subject : Describes the topic of the file, such as Aerial view of Seattle..
 * Description : A short description of the contents, such as Two birds flying.
 * Keywords : Keywords to the item separated by a comma, used for searching.
 * Summary : A plot outline or a summary of the story.
 * Synopsis : A description of the story line of the item.
 * Period : Describes the period that the piece is from or about. e.g. Renaissance.
 * LawRating : Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo).
 * LawRating_Reason : Reason for the law rating
 * ICRA : The ICRA rating. (Previously RSACi)
 * Released_Date : The date/year that the item was released.
 * Original/Released_Date : The date/year that the item was originaly released.
 * Recorded_Date : The time/date/year that the recording began.
 * Encoded_Date : The time/date/year that the encoding of this item was completed began.
 * Tagged_Date : The time/date/year that the tags were done for this item.
 * Written_Date : The time/date/year that the composition of the music/script began.
 * Mastered_Date : The time/date/year that the item was tranfered to a digitalmedium.
 * File_Created_Date : The time that the file was created on the file system
 * File_Created_Date_Local : The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database)
 * File_Modified_Date : The time that the file was modified on the file system
 * File_Modified_Date_Local : The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database)
 * Recorded_Location : Location where track was recorded. (See COMPOSITION_LOCATION for format)
 * Written_Location : Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the
 * same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin.
 * Archival_Location : Location, where an item is archived, e.eg. Louvre,Paris,France
 * Encoded_Application : Name of the software package used to create the file, such as Microsoft WaveEdit.
 * Encoded_Application/Url : Name of the software package used to create the file, such as Microsoft WaveEdit.
 * Encoded_Library : Software used to create the file
 * Encoded_Library/String : Software used to create the file
 * Encoded_Library/Name : Name of the the encoding-software
 * Encoded_Library/Version : Version of encoding-software
 * Encoded_Library/Date : Release date of software
 * Encoded_Library_Settings : Parameters used by the software
 * Cropped : Describes whether an image has been cropped and, if so, how it was cropped.
 * Dimensions : Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w
 * DotsPerInch : Stores dots per inch setting of the digitizer used to produce the file
 * Lightness : Describes the changes in lightness settings on the digitizer required to produce the file
 * OriginalSourceMedium : Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax
 * OriginalSourceForm : Original form of the material, e.g. slide, paper, map
 * OriginalSourceForm/NumCol : Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video
 * OriginalSourceForm/Name : Name of the product the file was originally intended for
 * OriginalSourceForm/Croppe : Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom
 * OriginalSourceForm/Sharpn : Identifies the changes in sharpness for the digitizer requiered to produce the file
 * Tagged_Application : Software used to tag this file
 * BPM : Average number of beats per minute
 * ISRC : International Standard Recording Code, excluding the ISRC prefix and including hyphens.
 * ISBN : International Standard Book Number.
 * BarCode : EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier.
 * LCCN : Library of Congress Control Number.
 * CatalogNumber : A label-specific catalogue number used to identify the release. e.g. TIC 01.
 * LabelCode : A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored.
 * Owner : Owner of the file
 * Copyright : Copyright attribution.
 * Copyright/Url : Link to a site with copyright/legal information.
 * Producer_Copyright : The copyright information as per the productioncopyright holder.
 * TermsOfUse : License information, e.g., All Rights Reserved,Any Use Permitted.
 * ServiceName
 * ServiceChannel
 * Service/Url
 * ServiceProvider
 * ServiceProviderr/Url
 * ServiceType
 * NetworkName
 * OriginalNetworkName
 * Country
 * TimeZone
 * Cover : Is there a cover
 * Cover_Description : short descriptio, e.g. Earth in space
 * Cover_Type
 * Cover_Mime
 * Cover_Data : Cover, in binary format encoded BASE64
 * Lyrics : Text of a song
 * Comment : Any comment related to the content.
 * Rating : A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating.
 * Added_Date : Date/year the item was added to the owners collection
 * Played_First_Date : The date, the owner first played an item
 * Played_Last_Date : The date, the owner last played an item
 * Played_Count : Number of times an item was played
 * EPG_Positions_Begin
 * EPG_Positions_End
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
