package org.sergei.investigation.sort;

import java.util.Arrays;

interface IHeapSort {
    void sort(int array[]);

    void heapify(int array[], int arrayLength, int nodeNumber);
}

public class HeapSort implements IHeapSort {

    @Override
    public void sort(int[] array) {
        int length = array.length;
        for (int i = (length / 2) - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    @Override
    public void heapify(int array[], int heapSize, int index) {
        int largestElement = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heapSize &&
                array[left] > array[largestElement]) {
            largestElement = left;
        }

        if (right < heapSize &&
                array[right] > array[largestElement]) {
            largestElement = right;
        }

        if (largestElement != index) {
            int swap = array[index];
            array[index] = array[largestElement];
            array[largestElement] = swap;
            heapify(array, heapSize, largestElement);
        }
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] array = {23, 56, 78, 90, 45, 22, 1, 0, 24, 76};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("Sorted array is: " + Arrays.toString(array));
    }
}
