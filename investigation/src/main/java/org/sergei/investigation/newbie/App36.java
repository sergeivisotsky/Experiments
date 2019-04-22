package org.sergei.investigation.newbie;

import java.util.Scanner;

public class App36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 2, i;
        int n = input.nextInt();
        for (i = 1; i <= n; i++) {
            s = s ^ i;
            System.out.print(s + " ");

        }
        if (s > n) {
            System.out.print("\n" + s);
        }
        input.close();
    }
}
