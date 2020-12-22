package com.san.Algorithm;

import java.util.Arrays;

public class 最小差 {
    public static void main(String[] args) {
        int[] sums = {1,2,3};
        Arrays.sort(sums);
        int min = Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 1; i < sums.length ; i++) {
            tmp = sums[i]-sums[i-1];
            if (min > tmp){
                min = tmp;
            }
        }
        System.out.println(min);
        //System.out.println(sums);
    }

//    public static int  minsun(int[] nums){
//        Arrays.sort(nums);
//        int min = Integer.MAX_VALUE;
//        int tmp = 0;
//        for (int i = 1; i < nums.length ; i++) {
//            tmp = nums[i]-nums[i-1];
//            if (min>tmp){
//                min = tmp;
//            }
//        }
//        return min;
//
//    }
}
