package com.san.Algorithm;

import java.util.Arrays;

/**
 * 
 * @Auther: Gxyx
 * @Date: 2021/01/13/22:31
 */public class 最长递增子序_300 {
    /**
     * 输入：nums = [10,9,2,5,3,7,101,18]
     * 输出：4
     * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = 1;
        dp[0] = 1;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                max = Math.max(max,dp[i]);
            }
        }
        return max;
    }
    public static int lengthOfLIS2(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp, 1);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public static void main(String[] args) {
       int[] nums = {4,5,7,1,3,9};
        System.out.println(lengthOfLIS2(nums));
    }
}
