package com.san.Algorithm;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/10/22:21
 */
public class 子集_78 {

    /**
     * 输入：nums = [1,2,3]
     * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        for (int i = 0;i<=nums.length;i++) {
            backtracking(0, path, res,i,nums);
        }
        return res;
    }

    private void backtracking(int start, List<Integer> path, List<List<Integer>> res, int size,  int[] nums) {
        if (path.size()==size){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(i+1,path,res,size,nums);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        子集_78 s = new 子集_78();
        System.out.println(s.subsets(nums));
    }
}
