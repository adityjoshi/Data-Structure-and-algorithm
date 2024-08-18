package code.oops.assignment.ass_5;

import java.io.*;

public class p8 {
    public static void main(String[] args) {
        String inp = "source.txt";
        String out = "outputFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inp))) {
            String line ;
            while((line = reader.readLine())!=null) {
                System.out.println("read line => " + line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
            writer.write("hello word");
            writer.newLine();
            writer.write("billo tu agg hai");
            writer.newLine();
            System.out.println("data has been written" + out);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
