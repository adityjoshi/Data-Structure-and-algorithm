package code.DS.Hashmaps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String> emp = new HashMap<>();
        emp.put(1,"adi");
        emp.put(2,"nisarg");
        emp.put(3,"pandey");

        System.out.println(emp);
        System.out.println(emp.get(2));
        System.out.println(emp.containsKey(2));
        System.out.println(emp.putIfAbsent(4,"java"));
        System.out.println(emp);
    }
}
