package com.san.datastructure.链表;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/19/1:13
 */
public class LinkedNode<T> {
    private T data;
    private LinkedNode<T> next;

    public LinkedNode(T element) {
        data = element;
        next = null;
    }

    public LinkedNode() {
        data = null;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }
}
