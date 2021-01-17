package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/17/15:39
 */
public class 零钱兑换_322 {

    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        //BaseCase条件
        for (int[] n:dp) {
            //凑成 amount 金额的硬币数最多只可能等于 amount    amount+1相当于正无穷
            Arrays.fill(n,amount+1);
        }
        for (int i = 0; i <=coins.length ; i++) {
            dp[i][0]=0;
        }
        //状态转移
        for (int i = 1; i <=coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1] && dp[i][j - coins[i - 1]] != amount + 1) {
                    //这里注意如果选择第i个硬币,那么就是dp[i][j-coins[i-1]]+1
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        if (dp[coins.length][amount]==amount+1){
            dp[coins.length][amount]=-1;
        }

        return dp[coins.length][amount];

    }

     public static int coinChange1(int[] coins, int amount) {
        // 数组大小为 amount + 1，初始值也为 amount + 1
         int[] dp = new int[amount+1];
         //BaseCase条件
         Arrays.fill(dp,amount+1);
        // base case
        dp[0] = 0;
        // 外层 for 循环在遍历所有状态的所有取值
        for (int i = 0; i < dp.length; i++) {
            // 内层 for 循环在求所有选择的最小值
            for (int coin : coins) {
                // 子问题无解，跳过
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }

    /**
     * 完全背包
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        if (dp[amount] == amount + 1) {
            dp[amount] = -1;
        }
        return dp[amount];
    }


    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins,amount));
        System.out.println(coinChange1(coins,amount));
    }
}
