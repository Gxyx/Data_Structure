package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/03/25/18:41
 */
public class Demo2 {
    public static void main(String[] args) {
        String n = "82734";
        char[] s = n.toCharArray();
        Arrays.sort(s);
        char c = s[s.length-1];
        int max = Integer.parseInt(String.valueOf(c));
        System.out.println(max);

    }
//    public static int minPartitions(String n) {
//        char[] s = n.toCharArray();
//        Arrays.sort(s);
//        System.out.println();
//        char c = s[s.length-1];
//        int max = Integer.parseInt(String.valueOf(c));
//        return max;
//    }
}
