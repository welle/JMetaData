package aka.jmetadata.main.constants;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * @author Charlotte
 */
public final class CodecVideoConstants {

    /********************************************* ASPECT RATIO ************************************************/

    /**
     * Aspect Ratio
     */
    public static enum ASPECT_RATIO {
        /**
         * Unknown
         */
        UNKOWN,

        /**
         * 1:33
         */
        AS_1_33,

        /**
         * 1:66
         */
        AS_1_66,

        /**
         * 1:78
         */
        AS_1_78,

        /**
         * 1:85
         */
        AS_1_85,

        /**
         * 2:20
         */
        AS_2_20,

        /**
         * 2:35
         */
        AS_2_35
    }

    /**
     * Mapping between {@link ASPECT_RATIO} and aspect ratio String value
     */
    public static Map<ASPECT_RATIO, Float> ASPECT_RATIO_VALUE;

    /**
     * Mapping between {@link ASPECT_RATIO} and aspect ratio String name
     */
    public static Map<ASPECT_RATIO, String> ASPECT_RATIO_NAME;

    /********************************************* RESOLUTION ************************************************/

    /**
     * Resolution
     */
    public static enum RESOLUTION {
        /**
         * Unknown
         */
        UNKNOWN("UNKNOWN", "UNKNOWN", "UNKNOWN", null),

        /**
         * 480p
         */
        R_480("480p", "SD", "SD", null),

        /**
         * 540p
         */
        R_540("540p", "SD", "SD", null),

        /**
         * 576p
         */
        R_576("576p", "SD", "SD", null),

        /**
         * 720p
         */
        R_720("720p", "HD", "HD Ready", null),

        /**
         * 1080p
         */
        R_1080("1080p", "FHD", "Full HD", null),

        /**
         * 1440p
         */
        R_1440("1440p", "QHD", "Quad HD", null),

        /**
         * 2160p
         */
        R_2160("2160p", "UHD", "Ultra HD", "4K"),

        /**
         * 4320p
         */
        R_4320("4320p", "UHD", "Ultra HD", "8K");

        private @NonNull String resolution;
        private @NonNull String concatedName;
        private @NonNull String fullName;
        private @Nullable String altName;

        private RESOLUTION(@NonNull final String resolution, @NonNull final String concatedName, @NonNull final String fullName, @Nullable final String altName) {
            this.resolution = resolution;
            this.concatedName = concatedName;
            this.fullName = fullName;
            this.altName = altName;
        }

        /**
         * @return the resolution
         */
        @NonNull
        public final String getResolution() {
            return this.resolution;
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
    }

    /**
     * Mapping between {@link RESOLUTION} enum and value
     */
    public static Map<RESOLUTION, Float> RESOLUTION_VALUE;

    /**
     * Mapping between {@link RESOLUTION} enum and String name
     */
    public static Map<RESOLUTION, String> RESOLUTION_NAME;

    /********************************************* INITIALISATION ************************************************/

    static {
        RESOLUTION_VALUE = new HashMap<>();
        RESOLUTION_VALUE.put(RESOLUTION.R_480, Float.valueOf(480f));
        RESOLUTION_VALUE.put(RESOLUTION.R_540, Float.valueOf(540f));
        RESOLUTION_VALUE.put(RESOLUTION.R_576, Float.valueOf(576f));
        RESOLUTION_VALUE.put(RESOLUTION.R_720, Float.valueOf(720f));
        RESOLUTION_VALUE.put(RESOLUTION.R_1080, Float.valueOf(1080f));
        RESOLUTION_VALUE.put(RESOLUTION.R_1440, Float.valueOf(1440f));
        RESOLUTION_VALUE.put(RESOLUTION.R_2160, Float.valueOf(2160f));
        RESOLUTION_VALUE.put(RESOLUTION.R_4320, Float.valueOf(4320f));
    }

    static {
        RESOLUTION_NAME = new HashMap<>();
        RESOLUTION_NAME.put(RESOLUTION.R_480, "480");
        RESOLUTION_NAME.put(RESOLUTION.R_540, "540");
        RESOLUTION_NAME.put(RESOLUTION.R_576, "576");
        RESOLUTION_NAME.put(RESOLUTION.R_720, "720");
        RESOLUTION_NAME.put(RESOLUTION.R_1080, "1080");
        RESOLUTION_NAME.put(RESOLUTION.R_1440, "1440");
        RESOLUTION_NAME.put(RESOLUTION.R_2160, "2160");
        RESOLUTION_NAME.put(RESOLUTION.R_4320, "4320");
    }

    static {
        ASPECT_RATIO_NAME = new HashMap<>();
        ASPECT_RATIO_NAME.put(ASPECT_RATIO.AS_1_33, "1.33");
        ASPECT_RATIO_NAME.put(ASPECT_RATIO.AS_1_66, "1.66");
        ASPECT_RATIO_NAME.put(ASPECT_RATIO.AS_1_78, "1.78");
        ASPECT_RATIO_NAME.put(ASPECT_RATIO.AS_1_85, "1.85");
        ASPECT_RATIO_NAME.put(ASPECT_RATIO.AS_2_20, "2.20");
        ASPECT_RATIO_NAME.put(ASPECT_RATIO.AS_2_35, "2.35");
    }

    static {
        ASPECT_RATIO_VALUE = new HashMap<>();
        ASPECT_RATIO_VALUE.put(ASPECT_RATIO.AS_1_33, Float.valueOf(1.33f));
        ASPECT_RATIO_VALUE.put(ASPECT_RATIO.AS_1_66, Float.valueOf(1.66f));
        ASPECT_RATIO_VALUE.put(ASPECT_RATIO.AS_1_78, Float.valueOf(1.78f));
        ASPECT_RATIO_VALUE.put(ASPECT_RATIO.AS_1_85, Float.valueOf(1.85f));
        ASPECT_RATIO_VALUE.put(ASPECT_RATIO.AS_2_20, Float.valueOf(2.20f));
        ASPECT_RATIO_VALUE.put(ASPECT_RATIO.AS_2_35, Float.valueOf(2.35f));
    }

    private CodecVideoConstants() {
        // singleton
    }
}
