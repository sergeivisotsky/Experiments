package app.db;

import app.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component("DbHandler")
public class DbHandler implements StudentDAO {

    private static class DbHandlerHolder {
        private static final DbHandler dbHandler =
                new DbHandler();
    }

    public static DbHandler getDbHandler() {
        return DbHandlerHolder.dbHandler;
    }

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addRecord(Student student) {
        jdbcTemplate.update(
                "INSERT INTO student_data(" +
                        "id, name, surname, age, group_number, study_year, study_program) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)", student.getId(), student.getName(), student.getSurname(),
                student.getAge(), student.getGroupNumber(), student.getStudyYear(), student.getStudyProgram());
    }

    @Override
    public void displayData() {

    }

    @Override
    public void deleteRecord(String name, String surname) {

    }
}
