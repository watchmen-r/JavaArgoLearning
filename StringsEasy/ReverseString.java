package StringsEasy;

class ReverseString {
  public static void main(String[] args) {
    char[] s = {'H', 'a', 'n', 't', 'h'};
    reverseString(s);
  }

  static void reverseString(char[] s) {
    char tmp = ' ';
    for(int i = 0; i < (s.length/2); i++) {
      tmp = s[i];
      s[i] = s[s.length - 1 - i];
      s[s.length - 1 - i] = tmp;
    }
  }
}