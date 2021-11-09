package StringsEasy;

class StringToInteger {
  public static void main(String[] args) {
    String s = "-2147483648";
    System.out.println(stringToInteger(s));
  }

  // TODO とても時間かかったため解きなおし
  static int stringToInteger(String s){
    s = s.trim();
    if (s == null || s.length() == 0) return 0;
    int sign = 1;
    char firstChar = s.charAt(0);

    int j = 0;
    if (firstChar == '+') {
      sign = 1;
      j++;
    } else if (firstChar == '-') {
      sign = -1;
      j++;
    }

    String answer = "";
    for(int i = j; i < s.length(); i++) {
      char cTmp = s.charAt(i);
      if(!Character.isDigit(cTmp)) {
        break;
      }
      if(Character.isDigit(cTmp)) {
        answer = answer + cTmp;

        long ansNum = Long.parseLong(answer);
        if(ansNum > Integer.MAX_VALUE && sign == 1) {
          return Integer.MAX_VALUE;
        }
        if((ansNum * -1) <= Integer.MIN_VALUE && sign == -1) {
          return Integer.MIN_VALUE;
        }
      }
    }

    if(answer.equals("")) {
      return 0;
    }

    if(sign == 1) {
      return Integer.parseInt(answer);
    }

    return Integer.parseInt(answer) * -1;
  }
}