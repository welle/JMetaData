package aka.jmetadata.main.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Text constants parameters.
 *
 * @author Charlotte
 */
public final class Text {
    /**
     * Width.
     */
    @NonNull
    public static final String WIDTH = "Width";
    /**
     * Height.
     */
    @NonNull
    public static final String HEIGHT = "Height";
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
     * Delay fixed in the stream (absolute / video).
     */
    @NonNull
    public static final String VIDEO_DELAY = "Video_Delay";
    /**
     * Delay fixed in the stream.
     */
    @NonNull
    public static final String VIDEO_DELAY_STRING = "Video_Delay/String";
    /**
     * Delay fixed in the stream.
     */
    @NonNull
    public static final String VIDEO_DELAY_STRING_TYPE1 = "Video_Delay/String1";
    /**
     * Delay fixed in the stream.
     */
    @NonNull
    public static final String VIDEO_DELAY_STRING_TYPE2 = "Video_Delay/String2";
    /**
     * Delay fixed in the stream.
     */
    @NonNull
    public static final String VIDEO_DELAY_STRING_TYPE3 = "Video_Delay/String3";
    /**
     * Delay fixed in the stream.
     */
    @NonNull
    public static final String VIDEO_DELAY_STRING_TYPE4 = "Video_Delay/String4";

    private Text() {
        // Singleton
    }
}
