package code.oops;

public class SingleInheritance {
    public static void main(String[] args) {
        Executive obj = new Executive();
        System.out.println("salary credited " + obj.salary);
        System.out.println("Bonus of six month " + obj.bonus);

    }
}

class Employ {
    float salary = 34534*12f;
}
class Executive extends Employ {
    float bonus = 300 * 6;
}
