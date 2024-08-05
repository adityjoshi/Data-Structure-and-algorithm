package code.oops.assignment;
import java.util.*;
public class arraList {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("apple");
        arrList.add("banana");
        arrList.add("orange");

        System.out.println("array list contains : " + arrList);

        arrList.set(1,"grapes");
        System.out.println(arrList);
        arrList.remove(0);
        System.out.println("after removal " + arrList);
    }
}
