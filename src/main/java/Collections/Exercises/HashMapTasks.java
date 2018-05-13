package Collections.Exercises;

import java.util.HashMap;
import java.util.Map;

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

        }
    }
}
