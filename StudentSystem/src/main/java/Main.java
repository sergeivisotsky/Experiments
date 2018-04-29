import Functionality.core.Functions;
import Functionality.core.TemplateInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            TemplateInformation template = new TemplateInformation();
            Functions functions = new Functions();
            System.out.println("Student info from .txt file");
            int answer;
            String yesNoAnswer;
            do {
                System.out.println("0: Create from template");
                System.out.println("1: Show data");
                System.out.println("2: Add data");
                System.out.println("3: Modify data");
                System.out.println("4: Delete data");
                System.out.print("\nChoose answer: ");
                answer = Integer.parseInt(Functions.reader.readLine());
                switch (answer) {
                    case 0:
                        template.fileCreation();
                        System.out.println("Data was written!");
                        break;
                    case 1:
                        functions.showData();
                        break;
                    case 2:
                        functions.addRecord();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                        throw new IllegalStateException("Illegal state!");
                }
                System.out.print("\nContinue? (y/n) ");
                yesNoAnswer = Functions.reader.readLine();
            } while (yesNoAnswer.equals("y") || yesNoAnswer.equals("Y"));
        } catch (IOException e) {
            System.out.println("\nInput-output error!");
        }
    }
}
