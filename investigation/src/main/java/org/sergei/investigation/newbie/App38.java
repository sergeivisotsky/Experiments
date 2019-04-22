package org.sergei.investigation.newbie;

import java.util.Scanner;

public class App38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            int n = in.nextInt();
            A[i] = n;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[9]) {
                A[i] = 0;
            }
            System.out.print(A[i] + " ");
        }
        in.close();
    }
}
