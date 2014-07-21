package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * Video
 *
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
 * Format : Format used
 * Format/Info : Info about Format
 * Format/Url : Link
 * Format_Commercial : Commercial name used by vendor for theses setings or Format field if there is no difference
 * Format_Commercial_IfAny : Commercial name used by vendor for theses setings if there is one
 * Format_Version : Version of this format
 * Format_Profile : Profile of the Format
 * Format_Compression : Compression mode of the Format
 * MultiView_BaseProfile : Multiview, profile of the base stream
 * MultiView_Count : Multiview, count of views
 * MultiView_Layout : Multiview, how views are muxed in the container in case of it is not muxing in the stream
 * Format_Settings : Settings needed for decoder used, summary
 * Format_Settings_BVOP : Settings needed for decoder used, detailled
 * Format_Settings_BVOP/Stri : Settings needed for decoder used, detailled
 * Format_Settings_QPel : Settings needed for decoder used, detailled
 * Format_Settings_QPel/Stri : Settings needed for decoder used, detailled
 * Format_Settings_GMC : Settings needed for decoder used, detailled
 * Format_Settings_GMC/String
 * Format_Settings_Matrix : Settings needed for decoder used, detailled
 * Format_Settings_Matrix/St : Settings needed for decoder used, detailled
 * Format_Settings_Matrix_Da : Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra
 * Format_Settings_CABAC : Settings needed for decoder used, detailled
 * Format_Settings_CABAC/Str : Settings needed for decoder used, detailled
 * Format_Settings_RefFrames : Settings needed for decoder used, detailled
 * Format_Settings_RefFrames : Settings needed for decoder used, detailled
 * Format_Settings_Pulldown : Settings needed for decoder used, detailled
 * Format_Settings_FrameMode : Settings needed for decoder used, detailled
 * Format_Settings_GOP : Settings needed for decoder used, detailled (M=x N=y)
 * Format_Settings_FrameStru : Settings needed for decoder used, detailled (Type of frame, and field/frame info)
 * Format_Settings_Wrapping : Wrapping mode (Frame wrapped or Clip wrapped)
 * InternetMediaType : Internet Media Type (aka MIME Type, Content-Type)
 * MuxingMode : How this file is muxed in the container
 * CodecID : Codec ID (found in some containers)
 * CodecID/String : Codec ID (found in some containers)
 * CodecID/Info : Info on the codec
 * CodecID/Hint : Hint/popular name for this codec
 * CodecID/Url : Homepage for more details about this codec
 * CodecID_Description : Manual description given by the container
 * Codec : Deprecated, do not use in new projects
 * Codec/String : Deprecated, do not use in new projects
 * Codec/Family : Deprecated, do not use in new projects
 * Codec/Info : Deprecated, do not use in new projects
 * Codec/Url : Deprecated, do not use in new projects
 * Codec/CC : Deprecated, do not use in new projects
 * Codec_Profile : Deprecated, do not use in new projects
 * Codec_Description : Deprecated, do not use in new projects
 * Codec_Settings : Deprecated, do not use in new projects
 * Codec_Settings_PacketBitS : Deprecated, do not use in new projects
 * Codec_Settings_BVOP : Deprecated, do not use in new projects
 * Codec_Settings_QPel : Deprecated, do not use in new projects
 * Codec_Settings_GMC : Deprecated, do not use in new projects
 * Codec_Settings_GMC/String : Deprecated, do not use in new projects
 * Codec_Settings_Matrix : Deprecated, do not use in new projects
 * Codec_Settings_Matrix_Dat : Deprecated, do not use in new projects
 * Codec_Settings_CABAC : Deprecated, do not use in new projects
 * Codec_Settings_RefFrames : Deprecated, do not use in new projects
 * Duration : Play time of the stream in ms
 * Duration/String : Play time in format : XXx YYy only, YYy omited if zero
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
 * BitRate_Mode/String : Bit rate mode (Variable, Cconstant)
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
 * Width : Width (aperture size if present) in pixel
 * Width/String : Width (aperture size if present) with measurement (pixel)
 * Width_Offset : Offset between original width and displayed width (aperture size) in pixel
 * Width_Offset/String : Offset between original width and displayed width (aperture size) in pixel
 * Width_Original : Original (in the raw stream) width in pixel
 * Width_Original/String : Original (in the raw stream) width with measurement (pixel)
 * Height : Height (aperture size if present) in pixel
 * Height/String : Height (aperture size if present) with measurement (pixel)
 * Height_Offset : Offset between original height and displayed height (aperture size) in pixel
 * Height_Offset/String : Offset between original height and displayed height (aperture size) in pixel
 * Height_Original : Original (in the raw stream) height in pixel
 * Height_Original/String : Original (in the raw stream) height with measurement (pixel)
 * PixelAspectRatio : Pixel Aspect ratio
 * PixelAspectRatio/String : Pixel Aspect ratio
 * PixelAspectRatio_Original : Original (in the raw stream) Pixel Aspect ratio
 * PixelAspectRatio_Original : Original (in the raw stream) Pixel Aspect ratio
 * DisplayAspectRatio : Display Aspect ratio
 * DisplayAspectRatio/String : Display Aspect ratio
 * DisplayAspectRatio_Origin : Original (in the raw stream) Display Aspect ratio
 * DisplayAspectRatio_Origin : Original (in the raw stream) Display Aspect ratio
 * ActiveFormatDescription : Active Format Description (AFD value)
 * ActiveFormatDescription/S : Active Format Description (text)
 * ActiveFormatDescription_M : Active Format Description (AFD value) muxing mode (Ancillary or Raw stream)
 * Rotation : Rotation
 * Rotation/String : Rotation (if not horizontal)
 * FrameRate_Mode : Frame rate mode (CFR, VFR)
 * FrameRate_Mode/String : Frame rate mode (Constant, Variable)
 * FrameRate_Mode_Original : Original frame rate mode (CFR, VFR)
 * FrameRate_Mode_Original/S : Original frame rate mode (Constant, Variable)
 * FrameRate : Frames per second
 * FrameRate/String : Frames per second (with measurement)
 * FrameRate_Original : Original (in the raw stream) frames per second
 * FrameRate_Original/String : Original (in the raw stream) frames per second (with measurement)
 * FrameRate_Minimum : Minimum Frames per second
 * FrameRate_Minimum/String : Minimum Frames per second (with measurement)
 * FrameRate_Nominal : Nominal Frames per second
 * FrameRate_Nominal/String : Nominal Frames per second (with measurement)
 * FrameRate_Maximum : Maximum Frames per second
 * FrameRate_Maximum/String : Maximum Frames per second (with measurement)
 * FrameCount : Number of frames
 * Source_FrameCount : Source Number of frames
 * Standard : NTSC or PAL
 * Resolution : Deprecated, do not use in new projects
 * Resolution/String : Deprecated, do not use in new projects
 * Colorimetry : Deprecated, do not use in new projects
 * ColorSpace
 * ChromaSubsampling
 * BitDepth : 16/24/32
 * BitDepth/String : 16/24/32 bits
 * ScanType
 * ScanType/String
 * ScanOrder
 * ScanOrder/String
 * Interlacement : Deprecated, do not use in new projects
 * Interlacement/String : Deprecated, do not use in new projects
 * Compression_Mode : Compression mode (Lossy or Lossless)
 * Compression_Mode/String : Compression mode (Lossy or Lossless)
 * Compression_Ratio : Current stream size divided by uncompressed stream size
 * Bits-(Pixel*Frame) : bits/(Pixel*Frame) (like Gordian Knot)
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
 * Alignment : How this stream file is aligned in the container
 * Alignment/String
 * Title : Name of the track
 * Encoded_Application : Software. Identifies the name of the software package used to create the file, such as Microsoft WaveEdit.
 * Encoded_Application/Url : Software. Identifies the name of the software package used to create the file, such as Microsoft WaveEdit.
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
 * Encoded_Date : UTC time that the encoding of this item was completed began.
 * Tagged_Date : UTC time that the tags were done for this item.
 * Encryption
 * BufferSize : Defines the size of the buffer needed to decode the sequence.
 */

public final class Video {
    /**
     * Format used.
     */
    @Nonnull
    public static final String FORMAT = "Format";
    /**
     * Info about Format.
     */
    @Nonnull
    public static final String FORMAT_INFO = "Format/Info";
    /**
     * Profile of the Format.
     */
    @Nonnull
    public static final String FORMAT_PROFILE = "Format_Profile";
    /**
     * Codec ID (found in some containers).
     */
    @Nonnull
    public static final String CODEC_ID = "CodecID";
    /**
     * Play time of the stream in ms.
     */
    @Nonnull
    public static final String DURATION = "Duration";
    /**
     * Bit rate in bps.
     */
    @Nonnull
    public static final String BITRATE = "BitRate";
    /**
     * Width (aperture size if present) in pixel.
     */
    @Nonnull
    public static final String WIDTH = "Width";
    /**
     * Height (aperture size if present) in pixel.
     */
    @Nonnull
    public static final String HEIGHT = "Height";
    /**
     * Display Aspect ratio.
     */
    @Nonnull
    public static final String DISPLAY_ASPECT_RATIO = "DisplayAspectRatio";
    /**
     * Frames per second.
     */
    @Nonnull
    public static final String FRAME_RATE = "FrameRate";
    /**
     * Language.
     */
    @Nonnull
    public static final String LANGUAGE = "Language/String";

    /**
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
     * Format : Format used
     * Format/Info : Info about Format
     * Format/Url : Link
     * Format_Commercial : Commercial name used by vendor for theses setings or Format field if there is no difference
     * Format_Commercial_IfAny : Commercial name used by vendor for theses setings if there is one
     * Format_Version : Version of this format
     * Format_Profile : Profile of the Format
     * Format_Compression : Compression mode of the Format
     * MultiView_BaseProfile : Multiview, profile of the base stream
     * MultiView_Count : Multiview, count of views
     * MultiView_Layout : Multiview, how views are muxed in the container in case of it is not muxing in the stream
     * Format_Settings : Settings needed for decoder used, summary
     * Format_Settings_BVOP : Settings needed for decoder used, detailled
     * Format_Settings_BVOP/Stri : Settings needed for decoder used, detailled
     * Format_Settings_QPel : Settings needed for decoder used, detailled
     * Format_Settings_QPel/Stri : Settings needed for decoder used, detailled
     * Format_Settings_GMC : Settings needed for decoder used, detailled
     * Format_Settings_GMC/String
     * Format_Settings_Matrix : Settings needed for decoder used, detailled
     * Format_Settings_Matrix/St : Settings needed for decoder used, detailled
     * Format_Settings_Matrix_Da : Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra
     * Format_Settings_CABAC : Settings needed for decoder used, detailled
     * Format_Settings_CABAC/Str : Settings needed for decoder used, detailled
     * Format_Settings_RefFrames : Settings needed for decoder used, detailled
     * Format_Settings_RefFrames : Settings needed for decoder used, detailled
     * Format_Settings_Pulldown : Settings needed for decoder used, detailled
     * Format_Settings_FrameMode : Settings needed for decoder used, detailled
     * Format_Settings_GOP : Settings needed for decoder used, detailled (M=x N=y)
     * Format_Settings_FrameStru : Settings needed for decoder used, detailled (Type of frame, and field/frame info)
     * Format_Settings_Wrapping : Wrapping mode (Frame wrapped or Clip wrapped)
     * InternetMediaType : Internet Media Type (aka MIME Type, Content-Type)
     * MuxingMode : How this file is muxed in the container
     * CodecID : Codec ID (found in some containers)
     * CodecID/String : Codec ID (found in some containers)
     * CodecID/Info : Info on the codec
     * CodecID/Hint : Hint/popular name for this codec
     * CodecID/Url : Homepage for more details about this codec
     * CodecID_Description : Manual description given by the container
     * Codec : Deprecated, do not use in new projects
     * Codec/String : Deprecated, do not use in new projects
     * Codec/Family : Deprecated, do not use in new projects
     * Codec/Info : Deprecated, do not use in new projects
     * Codec/Url : Deprecated, do not use in new projects
     * Codec/CC : Deprecated, do not use in new projects
     * Codec_Profile : Deprecated, do not use in new projects
     * Codec_Description : Deprecated, do not use in new projects
     * Codec_Settings : Deprecated, do not use in new projects
     * Codec_Settings_PacketBitS : Deprecated, do not use in new projects
     * Codec_Settings_BVOP : Deprecated, do not use in new projects
     * Codec_Settings_QPel : Deprecated, do not use in new projects
     * Codec_Settings_GMC : Deprecated, do not use in new projects
     * Codec_Settings_GMC/String : Deprecated, do not use in new projects
     * Codec_Settings_Matrix : Deprecated, do not use in new projects
     * Codec_Settings_Matrix_Dat : Deprecated, do not use in new projects
     * Codec_Settings_CABAC : Deprecated, do not use in new projects
     * Codec_Settings_RefFrames : Deprecated, do not use in new projects
     * Duration : Play time of the stream in ms
     * Duration/String : Play time in format : XXx YYy only, YYy omited if zero
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
     * BitRate_Mode/String : Bit rate mode (Variable, Cconstant)
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
     * Width : Width (aperture size if present) in pixel
     * Width/String : Width (aperture size if present) with measurement (pixel)
     * Width_Offset : Offset between original width and displayed width (aperture size) in pixel
     * Width_Offset/String : Offset between original width and displayed width (aperture size) in pixel
     * Width_Original : Original (in the raw stream) width in pixel
     * Width_Original/String : Original (in the raw stream) width with measurement (pixel)
     * Height : Height (aperture size if present) in pixel
     * Height/String : Height (aperture size if present) with measurement (pixel)
     * Height_Offset : Offset between original height and displayed height (aperture size) in pixel
     * Height_Offset/String : Offset between original height and displayed height (aperture size) in pixel
     * Height_Original : Original (in the raw stream) height in pixel
     * Height_Original/String : Original (in the raw stream) height with measurement (pixel)
     * PixelAspectRatio : Pixel Aspect ratio
     * PixelAspectRatio/String : Pixel Aspect ratio
     * PixelAspectRatio_Original : Original (in the raw stream) Pixel Aspect ratio
     * PixelAspectRatio_Original : Original (in the raw stream) Pixel Aspect ratio
     * DisplayAspectRatio : Display Aspect ratio
     * DisplayAspectRatio/String : Display Aspect ratio
     * DisplayAspectRatio_Origin : Original (in the raw stream) Display Aspect ratio
     * DisplayAspectRatio_Origin : Original (in the raw stream) Display Aspect ratio
     * ActiveFormatDescription : Active Format Description (AFD value)
     * ActiveFormatDescription/S : Active Format Description (text)
     * ActiveFormatDescription_M : Active Format Description (AFD value) muxing mode (Ancillary or Raw stream)
     * Rotation : Rotation
     * Rotation/String : Rotation (if not horizontal)
     * FrameRate_Mode : Frame rate mode (CFR, VFR)
     * FrameRate_Mode/String : Frame rate mode (Constant, Variable)
     * FrameRate_Mode_Original : Original frame rate mode (CFR, VFR)
     * FrameRate_Mode_Original/S : Original frame rate mode (Constant, Variable)
     * FrameRate : Frames per second
     * FrameRate/String : Frames per second (with measurement)
     * FrameRate_Original : Original (in the raw stream) frames per second
     * FrameRate_Original/String : Original (in the raw stream) frames per second (with measurement)
     * FrameRate_Minimum : Minimum Frames per second
     * FrameRate_Minimum/String : Minimum Frames per second (with measurement)
     * FrameRate_Nominal : Nominal Frames per second
     * FrameRate_Nominal/String : Nominal Frames per second (with measurement)
     * FrameRate_Maximum : Maximum Frames per second
     * FrameRate_Maximum/String : Maximum Frames per second (with measurement)
     * FrameCount : Number of frames
     * Source_FrameCount : Source Number of frames
     * Standard : NTSC or PAL
     * Resolution : Deprecated, do not use in new projects
     * Resolution/String : Deprecated, do not use in new projects
     * Colorimetry : Deprecated, do not use in new projects
     * ColorSpace
     * ChromaSubsampling
     * BitDepth : 16/24/32
     * BitDepth/String : 16/24/32 bits
     * ScanType
     * ScanType/String
     * ScanOrder
     * ScanOrder/String
     * Interlacement : Deprecated, do not use in new projects
     * Interlacement/String : Deprecated, do not use in new projects
     * Compression_Mode : Compression mode (Lossy or Lossless)
     * Compression_Mode/String : Compression mode (Lossy or Lossless)
     * Compression_Ratio : Current stream size divided by uncompressed stream size
     * Bits-(Pixel*Frame) : bits/(Pixel*Frame) (like Gordian Knot)
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
     * Alignment : How this stream file is aligned in the container
     * Alignment/String
     * Title : Name of the track
     * Encoded_Application : Software. Identifies the name of the software package used to create the file, such as Microsoft WaveEdit.
     * Encoded_Application/Url : Software. Identifies the name of the software package used to create the file, such as Microsoft WaveEdit.
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
     * Encoded_Date : UTC time that the encoding of this item was completed began.
     * Tagged_Date : UTC time that the tags were done for this item.
     * Encryption
     * BufferSize : Defines the size of the buffer needed to decode the sequence.
     */

    private Video() {
        // Singleton
    }
}
