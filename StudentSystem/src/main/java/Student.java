public class Student {
    private String name;
    private String surname;
    private int age;
    private int studentIndex;
    private int groupNumber;

    public Student(String name, String surname, int age, int studentIndex, int groupNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentIndex = studentIndex;
        this.groupNumber = groupNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(int studentIndex) {
        this.studentIndex = studentIndex;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
