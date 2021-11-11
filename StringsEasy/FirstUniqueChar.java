package StringsEasy;

import java.util.Map;
import java.util.LinkedHashMap;

class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        firstUniqueChar(s);
    }

    static int firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}