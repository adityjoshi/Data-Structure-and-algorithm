package code.oops.assignment;

public class p14 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        int add = x+y;
        int sub = x-y;
        float quotient = 0;
        int remainder = 0 ;
        if (y!=0) {
            quotient = (float)x/y;
        } else {
            System.out.println("invalid y");
        }
        if(y!=0) {
            remainder = x%y;
        } else {
            System.out.println("invalid");
        }

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
