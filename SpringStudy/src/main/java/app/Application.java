package app;

import app.db.DbDAO;
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
            char yesNoAnswer;
            int option;
            do {
                System.out.println("1: Add record");
                System.out.println("2: Display record");
                System.out.println("3: Delete record");
                System.out.print("Option: ");
                option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        StudentService.getStudentService().addRecord();
                        break;
                    case 2:
                        DbDAO.getDbDAO().displayData();
                        break;
                    case 3:
                        StudentService.getStudentService().deleteRecord();
                        break;
                    default:
                        System.out.println("No such an option!");
                }

                System.out.print("Continue (y/n)? ");
                yesNoAnswer = (char) reader.read();
            } while (yesNoAnswer == 'y');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
