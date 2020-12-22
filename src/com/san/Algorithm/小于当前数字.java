package com.san.Algorithm;

import java.util.Arrays;

public class 小于当前数字 {
    public static void main(String[] args) {

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        Arrays.sort(nums);
        for (int i=0;i<=nums.length-1;i++){
            for (int j=0;j<=nums.length-1;j++){
                if (nums[i]>nums[j]){
                    count[i] = count[i]+1;
                }
            }
        }
        return count;
    }
}
