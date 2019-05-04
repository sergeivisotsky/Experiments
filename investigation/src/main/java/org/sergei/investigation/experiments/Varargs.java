package org.sergei.investigation.experiments;

public class Varargs {
    
    public static void varargs(int ...vars) {
        for (int var : vars) {
            System.out.println(var);
        }
    }
    
    public static void main(String[] args) {
        varargs(1, 2, 3);
    }
}
