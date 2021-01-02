package com.san.datastructure.图;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/02/22:46
 * 邻接表
 */
public class VertexNode<T>{
    //顶点表结点
    private T vertex;
    //数据域
    private EdgeNode first;

    public VertexNode() {
        this.vertex = null;
        this.first = null;
    }

    public VertexNode(T vertex) {
        this.vertex = vertex;
        first = null;
    }

    public T getVertex() {
        return vertex;
    }

    public void setVertex(T vertex) {
        this.vertex = vertex;
    }

    public EdgeNode getFirst() {
        return first;
    }

    public void setFirst(EdgeNode first) {
        this.first = first;
    }
}
