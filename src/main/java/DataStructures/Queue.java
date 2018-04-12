package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.print("Number of elements: ");
        int capacity = Integer.parseInt(reader.readLine());
        ArrayList<String> queue = new ArrayList<>(capacity);
        for (int i = 0; i <= capacity - 1; i++) {
            System.out.print("Add " + (i + 1) + " element: ");
            String element = reader.readLine();
            queue.add(0, element);
        }
        System.out.print("Peek element: " + queue.get(0));
    }
}
