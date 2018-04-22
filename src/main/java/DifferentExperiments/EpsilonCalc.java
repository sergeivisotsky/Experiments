package DifferentExperiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EpsilonCalc {
    static double epsilon(double delta, double average) {
        return (delta / average) * 100;
    }

    public static void main(String[] args) {
        BufferedReader input =
                new BufferedReader(
                        new InputStreamReader(System.in));
        try {
            System.out.print("Delta: ");
            double delta = Double.parseDouble(input.readLine());
            System.out.print("Average: ");
            double average = Double.parseDouble(input.readLine());
            System.out.print("ε = ");
            System.out.printf("%.1f", epsilon(delta, average));
            System.out.print("%");
        } catch (IOException e) {
            throw new IllegalStateException("Invalid delta or average!");
        }
    }
}
