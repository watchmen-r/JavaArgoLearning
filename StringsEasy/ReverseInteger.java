package StringsEasy;

class ReverseInteger {
    public static void main(String[] args) {
        int n = 123;
        reverseInteger(n);
    }

    static int reverseInteger(int x) {
        int answer = 0;
        while(x != 0) {
            int tail = x % 10;
            int newResult = answer * 10 + tail;

            // overflowがあった場合を検知(intでマックスに入れられたら、反対にするとoverflowし
            // 元の数に戻せなくなる)
            if((newResult - tail) / 10 != answer) return 0;

            answer = newResult;
            x /= 10;
        }
        return answer;
    }
}