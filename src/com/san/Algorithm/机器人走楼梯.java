package com.san.Algorithm;

public class 机器人走楼梯 {
    public static void main(String[] args) {
        System.out.println(solve(2,3));
    }
    public static int solve(int x,int y){
        if (x==1||y==1){
            return 1;
        }
        return solve(x-1,y)+solve(x,y-1);
    }
    public static int solve1(int m,int n){
        int[][] state = new int[m+1][n+1];
        for ( int i =1;i<=n;i++){
            state[1][i]  =1;
        }
        for ( int i =1;i<=m;i++){
            state[i][1]  =1;
        }
        for (int i =2;i<=m;i++){
            for (int j=2;j<=n;j++){
                state[i][j] = state[i][j-1]+state[i-1][j];
            }
        }
        return state[m][n];
    } 
}
