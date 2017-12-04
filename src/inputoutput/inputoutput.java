package inputoutput;

import java.util.Scanner;

public class inputoutput {
    public static void inputHeightWeight(int[] A, int[] B) {
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < A.length; i++) {
            System.out.print("Enter your weight: ");
            if (sc.hasNextInt()) {
                A[i] = sc.nextInt();
            } else {
                System.out.print("Error!");
                return;
            }
        }

        for (i = 0; i < B.length; i++) {
            System.out.print("Enter your height: ");
            if (sc.hasNextInt()) {
                B[i] = sc.nextInt();
            } else {
                System.out.print("Error!");
                return;
            }
        }

        sc.close();
    }

    public static void outputHeightWeight(int[] A, int[] B) {
        int i;
        System.out.println("\n" + "Weight table: ");

        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }

        System.out.println("\n\n" + "Height table: ");

        for (i = 0; i < B.length; i++) {
            System.out.print(B[i] + "\t");
        }

    }

}
