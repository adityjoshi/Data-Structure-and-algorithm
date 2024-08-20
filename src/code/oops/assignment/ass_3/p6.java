package code.oops.assignment.ass_3;

public class p6 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
//        thread1.start();
//        thread2.start();

        threading thread3 = new threading();
        thread3.start();
    }
}
class MyThread implements Runnable {
   public void run() {
        System.out.println(Thread.currentThread().getName() +"thread is running");
    }
}

class threading extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " is running");
    }
}
