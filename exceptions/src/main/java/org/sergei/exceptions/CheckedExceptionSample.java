package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class CheckedExceptionSample {


    public static void main(String[] args) throws CheckedException {
        int a = -5;
        lessThanZeroTry(a);
//        lessThanZero(a);
    }

    public static void lessThanZero(int a) throws CheckedException {
        if (a < 0) {
            throw new CheckedException("Less than zero");
        }
    }

    public static void lessThanZeroTry(int a) {
        int b = a * 15;
        try {
            if (a <= 0) {
                throw new CheckedException("Less than zero");
            }
            System.out.println(b);
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }

}
