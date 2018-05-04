package Exercises;

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
        public static void main(String[] args) {

        }
    }
}
