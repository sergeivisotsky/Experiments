package ProgrammingStudy;

import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        String monthname = "Current month: ";
        System.out.print("Month number:" + " ");
        month = sc.nextInt();
        switch (month) {
            case 12: case 1: case 2:
                System.out.println(monthname + "Winter");
                break;
            case 3: case 4: case 5:
                System.out.print(monthname + "Spring");
                break;
            case 6: case 7: case 8:
                System.out.print(monthname + "Summer");
                break;
            case 9: case 10: case 11:
                System.out.print(monthname + "Autumn");
                break;
            default:
                System.out.print("Error!");
        }
        sc.close();
    }
}
