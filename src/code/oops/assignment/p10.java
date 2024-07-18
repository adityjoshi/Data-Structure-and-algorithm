package code.oops.assignment;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        if(isPrime(number)) {
            System.out.println("It is prime");
        } else {
            System.out.println("it is not prime");
        }
    }
    static boolean isPrime(int number) {
        if (number <=1) {
            return false;
        }
        int i = 2;
        while(i<=Math.sqrt(number)) {
            if(number%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
