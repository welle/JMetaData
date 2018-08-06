package aka.jmetadata.main.helper;

import org.eclipse.jdt.annotation.Nullable;

/**
 * Data utils helper.
 *
 * @author charlottew
 */
public class DataUtilsHelper {

    /**
     * remove all non-numerical values from the given string
     *
     * @param text
     * @return concatenated string
     */
    @Nullable
    public static String trimNonNumerical(@Nullable final String text) {
        String result = null;
        if (text != null) {
            result = text.replaceAll("[^0-9]", "");
        }
        return result;
    }

    /**
     * Check if given string is null or empty.
     *
     * @param text
     * @return true if passed String is null or empty
     */
    public static boolean isEmpty(@Nullable final String text) {
        return text == null || text.trim().length() == 0;
    }

    /**
     * Check if string is a digit
     *
     * @param str String
     * @return True if str is a digit, false otherwise
     */
    public static boolean isDigit(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        for (var i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.') {
                return false;
            }
        }
        return true;
    }

}
