package code.oops.assignment.ass_3;

public class p8 {
    public static void main(String[] args) {
        Candy jar = new Candy();
        Thread kid = new Thread(new Kid(jar,5 , "adi"));
        Thread kid2 = new Thread(new Kid(jar,3 , "adii"));
        Thread kid3 = new Thread(new Kid(jar,11 , "adiii"));
        kid.start();
        kid2.start();
        kid3.start();
    }
}

class Kid implements Runnable {
    private Candy jar;
    private int amount;
    private String name;

    public Kid(Candy jar, int amount, String name) {
    this.jar = jar ;
    this.amount = amount;
    this.name = name;
    }

    @Override
    public void run() {
        jar.takeCandies(amount,name);
    }
}

class Candy {
    private int candy = 10 ;

    public void takeCandies(int amount, String name) {
        if (candy >= amount) {
            System.out.println(name + " is taking " + amount + " candies.");
            candy -= amount;
        } else {
            System.out.println("can't take");
        }
    }
}
