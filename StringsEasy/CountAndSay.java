package StringsEasy;

class CountAndSay {
  public static void main(String[] args) {
    int n = 4;
    System.out.println(countAndSay(n));
  }

  // もうちょっとで自力だった 再度解き直す
  static String countAndSay(int n) {
    String answer = "1";
    for(int i = 1; i < n; i++) {
      char tmp = answer.charAt(0);
      int count = 1;
      String tmpAns = "";

      for(int j = 1; j < answer.length(); j++) {
        if(tmp == answer.charAt(j)) {
          count++;
        } else {
          tmpAns = tmpAns + String.valueOf(count) + tmp;
          tmp = answer.charAt(j);
          count = 1;
        }
      }
      answer = tmpAns + String.valueOf(count) + tmp;
    }

    return answer;
  }
}