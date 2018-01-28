@SuppressWarnings("ALL")
public class Polymorphism {

    public static void main(String[] args) {
        String CarType = "Sportcar";

        Car car = new Car();

        car.carType(new passenger("Male"));

        car.getNumOfSeats();
        passenger.getMan();
    }
}

class Car {

    public void carType(passenger CarType) {
        System.out.print(CarType);
    }

//    private int numOfSeats = 5;

    public int getNumOfSeats() {
        return 5;
    }
}

class passenger {
    passenger(String man) {
        this.man = man;
    }

    public static String man = "John";

    public static String getMan() {
        return man;
    }
}

class commonType {

}