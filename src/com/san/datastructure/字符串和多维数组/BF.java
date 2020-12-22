package com.san.datastructure.字符串和多维数组;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/22/9:27
 */
public class BF {

    /**
     * BF暴力匹配
     * @param S
     * @param T
     * @return 返回T在S中的位置
     */

    public static int bf(char[]S,char[]T){
        int start = 0;
        int i =0,j =0;
        while(i < S.length && j < T.length){
            if (S[i]==T[j]){
                i++;
                j++;
            }else{
                start++;
                i=start;
                j=0;
            }
        }
        if (j==T.length){
            return start+1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //char[] S  = {'a','b','c','a','b','c','a','c','b'};
        char[] S  = {'a','a','a','a','a','a','a','a','b','c'};
        //char[] T  = {'a','b','c','a','c'};
        char[] T  = {'b','c'};
        System.out.println(bf(S,T));
    }

}

