package org.sergei.investigation.newbie;

public class Fibonacci {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                s += (i + j);
            }
            System.out.print(s + " ");
        }
    }
}
