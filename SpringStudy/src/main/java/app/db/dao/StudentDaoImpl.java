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
    public void deleteRecord(long id, String name, String surname) {
        jdbcTemplate.update("DELETE FROM student_data WHERE id" + " = ? " +
                "AND name" + " = ? " + "AND surname" + " = ?", id, name, surname);
        System.out.println("Record was deleted!");
    }

    @Override
    public void recordModification(Student student, long id) {
        jdbcTemplate.update("REPLACE INTO student_data(id, name, surname, age, " +
                        "group_number, study_year, study_program) VALUES (?, ?, ?, ?, ?, ?, ?)",
                id, student.getName(), student.getSurname(),
                student.getAge(), student.getGroupNumber(), student.getStudyYear(),
                student.getStudyProgram());
        System.out.println("Record was updated!");
    }

    @Override
    public Student findById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM student_data WHERE id = ?",
                new StudentRowMapper(), id);
    }

    @Override
    public List<Student> orderById() {
        System.out.println("Data was ordered!");
        return jdbcTemplate.query("SELECT * FROM student_data ORDER BY id ASC ",
                new StudentRowMapper());
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student_data", new StudentRowMapper());
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
