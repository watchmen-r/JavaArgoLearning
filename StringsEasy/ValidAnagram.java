package StringsEasy;

class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        System.out.println(validAnagram(s, t));
    }

    static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int i : count) {
            if(i!=0) return false;
        }
        return true;
    }
}