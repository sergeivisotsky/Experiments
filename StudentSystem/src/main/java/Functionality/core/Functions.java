package Functionality.core;

import Functionality.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Functions {
    private TemplateInformation templateText = new TemplateInformation();
    public static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    public void showData() {
        try (FileInputStream fileInputStream =
                     new FileInputStream(templateText.file)) {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(fileInputStream);
            Student result = (Student) objectInputStream.readObject();
            objectInputStream.close();
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
                    "Name", "Surname", "Age", "Student index", "Group number");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", result.getName(), result.getSurname(),
                    result.getAge(), result.getStudentIndex(), result.getGroupNumber());
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Input-output error!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
    }

    public void addRecord() {
        try(FileOutputStream fileOutputStream =
                    new FileOutputStream(templateText.file)) {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);
            System.out.print("Name: ");
            String name = reader.readLine();
            System.out.print("Surname: ");
            String surname = reader.readLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Student index: ");
            int studentIndex = Integer.parseInt(reader.readLine());
            System.out.print("Group number: ");
            int groupNumber = Integer.parseInt(reader.readLine());

            objectOutputStream.writeObject(new Student(name, surname, age,
                    studentIndex, groupNumber));
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Data was saved!");
        } catch (IOException e) {
            System.out.println("Input-output error!");
        }
    }
}
