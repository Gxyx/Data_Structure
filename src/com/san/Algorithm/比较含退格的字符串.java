package com.san.Algorithm;

import java.util.Objects;
import java.util.Stack;

public class 比较含退格的字符串 {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        System.out.println(backspaceCompare(S,T));
    }
    public static boolean backspaceCompare(String S, String T) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int count1 = 0;
        int count2 = 0;
        //倒序遍历
        for(int i = S.length()-1;i>=0;i--){
            //初始化字符串
            char ch = S.charAt(i);
            //如果是#，当前退格数量自增
            if(ch=='#'){
                count1++;
            }else {
                //如果当前退格数量大于0，不记录当前字符，当前退格数量自减
                if(count1>0){
                    count1--;
                }else{
                    //反之则记录当前字符的值
                    s1.append(ch);
                }
            }
        }
        String s = s1.reverse().toString();

        for(int i = T.length()-1;i>=0;i--){
            char ch = T.charAt(i);
            if(ch =='#'){
                count2++;
            }else {
                if(count2>0){
                    count2--;
                }else{
                    s2.append(ch);
                }
            }
        }
        String t = s2.reverse().toString();

        return Objects.equals(s,t);

        }

    public static boolean backspaceCompare2(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        int s = S.length();
        for (int i = 0;i<s;i++){
            if (S.charAt(i) !='#'){
                stack1.push(S.charAt(i));
            }else{
                if(stack1.isEmpty())continue;
                stack1.pop();
            }

        }
        Stack<Character> stack2 = new Stack<>();
        int t = T.length();
        for (int i = 0;i<t;i++){
            if (T.charAt(i) !='#'){
                stack2.push(T.charAt(i));
            }else{
                if(stack2.isEmpty())continue;
                stack2.pop();
            }

        }

        while (!stack2.isEmpty()&&!stack1.isEmpty()){
            char s1 = stack1.pop();
            char t2 = stack2.pop();
            if (s1!=t2){
                return false;
            }
        }
        if (stack1.isEmpty()&&stack2.isEmpty()){
            return true;
        }

        return false;
    }

}
