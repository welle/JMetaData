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
     * Get the Language use of the video.<br>
     * Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
     *
     * @return Language
     */
    @Nullable
    public String getLanguage() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (full).
     *
     * @return Language
     */
    @Nullable
    public String getLanguageString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE_STRING);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (full).
     *
     * @return Language
     */
    @Nullable
    public String getLanguageString1() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE_STRING1);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (2-letter ISO 639-1 if exists, else empty).
     *
     * @return Language
     */
    @Nullable
    public String getLanguageString2() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE_STRING2);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (3-letter ISO 639-2 if exists, else empty).
     *
     * @return Language
     */
    @Nullable
    public String getLanguageString3() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE_STRING3);
    }

    /**
     * Get the Language use of the video.<br>
     * Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
     *
     * @return Language
     */
    @Nullable
    public String getLanguageString4() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE_STRING4);
    }

    /**
     * Get more info about Language (e.g. Director's Comment).
     *
     * @return more info
     */
    @Nullable
    public String getLanguageMore() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.LANGUAGE_MORE);
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

    /**
     * Get frame rate mode (CFR, VFR).
     *
     * @return frame rate mode (CFR, VFR)
     */
    @Nullable
    public String getFrameRateMode() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MODE);
    }

    /**
     * Get frame rate mode (Constant, Variable).
     *
     * @return frame rate mode (Constant, Variable)
     */
    @Nullable
    public String getFrameRateModeString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MODE_STRING);
    }

    /**
     * Get original frame rate mode (CFR, VFR).
     *
     * @return original frame rate mode (CFR, VFR)
     */
    @Nullable
    public String getFrameRateModeOriginal() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MODE_ORIGINAL);
    }

    /**
     * Get original frame rate mode (Constant, Variable).
     *
     * @return original frame rate mode (Constant, Variable)
     */
    @Nullable
    public String getFrameRateModeOriginalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MODE_ORIGINAL_STRING);
    }

    /**
     * Get frames per second (with measurement).
     *
     * @return frames per second (with measurement)
     */
    @Nullable
    public String getFrameRateString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_STRING);
    }

    /**
     * Get original (in the raw stream) frames per second.
     *
     * @return original (in the raw stream) frames per second
     */
    @Nullable
    public Double getFrameRateOriginal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.FRAMERATE_ORIGINAL);
    }

    /**
     * Get original (in the raw stream) frames per second (with measurement).
     *
     * @return original (in the raw stream) frames per second
     */
    @Nullable
    public String getFrameRateOriginalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_ORIGINAL_STRING);
    }

    /**
     * Get minimum frames per second.
     *
     * @return minimum frames per second
     */
    @Nullable
    public Double getFrameRateMinimum() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MINIMUM);
    }

    /**
     * Get minimum frames per second (with measurement).
     *
     * @return minimum frames per second
     */
    @Nullable
    public String getFrameRateMinimumString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MINIMUM_STRING);
    }

    /**
     * Get nominal frames per second.
     *
     * @return nominal frames per second
     */
    @Nullable
    public Double getFrameRateNominal() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.FRAMERATE_NOMINAL);
    }

    /**
     * Get nominal frames per second (with measurement).
     *
     * @return nominal frames per second
     */
    @Nullable
    public String getFrameRateNominalString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_NOMINAL_STRING);
    }

    /**
     * Get maximum frames per second.
     *
     * @return maximum frames per second
     */
    @Nullable
    public Double getFrameRateMaximum() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MAXIMUM);
    }

    /**
     * Get maximum frames per second (with measurement).
     *
     * @return maximum frames per second
     */
    @Nullable
    public String getFrameRateMaximumString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAMERATE_MAXIMUM_STRING);
    }

    /**
     * Get number of frames.
     *
     * @return number of frames
     */
    @Nullable
    public BigInteger getFrameCount() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, this.streamNumber, Video.FRAMECOUNT);
    }

    /**
     * Get source number of frames.
     *
     * @return source number of frames
     */
    @Nullable
    public String getSourceFrameCount() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.SOURCE_FRAMECOUNT);
    }

    /**
     * Get standard (NTSC or PAL).
     *
     * @return standard
     */
    @Nullable
    public String getStandard() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.STANDARD);
    }

    /**
     * Get the time/date/year that the encoding of this item was completed began.
     *
     * @return the time/date/year
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    @Nullable
    public Date getEncodedDate() throws ParseException {
        return getMediaInfo().getAsDate(StreamKind.Video, this.streamNumber, Commons.ENCODED_DATE);
    }

    /**
     * Get the time/date/year that the tags were done for this item.
     *
     * @return the time/date/year
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    @Nullable
    public Date getTaggedDate() throws ParseException {
        return getMediaInfo().getAsDate(StreamKind.Video, this.streamNumber, Commons.TAGGED_DATE);
    }

    /**
     * Get the name of the software package used to create the file, such as Microsoft WaveEdit.
     *
     * @return name of the software package
     */
    @Nullable
    public String getEncodedApplication() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_APPLICATION);
    }

    /**
     * Get link of the software package used to create the file, such as Microsoft WaveEdit.
     *
     * @return link of the software package used to create the file, such as Microsoft WaveEdit.
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found.
     */
    @Nullable
    public URL getEncodedApplicationURL() throws MalformedURLException {
        return getMediaInfo().getAsURL(StreamKind.Video, this.streamNumber, Commons.ENCODED_APPLICATION_URL);
    }

    /**
     * Get software used to create the file.
     *
     * @return software used to create the file
     */
    @Nullable
    public String getEncodedLibrary() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_LIBRARY);
    }

    /**
     * Get software used to create the file.
     *
     * @return software used to create the file
     */
    @Nullable
    public String getEncodedLibraryString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_LIBRARY_STRING);
    }

    /**
     * Get name of the the encoding-software.
     *
     * @return name of the the encoding-software
     */
    @Nullable
    public String getEncodedLibraryName() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_LIBRARY_NAME);
    }

    /**
     * Get version of the the encoding-software.
     *
     * @return version of the the encoding-software
     */
    @Nullable
    public String getEncodedLibraryVersion() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_LIBRARY_VERSION);
    }

    /**
     * Get release date of the the encoding-software.
     *
     * @return release date of the the encoding-software
     */
    @Nullable
    public String getEncodedLibraryDate() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_LIBRARY_DATE);
    }

    /**
     * Get parameters used by the software.
     *
     * @return parameters used by the software
     */
    @Nullable
    public String getEncodedLibrarySettings() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCODED_LIBRARY_SETTINGS);
    }

    /**
     * Get stream size.
     *
     * @return stream size
     */
    @Nullable
    public Long getStreamsize() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public String getStreamsizeString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_STRING);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public String getStreamsizeStringType1() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_STRING1);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public String getStreamsizeStringType2() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_STRING2);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public String getStreamsizeStringType3() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_STRING3);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public String getStreamsizeStringType4() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_STRING4);
    }

    /**
     * Get stream size with measurements.
     *
     * @return stream size
     */
    @Nullable
    public String getStreamsizeStringType5() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_STRING5);
    }

    /**
     * Get stream size divided by file size.
     *
     * @return stream size
     */
    @Nullable
    public Double getStreamsizeProportion() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Commons.STREAMSIZE_PROPORTION);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return <code>true</code> if that track should be used if no language found matches the user preference
     */
    public boolean isDefault() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, this.streamNumber, Commons.DEFAULT);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return that track should be used if no language found matches the user preference
     */
    @Nullable
    public String getDefaultString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DEFAULT_STRING);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return <code>true</code> if that track should be used if no language found matches the user preference
     */
    public boolean isForced() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, this.streamNumber, Commons.FORCED);
    }

    /**
     * Is that track should be used if no language found matches the user preference.
     *
     * @return that track should be used if no language found matches the user preference
     */
    @Nullable
    public String getForcedString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORCED_STRING);
    }

    /**
     * How this stream file is aligned in the container.
     *
     * @return How this stream file is aligned in the container
     */
    @Nullable
    public String getAlignment() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ALIGNMENT);
    }

    /**
     * How this stream file is aligned in the container.
     *
     * @return How this stream file is aligned in the container
     */
    @Nullable
    public String getAlignmentString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ALIGNMENT_STRING);
    }

    /**
     * Get name of the track.
     *
     * @return name of the track
     */
    @Nullable
    public String getTitle() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.TITLE);
    }

    /**
     * Get color space.
     *
     * @return color space
     */
    @Nullable
    public String getColorSpace() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.COLORSPACE);
    }

    /**
     * Get chroma subsampling.
     *
     * @return chroma subsampling
     */
    @Nullable
    public String getChromaSubsampling() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.CHROMASUBSAMPLING);
    }

    /**
     * Get bit depth (16/24/32) in bits.
     *
     * @return bit depth
     */
    @Nullable
    public Integer getBitDepth() {
        return getMediaInfo().getAsInteger(StreamKind.Video, this.streamNumber, Video.BITDEPTH);
    }

    /**
     * Get bit depth (16/24/32) in bits.
     *
     * @return bit depth
     */
    @Nullable
    public String getBitDepthString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITDEPTH_STRING);
    }

    /**
     * Get scantype.
     *
     * @return scantype
     */
    @Nullable
    public String getScanType() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.SCANTYPE);
    }

    /**
     * Get scantype.
     *
     * @return scantype
     */
    @Nullable
    public String getScanTypeString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.SCANTYPE_STRING);
    }

    /**
     * Get scanorder.
     *
     * @return scanorder
     */
    @Nullable
    public String getScanOrder() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.SCANORDER);
    }

    /**
     * Get scanorder.
     *
     * @return scanorder
     */
    @Nullable
    public String getScanOrderString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.SCANORDER_STRING);
    }

    /**
     * Get compression mode (Lossy or Lossless).
     *
     * @return compression mode
     */
    @Nullable
    public String getCompressionMode() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.COMPRESSION_MODE);
    }

    /**
     * Get compression mode (Lossy or Lossless).
     *
     * @return compression mode
     */
    @Nullable
    public String getCompressionModeString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.COMPRESSION_MODE_STRING);
    }

    /**
     * Get current stream size divided by uncompressed stream size.
     *
     * @return current stream size divided by uncompressed stream size
     */
    @Nullable
    public Double getCompressionRatio() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Commons.COMPRESSION_RATIO);
    }

    /**
     * Get bits/(Pixel*Frame) (like Gordian Knot).
     *
     * @return bits/(Pixel*Frame)
     */
    @Nullable
    public Double getBitsDividedPixelsFrame() {
        return getMediaInfo().getAsDouble(StreamKind.Video, this.streamNumber, Video.BITS_DIVIDED_PIXELSFRAME);
    }

    /**
     * Get delay fixed in the stream (relative) IN MS.
     *
     * @return delay
     */
    @Nullable
    public Long getDelay() {
        return getMediaInfo().getAsLong(StreamKind.Video, this.streamNumber, Commons.DELAY);
    }

    /**
     * Get delay with measurement.
     *
     * @return delay
     */
    @Nullable
    public String getDelayString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DELAY_STRING);
    }

    /**
     * Get delay with measurement.
     *
     * @return delay
     */
    @Nullable
    public String getDelayStringType1() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DELAY_STRING1);
    }

    /**
     * Get delay with measurement.
     *
     * @return delay
     */
    @Nullable
    public String getDelayStringType2() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DELAY_STRING2);
    }

    /**
     * Get delay in format : HH:MM:SS.MMM.
     *
     * @return delay
     */
    @Nullable
    public String getDelayStringType3() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DELAY_STRING3);
    }

    /**
     * Get delay in format : HH:MM:SS:FF (HH:MM:SS).
     *
     * @return delay
     */
    @Nullable
    public String getDelayStringType4() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DELAY_STRING4);
    }

    /**
     * Get delay settings (in case of timecode for example).
     *
     * @return delay
     */
    @Nullable
    public String getDelaySettings() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DELAY_SETTINGS);
    }

    /**
     * Get encryption.
     *
     * @return encryption
     */
    @Nullable
    public String getEncryption() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ENCRYPTION);
    }

    /**
     * Get the size of the buffer needed to decode the sequence.
     *
     * @return the size of the buffer needed to decode the sequence.
     */
    @Nullable
    public String getBufferSize() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BUFFERSIZE);
    }
}
