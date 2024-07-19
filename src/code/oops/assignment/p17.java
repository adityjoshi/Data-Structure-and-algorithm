package code.oops.assignment;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        int sum = 0;
        while(x>=0) {
            sum +=x ;
            x = in.nextInt();
        }
        in.close();
        System.out.println(sum);
    }
}
