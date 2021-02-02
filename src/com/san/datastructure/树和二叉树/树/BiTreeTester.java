package com.san.datastructure.树和二叉树.树;

import com.san.datastructure.线性表.SequentialList;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/21:11
 */
public class BiTreeTester {
    public static void main(String[] args) throws Exception {
        BinaryTreeInterface biTree = new BinaryTree();
        String[] initialList = {"A","B","#","D","#","#","C","#","#",};
        SequentialList<String> treeElement = new SequentialList(initialList,initialList.length);
        biTree.creatBiTree(treeElement);
        System.out.println("二叉树前序遍历：");
        biTree.preOrder();
        System.out.println("二叉树中序遍历：");
        biTree.inOrder();
        System.out.println("二叉树后序遍历：");
        biTree.postOrder();
        System.out.println("二叉树层次遍历：");
        biTree.levelOrder();
        System.out.println("=====================");
        biTree.iteratorpostOrder();
        System.out.println("====================");
        biTree.iteratorPreOrder();
        System.out.println("====================");
        biTree.iteratorinOrder();
    }
}
