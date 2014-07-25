package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * Video
 *
 */

public final class Video {
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
     * Play time in format : HH:MM:SS:FF (HH:MM:SS.
     */
    @Nonnull
    public static final String DURATION_STRING4 = "Duration/String4";
    /**
     * Multiview, profile of the base stream.
     */
    @Nonnull
    public static final String MULTIVIEW_BASEPROFILE = "MultiView_BaseProfile";
    /**
     * Multiview, count of views.
     */
    @Nonnull
    public static final String MULTIVIEW_COUNT = "MultiView_Count";
    /**
     * Multiview, how views are muxed in the container in case of it is not muxing in the stream.
     */
    @Nonnull
    public static final String MULTIVIEW_LAYOUT = "MultiView_Layout";
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
     * Width (aperture size if present) with measurement (pixel).
     */
    @Nonnull
    public static final String WIDTH_STRING = "Width/String";
    /**
     * Offset between original width and displayed width (aperture size) in pixel.
     */
    @Nonnull
    public static final String WIDTH_OFFSET = "Width_Offset";
    /**
     * Offset between original width and displayed width (aperture size) in pixel.
     */
    @Nonnull
    public static final String WIDTH_OFFSET_STRING = "Width_Offset/String";
    /**
     * Original (in the raw stream) width in pixel.
     */
    @Nonnull
    public static final String WIDTH_ORIGINAL = "Width_Original";
    /**
     * Original (in the raw stream) width with measurement (pixel).
     */
    @Nonnull
    public static final String WIDTH_ORIGINAL_STRING = "Width_Original/String";
    /**
     * Height (aperture size if present) with measurement (pixel).
     */
    @Nonnull
    public static final String HEIGHT_STRING = "Height/String";
    /**
     * Offset between original height and displayed height (aperture size) in pixel.
     */
    @Nonnull
    public static final String HEIGHT_OFFSET = "Height_Offset";
    /**
     * Offset between original height and displayed height (aperture size) in pixel.
     */
    @Nonnull
    public static final String HEIGHT_OFFSET_STRING = "Height_Offset/String";
    /**
     * Original (in the raw stream) height in pixel.
     */
    @Nonnull
    public static final String HEIGHT_ORIGINAL = "Height_Original";
    /**
     * Original (in the raw stream) height with measurement (pixel).
     */
    @Nonnull
    public static final String HEIGHT_ORIGINAL_STRING = "Height_Original/String";
    /**
     * Pixel Aspect ratio.
     */
    @Nonnull
    public static final String PIXEL_ASPECT_RATIO = "PixelAspectRatio";
    /**
     * Pixel Aspect ratio.
     */
    @Nonnull
    public static final String PIXEL_ASPECT_RATIO_STRING = "PixelAspectRatio/String";
    /**
     * Original (in the raw stream) Pixel Aspect ratio.
     */
    @Nonnull
    public static final String PIXEL_ASPECT_RATIO_ORIGINAL = "PixelAspectRatio_Original";
    /**
     * Original (in the raw stream) Pixel Aspect ratio.
     */
    @Nonnull
    public static final String PIXEL_ASPECT_RATIO_ORIGINAL_STRING = "PixelAspectRatio_Original/String";
    /**
     * Display Aspect ratio.
     */
    @Nonnull
    public static final String DISPLAY_ASPECT_RATIO_STRING = "DisplayAspectRatio/String";
    /**
     * Original (in the raw stream) Display Aspect ratio.
     */
    @Nonnull
    public static final String DISPLAY_ASPECT_RATIO_ORIGINAL = "DisplayAspectRatio_Original";
    /**
     * Original (in the raw stream) Display Aspect ratio.
     */
    @Nonnull
    public static final String DISPLAY_ASPECT_RATIO_ORIGINAL_STRING = "DisplayAspectRatio_Original/String";
    /**
     * Active Format Description (AFD value).
     */
    @Nonnull
    public static final String ACTIVE_FORMAT_DESCRIPTION = "ActiveFormatDescription";
    /**
     * Active Format Description (text).
     */
    @Nonnull
    public static final String ACTIVE_FORMAT_DESCRIPTION_STRING = "ActiveFormatDescription/String";
    /**
     * Rotation.
     */
    @Nonnull
    public static final String ROTATION = "Rotation";
    /**
     * Rotation (if not horizontal).
     */
    @Nonnull
    public static final String ROTATION_STRING = "Rotation/String";
    /**
     * Frame rate mode (CFR, VFR).
     */
    @Nonnull
    public static final String FRAMERATE_MODE = "FrameRate_Mode";
    /**
     * Frame rate mode (Constant, Variable).
     */
    @Nonnull
    public static final String FRAMERATE_MODE_STRING = "FrameRate_Mode/String";
    /**
     * Original frame rate mode (CFR, VFR).
     */
    @Nonnull
    public static final String FRAMERATE_MODE_ORIGINAL = "FrameRate_Mode_Original";
    /**
     * Original frame rate mode (Constant, Variable).
     */
    @Nonnull
    public static final String FRAMERATE_MODE_ORIGINAL_STRING = "FrameRate_Mode_Original/String";
    /**
     * Frames per second (with measurement).
     */
    @Nonnull
    public static final String FRAMERATE_STRING = " FrameRate/String";
    /**
     * Original (in the raw stream) frames per second.
     */
    @Nonnull
    public static final String FRAMERATE_ORIGINAL = "FrameRate_Original";
    /**
     * Original (in the raw stream) frames per second (with measurement).
     */
    @Nonnull
    public static final String FRAMERATE_ORIGINAL_STRING = "FrameRate_Original/String";
    /**
     * Minimum Frames per second.
     */
    @Nonnull
    public static final String FRAMERATE_MINIMUM = "FrameRate_Minimum";
    /**
     * Minimum Frames per second (with measurement).
     */
    @Nonnull
    public static final String FRAMERATE_MINIMUM_STRING = "FrameRate_Minimum/String";
    /**
     * Nominal Frames per second.
     */
    @Nonnull
    public static final String FRAMERATE_NOMINAL = "FrameRate_Nominal";
    /**
     * Nominal Frames per second (with measurement).
     */
    @Nonnull
    public static final String FRAMERATE_NOMINAL_STRING = "FrameRate_Nominal/String";
    /**
     * Maximum Frames per second.
     */
    @Nonnull
    public static final String FRAMERATE_MAXIMUM = "FrameRate_Maximum";
    /**
     * Maximum Frames per second (with measurement).
     */
    @Nonnull
    public static final String FRAMERATE_MAXIMUM_STRING = "FrameRate_Maximum/String";
    /**
     * Number of frames.
     */
    @Nonnull
    public static final String FRAMECOUNT = "FrameCount";
    /**
     * Source Number of frames.
     */
    @Nonnull
    public static final String SOURCE_FRAMECOUNT = "Source_FrameCount";
    /**
     * NTSC or PAL.
     */
    @Nonnull
    public static final String STANDARD = "Standard";
    /**
     * ColorSpace.
     */
    @Nonnull
    public static final String COLORSPACE = "ColorSpace";
    /**
     * ChromaSubsampling.
     */
    @Nonnull
    public static final String CHROMASUBSAMPLING = "ChromaSubsampling";
    /**
     * BitDepth (16/24/32).
     */
    @Nonnull
    public static final String BITDEPTH = "BitDepth";
    /**
     * BitDepth (16/24/32 bits).
     */
    @Nonnull
    public static final String BITDEPTH_STRING = "BitDepth/String";
    /**
     * ScanType.
     */
    @Nonnull
    public static final String SCANTYPE = "ScanType";
    /**
     * ScanType.
     */
    @Nonnull
    public static final String SCANTYPE_STRING = "ScanType/String";
    /**
     * ScanOrder.
     */
    @Nonnull
    public static final String SCANORDER = "ScanOrder";
    /**
     * ScanOrder.
     */
    @Nonnull
    public static final String SCANORDER_STRING = "ScanOrder/String";
    /**
     * bits/(Pixel*Frame) (like Gordian Knot).
     */
    @Nonnull
    public static final String BITS_DIVIDED_PIXELSFRAME = "Bits-(Pixel*Frame)";
    /**
     * Defines the size of the buffer needed to decode the sequence.
     */
    @Nonnull
    public static final String BUFFERSIZE = "BufferSize";

    private Video() {
        // Singleton
    }
}
