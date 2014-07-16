package aka.jmetadata.main.constants;

/**
 * Menu
 * Count : Count of objects available in this stream
 * Status : bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished)
 * StreamCount : Count of streams of that kind available
 * StreamKind : Stream type name
 * StreamKind/String : Stream type name
 * StreamKindID : Number of the stream (base=0)
 * StreamKindPos : When multiple streams, number of the stream (base=1)
 * StreamOrder : Stream order in the file, whatever is the kind of stream (base=0)
 * Inform : Last **Inform** call
 * ID : A ID for this stream in this file
 * ID/String : A ID for this stream in this file
 * UniqueID : A unique ID for this stream, should be copied with stream copy
 * UniqueID/String : A unique ID for this stream, should be copied with stream copy
 * MenuID : A menu ID for this stream in this file
 * MenuID/String : A menu ID for this stream in this file
 * Format : Format used
 * Format/Info : Info about Format
 * Format/Url : Link
 * Format_Commercial : Commercial name used by vendor for theses setings or Format field if there is no difference
 * Format_Commercial_IfAny : Commercial name used by vendor for theses setings if there is one
 * Format_Version : Version of this format
 * Format_Profile : Profile of the Format
 * Format_Compression : Compression method used
 * Format_Settings : Settings needed for decoder used
 * CodecID : Codec ID (found in some containers)
 * CodecID/String : Codec ID (found in some containers)
 * CodecID/Info : Info about this codec
 * CodecID/Hint : A hint/popular name for this codec
 * CodecID/Url : A link to more details about this codec ID
 * CodecID_Description : Manual description given by the container
 * Codec : Deprecated
 * Codec/String : Deprecated
 * Codec/Info : Deprecated
 * Codec/Url : Deprecated
 * Duration : Play time of the stream in ms
 * Duration/String : Play time in format : XXx YYy only, YYy omited if zero
 * Duration/String1 : Play time in format : HHh MMmn SSs MMMms, XX omited if zero
 * Duration/String2 : Play time in format : XXx YYy only, YYy omited if zero
 * Duration/String3 : Play time in format : HH:MM:SS.MMM
 * Duration_Start
 * Duration_End
 * Delay : Delay fixed in the stream (relative) IN MS
 * Delay/String : Delay with measurement
 * Delay/String1 : Delay with measurement
 * Delay/String2 : Delay with measurement
 * Delay/String3 : Delay in format : HH:MM:SS.MMM
 * Delay/String4 : Delay in format : HH:MM:SS:FF (HH:MM:SS
 * Delay_Settings : Delay settings (in case of timecode for example)
 * Delay_Source : Delay source (Container or Stream or empty)
 * List_StreamKind : List of programs available
 * List_StreamPos : List of programs available
 * List : List of programs available
 * List/String : List of programs available
 * Title : Name of this menu
 * Language : Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn)
 * Language/String : Language (full)
 * Language/String1 : Language (full)
 * Language/String2 : Language (2-letter ISO 639-1 if exists, else empty)
 * Language/String3 : Language (3-letter ISO 639-2 if exists, else empty)
 * Language/String4 : Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty)
 * Language_More : More info about Language (e.g. Director's Comment)
 * ServiceName
 * ServiceChannel
 * Service/Url
 * ServiceProvider
 * ServiceProviderr/Url
 * ServiceType
 * NetworkName
 * Original/NetworkName
 * Countries
 * TimeZones
 * Chapters_Pos_Begin : Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin
 * and Chapters_Pos_End
 * Chapters_Pos_End : Used by third-party developers to know about the end of the chapters list (this position excluded)
 *
 */
public final class Menu {
    private Menu() {
        // Singleton
    }
}
