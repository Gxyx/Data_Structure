package com.san;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/19/13:42
 */
public class 二分查找二 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,7,7,7,9,9,10};
        int target = 11;
        System.out.println(search(nums,target));
    }
    public static int search (int[] nums, int target) {
        // write code here
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        while(l<r){
             mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l++;
            }else {
                r--;
            }
        }
         return -1;
    }
}
