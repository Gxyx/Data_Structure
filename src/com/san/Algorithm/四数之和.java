package com.san.Algorithm;

import java.util.*;

public class 四数之和 {

    public static void main(String[] args) {
        int nums[] = {-5,5,4,-3,0,0,4,-2};
        System.out.println(fourSum(nums, 4));
    }


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> Set = new HashSet<List<Integer>>();
       Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++)
            for (int j = i+1; j < nums.length - 2; j++)
                for (int k = j+1; k < nums.length - 1; k++)
                    for (int l = k+1; l < nums.length; l++)
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target)
                            Set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
        return new ArrayList<List<Integer>>(Set);
    }
}


