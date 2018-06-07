package app.db.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    void addRecord(Student student);

    void deleteRecord(long id, String name, String surname);

    void recordModification(Student student, long id);

    Student findById(long id);

    List<Student> orderByName();

    List<Student> findAll();
}
