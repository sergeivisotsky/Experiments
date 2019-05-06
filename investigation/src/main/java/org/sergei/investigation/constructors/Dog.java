package org.sergei.investigation.constructors;

public class Dog implements Doings {

    public static void main(String[] args) {
        int years = 5;
        int legs = 4;
        String name = "Potatoe";
        Animals dog = new Animals(years, legs, name);
        dog.DogsGauGau();
    }

    @Override
    public void everyone() {

    }

    @Override
    public void creation() {

    }
}
