package com.san.datastructure.线性表;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/18/18:11
 */
public interface ListInterface <T>{

    //遍历线性表
    public void printList();
    //线性表长度
    public int length();
    //按住查找
    public int locate(T element);
    //按位置查找
    public T getElement(int i) throws Exception;
    //在指定逻辑位置插入
    public void insert(int i,T element) throws Exception;
    //删除指定位置元素
    T delete(int i) throws Exception;
    //判断是否为空
    public boolean isEmpty();


}
