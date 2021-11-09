package ArrayEasy;

class BestTimeToBuy {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        System.out.println(maxProfit(nums));

    }

    public static int maxProfit(int[] prices) {
        int answer = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i])
                answer += (prices[i] - prices[i - 1]);
        }
        return answer;
    }
}
