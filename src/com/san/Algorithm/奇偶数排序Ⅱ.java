package com.san.Algorithm;

import java.util.Arrays;

public class 奇偶数排序Ⅱ {
    public static void main(String[] args) {
        int[] A ={3,5,4,2};
        System.out.println(Arrays.toString(sortArrayByParityII(A)));
    }
    public static int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        int add = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                ans[add] = A[i];
                add=add+2;
            }
        }
        add = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                ans[add] = A[i];
                add =add+2;
            }
        }

        return ans;

    }


}
