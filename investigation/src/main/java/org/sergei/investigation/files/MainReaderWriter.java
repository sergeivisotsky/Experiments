package org.sergei.investigation.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainReaderWriter {

    private static void readerFromFile() throws IOException {
        File file = new File("src/main/resources/files/");
        final String DIR = file.getAbsolutePath() + "Students.txt";
        BufferedReader reader =
                new BufferedReader(
                        new FileReader(DIR));
        ArrayList<Object> dataStorage = new ArrayList<>();

        String data;
        while ((data = reader.readLine()) != null) {
            System.out.println(data);
        }

        /*while (reader.readLine() != null) {
            dataStorage.add(str);
        }*/

        for (Object getData : dataStorage) {
            System.out.println(getData);
        }
    }

    public static void main(String[] args) throws IOException {
        readerFromFile();
    }
}
