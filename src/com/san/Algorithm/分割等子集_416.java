package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/15/21:05
 */
public class 分割等子集_416 {


    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        //只有何为偶数才能找到子集
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        //行：数组 列：0-target
        boolean[][] dp = new boolean[nums.length][target+1];

        //当 i==0时，只有一个正整数nums[0] 可以被选取，
        //因此 dp[0][nums[0]]=true dp[0][nums[0]]=true
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        for (int i =1;i<nums.length;i++){
            for (int j=0;j<=target;j++){
                if (j>=nums[i]){
                    //选不选只要又一个为true dp[i][j]为true
                    dp[i][j] = dp[i-1][j-nums[i]] | dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length - 1][target];
    }

    /**
     * 优化
     * @param nums
     * @return
     */
    public static boolean canPartition1(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int W = sum / 2;
        boolean[] dp = new boolean[W + 1];
        dp[0] = true;
        for (int num : nums) {                 // 0-1 背包一个物品只能用一次
            for (int i = W; i >= num; i--) {   // 从后往前，先计算 dp[i] 再计算 dp[i-num]
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
        System.out.println(canPartition1(nums));
    }
}
