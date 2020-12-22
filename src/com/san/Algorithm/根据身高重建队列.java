package com.san.Algorithm;

import java.util.*;

public class 根据身高重建队列 {
    public static void main(String[] args) {
        int[][] people  = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(reconstructQueue(people));
    }

    public static int[][] reconstructQueue(int[][] people) {
        //按照先H高度降序，K个数升序排序
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        LinkedList<int[]> res = new LinkedList<>();
        //从身高降序开始插入，此时所有人身高都大于等于h
        //排完序，以k作为索引插入列表
        for (int[] i : people){
            res.add(i[1],i);
        }
        return res.toArray(people);
    }
}
