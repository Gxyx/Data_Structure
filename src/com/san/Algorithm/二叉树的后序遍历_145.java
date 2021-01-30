package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/30/23:29
 */
public class 二叉树的后序遍历_145 {

    /**
     * 后序遍历为 left -> right -> root
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
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
        Collections.reverse(res);
        return res;
    }

    public static void postOrderIteration(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }


}
