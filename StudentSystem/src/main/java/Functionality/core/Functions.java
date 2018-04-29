package Functionality.core;

import Functionality.Student;

import java.io.*;

public class Functions {
    private TemplateInformation templateText = new TemplateInformation();
    public static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    public void showData() {
        try (BufferedReader readerTwo =
                     new BufferedReader(
                             new FileReader(templateText.file))) {
            String data;
            while ((data = readerTwo.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Input-output error!");
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
