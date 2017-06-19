package aka.jmetadata.main.helper;

import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.video.AspectRatio;
import aka.jmetadata.main.constants.video.Resolution;
import aka.swissknife.data.MathUtils;

/**
 * Media info(s) helper
 *
 * @author Charlotte
 */
public class MediaInfoHelper {

    private MediaInfoHelper() {
        // nothing to do
    }

    /**
     * Return the closest {@link AspectRatio} based on width and height
     *
     * @param width
     * @param height
     * @return {@link AspectRatio}
     */
    @Nullable
    public static AspectRatio getClosestRatio(@Nullable final Long width, @Nullable final Long height) {
        final double ratio = calculateRatio(width, height);

        return getClosestRatio(ratio);
    }

    /**
     * Return the closest {@link AspectRatio} based on width and height
     *
     * @param aspectRatio
     *
     * @return {@link AspectRatio}
     */
    @Nullable
    public static AspectRatio getClosestRatio(final double aspectRatio) {
        final AspectRatio result = AspectRatio.getClosestAspectRatio(aspectRatio);

        return result;
    }

    /**
     * Return the closest {@link Resolution} based on resolution
     *
     * @param resolution double
     * @return {@link Resolution}
     */
    @Nullable
    public static Resolution getClosestResolution(final double resolution) {
        final Resolution result = Resolution.getClosestResolution(resolution);

        return result;
    }

    private static double calculateRatio(@Nullable final Long width, @Nullable final Long height) {
        double result = 0;
        if (width != null && height != null) {
            if (!MathUtils.isZero(Double.valueOf(width.doubleValue())) && !MathUtils.isZero(Double.valueOf(height.doubleValue()))) {
                final double w = width.doubleValue();
                final double h = height.doubleValue();

                result = w / h;
            }
        }

        return result;
    }

}
