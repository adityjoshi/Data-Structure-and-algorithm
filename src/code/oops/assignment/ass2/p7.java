package code.oops.assignment.ass2;

public class p7 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}

interface Swimming {
    void swim();
}
interface Flying {
    void fly();
}

class Duck  implements Swimming,Flying {
   public void swim() {
        System.out.println("duck can swim");
    }
    public void fly() {
        System.out.println("duck can fly");
    }
}

class Parrot implements Flying {
    public void fly() {
        System.out.println("parrot can fly");
    }
}