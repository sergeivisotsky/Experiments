package simplest.tasks;

import java.util.Scanner;

public class App33 {
    public static void main(String[] args) {
        int[] A = {10, 12, 23, 121, 52};
        boolean s = false;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (n == A[i]) {
                s = true;
            }
        }
        if (s) {
            System.out.print("ir");
        } else {
            System.out.print("nav");
        }
        input.close();
    }
}
