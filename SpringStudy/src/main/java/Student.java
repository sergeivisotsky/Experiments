import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String surname;
    private int age;
    private int groupNumber;
    private String studyProgram;

    public Student(int id, String name, String surname, int age, int groupNumber, String studyProgram) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;
        this.studyProgram = studyProgram;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getStudyProgram() {
        return studyProgram;
    }
}
