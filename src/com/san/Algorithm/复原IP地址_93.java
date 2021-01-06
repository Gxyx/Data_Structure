package com.san.Algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/06/20:39
 */
public class 复原IP地址_93 {

    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> res = new ArrayList<>();
        if (len < 4 || len > 12) {
            return res;
        }
        Deque<String> path = new ArrayDeque<>(4);
        //已经分割出多少个 ip 段
        int splitTimes = 0;
        dfs(s, len, splitTimes, 0, path, res);
        return res;
    }
    /**
     * 判断s的子区间 [left, right] 是否能够成为一个 ip 段
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    private int judgeIfIpSegment(String s, int left, int right) {
        int len = right - left + 1;
        // 大于 1 位的时候，不能以 0 开头
        if (len > 1 && s.charAt(left) == '0') {
            return -1;
        }

        // 转成 int 类型
        int res = 0;
        for (int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }

        if (res > 255) {
            return -1;
        }
        return res;
    }

    /**
     * @param s
     * @param len
     * @param split
     * @param begin:截取ip段的起始位置
     * @param path:记录从根结点到叶子结点的一个路径
     * @param res
     */
    private void dfs(String s, int len, int split, int begin, Deque<String> path, List<String> res) {
        if (begin == len) {
            if (split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }

        // 看到剩下的不够了，就退出（剪枝），len - begin 表示剩余的还未分割的字符串的位数
        if (len - begin < (4 - split) || len - begin > 3 * (4 - split)) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (begin + i >= len) {
                break;
            }

            int ipSegment = judgeIfIpSegment(s, begin, begin + i);
            if (ipSegment != -1) {
                // 在判断是 ip 段的情况下，才去做截取
                path.addLast(ipSegment + "");
                dfs(s, len, split + 1, begin + i + 1, path, res);
                path.removeLast();
            }
        }
    }


    public static void main(String[] args) {
        String ip = "25525511135";
        复原IP地址_93 s = new 复原IP地址_93();
        System.out.println(s.restoreIpAddresses(ip));
    }
}
