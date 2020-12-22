package com.san.Algorithm;

import com.san.datastructure.线性表.ListInterface;
import com.san.datastructure.链表.LinkedList;
import com.san.datastructure.链表.LinkedNode;

import java.util.Scanner;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/19/0:40
 */
public class 约瑟夫问题 {

public static class CircularSingLinkedList<T>{

    protected static LinkedNode rear;
    protected static LinkedNode first;

    public CircularSingLinkedList() {
        rear = null;
    }

    /**
     * 实现算法
     * @param n
     * @param m
     */
    private static void Joseph(int n,int m){
        creatCircular(n);
        //pre为表尾
        LinkedNode pre = rear;
        //p为表头
        LinkedNode p = rear.getNext();
        int count =1;
        System.out.println("出环的顺序:");
        //循环到只剩一个节点
        while(p.getNext()!=p){
            if (count<m){
                pre = p;
                p = p.getNext();
                count++;
            }else {
                System.out.println(p.getData()+" ");
                //删除结点
                pre.setNext(p.getNext());
                p = pre.getNext();
                //重新计数
                count = 1;
            }
        }
        System.out.println(p.getData()+" ");
    }

    /**
     * 生成环形链表
     * @param n
     */
    private static void creatCircular(int n){
        rear = new LinkedNode(1);
        first = rear;
        for(int i=2;i<=n;i++){
            LinkedNode node = new LinkedNode(i);
            rear.setNext(node);
            rear = node;
        }
        rear.setNext(first);
    }
    public static void main(String[] args) {
       Joseph(6,5);
    }

}



}
