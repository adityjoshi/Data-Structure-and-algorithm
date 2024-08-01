package code.oops.assignment;

public class BaseClassMethodUsingSuper {
    public static void main(String[] args) {
        DerivedClasss obj = new DerivedClasss();
        obj.display();
    }
}

class BaseClasss {
    void display() {
        System.out.println("Base class method called");
    }
}


class DerivedClasss extends BaseClasss {
    @Override
    void display() {
        // Call base class method
        super.display();
        System.out.println("Derived class method called");
    }
}
