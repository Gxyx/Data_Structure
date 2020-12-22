package com.san.Algorithm;

import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/8.
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        System.out.println(Arrays.toString(selectsort(arr)));
    }

    public static int [] selectsort(int [] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }
}
