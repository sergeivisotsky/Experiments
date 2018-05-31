package app.db;

import app.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    void addRecord(Student student);

    List<Student> displayData();

    void deleteRecord(int id, String name, String surname);
}
