package org.sergei.investigation.experiments;

public class IntegerComparison {
    public static void main(String[] args) {
        Integer a = 300;
        Integer b = 300;

        if (a == b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("Value equality check");
        if (a.equals(b)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


