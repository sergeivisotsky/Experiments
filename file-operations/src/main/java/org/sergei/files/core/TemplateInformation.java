package org.sergei.files.core;

import org.sergei.files.Constants;
import org.sergei.files.Student;

import java.io.*;
import java.util.ArrayList;

public class TemplateInformation {
    ArrayList<Student> studentInfo = new ArrayList<>();
    File file = new File(Constants.FILE_DIR + Constants.FILE_NAME);

    public void fileCreation() throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        studentInfo.add(new Student("Andrey", "Ivashin", 20, 1710543, 12));
        studentInfo.add(new Student("Janis", "Miller", 23, 1710545, 14));
        studentInfo.add(new Student("Yulia", "Bogdanova", 25, 171051235, 16));
        studentInfo.add(new Student("Artur", "Kuzmik", 26, 1710523153, 17));
        studentInfo.add(new Student("Darya", "Lebedeva", 19, 1710512543, 9));
        studentInfo.add(new Student("Anastasia", "Chaplinskaya", 21, 1712310543, 7));
        studentInfo.add(new Student("John", "Smith", 22, 1710512343, 4));
        studentInfo.add(new Student("Andrey", "Lazarev", 35, 1710541233, 1));
        for (Student stud : studentInfo) {
            String string = stud.toString();
            fileWriter.write(string);
        }
        fileWriter.close();
    }
}
