package DataStructures;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> apples = new HashMap<>();

        System.out.println("Add apple in table: ");
        apples.put("red", "Granny Smith");
        apples.put("red-orange", "Royal Gala");

        System.out.println();
        System.out.println("Output: ");
        System.out.println(apples.get("red"));
        System.out.println(apples.get("red-orange"));
    }
}
