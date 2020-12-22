package com.san.datastructure.栈和队列.queen;

import com.san.datastructure.链表.LinkedNode;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/15:25
 */
public class LinkedQueue<T> implements QueueInterface<T>{
    private LinkedNode<T> front,rear;

    /**
     * 初始化
     */
    public LinkedQueue() {
        front = rear =new LinkedNode<T>();
    }

    /**
     * 入队操作
     * @param element
     * @throws Exception
     * 直接在队尾插入
     */
    @Override
    public void enQueue(T element) throws Exception {
        LinkedNode<T> node = new LinkedNode<T>(element);
        rear.setNext(node);
        rear = node;
    }

    /**
     * 出队
     * @return
     * @throws Exception
     */
    @Override
    public T deQueue() throws Exception {
       if (isEmpty()){
           throw new Exception("队空");
       }
       //获取头节点
        LinkedNode<T> headNode = front.getNext();
       T headElement = headNode.getData();
       front.setNext(headNode.getNext());
       if (headNode.getNext()==null){
           rear = front;
       }
       return headElement;
    }

    /**
     * 取出头元素
     * @return  第一个元素结点的数据域
     * @throws Exception
     */
    @Override
    public T getHead() throws Exception {
        if (isEmpty()){
            throw new Exception("队空");
        }
        LinkedNode<T> headNode = front.getNext();
        T headElment = headNode.getData();
        return headElment;
    }

    /**
     *判断队空
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (front==rear){
            return true;
        }
        return false;
    }
}
