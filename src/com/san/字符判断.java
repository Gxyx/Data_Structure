package com.san;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/15/10:17
 */
public class 字符判断 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "de";
        int n = s1.length();
        int m = s2.length();
        int i=0;
        int j=0;
        int count = 0;
        while (i<n){
            if (s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
                count++;
            }
            else {
                i++;
            }
        }
        System.out.println(count);
         if (count==m){
             System.out.println(true);
         }else {
             System.out.println(false);
         }
       }
    }

