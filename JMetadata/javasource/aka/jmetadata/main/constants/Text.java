package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * Text
 * Count : Count of objects available in this stream
 * Status : bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished)
 * StreamCount : Count of streams of that kind available
 * StreamKind : Stream type name
 * StreamKind/String : Stream type name
 * StreamKindID : Number of the stream (base=0)
 * StreamKindPos : When multiple streams, number of the stream (base=1)
 * StreamOrder : Stream order in the file, whatever is the kind of stream (base=0)
 * Inform : Last **Inform** call
 * ID : A ID for this stream in this file
 * ID/String : A ID for this stream in this file
 * UniqueID : A unique ID for this stream, should be copied with stream copy
 * UniqueID/String : A unique ID for this stream, should be copied with stream copy
 * MenuID : A menu ID for this stream in this file
 * MenuID/String : A menu ID for this stream in this file
 * Format : Format used
 * Format/Info : Info about Format
 * Format/Url : Link
 * Format_Commercial : Commercial name used by vendor for theses setings or Format field if there is no difference
 * Format_Commercial_IfAny : Commercial name used by vendor for theses setings if there is one
 * Format_Version : Version of this format
 * Format_Profile : Profile of the Format
 * Format_Compression : Compression method used
 * Format_Settings : Settings needed for decoder used
 * Format_Settings_Wrapping : Wrapping mode (Frame wrapped or Clip wrapped)
 * InternetMediaType : Internet Media Type (aka MIME Type, Content-Type)
 * MuxingMode : How this stream is muxed in the container
 * MuxingMode_MoreInfo : More info (text) about the muxing mode
 * CodecID : Codec ID (found in some containers)
 * CodecID/String : Codec ID (found in some containers)
 * CodecID/Info : Info about codec ID
 * CodecID/Hint : A hint for this codec ID
 * CodecID/Url : A link for more details about this codec ID
 * CodecID_Description : Manual description given by the container
 * Codec : Deprecated
 * Codec/String : Deprecated
 * Codec/Info : Deprecated
 * Codec/Url : Deprecated
 * Codec/CC : Deprecated
 * Duration : Play time of the stream
 * Duration/String : Play time (formated)
 * Duration/String1 : Play time in format : HHh MMmn SSs MMMms, XX omited if zero
 * Duration/String2 : Play time in format : XXx YYy only, YYy omited if zero
 * Duration/String3 : Play time in format : HH:MM:SS.MMM
 * Duration/String4 : Play time in format : HH:MM:SS:FF (HH:MM:SS
 * Duration_FirstFrame : Duration of the first frame if it is longer than others, in ms
 * Duration_FirstFrame/Strin : Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Duration_FirstFrame/Strin : Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 * Duration_FirstFrame/Strin : Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Duration_FirstFrame/Strin : Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM
 * Duration_LastFrame : Duration of the last frame if it is longer than others, in ms
 * Duration_LastFrame/String : Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Duration_LastFrame/String : Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 * Duration_LastFrame/String : Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Duration_LastFrame/String : Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM
 * Source_Duration : Source Play time of the stream
 * Source_Duration/String : Source Play time in format : XXx YYy only, YYy omited if zero
 * Source_Duration/String1 : Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero
 * Source_Duration/String2 : Source Play time in format : XXx YYy only, YYy omited if zero
 * Source_Duration/String3 : Source Play time in format : HH:MM:SS.MMM
 * Source_Duration_FirstFram : Source Duration of the first frame if it is longer than others, in ms
 * Source_Duration_FirstFram : Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Source_Duration_FirstFram : Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 * Source_Duration_FirstFram : Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Source_Duration_FirstFram : Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM
 * Source_Duration_LastFrame : Source Duration of the last frame if it is longer than others, in ms
 * Source_Duration_LastFrame : Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Source_Duration_LastFrame : Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 * Source_Duration_LastFrame : Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 * Source_Duration_LastFrame : Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM
 * BitRate_Mode : Bit rate mode (VBR, CBR)
 * BitRate_Mode/String : Bit rate mode (Constant, Variable)
 * BitRate : Bit rate in bps
 * BitRate/String : Bit rate (with measurement)
 * BitRate_Minimum : Minimum Bit rate in bps
 * BitRate_Minimum/String : Minimum Bit rate (with measurement)
 * BitRate_Nominal : Nominal Bit rate in bps
 * BitRate_Nominal/String : Nominal Bit rate (with measurement)
 * BitRate_Maximum : Maximum Bit rate in bps
 * BitRate_Maximum/String : Maximum Bit rate (with measurement)
 * BitRate_Encoded : Encoded (with forced padding) bit rate in bps, if some container padding is present
 * BitRate_Encoded/String : Encoded (with forced padding) bit rate (with measurement), if some container padding is present
 * Width : Width
 * Width/String
 * Height : Height
 * Height/String
 * FrameRate_Mode : Frame rate mode (CFR, VFR)
 * FrameRate_Mode/String : Frame rate mode (Constant, Variable)
 * FrameRate : Frames per second
 * FrameRate/String : Frames per second (with measurement)
 * FrameRate_Minimum : Minimum Frames per second
 * FrameRate_Minimum/String : Minimum Frames per second (with measurement)
 * FrameRate_Nominal : Nominal Frames per second
 * FrameRate_Nominal/String : Nominal Frames per second (with measurement)
 * FrameRate_Maximum : Maximum Frames per second
 * FrameRate_Maximum/String : Maximum Frames per second (with measurement)
 * FrameRate_Original : Original (in the raw stream) Frames per second
 * FrameRate_Original/String : Original (in the raw stream) Frames per second (with measurement)
 * FrameCount : Number of frames
 * Source_FrameCount : Source Number of frames
 * ColorSpace
 * ChromaSubsampling
 * Resolution : Deprecated, do not use in new projects
 * Resolution/String : Deprecated, do not use in new projects
 * BitDepth
 * BitDepth/String
 * Compression_Mode : Compression mode (Lossy or Lossless)
 * Compression_Mode/String : Compression mode (Lossy or Lossless)
 * Compression_Ratio : Current stream size divided by uncompressed stream size
 * Delay : Delay fixed in the stream (relative) IN MS
 * Delay/String : Delay with measurement
 * Delay/String1 : Delay with measurement
 * Delay/String2 : Delay with measurement
 * Delay/String3 : Delay in format : HH:MM:SS.MMM
 * Delay/String4 : Delay in format : HH:MM:SS:FF (HH:MM:SS
 * Delay_Settings : Delay settings (in case of timecode for example)
 * Delay_Source : Delay source (Container or Stream or empty)
 * Delay_Source/String : Delay source (Container or Stream or empty)
 * Delay_Original : Delay fixed in the raw stream (relative) IN MS
 * Delay_Original/String : Delay with measurement
 * Delay_Original/String1 : Delay with measurement
 * Delay_Original/String2 : Delay with measurement
 * Delay_Original/String3 : Delay in format: HH:MM:SS.MMM
 * Delay_Original/String4 : Delay in format: HH:MM:SS:FF (HH:MM:SS
 * Delay_Original_Settings : Delay settings (in case of timecode for example)
 * Delay_Original_Source : Delay source (Stream or empty)
 * Video_Delay : Delay fixed in the stream (absolute / video)
 * Video_Delay/String
 * Video_Delay/String1
 * Video_Delay/String2
 * Video_Delay/String3
 * Video_Delay/String4
 * Video0_Delay : Deprecated, do not use in new projects
 * Video0_Delay/String : Deprecated, do not use in new projects
 * Video0_Delay/String1 : Deprecated, do not use in new projects
 * Video0_Delay/String2 : Deprecated, do not use in new projects
 * Video0_Delay/String3 : Deprecated, do not use in new projects
 * Video0_Delay/String4 : Deprecated, do not use in new projects
 * StreamSize : Streamsize in bytes
 * StreamSize/String : Streamsize in with percentage value
 * StreamSize/String1
 * StreamSize/String2
 * StreamSize/String3
 * StreamSize/String4
 * StreamSize/String5 : Streamsize in with percentage value
 * StreamSize_Proportion : Stream size divided by file size
 * Source_StreamSize : Source Streamsize in bytes
 * Source_StreamSize/String : Source Streamsize in with percentage value
 * Source_StreamSize/String1
 * Source_StreamSize/String2
 * Source_StreamSize/String3
 * Source_StreamSize/String4
 * Source_StreamSize/String5 : Source Streamsize in with percentage value
 * Source_StreamSize_Proport : Source Stream size divided by file size
 * StreamSize_Encoded : Encoded Streamsize in bytes
 * StreamSize_Encoded/String : Encoded Streamsize in with percentage value
 * StreamSize_Encoded/String1
 * StreamSize_Encoded/String2
 * StreamSize_Encoded/String3
 * StreamSize_Encoded/String4
 * StreamSize_Encoded/String : Encoded Streamsize in with percentage value
 * StreamSize_Encoded_Propor : Encoded Stream size divided by file size
 * Source_StreamSize_Encoded : Source Encoded Streamsize in bytes
 * Source_StreamSize_Encoded : Source Encoded Streamsize in with percentage value
 * Source_StreamSize_Encoded/String1
 * Source_StreamSize_Encoded/String2
 * Source_StreamSize_Encoded/String3
 * Source_StreamSize_Encoded/String4
 * Source_StreamSize_Encoded : Source Encoded Streamsize in with percentage value
 * Source_StreamSize_Encoded : Source Encoded Stream size divided by file size
 * Title : Name of the track
 * Encoded_Library : Software used to create the file
 * Encoded_Library/String : Software used to create the file
 * Encoded_Library/Name : Info from the software
 * Encoded_Library/Version : Version of software
 * Encoded_Library/Date : Release date of software
 * Encoded_Library_Settings : Parameters used by the software
 * Language : Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn)
 * Language/String : Language (full)
 * Language/String1 : Language (full)
 * Language/String2 : Language (2-letter ISO 639-1 if exists, else empty)
 * Language/String3 : Language (3-letter ISO 639-2 if exists, else empty)
 * Language/String4 : Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty)
 * Language_More : More info about Language (e.g. Director's Comment)
 * Default : Set if that track should be used if no language found matches the user preference.
 * Default/String : Set if that track should be used if no language found matches the user preference.
 * Forced : Set if that track should be used if no language found matches the user preference.
 * Forced/String : Set if that track should be used if no language found matches the user preference.
 * Summary
 * Encoded_Date : The time that the encoding of this item was completed began.
 * Tagged_Date : The time that the tags were done for this item.
 * Encryption
 */

public final class Text {
    /**
     * Number of streams of this kind available.
     */
    @Nonnull
    public static final String STREAMCOUNT = "StreamCount";
    /**
     * Format used.
     */
    @Nonnull
    public static final String FORMAT = "Format";
    /**
     * Codec ID (found in some containers).
     */
    @Nonnull
    public static final String CODEC_ID = "CodecID";
    /**
     * Info about codec ID.
     */
    @Nonnull
    public static final String CODEC_ID_INFO = "CodecID/Info";
    /**
     * Name of the track.
     */
    @Nonnull
    public static final String TITLE = "Title";
    /**
     * Language.
     */
    @Nonnull
    public static final String LANGUAGE = "Language/String";
    /**
     * Set if that track should be used if no language found matches the user preference.
     */
    @Nonnull
    public static final String DEFAULT = "Default";
    /**
     * Set if that track should be used if no language found matches the user preference.
     */
    @Nonnull
    public static final String FORCED = "Forced";

    private Text() {
        // Singleton
    }
}
