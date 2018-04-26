package fileCreatorWriter;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileManager {
    private final String PATH = "D:/Users/Sergei/Documents/JavaProjects/" +
            "Experiments/src/main/java/fileCreatorWriter/createdFiles/";
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

    private void clearAll() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        System.out.println("Data was deleted!");
        writer.close();
    }

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = dateFormat.format(today);

        int answer;
        String yesNoAnswer;

        try (BufferedReader input =
                     new BufferedReader(
                             new InputStreamReader(System.in))) {
            System.out.println("File transformation");

            do {
                System.out.println("1: Show data");
                System.out.println("2: Add record");
                System.out.println("3: Clear all");
                System.out.print("\nAnswer: ");
                answer = Integer.parseInt(input.readLine());
                switch (answer) {
                    case 1:
                        fileManager.readFile();
                        break;
                    case 2:
                        System.out.print("\nEnter line to file: ");
                        String lineToFile = reader.readLine();
                        fileManager.writeToFile(lineToFile);
                        fileManager.writeToFile(reportDate);
                        System.out.println("Data was saved!");
                        break;
                    case 3:
                        fileManager.clearAll();
                        break;
                    default:
                        throw new IllegalStateException("Illegal value!");
                }
                System.out.print("\nContinue? (y/n) ");
                yesNoAnswer = input.readLine();
            } while (yesNoAnswer.equals("y") || yesNoAnswer.equals("Y"));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid data format!");
        }
    }
}
