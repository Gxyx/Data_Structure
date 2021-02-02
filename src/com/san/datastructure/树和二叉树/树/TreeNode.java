package com.san.datastructure.树和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/12:39
 */
public class TreeNode<T> {
    //数据域
    private T data;
    //孩子链表头引用

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
