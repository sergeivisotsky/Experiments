package simplest.tasks;

import java.util.Scanner;

public class App15 {
    public static void main(String[] args) {
        int m[] = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }

        for (i = 0; i <= 9; i++) {
            if (m[i] != m[9]) {
                m[i] = 0;
            }
            System.out.print(m[i] + " ");
        }
        sc.close();
    }
}
