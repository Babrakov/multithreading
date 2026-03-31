package win.babrakov.threadtermination;

import static java.lang.Thread.sleep;

public class ThreadInterruption {

    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingThread());
        thread.start();
        thread.interrupt();
    }

    private static class BlockingThread implements Runnable {

        @Override
        public void run() {
            try {
                sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }

}
