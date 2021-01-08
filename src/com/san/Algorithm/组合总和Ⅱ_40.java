package com.san.Algorithm;

import java.util.*;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/08/23:21
 */
public class 组合总和Ⅱ_40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        //在搜索之前就对候选数组排序，一旦发现某个分支搜索下去可能搜索到重复的元素就停止搜索
        Arrays.sort(candidates);
        if (candidates.length == 0) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        backtracking(0, target, path, res, candidates, new boolean[candidates.length]);
        return res;
    }

    private void backtracking(int start, int target, List<Integer> path, List<List<Integer>> res, int[] candidates, boolean[] visited) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i!=0 && candidates[i] == candidates[i - 1] && !visited[i - 1]) {
                continue;
            }
            if (candidates[i] <= target) {
                path.add(candidates[i]);
                visited[i] = true;
                backtracking(i+1, target - candidates[i], path, res, candidates, visited);
                visited[i] = false;
                path.remove(path.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        组合总和Ⅱ_40 s = new 组合总和Ⅱ_40();
        System.out.println(s.combinationSum2(candidates,target));
    }
}
