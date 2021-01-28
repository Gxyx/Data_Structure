package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/28/21:19
 */
public class 二叉树的最小深度_111 {

    /**
     * 叶子节点的定义是左孩子和右孩子都为 null 时叫做叶子节点
     *
     * 最小深度是指树的根结点到最近叶子结点的最短路径上结点的数量
     *
     * 当 root 节点左右孩子都为空时，返回 1
     * 当 root 节点左右孩子有一个为空时，返回不为空的孩子节点的深度
     * 当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        //左孩子和有孩子都为空的情况，说明到达了叶子节点，返回1
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //如果左孩子和由孩子其中一个为空，那么需要返回比较大的那个孩子的深度
        if (root.left == null || root.right == null) return left+right+1;
        //左右孩子都不为空，返回最小深度+1
        return Math.min(left,right)+1;

    }

}
