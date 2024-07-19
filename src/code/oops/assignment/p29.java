package code.oops.assignment;

public class p29 {
    static class nested {
        void dum() {
            System.out.println("hey");
        }
    }
    class Inner {
        void in() {
            System.out.println("inner");
        }
    }
    public static void main(String[] args) {
    nested ne = new nested();
    ne.dum();
    p29 outer = new p29();
    Inner ix = outer.new Inner();
    ix.in();

    }
}

