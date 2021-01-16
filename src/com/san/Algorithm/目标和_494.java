package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/16/18:17
 */
public class 目标和_494 {
    /**
     * 	        -5	-4	-3	-2	-1	0	1	2	3	4	5
     * nums[0]	0	0	0	0	1	0	1	0	0	0	0
     * nums[1]	0	0	0	1	0	2	0	1	0	0	0
     * nums[2]	0	0	1	0	3	0	3	0	1	0	0		nums={1,1,1,1,1}
     * nums[3]	0	1	0	4	0	6	0	4	0	1	0		s=3
     * nums[4]	1	0	5	0	10	0	10	0	5	0	1
     *
     * 			dp[1][0] = dp[0][-1] + dp[0][1]
     * 		    dp[1][2] = dp[0][1] + dp[0][3]
     * 			。。。。。。
     * 		    dp[i][j] = dp[i-1][j-nums[i]] + dp[i-1][j+nums[i]]
     *
     * @param nums
     * @param S
     * @return
     */
    //dp[ i ][ j ]定义为从数组nums中 0 - i 的元素进行加减可以得到 j 的方法数量
    public static int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (Math.abs(S)>Math.abs(sum)){
            return 0;
        }
        int t = (sum*2)+1;
        int[][] dp = new int[nums.length][t];
        //初始化
        if (nums[0] == 0) {
            dp[0][sum] = 2;
        } else {
            dp[0][sum + nums[0]] = 1;
            dp[0][sum - nums[0]] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < t; j++) {
                // 边界
                int l = (j - nums[i]) >= 0 ? j - nums[i] : 0;
                int r = (j + nums[i]) < t ? j + nums[i] : 0;
                dp[i][j] = dp[i - 1][l] + dp[i - 1][r];
            }
        }
        return dp[nums.length-1][sum + S];
    }

    /**
     * DFS
     * @param nums
     * @param start
     * @param S
     * @return
     */
    private int findTargetSumWays(int[] nums, int start, int S) {
        if (start == nums.length) {
            return S == 0 ? 1 : 0;
        }
        return findTargetSumWays(nums, start + 1, S + nums[start])
                + findTargetSumWays(nums, start + 1, S - nums[start]);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int S = 3;
        System.out.println(findTargetSumWays(nums,S));
    }
}
