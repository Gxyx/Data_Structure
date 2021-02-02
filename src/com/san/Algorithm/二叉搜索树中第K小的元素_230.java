package com.san.Algorithm;



import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/21:46
 */
public class 二叉搜索树中第K小的元素_230 {

    /**
     * 输入: root = [3,1,4,null,2], k = 1
     *    3
     *   / \
     *  1   4
     *   \
     *    2
     * 输出: 1
     *
     * 中序遍历
     * @param root
     * @return
     */
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr){
        if (root == null) return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
        return nums.get(k-1);
    }

    /**
     * 迭代
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest1(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }

    /**
     * 中序遍历
     */
    private int cnt = 0;
    private int val;

    public int kthSmallest2(TreeNode root, int k) {
        inOrder(root, k);
        return val;
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null) return;
        inOrder(node.left, k);
        cnt++;
        if (cnt == k) {
            val = node.val;
            return;
        }
        inOrder(node.right, k);
    }

}
