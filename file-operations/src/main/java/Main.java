import Functionality.core.MainFunctions;
import Functionality.core.TemplateInformation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            TemplateInformation template = new TemplateInformation();
            MainFunctions mainFunctions = new MainFunctions();
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
                answer = Integer.parseInt(MainFunctions.reader.readLine());
                switch (answer) {
                    case 0:
                        template.fileCreation();
                        System.out.println("Data was written!");
                        break;
                    case 1:
                        mainFunctions.showData();
                        break;
                    case 2:
                        mainFunctions.addRecord();
                        break;
                    case 3:
                        mainFunctions.modifyRecord();
                        break;
                    case 4:
                        mainFunctions.deleteRecord();
                        break;
                    default:
                        throw new IllegalStateException("Illegal state!");
                }
                System.out.print("\nContinue? (y/n) ");
                yesNoAnswer = MainFunctions.reader.readLine();
            } while (yesNoAnswer.equals("y") || yesNoAnswer.equals("Y"));
        } catch (IOException e) {
            System.out.println("\nInput-output error!");
        }
    }
}
