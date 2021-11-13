package StringsEasy;

class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }

    static String countAndSay(int n) {
        String answer = "1";
        for (int i = 1; i < n; i++) {
            String newAnswer = "";
            for (int j = 0; j < answer.length(); j++) {
                char firstChar = answer.charAt(j);
                int count = 1;
                while (j + 1 < answer.length() && answer.charAt(j + 1) == firstChar) {
                    count++;
                    j++;
                }
                newAnswer = newAnswer + String.valueOf(count) + firstChar;
            }
            answer = newAnswer;
        }

        return answer;
    }
}