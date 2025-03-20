// Creating a thread by extending Thread class
class MyThread extends Thread {
    // Overriding the run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Starting the threads
        t1.start();
        t2.start();

        // Main thread message
        System.out.println("Main thread is running...");
    }
}
