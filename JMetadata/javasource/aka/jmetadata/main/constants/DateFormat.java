package aka.jmetadata.main.constants;

import java.text.SimpleDateFormat;

import javax.annotation.Nonnull;

/**
 * Date format enum.
 *
 * @author Charlotte
 */
public enum DateFormat {

    /**
     * Date format 1 {@value} (example: UTC 2014-07-17 07:48:54.611)
     */
    Type1("z yyyy-MM-dd HH:mm:ss.SSS"),
    /**
     * Date format 1 {@value} (example: UTC 2010-02-19 02:01:40)
     */
    Type2("z yyyy-MM-dd HH:mm:ss");

    @Nonnull
    private final String value;
    @Nonnull
    private SimpleDateFormat sdf;

    private DateFormat(@Nonnull final String value) {
        this.value = value;
        this.sdf = new SimpleDateFormat(value);
    }

    /**
     * Get the value.
     *
     * @return name.
     */
    @Nonnull
    public String getValue() {
        return this.value;
    }

    /**
     * Get the simple date format.
     *
     * @return simple date format.
     */
    @Nonnull
    public SimpleDateFormat getSimpleDateFormat() {
        return this.sdf;
    }
}
