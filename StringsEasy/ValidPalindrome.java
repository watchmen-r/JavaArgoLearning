package StringsEasy;

class ValidPalindrome {
  public static void main(String[] args) {
    String s = "0P";
    System.out.println(isPalindrome(s));
  }

  // TODO 解きなおし
  static boolean isPalindrome(String s) {
    int head = 0;
    int tail = s.length()-1;
    char cHead, cTail;

    while(head <= tail) {
      cHead = s.charAt(head);
      cTail = s.charAt(tail);
      if(!Character.isLetterOrDigit(cHead)) {
        head++;
      } else if(!Character.isLetterOrDigit(cTail)) {
        tail--;
      } else {
        if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
          return false;
        }
        head++;
        tail--;
      }
    }
    return true;
  }
}