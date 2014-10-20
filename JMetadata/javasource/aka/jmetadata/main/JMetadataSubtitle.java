package aka.jmetadata.main;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.constants.Text;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract subtitle informations of a specific subtitle stream.
 *
 * @author Charlotte
 */
public final class JMetadataSubtitle extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo instance of mediainfo JNA library
     * @param streamNumber number of the stream to parse
     * @see MediaInfo
     */
    public JMetadataSubtitle(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
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
