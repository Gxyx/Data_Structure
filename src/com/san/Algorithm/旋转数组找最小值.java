package com.san.Algorithm;

/**
 * Created by 三七 on 2020/6/9.
 */
public class 旋转数组找最小值 {
/*
    思路：
     1. 二分查找（双指针，确定边界）
     2. 初始时，A 指针指向第一个元素，B 指针指向最后一个元素;
            两个指针分别从开头和末尾向中间移动，直到指向同一个位置
            两个指针所在的下标之和折半，
            若该元素大于 B 指针指向的元素，则该元素属于第一个递增子数组，
            最小值位于折半位置和 B 指针之间，所以将 A 指向折半后的位置
            若该元素小于 B 指针指向的元素，则该元素属于第二个递增子数组，
            最小值位于 A 指针和折半位置之间，所以将 B 指向折半后的位置
            当 A 指针和 B 指针位置相同时，它们指向的元素就是最小值
 *
         * 思路2：
           1. 二分查找（双指针，确定边界）
           2. 初始时，A 指针指向第一个元素，B 指针指向最后一个元素;
              两个指针分别从开头和末尾向中间移动，直到指向同一个位置
              两个指针所在的下标之和折半得到指针 mid，
              若A、B 和 mid 三者指向的元素相等，
                则无法判断 mid 指向的元素属于第一个还是第二个递增子数组，所以顺序查询最小元素
              若该元素大于等于 A 指针指向的元素，
                则该元素属于第一个递增子数组，最小值位于折半位置和 B 指针之间，所以将 A 指向折半后的位置
              若该元素小于等于 B 指针指向的元素，
                则该元素属于第二个递增子数组，最小值位于 A 指针和折半位置之间，所以将 B 指向折半后的位置
              当 A 指针和 B 指针位置相同时，它们指向的元素就是最小值
 */

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        //int arr[] = {1,2,3,4,5};
        //int arr[] = {1, 0, 1, 1, 1};
        System.out.println(min(arr));
    }

    public static int min(int[] arr){
        int begin = 0;
        int end = arr.length-1;
        // 特殊情况：当第二递增子数组的长度为 0 时，不执行下面的程序，返回数组的第一个元素
        int mid = 0;
        //无旋转的特殊旋转
        if(arr[begin]<arr[end]){
            return arr[begin];
        }
       while (arr[begin]>=arr[end]){
           if (end - begin ==1){
               mid = end;
               break;
           }
           mid = (begin + end) / 2;
//           if (arr[mid] == arr[begin] && arr[mid] == arr[end]){
//               // 特殊情况，当折半后的下标和 A、B 指向的元素都相等时，
//               // 无法判断该元素属于第一个还是第二个递增子数组，则顺序查找
//               for(int i = begin+1; i <= end; i++)
//                   if (arr[i-1] - arr[i] > 0 ) {
//                       return arr[i];
//                   }
//           }

           if (arr[mid] >= arr[begin]) {
               begin = mid;
           }
           else if (arr[mid] <= arr[end]){
               end = mid;
           }

       }
       return arr[mid];
    }
}
