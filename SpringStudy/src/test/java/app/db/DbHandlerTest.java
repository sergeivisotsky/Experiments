package app.db;

import app.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

class DbHandlerTest {

    @Test
    void addRecordTest() {
        ApplicationContext context = new GenericApplicationContext();
        ((GenericApplicationContext) context).refresh();
        StudentDAO StudentDAO = context.getBean("StudentDAO", StudentDAO.class);
        StudentDAO.addRecord(new Student(
                123456, "Test_name", "Test_surname", 20,
                10, 1, "Computer science"));
    }

}