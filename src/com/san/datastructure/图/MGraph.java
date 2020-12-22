package com.san.datastructure.图;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/17/20:26
 */
public class MGraph<T> implements GrophInterfact<T> {
    //图的顶点
    protected int vertices_num;
    //图的边数
    protected int edge_num;
    //存储图的顶点
    protected T[] vertices;
    //邻接矩阵
    protected int[][] adjMatrix;
    //访问数组的标志数组
    boolean[] visited;

    /**
     * 图的初始化
     * @param init_vertices  顶点数据信息
     * @param n     顶点个数
     * @param e     边的个数
     */
    public MGraph(T[] init_vertices,int n,int e) throws GraphException {
        if(n==0){
            throw new GraphException("无顶点，图构造失败");
        }
        //初始化顶点个数
        vertices_num = n;
        //初始化边的个数
        this.edge_num = e;
        //顶点数组
        this.vertices = (T[]) new Object[vertices_num];
        //邻接矩阵分配方法
        this.adjMatrix = new int[vertices_num][vertices_num];

        //初始化顶点数组
        for (int i= 0;i<n;i++){
            vertices[i] = init_vertices[i];
        }

        //初始化邻接矩阵
        if (edge_num>0){
            Scanner reader = new Scanner(System.in);
            for (int i =1;i<=e;i++){
                System.out.println("输入第 "+i+" 条边第1个顶点信息");
                int vertex1 = reader.nextInt();
                System.out.println("输入第 "+i+" 条边第2个顶点信息");
                int vertex2 = reader.nextInt();
                adjMatrix[vertex1][vertex2] = 1;
                adjMatrix[vertex2][vertex1] = 1;
            }
        }
    }

    /**
     * 深度优先遍历
     * @param startIndex
     */
    @Override
    public void DFS(int startIndex) {
        //初始化访问数组标志
        visited = new boolean[vertices_num];
        iteratorDFT(startIndex);
    }

    /**
     * 深度优先递归实现
     * @param startIndex
     */
    private void iteratorDFT(int startIndex){
        //输出访问顶点
        System.out.println(vertices[startIndex].toString()+" ");
        //标识过顶点已经被访问
        visited[startIndex] = true;
        for (int i =0;i<vertices_num;i++){
            if (adjMatrix[startIndex][i] ==1&&!visited[i]){
                iteratorDFT(i);
            }
        }
    }

    /**
     * 广度优先
     * @param startIndex
     */
    @Override
    public void BFS(int startIndex) {
    }
}
