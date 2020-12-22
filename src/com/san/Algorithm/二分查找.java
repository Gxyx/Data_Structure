package com.san.Algorithm;

/**
 * Created by 三七 on 2020/6/9.
 */
public class 二分查找 {

    /*
     int [] arr= {1,2,3,4,5};
     int key=4;
     int position = erfen(arr, key);
 */
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        System.out.println(erfen(arr,4));
    }

    public static int erfen(int [] arr,int key) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        if(key<arr[low]||key>arr[high]||low>high) {
            return -1;
        }
        while(low<=high) {
            mid=(low+high)/2;
            if(arr[mid]>key) {
                high=mid-1;   //关键字在做左边
            }
            else if(arr[mid]<key) {
                low=mid+1;    //关键字在右边
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
