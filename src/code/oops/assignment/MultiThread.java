package code.oops.assignment;

public class MultiThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread extends Thread {
    private String threadEg;


    MyThread(String name) {
        threadEg = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadEg + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadEg + " interrupted.");
            }
        }
        System.out.println(threadEg + " exiting.");
    }
}
