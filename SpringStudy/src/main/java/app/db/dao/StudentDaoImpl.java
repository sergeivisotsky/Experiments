package app.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("StudentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addRecord(Student student) {
        jdbcTemplate.update("INSERT INTO student_data(id, name, surname, age, group_number, " +
                        "study_year, study_program) VALUES (?, ?, ?, ?, ?, ?, ?)", student.getId(),
                student.getName(), student.getSurname(), student.getAge(),
                student.getGroupNumber(), student.getStudyYear(), student.getStudyProgram());
        System.out.println("Data was saved!");
    }

    @Override
    public void displayData() {
        List studentList = jdbcTemplate.query("SELECT id, name, surname, age, group_number, " +
                "study_year, study_program FROM student_data", new StudentRowMapper());
        System.out.println(studentList);
    }

    @Override
    public void deleteRecord(long id, String name, String surname) {
        jdbcTemplate.update("DELETE FROM student_data WHERE id" + " = ? " +
                "AND name" + " = ? " + "AND surname" + " = ?", id, name, surname);
        System.out.println("Record was deleted!");
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student_data ORDER BY id AND name",
                new StudentRowMapper());
    }

    @Override
    public List<Student> getRecordByID(long id) {
        return null;
    }

    private final class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setSurname(rs.getString("surname"));
            student.setAge(rs.getInt("age"));
            student.setGroupNumber(rs.getInt("group_number"));
            student.setStudyYear(rs.getInt("study_year"));
            student.setStudyProgram(rs.getString("study_program"));
            return student;
        }
    }
}
