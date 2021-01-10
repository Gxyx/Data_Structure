package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/10/22:53
 */
public class 子集Ⅱ_90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        //Arrays.sort(nums);
        for (int i=0;i<=nums.length;i++){
            backtracking(0, path, res,i,nums,new boolean[nums.length]);
        }
        return res;
    }

    private void backtracking(int start, List<Integer> path, List<List<Integer>> res, int size,  int[] nums,boolean[] visited ) {
        if (path.size()==size){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=start;i<nums.length;i++){
            if (i!=0&&nums[i] == nums[i-1]&& !visited[i-1]){
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            System.out.println("  递归之前 => " + path);
            backtracking(i+1,path,res,size,nums,visited);
            visited[i] = false;
            path.remove(path.size()-1);
            System.out.println("  递归之后 => " + path);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        子集Ⅱ_90 s = new 子集Ⅱ_90();
        System.out.println(s.subsetsWithDup(nums));
    }
}
