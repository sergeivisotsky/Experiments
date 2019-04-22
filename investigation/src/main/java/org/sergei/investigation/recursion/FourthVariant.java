package org.sergei.investigation.recursion;

public class FourthVariant {
    public static void main(String[] args) {
        int a = 1;
        while (true) {
            System.out.println(fibonacci(a));
            a++;
            if (a == 100) {
                break;
            }
        }
    }

    private static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1 || a == 2) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}
