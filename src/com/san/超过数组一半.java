package com.san;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Gxyx
 * @Date: 2021/04/19/14:25
 */
public class 超过数组一半 {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution3(array));
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int e : array) {
            if (map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }else {
                map.put(e,1);
            }
            if(map.get(e) > array.length / 2) {
                return e;
            }
        }
        return 0;
    }

    public static int MoreThanHalfNum_Solution1(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int count = map.getOrDefault(array[i], 0) + 1;
            //如果某个数字出现的个数已经超过数组的一半，自己返回
            if (count > length / 2)
                return array[i];
            map.put(array[i], count);
        }
        return 0;
    }
    public static int MoreThanHalfNum_Solution3(int [] array) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++){
            int count = map.getOrDefault(array[i],0)+1;
            if(count > array.length/2){
                return array[i];
            }
            map.put(array[i],count);
        }
        return 0;
    }
}
