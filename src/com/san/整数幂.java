package com.san;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/15/9:25
 */
public class 整数幂 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m == 1) System.out.println(true);
        if (m == 0) System.out.println(false);
        int sum = 0;
        if (m % 2 == 0) {
            for (int i=1;i<=m/2;i++) {
                if (Math.pow(2, i) != m) {
                    continue;
                }
                else {
                   sum = (int) Math.pow(2,i);
                }
            }
        }
        if (sum==m){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

}
