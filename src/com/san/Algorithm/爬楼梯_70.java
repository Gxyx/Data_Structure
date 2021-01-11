package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/11/20:23
 */
public class 爬楼梯_70 {

    public int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int pre1 = 1,pre2 = 2;
        for (int i=3;i<=n;i++){
            int sum = pre1 + pre2;
            pre1 = pre2;
            pre2 = sum;
        }
        return pre2;
        //return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        int n = 45;
        爬楼梯_70 s = new 爬楼梯_70();
        System.out.println(s.climbStairs(n));
    }
}
