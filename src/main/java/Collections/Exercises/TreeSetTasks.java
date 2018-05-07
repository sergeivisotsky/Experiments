package Collections.Exercises;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetTasks {
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
            
        }
    }
}
