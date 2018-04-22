package DifferentExperiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class EpsilonCalc {
    static double average(int quantity, double element) {
        LinkedList<Double> elements = new LinkedList<>();
        elements.add(element);
        double result = 0;
        for (int i = 0; i < quantity; i++) {
            result += elements.get(i);
        }

        return result / quantity;
    }

    static double epsilon(double delta, double average) {
        return (delta / average) * 100;
    }

    public static void main(String[] args) {
        BufferedReader input =
                new BufferedReader(
                        new InputStreamReader(System.in));
        try {

            System.out.print("Quantity of average numbers: ");
            int quantity = Integer.parseInt(input.readLine());
            double average = 0;
            for (int i = 0; i < quantity; i++) {
                System.out.print("Number: ");
                double number = Double.parseDouble(input.readLine());
                average = average(quantity, number);
            }

            System.out.print("Delta: ");
            double delta = Double.parseDouble(input.readLine());
            System.out.print("ε = ");
            System.out.printf("%.1f", epsilon(delta, average));
            System.out.print("%");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid delta or average!");
        }
    }
}
