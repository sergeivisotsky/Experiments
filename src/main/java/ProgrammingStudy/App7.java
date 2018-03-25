package ProgrammingStudy;

public class App7 {
    public static void main(String[] args) {
        double S = 0, i = 2;
        while (i <= 100) {
            S = S + (i - 1) / i;
            i = i + 2;
        }
        System.out.print("S=" + S);
    }
}
