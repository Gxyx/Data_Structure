package com.san.Algorithm;




public class 买股票的最佳时机 {

    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit1(prices));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
       int res = 0;
         for (int i=0;i<prices.length-1;i++){
             for (int j=i+1;j<prices.length;j++){
                 res = Math.max(res, prices[j] - prices[i]);
             }
         }
         return res;
    }


    /**
     * 动态规划
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int[][] dp  = new int[len][2];
       //初始化
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i =1;i<len;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[len-1][0];
    }
}
