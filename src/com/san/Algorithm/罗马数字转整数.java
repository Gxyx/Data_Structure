package com.san.Algorithm;

public class 罗马数字转整数 {
    public static void main(String[] args) {
        String s = "IIIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int roman = 0;
        for (int i =0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I' : roman = roman+1;
                break;
                case 'V' : roman = roman+5;
                break;
                case 'X' : roman = roman+10;
                break;
                case 'L' : roman = roman+50;
                break;
                case 'C' : roman = roman+100;
                break;
                case 'D' : roman = roman+500;
                break;
                case 'M' : roman = roman+1000;
                break;
                default: System.out.println("default");break;
            }
            if (i!=0){
                if(((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)=='I'))
                    roman = roman-2;
                if(((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X'))
                    roman = roman-20;
                if(((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C'))
                    roman = roman-200;
            }
        }

        return roman;
    }
}
