package win.babrakov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Thread thread = new MyThread();

        thread.start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        }
    }

}