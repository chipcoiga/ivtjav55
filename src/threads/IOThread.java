package threads;

public class IOThread extends Thread {
    private String threadName;
    private int timeToSleep;

    public IOThread(String threadName, int timeToSleep) {
        super(threadName);
        this.threadName = threadName;
        this.timeToSleep = timeToSleep;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        System.out.println(this.threadName + " started.");

        try{
            Thread.sleep(this.timeToSleep);
            //Đang xử lý công việc nào đó bất kỳ]
            System.out.println(this.threadName + " finished");
        }
        catch (Exception e){
            System.out.println(this.threadName + " InterruptedException");
        }
    }
}
/**
 * main started.
 * Thread-0 started.
 * Thread-0 finished
 * main starts Thread-0.
 * main finished.
 */
/**
 * main started.
 * Thread-0 started.
 * main starts Thread-0.
 * main finished.
 * Thread-0 finished
 */