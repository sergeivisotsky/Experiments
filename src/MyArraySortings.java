import java.util.Arrays;

public class MyArraySortings {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 5, 3, 0, 15, -5};
        System.out.println(Arrays.toString(unsortedArray));
        BubbleSort(unsortedArray);
    }

    public static void BubbleSort(int[] array) {

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

        System.out.println(Arrays.toString(array));
    }
}