package com.san.Algorithm;

/**
 * Created by 三七 on 2020/6/16.
 */

public class 求和 {
    public static void main(String[] args) {
        int n=100;
        System.out.println(sumNums(n));
    }
    public static int sumNums(int n) {
        //return (int)(Math.pow(n, 2)+n)/2;
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
