package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2020/11/25/21:27
 */
public class 桶排序 {
    public static void main(String[] args) {
        int[] x = { 99, 65, 24, 47, 50, 88,33, 66, 67, 31, 18 };
        int[] sorted = bucketSort(x, 99);
        for (int i = 0; i < sorted.length; i++)
        {
            if (sorted[i] > 0)
                System.out.println(sorted[i]);
        }
    }

    public static int[] bucketSort(int[] nums, int maxNum){
        int[] sorted = new int[maxNum+1];
        for (int i=0;i<nums.length;i++){
            sorted[nums[i]] = nums[i];
        }
        return sorted;
    }
}
