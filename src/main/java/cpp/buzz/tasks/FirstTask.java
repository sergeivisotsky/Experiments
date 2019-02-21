package cpp.buzz.tasks;

public class FirstTask {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 9},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                s += a[i][j];
            }
        }
        System.out.println(s);
    }
}
