public class App13 {
    public static void main(String args[]) {
        int m[] = new int[100];
        int s = 0;
        for (int i = 0, k = -50; i < 100; i++) {
            m[i] = k;
            k += 1;
            System.out.print(m[i] + " ");
        }

        for (int i = 0, k = -50; i < 100; i++) {
            if (m[i] >= 0) {
                s += m[i];
                System.out.print("\n" + s + " ");
            }
        }
    }
}
