package code.oops.assignment;

public class Poly {
    public static void main(String[] args) {

        Animals myAnimal;

        myAnimal = new Dogs();
        myAnimal.sound();

        myAnimal = new Cats();
        myAnimal.sound();
    }
}
// Base class
class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


class Cats extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


