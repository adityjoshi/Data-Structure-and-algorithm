package code.oops.assignment.ass2;

public class p2 {
    public static void main(String[] args) {
        add(2,3);
        add(2,3,4);
        Animal dog = new Dog();
        dog.sound();
    }
    static void add(int x, int y) {
        System.out.println(x+y);
    }
    static void add(int x ,int y, int z) {
        System.out.println(x+y+z);
    }
}
class Animal {
    void sound() {
        System.out.println("sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog barks");
    }
}