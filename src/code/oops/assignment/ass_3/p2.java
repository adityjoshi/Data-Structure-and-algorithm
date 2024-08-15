package code.oops.assignment.ass_3;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        linearArr();
        twoArray();
        jageedArray();
    }
    static void linearArr() {
        int [] arr = {4,3,1,2,5};
        System.out.println("Second element in arr :" + arr[1]);
        arr[1] = 6;
        System.out.println("replace second element :" + Arrays.toString(arr) );
        for (int numbers : arr) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }
    static void twoArray() {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void jageedArray() {
        int [][] arr = new int[3][];
        arr[0] = new int[] {1,2};
        arr[1] = new int[] {1,2,3};
        arr[2] = new int[] {1,2,3,4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
