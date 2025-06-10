package threads;

public class Main {
    static public void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started.");


        Thread t2 = new IOThread("Thread T2", 5000);
        t2.start();

        Thread t3 = new IOThread("Thread T3", 2000);
        t3.start();

        System.out.println(t1.getName() + " finished.");
    }
}
