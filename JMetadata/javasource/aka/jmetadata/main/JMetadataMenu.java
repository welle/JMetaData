package aka.jmetadata.main;

import javax.annotation.Nonnull;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract audio informations of a specific menu stream.
 *
 * @author Charlotte
 */
public final class JMetadataMenu extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo instance of mediainfo JNA library
     * @param streamNumber number of the stream to parse
     * @see MediaInfo
     */
    public JMetadataMenu(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Menu, mediaInfo, streamNumber);
    }
}
