package com.san.Algorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/06/22:46
 */
public class 二叉树所有路径和_257 {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> paths = new ArrayList<String>();
//        constructPaths(root, "", paths);
//        return paths;
//    }
//
//    public void constructPaths(TreeNode root, String path, List<String> paths) {
//        if (root != null) {
//            StringBuffer pathSB = new StringBuffer(path);
//            pathSB.append(Integer.toString(root.val));
//            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
//                paths.add(pathSB.toString());  // 把路径加入到答案中
//            } else {
//                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
//                constructPaths(root.left, pathSB.toString(), paths);
//                constructPaths(root.right, pathSB.toString(), paths);
//            }
//        }
//    }
//
//    private List<String> res;
//    public List<String> binaryTreePaths(TreeNode root) {
//        res = new ArrayList<>();
//        if(root == null) return res;
//        traversal2(root, new ArrayList<>());
//        return res;
//    }
//
//    private void traversal2(TreeNode x, List<Integer> vals){
//        if(x.left == null && x.right == null){
//            StringBuilder sb = new StringBuilder();
//            for(int i : vals)
//                sb.append(i).append("->");
//            sb.append(x.val);
//            res.add(sb.toString());
//        }
//        else {
//            vals.add(x.val);
//            if(x.left != null)
//                traversal2(x.left, vals);
//            if(x.right != null)
//                traversal2(x.right, vals);
//            vals.remove(vals.size() - 1);
//        }
//    }

}
