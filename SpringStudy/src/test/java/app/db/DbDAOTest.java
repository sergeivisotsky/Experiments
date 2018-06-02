package app.db;

import app.Service.Student;
import org.junit.jupiter.api.Test;

class DbDAOTest {

    /*private EmbeddedDatabase db;

    @Before
    public void setUp() {
        db = new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .addDefaultScripts()
                .build();
    }

    @Test
    void addRecordTest() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(db);
        jdbcTemplate.update("SELECT id FROM student_data WHERE id = 123564");
    }

    @After
    public void tearDown() {
        db.shutdown();
    }*/

    @Test
    void addRecordTest() {
        DbDaoImpl.getDbDaoImpl().addRecord(new Student(
                151616516, "Test_name", "Test_surname", 20,
                10, 1, "Computer science"));
    }
}