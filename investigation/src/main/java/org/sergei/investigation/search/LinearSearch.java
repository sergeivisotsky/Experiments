package org.sergei.investigation.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
    private static int linearSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return (i + 1);
            }
        }
        return Integer.parseInt("Element not found!");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader userInput =
                new BufferedReader(
                        new InputStreamReader(System.in));
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("Input searchable number: ");
        int number = Integer.parseInt(userInput.readLine());
        long before = System.nanoTime();
        System.out.println(linearSearch(myArray, number));
        long after = System.nanoTime();
        System.out.println(after - before);
    }
}
