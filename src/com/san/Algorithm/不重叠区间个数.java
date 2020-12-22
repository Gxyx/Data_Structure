package com.san.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/06/21:24
 */
public class 不重叠区间个数 {
    public static void main(String[] args) {
        int [][] intervals = {{1,2},{1,2},{1,2}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               // return (o1[1]<o2[1])? -1 :((o1[1]==o2[1])?0:1) ;
//                if(o1[0]==o2[0]){
//                    return o1[1] - o2[1];
//                }else {
//                    return o1[0] - o2[0];
//                }
                return o1[1] - o2[1];
            }
        });
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }


}
