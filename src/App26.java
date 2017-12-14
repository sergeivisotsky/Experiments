public class App26 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 3, 5, 6, 7, 5, 6, 7, 8};
        int i, j, s;
        for (i = 0; i < A.length; i++) {
            s = 0;
            for (j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    s++;
                }
            }
            if (s == 1) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
