package chapter_8;

public class Bill {

    //Bad
    public static void statementBad() {
        long timeBefore = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i<10; i++) result += i;
        long timeAfter = System.currentTimeMillis();
        System.out.println("Bad time -> " + (timeAfter - timeBefore));
    }

    //Good
    public static void statement() {
        long timeBefore = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<10; i++) sb.append(i);
        long timeAfter = System.currentTimeMillis();
        System.out.println("Good time -> " + (timeAfter - timeBefore));
    }
}
