package Collections.Exercises;

import java.util.*;

public class HashMapTasks {
    static class FirstTask {
        public static void main(String[] args) {
            HashMap<Integer, String> animals = new HashMap<>();
            animals.put(1, "Dog");
            animals.put(2, "Cat");
            animals.put(3, "Cheetah");
            System.out.println("Created HashMap");
            for (Map.Entry animal : animals.entrySet()) {
                System.out.println(animal.getKey() + ". "
                        + animal.getValue());
            }
            System.out.println("Number of entries: " + animals.size());
        }
    }

    static class SecondTask {
        public static void main(String[] args) {
            HashMap<Integer, String> firstMap = new HashMap<>();
            firstMap.put(1, "Dog");
            firstMap.put(2, "Cat");
            firstMap.put(3, "Cheetah");
            System.out.println("First HashMap: ");
            for (Map.Entry animal : firstMap.entrySet()) {
                System.out.println(animal.getKey() + ". "
                        + animal.getValue());
            }
            HashMap<Integer, String> secondMap = new HashMap<>();
            secondMap.put(4, "Dolphin");
            secondMap.put(5, "Tiger");
            secondMap.put(6, "Fish");
            secondMap.putAll(firstMap);
            System.out.println("\nSecond HashMap: ");
            for (Map.Entry animalSecond :
                    secondMap.entrySet()) {
                System.out.println(animalSecond.getKey() + ". "
                        + animalSecond.getValue());
            }
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            HashMap<Integer, String> animals = new HashMap<>();
            animals.put(1, "Dog");
            animals.put(2, "Cat");
            animals.put(3, "Cheetah");
            for (Map.Entry animal :
                    animals.entrySet()) {
                System.out.println(animal.getKey() + ". " +
                        animal.getValue());
            }
            animals.clear();
            if (animals.isEmpty()) {
                System.out.println("HashMap is empty!");
            }
            for (Map.Entry animal : animals.entrySet()) {
                System.out.println(animal.getKey() + ". " +
                        animal.getValue());
            }
        }
    }

    static class FourthTask {
        public static void main(String[] args) {
            HashMap<Integer, String> animals = new HashMap<>();
            animals.put(1, "Dog");
            animals.put(2, "Cat");
            animals.put(3, "Cheetah");
            for (Map.Entry animal : animals.entrySet()) {
                System.out.println(animal.getKey() + ". " +
                        animal.getValue());
            }
            System.out.println("Empty status: " + animals.isEmpty());
        }
    }

    static class FifthTask {
        public static void main(String[] args) {
            HashMap<String, String> animals = new HashMap<>();
            animals.put("Big", "Dog");
            animals.put("Pretty", "Cat");
            animals.put("Lazy", "Cheetah");
            for (Map.Entry animal : animals.entrySet()) {
                System.out.println("Key: " + animal.getKey() + "\tValue: " +
                        animal.getValue());
            }
            System.out.println("Contains key: " + animals.containsKey("Big"));
            System.out.println("Contains value: " + animals.containsValue("Refrigerator"));
        }
    }

    static class SixthTask {
        public static void main(String[] args) {
            HashMap<Integer, String> colors = new HashMap<>();
            colors.put(1, "red");
            colors.put(2, "green");
            colors.put(3, "blue");
            for (Map.Entry color : colors.entrySet()) {
                System.out.println(color.getKey() + ". " + color.getValue());
            }

            String specificValue = colors.get(3);

            System.out.println("Value for the 3 key: " + specificValue);
        }
    }

    static class SeventhTask {
        public static void main(String[] args) {
            HashMap<Integer, String> colors = new HashMap<>();
            colors.put(1, "red");
            colors.put(2, "green");
            colors.put(3, "blue");
            for (Map.Entry color : colors.entrySet()) {
                System.out.println(color.getKey() + ". " + color.getValue());
            }

            Set<Integer> keySet = colors.keySet();

            System.out.println("KeySet values: " + keySet);
        }
    }

    static class EightsTask {
        public static void main(String[] args) {
            HashMap<Integer, String> colors = new HashMap<>();
            colors.put(1, "red");
            colors.put(2, "green");
            colors.put(3, "blue");
            for (Map.Entry color : colors.entrySet()) {
                System.out.println(color.getKey() + ". " + color.getValue());
            }

            Collection<String> valueSet = colors.values();
            System.out.println("Values are: " + valueSet);
        }
    }
}
