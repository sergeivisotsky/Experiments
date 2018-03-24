package multithreadedProgramming;

public class Threading extends Thread {
    private Thread anyThread;
    private String threadName;

    public Threading(String tName) {
        threadName = tName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
    }

    public void start() {
        System.out.println("Starting: " + threadName);
    }

    public static void main(String[] args) {

    }
}
