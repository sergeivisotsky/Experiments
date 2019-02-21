package array.algorithms.sorting.algorithms;

public class QuadraticSort {
    private static void quadraticSort(int[] array) {
        int gCnt = (int) Math.ceil(Math.sqrt(array.length));
        int gLen = (int) Math.floor(Math.sqrt(array.length));
        int[] buf = new int[gCnt];
        int[][] gBorders = new int[gCnt][2];
        int min, bmin = 0;
        int i, j, k;

        gBorders[0][0] = 0;
        gBorders[0][1] = gLen - 1;
        for (i = 1; i <= gLen - 1; i++) {
            gBorders[i][0] = gBorders[i - 1][0] + gLen;
            gBorders[i][1] = gBorders[i - 1][1] + gLen;

        }

        gBorders[gCnt - 1][1] = array.length - 1;

        for (i = 0; i < gCnt; i++) {
            min = gBorders[i][0];
            for (j = gBorders[i][0] + 1;
                 j <= gBorders[i][1]; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            buf[i] = array[min];
            array[min] = Integer.MAX_VALUE; // array[min] is infinity
        }

        int[] arrayToStore = new int[array.length];

        for (k = 0; k < array.length; k += 1) {

            for (i = 0; i < gCnt; i++) {
                if (buf[i] < buf[bmin]) {
                    bmin = i;
                }
            }

            arrayToStore[k] = buf[bmin];
            buf[bmin] = Integer.MAX_VALUE; // buf[min] is infinity

            min = gBorders[bmin][0];
            for (i = gBorders[bmin][0] + 1;
                 i <= gBorders[bmin][1]; i++) {
                if (array[min] > array[i]) {
                    min = i;
                }
            }

            buf[bmin] = array[min];
            array[min] = Integer.MAX_VALUE; // array[min] is infinity
        }

        for (i = 0; i < array.length; i++) {
            array[i] = arrayToStore[i];
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
        quadraticSort(array);
        System.out.print("Sorted array: ");
        display(array);
    }
}
