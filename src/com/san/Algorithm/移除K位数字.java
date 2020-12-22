package com.san.Algorithm;

import java.util.Stack;

public class 移除K位数字 {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits1(num,k));
    }
    public static String removeKdigits(String num, int k) {
        char[] str = num.toCharArray();//首先，我们将num转化成字符数组
        int length = num.length();	//用length去记录移除k个数后返回字符串的长度。
        //也许你会有疑问“返回的字符串长度不就是 num.length - k 吗？”

        if(k==0)
        {
            return num;
        }

        if(k==num.length())
        {
            return "0";
        }

        while(k!=0)//核心部分,删除k个数，理论上循环k次。
        {
            int i;
            int flag = 1;
            for(i = 0; i < str.length - 1; i++)//从左往右
            {
                if((int)str[i]>(int)str[i+1])//左边比右边大
                {
                    for(int t = i; t < str.length - 1; t++)
                    {//这个循环代表，删除数组中的一个元素。
                        str[t] = str[t+1];
                    }
                    flag = 0;
                    length--;//删除之后，返回的长度-1，k-1，跳出for循环
                    k--;
                    break;
                }
            }
            if(flag == 1 && k!=0)//如果找了一圈没有任何移除，即flag为1，但k有余量时
            {
                length--;	//那说明最后一个>=倒数第二个
                k--;	//所以length--，k--.（length--相当于删除了。。。往下看）
            }
        }

        boolean cut = true;//不能有任何的前缀0.
        while(cut)
        {
            cut = false;//如果接下来没有发生前缀为0，也就不必再判断前缀是否为0.
            if(str[0]=='0'&&length!=1)//第二个条件针对“num=10，k=1”这类情况。
            {
                cut = true;//但如果发生了前缀为0，那么我们还需要再次循环。例如（num=700200003，k=2这类情况.
                for(int t = 0; t < str.length - 1 ; t++)
                {
                    str[t] = str[t+1];
                }
                length--;
            }
        }



        char[] pre = new char[length];//建立一个新数组,去记录0到length-1
        for(int i = 0; i < length; i++)//这也就是为什么上面length--相当于删除的原因了
        {
            pre[i] = str[i];
        }

        return String.valueOf(pre);//返回这个新的数组

    }

    public static String removeKdigits1(String num, int k) {
        if (num.length()==k){
            return "0";
        }
        char[] s = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character i: s){
            while (!stack.isEmpty()&&i<stack.peek()&&k>0){
                stack.pop();
                k--;
            }
            if (stack.isEmpty()&&i=='0'){
                continue;
            }
            stack.push(i);
        }
        while (k>0){
            stack.pop();
            k--;
        }
        if (stack.isEmpty()) {
            return "0";
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
