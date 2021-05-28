package com.san;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/28/13:52
 */
public class 数字的情绪 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Long[] num = new Long[13];
        while (t>0){
            Long n = sc.nextLong();
            Long m = n;
            List<String> slist = new ArrayList<>();
            List<String> glist = new ArrayList();
            int len = m.toString().length();
            // 非0个数
            int cunt = 0;
            // 0个数
            int errcunt = 0;
            while (n>0){
                if (n%10!= 0){
                    num[cunt++] = n%10;
                }else{
                    errcunt++;
                }
                n = n / 10;
            }
            for (int i=0;i<cunt;i++){
                if (m%num[i]==0){
                    glist.add("G");
                }
                if (m%num[i]!=0){
                    slist.add("S");
                }
            }

            if (errcunt + glist.size() == len) {
                System.out.println("G");
            } else if (slist.size() == len) {
                System.out.println("S");
            } else {
                System.out.println("H");
            }

            t--;
        }
    }

}

