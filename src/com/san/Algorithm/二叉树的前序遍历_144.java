package com.san.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/30/23:22
 */
public class 二叉树的前序遍历_144 {

    /**
     * 前序遍历为 root -> left -> right
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node==null){
                continue;
            }
            res.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }
        return res;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }

}
