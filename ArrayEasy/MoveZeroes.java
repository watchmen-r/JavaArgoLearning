package ArrayEasy;

class MoveZeros {
  public static void main(String[] args) {
      int nums[] = { 1, 1, 2 };
      movezeroes(nums);

  }

  // OK
  public static void movezeroes(int[] nums) {
    int zeroSequence = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 0) {
        zeroSequence++;
      } else if(nums[i] != 0 && zeroSequence != 0){
        nums[i - zeroSequence] = nums[i];
        nums[i] = 0;
      }
    }
  }
}