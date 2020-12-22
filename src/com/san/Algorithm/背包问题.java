package com.san.Algorithm;

public class 背包问题 {
    public static void main(String[] args) {
        int[] w = {2, 3, 4, 5};
        int[] v = {3, 4, 5, 6};
        int n = 4;
        int W = 5;
        //System.out.println(knapSack(w, v, 8));
        System.out.println(dp(n,W,w,v));
    }

    private static int knapSack(int[] w, int[] v, int C) {
        int size = w.length;
        if (size == 0) {
            return 0;
        }
        int[][] dp = new int[size][C + 1];

        for (int i = 0; i <= C; i++) {
            dp[0][i] = w[0] <= i ? v[0] : 0;
        }
        for (int i = 1; i < size; i++) {
            for (int j = 0; j <= C; j++) {
                dp[i][j] = dp[i - 1][j];
                if (w[i] <= j) {
                    dp[i][j] = Math.max(dp[i][j], v[i] + dp[i - 1][j - w[i]]);
                }
            }
        }
        return dp[size - 1][C];

    }


    static int  dp( int n,int W,int[] w,int[] v){
        int dp[][] = new int[n][W+1];
        for (int i=0;i<W+1;i++){
         if (i>=w[0]){
            dp[0][i] = v[0];
         }else {
             dp[i][0] = 0;
         }
        }
        //其他行
        for (int i =1;i< n;i++){
            //j是背包容量也是剩余量
            for (int j = 0; j < W+1 ; j++) {
                if (j>=w[i]){ //要得起
                    int i1 = v[i]+dp[i-1][j-w[i]]; //选择当前物品即I号物品，剩余容量
                    int i2 = dp[i-1][j];
                    dp[i][j] = Math.max(i1,i2);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n-1][W];
    }

}
