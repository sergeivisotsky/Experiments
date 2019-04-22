package org.sergei.investigation.newbie;

import java.util.Scanner;

public class App37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int [] a = new int[10];
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            a[i] = n;
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] > 0 && a[i] < 100) {
                s++;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
