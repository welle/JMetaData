package aka.jmetadata.main.constants;

/**
 * Chapters
 *
 * Count : Count of objects available in this stream
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
 * MenuID : The menu ID for this stream in this file
 * MenuID/String : The menu ID for this stream in this file
 * Format : Format used
 * Format/Info : Info about Format
 * Format/Url : Link
 * Codec : Deprecated
 * Codec/String : Deprecated
 * Codec/Info : Deprecated
 * Codec/Url : Deprecated
 * Total : Total number of chapters
 * Title : Name of the track
 * Language/String : Language (full)
 * Language/String1 : Language (full)
 * Language/String2 : Language (2-letter ISO 639-1 if exists, else empty)
 * Language/String3 : Language (3-letter ISO 639-2 if exists, else empty)
 * Language/String4 : Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty)
 * Language_More : More info about Language (e.g. Director's Comment)
 * Default : Set if that track should be used if no language found matches the user preference.
 * Default/String : Set if that track should be used if no language found matches the user preference.
 * Forced : Set if that track should be used if no language found matches the user preference.
 * Forced/String : Set if that track should be used if no language found matches the user preference.
 */
public final class Chapters {

    private Chapters() {
        // Singleton
    }
}
