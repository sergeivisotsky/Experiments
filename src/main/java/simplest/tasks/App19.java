package simplest.tasks;

import java.util.Scanner;

public class App19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x=");
        double x = sc.nextDouble();
        System.out.print("n=");
        int n = sc.nextInt();
        double s = Math.sin(x), a = Math.sin(x);
        int i = 2;
        while (i <= n) {
            a = Math.sin(a);
            s += a;
            i++;
        }
        System.out.print("S=" + s);
        sc.close();
    }
}
