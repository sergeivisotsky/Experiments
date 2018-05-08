package Collections.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetTasks {
    private static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    private static Random rd = new Random();

    static class FirstTask {
        public static void main(String[] args) {
            TreeSet<String> colors = new TreeSet<>();
            colors.add("red");
            colors.add("green");
            colors.add("blue");
            System.out.println("Colors: " + colors);
        }
    }

    static class SecondTask {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.print("TreeSet contains: ");
            for (int element : numbers) {
                System.out.print(element + "\t");
            }
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            TreeSet<String> firstSetOfColors = new TreeSet<>();
            firstSetOfColors.add("red");
            firstSetOfColors.add("green");
            firstSetOfColors.add("blue");
            System.out.println("First TreeSet: " + firstSetOfColors);
            TreeSet<String> secondSetOfColors = new TreeSet<>();
            secondSetOfColors.add("purple");
            secondSetOfColors.add("magenta");
            secondSetOfColors.add("green");
            secondSetOfColors.addAll(firstSetOfColors);
            System.out.println("Second TreeSet: " + secondSetOfColors);
        }
    }

    static class FourthTask {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            System.out.println("Numbers TreeSet: " + numbers);
            Iterator iterate = numbers.descendingIterator();
            System.out.println("Reversed TreeSet: ");
            while (iterate.hasNext()) {
                System.out.print(iterate.next() + "\t");
            }

            System.out.println("\nThe first element is: " + numbers.first());
            System.out.println("The last element is: " + numbers.last());
        }
    }

    static class FifthTask {
        public static void main(String[] args) {
            TreeSet<String> names = new TreeSet<>();
            names.add("Evelina");
            names.add("Alina");
            names.add("Oksana");
            System.out.println("Names TreeSet: " + names);
            TreeSet namesClone = (TreeSet) names.clone();
            System.out.println("Clone of the names TreeSet: " + namesClone);
            System.out.println("TreeSet size is: " + names.size());
        }
    }

    static class SixthTask {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(1);
            numbers.add(13);
            numbers.add(1445);
            numbers.add(45);
            numbers.add(3443);
            System.out.println("The first TreeSet: " + numbers);
            TreeSet<Integer> secondNumberSet = new TreeSet<>();
            secondNumberSet.add(1);
            secondNumberSet.add(4);
            secondNumberSet.add(1445);
            secondNumberSet.add(3);
            secondNumberSet.add(3443);
            System.out.println("The second TreeSet: " + secondNumberSet);
            System.out.print("Contains or not: ");
            for (int element : numbers) {
                System.out.print(secondNumberSet.contains(element) ? "Yes\t" : "No\t");
            }
        }
    }

    static class SeventhTask {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            TreeSet<Integer> numbersLessThanSeven;
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            numbersLessThanSeven = (TreeSet<Integer>) numbers.headSet(7);
            System.out.println("Elements that are less than 7 are: " + numbersLessThanSeven);
        }
    }

    static class EightsTask {
        public static void main(String[] args) throws IOException {
            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(12);
            numbers.add(45);
            numbers.add(67);
            numbers.add(214);
            numbers.add(90);
            System.out.print("Add pivot: ");
            int pivot = Integer.parseInt(br.readLine());
            System.out.println("Element that is greater that or equal: " +
                    numbers.ceiling(pivot));
        }
    }

    static class NinthTask {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("TreeSet before: " + numbers);
            System.out.println("Delete first element: " + numbers.pollFirst());
            System.out.println("TreeSet after: " + numbers);
        }
    }

    static class TensTask {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("TreeSet before: " + numbers);
            System.out.println("Delete last element: " + numbers.pollLast());
            System.out.println("TreeSet after: " + numbers);
        }
    }

    static class EleventhTask {
        public static void main(String[] args) throws IOException {
            TreeSet<Integer> numbers = new TreeSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("Created TreeSet: " + numbers);
            System.out.print("Removable element is: ");
            int deletableElement = Integer.parseInt(br.readLine());
            numbers.remove(deletableElement);
            System.out.println("TreeSet after: " + numbers);
        }
    }
}
