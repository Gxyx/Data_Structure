package com.san.Algorithm;
import java.util.Scanner;
/**
 * @Auther: Gxyx
 * @Date: 2020/12/18/19:58
 */
public class 查找最大元素 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                F(sc.nextLine());
            }
            sc.close();
        }

        private static void F(String input){
            char[] chs = input.toCharArray();
            char max = 'A' - 1;
            for(char ch : chs){
                if(ch > max)
                    max = ch;
            }
            System.out.println(input.replaceAll(""+max, ""+max+"(max)"));
        }
    }

