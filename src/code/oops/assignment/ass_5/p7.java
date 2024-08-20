package code.oops.assignment.ass_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p7 {
//    public static void main(String[] args) {
//        List<Integer> arrayList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 1_000_000; i++) {
//            arrayList.add(i);
//            linkedList.add(i);
//        }
//
//        long startTime = System.nanoTime();
//        arrayList.get(500_000);
//        long endTime = System.nanoTime();
//        System.out.println("arr time " + (endTime-startTime));
//
//        long startTimes = System.nanoTime();
//        linkedList.get(500_000);
//        long endTimes = System.nanoTime();
//        System.out.println("linked time " + (endTimes-startTimes));
//    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            arr.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        arr.get(500_000);
        long end = System.nanoTime();
        System.out.println("arr -> " + (end-start));

        long start2 = System.nanoTime();
        linkedList.get(500_000);
        long end2 = System.nanoTime();
        System.out.println("linked -> " + (end2-start2));
    }
}
