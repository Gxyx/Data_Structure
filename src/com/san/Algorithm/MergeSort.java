package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/10/10:21
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {8,4,5,7,1,3,6,2};
        int[] temp = new int[nums.length];
        mergesort(nums,0,nums.length-1,temp);
        System.out.println(Arrays.toString(nums));
    }


    public static void mergesort(int[] nums, int left, int right, int[] temp){

        if (left<right){
            int mid = left+(right-left)/2;
            //向左归并
            mergesort(nums,left,mid,temp);
            //向右归并
            mergesort(nums,mid+1,right,temp);
            //合并
            merge(nums,left,mid,right,temp);

        }
    }


    /**
     * 合并
     * @param nums
     * @param left
     * @param right
     * @param temp
     */
    public static void merge(int[] nums,int left,int mid,int right,int[] temp){
        System.out.println("xxxxxxxxx");
        //先把左边和又边有序的数据按照规则填充

        //初始化i
        int i = left;
        //初始化j
        int j = mid+1;

        //指向tmp数组
        int t = 0;
        // 如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
        // 即将左边的当前元素，填充到 temp数组
        // 然后 t++, i++
        while(i<=mid&&j<=right){

            if(nums[i]<=nums[j]){
                temp[t] = nums[i];
                t++;
                i++;
            }else {
                temp[t] = nums[j];
                t++;
                j++;
            }
        }

        //将剩余的依次填充到temp数组
        while(i<=mid){
            temp[t] = nums[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t] = nums[j];
            t++;
            j++;
        }


        //拷贝到原数组
        t = 0;
        int tempLeft = left;
        System.out.println("tempLeft="+tempLeft+" "+"right="+right);
        while (tempLeft <= right){
            nums[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }




}
