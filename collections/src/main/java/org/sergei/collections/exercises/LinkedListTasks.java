package org.sergei.collections.exercises;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListTasks {
    private static Random rd = new Random();

    static class FirstTask {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(23);
            numbers.add(45);
            numbers.add(55);
            System.out.println("Linked list before appending: " + numbers);
            numbers.addLast(36);
            System.out.println("Linked list after appending: " + numbers);
        }
    }

    static class SecondTask {
        public static void main(String[] args) {
            LinkedList<String> animals = new LinkedList<>();
            animals.add("Cat");
            animals.add("Dog");
            animals.add("Cheetah");
            System.out.print("Animals: ");
            for (String animal : animals) {
                System.out.print(animal + " ");
            }
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            for (int i = 1; i <= 20; i += 3) {
                numbers.add(i);
            }
            System.out.println("LinkedList before: " + numbers);
            numbers.addLast(55);
            System.out.println("LinkedList after: " + numbers);
        }
    }

    static class FourthTask {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(13);
            numbers.add(35);
            numbers.add(13);
            numbers.add(19);
            numbers.add(56);
            System.out.println("LinkedList result: " + numbers);
            System.out.println("First element: " + numbers.getFirst());
            System.out.println("Last element: " + numbers.getLast());
        }
    }

    static class FifthTask {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Element-index: " +
                        numbers.get(i) + " - " + i);
            }
        }
    }

    static class SixthTask {
        public static void main(String[] args) {
            LinkedList<Integer> firstList = new LinkedList<>();
            for (int i = 1; i <= 20; i += 3) {
                firstList.add(i);
            }
            System.out.println("First LinkedList: " + firstList);
            LinkedList secondList = (LinkedList) firstList.clone();
            System.out.println("Second list: " + secondList);
        }
    }

    static class SeventhTask {
        public static void main(String[] args) {
            LinkedList<String> names = new LinkedList<>();
            names.add("John");
            names.add("Maria");
            names.add("Oriana");
            System.out.println("Create LinkedList: " + names);
            System.out.println("Deletable element: " + names.removeFirst());
            System.out.println("LinkedList after: " + names);
        }
    }

    static class EightTask {
        public static void main(String[] args) {
            LinkedList<String> animals = new LinkedList<>();
            animals.add("Cat");
            animals.add("Dog");
            animals.add("Tiger");
            animals.add("Panda");
            animals.add("Cheetah");
            System.out.println("LinkedList: " + animals);
            System.out.println("The first element is: " + animals.peekFirst());
            System.out.println("The last element is: " + animals.peekLast());
        }
    }

    static class NinthTask {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("LinkedList: " + numbers);
            LinkedList numbersInList = (LinkedList) numbers.clone();
            System.out.println("ArrayList: " + numbersInList);
        }
    }

    static class TensTask {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(13);
            numbers.add(34);
            numbers.add(33);
            System.out.println("First LinkedList: " + numbers);
            LinkedList<Integer> numbersTwo = new LinkedList<>();
            numbersTwo.add(13);
            numbersTwo.add(34);
            numbersTwo.add(45);
            LinkedList<String> similarOrNot = new LinkedList<>();
            for (int element : numbers) {
                similarOrNot.add(numbersTwo.contains(element) ? "Yes" : "No");
            }
            System.out.println("Element similarity: " + similarOrNot);
        }
    }
}
