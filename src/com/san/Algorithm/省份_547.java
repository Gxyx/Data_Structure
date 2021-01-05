package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/05/16:02
 */
public class 省份_547 {
    /**
     *     有 n 个城市，其中一些彼此相连，另一些没有相连。
     *     如果城市 a 与城市 b 直接相连，且城市 b 与城市 c 直接相连，那么城市 a 与城市 c 间接相连。
     *     省份 是一组直接或间接相连的城市，组内不含其他没有相连的城市。
     *
     *     邻接矩阵：图的连通快
     *     {
     *     {1,1,0},
     *     {1,1,0},
     *     {0,0,1}
     *     }
     *     2
     */
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;

    }

    /**
     * 连通块就是可以从任意起点到达的所有节点
     * 连通块的个数，从每个未被访问的节点开始深搜，每开始一次搜索就增加 countcount 计数器一次。
     * @param isConnected
     * @param visited
     * @param i
     */
    public void dfs(int[][] isConnected ,int[] visited,int i){
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == 0){
                //标记第i个元素被访问过
                visited[j] = 1;
                dfs(isConnected,visited,j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},
                               {1,1,0},
                               {0,0,1}
        };

        省份_547 s = new 省份_547();
        System.out.println(s.findCircleNum(isConnected));
    }
}
