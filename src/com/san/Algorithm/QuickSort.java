package com.san.Algorithm;

import java.util.Arrays;

/**
 * Created by 三七 on 2020/6/13.
 *
 *        三指针分区
 * private static int[] partition(int[] arr, int p, int r) {
 * 		int s = p + 1;  //左扫描指针
 * 		int e = s; //记录与主元相等元素序列的开始下标
 * 		int bigger = r; //右侧扫描指针
 * 		int pivot = arr[p]; //主元
 * 		while (s <= bigger) {
 * 			while(s <= bigger && arr[s] <= pivot) {
 * 				//当从一开始没有找到与主语相等的元素，且都小于主元时，指针右移
 * 				if(s <= bigger && s == e && arr[s] < pivot) {
 * 					s++;
 * 					e++;
 *                                }
 * 				//如过s!=e时，说明已经找到与主元相等的元素，且e记录的为与主元相等元素的开始下标
 * 				//如果下一个元素小于主元，则将小于主元的元素和与主元相等序列的第一个元素交换位置
 * 				if(s <= bigger && s != e && arr[s] < pivot) {
 * 					util.Swap.swap(arr, s, e);
 * 					e++;
 * 					s++;
 *                }
 * 				//如果遇到等于主元的元素，左扫描指针++， 记录与主元相等序列的开始下标e不变
 * 				if(s <= bigger && arr[s] == pivot) {
 * 					s++;
 *                }* 			}
 * 			//右侧扫描指针
 * 			while(s <= bigger && arr[bigger] > pivot) {
 * 				bigger--;
 * 			}
 * 			//将左侧指针指向大的元素与右侧小于主元的元素交换
 * 			if(s <= bigger && arr[s] > arr[bigger]) {
 * 				util.Swap.swap(arr, s, bigger);
 * 			}*
 * 		}
 * 		//最后，数组下标为p的开始元素，和与主元相等序列的前一个元素交换，e--
 * 		util.Swap.swap(arr, p, --e);
 * 		//返回与主元相等序列的开始下标和结束下标
 * 		int[] q = {e, bigger};
 * 		retu     q;
 * 	}
 * }
 *
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {12,2,16,30,28,10,16,20,6,18};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int [] arr,int p,int r){
        if (p < r){
            //int q = pas(arr,p,r);
            int q = pas2(arr,p,r);
            quicksort(arr,p,q-1);
            quicksort(arr,q+1,r);
        }
    }

    public  static int  pas(int[] arr,int p,int r){
        int pt =arr[p];
        int s = p+1;
        int b = r;
        while (s <= b ) {
            if (arr[s] <= pt){
                s++;
            }else{
                int tmp = arr[b];
                arr[b] = arr[s];
                arr[s] = tmp;
                b--;
            }

        }
        int tmp = arr[b];
        arr[b] = arr[p];
        arr[p] = tmp;
        return b;
    }

    public static int pas2(int[] arr,int p,int r){
        int pt = arr[p];
        int left = p+1;
        int right = r;
        while (left <= right){
            while (left <= right && arr[left]<=pt){
                left++;
            }
            while (left <= right && arr[right]>pt){
                right--;
            }
            if (left < right){
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
            System.out.println(Arrays.toString(arr));

        }
        int tmp = arr[right];
        arr[right] = arr[p];
        arr[p] = tmp;
        return right;
    }
}
