/**
 * Main package.
 *
 * <p>
 * For regular media files (like ".mpg" or ".avi") the track information is available after the media has been parsed (or played).
 * </p>
 * <p>
 * For DVD media files (like ".iso" files) the track information is not available after the media has been parsed, a video output must have been created, and even then the video track width/height
 * might not be available until a short time later.
 * </p>
 * <p>
 * In all cases, the other functions for title, video, audio and chapter descriptions require that a video output has been created before they return valid information.
 * </p>
 *
 * @author Charlotte
 */
package aka.jmetadata.main;

