package com.san.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/17/18:24
 */
public class 单词拆分_139 {

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i =1;i<s.length()+1;i++){
            for (String word :wordDict){
                int len = word.length();
                if (i>=len && word.equals(s.substring(i - len, i))){
                    dp[i] = dp[i] || dp[i - len];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leets");
        wordDict.add("code");
        System.out.println(wordBreak(s,wordDict));
    }
}
