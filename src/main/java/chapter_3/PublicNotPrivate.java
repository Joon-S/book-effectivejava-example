package chapter_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PublicNotPrivate {

    //public -> private
    private static String[] values = {"Hello", "nice", "to", "meet", "you"};

    //simple way
    public static final List<String> VALUES =
            Collections.unmodifiableList(Arrays.asList(values));

    //simple way too
    public static final String[] values() {
        return values.clone();
    }
}
