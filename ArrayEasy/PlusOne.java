package ArrayEasy;

import java.util.Arrays;

class PlusOne {
  public static void main(String[] args) {
      int digits[] = { 1, 1, 2 };
      plusone(digits);

  }

  // OK
  public static int[] plusone(int[] digits) {
    for(int i = digits.length-1; i >= 0; i--) {
      if(digits[i] != 9) {
        digits[i] += 1;
        for(int j = digits.length-1; j > i; j--) {
          digits[j] = 0;
        }
        return digits;
      }
    }
    int[] answer = new int[digits.length+1];
    Arrays.fill(answer, 0);
    answer[0] = 1;
    return answer;
  }
}