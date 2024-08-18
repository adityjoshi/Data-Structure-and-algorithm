package code.oops.assignment.ass_5;

import java.io.*;
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter data");
        String file = in.nextLine();

        File outputFile = new File(file);

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            System.out.println("enter the data and exit to stop");
            String input = in.nextLine();
            while(!false) {
                if("exit".equalsIgnoreCase(input));
                break;
            }
            writer.println(input);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            in.close();
        }

    }
}
