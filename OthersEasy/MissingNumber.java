package OthersEasy;

import java.util.HashSet;
import java.util.Set;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,4,5,3,2,7,0};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) numSet.add(num);

        for(int i = 0; i <= nums.length; i++) {
            if(!numSet.contains(i)) return i;
        }
        return -1;
    }

}