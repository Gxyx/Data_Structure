package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/19:43
 */
public class 二叉树的直径_543 {
    /**
     *           1
     *          / \
     *         2   3
     *        / \
     *       4   5
     *
     *       3   [4,2,1,3] 或者 [5,2,1,3]
     */
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    public int height(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (left+right>max){
            max = left+right;
        }
        return Math.max(left,right)+1;
    }
}
