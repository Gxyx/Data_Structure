package com.san.Algorithm;

import java.util.Scanner;

public class 完全数 {
    public static void main(String[] args){
       mai();
    }
    public static void mai(){
        for (int i =1;i<=6;i++){
            int result = 0;
            for (int j=1;j<i;j++){
                if (i%j ==0){
                    result=result+j;
                    }
                }
            if(result==i){
                System.out.println(i);
            }
            }
        }
    }

