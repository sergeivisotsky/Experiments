package app.db.dao;

import java.util.List;

public interface StudentDao {
    void addRecord(Student student);

    void removeRecord(long studId);

    Student findById();

    List<Student> findAll();
}
