package simplest.tasks;

import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		/*
		 * int size = 5; String UserData[] = {"Name: John", "Age: "+ 18, "Height: 180",
		 * "Gender: male", "Children: 2"}; for (int i = 0; i < size; i++) {
		 * System.out.printf("%n"+UserData[i]); }
		 */
		Scanner sc = new Scanner(System.in);
		double m[] = new double[10];
		int i;
		double S = 0;
		for (i = 0; i < 10; i++) {
			System.out.print("m[i]=");
			m[i] = sc.nextDouble();
		}
		for (i = 0; i < 10; i++)
			S = S + m[i];
		System.out.println("S=" + S);
		sc.close();
	}

}
