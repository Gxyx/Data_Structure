package com.san.Algorithm;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/18/19:40
 * deddjwdw!@##$cfjkdfjds
 * defrger!@##$ferfef
*/
public class BigSubString {
    public static String common(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];
        for(int j = 0;j<s2.length();j++) {
            if(s1.charAt(0)==s2.charAt(j)) {
                dp[0][j] = 1;
            }
        }

        for(int j= 0;j<s1.length();j++) {
            if(s1.charAt(j)==s2.charAt(0)) {
                dp[j][0]= 1;
            }
        }

        int maxLen =0, maxEnd = 0;

        for(int i=1;i<s1.length();i++) {
            for(int j=1;j<s2.length();j++) {
                if(s1.charAt(i)==s2.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }

                if(dp[i][j]>maxLen){
                    maxLen = dp[i][j];
                    maxEnd = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if(maxLen == 0) {
            return "-1";
        }
        else {
            for(int i= maxEnd-maxLen+1;i<= maxEnd;i++){
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(common(str1,str2));
        System.out.println(getMaxSubString(str1,str2));
    }
    public static String getMaxSubString(String maxString,String minString){
        String max=null;
        String min=null;
        max=maxString.length()>minString.length()? maxString:minString;
        min=maxString.equals(max)?minString:maxString;

        int minLength=min.length();
        if(max.contains(min)){
            return min;
        }
        for (int i = 0; i <minLength; i++) {
            for(int start=0,end=minLength-i;end<=minLength;start++,end++){
                String temp=min.substring(start,end);
                if(max.contains(temp)){
                    return temp;
                }
            }
        }
        return null;
    }

}


/*
//求最长子串
public class BigSubString {
	public static void main(String[] args) {
		System.out.println(getMaxSubString("deddjwdcfjkdfjds","abcabsdabceabcd"));
	}

	//求最长子串
	public static String getMaxSubString(String str1,String str2){
		//定义两个变量，用来存储待判断的字符串
		String max="";
		String min="";
		//一些基础的判断
		if(str1==null||str2==null||str1.isEmpty()||str2.isEmpty()){
			return null;
		}
		if(str1.length()>=str2.length()){
			max=str1;
			min=str2;
		}else{
			max=str2;
			min=str1;
		}
		//对长度较短的字符串依次取其子串（n,n-1,n-2......1）
		for(int i=0;i<min.length();i++){
			//每次子串长度减一，判断大串是否包含子串
			for(int beg=0,end=min.length()-i;end<=min.length();beg++,end++){
				//取子串
				String s=min.substring(beg,end);
				//如果大串中含有子串，则返回子串，该子串就是最大的公共子串
				if(containString(max,s)){
					return s;
				}
			}
		}
		//否则返回null，表示不存在公共子串
		return null;
	}

	//判断一个字符串是否包含另一个字符串
	public static boolean containString(String str1,String str2){
		//定义两个变量，用来存储两个子串
		String min="";
		String max="";
		if(str1==null||str2==null){
			return false;
		}
		if(str1.length()>=str2.length()){
			max=str1;
			min=str2;
		}else{
			max=str2;
			min=str1;
		}
		//定义一个变量，用来存储判断过程中出现的字符串
		String s="";
		//循环判断两个字符串
		for(int i=0;i<max.length();i++){
			//定义并保存一个变量i的副本
			int index=i;
			for(int j=0;j<min.length();j++){
				//如果两个字符相等，保存这个字符，并将index+1
				if(max.charAt(index)==min.charAt(j)){
					s+=min.charAt(j)+"";
					index++;
				}else{
				    //否则的话重置所有中间变量，并退出内层循环，使得i++
					s="";
					j=0;
					index=i;
					break;
				}
			}
			//每次内层循环结束后，判断s是否等于min，如果相等则返回true，否则继续循环
			if(s.equals(min)){
				return true;
			}
		}
		return false;
	}
}

 */
