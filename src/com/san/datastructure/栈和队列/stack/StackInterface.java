package com.san.datastructure.栈和队列.stack;

import com.san.datastructure.数和二叉树.树.BinNode;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/10:34
 */
public interface StackInterface<T> {
    //入栈，在栈顶插入指定数据元素
    public void push(T element) throws Exception;
    //出栈，删除并返回元素
    public T pop() throws Exception;
    //栈顶元素
    public T getTop() throws Exception;
    //判断栈是否为空
    public boolean isEmpty();
}
