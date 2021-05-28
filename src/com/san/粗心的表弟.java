package com.san;


import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/28/16:26
 */
public class 粗心的表弟 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = "aig";
        if (s.length()==3) {
//            if ((s.charAt(0) + s.charAt(1) + s.charAt(2)) >= 293 && (s.charAt(0) + s.charAt(1) + s.charAt(2)) <= 337) {
//                System.out.println("cat");
//            }
            if ((s.charAt(0) + s.charAt(1) + s.charAt(2)) >= 305 && (s.charAt(0) + s.charAt(1) + s.charAt(2)) <= 339) {
                System.out.println("pig");
            }else {
                System.out.println("cat");
            }
        }
        if (s.length()==5) {
            System.out.println("horse");
        }

    }
}


