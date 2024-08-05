package code.oops.assignment;

import java.util.Vector;

public class javaVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.addElement("apple");
        vector.addElement("banana");
        vector.addElement("cherry");

        System.out.println("vector " + vector);

        vector.addElement("grapes");
        System.out.println(vector);

        vector.removeElement("banana");
        System.out.println(vector);
    }
}
