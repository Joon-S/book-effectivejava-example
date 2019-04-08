package chapter_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void stopThreadBadTest() {
        try {
            StopThreadBad.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void stopThreadTest() {
        try {
            StopThread.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
