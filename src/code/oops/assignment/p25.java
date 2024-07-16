package code.oops.assignment;

public class p25 {
    public static void main(String[] args) {
    Shape shape1 = new Circle(2);
    Shape shape2 = new Rectangle(2,3);
        shape1.display();
    }
}
 interface Shape {
    double calculateArea();
    void display();
}

class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }
    @Override
    public double calculateArea() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void display() {
        System.out.println("The area of circle is " + calculateArea());
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public void display() {
        System.out.println("area of rectangle " + calculateArea() );
    }
}