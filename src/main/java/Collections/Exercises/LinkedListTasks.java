package Collections.Exercises;

import java.util.LinkedList;

public class LinkedListTasks {
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
            for (int i = 1; i < 20; i += 3) {
                numbers.add(i);
            }
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Element-index: " +
                        numbers.get(i) + " - " + i);
            }
        }
    }
}
