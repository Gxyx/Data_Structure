package com.san;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/12:48
 */
public class Testi {
    public static void main(String[] args) {
        int i =0;
        int a =++i;
        int b =i;
        /**
         * a：0
         * i++：1
         * i++，将现在的值赋值给变量，将加1的值赋值给下一个变量
         */
        //System.out.println("a："+a);
        //System.out.println("i++："+b);
        /**
         * a：1
         * ++i：1
         * ++i，将加1的值赋值给变量，同时将加1值更新为自身当前值
         */
        System.out.println("a："+a);
        System.out.println("++i："+b);
        System.out.println(2^3*2-1+(1/3)+2^(1234+5));

        System.out.println(7%10);
    }
}
