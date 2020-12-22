package com.san.Algorithm;


/**
 * Created by 三七 on 2020/6/14.
 */
public class 数字转化为字母 {
    public static void main(String[] args) {
        int num = 1213;
        System.out.println(num/10);
        System.out.println(translateNum(num));
    }


    public static int translateNum(int num) {
//        int cout =0;
//        String s = String.valueOf(num);
//        int[] x = new int[s.length()];
//        for (int j=0;j<s.length();j++){
//            x[j] =Integer.parseInt(String.valueOf(s.charAt(j)));
//        }
//        for (int k =0;k<x.length-1;k++){
//            if (x[k]*10+x[k+1]<=25){
//                cout++;
//            }
//            else {
//                break;
//            }
//        }
//
//        return cout+1;
//    }
//        if (num < 10) return 1;
//        return (num % 100 < 10 || num % 100 > 25) ? translateNum(num / 10) : translateNum(num / 10) + translateNum(num / 100);


        if (num < 10) {
            return 1;
        }
        int tmp = num % 100;
        if (tmp < 10 || tmp > 25) {
            return translateNum(num / 10);
        } else {
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }
}


