package DifferentExperiments;

import java.util.Scanner;

public class RetireCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        while (age < 0) {
            System.out.print("Your age shouldn't be negative number! :))))" + "\n" + "Enter your real age: ");
            age = sc.nextInt();
        }

        switch (age) {
            case 65:
                System.out.print("You are old! Bro! You should go for the retirement! :)");
                break;
            case 0:
                System.out.println("You are just born! Bro! :)" + "\n" + "You are too young to start working! :)");
                break;
                default:
                    System.out.print("You are pretty young and sexy!!! :)" + "\n" + "You should work at least: " + (65 - age));
        }

        sc.close();
    }
}
