package code.oops.assignment.ass_3;

import java.util.ArrayList;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("aditya");
        names.add("toto");
        names.add("husky");
        System.out.println("Name of the students " + names);

        // search student
        String search = "toto";
        if (names.contains(search)) {
            System.out.println(search + " is present in the list");
        }
        System.out.println(names);

        String remove = "husky";
        if (names.contains(remove)) {
            names.remove(remove);
            System.out.println(remove + " removed from the list");
        }
        System.out.println(names);
    }
}
