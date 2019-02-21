package threads;

import org.junit.jupiter.api.Test;

class ThreadImplementationTest {
    @Test
    public void ThreadImplementation() throws Exception {
        Thread.currentThread().setName("Thread study testing");
        Thread testThread = new Thread(new ThreadImplementation(10));
        System.out.println("Thread created!");

        testThread.start();
        System.out.println("Thread started!");

        testThread.join();
        System.out.println("Thread done!");
    }

    @Test
    public void performanceTest() throws Exception {
        Thread.currentThread().setName("Thread study testing");
        Thread testThread = new Thread(new ThreadImplementation(100));
        System.out.println("Thread created!");

        testThread.start();
        System.out.println("Thread started!");

        testThread.join(5_000);
        System.out.println("5 seconds after...");

        testThread.interrupt();
        System.out.println("Thread was interrupted!");
    }
}