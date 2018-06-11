package ArraySortingAlgorithms;

public class ShellSort {
    private static void shellSort(int[] array) {
        int step = array.length / 2;
        int temp;
        while (step > 0) {
            for (int i = 0; i < array.length - step; i++) { // In the first iteration j = 0 and goes up with the further iterations
                for (int j = i; j >= 0 &&
                        array[j] > array[j + step]; j--) {
                    temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }

            step /= 2;
        }
    }

    private static void display(int[] array) {
        for (int element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {20, 4, 90, -1, 5, 0, 14, 36};
        System.out.print("Unsorted array: ");
        display(array);
        shellSort(array);
        System.out.print("Sorted array: ");
        display(array);
    }
}
