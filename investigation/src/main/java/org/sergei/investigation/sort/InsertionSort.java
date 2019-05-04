package org.sergei.investigation.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 5, 3, 0, 15, -5, 9, 2, 4, 12};
        System.out.println(Arrays.toString(unsortedArray));
        Insertion(unsortedArray);
    }

    public static void Insertion(int[] array) {
        int temp;

        for (int i = 1; i < array.length - 1; i++) {
            temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
