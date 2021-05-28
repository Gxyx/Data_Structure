package com.san;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/17/13:52
 */
public class 城市修建 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i=0;i<n;i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        long xMin = Math.abs(x[x.length-1]-x[0]);
        long yMin = Math.abs(y[y.length-1]-y[0]);
        long res = Math.max(xMin,yMin);
        System.out.println(res*res);
    }


}
