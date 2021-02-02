package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/22:37
 */
public class 二叉搜索树的最近公共祖先_235 {

    /**
     *         _______6______
     *       /                \
     *   ___2__             ___8__
     *  /      \           /      \
     * 0        4         7        9
     *         /  \
     *        3   5
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果两个节点值都小于根节点，说明他们都在根节点的左子树上，往左子树上找
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        //如果两个节点值都大于根节点，说明他们都在根节点的右子树上，往右子树上找
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        //如果一个节点值大于根节点，一个节点值小于根节点，说明他们他们一个在根节点的左子树上一个在根节点的右子树上，那么根节点就是他们的最近公共祖先节点。
        return root;
    }
}
