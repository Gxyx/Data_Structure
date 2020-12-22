package com.san.datastructure.栈和队列.queen;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/17:41
 * 两栈共享空间
 * 两个栈的空间需求有相反关系时，也就是当一个栈增长时另一个栈在缩短的情况
 * 两个栈需要具有相同的数据类型，如果数据类型不同，将会使问题复杂化
 */
public class BothStack<T>{
    //两栈共享空间存储结构
    protected T[] bothStack;
    private final static int STACK_SIZE = 100;
    //两栈栈顶
    protected int top1,top2;

    public BothStack() {
        bothStack = (T[]) new Object[STACK_SIZE];
        top1 = -1; //-1时栈1为空
        top2 = STACK_SIZE; //栈2等于数组的大小时，栈2为空
    }

    /**
     * 出栈
     * @param i
     * @param element
     * @throws Exception
     * 当i=1进入栈1
     * 当i=2进入栈2
     */
    public void push(int i,T element) throws Exception {
        if (top1==top2-1){
            throw new Exception("栈满");
        }
        if (i==1){
            bothStack[++top1] = element;
        }
        if (i==2){
            bothStack[--top2] = element;
        }
    }

    /**
     * 出栈操作
     * @param i
     * @return
     * top=-1 栈1空
     * top2=STACK_SIZE 栈二空
     */
    public T pop(int i) throws Exception {
        T result = null;
        if (i==1){
            if (top1==-1){
                throw new Exception("栈空") ;
            }
            result = bothStack[top1--];
        }
        if (i==2){
            if (top2==STACK_SIZE){
                throw new Exception("栈空");
            }
            result = bothStack[top2++];
        }
        return result;
    }

    @Override
    public String toString() {
        return "BothStack{" +
                "bothStack=" + Arrays.toString(bothStack) +
                ", top1=" + top1 +
                ", top2=" + top2 +
                '}';
    }

    public static void main(String[] args) throws Exception {
        BothStack<Integer> queue = new BothStack<>();
        queue.push(1,1);
        queue.push(2,2);
        System.out.println(queue);
    }
}
