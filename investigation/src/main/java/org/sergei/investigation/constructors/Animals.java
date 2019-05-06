package org.sergei.investigation.constructors;

public class Animals {

    private int years;
    private int legs;
    private String name;

    Animals(int years, int legs, String dogName) {
        this.years = years;
        this.legs = legs;
        name = dogName;
    }

    public void DogsGauGau() {
        System.out.println(name + "\n" + years + legs);
    }


}

interface Doings {
    void everyone();
    void creation();
}