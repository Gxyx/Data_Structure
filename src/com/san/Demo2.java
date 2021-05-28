package com.san;


import java.util.Arrays;


/**
 * @Auther: Gxyx
 * @Date: 2021/05/13/17:06
 */
public class Demo2 {
    /**
     * [2020-03-20,2020-03-22],
     * [2020-05-20,2020-07-22],
     * [2020-04-20,2020-05-22],
     * [2020-08-20,2020-09-22],
     */
    public static void main(String[] args) {
        String[] begin = {"2020-03-20","2020-05-20","2020-04-20","2020-08-20"};
        String[] over  = {"2020-03-22","2020-07-22","2020-05-22","2020-09-22"};
        System.out.println(compareDate(begin, over));
    }

    public static boolean  compareDate(String[] begin, String[] over){
        Arrays.sort(begin);
        Arrays.sort(over);
        for(int i=1;i<begin.length;i++){
            if (begin[i].compareTo(over[i-1])<=0){
                return true;// 有重叠
            }
        }
        return false;// 没有重叠
    }
}
