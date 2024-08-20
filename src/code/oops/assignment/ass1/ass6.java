package code.oops.assignment.ass1;

import java.util.ArrayList;
import java.util.Scanner;

public class ass6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter int");

        while (in.hasNextInt()) {
            int num = in.nextInt();
            arr.add(num);
        }
        int sum = 0 ;
        for (int nums : arr) {
            sum +=nums;
        }
        System.out.println(sum);
    }
}
