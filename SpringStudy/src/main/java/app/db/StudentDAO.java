package app.db;

import app.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO {
    void addRecord(Student student);

    void displayData();

    void deleteRecord(String name, String surname);
}
