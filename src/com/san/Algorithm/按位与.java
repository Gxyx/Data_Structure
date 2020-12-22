package com.san.Algorithm;

public class 按位与 {
    public static void main(String[] args) {
        int m=5;
        int n=8;
        //System.out.println(n);
        System.out.println(r(m,n));
    }
    public static int r(int m,int n){
        int nums = 0;
        while(m!=n){
            m = m >>1;
            n = n >>1;
            nums++;
        }
        return m<<nums;
    }
}
