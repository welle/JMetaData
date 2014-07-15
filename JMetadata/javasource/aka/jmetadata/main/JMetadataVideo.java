package aka.jmetadata.main;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;

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
public final class JMetadataVideo {

    private final MediaInfo mediaInfo;
    private final int streamNumber;

    /**
     * Constructor
     *
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     */
    public JMetadataVideo(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        this.mediaInfo = mediaInfo;
        this.streamNumber = streamNumber;
    }

    /**
     * Get the format use of the video
     *
     * @return format use
     */
    @Nullable
    public String getFormat() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Format, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the format info use of the video
     *
     * @return format info use
     */
    @Nullable
    public String getFormatInfo() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Format_Info, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the profile of the format use of the video
     *
     * @return profile format info use
     */
    @Nullable
    public String getFormatProfile() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Format_Profile, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the Codec ID (found in some containers) use of the video
     *
     * @return Codec ID
     */
    @Nullable
    public String getCodecID() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.CodecID, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get Play time of the stream in ms
     *
     * @return Play time of the stream in ms
     */
    @Nullable
    public Double getDuration() {
        Double result = null;
        final String duration = this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Duration, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Double.valueOf(duration);
        }

        return result;
    }

    /**
     * Get Bit rate in bps
     *
     * @return Bit rate in bps
     */
    @Nullable
    public Long getBitRate() {
        Long result = null;
        final String bitRate = this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.BitRate, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(bitRate)) {
            result = Long.valueOf(bitRate);
        }

        return result;
    }

    /**
     * Get Width (aperture size if present) in pixel
     *
     * @return Width (aperture size if present) in pixel
     */
    @Nullable
    public Integer getWidth() {
        Integer result = null;
        final String width = this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Width, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(width)) {
            result = Integer.valueOf(width);
        }

        return result;
    }

    /**
     * Get Height (aperture size if present) in pixel
     *
     * @return Height (aperture size if present) in pixel
     */
    @Nullable
    public Integer getHeight() {
        Integer result = null;
        final String height = this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Height, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(height)) {
            result = Integer.valueOf(height);
        }

        return result;
    }

    /**
     * Get the Display Aspect ratio use of the video
     *
     * @return Display Aspect ratio
     */
    @Nullable
    public Double getDisplayAspectRatio() {
        Double result = null;
        final String aspectRatio = this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.DisplayAspectRatio, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(aspectRatio)) {
            result = Double.valueOf(aspectRatio);
        }

        return result;
    }

    /**
     * Get the Frames per second
     *
     * @return Frames per second, null if something goes wrong
     */
    @Nullable
    public Double getFrameRate() {
        Double result = null;
        final String frameRate = this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.FrameRate, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(frameRate)) {
            result = Double.valueOf(frameRate);
        }

        return result;
    }

    /**
     * Get the Language use of the video
     *
     * @return Language
     */
    @Nullable
    public String getLanguage() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Video, this.streamNumber, JMetadataConstants.Video.Language, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }
}
