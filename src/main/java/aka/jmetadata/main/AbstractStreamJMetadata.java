package aka.jmetadata.main;

import org.eclipse.jdt.annotation.NonNull;

import aka.jmetadata.main.constants.kind.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * AbstractStreamJMetadata is an abstract class providing General methods for metadata extraction.<br>
 * The developer need only subclass this abstract class and add, if necessary, specific methods.
 *
 * @author Charlotte
 */
public abstract class AbstractStreamJMetadata extends AbstractJMetadata {

    private final int streamNumber;

    /**
     * Constructor.
     *
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     * @see StreamKind
     * @see MediaInfo
     */
    public AbstractStreamJMetadata(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo);
        this.streamNumber = streamNumber;
    }

    /**
     * Get current stream number
     *
     * @return stream number
     */
    public final int getStreamNumber() {
        return this.streamNumber;
    }
}
