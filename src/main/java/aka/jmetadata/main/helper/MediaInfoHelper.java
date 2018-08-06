package aka.jmetadata.main.helper;

import java.text.DecimalFormat;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.video.AspectRatio;
import aka.jmetadata.main.constants.video.Resolution;

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
     * @author charlottew
     */
    public enum OS_ARCH {
        /**
         * 32 CPU based
         */
        BITS_32,

        /**
         * 64 CPU based
         */
        BITS_64,
    }

    /**
     * Get OS_ARCH 32 or 64 bits.
     *
     * @return OS_ARCH
     */
    @NonNull
    public static OS_ARCH getOSArch() {
        final var arch = System.getenv("PROCESSOR_ARCHITECTURE");
        final var wow64Arch = System.getenv("PROCESSOR_ARCHITEW6432");

        final var realArch = arch.endsWith("64") || wow64Arch != null && wow64Arch.endsWith("64") ? OS_ARCH.BITS_64 : OS_ARCH.BITS_32;
        return realArch;
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
        final var ratio = calculateRatio(width, height);

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
        final var result = AspectRatio.getClosestAspectRatio(aspectRatio);

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
        final var result = Resolution.getClosestResolution(resolution);

        return result;
    }

    private static double calculateRatio(@Nullable final Long width, @Nullable final Long height) {
        double result = 0;
        if (width != null && height != null) {
            if (width.doubleValue() != 0 && height.doubleValue() != 0) {
                final var w = width.doubleValue();
                final var h = height.doubleValue();

                result = w / h;
            }
        }

        return result;
    }

    /**
     * Get readable file size of the given file size.
     *
     * @param size
     * @return readable file size
     */
    @NonNull
    public static String readableFileSize(final long size) {
        var result = "0";

        if (size > 0) {
            final var units = new String[] { "B", "kB", "MB", "GB", "TB" };
            final var digitGroups = (int) (Math.log10(size) / Math.log10(1024));
            result = new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
        }

        return result;
    }

}
