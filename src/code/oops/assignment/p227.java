package code.oops.assignment;

public class p227 {
    public static void main(String[] args) {
    Fly cat = new Cat();
    cat.Fly();

    Duck duck = new Duck();
    duck.Fly();
    duck.Swim();
    }
}

interface Fly {
    void Fly();
}

interface Swim {
    void Swim();
}

class Duck implements Fly,Swim {
    @Override
    public void Fly() {
        System.out.println("duck can fly");
    }
    public void Swim() {
        System.out.println("duck can swim too!");
    }
}

class Cat implements Fly {
    public void Fly() {
        System.out.println("meow fly");
    }
}