package com.san.Algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 两数交集 {

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static  int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i<=nums1.length-1;i++){
            for (int j = 0;j<=nums2.length-1;j++){
                if (nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int i = 0;
        int[] res = new int[set.size()];
        for (Integer num : set) {
            res[i++] = num;
        }
        return  res;
    }
}
