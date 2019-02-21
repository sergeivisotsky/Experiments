package org.sergei.collections.exercises;

import java.util.*;

public class PriorityQueueTasks {
    private static Random rd = new Random();

    static class FirstTask {
        public static void main(String[] args) {
            PriorityQueue<String> colors = new PriorityQueue<>();
            colors.add("red");
            colors.add("green");
            colors.add("blue");
            System.out.println("Elements: " + colors);
        }
    }

    static class SecondTask {
        public static void main(String[] args) {
            PriorityQueue<Integer> numbers = new PriorityQueue<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }

            Iterator<Integer> iterator = numbers.iterator();
            System.out.println("Priority queue elements: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + "\t");
            }

            //The simplest way is forEach loop
            System.out.println("\nPriority queue iteration with forEach loop:");
            for (int element : numbers) {
                System.out.print(element + "\t");
            }
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            PriorityQueue<Integer> firstPQ = new PriorityQueue<>();
            for (int i = 0; i < 10; i++) {
                firstPQ.add(rd.nextInt(99) + 1);
            }
            System.out.println("First priority queue: " + firstPQ);

            PriorityQueue<Integer> secondPQ = new PriorityQueue<>();
            for (int i = 0; i < 10; i++) {
                secondPQ.add(rd.nextInt(99) + 1);
            }
            System.out.println("Second priority queue before: " + secondPQ);
            secondPQ.addAll(firstPQ);
            System.out.println("Second priority queue after: " + secondPQ);
        }
    }

    static class FourthTask {
        public static void main(String[] args) {
            PriorityQueue<Integer> numbers = new PriorityQueue<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("Priority queue before: " + numbers);
            numbers.removeAll(numbers);
            System.out.println("Priority queue after: " + numbers);
        }
    }

    static class FifthTask {
        public static void main(String[] args) {
            PriorityQueue<Integer> numbers = new PriorityQueue<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }

            System.out.println("Priority queue: " + numbers);
            System.out.println("Priority queue size: " + numbers.size());
        }
    }

    static class SixthTask {
        public static void main(String[] args) {
            PriorityQueue<String> firstPQ = new PriorityQueue<>();
            firstPQ.add("red");
            firstPQ.add("green");
            firstPQ.add("blue");
            System.out.println("First PQ: " + firstPQ);
            PriorityQueue<String> secondPQ = new PriorityQueue<>();
            secondPQ.add("red");
            secondPQ.add("purple");
            secondPQ.add("blue");
            System.out.println("Second PQ: " + secondPQ);

            System.out.println("Contains or not: ");
            for (String element : firstPQ) {
                System.out.print(secondPQ.contains(element) ? "Yes\t" : "No\t");
            }
        }
    }

    static class SeventhTask {
        public static void main(String[] args) {
            PriorityQueue<String> colors = new PriorityQueue<>();
            colors.add("red");
            colors.add("green");
            colors.add("blue");
            System.out.println("PriorityQueue: " + colors);
            List<String> arrayOfColors = new ArrayList<>(colors);
            System.out.println("ArrayList: " + arrayOfColors);
        }
    }

    static class EightsTask {
        public static void main(String[] args) {
            PriorityQueue<Integer> numbers = new PriorityQueue<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("Priority queue before removal: " + numbers);
            System.out.println("Removing first element: " + numbers.poll());
            System.out.println("Priority queue after: " + numbers);
        }
    }

    static class NinthTask {
        public static void main(String[] args) {
            PriorityQueue<String> colors = new PriorityQueue<>();
            colors.add("red");
            colors.add("green");
            colors.add("blue");
            System.out.println("Priority queue as a PQ: " + colors);
            String str = colors.toString();
            System.out.println("String representation: " + str);
        }
    }
}
