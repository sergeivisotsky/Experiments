package org.sergei.investigation.array.algorithms.searchsort.sort;

public class QuickSort {

    private static int partition(int[] array, int lowest, int highest) {
        int pivot = array[highest];
        int smallestIndex = (lowest - 1);
        for (int i = lowest; i < highest; i++) {
            if (array[i] <= pivot) {
                smallestIndex++;

                int temp = array[smallestIndex];
                array[smallestIndex] = array[i];
                array[i] = temp;
            }
        }

        int temp = array[smallestIndex + 1];
        array[smallestIndex + 1] = array[highest];
        array[highest] = temp;

        return smallestIndex + 1;
    }

    private static void quickSort(int[] array, int lowest, int highest) {
        if (lowest < highest) {
            int partition = partition(array, lowest, highest);

            quickSort(array, lowest, partition - 1);
            quickSort(array, partition + 1, highest);
        }
    }

    private static void display(int[] array) {
        for (int element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 0, 15, -5, 25,};
        System.out.print("Unsorted array: ");
        display(array);
        quickSort(array, 0, array.length - 1);
        System.out.print("Sorted array: ");
        display(array);
    }
}
