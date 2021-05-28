package com.san;

import java.util.Arrays;


/**
 * @Auther: Gxyx
 * @Date: 2021/05/09/10:13
 */
public class 围栏 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int h = sc.nextInt();
//        int[] heights = new int[n];
//        for (int i=0;i<n;i++){
//            heights[i] = sc.nextInt();
//        }
        int n = 5;
        int m = 3;
        int h = 2;
        int[] heights = {2,1,2,1,1};
        int count = 0;
        if (heights.length<m) System.out.println(-1);
        for (int i=0;i<n;i++){
            if (heights[i]>h){
                if (count>=m){
                    break;
                }else {
                    count = 0;
                }
            }else {
                count++;
            }
        }
        Arrays.sort(heights);
        if (count<m){
            System.out.println(-1);
        } else if (count==m){
            System.out.println(n-count+1);
        }else {
            System.out.println(heights[0]);
        }
        System.out.println(count);
    }
}
