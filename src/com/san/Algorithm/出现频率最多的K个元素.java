package com.san.Algorithm;

import java.util.*;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/04/17:41
 */
public class 出现频率最多的K个元素 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buktes  = new ArrayList[nums.length+1];
        for (int key:frequencyForNum.keySet()){
            int frequent = frequencyForNum.get(key);
            if (buktes[frequent] == null){
                buktes[frequent] = new ArrayList<>();
            }
            buktes[frequent].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = buktes.length - 1; i >= 0 && topK.size() < k; i--) {
            if (buktes[i] == null) {
                continue;
            }
            if (buktes[i].size()<=(k-topK.size())) {
                topK.addAll(buktes[i]);
            }else {
                topK.addAll(buktes[i].subList(0,k-topK.size()));
            }
        }
        int[] res=new int[k];
//        int i=0,t,j;
//        for(t=nums.length;t>0;t--){//从索引高到低依次遍历每个桶，如果桶不空，则取数直至取出前k个数
//            if(buktes[t]!=null){
//                for(j=0;j<buktes[t].size()&&i<k;j++)
//                {
//                    res[i++]=buktes[t].get(j);
//                }
//            }
//        }
        for (int i = 0; i < k; i++) {
            res[i] = topK.get(i);
        }
        return res;
    }

}
