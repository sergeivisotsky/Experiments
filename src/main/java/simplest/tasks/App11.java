package simplest.tasks;

import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i;
        int[] m = new int[10];
        for (i = 0; i <= 9; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }

        for (i = 0; i <= 9; i++) {
            System.out.print(m[i] + "\t");
        }
        System.out.println("\n");
        for (i = 0; i <= 9; i++) {
            if (m[i] != m[9]) {
                m[i] = 0;
            }
            System.out.print(m[i] + "\t");
        }
        sc.close();
    }
}
