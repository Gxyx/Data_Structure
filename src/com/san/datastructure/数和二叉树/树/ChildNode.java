package com.san.datastructure.数和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/12:33
 * 孩子表示法
 */
public class ChildNode<T>{
    //结点对应头结点的下标
    private int child;
    //引用下一个孩子
    private ChildNode next;

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public ChildNode getNext() {
        return next;
    }

    public void setNext(ChildNode next) {
        this.next = next;
    }



}
