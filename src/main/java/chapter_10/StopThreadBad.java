package chapter_10;

import java.util.concurrent.TimeUnit;


public class StopThreadBad {
    private static boolean stopRequested;

    public static void run() throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested)
                    i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
