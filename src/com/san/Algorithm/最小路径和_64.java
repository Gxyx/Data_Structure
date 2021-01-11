package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/11/22:24
 */
public class 最小路径和_64 {

    /**
     * 当 i!=0,j!=0时,dp[i][j]=min(dp[i-1][j],dp[i][j-1])+grid[i][j]
     * 当只有左边是矩阵边界时:只能从上面来，即当i = 0, j != 0时,dp[i][j]=dp[i][j−1]+grid[i][j];
     * 当只有上边是矩阵边界时:只能从左面来，即当i != 0, j = 0时,dp[i][j]=dp[i−1][j]+grid[i][j];
     * 当左边和上边都是矩阵边界时:即当i = 0, j = 0时，其实就是起点,dp[i][j] = grid[i][j];
     * dp[i][j]=min(dp[i−1][j],dp[i][j−1])+grid[i][j]。
     *
     */

    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];
        //当只有左边是矩阵边界时:只能从上面来，即当i = 0, j != 0时,dp[i][j]=dp[i][j−1]+grid[i][j];
        for (int i=1;i<rows;i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        //当只有上边是矩阵边界时:只能从左面来，即当i != 0, j = 0时,dp[i][j]=dp[i−1][j]+grid[i][j];
        for (int j =1;j<cols;j++){
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }
        //当 i!=0,j!=0时,dp[i][j]=min(dp[i-1][j],dp[i][j-1])+grid[i][j]
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        System.out.println(minPathSum(grid));

    }
}
