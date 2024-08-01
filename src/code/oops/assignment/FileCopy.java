package code.oops.assignment ;
import java.io.*;


public class FileCopy {
    public static void main(String[] args) {
        String inputFile = "inp.txt";
        String outputFile = "out.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}
