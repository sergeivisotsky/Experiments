package app.db;

import app.Service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component("dbDaoImpl")
public class DbDaoImpl implements StudentDao {

    private static class DbDaoImplHolder {
        private static final DbDaoImpl DB_DAO_IMPL =
                new DbDaoImpl();
    }

    public static DbDaoImpl getDbDaoImpl() {
        return DbDaoImplHolder.DB_DAO_IMPL;
    }

    private JdbcTemplate jdbcTemplate;
//    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /*@Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    @Override
    public void addRecord(Student student) {
//        JdbcTemplate insert = new JdbcTemplate(dataSource);
        jdbcTemplate.update("INSERT INTO student_data(id, name, surname, age, group_number, " +
                        "study_year, study_program) VALUES (?, ?, ?, ?, ?, ?, ?)", student.getId(),
                student.getName(), student.getSurname(), student.getAge(),
                student.getGroupNumber(), student.getStudyYear(), student.getStudyProgram());
    }

    @Override
    public List<Student> displayData() {
        return null;
    }


    @Override
    public void deleteRecord(long id, String name, String surname) {

    }

    @Override
    public List<Student> getRecordByID(long id) {
        return null;
    }
}
