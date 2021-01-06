package com.san.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/06/17:37
 *
 * if (终止条件) {
 *         存放结果;
 *         return;
 *     }
 *
 *     for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
 *         处理节点;
 *         backtracking(路径，选择列表); // 递归
 *         回溯，撤销处理结果
 *     }
 *
 */
public class 字母组合_17 {

    /**
     * 输入："23"
     * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
     * @param digits
     * @return
     */
    private String[] Keys = {"","","adc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) {
            return new ArrayList<>();
        }
        doCombination(digits, new StringBuilder(), 0);
        return res;
    }
    List<String> res = new ArrayList<>();
    public void doCombination(String digits, StringBuilder letter, int index) {
        /**
         * 递归终止条件  字符串为空了，将结果放到列表中并返回
         * 用index记录每次遍历到字符串的位置
         */
        if(index == digits.length()){
            res.add(letter.toString());
            return;
        }
        //获取index位置的字符
        char c = digits.charAt(index);
        int pos = c - '0';

        String map_string = Keys[pos];

        for (int i =0;i<map_string.length();i++){
            letter.append(map_string.charAt(i));
            doCombination(digits, letter, index+1);
            letter.deleteCharAt(letter.length()-1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        字母组合_17 s = new 字母组合_17();
        System.out.println(s.letterCombinations(digits));
    }
}
