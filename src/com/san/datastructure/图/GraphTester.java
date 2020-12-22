package com.san.datastructure.图;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/18/16:42
 */
public class GraphTester {
    public static void main(String[] args) throws GraphException {
        String[] init_vertices = {"A","B","C","D"};
        System.out.println("无向图测试：");
        //GrophInterfact<String> groph = new MGraph<String>(init_vertices,4);
        GrophInterfact<String> groph = new MGraph<>(init_vertices,4,4);
        System.out.println("深度优先遍历：");
        groph.DFS(0);
    }
}
