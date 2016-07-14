package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.URL;
import java.time.LocalDate;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.Video;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract Video informations of a specific Video stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataVideo extends AbstractStreamJMetadata {

   /**
    * Constructor.
    * 
    * @param mediaInfo instance of MediaInfo JNA library
    * @param streamNumber number of the stream to parse
    * @see MediaInfo
    */
    public JMetaDataVideo(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo, streamNumber);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final Integer getWidthOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final Long getWidthOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final LocalDate getWidthOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final String getWidthOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final Boolean getWidthOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final BigInteger getWidthOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }

   /**
    * Get Original (in the raw stream) width in pixel.
    * 
    * @return Original (in the raw stream) width in pixel.
    */
    @Nullable
    public final URL getWidthOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINAL);
    }


   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Integer getDelayOriginalSourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Long getDelayOriginalSourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final LocalDate getDelayOriginalSourceAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final String getDelayOriginalSourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Boolean getDelayOriginalSourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final BigInteger getDelayOriginalSourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final URL getDelayOriginalSourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSOURCE);
    }


   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getStreamOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getStreamOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDate getStreamOrderAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getStreamOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getStreamOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getStreamOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMORDER);
    }


   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalDate getEncodedLibraryNameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYNAME);
    }


   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final Integer getMultiViewLayoutAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }

   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final Long getMultiViewLayoutAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }

   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final LocalDate getMultiViewLayoutAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }

   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final String getMultiViewLayoutAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }

   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final Boolean getMultiViewLayoutAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }

   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final BigInteger getMultiViewLayoutAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }

   /**
    * Get Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    * 
    * @return Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @Nullable
    public final URL getMultiViewLayoutAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWLAYOUT);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getDurationFirstFrameString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING4);
    }


   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final Integer getcolourprimariesAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final Long getcolourprimariesAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final LocalDate getcolourprimariesAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final String getcolourprimariesAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final Boolean getcolourprimariesAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final BigInteger getcolourprimariesAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final URL getcolourprimariesAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIES);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getDurationFirstFrameString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING5);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getDurationFirstFrameString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING);
    }


   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final Integer getRotationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }

   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final Long getRotationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }

   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final LocalDate getRotationStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }

   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final String getRotationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }

   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final Boolean getRotationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }

   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final BigInteger getRotationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }

   /**
    * Get Rotation (if not horizontal).
    * 
    * @return Rotation (if not horizontal).
    */
    @Nullable
    public final URL getRotationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ROTATIONSTRING);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getDurationFirstFrameString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING3);
    }


   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final Integer getScanTypeStoreMethodAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }

   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final Long getScanTypeStoreMethodAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }

   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final LocalDate getScanTypeStoreMethodAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }

   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final String getScanTypeStoreMethodAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }

   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final Boolean getScanTypeStoreMethodAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }

   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final BigInteger getScanTypeStoreMethodAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }

   /**
    * Get ScanType_StoreMethod.
    * 
    * @return ScanType_StoreMethod.
    */
    @Nullable
    public final URL getScanTypeStoreMethodAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHOD);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getSourceDurationLastFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getSourceDurationLastFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getSourceDurationLastFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAME);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDate getDurationFirstFrameString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING1);
    }


   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final Integer getWidthCleanApertureAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final Long getWidthCleanApertureAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final LocalDate getWidthCleanApertureAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final String getWidthCleanApertureAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final Boolean getWidthCleanApertureAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final BigInteger getWidthCleanApertureAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture width in pixel.
    * 
    * @return Clean Aperture width in pixel.
    */
    @Nullable
    public final URL getWidthCleanApertureAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURE);
    }


   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final Integer gettransfercharacteristicsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final Long gettransfercharacteristicsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final LocalDate gettransfercharacteristicsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final String gettransfercharacteristicsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final Boolean gettransfercharacteristicsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final BigInteger gettransfercharacteristicsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final URL gettransfercharacteristicsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICS);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODEC);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecFamilyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecFamilyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecFamilyAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecFamilyAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecFamilyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecFamilyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecFamilyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECFAMILY);
    }


   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final Integer getFormatSettingsGOPAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }

   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final Long getFormatSettingsGOPAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }

   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final LocalDate getFormatSettingsGOPAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }

   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final String getFormatSettingsGOPAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }

   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final Boolean getFormatSettingsGOPAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }

   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final BigInteger getFormatSettingsGOPAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }

   /**
    * Get Settings needed for decoder used, detailled (M=x N=y).
    * 
    * @return Settings needed for decoder used, detailled (M=x N=y).
    */
    @Nullable
    public final URL getFormatSettingsGOPAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGOP);
    }


   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final Integer getWidthCleanApertureStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final Long getWidthCleanApertureStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final LocalDate getWidthCleanApertureStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final String getWidthCleanApertureStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final Boolean getWidthCleanApertureStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final BigInteger getWidthCleanApertureStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture width with measurement (pixel).
    * 
    * @return Clean Aperture width with measurement (pixel).
    */
    @Nullable
    public final URL getWidthCleanApertureStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHCLEANAPERTURESTRING);
    }


   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final Integer getFormatCompressionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }

   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final Long getFormatCompressionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }

   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final LocalDate getFormatCompressionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }

   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final String getFormatCompressionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }

   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final Boolean getFormatCompressionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }

   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final BigInteger getFormatCompressionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }

   /**
    * Get Compression mode of the Format.
    * 
    * @return Compression mode of the Format.
    */
    @Nullable
    public final URL getFormatCompressionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATCOMPRESSION);
    }


   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final Integer getAlignmentStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }

   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final Long getAlignmentStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }

   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final LocalDate getAlignmentStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }

   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final String getAlignmentStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }

   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final Boolean getAlignmentStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }

   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final BigInteger getAlignmentStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }

   /**
    * Get Alignment/String.
    * 
    * @return Alignment/String.
    */
    @Nullable
    public final URL getAlignmentStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ALIGNMENTSTRING);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDate getDelayStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING);
    }


   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING);
    }


   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Integer getCodecIDDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Long getCodecIDDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalDate getCodecIDDescriptionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final String getCodecIDDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Boolean getCodecIDDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final BigInteger getCodecIDDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final URL getCodecIDDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECIDDESCRIPTION);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecInfoAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECINFO);
    }


   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Integer getStatusAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Long getStatusAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalDate getStatusAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final String getStatusAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Boolean getStatusAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final BigInteger getStatusAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final URL getStatusAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STATUS);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getDurationFirstFrameStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAMESTRING);
    }


   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Integer getFrameRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Long getFrameRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalDate getFrameRateAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final String getFrameRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final URL getFrameRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATE);
    }


   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final Integer getMuxingModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }

   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final Long getMuxingModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }

   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final LocalDate getMuxingModeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }

   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final String getMuxingModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }

   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final Boolean getMuxingModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }

   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final BigInteger getMuxingModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }

   /**
    * Get How this file is muxed in the container.
    * 
    * @return How this file is muxed in the container.
    */
    @Nullable
    public final URL getMuxingModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MUXINGMODE);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecProfileAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECPROFILE);
    }


   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final Integer getScanTypeStoreMethodStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }

   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final Long getScanTypeStoreMethodStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }

   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final LocalDate getScanTypeStoreMethodStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }

   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final String getScanTypeStoreMethodStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }

   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final Boolean getScanTypeStoreMethodStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }

   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final BigInteger getScanTypeStoreMethodStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }

   /**
    * Get ScanType_StoreMethod/String.
    * 
    * @return ScanType_StoreMethod/String.
    */
    @Nullable
    public final URL getScanTypeStoreMethodStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODSTRING);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecDescriptionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECDESCRIPTION);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelaySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelaySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDate getDelaySettingsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelaySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelaySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelaySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelaySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSETTINGS);
    }


   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODED);
    }


   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final Integer getDisplayAspectRatioCleanApertureStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final Long getDisplayAspectRatioCleanApertureStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final LocalDate getDisplayAspectRatioCleanApertureStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final String getDisplayAspectRatioCleanApertureStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final Boolean getDisplayAspectRatioCleanApertureStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final BigInteger getDisplayAspectRatioCleanApertureStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final URL getDisplayAspectRatioCleanApertureStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURESTRING);
    }


   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final Integer getBitRateModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final Long getBitRateModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final LocalDate getBitRateModeStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final String getBitRateModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final Boolean getBitRateModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final BigInteger getBitRateModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Variable, Cconstant).
    * 
    * @return Bit rate mode (Variable, Cconstant).
    */
    @Nullable
    public final URL getBitRateModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEMODESTRING);
    }


   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final Integer getMultiViewCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }

   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final Long getMultiViewCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }

   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final LocalDate getMultiViewCountAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }

   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final String getMultiViewCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }

   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final Boolean getMultiViewCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }

   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final BigInteger getMultiViewCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }

   /**
    * Get Multiview, count of views.
    * 
    * @return Multiview, count of views.
    */
    @Nullable
    public final URL getMultiViewCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWCOUNT);
    }


   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final Integer getWidthOffsetStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final Long getWidthOffsetStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final LocalDate getWidthOffsetStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final String getWidthOffsetStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final Boolean getWidthOffsetStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final BigInteger getWidthOffsetStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final URL getWidthOffsetStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSETSTRING);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getColorimetryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getColorimetryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getColorimetryAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getColorimetryAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getColorimetryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getColorimetryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getColorimetryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLORIMETRY);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsBVOPStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsBVOPStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsBVOPStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsBVOPStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsBVOPStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsBVOPStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsBVOPStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOPSTRING);
    }


   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateMinimumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateMinimumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final LocalDate getFrameRateMinimumStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateMinimumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateMinimumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateMinimumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateMinimumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUMSTRING);
    }


   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalDate getEncodedLibraryVersionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYVERSION);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsFrameModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsFrameModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsFrameModeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsFrameModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsFrameModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsFrameModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsFrameModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSFRAMEMODE);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING);
    }


   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final Integer getCodecIDInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }

   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final Long getCodecIDInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }

   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final LocalDate getCodecIDInfoAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }

   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final String getCodecIDInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }

   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final Boolean getCodecIDInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }

   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final BigInteger getCodecIDInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }

   /**
    * Get Info on the codec.
    * 
    * @return Info on the codec.
    */
    @Nullable
    public final URL getCodecIDInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECIDINFO);
    }


   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final Integer getDisplayAspectRatioOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final Long getDisplayAspectRatioOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final LocalDate getDisplayAspectRatioOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final String getDisplayAspectRatioOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final Boolean getDisplayAspectRatioOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final BigInteger getDisplayAspectRatioOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final URL getDisplayAspectRatioOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINAL);
    }


   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final Integer getcolourdescriptionpresentOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final Long getcolourdescriptionpresentOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final LocalDate getcolourdescriptionpresentOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final String getcolourdescriptionpresentOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final Boolean getcolourdescriptionpresentOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final BigInteger getcolourdescriptionpresentOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final URL getcolourdescriptionpresentOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENTORIGINAL);
    }


   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Integer getStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Long getStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final LocalDate getStreamSizeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final String getStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final URL getStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZE);
    }


   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final Integer getActiveFormatDescriptionStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }

   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final Long getActiveFormatDescriptionStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }

   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final LocalDate getActiveFormatDescriptionStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }

   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final String getActiveFormatDescriptionStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }

   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final Boolean getActiveFormatDescriptionStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }

   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final BigInteger getActiveFormatDescriptionStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }

   /**
    * Get Active Format Description (text).
    * 
    * @return Active Format Description (text).
    */
    @Nullable
    public final URL getActiveFormatDescriptionStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONSTRING);
    }


   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final Integer getWidthStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }

   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final Long getWidthStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }

   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final LocalDate getWidthStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }

   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final String getWidthStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }

   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final Boolean getWidthStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }

   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final BigInteger getWidthStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }

   /**
    * Get Width (aperture size if present) with measurement (pixel).
    * 
    * @return Width (aperture size if present) with measurement (pixel).
    */
    @Nullable
    public final URL getWidthStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHSTRING);
    }


   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Integer getFormatInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Long getFormatInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final LocalDate getFormatInfoAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final String getFormatInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Boolean getFormatInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final BigInteger getFormatInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final URL getFormatInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATINFO);
    }


   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Integer getSourceStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Long getSourceStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final String getSourceStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final URL getSourceStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING1);
    }


   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Integer getSourceStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Long getSourceStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeProportionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final String getSourceStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Boolean getSourceStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final URL getSourceStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEPROPORTION);
    }


   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final Integer getCodecIDUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final Long getCodecIDUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final LocalDate getCodecIDUrlAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final String getCodecIDUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final Boolean getCodecIDUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final BigInteger getCodecIDUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec.
    * 
    * @return Homepage for more details about this codec.
    */
    @Nullable
    public final URL getCodecIDUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECIDURL);
    }


   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Integer getSourceStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Long getSourceStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final String getSourceStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final URL getSourceStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING2);
    }


   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final Integer getHeightStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }

   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final Long getHeightStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }

   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final LocalDate getHeightStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }

   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final String getHeightStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }

   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final Boolean getHeightStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }

   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final BigInteger getHeightStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }

   /**
    * Get Height with measurement (pixel).
    * 
    * @return Height with measurement (pixel).
    */
    @Nullable
    public final URL getHeightStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTSTRING);
    }


   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING5);
    }


   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Integer getSourceStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Long getSourceStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final String getSourceStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final URL getSourceStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING3);
    }


   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Integer getSourceStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Long getSourceStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final String getSourceStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final URL getSourceStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING4);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDate getDisabledStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISABLEDSTRING);
    }


   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final Integer getScanTypeOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }

   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final Long getScanTypeOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }

   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final LocalDate getScanTypeOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }

   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final String getScanTypeOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }

   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final Boolean getScanTypeOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }

   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final BigInteger getScanTypeOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }

   /**
    * Get ScanType_Original/String.
    * 
    * @return ScanType_Original/String.
    */
    @Nullable
    public final URL getScanTypeOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINALSTRING);
    }


   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Integer getEncodedOperatingSystemAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Long getEncodedOperatingSystemAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalDate getEncodedOperatingSystemAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final String getEncodedOperatingSystemAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedOperatingSystemAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedOperatingSystemAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final URL getEncodedOperatingSystemAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDOPERATINGSYSTEM);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsCABACAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsCABACAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsCABACAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsCABACAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsCABACAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsCABACAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsCABACAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSCABAC);
    }


   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final Integer getSampledHeightAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }

   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final Long getSampledHeightAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }

   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final LocalDate getSampledHeightAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }

   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final String getSampledHeightAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }

   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final Boolean getSampledHeightAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }

   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final BigInteger getSampledHeightAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }

   /**
    * Get Sampled height.
    * 
    * @return Sampled height.
    */
    @Nullable
    public final URL getSampledHeightAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SAMPLEDHEIGHT);
    }


   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedApplicationCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedApplicationCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDate getEncodedApplicationCompanyNameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedApplicationCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedApplicationCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedApplicationCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedApplicationCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONCOMPANYNAME);
    }


   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Integer getCompressionRatioAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Long getCompressionRatioAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final LocalDate getCompressionRatioAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final String getCompressionRatioAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Boolean getCompressionRatioAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final BigInteger getCompressionRatioAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final URL getCompressionRatioAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONRATIO);
    }


   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Integer getFormatCommercialIfAnyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Long getFormatCommercialIfAnyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalDate getFormatCommercialIfAnyAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final String getFormatCommercialIfAnyAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Boolean getFormatCommercialIfAnyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final BigInteger getFormatCommercialIfAnyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final URL getFormatCommercialIfAnyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIALIFANY);
    }


   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final Integer getTaggedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final Long getTaggedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final LocalDate getTaggedDateAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final String getTaggedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final Boolean getTaggedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final BigInteger getTaggedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final URL getTaggedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TAGGEDDATE);
    }


   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final Integer getDisplayAspectRatioCleanApertureAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final Long getDisplayAspectRatioCleanApertureAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final LocalDate getDisplayAspectRatioCleanApertureAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final String getDisplayAspectRatioCleanApertureAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final Boolean getDisplayAspectRatioCleanApertureAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final BigInteger getDisplayAspectRatioCleanApertureAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Display Aspect ratio.
    * 
    * @return Clean Aperture Display Aspect ratio.
    */
    @Nullable
    public final URL getDisplayAspectRatioCleanApertureAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOCLEANAPERTURE);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDate getIDStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.IDSTRING);
    }


   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final Integer getPixelAspectRatioOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final Long getPixelAspectRatioOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final LocalDate getPixelAspectRatioOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final String getPixelAspectRatioOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final Boolean getPixelAspectRatioOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final BigInteger getPixelAspectRatioOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final URL getPixelAspectRatioOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINAL);
    }


   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final Integer getmatrixcoefficientsOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final Long getmatrixcoefficientsOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final LocalDate getmatrixcoefficientsOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final String getmatrixcoefficientsOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final Boolean getmatrixcoefficientsOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final BigInteger getmatrixcoefficientsOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final URL getmatrixcoefficientsOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTSORIGINAL);
    }


   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Integer getCompressionModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Long getCompressionModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalDate getCompressionModeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final String getCompressionModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Boolean getCompressionModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final BigInteger getCompressionModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final URL getCompressionModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODE);
    }


   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final LocalDate getBitRateAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final String getBitRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATE);
    }


   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final Integer getEncodedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final Long getEncodedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalDate getEncodedDateAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final String getEncodedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final Boolean getEncodedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final BigInteger getEncodedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final URL getEncodedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDDATE);
    }


   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Integer getBitRateModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Long getBitRateModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final LocalDate getBitRateModeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final String getBitRateModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Boolean getBitRateModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final BigInteger getBitRateModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final URL getBitRateModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEMODE);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsGMCStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsGMCStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsGMCStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsGMCStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsGMCStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsGMCStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsGMCStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMCSTRING);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDate getUniqueIDAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.UNIQUEID);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSTRING);
    }


   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateMaximumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateMaximumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDate getBitRateMaximumStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateMaximumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateMaximumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateMaximumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateMaximumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUMSTRING);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getInterlacementAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getInterlacementAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getInterlacementAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getInterlacementAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getInterlacementAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getInterlacementAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getInterlacementAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENT);
    }


   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getDelayString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING3);
    }


   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final Integer getFormatSettingsMatrixDataAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }

   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final Long getFormatSettingsMatrixDataAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }

   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final LocalDate getFormatSettingsMatrixDataAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }

   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final String getFormatSettingsMatrixDataAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }

   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final Boolean getFormatSettingsMatrixDataAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }

   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final BigInteger getFormatSettingsMatrixDataAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }

   /**
    * Get Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    * 
    * @return Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @Nullable
    public final URL getFormatSettingsMatrixDataAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXDATA);
    }


   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getDelayString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING4);
    }


   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final Integer getColorSpaceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final Long getColorSpaceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final LocalDate getColorSpaceAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final String getColorSpaceAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final Boolean getColorSpaceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final BigInteger getColorSpaceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final URL getColorSpaceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLORSPACE);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDate getDelayString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDate getDelayString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING2);
    }


   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final Integer getTimeCodeSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }

   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final Long getTimeCodeSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }

   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final LocalDate getTimeCodeSettingsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }

   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final String getTimeCodeSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }

   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final Boolean getTimeCodeSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }

   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final BigInteger getTimeCodeSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }

   /**
    * Get Time code settings.
    * 
    * @return Time code settings.
    */
    @Nullable
    public final URL getTimeCodeSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMECODESETTINGS);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getDelayString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSTRING5);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsQPelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsQPelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsQPelAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsQPelAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsQPelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsQPelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsQPelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSQPEL);
    }


   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalDate getDelayAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAY);
    }


   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final Integer getGopOpenClosedFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final Long getGopOpenClosedFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final LocalDate getGopOpenClosedFirstFrameStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final String getGopOpenClosedFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final Boolean getGopOpenClosedFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final BigInteger getGopOpenClosedFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final URL getGopOpenClosedFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAMESTRING);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Integer getEncodedApplicationUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Long getEncodedApplicationUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalDate getEncodedApplicationUrlAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final String getEncodedApplicationUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Boolean getEncodedApplicationUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final BigInteger getEncodedApplicationUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final URL getEncodedApplicationUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONURL);
    }


   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final Integer getTimeCodeFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }

   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final Long getTimeCodeFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }

   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final LocalDate getTimeCodeFirstFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }

   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final String getTimeCodeFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }

   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final Boolean getTimeCodeFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }

   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final BigInteger getTimeCodeFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }

   /**
    * Get Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    * 
    * @return Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @Nullable
    public final URL getTimeCodeFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMECODEFIRSTFRAME);
    }


   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING4);
    }


   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING5);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING1);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsPulldownAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsPulldownAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsPulldownAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsPulldownAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsPulldownAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsPulldownAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsPulldownAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPULLDOWN);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING3);
    }


   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Integer getEncodedLibraryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Long getEncodedLibraryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalDate getEncodedLibraryAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final String getEncodedLibraryAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Boolean getEncodedLibraryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final BigInteger getEncodedLibraryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final URL getEncodedLibraryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARY);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING4);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAMESTRING5);
    }


   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final Integer getStoredHeightAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }

   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final Long getStoredHeightAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }

   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final LocalDate getStoredHeightAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }

   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final String getStoredHeightAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }

   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final Boolean getStoredHeightAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }

   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final BigInteger getStoredHeightAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }

   /**
    * Get Stored height.
    * 
    * @return Stored height.
    */
    @Nullable
    public final URL getStoredHeightAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STOREDHEIGHT);
    }


   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final Integer getFrameRateNominalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final Long getFrameRateNominalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final LocalDate getFrameRateNominalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final String getFrameRateNominalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateNominalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateNominalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final URL getFrameRateNominalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINAL);
    }


   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Integer getInternetMediaTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Long getInternetMediaTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalDate getInternetMediaTypeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final String getInternetMediaTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Boolean getInternetMediaTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final BigInteger getInternetMediaTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final URL getInternetMediaTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.INTERNETMEDIATYPE);
    }


   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING2);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDate getDisabledAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISABLED);
    }


   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Integer getFrameRateDenAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Long getFrameRateDenAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalDate getFrameRateDenAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final String getFrameRateDenAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Boolean getFrameRateDenAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final BigInteger getFrameRateDenAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final URL getFrameRateDenAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEDEN);
    }


   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING3);
    }


   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateMaximumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateMaximumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final LocalDate getFrameRateMaximumStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateMaximumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateMaximumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateMaximumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateMaximumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUMSTRING);
    }


   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeEncodedProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeEncodedProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedProportionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeEncodedProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeEncodedProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDPROPORTION);
    }


   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDSTRING1);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsRefFramesAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsRefFramesAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsRefFramesAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsRefFramesAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsRefFramesAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsRefFramesAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsRefFramesAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSREFFRAMES);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsGMCAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsGMCAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsGMCAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsGMCAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsGMCAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsGMCAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsGMCAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSGMC);
    }


   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final Integer getScanOrderOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }

   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final Long getScanOrderOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }

   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final LocalDate getScanOrderOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }

   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final String getScanOrderOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }

   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final Boolean getScanOrderOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }

   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final BigInteger getScanOrderOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }

   /**
    * Get ScanOrder_Original.
    * 
    * @return ScanOrder_Original.
    */
    @Nullable
    public final URL getScanOrderOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINAL);
    }


   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Integer getDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Long getDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final LocalDate getDurationAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final String getDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Boolean getDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final BigInteger getDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final URL getDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATION);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getSourceDurationString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING5);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getDurationLastFrameStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getSourceDurationString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING4);
    }


   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getSourceDurationString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING3);
    }


   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING2);
    }


   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final Integer getChromaSubsamplingStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }

   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final Long getChromaSubsamplingStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }

   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final LocalDate getChromaSubsamplingStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }

   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final String getChromaSubsamplingStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }

   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final Boolean getChromaSubsamplingStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }

   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final BigInteger getChromaSubsamplingStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }

   /**
    * Get ChromaSubsampling/String.
    * 
    * @return ChromaSubsampling/String.
    */
    @Nullable
    public final URL getChromaSubsamplingStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGSTRING);
    }


   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING1);
    }


   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final Integer getCodecIDHintAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final Long getCodecIDHintAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final LocalDate getCodecIDHintAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final String getCodecIDHintAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final Boolean getCodecIDHintAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final BigInteger getCodecIDHintAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec.
    * 
    * @return Hint/popular name for this codec.
    */
    @Nullable
    public final URL getCodecIDHintAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECIDHINT);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Integer getEncodedApplicationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Long getEncodedApplicationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalDate getEncodedApplicationAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final String getEncodedApplicationAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Boolean getEncodedApplicationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final BigInteger getEncodedApplicationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final URL getEncodedApplicationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATION);
    }


   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Integer getCompressionModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Long getCompressionModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalDate getCompressionModeStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final String getCompressionModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Boolean getCompressionModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final BigInteger getCompressionModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final URL getCompressionModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COMPRESSIONMODESTRING);
    }


   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Integer getStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Long getStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalDate getStreamSizeString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final String getStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Boolean getStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final URL getStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING2);
    }


   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Integer getStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Long getStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalDate getStreamSizeString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final String getStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Boolean getStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final URL getStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING1);
    }


   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Integer getStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Long getStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalDate getStreamSizeString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final String getStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Boolean getStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final URL getStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING4);
    }


   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Integer getFrameRateModeOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }

   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Long getFrameRateModeOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }

   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalDate getFrameRateModeOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }

   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final String getFrameRateModeOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }

   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Boolean getFrameRateModeOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }

   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final BigInteger getFrameRateModeOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }

   /**
    * Get Original frame rate mode (Constant, Variable).
    * 
    * @return Original frame rate mode (Constant, Variable).
    */
    @Nullable
    public final URL getFrameRateModeOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINALSTRING);
    }


   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Integer getStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Long getStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalDate getStreamSizeString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final String getStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Boolean getStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final URL getStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING3);
    }


   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getStreamSizeString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING5);
    }


   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final Integer getFrameRateMinimumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final Long getFrameRateMinimumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final LocalDate getFrameRateMinimumAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final String getFrameRateMinimumAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateMinimumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateMinimumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final URL getFrameRateMinimumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMINIMUM);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDate getStreamKindAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMKIND);
    }


   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final LocalDate getBitRateStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATESTRING);
    }


   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Integer getFrameRateModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Long getFrameRateModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalDate getFrameRateModeStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final String getFrameRateModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Boolean getFrameRateModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final BigInteger getFrameRateModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final URL getFrameRateModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODESTRING);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDate getLanguageString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING1);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsGMCAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsGMCAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsGMCAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsGMCAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsGMCAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsGMCAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsGMCAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMC);
    }


   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final Integer getStandardAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final Long getStandardAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final LocalDate getStandardAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final String getStandardAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final Boolean getStandardAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final BigInteger getStandardAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }

   /**
    * Get NTSC or PAL.
    * 
    * @return NTSC or PAL.
    */
    @Nullable
    public final URL getStandardAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STANDARD);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalDate getLanguageString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING2);
    }


   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalDate getLanguageString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING3);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Integer getLanguageString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Long getLanguageString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalDate getLanguageString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final String getLanguageString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Boolean getLanguageString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final URL getLanguageString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING4);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDate getCodecIDAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECID);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDate getAlternateGroupAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUP);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGS);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Integer getLanguageAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Long getLanguageAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalDate getLanguageAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final String getLanguageAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Boolean getLanguageAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final BigInteger getLanguageAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final URL getLanguageAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGE);
    }


   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final Integer getScanOrderStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }

   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final Long getScanOrderStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }

   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final LocalDate getScanOrderStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }

   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final String getScanOrderStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }

   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final Boolean getScanOrderStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }

   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final BigInteger getScanOrderStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }

   /**
    * Get ScanOrder/String.
    * 
    * @return ScanOrder/String.
    */
    @Nullable
    public final URL getScanOrderStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTRING);
    }


   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final Integer getHeightOffsetStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }

   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final Long getHeightOffsetStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }

   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final LocalDate getHeightOffsetStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }

   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final String getHeightOffsetStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }

   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final Boolean getHeightOffsetStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }

   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final BigInteger getHeightOffsetStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }

   /**
    * Get Offset between original height and displayed height  in pixel.
    * 
    * @return Offset between original height and displayed height  in pixel.
    */
    @Nullable
    public final URL getHeightOffsetStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSETSTRING);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getDurationLastFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getDurationLastFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDate getDurationLastFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getDurationLastFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getDurationLastFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getDurationLastFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getDurationLastFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAME);
    }


   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedLibraryStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedLibraryStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDate getEncodedLibraryStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedLibraryStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedLibraryStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedLibraryStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedLibraryStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSTRING);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getInterlacementStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getInterlacementStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getInterlacementStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getInterlacementStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getInterlacementStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getInterlacementStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getInterlacementStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.INTERLACEMENTSTRING);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsRefFramesStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsRefFramesStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsRefFramesStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsRefFramesStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsRefFramesStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsRefFramesStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsRefFramesStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMESSTRING);
    }


   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getStreamSizeStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZESTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDate getDefaultStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DEFAULTSTRING);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDate getOriginalSourceMediumIDStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMIDSTRING);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING1);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationLastFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING3);
    }


   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final Integer getcolourdescriptionpresentAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final Long getcolourdescriptionpresentAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final LocalDate getcolourdescriptionpresentAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final String getcolourdescriptionpresentAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final Boolean getcolourdescriptionpresentAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final BigInteger getcolourdescriptionpresentAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }

   /**
    * Get Presence of colour description.
    * 
    * @return Presence of colour description.
    */
    @Nullable
    public final URL getcolourdescriptionpresentAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLOURDESCRIPTIONPRESENT);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING2);
    }


   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final Integer getScanOrderStoredStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }

   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final Long getScanOrderStoredStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }

   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final LocalDate getScanOrderStoredStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }

   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final String getScanOrderStoredStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }

   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final Boolean getScanOrderStoredStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }

   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final BigInteger getScanOrderStoredStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }

   /**
    * Get ScanOrder_Stored/String.
    * 
    * @return ScanOrder_Stored/String.
    */
    @Nullable
    public final URL getScanOrderStoredStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDSTRING);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsMatrixAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsMatrixAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsMatrixAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsMatrixAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsMatrixAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsMatrixAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsMatrixAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIX);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationLastFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationLastFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationLastFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING5);
    }


   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final Integer getDisplayAspectRatioStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final Long getDisplayAspectRatioStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final LocalDate getDisplayAspectRatioStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final String getDisplayAspectRatioStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final Boolean getDisplayAspectRatioStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final BigInteger getDisplayAspectRatioStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final URL getDisplayAspectRatioStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOSTRING);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsPacketBitStreamAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsPacketBitStreamAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsPacketBitStreamAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsPacketBitStreamAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsPacketBitStreamAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsPacketBitStreamAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsPacketBitStreamAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSPACKETBITSTREAM);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getSourceDurationLastFrameString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationLastFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONLASTFRAMESTRING4);
    }


   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final Integer getBitDepthStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }

   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final Long getBitDepthStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }

   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final LocalDate getBitDepthStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }

   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final String getBitDepthStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }

   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final Boolean getBitDepthStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }

   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final BigInteger getBitDepthStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }

   /**
    * Get 16/24/32 bits.
    * 
    * @return 16/24/32 bits.
    */
    @Nullable
    public final URL getBitDepthStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITDEPTHSTRING);
    }


   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final Integer getFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final Long getFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final LocalDate getFrameCountAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final String getFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final Boolean getFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final BigInteger getFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final URL getFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMECOUNT);
    }


   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Integer getTitleAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Long getTitleAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final LocalDate getTitleAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final String getTitleAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Boolean getTitleAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final BigInteger getTitleAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final URL getTitleAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TITLE);
    }


   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Integer getDelayDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Long getDelayDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalDate getDelayDropFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final String getDelayDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Boolean getDelayDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final BigInteger getDelayDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final URL getDelayDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYDROPFRAME);
    }


   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final Integer getRotationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final Long getRotationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final LocalDate getRotationAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final String getRotationAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final Boolean getRotationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final BigInteger getRotationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }

   /**
    * Get Rotation.
    * 
    * @return Rotation.
    */
    @Nullable
    public final URL getRotationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ROTATION);
    }


   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateMaximumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateMaximumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalDate getBitRateMaximumAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final String getBitRateMaximumAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateMaximumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateMaximumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateMaximumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEMAXIMUM);
    }


   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final Integer getBufferSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }

   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final Long getBufferSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }

   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final LocalDate getBufferSizeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }

   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final String getBufferSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }

   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final Boolean getBufferSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }

   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final BigInteger getBufferSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }

   /**
    * Get Defines the size of the buffer needed to decode the sequence..
    * 
    * @return Defines the size of the buffer needed to decode the sequence..
    */
    @Nullable
    public final URL getBufferSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BUFFERSIZE);
    }


   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalDate getStreamSizeProportionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEPROPORTION);
    }


   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeEncodedProportionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZEENCODEDPROPORTION);
    }


   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Integer getEncodedLibrarySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Long getEncodedLibrarySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalDate getEncodedLibrarySettingsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final String getEncodedLibrarySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Boolean getEncodedLibrarySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final BigInteger getEncodedLibrarySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final URL getEncodedLibrarySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYSETTINGS);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getResolutionStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getResolutionStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getResolutionStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getResolutionStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getResolutionStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getResolutionStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getResolutionStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.RESOLUTIONSTRING);
    }


   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Integer getSourceDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Long getSourceDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final LocalDate getSourceDurationAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final String getSourceDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final URL getSourceDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATION);
    }


   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Integer getFrameRateModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Long getFrameRateModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final LocalDate getFrameRateModeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final String getFrameRateModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Boolean getFrameRateModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final BigInteger getFrameRateModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final URL getFrameRateModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODE);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsMatrixAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsMatrixAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsMatrixAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsMatrixAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsMatrixAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsMatrixAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsMatrixAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIX);
    }


   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final Integer getWidthOffsetAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final Long getWidthOffsetAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final LocalDate getWidthOffsetAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final String getWidthOffsetAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final Boolean getWidthOffsetAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final BigInteger getWidthOffsetAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }

   /**
    * Get Offset between original width and displayed width in pixel.
    * 
    * @return Offset between original width and displayed width in pixel.
    */
    @Nullable
    public final URL getWidthOffsetAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHOFFSET);
    }


   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final Integer getSampledWidthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }

   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final Long getSampledWidthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }

   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final LocalDate getSampledWidthAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }

   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final String getSampledWidthAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }

   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final Boolean getSampledWidthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }

   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final BigInteger getSampledWidthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }

   /**
    * Get Sampled width.
    * 
    * @return Sampled width.
    */
    @Nullable
    public final URL getSampledWidthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SAMPLEDWIDTH);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDate getDelayOriginalString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING1);
    }


   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Integer getCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Long getCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalDate getCountAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final String getCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Boolean getCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final BigInteger getCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final URL getCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COUNT);
    }


   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Integer getFormatSettingsWrappingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Long getFormatSettingsWrappingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final LocalDate getFormatSettingsWrappingAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final String getFormatSettingsWrappingAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Boolean getFormatSettingsWrappingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final BigInteger getFormatSettingsWrappingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final URL getFormatSettingsWrappingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSWRAPPING);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDate getDelayOriginalString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING2);
    }


   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Integer getEncryptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Long getEncryptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalDate getEncryptionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final String getEncryptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Boolean getEncryptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final BigInteger getEncryptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final URL getEncryptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCRYPTION);
    }


   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final Integer getMultiViewBaseProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }

   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final Long getMultiViewBaseProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }

   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final LocalDate getMultiViewBaseProfileAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }

   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final String getMultiViewBaseProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }

   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final Boolean getMultiViewBaseProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }

   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final BigInteger getMultiViewBaseProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }

   /**
    * Get Multiview, profile of the base stream.
    * 
    * @return Multiview, profile of the base stream.
    */
    @Nullable
    public final URL getMultiViewBaseProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MULTIVIEWBASEPROFILE);
    }


   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final LocalDate getDelayOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINAL);
    }


   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final Integer getBitsPixelFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }

   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final Long getBitsPixelFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }

   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final LocalDate getBitsPixelFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }

   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final String getBitsPixelFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }

   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final Boolean getBitsPixelFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }

   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final BigInteger getBitsPixelFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }

   /**
    * Get bits/(Pixel*Frame) (like Gordian Knot).
    * 
    * @return bits/(Pixel*Frame) (like Gordian Knot).
    */
    @Nullable
    public final URL getBitsPixelFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITSPIXELFRAME);
    }


   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Integer getFrameRateNumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Long getFrameRateNumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalDate getFrameRateNumAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final String getFrameRateNumAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Boolean getFrameRateNumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final BigInteger getFrameRateNumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final URL getFrameRateNumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATENUM);
    }


   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final Integer getAlignmentAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final Long getAlignmentAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final LocalDate getAlignmentAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final String getAlignmentAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final Boolean getAlignmentAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final BigInteger getAlignmentAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final URL getAlignmentAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ALIGNMENT);
    }


   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Integer getFormatVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Long getFormatVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalDate getFormatVersionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final String getFormatVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Boolean getFormatVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final BigInteger getFormatVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final URL getFormatVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATVERSION);
    }


   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Integer getStreamKindPosAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Long getStreamKindPosAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalDate getStreamKindPosAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final String getStreamKindPosAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Boolean getStreamKindPosAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final BigInteger getStreamKindPosAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final URL getStreamKindPosAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMKINDPOS);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDate getOriginalSourceMediumIDAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ORIGINALSOURCEMEDIUMID);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getDurationStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsMatrixStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsMatrixStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsMatrixStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsMatrixStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsMatrixStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsMatrixStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsMatrixStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSMATRIXSTRING);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDate getIDAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ID);
    }


   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final Integer getTimeCodeSourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }

   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final Long getTimeCodeSourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }

   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final LocalDate getTimeCodeSourceAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }

   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final String getTimeCodeSourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }

   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final Boolean getTimeCodeSourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }

   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final BigInteger getTimeCodeSourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }

   /**
    * Get Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    * 
    * @return Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @Nullable
    public final URL getTimeCodeSourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMECODESOURCE);
    }


   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Integer getEncodedLibraryDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Long getEncodedLibraryDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalDate getEncodedLibraryDateAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final String getEncodedLibraryDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Boolean getEncodedLibraryDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final URL getEncodedLibraryDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYDATE);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDate getMenuIDStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MENUIDSTRING);
    }


   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final Integer getScanTypeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }

   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final Long getScanTypeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }

   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final LocalDate getScanTypeStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }

   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final String getScanTypeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }

   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final Boolean getScanTypeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }

   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final BigInteger getScanTypeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }

   /**
    * Get ScanType/String.
    * 
    * @return ScanType/String.
    */
    @Nullable
    public final URL getScanTypeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTRING);
    }


   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Integer getLanguageMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Long getLanguageMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalDate getLanguageMoreAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final String getLanguageMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Boolean getLanguageMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final BigInteger getLanguageMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final URL getLanguageMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGEMORE);
    }


   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZESTRING);
    }


   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final Integer getFrameRateMaximumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final Long getFrameRateMaximumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final LocalDate getFrameRateMaximumAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final String getFrameRateMaximumAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateMaximumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateMaximumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final URL getFrameRateMaximumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMAXIMUM);
    }


   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final Integer getFrameRateOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final Long getFrameRateOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final LocalDate getFrameRateOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final String getFrameRateOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final Boolean getFrameRateOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) frames per second.
    * 
    * @return Original (in the raw stream) frames per second.
    */
    @Nullable
    public final URL getFrameRateOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINAL);
    }


   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final Integer getDisplayAspectRatioAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final Long getDisplayAspectRatioAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final LocalDate getDisplayAspectRatioAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final String getDisplayAspectRatioAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final Boolean getDisplayAspectRatioAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final BigInteger getDisplayAspectRatioAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }

   /**
    * Get Display Aspect ratio.
    * 
    * @return Display Aspect ratio.
    */
    @Nullable
    public final URL getDisplayAspectRatioAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIO);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getDurationFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getDurationFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDate getDurationFirstFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getDurationFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getDurationFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getDurationFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONFIRSTFRAME);
    }


   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayOriginalString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayOriginalString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getDelayOriginalString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayOriginalString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayOriginalString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayOriginalString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayOriginalString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING3);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedApplicationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedApplicationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDate getEncodedApplicationStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedApplicationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedApplicationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedApplicationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedApplicationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONSTRING);
    }


   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayOriginalString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayOriginalString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getDelayOriginalString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayOriginalString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayOriginalString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayOriginalString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayOriginalString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING4);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayOriginalString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayOriginalString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getDelayOriginalString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayOriginalString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayOriginalString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayOriginalString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayOriginalString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING5);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecCCAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecCCAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecCCAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecCCAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecCCAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecCCAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecCCAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECCC);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDate getForcedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORCED);
    }


   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final Integer getStoredWidthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }

   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final Long getStoredWidthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }

   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final LocalDate getStoredWidthAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }

   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final String getStoredWidthAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }

   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final Boolean getStoredWidthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }

   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final BigInteger getStoredWidthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }

   /**
    * Get Stored width.
    * 
    * @return Stored width.
    */
    @Nullable
    public final URL getStoredWidthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STOREDWIDTH);
    }


   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Integer getFrameRateOriginalDenAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Long getFrameRateOriginalDenAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalDate getFrameRateOriginalDenAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final String getFrameRateOriginalDenAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Boolean getFrameRateOriginalDenAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final BigInteger getFrameRateOriginalDenAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final URL getFrameRateOriginalDenAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALDEN);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsBVOPAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsBVOPAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsBVOPAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsBVOPAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsBVOPAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsBVOPAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsBVOPAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSBVOP);
    }


   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Integer getInformAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Long getInformAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalDate getInformAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final String getInformAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Boolean getInformAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final BigInteger getInformAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final URL getInformAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.INFORM);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsRefFramesAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsRefFramesAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsRefFramesAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsRefFramesAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsRefFramesAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsRefFramesAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsRefFramesAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSREFFRAMES);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDate getSourceDurationFirstFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getSourceDurationFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONFIRSTFRAME);
    }


   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Integer getTimeStampFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Long getTimeStampFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final String getTimeStampFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final URL getTimeStampFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING);
    }


   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final Integer getActiveFormatDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }

   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final Long getActiveFormatDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }

   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final LocalDate getActiveFormatDescriptionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }

   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final String getActiveFormatDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }

   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final Boolean getActiveFormatDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }

   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final BigInteger getActiveFormatDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }

   /**
    * Get Active Format Description (AFD value).
    * 
    * @return Active Format Description (AFD value).
    */
    @Nullable
    public final URL getActiveFormatDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTION);
    }


   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final Integer getScanOrderStoredDisplayedInvertedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }

   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final Long getScanOrderStoredDisplayedInvertedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }

   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final LocalDate getScanOrderStoredDisplayedInvertedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }

   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final String getScanOrderStoredDisplayedInvertedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }

   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final Boolean getScanOrderStoredDisplayedInvertedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }

   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final BigInteger getScanOrderStoredDisplayedInvertedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }

   /**
    * Get ScanOrder_StoredDisplayedInverted.
    * 
    * @return ScanOrder_StoredDisplayedInverted.
    */
    @Nullable
    public final URL getScanOrderStoredDisplayedInvertedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTOREDDISPLAYEDINVERTED);
    }


   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Integer getStreamKindIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Long getStreamKindIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalDate getStreamKindIDAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final String getStreamKindIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Boolean getStreamKindIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamKindIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final URL getStreamKindIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMKINDID);
    }


   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateNominalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateNominalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final LocalDate getFrameRateNominalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateNominalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateNominalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateNominalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateNominalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATENOMINALSTRING);
    }


   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Integer getFormatUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Long getFormatUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final LocalDate getFormatUrlAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final String getFormatUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Boolean getFormatUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final BigInteger getFormatUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final URL getFormatUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATURL);
    }


   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateMinimumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateMinimumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDate getBitRateMinimumStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateMinimumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateMinimumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateMinimumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateMinimumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUMSTRING);
    }


   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final Integer getWidthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final Long getWidthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final LocalDate getWidthAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final String getWidthAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final Boolean getWidthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final BigInteger getWidthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }

   /**
    * Get Width (aperture size if present) in pixel.
    * 
    * @return Width (aperture size if present) in pixel.
    */
    @Nullable
    public final URL getWidthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTH);
    }


   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalDate getFrameRateStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATESTRING);
    }


   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final Integer getSourceFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final Long getSourceFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final LocalDate getSourceFrameCountAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final String getSourceFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final Boolean getSourceFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final BigInteger getSourceFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final URL getSourceFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEFRAMECOUNT);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsBVOPAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsBVOPAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsBVOPAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsBVOPAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsBVOPAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsBVOPAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsBVOPAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSBVOP);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDate getDefaultAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DEFAULT);
    }


   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final Integer getGopOpenClosedFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final Long getGopOpenClosedFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final LocalDate getGopOpenClosedFirstFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final String getGopOpenClosedFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final Boolean getGopOpenClosedFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final BigInteger getGopOpenClosedFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }

   /**
    * Get Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    * 
    * @return Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @Nullable
    public final URL getGopOpenClosedFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDFIRSTFRAME);
    }


   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final Integer getGopOpenClosedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final Long getGopOpenClosedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final LocalDate getGopOpenClosedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final String getGopOpenClosedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final Boolean getGopOpenClosedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final BigInteger getGopOpenClosedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final URL getGopOpenClosedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSED);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelayOriginalSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelayOriginalSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDate getDelayOriginalSettingsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelayOriginalSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelayOriginalSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelayOriginalSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelayOriginalSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSETTINGS);
    }


   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Long getEncodedApplicationNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalDate getEncodedApplicationNameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final String getEncodedApplicationNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final URL getEncodedApplicationNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONNAME);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDate getUniqueIDStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.UNIQUEIDSTRING);
    }


   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final Integer getScanOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final Long getScanOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final LocalDate getScanOrderAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final String getScanOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final Boolean getScanOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final BigInteger getScanOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }

   /**
    * Get ScanOrder.
    * 
    * @return ScanOrder.
    */
    @Nullable
    public final URL getScanOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDER);
    }


   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Integer getFormatProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Long getFormatProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final LocalDate getFormatProfileAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final String getFormatProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Boolean getFormatProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final BigInteger getFormatProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final URL getFormatProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATPROFILE);
    }


   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final Integer getHeightOffsetAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }

   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final Long getHeightOffsetAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }

   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final LocalDate getHeightOffsetAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }

   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final String getHeightOffsetAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }

   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final Boolean getHeightOffsetAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }

   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final BigInteger getHeightOffsetAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }

   /**
    * Get Offset between original height and displayed height in pixel.
    * 
    * @return Offset between original height and displayed height in pixel.
    */
    @Nullable
    public final URL getHeightOffsetAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTOFFSET);
    }


   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final Integer getChromaSubsamplingPositionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }

   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final Long getChromaSubsamplingPositionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }

   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final LocalDate getChromaSubsamplingPositionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }

   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final String getChromaSubsamplingPositionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }

   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final Boolean getChromaSubsamplingPositionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }

   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final BigInteger getChromaSubsamplingPositionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }

   /**
    * Get ChromaSubsampling_Position.
    * 
    * @return ChromaSubsampling_Position.
    */
    @Nullable
    public final URL getChromaSubsamplingPositionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLINGPOSITION);
    }


   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Long getStreamSizeEncodedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final String getStreamSizeEncodedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final URL getStreamSizeEncodedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING2);
    }


   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final String getStreamSizeDemuxedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING1);
    }


   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Long getStreamSizeEncodedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final String getStreamSizeEncodedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final URL getStreamSizeEncodedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING3);
    }


   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final String getStreamSizeDemuxedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING2);
    }


   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final String getStreamSizeDemuxedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING3);
    }


   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Long getStreamSizeEncodedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final String getStreamSizeEncodedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final URL getStreamSizeEncodedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING1);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDate getLanguageStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.LANGUAGESTRING);
    }


   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final String getStreamSizeDemuxedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING4);
    }


   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Long getStreamSizeDemuxedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final String getStreamSizeDemuxedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final URL getStreamSizeDemuxedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING5);
    }


   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Long getStreamSizeEncodedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final String getStreamSizeEncodedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final URL getStreamSizeEncodedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING4);
    }


   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final LocalDate getFrameRateOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) frames per second (with measurement).
    * 
    * @return Original (in the raw stream) frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALSTRING);
    }


   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeEncodedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeEncodedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeEncodedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING5);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationLastFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationLastFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getDurationLastFrameString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationLastFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationLastFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationLastFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationLastFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING5);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationLastFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationLastFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getDurationLastFrameString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationLastFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationLastFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationLastFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING4);
    }


   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Integer getFrameRateModeOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }

   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Long getFrameRateModeOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }

   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final LocalDate getFrameRateModeOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }

   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final String getFrameRateModeOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }

   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Boolean getFrameRateModeOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }

   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final BigInteger getFrameRateModeOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }

   /**
    * Get Original frame rate mode (CFR, VFR).
    * 
    * @return Original frame rate mode (CFR, VFR).
    */
    @Nullable
    public final URL getFrameRateModeOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEMODEORIGINAL);
    }


   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeDemuxedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final String getStreamSizeDemuxedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeDemuxedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXEDSTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDate getForcedStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORCEDSTRING);
    }


   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final Integer getBitDepthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }

   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final Long getBitDepthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }

   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final LocalDate getBitDepthAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }

   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final String getBitDepthAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }

   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final Boolean getBitDepthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }

   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final BigInteger getBitDepthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }

   /**
    * Get 16/24/32.
    * 
    * @return 16/24/32.
    */
    @Nullable
    public final URL getBitDepthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITDEPTH);
    }


   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Integer getStreamSizeEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Long getStreamSizeEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final String getStreamSizeEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final URL getStreamSizeEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODED);
    }


   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final Integer getcolourrangeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }

   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final Long getcolourrangeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }

   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final LocalDate getcolourrangeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }

   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final String getcolourrangeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }

   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final Boolean getcolourrangeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }

   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final BigInteger getcolourrangeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }

   /**
    * Get Colour range for YUV colour space.
    * 
    * @return Colour range for YUV colour space.
    */
    @Nullable
    public final URL getcolourrangeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLOURRANGE);
    }


   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Integer getStreamCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Long getStreamCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalDate getStreamCountAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final String getStreamCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Boolean getStreamCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final BigInteger getStreamCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final URL getStreamCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMCOUNT);
    }


   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final Integer getFormatSettingsGMCStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }

   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final Long getFormatSettingsGMCStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }

   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final LocalDate getFormatSettingsGMCStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }

   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final String getFormatSettingsGMCStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }

   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final Boolean getFormatSettingsGMCStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }

   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final BigInteger getFormatSettingsGMCStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }

   /**
    * Get Format_Settings_GMC/String.
    * 
    * @return Format_Settings_GMC/String.
    */
    @Nullable
    public final URL getFormatSettingsGMCStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSGMCSTRING);
    }


   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final Integer getPixelAspectRatioOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final Long getPixelAspectRatioOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final LocalDate getPixelAspectRatioOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final String getPixelAspectRatioOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final Boolean getPixelAspectRatioOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final BigInteger getPixelAspectRatioOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Pixel Aspect ratio.
    * 
    * @return Original (in the raw stream) Pixel Aspect ratio.
    */
    @Nullable
    public final URL getPixelAspectRatioOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOORIGINALSTRING);
    }


   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDate getStreamSizeEncodedStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEENCODEDSTRING);
    }


   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final Integer getcolourprimariesOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final Long getcolourprimariesOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final LocalDate getcolourprimariesOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final String getcolourprimariesOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final Boolean getcolourprimariesOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final BigInteger getcolourprimariesOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }

   /**
    * Get Chromaticity coordinates of the source primaries.
    * 
    * @return Chromaticity coordinates of the source primaries.
    */
    @Nullable
    public final URL getcolourprimariesOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.COLOURPRIMARIESORIGINAL);
    }


   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final Integer getPixelAspectRatioStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final Long getPixelAspectRatioStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final LocalDate getPixelAspectRatioStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final String getPixelAspectRatioStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final Boolean getPixelAspectRatioStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final BigInteger getPixelAspectRatioStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final URL getPixelAspectRatioStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOSTRING);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getDurationString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING2);
    }


   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final Integer getScanOrderOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }

   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final Long getScanOrderOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }

   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final LocalDate getScanOrderOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }

   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final String getScanOrderOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }

   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final Boolean getScanOrderOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }

   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final BigInteger getScanOrderOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }

   /**
    * Get ScanOrder_Original/String.
    * 
    * @return ScanOrder_Original/String.
    */
    @Nullable
    public final URL getScanOrderOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDERORIGINALSTRING);
    }


   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getDurationString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING3);
    }


   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDate getDurationString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING1);
    }


   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final Integer getPixelAspectRatioCleanApertureAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final Long getPixelAspectRatioCleanApertureAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final LocalDate getPixelAspectRatioCleanApertureAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final String getPixelAspectRatioCleanApertureAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final Boolean getPixelAspectRatioCleanApertureAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final BigInteger getPixelAspectRatioCleanApertureAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final URL getPixelAspectRatioCleanApertureAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURE);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getDurationString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING4);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsCABACStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsCABACStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsCABACStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsCABACStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsCABACStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsCABACStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsCABACStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABACSTRING);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getDurationString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONSTRING5);
    }


   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Integer getBitRateEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Long getBitRateEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final LocalDate getBitRateEncodedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final String getBitRateEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Boolean getBitRateEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final BigInteger getBitRateEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final URL getBitRateEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODED);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsQPelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsQPelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsQPelAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsQPelAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsQPelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsQPelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsQPelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPEL);
    }


   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final Integer getFormatSettingsPictureStructureAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }

   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final Long getFormatSettingsPictureStructureAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }

   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final LocalDate getFormatSettingsPictureStructureAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }

   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final String getFormatSettingsPictureStructureAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }

   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final Boolean getFormatSettingsPictureStructureAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }

   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final BigInteger getFormatSettingsPictureStructureAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }

   /**
    * Get Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    * 
    * @return Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @Nullable
    public final URL getFormatSettingsPictureStructureAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSPICTURESTRUCTURE);
    }


   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final Integer getHeightOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final Long getHeightOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final LocalDate getHeightOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final String getHeightOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final Boolean getHeightOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final BigInteger getHeightOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) height with measurement (pixel).
    * 
    * @return Original (in the raw stream) height with measurement (pixel).
    */
    @Nullable
    public final URL getHeightOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINALSTRING);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDate getDelaySourceAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCE);
    }


   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final Integer getScanTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final Long getScanTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final LocalDate getScanTypeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final String getScanTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final Boolean getScanTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final BigInteger getScanTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }

   /**
    * Get ScanType.
    * 
    * @return ScanType.
    */
    @Nullable
    public final URL getScanTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPE);
    }


   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final Integer getScanTypeStoreMethodFieldsPerBlockAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }

   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final Long getScanTypeStoreMethodFieldsPerBlockAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }

   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final LocalDate getScanTypeStoreMethodFieldsPerBlockAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }

   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final String getScanTypeStoreMethodFieldsPerBlockAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }

   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final Boolean getScanTypeStoreMethodFieldsPerBlockAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }

   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final BigInteger getScanTypeStoreMethodFieldsPerBlockAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }

   /**
    * Get ScanType_StoreMethod_FieldsPerBlock.
    * 
    * @return ScanType_StoreMethod_FieldsPerBlock.
    */
    @Nullable
    public final URL getScanTypeStoreMethodFieldsPerBlockAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPESTOREMETHODFIELDSPERBLOCK);
    }


   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Integer getDelayOriginalDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Long getDelayOriginalDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final LocalDate getDelayOriginalDropFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final String getDelayOriginalDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Boolean getDelayOriginalDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final BigInteger getDelayOriginalDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final URL getDelayOriginalDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALDROPFRAME);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDate getDurationLastFrameString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDate getDelayOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYORIGINALSTRING);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationLastFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationLastFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getDurationLastFrameString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationLastFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationLastFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationLastFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING3);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getDurationLastFrameString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DURATIONLASTFRAMESTRING2);
    }


   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final Integer getHeightCleanApertureAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final Long getHeightCleanApertureAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final LocalDate getHeightCleanApertureAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final String getHeightCleanApertureAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final Boolean getHeightCleanApertureAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final BigInteger getHeightCleanApertureAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }

   /**
    * Get Clean Aperture height in pixel.
    * 
    * @return Clean Aperture height in pixel.
    */
    @Nullable
    public final URL getHeightCleanApertureAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURE);
    }


   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Long getStreamSizeDemuxedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalDate getStreamSizeDemuxedAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final String getStreamSizeDemuxedAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final URL getStreamSizeDemuxedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMSIZEDEMUXED);
    }


   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final Integer getFormatSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final Long getFormatSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final LocalDate getFormatSettingsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final String getFormatSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final Boolean getFormatSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final BigInteger getFormatSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final URL getFormatSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGS);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getResolutionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getResolutionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getResolutionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getResolutionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getResolutionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getResolutionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getResolutionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.RESOLUTION);
    }


   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getFirstPacketOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getFirstPacketOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDate getFirstPacketOrderAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getFirstPacketOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getFirstPacketOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getFirstPacketOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getFirstPacketOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FIRSTPACKETORDER);
    }


   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final Integer getHeightCleanApertureStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final Long getHeightCleanApertureStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final LocalDate getHeightCleanApertureStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final String getHeightCleanApertureStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final Boolean getHeightCleanApertureStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final BigInteger getHeightCleanApertureStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture height with measurement (pixel).
    * 
    * @return Clean Aperture height with measurement (pixel).
    */
    @Nullable
    public final URL getHeightCleanApertureStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTCLEANAPERTURESTRING);
    }


   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Integer getTimeStampFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Long getTimeStampFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameString1AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final String getTimeStampFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final URL getTimeStampFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING1);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecSettingsMatrixDataAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecSettingsMatrixDataAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecSettingsMatrixDataAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecSettingsMatrixDataAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecSettingsMatrixDataAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecSettingsMatrixDataAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecSettingsMatrixDataAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECSETTINGSMATRIXDATA);
    }


   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getTimeStampFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getTimeStampFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameString5AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getTimeStampFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getTimeStampFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING5);
    }


   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final Integer getPixelAspectRatioCleanApertureStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final Long getPixelAspectRatioCleanApertureStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final LocalDate getPixelAspectRatioCleanApertureStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final String getPixelAspectRatioCleanApertureStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final Boolean getPixelAspectRatioCleanApertureStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final BigInteger getPixelAspectRatioCleanApertureStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }

   /**
    * Get Clean Aperture Pixel Aspect ratio.
    * 
    * @return Clean Aperture Pixel Aspect ratio.
    */
    @Nullable
    public final URL getPixelAspectRatioCleanApertureStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIOCLEANAPERTURESTRING);
    }


   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getTimeStampFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }

   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getTimeStampFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }

   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameString4AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }

   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getTimeStampFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }

   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }

   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }

   /**
    * Get TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getTimeStampFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING4);
    }


   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getTimeStampFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getTimeStampFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameString3AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getTimeStampFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }

   /**
    * Get TimeStamp in format : HH:MM:SS.MMM.
    * 
    * @return TimeStamp in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getTimeStampFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING3);
    }


   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Integer getTimeStampFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Long getTimeStampFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameString2AsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final String getTimeStampFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }

   /**
    * Get TimeStamp with measurement.
    * 
    * @return TimeStamp with measurement.
    */
    @Nullable
    public final URL getTimeStampFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAMESTRING2);
    }


   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateNominalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateNominalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalDate getBitRateNominalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateNominalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateNominalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateNominalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateNominalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINALSTRING);
    }


   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final Integer getScanOrderStoredAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }

   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final Long getScanOrderStoredAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }

   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final LocalDate getScanOrderStoredAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }

   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final String getScanOrderStoredAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }

   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final Boolean getScanOrderStoredAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }

   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final BigInteger getScanOrderStoredAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }

   /**
    * Get ScanOrder_Stored.
    * 
    * @return ScanOrder_Stored.
    */
    @Nullable
    public final URL getScanOrderStoredAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANORDERSTORED);
    }


   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Integer getFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Long getFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalDate getFormatAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final String getFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Boolean getFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final BigInteger getFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final URL getFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMAT);
    }


   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final Integer getDisplayAspectRatioOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final Long getDisplayAspectRatioOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final LocalDate getDisplayAspectRatioOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final String getDisplayAspectRatioOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final Boolean getDisplayAspectRatioOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final BigInteger getDisplayAspectRatioOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Display Aspect ratio.
    * 
    * @return Original (in the raw stream) Display Aspect ratio.
    */
    @Nullable
    public final URL getDisplayAspectRatioOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DISPLAYASPECTRATIOORIGINALSTRING);
    }


   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final Integer getWidthOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final Long getWidthOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final LocalDate getWidthOriginalStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final String getWidthOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final Boolean getWidthOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final BigInteger getWidthOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) width with measurement (pixel).
    * 
    * @return Original (in the raw stream) width with measurement (pixel).
    */
    @Nullable
    public final URL getWidthOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.WIDTHORIGINALSTRING);
    }


   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Integer getFrameRateOriginalNumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Long getFrameRateOriginalNumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalDate getFrameRateOriginalNumAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final String getFrameRateOriginalNumAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Boolean getFrameRateOriginalNumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final BigInteger getFrameRateOriginalNumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final URL getFrameRateOriginalNumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FRAMERATEORIGINALNUM);
    }


   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final Integer getHeightAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final Long getHeightAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final LocalDate getHeightAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final String getHeightAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final Boolean getHeightAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final BigInteger getHeightAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }

   /**
    * Get Height in pixel.
    * 
    * @return Height in pixel.
    */
    @Nullable
    public final URL getHeightAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHT);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDate getCodecIDStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECIDSTRING);
    }


   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedLibraryCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedLibraryCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDate getEncodedLibraryCompanyNameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedLibraryCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedLibraryCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedLibraryCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedLibraryCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDLIBRARYCOMPANYNAME);
    }


   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Integer getTimeStampFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }

   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Long getTimeStampFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }

   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalDate getTimeStampFirstFrameAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }

   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final String getTimeStampFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }

   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getTimeStampFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }

   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getTimeStampFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }

   /**
    * Get TimeStamp fixed in the stream (relative) IN MS.
    * 
    * @return TimeStamp fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final URL getTimeStampFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TIMESTAMPFIRSTFRAME);
    }


   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Integer getSourceStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Long getSourceStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final LocalDate getSourceStreamSizeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final String getSourceStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Boolean getSourceStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final URL getSourceStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCESTREAMSIZE);
    }


   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Integer getFormatCommercialAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Long getFormatCommercialAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalDate getFormatCommercialAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final String getFormatCommercialAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Boolean getFormatCommercialAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final BigInteger getFormatCommercialAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final URL getFormatCommercialAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATCOMMERCIAL);
    }


   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final Integer getActiveFormatDescriptionMuxingModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }

   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final Long getActiveFormatDescriptionMuxingModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }

   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final LocalDate getActiveFormatDescriptionMuxingModeAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }

   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final String getActiveFormatDescriptionMuxingModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }

   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final Boolean getActiveFormatDescriptionMuxingModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }

   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final BigInteger getActiveFormatDescriptionMuxingModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }

   /**
    * Get Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    * 
    * @return Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @Nullable
    public final URL getActiveFormatDescriptionMuxingModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ACTIVEFORMATDESCRIPTIONMUXINGMODE);
    }


   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final Integer getScanTypeOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }

   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final Long getScanTypeOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }

   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final LocalDate getScanTypeOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }

   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final String getScanTypeOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }

   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final Boolean getScanTypeOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }

   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final BigInteger getScanTypeOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }

   /**
    * Get ScanType_Original.
    * 
    * @return ScanType_Original.
    */
    @Nullable
    public final URL getScanTypeOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SCANTYPEORIGINAL);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDate getDelaySourceStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.DELAYSOURCESTRING);
    }


   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final Integer gettransfercharacteristicsOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final Long gettransfercharacteristicsOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final LocalDate gettransfercharacteristicsOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final String gettransfercharacteristicsOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final Boolean gettransfercharacteristicsOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final BigInteger gettransfercharacteristicsOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }

   /**
    * Get Opto-electronic transfer characteristic of the source picture.
    * 
    * @return Opto-electronic transfer characteristic of the source picture.
    */
    @Nullable
    public final URL gettransfercharacteristicsOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.TRANSFERCHARACTERISTICSORIGINAL);
    }


   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateNominalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateNominalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalDate getBitRateNominalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final String getBitRateNominalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateNominalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateNominalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateNominalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATENOMINAL);
    }


   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateMinimumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateMinimumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalDate getBitRateMinimumAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final String getBitRateMinimumAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateMinimumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateMinimumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateMinimumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEMINIMUM);
    }


   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final Integer getHeightOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }

   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final Long getHeightOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }

   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final LocalDate getHeightOriginalAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }

   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final String getHeightOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }

   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final Boolean getHeightOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }

   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final BigInteger getHeightOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }

   /**
    * Get Original (in the raw stream) height in pixel.
    * 
    * @return Original (in the raw stream) height in pixel.
    */
    @Nullable
    public final URL getHeightOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.HEIGHTORIGINAL);
    }


   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDate getSourceDurationStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.SOURCEDURATIONSTRING);
    }


   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final Integer getmatrixcoefficientsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final Long getmatrixcoefficientsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final LocalDate getmatrixcoefficientsAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final String getmatrixcoefficientsAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final Boolean getmatrixcoefficientsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final BigInteger getmatrixcoefficientsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }

   /**
    * Get Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    * 
    * @return Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @Nullable
    public final URL getmatrixcoefficientsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MATRIXCOEFFICIENTS);
    }


   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Integer getBitRateEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Long getBitRateEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final LocalDate getBitRateEncodedStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final String getBitRateEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Boolean getBitRateEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final BigInteger getBitRateEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final URL getBitRateEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.BITRATEENCODEDSTRING);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDate getStreamKindStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.STREAMKINDSTRING);
    }


   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Integer getCodecUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Long getCodecUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final LocalDate getCodecUrlAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final String getCodecUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final Boolean getCodecUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final BigInteger getCodecUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }

   /**
    * Get Deprecated, do not use in new projects.
    * 
    * @return Deprecated, do not use in new projects.
    */
    @Nullable
    @Deprecated
    public final URL getCodecUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CODECURL);
    }


   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final Integer getChromaSubsamplingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final Long getChromaSubsamplingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final LocalDate getChromaSubsamplingAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final String getChromaSubsamplingAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final Boolean getChromaSubsamplingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final BigInteger getChromaSubsamplingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final URL getChromaSubsamplingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.CHROMASUBSAMPLING);
    }


   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final Integer getGopOpenClosedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final Long getGopOpenClosedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final LocalDate getGopOpenClosedStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final String getGopOpenClosedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final Boolean getGopOpenClosedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final BigInteger getGopOpenClosedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }

   /**
    * Get Time code information about Open/Closed.
    * 
    * @return Time code information about Open/Closed.
    */
    @Nullable
    public final URL getGopOpenClosedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.GOPOPENCLOSEDSTRING);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsQPelStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsQPelStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsQPelStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsQPelStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsQPelStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsQPelStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsQPelStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSQPELSTRING);
    }


   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Long getEncodedApplicationVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalDate getEncodedApplicationVersionAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final String getEncodedApplicationVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final URL getEncodedApplicationVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ENCODEDAPPLICATIONVERSION);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDate getMenuIDAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.MENUID);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDate getAlternateGroupStringAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.ALTERNATEGROUPSTRING);
    }


   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Integer getFormatSettingsCABACAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Long getFormatSettingsCABACAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final LocalDate getFormatSettingsCABACAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final String getFormatSettingsCABACAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final Boolean getFormatSettingsCABACAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final BigInteger getFormatSettingsCABACAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }

   /**
    * Get Settings needed for decoder used, detailled.
    * 
    * @return Settings needed for decoder used, detailled.
    */
    @Nullable
    public final URL getFormatSettingsCABACAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.FORMATSETTINGSCABAC);
    }


   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final Integer getPixelAspectRatioAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final Long getPixelAspectRatioAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final LocalDate getPixelAspectRatioAsLocalDate() {
        return getMediaInfo().getAsLocalDate(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final String getPixelAspectRatioAsString() {
        return getMediaInfo().getAsString(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final Boolean getPixelAspectRatioAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final BigInteger getPixelAspectRatioAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }

   /**
    * Get Pixel Aspect ratio.
    * 
    * @return Pixel Aspect ratio.
    */
    @Nullable
    public final URL getPixelAspectRatioAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Video, getStreamNumber(), Video.PIXELASPECTRATIO);
    }


}
