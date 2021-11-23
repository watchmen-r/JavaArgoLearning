package MathEasy;

class PowerThree {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if(n == 1) return true;

        long calcNum = 3;
        while(calcNum <= n) {
            if(calcNum == n) return true;
            calcNum = calcNum * 3l;
        }
        return false;
    }
}