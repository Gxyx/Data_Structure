package com.san.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/30/23:06
 */
public class 找树左下角的值_513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            //先右后左
            if (root.right!=null){
                queue.add(root.right);
            }
            if (root.left!=null){
                queue.add(root.left);
            }
        }
        return root.val;
    }
}
