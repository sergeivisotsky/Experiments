package app;

import app.Service.StudentServicе;
import app.db.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        StudentServicе studentServicе = context.getBean(StudentServicе.class);
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            String yesNoAnswer;
            int option;
            do {
                System.out.println("1: Add record");
                System.out.println("2: Display all records");
                System.out.println("3: Delete record");
                System.out.print("Option: ");
                option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        studentServicе.addRecord();
                        break;
                    case 2:
//                        studentServicе.displayData();
                        break;
                    case 3:
                        studentServicе.deleteRecord();
                        break;
                    default:
                        System.out.println("No such an option!");
                }

                System.out.print("Continue (y/n)? ");
                yesNoAnswer = reader.readLine().toLowerCase();
            } while (yesNoAnswer.equals("y"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}