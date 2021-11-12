package StringsEasy;

class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;

        while (head <= tail) {
            while (head < tail && !Character.isLetterOrDigit(s.charAt(head))) {
                head++;
            }
            while (head < tail && !Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
            }
            if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail)))
                return false;
            
            head++;
            tail--;
        }
        return true;
    }
}