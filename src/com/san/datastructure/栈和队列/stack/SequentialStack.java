package com.san.datastructure.栈和队列.stack;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/10:39
 * 顺序链表
 */
public class SequentialStack<T> implements StackInterface<T> {
    //顺序栈存储
    protected T[] stack;
    //顺序栈容量
    private final static int STACK_SIZE = 100;
    //栈顶
    protected int top;

    /**
     * 初始化
     * 生成一个容量为STACK_SIZE的一维泛型数组
     * 栈顶 top = -1
     */
    public SequentialStack(){
        stack = (T[]) new Object[STACK_SIZE];
        top = -1;
    }

    /**
     * 入栈操作
     * @param element
     */
    @Override
    public void push(T element) throws Exception {
        if (top == STACK_SIZE){
            throw new Exception("栈满");
        }
        stack[++top] = element;
    }

    /**
     * 出栈操作
     * @return
     */
    @Override
    public T pop() throws Exception {
        if (isEmpty()){
            throw new Exception("栈空");
        }
        T result = stack[top--];
        return  result;
    }

    /**
     * 取出入栈元素
     * @return
     */
    @Override
    public T getTop() throws Exception {
        if (isEmpty()){
            throw new Exception("栈空");
        }
        return stack[top];
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (top==-1){
            return true;
        }
        return false;
    }

    /**
     * 括号匹配
     * @param s
     * @return
     * @throws Exception
     */
    public int match(char[] s) throws Exception {
            //初始化代码
            SequentialStack<Character> stack = new SequentialStack<Character>();
            for (int i=0;i<s.length;i++){
                if (s[i]==')'){
                    if (!stack.isEmpty()){
                        stack.pop();
                    }else {
                        return -1;
                    }
                    //当前左括号入栈
                }else if(s[i]=='('){
                    stack.push('(');
                }
            }
            //栈空则括号匹配正常
            if (stack.isEmpty()){
                return 0;
            }else {
                return 1;
            }

}
}
