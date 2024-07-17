package code.oops.assignment;

public class p27 {
    public static void main(String[] args) {
    Animal parrot = new Parrot();
    parrot.eatFood();
    parrot.makeSound();
    }
}

abstract class Animal {
    void eatFood() {
        System.out.println("eat food");
    }
    abstract void makeSound();
}

class Parrot extends Animal {
    @Override
    void makeSound() {
        System.out.println("chir pir");
    }
}

class Husky extends Animal {
    void makeSound() {
        System.out.println("barking");
    }
}
