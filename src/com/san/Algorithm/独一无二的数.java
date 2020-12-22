package com.san.Algorithm;

import java.util.*;


public class 独一无二的数 {

    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        System.out.println(Arrays.toString(uniqueOccurrences(arr)));
    }

    public static int[] uniqueOccurrences(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        Map<Integer, Integer> map = new HashMap();
//       for (int i = 0; i < arr.length; i++) {
//           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//           }
//        for(int m : map.keySet()){
//            set.add(map.get(m));
//        }
//        return map.size() == set.size();
        int[] count = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        Arrays.sort(count);

//        for(int i=1; i<count.length; i++) {
//            if (count[i] == count[i-1] && count[i] != 0) {
//                return false;
//            }
//        }
//        return true;
        return count;
        }

    }



