package app.db;

import app.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component("DbHandler")
public class DbDAO implements StudentDAO {

    private static class DbHandlerHolder {
        private static final DbDAO DB_DAO =
                new DbDAO();
    }

    public static DbDAO getDbHandler() {
        return DbHandlerHolder.DB_DAO;
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
    public void deleteRecord(int id, String name, String surname) {

    }
}
