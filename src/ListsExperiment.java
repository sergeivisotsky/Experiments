import java.util.ArrayList;
import java.util.Scanner;

public class ListsExperiment {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Input: ");
            String addText = sc.nextLine();
            list.add(addText);
        }

        sc.close();

        System.out.println(list);
    }
}
