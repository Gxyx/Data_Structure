package com.san.datastructure.链表;

import com.san.datastructure.线性表.ListInterface;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/19/1:12
 */
public class LinkedList<T> implements ListInterface<T> {
    //头引用
    private LinkedNode<T> first;


    private LinkedList(){
        first = new LinkedNode<T>();
    }

    /**
     * 非空链表初始化
     * 头插法：每次将新生成的结点插入头节点之后
     * @param init

    LinkedList(T[] init){
        first = new LinkedNode<T>();
        for (int i =0;i<init.length;i++){
            LinkedNode<T> node = new LinkedNode<>(init[i]);
            node.setNext(first.getNext());
            first.setNext(node);
        }
    }
*/
    /**
     * 尾插法：将新生成的结点插在终端结点的后面
     * @param init
*/
    LinkedList(T[] init){
        first = new LinkedNode<T>();
        LinkedNode<T> rear = first;
        for (int i =0;i<init.length;i++){
            LinkedNode<T> node = new LinkedNode<T>(init[i]);
            rear.setNext(node);
            rear = node;
        }
    }

    /**
     * 遍历链表
     */
    @Override
    public void printList() {
        //引用变量p初始化
        LinkedNode<T> p = first.getNext();
        while(p!=null){
            System.out.println(p.getData()+" ");
            //p向后移
            p = p.getNext();
        }

    }

    /**
     * 链表长度
     * @return
     */
    @Override
    public int length() {
       int length = 0;
       LinkedNode<T> p = first.getNext();
       while(p!=null){
           p = p.getNext();
           length++;
       }
       return length;
    }

    /**
     * 按值查找
     * @param element
     * @return
     */
    @Override
    public int locate(T element) {
        LinkedNode<T> p = first.getNext();
        int count = 1;
        while(p!=null){
            if (p.getData() == element){
                return count;
            }
            p = p.getNext();
            count++;
        }
        return 0;
    }

    /**
     * 按位查找
     * @param i
     * @return
     * @throws Exception
     */
    @Override
    public T getElement(int i) throws Exception {
        LinkedNode<T> p = first.getNext();
        int count = 1;
        while (p!=null&&count<i){
            p = p.getNext();
            count++;
        }
        if (p==null){
            throw new Exception("位置异常");
        }
        return p.getData();
    }

    /**
     * 插入元素
     * @param i
     * @param element
     * @throws Exception
     */
    @Override
    public void insert(int i, T element) throws Exception {
        LinkedNode<T> p = first;
        int count = 1;
        while(p!=null&&count<i){
            p = p.getNext();
            count++;
        }
        if (p==null){
            throw new Exception("插入位置异常");
        }
        LinkedNode<T> node = new LinkedNode<T>(element);
        node.setNext(p.getNext());
        p.setNext(node);
    }

    /**
     * 删除结点
     * @param i
     * @return
     * @throws Exception
     */
    @Override
    public T delete(int i) throws Exception {
        LinkedNode<T> p = first.getNext();
        int count =1;
        while(p!=null&&count<i){
            p= p.getNext();
            count++;
        }
        if (p==null||p.getNext()==null){
            throw new Exception("删除位置异常");
        }
        LinkedNode<T> q = p.getNext();
        //获取删除元素
        T deleteNode = q.getData();
        p.setNext(q.getNext());
        return deleteNode;
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (first.getNext()==null){
            return true;
        }
        return false;
    }
}
