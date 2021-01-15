package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/15/20:05
 */
public class 背包0_1 {

    /**
     * @param W 背包重量
     * @param N 物品价值
     * @param weights 数组存储N个物品的重量
     * @param values 数组存储N个物品的重量
     * @return
     */
    public static int knapsack(int W, int N, int[] weights, int[] values) {
        int[][] dp = new int[N+1][W+1];
        for (int i=1;i<=N;i++){
            int w = weights[i-1];
            int v = values[i-1];
            for (int j=1;j<=W;j++){
                if (j>=w){
                    // j>=w(i)  V(i,j)=max｛ V(i-1,j)，V(i-1,j-w(i))+v(i) ｝
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w]+v);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][W];
    }

    /**
     * 优化
     * 每一次V(i)(j)改变的值只与V(i-1)(x) {x:1...j}有关，
     * V(i-1)(x)是前一次i循环保存下来的值
     *
     * 可以将V缩减成一维数组，从而达到优化空间的目的，
     * 状态转移方程转换为 B(j)= max{B(j), B(j-w(i))+v(i)}
     * @param W
     * @param N
     * @param weights
     * @param values
     * @return
     */
    public int knapsack2(int W, int N, int[] weights, int[] values) {
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i - 1], v = values[i - 1];
            for (int j = W; j >= 1; j--) {//为了保证每个物品都使用一次
                if (j >= w) {
                    dp[j] = Math.max(dp[j], dp[j - w] + v);
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int N = 4;
        int W = 5;
        System.out.println(knapsack(W,N,weights,values));
    }
}
