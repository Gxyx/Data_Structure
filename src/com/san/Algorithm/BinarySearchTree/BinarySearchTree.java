package com.san.Algorithm.BinarySearchTree;




/*
   二叉搜索树，是指一棵空树或者具有下列性质的二叉树：


    1、若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
    2、若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值；
    3、任意节点的左，右子树也分别为二叉搜索树；
    4、没有键值相等的节点。

 */
public class BinarySearchTree {

    private class Node{
        //数据域
        int data;
        //右子树
        Node right;
        //左子树
        Node left;
    }
    //根节点

    private Node root;


    //创建树
    public void insert(int key)
    {
        Node p=new Node(); //待插入的节点
        p.data=key;

        if(root==null)
        {
            root=p;
        }
        else
        {
            Node parent=new Node();
            Node current=root;
            while(true)
            {
                parent=current;
                if(key>current.data)
                {
                    current=current.right; // 右子树
                    if(current==null)
                    {
                        parent.right=p;
                        return;
                    }
                }
                else //本程序没有做key出现相等情况的处理，暂且假设用户插入的节点值都不同
                {
                    current=current.left; // 左子树
                    if(current==null)
                    {
                        parent.left=p;
                        return;
                    }
                }
            }
        }
    }
}
