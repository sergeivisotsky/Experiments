package org.sergei.investigation.experiments;

public class ArraySorting {
    public static int LinearArraySorting(int[] A, int n, int x) {
        int last = A[n - 1];
        A[n - 1] = x;
        int i = 0;
        while (A[i] != x) {
            i++;
        }
        A[n - 1] = last;
        if (A[i] == x) {
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = LinearArraySorting(A, A.length, 20);
        System.out.print(i);
    }
}
