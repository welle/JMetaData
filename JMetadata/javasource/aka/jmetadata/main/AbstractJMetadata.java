package aka.jmetadata.main;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;

/**
 * A test for the various media information functions.
 * <p>
 * For regular media files (like ".mpg" or ".avi") the track information is available after the media has been parsed (or played).
 * </p>
 * <p>
 * For DVD media files (like ".iso" files) the track information is not available after the media has been parsed, a video output must have been created, and even then the video track width/height
 * might not be available until a short time later.
 * </p>
 * <p>
 * In all cases, the other functions for title, video, audio and chapter descriptions require that a video output has been created before they return valid information.
 * </p>
 *
 * @author Charlotte
 */
public abstract class AbstractJMetadata {

    @Nonnull
    private final MediaInfo mediaInfo;

    /**
     * Constructor.
     *
     * @param mediaInfo
     */
    public AbstractJMetadata(@Nonnull final MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    /**
     * Split given string with given splitter regex and return list of strings found.
     *
     * @param valueToSplit
     * @param splitter
     * @return list of string
     */
    @Nonnull
    protected final List<String> splitValues(@Nonnull final String valueToSplit, @Nonnull final String splitter) {
        final List<String> result = new ArrayList<>();
        final String[] values = valueToSplit.split(splitter);
        for (final String value : values) {
            if (!TextUtils.isEmpty(value)) {
                result.add(value.trim());
            }
        }
        return result;
    }

    /**
     * Get current media info.
     * 
     * @return mediainfo
     */
    @Nonnull
    protected final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }
}
