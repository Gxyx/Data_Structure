package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/17/17:31
 */
public class 零钱兑换Ⅱ_518 {

    public static int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                // base case
                if (i == 0) {
                    dp[0][j] = 0;
                }
                // base case
                if (j == 0) {
                    dp[i][0] = 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (j - coins[i - 1] < 0) {
                    //不装
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //dp[i][j] = 不装 + 装
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
            }
        }
        for (int x = 0; x < dp.length; x++)//循环输出二维数组的for循环嵌套

        {
            for (int y = 0; y < dp[x].length; y++) {
                System.out.println(dp[x][y] + ",");
            }

        }
        return dp[coins.length][amount];
    }

    public int change1(int amount, int[] coins) {
        if (coins == null) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] =dp[i] + dp[i - coin];
            }
        }
        return dp[amount];
    }


    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        System.out.println(change(amount,coins));
    }
}
