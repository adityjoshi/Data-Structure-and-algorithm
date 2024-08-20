package code.oops.assignment.ass1;

import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        System.out.println("enter num 1");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("enter num 2");
        int num2 = in.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = 0 ;
        if (num2 != 0) {
             div = (double) num1/num2;
        } else {
            System.out.println("div not allowed");
        }
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
