package ArrayEasy;

import java.util.HashSet;
import java.util.Set;

class ContainDuplicate {
  public static void main(String[] args) {
    int nums[] = {1,2,3,4};
    System.out.println(containsDupulicate(nums));
  }

  static boolean containsDupulicate(int[] nums) {
    Set<Integer> numSet = new HashSet<Integer>();
    for(int n : nums) {
      if(numSet.contains(n)) {
        return true;
      }
      numSet.add(n);
    }
    return false;
  }
}