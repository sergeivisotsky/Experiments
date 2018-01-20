package Recursion;

public class SecondVariant {
    public static int a(int a, int b) {
        a = 1 + b;
        if (a > 0) {
            return a * a(a + 1, b - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        a(5, 6);
    }
}
