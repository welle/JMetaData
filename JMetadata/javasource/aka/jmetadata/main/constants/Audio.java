package aka.jmetadata.main.constants;

import javax.annotation.Nonnull;

/**
 * Audio
 */
public final class Audio {
    /**
     * Number of channels.
     */
    @Nonnull
    public static final String CHANNELS = "Channel(s)";
    /**
     * Sampling Rate in KHz.
     */
    @Nonnull
    public static final String SAMPLING_RATE = "SamplingRate";
    /**
     * Bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
     */
    @Nonnull
    public static final String STATUS = "Status";
    /**
     * Number of channels (with measurement).
     */
    @Nonnull
    public static final String CHANNELS_STRING = "Channel(s)/String";
    /**
     * Position of channels.
     */
    @Nonnull
    public static final String CHANNEL_POSITION = "ChannelPositions";
    /**
     * Position of channels (x/y.z format).
     */
    @Nonnull
    public static final String CHANNEL_POSITION_STRING = "ChannelPositions/String2";
    /**
     * Layout of channels (in the stream).
     */
    @Nonnull
    public static final String CHANNELLAYOUT = "ChannelLayout";
    /**
     * Sampling Rate in KHz.
     */
    @Nonnull
    public static final String SAMPLING_RATE_STRING = "SamplingRate/String";
    /**
     * Sample count (based on sampling rate).
     */
    @Nonnull
    public static final String SAMPLING_COUNT = "SamplingCount";
    /**
     * Source Sample count (based on sampling rate).
     */
    @Nonnull
    public static final String SOURCE_SAMPLING_COUNT = "Source_SamplingCount";
    /**
     * Delay fixed in the stream (absolute / video).
     */
    @Nonnull
    public static final String VIDEO_DELAY = "Video_Delay";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING = "Video_Delay/String";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE1 = "Video_Delay/String1";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE2 = "Video_Delay/String2";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE3 = "Video_Delay/String3";
    /**
     * Delay fixed in the stream.
     */
    @Nonnull
    public static final String VIDEO_DELAY_STRING_TYPE4 = "Video_Delay/String4";
    /**
     * The gain to apply to reach 89dB SPL on playback.
     */
    @Nonnull
    public static final String REPLAYGAIN_GAIN = "ReplayGain_Gain";
    /**
     * The gain to apply to reach 89dB SPL on playback.
     */
    @Nonnull
    public static final String REPLAYGAIN_GAIN_STRING = "ReplayGain_Gain/String4";
    /**
     * The maximum absolute peak value of the item.
     */
    @Nonnull
    public static final String REPLAYGAIN_PEAK = "ReplayGain_Peak";
    /**
     * Between how many video frames the stream is inserted.
     */
    @Nonnull
    public static final String INTERLEAVE_VIDEOFRAMES = "Interleave_VideoFrames";
    /**
     * Between how much time (ms) the stream is inserted.
     */
    @Nonnull
    public static final String INTERLEAVE_DURATION = "Interleave_Duration";
    /**
     * Between how much time and video frames the stream is inserted (with measurement).
     */
    @Nonnull
    public static final String INTERLEAVE_DURATION_STRING = "Interleave_Duration/String";
    /**
     * How much time is buffered before the first video frame.
     */
    @Nonnull
    public static final String INTERLEAVE_PRELOAD = "Interleave_Preload";
    /**
     * How much time is buffered before the first video frame (with measurement).
     */
    @Nonnull
    public static final String INTERLEAVE_PRELOAD_STRING = "Interleave_Preload/String";

    private Audio() {
        // Singleton
    }
}
