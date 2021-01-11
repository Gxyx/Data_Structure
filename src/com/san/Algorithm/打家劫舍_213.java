package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/11/21:38
 */
public class 打家劫舍_213 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob1(nums, 0, nums.length - 2), rob1(nums, 1, nums.length - 1));
    }

    public int rob1(int[] nums,int first,int last) {
        int pre2 = 0, pre1 = 0;
        for (int i = first; i <= last; i++) {
            int cur = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        打家劫舍_213 s = new 打家劫舍_213();
        System.out.println(s.rob(nums));
    }
}
