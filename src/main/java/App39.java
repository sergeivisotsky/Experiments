import java.util.Scanner;

public class App39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int i, n, s = input.nextInt();
        int[] a = new int[s];

        for (i = 0; i < a.length; i++) {
             n = input.nextInt();
             a[i] = n;
        }

        for (i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                a[i] = 1;
            } else {
                a[i] = 2;
            }
        }

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        input.close();
    }
}