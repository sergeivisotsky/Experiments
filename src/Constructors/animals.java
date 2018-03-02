package Constructors;

public class animals {

    private int years;
    private int legs;
    private String name;

    animals(int years, int legs, String dogName) {
        this.years = years;
        this.legs = legs;
        name = dogName;
    }

    public void DogsGauGau() {
        System.out.println(name + "\n" + years + legs);
    }


}

interface doings {
    void everyone();
    void creation();
}