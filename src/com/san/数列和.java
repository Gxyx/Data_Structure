package com.san;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/17/11:04
 */
public class 数列和 {
    public static void main(String args[]) {
        int m;
        double sum, n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum = sum + n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f", sum);
            System.out.println();
        }
    }
}
