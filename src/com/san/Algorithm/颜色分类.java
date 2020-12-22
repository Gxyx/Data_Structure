package com.san.Algorithm;

import java.util.Arrays;

public class 颜色分类 {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
       // sortColors(nums);
        sortColor(nums);
    }

    public static void sortColors(int[] nums) {
        int red = 0,blue = 0,white = 0;
        for (int i =0;i<=nums.length-1;i++){
            if (nums[i]==0) red++;
            else if (nums[i]==1) white++;
            else blue++;
        }
        for (int i = 0; i < red; i++) {
            nums[i] = 0;
        }
        for (int i =red;i<red+white;i++){
            nums[i] = 1;
        }
        for (int i = red+white;i<red+white+blue;i++){
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static  void sortColor(int [] nums){
        int n =nums.length;
        int ptr = 0;
        for (int i = 0;i<n;i++){
            if (nums[i] ==0){
                int tmp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = tmp;
                ptr++;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
            }
        }

    }




}
