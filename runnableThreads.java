import java.lang.Thread;
public class runnableThreads implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Thread ob = new Thread(new runnableThreads());
        ob.start();
        ob.setName("My Thread");
        System.out.println("Thread name is: " + ob.getName());
    }
}