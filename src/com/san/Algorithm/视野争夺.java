package com.san.Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/10/10:16
 */
public class 视野争夺 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[][] eyes = new int[n][2];
        for(int i =0;i<n;i++){
            for(int j=0;j<2;j++){
                eyes[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(eyes,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[] o2){
                if (o1[1]>o2[1]){
                    return 1;
                }
                if (o1[1]<o2[1]){
                    return -1;
                }
                else {
                    return 0;
                }
            }
    });
    int index = 0;
    int count = 0;
    int pre = 0;
        while(pre<l){
        if(eyes[index][0]>pre){
            System.out.println(-1);
        }
        int max = 0;
        if(index<n && eyes[index][0]<=pre){
            max = Math.max(max,eyes[index][1]);
            index++;
        }
        count++;
        pre=max;
        if(pre>=l){
            System.out.println(count);
            return;
        }
        if(index>=n){
            System.out.println(-1);
        }
    }
}
}
