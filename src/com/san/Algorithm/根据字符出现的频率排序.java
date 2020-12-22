package com.san.Algorithm;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/06/16:15
 */
public class 根据字符出现的频率排序 {
    public static void main(String[] args) {
        String s = "cccccc";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        //计数
        Map<Character, Integer> frequencyForNum = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyForNum.put(c, frequencyForNum.getOrDefault(c, 0) + 1);
        }
        //装桶
        List<Character>[] buktes = new ArrayList[s.length() + 1];
        for (char c : frequencyForNum.keySet()) {
            int f = frequencyForNum.get(c);
            if (buktes[f] == null) {
                buktes[f] = new ArrayList<>();
            }
            buktes[f].add(c);
        }

        //将桶倒序输出
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = buktes.length-1;i>=0;i--){
            if (buktes[i] == null){
                continue;
            }
            for (char c :buktes[i]){
                for (int j = 0;j<i;j++){
                    stringBuilder.append(c);
                }
            }
        }

        return stringBuilder.toString();

    }
}
