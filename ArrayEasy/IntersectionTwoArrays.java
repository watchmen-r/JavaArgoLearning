package ArrayEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionTwoArrays {
  public static void main(String[] args) {
    int[] num1 = {1,2,2,1};
    int[] num2 = {2,2};
    intersect(num1, num2);
  }

  static int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int num1Point = 0;
    int num2Point = 0;

    List<Integer> answer = new ArrayList<>();
    while(num1Point != nums1.length && num2Point != nums2.length) {
      if(nums1[num1Point] == nums2[num2Point]) {
        answer.add(nums1[num1Point]);
        num1Point++;
        num2Point++;
      } else if(nums1[num1Point] < nums2[num2Point]) {
        num1Point++;
      } else {
        num2Point++;
      }
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }
}