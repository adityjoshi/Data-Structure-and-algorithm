package code.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr = {2,3,2,4,5,4,5};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
