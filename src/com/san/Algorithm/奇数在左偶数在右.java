package com.san.Algorithm;

import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/16.
 */
public class 奇数在左偶数在右 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5,6,7,8};
        margersort(arr, 0, arr.length-1);
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

    public static void  marger(int [] arr,int p,int r,int mid){
        int[] helper  = new int[arr.length];
        //将原数组拷贝到新数组中
        System.arraycopy(arr,p,helper,p,(r-p)+1);
        int left = p ;         //左侧队伍的头部指针，指向待比较的元素
        int right = mid+1;     // 右侧队伍的头部指针，指向待比较的元素
        int current = p;      //原数组的指针， 指向代填入数据的位置
        while(left<=mid && right<=r){
            for (int i = p;i<=mid;i++){
                if (arr[i]%2==1)
                arr[current++] = arr[i];
            }
            for (int i=mid+1;i<=r;i++){
                if (arr[i]%2==1)
                    arr[current++] = arr[i];
            }
            for (int i=p;i<=mid;i++){
                if (arr[i]%2==0)
                    arr[current++] = arr[i];
            }
            for (int i=mid+1;i<=r;i++){
                if (arr[i]%2==0)
                    arr[current++] = arr[i];
            }


            }


        }
    }

