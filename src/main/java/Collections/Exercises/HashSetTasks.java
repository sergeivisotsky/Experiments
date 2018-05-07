package Collections.Exercises;

import java.util.*;

public class HashSetTasks {
    private static Random rd = new Random();

    static class FirstTask {
        public static void main(String[] args) {
            HashSet<String> names = new HashSet<>();
            names.add("John");
            names.add("Maria");
            names.add("Daniela");
            System.out.println("HashSet before: " + names);
        }
    }

    static class SecondTask {
        public static void main(String[] args) {
            HashSet<Integer> numbers = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }

            Iterator<Integer> iterate = numbers.iterator();
            System.out.println("HashSet random elements: ");
            while (iterate.hasNext()) {
                System.out.print(iterate.next() + "\t");
            }
            System.out.println("\nNumber of elements is: " + numbers.size());
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            HashSet<Integer> numbers = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("HashSet before: " + numbers);
            System.out.println("Empty status before: " + numbers.isEmpty());
            numbers.removeAll(numbers);
            System.out.println("HashSet after: " + numbers);
            System.out.println("Empty status after: " + numbers.isEmpty());
        }
    }

    static class FourthTask {
        public static void main(String[] args) {
            HashSet<String> names = new HashSet<>();
            names.add("John");
            names.add("Anna");
            names.add("Lolita");
            System.out.println("Original HashSet: " + names);
            HashSet namesClone = (HashSet) names.clone();
            System.out.println("Cloned HashSet: " + namesClone);
        }
    }

    static class FifthTask {
        public static void main(String[] args) {
            HashSet<Integer> numbers = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("HashSet of names: " + numbers);
            Object[] arrayNumber = numbers.toArray();
            System.out.println("Array of names: " + Arrays.toString(arrayNumber));
        }
    }

    static class SixthTask {
        public static void main(String[] args) {
            HashSet<String> names = new HashSet<>();
            names.add("Maria");
            names.add("John");
            names.add("Asia");

            System.out.println("Created HashSet: " + names);

            Set<String> namesClone = new TreeSet<>(names);
            System.out.println("Elements in TreeSet: " + namesClone);
        }
    }

    static class SeventhTask {
        public static void main(String[] args) {
            HashSet<Integer> numbers = new HashSet<>();
            for (int i = 1; i <= 30; i += 3) {
                numbers.add(i);
            }

            System.out.println("Numbers in HashSet: " + numbers);
            List<Integer> numbersInList = new ArrayList<>(numbers);
            System.out.println("Numbers in list: " + numbersInList);
        }
    }

    static class EighthTask {
        public static void main(String[] args) {
            HashSet<Integer> firstSet = new HashSet<>();
            firstSet.add(12);
            firstSet.add(16);
            firstSet.add(67);
            firstSet.add(11);
            firstSet.add(190);
            System.out.println("First HashSet of numbers: " + firstSet);
            HashSet<Integer> secondSet = new HashSet<>();
            secondSet.add(12);
            secondSet.add(45);
            secondSet.add(67);
            secondSet.add(11);
            secondSet.add(90);
            System.out.println("Second HashSet of numbers: " + secondSet);
            System.out.print("Contains or not: ");
            for (int element : firstSet) {
                System.out.print(secondSet.contains(element) ? "Yes\t" : "No\t");
            }
        }
    }

    static class NinthTask {
        public static void main(String[] args) {
            Set<Integer> firstSet = new HashSet<>();
            firstSet.add(12);
            firstSet.add(16);
            firstSet.add(67);
            firstSet.add(11);
            firstSet.add(190);
            System.out.println("First Set of numbers: " + firstSet);
            Set<Integer> secondSet = new HashSet<>();
            secondSet.add(12);
            secondSet.add(45);
            secondSet.add(67);
            secondSet.add(11);
            secondSet.add(90);
            System.out.println("Second Set of numbers: " + secondSet);
            Set<Integer> sameElements = new HashSet<>();
            for (int element : firstSet) {
                if (secondSet.contains(element)) {
                    sameElements.add(element);
                }
            }
            System.out.println("The same elements are: " + sameElements);
        }
    }

    static class TensTask {
        public static void main(String[] args) {
            HashSet<Integer> numbers = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(rd.nextInt(99) + 1);
            }
            System.out.println("HashSet before: " + numbers);
            System.out.println("Empty status before: " + numbers.isEmpty());
            numbers.clear();
            System.out.println("HashSet after: " + numbers);
            System.out.println("Empty status after: " + numbers.isEmpty());
        }
    }
}
