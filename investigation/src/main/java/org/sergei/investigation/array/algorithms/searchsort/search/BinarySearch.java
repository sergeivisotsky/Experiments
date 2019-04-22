package org.sergei.investigation.array.algorithms.searchsort.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    private static boolean binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == element) {
                return true;
            } else if(element < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader userInput =
                new BufferedReader(
                        new InputStreamReader(System.in));
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("Input searchable number: ");
        int number = Integer.parseInt(userInput.readLine());
        long before = System.nanoTime();
        System.out.println(binarySearch(myArray, number));
        long after = System.nanoTime();
        System.out.println(after - before);
    }
}
