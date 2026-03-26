package win.babrakov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from the thread: " + Thread.currentThread().getName());
                System.out.println("Priority is: " + Thread.currentThread().getPriority());
            }
        };

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Hello from the " + Thread.currentThread().getName() + " thread!");
        thread.start();
        System.out.println("Hello from the " + Thread.currentThread().getName() + " thread!");
    }
}