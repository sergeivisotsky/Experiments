package DifferentExperiments;

import java.util.Scanner;

public class ObjectClass {
    public static void main(String[] args) {
        int[] age = {25, 30, 50, 60, 70};
        double[] height = {1.50, 1.70, 1.80, 1.50, 1.60};

        // homoSapiens.calculator(age, height);

        homoSapiens homoDefined = new homoSapiens();
        homoDefined.setName("John");
        homoDefined.setAge(25);
        homoDefined.setCentury(21);
        homoDefined.Multiplication();
        // addHomoDefiend();
    }
}

class homoSapiens {
    private static double s;
    /*public static void calculator(int[] a, double[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                s = a[i] + b[j];
                System.out.print(s + "\t");
            }
        }
    }

    public homoSapiens(int a, double b) {
        s = a + b;
        System.out.print(s);
    }*/

    public String setName(String name) {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        sc.close();
        return name;
    }

    public int setAge(int age) {
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        sc.close();
        return age;
    }

    public int setCentury(int century) {
        Scanner sc = new Scanner(System.in);
        century = sc.nextInt();
        sc.close();
        return century;
    }

    public void Multiplication() {
        // System.out.print();
    }
}