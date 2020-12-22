package com.san.Algorithm;


/**
 * 最长递增子序列：
 * 给定一个长度为N的数组，找出一个最长的单调递增子序列，子序列不一定连续，但初始顺序不能乱。
 *
 * 给定一个长度为6的数组A{4， 5， 7， 1，3， 9}，则其最长的单调递增子序列为{4，5，7，9}，长度为4。
 */
public class 最长子序列 {
    public static void main(String[] args) {
        int[] nums = {4,5,7,1,3,9};
        System.out.println(LargestListFind(nums));
    }
     public static  int LargestListFind(int[] nums){
        int[] dp = new int[nums.length];
        //当i = 0时,只有一个元素独自构成子序列，此时d[0] = 1；
         if (nums.length==0) return 0;
        dp[0] = 1;
        int max = dp[0];
        for (int i =1;i<nums.length;i++){
          for (int j= 0;j<=i-1;j++){
              if (nums[i] >nums[j] &&dp[j]+1 > dp[i]){
                  dp[i] = dp[j]+1;
              }
          }
          if (max < dp[i]){
              max = dp[i];
          }

        }
        return max;
     }
}
