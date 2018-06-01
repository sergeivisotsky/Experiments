package app.db;

import app.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    void addRecord(Student student);

    List<Student> displayData();

    void deleteRecord(Long id, String name, String surname);
}
