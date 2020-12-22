package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2020/11/25/21:30
 */
public class 上升下降字符串 {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }


    public static String sortString(String s) {
        int[] sorted = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            sorted[c - 'a']++;
        }
        char[] res = new char[s.length()];
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (sorted[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    sorted[i]--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (sorted[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    sorted[i]--;
                }

            }
        }
        return new String(res);
//        if (s == null || s.length() <= 0) {
//            return s;
//        }
//
//        int[] memory = new int[26];
//        int length = s.length();
//        for (int i = 0; i < length; i++) {
//            memory[s.charAt(i) - 'a']++;
//        }
//
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < 26; j++) {
//                if (memory[j] != 0) {
//                    str.append((char) (j + 'a'));
//                    memory[j]--;
//                }
//            }
//            for (int j = 25; j >= 0; j--) {
//                if (memory[j] != 0) {
//                    str.append((char) (j + 'a'));
//                    memory[j]--;
//                }
//            }
//        }
//
//        return str.toString();
    }
}