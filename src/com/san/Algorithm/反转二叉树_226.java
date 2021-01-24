package com.san.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/24/20:19
 */
public class 反转二叉树_226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode invertTree1(TreeNode root) {
        //递归的边界条件判断
        if (root == null)
            return null;
        //先交换子节点
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        //递归调用
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    /**
     * BFS 非递归
     * 二叉树层序遍历
     */
    public void levelOrder(TreeNode tree) {
        if (tree == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);//相当于把数据加入到队列尾部
        while (!queue.isEmpty()) {
            //poll方法相当于移除队列头部的元素
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);//相当于把数据加入到队列尾部
        while (!queue.isEmpty()) {
            //poll方法相当于移除队列头部的元素
            TreeNode node = queue.poll();
            //先交换子节点
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return root;
    }

}
