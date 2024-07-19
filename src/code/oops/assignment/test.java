package code.oops.assignment;

import java.util.Scanner;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();
        System.out.println("Enter the value of integer");

        while (in.hasNextInt()) {
            x.add(in.nextInt());
        }
        int sum = 0;
        for (int ans : x) {
            sum += ans;
        }
        System.out.println(sum);
    }
}
