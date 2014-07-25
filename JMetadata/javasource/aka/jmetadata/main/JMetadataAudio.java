package aka.jmetadata.main;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.Audio;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;

/**
 * This class contains all methods to extract audio informations of a specific audio stream.
 *
 * @author Charlotte
 */
public final class JMetadataAudio extends AbstractStreamJMetadata {

    /**
     * Constructor.
     *
     * @param mediaInfo instance of mediainfo JNA library
     * @param streamNumber number of the stream to parse
     * @see MediaInfo
     */
    public JMetadataAudio(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(StreamKind.Audio, mediaInfo, streamNumber);
    }

    /**
     * Get number of channels.
     *
     * @return number of channels
     */
    @Nullable
    public Integer getChannels() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

    /**
     * Get sampling Rate in KHz use of the audio.
     *
     * @return sampling Rate in KHz
     */
    @Nullable
    public Long getSamplingRate() {
        Long result = null;
        String samplingRate = getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.SAMPLING_RATE);
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
     * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
     *
     * @return bit field
     */
    @Nullable
    public Integer getStatus() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

    /**
     * Get number of channels (with measurement).
     *
     * @return number of channels
     */
    @Nullable
    public String getChannelsString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS_STRING);
    }

    /**
     * Get position of channels.
     *
     * @return position of channels
     */
    @Nullable
    public String getChannelPosition() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.CHANNEL_POSITION);
    }

    /**
     * Get position of channels (x/y.z format).
     *
     * @return position of channels
     */
    @Nullable
    public String getChannelPositionString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.CHANNEL_POSITION_STRING);
    }

    /**
     * Get sampling Rate in KHz use of the audio.
     *
     * @return sampling Rate in KHz
     */
    @Nullable
    public String getSamplingRateString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.SAMPLING_RATE_STRING);
    }

    /**
     * Get layout of channels (in the stream).
     *
     * @return layout of channels
     */
    @Nullable
    public String getChannelLayout() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

    /**
     * Get source sample count (based on sampling rate).
     *
     * @return source sample count
     */
    @Nullable
    public String getSourceSamplingCount() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.SOURCE_SAMPLING_COUNT);
    }

    /**
     * Get delay fixed in the stream (absolute / video).
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public Integer getVideoDelay() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEO_DELAY);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.VIDEO_DELAY_STRING);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType1() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.VIDEO_DELAY_STRING_TYPE1);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType2() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.VIDEO_DELAY_STRING_TYPE2);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType3() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.VIDEO_DELAY_STRING_TYPE3);
    }

    /**
     * Get delay fixed in the stream.
     *
     * @return delay fixed in the stream
     */
    @Nullable
    public String getVideoDelayStringType4() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.VIDEO_DELAY_STRING_TYPE4);
    }

    /**
     * Get gain to apply to reach 89dB SPL on playback.
     *
     * @return gain to apply to reach 89dB
     */
    @Nullable
    public String getReplayGain() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAIN_GAIN);
    }

    /**
     * Get gain to apply to reach 89dB SPL on playback.
     *
     * @return gain to apply to reach 89dB
     */
    @Nullable
    public String getReplayGainString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAIN_GAIN_STRING);
    }

    /**
     * Get maximum absolute peak value of the item.
     *
     * @return maximum absolute peak value
     */
    @Nullable
    public String getReplayGainPeak() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAIN_PEAK);
    }

    /**
     * Get between how much time (ms) the stream is inserted.
     *
     * @return how much time
     */
    @Nullable
    public Integer getInterleaveDuration() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVE_DURATION);
    }

    /**
     * Get between how much time (ms) the stream is inserted (with measurement).
     *
     * @return how much time
     */
    @Nullable
    public String getInterleaveDurationString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVE_DURATION_STRING);
    }

    /**
     * Get how much time is buffered before the first video frame.
     *
     * @return how much time
     */
    @Nullable
    public Integer getInterleavePreload() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVE_PRELOAD);
    }

    /**
     * Get how much time is buffered before the first video frame (with measurement).
     *
     * @return how much time
     */
    @Nullable
    public String getInterleavePreloadString() {
        return getMediaInfo().get(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVE_PRELOAD_STRING);
    }

    /**
     * Get between how many video frames the stream is inserted.
     *
     * @return how many video frames
     */
    @Nullable
    public Integer getInterleaveVideoFrames() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVE_VIDEOFRAMES);
    }
}
