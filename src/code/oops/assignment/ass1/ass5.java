package code.oops.assignment.ass1;

import java.util.Scanner;

public class ass5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter num ");
        int n1 = in.nextInt();
        System.out.println("enter num");
        int n2 = in.nextInt();
        System.out.println("enter the case");
        char x = in.next().charAt(0);
        int result = 0 ;
        switch (x) {
            case '+' :
                result = n1+n2;
                System.out.println(result);
                break;
            case '-' :
                result = n1 - n2;
                System.out.println(result);
                break;
            case '*' :
                result = n1 * n2;
                System.out.println(result);
                break;
            case '/' :
                result = n1 / n2;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
