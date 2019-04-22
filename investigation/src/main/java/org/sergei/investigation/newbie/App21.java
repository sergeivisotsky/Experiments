package org.sergei.investigation.newbie;

public class App21 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i, p = 1, s = 0;
        for (i = 0; i < 10; i++) {
            p *= a[i];
            s += p;
        }
        System.out.print("S=" + s);
    }
}
