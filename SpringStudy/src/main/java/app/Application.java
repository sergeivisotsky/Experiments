package app;

import app.Service.StudentServiceDaoImpl;
import app.db.DbDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            String yesNoAnswer;
            int option;
            do {
                System.out.println("1: Add record");
                System.out.println("2: Display record");
                System.out.println("3: Delete record");
                System.out.print("Option: ");
                option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        StudentServiceDaoImpl.getStudentServiceDaoImpl().addRecord();
                        break;
                    case 2:
                        DbDaoImpl.getDbDaoImpl().displayData();
                        break;
                    case 3:
                        StudentServiceDaoImpl.getStudentServiceDaoImpl().deleteRecord();
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
