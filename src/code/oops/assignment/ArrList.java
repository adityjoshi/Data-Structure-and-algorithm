package code.oops.assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> collections = new ArrayList<String>();
        collections.add("apple");
        collections.add("banana");
        collections.add("cherry");

        System.out.println("list " + collections);
        collections.add(1,"watermelon");
        System.out.println(collections);
        System.out.println(collections.get(3));
        collections.remove(2);
        System.out.println(collections);

    }
}
