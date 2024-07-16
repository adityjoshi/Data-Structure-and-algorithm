package code.oops.assignment;

public class p22 {
    public static void main(String[] args) {
    animal so = new animal();
    so.sound();
    add(2,3);
    }
    static void add(int x, int y) {
        System.out.println(x+y);
    }
    static void add(int x, int y, int z) {
        System.out.println(x+y+z);
    }
}
class Dog {
    void sound () {
        System.out.println("dog barks");
    }
}
class animal extends Dog {
    @Override
    void sound() {
        System.out.println("dog makes sound");
    }
}
