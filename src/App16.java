import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
        int m[] = new int[10];
        int i, s = 0;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (m[i]%m[9] == 0) {
                s++;
            }
        }
        System.out.print("S=" + s);
        sc.close();
    }
}
