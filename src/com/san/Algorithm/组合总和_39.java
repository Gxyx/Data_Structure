package com.san.Algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/08/22:49
 */
public class 组合总和_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        backtracking(0,target,path,res,candidates);
        return res;
    }

    /**
     * 递归之前 => [2]，剩余 = 5
     * 递归之前 => [2, 2]，剩余 = 3
     * 递归之前 => [2, 2, 2]，剩余 = 1
     * 递归之后 => [2, 2]
     * 递归之前 => [2, 2, 3]，剩余 = 0
     * 递归之后 => [2, 2]
     * 递归之后 => [2]
     * 递归之前 => [2, 3]，剩余 = 2
     * 递归之后 => [2]
     * 递归之后 => []
     * 递归之前 => [3]，剩余 = 4
     * 递归之前 => [3, 3]，剩余 = 1
     * 递归之后 => [3]
     * 递归之后 => []
     * 递归之前 => [6]，剩余 = 1
     * 递归之后 => []
     * 递归之前 => [7]，剩余 = 0
     * 递归之后 => []
     * [[2, 2, 3], [7]]
     */
    private void backtracking( int start, int target,Deque<Integer> path, List<List<Integer>> res, int[] candidates) {
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start;i<candidates.length;i++){
            if (candidates[i] <= target){
                path.addLast(candidates[i]);
                System.out.println("递归之前 => " + path + "，剩余 = " + (target - candidates[i]));
                backtracking(i,target - candidates[i],path,res,candidates);
                path.removeLast();
                System.out.println("递归之后 => " + path);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        组合总和_39 s = new 组合总和_39();
        System.out.println(s.combinationSum(candidates,target));
    }
}
