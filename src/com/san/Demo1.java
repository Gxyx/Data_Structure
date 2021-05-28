package com.san;

import com.san.Algorithm.子集_78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/13/16:39
 */
public class Demo1 {
    /**
     * 例如： nums = [1,5,8,17,29,33,39,11,16] ,target = 33
     *
     */
    /*
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        int[] nums = {1,5,8,17,29,33,39,32,16} ;
        list.add(nums);
        int target = 33;
        for (int[] lists : tosum(nums,target)) {
            System.out.println(Arrays.toString(lists));
        }
    }
    public static List<int[]> tosum(int[] nums, int target){
        List<int[]> list = new ArrayList<>();
        if(nums==null||nums.length==0) {
            list.add(new int[]{0});
            return list;
        }
             for(int i=0;i<nums.length;i++){
                 if (nums[i]==target){
                     list.add(new int[]{i});
                 }
                 int sum = nums[i];
                 for(int j=i+1;j<nums.length;j++){
                     if(target-nums[j] == sum){
                         list.add(new int[]{i,j});
                     }
                 }
             }
             return list;
         }

     */


        public static void main(String[] args) {
            int[] nums = {1, 5, 8, 17, 29, 33, 39, 11, 16 };
            int target = 33;
            find(nums, target, 0, 0);
        }

        static Stack<Integer> list = new Stack<Integer>();

        public static void find(int[] nums, int target, int index, int total){
            if(index == nums.length) return;
            list.add(index);
            if(total + nums[index] == target){
                System.out.println(list);
            }
            find(nums, target, index + 1, total + nums[index]);

            list.pop();
            find(nums, target, index + 1, total);
        }



    }



