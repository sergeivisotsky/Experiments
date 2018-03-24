package Exceptions;

public class MainClass {

    public static void main(String[] args) {

        SideCaller sideCaller = new SideCaller();
        try {
            sideCaller.getResult("g");
        } catch (TriangleException e) {
            e.printStackTrace();
        }

    }
}
