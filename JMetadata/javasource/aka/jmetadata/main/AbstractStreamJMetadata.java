package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.Commons;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * AbstractStreamJMetadata is an abstract class providing commons methods for metadata extraction.<br>
 * The developer need only subclass this abstract class and add, if necessary, specific methods.
 *
 * @author Charlotte
 */
public abstract class AbstractStreamJMetadata extends AbstractJMetadata {

    private final int streamNumber;
    @Nonnull
    private final StreamKind streamkind;

    /**
     * Constructor.
     *
     * @param streamkind Kind of Stream (general, video, audio...)
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     * @see StreamKind
     * @see MediaInfo
     */
    public AbstractStreamJMetadata(@Nonnull final StreamKind streamkind, @Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo);
        this.streamNumber = streamNumber;
        this.streamkind = streamkind;
    }

    /**
     * Get the format use of the video.
     *
     * @return format use
     */
    @Nullable
    public final String getFormat() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT);
    }

    /**
     * Get the format info use of the video.
     *
     * @return format info use
     */
    @Nullable
    public final String getFormatInfo() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_INFO);
    }

    /**
     * Get the profile of the format use of the video.
     *
     * @return profile format info use
     */
    @Nullable
    public final String getFormatProfile() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_PROFILE);
    }

    /**
     * Get the Codec ID (found in some containers) use of the video.
     *
     * @return Codec ID
     */
    @Nullable
    public final String getCodecID() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.CODEC_ID);
    }

    /**
     * Get Play time of the stream in ms.
     *
     * @return Play time of the stream in ms
     */
    @Nullable
    public final Double getDuration() {
        return getMediaInfo().getAsDouble(this.streamkind, this.streamNumber, Commons.DURATION);
    }

    /**
     * Get Bit rate in bps.
     *
     * @return Bit rate in bps
     */
    @Nullable
    public final Long getBitRate() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.BITRATE);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
     *
     * @return Language
     */
    @Nullable
    public final String getLanguage() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (full).
     *
     * @return Language
     */
    @Nullable
    public final String getLanguageString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE_STRING);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (full).
     *
     * @return Language
     */
    @Nullable
    public final String getLanguageString1() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE_STRING1);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (2-letter ISO 639-1 if exists, else empty).
     *
     * @return Language
     */
    @Nullable
    public final String getLanguageString2() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE_STRING2);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (3-letter ISO 639-2 if exists, else empty).
     *
     * @return Language
     */
    @Nullable
    public final String getLanguageString3() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE_STRING3);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
     *
     * @return Language
     */
    @Nullable
    public final String getLanguageString4() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE_STRING4);
    }

    /**
     * Get more info about Language (e.g. Director's Comment).
     *
     * @return more info
     */
    @Nullable
    public final String getLanguageMore() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.LANGUAGE_MORE);
    }

    /**
     * Get stream type name.
     *
     * @return stream type name
     */
    @Nullable
    public final String getStreamKind() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMKIND);
    }

    /**
     * Get stream type name.
     *
     * @return stream type name
     */
    @Nullable
    public final String getStreamKindString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAM_KIND_STRING);
    }

    /**
     * Get number of the stream (base=0).
     *
     * @return number of the stream (base=0)
     */
    @Nullable
    public final Integer getStreamKindID() {
        return getMediaInfo().getAsInteger(this.streamkind, this.streamNumber, Commons.STREAM_KIND_ID);
    }

    /**
     * When multiple streams, number of the stream (base=1).
     *
     * @return number of the stream (base=1)
     */
    @Nullable
    public final Integer getStreamKindPosition() {
        return getMediaInfo().getAsInteger(this.streamkind, this.streamNumber, Commons.STREAM_KIND_POS);
    }

    /**
     * Get the ID for this stream in this file.
     *
     * @return ID for this stream in this file
     */
    @Nullable
    public final Integer getID() {
        return getMediaInfo().getAsInteger(this.streamkind, this.streamNumber, Commons.ID);
    }

    /**
     * Get stream order in the file, whatever is the kind of stream (base=0).
     *
     * @return stream order in the file
     */
    @Nullable
    public final Integer getStreamKindOrder() {
        return getMediaInfo().getAsInteger(this.streamkind, this.streamNumber, Commons.STREAMORDER);
    }

    /**
     * Get stream order in the file, whatever is the kind of stream (base=0).
     *
     * @return stream order in the file
     */
    @Nullable
    public final String getIDString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ID_STRING);
    }

    /**
     * Get play time in format : XXx YYy only, YYy omitted if zero.
     *
     * @return play time
     */
    @Nullable
    public final String getDurationString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_STRING);
    }

    /**
     * Get play time in format : HHh MMmn SSs MMMms, XX omited if zero.
     *
     * @return play time
     */
    @Nullable
    public final String getDurationStringType1() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_STRING1);
    }

    /**
     * Get play time in format : XXx YYy only, YYy omited if zero.
     *
     * @return play time
     */
    @Nullable
    public final String getDurationStringType2() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_STRING2);
    }

    /**
     * Get play time in format : HH:MM:SS.MMM.
     *
     * @return play time
     */
    @Nullable
    public final String getDurationStringType3() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_STRING3);
    }

    /**
     * Get the unique ID for this stream, should be copied with stream copy.
     *
     * @return unique ID for this stream
     */
    @Nullable
    public final BigInteger getUniqueID() {
        return getMediaInfo().getAsBigInteger(this.streamkind, this.streamNumber, Commons.UNIQUE_ID);
    }

    /**
     * Get the unique ID for this stream, should be copied with stream copy.
     *
     * @return unique ID for this stream
     */
    @Nullable
    public final String getUniqueIDString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.UNIQUE_ID_STRING);
    }

    /**
     * Get the menu ID for this stream in this file.
     *
     * @return menu ID for this stream in this file
     */
    @Nullable
    public final Integer getMenuID() {
        return getMediaInfo().getAsInteger(this.streamkind, this.streamNumber, Commons.MENUID);
    }

    /**
     * Get the menu ID for this stream in this file.
     *
     * @return menu ID for this stream in this file
     */
    @Nullable
    public final String getMenuIDString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.MENUID_STRING);
    }

    /**
     * Get the format version use of the file.
     *
     * @return format version use
     */
    @Nullable
    public final String getFormatVersion() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_VERSION);
    }

    /**
     * Get link to a description of this format.
     *
     * @return link to a description of this format
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found.
     */
    @Nullable
    public final URL getFormatURL() throws MalformedURLException {
        return getMediaInfo().getAsURL(this.streamkind, this.streamNumber, Commons.FORMAT_URL);
    }

    /**
     * Get commercial name used by vendor for theses settings or Format field if there is no difference.
     *
     * @return commercial name
     */
    @Nullable
    public final String getFormatCommercial() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_COMMERCIAL);
    }

    /**
     * Get commercial name used by vendor for theses settings or Format field if there is no difference.
     *
     * @return commercial name
     */
    @Nullable
    public final String getFormatCommercialIfAny() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_COMMERCIAL_IF_ANY);
    }

    /**
     * Get compression method used.
     *
     * @return compression method
     */
    @Nullable
    public final String getFormatCompression() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_COMPRESSION);
    }

    /**
     * Get settings needed for decoder used.
     *
     * @return settings
     */
    @Nullable
    public final String getFormatSettings() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORMAT_SETTINGS);
    }

    /**
     * Get Internet Media Type (a.k.a MIME Type, Content-Type).
     *
     * @return Internet Media Type
     */
    @Nullable
    public final String getInternetMediaType() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.INTERNET_MEDIA_TYPE);
    }

    /**
     * Get how this file is muxed in the container.
     *
     * @return How this file is muxed in the container
     */
    @Nullable
    public final String getMuxingMode() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.MUXING_MODE);
    }

    /**
     * Get codec ID (final found in some containers).
     *
     * @return codec ID
     */
    @Nullable
    public final String getCodecIDString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.CODEC_ID_STRING);
    }

    /**
     * Get info about this codec.
     *
     * @return info about this codec
     */
    @Nullable
    public final String getCodecIDInfo() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.CODEC_ID_INFO);
    }

    /**
     * Get hint/popular name for this codec.
     *
     * @return hint/popular name
     */
    @Nullable
    public final String getCodecIDHint() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.CODEC_ID_HINT);
    }

    /**
     * Get link to more details about this codec ID.
     *
     * @return link to more details
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found
     */
    @Nullable
    public final URL getCodecIDURL() throws MalformedURLException {
        return getMediaInfo().getAsURL(this.streamkind, this.streamNumber, Commons.CODEC_ID_URL);
    }

    /**
     * Get manual description given by the container.
     *
     * @return manual description
     */
    @Nullable
    public final String getCodecIDDescription() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.CODEC_ID_DESCRIPTION);
    }

    /**
     * Get duration of the first frame if it is longer than others, in ms.
     *
     * @return Duration
     */
    @Nullable
    public final Long getDurationFirstTrame() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.DURATION_FIRSTFRAME);
    }

    /**
     * Get duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     *
     * @return Duration
     */
    @Nullable
    public final String getDurationFirstTrameType1() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_FIRSTFRAME_STRING_TYPE1);
    }

    /**
     * Get duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     *
     * @return Duration
     */
    @Nullable
    public final String getDurationFirstTrameType2() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_FIRSTFRAME_STRING_TYPE2);
    }

    /**
     * Get duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
     *
     * @return Duration
     */
    @Nullable
    public final String getDurationFirstTrameType3() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DURATION_FIRSTFRAME_STRING_TYPE3);
    }

    /**
     * Get bit rate mode (VBR, CBR).
     *
     * @return bit rate mode
     */
    @Nullable
    public final String getBitRateMode() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_MODE);
    }

    /**
     * Get bit rate mode (Variable, Cconstant).
     *
     * @return bit rate mode
     */
    @Nullable
    public final String getBitRateModeString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_MODE_STRING);
    }

    /**
     * Get bit rate (with measurement).
     *
     * @return bit rate
     */
    @Nullable
    public final String getBitRateString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_STRING);
    }

    /**
     * Get minimum bit rate in bps.
     *
     * @return minimum bit rate
     */
    @Nullable
    public final Long getBitRateMinimum() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.BITRATE_MINIMUM);
    }

    /**
     * Get minimum bit rate in bps (with measurement).
     *
     * @return minimum bit rate
     */
    @Nullable
    public final String getBitRateMinimumString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_MINIMUM_STRING);
    }

    /**
     * Get nominal bit rate in bps.
     *
     * @return nominal bit rate
     */
    @Nullable
    public final Long getBitRateNominal() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.BITRATE_NOMINAL);
    }

    /**
     * Get nominal bit rate in bps (with measurement).
     *
     * @return nominal bit rate
     */
    @Nullable
    public final String getBitRateNominalString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_NOMINAL_STRING);
    }

    /**
     * Get maximum bit rate in bps.
     *
     * @return maximum bit rate
     */
    @Nullable
    public final Long getBitRateMaximum() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.BITRATE_MAXIMUM);
    }

    /**
     * Get maximum bit rate in bps (with measurement).
     *
     * @return maximum bit rate
     */
    @Nullable
    public final String getBitRateMaximumString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_MAXIMUM_STRING);
    }

    /**
     * Get encoded (with forced padding) bit rate in bps, if some container padding is present.
     *
     * @return encoded bit rate
     */
    @Nullable
    public final Long getBitRateEncoded() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.BITRATE_ENCODED);
    }

    /**
     * Get encoded (with forced padding) bit rate (with measurement), if some container padding is present.
     *
     * @return encoded bit rate
     */
    @Nullable
    public final String getBitRateEncodedString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITRATE_ENCODED_STRING);
    }

    /**
     * Get frames per second (with measurement).
     *
     * @return frames per second (with measurement)
     */
    @Nullable
    public final String getFrameRateString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FRAMERATE_STRING);
    }

    /**
     * Get number of frames.
     *
     * @return number of frames
     */
    @Nullable
    public final BigInteger getFrameCount() {
        return getMediaInfo().getAsBigInteger(this.streamkind, this.streamNumber, Commons.FRAMECOUNT);
    }

    /**
     * Get source number of frames.
     *
     * @return source number of frames
     */
    @Nullable
    public final String getSourceFrameCount() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.SOURCE_FRAMECOUNT);
    }

    /**
     * Get the time/date/year that the encoding of this item was completed began.
     *
     * @return the time/date/year
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    @Nullable
    public final Date getEncodedDate() throws ParseException {
        return getMediaInfo().getAsDate(this.streamkind, this.streamNumber, Commons.ENCODED_DATE);
    }

    /**
     * Get the time/date/year that the tags were done for this item.
     *
     * @return the time/date/year
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    @Nullable
    public final Date getTaggedDate() throws ParseException {
        return getMediaInfo().getAsDate(this.streamkind, this.streamNumber, Commons.TAGGED_DATE);
    }

    /**
     * Get the name of the software package used to create the file, such as Microsoft WaveEdit.
     *
     * @return name of the software package
     */
    @Nullable
    public final String getEncodedApplication() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_APPLICATION);
    }

    /**
     * Get link of the software package used to create the file, such as Microsoft WaveEdit.
     *
     * @return link of the software package used to create the file, such as Microsoft WaveEdit.
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found.
     */
    @Nullable
    public final URL getEncodedApplicationURL() throws MalformedURLException {
        return getMediaInfo().getAsURL(this.streamkind, this.streamNumber, Commons.ENCODED_APPLICATION_URL);
    }

    /**
     * Get software used to create the file.
     *
     * @return software used to create the file
     */
    @Nullable
    public final String getEncodedLibrary() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_LIBRARY);
    }

    /**
     * Get software used to create the file.
     *
     * @return software used to create the file
     */
    @Nullable
    public final String getEncodedLibraryString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_LIBRARY_STRING);
    }

    /**
     * Get name of the the encoding-software.
     *
     * @return name of the the encoding-software
     */
    @Nullable
    public final String getEncodedLibraryName() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_LIBRARY_NAME);
    }

    /**
     * Get version of the the encoding-software.
     *
     * @return version of the the encoding-software
     */
    @Nullable
    public final String getEncodedLibraryVersion() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_LIBRARY_VERSION);
    }

    /**
     * Get release date of the the encoding-software.
     *
     * @return release date of the the encoding-software
     */
    @Nullable
    public final String getEncodedLibraryDate() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_LIBRARY_DATE);
    }

    /**
     * Get parameters used by the software.
     *
     * @return parameters used by the software
     */
    @Nullable
    public final String getEncodedLibrarySettings() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCODED_LIBRARY_SETTINGS);
    }

    /**
     * Get stream size.
     *
     * @return stream size
     */
    @Nullable
    public final Long getStreamsize() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.STREAMSIZE);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public final String getStreamsizeString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMSIZE_STRING);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public final String getStreamsizeStringType1() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMSIZE_STRING1);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public final String getStreamsizeStringType2() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMSIZE_STRING2);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public final String getStreamsizeStringType3() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMSIZE_STRING3);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public final String getStreamsizeStringType4() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMSIZE_STRING4);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public final String getStreamsizeStringType5() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.STREAMSIZE_STRING5);
    }

    /**
     * Get stream size divided by file size.
     *
     * @return stream size
     */
    @Nullable
    public final Double getStreamsizeProportion() {
        return getMediaInfo().getAsDouble(this.streamkind, this.streamNumber, Commons.STREAMSIZE_PROPORTION);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return <code>true</code> if that track should be used if no language found matches the user preference
     */
    public final boolean isDefault() {
        return getMediaInfo().getAsBoolean(this.streamkind, this.streamNumber, Commons.DEFAULT);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return that track should be used if no language found matches the user preference
     */
    @Nullable
    public final String getDefaultString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DEFAULT_STRING);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return <code>true</code> if that track should be used if no language found matches the user preference
     */
    public final boolean isForced() {
        return getMediaInfo().getAsBoolean(this.streamkind, this.streamNumber, Commons.FORCED);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return that track should be used if no language found matches the user preference
     */
    @Nullable
    public final String getForcedString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.FORCED_STRING);
    }

    /**
     * How this stream file is aligned in the container.
     *
     * @return How this stream file is aligned in the container
     */
    @Nullable
    public final String getAlignment() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ALIGNMENT);
    }

    /**
     * How this stream file is aligned in the container.
     *
     * @return How this stream file is aligned in the container
     */
    @Nullable
    public final String getAlignmentString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ALIGNMENT_STRING);
    }

    /**
     * Get name of the track.
     *
     * @return name of the track
     */
    @Nullable
    public final String getTitle() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.TITLE);
    }

    /**
     * Get bit depth (8/16/24/32) in bits.
     *
     * @return bit depth
     */
    @Nullable
    public final Integer getBitDepth() {
        return getMediaInfo().getAsInteger(this.streamkind, this.streamNumber, Commons.BITDEPTH);
    }

    /**
     * Get bit depth (8/16/24/32) in bits.
     *
     * @return bit depth
     */
    @Nullable
    public final String getBitDepthString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.BITDEPTH_STRING);
    }

    /**
     * Get compression mode (Lossy or Lossless).
     *
     * @return compression mode
     */
    @Nullable
    public final String getCompressionMode() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.COMPRESSION_MODE);
    }

    /**
     * Get compression mode (Lossy or Lossless).
     *
     * @return compression mode
     */
    @Nullable
    public final String getCompressionModeString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.COMPRESSION_MODE_STRING);
    }

    /**
     * Get current stream size divided by uncompressed stream size.
     *
     * @return current stream size divided by uncompressed stream size
     */
    @Nullable
    public final Double getCompressionRatio() {
        return getMediaInfo().getAsDouble(this.streamkind, this.streamNumber, Commons.COMPRESSION_RATIO);
    }

    /**
     * Get delay fixed in the stream (relative) IN MS.
     *
     * @return delay
     */
    @Nullable
    public final Long getDelay() {
        return getMediaInfo().getAsLong(this.streamkind, this.streamNumber, Commons.DELAY);
    }

    /**
     * Get delay with measurement.
     *
     * @return delay
     */
    @Nullable
    public final String getDelayString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_STRING);
    }

    /**
     * Get delay with measurement.
     *
     * @return delay
     */
    @Nullable
    public final String getDelayStringType1() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_STRING1);
    }

    /**
     * Get delay with measurement.
     *
     * @return delay
     */
    @Nullable
    public final String getDelayStringType2() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_STRING2);
    }

    /**
     * Get delay in format : HH:MM:SS.MMM.
     *
     * @return delay
     */
    @Nullable
    public final String getDelayStringType3() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_STRING3);
    }

    /**
     * Get delay in format : HH:MM:SS:FF (HH:MM:SS).
     *
     * @return delay
     */
    @Nullable
    public final String getDelayStringType4() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_STRING4);
    }

    /**
     * Get delay settings (in case of timecode for example).
     *
     * @return delay
     */
    @Nullable
    public final String getDelaySettings() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_SETTINGS);
    }

    /**
     * Get encryption.
     *
     * @return encryption
     */
    @Nullable
    public final String getEncryption() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.ENCRYPTION);
    }

    /**
     * Get the Frames per second.
     *
     * @return Frames per second, null if something goes wrong
     */
    @Nullable
    public final Double getFrameRate() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Commons.FRAME_RATE);
    }

    /**
     * Get current stream number
     *
     * @return stream number
     */
    public final int getStreamNumber() {
        return this.streamNumber;
    }

    /**
     * Get delay source (Container or Stream or empty).
     *
     * @return delay source
     */
    @Nullable
    public final String getDelaySource() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_SOURCE);
    }

    /**
     * Get delay source (Container or Stream or empty).
     *
     * @return delay source
     */
    @Nullable
    public final String getDelaySourceString() {
        return getMediaInfo().get(this.streamkind, this.streamNumber, Commons.DELAY_SOURCE_STRING);
    }
}
