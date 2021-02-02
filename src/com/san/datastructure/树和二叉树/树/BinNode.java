package com.san.datastructure.树和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/19:58
 */
public class BinNode<T>{
    //数据域
    private T data;
    //定义结点左右孩子引用域
    private BinNode<T> lChild,rChild;
    //构造数据域为element值的结点
    public BinNode(T element){
        this.data = element;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinNode<T> getlChild() {
        return lChild;
    }

    public void setlChild(BinNode<T> lChild) {
        this.lChild = lChild;
    }

    public BinNode<T> getrChild() {
        return rChild;
    }

    public void setrChild(BinNode<T> rChild) {
        this.rChild = rChild;
    }
}
