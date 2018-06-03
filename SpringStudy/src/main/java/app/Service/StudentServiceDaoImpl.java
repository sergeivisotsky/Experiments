package app.Service;

import app.db.dao.Student;
import app.db.dao.StudentDaoImpl;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class StudentServiceDaoImpl implements StudentServiceDao {
    private static class StudentServiceHolder {
        private static final StudentServiceDaoImpl STUDENT_SERVICE_DAO_IMPL =
                new StudentServiceDaoImpl();
    }

    public static StudentServiceDaoImpl getStudentServiceDaoImpl() {
        return StudentServiceHolder.STUDENT_SERVICE_DAO_IMPL;
    }

    @Override
    public void addRecord() {
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
            StudentDaoImpl.getDbDaoImpl().addRecord(new Student(id, name, surname,
                    age, groupNumber, studyYear, studyProgram));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayData() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void getRecordById() {

    }

    private String textFormat(String text) {
        return text.substring(0, 1).toUpperCase() +
                text.substring(1).toLowerCase();
    }
}
