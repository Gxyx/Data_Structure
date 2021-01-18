package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/18/23:07
 */
public class 组合总和Ⅳ_377 {

    public static int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] maximum = new int[target + 1];
        maximum[0] = 1;
        Arrays.sort(nums);
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length && nums[j] <= i; j++) {
                maximum[i] += maximum[i - nums[j]];
            }
        }
        return maximum[target];
    }

    public static int combinationSum41(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }



    public static void main(String[] args) {
       int[] nums = {1, 2, 3};
       int target = 4;
       System.out.println(combinationSum4(nums,target));
        System.out.println(combinationSum41(nums,target));
    }
}
