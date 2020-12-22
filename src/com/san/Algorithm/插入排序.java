package com.san.Algorithm;

import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/8.
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int [] sort(int[] arr){
        for (int i=1;i<=arr.length-1;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }


    public static int [] sort1(int[] arr){
        for (int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int j;
            for (j=i;j>0&& arr[j-1]>=tmp;j--){
                   arr[j]=arr[j-1];
            }
            arr[j] = tmp;
        }
        return arr;
    }
}
