package ArraySortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

interface IHeapSort {
    void sort(int array[]);

    void heapify();

    void display();
}

public class HeapSort implements IHeapSort {

    @Override
    public void sort(int[] array) {

    }

    @Override
    public void heapify() {

    }

    @Override
    public void display() {

    }

    public static void main(String[] args) {
        int[] array = {23, 56, 78, 90, 45, 23, 1, 0, 24, 76};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        System.out.println("Sorted array is: ");
        heapSort.display();
    }
}
