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

        }
    }
}
