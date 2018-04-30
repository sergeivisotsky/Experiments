package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestTwo {

    abstract static class Pet {
        abstract void call();
    }

    private static class Cat extends Pet {
        String speech;

        Cat(String speech) {
            this.speech = speech;
        }

        @Override
        void call() {
            System.out.println(speech);
        }
    }

    private static class Dog extends Pet {
        String speech;

        public Dog(String speech) {
            this.speech = speech;
        }

        @Override
        void call() {
            System.out.println(speech);
        }
    }

    private static <T extends Pet> void callPets(List<T> Pets) {
        Pets.forEach(Pet::call);
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Meow-Meow-Meow!"));
        cats.add(new Cat("Meow-Meow-Meow-Two!"));
        cats.add(new Cat("Meow-Meow-Meow-Three!"));
        callPets(cats);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Gau-Gau-Gau!"));
        dogs.add(new Dog("Gau-Gau-Gau-Two!"));
        dogs.add(new Dog("Gau-Gau-Gau-Three!"));
        callPets(dogs);
    }
}
