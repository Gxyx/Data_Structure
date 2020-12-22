package com.san.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 奇偶数排序 {
    public static void main(String[] args) {
        int []  A = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity1(A)));
    }
   public static int[] sortArrayByParity(int[] A) {
      List<Integer> list  = new ArrayList<>();
      int[] res = new int[A.length];
       Arrays.sort(A);
       for (int i = 0;i<A.length;i++){
           if (A[i]%2==0){
               list.add(A[i]);
           }
       }
       for (int i = 0;i<A.length;i++){
           if (A[i]%2==1){
               list.add(A[i]);
           }
       }
       for (int i = 0;i<list.size();i++){
           res[i] = list.get(i);
       }
       return res;
   }

    public static int[] sortArrayByParity1(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;
        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];
        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];
        return ans;

    }
}
