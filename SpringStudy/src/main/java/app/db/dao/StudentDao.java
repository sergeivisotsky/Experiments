package app.db.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    void addRecord(Student student);

    void displayData();

    void deleteRecord(long id, String name, String surname);

    List<Student> findAll();

    List<Student> getRecordByID(long id);
}
