package Threads;

public class ThreadImplementation implements Runnable {

    private int threadCounter;

    ThreadImplementation(int threadCounter) {
        this.threadCounter = threadCounter;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Thread Study");
        while (!Thread.currentThread().isInterrupted() &&
                threadCounter > 0) {
            System.out.println(String.valueOf(threadCounter));
            threadCounter--;

            try {
                Thread.sleep(50_000);
            } catch (InterruptedException e) {
                System.out.println("Interruption!");
                return;
            }
        }

        if (threadCounter == 0) {
            System.out.println("I'm done!");
        }
    }
}
