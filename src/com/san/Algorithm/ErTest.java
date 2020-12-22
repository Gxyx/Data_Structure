package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/06/21:15
 */
public class ErTest {
//    public static void main(String[] args) {
//        int[][] nums = {
//                {1,2},
//                {2,3},
//                {3,4}};
//        System.out.println(nums[2][1]);
//    }

    public static void main(String args[]) {
        String Str = new String("WelcometoYiibaicom");
        String SubStr1 = new String("Y");
        System.out.print("Found Index :");
        System.out.println(Str.indexOf(SubStr1, 2));
        char c = 'b';
        System.out.println(c-'a');
        char[] letters = {'c','f','j'};
        char target = 'j';
        //System.out.println(nextGreatestLetter(letters,target));
        int[][] A = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(matrixScore(A));
        int []number={1,1,2,3,3,4,4};
        int [] counts = new int[10];
        for(int i=0;i<number.length;i++) {
            counts[number[i]] += 1;
            if(counts[i] == 1){
                System.out.println(number[i-1]);
            }
        }
        int[] nums ={5,7,7,8,8,10};
        int targe = 8;
        System.out.println(searchRangeHelper(nums,targe+1));
        //System.out.println(Arrays.toString(counts));
//        int m = A.length, n = A[0].length;
//        int ret = m * (1 << (n - 1));
//        System.out.println(m);
//        System.out.println(1<<3);
//        System.out.println(n);
//        System.out.println(ret);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        char res  = '0';
        for(int i =0;i<letters.length;i++){
            if(letters[i]>target){
                res = letters[i];
                break;
            }else {
                res = letters[0];
            }
        }
        return res;
    }


    public static int matrixScore(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        // 先依次反转所有行，保证每行的第0列为1
        for (int i = 0; i < m; i++) {
            if (A[i][0] == 0) { // 如果每行的第0列为0，那么反转改行
                for (int j = 0; j < n; j++) {
                    A[i][j] = 1 - A[i][j];
                }
            }
        }

        // 因为第0列全为1了，所有从第1列开始反转列。
        for (int j = 1; j < n; j++) {
            int ones = 0;
            for (int i = 0; i < m; i++) {
                if (A[i][j] == 1) {
                    ones++;
                }
            }
            // 计算每一列的1的数量，如果1数量小于50%，那么反转该列。
            if (ones < m / 2.0) {
                for (int i = 0; i < m; i++) {
                    A[i][j] = 1 - A[i][j];
                }
            }
        }

        //完成反转矩阵，计算所得值
        int ret = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret += A[i][j] << (n - j - 1);
            }
        }
        return ret;
    }


    //二分法查找
    public static int searchRangeHelper(int[] nums, int target) {
        int l = 0, h = nums.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= target) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
