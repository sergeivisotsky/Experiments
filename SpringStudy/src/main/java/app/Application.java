package app;

import app.Service.StudentServiceDaoImpl;
import app.db.dao.StudentDaoImpl;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
public class Application {
    void run() {
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
                        StudentServiceDaoImpl
                                .getStudentServiceDaoImpl()
                                .addRecord();
                        break;
                    case 2:
                        StudentDaoImpl
                                .getDbDaoImpl()
                                .displayData();
                        break;
                    case 3:
                        StudentServiceDaoImpl
                                .getStudentServiceDaoImpl()
                                .deleteRecord();
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
