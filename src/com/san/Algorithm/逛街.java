package com.san.Algorithm;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/09/17:43
 * 健身房
 */
public class 逛街{
    public static void main(String[] args){
        Math.min(2,3);
        int[] heights = {5,3,8,3,2,5};
        System.out.println(Arrays.toString(findBuilds(heights)));
    }

    public static int[] findBuilds(int[] heights){
        Stack<Integer> stack = new Stack();
        int[] res = new int[heights.length];
        //从左向右单调栈
        for(int i=0;i< heights.length;i++){
            res[i] = stack.size();
            while(!stack.empty() && heights[i] >= heights[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }
        stack.clear();
        //从右向左单调栈
        for(int i = heights.length - 1;i >=0;i--) {
            res[i] = res[i] + 1 + stack.size();
            while (!stack.isEmpty() && heights[i] >= heights[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

}
