package different.experiments;

import java.util.ArrayList;

public class varTesting {
    public static void main(String[] args) {
        var hello = new ArrayList<String>();
        var string = "Hello bro!";
        hello.add("Hello world!");
        hello.add("Hello Mars!");
        hello.add("Hello Neptun!");

        System.out.println(hello.get(0));
        System.out.println(hello.get(1));
        System.out.println(hello.get(2));
        System.out.println(string);
    }
}