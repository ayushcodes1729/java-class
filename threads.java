// Create 3 threads named t1, t2 and t3 put the t1 thread in waiting state for 5000ms and put join() on t2.

import java.lang.Thread;
public class threads extends Thread{
    public void run(){
            System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        threads t1 = new threads();
        threads t2 = new threads();
        threads t3 = new threads();
        t1.start();
        t1.currentThread().setName("Thread1");
        t2.currentThread().setName("Thread2");
        t3.currentThread().setName("Thread3");
        System.out.println("Thread 1 is " + t1.isAlive());
        System.out.println("Thread 2 is " + t2.isAlive());
        System.out.println("Thread 3 is " + t3.isAlive());
        try {
            t1.sleep(5000);
            t3.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}