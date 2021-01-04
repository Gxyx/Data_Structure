package com.san.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/04/21:30
 */
public class 二进制矩阵中的最短路径_1091 {

    //八个方向
    private static int[][] directions = {{0,1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {-1, -1}, {-1, 0}, {-1, 1}};
    private int row, col;
    public int shortestPathBinaryMatrix(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        //左上角和右上角都为1则不能到达
        if(grid[0][0] == 1 || grid[row - 1][col - 1] == 1){
            return -1;
        }
        Queue<int[]> pos = new LinkedList<>();
        //直接用grid[i][j]记录从起点到这个点的最短路径长。按照题意 起点也有长度1
        grid[0][0] = 1;
        pos.add(new int[]{0,0});
        while (!pos.isEmpty() && grid[row-1][col-1] == 0){
            int[] xy = pos.remove();
            //当前点的路径长度
            int preLength = grid[xy[0]][xy[1]];
            //遍历八个方向
            for (int i =0;i<8;i++){
                int newX = xy[0] + directions[i][0];
                int newY = xy[1] + directions[i][1];
                if(inGrid(newX, newY) && grid[newX][newY] == 0){
                    pos.add(new int[]{newX, newY});
                    // grid[newX][newY]!=0,就不会被重复访问
                    // 下一个点的路径长度要+1
                    grid[newX][newY] = preLength + 1;
                }
            }

        }
        /**
         * 循环结束：
         *      1、搜索完成但没有到达右下角，此时 grid[row - 1][col - 1] == 0
         *      2、可能是已经找到到达右下角的路径 grid[row - 1][col - 1]
         *      return grid[row - 1][col - 1] == 0 ? -1 : grid[row - 1][col - 1];
         */
        if (grid[row - 1][col - 1] == 0){
            return -1;
        }else {
            return grid[row - 1][col - 1];
        }

    }

    /**
     * 判断某个点是否在矩形范围内
     * @param x
     * @param y
     * @return
     */
    private boolean inGrid(int x, int y){
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
        二进制矩阵中的最短路径_1091 s = new 二进制矩阵中的最短路径_1091();
        System.out.println(s.shortestPathBinaryMatrix(grid));
    }
}
