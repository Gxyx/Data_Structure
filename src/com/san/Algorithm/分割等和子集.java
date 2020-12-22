package com.san.Algorithm;

import java.util.Arrays;

public class 分割等和子集 {
    public static void main(String[] args) {
            int[] nums = {1,2,5};
        System.out.println(canPartition(nums));
    }
    public static boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int maxnums = nums[nums.length-1];
        int sum = 0;
        for (int i =0 ;i<=nums.length-1;i++){
            sum+=nums[i];
        }
        if (sum%2!=0||sum/2>maxnums){
            return false;
        }
        return true;
    }
}
