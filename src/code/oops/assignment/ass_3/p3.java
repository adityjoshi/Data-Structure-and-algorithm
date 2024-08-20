package code.oops.assignment.ass_3;

import java.io.*;


public class p3 {
    public static void main(String[] args) {
        String filePath = "source.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line ;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
