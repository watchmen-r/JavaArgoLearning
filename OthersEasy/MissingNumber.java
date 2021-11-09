package OthersEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,4,5,3,2,7,0};
        System.out.println(missingNumber(nums));
    }

    // OK
    static int missingNumber(int[] nums) {
        int numLenght = nums.length;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        int answer = 0;
        for(int i = 0; i <= numLenght; i++) {
            if(!list.contains(i)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}