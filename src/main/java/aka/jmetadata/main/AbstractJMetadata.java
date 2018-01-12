package aka.jmetadata.main;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.helper.DataUtilsHelper;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * AbstractJMetadata is a basic abstract class providing basic methods for metadata extraction.
 *
 * @author Charlotte
 */
public abstract class AbstractJMetadata {

    @NonNull
    private final MediaInfo mediaInfo;

    /**
     * Constructor.
     *
     * @param mediaInfo
     * @see MediaInfo
     */
    public AbstractJMetadata(@NonNull final MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    /**
     * Split given string with given splitter regex and return list of strings found.
     *
     * @param valueToSplit a string to be splitted
     * @param splitter string representing a regular expression which be used to split
     * @return list of string
     */
    @NonNull
    protected final List<@NonNull String> splitValues(@NonNull final String valueToSplit, @NonNull final String splitter) {
        final List<@NonNull String> result = new ArrayList<>();
        final String[] values = valueToSplit.split(splitter);
        for (final String value : values) {
            final String text = value.trim();
            if (!DataUtilsHelper.isEmpty(text)) {
                assert text != null;
                result.add(text);
            }
        }
        return result;
    }

    /**
     * Get current media info.
     *
     * @return mediainfo
     * @see MediaInfo
     */
    @NonNull
    protected final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }
}
