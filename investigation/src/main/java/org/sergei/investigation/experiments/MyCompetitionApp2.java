package org.sergei.investigation.experiments;

import java.util.Scanner;

public class MyCompetitionApp2 {
    public static void inputArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Input number: ");
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void analyzeArray(int[] a) {
        int s  = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[9]) {
                s++;
            }
        }
        System.out.print(s);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        inputArray(array);
        analyzeArray(array);
    }
}
