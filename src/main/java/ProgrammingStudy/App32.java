package ProgrammingStudy;

import java.util.Scanner;

public class App32 {

    public static int a, b; // Global variables declaration

    public static void storageCreation(int[] c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < c.length; i++) {
            System.out.print("Input a = ");
            a = sc.nextInt();
            System.out.print("Input b = ");
            b = sc.nextInt();
            c[i] = a + b;
        }
        sc.close();
    }

    public static void outputStorage(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] storage = new int[7];
        storageCreation(storage);
        outputStorage(storage);
    }
}