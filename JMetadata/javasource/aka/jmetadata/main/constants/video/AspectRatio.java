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
    UNKOWN("UNKOWN", 0),

    /**
     * 1:33
     */
    AS_1_33("1.33", 1.33),

    /**
     * 1:66
     */
    AS_1_66("1.66", 1.66),

    /**
     * 1:78
     */
    AS_1_78("1.78", 1.78),

    /**
     * 1:85
     */
    AS_1_85("1.85", 1.85),

    /**
     * 2:20
     */
    AS_2_20("2.20", 2.20),

    /**
     * 2:35
     */
    AS_2_35("2.35", 2.35);

    private @NonNull String aspectRationName;
    private double aspectRatio;

    private AspectRatio(@NonNull final String aspectRationName, final double aspectRatio) {
        this.aspectRationName = aspectRationName;
        this.aspectRatio = aspectRatio;
    }

    /**
     * @return the aspect ration
     */
    @NonNull
    public final String getAspectRatioName() {
        return this.aspectRationName;
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