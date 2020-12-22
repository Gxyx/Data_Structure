package com.san.Algorithm;



public class 区间和的个数 {
    public static void main(String[] args) {
        int[] nums = {-2,5,-1};
        int lower = -2;
        int upper = 2;
        System.out.println(countRangeSum(nums,lower,upper));
    }

    public static  int  countRangeSum( int[] nums,int lower, int upper) {
        if (nums.length==0 || nums==null){
            return 0;
        }
        long[] sums = new long[nums.length+1];
        int count = 0;
        for (int i=0;i<=nums.length-1;i++){
            sums[i+1] = nums[i]+sums[i];
        }
        for (int i=0;i<=nums.length-1;i++){
            for (int j =i+1;j<=sums.length-1;j++){
                long currentsum = sums[j] -sums[i];
                if (currentsum>=lower&&currentsum<=upper){
                    count++;
                }
            }
        }

        return count ;
    }
    
}
