package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/12/20:50
 */
public class 区域和检索_数组不可变_303 {

    private int[] sum ;
    public void NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

}
