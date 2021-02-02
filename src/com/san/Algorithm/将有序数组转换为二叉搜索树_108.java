package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/22:59
 */
public class 将有序数组转换为二叉搜索树_108 {

    /**
     * 给定有序数组: [-10,-3,0,5,9],
     *
     * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
            return toBST(nums,0,nums.length-1);
    }

    public TreeNode toBST(int[] nums, int start, int end){
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        //以该元素左边的升序序列构建左子树
        node.left =  toBST(nums, start, mid - 1);
        //以该元素右边的升序序列构建右子树
        node.right = toBST(nums, mid + 1, end);
        return node;
    }
}
