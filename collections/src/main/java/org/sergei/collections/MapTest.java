package org.sergei.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    static class Fields {
        String key;
        String value;
        int quantity;
    }

    public static void main(String[] args) throws IOException {
        Fields fields = new Fields();
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        Map<String, String> animals = new HashMap<>();
        System.out.print("Animal quantity: ");
        fields.quantity =
                Integer.parseInt(
                        reader.readLine());
        for (int i = 0; i < fields.quantity; i++) {
            System.out.print("Input " + (i + 1) + " key: ");
            fields.key = reader.readLine();
            System.out.print("Input " + (i + 1) + " value: ");
            fields.value = reader.readLine();
            animals.put(fields.key, fields.value);
        }
        boolean endSession = false;
        do {
        System.out.print("Would you like to get any animal value (y/n)? ");
        String rhetoricalAnswer = reader.readLine();
            switch (rhetoricalAnswer) {
                case "y":
                case "Y":
                    System.out.print("What animal would you like to get?" + "\n" + "Key: ");
                    fields.key = reader.readLine();
                    System.out.println(animals.get(fields.key));
                    break;
                case "n":
                case "N":
                    endSession = true;
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        } while (!endSession);
    }
}
