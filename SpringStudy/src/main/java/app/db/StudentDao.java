package app.db;

import app.Service.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    void addRecord(Student student);

    List<Student> displayData();

    void deleteRecord(long id, String name, String surname);

    List<Student> getRecordByID(long id);
}