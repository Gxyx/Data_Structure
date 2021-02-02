package com.san.datastructure.树和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/01/16:59
 * flag = 1表示遍历完左子树，栈顶不能出栈；
 * flag = 2表示遍历完右子树，栈顶可以出栈并可以访问
 */
public class FlagBiNode {
    private BinNode node;
    private int flag;

    public FlagBiNode(BinNode node,int flag){
        this.node = node;
        this.flag = flag;
    }

    public BinNode getNode() {
        return node;
    }

    public void setNode(BinNode node) {
        this.node = node;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "FlagBiNode{" +
                "node=" + node +
                ", flag=" + flag +
                '}';
    }
}
