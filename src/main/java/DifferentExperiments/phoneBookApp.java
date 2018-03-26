package DifferentExperiments;

import java.util.Scanner;

public class phoneBookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inout number quantity: ");
        int x = input.nextInt();
        String[] numbers = new String[x];

        if (x <= 0) {
            System.out.print("Your number quantity should be a positive number and not a zero!");
        }

        System.out.print("Input phone numbers: ");
        for (int i = 0; i < x; i++) {
            numbers[i] = input.nextLine();
        }

        input.close();
    }
}
