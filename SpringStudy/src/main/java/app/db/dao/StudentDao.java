package app.db.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    void addRecord(Student student);

    StudentDaoImpl.Mapper displayData();

    void deleteRecord(long id, String name, String surname);

    List<Student> getRecordByID(long id);
}
