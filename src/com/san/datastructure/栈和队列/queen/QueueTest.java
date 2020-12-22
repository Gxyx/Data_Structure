package com.san.datastructure.栈和队列.queen;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/15:14
 */
public class QueueTest {
    public static void main(String[] args) throws Exception {
        QueueInterface<String> queue = new CircularQueue<>();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        queue.enQueue("d");
        System.out.println("队头元素：" + queue.getHead());
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println("对头元素：" + queue.getHead());
        queue.enQueue("e");
        queue.deQueue();
        System.out.println("对头元素：" + queue.getHead());
        queue.deQueue();
        System.out.println("队为空：" + queue.isEmpty());
    }
}
