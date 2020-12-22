package com.san.datastructure.字符串和多维数组;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/22/16:34
 */
public class KPM {

    public static void main(String[] args) {
        String s1 = "BBC ABCDAB ABCDABCDABDE";
        String s2 = "ABCDABD";
        int[] next = getNext(s2);
        int index = kmp(s1,s2,next);
        System.out.println("index；"+index);
    }

    /**
     *
     * @param s1 原串
     * @param s2 子串
     * @param next  部分匹配表，子串对应的
     * @return
     */
    public static int kmp(String s1,String s2,int[] next){
        for (int i=0,j=0;i<s1.length();i++){
            //kmp核心
            while (j>0&&s1.charAt(i)!=s2.charAt(j)){
                j = next[j-1];
            }
            if (s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            if (j==s2.length()){
                return i-j+1;
            }
        }
        return -1;
    }
    /**
     * 获取字符串（子串）的部分匹配值表
     * @param dest
     * @return
     */
    public static int[] getNext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i =1,j=0;i<dest.length();i++){
            //当相等时,从next[j-1]获取新的j
            while(j>0&&dest.charAt(i) != dest.charAt(j)){
                //kmp核心
                j = next[j-1];
            }
            //当相等时，部分匹配值+1；
            if (dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
