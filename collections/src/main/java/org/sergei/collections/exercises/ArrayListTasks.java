package org.sergei.collections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks {
    static class FirstTask {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 20; i += 3) {
                numbers.add(i);
            }
            System.out.println("ArrayList before: " + numbers);
            numbers.remove(2); // 3rd element is 2nd due to counting start from 0
            System.out.println("\nArrayList after: " + numbers);
        }
    }

    static class SecondTask {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 20; i >= 1; i -= 3) {
                numbers.add(i);
            }
            System.out.println("ArrayList before: " + numbers);
            Collections.sort(numbers);
            System.out.println("Array list after: " + numbers);
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            List<Integer> firstList = new ArrayList<>();
            for (int i = 1; i <= 20; i += 3) {
                firstList.add(i);
            }
            System.out.println("First list: " + firstList);
            List<Integer> secondList = new ArrayList<>();
            for (int i = 20; i <= 40; i += 3) {
                secondList.add(i);
            }
            System.out.println("Second list: " + secondList);
            Collections.copy(firstList, secondList);
            System.out.println("Before copy and after copy:");
            System.out.println("First list: " + firstList);
            System.out.print("Second list: " + secondList);
        }
    }

    static class FourthTask {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 20; i += 3) {
                numbers.add(i);
            }
            System.out.println("List before transformation: " + numbers);
            numbers.set(1, 15);
            System.out.println("List after transformation: " + numbers);
        }
    }

    static class FifthTask {
        public static void main(String[] args) {
            List<String> animals = new ArrayList<>();
            animals.add("Cat");
            animals.add("Dog");
            animals.add("Cheetah");

            System.out.println("Animal list: ");
            for (String animal : animals) {
                System.out.print(animal + "\t");
            }
        }
    }
}
