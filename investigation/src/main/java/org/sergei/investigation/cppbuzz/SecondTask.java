package org.sergei.investigation.cppbuzz;

public class SecondTask {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < a.length; i += 3) {
            sumEven += a[i];
        }
        System.out.println("Even: " + sumEven);
        for (int i = 0; i < a.length; i += 2) {
            sumOdd += a[i];
        }
        System.out.println("Odd: " + sumOdd);
    }
}
