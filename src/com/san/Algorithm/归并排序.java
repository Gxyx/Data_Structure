package com.san.Algorithm;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/16
 *
 *
 *.
 */
public class 归并排序 {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 76, 13, 27, 50 };
        margersort(arr, 0, arr.length-1);
        System.out.println("排好序的数组：");
        System.out.println(Arrays.toString(arr));

    }

    public static void margersort(int[] arr,int p,int r){
        if(p<r){
            int mid = (p+r)/2;
            margersort(arr,p,mid);
            margersort(arr,mid+1,r);
            marger(arr,p,r,mid);
        }
    }
/*
 *public static void arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
            参数:
            source_arr : 源数组
            sourcePos : 源数组拷贝元素的起始位置
            dest_arr : 目标数组
            destPos : 目标数组接收拷贝元素的起始位置
            len : 拷贝的元素的数目
 *
 *
*/
    public static void  marger(int [] arr,int p,int r,int mid){
        int[] helper  = new int[arr.length];
        //将原数组拷贝到新数组中
        System.arraycopy(arr,p,helper,p,(r-p)+1);
        int left = p ;         //左侧队伍的头部指针，指向待比较的元素
        int right = mid+1;     // 右侧队伍的头部指针，指向待比较的元素
        int current = p;      //原数组的指针， 指向代填入数据的位置
        while(left<=mid && right<=r){
            if (helper[left]<=helper[right]){
                arr[current++] = helper [left++];
            }else{
                arr[current++] = helper [right++];
            }
            while(left<=mid){
                arr[current++] = helper [left++];
            }

        }
    }
}
