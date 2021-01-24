package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/18:55
 */
public class 平衡二叉树_110 {
    /**
     * 任意节点的子树的高度差都小于等于1
     * 自底向上
     * 对于当前遍历到的节点，先递归地判断其左右子树是否平衡，再判断以当前节点为根的子树是否平衡。
     */
    public boolean isBalanced(TreeNode root) {
        return height(root )>=0;
    }

    public int height(TreeNode root){
        if (root == null){
             return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (left == -1 || right == -1 || Math.abs(left-right)>1){
            return -1;
        }else {
            return Math.max(left,right)+1;
        }
    }

    /**
     * 自顶向下
     * 首先计算左右子树的高度，如果左右子树的高度差是否不超过 1，再分别递归地遍历左右子节点，并判断左子树和右子树是否平衡.
     * @param root
     * @return
     */
    public boolean isBalanced1(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

}
