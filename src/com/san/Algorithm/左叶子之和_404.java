package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/28/21:54
 */
public class 左叶子之和_404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + sum;
    }
}
