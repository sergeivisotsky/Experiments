package Functionality.core;

import Functionality.Student;

import java.io.*;

public class Functions {
    private TemplateInformation templateInformation =
            new TemplateInformation();
    public static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public void showData() {
        try (BufferedReader readerTwo =
                     new BufferedReader(
                             new FileReader(templateInformation.file))) {
            String line;
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
                    "Name", "Surname", "Age", "Student index", "Group number");
            while ((line = readerTwo.readLine()) != null) {

                /*System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
                        result.getName(), result.getSurname(),
                        result.getAge(), result.getStudentIndex(),
                        result.getGroupNumber());*/
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Input-output error!");
        }
    }

    public void addRecord() {
        try (PrintWriter writer =
                     new PrintWriter(
                             new FileWriter(templateInformation.file))) {
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

            templateInformation.studentInfo.add(new Student(name, surname, age,
                    studentIndex, groupNumber));
            for (int i = 0; i < templateInformation.studentInfo.size(); i++) {
                writer.printf("%-10s %-10s %-10s %-10s %-10s\n", templateInformation.studentInfo.get(i).getName(),
                        templateInformation.studentInfo.get(i).getSurname(),
                        templateInformation.studentInfo.get(i).getAge(),
                        templateInformation.studentInfo.get(i).getStudentIndex(),
                        templateInformation.studentInfo.get(i).getGroupNumber());
            }
            System.out.println("Data was saved!");
        } catch (IOException e) {
            System.out.println("Input-output error!");
        }
    }
}
