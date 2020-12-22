package com.san.Algorithm;

public class 买股票最佳卖出时机Ⅱ {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit1(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length<=1||prices==null){
            return 0;
        }
        int sum =0;
        for (int i =1;i<prices.length;i++){
            int day1 = prices[i-1];
            int day2 = prices[i];
            if (day2>day1){
                sum = sum+(day2-day1);
            }
        }
        return sum;
    }

    public static int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // 0：持有现金
        // 1：持有股票
        // 状态转移：0 → 1 → 0 → 1 → 0 → 1 → 0
        int[][] dp = new int[len][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            // 这两行调换顺序也是可以的
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[len - 1][0];
    }
}
