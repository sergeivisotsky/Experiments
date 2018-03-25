package ProgrammingStudy;

/*
    *
*/
public class App14 {
    public static void main(String[] args) {
        int[][] a= new int[10][10];
        // initialize array
        int s, i, j;
        s = 0;
        /*i = 0;
        do {
            j = 0;
            do {
                s = s + a[i][j];
                j = j + 1;
            } while(j < 10);
            i = i + 1;
        } while (i < 10);*/
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                s += a[i][j];
            }
        }
        System.out.print(s);
    }
}
