package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/11/22/20:11
 */
public class 有效的字母异位词 {
    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        System.out.println(isAnagram(s,t));
    }

        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1, str2);
        }
    }


