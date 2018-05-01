package Functionality.core;

import Functionality.Student;

import java.io.*;
import java.net.Inet4Address;

public class Functionality {
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
                writer.printf("%-10s %-10s %-10s %-10s %-10s\n",
                        templateInformation.studentInfo.get(i).getName(),
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

    public void deleteRecord() {
        boolean stopChoice = false;
        try(PrintWriter printWriter =
                    new PrintWriter(templateInformation.file)) {
            while (!stopChoice) {
                System.out.print("Number of record you want to delete: ");
                int lineNumber = Integer.parseInt(reader.readLine());

                if (lineNumber <= 0 ||
                        lineNumber > templateInformation.studentInfo.size()) {
                    throw new IllegalStateException("Error!");
                } else {
                    templateInformation.studentInfo.remove(lineNumber - 1);
                    for (int i = 0; i < templateInformation.studentInfo.size(); i++) {
                        printWriter.printf("%-10s %-10s %-10s %-10s %-10s\n",
                                templateInformation.studentInfo.get(i).getName(),
                                templateInformation.studentInfo.get(i).getSurname(),
                                templateInformation.studentInfo.get(i).getAge(),
                                templateInformation.studentInfo.get(i).getStudentIndex(),
                                templateInformation.studentInfo.get(i).getGroupNumber());
                    }
                }
                stopChoice = true;
            }
            System.out.println("Record was deleted!");
        } catch (IOException e) {
            System.out.println("Input-output error!");
        }
    }

    public void modifyRecord() {
        boolean endOption = false;
        int option;
        System.out.println("What kind of data would you like to modify?");
        System.out.println("1: Name");
        System.out.println("2: Surname");
        System.out.println("3: Student index");
        System.out.println("4: Group number");
        System.out.println("0: Close modification mode");
        try {
            do {
                System.out.println();
                System.out.print("Option: ");
                option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        System.out.print("Old name: ");
                        String oldName = reader.readLine();

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 0:
                        endOption = true;
                        break;
                        default:
                            System.out.println("Option doesn't exist!");
                            break;
                }
            } while (!endOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
