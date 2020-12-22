package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/02/18:10
 */
public class 拼接最大数 {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        int k = 3;
        System.out.println(maxNumber(nums1,nums2,k));
    }
    public static List<Integer> maxNumber(int[] nums1, int[] nums2, int k) {
        List<Integer> list = new ArrayList<>();
        int[] res = new int[k];
        for (int i = 0; i <= nums1.length - 1; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i <= nums2.length - 1; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);

        return list;
    }
}
