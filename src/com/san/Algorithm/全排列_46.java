package com.san.Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/06/23:06
 */
public class 全排列_46 {

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }



    // 路径：记录在 track 中
    // 选择列表：nums 中不存在于 track 的那些元素
    // 结束条件：nums 中的元素全都在 track 中出现
    public void backtrack(int[] nums, LinkedList<Integer> track){
        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
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
            if (track.contains(nums[i])){
                continue;
            }
            //做选择
            track.add(nums[i]);
            backtrack(nums,track);
            // 取消选择
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        全排列_46 s = new 全排列_46();
        System.out.println(s.permute(nums));
    }
}
