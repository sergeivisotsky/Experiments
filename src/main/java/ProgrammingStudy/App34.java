package ProgrammingStudy;

import java.util.Scanner;

public class App34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            n -= 1;
            s += n;
            System.out.print(s);
        }

        sc.close();
    }
}
