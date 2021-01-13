package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/13/21:47
 */
public class 解码方法_91 {

    public static int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        if (s.charAt(0)=='0'){
            dp[1] = 0;
        }else {
            dp[1] = 1;
        }
        for (int i=1;i<s.length();i++){
            if (s.charAt(i-1)=='1'||s.charAt(i-1)=='2'&&s.charAt(i)<'7'){
                //如果是20、10
                if (s.charAt(i)=='0'){
                    dp[i+1] = dp[i-1];
                }else {
                    //如果是11-19、21-26
                    dp[i+1] = dp[i]+dp[i-1];
                }
            }else if (s.charAt(i) == '0'){
                //如果是0、30、40、50
                return 0;
            }
            else {
                //如果第i和第i-1不能构成
                dp[i+1] = dp[i];
            }

        }
        System.out.println(Arrays.toString(dp));
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "227";
        //System.out.println(s.charAt(1));

        System.out.println(numDecodings(s));
    }
}
