package Exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdPart {
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    static class FirstTask {
        static int max;
        static int min;

        private static void maxMin(int[] array) {
            max = array[0];
            min = array[0];
            for (int i = 1; i < array.length - 1; i += 2) {
                if ((i + 1) > (array.length - 1)) {
                    if (array[i] > max) max = array[i];
                    if (array[i] < min) min = array[i];
                }

                if (array[i] > array[i + 1]) {
                    if (array[i + 1] > max) max = array[i];
                    if (array[i + 1] < min) min = array[i + 1];
                }

                if (array[i] < array[i + 1]) {
                    if (array[i] < min) min = array[i];
                    if (array[i + 1] > max) max = array[i + 1];
                }
            }
        }

        public static void main(String[] args) {
            int[] array = {12, 34, 56, 78, 90, 12, 15, 10, -30, 900, 456, 1};
            maxMin(array);
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Maximal element is: " + max);
            System.out.println("Minimal element is: " + min);
        }
    }

    static class secondTask {
        public static void main(String[] args) {
            int[] array = {20, 20, 30, 40, 50, 50, 50};
            System.out.println("Array before is: " + Arrays.toString(array));
            System.out.println("Array length before is: : " + array.length);
            System.out.println("Array length after: " + arrayModifier(array));
        }

        private static int arrayModifier(int[] array) {
            int counter = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1]) {
                    array[counter++] = array[i];
                }
            }
            return counter;
        }
    }
}
