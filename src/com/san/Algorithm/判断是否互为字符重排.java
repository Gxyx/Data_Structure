package com.san.Algorithm;

import java.util.Arrays;

public class 判断是否互为字符重排 {
    public static void main(String[] args) {

    }

    public boolean CheckPermutation(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return new String(a).equals(new String(b));

    }
}
