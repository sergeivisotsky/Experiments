import java.util.Random;

public class Methods {
    public static void createMas (int[] M, int D) {
        int i;
        Random r = new Random();
        for (i = 0; i < M.length; i++) {
            M[i] = r.nextInt(D + 1);
        }
    }

    public static void outputMas(int[] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println();
    }

    public static void concatMas(int[] A, int[] B, int[] C) {
        int i;
        for (i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
    }

    public static void main(String[] args) {
        int[] A, B, C;
        A = new int[20];
        B = new int[10];
        C = new int[30];
        createMas(A, 100);
        createMas(B, 50);
        outputMas(A);
        outputMas(B);
        concatMas(A, B, C);
        outputMas(C);
    }
}
