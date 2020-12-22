package com.san.Algorithm;


public class 字符串反转 {
    public static void main(String[] args) {
        char[] s = {};
        System.out.println(reverseString(s));
    }

    public static char[] reverseString(char[] s) {

//        String str2="";
//        for(int i=s.length-1;i>=0;i--){
//            str2+=s[i];
//        }
//        s =str2.toCharArray();
//        System.out.println(s);

//        for (int i=0; i<s.length/2; i++) {
//            char temp = s[i];
//            s[i] = s[s.length-1-i];
//            s[s.length-1-i] = temp;
//        }
//        return s;

        for (int i=0;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        return s;

//        for (int l = 0, r = s.length - 1; l < r; l++, r--) {
//            char temp = s[l];
//            s[l] = s[r];
//            s[r] = temp;
//        }

    }
}
