package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/19/23:17
 */
public class 只有两个键的键盘_650 {

    public static int minSteps(int n) {
        int[] dp = new int[n + 1];
        int h = (int) Math.sqrt(n);
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j <= h; j++) {
                if (i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(minSteps(n));
    }
}
