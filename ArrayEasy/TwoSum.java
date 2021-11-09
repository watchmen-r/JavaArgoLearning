package ArrayEasy;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int target = 3;
    twoSum(nums, target);
    twoSumAnother(nums, target);
  }

  // 有名問題、anotherがわからなかったので解き直す
  static int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++) {
      for(int j = i + 1; j < nums.length; j++) {
        if((nums[i] + nums[j]) == target) {
          int[] answer = {i, j};
          return answer;
        }
      }
    }
    return null;
  }

  static int[] twoSumAnother(int[] nums, int target) {
    int[] answer = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++) {
      if(map.containsKey(target - nums[i])) {
        answer[1] = i;
        answer[0] = map.get(target - nums[i]);
        return answer;
      }
      map.put(nums[i], i);
    }
    return answer;
  }
}