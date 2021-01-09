package com.san.Algorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/09/14:00
 */
public class 组合总和_216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtracking(k, n, 1, path, res);
        return res;
    }


    private void backtracking(int k,int n,int start, List<Integer> path,List<List<Integer>> res){
        if (n == 0 && path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        if(path.size() == k || n == 0){
            return;
        }
//        if (path.size() == k && n == 0) {
//            res.add(new ArrayList<>(path));
//            return;
//        }
        for (int i = start;i<= 9;i++){
            path.add(i);
            System.out.println("递归之前 => " + path);
            backtracking(k,n-i,i+1,path,res);
            path.remove(path.size()-1);
            System.out.println("递归之后 => " + path);
        }
    }

    public static void main(String[] args) {
        int k =3;
        int n =9;
        组合总和_216 s = new 组合总和_216();
        System.out.println(s.combinationSum3(k,n));
    }
}
