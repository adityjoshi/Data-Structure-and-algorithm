package code.DS.NC.AandH;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        hasDuplicate(arr);
    }
    static boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int i = 0 ; i <nums.length; i++) {
            if(unique.contains(nums[i])){
                return true ;
            }
            unique.add(nums[i]);
        }
        return false ;

    }
}
