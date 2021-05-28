package com.san;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/28/12:10
 */
public class 字符串转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int count = 0;
        int res = 0;
        for (int i=len-1;i>=0;i--){
            if (s.charAt(i)=='y'){
                count = count+1;
            }
            if (s.charAt(i)=='x'){
                res = (res + count)%(1000000007);
                count = (count*2)%(1000000007);
            }
        }
        System.out.println(res%1000000007);
    }
}
