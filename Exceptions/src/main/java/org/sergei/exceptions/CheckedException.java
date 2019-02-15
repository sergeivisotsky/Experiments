package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class CheckedException {


    public static void main(String[] args) throws CheckedExpException {
        int a = -5;
        lessThanZeroTry(a);
//        lessThanZero(a);
    }

    public static void lessThanZero(int a) throws CheckedExpException {
        if (a < 0) {
            throw new CheckedExpException("Less than zero");
        }
    }

    public static void lessThanZeroTry(int a) {
        int b = a * 15;
        try {
            if (a <= 0) {
                throw new CheckedExpException("Less than zero");
            }
            System.out.println(b);
        } catch (CheckedExpException e) {
            e.printStackTrace();
        }
    }

}
