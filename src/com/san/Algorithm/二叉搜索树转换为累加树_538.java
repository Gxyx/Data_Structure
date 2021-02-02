package com.san.Algorithm;

import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/22:10
 */
public class 二叉搜索树转换为累加树_538 {
    /**
     * 先遍历右子树 递减
     *     2
     *    / \
     *   3   5
     *
     *     8
     *    / \
     *   10  5
     * @param root
     * @return
     */
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum = sum + root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }


    public TreeNode convertBST1(TreeNode root) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode head = root;
        while(root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.right;
            }
                TreeNode node = stack.pop();
                node.val += sum;
                sum = node.val;
                root = node.left;
        }
        return head;
    }
}
