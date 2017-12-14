import java.util.Random;
import java.util.Scanner;

public class Ld4171rdb063 {
    public static void main(String[] args) {

        int[][] A = {{250, 300, 250, 250, 250},
                {100, 50, 60, 70, 200},
                {250, 100, 70, 150, 200},
                {300, 400, 200, 250, 300},
                {400, 320, 250, 220, 270},
                {200, 200, 200, 200, 200},
                {250, 260, 250, 250, 250},
                {250, 200, 100, 250, 80}};
        int i, j;
        int pointCounter = 0;
        String ch = "n";

        System.out.println("John Kensington IRDB00 171RDB171063");
        System.out.print("Random (y/n)? ");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            ch = sc.next();
        } else {
            System.out.print("input-output-error");
            sc.close();
            return;
        }
        sc.close();
        Random rnd = new Random();

        if (ch.equals("Y") || ch.equals("y")) {
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 5; j++) {
                    A[i][j] = rnd.nextInt(500 - 10)+10;
                }
            }
        } else {
            if (!ch.equals("N") && !ch.equals("n")) {
                System.out.print("input-output-error");
                return;
            }
        }

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("results:");

        for (i = 0; i < 8; i++) {

            for (j = 0; j < 5; j++){

                if (A[i][j] >= 250) {
                    pointCounter++;
                }

            }

            if (pointCounter >= 1) {
                System.out.print((i + 1) + "\t");
            }
        }
    }
}
