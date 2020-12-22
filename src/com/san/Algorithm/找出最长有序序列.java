package com.san.Algorithm;

/**
 * Created by 三七 on 2020/6/9.
 */
public class 找出最长有序序列 {
    public static void main(String[] args) {
        //int []arr = {0,1,0,1,2,3,1,2,0,1,2,3,4,5,1};
        int []arr ={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(length(arr));
    }

    public static int length(int[] arr) {
        int begin = 0;  //最长序列开始位
        int max = 1;    //最长长度
        int k = 1;      //递增子序列长度

        for (int end = 1; end < arr.length; end++) {
            if (arr[end]>=arr[end-1]) {
                k++;
            }
            else {
                k = 1;
            }
            if (k >= max){
                max = k;
                begin = end - max+1;
            }
        }
        System.out.print("最长连续递增子序列为：");
        for(int i = begin;i<begin+max;i++) {
            System.out.print(arr[i] + "   ");

        }
        return 0;
    }

}