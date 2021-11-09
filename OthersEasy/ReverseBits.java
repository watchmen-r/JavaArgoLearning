package OthersEasy;

class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(00000000000000000000000000001011));
    }

    //　解きなおし
    static int reverseBits(int n) {
        if (n == 0) return 0;

        int result = 0;
        for(int i = 0; i < 32; i++) {
            // 左に１つシフトする
            result <<= 1;
            if((n & 1) == 1) result++;
            
            // 右に１つシフトする
            n >>= 1;
        }
        return result;
    }

}