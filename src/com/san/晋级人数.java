package com.san;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/08/20:43
 */
public class 晋级人数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] scores = new int[n];
        for (int i=0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        int count = x;
        int baseline = scores[n - x];
        if(scores[n - 1] == 0){
            count = 0;
        }else{
            if(baseline > 0){
                count --;
                while(scores[n - x] == baseline){
                    count ++;
                    x ++;
                }
            }else{
                while(scores[n - x] == baseline){
                    count --;
                    x --;
                }
            }
        }
        System.out.println(count);
    }
}
