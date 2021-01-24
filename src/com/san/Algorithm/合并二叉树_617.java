package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/20:53
 */
public class 合并二叉树_617 {

    /**
     * 修改t1结构
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // t1为空，合并之后就应该是t2
        if (t1 == null) return t2;
        // t2为空，合并之后就应该是t1
        if (t2 == null) return t1;
        // 修改了t1的数值和结构
        // 中
        t1.val += t2.val;
        // 左
        t1.left = mergeTrees(t1.left, t2.left);
        // 右
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    /**
     * 新建一个树
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }

}
