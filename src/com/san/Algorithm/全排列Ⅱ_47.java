package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/07/22:38
 */
public class 全排列Ⅱ_47 {

    boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> track = new ArrayList<>();
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, track, 0, res);
        return res;
    }



    // 路径：记录在 track 中
    // 选择列表：nums 中不存在于 track 的那些元素
    // 结束条件：nums 中的元素全都在 track 中出现
    public void backtrack(int[] nums, List<Integer> track,int idx,List<List<Integer>> res){
        if (idx == nums.length) {
            res.add(new ArrayList<>(track));
            return;
        }
        /**
         * for 选择 in 选择列表:
         *     # 做选择
         *     将该选择从选择列表移除
         *     路径.add(选择)
         *     backtrack(路径, 选择列表)
         *     # 撤销选择
         *     路径.remove(选择)
         *     将该选择再加入选择列表
         */
        for (int i =0;i<nums.length;i++){
            if (visited[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;  // 防止重复
            }
            track.add(nums[i]);
            visited[i] = true;
            backtrack(nums, track, idx + 1, res);
            visited[i] = false;
            track.remove(idx);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        全排列Ⅱ_47 s = new 全排列Ⅱ_47();
        System.out.println(s.permuteUnique(nums));
    }
}
