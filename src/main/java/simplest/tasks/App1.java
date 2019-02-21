package simplest.tasks;//import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		double n = 1, i;
		for (i=1; i<=70000; i++) {
			n = 1 + 1/i;
		}
		System.out.print("n=" + n);
	}

}
