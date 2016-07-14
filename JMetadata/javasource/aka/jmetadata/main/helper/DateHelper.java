package aka.jmetadata.main.helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.eclipse.jdt.annotation.NonNull;

/**
 * All methods linked to date manipulation.
 *
 * @author Charlotte
 */
public final class DateHelper {

    /**
     * Parses text from the beginning of the given string to produce a date with all DateFormat enum values.<br>
     * Return first result that match.
     * The method may not use the entire text of the given string.
     *
     * @param dateToParse whose beginning should be parsed.
     * @return date parsed from the string.
     * @throws DateTimeParseException if the beginning of the specified string cannot be parsed.
     */
    @NonNull
    public static LocalDate parse(@NonNull final String dateToParse) throws DateTimeParseException {
        LocalDate result = LocalDate.now();
        final DateFormat[] values = DateFormat.values();
        for (int i = 0; i < values.length; i++) {
            try {
                final DateTimeFormatter formatter = values[i].getSimpleDateFormat();
                result = LocalDate.parse(dateToParse, formatter);
                break;
            } catch (final DateTimeParseException e) {
                if (i == values.length - 1) {
                    // All date formats failed, throw exception
                    throw e;
                }
            }
        }

        return result;
    }

    private DateHelper() {
        // Singleton
    }
}
