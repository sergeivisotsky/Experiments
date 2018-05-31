package app;

import app.db.DbHandler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ModFunc implements IFunctionalRepository {
    private static class ModFuncHolder {
        private static final ModFunc modFunc = new ModFunc();
    }

    public static ModFunc getModFunc() {
        return ModFuncHolder.modFunc;
    }

    @Override
    public void addRecord() {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("User id: ");
            long id = Long.parseLong(reader.readLine());
            System.out.print("Name: ");
            String name = textFormatter(reader.readLine());
            System.out.print("Surname: ");
            String surname = textFormatter(reader.readLine());
            System.out.print("Age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Group number: ");
            int groupNumber = Integer.parseInt(reader.readLine());
            System.out.print("Study year: ");
            int studyYear = Integer.parseInt(reader.readLine());
            System.out.print("Study program");
            String studyProgram = textFormatter(reader.readLine());
            Student student = new Student(id, name, surname,
                    age, groupNumber, studyYear, studyProgram);
            DbHandler.getDbHandler().addRecord(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayData() {

    }

    @Override
    public void deleteRecord(String name, String surname) {

    }

    private String textFormatter(String textToBeFormatted) {
        return textToBeFormatted.substring(0, 1).toUpperCase() +
                textToBeFormatted.substring(1).toLowerCase();
    }
}
