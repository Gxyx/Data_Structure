package com.san.Algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/08/22:24
 */
public class 组合_79 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        //从根结点到叶子结点的路径,是一个列表
        Deque<Integer> path = new ArrayDeque<>();
        backtracking(n, k, 1, path, res);
        return res;
    }


    private void backtracking(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res){
        if (path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }

        //剪枝
        for (int i = begin; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            System.out.println("递归之前 => " + path);
            //下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
            backtracking(n,k,i+1,path,res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
            path.removeLast();
            System.out.println("递归之后 => " + path);
        }
    }


    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        组合_79 s = new 组合_79();
        System.out.println(s.combine(n,k));
    }
}
