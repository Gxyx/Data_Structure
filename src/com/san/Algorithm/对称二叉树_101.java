package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/26/22:43
 */
public class 对称二叉树_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        //比较左节点，右节点
        return isSymmetric(root.left,root.right);
    }


    public boolean isSymmetric(TreeNode left, TreeNode right) {
        //递归的终止条件:两个节点都为空
        // 两个节点中有一个为空
        // 两个节点的值不相
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        //递归 比较 左节点的左孩子 和 右节点的右孩子
        // 比较 左节点的右孩子 和 右节点的左孩子
        return isSymmetric(left.left,right.right) && isSymmetric(right.left,left.right);
    }
}
