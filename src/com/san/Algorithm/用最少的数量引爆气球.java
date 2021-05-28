package com.san.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * points = [[10,16],[2,8],[1,6],[7,12]]
 * @Auther: Gxyx
 * @Date: 2020/11/23/23:11
 */
public class 用最少的数量引爆气球 {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
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

        //第一个箭在第一个气球后面
        int last = points[0][1];
        //统计箭数
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            //如果箭射入的位置小于下标为i这个气球的左边位置，说明这支箭不能
            //击爆下标为i的这个气球，需要再拿出一支箭，并且要更新这支箭射入的
            //位置
            if (last < points[i][0]) {
                last = points[i][1];
                count++;
            }
        }
        return count;
    }
}
