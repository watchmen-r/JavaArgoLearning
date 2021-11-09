package StringsEasy;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

class FirstUniqueChar {
  public static void main(String[] args) {
    String s = "loveleetcode";
    firstUniqueChar(s);
  }

  // OKだが時間かかったので解きなおしても良い
  // またsubstringではなくてcharAtを使う
  static int firstUniqueChar(String s) {
    Map<String, Integer> firstMap = new LinkedHashMap<String, Integer>();
    List<String> secondList = new ArrayList<String>();
    for(int i = 0; i < s.length(); i++) {
      String target = s.substring(i, i + 1);
      if(!secondList.contains(target) && !firstMap.containsKey(target)) {
        firstMap.put(target, i);
      } else if (!secondList.contains(target) && firstMap.containsKey(target)) {
        firstMap.remove(target);
        secondList.add(target);
      }
    }

    if(firstMap.isEmpty()) {
      return -1;
    }

    return firstMap.entrySet().stream().findFirst().get().getValue();
  }
}