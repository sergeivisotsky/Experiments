package app;

import app.Service.StudentServicе;
import app.db.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
    private static class MainHolder {
        private static final Main main = new Main();
    }

    public static Main getMain() {
        return MainHolder.main;
    }

    private static final Logger logger = Logger.getLogger("Main.class");

    public static final BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        StudentServicе studentServicе = context.getBean(StudentServicе.class);

        try {
            String yesNoAnswer;
            int option;
            do {
                System.out.println("1: Display all records");
                System.out.println("2: Add record");
                System.out.println("3: Delete record");
                System.out.println("4: Modify record");
                System.out.println("5: Find record by ID");
                System.out.println("6: Order records by ID");
                System.out.print("Option: ");
                option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        studentServicе.retrieveData();
                        break;
                    case 2:
                        studentServicе.addRecord();
                        break;
                    case 3:
                        studentServicе.deleteRecord();
                        break;
                    case 4:
                        studentServicе.modifyRecord();
                        break;
                    case 5:
                        studentServicе.findStudentWrapper();
                        break;
                    case 6:
                        studentServicе.orderById();
                        break;
                    default:
                        System.out.println("No such an option!");
                }

                System.out.print("Continue (y/n)? ");
                yesNoAnswer = reader.readLine().toLowerCase();
            } while (yesNoAnswer.equals("y"));
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            logger.info("Input-output error");
        }
    }
}