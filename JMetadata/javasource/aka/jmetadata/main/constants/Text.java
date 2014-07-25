package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * Text
 */

public final class Text {
    /**
     * Width.
     */
    @Nonnull
    public static final String WIDTH = "Width";
    /**
     * Height.
     */
    @Nonnull
    public static final String HEIGHT = "Height";
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
     * Delay fixed in the stream (absolute / video).
     */
    @Nonnull
    public static final String VIDEO_DELAY = "Video_Delay";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING = "Video_Delay/String";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE1 = "Video_Delay/String1";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE2 = "Video_Delay/String2";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE3 = "Video_Delay/String3";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE4 = "Video_Delay/String4";

    private Text() {
        // Singleton
    }
}
