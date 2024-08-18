package code.oops.assignment.ass_3;

public class p1 {
    public static void main(String[] args) {
        System.out.println(divide(2,0));
        System.out.println(divide(0,0));
    }
    static Integer divide(int n, int d) {
        try {
            return n/d;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return null;
    }
}
