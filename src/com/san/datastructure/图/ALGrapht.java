package com.san.datastructure.图;

import com.san.datastructure.栈和队列.queen.CircularQueue;
import com.san.datastructure.栈和队列.queen.QueueInterface;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/02/22:59
 */
public class ALGrapht<T> implements GrophInterfact<T>{
    //图顶点表数组
    protected VertexNode[] vertices;
    //顶点个数
    protected int vertices_num;
    //边个数
    protected int edge_num;
    //访问标志数组
    boolean[] visited;

    public ALGrapht(T[] init_vertices, int n, int e) throws Exception {
        if (init_vertices.length == 0) {
            throw new Exception("无顶点，图构造失败");
        }
        //初始化顶点个数
        this.vertices_num = n;
        //初始化边个数
        this.edge_num = e;
        //分配顶点表数组空间
        this.vertices = new VertexNode[vertices_num];
        //顶点表初始化
        for (int i = 0; i < n; i++) {
            vertices[i] = new VertexNode<T>(init_vertices[i]);
        }
        //初始化边表
        if (edge_num > 0) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 1; i <= edge_num; i++) {
                System.out.println("输入第" + i + "条边的第1个顶点信息");
                //弧尾下标
                int vertex1 = scanner.nextInt();
                System.out.println("输入第" + i + "条边的第2个顶点信息");
                //弧头下标
                int vertex2 = scanner.nextInt();
                //生成边表结点
                EdgeNode edgeNode = new EdgeNode(vertex2);
                //结点插入表头
                edgeNode.setNext(vertices[vertex1].getFirst());
                vertices[vertex1].setFirst(edgeNode);
            }
            scanner.close();
        }
    }

    /**
     * 深度优先遍历递归算法
     * O(N+E)
     * @param startIndex
     */
    @Override
    public void DFS(int startIndex) {
        visited = new boolean[vertices_num];
        iteratorDFS(startIndex);
        System.out.println();
    }

    /**
     * 深度优先遍历递归算法
     * O(N+E)
     * @param startIndex
     */
    public void iteratorDFS(int startIndex) {
        VertexNode<T> vertexNode = vertices[startIndex];
        System.out.print(vertexNode.getVertex().toString() + " ");
        //标识结点已被访问
        visited[startIndex] = true;
        //p引用边表的第一个结点
        EdgeNode p = vertexNode.getFirst();
        while (p != null) {
            //取出边表第一元素顶点数
            int vertexIndex = p.getAdjvex();
            if (!visited[vertexIndex]) {
                iteratorDFS(vertexIndex);
            }
            p = p.getNext();
        }
    }

    /**
     * 广度遍历算法
     * O(N+E)
     */
    @Override
    public void BFS(int startIndex) throws Exception {
        VertexNode<T> vertexNode = vertices[startIndex];
        System.out.print(vertexNode.getVertex().toString() + " ");
        //初始化访问标志数组
        visited = new boolean[vertices_num];
        //工作队列初始化
        QueueInterface<Integer> queue = new CircularQueue<>();
        //标识结点已被访问
        visited[startIndex] = true;
        //被访问过的顶点编号入队
        queue.enQueue(startIndex);;
        while(!queue.isEmpty()) {
            //队头顶点编号出队
            int index = queue.deQueue();
            VertexNode<T> node = vertices[index];
            EdgeNode p = node.getFirst();
            while(p != null) {
                int vertexIndex = p.getAdjvex();
                if (!visited[vertexIndex]) {
                    System.out.print(vertices[vertexIndex].getVertex().toString() + " ");
                    visited[vertexIndex] = true;
                    queue.enQueue(vertexIndex);
                }
                p = p.getNext();
            }
        }
    }
}
