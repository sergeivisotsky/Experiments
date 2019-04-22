package org.sergei.investigation.threads;

class CreateThread implements Runnable {
    private Thread thread;
    private String threadName;

    CreateThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println("Run " + threadName);
            for (int i = 0; i <= 5; i++) {
                System.out.println("Create " + threadName + "\t" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }

        System.out.println("Close " + threadName);
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        CreateThread firstThread = new CreateThread("Sigma");
        firstThread.start();
        CreateThread secondThread = new CreateThread("Betta");
        secondThread.start();
    }
}
