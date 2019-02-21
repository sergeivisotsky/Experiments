package simplest.tasks;

public class App27 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 3, 5, 6, 7, 5, 6, 7, 8};
        int B[] = {1, 5, 20, 15, 8, 7, 4, 5};
        int i, j;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                    break;
                }
            }
        }
    }
}
