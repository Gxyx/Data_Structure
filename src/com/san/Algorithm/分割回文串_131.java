package com.san.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/10/23:42
 */
public class 分割回文串_131 {



    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtracking(s,res,path);
        return res;
    }

    private void backtracking(String s, List<List<String>> res, List<String> path) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, 0, i)) {
                path.add(s.substring(0, i + 1));
                backtracking(s.substring(i + 1), res, path);
                path.remove(path.size() - 1);
            }
        }
    }

    /**
     * 判断是否为回文串
     * @param s
     * @param begin
     * @param end
     * @return
     */
    private boolean isPalindrome(String s, int begin, int end) {
        while (begin < end) {
            if (s.charAt(begin++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ss = "121";
        分割回文串_131 s = new 分割回文串_131();
        System.out.println(s.partition(ss));
    }
}
