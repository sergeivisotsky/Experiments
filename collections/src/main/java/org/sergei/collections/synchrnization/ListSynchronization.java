package org.sergei.collections.synchrnization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSynchronization {

    private static List<Integer> elements = Collections.synchronizedList(new ArrayList<>());
    
    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            System.out.println("First thread starting...");
            for (int i = 0; i < 100_000; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                elements.add(new Random().nextInt());
            }
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            System.out.println("Second thread starting...");
            for (int i = 0; i < 100_000; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                elements.add(new Random().nextInt());
            }
        }
    }
    
    static class ThreadThree implements Runnable {

        @Override
        public void run() {
            System.out.println("Third thread starting...");
            for (int i = 0; i < 100_000; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                elements.add(new Random().nextInt());
            }
        }
    }
    
    public static void main(String[] args) {
        new ThreadOne().run();
        new ThreadTwo().run();
        new ThreadThree().run();
    }
    
}
