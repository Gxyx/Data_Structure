package com.san.Algorithm;

public class 长按键入 {
    public static void main(String[] args) {
        String name = "vtkgn";
        String typed = "vttkgnn";
        System.out.println(isLongPressedName(name,typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
//        if(name.equals(typed)){
//            return true;
//        }
//        for (int i =0;i<=name.length()-1;i++){
//            for (int j =0; j<=typed.length()-1;j++){
//                if (name.charAt(i)==typed.charAt(j+1)){
//                    return true;
//                }
//            }
//        }
//        return false;
        int i=0,j =0;
        while (j<typed.length()){
            //当 \textit{name}[i]=\textit{typed}[j]name[i]=typed[j] 时，
            // 说明两个字符串存在一对匹配的字符，此时将 i,ji,j 都加 1
            if (i<name.length()&& name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            //如果 \textit{typed}[j]=\textit{typed}[j-1]typed[j]=typed[j−1]，
            // 说明存在一次长按键入，此时只将 j 加 1
            //最后，如果 i=\textit{name}.\textit{length}i=name.length，说明 \textit{name}name 的每个字符都被「匹配」了。

            else if (j>0 && typed.charAt(j) ==typed.charAt(j -1) ){
                j++;
            }else {
                return false;
            }
        }
        //如果 i=\textit{name}.\textit{length}i=name.length，说明 \textit{name}name 的每个字符都被「匹配」了。
        return i == name.length();
    }
}
