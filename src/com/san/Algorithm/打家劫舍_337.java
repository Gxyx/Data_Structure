package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/28/23:17
 */
public class 打家劫舍_337 {

    /**
     * 暴力递归 - 最优子结构
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        if (root == null) return 0;

        int money = root.val;
        if (root.left != null) {
            money += (rob(root.left.left) + rob(root.left.right));
        }

        if (root.right != null) {
            money += (rob(root.right.left) + rob(root.right.right));
        }

        return Math.max(money, rob(root.left) + rob(root.right));
    }

}
