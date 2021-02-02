package com.san.datastructure.树和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/12:16
 * 双亲表示法
 */
public class ParentNode<T> {
    //数据域
    private T data;
    //结点双亲下标
    private int parent;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }


}
