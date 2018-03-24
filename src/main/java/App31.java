import java.util.Scanner;

public class App31 {
    public static int method(int a, int n) {
        a = a + n*5;
        System.out.print(a);
        return a * method(a, n + 1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int f  = sc.nextInt();
        method(q, f);
        sc.close();
    }
}
