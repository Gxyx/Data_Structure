package com.san.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class 最接近原点的K个点 {
    public static void main(String[] args) {
        int[] [] points = {{1,3},{-2,2}};
        int K =1;
        System.out.println(kClosest(points,K));
    }

    public static  int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);

            }
        });
        return Arrays.copyOfRange(points,0,K);
    }
}
