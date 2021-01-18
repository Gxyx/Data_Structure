package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/18/23:18
 */
public class 两个字符串的删除操作_583 {

    public static int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j]=i+j;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1])+1;
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        System.out.println(minDistance(s1,s2));
    }
}
