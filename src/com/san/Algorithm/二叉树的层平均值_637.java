package com.san.Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/30/22:36
 */
public class 二叉树的层平均值_637 {

    /**
     * 层序遍历 bfs 广度
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for (int i =0;i<size;i++){
                TreeNode node = queue.poll();
                sum = sum + node.val;
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(sum/size);
        }
        return res;
    }

}
