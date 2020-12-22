package com.san.Algorithm;

public class URL化 {
    public static void main(String[] args) {
        String S= "               ";
        System.out.println(S.substring(0,S.length()));
        System.out.println(replaceSpaces2(S,S.length()));
    }
    public static String replaceSpaces(String S, int length) {

        return S.substring(0, length).replaceAll(" ", "%20");
    }

    public static String replaceSpaces2(String S, int length) {

        char[] ch = new char[length * 3];
        int index= 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                ch[index++] = '%';
                ch[index++] = '2';
                ch[index++] = '0';
            }
            else {
                ch[index] = c;
                index++;
            }
        }
        return new String(ch, 0, index);
    }
}
