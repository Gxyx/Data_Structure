package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/09/23:52
 */
public class 快速排序 {
    public static void main(String[] args) {
        int[] nums = {-9,78,0,23,-567,70};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 快速排序
     * @param nums
     * @param left
     * @param right
     */
    public static void quickSort(int[] nums,int left,int right){
        int l = left;   //左下标
        int r = right; //右下标
        int pivot = nums[(left+right)/2];    //确定中值

        int tmp = 0;   //交换 临时变量
        //比pivot值大放右边，比pivot值小放左边
        while(l<r){

            while(nums[l]<pivot){
                l++;
            }

            while(nums[r]>pivot){
                r--;
            }

            if(l>=r){
                break;
            }

            //交换
            tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;

            //交换完成后
            if(nums[l] == pivot){
                r--;
            }

            if(nums[r] == pivot){
                l++;
            }
        }
        if( l == r){
            l++;
            r--;
        }

        //向左递归
        if(left < r){
            quickSort(nums,left,r);
        }

        //向右递归
        if(right > l){
            quickSort(nums,l,right);
        }

    }
//    public static void quickSort(int[] arr, int left, int right) {
//        int l = left; // 左下标
//        int r = right; // 右下标
//
//        // pivot 中轴值
//        int pivot = arr[(left + right) / 2];
//        int temp = 0; // 临时变量，交换的时候使用
//        // while循环的目的是让比pivot值小的放到左边
//        // 比pivot值大的放到右边
//        while ( l < r ) {
//            // 在pivot的左边一直找，找到大于等于pivot值，才退出
//            while (arr[l] < pivot) {
//                l ++;
//            }
//            // 在pivot的右边一直找，找到小于等于pivot值，才退出
//            while (arr[r] > pivot) {
//                r--;
//            }
//            // 如果l >= r 说明pivot的左右两边的值，已经按照
//            // 左边全部是小于等于pivot值，右边全部是大于等于pivot值
//            if ( l >= r) {
//                break;
//            }
//
//            // 交换
//            temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//
//            // 如果交换完成后，发现这个arr[l] == pivot 值相等 r--, 前移
//            if (arr[l] == pivot) {
//                r--;
//            }
//            // 如果交换完后，发现这个arr[r] == pivot 值相等 l--, 后移
//            if (arr[r] == pivot) {
//                l++;
//            }
//        }
//        // 如果 l == r, 必须 l++, r--,否则会出现栈溢出
//        if (l == r) {
//            l++;
//            r--;
//        }
//        // 向左递归
//        if (left < r) {
//            quickSort(arr, left, r);
//        }
//        // 向右递归
//        if (right > l) {
//            quickSort(arr, l, right);
//        }
//    }

}
