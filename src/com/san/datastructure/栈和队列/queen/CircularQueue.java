package com.san.datastructure.栈和队列.queen;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/13:43
 */
public class CircularQueue<T> implements QueueInterface<T>{
    //循坏队列存储
    protected T[] queue;
    //队列容量
    private final int QUEUE_SIZE = 100;
    //对头队尾
    protected int front,rear;

    /**
     * 队列初始化
     */
    public CircularQueue(){
        queue = (T[]) new Object[QUEUE_SIZE];
        front=rear=0;
    }

    /**
     * 入队
     * @param element
     */
    @Override
    public void enQueue(T element) throws Exception {
        if ((rear+1)%QUEUE_SIZE==front){
            throw new Exception("对满");
        }
        rear = (rear+1)%QUEUE_SIZE;
        queue[rear] = element;
    }

    /**
     * 出队
     * @return
     */
    @Override
    public T deQueue() throws Exception {
        if (isEmpty()){
            throw new Exception("队空");
        }
        front = (front+1)%QUEUE_SIZE;
        T queueHead = queue[front];
        return queueHead;
    }

    /**
     * 取出队头元素
     * @return
     * @throws Exception
     */
    @Override
    public T getHead() throws Exception {
        if (isEmpty()){
            throw new Exception("队空");
        }
        T headElement = queue[front+1];
        return headElement;
    }

    /**
     * 判断是否为空
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
