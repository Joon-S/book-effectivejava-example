package chapter_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityClass {

    /**
     * this class only have static methods or field values
     */
    private UtilityClass() {
        throw new AssertionError();
    }

    public static String makeYYYYMMDD() {
        Date date = new Date();
        return new SimpleDateFormat("yyyyMMdd").format(date);
    }
}
