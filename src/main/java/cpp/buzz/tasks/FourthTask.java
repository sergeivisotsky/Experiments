package cpp.buzz.tasks;

import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {0, 0, 2, 1, 3, 5, 2};
        int c[] = {};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                c[j] = a[i] + b[i];
            }
        }

        Arrays.toString(c);
    }
}
