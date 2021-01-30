package com.san.Algorithm;

import java.util.*;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/30/23:35
 */
public class 二叉树的中序遍历_94 {
    /**
     * 中序遍历为 left -> root -> right
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
