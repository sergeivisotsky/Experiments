public class App40 {
    public static void main(String[] args) {
        int[] userAge = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        analyzer(userAge, sum);
        System.out.print(sum);

    }

    public static int analyzer(int[] age, int sum) {
        for (int i = 0; i < age.length; i++) {
            sum += age[i] / age.length;
        }

        return sum;
    }
}
