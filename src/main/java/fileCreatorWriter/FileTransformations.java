package fileCreatorWriter;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileTransformations {
    private final String PATH = "D:\\Users\\Sergei\\Documents\\JavaProjects\\" +
            "Experiments\\src\\main\\java\\fileCreatorWriter\\createdFiles\\";
    private final String FILE_NAME = "readable.txt";
    private File file = new File(PATH + FILE_NAME);
    
    private void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String output;
        while ((output = reader.readLine()) != null) {
            System.out.println(output);
        }
    }

    private void writeToFile(String line) throws IOException {
        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(PATH + FILE_NAME, true));
        out.write("\n" + line);
        out.close();
    }

    public static void main(String[] args) throws IOException {
        FileTransformations fileTransformations = new FileTransformations();
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = dateFormat.format(today);
        // Reading from file
        fileTransformations.readFile();
        // Entering to file
        System.out.print("\nEnter line to file: ");
        String lineToFile = reader.readLine();
        // Writing to file
        fileTransformations.writeToFile(lineToFile);
        fileTransformations.writeToFile(reportDate);
        System.out.println("Data was saved!");
        //Output file
        System.out.print("Read from file (y/n)?" + "\n" + "Answer: ");
        String yesNoAnswer = reader.readLine();
        if (yesNoAnswer.equals("y") || yesNoAnswer.equals("Y")) {
            fileTransformations.readFile();
        }
    }
}
