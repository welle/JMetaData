package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * TextMpeg4 constants parameters.
 *
 * @author Welle Charlotte
 */
public enum TextMpeg4CodecIdEnum implements CodecEnum {

    /**
     * c608.
     */
    C608("c608", "EIA-608"),

    /**
     * c708.
     */
    C708("c708", "EIA-708"),

    /**
     * dfxp.
     */
    DFXP("dfxp", "TTML"),

    /**
     * enct.
     */
    ENCT("enct", "(Encrypted)"),

    /**
     * sbtl.
     */
    SBTL("sbtl", "Apple text", "(iPhone)"),

    /**
     * subp.
     */
    SUBP("subp", "VobSub", "The same subtitle format used on DVDs"),

    /**
     * text.
     */
    TEXT("text", "Apple text"),

    /**
     * tx3g.
     */
    TX3G("tx3g", "Timed text");

    @NonNull
    private final List<@NonNull String> codecIDList;

    TextMpeg4CodecIdEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get TextMpeg4CodecIdEnum corresponding to given string.
     *
     * @param param
     * @return corresponding TextMpeg4Enum
     */
    @Nullable
    public static final TextMpeg4CodecIdEnum getTextMpeg4CodecIdEnum(@Nullable final String param) {
        TextMpeg4CodecIdEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final TextMpeg4CodecIdEnum codecEnum : TextMpeg4CodecIdEnum.values()) {
                    final List<@NonNull String> values = codecEnum.getValues();
                    for (final String expectedCodec : values) {
                        if (trimmedParam.equals(expectedCodec)) {
                            result = codecEnum;
                            // found, just break
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

}
