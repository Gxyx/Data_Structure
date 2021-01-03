package com.san.datastructure.图;

import com.san.datastructure.栈和队列.queen.CircularQueue;
import com.san.datastructure.栈和队列.queen.QueueInterface;

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
     * 广度优先遍历
     * @param startIndex
     */
    @Override
    public void BFS(int startIndex) throws Exception {
        //初始化访问数组
        visited = new boolean[vertices_num];
        QueueInterface<Integer> queue = new CircularQueue<Integer>();
        //临时变量，储存出队顶点编号
        int front_vertex;
        //输出访问结点
        System.out.println(vertices[startIndex].toString()+" ");
        //标记访问结点
        visited[startIndex]= true;
        //访问结点入队
        queue.enQueue(startIndex);
        while (!queue.isEmpty()){
            //对头顶点元素出队
            front_vertex = queue.deQueue();
            for (int i =0;i<vertices_num;i++){
                if (adjMatrix[front_vertex][i] == 1&& !visited[i]){
                    System.out.println(vertices[i].toString()+" ");
                    visited[i] = true;
                    queue.enQueue(i);
                }
            }
        }
    }

    /**
     * 最小生成树 Prim算法
     * @param startIndex
     */
    public void prim(int startIndex){
        //候选最短边临接点数组
        int adjvex[] = new int[vertices_num];
        //侯选最短边的权值数组
        int lowcost[] = new int[vertices_num];
        for (int i=0;i<vertices_num;i++){
            lowcost[i] = adjMatrix[startIndex][i];
            adjvex[i] = startIndex;
        }
        for (int i=1;i<vertices_num;i++){
            //获取最短边的邻接点
            int minIndex = getMin(lowcost);
            System.out.println("生成树第 "+i+" 条边："+vertices[adjvex[minIndex]]+"--"+vertices[minIndex]+" : "+lowcost[minIndex]);
            lowcost[minIndex] = 0;
            for (int j=0;j<vertices_num;j++){
                if (adjMatrix[j][minIndex]!=-1&&(lowcost[j]==-1||adjMatrix[j][minIndex]<lowcost[j])){
                    lowcost[j] = adjMatrix[j][minIndex];
                    adjvex[j] = minIndex;
                }
            }
        }
    }

    private int getMin(int[] lowcost) {
        return 0;
    }
}
