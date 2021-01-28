package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/28/23:24
 */
public class 二叉树中第二小的节点_671 {
    /**
     * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为2或0。
     * 如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
     *
     * 如果有子节点，那么根节点是最小的节点。
     */
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return -1;
        int leftVal = root.left.val;
        int rightVal = root.right.val;
        if (leftVal == root.val) leftVal = findSecondMinimumValue(root.left);
        if (rightVal == root.val) rightVal = findSecondMinimumValue(root.right);
        if (leftVal != -1 && rightVal != -1) return Math.min(leftVal, rightVal);
        if (leftVal != -1) return leftVal;
        return rightVal;
    }
}
