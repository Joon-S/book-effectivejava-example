package chapter_3;

public class StringLengthComparatorV2 implements Comparator<String> {
    @Override
    public int compare(String t1, String t2) {
        return t1.length() - t2.length();
    }
}
