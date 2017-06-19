package aka.jmetadata.main.helper;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * All methods linked to date manipulation.
 *
 * @author Charlotte
 */
public final class DateTimeHelper {

    // Regex patterns
    private static Pattern absolutePattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})\\.((\\d{3}))?");

    /**
     * Parses text from the beginning of the given string to produce a date with all DateFormat enum values.<br>
     * Return first result that match.
     * The method may not use the entire text of the given string.
     *
     * @param dateToParse whose beginning should be parsed.
     * @return date parsed from the string.
     */
    @Nullable
    public static LocalDateTime parseLocalDateTime(@NonNull final String dateToParse) {
        LocalDateTime result = null;
        final DateFormat[] values = DateFormat.values();
        for (final DateFormat dateFormat : values) {
            try {
                final DateTimeFormatter formatter = dateFormat.getSimpleDateFormat();
                result = LocalDateTime.parse(dateToParse, formatter);
            } catch (final DateTimeParseException e) {
                // Nothing to do
            }
        }

        return result;
    }

    /**
     * Parses text from the beginning of the given string to produce a date with all DateFormat enum values.<br>
     * Return first result that match.
     * The method may not use the entire text of the given string.
     *
     * @param timeToParse whose beginning should be parsed.
     * @return time parsed from the string.
     */
    @Nullable
    public static LocalTime parseLocalTime(@NonNull final String timeToParse) {
        LocalTime localTime = null;

        final Matcher matcher = absolutePattern.matcher(timeToParse);
        if (matcher.matches()) {
            try {
                localTime = LocalTime.parse(timeToParse);
            } catch (final DateTimeParseException e) {
                // Nothing to do
            }
        }
        return localTime;
    }

    private DateTimeHelper() {
        // Singleton
    }
}
