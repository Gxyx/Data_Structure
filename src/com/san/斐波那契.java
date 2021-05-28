package com.san;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/19/12:48
 */
public class 斐波那契 {
    public static void main(String[] args) {
        System.out.println(FB(4));
    }
    public static int FB(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        int result=0;
        int r1 = 0;
        int r2 = 1;
        for(int i = 2;i<=n; i++) {
            result = r1+r2;
            r1=r2;
            r2=result;
        }
        return result;//返回结果
//        int[] dp = new int[n+1];
//        dp[0] = 0 ;
//        dp[1] = 1 ;
//        for(int i=2;i<n+1;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n] ;
    }
}
