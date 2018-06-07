package app.Service;

import app.db.dao.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentServicе {
    void addRecord();

    void retrieveData();

    void deleteRecord();

    void modifyRecord();

    void findStudentWrapper();

    Student findStudent(long id);

    void orderById();
}
