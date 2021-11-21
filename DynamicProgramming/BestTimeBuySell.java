package DynamicProgramming;

class BestTimeBuySell {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 7};
        System.out.println(maxProfit(array));
    }

    static int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) min = prices[i];
            
            dp[i] = (dp[i-1] < (prices[i] - min)) ? (prices[i] - min) : dp[i-1];
        }
        return dp[prices.length - 1];
    }
}