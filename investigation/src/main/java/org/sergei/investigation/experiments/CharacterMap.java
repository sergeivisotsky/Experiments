package org.sergei.investigation.experiments;

public class CharacterMap {
    private void firstTask() {
        System.out.println("First task:");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

    private void secondTask() {
        System.out.println("Second task:");
        System.out.println("1");
        System.out.println("12");
        System.out.println("123");
        System.out.println("1234");
        System.out.println("12345");
    }

    private void thirdTask() {
        System.out.println("Third task:");
        System.out.println("A");
        System.out.println("AB");
        System.out.println("ABC");
        System.out.println("ABCD");
        System.out.println("ABDEF");
    }

    private void fourthTask() {
        System.out.println("Fourth task:");
        System.out.println("FEDCBA");
        System.out.println("FEDCB");
        System.out.println("FEDC");
        System.out.println("EED");
        System.out.println("FE");
        System.out.println("F");
    }

    private void fifthTask() {
        System.out.println("Fifth task:");
        System.out.println("\t      *");
        System.out.println("\t     ***");
        System.out.println("\t    *****");
        System.out.println("\t   *******");
    }

    private void sixthTash() {
        System.out.println("Sixth task:");
        System.out.println("1");
        System.out.println("2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9 10");
    }

    private void seventhTask() {
        System.out.println("Seventh task:");
        System.out.println("*********");
        System.out.println("*******");
        System.out.println("*****");
        System.out.println("***");
        System.out.println("*");
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("*******");
        System.out.println("*********");
    }

    public static void main(String[] args) {
        CharacterMap characters = new CharacterMap();
        characters.firstTask();
        System.out.println();
        characters.secondTask();
        System.out.println();
        characters.thirdTask();
        System.out.println();
        characters.fourthTask();
        System.out.println();
        characters.fifthTask();
        System.out.println();
        characters.sixthTash();
        System.out.println();
        characters.seventhTask();
    }

}
