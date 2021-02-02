package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/22:47
 */
public class 二叉搜索树的最近公共祖先_236 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null){
            return root;
        }

        if (left == null) return right;
        if (right == null) return left;

        return null;

    }
}
