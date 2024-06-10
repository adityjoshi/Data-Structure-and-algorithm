package code.bitwise;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        int b = 1;
        if ((a&b) == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
