package com.san.datastructure.图;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/02/23:10
 */
public class ALGraphtTester {
    public static void main(String[] args) throws Exception {
        String[] init_vertices = {"A", "B", "C", "D"};
        System.out.println("无向图测试");
        //输入边：{0, 1}, {0, 2}, {1, 3}, {2, 3}
        GrophInterfact<String> graph = new ALGrapht<>(init_vertices, init_vertices.length, 4);
        System.out.println("深度优先遍历结果：");
        graph.DFS(0);
        System.out.println("广度优先遍历结果：");
        graph.BFS(0);
    }
}
