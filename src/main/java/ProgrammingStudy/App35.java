package ProgrammingStudy;

import java.util.Scanner;

public class App35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int s = 0;
        int maxi = 0;

        for (int i = 1; i < A.length; i++) {
            A[i] = sc.nextInt();
            if (A[i] > A[maxi]) {
                maxi = i;
            }

            if (A[i] == maxi) {
                s++;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
