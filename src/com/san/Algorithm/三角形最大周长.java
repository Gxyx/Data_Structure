package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/11/29/17:44
 */
public class 三角形最大周长 {

    public static void main(String[] args) {
        int[] A = {3,6,2,3};
        System.out.println(largestPerimeter(A));
    }

    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i=A.length-1;i>=2;i--){
            if (A[i-2]+A[i-1]>A[i]){
                return A[i-2]+A[i-1]+A[i];
            }
        }
        return 0;
    }
}
