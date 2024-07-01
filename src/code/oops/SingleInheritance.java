package code.oops;

public class SingleInheritance {
    public static void main(String[] args) {
        Executive obj = new Executive();
        System.out.println("salary credited " + obj.salary);
        System.out.println("Bonus of six month " + obj.bonus);
        B obj2 = new B();
        obj2.a = 10;
        obj2.b=20;
        obj2.c=30;
        obj2.display();
        obj2.show();
    }
}

class Employ {
    float salary = 34534*12f;
}
class Executive extends Employ {
    float bonus = 300 * 6;
}

class A {
    int a,b;
    void display() {
        System.out.println("Inside class A values = "+a+" "+b);
    }
}

class B extends A {
    int c;
    void show() {
        System.out.println("Inside B="+a+" "+b+" "+c);
    }
}