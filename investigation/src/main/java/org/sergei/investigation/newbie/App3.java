package org.sergei.investigation.newbie;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, i = 1, p = 10;
		System.out.print("N=");
		N = sc.nextInt();
		while (N >= p) {
			i = i + 1;
			p = p * 10;
		}
		System.out.print("i=" + i);
		sc.close();
	}

}
