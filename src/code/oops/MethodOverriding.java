package code.oops;

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.engine();
        Vehicle honda = new Bike();
        honda.engine();
    }
}

class Vehicle {
    void engine() {
        System.out.println("this is vehicle");
    }
}
class Bike extends Vehicle {
    @Override
    void engine() {
        System.out.println("this is bike");

    }
}
class Car extends Vehicle {
    void engine() {
        System.out.println("this is car");
    }
}
