package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2020/11/19/21:24
 */
public class 移动零 {
    public static void main(String[] args) {
        int[] nums ={0,0,1};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            list.add(nums[i]);
//        }
//        int count = 0;
//        for (int i =0;i<list.size();i++){
//            if (list.get(i).equals(0)){
//                list.remove(i);
//                count++;
//            }
//        }
//        for (int i =0;i<count;i++){
//            list.add(0);
//        }
//        for (int i=0;i<list.size();i++){
//            nums[i] = list.get(i);
//        }
//        System.out.println(Arrays.toString(nums));
//        if (nums == null || nums.length == 0)
//            return;
//        int index = 0;
//        for(int i=0;i<nums.length;i++) {
//            if (nums[i] != 0) {
//                nums[index++] = nums[i];
//            }
//        }
//            while (index<nums.length){
//                nums[index++] = 0;
//            }
//        int i =0;
//        for (int j =0;j<nums.length;j++){
//            if (nums[j]==0){
//                i++;
//            }else if(i!=0){
//                nums[j-i] = nums[j];
//                nums[j] = 0;
//            }
//        }
        int i =0;
        for (int j =0;j<nums.length;j++){
            if (nums[j]!=0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;

                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

