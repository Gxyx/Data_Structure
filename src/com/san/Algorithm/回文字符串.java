package com.san.Algorithm;



/**
 * @Auther: Gxyx
 * @Date: 2020/12/18/20:03
 */
import java.util.*;
public class 回文字符串
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            F(sc.next());
        }
    }
    public static void F(String s){
        StringBuilder sb = new StringBuilder(s);
        String afterReverse = sb.reverse().toString();
        int isequal = afterReverse.compareTo(s);
        if (isequal == 0) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }
}
