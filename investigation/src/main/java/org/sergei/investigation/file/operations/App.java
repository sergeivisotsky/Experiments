package org.sergei.investigation.file.operations;

import java.io.*;

public class App {
    private void fileCreatorAndWriter() throws IOException {
        final String DIR =
                "D:\\Users\\Sergei\\Documents\\JavaProjects\\" +
                        "TestApp\\src\\fileCreatorWriter\\createdFiles";
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
