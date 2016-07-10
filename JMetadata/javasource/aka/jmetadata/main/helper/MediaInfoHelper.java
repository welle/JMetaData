package aka.jmetadata.main.helper;

import java.util.Map.Entry;

import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.CodecVideoConstants;
import aka.jmetadata.main.constants.CodecVideoConstants.ASPECT_RATIO;
import aka.jmetadata.main.constants.CodecVideoConstants.RESOLUTION;
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
     * Return the closest {@link ASPECT_RATIO} based on width and height
     *
     * @param width
     * @param height
     * @return {@link ASPECT_RATIO}
     */
    @Nullable
    public static ASPECT_RATIO getClosestRatio(final Long width, final Long height) {
        final double ratio = calculateRatio(width, height);

        return getClosestRatio(ratio);
    }

    /**
     * Return the closest {@link ASPECT_RATIO} based on width and height
     *
     * @param aspectRatio
     *
     * @return {@link ASPECT_RATIO}
     */
    @Nullable
    public static ASPECT_RATIO getClosestRatio(final double aspectRatio) {
        double min = Float.MAX_VALUE;
        ASPECT_RATIO result = null;

        for (final Entry<ASPECT_RATIO, Float> item : CodecVideoConstants.ASPECT_RATIO_VALUE.entrySet()) {
            final ASPECT_RATIO aRatio = item.getKey();
            final Float v = item.getValue();
            final double diff = Math.abs(v.floatValue() - aspectRatio);

            if (diff < min) {
                min = diff;
                result = aRatio;
            }
        }

        return result;
    }

    /**
     * Return the closest {@link RESOLUTION} based on resolution
     *
     * @param resolution double
     * @return {@link RESOLUTION}
     */
    @Nullable
    public static RESOLUTION getClosestResolution(final double resolution) {
        double min = Float.MAX_VALUE;
        RESOLUTION result = null;

        for (final Entry<RESOLUTION, Float> item : CodecVideoConstants.RESOLUTION_VALUE.entrySet()) {
            final RESOLUTION res = item.getKey();
            final Float v = item.getValue();
            final double diff = Math.abs(v.floatValue() - resolution);

            if (diff < min) {
                min = diff;
                result = res;
            }
        }

        return result;
    }

    private static double calculateRatio(final Long width, final Long height) {
        double result = 0;
        if (!MathUtils.isZero(Double.valueOf(width.doubleValue())) && !MathUtils.isZero(Double.valueOf(height.doubleValue()))) {
            final double w = width.doubleValue();
            final double h = height.doubleValue();

            result = w / h;
        }

        return result;
    }

}
