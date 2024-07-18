package code.oops.assignment;

import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first num");
        int x = in.nextInt();
        System.out.println("Enter Second Num");
        int y = in.nextInt();
        System.out.println("Choose operation");
        char operator = in.next().charAt(0);
        int result=0;
        switch (operator){
            case '+':
                result = x+y;
                break;
            case '-':
                result=x-y;
                break;
            case '*':
                result=x*y;
                break;
            case '/':
                result=x/y;
                break;
            default: System.out.println("Error: Invalid operator.");
        }
        System.out.println(result);
    }
}
