package chapter_1;

public class TimeTaken {

    public static void longUsingBad() {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0 ; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("total ->" +  (end - start));
    }

    public static void longUsingGood() {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0 ; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("total ->" +  (end - start));
    }
}
