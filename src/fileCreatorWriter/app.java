package fileCreatorWriter;

import java.io.*;
import java.util.Scanner;

public class app {

    private static final String dir = "D:\\Users\\Sergei\\Documents\\JavaProjects\\TestApp\\src\\fileCreatorWriter\\createdFiles";

    private static void fileCreatorAndWriter() throws IOException {
        File fileCreator = new File(dir, "newFile.txt");
        /*FileWriter fw = new FileWriter(fileCreator.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);*/
        FileReader fin = new FileReader(fileCreator);

        Scanner sc = new Scanner(fin);
//            System.out.print("Input file text: ");
        /*String writableText = sc.nextLine();
        sc.close();

        bw.write(writableText);

        System.out.println("File with text created!");*/
        String s;
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            System.out.println(s);
        }

        sc.close();
//        bw.close();
    }

    public static void main(String[] args) throws IOException {
        fileCreatorAndWriter();
    }
}
