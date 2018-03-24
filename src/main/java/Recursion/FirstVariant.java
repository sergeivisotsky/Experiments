package Recursion;

public class FirstVariant {
    public static int dev(int a, int s) {
        if (a > 1) {
            return a * dev(a - 1, s - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        dev(5, 6);
    }
}
