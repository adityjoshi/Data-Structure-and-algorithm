package code.oops.assignment.ass2;

public class p5 {
    public static void main(String[] args) {
    Shape sq = new square(2);
    sq.run();
    sq.display();
    }
}

interface Shape {
    int run() ;
    void display();
}


class square implements  Shape {
    private int length;

    public square(int length) {
        this.length = length;
    }
    @Override
    public int run() {
        return length*length;
    }
    public void display() {
        System.out.println(run());
    }
}
