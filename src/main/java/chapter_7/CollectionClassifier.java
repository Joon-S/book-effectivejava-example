package chapter_7;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    //public static String classify(Collection<?> c) {
    //    return "Unknown Collection";
    //}

    //Good
    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";
    }
}
