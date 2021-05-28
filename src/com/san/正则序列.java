package com.san;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/08/20:11
 */
public class 正则序列 {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {3,0,3,1,3};
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0;i<n;i++){
//            nums[i] = sc.nextInt();
//        }
        Arrays.sort(nums);
        int[] tmp = new int[n];
        for (int i = 0;i<n;i++){
            tmp[i] = i+1;
        }
        int count = 0;
        for (int i=0;i<n;i++){
            if (nums[i]!=tmp[i]){
                count = count + Math.abs(tmp[i]-nums[i]);
            }
        }
        System.out.println(count);
    }
}
