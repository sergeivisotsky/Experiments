package DifferentExperiments;

import java.util.Scanner;

public class Labyrinth {
    public static void main(String[] args) {
        int[][] f;
        int[][] result = {
                {0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0}};
        int r, c, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("row count: ");
        r = sc.nextInt();

        System.out.print("column count: ");
        c = sc.nextInt();

        f = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                f[i][j] = sc.nextInt();
            }
        }

        System.out.print("Method number(1-3): ");
        m = sc.nextInt();
        sc.close();

        switch (m) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(result[i][0] + result[i][1]);
        }
    }
}
