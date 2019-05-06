package org.sergei.investigation.experiments;

class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog("Supreme");
        System.out.println("Dogs name: " + animal.getName());
        Animal animal2 = new Cat("Infim");
        System.out.println("Cats name: " + animal2.getName());
    }
}
