package com.san.Algorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/06/18:25
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        System.out.println(generate(6));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(row);
        }
        return list;
    }
}