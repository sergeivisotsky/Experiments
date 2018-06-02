package app.db;

import app.Service.Student;
import org.junit.jupiter.api.Test;

class DbDAOTest {

    @Test
    void addRecordTest() {
        DbDaoImpl.getDbDaoImpl().addRecord(new Student(
                151616516, "Test_name", "Test_surname", 20,
                10, 1, "Computer science"));
    }
}