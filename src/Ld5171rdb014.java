import java.util.Scanner;

public class Ld5171rdb014 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int k = 0, i, j, C;

        System.out.println("John Kensington IRDB00 171RDB171014");
        System.out.print("Uzdevums(1/2): ");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            k = sc.nextInt();
        } else {
            System.out.print("input-output-error");
            sc.close();
            return;
        }
        sc.close();

        if (k == 1) {
            C = 1;
            for (i = 0; i < 10; i++) {
                for (j = 0; j < 10; j++) {
                    A[i][j] = C;
                    C++;
                }
            }
        } else if (k == 2) {
            for (i = 0; i < 10; i++) {
                for (j = 0; j <= j - i; j++) {
                    A[i][j] = 10 - j + i;
                }
            }
        } else {
            System.out.print("input-output-error");
            return;
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
