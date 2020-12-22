package com.san.Algorithm;

import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/8.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        System.out.println(Arrays.toString(shellsort(arr)));
    }

    public static int [] shellsort(int[] arr){

        //不断缩小增量
        for (int inval = arr.length/2;inval>0;inval=inval/2){
            //增量为1的的插入排序（代码几乎和插排一样）
           for (int i=inval;i<arr.length;i++){
               int tarhet = arr[i];
               int j = i-inval;
               while ( j>-1 && tarhet<arr[j]){
                   arr[j+inval]=arr[j];
                   j=j-inval;
               }
               arr[j+inval]=tarhet;
           }
        }
        return arr;
    }

}

