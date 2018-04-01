package Threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadImplementationTest {
    @Test
    private void ThreadImplementation() throws Exception {
        Thread.currentThread().setName("Thread study testing");
        Thread testThread = new Thread(new ThreadImplementation(20));
        System.out.println("Thread created!!!");

        testThread.start();
        System.out.println("Thread started!");

        testThread.join();
        System.out.println("Thread done!!!");
    }

}