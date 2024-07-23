package code.oops.assignment;

public class threads {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        System.out.println("thread state: " + thread.getState());
        thread.start();
        System.out.println("thread state : "+ thread.getState());
        try {
            thread.join();
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is running -> " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}