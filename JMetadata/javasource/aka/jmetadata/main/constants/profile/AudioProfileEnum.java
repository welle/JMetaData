package aka.jmetadata.main.constants.profile;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Format Profile constants parameters.
 *
 * @author Welle Charlotte
 */
public enum AudioProfileEnum {

    /**
     * A-Law.
     */
    A_LAW("A-Law", ""),

    /**
     * U-Law.
     */
    U_LAW("U-Law", ""),

    /**
     * Wide band.
     */
    WIDE_BAND("Wide band", ""),

    /**
     * Narrow band.
     */
    NARROW_BAND("Narrow band", ""),

    /**
     * LC.
     */
    LC("LC", ""),

    /**
     * HRA.
     */
    HRA("HRA", ""),

    /**
     * MA.
     */
    MA("MA", ""),

    /**
     * HD.
     */
    HD("HD", ""),

    /**
     * X.
     */
    X("X", ""),

    /**
     * Core.
     */
    CORE("Core", ""),

    /**
     * Express.
     */
    EXPRESS("Express", ""),

    /**
     * TrueHD+Atmos / TrueHD.
     */
    TRUEHD_ATMOS("TrueHD+Atmos / TrueHD", ""),

    /**
     * AC-3+Atmos.
     */
    AC_3_Atmos("AC-3+Atmos", ""),

    /**
     * AC-3.
     */
    AC_3("AC-3", ""),

    /**
     * E-AC-3.
     */
    E_AC_3("E-AC-3", ""),

    /**
     * E-AC-3+Atmos.
     */
    E_AC_3_Atmos("E-AC-3+Atmos", ""),

    /**
     * E-AC-3+Dep.
     */
    E_AC_3_Dep("E-AC-3+Dep", ""),

    /**
     * SSR.
     */
    SSR("SSR", ""),

    /**
     * Layer 3.
     */
    LAYER_3("Layer 3", ""),

    /**
     * Main.
     */
    MAIN("Main", "");

    @NonNull
    private final String name;
    @NonNull
    private final String fullName;

    AudioProfileEnum(@NonNull final String name, @NonNull final String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    /**
     * Get the name of the ENUM.
     *
     * @return the name of the ENUM
     */
    @NonNull
    public String getName() {
        return this.name;
    }

    /**
     * Get the full name of the ENUM.
     *
     * @return the full name of the ENUM
     */
    @NonNull
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Get AudioProfileEnum corresponding to given string.
     *
     * @param param
     * @return corresponding AudioProfileEnum
     */
    @Nullable
    public static final AudioProfileEnum getAudioProfileEnum(@Nullable final String param) {
        AudioProfileEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final AudioProfileEnum codecEnum : AudioProfileEnum.values()) {
                    if (trimmedParam.equals(codecEnum.getName())) {
                        result = codecEnum;
                        // found, just break
                        break;
                    }
                }
            }
        }
        return result;
    }

}
