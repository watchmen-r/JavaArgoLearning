package OthersEasy;

class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    // 解きなおし、ハミング距離について
    static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y); 
    }

}