package com.san.Algorithm;

import java.util.Arrays;

public class 有序数组平方 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(sortedSquares(A)));
    }
    public static int[] sortedSquares(int[] A) {
        int [] sum = new int[A.length];
        for(int i=0;i<=A.length-1;i++){
            sum[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        Arrays.sort(sum);
        return sum;
    }
}
