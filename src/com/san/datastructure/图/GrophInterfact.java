package com.san.datastructure.图;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/17/20:24
 */
public interface GrophInterfact<T> {
    //深度优先遍历
    public void DFS(int startIndex);
    //广度优先遍历
    public void BFS(int startIndex);
}
