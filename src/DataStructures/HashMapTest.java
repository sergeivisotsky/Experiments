package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapTest {
    static class Variables {
        int hashMapSize;
        int findInHashMapSize;
        String hashMapKey;
        String hashMapValue;
    }

    public static void main(String[] args) throws IOException {
        Variables variables = new Variables();
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        HashMap<String, String> apples = new HashMap<>();
        System.out.print("Hashmap size: ");
        variables.hashMapSize =
                Integer.parseInt(br.readLine());
        System.out.println("Add apple in table: ");


        for (int i = 0; i < variables.hashMapSize; i++) {
            System.out.print("Key: ");
            variables.hashMapKey = br.readLine();
            System.out.print("Value: ");
            variables.hashMapValue = br.readLine();
            apples.put(variables.hashMapKey,
                    variables.hashMapValue);
        }

        System.out.println();
        System.out.println("Find apple: ");
        System.out.print("Quantity: ");
        variables.findInHashMapSize =
                Integer.parseInt(br.readLine());

        for (int j = 0; j < variables.findInHashMapSize; j++) {
            System.out.print("Key for the " + (j + 1) + " element: ");
            variables.hashMapKey = br.readLine();
            System.out.println(
                    apples.get(variables.hashMapKey));
        }
    }
}
