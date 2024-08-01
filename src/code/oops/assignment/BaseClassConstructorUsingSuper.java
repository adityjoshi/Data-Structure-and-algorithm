package code.oops.assignment;

public class BaseClassConstructorUsingSuper {
    public static void main(String[] args) {
        DerivedClass object = new DerivedClass();
    }
}
class BaseClass {
    BaseClass() {
        System.out.println("Base class called");
    }
}


class DerivedClass extends BaseClass {
    DerivedClass() {
        super();
        System.out.println("Derived class called");
    }
}