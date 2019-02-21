package different.experiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EpsilonCalc {
    private static BufferedReader input =
        new BufferedReader(
                new InputStreamReader(System.in));

    static double average(int quantity) throws IOException {
        double result = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.print("Number: ");
            double number = Double.parseDouble(input.readLine());
            result += number;
        }

        return result / quantity;
    }

    static double epsilon(double delta, double average) {
        return (delta / average) * 100;
    }

    public static void main(String[] args) {

        try {

            System.out.print("Quantity of average numbers: ");
            int quantity = Integer.parseInt(input.readLine());
            /*System.out.print("Number: ");
            double number = Double.parseDouble(input.readLine());*/

            System.out.print("Average = " + average(quantity));

            /*System.out.print("Delta: ");
            double delta = Double.parseDouble(input.readLine());
            System.out.print("ε = ");
            System.out.printf("%.1f", epsilon(delta, average));
            System.out.print("%");*/
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid delta or average!");
        }
    }
}
