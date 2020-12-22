package com.san.datastructure.链表;

import com.san.datastructure.线性表.ListInterface;
import com.san.datastructure.线性表.SequentialList;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/19/3:32
 */
public class LinkedTest {
    public static void main(String[] args) throws Exception {
        String[] initialList = {"a","b","c","d","e","f"};
        ListInterface<String> list = new LinkedList<String>(initialList);
        System.out.println("线性表长度："+list.length());
        System.out.println("线性表遍历结果：");
        list.printList();
        String list2 = list.getElement(2);
        System.out.println("2号元素为："+list2);
        int locate_d = list.locate("d");
        System.out.println("元素d的位置在："+locate_d);
        System.out.println("在3位置插入k");
        list.insert(3,"k");
        String list3 = list.getElement(3);
        System.out.println("3号元素为："+list3);
        System.out.println("线性表长度："+list.length());
        System.out.println("线性表遍历结果：");
        list.printList();
    }
}
