package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/21:07
 */
public class 路径总和_112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
