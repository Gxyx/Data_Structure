package com.san.Algorithm;

/**
 * Created by 三七 on 2020/6/8.
 */
public class 小白上楼梯 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(pa(n));
    }

    public static int pa(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        if (n==2) return 2;
        return pa(n-1)+pa(n-2)+pa(n-3);
    }


}
