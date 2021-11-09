package ArrayEasy;

class SingleNumber {
  public static void main(String[] args) {
    int nums[] = {1,2,3,5,2,1,5};
    System.out.println(singleNumber(nums));
  }

  static int singleNumber(int[] nums) {
    int answer = 0;
    for(int num : nums) {
      answer ^=num;
      // System.out.println(answer);
    }
    return answer;
  }
}