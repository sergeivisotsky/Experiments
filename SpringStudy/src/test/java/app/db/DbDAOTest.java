package app.db;

import app.Student;
import org.junit.jupiter.api.Test;

class DbDAOTest {

    @Test
    void addRecordTest() {
        DbDAO.getDbDAO().addRecord(new Student(
                (long) 151616516, "Test_name", "Test_surname", 20,
                10, 1, "Computer science"));
    }
}