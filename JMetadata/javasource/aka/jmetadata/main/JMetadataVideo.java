package aka.jmetadata.main;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.constants.Video;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract video informations of a specific video stream.
 *
 * @author Charlotte
 */
public final class JMetadataVideo extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo instance of mediainfo JNA library
     * @param streamNumber number of the stream to parse
     * @see MediaInfo
     */
    public JMetadataVideo(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Video, mediaInfo, streamNumber);
    }

    /**
     * Get Width (aperture size if present) in pixel.
     *
     * @return Width (aperture size if present) in pixel
     */
    @Nullable
    public Integer getWidth() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

    /**
     * Get Height (aperture size if present) in pixel.
     *
     * @return Height (aperture size if present) in pixel
     */
    @Nullable
    public Integer getHeight() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

    /**
     * Get the Display Aspect ratio use of the video.
     *
     * @return Display Aspect ratio
     */
    @Nullable
    public Double getDisplayAspectRatio() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.DISPLAY_ASPECT_RATIO);
    }

    /**
     * Get play time in format : HH:MM:SS:FF (HH:MM:SS).
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType4() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.DURATION_STRING4);
    }

    /**
     * Get multiview, profile of the base stream.
     *
     * @return profile of the base stream
     */
    @Nullable
    public String getMultiviewBaseProfile() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.MULTIVIEW_BASEPROFILE);
    }

    /**
     * Get multiview, count of views.
     *
     * @return count of views
     */
    @Nullable
    public Integer getMultiviewCount() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEW_COUNT);
    }

    /**
     * Get multiview, how views are muxed in the container in case of it is not muxing in the stream.
     *
     * @return how views are muxed in the container in case of it is not muxing in the stream
     */
    @Nullable
    public String getMultiviewLayout() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.MULTIVIEW_LAYOUT);
    }

    /**
     * Get original (in the raw stream) width in pixel.
     *
     * @return original (in the raw stream) width
     */
    @Nullable
    public Long getWidthOriginal() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTH_ORIGINAL);
    }

    /**
     * Get original (in the raw stream) width with measurement (pixel).
     *
     * @return original (in the raw stream) width
     */
    @Nullable
    public String getWidthOriginalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.WIDTH_ORIGINAL_STRING);
    }

    /**
     * Get height (aperture size if present) with measurement (pixel).
     *
     * @return height
     */
    @Nullable
    public String getHeightString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.HEIGHT_STRING);
    }

    /**
     * Get offset between original height and displayed height (aperture size) in pixel.
     *
     * @return offset between original height and displayed height
     */
    @Nullable
    public Long getHeightOffset() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHT_OFFSET);
    }

    /**
     * Get offset between original height and displayed height (aperture size) in pixel.
     *
     * @return offset between original height and displayed height
     */
    @Nullable
    public String getHeightOffsetString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.HEIGHT_OFFSET_STRING);
    }

    /**
     * Get original (in the raw stream) height in pixel.
     *
     * @return original (in the raw stream) height
     */
    @Nullable
    public Long getHeightOriginal() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHT_ORIGINAL);
    }

    /**
     * Get original (in the raw stream) height with measurement (pixel).
     *
     * @return original (in the raw stream) height
     */
    @Nullable
    public String getHeightOriginalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.HEIGHT_ORIGINAL_STRING);
    }

    /**
     * Get pixel aspect ratio.
     *
     * @return pixel aspect ratio
     */
    @Nullable
    public Double getPixelAspectRatio() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.PIXEL_ASPECT_RATIO);
    }

    /**
     * Get pixel aspect ratio with measurement (pixel).
     *
     * @return pixel aspect ratio
     */
    @Nullable
    public String getPixelAspectRatioString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.PIXEL_ASPECT_RATIO_STRING);
    }

    /**
     * Get original pixel aspect ratio.
     *
     * @return original pixel aspect ratio
     */
    @Nullable
    public Double getPixelAspectRatioOriginal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.PIXEL_ASPECT_RATIO_ORIGINAL);
    }

    /**
     * Get original pixel aspect ratio with measurement (pixel).
     *
     * @return original pixel aspect ratio
     */
    @Nullable
    public String getPixelAspectRatioOriginalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.PIXEL_ASPECT_RATIO_ORIGINAL_STRING);
    }

    /**
     * Get display aspect ratio.
     *
     * @return display aspect ratio
     */
    @Nullable
    public String getDisplayAspectRatioString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.DISPLAY_ASPECT_RATIO_STRING);
    }

    /**
     * Get original display aspect ratio.
     *
     * @return original display aspect ratio
     */
    @Nullable
    public Double getDisplayAspectRatioOriginal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.DISPLAY_ASPECT_RATIO_ORIGINAL);
    }

    /**
     * Get original display aspect ratio with measurement (pixel).
     *
     * @return original display aspect ratio
     */
    @Nullable
    public String getDisplayAspectRatioOriginalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.DISPLAY_ASPECT_RATIO_ORIGINAL_STRING);
    }

    /**
     * Get Active Format Description (AFD value).
     *
     * @return Active Format Description
     */
    @Nullable
    public String getActiveFormatDescription() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.ACTIVE_FORMAT_DESCRIPTION);
    }

    /**
     * Get Active Format Description (text).
     *
     * @return Active Format Description
     */
    @Nullable
    public String getActiveFormatDescriptionString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.ACTIVE_FORMAT_DESCRIPTION_STRING);
    }

    /**
     * Get rotation.
     *
     * @return rotation
     */
    @Nullable
    public String getRotation() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

    /**
     * Get rotation (if not horizontal).
     *
     * @return rotation
     */
    @Nullable
    public String getRotationString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.ROTATION_STRING);
    }

    /**
     * Get frame rate mode (CFR, VFR).
     *
     * @return frame rate mode (CFR, VFR)
     */
    @Nullable
    public String getFrameRateMode() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MODE);
    }

    /**
     * Get frame rate mode (Constant, Variable).
     *
     * @return frame rate mode (Constant, Variable)
     */
    @Nullable
    public String getFrameRateModeString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MODE_STRING);
    }

    /**
     * Get original frame rate mode (CFR, VFR).
     *
     * @return original frame rate mode (CFR, VFR)
     */
    @Nullable
    public String getFrameRateModeOriginal() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MODE_ORIGINAL);
    }

    /**
     * Get original frame rate mode (Constant, Variable).
     *
     * @return original frame rate mode (Constant, Variable)
     */
    @Nullable
    public String getFrameRateModeOriginalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MODE_ORIGINAL_STRING);
    }

    /**
     * Get original (in the raw stream) frames per second.
     *
     * @return original (in the raw stream) frames per second
     */
    @Nullable
    public Double getFrameRateOriginal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_ORIGINAL);
    }

    /**
     * Get original (in the raw stream) frames per second (with measurement).
     *
     * @return original (in the raw stream) frames per second
     */
    @Nullable
    public String getFrameRateOriginalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_ORIGINAL_STRING);
    }

    /**
     * Get minimum frames per second.
     *
     * @return minimum frames per second
     */
    @Nullable
    public Double getFrameRateMinimum() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MINIMUM);
    }

    /**
     * Get minimum frames per second (with measurement).
     *
     * @return minimum frames per second
     */
    @Nullable
    public String getFrameRateMinimumString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MINIMUM_STRING);
    }

    /**
     * Get nominal frames per second.
     *
     * @return nominal frames per second
     */
    @Nullable
    public Double getFrameRateNominal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_NOMINAL);
    }

    /**
     * Get nominal frames per second (with measurement).
     *
     * @return nominal frames per second
     */
    @Nullable
    public String getFrameRateNominalString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_NOMINAL_STRING);
    }

    /**
     * Get maximum frames per second.
     *
     * @return maximum frames per second
     */
    @Nullable
    public Double getFrameRateMaximum() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MAXIMUM);
    }

    /**
     * Get maximum frames per second (with measurement).
     *
     * @return maximum frames per second
     */
    @Nullable
    public String getFrameRateMaximumString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.FRAMERATE_MAXIMUM_STRING);
    }

    /**
     * Get standard (NTSC or PAL).
     *
     * @return standard
     */
    @Nullable
    public String getStandard() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

    /**
     * Get color space.
     *
     * @return color space
     */
    @Nullable
    public String getColorSpace() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

    /**
     * Get chroma subsampling.
     *
     * @return chroma subsampling
     */
    @Nullable
    public String getChromaSubsampling() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

    /**
     * Get scantype.
     *
     * @return scantype
     */
    @Nullable
    public String getScanType() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

    /**
     * Get scantype.
     *
     * @return scantype
     */
    @Nullable
    public String getScanTypeString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.SCANTYPE_STRING);
    }

    /**
     * Get scanorder.
     *
     * @return scanorder
     */
    @Nullable
    public String getScanOrder() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

    /**
     * Get scanorder.
     *
     * @return scanorder
     */
    @Nullable
    public String getScanOrderString() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.SCANORDER_STRING);
    }

    /**
     * Get bits/(Pixel*Frame) (like Gordian Knot).
     *
     * @return bits/(Pixel*Frame)
     */
    @Nullable
    public Double getBitsDividedPixelsFrame() {
        return getMediaInfo().getAsDouble(StreamKind.Video, getStreamNumber(), Video.BITS_DIVIDED_PIXELSFRAME);
    }

    /**
     * Get the size of the buffer needed to decode the sequence.
     *
     * @return the size of the buffer needed to decode the sequence.
     */
    @Nullable
    public String getBufferSize() {
        return getMediaInfo().get(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }
}
