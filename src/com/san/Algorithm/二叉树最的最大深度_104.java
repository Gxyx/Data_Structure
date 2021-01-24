package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/18:36
 */
public class 二叉树最的最大深度_104 {

    /**
     *     3
     *    / \
     *   2  7
     *  /  \
     * 3   4
     *    /  \
     *   5   6
     *    H = 1 + max((2),(7)) = 4
     *            ↑
     *    H(2) = 1 + max((3),(4)) = 3
     *            ↑
     *    H(3) = 1 + max(0,0) = 1
     *    H(4) = 1 + max((5),(6)) = 2
     *            ↑
     *    H(5) = 1 + max(0,0) = 1
     *    H(6) = 1 + max(0,0) = 1
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right)+1;
        }

    }

}
