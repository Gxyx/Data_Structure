package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/05/20:16
 */
public class 水流问题_417 {
    private int[][] direction = {{-1,0},{0,1},{0,-1},{1,0}};
    private int m,n;
    private int[][] matrix;


    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> ret = new ArrayList<>();
        if (matrix == null||matrix.length==0){
            return ret;
        }
        m = matrix.length;
        n = matrix[0].length;
        this.matrix = matrix;
        //表示大西洋/太平洋访问状态
        boolean[][] canReachP = new boolean[m][n];
        boolean[][] canReachA = new boolean[m][n];
        // 搜索左右边界
        for (int i = 0; i < m; i++) {
            dfs(i, 0, canReachP);
            dfs(i, n - 1, canReachA);
        }
        // 搜索上下边界
        for (int i = 0; i < n; i++) {
            dfs(0, i, canReachP);
            dfs(m - 1, i, canReachA);
        }
        for (int i=0;i < m;i++){
            for (int j=0;j<n;j++){
                if (canReachP[i][j] && canReachA[i][j]){
                    //ret.add(Arrays.asList(i, j));
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ret.add(temp);
                }
            }
        }
        return ret;
    }
    /**
     * 从边界往里面走，只能走到比自己更高或者等高的地方。
     * 边界能走到的地方，就是能流入对应海洋的地方
     * @param r
     * @param c
     * @param canReach 大西洋/太平洋相邻的点可以访问到的点
     */
    private void dfs(int r, int c, boolean[][] canReach) {
        if (canReach[r][c]) {
            return;
        }
        canReach[r][c] = true;
        for (int i=0;i<4;i++){
            int nextR = direction[i][0] + r;
            int nextC = direction[i][1] + c;
            //在矩形内isIn(nextR, nextC)，高度比当前点更高或者相等matrix[r][c] <= matrix[nextR][newC]且还没有访问过
            if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n
                    || matrix[r][c] > matrix[nextR][nextC]) {
                continue;
            }
            dfs(nextR, nextC, canReach);
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
        };
        水流问题_417 s = new 水流问题_417();
        System.out.println(s.pacificAtlantic(matrix));
    }
}
