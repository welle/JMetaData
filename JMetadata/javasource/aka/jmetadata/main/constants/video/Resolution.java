package aka.jmetadata.main.constants.video;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Resolution
 */
public enum Resolution {
    /**
     * Unknown
     */
    UNKNOWN("UNKNOWN", "UNKNOWN", "UNKNOWN", null, 0),

    /**
     * 480p
     */
    R_480("480p", "SD", "SD", null, 480),

    /**
     * 540p
     */
    R_540("540p", "SD", "SD", null, 540),

    /**
     * 576p
     */
    R_576("576p", "SD", "SD", null, 576),

    /**
     * 720p
     */
    R_720("720p", "HD", "HD Ready", null, 720),

    /**
     * 1080p
     */
    R_1080("1080p", "FHD", "Full HD", null, 1080),

    /**
     * 1440p
     */
    R_1440("1440p", "QHD", "Quad HD", null, 1440),

    /**
     * 2160p
     */
    R_2160("2160p", "UHD", "Ultra HD", "4K", 2160),

    /**
     * 4320p
     */
    R_4320("4320p", "UHD", "Ultra HD", "8K", 4320);

    private @NonNull String resolutionName;
    private @NonNull String concatedName;
    private @NonNull String fullName;
    private @Nullable String altName;
    private double resolution;

    private Resolution(@NonNull final String resolutionName, @NonNull final String concatedName, @NonNull final String fullName, @Nullable final String altName, final double resolution) {
        this.resolutionName = resolutionName;
        this.concatedName = concatedName;
        this.fullName = fullName;
        this.altName = altName;
        this.resolution = resolution;
    }

    /**
     * @return the resolution
     */
    @NonNull
    public final String getResolutionName() {
        return this.resolutionName;
    }

    /**
     * @return the concatedName
     */
    @NonNull
    public final String getConcatedName() {
        return this.concatedName;
    }

    /**
     * @return the fullName
     */
    @NonNull
    public final String getFullName() {
        return this.fullName;
    }

    /**
     * @return the altName
     */
    @Nullable
    public final String getAltName() {
        return this.altName;
    }

    /**
     * @return the resolution
     */
    public final double getResolution() {
        return this.resolution;
    }

    /**
     * Get related resolution.
     *
     * @param resolutionParam
     * @return related resolution
     */
    @Nullable
    public static Resolution getResolution(final double resolutionParam) {
        Resolution result = null;
        for (final Resolution resolution : values()) {
            if (resolution.resolution == resolutionParam) {
                result = resolution;
                break;
            }
        }
        return result;
    }

    /**
     * Get closest resolution.
     *
     * @param resolutionParam
     * @return closest resolution
     */
    @Nullable
    public static Resolution getClosestResolution(final double resolutionParam) {
        Resolution result = null;
        double min = Double.MAX_VALUE;
        for (final Resolution resolution : values()) {
            final double v = resolution.getResolution();
            final double diff = Math.abs(v - resolutionParam);

            if (diff < min) {
                min = diff;
                result = resolution;
            }
        }
        return result;
    }

}