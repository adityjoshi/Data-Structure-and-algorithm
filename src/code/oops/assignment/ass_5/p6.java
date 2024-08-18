package code.oops.assignment.ass_5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p6 {
    public static void main(String[] args) {
        String inp = "source.txt";
        String out = "outputFile.txt";

        try (FileReader fileReader = new FileReader(inp);
             FileWriter fileWriter = new FileWriter(out)
        ) {
            int character;
            // Read characters from the input file and write them to the output file
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("error"+ e.getMessage());
        }
    }
}
