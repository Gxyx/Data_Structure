package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/26/22:26
 */
public class 另一颗树_572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) return true;
        if (s == null) return false;
        return isSubtree(s.left, t) || isSubtree(s.right, t) || isSameTree(s,t);
    }

    /**
     * 判断树是否相等
     * @param s
     * @param t
     * @return
     */
    public boolean isSameTree(TreeNode s, TreeNode t){
        if (t == null && s == null) return true;
        if (s == null || t == null) return false;
        if (s.val!=t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
