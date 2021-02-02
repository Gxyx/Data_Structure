package com.san.datastructure.树和二叉树.树;

import com.san.datastructure.线性表.SequentialList;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/13:04
 */
public interface BinaryTreeInterface<T>{
    /**
     * 前序遍历
     */
    public void preOrder();
    public void iteratorPreOrder() throws Exception;
    /**
     * 中序遍历
     */
    public void inOrder();
    public void iteratorinOrder() throws Exception;
    /**
     * 后序遍历
     */
    public void postOrder();
    public void iteratorpostOrder() throws Exception;
    /**
     * 层序遍历
     */
    public void levelOrder() throws Exception;

    /**
     * 前序遍历构建二叉树
     * @param treeElement
     */
    public void creatBiTree(SequentialList<T> treeElement) throws Exception;
}
