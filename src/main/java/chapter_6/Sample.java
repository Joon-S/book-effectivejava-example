package chapter_6;

public class Sample {
    @JoonTest public static void m1() {} //Success
    public static void m2() {}
    @JoonTest public static void m3() { //Fail
        throw new RuntimeException("Boom");
    }

    public static void m4() {}
    @JoonTest public void m5() {} // Not a static method
    public static void m6() {}
    @JoonTest public static void m7() { // Fail
        throw new RuntimeException("Crash");
    }
    public static void m8() {}
}
