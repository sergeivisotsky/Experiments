package simplest.tasks;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		int N, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		N = sc.nextInt();
		while (i < N) {
			N = 2 ^ i;
			i = i + 1;
		}
		System.out.print("i=" + i);
		sc.close();
	}

}
