package org.sergei.investigation.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondPart {
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    static class FirstTask {
        public static void main(String[] args) throws IOException {
            StringBuilder reversedLine = new StringBuilder(" ");
            System.out.print("Input a string: ");
            String line = reader.readLine();
            for (int i = line.length() - 1; i >= 0; i--) {
                reversedLine.append(line.charAt(i));
            }

            System.out.println("Reverse string: " + reversedLine);
        }
    }

    static class secondTask {
        public static void main(String[] args) throws IOException {
            int firstNum, secondNum, thirdNum;
            System.out.print("Input the first number: ");
            firstNum = Integer.parseInt(reader.readLine());
            System.out.print("Input the second number: ");
            secondNum = Integer.parseInt(reader.readLine());
            System.out.print("Input the third number: ");
            thirdNum = Integer.parseInt(reader.readLine());

            System.out.println("The result is: " +
                    result(firstNum, secondNum, thirdNum));
        }

        private static boolean result(int firstNum, int secNum, int thirdNum) {
            return (firstNum + secNum) == thirdNum;
        }
    }

    static class ThirdTask {
        public static void main(String[] args) {
            int[] original = {20, 30, 40};
            int[] after = new int[original.length];
            System.out.print("Original Array: ");
            for (int element : original) {
                System.out.print(element + "\t");
            }
            System.out.println();
            for (int i = original.length - 1; i >= 0; i--) {
                int temp = original[i];
                original[i] = original[original.length - i - 1];
                after[original.length - i - 1] = temp;
            }
            System.out.print("New array after swapping the first and last elements: ");
            for (int element : after) {
                System.out.print(element + "\t");
            }
        }
    }

    static class FourthTask {
        public static void main(String[] args) throws IOException {
            System.out.print("Input a value for inch: ");
            double inches = Integer.parseInt(reader.readLine());
            System.out.println(inches + " inch is " +
                    inchesToMeters(inches) + " meters");
        }

        private static double inchesToMeters(double inches) {
            return inches * 0.0254;
        }
    }

    static class FifthTask {
        public static void main(String[] args) throws IOException {
            System.out.print("Input a: ");
            double a = Integer.parseInt(reader.readLine());
            System.out.print("Input b: ");
            double b = Integer.parseInt(reader.readLine());
            System.out.print("Input c: ");
            double c = Integer.parseInt(reader.readLine());

            double D = Math.pow(b, 2) - 4 * a * c;
            double firstX = (-b + Math.sqrt(D)) / (2 * a);
            double secondX = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The roots are " + firstX + " and " + secondX);
        }
    }
}
