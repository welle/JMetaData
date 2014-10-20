package aka.jmetadata.main;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract chapter informations of a specific chapter stream.
 *
 * @author Charlotte
 */
public final class JMetadataChapter extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo instance of mediainfo JNA library
     * @param streamNumber number of the stream to parse
     * @see MediaInfo
     */
    public JMetadataChapter(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Chapters, mediaInfo, streamNumber);
    }
}
