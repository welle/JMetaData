package aka.jmetadata.main;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.constants.Text;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * A test for the various media information functions.
 * <p>
 * For regular media files (like ".mpg" or ".avi") the track information is available after the media has been parsed (or played).
 * <p>
 * For DVD media files (like ".iso" files) the track information is not available after the media has been parsed, a video output must have been created, and even then the video track width/height
 * might not be available until a short time later.
 * <p>
 * In all cases, the other functions for title, video, audio and chapter descriptions require that a video output has been created before they return valid information.
 */
public final class JMetadataSubtitle extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     */
    public JMetadataSubtitle(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Text, mediaInfo, streamNumber);
    }

    /**
     * Get color space.
     *
     * @return color space
     */
    @Nullable
    public String getColorSpace() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

    /**
     * Get chroma subsampling.
     *
     * @return chroma subsampling
     */
    @Nullable
    public String getChromaSubsampling() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

    /**
     * Get Width (aperture size if present) in pixel.
     *
     * @return Width (aperture size if present) in pixel
     */
    @Nullable
    public Integer getWidth() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

    /**
     * Get Height (aperture size if present) in pixel.
     *
     * @return Height (aperture size if present) in pixel
     */
    @Nullable
    public Integer getHeight() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

    /**
     * Get delay fixed in the stream (absolute / video).
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public Integer getVideoDelay() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEO_DELAY);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayString() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.VIDEO_DELAY_STRING);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType1() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.VIDEO_DELAY_STRING_TYPE1);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType2() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.VIDEO_DELAY_STRING_TYPE2);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType3() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.VIDEO_DELAY_STRING_TYPE3);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType4() {
        return getMediaInfo().get(StreamKind.Text, getStreamNumber(), Text.VIDEO_DELAY_STRING_TYPE4);
    }
}
