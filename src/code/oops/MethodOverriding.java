package code.oops;

public class MethodOverriding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.engine();
        Car car = new Car();
        car.engine();
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
