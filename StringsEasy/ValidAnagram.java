package StringsEasy;

class ValidAnagram {
  public static void main(String[] args) {
    String s = "rat";
    String t = "cat";
    System.out.println(validAnagram(s, t));
  }

  // NG 解きなおし 発想は難しい
  static boolean validAnagram(String s, String t) {
    if(s.length()!=t.length()){
      return false;
    }

    int[] count = new int[26];
    for(int i = 0; i < s.length(); i++) {
      // asciiでa=97・・・z=122、引き算することでintにしている
      count[s.charAt(i)-'a']++;
      count[t.charAt(i)-'a']--;
    }
    for(int i : count) {
      if(i!=0) {
        return false;
      }
    }
    return true;
  }
}