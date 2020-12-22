package com.san.Algorithm;

import java.math.BigInteger;

public class F {

    public static void main(String[] args) {
        System.out.println(fib(100));
    }

    private static BigInteger fib(int n) {

       // int result =0;
        BigInteger result = new BigInteger("0");
        BigInteger r1 = new BigInteger("1");
        BigInteger r2 = new BigInteger("1");
        BigInteger r3 = new BigInteger("1");
        for(int i = 3 ; i<=n;i++) {
            result = r1.add(r2).add(r3).add(BigInteger.ONE);
            r2 = r1;
            r3 = r2;
            r1=result;
        }

        return result;
    }

}
