package com.san.Algorithm;

import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/15.
 */
public class 最长递增序列 {
    public static void main(String[] args) {
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int ls = 1;
        int ck = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[i + 1] - nums[i] == 1) {
                    ck++;
                } else {
                    ls = Math.max(ls, ck);
                    ck = 1;
                }
            }
        }
        return Math.max(ls, ck);
    }
}
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(nums);
//
//        int longestStreak = 1;
//        int currentStreak = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i-1]) {
//                if (nums[i] == nums[i-1]+1) {
//                    currentStreak ++;
//                }
//                else {
//                    longestStreak = Math.max(longestStreak, currentStreak);
//                    currentStreak = 1;
//                }
//            }
//        }
//
//        return Math.max(longestStreak, currentStreak);




