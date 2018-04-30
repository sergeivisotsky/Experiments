package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestTwo {
    private static class Animal {
        void voice() {
            System.out.println("Animal voice!");
        }
    }

    private static class Pet extends Animal {
        void call() {
            System.out.println("Animal call!");
        }
    }

    private static class Cat extends Pet {
        void mew() {
            System.out.println("Mew-Mew-Mew! :)");
        }
    }

    private static <T extends Pet> void callPets(List<T> Pets) {
        Pets.forEach(Pet::call);
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        callPets(cats);
    }
}
