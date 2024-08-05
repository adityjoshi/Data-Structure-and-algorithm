package code.oops.assignment;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFramework {
    public static void main(String[] args) {
//        Collection<String> collections = new ArrayList<String>();
//        collections.add("apple");
//        collections.add("banana");
//        collections.add("cherry");
//
//        System.out.println("collection " + collections);
//        System.out.println("collection size " + collections.size());
//        System.out.println("is empty " + collections.isEmpty());
//
//        collections.remove("banana");
//        System.out.println("after removal " + collections);

        List<String> collections = new ArrayList<String>();
        collections.add("apple");
        collections.add("banana");
        collections.add("cherry");

        System.out.println("collection " + collections);
        System.out.println("collection size " + collections.size());
        System.out.println("is empty " + collections.isEmpty());

        collections.remove("banana");
        System.out.println("after removal " + collections);


    }
}
