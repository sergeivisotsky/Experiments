package org.sergei.investigation.files;

import java.io.*;

public class App {
    private void fileCreatorAndWriter() throws IOException {
        final String DIR = "src/main/resources/files/";
        File fileCreator = new File(DIR, "newFile.txt");
        FileWriter fw = new FileWriter(fileCreator.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        String text = reader.readLine();
    }

    public static void main(String[] args) throws IOException {
        App fileOperations = new App();
        fileOperations.fileCreatorAndWriter();
    }
}
