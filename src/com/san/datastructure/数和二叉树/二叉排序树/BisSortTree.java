package com.san.datastructure.数和二叉树.二叉排序树;



/**
 * @Auther: Gxyx
 * @Date: 2020/12/17/14:58
 */
public class BisSortTree {
    //二叉排序树根节点
    protected BiNode<Integer> root;

    /**
     * 查找
     * @param root
     * @param key
     * @return
     */
    public BiNode searchBST(BiNode root,Integer key){
        //如果跟节点为空，返回NULL
        if (root == null){
            return null;
        }
        //如果key等于根节点，返回根节点
        if ((Integer) root.getData() == key.intValue()){
            return root;
        //key小于跟节点
        }else if((Integer)root.getData()>key){
            return searchBST(root.getlChild(),key);
        //key大于根节点
        }else {
            return searchBST(root.getrChild(),key);
        }

    }

    /**
     * 二叉排序树的插入
     * @param newRoot
     * @param element
     */
    public void insterBST(BiNode<Integer>newRoot,Integer element){
        //空树生成新的根节点
        if (newRoot == null) {
            this.root = new BiNode<Integer>(element);
        }else {
            if (newRoot.getData()>element){
                if (newRoot.getlChild()==null){
                    newRoot.setlChild(new BiNode<Integer>(element));
                }else {
                    insterBST(newRoot.getlChild(),element);
                }
            }else {
                if (newRoot.getrChild()==null){
                    newRoot.setrChild(new BiNode<>(element));
                }else {
                    insterBST(newRoot.getrChild(),element);
                }
            }
        }

        }

    /**
     * 构造二叉树
     * @param record
     * @param n
     */
    public void BinarySearchTree(int[] record, int n){
            for (int i=0;i<n;i++){
                insterBST(root,record[i]);
            }
        }

    /**
     * 删除根节点
     * @param node
     * @param parent
     */
    public void deleteBST(BiNode node,BiNode parent){
        //删除结点为叶子节点
        if (node.getlChild() ==null && node.getrChild()==null){
            parent.setlChild(null);
        //删除的结点只有左子树
        }else if (node.getrChild()==null){
            parent.setlChild(node.getlChild());
        //删除结点只有右子树
        }else if (node.getlChild()==null){
            parent.setlChild(node.getrChild());
        //删除结点具有左右子树
        }else{
            BiNode replacePar = node;
            BiNode replaceNode = node.getrChild();
            //查找删除结点最左下的结点
            while (replaceNode.getlChild()!=null){
                replacePar = replaceNode;
                replaceNode = replaceNode.getlChild();
            }
            //删除结点数据替换
            node.setData(replaceNode.getData());
            //删除结点右孩子无左子树
            if (replacePar==node){
                replacePar.setrChild(replaceNode.getrChild());
            }else {
                replacePar.setlChild(replaceNode.getrChild());
            }
        }
    }
}
