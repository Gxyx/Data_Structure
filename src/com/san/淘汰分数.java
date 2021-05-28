package com.san;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/08/17:28
 */
public class 淘汰分数 {
    public static void main(String[] args) {
        int n = 4;
        int x = 2;
        int y = 3;
        int[] score = {117,195,962,512};
        /**
         * 符合条件的最低分数线 -> 过线的人多 -> 使用人数限制最大值 y作为过线人数 -> 判断剩下的人数 是否在[x,y]区间 ->
         *      如果在 直接返回
         *      如果不在
         *          如果人数少于x 则直接找到分数最低的第x个人即可
         *          如果人数大于y 则证明找不到一个分数线满足条件
         */
        //对成绩排序
        Arrays.sort(score);
        //没有过线人数
        int res = n - y;
        if (res > y){
            System.out.println(score[-1]);
        }else if(res>=x&&res<=y){
            System.out.println(score[n-y-1]);
        }else {
            System.out.println(score[x-1]);
        }
    }
}
