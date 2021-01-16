package com.san.Algorithm;

import java.nio.charset.StandardCharsets;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/16/23:59
 */
public class 一和零_474 {
    /**
     * count[0] = '0'
     * count[1] = '1'
     * @param str
     * @return
     */
    private int[] count(String str) {
        int[] cnt = new int[2];
        for (char c : str.toCharArray()){
            cnt[c-'0']++;
        }
        return cnt;
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
        for (int i = 1; i <= strs.length; i++) {
            int[] cnt = count(strs[i - 1]);
            for (int j = 0; j <= m; j++) {
                for(int k = 0; k <= n; k++) {
                    if (cnt[0] > j || cnt[1] > k) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - cnt[0]][k - cnt[1]] + 1);
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }

    public static void main(String[] args) {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m =5 ,n =3;
        一和零_474 s = new 一和零_474();
        System.out.println(s.findMaxForm(strs,5,3));
    }
}
