package app.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component("studentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    private static class DbDaoImplHolder {
        private static final StudentDaoImpl DB_DAO_IMPL =
                new StudentDaoImpl();
    }

    public static StudentDaoImpl getDbDaoImpl() {
        return DbDaoImplHolder.DB_DAO_IMPL;
    }

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addRecord(Student student) {
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
