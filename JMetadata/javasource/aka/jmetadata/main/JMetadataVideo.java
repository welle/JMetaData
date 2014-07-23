package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.Commons;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.constants.Video;
import aka.jmetadata.main.mediainfo.MediaInfo;

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
public final class JMetadataVideo extends AbstractJMetadata {

    private final int streamNumber;

    /**
     * Constructor.
     *
     * @param mediaInfo herited from JMetadata
     * @param streamNumber streamNumber to parse
     */
    public JMetadataVideo(@Nonnull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo);
        this.streamNumber = streamNumber;
    }

    /**
     * Get the format use of the video.
     *
     * @return format use
     */
    @Nullable
    public String getFormat() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT);
    }

    /**
     * Get the format info use of the video.
     *
     * @return format info use
     */
    @Nullable
    public String getFormatInfo() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_INFO);
    }

    /**
     * Get the profile of the format use of the video.
     *
     * @return profile format info use
     */
    @Nullable
    public String getFormatProfile() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_PROFILE);
    }

    /**
     * Get the Codec ID (found in some containers) use of the video.
     *
     * @return Codec ID
     */
    @Nullable
    public String getCodecID() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.CODEC_ID);
    }

    /**
     * Get Play time of the stream in ms.
     *
     * @return Play time of the stream in ms
     */
    @Nullable
    public Double getDuration() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Commons.DURATION);
    }

    /**
     * Get Bit rate in bps.
     *
     * @return Bit rate in bps
     */
    @Nullable
    public Long getBitRate() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.BITRATE);
    }

    /**
     * Get Width (aperture size if present) in pixel.
     *
     * @return Width (aperture size if present) in pixel
     */
    @Nullable
    public Integer getWidth() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Video.WIDTH);
    }

    /**
     * Get Height (aperture size if present) in pixel.
     *
     * @return Height (aperture size if present) in pixel
     */
    @Nullable
    public Integer getHeight() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Video.HEIGHT);
    }

    /**
     * Get the Display Aspect ratio use of the video.
     *
     * @return Display Aspect ratio
     */
    @Nullable
    public Double getDisplayAspectRatio() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.DISPLAY_ASPECT_RATIO);
    }

    /**
     * Get the Frames per second.
     *
     * @return Frames per second, null if something goes wrong
     */
    @Nullable
    public Double getFrameRate() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.FRAME_RATE);
    }

    /**
     * Get the Language use of the video.
     *
     * @return Language
     */
    @Nullable
    public String getLanguage() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.LANGUAGE);
    }

    /**
     * Get stream type name.
     *
     * @return stream type name
     */
    @Nullable
    public String getStreamKind() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMKIND);
    }

    /**
     * Get stream type name.
     *
     * @return stream type name
     */
    @Nullable
    public String getStreamKindString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAM_KIND_STRING);
    }

    /**
     * Get number of the stream (base=0).
     *
     * @return number of the stream (base=0)
     */
    @Nullable
    public Integer getStreamKindID() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Commons.STREAM_KIND_ID);
    }

    /**
     * When multiple streams, number of the stream (base=1).
     *
     * @return number of the stream (base=1)
     */
    @Nullable
    public Integer getStreamKindPosition() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Commons.STREAM_KIND_POS);
    }

    /**
     * Get the ID for this stream in this file.
     *
     * @return ID for this stream in this file
     */
    @Nullable
    public Integer getID() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Commons.ID);
    }

    /**
     * Get stream order in the file, whatever is the kind of stream (base=0).
     *
     * @return stream order in the file
     */
    @Nullable
    public Integer getStreamKindOrder() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Commons.STREAMORDER);
    }

    /**
     * Get stream order in the file, whatever is the kind of stream (base=0).
     *
     * @return stream order in the file
     */
    @Nullable
    public String getIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ID_STRING);
    }

    /**
     * Get play time in format : XXx YYy only, YYy omitted if zero.
     *
     * @return play time
     */
    @Nullable
    public String getDurationString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING);
    }

    /**
     * Get play time in format : HHh MMmn SSs MMMms, XX omited if zero.
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType1() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING1);
    }

    /**
     * Get play time in format : XXx YYy only, YYy omited if zero.
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType2() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING2);
    }

    /**
     * Get play time in format : HH:MM:SS.MMM.
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType3() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING3);
    }

    /**
     * Get play time in format : HH:MM:SS:FF (HH:MM:SS).
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType4() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DURATION_STRING4);
    }

    /**
     * Get the unique ID for this stream, should be copied with stream copy.
     *
     * @return unique ID for this stream
     */
    @Nullable
    public BigInteger getUniqueID() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, this.streamNumber, Commons.UNIQUE_ID);
    }

    /**
     * Get the unique ID for this stream, should be copied with stream copy.
     *
     * @return unique ID for this stream
     */
    @Nullable
    public String getUniqueIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.UNIQUE_ID_STRING);
    }

    /**
     * Get the menu ID for this stream in this file.
     *
     * @return menu ID for this stream in this file
     */
    @Nullable
    public Integer getMenuID() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Commons.MENUID);
    }

    /**
     * Get the menu ID for this stream in this file.
     *
     * @return menu ID for this stream in this file
     */
    @Nullable
    public String getMenuIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.MENUID_STRING);
    }

    /**
     * Get the format version use of the file.
     *
     * @return format version use
     */
    @Nullable
    public String getFormatVersion() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_VERSION);
    }

    /**
     * Get link to a description of this format.
     *
     * @return link to a description of this format
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found.
     */
    @Nullable
    public URL getFormatURL() throws MalformedURLException {
        return getMediaInfo().getAsURL(StreamKind.Video, this.streamNumber, Commons.FORMAT_URL);
    }

    /**
     * Get commercial name used by vendor for theses settings or Format field if there is no difference.
     *
     * @return commercial name
     */
    @Nullable
    public String getFormatCommercial() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_COMMERCIAL);
    }

    /**
     * Get commercial name used by vendor for theses settings or Format field if there is no difference.
     *
     * @return commercial name
     */
    @Nullable
    public String getFormatCommercialIfAny() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_COMMERCIAL_IF_ANY);
    }

    /**
     * Get compression method used.
     *
     * @return compression method
     */
    @Nullable
    public String getFormatCompression() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_COMPRESSION);
    }

    /**
     * Get multiview, profile of the base stream.
     *
     * @return profile of the base stream
     */
    @Nullable
    public String getMultiviewBaseProfile() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.MULTIVIEW_BASEPROFILE);
    }

    /**
     * Get multiview, count of views.
     *
     * @return count of views
     */
    @Nullable
    public Integer getMultiviewCount() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Video.MULTIVIEW_COUNT);
    }

    /**
     * Get multiview, how views are muxed in the container in case of it is not muxing in the stream.
     *
     * @return how views are muxed in the container in case of it is not muxing in the stream
     */
    @Nullable
    public String getMultiviewLayout() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.MULTIVIEW_LAYOUT);
    }

    /**
     * Get settings needed for decoder used.
     *
     * @return settings
     */
    @Nullable
    public String getFormatSettings() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_SETTINGS);
    }

    /**
     * Get Internet Media Type (a.k.a MIME Type, Content-Type).
     *
     * @return Internet Media Type
     */
    @Nullable
    public String getInternetMediaType() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.INTERNET_MEDIA_TYPE);
    }

    /**
     * Get how this file is muxed in the container.
     *
     * @return How this file is muxed in the container
     */
    @Nullable
    public String getMuxingMode() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.MUXING_MODE);
    }

    /**
     * Get codec ID (final found in some containers).
     *
     * @return codec ID
     */
    @Nullable
    public String getCodecIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.CODEC_ID_STRING);
    }

    /**
     * Get info about this codec.
     *
     * @return info about this codec
     */
    @Nullable
    public String getCodecIDInfo() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.CODEC_ID_INFO);
    }

    /**
     * Get hint/popular name for this codec.
     *
     * @return hint/popular name
     */
    @Nullable
    public String getCodecIDHint() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.CODEC_ID_HINT);
    }

    /**
     * Get link to more details about this codec ID.
     *
     * @return link to more details
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found
     */
    @Nullable
    public URL getCodecIDURL() throws MalformedURLException {
        return getMediaInfo().getAsURL(StreamKind.Video, this.streamNumber, Commons.CODEC_ID_URL);
    }

    /**
     * Get manual description given by the container.
     *
     * @return manual description
     */
    @Nullable
    public String getCodecIDDescription() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.CODEC_ID_DESCRIPTION);
    }

    /**
     * Get duration of the first frame if it is longer than others, in ms.
     *
     * @return Duration
     */
    @Nullable
    public Long getDurationFirstTrame() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.DURATION_FIRSTFRAME);
    }

    /**
     * Get duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     *
     * @return Duration
     */
    @Nullable
    public String getDurationFirstTrameType1() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DURATION_FIRSTFRAME_STRING_TYPE1);
    }

    /**
     * Get duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
     *
     * @return Duration
     */
    @Nullable
    public String getDurationFirstTrameType2() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DURATION_FIRSTFRAME_STRING_TYPE2);
    }

    /**
     * Get duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
     *
     * @return Duration
     */
    @Nullable
    public String getDurationFirstTrameType3() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DURATION_FIRSTFRAME_STRING_TYPE3);
    }

    /**
     * Get bit rate mode (VBR, CBR).
     *
     * @return bit rate mode
     */
    @Nullable
    public String getBitRateMode() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_MODE);
    }

    /**
     * Get bit rate mode (Variable, Cconstant).
     *
     * @return bit rate mode
     */
    @Nullable
    public String getBitRateModeString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_MODE_STRING);
    }

    /**
     * Get bit rate (with measurement).
     *
     * @return bit rate
     */
    @Nullable
    public String getBitRateString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_STRING);
    }

    /**
     * Get minimum bit rate in bps.
     *
     * @return minimum bit rate
     */
    @Nullable
    public Long getBitRateMinimum() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.BITRATE_MINIMUM);
    }

    /**
     * Get minimum bit rate in bps (with measurement).
     *
     * @return minimum bit rate
     */
    @Nullable
    public String getBitRateMinimumString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_MINIMUM_STRING);
    }

    /**
     * Get nominal bit rate in bps.
     *
     * @return nominal bit rate
     */
    @Nullable
    public Long getBitRateNominal() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.BITRATE_NOMINAL);
    }

    /**
     * Get nominal bit rate in bps (with measurement).
     *
     * @return nominal bit rate
     */
    @Nullable
    public String getBitRateNominalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_NOMINAL_STRING);
    }

    /**
     * Get maximum bit rate in bps.
     *
     * @return maximum bit rate
     */
    @Nullable
    public Long getBitRateMaximum() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.BITRATE_MAXIMUM);
    }

    /**
     * Get maximum bit rate in bps (with measurement).
     *
     * @return maximum bit rate
     */
    @Nullable
    public String getBitRateMaximumString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_MAXIMUM_STRING);
    }

    /**
     * Get encoded (with forced padding) bit rate in bps, if some container padding is present.
     *
     * @return encoded bit rate
     */
    @Nullable
    public Long getBitRateEncoded() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.BITRATE_ENCODED);
    }

    /**
     * Get encoded (with forced padding) bit rate (with measurement), if some container padding is present.
     *
     * @return encoded bit rate
     */
    @Nullable
    public String getBitRateEncodedString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE_ENCODED_STRING);
    }

    /**
     * Get original (in the raw stream) width in pixel.
     *
     * @return original (in the raw stream) width
     */
    @Nullable
    public Long getWidthOriginal() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.WIDTH_ORIGINAL);
    }

    /**
     * Get original (in the raw stream) width with measurement (pixel).
     *
     * @return original (in the raw stream) width
     */
    @Nullable
    public String getWidthOriginalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.WIDTH_ORIGINAL_STRING);
    }

    /**
     * Get height (aperture size if present) with measurement (pixel).
     *
     * @return height
     */
    @Nullable
    public String getHeightString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.HEIGHT_STRING);
    }

    /**
     * Get offset between original height and displayed height (aperture size) in pixel.
     *
     * @return offset between original height and displayed height
     */
    @Nullable
    public Long getHeightOffset() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.HEIGHT_OFFSET);
    }

    /**
     * Get offset between original height and displayed height (aperture size) in pixel.
     *
     * @return offset between original height and displayed height
     */
    @Nullable
    public String getHeightOffsetString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.HEIGHT_OFFSET_STRING);
    }

    /**
     * Get original (in the raw stream) height in pixel.
     *
     * @return original (in the raw stream) height
     */
    @Nullable
    public Long getHeightOriginal() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Video.HEIGHT_ORIGINAL);
    }

    /**
     * Get original (in the raw stream) height with measurement (pixel).
     *
     * @return original (in the raw stream) height
     */
    @Nullable
    public String getHeightOriginalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.HEIGHT_ORIGINAL_STRING);
    }

    /**
     * Get pixel aspect ratio.
     *
     * @return pixel aspect ratio
     */
    @Nullable
    public Double getPixelAspectRatio() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.PIXEL_ASPECT_RATIO);
    }

    /**
     * Get pixel aspect ratio with measurement (pixel).
     *
     * @return pixel aspect ratio
     */
    @Nullable
    public String getPixelAspectRatioString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.PIXEL_ASPECT_RATIO_STRING);
    }

    /**
     * Get original pixel aspect ratio.
     *
     * @return original pixel aspect ratio
     */
    @Nullable
    public Double getPixelAspectRatioOriginal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.PIXEL_ASPECT_RATIO_ORIGINAL);
    }

    /**
     * Get original pixel aspect ratio with measurement (pixel).
     *
     * @return original pixel aspect ratio
     */
    @Nullable
    public String getPixelAspectRatioOriginalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.PIXEL_ASPECT_RATIO_ORIGINAL_STRING);
    }

    /**
     * Get display aspect ratio.
     *
     * @return display aspect ratio
     */
    @Nullable
    public String getDisplayAspectRatioString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DISPLAY_ASPECT_RATIO_STRING);
    }

    /**
     * Get original display aspect ratio.
     *
     * @return original display aspect ratio
     */
    @Nullable
    public Double getDisplayAspectRatioOriginal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.DISPLAY_ASPECT_RATIO_ORIGINAL);
    }

    /**
     * Get original display aspect ratio with measurement (pixel).
     *
     * @return original display aspect ratio
     */
    @Nullable
    public String getDisplayAspectRatioOriginalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DISPLAY_ASPECT_RATIO_ORIGINAL_STRING);
    }

    /**
     * Get Active Format Description (AFD value).
     *
     * @return Active Format Description
     */
    @Nullable
    public String getActiveFormatDescription() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.ACTIVE_FORMAT_DESCRIPTION);
    }

    /**
     * Get Active Format Description (text).
     *
     * @return Active Format Description
     */
    @Nullable
    public String getActiveFormatDescriptionString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.ACTIVE_FORMAT_DESCRIPTION_STRING);
    }

    /**
     * Get rotation.
     *
     * @return rotation
     */
    @Nullable
    public String getRotation() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.ROTATION);
    }

    /**
     * Get rotation (if not horizontal).
     *
     * @return rotation
     */
    @Nullable
    public String getRotationString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.ROTATION_STRING);
    }

}
