package com.san.Algorithm;

import java.util.Scanner;

public class Dianbing {
    static int output  ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;


        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int n1 = 35;
        int n2 = 21;
        int n3 = 15;

        while((n1-a)%3!=0){
            n1+=35;
        }

        while((n2-b)%5!=0)
            n2+=21;

        while((n3-c)%7!=0){
            n3+=15;
        }

        int temp = n1+n2+n3;
        while(temp>105)
            temp-=105;
        System.out.print(temp);


    }
}
