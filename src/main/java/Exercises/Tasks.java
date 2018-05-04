package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks {
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    static class FirstTask {
        public static void main(String[] args) {
            int s;
            for (int i = 1; i <= 10; i++) {
                s = 8 * i;
                System.out.println("8 x " + i + " = " + s);
            }
        }
    }

    static class SecondTask {
        public static void main(String[] args) throws IOException {
            System.out.print("Input decimal number: ");
            int decimal = Integer.parseInt(reader.readLine());
            System.out.println("Hexadecimal number is : " +
                    Integer.toHexString(decimal).toUpperCase());
        }
    }
}


