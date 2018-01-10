package aka.jmetadata.main.constants.video;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Aspect Ratio
 */
public enum AspectRatio {
    /**
     * Unknown
     */
    UNKOWN("UNKOWN", 0, "UNKOWN"),

    /**
     * 5/4 (1.25:1)
     */
    AS_1_25("1.25", 1.25, "5/4"),

    /**
     * 4/3 (1.33:1)
     */
    AS_1_333("1.333", 1.333, "4/3"),

    /**
     * IMAX (1.43:1)
     */
    AS_1_43("1.43", 1.43, "IMAX"),

    /**
     * 5/3 (1.66:1)
     */
    AS_1_66("1.66", 1.66, "5/3"),

    /**
     * 16/9 (1.77:1)
     */
    AS_1_778("1.778", 1.778, "16/9"),

    /**
     * 35 mm US and UK widescreen standard for theatrical film (1.85:1)
     */
    AS_1_85("1.85", 1.85, "35 mm US and UK widescreen standard for theatrical film"),

    /**
     * 11/5 (2.20:1)
     */
    AS_2_20("2.20", 2.20, "11/5"),

    /**
     * 21/9 (2.35:1)
     */
    AS_2_35("2.35", 2.35, "21/9");

    private @NonNull String aspectRationName;
    private @NonNull String fullName;
    private double aspectRatio;

    private AspectRatio(@NonNull final String aspectRationName, final double aspectRatio, @NonNull final String fullName) {
        this.aspectRationName = aspectRationName;
        this.fullName = fullName;
        this.aspectRatio = aspectRatio;
    }

    /**
     * @return the aspect ratio
     */
    @NonNull
    public final String getAspectRatioName() {
        return this.aspectRationName;
    }

    /**
     * @return the aspect ratio full name
     */
    @NonNull
    public final String getAspectRatioFullName() {
        return this.fullName;
    }

    /**
     * @return the aspectRatio
     */
    public final double getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * Get related aspect ratio.
     *
     * @param param
     * @return related resolution
     */
    @Nullable
    public static AspectRatio getResolution(final float param) {
        AspectRatio result = null;
        for (final AspectRatio aspectRatio : values()) {
            if (aspectRatio.aspectRatio == param) {
                result = aspectRatio;
                break;
            }
        }
        return result;
    }

    /**
     * Get closest aspect ratio.
     *
     * @param param
     * @return closest aspect ratio
     */
    @Nullable
    public static AspectRatio getClosestAspectRatio(final double param) {
        AspectRatio result = null;
        double min = Double.MAX_VALUE;
        for (final AspectRatio aspectRation : values()) {
            final double v = aspectRation.getAspectRatio();
            final double diff = Math.abs(v - param);

            if (diff < min) {
                min = diff;
                result = aspectRation;
            }
        }
        return result;
    }

}