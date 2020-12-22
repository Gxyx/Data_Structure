package com.san.Algorithm;

import java.util.PriorityQueue;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/04/16:08
 */
public class 找出倒数第K个元素 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> quee = new PriorityQueue<>();
        for(int val:nums){
            quee.add(val);
            if(quee.size()>k){
                quee.poll();
            }
        }
        System.out.println(quee);
        System.out.println(quee.peek());
    }
}
