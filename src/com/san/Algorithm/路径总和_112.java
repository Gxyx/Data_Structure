package com.san.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/21:07
 */
public class 路径总和_112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    /**
     * BFS队列
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        root.val = sum - root.val;
        queNode.add(root);
        while (!queNode.isEmpty()) {
            TreeNode node = queNode.poll();
            if (node.left == null && node.right == null && node.val == 0){
                return true;
        }
        if (node.left != null) {
            node.left.val = node.val - node.left.val;
            queNode.add(node.left);
        }
        if (node.right != null) {
            node.right.val = node.val - node.right.val;
            queNode.add(node.right);
        }
    }
        return false;
    }

    /**
     * @param root
     * @param sum
     * @return
     */
        public boolean hasPathSum2(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            Queue<TreeNode> queNode = new LinkedList<TreeNode>();
            Queue<Integer> queVal = new LinkedList<Integer>();
            queNode.offer(root);
            queVal.offer(root.val);
            while (!queNode.isEmpty()) {
                TreeNode now = queNode.poll();
                int temp = queVal.poll();
                if (now.left == null && now.right == null) {
                    if (temp == sum) {
                        return true;
                    }
                    continue;
                }
                if (now.left != null) {
                    queNode.offer(now.left);
                    queVal.offer(now.left.val + temp);
                }
                if (now.right != null) {
                    queNode.offer(now.right);
                    queVal.offer(now.right.val + temp);
                }
            }
            return false;
        }


}
