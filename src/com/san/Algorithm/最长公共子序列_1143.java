package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/15/19:20
 */
public class 最长公共子序列_1143 {


    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+2];
        for (int i=0;i<text1.length();i++){
            for (int j=0;j<text2.length();j++){
                char c1 = text1.charAt(i), c2 = text2.charAt(j);
                if (c1 == c2){
                     //去找它们前面各退一格的值加1即可
                    dp[i+1][j+1] = dp[i][j] +1;
                }else {
                    //要么是text1往前退一格，要么是text2往前退一格，两个的最大值
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }


    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "abc";
        System.out.println(longestCommonSubsequence(text1,text2));
    }

}
