package com.san.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/01/22:04
 */
public class 返回数组下标 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target));
    }

    public static List<Integer> searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}
