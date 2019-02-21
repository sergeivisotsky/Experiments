package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class ErrorSample {

    public static void main(String[] args) {
        int a = 25;
        crazyRecursion(a);
    }

    private static void crazyRecursion(int a) {
        crazyRecursion(a);
    }

}
