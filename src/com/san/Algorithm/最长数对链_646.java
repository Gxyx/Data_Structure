package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/13/23:14
 */
public class 最长数对链_646 {
    /**
     * 输入：[[1,2], [2,3], [3,4]]
     * 输出：2
     * 解释：最长的数对链是 [1,2] -> [3,4]
     * @param pairs
     * @return
     */
    public static int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[j][1] < pairs[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] paris = {{1,2},{2,3},{3,4}};
        System.out.println(findLongestChain(paris));
    }
}
