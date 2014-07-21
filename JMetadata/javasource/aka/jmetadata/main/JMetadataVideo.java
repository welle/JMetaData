package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aka.jmetadata.main.constants.Commons;
import aka.jmetadata.main.constants.InfoKind;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.constants.Video;
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
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the format info use of the video.
     *
     * @return format info use
     */
    @Nullable
    public String getFormatInfo() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FORMAT_INFO, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the profile of the format use of the video.
     *
     * @return profile format info use
     */
    @Nullable
    public String getFormatProfile() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FORMAT_PROFILE, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the Codec ID (found in some containers) use of the video.
     *
     * @return Codec ID
     */
    @Nullable
    public String getCodecID() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.CODEC_ID, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get Play time of the stream in ms.
     *
     * @return Play time of the stream in ms
     */
    @Nullable
    public Double getDuration() {
        Double result = null;
        final String duration = getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DURATION, InfoKind.Text, InfoKind.Name);
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
        final String bitRate = getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.BITRATE, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(bitRate)) {
            result = Long.valueOf(bitRate);
        }

        return result;
    }

    /**
     * Get Width (aperture size if present) in pixel.
     *
     * @return Width (aperture size if present) in pixel
     */
    @Nullable
    public Integer getWidth() {
        Integer result = null;
        final String width = getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.WIDTH, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(width)) {
            result = Integer.valueOf(width);
        }

        return result;
    }

    /**
     * Get Height (aperture size if present) in pixel.
     *
     * @return Height (aperture size if present) in pixel
     */
    @Nullable
    public Integer getHeight() {
        Integer result = null;
        final String height = getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.HEIGHT, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(height)) {
            result = Integer.valueOf(height);
        }

        return result;
    }

    /**
     * Get the Display Aspect ratio use of the video.
     *
     * @return Display Aspect ratio
     */
    @Nullable
    public Double getDisplayAspectRatio() {
        Double result = null;
        final String aspectRatio = getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DISPLAY_ASPECT_RATIO, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(aspectRatio)) {
            result = Double.valueOf(aspectRatio);
        }

        return result;
    }

    /**
     * Get the Frames per second.
     *
     * @return Frames per second, null if something goes wrong
     */
    @Nullable
    public Double getFrameRate() {
        Double result = null;
        final String frameRate = getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.FRAME_RATE, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(frameRate)) {
            result = Double.valueOf(frameRate);
        }

        return result;
    }

    /**
     * Get the Language use of the video.
     *
     * @return Language
     */
    @Nullable
    public String getLanguage() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.LANGUAGE, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get stream type name.
     *
     * @return stream type name
     */
    @Nullable
    public String getStreamKind() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMKIND, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get stream type name.
     *
     * @return stream type name
     */
    @Nullable
    public String getStreamKindString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAM_KIND_STRING, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get number of the stream (base=0).
     *
     * @return number of the stream (base=0)
     */
    @Nullable
    public Integer getStreamKindID() {
        Integer result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAM_KIND_ID, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(value)) {
            result = Integer.valueOf(value);
        }
        return result;
    }

    /**
     * When multiple streams, number of the stream (base=1).
     *
     * @return number of the stream (base=1)
     */
    @Nullable
    public Integer getStreamKindPosition() {
        Integer result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAM_KIND_POS, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(value)) {
            result = Integer.valueOf(value);
        }
        return result;
    }

    /**
     * Get the ID for this stream in this file.
     *
     * @return ID for this stream in this file
     */
    @Nullable
    public Integer getID() {
        Integer result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ID, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(value)) {
            result = Integer.valueOf(value);
        }
        return result;
    }

    /**
     * Get stream order in the file, whatever is the kind of stream (base=0).
     *
     * @return stream order in the file
     */
    @Nullable
    public Integer getStreamKindOrder() {
        Integer result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.STREAMORDER, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(value)) {
            result = Integer.valueOf(value);
        }
        return result;
    }

    /**
     * Get stream order in the file, whatever is the kind of stream (base=0).
     *
     * @return stream order in the file
     */
    @Nullable
    public String getIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.ID_STRING, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get play time in format : XXx YYy only, YYy omitted if zero.
     *
     * @return play time
     */
    @Nullable
    public String getDurationString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get play time in format : HHh MMmn SSs MMMms, XX omited if zero.
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType1() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING1, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get play time in format : XXx YYy only, YYy omited if zero.
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType2() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING2, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get play time in format : HH:MM:SS.MMM.
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType3() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.DURATION_STRING3, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get play time in format : HH:MM:SS:FF (HH:MM:SS).
     *
     * @return play time
     */
    @Nullable
    public String getDurationStringType4() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Video.DURATION_STRING4, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the unique ID for this stream, should be copied with stream copy.
     *
     * @return unique ID for this stream
     */
    @Nullable
    public BigInteger getUniqueID() {
        BigInteger result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.UNIQUE_ID, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(value)) {
            result = new BigInteger(value);
        }
        return result;
    }

    /**
     * Get the unique ID for this stream, should be copied with stream copy.
     *
     * @return unique ID for this stream
     */
    @Nullable
    public String getUniqueIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.UNIQUE_ID_STRING, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the menu ID for this stream in this file.
     *
     * @return menu ID for this stream in this file
     */
    @Nullable
    public Integer getMenuID() {
        Integer result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.MENUID, InfoKind.Text, InfoKind.Name);
        if (TextUtils.isDigit(value)) {
            result = new Integer(value);
        }
        return result;
    }

    /**
     * Get the menu ID for this stream in this file.
     *
     * @return menu ID for this stream in this file
     */
    @Nullable
    public String getMenuIDString() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.MENUID_STRING, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get the format version use of the file.
     *
     * @return format version use
     */
    @Nullable
    public String getFormatVersion() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_VERSION, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get link to a description of this format.
     *
     * @return link to a description of this format
     * @throws MalformedURLException if no protocol is specified or an unknown protocol is found.
     */
    @Nullable
    public URL getFormatURL() throws MalformedURLException {
        URL result = null;
        final String value = getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_URL, InfoKind.Text, InfoKind.Name);
        if (!TextUtils.isEmpty(value)) {
            result = new URL(value);
        }

        return result;
    }

    /**
     * Get commercial name used by vendor for theses settings or Format field if there is no difference.
     *
     * @return commercial name
     */
    @Nullable
    public String getFormatCommercial() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_COMMERCIAL, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get commercial name used by vendor for theses settings or Format field if there is no difference.
     *
     * @return commercial name
     */
    @Nullable
    public String getFormatCommercialIfAny() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_COMMERCIAL_IF_ANY, InfoKind.Text, InfoKind.Name);
    }

    /**
     * Get compression method used.
     *
     * @return compression method
     */
    @Nullable
    public String getFormatCompression() {
        return getMediaInfo().get(StreamKind.Video, this.streamNumber, Commons.FORMAT_COMPRESSION, InfoKind.Text, InfoKind.Name);
    }

}
