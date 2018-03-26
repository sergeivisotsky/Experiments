package DifferentExperiments;

import java.util.Scanner;

public class LinearSearch {
    public static int LinearSearch(int n, int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = {5, 15, 28, 35, 47, 59};
        int n = input.nextInt();
        int i = LinearSearch(n, a);
        System.out.print(i);
        input.close();
    }
}
