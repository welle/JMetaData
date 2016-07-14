package aka.jmetadata.main.helper;

import java.time.format.DateTimeFormatter;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Date format enum.
 *
 * @author Charlotte
 */
enum DateFormat {

    /**
     * Date format 1 {@value} (example: UTC 2014-07-17 07:48:54.611)
     */
    Type1("z yyyy-MM-dd HH:mm:ss.SSS"),

    /**
     * Date format 1 {@value} (example: UTC 2010-02-19 02:01:40)
     */
    Type2("z yyyy-MM-dd HH:mm:ss");

    @NonNull
    private final String value;
    @NonNull
    private DateTimeFormatter sdf;

    private DateFormat(@NonNull final String value) {
        this.value = value;
        this.sdf = DateTimeFormatter.ofPattern(value);
    }

    /**
     * Get the value.
     *
     * @return name.
     */
    @NonNull
    public String getValue() {
        return this.value;
    }

    /**
     * Get the simple date format.
     *
     * @return simple date format.
     */
    @NonNull
    public DateTimeFormatter getSimpleDateFormat() {
        return this.sdf;
    }
}
