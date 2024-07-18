package code.oops.assignment;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = 0 ;
        while (x>0) {
            sum += x;
            x = in.nextInt();
        }
        System.out.println(sum);
    }
}
