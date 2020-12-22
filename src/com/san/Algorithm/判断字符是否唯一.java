package com.san.Algorithm;


import java.util.HashSet;
import java.util.Set;

public class 判断字符是否唯一 {

    public static boolean isUnique1(String astr) {
        if (astr == null){
            return true;
        }
        int[] count = new int[100];
        char[] a = astr.toCharArray();
        for (int i=0;i<=a.length-1;i++){
            for (int j=i+1;j<a.length;j++)
            if (a[i]==a[j]){
                count[i]+=1;
            }
        }
        for (int i=0;i<=99;i++){
            if (count[i]>=1){
                return false;
            }
        }
        return true;
    }

    public boolean isUnique2(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            //如果有重复的直接返回false
            if (!set.add(astr.charAt(i)))
                return false;
        }
        return true;
    }

}
