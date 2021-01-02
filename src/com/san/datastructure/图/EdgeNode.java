package com.san.datastructure.图;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/02/22:48
 * 边表结点
 */
public class EdgeNode {
    //邻接结点域
    private int adjvex;
    //邻接结点后继引用域
    private EdgeNode next;

    public EdgeNode(int adjvex){
        this.adjvex = adjvex;
    }

    public int getAdjvex() {
        return adjvex;
    }

    public void setAdjvex(int adjvex) {
        this.adjvex = adjvex;
    }

    public EdgeNode getNext() {
        return next;
    }

    public void setNext(EdgeNode next) {
        this.next = next;
    }
}
