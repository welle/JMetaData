package aka.jmetadata.main;

import javax.annotation.Nonnull;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * A test for the various media information functions.
 * <p>
 * For regular media files (like ".mpg" or ".avi") the track information is available after the media has been parsed (or played).
 * <p>
 * For DVD media files (like ".iso" files) the track information is not available after the media has been parsed, a video output must have been created, and even then the video track width/height
 * might not be available until a short time later.
 * <p>
 * In all cases, the other functions for title, video, audio and chapter descriptions require that a video output has been created before they return valid information.
 */
public final class JMetadataMenu extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     */
    public JMetadataMenu(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Menu, mediaInfo, streamNumber);
    }
}
