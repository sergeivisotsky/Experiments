package org.sergei.exceptions;

public class NestedExceptionSample {

    public static void main(String[] args) {
        int a = -5;
        lessThanZero(a);
    }

    public static void lessThanZero(int a) {
        int b = 5;
        try {
            int c = a + b;
            if (c == 0) {
                throw new UncheckedException("Zero!");
            }
        } catch (UncheckedException e) {
            throw new ArithmeticException(e);
        }
    }
}
