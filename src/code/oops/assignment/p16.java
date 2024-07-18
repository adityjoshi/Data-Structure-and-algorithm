package code.oops.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the numbers write d to exit");

        while(in.hasNextInt()) {
            arr.add(in.nextInt());
        }
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        System.out.println(sum);
    }
}
