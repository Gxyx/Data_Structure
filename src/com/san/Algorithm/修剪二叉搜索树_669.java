package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/21:03
 * 二叉搜索树：根节点大于等于左子树所有节点，小于等于右子树所有节点。
 * 中序遍历有序
 */
public class 修剪二叉搜索树_669 {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        //如果根结点太小，根结点的左子树的所有结点只会更小，说明根结点及其左子树都应该剪掉，因此直接返回右子树的修剪结果。
        if (root.val<low) return trimBST(root.right,low,high);
        //如果根结点太大，根结点的右子树的所有结点只会更大，说明根结点及其右子树都应该剪掉，因此直接返回左子树的修剪结果。
        if (root.val>high)return trimBST(root.left,low,high);
        //合适 就去裁剪左右子节点.
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
