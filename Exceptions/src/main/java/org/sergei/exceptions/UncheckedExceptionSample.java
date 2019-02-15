package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class UncheckedExceptionSample {
    public static void main(String[] args) {
        int a = -9;
        lessThanZeroUnchecked(a);
    }

    public static void lessThanZeroUnchecked(int a) {
        if (a <= 0) {
            throw new UncheckedException("Less than zero");
        }
    }
}
