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
    private Student student;

    @Autowired
    public StudentServiceImpl(StudentDaoImpl studentDao,
                              Student student) {
        this.studentDao = studentDao;
        this.student = student;
    }

    @Override
    public void addRecord() {
        try {
            System.out.print("User id: ");
            long id = Long.parseLong(
                    Main.reader.readLine());

            System.out.print("Name: ");
            String name = textFormat(
                    Main.reader.readLine());

            System.out.print("Surname: ");
            String surname = textFormat(
                    Main.reader.readLine());

            System.out.print("Age: ");
            int age = Integer.parseInt(
                    Main.reader.readLine());

            System.out.print("Group number: ");
            int groupNumber = Integer.parseInt(
                    Main.reader.readLine());

            System.out.print("Study year: ");
            int studyYear = Integer.parseInt(
                    Main.reader.readLine());

            System.out.print("Study program: ");
            String studyProgram = textFormat(
                    Main.reader.readLine());

            studentDao.addRecord(new Student(id, name, surname,
                    age, groupNumber, studyYear, studyProgram));
        } catch (IOException e) {
            System.out.println("Input-output error");
        }
    }

    @Override
    public void retrieveData() {
        List<Student> students = studentDao.findAll();

        for (Student student : students)
            System.out.println(student);
    }

    @Override
    public void deleteRecord() {
        try {
            System.out.println("Deletion by id, name and surname");

            System.out.print("Id: ");
            long id = Long.parseLong(
                    Main.reader.readLine());

            System.out.print("Name: ");
            String name = textFormat(
                    Main.reader.readLine());

            System.out.print("Surname: ");
            String surname = textFormat(
                    Main.reader.readLine());

            studentDao.deleteRecord(id, name, surname);
        } catch (IOException e) {
            System.out.println("Input-output error");
        }
    }

    @Override
    public void modifyRecord() {
        try {
            System.out.print("User id: ");
            student = findStudent(Long.parseLong(
                    Main.reader.readLine()));

            int option;
            boolean closeMod = false;
            do {
                System.out.println("Parameter to modify: ");
                System.out.println("1: id (Do not work!!!)");
                System.out.println("2: name");
                System.out.println("3: surname");
                System.out.println("4: age");
                System.out.println("5: group number");
                System.out.println("6: study year");
                System.out.println("7: study program");
                System.out.println("0: Close modification mode");

                System.out.print("Answer: ");
                option = Integer.parseInt(
                        Main.reader.readLine());

                switch (option) {
                    case 1:
                        break;
                    case 2:
                        System.out.print("New name: ");
                        student.setName(
                                Main.reader.readLine());
                        break;
                    case 3:
                        System.out.print("New surname: ");
                        student.setSurname(
                                Main.reader.readLine());
                        break;
                    case 4:
                        System.out.print("New age: ");
                        student.setAge(Integer.parseInt(
                                Main.reader.readLine()));
                        break;
                    case 5:
                        System.out.print("New group number: ");
                        student.setGroupNumber(Integer.parseInt(
                                Main.reader.readLine()));
                        break;
                    case 6:
                        System.out.print("New study year: ");
                        student.setStudyYear(Integer.parseInt(
                                Main.reader.readLine()));
                        break;
                    case 7:
                        System.out.println("New study program: ");
                        student.setStudyProgram(
                                Main.reader.readLine());
                        break;
                    case 0:
                        closeMod = true;
                        break;
                }
            } while (!closeMod);

            studentDao.recordModification(student, student.getId());
        } catch (IOException e) {
            System.out.println("Input-output error");
        }
    }

    @Override
    public void findStudentWrapper() {
        try {
            System.out.print("Student id: ");
            Student student = findStudent(Long.parseLong(
                    Main.reader.readLine()));
            System.out.println(student.toString());
        } catch (IOException e) {
            System.out.println("Input-output error");
        }
    }

    @Override
    public Student findStudent(long id) {
        return studentDao.findById(id);
    }

    @Override
    public void orderByName() {
        List<Student> students = studentDao.orderByName();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private String textFormat(String text) {
        return text.substring(0, 1).toUpperCase() +
                text.substring(1).toLowerCase();
    }
}
