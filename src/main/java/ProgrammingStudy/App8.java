package ProgrammingStudy;

public class App8 {
    public static void main(String[] args) {
        int[] A = new int[50];
        int i, c;
        for (i = 0; i < 50; i++) {
            A[i] = i + 1;
        }
        for (i = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 25; i++) {
            c = A[i];
            A[i] = A[49 - i];
            A[49 - i] = c;
        }
        for (i = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
