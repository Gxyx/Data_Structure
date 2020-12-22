package com.san.Algorithm;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



/**
 * Created by 三七 on 2020/6/14.
 */
public class Candies {
    public static void main(String[] args) {
       int[] candies = {12,1,12};
       int extraCandies = 10;
        //Arrays.sort(candies);
        System.out.println(Arrays.toString(candies));
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();
        int sum = candies[0];
        for (int i = 0; i < candies.length; i++){
            if (sum < candies[i]){
                sum = candies[i];
            }
        }
        for(int i =0;i<=candies.length-1;i++){
            if(candies[i]+extraCandies>=sum){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
