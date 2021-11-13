package StringsEasy;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int point = 0;
        int pointLength = 0;
        for (int i = 1; i < strs.length; i++) {
            pointLength = prefix.length() <= strs[i].length() ? prefix.length() : strs[i].length();
            for (int j = 0; j < pointLength; j++) {
                if (prefix.charAt(j) == strs[i].charAt(j)) {
                    point++;
                } else {
                    break;
                }
            }
            prefix = strs[i].substring(0, point);
            point = 0;
            if (prefix.length() == 0) {
                return "";
            }
        }
        return prefix;
    }
}