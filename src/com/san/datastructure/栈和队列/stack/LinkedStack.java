package com.san.datastructure.栈和队列.stack;

import com.san.datastructure.数和二叉树.树.BinNode;
import com.san.datastructure.链表.LinkedNode;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/13:06
 * 栈的链接存储
 */
public class LinkedStack<T> extends LinkedNode<T> implements StackInterface<T>{

    //栈顶引用
    protected LinkedNode<T> top;

    /**
     *初始化
     */
    public LinkedStack(){
        top = null;
    }

    /**
     * 入栈
     * @param element
     * @throws Exception
     */
    @Override
    public void push(T element) throws Exception {
        LinkedNode<T> node = new LinkedNode<T>(element);
        node.setNext(top);
        top = node;
    }

    /**
     * 出栈
     * @return
     * @throws Exception
     */
    @Override
    public T pop() throws Exception {
        if (isEmpty()){
            throw new Exception("栈空");
        }
        T top_node = top.getData();
        top = top.getNext();
        return top_node;
    }

    /**
     * 取出栈顶元素
     * @return
     * @throws Exception
     */
    @Override
    public T getTop() throws Exception {
        if (isEmpty()){
            throw new Exception("栈空");
        }
        T top_node = top.getData();
        return top_node;
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
       if (top ==null){
           return true;
       }
       return false;
    }
}
