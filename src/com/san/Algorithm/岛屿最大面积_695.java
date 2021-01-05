package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/05/14:24
 */
public class 岛屿最大面积_695 {

    /**
     * 一个岛屿是由一些相邻的1(代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。
     * 你可以假设grid 的四个边缘都被 0（代表水）包围着。
     * {{0,0,1,0,0,0,0,1,0,0,0,0,0},
     *  {0,0,0,0,0,0,0,1,1,1,0,0,0},
     *  {0,1,1,0,1,0,0,0,0,0,0,0,0},
     *  {0,1,0,0,1,1,0,0,1,0,1,0,0},
     *  {0,1,0,0,1,1,0,0,1,1,1,0,0},
     *  {0,0,0,0,0,0,0,0,0,0,1,0,0},
     *  {0,0,0,0,0,0,0,1,1,1,0,0,0},
     *  {0,0,0,0,0,0,0,1,1,0,0,0,0}}
     *  最大返回6
     */
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int a = dfs(grid, r, c);
                    res++;
                }
            }
        }
        return res;
    }

    /**
     * 每次搜索四个相邻方格
     * @param grid
     * @param r
     * @param c
     */
    public int dfs(int[][] grid,int r,int c){
        //处于网格边缘
        if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
            return 0;
        }
        //若不是岛屿
        if( grid[r][c] !=1){
            return 0;
        }
        //将方格标记为"已遍历"
        grid[r][c] = 2;
        int num = 1;
        //上边相邻
        num += dfs(grid,r-1,c);
        //下边相邻
        num += dfs(grid,r+1,c);
        //右边相邻
        num += dfs(grid,r,c+1);
        //左边相邻
        num += dfs(grid,r,c-1);
        return num;
    }


    public static void main(String[] args) {
        int[][] grid = {
       {0,0,1,0,0,0,0,1,0,0,0,0,0},
       {0,0,0,0,0,0,0,1,1,1,0,0,0},
       {0,1,1,0,1,0,0,0,0,0,0,0,0},
       {0,1,0,0,1,1,0,0,1,0,1,0,0},
       {0,1,0,0,1,1,0,0,1,1,1,0,0},
       {0,0,0,0,0,0,0,0,0,0,1,0,0},
       {0,0,0,0,0,0,0,1,1,1,0,0,0},
       {0,0,0,0,0,0,0,1,1,0,0,0,0}
                                    };
        岛屿最大面积_695 s = new 岛屿最大面积_695();
        System.out.println(s.maxAreaOfIsland(grid));
    }


}
