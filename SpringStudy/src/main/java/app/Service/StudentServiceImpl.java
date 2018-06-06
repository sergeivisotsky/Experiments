package app.Service;

import app.Main;
import app.db.dao.Student;
import app.db.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentServicе {
    private StudentDaoImpl studentDao;

    @Autowired
    public StudentServiceImpl(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addRecord() {
        try {
            System.out.print("User id: ");
            long id = Long.parseLong(
                    Main.getMain().reader.readLine());

            System.out.print("Name: ");
            String name = textFormat(
                    Main.getMain().reader.readLine());

            System.out.print("Surname: ");
            String surname = textFormat(
                    Main.getMain().reader.readLine());

            System.out.print("Age: ");
            int age = Integer.parseInt(
                    Main.getMain().reader.readLine());

            System.out.print("Group number: ");
            int groupNumber = Integer.parseInt(
                    Main.getMain().reader.readLine());

            System.out.print("Study year: ");
            int studyYear = Integer.parseInt(
                    Main.getMain().reader.readLine());

            System.out.print("Study program: ");
            String studyProgram = textFormat(
                    Main.getMain().reader.readLine());

            studentDao.addRecord(new Student(id, name, surname,
                    age, groupNumber, studyYear, studyProgram));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void retrieveData() {
        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void deleteRecord() {
        try {
            System.out.println("Deletion by id, name and surname");

            System.out.print("Id: ");
            long id = Long.parseLong(
                    Main.getMain().reader.readLine());

            System.out.print("Name: ");
            String name = textFormat(
                    Main.getMain().reader.readLine());

            System.out.print("Surname: ");
            String surname = textFormat(
                    Main.getMain().reader.readLine());

            studentDao.deleteRecord(id, name, surname);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getRecordById() {
        try {
            System.out.print("Id: ");
            long id = Long.parseLong(
                    Main.getMain().reader.readLine());

            List<Student> students =
                    studentDao.getRecordByID(id);
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void orderById() {
        List<Student> students = studentDao.orderById();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private String textFormat(String text) {
        return text.substring(0, 1).toUpperCase() +
                text.substring(1).toLowerCase();
    }
}
