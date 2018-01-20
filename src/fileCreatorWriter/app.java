package fileCreatorWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class app {

    private static final String dir = "D:\\Users\\Sergei\\Documents\\JavaProjects\\TestApp\\src\\fileCreatorWriter\\createdFiles";
    private static String writableText;


    private static void fileCreatorAndWriter() throws IOException {
        File fileCreator = new File(dir, "newFile.txt");
        FileWriter fw = new FileWriter(fileCreator.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);
            System.out.print("Input file text: ");
            writableText = sc.nextLine();
        sc.close();

        bw.write(writableText);

        System.out.println("File with text created!");
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        fileCreatorAndWriter();
    }


}
