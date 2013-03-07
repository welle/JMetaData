package aka.jmetadata.main;

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
public final class JMetadataAudio {

    private final MediaInfo mediaInfo;
    private final int streamNumber;

    /**
     * Constructor
     * 
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     */
    public JMetadataAudio(final MediaInfo mediaInfo, final int streamNumber) {
        this.mediaInfo = mediaInfo;
        this.streamNumber = streamNumber;
    }

    /**
     * Get the format use of the audio
     * 
     * @return format use
     */
    public String getFormat() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Format, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the format info use of the audio
     * 
     * @return format info use
     */
    public String getFormatInfo() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Format_Info, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the profile of the format use of the audio
     * 
     * @return profile format info use
     */
    public String getFormatProfile() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Format_Profile, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the Codec ID (found in some containers) use of the audio
     * 
     * @return Codec ID
     */
    public String getCodecID() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.CodecID, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get the Hint/popular name for this codec ID use of the audio
     * 
     * @return Hint/popular name for this codec ID
     */
    public String getCodecIDHint() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.CodecID_HINT, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Get Play time of the stream in ms
     * 
     * @return Play time of the stream in ms
     */
    public Double getDuration() {
        Double result = null;
        final String duration = this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Duration, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
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
    public Long getBitRate() {
        Long result = null;
        final String bitRate = this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.BitRate, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(bitRate)) {
            result = Long.valueOf(bitRate);
        }

        return result;
    }

    /**
     * Get Number of channels
     * 
     * @return Number of channels
     */
    public Integer getChannels() {
        Integer result = null;
        final String channels = this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Channels, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (TextUtils.isDigit(channels)) {
            result = Integer.valueOf(channels);
        }

        return result;
    }

    /**
     * Get Sampling Rate in KHz use of the audio
     * 
     * @return Sampling Rate in KHz
     */
    public Long getSamplingRate() {
        Long result = null;
        String samplingRate = this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.SamplingRate, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        if (!TextUtils.isEmpty(samplingRate)) {
            if (samplingRate.contains(" ")) {
                samplingRate = samplingRate.substring(0, samplingRate.indexOf(' ') - 1);
            }
            if (TextUtils.isDigit(samplingRate)) {
                result = Long.valueOf(samplingRate);
            }
        }

        return result;
    }

    /**
     * Get the Language use of the audio
     * 
     * @return Language
     */
    public String getLanguage() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Language, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Set if that track should be used if no language found matches the user preference.
     * 
     * @return true if that track should be used if no language found matches the user preference.
     */
    public String isDefault() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Default, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

    /**
     * Set if that track should be used if no language found matches the user preference.
     * 
     * @return true if that track should be used if no language found matches the user preference.
     */
    public String isForced() {
        return this.mediaInfo.get(MediaInfo.StreamKind.Audio, this.streamNumber, JMetadataConstants.Audio.Forced, MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
    }

}