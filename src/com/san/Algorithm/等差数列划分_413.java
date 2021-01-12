package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/12/21:47
 */
public class 等差数列划分_413 {

    public static int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        int sum = 0;
        for (int i=2;i<A.length;i++){
            if (A[i]-A[i-1] == A[i-1]-A[i-2]){
                dp[i] = dp[i-1]+1;
                sum = sum+dp[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1};
        System.out.println(numberOfArithmeticSlices(A));
    }
}
