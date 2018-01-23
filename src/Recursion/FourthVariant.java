package Recursion;

public class FourthVariant {
    public static void main(String[] args) {
        int a = 3;
        System.out.print(fibonacci(a));
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
