package com.san.Algorithm;

import java.util.HashSet;
import java.util.Set;

public class 子集 {
    public static void main(String[] args) {
        子集 aa = new 子集();
        int[] a = {1,2,3};
        System.out.println(aa.getSubsets(a,a.length));
    }
    public  Set<Set<Integer>> getSubsets(int [] A,int n ){
        Set<Set<Integer>>  res = new HashSet<>();
        //初始化为空集
        res.add(new HashSet<>());
        for (int i = 0;i < n;i++){
            //创建一个新的集合
            Set<Set<Integer>> resnew = new HashSet<>();
            //把原来的集合中的每个子集都加到新集合中
            resnew.addAll(res);
            //遍历之前的集合，全部克隆一遍
            for (Set e : res){
                Set clone = (Set)((HashSet)e).clone();
                //把当前元素加进去
                clone.add(A[i]);
            resnew.add(clone);
            }
            res = resnew;
         }
        return res;
    }
 }
