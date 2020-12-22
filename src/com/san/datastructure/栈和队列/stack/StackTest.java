package com.san.datastructure.栈和队列.stack;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/12:41
 * 顺序栈
 */
public class StackTest {
    public static void main(String[] args) throws Exception {
        SequentialStack<Character> stack = new SequentialStack<>();
//        stack.push("a");
//        stack.push("b");
//        stack.push("c");
//        stack.push("d");
//        System.out.println("栈顶元素："+stack.getTop());
//        stack.pop();
//        stack.pop();
//        stack.push("e");
//        System.out.println("栈顶元素："+stack.getTop());
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println("栈为空："+stack.isEmpty());
        char[] s = {'(','(','(',')',')','(',')'};
        System.out.println(stack.match(s));
    }
}
