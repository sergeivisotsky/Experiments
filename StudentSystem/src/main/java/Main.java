import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader input =
                     new BufferedReader(
                             new InputStreamReader(System.in))) {
            TemplateInformation template = new TemplateInformation();
            System.out.println("Student info from .txt file");
            int answer;
            String yesNoAnswer;
            do {
                System.out.println();
                System.out.println("0: Create from template");
                System.out.println("1: Show data");
                System.out.println("2: Add data");
                System.out.println("3: Modify data");
                System.out.println("4: Delete data");
                System.out.print("\nChoose answer: ");
                answer = Integer.parseInt(input.readLine());
                switch (answer) {
                    case 0:
                        template.fileCreation();
                        System.out.println("Data was written!");
                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                        throw new IllegalStateException("Illegal state!");
                }
                System.out.println();
                System.out.print("\nContinue? (y/n) ");
                yesNoAnswer = input.readLine();
            } while (yesNoAnswer.equals("y") || yesNoAnswer.equals("Y"));
        } catch (IOException e) {
            System.out.println("Input output error!");
        }
    }
}
