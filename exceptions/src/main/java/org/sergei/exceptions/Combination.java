package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class Combination {

    public static void main(String[] args) {
        int a = -5;
    }

    private static void numberEvaluation(int a) {
        if (a < 0) {
            throw new UncheckedException("a is less than 0!");
        }
    }
}
