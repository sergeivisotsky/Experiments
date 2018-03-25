package ProgrammingStudy;

public class App24 {
    public static void main(String[] args) {
        int m = 10, i;
        int a[][] = new int[m][];
        for (i = 0; i < m; i++) {
            a[i] = new int[i + 1];
        }

        for (i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;
            }
        }

        for (i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
