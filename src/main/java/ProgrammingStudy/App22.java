package ProgrammingStudy;

import java.util.Scanner;

public class App22 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int s = 0, i = 1, a = 1;
        System.out.print("x=");
        int x = sc.nextInt();
        while (i <= 10) {
            a *= x/i;
            s += a;
            i++;
        }
        System.out.print("S=" + s);
        sc.close();
    }
}
