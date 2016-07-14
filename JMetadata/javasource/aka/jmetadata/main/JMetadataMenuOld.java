package aka.jmetadata.main;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract menu informations of a specific menu stream.
 *
 * @author Charlotte
 */
public final class JMetadataMenuOld extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo instance of mediainfo JNA library
     * @param streamNumber number of the stream to parse
     * @see MediaInfo
     */
    public JMetadataMenuOld(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Menu, mediaInfo, streamNumber);
    }
}
