package DynamicProgramming;

class ClimbingStairs {
    public static void main(String[] args) {

    }

    // OK
    static int climbStairs(int n) {
        int[] dp = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(i < 2) {
                dp[i] = i+1;
                continue;
            }
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}