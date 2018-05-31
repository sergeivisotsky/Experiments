package app;

import app.db.DbDAO;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class StudentService {
    private static class StudentServiceHolder {
        private static final StudentService STUDENT_SERVICE =
                new StudentService();
    }

    static StudentService getStudentService() {
        return StudentServiceHolder.STUDENT_SERVICE;
    }

    void addRecord() {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("User id: ");
            long id = Long.parseLong(reader.readLine());
            System.out.print("Name: ");
            String name = textFormat(reader.readLine());
            System.out.print("Surname: ");
            String surname = textFormat(reader.readLine());
            System.out.print("Age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Group number: ");
            int groupNumber = Integer.parseInt(reader.readLine());
            System.out.print("Study year: ");
            int studyYear = Integer.parseInt(reader.readLine());
            System.out.print("Study program: ");
            String studyProgram = textFormat(reader.readLine());
            Student student = new Student(id, name, surname,
                    age, groupNumber, studyYear, studyProgram);
            DbDAO.getDbHandler().addRecord(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void displayData() {

    }

    void deleteRecord() {

    }

    private String textFormat(String text) {
        return text.substring(0, 1).toUpperCase() +
                text.substring(1).toLowerCase();
    }
}
