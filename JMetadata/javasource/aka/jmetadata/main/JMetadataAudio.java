package aka.jmetadata.main;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.Audio;
import aka.jmetadata.main.constants.InfoKind;
import aka.jmetadata.main.constants.StreamKind;
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

    @Nonnull
    private final MediaInfo mediaInfo;
    private final int streamNumber;

    /**
     * Constructor.
     *
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     */
    public JMetadataAudio(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        this.mediaInfo = mediaInfo;
        this.streamNumber = streamNumber;
    }

    /**
     * Get the format use of the audio.
     *
     * @return format use
     */
    @Nullable
    public String getFormat() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.FORMAT, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the format info use of the audio.
     *
     * @return format info use
     */
    @Nullable
    public String getFormatInfo() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.FORMAT_INFO, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the profile of the format use of the audio.
     *
     * @return profile format info use
     */
    @Nullable
    public String getFormatProfile() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.FORMAT_PROFILE, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the Codec ID (found in some containers) use of the audio.
     *
     * @return Codec ID
     */
    @Nullable
    public String getCodecID() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.CODEC_ID, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the Hint/popular name for this codec ID use of the audio.
     *
     * @return Hint/popular name for this codec ID
     */
    @Nullable
    public String getCodecIDHint() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.CODEC_ID_HINT, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get Play time of the stream in ms.
     *
     * @return Play time of the stream in ms
     */
    @Nullable
    public Double getDuration() {
        Double result = null;
        final String duration = this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.DURATION, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(duration)) {
            result = Double.valueOf(duration);
        }

        return result;
    }

    /**
     * Get Bit rate in bps.
     *
     * @return Bit rate in bps
     */
    @Nullable
    public Long getBitRate() {
        Long result = null;
        final String bitRate = this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.BITRATE, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(bitRate)) {
            result = Long.valueOf(bitRate);
        }

        return result;
    }

    /**
     * Get Number of channels.
     *
     * @return Number of channels
     */
    @Nullable
    public Integer getChannels() {
        Integer result = null;
        final String channels = this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.CHANNELS, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(channels)) {
            result = Integer.valueOf(channels);
        }

        return result;
    }

    /**
     * Get Sampling Rate in KHz use of the audio.
     *
     * @return Sampling Rate in KHz
     */
    @Nullable
    public Long getSamplingRate() {
        Long result = null;
        String samplingRate = this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.SAMPLING_RATE, InfoKind.Text, InfoKind.Name);
        if (!TextUtils.isEmpty(samplingRate)) {
            assert samplingRate != null : "As Textutils.isEmpty test if null or trim.lenght = 0, it should not be possible.";
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
     * Get the Language use of the audio.
     *
     * @return Language
     */
    @Nullable
    public String getLanguage() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.LANGUAGE, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Set if that track should be used if no language found matches the user preference.
     *
     * @return true if that track should be used if no language found matches the user preference.
     */
    @Nullable
    public String isDefault() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.DEFAULT, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Set if that track should be used if no language found matches the user preference.
     *
     * @return <code>true</code> if that track should be used if no language found matches the user preference.
     */
    @Nullable
    public String isForced() {
        return this.mediaInfo.get(StreamKind.Audio, this.streamNumber, Audio.FORCED, InfoKind.Text, InfoKind.Name);
    }
}
