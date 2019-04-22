package org.sergei.investigation.lambda;

public class Main {
    public static void main(String[] args) {
        IInterface iInterface = x -> x + 1;
        System.out.println(iInterface);
    }
}
