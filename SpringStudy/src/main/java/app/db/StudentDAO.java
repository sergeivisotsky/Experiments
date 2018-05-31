package app.db;

import app.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO {
    void addRecord(Student student);

    void displayData();

    void deleteRecord(int id, String name, String surname);
}
