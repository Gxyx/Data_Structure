package com.san.Algorithm;

import java.util.Arrays;

public class 数组的相对顺序和 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        int[] tmp=new int [1001];
//        int n=arr1.length;
//        //累加arr1数组中每个数字的个数。
//        for(int num:arr1){
//            tmp[num]++;
//        }
//        int pos=0;      //arr1中索引的位置 也是arr2中含有的数字在arr1中的最大长度
//        //在arr1上从0开始位置添加arr2中顺序的值，
//        for(int num:arr2){
//            while(tmp[num]>0){
//                arr1[pos++]=num;
//                tmp[num]--;
//            }
//        }
//        int check=pos;  //这里是arr2中没有的值开始的位置。
//        //添加arr2中没有的值
//        for(int i=0;i<1001;++i){
//            while(tmp[i]>0){
//                arr1[pos++]=i;
//                tmp[i]--;
//            }
//        }
//        return arr1;
        int[] res = new int[arr1.length];
        //0 <= arr1[i], arr2[i] <= 1000
        int[] nums = new int[1001];

        //1.遍历arr1，统计每个元素的数量。存放在数组nums中，
        for(int i:arr1){
            nums[i]++;
        }

        //2.将arr2中出现的数，放入res中
        int index = 0;
        for(int i :arr2){
            while(nums[i]>0){
                res[index++] = i;
                nums[i]--;
            }
        }

        //3.将arr2中没有出现的数放入res中
        for(int i =0;i<nums.length;i++){
            while(nums[i]>0){
                res[index++] = i;
                nums[i]--;
            }
        }

        return res;
    }

    }

