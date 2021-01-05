package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/05/15:12
 */
public class 岛屿的数量_200 {

    /**
     * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
     *
     * {
     *   {"1","1","1","1","0"},
     *   {"1","1","0","1","0"},
     *   {"1","1","0","0","0"},
     *   {"0","0","0","0","0"}
     * }
     *  岛屿数量 1
     */

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    res++;
                    dfs(grid, r, c);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid,int r,int c){
        //处于网格边缘
        if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
            return ;
        }
        //若不是岛屿
        if( grid[r][c] !='1'){
            return ;
        }
        //将方格标记为"已遍历"
        grid[r][c] = 2;
        //上边相邻
        dfs(grid,r-1,c);
        //下边相邻
        dfs(grid,r+1,c);
        //右边相邻
        dfs(grid,r,c+1);
        //左边相邻
        dfs(grid,r,c-1);

    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'1','1','0','0','0'}};

    岛屿的数量_200 s = new 岛屿的数量_200();
        System.out.println(s.numIslands(grid));
    }
}


