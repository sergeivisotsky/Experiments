package app.db;

import app.Service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DbDaoImpl implements StudentDao {

    private static class DbDaoImplHolder {
        private static final DbDaoImpl DB_DAO_IMPL =
                new DbDaoImpl();
    }

    public static DbDaoImpl getDbDaoImpl() {
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
