package com.san.Algorithm;

import java.util.*;

public class 找出常用字符串 {
    public static void main(String[] args) {
        //char s = 'a';
       // char c = 'c';
        List<String> list = new ArrayList<>();
        int [] res = new int[26];
        String[] A = {"bella","label","roller"};
        for(char c :A[0].toCharArray()) {
            res[c-'a']++;
        }
        for(int i=1;i<A.length;i++) {
            int []arr = new int[26];
            for(char c:A[i].toCharArray()) {
                arr[c-'a']++;
            }
            for(int j=0;j<arr.length;j++) {
                res[j]=Math.min(res[j], arr[j]);
            }
        }
        for(int i=0;i<res.length;i++) {
            if(res[i]>0) {
                for(int j=0;j<res[i];j++) {
                    list.add( (char)(i+'a')+""  ) ;
                }
            }
        }
        System.out.println(list);
       // System.out.println(Arrays.toString(res));
//        StringBuffer str = new StringBuffer();
//        for(int i = 0; i < strings.length; i++){
//            str. append(strings[i]);
//        }
//        Map<Character, Integer> map = new HashMap();
//        for (int i = 0; i < str.length(); i++) {
//            if(map.get(str.charAt(i)) != null){
//                map.put(str.charAt(i), map.get(str.charAt(i))+1);
//            }else {
//                map.put(str.charAt(i),1);
//            }
//        }
//        List<String> list = new ArrayList<>();
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//           if (entry.getValue()>=3){
//               list.add(entry.getKey().toString());
//           }
//        }
//        System.out.println(list);
        //System.out.println(c-s);
    }
}
