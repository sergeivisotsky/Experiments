package ArraySortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 5, 3, 0, 15, -5};
        System.out.println(Arrays.toString(unsortedArray));
        Bubble(unsortedArray);
    }

    public static void Bubble(int[] array) {
        long start = System.nanoTime();

        int temp, counter;

        do {
            counter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    counter++;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        } while (counter > 0);

        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));

        System.out.print("Time: ");
        System.out.print(stop - start);
    }
}