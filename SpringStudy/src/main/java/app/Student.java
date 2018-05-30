package app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private String surname;
    private int age;
    private int groupNumber;
    private int studyYear;
    private String studyProgram;

    public Student(long id, String name, String surname,
                   int age, int groupNumber, int studyYear,
                   String studyProgram) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;
        this.studyYear = studyYear;
        this.studyProgram = studyProgram;
    }

    public long getId() {
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

    public int getStudyYear() {
        return studyYear;
    }

    public String getStudyProgram() {
        return studyProgram;
    }
}
