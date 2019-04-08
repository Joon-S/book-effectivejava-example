package chapter_10;

import java.util.concurrent.TimeUnit;

/**
 * 변경 가능 데이터는 한 스레드만 이용하는것을 권장
 */
public class StopThread {

    //읽기와 쓰기가 모두 적용되어야만 동기화에 의미가 있기때문에 volatile 추가
    //private static boolean stopRequested;
    private static volatile boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void run() throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(!stopRequested())
                    i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
