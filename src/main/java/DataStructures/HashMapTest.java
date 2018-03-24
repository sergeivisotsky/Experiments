package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapTest {
    static class Fields {
        int hashMapSize;
        int findInHashMapSize;
        String hashMapKey;
        String hashMapValue;
    }

    public static void main(String[] args) throws IOException {
        Fields fields = new Fields();
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        HashMap<String, String> apples = new HashMap<>();
        System.out.print("Hashmap size: ");
        fields.hashMapSize =
                Integer.parseInt(br.readLine());
        System.out.println("Add apple in table: ");


        for (int i = 0; i < fields.hashMapSize; i++) {
            System.out.print("Key: ");
            fields.hashMapKey = br.readLine();
            System.out.print("Value: ");
            fields.hashMapValue = br.readLine();
            apples.put(fields.hashMapKey,
                    fields.hashMapValue);
        }

        System.out.println();
        System.out.println("Find apple: ");
        System.out.print("Quantity: ");
        fields.findInHashMapSize =
                Integer.parseInt(br.readLine());

        for (int j = 0; j < fields.findInHashMapSize; j++) {
            System.out.print("Key for the " + (j + 1) + " element: ");
            fields.hashMapKey = br.readLine();
            System.out.println(
                    apples.get(fields.hashMapKey));
        }
    }
}
