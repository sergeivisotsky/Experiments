import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, a = 2;
		System.out.print("N=");
		N = sc.nextInt();
		while (a <= N) {
			a = a * 2;
		}
		System.out.print("a=" + a);
		sc.close();
	}

}
