package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/25/21:29
 */
public class 路径总和Ⅲ_437 {

    /**
     * 以当前节点作为头结点的路径数量
     * 当前节点的左子树中满足条件的路径数量
     * 当前节点的右子树中满足条件的路径数量
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        int result = countPath(root,sum);
        int left = pathSum(root.left,sum);
        int right = pathSum(root.right,sum);
        return result+left+right;
    }
    public int countPath(TreeNode root,int sum){
        if(root == null){
            return 0;
        }
        sum = sum -root.val;
        int result = sum == 0 ? 1:0;
        return result + countPath(root.left,sum) + countPath(root.right,sum);
    }

}
