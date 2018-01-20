package Recursion;

public class ThirdVariant {
    public static void main(String[] args) {

        Calculation calc = new Calculation();
        int result = calc.factorial(5);
        System.out.println(result);
    }
}

class Calculation {

    public int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);

        }
    }
}
