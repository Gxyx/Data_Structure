package com.san.Algorithm;

public class Queen {
    static int resultCount = 0;
    public static void main(String[] args) {
        int [] queen = new int[8];
        tria(queen,0,8);
        System.out.println(resultCount);
    }

    /**
     * 回溯算法
     * 函数从第index行起求解皇后的布局
     */
    public static void tria(int[] arr,int i,int n){
        if (i >= n){
            resultCount++;
        }else {
            //依次生成各孩子节点
            for (int j = 1;j<= n;j++){
                //第index行的皇后放入第j列
                arr[i] = j;
                if (place(arr,i)){
                    tria(arr,i+1,n);
                    //结点满足约束条件，则递归进入下一层继续遍历，否则跳过
                }
            }
        }
    }

    /**
     * 皇后位置满足约束条件的判定函数
     */
    public static boolean place(int[] arr,int s){
        //判定s行X[s]位置上的皇后，与1至s-1行上各皇后的位置是否满足约束条件
        for(int i = 0; i < s; i++) {
            if((arr[i] == arr[s]) || (Math.abs(i-s) == Math.abs(arr[i]-arr[s]))) {
                return false;
            }
        }

        return true;

    }
    }

