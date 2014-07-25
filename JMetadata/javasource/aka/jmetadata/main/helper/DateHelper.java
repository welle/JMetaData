package aka.jmetadata.main.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Nonnull;

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
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    @Nonnull
    public static Date parse(@Nonnull final String dateToParse) throws ParseException {
        Date result = null;
        final DateFormat[] values = DateFormat.values();
        for (int i = 0; i < values.length; i++) {
            try {
                final SimpleDateFormat formatter = values[i].getSimpleDateFormat();
                result = formatter.parse(dateToParse);
            } catch (final ParseException e) {
                if (i == values.length - 1) {
                    // All date formats failed, throw exception
                    throw e;
                }
            }
        }

        assert result != null : "As DateFormat enum contains at least one value and ParseException was throwed if failed, it should not be possible.";
        return result;
    }

    private DateHelper() {
        // Singleton
    }
}
