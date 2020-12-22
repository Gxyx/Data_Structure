package com.san.Algorithm;

import java.util.Arrays;

public class 下一个序列 {
    public static void main(String[] args) {
        int[] nums = {5,1,1};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int len = nums.length - 1;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, len);
                for (int j = i; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int tmp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = tmp;
                        return;
                    }
                }
            }


        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    }
