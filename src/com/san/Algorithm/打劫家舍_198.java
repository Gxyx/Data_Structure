package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/11/20:58
 */
public class 打劫家舍_198 {

    /**
     * dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1])
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i=2;i<=nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        return dp[nums.length];

//        int pre2 = 0, pre1 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int cur = Math.max(pre2 + nums[i], pre1);
//            pre2 = pre1;
//            pre1 = cur;
//        }
//        return pre1;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(rob(nums));
    }
}
