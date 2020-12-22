package com.san.Algorithm;

public class 宝石与石头 {
    public static void main(String[] args) {
         String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        for(int i=0;i<=J.length()-1;i++){
            for(int j=0;j<=S.length()-1;j++){
                if(J.charAt(i) == S.charAt(j)){
                    result++;
                }
            }
        }
        return result;
    }
}
