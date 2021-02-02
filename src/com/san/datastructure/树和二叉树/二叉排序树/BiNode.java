package com.san.datastructure.树和二叉树.二叉排序树;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/17/15:02
 */
public class BiNode<T> {
    private T data;
    private BiNode<T> lChild,rChild;
    public BiNode(T element){
        this.data = element;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BiNode<T> getlChild() {
        return lChild;
    }

    public void setlChild(BiNode<T> lChild) {
        this.lChild = lChild;
    }

    public BiNode<T> getrChild() {
        return rChild;
    }

    public void setrChild(BiNode<T> rChild) {
        this.rChild = rChild;
    }
}
