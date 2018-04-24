package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Length: ");
        int listLength = Integer.parseInt(br.readLine());

        int inputCounter = 1;
        System.out.println("Add user list: ");
        for (int i = 0; i < listLength; i++) {
            System.out.print(inputCounter + ". User: ");
            String inputName = br.readLine();
            names.add(inputName);
            inputCounter++;
        }

        System.out.println();
        System.out.println("User list output: ");
        int counter = 1;
        for (String name: names) {
            System.out.println(counter + ". " + name);
            counter++;
        }
    }
}
