package com.san.datastructure.树和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/12:42
 * 孩子兄弟表示法
 */
public class CSNode<T>{
    //定义结点数据域
    private T data;
    //引用第一个孩子结点
    private ChildNode firstChild;
    //引用此节点的下一个兄弟结点
    private ChildNode rightsib;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ChildNode getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(ChildNode firstChild) {
        this.firstChild = firstChild;
    }

    public ChildNode getRightsib() {
        return rightsib;
    }

    public void setRightsib(ChildNode rightsib) {
        this.rightsib = rightsib;
    }
}
