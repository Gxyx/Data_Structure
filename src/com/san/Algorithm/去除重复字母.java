package com.san.Algorithm;

import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/02/21:25
 */
public class 去除重复字母 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[256];
        for (int i =0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        boolean[] inStack = new boolean[256];
        for (char c:s.toCharArray()){
            count[c]--;
            if (inStack[c]){
                continue;
            }
            while (!stack.isEmpty()&&stack.peek()>c){
                // 弹出栈顶元素，并把该元素标记为不在栈中
                if (count[stack.peek()]==0){
                    break;
                }
                inStack[stack.pop()] = false;
            }
            stack.push(c);
            inStack[c] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
