package app.Service;

import app.db.dao.Student;
import app.db.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service("StudentService")
public class StudentServiceImpl implements StudentServicе {
    private StudentDaoImpl studentDao;

    @Autowired
    public StudentServiceImpl(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
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
            studentDao.addRecord(new Student(id, name, surname,
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
