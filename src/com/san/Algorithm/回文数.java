package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 回文数 {
    public static void main(String[] args) {
         int x = 0;
        List<Integer> integer_list = new ArrayList<Integer>();
        integer_list.add(1);
        integer_list.add(2);
        integer_list.add(3);
        integer_list.add(4);
        integer_list.add(5);

//        int[] ids_int = new int[integer_list.size()];
//        for (int i = 0; i < integer_list.size(); i++) {
//            ids_int[i] = integer_list.get(i);
//        }
        String str =listToString(integer_list);
       // System.out.println(toString(ids_int));
        //System.out.println(Arrays.toString(ids_int));
         System.out.println(str);
    }

    public static boolean isPalindrome(String str) {
        StringBuffer shu =new StringBuffer();
        char[] ch = str.toCharArray();
        for (int i = ch.length-1 ; i >= 0; i--) {
            shu.append(ch[i]);
        }
        String str1=shu.toString();
        if(str1.equals(str)) {
            return true;
        }else {
            return false;
        }
    }

    //定义一个功能实现数组转字符串
    public static String toString(int[] arr){
        //1.定义个临时容器
        String temp = "";
        //2.遍历数组，字符串自加
        for (int x=0; x<arr.length; ++x){
            temp = temp + arr[x];
        }
        return temp;
    }

    public static String listToString(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

}
