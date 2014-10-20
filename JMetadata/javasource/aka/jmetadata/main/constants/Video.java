package aka.jmetadata.main.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Video constants parameters.
 *
 * @author Charlotte
 */
public final class Video {
    /**
     * Width (aperture size if present) in pixel.
     */
    @NonNull
    public static final String WIDTH = "Width";
    /**
     * Height (aperture size if present) in pixel.
     */
    @NonNull
    public static final String HEIGHT = "Height";
    /**
     * Display Aspect ratio.
     */
    @NonNull
    public static final String DISPLAY_ASPECT_RATIO = "DisplayAspectRatio";
    /**
     * Play time in format : HH:MM:SS:FF (HH:MM:SS.
     */
    @NonNull
    public static final String DURATION_STRING4 = "Duration/String4";
    /**
     * Multiview, profile of the base stream.
     */
    @NonNull
    public static final String MULTIVIEW_BASEPROFILE = "MultiView_BaseProfile";
    /**
     * Multiview, count of views.
     */
    @NonNull
    public static final String MULTIVIEW_COUNT = "MultiView_Count";
    /**
     * Multiview, how views are muxed in the container in case of it is not muxing in the stream.
     */
    @NonNull
    public static final String MULTIVIEW_LAYOUT = "MultiView_Layout";
    /**
     * Width (aperture size if present) with measurement (pixel).
     */
    @NonNull
    public static final String WIDTH_STRING = "Width/String";
    /**
     * Offset between original width and displayed width (aperture size) in pixel.
     */
    @NonNull
    public static final String WIDTH_OFFSET = "Width_Offset";
    /**
     * Offset between original width and displayed width (aperture size) in pixel.
     */
    @NonNull
    public static final String WIDTH_OFFSET_STRING = "Width_Offset/String";
    /**
     * Original (in the raw stream) width in pixel.
     */
    @NonNull
    public static final String WIDTH_ORIGINAL = "Width_Original";
    /**
     * Original (in the raw stream) width with measurement (pixel).
     */
    @NonNull
    public static final String WIDTH_ORIGINAL_STRING = "Width_Original/String";
    /**
     * Height (aperture size if present) with measurement (pixel).
     */
    @NonNull
    public static final String HEIGHT_STRING = "Height/String";
    /**
     * Offset between original height and displayed height (aperture size) in pixel.
     */
    @NonNull
    public static final String HEIGHT_OFFSET = "Height_Offset";
    /**
     * Offset between original height and displayed height (aperture size) in pixel.
     */
    @NonNull
    public static final String HEIGHT_OFFSET_STRING = "Height_Offset/String";
    /**
     * Original (in the raw stream) height in pixel.
     */
    @NonNull
    public static final String HEIGHT_ORIGINAL = "Height_Original";
    /**
     * Original (in the raw stream) height with measurement (pixel).
     */
    @NonNull
    public static final String HEIGHT_ORIGINAL_STRING = "Height_Original/String";
    /**
     * Pixel Aspect ratio.
     */
    @NonNull
    public static final String PIXEL_ASPECT_RATIO = "PixelAspectRatio";
    /**
     * Pixel Aspect ratio.
     */
    @NonNull
    public static final String PIXEL_ASPECT_RATIO_STRING = "PixelAspectRatio/String";
    /**
     * Original (in the raw stream) Pixel Aspect ratio.
     */
    @NonNull
    public static final String PIXEL_ASPECT_RATIO_ORIGINAL = "PixelAspectRatio_Original";
    /**
     * Original (in the raw stream) Pixel Aspect ratio.
     */
    @NonNull
    public static final String PIXEL_ASPECT_RATIO_ORIGINAL_STRING = "PixelAspectRatio_Original/String";
    /**
     * Display Aspect ratio.
     */
    @NonNull
    public static final String DISPLAY_ASPECT_RATIO_STRING = "DisplayAspectRatio/String";
    /**
     * Original (in the raw stream) Display Aspect ratio.
     */
    @NonNull
    public static final String DISPLAY_ASPECT_RATIO_ORIGINAL = "DisplayAspectRatio_Original";
    /**
     * Original (in the raw stream) Display Aspect ratio.
     */
    @NonNull
    public static final String DISPLAY_ASPECT_RATIO_ORIGINAL_STRING = "DisplayAspectRatio_Original/String";
    /**
     * Active Format Description (AFD value).
     */
    @NonNull
    public static final String ACTIVE_FORMAT_DESCRIPTION = "ActiveFormatDescription";
    /**
     * Active Format Description (text).
     */
    @NonNull
    public static final String ACTIVE_FORMAT_DESCRIPTION_STRING = "ActiveFormatDescription/String";
    /**
     * Rotation.
     */
    @NonNull
    public static final String ROTATION = "Rotation";
    /**
     * Rotation (if not horizontal).
     */
    @NonNull
    public static final String ROTATION_STRING = "Rotation/String";
    /**
     * Frame rate mode (CFR, VFR).
     */
    @NonNull
    public static final String FRAMERATE_MODE = "FrameRate_Mode";
    /**
     * Frame rate mode (Constant, Variable).
     */
    @NonNull
    public static final String FRAMERATE_MODE_STRING = "FrameRate_Mode/String";
    /**
     * Original frame rate mode (CFR, VFR).
     */
    @NonNull
    public static final String FRAMERATE_MODE_ORIGINAL = "FrameRate_Mode_Original";
    /**
     * Original frame rate mode (Constant, Variable).
     */
    @NonNull
    public static final String FRAMERATE_MODE_ORIGINAL_STRING = "FrameRate_Mode_Original/String";
    /**
     * Original (in the raw stream) frames per second.
     */
    @NonNull
    public static final String FRAMERATE_ORIGINAL = "FrameRate_Original";
    /**
     * Original (in the raw stream) frames per second (with measurement).
     */
    @NonNull
    public static final String FRAMERATE_ORIGINAL_STRING = "FrameRate_Original/String";
    /**
     * Minimum Frames per second.
     */
    @NonNull
    public static final String FRAMERATE_MINIMUM = "FrameRate_Minimum";
    /**
     * Minimum Frames per second (with measurement).
     */
    @NonNull
    public static final String FRAMERATE_MINIMUM_STRING = "FrameRate_Minimum/String";
    /**
     * Nominal Frames per second.
     */
    @NonNull
    public static final String FRAMERATE_NOMINAL = "FrameRate_Nominal";
    /**
     * Nominal Frames per second (with measurement).
     */
    @NonNull
    public static final String FRAMERATE_NOMINAL_STRING = "FrameRate_Nominal/String";
    /**
     * Maximum Frames per second.
     */
    @NonNull
    public static final String FRAMERATE_MAXIMUM = "FrameRate_Maximum";
    /**
     * Maximum Frames per second (with measurement).
     */
    @NonNull
    public static final String FRAMERATE_MAXIMUM_STRING = "FrameRate_Maximum/String";
    /**
     * NTSC or PAL.
     */
    @NonNull
    public static final String STANDARD = "Standard";
    /**
     * ColorSpace.
     */
    @NonNull
    public static final String COLORSPACE = "ColorSpace";
    /**
     * ChromaSubsampling.
     */
    @NonNull
    public static final String CHROMASUBSAMPLING = "ChromaSubsampling";
    /**
     * ScanType.
     */
    @NonNull
    public static final String SCANTYPE = "ScanType";
    /**
     * ScanType.
     */
    @NonNull
    public static final String SCANTYPE_STRING = "ScanType/String";
    /**
     * ScanOrder.
     */
    @NonNull
    public static final String SCANORDER = "ScanOrder";
    /**
     * ScanOrder.
     */
    @NonNull
    public static final String SCANORDER_STRING = "ScanOrder/String";
    /**
     * bits/(Pixel*Frame) (like Gordian Knot).
     */
    @NonNull
    public static final String BITS_DIVIDED_PIXELSFRAME = "Bits-(Pixel*Frame)";
    /**
     * Defines the size of the buffer needed to decode the sequence.
     */
    @NonNull
    public static final String BUFFERSIZE = "BufferSize";

    private Video() {
        // Singleton
    }
}
