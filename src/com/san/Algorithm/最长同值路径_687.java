package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/28/22:09
 */
public class 最长同值路径_687 {

    /**
     *               5
     *              / \
     *             4   5
     *            / \   \
     *           1   1   5
     *
     *           output = 2
     */

    private int ans;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        univaluePath(root);
        return ans;
    }

    private int univaluePath(TreeNode root) {
        if (root == null) return 0;
        int l = univaluePath(root.left);
        int r = univaluePath(root.right);
        int pl = 0;
        int pr = 0;
        if (root.left != null && root.val == root.left.val) pl = l + 1;
        if (root.right != null && root.val == root.right.val) pr = r + 1;
        ans = Math.max(ans, pl + pr);
        return Math.max(pl, pr);
    }
}
