package StringsEasy;

class ReverseInteger {
  public static void main(String[] args) {
    int n = 123;
    reverseInteger(n);
  }

  // NG 解きなおし 発想は難しい
  // また、負の数の剰余は言語によって正になったり負になったりするらしい
  // Javaは負になる
  static int reverseInteger(int x) {
    int answer = 0;
    while(x != 0) {
      int tail = x % 10;
      int newResult = answer * 10 + tail;

      if((newResult - tail) / 10 != answer) return 0;

      answer = newResult;
      x /= 10;
    }
    return answer;
  }
}