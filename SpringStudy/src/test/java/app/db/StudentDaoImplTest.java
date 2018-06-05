package app.db;

import app.db.dao.Student;
import app.db.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:app.properties")
@RunWith(SpringJUnit4ClassRunner.class)
class StudentDaoImplTest {

    private StudentDao studentDao;

    @Test
    void addRecordTest() {
        studentDao.addRecord(new Student(123456, "Test_name", "Test_surname",
                23, 12, 1, "Testing"));
    }
}