package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/05/16:38
 */
public class 被围绕的区域_130 {
    private int m,n;

    /**
     * 先从矩形的四条边由外层向内层dfs,遇到为O的字符，设为T
     * 注意如果某个元素经过上述步骤后还是O则代表它被X包围
     * 为T字符的元素不能被染色为X
     * 最后遍历二维数组，字符为T的变为O,字符为O的变为X
     */
    public void solve(char[][] board) {
        if (board == null||board.length==0){
            return;
        }
        m = board.length;
        n= board[0].length;
        // 搜索左右边界
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);  //第一列
            dfs(board, i, n - 1);//最后一列
        }
        // 搜索上下边界
        for (int i = 0; i < n; i++) {
            dfs(board, 0, i);    //第一行
            dfs(board, m - 1, i); //最后一行
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }


    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'T';
        dfs(board,r-1,c);
        dfs(board,r+1,c);
        dfs(board,r,c-1);
        dfs(board,r,c+1);
    }

    public static void main(String[] args) {
        char[][] board = {
                {'X','X','X','X','X'},
                {'X','X','O','O','X'},
                {'X','X','X','O','X'},
                {'X','X','O','X','X'}};
        被围绕的区域_130 s = new 被围绕的区域_130();
        s.solve(board);
    }
}
