package com.san.datastructure.栈和队列.queen;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/13:37
 */
public interface QueueInterface<T> {
    //入队
    public void enQueue(T element) throws Exception;
    //出队，删除并返回对头元素
    public T deQueue() throws Exception;
    //读取当前对头元素
    public T getHead() throws Exception;
    //判断队列是否为空
    public boolean isEmpty();
}
